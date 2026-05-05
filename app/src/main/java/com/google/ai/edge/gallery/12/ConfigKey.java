// Class: final Lcom.google.ai.edge.gallery.data.ConfigKey
// Access: public
class ConfigKey extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String id;
    private final java.lang.String label;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String) {
        String v0 = "id";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "label";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->id:Ljava/lang/String;
        // iput-object p2, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->label:Ljava/lang/String;
        return ;
    }
    public com.google.ai.edge.gallery.data.ConfigKey static synthetic copy$default(com.google.ai.edge.gallery.data.ConfigKey, java.lang.String, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p4, p3, 0x1
        // if-eqz p4, :cond_0
        // iget-object p1, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->id:Ljava/lang/String;
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_1
        // iget-object p2, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->label:Ljava/lang/String;
        // VIRTUAL copy(Ljava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/gallery/data/ConfigKey;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->id:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->label:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.ConfigKey final copy(java.lang.String, java.lang.String) {
        String v0 = "id";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "label";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        ConfigKey; v0 = new ConfigKey;();
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/ConfigKey;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/ConfigKey;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->id:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/ConfigKey;->id:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->label:Ljava/lang/String;
        // iget-object v1, v1, Lcom/google/ai/edge/gallery/data/ConfigKey;->label:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_3
        // ... (truncated)
    }
    public java.lang.String final getId() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->id:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getLabel() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->label:Ljava/lang/String;
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->id:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->label:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        return v1;
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->id:Ljava/lang/String;
        // iget-object v1, p0, Lcom/google/ai/edge/gallery/data/ConfigKey;->label:Ljava/lang/String;
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        String v3 = "ConfigKey(id=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v2
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v2 = ", label=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}