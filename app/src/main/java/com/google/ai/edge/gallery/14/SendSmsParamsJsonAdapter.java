// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.SendSmsParamsJsonAdapter
// Access: public
class SendSmsParamsJsonAdapter extends Lcom/squareup/moshi/JsonAdapter {

    // Fields:
    private final com.squareup.moshi.JsonReader$Options options;
    private final com.squareup.moshi.JsonAdapter stringAdapter;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/SendSmsParamsJsonAdapter;->$stable:I
        return ;
    }
    public void constructor <init>(com.squareup.moshi.Moshi) {
        String v0 = "moshi";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // const/4 v0, 0x2
        // new-array v0, v0, [Ljava/lang/String;
        // const/4 v1, 0x0
        String v2 = "phone_number";
        // aput-object v2, v0, v1
        // const/4 v1, 0x1
        String v3 = "sms_body";
        // aput-object v3, v0, v1
        // STATIC of([Ljava/lang/String;)Lcom/squareup/moshi/JsonReader$Options;
        // move-result-object v0
        String v1 = "of(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // const-class v0, Ljava/lang/String;
        // check-cast v0, Ljava/lang/reflect/Type;
        // STATIC emptySet()Ljava/util/Set;
        // move-result-object v1
        // nop
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.SendSmsParams fromJson(com.squareup.moshi.JsonReader) {
        String v0 = "reader";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v0, 0x0
        // const/4 v1, 0x0
        // VIRTUAL beginObject()V
        // VIRTUAL hasNext()Z
        // move-result v2
        String v3 = "sms_body";
        String v4 = "phone_number";
        // if-eqz v2, :cond_2
        // VIRTUAL selectName(Lcom/squareup/moshi/JsonReader$Options;)I
        // move-result v2
        // packed-switch v2, :pswitch_data_0
        // goto :goto_1
        // VIRTUAL fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
        // move-result-object v2
        // check-cast v2, Ljava/lang/String;
        // if-eqz v2, :cond_0
        // move-object v1, v2
        // goto :goto_0
        // ... (truncated)
    }
    public java.lang.Object bridge synthetic fromJson(com.squareup.moshi.JsonReader) {
        // VIRTUAL fromJson(Lcom/squareup/moshi/JsonReader;)Lcom/google/ai/edge/gallery/customtasks/agentchat/SendSmsParams;
        // move-result-object v0
        return v0;
    }
    public void toJson(com.squareup.moshi.JsonWriter, com.google.ai.edge.gallery.customtasks.agentchat.SendSmsParams) {
        String v0 = "writer";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // if-eqz p2, :cond_0
        // VIRTUAL beginObject()Lcom/squareup/moshi/JsonWriter;
        String v0 = "phone_number";
        // VIRTUAL name(Ljava/lang/String;)Lcom/squareup/moshi/JsonWriter;
        // VIRTUAL getPhone_number()Ljava/lang/String;
        // move-result-object v1
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V
        String v0 = "sms_body";
        // VIRTUAL name(Ljava/lang/String;)Lcom/squareup/moshi/JsonWriter;
        // VIRTUAL getSms_body()Ljava/lang/String;
        // move-result-object v1
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V
        // VIRTUAL endObject()Lcom/squareup/moshi/JsonWriter;
        return ;
        NullPointerException; v0 = new NullPointerException;();
        String v1 = "value_ was null! Wrap in .nullSafe() to write nullable values.";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
    }
    public void bridge synthetic toJson(com.squareup.moshi.JsonWriter, java.lang.Object) {
        // move-object v0, p2
        // check-cast v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/SendSmsParams;
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Lcom/google/ai/edge/gallery/customtasks/agentchat/SendSmsParams;)V
        return ;
    }
    public java.lang.String toString() {
        StringBuilder; v0 = new StringBuilder;();
        // const/16 v1, 0x23
        // DIRECT <init>(I)V
        // move-object v1, v0
        // const/4 v2, 0x0
        String v3 = "GeneratedJsonAdapter(";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        String v4 = "SendSmsParams";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // const/16 v4, 0x29
        // VIRTUAL append(C)Ljava/lang/StringBuilder;
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}