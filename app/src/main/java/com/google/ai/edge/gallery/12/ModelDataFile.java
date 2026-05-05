// Class: final Lcom.google.ai.edge.gallery.data.ModelDataFile
// Access: public
class ModelDataFile extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String downloadFileName;
    private final java.lang.String name;
    private final long sizeInBytes;
    private final java.lang.String url;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, java.lang.String, long) {
        String v0 = "name";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "url";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "downloadFileName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->name:Ljava/lang/String;
        // iput-object p2, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->url:Ljava/lang/String;
        // iput-wide p4, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->sizeInBytes:J
        return ;
    }
    public com.google.ai.edge.gallery.data.ModelDataFile static synthetic copy$default(com.google.ai.edge.gallery.data.ModelDataFile, java.lang.String, java.lang.String, java.lang.String, long, int, java.lang.Object) {
        // and-int/lit8 p7, p6, 0x1
        // if-eqz p7, :cond_0
        // iget-object p1, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->name:Ljava/lang/String;
        // and-int/lit8 p7, p6, 0x2
        // if-eqz p7, :cond_1
        // iget-object p2, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->url:Ljava/lang/String;
        // move-object p7, p2
        // and-int/lit8 p2, p6, 0x4
        // if-eqz p2, :cond_2
        // move-object v0, p3
        // and-int/lit8 p2, p6, 0x8
        // if-eqz p2, :cond_3
        // iget-wide p4, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->sizeInBytes:J
        // move-wide v1, p4
        // move-object p2, p0
        // move-object p3, p1
        // move-object p4, p7
        // move-object p5, v0
        // move-wide p6, v1
        // move-result-object p0
        // ... (truncated)
    }
    public java.lang.String final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->name:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->url:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component3() {
        return v0;
    }
    public long final component4() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->sizeInBytes:J
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelDataFile final copy(java.lang.String, java.lang.String, java.lang.String, long) {
        String v0 = "name";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "url";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "downloadFileName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        ModelDataFile; v0 = new ModelDataFile;();
        // move-object v1, v0
        // move-object v2, p1
        // move-object v3, p2
        // move-object v4, p3
        // move-wide v5, p4
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/ModelDataFile;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/ModelDataFile;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->name:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/ModelDataFile;->name:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->url:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/ModelDataFile;->url:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        // ... (truncated)
    }
    public java.lang.String final getDownloadFileName() {
        return v0;
    }
    public java.lang.String final getName() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->name:Ljava/lang/String;
        return v0;
    }
    public long final getSizeInBytes() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->sizeInBytes:J
        return v0;
    }
    public java.lang.String final getUrl() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->url:Ljava/lang/String;
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->name:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->url:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v0, v2
        // mul-int/lit8 v1, v0, 0x1f
        // iget-wide v2, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->sizeInBytes:J
        // STATIC hashCode(J)I
        // move-result v2
        // add-int/2addr v1, v2
        return v1;
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->name:Ljava/lang/String;
        // iget-object v1, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->url:Ljava/lang/String;
        // iget-wide v3, p0, Lcom/google/ai/edge/gallery/data/ModelDataFile;->sizeInBytes:J
        StringBuilder; v5 = new StringBuilder;();
        // DIRECT <init>()V
        String v6 = "ModelDataFile(name=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v5
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v5 = ", url=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", downloadFileName=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
}