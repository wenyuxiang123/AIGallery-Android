// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$saveSkillEdit$1
// Access: final
class SkillManagerViewModel$saveSkillEdit$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(java.lang.String, int, com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, kotlin.jvm.functions.Function1, java.lang.String, java.lang.String, java.util.Map, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "I",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/coroutines/Continuation<",
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
        SkillManagerViewModel$saveSkillEdit$1; v10 = new SkillManagerViewModel$saveSkillEdit$1;();
        // move-object v0, v10
        // move-object v9, p2
        // check-cast v10, Lkotlin/coroutines/Continuation;
        return v10;
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
        String v0 = " to ";
        String v2 = "AGSkillManagerVM";
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // packed-switch v3, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // nop
        StringBuilder; v4 = new StringBuilder;();
        // DIRECT <init>()V
        String v5 = "saveSkillEdit: ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v4
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v3
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // ... (truncated)
    }
}