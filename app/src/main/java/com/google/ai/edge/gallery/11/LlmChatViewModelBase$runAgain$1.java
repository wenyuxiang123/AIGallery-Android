// Class: Lcom.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$runAgain$1
// Access: final
class LlmChatViewModelBase$runAgain$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, com.google.ai.edge.gallery.ui.common.chat.ChatMessageText, kotlin.jvm.functions.Function1, boolean, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;",
        // "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageText;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;Z",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase$runAgain$1;",
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
        LlmChatViewModelBase$runAgain$1; v7 = new LlmChatViewModelBase$runAgain$1;();
        // move-object v0, v7
        // move-object v6, p2
        // check-cast v7, Lkotlin/coroutines/Continuation;
        return v7;
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
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase$runAgain$1;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v0
        // move-object/from16 v1, p0
        // iget v2, v1, Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase$runAgain$1;->label:I
        // packed-switch v2, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // move-object v2, v0
        // move-object/from16 v0, p1
        // goto :goto_1
        // move-object v2, v0
        // move-object/from16 v0, p1
        // VIRTUAL getInstance()Ljava/lang/Object;
        // move-result-object v3
        // if-nez v3, :cond_1
        // move-object v3, v1
        // check-cast v3, Lkotlin/coroutines/Continuation;
        // const/4 v4, 0x1
        // ... (truncated)
    }
}