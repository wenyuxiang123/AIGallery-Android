// Class: final Lcom.google.ai.edge.gallery.data.ModelAllowlist
// Access: public
class ModelAllowlist extends Ljava/lang/Object {

    // Fields:
    private final com.google.ai.edge.gallery.data.DeviceRequirements aicoreRequirements;
    private final java.util.List models;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/ModelAllowlist;->$stable:I
        return ;
    }
    public void constructor <init>(java.util.List, com.google.ai.edge.gallery.data.DeviceRequirements) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedModel;",
        // ">;",
        // "Lcom/google/ai/edge/gallery/data/DeviceRequirements;",
        // ")V"
        // }
        String v0 = "models";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/ModelAllowlist;->models:Ljava/util/List;
        return ;
    }
    public void synthetic constructor <init>(java.util.List, com.google.ai.edge.gallery.data.DeviceRequirements, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_0
        // const/4 p2, 0x0
        // DIRECT <init>(Ljava/util/List;Lcom/google/ai/edge/gallery/data/DeviceRequirements;)V
        return ;
    }
    public com.google.ai.edge.gallery.data.ModelAllowlist static synthetic copy$default(com.google.ai.edge.gallery.data.ModelAllowlist, java.util.List, com.google.ai.edge.gallery.data.DeviceRequirements, int, java.lang.Object) {
        // and-int/lit8 p4, p3, 0x1
        // if-eqz p4, :cond_0
        // iget-object p1, p0, Lcom/google/ai/edge/gallery/data/ModelAllowlist;->models:Ljava/util/List;
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_1
        // VIRTUAL copy(Ljava/util/List;Lcom/google/ai/edge/gallery/data/DeviceRequirements;)Lcom/google/ai/edge/gallery/data/ModelAllowlist;
        // move-result-object p0
        return p0;
    }
    public java.util.List final component1() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedModel;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ModelAllowlist;->models:Ljava/util/List;
        return v0;
    }
    public com.google.ai.edge.gallery.data.DeviceRequirements final component2() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelAllowlist final copy(java.util.List, com.google.ai.edge.gallery.data.DeviceRequirements) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedModel;",
        // ">;",
        // "Lcom/google/ai/edge/gallery/data/DeviceRequirements;",
        // ")",
        // "Lcom/google/ai/edge/gallery/data/ModelAllowlist;"
        // }
        String v0 = "models";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        ModelAllowlist; v0 = new ModelAllowlist;();
        // DIRECT <init>(Ljava/util/List;Lcom/google/ai/edge/gallery/data/DeviceRequirements;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/ModelAllowlist;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/ModelAllowlist;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/ModelAllowlist;->models:Ljava/util/List;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/ModelAllowlist;->models:Ljava/util/List;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_3
        return v2;
        return v0;
    }
    public com.google.ai.edge.gallery.data.DeviceRequirements final getAicoreRequirements() {
        return v0;
    }
    public java.util.List final getModels() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedModel;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ModelAllowlist;->models:Ljava/util/List;
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ModelAllowlist;->models:Ljava/util/List;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // if-nez v2, :cond_0
        // const/4 v2, 0x0
        // goto :goto_0
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        return v1;
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ModelAllowlist;->models:Ljava/util/List;
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        String v3 = "ModelAllowlist(models=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v2
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v2 = ", aicoreRequirements=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}