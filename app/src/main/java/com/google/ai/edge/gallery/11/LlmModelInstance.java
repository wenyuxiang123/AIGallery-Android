// Class: final Lcom.google.ai.edge.gallery.ui.llmchat.LlmModelInstance
// Access: public
class LlmModelInstance extends Ljava/lang/Object {

    // Fields:
    private com.google.ai.edge.litertlm.Conversation conversation;
    private final com.google.ai.edge.litertlm.Engine engine;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/ui/llmchat/LlmModelInstance;->$stable:I
        return ;
    }
    public void constructor <init>(com.google.ai.edge.litertlm.Engine, com.google.ai.edge.litertlm.Conversation) {
        String v0 = "engine";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "conversation";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.ui.llmchat.LlmModelInstance static synthetic copy$default(com.google.ai.edge.gallery.ui.llmchat.LlmModelInstance, com.google.ai.edge.litertlm.Engine, com.google.ai.edge.litertlm.Conversation, int, java.lang.Object) {
        // and-int/lit8 p4, p3, 0x1
        // if-eqz p4, :cond_0
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_1
        // VIRTUAL copy(Lcom/google/ai/edge/litertlm/Engine;Lcom/google/ai/edge/litertlm/Conversation;)Lcom/google/ai/edge/gallery/ui/llmchat/LlmModelInstance;
        // move-result-object p0
        return p0;
    }
    public com.google.ai.edge.litertlm.Engine final component1() {
        return v0;
    }
    public com.google.ai.edge.litertlm.Conversation final component2() {
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmchat.LlmModelInstance final copy(com.google.ai.edge.litertlm.Engine, com.google.ai.edge.litertlm.Conversation) {
        String v0 = "engine";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "conversation";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        LlmModelInstance; v0 = new LlmModelInstance;();
        // DIRECT <init>(Lcom/google/ai/edge/litertlm/Engine;Lcom/google/ai/edge/litertlm/Conversation;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/ui/llmchat/LlmModelInstance;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/ui/llmchat/LlmModelInstance;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_3
        return v2;
        return v0;
    }
    public com.google.ai.edge.litertlm.Conversation final getConversation() {
        return v0;
    }
    public com.google.ai.edge.litertlm.Engine final getEngine() {
        return v0;
    }
    public int hashCode() {
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        return v1;
    }
    public void final setConversation(com.google.ai.edge.litertlm.Conversation) {
        String v0 = "<set-?>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        return ;
    }
    public java.lang.String toString() {
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        String v3 = "LlmModelInstance(engine=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v2
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v2 = ", conversation=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}