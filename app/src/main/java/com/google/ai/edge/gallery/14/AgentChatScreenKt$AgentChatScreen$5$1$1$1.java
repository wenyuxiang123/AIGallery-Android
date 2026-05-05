// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$AgentChatScreen$5$1$1$1
// Access: final
class AgentChatScreenKt$AgentChatScreen$5$1$1$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.common.AgentAction, java.lang.String, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/common/AgentAction;",
        // "Ljava/lang/String;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentChatScreenKt$AgentChatScreen$5$1$1$1;",
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
        AgentChatScreenKt$AgentChatScreen$5$1$1$1; v0 = new AgentChatScreenKt$AgentChatScreen$5$1$1$1;();
        // DIRECT <init>(Lcom/google/ai/edge/gallery/common/AgentAction;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
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
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v0
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // goto :goto_0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // move-object v1, p0
        // check-cast v1, Lkotlin/coroutines/Continuation;
        // const/4 v2, 0x1
        // const-wide/32 v2, 0xea60
        // STATIC delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v1
        // if-ne v1, v0, :cond_0
        return v0;
        // check-cast v0, Lcom/google/ai/edge/gallery/common/CallJsAgentAction;
        // VIRTUAL getResult()Lkotlinx/coroutines/CompletableDeferred;
        // ... (truncated)
    }
}