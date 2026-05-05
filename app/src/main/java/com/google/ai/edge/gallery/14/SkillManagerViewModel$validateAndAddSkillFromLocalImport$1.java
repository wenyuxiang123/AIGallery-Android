// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$validateAndAddSkillFromLocalImport$1
// Access: final
class SkillManagerViewModel$validateAndAddSkillFromLocalImport$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(android.net.Uri, com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Landroid/net/Uri;",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // ">;)V"
        // }
        // const/4 v0, 0x2
        // DIRECT <init>(ILkotlin/coroutines/Continuation;)V
        return ;
    }
    private void static final invokeSuspend$lambda$6$copyDocumentFile(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, androidx.documentfile.provider.DocumentFile, java.io.File) {
        String v0 = " to ";
        String v1 = "AGSkillManagerVM";
        // VIRTUAL isDirectory()Z
        // move-result v2
        // const/4 v3, 0x0
        // if-eqz v2, :cond_0
        // VIRTUAL mkdirs()Z
        // VIRTUAL listFiles()[Landroidx/documentfile/provider/DocumentFile;
        // move-result-object v0
        // array-length v1, v0
        // if-ge v3, v1, :cond_1
        // aget-object v2, v0, v3
        File; v4 = new File;();
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v5
        // STATIC checkNotNull(Ljava/lang/Object;)V
        // DIRECT <init>(Ljava/io/File;Ljava/lang/String;)V
        // STATIC checkNotNull(Ljava/lang/Object;)V
        // STATIC invokeSuspend$lambda$6$copyDocumentFile(Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;Landroidx/documentfile/provider/DocumentFile;Ljava/io/File;)V
        // add-int/lit8 v3, v3, 0x1
        // ... (truncated)
    }
    public kotlin.coroutines.Continuation final create(java.lang.Object, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Ljava/lang/Object;",
        // "Lkotlin/coroutines/Continuation<",
        // "*>;)",
        // "Lkotlin/coroutines/Continuation<",
        // "Lkotlin/Unit;",
        // ">;"
        // }
        SkillManagerViewModel$validateAndAddSkillFromLocalImport$1; v6 = new SkillManagerViewModel$validateAndAddSkillFromLocalImport$1;();
        // move-object v0, v6
        // move-object v5, p2
        // check-cast v6, Lkotlin/coroutines/Continuation;
        return v6;
    }
    public java.lang.Object bridge synthetic invoke(java.lang.Object, java.lang.Object) {
        // check-cast p1, Lkotlinx/coroutines/CoroutineScope;
        // check-cast p2, Lkotlin/coroutines/Continuation;
        // VIRTUAL invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lkotlinx/coroutines/CoroutineScope;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lkotlin/Unit;",
        // ">;)",
        // "Ljava/lang/Object;"
        // }
        // VIRTUAL create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
        // move-result-object v0
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // move-object/from16 v1, p0
        String v2 = "AGSkillManagerVM";
        // move-object v3, v0
        // check-cast v3, Lkotlinx/coroutines/CoroutineScope;
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // packed-switch v0, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // nop
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        StringBuilder; v6 = new StringBuilder;();
        // DIRECT <init>()V
        String v7 = "Validating skill from directory URI: ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v6
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
}