// Class: final Lcom.google.ai.edge.gallery.data.ConfigValue$IntValue
// Access: public
class ConfigValue$IntValue extends Lcom/google/ai/edge/gallery/data/ConfigValue {

    // Fields:
    private final int value;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(int) {
        // const/4 v0, 0x0
        // DIRECT <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        // iput p1, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;->value:I
        return ;
    }
    public com.google.ai.edge.gallery.data.ConfigValue$IntValue static synthetic copy$default(com.google.ai.edge.gallery.data.ConfigValue$IntValue, int, int, java.lang.Object) {
        // and-int/lit8 p2, p2, 0x1
        // if-eqz p2, :cond_0
        // iget p1, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;->value:I
        // VIRTUAL copy(I)Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;
        // move-result-object p0
        return p0;
    }
    public int final component1() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;->value:I
        return v0;
    }
    public com.google.ai.edge.gallery.data.ConfigValue$IntValue final copy(int) {
        ConfigValue$IntValue; v0 = new ConfigValue$IntValue;();
        // DIRECT <init>(I)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;
        // iget v3, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;->value:I
        // iget v1, v1, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;->value:I
        // if-eq v3, v1, :cond_2
        return v2;
        return v0;
    }
    public int final getValue() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;->value:I
        return v0;
    }
    public int hashCode() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;->value:I
        // STATIC hashCode(I)I
        // move-result v0
        return v0;
    }
    public java.lang.String toString() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;->value:I
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "IntValue(value=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL append(I)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}