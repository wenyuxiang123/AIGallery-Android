package com.google.ai.edge.gallery.data;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.os.BundleKt;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.AppLifecycleProvider;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.worker.DownloadWorker;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



V", "workManager", "Landroidx/work/WorkManager;", "downloadStartTimeSharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "downloadModel", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "onStatusUpdated", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;", NotificationCompat.CATEGORY_STATUS, "cancelDownloadModel", "cancelAll", "onComplete", "Lkotlin/Function0;", "observerWorkerProgress", "workerId", "Ljava/util/UUID;", "sendNotification", "title", "", "text", "taskId", "modelName", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class DefaultDownloadRepository implements DownloadRepository {
    public static final int $stable = 8;
    private final Context context;
    private final SharedPreferences downloadStartTimeSharedPreferences;
    private final AppLifecycleProvider lifecycleProvider;
    private final WorkManager workManager;

    
    
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultDownloadRepository(Context context, AppLifecycleProvider lifecycleProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleProvider, "lifecycleProvider");
        this.context = context;
        this.lifecycleProvider = lifecycleProvider;
        this.workManager = WorkManager.INSTANCE.getInstance(this.context);
        this.downloadStartTimeSharedPreferences = this.context.getSharedPreferences("download_start_time_ms", 0);
    }

    @Override // com.google.ai.edge.gallery.data.DownloadRepository
    public void downloadModel(Task task, Model model, Function2<? super Model, ? super ModelDownloadStatus, Unit> onStatusUpdated) {
        String id;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onStatusUpdated, "onStatusUpdated");
        Data.Builder builder = new Data.Builder();
        long totalBytes = model.getTotalBytes();
        long sizeInBytes = 0;
        for (ModelDataFile it : model.getExtraDataFiles()) {
            sizeInBytes += it.getSizeInBytes();
        }
        long totalBytes2 = totalBytes + sizeInBytes;
        Data.Builder inputDataBuilder = builder.putString(ConstsKt.KEY_MODEL_NAME, model.getName()).putString(ConstsKt.KEY_MODEL_URL, model.getUrl()).putString(ConstsKt.KEY_MODEL_COMMIT_HASH, model.getVersion()).putString(ConstsKt.KEY_MODEL_DOWNLOAD_MODEL_DIR, model.getNormalizedName()).putString(ConstsKt.KEY_MODEL_DOWNLOAD_FILE_NAME, model.getDownloadFileName()).putBoolean(ConstsKt.KEY_MODEL_IS_ZIP, model.isZip()).putString(ConstsKt.KEY_MODEL_UNZIPPED_DIR, model.getUnzipDir()).putLong(ConstsKt.KEY_MODEL_TOTAL_BYTES, totalBytes2);
        if (!model.getExtraDataFiles().isEmpty()) {
            inputDataBuilder.putString(ConstsKt.KEY_MODEL_EXTRA_DATA_URLS, CollectionsKt.joinToString$default(model.getExtraDataFiles(), ",", null, null, 0, null, new Function1() { // from class: com.google.ai.edge.gallery.data.DefaultDownloadRepository$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultDownloadRepository.downloadModel$lambda$1((ModelDataFile) obj);
                }
            }, 30, null)).putString(ConstsKt.KEY_MODEL_EXTRA_DATA_DOWNLOAD_FILE_NAMES, CollectionsKt.joinToString$default(model.getExtraDataFiles(), ",", null, null, 0, null, new Function1() { // from class: com.google.ai.edge.gallery.data.DefaultDownloadRepository$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultDownloadRepository.downloadModel$lambda$2((ModelDataFile) obj);
                }
            }, 30, null));
        }
        if (model.getAccessToken() != null) {
            inputDataBuilder.putString(ConstsKt.KEY_MODEL_DOWNLOAD_ACCESS_TOKEN, model.getAccessToken());
        }
        Data inputData = inputDataBuilder.build();
        OneTimeWorkRequest.Builder builderAddTag = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DownloadWorker.class).setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST).setInputData(inputData).addTag("modelName:" + model.getName());
        if (task == null || (id = task.getId()) == null) {
            id = "";
        }
        OneTimeWorkRequest downloadWorkRequest = builderAddTag.addTag("taskId:" + id).build();
        UUID workerId = downloadWorkRequest.getId();
        this.workManager.enqueueUniqueWork(model.getName(), ExistingWorkPolicy.REPLACE, downloadWorkRequest);
        observerWorkerProgress(workerId, task, model, onStatusUpdated);
    }

    
    public static final CharSequence downloadModel$lambda$1(ModelDataFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getUrl();
    }

    
    public static final CharSequence downloadModel$lambda$2(ModelDataFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getDownloadFileName();
    }

    @Override // com.google.ai.edge.gallery.data.DownloadRepository
    public void cancelDownloadModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.workManager.cancelAllWorkByTag("modelName:" + model.getName());
    }

    @Override // com.google.ai.edge.gallery.data.DownloadRepository
    public void cancelAll(final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.workManager.cancelAllWork().getResult().addListener(new Runnable() { // from class: com.google.ai.edge.gallery.data.DefaultDownloadRepository$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                onComplete.invoke();
            }
        }, Executors.newSingleThreadExecutor());
    }

    @Override // com.google.ai.edge.gallery.data.DownloadRepository
    public void observerWorkerProgress(final UUID workerId, final Task task, final Model model, final Function2<? super Model, ? super ModelDownloadStatus, Unit> onStatusUpdated) {
        Intrinsics.checkNotNullParameter(workerId, "workerId");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onStatusUpdated, "onStatusUpdated");
        this.workManager.getWorkInfoByIdLiveData(workerId).observeForever(new DownloadRepositoryKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.google.ai.edge.gallery.data.DefaultDownloadRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultDownloadRepository.observerWorkerProgress$lambda$7(this.f$0, model, onStatusUpdated, workerId, task, (WorkInfo) obj);
            }
        }));
    }

    
    public static final Unit observerWorkerProgress$lambda$7(DefaultDownloadRepository this$0, Model $model, Function2 $onStatusUpdated, UUID $workerId, Task $task, WorkInfo workInfo) {
        String id;
        if (workInfo != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[workInfo.getState().ordinal()]) {
                case 1:
                    SharedPreferences downloadStartTimeSharedPreferences = this$0.downloadStartTimeSharedPreferences;
                    Intrinsics.checkNotNullExpressionValue(downloadStartTimeSharedPreferences, "downloadStartTimeSharedPreferences");
                    SharedPreferences.Editor editor$iv = downloadStartTimeSharedPreferences.edit();
                    editor$iv.putLong($model.getName(), System.currentTimeMillis());
                    editor$iv.apply();
                    FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
                    if (firebaseAnalytics != null) {
                        firebaseAnalytics.logEvent(GalleryEvent.MODEL_DOWNLOAD.getId(), BundleKt.bundleOf(TuplesKt.m929to("event_type", "start"), TuplesKt.m929to("model_id", $model.getName())));
                    }
                    break;
                case 2:
                    long receivedBytes = workInfo.getProgress().getLong(ConstsKt.KEY_MODEL_DOWNLOAD_RECEIVED_BYTES, 0L);
                    long downloadRate = workInfo.getProgress().getLong(ConstsKt.KEY_MODEL_DOWNLOAD_RATE, 0L);
                    long remainingSeconds = workInfo.getProgress().getLong(ConstsKt.KEY_MODEL_DOWNLOAD_REMAINING_MS, 0L);
                    boolean startUnzipping = workInfo.getProgress().getBoolean(ConstsKt.KEY_MODEL_START_UNZIPPING, false);
                    if (startUnzipping) {
                        $onStatusUpdated.invoke($model, new ModelDownloadStatus(ModelDownloadStatusType.UNZIPPING, 0L, 0L, null, 0L, 0L, 62, null));
                    } else if (receivedBytes != 0) {
                        $onStatusUpdated.invoke($model, new ModelDownloadStatus(ModelDownloadStatusType.IN_PROGRESS, $model.getTotalBytes(), receivedBytes, null, downloadRate, remainingSeconds, 8, null));
                    }
                    break;
                case 3:
                    String str = String.format("worker %s success", Arrays.copyOf(new Object[]{$workerId.toString()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    Log.d("repo", str);
                    $onStatusUpdated.invoke($model, new ModelDownloadStatus(ModelDownloadStatusType.SUCCEEDED, 0L, 0L, null, 0L, 0L, 62, null));
                    String string = this$0.context.getString(C2421R.string.notification_title_success);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = this$0.context.getString(C2421R.string.notification_content_success);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String str2 = String.format(string2, Arrays.copyOf(new Object[]{$model.getName()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    if ($task == null || (id = $task.getId()) == null) {
                        id = "___";
                    }
                    this$0.sendNotification(string, str2, id, $model.getName());
                    long startTime = this$0.downloadStartTimeSharedPreferences.getLong($model.getName(), 0L);
                    long duration = System.currentTimeMillis() - startTime;
                    FirebaseAnalytics firebaseAnalytics2 = AnalyticsKt.getFirebaseAnalytics();
                    if (firebaseAnalytics2 != null) {
                        firebaseAnalytics2.logEvent(GalleryEvent.MODEL_DOWNLOAD.getId(), BundleKt.bundleOf(TuplesKt.m929to("event_type", FirebaseAnalytics.Param.SUCCESS), TuplesKt.m929to("model_id", $model.getName()), TuplesKt.m929to("duration_ms", Long.valueOf(duration))));
                    }
                    SharedPreferences downloadStartTimeSharedPreferences2 = this$0.downloadStartTimeSharedPreferences;
                    Intrinsics.checkNotNullExpressionValue(downloadStartTimeSharedPreferences2, "downloadStartTimeSharedPreferences");
                    SharedPreferences.Editor editor$iv2 = downloadStartTimeSharedPreferences2.edit();
                    editor$iv2.remove($model.getName());
                    editor$iv2.apply();
                    break;
                case 4:
                case 5:
                    ModelDownloadStatusType status = ModelDownloadStatusType.FAILED;
                    String errorMessage = workInfo.getOutputData().getString(ConstsKt.KEY_MODEL_DOWNLOAD_ERROR_MESSAGE);
                    if (errorMessage == null) {
                        errorMessage = "";
                    }
                    String str3 = String.format("worker %s FAILED or CANCELLED: %s", Arrays.copyOf(new Object[]{$workerId.toString(), errorMessage}, 2));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    Log.d("repo", str3);
                    if (workInfo.getState() == WorkInfo.State.CANCELLED) {
                        status = ModelDownloadStatusType.NOT_DOWNLOADED;
                    } else {
                        String string3 = this$0.context.getString(C2421R.string.notification_title_fail);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        String string4 = this$0.context.getString(C2421R.string.notification_content_success);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        String str4 = String.format(string4, Arrays.copyOf(new Object[]{$model.getName()}, 1));
                        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                        this$0.sendNotification(string3, str4, "", "");
                    }
                    $onStatusUpdated.invoke($model, new ModelDownloadStatus(status, 0L, 0L, errorMessage, 0L, 0L, 54, null));
                    long startTime2 = this$0.downloadStartTimeSharedPreferences.getLong($model.getName(), 0L);
                    long duration2 = System.currentTimeMillis() - startTime2;
                    FirebaseAnalytics firebaseAnalytics3 = AnalyticsKt.getFirebaseAnalytics();
                    if (firebaseAnalytics3 != null) {
                        firebaseAnalytics3.logEvent(GalleryEvent.MODEL_DOWNLOAD.getId(), BundleKt.bundleOf(TuplesKt.m929to("event_type", "failure"), TuplesKt.m929to("model_id", $model.getName()), TuplesKt.m929to("duration_ms", Long.valueOf(duration2))));
                    }
                    SharedPreferences downloadStartTimeSharedPreferences3 = this$0.downloadStartTimeSharedPreferences;
                    Intrinsics.checkNotNullExpressionValue(downloadStartTimeSharedPreferences3, "downloadStartTimeSharedPreferences");
                    SharedPreferences.Editor editor$iv3 = downloadStartTimeSharedPreferences3.edit();
                    editor$iv3.remove($model.getName());
                    editor$iv3.apply();
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    private final void sendNotification(String title, String text, String taskId, String modelName) {
        Intent intent;
        if (this.lifecycleProvider.get_isAppInForeground()) {
            return;
        }
        NotificationChannel channel = new NotificationChannel("download_notification", "AI Edge Gallery download notification", 4);
        Object systemService = this.context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationManager.createNotificationChannel(channel);
        if (taskId.length() == 0) {
            Intent launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
            Intrinsics.checkNotNull(launchIntentForPackage);
            intent = launchIntentForPackage;
        } else if (Intrinsics.areEqual(taskId, "___")) {
            Intent $this$sendNotification_u24lambda_u248 = new Intent("android.intent.action.VIEW", Uri.parse("com.google.ai.edge.gallery://global_model_manager"));
            $this$sendNotification_u24lambda_u248.setFlags(268435456);
            intent = $this$sendNotification_u24lambda_u248;
        } else {
            String $this$toUri$iv = "com.google.ai.edge.gallery://model/" + taskId + "/" + modelName;
            Intent $this$sendNotification_u24lambda_u249 = new Intent("android.intent.action.VIEW", Uri.parse($this$toUri$iv));
            $this$sendNotification_u24lambda_u249.setFlags(268435456);
            intent = $this$sendNotification_u24lambda_u249;
        }
        PendingIntent pendingIntent = PendingIntent.getActivity(this.context, 0, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(pendingIntent, "getActivity(...)");
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.context, "download_notification").setSmallIcon(R.drawable.ic_dialog_info).setContentTitle(title).setContentText(text).setPriority(1).setContentIntent(pendingIntent).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(builder, "setAutoCancel(...)");
        NotificationManagerCompat $this$sendNotification_u24lambda_u2410 = NotificationManagerCompat.from(this.context);
        if (ActivityCompat.checkSelfPermission(this.context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        $this$sendNotification_u24lambda_u2410.notify(1, builder.build());
    }
}
