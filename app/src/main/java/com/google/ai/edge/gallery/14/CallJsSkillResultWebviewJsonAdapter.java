// Class: final Lcom.google.ai.edge.gallery.common.CallJsSkillResultWebviewJsonAdapter
// Access: public
class CallJsSkillResultWebviewJsonAdapter extends Lcom/squareup/moshi/JsonAdapter {

    // Fields:
    private final com.squareup.moshi.JsonAdapter nullableBooleanAdapter;
    private final com.squareup.moshi.JsonAdapter nullableFloatAdapter;
    private final com.squareup.moshi.JsonAdapter nullableStringAdapter;
    private final com.squareup.moshi.JsonReader$Options options;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebviewJsonAdapter;->$stable:I
        return ;
    }
    public void constructor <init>(com.squareup.moshi.Moshi) {
        String v0 = "moshi";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // const/4 v0, 0x3
        // new-array v0, v0, [Ljava/lang/String;
        // const/4 v1, 0x0
        String v2 = "url";
        // aput-object v2, v0, v1
        // const/4 v1, 0x1
        String v3 = "iframe";
        // aput-object v3, v0, v1
        // const/4 v1, 0x2
        String v4 = "aspectRatio";
        // aput-object v4, v0, v1
        // STATIC of([Ljava/lang/String;)Lcom/squareup/moshi/JsonReader$Options;
        // move-result-object v0
        String v1 = "of(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // const-class v0, Ljava/lang/String;
        // check-cast v0, Ljava/lang/reflect/Type;
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultWebview fromJson(com.squareup.moshi.JsonReader) {
        String v0 = "reader";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v0, 0x0
        // const/4 v1, 0x0
        // const/4 v2, 0x0
        // VIRTUAL beginObject()V
        // VIRTUAL hasNext()Z
        // move-result v3
        // if-eqz v3, :cond_0
        // VIRTUAL selectName(Lcom/squareup/moshi/JsonReader$Options;)I
        // move-result v3
        // packed-switch v3, :pswitch_data_0
        // goto :goto_1
        // VIRTUAL fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
        // move-result-object v3
        // move-object v2, v3
        // check-cast v2, Ljava/lang/Float;
        // goto :goto_0
        // VIRTUAL fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
        // move-result-object v3
        // ... (truncated)
    }
    public java.lang.Object bridge synthetic fromJson(com.squareup.moshi.JsonReader) {
        // VIRTUAL fromJson(Lcom/squareup/moshi/JsonReader;)Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;
        // move-result-object v0
        return v0;
    }
    public void toJson(com.squareup.moshi.JsonWriter, com.google.ai.edge.gallery.common.CallJsSkillResultWebview) {
        String v0 = "writer";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // if-eqz p2, :cond_0
        // VIRTUAL beginObject()Lcom/squareup/moshi/JsonWriter;
        String v0 = "url";
        // VIRTUAL name(Ljava/lang/String;)Lcom/squareup/moshi/JsonWriter;
        // VIRTUAL getUrl()Ljava/lang/String;
        // move-result-object v1
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V
        String v0 = "iframe";
        // VIRTUAL name(Ljava/lang/String;)Lcom/squareup/moshi/JsonWriter;
        // VIRTUAL getIframe()Ljava/lang/Boolean;
        // move-result-object v1
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V
        String v0 = "aspectRatio";
        // VIRTUAL name(Ljava/lang/String;)Lcom/squareup/moshi/JsonWriter;
        // VIRTUAL getAspectRatio()Ljava/lang/Float;
        // move-result-object v1
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V
        // VIRTUAL endObject()Lcom/squareup/moshi/JsonWriter;
        // ... (truncated)
    }
    public void bridge synthetic toJson(com.squareup.moshi.JsonWriter, java.lang.Object) {
        // move-object v0, p2
        // check-cast v0, Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;)V
        return ;
    }
    public java.lang.String toString() {
        StringBuilder; v0 = new StringBuilder;();
        // const/16 v1, 0x2e
        // DIRECT <init>(I)V
        // move-object v1, v0
        // const/4 v2, 0x0
        String v3 = "GeneratedJsonAdapter(";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        String v4 = "CallJsSkillResultWebview";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // const/16 v4, 0x29
        // VIRTUAL append(C)Ljava/lang/StringBuilder;
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}