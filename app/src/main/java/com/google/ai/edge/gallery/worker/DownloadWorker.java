package com.google.ai.edge.gallery.worker;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import androidx.work.CoroutineWorker;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: DownloadWorker.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m922d2 = {"Lcom/google/ai/edge/gallery/worker/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "externalFilesDir", "Ljava/io/File;", "notificationManager", "Landroid/app/NotificationManager;", "notificationId", "", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForegroundInfo", "Landroidx/work/ForegroundInfo;", "createForegroundInfo", NotificationCompat.CATEGORY_PROGRESS, "modelName", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class DownloadWorker extends CoroutineWorker {
    public static final int $stable = 8;
    private final File externalFilesDir;
    private final int notificationId;
    private final NotificationManager notificationManager;

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.worker.DownloadWorker$doWork$1 */
    /* JADX INFO: compiled from: DownloadWorker.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.worker.DownloadWorker", m932f = "DownloadWorker.kt", m933i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m934l = {107}, m935m = "doWork", m936n = {"fileUrl", "modelName", "version", "fileName", "modelDir", "unzippedDir", "extraDataFileUrls", "extraDataFileNames", "accessToken", "isZip", "totalBytes"}, m938s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "J$0"})
    static final class C28241 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C28241(Continuation<? super C28241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.externalFilesDir = context.getExternalFilesDir(null);
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.notificationManager = (NotificationManager) systemService;
        this.notificationId = params.getId().hashCode();
        if (DownloadWorkerKt.channelCreated) {
            return;
        }
        NotificationChannel channel = new NotificationChannel("model_download_channel_foreground", "Model Downloading", 2);
        channel.setDescription("Notifications for model downloading");
        this.notificationManager.createNotificationChannel(channel);
        DownloadWorkerKt.channelCreated = true;
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        // TODO: Implement doWork method
        // This method downloads model files from the server
        // Parameters are available via Continuation:
        // - $fileUrl: URL to download the model file
        // - $modelName: Name of the model
        // - $version: Model version
        // - $fileName: Local file name
        // - $modelDir: Directory to store the model
        // - $unzippedDir: Directory for unzipped content
        // - $extraDataFileUrls: URLs for additional data files
        // - $extraDataFileNames: Names for additional data files
        // - $accessToken: Authentication token
        // - $isZip: Whether the file is a zip archive
        // - $totalBytes: Total bytes to download
        
        return ListenableWorker.Result.success();
    }

    @Override // androidx.work.CoroutineWorker
    public Object getForegroundInfo(Continuation<? super ForegroundInfo> continuation) {
        return createForegroundInfo$default(this, 0, null, 2, null);
    }

    static /* synthetic */ ForegroundInfo createForegroundInfo$default(DownloadWorker downloadWorker, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return downloadWorker.createForegroundInfo(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ForegroundInfo createForegroundInfo(int progress, String modelName) {
        String title = "Downloading model";
        if (modelName != null) {
            title = "Downloading \"" + modelName + "\"";
        }
        String content = "Downloading in progress: " + progress + "%";
        Intent intent = new Intent(getApplicationContext(), Class.forName("com.google.ai.edge.gallery.MainActivity"));
        intent.setFlags(536870912);
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, 201326592);
        Notification notification = new NotificationCompat.Builder(getApplicationContext(), "model_download_channel_foreground").setContentTitle(title).setContentText(content).setSmallIcon(R.drawable.ic_dialog_info).setOngoing(true).setProgress(100, progress, false).setContentIntent(pendingIntent).build();
        Intrinsics.checkNotNullExpressionValue(notification, "build(...)");
        return new ForegroundInfo(this.notificationId, notification, 1);
    }
}
