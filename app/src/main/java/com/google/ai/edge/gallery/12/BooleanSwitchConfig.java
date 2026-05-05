// Class: final Lcom.google.ai.edge.gallery.data.BooleanSwitchConfig
// Access: public
class BooleanSwitchConfig extends Lcom/google/ai/edge/gallery/data/Config {

    // Fields:
    private final boolean defaultValue;
    private final com.google.ai.edge.gallery.data.ConfigKey key;
    private final boolean needReinitialization;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/BooleanSwitchConfig;->$stable:I
        return ;
    }
    public void constructor <init>(com.google.ai.edge.gallery.data.ConfigKey, boolean, boolean) {
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // nop
        // v2 = BOOLEAN_SWITCH:Lcom/google/ai/edge/gallery/data/ConfigEditorType;
        // nop
        // STATIC valueOf(Z)Ljava/lang/Boolean;
        // move-result-object v4
        // v5 = BOOLEAN:Lcom/google/ai/edge/gallery/data/ValueType;
        // const/16 v7, 0x10
        // const/4 v8, 0x0
        // const/4 v6, 0x0
        // move-object v1, p0
        // move-object v3, p1
        // iput-boolean p2, p0, Lcom/google/ai/edge/gallery/data/BooleanSwitchConfig;->defaultValue:Z
        // iput-boolean p3, p0, Lcom/google/ai/edge/gallery/data/BooleanSwitchConfig;->needReinitialization:Z
        return ;
    }
    public void synthetic constructor <init>(com.google.ai.edge.gallery.data.ConfigKey, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p4, p4, 0x4
        // if-eqz p4, :cond_0
        // const/4 p3, 0x1
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/ConfigKey;ZZ)V
        return ;
    }
    public java.lang.Boolean getDefaultValue() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/BooleanSwitchConfig;->defaultValue:Z
        // STATIC valueOf(Z)Ljava/lang/Boolean;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic getDefaultValue() {
        // VIRTUAL getDefaultValue()Ljava/lang/Boolean;
        // move-result-object v0
        return v0;
    }
    public com.google.ai.edge.gallery.data.ConfigKey getKey() {
        return v0;
    }
    public boolean getNeedReinitialization() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/BooleanSwitchConfig;->needReinitialization:Z
        return v0;
    }
}