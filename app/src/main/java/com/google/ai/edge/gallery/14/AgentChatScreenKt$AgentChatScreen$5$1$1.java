// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$AgentChatScreen$5$1$1
// Access: final
class AgentChatScreenKt$AgentChatScreen$5$1$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    public kotlin.Unit static synthetic $r8$lambda$SHdssbXWdxKXMV-UTIRkzrjDOEg(com.google.ai.edge.gallery.common.AgentAction, java.lang.String, java.lang.String) {
        // STATIC invokeSuspend$lambda$2(Lcom/google/ai/edge/gallery/common/AgentAction;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    constructor void <init>(kotlinx.coroutines.channels.ReceiveChannel, com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModel, androidx.compose.ui.graphics.vector.ImageVector, androidx.compose.runtime.State, com.google.ai.edge.gallery.customtasks.agentchat.ChatWebViewClient, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lkotlinx/coroutines/channels/ReceiveChannel<",
        // "+",
        // "Lcom/google/ai/edge/gallery/common/AgentAction;",
        // ">;",
        // "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModel;",
        // "Landroidx/compose/ui/graphics/vector/ImageVector;",
        // "Landroidx/compose/runtime/State<",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // ">;",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/ChatWebViewClient;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Landroid/webkit/WebView;",
        // ">;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Lcom/google/ai/edge/gallery/common/AskInfoAgentAction;",
        // ">;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/String;",
        // ... (truncated)
    }
    private kotlin.Unit static final invokeSuspend$lambda$2(com.google.ai.edge.gallery.common.AgentAction, java.lang.String, java.lang.String) {
        StringBuilder; v0 = new StringBuilder;();
        // DIRECT <init>()V
        String v1 = "Got result:\n";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        String v1 = "AGAgentChatScreen";
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // move-object v0, p0
        // check-cast v0, Lcom/google/ai/edge/gallery/common/CallJsAgentAction;
        // VIRTUAL getResult()Lkotlinx/coroutines/CompletableDeferred;
        // move-result-object v0
        // INTERFACE complete(Ljava/lang/Object;)Z
        // move-object v0, p2
        // check-cast v0, Ljava/lang/CharSequence;
        String v2 = "\"error\":";
        // check-cast v2, Ljava/lang/CharSequence;
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
        AgentChatScreenKt$AgentChatScreen$5$1$1; v11 = new AgentChatScreenKt$AgentChatScreen$5$1$1;();
        // move-object v0, v11
        // move-object v10, p2
        // check-cast v11, Lkotlin/coroutines/Continuation;
        return v11;
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
        // move-object v2, v0
        // check-cast v2, Lkotlinx/coroutines/CoroutineScope;
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v3
        // const/4 v4, 0x0
        // const/4 v5, 0x1
        String v6 = "AGAgentChatScreen";
        // const/4 v7, 0x0
        // packed-switch v0, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v3 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // check-cast v8, Landroidx/compose/runtime/MutableState;
        // check-cast v8, Lcom/google/ai/edge/gallery/customtasks/agentchat/ChatWebViewClient;
        // check-cast v8, Ljava/lang/String;
        // check-cast v9, Lcom/google/ai/edge/gallery/common/AgentAction;
        // check-cast v10, Lkotlinx/coroutines/channels/ChannelIterator;
        // move-object v7, v3
        // ... (truncated)
    }
}