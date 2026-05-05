// Class: final enum Lcom.google.ai.edge.gallery.common.AgentActionName
// Access: public
class AgentActionName extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.common.AgentActionName ASK_INFO;
    public static final enum com.google.ai.edge.gallery.common.AgentActionName CALL_JS_SKILL;
    public static final enum com.google.ai.edge.gallery.common.AgentActionName SKILL_PROGRESS;

    // Methods:
    private com.google.ai.edge.gallery.common.AgentActionName[] static final synthetic $values() {
        // v0 = CALL_JS_SKILL:Lcom/google/ai/edge/gallery/common/AgentActionName;
        // v1 = SKILL_PROGRESS:Lcom/google/ai/edge/gallery/common/AgentActionName;
        // v2 = ASK_INFO:Lcom/google/ai/edge/gallery/common/AgentActionName;
        // filled-new-array {v0, v1, v2}, [Lcom/google/ai/edge/gallery/common/AgentActionName;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        AgentActionName; v0 = new AgentActionName;();
        String v1 = "CALL_JS_SKILL";
        // const/4 v2, 0x0
        // DIRECT <init>(Ljava/lang/String;I)V
        AgentActionName; v0 = new AgentActionName;();
        String v1 = "SKILL_PROGRESS";
        // const/4 v2, 0x1
        // DIRECT <init>(Ljava/lang/String;I)V
        AgentActionName; v0 = new AgentActionName;();
        String v1 = "ASK_INFO";
        // const/4 v2, 0x2
        // DIRECT <init>(Ljava/lang/String;I)V
        // STATIC $values()[Lcom/google/ai/edge/gallery/common/AgentActionName;
        // move-result-object v0
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/common/AgentActionName;
        // check-cast v0, [Ljava/lang/Enum;
        // STATIC enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
        // move-result-object v0
        return ;
    }
    private void constructor <init>(java.lang.String, int) {
        // value = {
        // "()V"
        // }
        // DIRECT <init>(Ljava/lang/String;I)V
        return ;
    }
    public kotlin.enums.EnumEntries static getEntries() {
        // value = {
        // "()",
        // "Lkotlin/enums/EnumEntries<",
        // "Lcom/google/ai/edge/gallery/common/AgentActionName;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.common.AgentActionName static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/common/AgentActionName;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/common/AgentActionName;
        return v0;
    }
    public com.google.ai.edge.gallery.common.AgentActionName[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/common/AgentActionName;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/common/AgentActionName;
        return v0;
    }
}