// Class: final Lcom.google.ai.edge.gallery.common.SkillTryOutChip
// Access: public
class SkillTryOutChip extends Ljava/lang/Object {

    // Fields:
    private final androidx.compose.ui.graphics.vector.ImageVector icon;
    private final java.lang.String label;
    private final java.lang.String prompt;
    private final java.lang.String skillName;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, java.lang.String) {
        String v0 = "icon";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "label";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "prompt";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "skillName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p2, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->label:Ljava/lang/String;
        // iput-object p3, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->prompt:Ljava/lang/String;
        return ;
    }
    public com.google.ai.edge.gallery.common.SkillTryOutChip static synthetic copy$default(com.google.ai.edge.gallery.common.SkillTryOutChip, androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p6, p5, 0x1
        // if-eqz p6, :cond_0
        // and-int/lit8 p6, p5, 0x2
        // if-eqz p6, :cond_1
        // iget-object p2, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->label:Ljava/lang/String;
        // and-int/lit8 p6, p5, 0x4
        // if-eqz p6, :cond_2
        // iget-object p3, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->prompt:Ljava/lang/String;
        // and-int/lit8 p5, p5, 0x8
        // if-eqz p5, :cond_3
        // VIRTUAL copy(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/gallery/common/SkillTryOutChip;
        // move-result-object p0
        return p0;
    }
    public androidx.compose.ui.graphics.vector.ImageVector final component1() {
        return v0;
    }
    public java.lang.String final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->label:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component3() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->prompt:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component4() {
        return v0;
    }
    public com.google.ai.edge.gallery.common.SkillTryOutChip final copy(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, java.lang.String) {
        String v0 = "icon";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "label";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "prompt";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "skillName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        SkillTryOutChip; v0 = new SkillTryOutChip;();
        // DIRECT <init>(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->label:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->label:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->prompt:Ljava/lang/String;
        // ... (truncated)
    }
    public androidx.compose.ui.graphics.vector.ImageVector final getIcon() {
        return v0;
    }
    public java.lang.String final getLabel() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->label:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getPrompt() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->prompt:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getSkillName() {
        return v0;
    }
    public int hashCode() {
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->label:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->prompt:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v0, v2
        // mul-int/lit8 v1, v0, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        return v1;
    }
    public java.lang.String toString() {
        // iget-object v1, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->label:Ljava/lang/String;
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/common/SkillTryOutChip;->prompt:Ljava/lang/String;
        StringBuilder; v4 = new StringBuilder;();
        // DIRECT <init>()V
        String v5 = "SkillTryOutChip(icon=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v4
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v4 = ", label=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", prompt=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", skillName=";
        // ... (truncated)
    }
}