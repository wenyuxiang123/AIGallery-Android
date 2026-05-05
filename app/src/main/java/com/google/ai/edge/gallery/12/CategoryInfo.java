// Class: final Lcom.google.ai.edge.gallery.data.CategoryInfo
// Access: public
class CategoryInfo extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String id;
    private final java.lang.String label;
    private final java.lang.Integer labelStringRes;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.Integer, java.lang.String) {
        String v0 = "id";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->id:Ljava/lang/String;
        // iput-object p3, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->label:Ljava/lang/String;
        return ;
    }
    public void synthetic constructor <init>(java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p5, p4, 0x2
        // const/4 v0, 0x0
        // if-eqz p5, :cond_0
        // move-object p2, v0
        // and-int/lit8 p4, p4, 0x4
        // if-eqz p4, :cond_1
        // move-object p3, v0
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V
        return ;
    }
    public com.google.ai.edge.gallery.data.CategoryInfo static synthetic copy$default(com.google.ai.edge.gallery.data.CategoryInfo, java.lang.String, java.lang.Integer, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p5, p4, 0x1
        // if-eqz p5, :cond_0
        // iget-object p1, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->id:Ljava/lang/String;
        // and-int/lit8 p5, p4, 0x2
        // if-eqz p5, :cond_1
        // and-int/lit8 p4, p4, 0x4
        // if-eqz p4, :cond_2
        // iget-object p3, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->label:Ljava/lang/String;
        // VIRTUAL copy(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/google/ai/edge/gallery/data/CategoryInfo;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->id:Ljava/lang/String;
        return v0;
    }
    public java.lang.Integer final component2() {
        return v0;
    }
    public java.lang.String final component3() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->label:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.CategoryInfo final copy(java.lang.String, java.lang.Integer, java.lang.String) {
        String v0 = "id";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        CategoryInfo; v0 = new CategoryInfo;();
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/CategoryInfo;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/CategoryInfo;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->id:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/CategoryInfo;->id:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->label:Ljava/lang/String;
        // ... (truncated)
    }
    public java.lang.String final getId() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->id:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getLabel() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->label:Ljava/lang/String;
        return v0;
    }
    public java.lang.Integer final getLabelStringRes() {
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->id:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // const/4 v3, 0x0
        // if-nez v2, :cond_0
        // move v2, v3
        // goto :goto_0
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->label:Ljava/lang/String;
        // if-nez v2, :cond_1
        // goto :goto_1
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->label:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v3
        // add-int/2addr v0, v3
        return v0;
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->id:Ljava/lang/String;
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/CategoryInfo;->label:Ljava/lang/String;
        StringBuilder; v3 = new StringBuilder;();
        // DIRECT <init>()V
        String v4 = "CategoryInfo(id=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v3 = ", labelStringRes=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", label=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // ... (truncated)
    }
}