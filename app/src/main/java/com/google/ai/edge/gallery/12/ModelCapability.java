// Class: final enum Lcom.google.ai.edge.gallery.data.ModelCapability
// Access: public
class ModelCapability extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.data.ModelCapability LLM_THINKING;

    // Methods:
    private com.google.ai.edge.gallery.data.ModelCapability[] static final synthetic $values() {
        // v0 = LLM_THINKING:Lcom/google/ai/edge/gallery/data/ModelCapability;
        // filled-new-array {v0}, [Lcom/google/ai/edge/gallery/data/ModelCapability;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        ModelCapability; v0 = new ModelCapability;();
        String v1 = "LLM_THINKING";
        // const/4 v2, 0x0
        // DIRECT <init>(Ljava/lang/String;I)V
        // STATIC $values()[Lcom/google/ai/edge/gallery/data/ModelCapability;
        // move-result-object v0
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/ModelCapability;
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
        // "Lcom/google/ai/edge/gallery/data/ModelCapability;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelCapability static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/data/ModelCapability;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/ModelCapability;
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelCapability[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/ModelCapability;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/data/ModelCapability;
        return v0;
    }
}