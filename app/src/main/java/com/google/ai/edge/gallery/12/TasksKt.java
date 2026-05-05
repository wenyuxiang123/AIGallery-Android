// Class: final Lcom.google.ai.edge.gallery.data.TasksKt
// Access: public
class TasksKt extends Ljava/lang/Object {

    // Fields:
    private static final java.util.Set allLegacyTaskIds;

    // Methods:
    static void constructor <clinit>() {
        // nop
        // const/4 v0, 0x5
        // new-array v0, v0, [Ljava/lang/String;
        // const/4 v1, 0x0
        String v2 = "llm_chat";
        // aput-object v2, v0, v1
        String v1 = "llm_prompt_lab";
        // const/4 v2, 0x1
        // aput-object v1, v0, v2
        // nop
        String v1 = "llm_ask_image";
        // const/4 v2, 0x2
        // aput-object v1, v0, v2
        // nop
        String v1 = "llm_ask_audio";
        // const/4 v2, 0x3
        // aput-object v1, v0, v2
        // nop
        String v1 = "llm_agent_chat";
        // const/4 v2, 0x4
        // ... (truncated)
    }
    public boolean static final isLegacyTasks(java.lang.String) {
        String v0 = "id";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = allLegacyTaskIds:Ljava/util/Set;
        // INTERFACE contains(Ljava/lang/Object;)Z
        // move-result v0
        return v0;
    }
}