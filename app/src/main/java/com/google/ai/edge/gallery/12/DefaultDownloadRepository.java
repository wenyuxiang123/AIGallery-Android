// Class: final Lcom.google.ai.edge.gallery.data.DefaultDownloadRepository
// Access: public
class DefaultDownloadRepository extends Ljava/lang/Object {

    // Fields:
    private final android.content.Context context;
    private final android.content.SharedPreferences downloadStartTimeSharedPreferences;
    private final com.google.ai.edge.gallery.AppLifecycleProvider lifecycleProvider;
    private final androidx.work.WorkManager workManager;

    // Methods:
    public java.lang.CharSequence static synthetic $r8$lambda$1PN5A3zGsHhW10b9h0WSei47rNk(com.google.ai.edge.gallery.data.ModelDataFile) {
        // STATIC downloadModel$lambda$1(Lcom/google/ai/edge/gallery/data/ModelDataFile;)Ljava/lang/CharSequence;
        // move-result-object p0
        return p0;
    }
    public void static synthetic $r8$lambda$GpgIGLObzbaqLYIrui10Aw5BXlw(kotlin.jvm.functions.Function0) {
        // STATIC cancelAll$lambda$3(Lkotlin/jvm/functions/Function0;)V
        return ;
    }
    public kotlin.Unit static synthetic $r8$lambda$MlS0AeDUligQl5W7_2sKIbkWVG8(com.google.ai.edge.gallery.data.DefaultDownloadRepository, com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function2, java.util.UUID, com.google.ai.edge.gallery.data.Task, androidx.work.WorkInfo) {
        // move-result-object p0
        return p0;
    }
    public java.lang.CharSequence static synthetic $r8$lambda$sx6MKTrqb16c31a8ffLJ117GvPA(com.google.ai.edge.gallery.data.ModelDataFile) {
        // STATIC downloadModel$lambda$2(Lcom/google/ai/edge/gallery/data/ModelDataFile;)Ljava/lang/CharSequence;
        // move-result-object p0
        return p0;
    }
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/DefaultDownloadRepository;->$stable:I
        return ;
    }
    public void constructor <init>(android.content.Context, com.google.ai.edge.gallery.AppLifecycleProvider) {
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "lifecycleProvider";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // v0 = Companion:Landroidx/work/WorkManager$Companion;
        // VIRTUAL getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;
        // move-result-object v0
        String v1 = "download_start_time_ms";
        // const/4 v2, 0x0
        // VIRTUAL getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        // move-result-object v0
        return ;
    }
    private void static final cancelAll$lambda$3(kotlin.jvm.functions.Function0) {
        // INTERFACE invoke()Ljava/lang/Object;
        return ;
    }
    private java.lang.CharSequence static final downloadModel$lambda$1(com.google.ai.edge.gallery.data.ModelDataFile) {
        String v0 = "it";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getUrl()Ljava/lang/String;
        // move-result-object v0
        // check-cast v0, Ljava/lang/CharSequence;
        return v0;
    }
    private java.lang.CharSequence static final downloadModel$lambda$2(com.google.ai.edge.gallery.data.ModelDataFile) {
        String v0 = "it";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getDownloadFileName()Ljava/lang/String;
        // move-result-object v0
        // check-cast v0, Ljava/lang/CharSequence;
        return v0;
    }
    private kotlin.Unit static final observerWorkerProgress$lambda$7(com.google.ai.edge.gallery.data.DefaultDownloadRepository, com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function2, java.util.UUID, com.google.ai.edge.gallery.data.Task, androidx.work.WorkInfo) {
        // move-object/from16 v0, p0
        // move-object/from16 v1, p1
        // move-object/from16 v2, p2
        // if-eqz p5, :cond_7
        // move-result-object v3
        // v4 = $EnumSwitchMapping$0:[I
        // VIRTUAL ordinal()I
        // move-result v3
        // aget v3, v4, v3
        String v4 = "duration_ms";
        String v6 = "repo";
        String v7 = "model_id";
        String v8 = "event_type";
        String v9 = "downloadStartTimeSharedPreferences";
        // const/4 v10, 0x2
        String v11 = "getString(...)";
        String v12 = "format(...)";
        // packed-switch v3, :pswitch_data_0
        // goto/16 :goto_2
        // v3 = FAILED:Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // ... (truncated)
    }
    private void final sendNotification(java.lang.String, java.lang.String, java.lang.String, java.lang.String) {
        // move-object/from16 v0, p0
        // move-object/from16 v1, p3
        // INTERFACE isAppInForeground()Z
        // move-result v2
        // if-eqz v2, :cond_0
        return ;
        String v2 = "download_notification";
        String v3 = "AI Edge Gallery download notification";
        // const/4 v4, 0x4
        NotificationChannel; v5 = new NotificationChannel;();
        // move-object v6, v3
        // check-cast v6, Ljava/lang/CharSequence;
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V
        String v7 = "notification";
        // VIRTUAL getSystemService(Ljava/lang/String;)Ljava/lang/Object;
        // move-result-object v6
        String v7 = "null cannot be cast to non-null type android.app.NotificationManager";
        // STATIC checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v6, Landroid/app/NotificationManager;
        // nop
        // ... (truncated)
    }
    public void cancelAll(kotlin.jvm.functions.Function0) {
        // value = {
        // "(",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        String v0 = "onComplete";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL cancelAllWork()Landroidx/work/Operation;
        // move-result-object v0
        // INTERFACE getResult()Lcom/google/common/util/concurrent/ListenableFuture;
        // move-result-object v0
        DefaultDownloadRepository$$ExternalSyntheticLambda1; v1 = new DefaultDownloadRepository$$ExternalSyntheticLambda1;();
        // DIRECT <init>(Lkotlin/jvm/functions/Function0;)V
        // STATIC newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;
        // move-result-object v2
        // check-cast v2, Ljava/util/concurrent/Executor;
        // INTERFACE addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
        return ;
    }
    public void cancelDownloadModel(com.google.ai.edge.gallery.data.Model) {
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v1
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        String v3 = "modelName:";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v2
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v1
        // VIRTUAL cancelAllWorkByTag(Ljava/lang/String;)Landroidx/work/Operation;
        return ;
    }
    public void downloadModel(com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function2) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lkotlin/jvm/functions/Function2<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        // move-object/from16 v0, p0
        // move-object/from16 v1, p1
        // move-object/from16 v2, p2
        // move-object/from16 v3, p3
        String v4 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v4 = "onStatusUpdated";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // ... (truncated)
    }
    public void observerWorkerProgress(java.util.UUID, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function2) {
        // value = {
        // "(",
        // "Ljava/util/UUID;",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lkotlin/jvm/functions/Function2<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        String v0 = "workerId";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "onStatusUpdated";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getWorkInfoByIdLiveData(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;
        // ... (truncated)
    }
}