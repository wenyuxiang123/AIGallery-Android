// Class: final Lcom.google.ai.edge.gallery.data.NumberSliderConfig
// Access: public
class NumberSliderConfig extends Lcom/google/ai/edge/gallery/data/Config {

    // Fields:
    private final float defaultValue;
    private final com.google.ai.edge.gallery.data.ConfigKey key;
    private final boolean needReinitialization;
    private final float sliderMax;
    private final float sliderMin;
    private final com.google.ai.edge.gallery.data.ValueType valueType;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/NumberSliderConfig;->$stable:I
        return ;
    }
    public void constructor <init>(com.google.ai.edge.gallery.data.ConfigKey, float, float, float, com.google.ai.edge.gallery.data.ValueType, boolean) {
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "valueType";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // nop
        // v2 = NUMBER_SLIDER:Lcom/google/ai/edge/gallery/data/ConfigEditorType;
        // nop
        // STATIC valueOf(F)Ljava/lang/Float;
        // move-result-object v4
        // nop
        // const/16 v7, 0x10
        // const/4 v8, 0x0
        // const/4 v6, 0x0
        // move-object v1, p0
        // move-object v3, p1
        // move-object v5, p5
        // iput p2, p0, Lcom/google/ai/edge/gallery/data/NumberSliderConfig;->sliderMin:F
        // iput p3, p0, Lcom/google/ai/edge/gallery/data/NumberSliderConfig;->sliderMax:F
        // iput p4, p0, Lcom/google/ai/edge/gallery/data/NumberSliderConfig;->defaultValue:F
        // iput-boolean p6, p0, Lcom/google/ai/edge/gallery/data/NumberSliderConfig;->needReinitialization:Z
        // ... (truncated)
    }
    public void synthetic constructor <init>(com.google.ai.edge.gallery.data.ConfigKey, float, float, float, com.google.ai.edge.gallery.data.ValueType, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p7, p7, 0x20
        // if-eqz p7, :cond_0
        // const/4 p6, 0x1
        // move v6, p6
        // goto :goto_0
        // move v6, p6
        // move-object v0, p0
        // move-object v1, p1
        // move v2, p2
        // move v3, p3
        // move v4, p4
        // move-object v5, p5
        return ;
    }
    public java.lang.Float getDefaultValue() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/NumberSliderConfig;->defaultValue:F
        // STATIC valueOf(F)Ljava/lang/Float;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic getDefaultValue() {
        // VIRTUAL getDefaultValue()Ljava/lang/Float;
        // move-result-object v0
        return v0;
    }
    public com.google.ai.edge.gallery.data.ConfigKey getKey() {
        return v0;
    }
    public boolean getNeedReinitialization() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/NumberSliderConfig;->needReinitialization:Z
        return v0;
    }
    public float final getSliderMax() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/NumberSliderConfig;->sliderMax:F
        return v0;
    }
    public float final getSliderMin() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/NumberSliderConfig;->sliderMin:F
        return v0;
    }
    public com.google.ai.edge.gallery.data.ValueType getValueType() {
        return v0;
    }
}