// Class: final Lcom.google.ai.edge.gallery.data.ConfigValueKt
// Access: public
class ConfigValueKt extends Ljava/lang/Object {

    // Methods:
    public float static final getFloatConfigValue(com.google.ai.edge.gallery.data.ConfigValue, float) {
        // if-nez p0, :cond_0
        return p1;
        // nop
        // instance-of v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;
        // if-eqz v0, :cond_1
        // move-object v0, p0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;
        // VIRTUAL getValue()I
        // move-result v0
        // int-to-float v0, v0
        // goto :goto_0
        // instance-of v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;
        // if-eqz v0, :cond_2
        // move-object v0, p0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;
        // VIRTUAL getValue()F
        // move-result v0
        // goto :goto_0
        // instance-of v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$StringValue;
        // if-eqz v0, :cond_3
        // ... (truncated)
    }
    public int static final getIntConfigValue(com.google.ai.edge.gallery.data.ConfigValue, int) {
        // if-nez p0, :cond_0
        return p1;
        // nop
        // instance-of v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;
        // if-eqz v0, :cond_1
        // move-object v0, p0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;
        // VIRTUAL getValue()I
        // move-result v0
        // goto :goto_0
        // instance-of v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;
        // if-eqz v0, :cond_2
        // move-object v0, p0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;
        // VIRTUAL getValue()F
        // move-result v0
        // float-to-int v0, v0
        // goto :goto_0
        // instance-of v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$StringValue;
        // if-eqz v0, :cond_3
        // ... (truncated)
    }
    public java.lang.String static final getStringConfigValue(com.google.ai.edge.gallery.data.ConfigValue, java.lang.String) {
        String v0 = "default";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // if-nez p0, :cond_0
        return p1;
        // nop
        // instance-of v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;
        // if-eqz v0, :cond_1
        // move-object v0, p0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/ConfigValue$IntValue;
        // VIRTUAL getValue()I
        // move-result v0
        // STATIC valueOf(I)Ljava/lang/String;
        // move-result-object v0
        // goto :goto_0
        // instance-of v0, p0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;
        // if-eqz v0, :cond_2
        // move-object v0, p0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/ConfigValue$FloatValue;
        // VIRTUAL getValue()F
        // move-result v0
        // ... (truncated)
    }
}