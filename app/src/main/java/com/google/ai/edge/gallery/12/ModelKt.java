// Class: final Lcom.google.ai.edge.gallery.data.ModelKt
// Access: public
class ModelKt extends Ljava/lang/Object {

    // Fields:
    private static final com.google.ai.edge.gallery.data.Model EMPTY_MODEL;
    public static final Ljava/lang/String; = "__imports" IMPORTS_DIR;
    private static final kotlin.text.Regex NORMALIZE_NAME_REGEX;

    // Methods:
    static void constructor <clinit>() {
        Regex; v0 = new Regex;();
        String v1 = "[^a-zA-Z0-9]";
        // DIRECT <init>(Ljava/lang/String;)V
        // sput-object v0, Lcom/google/ai/edge/gallery/data/ModelKt;->NORMALIZE_NAME_REGEX:Lkotlin/text/Regex;
        Model; v0 = new Model;();
        // move-object v2, v0
        // const/16 v53, 0x7fff
        // const/16 v54, 0x0
        String v3 = "empty";
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        // const/4 v6, 0x0
        // const/4 v7, 0x0
        // const/4 v8, 0x0
        // const/4 v9, 0x0
        // const-wide/16 v11, 0x0
        String v13 = "empty.tflite";
        // const/4 v14, 0x0
        // const/4 v15, 0x0
        // const/16 v16, 0x0
        // ... (truncated)
    }
    public kotlin.text.Regex static final synthetic access$getNORMALIZE_NAME_REGEX$p() {
        // v0 = NORMALIZE_NAME_REGEX:Lkotlin/text/Regex;
        return v0;
    }
    public com.google.ai.edge.gallery.data.Model static final getEMPTY_MODEL() {
        // v0 = EMPTY_MODEL:Lcom/google/ai/edge/gallery/data/Model;
        return v0;
    }
}