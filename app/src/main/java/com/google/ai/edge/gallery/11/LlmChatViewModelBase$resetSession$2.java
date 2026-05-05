// Class: Lcom.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$resetSession$2
// Access: final
class LlmChatViewModelBase$resetSession$2 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, com.google.ai.edge.gallery.data.Model, boolean, boolean, com.google.ai.edge.litertlm.Contents, java.util.List, boolean, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "ZZ",
        // "Lcom/google/ai/edge/litertlm/Contents;",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/litertlm/ToolProvider;",
        // ">;Z",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase$resetSession$2;",
        // ">;)V"
        // }
        // const/4 v0, 0x2
        // DIRECT <init>(ILkotlin/coroutines/Continuation;)V
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
        LlmChatViewModelBase$resetSession$2; v10 = new LlmChatViewModelBase$resetSession$2;();
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
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase$resetSession$2;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v0
        // iget v1, p0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase$resetSession$2;->label:I
        // const/4 v2, 0x1
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // move-object v1, v0
        // move-object v0, p1
        // move-object p1, p0
        // goto :goto_1
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // VIRTUAL setIsResettingSession(Z)V
        // VIRTUAL clearAllMessages(Lcom/google/ai/edge/gallery/data/Model;)V
        // VIRTUAL stopResponse(Lcom/google/ai/edge/gallery/data/Model;)V
        // move-object v1, v0
        // move-object v0, p1
        // ... (truncated)
    }
}