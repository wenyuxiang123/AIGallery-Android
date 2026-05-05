// Class: final Lcom.google.ai.edge.gallery.data.AGWorkInfo
// Access: public
class AGWorkInfo extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String modelName;
    private final java.lang.String taskId;
    private final java.lang.String workId;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, java.lang.String) {
        String v0 = "taskId";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "modelName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "workId";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->taskId:Ljava/lang/String;
        // iput-object p2, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->modelName:Ljava/lang/String;
        // iput-object p3, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->workId:Ljava/lang/String;
        return ;
    }
    public com.google.ai.edge.gallery.data.AGWorkInfo static synthetic copy$default(com.google.ai.edge.gallery.data.AGWorkInfo, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p5, p4, 0x1
        // if-eqz p5, :cond_0
        // iget-object p1, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->taskId:Ljava/lang/String;
        // and-int/lit8 p5, p4, 0x2
        // if-eqz p5, :cond_1
        // iget-object p2, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->modelName:Ljava/lang/String;
        // and-int/lit8 p4, p4, 0x4
        // if-eqz p4, :cond_2
        // iget-object p3, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->workId:Ljava/lang/String;
        // VIRTUAL copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/gallery/data/AGWorkInfo;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->taskId:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->modelName:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component3() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->workId:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.AGWorkInfo final copy(java.lang.String, java.lang.String, java.lang.String) {
        String v0 = "taskId";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "modelName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "workId";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        AGWorkInfo; v0 = new AGWorkInfo;();
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/AGWorkInfo;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/AGWorkInfo;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->taskId:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->taskId:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->modelName:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->modelName:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        // ... (truncated)
    }
    public java.lang.String final getModelName() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->modelName:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getTaskId() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->taskId:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getWorkId() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->workId:Ljava/lang/String;
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->taskId:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->modelName:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->workId:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v0, v2
        return v0;
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->taskId:Ljava/lang/String;
        // iget-object v1, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->modelName:Ljava/lang/String;
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/AGWorkInfo;->workId:Ljava/lang/String;
        StringBuilder; v3 = new StringBuilder;();
        // DIRECT <init>()V
        String v4 = "AGWorkInfo(taskId=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v3 = ", modelName=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", workId=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
}