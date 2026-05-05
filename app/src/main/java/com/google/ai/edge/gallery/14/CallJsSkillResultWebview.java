// Class: final Lcom.google.ai.edge.gallery.common.CallJsSkillResultWebview
// Access: public
class CallJsSkillResultWebview extends Ljava/lang/Object {

    // Fields:
    private final java.lang.Float aspectRatio;
    private final java.lang.Boolean iframe;
    private final java.lang.String url;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.Boolean, java.lang.Float) {
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultWebview static synthetic copy$default(com.google.ai.edge.gallery.common.CallJsSkillResultWebview, java.lang.String, java.lang.Boolean, java.lang.Float, int, java.lang.Object) {
        // and-int/lit8 p5, p4, 0x1
        // if-eqz p5, :cond_0
        // and-int/lit8 p5, p4, 0x2
        // if-eqz p5, :cond_1
        // and-int/lit8 p4, p4, 0x4
        // if-eqz p4, :cond_2
        // VIRTUAL copy(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;)Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        return v0;
    }
    public java.lang.Boolean final component2() {
        return v0;
    }
    public java.lang.Float final component3() {
        return v0;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultWebview final copy(java.lang.String, java.lang.Boolean, java.lang.Float) {
        CallJsSkillResultWebview; v0 = new CallJsSkillResultWebview;();
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_4
        // ... (truncated)
    }
    public java.lang.Float final getAspectRatio() {
        return v0;
    }
    public java.lang.Boolean final getIframe() {
        return v0;
    }
    public java.lang.String final getUrl() {
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
        // if-nez v3, :cond_1
        // move v3, v1
        // goto :goto_1
        // VIRTUAL hashCode()I
        // move-result v3
        // add-int/2addr v2, v3
        // mul-int/lit8 v0, v2, 0x1f
        // if-nez v3, :cond_2
        // goto :goto_2
        // VIRTUAL hashCode()I
        // move-result v1
        // add-int/2addr v0, v1
        return v0;
    }
    public java.lang.String toString() {
        StringBuilder; v3 = new StringBuilder;();
        // DIRECT <init>()V
        String v4 = "CallJsSkillResultWebview(url=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v3 = ", iframe=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", aspectRatio=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
}