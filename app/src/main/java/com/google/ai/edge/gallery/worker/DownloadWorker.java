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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r31) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.worker.DownloadWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.worker.DownloadWorker$doWork$2 */
    /* JADX INFO: compiled from: DownloadWorker.kt */
    @Metadata(m921d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, m922d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.worker.DownloadWorker$doWork$2", m932f = "DownloadWorker.kt", m933i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m934l = {113, 231, 238, 263}, m935m = "invokeSuspend", m936n = {"allFiles", "bytesReadSizeBuffer", "bytesReadLatencyBuffer", "file", ImagesContract.URL, "connection", "outputDir", "outputTmpFile", "inputStream", "outputStream", "buffer", "bytesRead", "downloadedBytes", "outputFileBytes", "lastSetProgressTs", "deltaBytes", "curTs", "bytesPerMs", "remainingMs", "allFiles", "bytesReadSizeBuffer", "bytesReadLatencyBuffer", "file", ImagesContract.URL, "connection", "outputDir", "outputTmpFile", "inputStream", "outputStream", "buffer", "bytesRead", "downloadedBytes", "outputFileBytes", "lastSetProgressTs", "deltaBytes", "curTs", "bytesPerMs", "remainingMs", "allFiles", "bytesReadSizeBuffer", "bytesReadLatencyBuffer", "file", ImagesContract.URL, "connection", "outputDir", "outputTmpFile", "inputStream", "outputStream", "buffer", "bytesRead", "originalFilePath", "originalFile", "downloadedBytes", "outputFileBytes", "lastSetProgressTs", "deltaBytes"}, m938s = {"L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "J$1", "J$2", "J$3", "J$4", "F$0", "F$1", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "J$1", "J$2", "J$3", "J$4", "F$0", "F$1", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "J$0", "J$1", "J$2", "J$3"})
    static final class C28252 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ List<String> $extraDataFileNames;
        final /* synthetic */ List<String> $extraDataFileUrls;
        final /* synthetic */ String $fileName;
        final /* synthetic */ String $fileUrl;
        final /* synthetic */ boolean $isZip;
        final /* synthetic */ String $modelDir;
        final /* synthetic */ String $modelName;
        final /* synthetic */ long $totalBytes;
        final /* synthetic */ String $unzippedDir;
        final /* synthetic */ String $version;
        float F$0;
        float F$1;
        long J$0;
        long J$1;
        long J$2;
        long J$3;
        long J$4;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ DownloadWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28252(String str, String str2, DownloadWorker downloadWorker, String str3, List<String> list, List<String> list2, String str4, String str5, String str6, long j, boolean z, String str7, Continuation<? super C28252> continuation) {
            super(2, continuation);
            this.$fileUrl = str;
            this.$fileName = str2;
            this.this$0 = downloadWorker;
            this.$modelName = str3;
            this.$extraDataFileUrls = list;
            this.$extraDataFileNames = list2;
            this.$accessToken = str4;
            this.$modelDir = str5;
            this.$version = str6;
            this.$totalBytes = j;
            this.$isZip = z;
            this.$unzippedDir = str7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28252(this.$fileUrl, this.$fileName, this.this$0, this.$modelName, this.$extraDataFileUrls, this.$extraDataFileNames, this.$accessToken, this.$modelDir, this.$version, this.$totalBytes, this.$isZip, this.$unzippedDir, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
            return ((C28252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:269:0x0256, code lost:
        
            r3 = r59;
            r0 = r31;
            r6 = r10;
            r8 = r15;
            r5 = r27;
            r4 = r25;
            r10 = r0;
            r11 = r9;
            r9 = r2;
         */
        /* JADX WARN: Path cross not found for [B:247:0x08cc, B:155:0x08d5], limit reached: 268 */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0666 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0667  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x0a37  */
        /* JADX WARN: Removed duplicated region for block: B:261:0x053b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:276:0x0787 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x020a A[Catch: IOException -> 0x01be, TRY_ENTER, TRY_LEAVE, TryCatch #11 {IOException -> 0x01be, blocks: (B:7:0x0071, B:10:0x00fd, B:13:0x0189, B:14:0x01ba, B:29:0x020a), top: B:242:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x025c A[Catch: IOException -> 0x0a51, TRY_LEAVE, TryCatch #13 {IOException -> 0x0a51, blocks: (B:33:0x0256, B:35:0x025c), top: B:245:0x0256 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x0732 -> B:75:0x0528). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x086b -> B:224:0x087c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r60) {
            /*
                Method dump skipped, instruction units count: 2714
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.worker.DownloadWorker.C28252.invokeSuspend(java.lang.Object):java.lang.Object");
        }
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
