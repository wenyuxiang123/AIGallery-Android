// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.AgentTools$runJs$1
// Access: final
class AgentTools$runJs$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(java.lang.String, java.lang.String, java.lang.String, com.google.ai.edge.gallery.customtasks.agentchat.AgentTools, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools$runJs$1;",
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
        AgentTools$runJs$1; v6 = new AgentTools$runJs$1;();
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
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;>;)",
        // "Ljava/lang/Object;"
        // }
        // VIRTUAL create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools$runJs$1;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // move-object/from16 v1, p0
        // move-object v2, v0
        // check-cast v2, Lkotlinx/coroutines/CoroutineScope;
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v0
        // iget v3, v1, Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools$runJs$1;->label:I
        String v5 = "failed";
        String v6 = "error";
        String v7 = "\n- data: ";
        String v8 = "result";
        String v9 = "\"";
        String v11 = "status";
        String v13 = "AGAgentTools";
        // packed-switch v3, :pswitch_data_0
        // move-object/from16 v16, v2
        IllegalStateException; v0 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // check-cast v0, Lcom/google/ai/edge/gallery/common/CallJsAgentAction;
        // ... (truncated)
    }
}