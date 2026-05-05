// Class: final Lcom.google.ai.edge.gallery.data.BottomSheetSelectorConfig
// Access: public
class BottomSheetSelectorConfig extends Lcom/google/ai/edge/gallery/data/Config {

    // Fields:
    private final java.lang.Integer bottomSheetTitleResId;
    private final java.lang.String defaultValue;
    private final com.google.ai.edge.gallery.data.ConfigKey key;
    private final java.util.List options;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/BottomSheetSelectorConfig;->$stable:I
        return ;
    }
    public void constructor <init>(com.google.ai.edge.gallery.data.ConfigKey, java.lang.String, java.util.List, java.lang.Integer) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/ConfigKey;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/BottomSheetSelectorItem;",
        // ">;",
        // "Ljava/lang/Integer;",
        // ")V"
        // }
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "defaultValue";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "options";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // nop
        // v2 = BOTTOMSHEET_SELECTOR:Lcom/google/ai/edge/gallery/data/ConfigEditorType;
        // nop
        // nop
        // ... (truncated)
    }
    public void synthetic constructor <init>(com.google.ai.edge.gallery.data.ConfigKey, java.lang.String, java.util.List, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p5, p5, 0x8
        // if-eqz p5, :cond_0
        // const/4 p4, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/ConfigKey;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V
        return ;
    }
    public java.lang.Integer final getBottomSheetTitleResId() {
        return v0;
    }
    public java.lang.Object bridge synthetic getDefaultValue() {
        // VIRTUAL getDefaultValue()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
    public java.lang.String getDefaultValue() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.ConfigKey getKey() {
        return v0;
    }
    public java.util.List final getOptions() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/BottomSheetSelectorItem;",
        // ">;"
        // }
        return v0;
    }
}