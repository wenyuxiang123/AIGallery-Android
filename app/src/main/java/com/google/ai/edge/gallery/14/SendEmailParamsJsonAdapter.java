// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.SendEmailParamsJsonAdapter
// Access: public
class SendEmailParamsJsonAdapter extends Lcom/squareup/moshi/JsonAdapter {

    // Fields:
    private final com.squareup.moshi.JsonReader$Options options;
    private final com.squareup.moshi.JsonAdapter stringAdapter;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParamsJsonAdapter;->$stable:I
        return ;
    }
    public void constructor <init>(com.squareup.moshi.Moshi) {
        String v0 = "moshi";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // const/4 v0, 0x3
        // new-array v0, v0, [Ljava/lang/String;
        // const/4 v1, 0x0
        String v2 = "extra_email";
        // aput-object v2, v0, v1
        // const/4 v1, 0x1
        String v3 = "extra_subject";
        // aput-object v3, v0, v1
        String v1 = "extra_text";
        // const/4 v3, 0x2
        // aput-object v1, v0, v3
        // STATIC of([Ljava/lang/String;)Lcom/squareup/moshi/JsonReader$Options;
        // move-result-object v0
        String v1 = "of(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // const-class v0, Ljava/lang/String;
        // check-cast v0, Ljava/lang/reflect/Type;
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.SendEmailParams fromJson(com.squareup.moshi.JsonReader) {
        String v0 = "reader";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v0, 0x0
        // const/4 v1, 0x0
        // const/4 v2, 0x0
        // VIRTUAL beginObject()V
        // VIRTUAL hasNext()Z
        // move-result v3
        String v4 = "extra_text";
        String v5 = "extra_subject";
        String v6 = "extra_email";
        // if-eqz v3, :cond_3
        // VIRTUAL selectName(Lcom/squareup/moshi/JsonReader$Options;)I
        // move-result v3
        // packed-switch v3, :pswitch_data_0
        // goto :goto_1
        // VIRTUAL fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
        // move-result-object v3
        // check-cast v3, Ljava/lang/String;
        // if-eqz v3, :cond_0
        // ... (truncated)
    }
    public java.lang.Object bridge synthetic fromJson(com.squareup.moshi.JsonReader) {
        // VIRTUAL fromJson(Lcom/squareup/moshi/JsonReader;)Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParams;
        // move-result-object v0
        return v0;
    }
    public void toJson(com.squareup.moshi.JsonWriter, com.google.ai.edge.gallery.customtasks.agentchat.SendEmailParams) {
        String v0 = "writer";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // if-eqz p2, :cond_0
        // VIRTUAL beginObject()Lcom/squareup/moshi/JsonWriter;
        String v0 = "extra_email";
        // VIRTUAL name(Ljava/lang/String;)Lcom/squareup/moshi/JsonWriter;
        // VIRTUAL getExtra_email()Ljava/lang/String;
        // move-result-object v1
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V
        String v0 = "extra_subject";
        // VIRTUAL name(Ljava/lang/String;)Lcom/squareup/moshi/JsonWriter;
        // VIRTUAL getExtra_subject()Ljava/lang/String;
        // move-result-object v1
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V
        String v0 = "extra_text";
        // VIRTUAL name(Ljava/lang/String;)Lcom/squareup/moshi/JsonWriter;
        // VIRTUAL getExtra_text()Ljava/lang/String;
        // move-result-object v1
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V
        // VIRTUAL endObject()Lcom/squareup/moshi/JsonWriter;
        // ... (truncated)
    }
    public void bridge synthetic toJson(com.squareup.moshi.JsonWriter, java.lang.Object) {
        // move-object v0, p2
        // check-cast v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParams;
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParams;)V
        return ;
    }
    public java.lang.String toString() {
        StringBuilder; v0 = new StringBuilder;();
        // const/16 v1, 0x25
        // DIRECT <init>(I)V
        // move-object v1, v0
        // const/4 v2, 0x0
        String v3 = "GeneratedJsonAdapter(";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        String v4 = "SendEmailParams";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // const/16 v4, 0x29
        // VIRTUAL append(C)Ljava/lang/StringBuilder;
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}