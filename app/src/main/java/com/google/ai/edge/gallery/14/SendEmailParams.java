// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.SendEmailParams
// Access: public
class SendEmailParams extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String extra_email;
    private final java.lang.String extra_subject;
    private final java.lang.String extra_text;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, java.lang.String) {
        String v0 = "extra_email";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "extra_subject";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "extra_text";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.SendEmailParams static synthetic copy$default(com.google.ai.edge.gallery.customtasks.agentchat.SendEmailParams, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p5, p4, 0x1
        // if-eqz p5, :cond_0
        // and-int/lit8 p5, p4, 0x2
        // if-eqz p5, :cond_1
        // and-int/lit8 p4, p4, 0x4
        // if-eqz p4, :cond_2
        // VIRTUAL copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParams;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        return v0;
    }
    public java.lang.String final component2() {
        return v0;
    }
    public java.lang.String final component3() {
        return v0;
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.SendEmailParams final copy(java.lang.String, java.lang.String, java.lang.String) {
        String v0 = "extra_email";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "extra_subject";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "extra_text";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        SendEmailParams; v0 = new SendEmailParams;();
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParams;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParams;
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
    public java.lang.String final getExtra_email() {
        return v0;
    }
    public java.lang.String final getExtra_subject() {
        return v0;
    }
    public java.lang.String final getExtra_text() {
        return v0;
    }
    public int hashCode() {
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v0, v2
        return v0;
    }
    public java.lang.String toString() {
        StringBuilder; v3 = new StringBuilder;();
        // DIRECT <init>()V
        String v4 = "SendEmailParams(extra_email=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v3 = ", extra_subject=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", extra_text=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
}