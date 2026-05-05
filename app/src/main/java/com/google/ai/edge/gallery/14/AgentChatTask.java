// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.AgentChatTask
// Access: public
class AgentChatTask extends Ljava/lang/Object {

    // Fields:
    private final com.google.ai.edge.gallery.customtasks.agentchat.AgentTools agentTools;
    private final com.google.ai.edge.gallery.data.Task task;

    // Methods:
    public kotlin.Unit static synthetic $r8$lambda$1vwE-oTPdZvsHlWRF0wkNiG0ihE(com.google.ai.edge.gallery.customtasks.agentchat.AgentChatTask, java.lang.Object, int, androidx.compose.runtime.Composer, int) {
        // STATIC MainScreen$lambda$1(Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentChatTask;Ljava/lang/Object;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    public kotlin.Unit static synthetic $r8$lambda$hP4qmkLMbTb_Ja1rhn4q0J0kVTQ(android.content.Context, com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function1, com.google.ai.edge.gallery.customtasks.agentchat.AgentChatTask) {
        // STATIC initializeModelFn$lambda$0(Landroid/content/Context;Lcom/google/ai/edge/gallery/data/Model;Lkotlin/jvm/functions/Function1;Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentChatTask;)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentChatTask;->$stable:I
        return ;
    }
    public void constructor <init>() {
        // move-object/from16 v0, p0
        AgentTools; v1 = new AgentTools;();
        // DIRECT <init>()V
        // nop
        // v1 = INSTANCE:Lcom/google/ai/edge/gallery/data/Category;
        // VIRTUAL getLLM()Lcom/google/ai/edge/gallery/data/CategoryInfo;
        // move-result-object v5
        // v1 = agent:I
        ArrayList; v2 = new ArrayList;();
        // DIRECT <init>()V
        // move-object v12, v2
        // check-cast v12, Ljava/util/List;
        // v20 = text_input_placeholder_llm_chat:I
        Task; v15 = new Task;();
        // move-object v2, v15
        // nop
        // nop
        // nop
        // nop
        // STATIC valueOf(I)Ljava/lang/Integer;
        // ... (truncated)
    }
    private kotlin.Unit static final MainScreen$lambda$1(com.google.ai.edge.gallery.customtasks.agentchat.AgentChatTask, java.lang.Object, int, androidx.compose.runtime.Composer, int) {
        // or-int/lit8 v0, p2, 0x1
        // STATIC updateChangedFlags(I)I
        // move-result v0
        // VIRTUAL MainScreen(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
    private kotlin.Unit static final initializeModelFn$lambda$0(android.content.Context, com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function1, com.google.ai.edge.gallery.customtasks.agentchat.AgentChatTask) {
        // move-object/from16 v0, p3
        // v1 = INSTANCE:Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatModelHelper;
        // move-object v2, v1
        // check-cast v2, Lcom/google/ai/edge/gallery/runtime/LlmModelHelper;
        // nop
        // nop
        // nop
        // nop
        // nop
        // VIRTUAL getSkillManagerViewModel()Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;
        // move-result-object v1
        // VIRTUAL getSelectedSkills()Ljava/util/List;
        // move-result-object v1
        // INTERFACE isEmpty()Z
        // move-result v1
        // if-eqz v1, :cond_0
        // const/4 v1, 0x0
        // move-object v8, v1
        // goto :goto_0
        // VIRTUAL getSkillManagerViewModel()Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;
        // ... (truncated)
    }
    public void MainScreen(java.lang.Object, androidx.compose.runtime.Composer, int) {
        String v0 = "data";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const v0, -0x613fe23c
        // INTERFACE startRestartGroup(I)Landroidx/compose/runtime/Composer;
        // move-result-object p2
        String v1 = "C(MainScreen)110@4442L167:AgentChatTaskModule.kt#41d64j";
        // STATIC sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
        // move v1, p3
        // and-int/lit8 v2, p3, 0x6
        // if-nez v2, :cond_1
        // INTERFACE changedInstance(Ljava/lang/Object;)Z
        // move-result v2
        // if-eqz v2, :cond_0
        // const/4 v2, 0x4
        // goto :goto_0
        // const/4 v2, 0x2
        // or-int/2addr v1, v2
        // and-int/lit8 v2, p3, 0x30
        // if-nez v2, :cond_3
        // INTERFACE changedInstance(Ljava/lang/Object;)Z
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
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatModelHelper;
        // VIRTUAL cleanUp(Lcom/google/ai/edge/gallery/data/Model;Lkotlin/jvm/functions/Function0;)V
        return ;
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
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "coroutineScope";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "onDone";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getSkillManagerViewModel()Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;
        // ... (truncated)
    }
}