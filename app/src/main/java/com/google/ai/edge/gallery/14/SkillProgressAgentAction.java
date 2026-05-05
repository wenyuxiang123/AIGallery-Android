// Class: final Lcom.google.ai.edge.gallery.common.SkillProgressAgentAction
// Access: public
class SkillProgressAgentAction extends Lcom/google/ai/edge/gallery/common/AgentAction {

    // Fields:
    private final java.lang.String addItemDescription;
    private final java.lang.String addItemTitle;
    private final java.lang.Object customData;
    private final boolean inProgress;
    private final java.lang.String label;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/common/SkillProgressAgentAction;->$stable:I
        return ;
    }
    public void constructor <init>(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Object) {
        String v0 = "label";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "addItemTitle";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "addItemDescription";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = SKILL_PROGRESS:Lcom/google/ai/edge/gallery/common/AgentActionName;
        // DIRECT <init>(Lcom/google/ai/edge/gallery/common/AgentActionName;)V
        // iput-boolean p2, p0, Lcom/google/ai/edge/gallery/common/SkillProgressAgentAction;->inProgress:Z
        return ;
    }
    public void synthetic constructor <init>(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p7, p6, 0x4
        // if-eqz p7, :cond_0
        // move-object v4, v0
        // goto :goto_0
        // move-object v4, p3
        // and-int/lit8 p3, p6, 0x8
        // if-eqz p3, :cond_1
        // move-object v5, v0
        // goto :goto_1
        // move-object v5, p4
        // and-int/lit8 p3, p6, 0x10
        // if-eqz p3, :cond_2
        // const/4 p5, 0x0
        // move-object v6, p5
        // goto :goto_2
        // move-object v6, p5
        // move-object v1, p0
        // move-object v2, p1
        // move v3, p2
        return ;
    }
    public java.lang.String final getAddItemDescription() {
        return v0;
    }
    public java.lang.String final getAddItemTitle() {
        return v0;
    }
    public java.lang.Object final getCustomData() {
        return v0;
    }
    public boolean final getInProgress() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/common/SkillProgressAgentAction;->inProgress:Z
        return v0;
    }
    public java.lang.String final getLabel() {
        return v0;
    }
}