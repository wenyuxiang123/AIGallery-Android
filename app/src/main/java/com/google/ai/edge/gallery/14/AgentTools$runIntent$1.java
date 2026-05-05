// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.AgentTools$runIntent$1
// Access: final
class AgentTools$runIntent$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(java.lang.String, java.lang.String, com.google.ai.edge.gallery.customtasks.agentchat.AgentTools, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools$runIntent$1;",
        // ">;)V"
        // }
        // const/4 v0, 0x2
        // DIRECT <init>(ILkotlin/coroutines/Continuation;)V
        return ;
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
        AgentTools$runIntent$1; v0 = new AgentTools$runIntent$1;();
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/coroutines/Continuation;
        return v0;
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
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;>;)",
        // "Ljava/lang/Object;"
        // }
        // VIRTUAL create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools$runIntent$1;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v0
        // iget v1, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools$runIntent$1;->label:I
        // const/4 v2, 0x1
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // goto/16 :goto_0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        StringBuilder; v4 = new StringBuilder;();
        // DIRECT <init>()V
        String v5 = "Run intent. Intent: \'";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v4
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        String v4 = "\', parameters: \'";
        // ... (truncated)
    }
}