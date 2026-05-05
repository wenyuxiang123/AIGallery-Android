// Class: final Lcom.google.ai.edge.gallery.data.AllowedSkill
// Access: public
class AllowedSkill extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String attributionLabel;
    private final java.lang.String attributionUrl;
    private final java.lang.String description;
    private final java.lang.String name;
    private final java.lang.String skillUrl;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) {
        String v0 = "name";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "description";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "skillUrl";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->name:Ljava/lang/String;
        // iput-object p2, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->description:Ljava/lang/String;
        // iput-object p3, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->skillUrl:Ljava/lang/String;
        return ;
    }
    public void synthetic constructor <init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p7, p6, 0x8
        // const/4 v0, 0x0
        // if-eqz p7, :cond_0
        // move-object v5, v0
        // goto :goto_0
        // move-object v5, p4
        // and-int/lit8 p4, p6, 0x10
        // if-eqz p4, :cond_1
        // move-object v6, v0
        // goto :goto_1
        // move-object v6, p5
        // move-object v1, p0
        // move-object v2, p1
        // move-object v3, p2
        // move-object v4, p3
        return ;
    }
    public com.google.ai.edge.gallery.data.AllowedSkill static synthetic copy$default(com.google.ai.edge.gallery.data.AllowedSkill, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p7, p6, 0x1
        // if-eqz p7, :cond_0
        // iget-object p1, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->name:Ljava/lang/String;
        // and-int/lit8 p7, p6, 0x2
        // if-eqz p7, :cond_1
        // iget-object p2, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->description:Ljava/lang/String;
        // move-object p7, p2
        // and-int/lit8 p2, p6, 0x4
        // if-eqz p2, :cond_2
        // iget-object p3, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->skillUrl:Ljava/lang/String;
        // move-object v0, p3
        // and-int/lit8 p2, p6, 0x8
        // if-eqz p2, :cond_3
        // move-object v1, p4
        // and-int/lit8 p2, p6, 0x10
        // if-eqz p2, :cond_4
        // move-object v2, p5
        // move-object p2, p0
        // move-object p3, p1
        // move-object p4, p7
        // ... (truncated)
    }
    public java.lang.String final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->name:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->description:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component3() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->skillUrl:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component4() {
        return v0;
    }
    public java.lang.String final component5() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.AllowedSkill final copy(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) {
        String v0 = "name";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "description";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "skillUrl";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        AllowedSkill; v0 = new AllowedSkill;();
        // move-object v1, v0
        // move-object v2, p1
        // move-object v3, p2
        // move-object v4, p3
        // move-object v5, p4
        // move-object v6, p5
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/AllowedSkill;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/AllowedSkill;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->name:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/AllowedSkill;->name:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->description:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/AllowedSkill;->description:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        // ... (truncated)
    }
    public java.lang.String final getAttributionLabel() {
        return v0;
    }
    public java.lang.String final getAttributionUrl() {
        return v0;
    }
    public java.lang.String final getDescription() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->description:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getName() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->name:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getSkillUrl() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->skillUrl:Ljava/lang/String;
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->name:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->description:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->skillUrl:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v0, v2
        // mul-int/lit8 v1, v0, 0x1f
        // const/4 v3, 0x0
        // if-nez v2, :cond_0
        // move v2, v3
        // goto :goto_0
        // VIRTUAL hashCode()I
        // move-result v2
        // ... (truncated)
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->name:Ljava/lang/String;
        // iget-object v1, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->description:Ljava/lang/String;
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/AllowedSkill;->skillUrl:Ljava/lang/String;
        StringBuilder; v5 = new StringBuilder;();
        // DIRECT <init>()V
        String v6 = "AllowedSkill(name=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v5
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v5 = ", description=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", skillUrl=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
}