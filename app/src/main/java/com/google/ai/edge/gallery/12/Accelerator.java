// Class: final enum Lcom.google.ai.edge.gallery.data.Accelerator
// Access: public
class Accelerator extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.data.Accelerator CPU;
    public static final enum com.google.ai.edge.gallery.data.Accelerator GPU;
    public static final enum com.google.ai.edge.gallery.data.Accelerator NPU;
    public static final enum com.google.ai.edge.gallery.data.Accelerator TPU;
    private final java.lang.String label;

    // Methods:
    private com.google.ai.edge.gallery.data.Accelerator[] static final synthetic $values() {
        // v0 = CPU:Lcom/google/ai/edge/gallery/data/Accelerator;
        // v1 = GPU:Lcom/google/ai/edge/gallery/data/Accelerator;
        // v2 = NPU:Lcom/google/ai/edge/gallery/data/Accelerator;
        // v3 = TPU:Lcom/google/ai/edge/gallery/data/Accelerator;
        // filled-new-array {v0, v1, v2, v3}, [Lcom/google/ai/edge/gallery/data/Accelerator;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        Accelerator; v0 = new Accelerator;();
        String v1 = "CPU";
        // const/4 v2, 0x0
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        Accelerator; v0 = new Accelerator;();
        String v1 = "GPU";
        // const/4 v2, 0x1
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        Accelerator; v0 = new Accelerator;();
        String v1 = "NPU";
        // const/4 v2, 0x2
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        Accelerator; v0 = new Accelerator;();
        String v1 = "TPU";
        // const/4 v2, 0x3
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        // STATIC $values()[Lcom/google/ai/edge/gallery/data/Accelerator;
        // move-result-object v0
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/Accelerator;
        // check-cast v0, [Ljava/lang/Enum;
        // ... (truncated)
    }
    private void constructor <init>(java.lang.String, int, java.lang.String) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // ")V"
        // }
        // DIRECT <init>(Ljava/lang/String;I)V
        // iput-object p3, p0, Lcom/google/ai/edge/gallery/data/Accelerator;->label:Ljava/lang/String;
        return ;
    }
    public kotlin.enums.EnumEntries static getEntries() {
        // value = {
        // "()",
        // "Lkotlin/enums/EnumEntries<",
        // "Lcom/google/ai/edge/gallery/data/Accelerator;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.data.Accelerator static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/data/Accelerator;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/Accelerator;
        return v0;
    }
    public com.google.ai.edge.gallery.data.Accelerator[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/Accelerator;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/data/Accelerator;
        return v0;
    }
    public java.lang.String final getLabel() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Accelerator;->label:Ljava/lang/String;
        return v0;
    }
}