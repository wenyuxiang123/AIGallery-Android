// Class: final Lcom.google.ai.edge.gallery.data.SocModelFile
// Access: public
class SocModelFile extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String commitHash;
    private final java.lang.String modelFile;
    private final java.lang.Long sizeInBytes;
    private final java.lang.String url;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long) {
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->modelFile:Ljava/lang/String;
        // iput-object p2, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->url:Ljava/lang/String;
        // iput-object p3, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->commitHash:Ljava/lang/String;
        // iput-object p4, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->sizeInBytes:Ljava/lang/Long;
        return ;
    }
    public com.google.ai.edge.gallery.data.SocModelFile static synthetic copy$default(com.google.ai.edge.gallery.data.SocModelFile, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, int, java.lang.Object) {
        // and-int/lit8 p6, p5, 0x1
        // if-eqz p6, :cond_0
        // iget-object p1, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->modelFile:Ljava/lang/String;
        // and-int/lit8 p6, p5, 0x2
        // if-eqz p6, :cond_1
        // iget-object p2, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->url:Ljava/lang/String;
        // and-int/lit8 p6, p5, 0x4
        // if-eqz p6, :cond_2
        // iget-object p3, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->commitHash:Ljava/lang/String;
        // and-int/lit8 p5, p5, 0x8
        // if-eqz p5, :cond_3
        // iget-object p4, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->sizeInBytes:Ljava/lang/Long;
        // VIRTUAL copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/ai/edge/gallery/data/SocModelFile;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->modelFile:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->url:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component3() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->commitHash:Ljava/lang/String;
        return v0;
    }
    public java.lang.Long final component4() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->sizeInBytes:Ljava/lang/Long;
        return v0;
    }
    public com.google.ai.edge.gallery.data.SocModelFile final copy(java.lang.String, java.lang.String, java.lang.String, java.lang.Long) {
        SocModelFile; v0 = new SocModelFile;();
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/SocModelFile;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/SocModelFile;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->modelFile:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/SocModelFile;->modelFile:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->url:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/SocModelFile;->url:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        // ... (truncated)
    }
    public java.lang.String final getCommitHash() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->commitHash:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getModelFile() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->modelFile:Ljava/lang/String;
        return v0;
    }
    public java.lang.Long final getSizeInBytes() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->sizeInBytes:Ljava/lang/Long;
        return v0;
    }
    public java.lang.String final getUrl() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->url:Ljava/lang/String;
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->modelFile:Ljava/lang/String;
        // const/4 v1, 0x0
        // if-nez v0, :cond_0
        // move v0, v1
        // goto :goto_0
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->modelFile:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v2, v0, 0x1f
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->url:Ljava/lang/String;
        // if-nez v3, :cond_1
        // move v3, v1
        // goto :goto_1
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->url:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v3
        // add-int/2addr v2, v3
        // mul-int/lit8 v0, v2, 0x1f
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->commitHash:Ljava/lang/String;
        // if-nez v3, :cond_2
        // ... (truncated)
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->modelFile:Ljava/lang/String;
        // iget-object v1, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->url:Ljava/lang/String;
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->commitHash:Ljava/lang/String;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/SocModelFile;->sizeInBytes:Ljava/lang/Long;
        StringBuilder; v4 = new StringBuilder;();
        // DIRECT <init>()V
        String v5 = "SocModelFile(modelFile=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v4
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v4 = ", url=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", commitHash=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // ... (truncated)
    }
}