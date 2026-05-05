// Class: final Lcom.google.ai.edge.gallery.data.ModelDownloadStatus
// Access: public
class ModelDownloadStatus extends Ljava/lang/Object {

    // Fields:
    private final long bytesPerSecond;
    private final java.lang.String errorMessage;
    private final long receivedBytes;
    private final long remainingMs;
    private final com.google.ai.edge.gallery.data.ModelDownloadStatusType status;
    private final long totalBytes;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(com.google.ai.edge.gallery.data.ModelDownloadStatusType, long, long, java.lang.String, long, long) {
        String v0 = "status";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "errorMessage";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-wide p2, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->totalBytes:J
        // iput-wide p4, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->receivedBytes:J
        // iput-wide p7, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->bytesPerSecond:J
        // iput-wide p9, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->remainingMs:J
        return ;
    }
    public void synthetic constructor <init>(com.google.ai.edge.gallery.data.ModelDownloadStatusType, long, long, java.lang.String, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 v0, p11, 0x2
        // const-wide/16 v1, 0x0
        // if-eqz v0, :cond_0
        // move-wide v3, v1
        // goto :goto_0
        // move-wide v3, p2
        // and-int/lit8 v0, p11, 0x4
        // if-eqz v0, :cond_1
        // move-wide v5, v1
        // goto :goto_1
        // move-wide v5, p4
        // and-int/lit8 v0, p11, 0x8
        // if-eqz v0, :cond_2
        // goto :goto_2
        // move-object/from16 v0, p6
        // and-int/lit8 v7, p11, 0x10
        // if-eqz v7, :cond_3
        // move-wide v7, v1
        // goto :goto_3
        // move-wide/from16 v7, p7
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.ModelDownloadStatus static synthetic copy$default(com.google.ai.edge.gallery.data.ModelDownloadStatus, com.google.ai.edge.gallery.data.ModelDownloadStatusType, long, long, java.lang.String, long, long, int, java.lang.Object) {
        // move-object v0, p0
        // and-int/lit8 v1, p11, 0x1
        // if-eqz v1, :cond_0
        // goto :goto_0
        // move-object v1, p1
        // and-int/lit8 v2, p11, 0x2
        // if-eqz v2, :cond_1
        // iget-wide v2, v0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->totalBytes:J
        // goto :goto_1
        // move-wide v2, p2
        // and-int/lit8 v4, p11, 0x4
        // if-eqz v4, :cond_2
        // iget-wide v4, v0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->receivedBytes:J
        // goto :goto_2
        // move-wide v4, p4
        // and-int/lit8 v6, p11, 0x8
        // if-eqz v6, :cond_3
        // goto :goto_3
        // move-object/from16 v6, p6
        // and-int/lit8 v7, p11, 0x10
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.ModelDownloadStatusType final component1() {
        return v0;
    }
    public long final component2() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->totalBytes:J
        return v0;
    }
    public long final component3() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->receivedBytes:J
        return v0;
    }
    public java.lang.String final component4() {
        return v0;
    }
    public long final component5() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->bytesPerSecond:J
        return v0;
    }
    public long final component6() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->remainingMs:J
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelDownloadStatus final copy(com.google.ai.edge.gallery.data.ModelDownloadStatusType, long, long, java.lang.String, long, long) {
        String v0 = "status";
        // move-object v12, p1
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "errorMessage";
        // move-object/from16 v13, p6
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        ModelDownloadStatus; v0 = new ModelDownloadStatus;();
        // move-object v1, v0
        // move-object v2, p1
        // move-wide/from16 v3, p2
        // move-wide/from16 v5, p4
        // move-object/from16 v7, p6
        // move-wide/from16 v8, p7
        // move-wide/from16 v10, p9
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;
        // if-eq v3, v4, :cond_2
        return v2;
        // iget-wide v3, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->totalBytes:J
        // iget-wide v5, v1, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->totalBytes:J
        // cmp-long v3, v3, v5
        // if-eqz v3, :cond_3
        return v2;
        // iget-wide v3, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->receivedBytes:J
        // iget-wide v5, v1, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->receivedBytes:J
        // cmp-long v3, v3, v5
        // if-eqz v3, :cond_4
        // ... (truncated)
    }
    public long final getBytesPerSecond() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->bytesPerSecond:J
        return v0;
    }
    public java.lang.String final getErrorMessage() {
        return v0;
    }
    public long final getReceivedBytes() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->receivedBytes:J
        return v0;
    }
    public long final getRemainingMs() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->remainingMs:J
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelDownloadStatusType final getStatus() {
        return v0;
    }
    public long final getTotalBytes() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->totalBytes:J
        return v0;
    }
    public int hashCode() {
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget-wide v2, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->totalBytes:J
        // STATIC hashCode(J)I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-wide v2, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->receivedBytes:J
        // STATIC hashCode(J)I
        // move-result v2
        // add-int/2addr v0, v2
        // mul-int/lit8 v1, v0, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-wide v2, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->bytesPerSecond:J
        // STATIC hashCode(J)I
        // move-result v2
        // ... (truncated)
    }
    public java.lang.String toString() {
        // iget-wide v1, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->totalBytes:J
        // iget-wide v3, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->receivedBytes:J
        // iget-wide v6, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->bytesPerSecond:J
        // iget-wide v8, p0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;->remainingMs:J
        StringBuilder; v10 = new StringBuilder;();
        // DIRECT <init>()V
        String v11 = "ModelDownloadStatus(status=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v10
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v10 = ", totalBytes=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(J)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", receivedBytes=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(J)Ljava/lang/StringBuilder;
        // ... (truncated)
    }
}