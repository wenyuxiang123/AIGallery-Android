// Class: final Lcom.google.ai.edge.gallery.data.DefaultConfig
// Access: public
class DefaultConfig extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String accelerators;
    private final java.lang.Integer maxContextLength;
    private final java.lang.Integer maxTokens;
    private final java.lang.Float temperature;
    private final java.lang.Integer topK;
    private final java.lang.Float topP;
    private final java.lang.String visionAccelerator;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.Integer, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer) {
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topK:Ljava/lang/Integer;
        // iput-object p2, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topP:Ljava/lang/Float;
        // iput-object p3, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->temperature:Ljava/lang/Float;
        // iput-object p7, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->maxTokens:Ljava/lang/Integer;
        return ;
    }
    public com.google.ai.edge.gallery.data.DefaultConfig static synthetic copy$default(com.google.ai.edge.gallery.data.DefaultConfig, java.lang.Integer, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, int, java.lang.Object) {
        // and-int/lit8 p9, p8, 0x1
        // if-eqz p9, :cond_0
        // iget-object p1, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topK:Ljava/lang/Integer;
        // and-int/lit8 p9, p8, 0x2
        // if-eqz p9, :cond_1
        // iget-object p2, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topP:Ljava/lang/Float;
        // move-object p9, p2
        // and-int/lit8 p2, p8, 0x4
        // if-eqz p2, :cond_2
        // iget-object p3, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->temperature:Ljava/lang/Float;
        // move-object v0, p3
        // and-int/lit8 p2, p8, 0x8
        // if-eqz p2, :cond_3
        // move-object v1, p4
        // and-int/lit8 p2, p8, 0x10
        // if-eqz p2, :cond_4
        // move-object v2, p5
        // and-int/lit8 p2, p8, 0x20
        // if-eqz p2, :cond_5
        // move-object v3, p6
        // ... (truncated)
    }
    public java.lang.Integer final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topK:Ljava/lang/Integer;
        return v0;
    }
    public java.lang.Float final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topP:Ljava/lang/Float;
        return v0;
    }
    public java.lang.Float final component3() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->temperature:Ljava/lang/Float;
        return v0;
    }
    public java.lang.String final component4() {
        return v0;
    }
    public java.lang.String final component5() {
        return v0;
    }
    public java.lang.Integer final component6() {
        return v0;
    }
    public java.lang.Integer final component7() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->maxTokens:Ljava/lang/Integer;
        return v0;
    }
    public com.google.ai.edge.gallery.data.DefaultConfig final copy(java.lang.Integer, java.lang.Float, java.lang.Float, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer) {
        DefaultConfig; v8 = new DefaultConfig;();
        // move-object v0, v8
        // move-object v1, p1
        // move-object v2, p2
        // move-object v3, p3
        // move-object v4, p4
        // move-object v5, p5
        // move-object v6, p6
        // move-object/from16 v7, p7
        return v8;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/DefaultConfig;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/DefaultConfig;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topK:Ljava/lang/Integer;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topK:Ljava/lang/Integer;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topP:Ljava/lang/Float;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topP:Ljava/lang/Float;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        // ... (truncated)
    }
    public java.lang.String final getAccelerators() {
        return v0;
    }
    public java.lang.Integer final getMaxContextLength() {
        return v0;
    }
    public java.lang.Integer final getMaxTokens() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->maxTokens:Ljava/lang/Integer;
        return v0;
    }
    public java.lang.Float final getTemperature() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->temperature:Ljava/lang/Float;
        return v0;
    }
    public java.lang.Integer final getTopK() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topK:Ljava/lang/Integer;
        return v0;
    }
    public java.lang.Float final getTopP() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topP:Ljava/lang/Float;
        return v0;
    }
    public java.lang.String final getVisionAccelerator() {
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topK:Ljava/lang/Integer;
        // const/4 v1, 0x0
        // if-nez v0, :cond_0
        // move v0, v1
        // goto :goto_0
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topK:Ljava/lang/Integer;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v2, v0, 0x1f
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topP:Ljava/lang/Float;
        // if-nez v3, :cond_1
        // move v3, v1
        // goto :goto_1
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topP:Ljava/lang/Float;
        // VIRTUAL hashCode()I
        // move-result v3
        // add-int/2addr v2, v3
        // mul-int/lit8 v0, v2, 0x1f
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->temperature:Ljava/lang/Float;
        // if-nez v3, :cond_2
        // ... (truncated)
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topK:Ljava/lang/Integer;
        // iget-object v1, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->topP:Ljava/lang/Float;
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->temperature:Ljava/lang/Float;
        // iget-object v6, p0, Lcom/google/ai/edge/gallery/data/DefaultConfig;->maxTokens:Ljava/lang/Integer;
        StringBuilder; v7 = new StringBuilder;();
        // DIRECT <init>()V
        String v8 = "DefaultConfig(topK=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v7
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v7 = ", topP=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", temperature=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // ... (truncated)
    }
}