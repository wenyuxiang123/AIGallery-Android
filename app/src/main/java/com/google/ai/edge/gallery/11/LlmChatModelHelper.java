// Class: final Lcom.google.ai.edge.gallery.ui.llmchat.LlmChatModelHelper
// Access: public
class LlmChatModelHelper extends Ljava/lang/Object {

    // Fields:
    public static final com.google.ai.edge.gallery.ui.llmchat.LlmChatModelHelper INSTANCE;
    private static final java.util.Map cleanUpListeners;

    // Methods:
    static void constructor <clinit>() {
        LlmChatModelHelper; v0 = new LlmChatModelHelper;();
        // DIRECT <init>()V
        LinkedHashMap; v0 = new LinkedHashMap;();
        // DIRECT <init>()V
        // check-cast v0, Ljava/util/Map;
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatModelHelper;->$stable:I
        return ;
    }
    private void constructor <init>() {
        // DIRECT <init>()V
        return ;
    }
    private byte[] final toPngByteArray(android.graphics.Bitmap) {
        ByteArrayOutputStream; v0 = new ByteArrayOutputStream;();
        // DIRECT <init>()V
        // v1 = PNG:Landroid/graphics/Bitmap$CompressFormat;
        // const/16 v2, 0x64
        // move-object v3, v0
        // check-cast v3, Ljava/io/OutputStream;
        // VIRTUAL compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
        // VIRTUAL toByteArray()[B
        // move-result-object v1
        String v2 = "toByteArray(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        return v1;
    }
    public void cleanUp(com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function0) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        String v0 = "AGLlmChatModelHelper";
        String v1 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v1 = "onDone";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getInstance()Ljava/lang/Object;
        // move-result-object v1
        // if-nez v1, :cond_0
        return ;
        // VIRTUAL getInstance()Ljava/lang/Object;
        // move-result-object v1
        String v2 = "null cannot be cast to non-null type com.google.ai.edge.gallery.ui.llmchat.LlmModelInstance";
        // STATIC checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V
        // ... (truncated)
    }
    public void initialize(android.content.Context, com.google.ai.edge.gallery.data.Model, boolean, boolean, kotlin.jvm.functions.Function1, com.google.ai.edge.litertlm.Contents, java.util.List, boolean, kotlinx.coroutines.CoroutineScope) {
        // value = {
        // "(",
        // "Landroid/content/Context;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "ZZ",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lcom/google/ai/edge/litertlm/Contents;",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/litertlm/ToolProvider;",
        // ">;Z",
        // "Lkotlinx/coroutines/CoroutineScope;",
        // ")V"
        // }
        // move-object/from16 v1, p1
        // move-object/from16 v2, p2
        // ... (truncated)
    }
    public void resetConversation(com.google.ai.edge.gallery.data.Model, boolean, boolean, com.google.ai.edge.litertlm.Contents, java.util.List, boolean) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "ZZ",
        // "Lcom/google/ai/edge/litertlm/Contents;",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/litertlm/ToolProvider;",
        // ">;Z)V"
        // }
        // move-object/from16 v1, p1
        String v2 = "AGLlmChatModelHelper";
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "tools";
        // move-object/from16 v12, p5
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // nop
        // move-result-object v0
        StringBuilder; v3 = new StringBuilder;();
        // ... (truncated)
    }
    public void runInference(com.google.ai.edge.gallery.data.Model, java.lang.String, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, java.util.List, java.util.List, kotlinx.coroutines.CoroutineScope, java.util.Map) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Ljava/lang/String;",
        // "Lkotlin/jvm/functions/Function3<",
        // "-",
        // "Ljava/lang/String;",
        // "-",
        // "Ljava/lang/Boolean;",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ... (truncated)
    }
    public void stopResponse(com.google.ai.edge.gallery.data.Model) {
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getInstance()Ljava/lang/Object;
        // move-result-object v0
        // instance-of v1, v0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmModelInstance;
        // if-eqz v1, :cond_0
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmModelInstance;
        // goto :goto_0
        // const/4 v0, 0x0
        // if-nez v0, :cond_1
        return ;
        // VIRTUAL getConversation()Lcom/google/ai/edge/litertlm/Conversation;
        // move-result-object v1
        // VIRTUAL cancelProcess()V
        return ;
    }
}