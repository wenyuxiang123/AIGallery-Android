// Class: Lcom.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$handleError$1
// Access: final
class LlmChatViewModelBase$handleError$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    public kotlin.Unit static synthetic $r8$lambda$v9u8As1_zbhvSPZpv3WyKhNdRi8(com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, android.content.Context, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase) {
        // STATIC invokeSuspend$lambda$0(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Landroid/content/Context;Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    constructor void <init>(com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, android.content.Context, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;",
        // "Landroid/content/Context;",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase$handleError$1;",
        // ">;)V"
        // }
        // const/4 v0, 0x2
        // DIRECT <init>(ILkotlin/coroutines/Continuation;)V
        return ;
    }
    private kotlin.Unit static final invokeSuspend$lambda$0(com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, android.content.Context, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase) {
        // const/16 v6, 0x18
        // const/4 v7, 0x0
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        // move-object v0, p0
        // move-object v1, p1
        // move-object v2, p2
        // move-object v3, p3
        // nop
        // nop
        ChatMessageWarning; v0 = new ChatMessageWarning;();
        String v1 = "Session re-initialized";
        // DIRECT <init>(Ljava/lang/String;)V
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;
        // VIRTUAL addMessage(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
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
        LlmChatViewModelBase$handleError$1; v7 = new LlmChatViewModelBase$handleError$1;();
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
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase$handleError$1;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // iget v0, p0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase$handleError$1;->label:I
        // packed-switch v0, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        LlmChatViewModelBase$handleError$1$$ExternalSyntheticLambda0; v0 = new LlmChatViewModelBase$handleError$1$$ExternalSyntheticLambda0;();
        // move-object v5, v0
        // const/16 v7, 0x8
        // const/4 v8, 0x0
        // const/4 v5, 0x0
        // move-object v6, v0
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
}