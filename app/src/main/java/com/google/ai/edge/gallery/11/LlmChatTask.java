// Class: final Lcom.google.ai.edge.gallery.ui.llmchat.LlmChatTask
// Access: public
class LlmChatTask extends Ljava/lang/Object {

    // Fields:
    private final com.google.ai.edge.gallery.data.Task task;

    // Methods:
    public kotlin.Unit static synthetic $r8$lambda$FGJocw9-bt1fV359QcIqf0LD6YM(com.google.ai.edge.gallery.ui.llmchat.LlmChatTask, java.lang.Object, int, androidx.compose.runtime.Composer, int) {
        // STATIC MainScreen$lambda$0(Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatTask;Ljava/lang/Object;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatTask;->$stable:I
        return ;
    }
    public void constructor <init>() {
        // nop
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/data/Category;
        // VIRTUAL getLLM()Lcom/google/ai/edge/gallery/data/CategoryInfo;
        // move-result-object v4
        // v0 = INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;
        // STATIC getForum(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
        // move-result-object v5
        ArrayList; v0 = new ArrayList;();
        // DIRECT <init>()V
        // move-object v11, v0
        // check-cast v11, Ljava/util/List;
        // v19 = text_input_placeholder_llm_chat:I
        Task; v0 = new Task;();
        // move-object v1, v0
        // nop
        // nop
        // nop
        // nop
        // nop
        // nop
        // ... (truncated)
    }
    private kotlin.Unit static final MainScreen$lambda$0(com.google.ai.edge.gallery.ui.llmchat.LlmChatTask, java.lang.Object, int, androidx.compose.runtime.Composer, int) {
        // or-int/lit8 v0, p2, 0x1
        // STATIC updateChangedFlags(I)I
        // move-result v0
        // VIRTUAL MainScreen(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
    public void MainScreen(java.lang.Object, androidx.compose.runtime.Composer, int) {
        // move-object/from16 v0, p1
        // move/from16 v1, p3
        String v2 = "data";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const v2, -0x4f6a33f7
        // move-object/from16 v3, p2
        // INTERFACE startRestartGroup(I)Landroidx/compose/runtime/Composer;
        // move-result-object v15
        String v3 = "C(MainScreen)101@3740L849:LlmChatTaskModule.kt#t2uuva";
        // STATIC sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
        // move/from16 v3, p3
        // and-int/lit8 v4, v1, 0x6
        // const/4 v5, 0x2
        // if-nez v4, :cond_1
        // INTERFACE changedInstance(Ljava/lang/Object;)Z
        // move-result v4
        // if-eqz v4, :cond_0
        // const/4 v4, 0x4
        // goto :goto_0
        // move v4, v5
        // ... (truncated)
    }
    public void cleanUpModelFn(android.content.Context, kotlinx.coroutines.CoroutineScope, com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function0) {
        // value = {
        // "(",
        // "Landroid/content/Context;",
        // "Lkotlinx/coroutines/CoroutineScope;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "coroutineScope";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "onDone";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // STATIC getRuntimeHelper(Lcom/google/ai/edge/gallery/data/Model;)Lcom/google/ai/edge/gallery/runtime/LlmModelHelper;
        // move-result-object v0
        // INTERFACE cleanUp(Lcom/google/ai/edge/gallery/data/Model;Lkotlin/jvm/functions/Function0;)V
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.Task getTask() {
        return v0;
    }
    public void initializeModelFn(android.content.Context, kotlinx.coroutines.CoroutineScope, com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function1) {
        // value = {
        // "(",
        // "Landroid/content/Context;",
        // "Lkotlinx/coroutines/CoroutineScope;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        String v0 = "context";
        // move-object/from16 v13, p1
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "coroutineScope";
        // move-object/from16 v14, p2
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "model";
        // move-object/from16 v15, p3
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // ... (truncated)
    }
}