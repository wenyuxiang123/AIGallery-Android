// Class: final Lcom.google.ai.edge.gallery.common.CallJsSkillResultImageJsonAdapter
// Access: public
class CallJsSkillResultImageJsonAdapter extends Lcom/squareup/moshi/JsonAdapter {

    // Fields:
    private final com.squareup.moshi.JsonAdapter nullableStringAdapter;
    private final com.squareup.moshi.JsonReader$Options options;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/common/CallJsSkillResultImageJsonAdapter;->$stable:I
        return ;
    }
    public void constructor <init>(com.squareup.moshi.Moshi) {
        String v0 = "moshi";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // const/4 v0, 0x1
        // new-array v0, v0, [Ljava/lang/String;
        // const/4 v1, 0x0
        String v2 = "base64";
        // aput-object v2, v0, v1
        // STATIC of([Ljava/lang/String;)Lcom/squareup/moshi/JsonReader$Options;
        // move-result-object v0
        String v1 = "of(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // const-class v0, Ljava/lang/String;
        // check-cast v0, Ljava/lang/reflect/Type;
        // STATIC emptySet()Ljava/util/Set;
        // move-result-object v1
        // VIRTUAL adapter(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;
        // move-result-object v0
        String v1 = "adapter(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.common.CallJsSkillResultImage fromJson(com.squareup.moshi.JsonReader) {
        String v0 = "reader";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v0, 0x0
        // VIRTUAL beginObject()V
        // VIRTUAL hasNext()Z
        // move-result v1
        // if-eqz v1, :cond_0
        // VIRTUAL selectName(Lcom/squareup/moshi/JsonReader$Options;)I
        // move-result v1
        // packed-switch v1, :pswitch_data_0
        // goto :goto_1
        // VIRTUAL fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
        // move-result-object v1
        // move-object v0, v1
        // check-cast v0, Ljava/lang/String;
        // goto :goto_0
        // VIRTUAL skipName()V
        // VIRTUAL skipValue()V
        // goto :goto_0
        // VIRTUAL endObject()V
        // ... (truncated)
    }
    public java.lang.Object bridge synthetic fromJson(com.squareup.moshi.JsonReader) {
        // VIRTUAL fromJson(Lcom/squareup/moshi/JsonReader;)Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;
        // move-result-object v0
        return v0;
    }
    public void toJson(com.squareup.moshi.JsonWriter, com.google.ai.edge.gallery.common.CallJsSkillResultImage) {
        String v0 = "writer";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // if-eqz p2, :cond_0
        // VIRTUAL beginObject()Lcom/squareup/moshi/JsonWriter;
        String v0 = "base64";
        // VIRTUAL name(Ljava/lang/String;)Lcom/squareup/moshi/JsonWriter;
        // VIRTUAL getBase64()Ljava/lang/String;
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
        // check-cast v0, Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;
        // VIRTUAL toJson(Lcom/squareup/moshi/JsonWriter;Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;)V
        return ;
    }
    public java.lang.String toString() {
        StringBuilder; v0 = new StringBuilder;();
        // const/16 v1, 0x2c
        // DIRECT <init>(I)V
        // move-object v1, v0
        // const/4 v2, 0x0
        String v3 = "GeneratedJsonAdapter(";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        String v4 = "CallJsSkillResultImage";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // const/16 v4, 0x29
        // VIRTUAL append(C)Ljava/lang/StringBuilder;
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}