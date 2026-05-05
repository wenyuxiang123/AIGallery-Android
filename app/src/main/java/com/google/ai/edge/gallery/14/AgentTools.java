// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.AgentTools
// Access: public
class AgentTools extends Ljava/lang/Object {

    // Fields:
    private final kotlinx.coroutines.channels.Channel _actionChannel;
    private final kotlinx.coroutines.channels.ReceiveChannel actionChannel;
    public android.content.Context context;
    private com.google.ai.edge.gallery.common.CallJsSkillResultImage resultImageToShow;
    private com.google.ai.edge.gallery.common.CallJsSkillResultWebview resultWebviewToShow;
    public com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel skillManagerViewModel;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;->$stable:I
        return ;
    }
    public void constructor <init>() {
        // DIRECT <init>()V
        // const/4 v0, 0x0
        // const/4 v1, 0x6
        // const v2, 0x7fffffff
        // STATIC Channel$default(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;
        // move-result-object v0
        // check-cast v0, Lkotlinx/coroutines/channels/ReceiveChannel;
        return ;
    }
    public kotlinx.coroutines.channels.Channel static final synthetic access$get_actionChannel$p(com.google.ai.edge.gallery.customtasks.agentchat.AgentTools) {
        return v0;
    }
    public kotlinx.coroutines.channels.ReceiveChannel final getActionChannel() {
        // value = {
        // "()",
        // "Lkotlinx/coroutines/channels/ReceiveChannel<",
        // "Lcom/google/ai/edge/gallery/common/AgentAction;",
        // ">;"
        // }
        return v0;
    }
    public android.content.Context final getContext() {
        // if-eqz v0, :cond_0
        return v0;
        String v0 = "context";
        // STATIC throwUninitializedPropertyAccessException(Ljava/lang/String;)V
        // const/4 v0, 0x0
        return v0;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultImage final getResultImageToShow() {
        return v0;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultWebview final getResultWebviewToShow() {
        return v0;
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel final getSkillManagerViewModel() {
        // if-eqz v0, :cond_0
        return v0;
        String v0 = "skillManagerViewModel";
        // STATIC throwUninitializedPropertyAccessException(Ljava/lang/String;)V
        // const/4 v0, 0x0
        return v0;
    }
    public java.util.Map final loadSkill(java.lang.String) {
        // description = "The name of the skill to load."
        // description = "Loads a skill."
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // ")",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;"
        // }
        String v0 = "skillName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // STATIC getDefault()Lkotlinx/coroutines/CoroutineDispatcher;
        // move-result-object v0
        // check-cast v0, Lkotlin/coroutines/CoroutineContext;
        AgentTools$loadSkill$1; v1 = new AgentTools$loadSkill$1;();
        // const/4 v2, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        // check-cast v1, Lkotlin/jvm/functions/Function2;
        // ... (truncated)
    }
    public java.util.Map final runIntent(java.lang.String, java.lang.String) {
        // description = "The intent to run."
        // description = "A JSON string containing the parameter values required for the intent."
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ")",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;"
        // }
        String v0 = "intent";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "parameters";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // STATIC getDefault()Lkotlinx/coroutines/CoroutineDispatcher;
        // move-result-object v0
        // check-cast v0, Lkotlin/coroutines/CoroutineContext;
        AgentTools$runIntent$1; v1 = new AgentTools$runIntent$1;();
        // ... (truncated)
    }
    public java.util.Map final runJs(java.lang.String, java.lang.String, java.lang.String) {
        // description = "The name of skill"
        // description = "The script name to run. Use \'index.html\' if not provided by user"
        // description = "The data to pass to the script. Use empty string if not provided by user"
        // description = "Runs JS script"
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ")",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/Object;",
        // ">;"
        // }
        String v0 = "skillName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "scriptName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "data";
        // ... (truncated)
    }
    public void final sendAgentAction(com.google.ai.edge.gallery.common.AgentAction) {
        String v0 = "action";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // STATIC getDefault()Lkotlinx/coroutines/CoroutineDispatcher;
        // move-result-object v0
        // check-cast v0, Lkotlin/coroutines/CoroutineContext;
        AgentTools$sendAgentAction$1; v1 = new AgentTools$sendAgentAction$1;();
        // const/4 v2, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;Lcom/google/ai/edge/gallery/common/AgentAction;Lkotlin/coroutines/Continuation;)V
        // check-cast v1, Lkotlin/jvm/functions/Function2;
        // STATIC runBlocking(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
        return ;
    }
    public void final setContext(android.content.Context) {
        String v0 = "<set-?>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        return ;
    }
    public void final setResultImageToShow(com.google.ai.edge.gallery.common.CallJsSkillResultImage) {
        return ;
    }
    public void final setResultWebviewToShow(com.google.ai.edge.gallery.common.CallJsSkillResultWebview) {
        return ;
    }
    public void final setSkillManagerViewModel(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel) {
        String v0 = "<set-?>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        return ;
    }
}