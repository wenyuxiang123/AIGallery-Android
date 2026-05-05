// Class: final Lcom.google.ai.edge.gallery.common.CallJsSkillResultImage
// Access: public
class CallJsSkillResultImage extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String base64;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String) {
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultImage static synthetic copy$default(com.google.ai.edge.gallery.common.CallJsSkillResultImage, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p2, p2, 0x1
        // if-eqz p2, :cond_0
        // VIRTUAL copy(Ljava/lang/String;)Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        return v0;
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultImage final copy(java.lang.String) {
        CallJsSkillResultImage; v0 = new CallJsSkillResultImage;();
        // DIRECT <init>(Ljava/lang/String;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_2
        return v2;
        return v0;
    }
    public java.lang.String final getBase64() {
        return v0;
    }
    public int hashCode() {
        // if-nez v0, :cond_0
        // const/4 v0, 0x0
        // goto :goto_0
        // VIRTUAL hashCode()I
        // move-result v0
        return v0;
    }
    public java.lang.String toString() {
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "CallJsSkillResultImage(base64=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
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