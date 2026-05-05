// Class: Lcom.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase
// Access: public
class LlmChatViewModelBase extends Lcom/google/ai/edge/gallery/ui/common/chat/ChatViewModel {

    // Methods:
    public kotlin.Unit static synthetic $r8$lambda$NUWnwOud5iMBeDoqEA_YRJHsW6I(com.google.ai.edge.gallery.data.Model) {
        // STATIC generateResponse$lambda$0(Lcom/google/ai/edge/gallery/data/Model;)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    public kotlin.Unit static synthetic $r8$lambda$k9W-jnhEZ49O0wkaFR_hKUW0_aY() {
        // STATIC resetSession$lambda$2()Lkotlin/Unit;
        // move-result-object v0
        return v0;
    }
    public kotlin.Unit static synthetic $r8$lambda$oEUkorogs33fcu8r-4RO72YFW88() {
        // STATIC generateResponse$lambda$1()Lkotlin/Unit;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;->$stable:I
        return ;
    }
    public void constructor <init>() {
        // DIRECT <init>()V
        return ;
    }
    public void static synthetic generateResponse$default(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, com.google.ai.edge.gallery.data.Model, java.lang.String, java.util.List, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean, int, java.lang.Object) {
        // move/from16 v0, p9
        // if-nez p10, :cond_5
        // and-int/lit8 v1, v0, 0x4
        // if-eqz v1, :cond_0
        // STATIC emptyList()Ljava/util/List;
        // move-result-object v1
        // move-object v5, v1
        // goto :goto_0
        // move-object v5, p3
        // and-int/lit8 v1, v0, 0x8
        // if-eqz v1, :cond_1
        // STATIC emptyList()Ljava/util/List;
        // move-result-object v1
        // move-object v6, v1
        // goto :goto_1
        // move-object v6, p4
        // and-int/lit8 v1, v0, 0x10
        // if-eqz v1, :cond_2
        LlmChatViewModelBase$$ExternalSyntheticLambda0; v1 = new LlmChatViewModelBase$$ExternalSyntheticLambda0;();
        // DIRECT <init>()V
        // ... (truncated)
    }
    private kotlin.Unit static final generateResponse$lambda$0(com.google.ai.edge.gallery.data.Model) {
        String v0 = "it";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
    private kotlin.Unit static final generateResponse$lambda$1() {
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
    public void static synthetic resetSession$default(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, com.google.ai.edge.litertlm.Contents, java.util.List, boolean, boolean, kotlin.jvm.functions.Function0, boolean, int, java.lang.Object) {
        // move/from16 v0, p9
        // if-nez p10, :cond_6
        // and-int/lit8 v1, v0, 0x4
        // if-eqz v1, :cond_0
        // const/4 v1, 0x0
        // move-object v5, v1
        // goto :goto_0
        // move-object v5, p3
        // and-int/lit8 v1, v0, 0x8
        // if-eqz v1, :cond_1
        // STATIC emptyList()Ljava/util/List;
        // move-result-object v1
        // move-object v6, v1
        // goto :goto_1
        // move-object v6, p4
        // and-int/lit8 v1, v0, 0x10
        // const/4 v2, 0x0
        // if-eqz v1, :cond_2
        // move v7, v2
        // goto :goto_2
        // ... (truncated)
    }
    private kotlin.Unit static final resetSession$lambda$2() {
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
    public void static synthetic runAgain$default(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.common.chat.ChatMessageText, kotlin.jvm.functions.Function1, boolean, int, java.lang.Object) {
        // if-nez p6, :cond_1
        // and-int/lit8 p5, p5, 0x8
        // if-eqz p5, :cond_0
        // const/4 p4, 0x0
        // VIRTUAL runAgain(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageText;Lkotlin/jvm/functions/Function1;Z)V
        return ;
        UnsupportedOperationException; p0 = new UnsupportedOperationException;();
        String p1 = "Super calls with default arguments not supported in this target, function: runAgain";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw p0
    }
    public void final generateResponse(com.google.ai.edge.gallery.data.Model, java.lang.String, java.util.List, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Landroid/graphics/Bitmap;",
        // ">;",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageAudioClip;",
        // ">;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // ... (truncated)
    }
    public void final handleError(android.content.Context, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, java.lang.String) {
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "task";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "modelManagerViewModel";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "errorMessage";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getLastMessage(Lcom/google/ai/edge/gallery/data/Model;)Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;
        // move-result-object v0
        // instance-of v0, v0, Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageLoading;
        // if-eqz v0, :cond_0
        // VIRTUAL removeLastMessage(Lcom/google/ai/edge/gallery/data/Model;)V
        ChatMessageError; v0 = new ChatMessageError;();
        // DIRECT <init>(Ljava/lang/String;)V
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;
        // VIRTUAL addMessage(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;)V
        // move-object v0, p0
        // ... (truncated)
    }
    public void final resetSession(com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, com.google.ai.edge.litertlm.Contents, java.util.List, boolean, boolean, kotlin.jvm.functions.Function0, boolean) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lcom/google/ai/edge/litertlm/Contents;",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/litertlm/ToolProvider;",
        // ">;ZZ",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;Z)V"
        // }
        String v0 = "task";
        // move-object/from16 v1, p1
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "model";
        // move-object/from16 v12, p2
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "tools";
        // ... (truncated)
    }
    public void final runAgain(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.common.chat.ChatMessageText, kotlin.jvm.functions.Function1, boolean) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageText;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;Z)V"
        // }
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "message";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "onError";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // move-object v0, p0
        // check-cast v0, Landroidx/lifecycle/ViewModel;
        // STATIC getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;
        // move-result-object v1
        // ... (truncated)
    }
    public void final stopResponse(com.google.ai.edge.gallery.data.Model) {
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v0
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "Stopping response for model ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = "...";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        String v1 = "AGLlmChatViewModel";
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // VIRTUAL getLastMessage(Lcom/google/ai/edge/gallery/data/Model;)Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;
        // move-result-object v0
        // ... (truncated)
    }
}