// Class: final Lcom.google.ai.edge.gallery.common.Classification
// Access: public
class Classification extends Ljava/lang/Object {

    // Fields:
    private final long color;
    private final java.lang.String label;
    private final float score;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    private void constructor <init>(java.lang.String, float, long) {
        String v0 = "label";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/common/Classification;->label:Ljava/lang/String;
        // iput p2, p0, Lcom/google/ai/edge/gallery/common/Classification;->score:F
        // iput-wide p3, p0, Lcom/google/ai/edge/gallery/common/Classification;->color:J
        return ;
    }
    public void synthetic constructor <init>(java.lang.String, float, long, kotlin.jvm.internal.DefaultConstructorMarker) {
        // DIRECT <init>(Ljava/lang/String;FJ)V
        return ;
    }
    public com.google.ai.edge.gallery.common.Classification static synthetic copy-mxwnekA$default(com.google.ai.edge.gallery.common.Classification, java.lang.String, float, long, int, java.lang.Object) {
        // and-int/lit8 p6, p5, 0x1
        // if-eqz p6, :cond_0
        // iget-object p1, p0, Lcom/google/ai/edge/gallery/common/Classification;->label:Ljava/lang/String;
        // and-int/lit8 p6, p5, 0x2
        // if-eqz p6, :cond_1
        // iget p2, p0, Lcom/google/ai/edge/gallery/common/Classification;->score:F
        // and-int/lit8 p5, p5, 0x4
        // if-eqz p5, :cond_2
        // iget-wide p3, p0, Lcom/google/ai/edge/gallery/common/Classification;->color:J
        // VIRTUAL copy-mxwnekA(Ljava/lang/String;FJ)Lcom/google/ai/edge/gallery/common/Classification;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/Classification;->label:Ljava/lang/String;
        return v0;
    }
    public float final component2() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/common/Classification;->score:F
        return v0;
    }
    public long final component3-0d7_KjU() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/common/Classification;->color:J
        return v0;
    }
    public com.google.ai.edge.gallery.common.Classification final copy-mxwnekA(java.lang.String, float, long) {
        String v0 = "label";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        Classification; v0 = new Classification;();
        // const/4 v6, 0x0
        // move-object v1, v0
        // move-object v2, p1
        // move v3, p2
        // move-wide v4, p3
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/common/Classification;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/common/Classification;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/common/Classification;->label:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/common/Classification;->label:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget v3, p0, Lcom/google/ai/edge/gallery/common/Classification;->score:F
        // iget v4, v1, Lcom/google/ai/edge/gallery/common/Classification;->score:F
        // STATIC compare(FF)I
        // move-result v3
        // if-eqz v3, :cond_3
        // ... (truncated)
    }
    public long final getColor-0d7_KjU() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/common/Classification;->color:J
        return v0;
    }
    public java.lang.String final getLabel() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/Classification;->label:Ljava/lang/String;
        return v0;
    }
    public float final getScore() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/common/Classification;->score:F
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/Classification;->label:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget v2, p0, Lcom/google/ai/edge/gallery/common/Classification;->score:F
        // STATIC hashCode(F)I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-wide v2, p0, Lcom/google/ai/edge/gallery/common/Classification;->color:J
        // STATIC hashCode-impl(J)I
        // move-result v2
        // add-int/2addr v0, v2
        return v0;
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/Classification;->label:Ljava/lang/String;
        // iget v1, p0, Lcom/google/ai/edge/gallery/common/Classification;->score:F
        // iget-wide v2, p0, Lcom/google/ai/edge/gallery/common/Classification;->color:J
        // STATIC toString-impl(J)Ljava/lang/String;
        // move-result-object v2
        StringBuilder; v3 = new StringBuilder;();
        // DIRECT <init>()V
        String v4 = "Classification(label=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v3 = ", score=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(F)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", color=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
}