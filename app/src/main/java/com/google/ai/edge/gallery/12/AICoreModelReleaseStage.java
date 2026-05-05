// Class: final enum Lcom.google.ai.edge.gallery.data.AICoreModelReleaseStage
// Access: public
class AICoreModelReleaseStage extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.data.AICoreModelReleaseStage PREVIEW;
    public static final enum com.google.ai.edge.gallery.data.AICoreModelReleaseStage STABLE;

    // Methods:
    private com.google.ai.edge.gallery.data.AICoreModelReleaseStage[] static final synthetic $values() {
        // v0 = STABLE:Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;
        // v1 = PREVIEW:Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;
        // filled-new-array {v0, v1}, [Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        AICoreModelReleaseStage; v0 = new AICoreModelReleaseStage;();
        String v1 = "STABLE";
        // const/4 v2, 0x0
        // DIRECT <init>(Ljava/lang/String;I)V
        AICoreModelReleaseStage; v0 = new AICoreModelReleaseStage;();
        String v1 = "PREVIEW";
        // const/4 v2, 0x1
        // DIRECT <init>(Ljava/lang/String;I)V
        // STATIC $values()[Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;
        // move-result-object v0
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;
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
        // "Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelReleaseStage static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelReleaseStage[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;
        return v0;
    }
}