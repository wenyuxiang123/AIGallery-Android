// Class: final enum Lcom.google.ai.edge.gallery.data.ValueType
// Access: public
class ValueType extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.data.ValueType BOOLEAN;
    public static final enum com.google.ai.edge.gallery.data.ValueType DOUBLE;
    public static final enum com.google.ai.edge.gallery.data.ValueType FLOAT;
    public static final enum com.google.ai.edge.gallery.data.ValueType INT;
    public static final enum com.google.ai.edge.gallery.data.ValueType STRING;

    // Methods:
    private com.google.ai.edge.gallery.data.ValueType[] static final synthetic $values() {
        // v0 = INT:Lcom/google/ai/edge/gallery/data/ValueType;
        // v1 = FLOAT:Lcom/google/ai/edge/gallery/data/ValueType;
        // v2 = DOUBLE:Lcom/google/ai/edge/gallery/data/ValueType;
        // v3 = STRING:Lcom/google/ai/edge/gallery/data/ValueType;
        // v4 = BOOLEAN:Lcom/google/ai/edge/gallery/data/ValueType;
        // filled-new-array {v0, v1, v2, v3, v4}, [Lcom/google/ai/edge/gallery/data/ValueType;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        ValueType; v0 = new ValueType;();
        String v1 = "INT";
        // const/4 v2, 0x0
        // DIRECT <init>(Ljava/lang/String;I)V
        ValueType; v0 = new ValueType;();
        String v1 = "FLOAT";
        // const/4 v2, 0x1
        // DIRECT <init>(Ljava/lang/String;I)V
        ValueType; v0 = new ValueType;();
        String v1 = "DOUBLE";
        // const/4 v2, 0x2
        // DIRECT <init>(Ljava/lang/String;I)V
        ValueType; v0 = new ValueType;();
        String v1 = "STRING";
        // const/4 v2, 0x3
        // DIRECT <init>(Ljava/lang/String;I)V
        ValueType; v0 = new ValueType;();
        String v1 = "BOOLEAN";
        // const/4 v2, 0x4
        // DIRECT <init>(Ljava/lang/String;I)V
        // ... (truncated)
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
        // "Lcom/google/ai/edge/gallery/data/ValueType;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.data.ValueType static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/data/ValueType;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/ValueType;
        return v0;
    }
    public com.google.ai.edge.gallery.data.ValueType[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/ValueType;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/data/ValueType;
        return v0;
    }
}