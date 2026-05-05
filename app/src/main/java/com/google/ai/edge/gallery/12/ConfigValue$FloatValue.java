// Class: final Lcom.google.ai.edge.gallery.data.ConfigValue$FloatValue
// Access: public
class ConfigValue$FloatValue extends Lcom/google/ai/edge/gallery/data/ConfigValue {

    // Fields:
    private final float value;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(float) {
        // const/4 v0, 0x0
        // DIRECT <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        // iput p1, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;->value:F
        return ;
    }
    public com.google.ai.edge.gallery.data.ConfigValue$FloatValue static synthetic copy$default(com.google.ai.edge.gallery.data.ConfigValue$FloatValue, float, int, java.lang.Object) {
        // and-int/lit8 p2, p2, 0x1
        // if-eqz p2, :cond_0
        // iget p1, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;->value:F
        // VIRTUAL copy(F)Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;
        // move-result-object p0
        return p0;
    }
    public float final component1() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;->value:F
        return v0;
    }
    public com.google.ai.edge.gallery.data.ConfigValue$FloatValue final copy(float) {
        ConfigValue$FloatValue; v0 = new ConfigValue$FloatValue;();
        // DIRECT <init>(F)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;
        // iget v3, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;->value:F
        // iget v1, v1, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;->value:F
        // STATIC compare(FF)I
        // move-result v1
        // if-eqz v1, :cond_2
        return v2;
        return v0;
    }
    public float final getValue() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;->value:F
        return v0;
    }
    public int hashCode() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;->value:F
        // STATIC hashCode(F)I
        // move-result v0
        return v0;
    }
    public java.lang.String toString() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;->value:F
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "FloatValue(value=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL append(F)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}