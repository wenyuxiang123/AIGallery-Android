// Class: Lcom.google.ai.edge.gallery.data.Config
// Access: public
class Config extends Ljava/lang/Object {

    // Fields:
    private final java.lang.Object defaultValue;
    private final com.google.ai.edge.gallery.data.ConfigKey key;
    private final boolean needReinitialization;
    private final com.google.ai.edge.gallery.data.ConfigEditorType type;
    private final com.google.ai.edge.gallery.data.ValueType valueType;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/Config;->$stable:I
        return ;
    }
    public void constructor <init>(com.google.ai.edge.gallery.data.ConfigEditorType, com.google.ai.edge.gallery.data.ConfigKey, java.lang.Object, com.google.ai.edge.gallery.data.ValueType, boolean) {
        String v0 = "type";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "defaultValue";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "valueType";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p3, p0, Lcom/google/ai/edge/gallery/data/Config;->defaultValue:Ljava/lang/Object;
        // iput-boolean p5, p0, Lcom/google/ai/edge/gallery/data/Config;->needReinitialization:Z
        return ;
    }
    public void synthetic constructor <init>(com.google.ai.edge.gallery.data.ConfigEditorType, com.google.ai.edge.gallery.data.ConfigKey, java.lang.Object, com.google.ai.edge.gallery.data.ValueType, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p6, p6, 0x10
        // if-eqz p6, :cond_0
        // const/4 p5, 0x1
        // move v5, p5
        // goto :goto_0
        // move v5, p5
        // move-object v0, p0
        // move-object v1, p1
        // move-object v2, p2
        // move-object v3, p3
        // move-object v4, p4
        return ;
    }
    public java.lang.Object getDefaultValue() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Config;->defaultValue:Ljava/lang/Object;
        return v0;
    }
    public com.google.ai.edge.gallery.data.ConfigKey getKey() {
        return v0;
    }
    public boolean getNeedReinitialization() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Config;->needReinitialization:Z
        return v0;
    }
    public com.google.ai.edge.gallery.data.ConfigEditorType final getType() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.ValueType getValueType() {
        return v0;
    }
}