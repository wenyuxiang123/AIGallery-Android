// Class: final Lcom.google.ai.edge.gallery.common.CallJsSkillResult
// Access: public
class CallJsSkillResult extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String error;
    private final com.google.ai.edge.gallery.common.CallJsSkillResultImage image;
    private final java.lang.String result;
    private final com.google.ai.edge.gallery.common.CallJsSkillResultWebview webview;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, com.google.ai.edge.gallery.common.CallJsSkillResultImage, com.google.ai.edge.gallery.common.CallJsSkillResultWebview) {
        // DIRECT <init>()V
        // iput-object p2, p0, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;->error:Ljava/lang/String;
        return ;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResult static synthetic copy$default(com.google.ai.edge.gallery.common.CallJsSkillResult, java.lang.String, java.lang.String, com.google.ai.edge.gallery.common.CallJsSkillResultImage, com.google.ai.edge.gallery.common.CallJsSkillResultWebview, int, java.lang.Object) {
        // and-int/lit8 p6, p5, 0x1
        // if-eqz p6, :cond_0
        // and-int/lit8 p6, p5, 0x2
        // if-eqz p6, :cond_1
        // iget-object p2, p0, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;->error:Ljava/lang/String;
        // and-int/lit8 p6, p5, 0x4
        // if-eqz p6, :cond_2
        // and-int/lit8 p5, p5, 0x8
        // if-eqz p5, :cond_3
        // VIRTUAL copy(Ljava/lang/String;Ljava/lang/String;Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;)Lcom/google/ai/edge/gallery/common/CallJsSkillResult;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        return v0;
    }
    public java.lang.String final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;->error:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultImage final component3() {
        return v0;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultWebview final component4() {
        return v0;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResult final copy(java.lang.String, java.lang.String, com.google.ai.edge.gallery.common.CallJsSkillResultImage, com.google.ai.edge.gallery.common.CallJsSkillResultWebview) {
        CallJsSkillResult; v0 = new CallJsSkillResult;();
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;->error:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;->error:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // ... (truncated)
    }
    public java.lang.String final getError() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;->error:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultImage final getImage() {
        return v0;
    }
    public java.lang.String final getResult() {
        return v0;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultWebview final getWebview() {
        return v0;
    }
    public int hashCode() {
        // const/4 v1, 0x0
        // if-nez v0, :cond_0
        // move v0, v1
        // goto :goto_0
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v2, v0, 0x1f
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;->error:Ljava/lang/String;
        // if-nez v3, :cond_1
        // move v3, v1
        // goto :goto_1
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;->error:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v3
        // add-int/2addr v2, v3
        // mul-int/lit8 v0, v2, 0x1f
        // if-nez v3, :cond_2
        // move v3, v1
        // goto :goto_2
        // VIRTUAL hashCode()I
        // ... (truncated)
    }
    public java.lang.String toString() {
        // iget-object v1, p0, Lcom/google/ai/edge/gallery/common/CallJsSkillResult;->error:Ljava/lang/String;
        StringBuilder; v4 = new StringBuilder;();
        // DIRECT <init>()V
        String v5 = "CallJsSkillResult(result=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v4
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v4 = ", error=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", image=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", webview=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // ... (truncated)
    }
}