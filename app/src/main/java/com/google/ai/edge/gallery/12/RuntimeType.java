// Class: final enum Lcom.google.ai.edge.gallery.data.RuntimeType
// Access: public
class RuntimeType extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.data.RuntimeType AICORE;
    public static final enum com.google.ai.edge.gallery.data.RuntimeType LITERT_LM;
    public static final enum com.google.ai.edge.gallery.data.RuntimeType UNKNOWN;

    // Methods:
    private com.google.ai.edge.gallery.data.RuntimeType[] static final synthetic $values() {
        // v0 = UNKNOWN:Lcom/google/ai/edge/gallery/data/RuntimeType;
        // v1 = LITERT_LM:Lcom/google/ai/edge/gallery/data/RuntimeType;
        // v2 = AICORE:Lcom/google/ai/edge/gallery/data/RuntimeType;
        // filled-new-array {v0, v1, v2}, [Lcom/google/ai/edge/gallery/data/RuntimeType;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        RuntimeType; v0 = new RuntimeType;();
        String v1 = "UNKNOWN";
        // const/4 v2, 0x0
        // DIRECT <init>(Ljava/lang/String;I)V
        RuntimeType; v0 = new RuntimeType;();
        String v1 = "LITERT_LM";
        // const/4 v2, 0x1
        // DIRECT <init>(Ljava/lang/String;I)V
        RuntimeType; v0 = new RuntimeType;();
        String v1 = "AICORE";
        // const/4 v2, 0x2
        // DIRECT <init>(Ljava/lang/String;I)V
        // STATIC $values()[Lcom/google/ai/edge/gallery/data/RuntimeType;
        // move-result-object v0
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/RuntimeType;
        // check-cast v0, [Ljava/lang/Enum;
        // STATIC enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
        // move-result-object v0
        // sput-object v0, Lcom/google/ai/edge/gallery/data/RuntimeType;->$ENTRIES:Lkotlin/enums/EnumEntries;
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
        // "Lcom/google/ai/edge/gallery/data/RuntimeType;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.data.RuntimeType static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/data/RuntimeType;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/RuntimeType;
        return v0;
    }
    public com.google.ai.edge.gallery.data.RuntimeType[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/RuntimeType;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/data/RuntimeType;
        return v0;
    }
}