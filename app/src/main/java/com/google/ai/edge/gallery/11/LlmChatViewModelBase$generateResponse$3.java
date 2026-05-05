// Class: Lcom.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$generateResponse$3
// Access: final
class LlmChatViewModelBase$generateResponse$3 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    public kotlin.Unit static synthetic $r8$lambda$4GaCSP9Xod73pLCfAiSShMLaOvc(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, kotlin.jvm.functions.Function1, java.lang.String) {
        // STATIC invokeSuspend$lambda$2(Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    public kotlin.Unit static synthetic $r8$lambda$9xB3DIgWsM7sIyRfFqmGvxmztgg(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase) {
        // STATIC invokeSuspend$lambda$1(Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    public kotlin.Unit static synthetic $r8$lambda$gcHP4ZPAThukZ2sIsj1V0oGnyYU(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, com.google.ai.edge.gallery.data.Model, java.lang.String, long, kotlin.jvm.internal.Ref$BooleanRef, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String, boolean, java.lang.String) {
        // move-result-object p0
        return p0;
    }
    constructor void <init>(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, com.google.ai.edge.gallery.data.Model, java.lang.String, java.util.List, boolean, java.lang.String, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageAudioClip;",
        // ">;Z",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Landroid/graphics/Bitmap;",
        // ">;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // ... (truncated)
    }
    private kotlin.Unit static final invokeSuspend$lambda$0(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, com.google.ai.edge.gallery.data.Model, java.lang.String, long, kotlin.jvm.internal.Ref$BooleanRef, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String, boolean, java.lang.String) {
        // move-object/from16 v0, p0
        // move-object/from16 v1, p1
        // move-object/from16 v2, p5
        // move-object/from16 v3, p8
        String v4 = "<ctrl";
        // const/4 v5, 0x0
        // const/4 v6, 0x2
        // const/4 v7, 0x0
        // STATIC startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        // move-result v4
        // if-nez v4, :cond_1a
        // move-result-object v4
        // if-eqz v4, :cond_0
        // VIRTUAL getType()Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageType;
        // move-result-object v6
        // goto :goto_0
        // move-object v6, v7
        // v8 = LOADING:Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageType;
        // const/4 v9, 0x1
        // if-ne v6, v8, :cond_1
        // ... (truncated)
    }
    private kotlin.Unit static final invokeSuspend$lambda$1(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase) {
        // const/4 v0, 0x0
        // VIRTUAL setInProgress(Z)V
        // VIRTUAL setPreparing(Z)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
    private kotlin.Unit static final invokeSuspend$lambda$2(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, kotlin.jvm.functions.Function1, java.lang.String) {
        String v0 = "AGLlmChatViewModel";
        String v1 = "Error occurred while running inference";
        // STATIC e(Ljava/lang/String;Ljava/lang/String;)I
        // const/4 v0, 0x0
        // VIRTUAL setInProgress(Z)V
        // VIRTUAL setPreparing(Z)V
        // INTERFACE invoke(Ljava/lang/Object;)Ljava/lang/Object;
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
        LlmChatViewModelBase$generateResponse$3; v12 = new LlmChatViewModelBase$generateResponse$3;();
        // move-object v0, v12
        // move-object v11, p2
        // check-cast v12, Lkotlin/coroutines/Continuation;
        return v12;
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
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase$generateResponse$3;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // move-object/from16 v0, p0
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v1
        // const/4 v3, 0x0
        // const/4 v4, 0x1
        // packed-switch v2, :pswitch_data_0
        IllegalStateException; v1 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v1
        // move-object/from16 v2, p1
        // move-object v1, v0
        // goto :goto_2
        // move-object v2, v1
        // move-object/from16 v1, p1
        // goto :goto_1
        // VIRTUAL setInProgress(Z)V
        // VIRTUAL setPreparing(Z)V
        ChatMessageLoading; v6 = new ChatMessageLoading;();
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        // ... (truncated)
    }
}