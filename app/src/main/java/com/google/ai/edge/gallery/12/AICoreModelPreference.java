// Class: final enum Lcom.google.ai.edge.gallery.data.AICoreModelPreference
// Access: public
class AICoreModelPreference extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.data.AICoreModelPreference FAST;
    public static final enum com.google.ai.edge.gallery.data.AICoreModelPreference FULL;

    // Methods:
    private com.google.ai.edge.gallery.data.AICoreModelPreference[] static final synthetic $values() {
        // v0 = FAST:Lcom/google/ai/edge/gallery/data/AICoreModelPreference;
        // v1 = FULL:Lcom/google/ai/edge/gallery/data/AICoreModelPreference;
        // filled-new-array {v0, v1}, [Lcom/google/ai/edge/gallery/data/AICoreModelPreference;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        AICoreModelPreference; v0 = new AICoreModelPreference;();
        String v1 = "FAST";
        // const/4 v2, 0x0
        // DIRECT <init>(Ljava/lang/String;I)V
        AICoreModelPreference; v0 = new AICoreModelPreference;();
        String v1 = "FULL";
        // const/4 v2, 0x1
        // DIRECT <init>(Ljava/lang/String;I)V
        // STATIC $values()[Lcom/google/ai/edge/gallery/data/AICoreModelPreference;
        // move-result-object v0
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/AICoreModelPreference;
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
        // "Lcom/google/ai/edge/gallery/data/AICoreModelPreference;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelPreference static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/data/AICoreModelPreference;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/AICoreModelPreference;
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelPreference[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/AICoreModelPreference;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/data/AICoreModelPreference;
        return v0;
    }
}