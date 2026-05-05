// Class: final Lcom.google.ai.edge.gallery.data.LabelConfig
// Access: public
class LabelConfig extends Lcom/google/ai/edge/gallery/data/Config {

    // Fields:
    private final java.lang.String defaultValue;
    private final com.google.ai.edge.gallery.data.ConfigKey key;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/LabelConfig;->$stable:I
        return ;
    }
    public void constructor <init>(com.google.ai.edge.gallery.data.ConfigKey, java.lang.String) {
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "defaultValue";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // nop
        // v2 = LABEL:Lcom/google/ai/edge/gallery/data/ConfigEditorType;
        // nop
        // nop
        // v5 = STRING:Lcom/google/ai/edge/gallery/data/ValueType;
        // const/16 v7, 0x10
        // const/4 v8, 0x0
        // const/4 v6, 0x0
        // move-object v1, p0
        // move-object v3, p1
        // move-object v4, p2
        // iput-object p2, p0, Lcom/google/ai/edge/gallery/data/LabelConfig;->defaultValue:Ljava/lang/String;
        return ;
    }
    public void synthetic constructor <init>(com.google.ai.edge.gallery.data.ConfigKey, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/ConfigKey;Ljava/lang/String;)V
        return ;
    }
    public java.lang.Object bridge synthetic getDefaultValue() {
        // VIRTUAL getDefaultValue()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
    public java.lang.String getDefaultValue() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/LabelConfig;->defaultValue:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.ConfigKey getKey() {
        return v0;
    }
}