// Class: final enum Lcom.google.ai.edge.gallery.ui.llmsingleturn.InputEditorLabel
// Access: public
class InputEditorLabel extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.InputEditorLabel LANGUAGE;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.InputEditorLabel STYLE;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.InputEditorLabel TONE;
    private final java.lang.String label;

    // Methods:
    private com.google.ai.edge.gallery.ui.llmsingleturn.InputEditorLabel[] static final synthetic $values() {
        // v0 = TONE:Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // v1 = STYLE:Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // v2 = LANGUAGE:Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // filled-new-array {v0, v1, v2}, [Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        InputEditorLabel; v0 = new InputEditorLabel;();
        // const/4 v1, 0x0
        String v2 = "Tone";
        String v3 = "TONE";
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        InputEditorLabel; v0 = new InputEditorLabel;();
        // const/4 v1, 0x1
        String v2 = "Style";
        String v3 = "STYLE";
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        InputEditorLabel; v0 = new InputEditorLabel;();
        // const/4 v1, 0x2
        String v2 = "Language";
        String v3 = "LANGUAGE";
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        // STATIC $values()[Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // move-result-object v0
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // check-cast v0, [Ljava/lang/Enum;
        // STATIC enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;
        // ... (truncated)
    }
    private void constructor <init>(java.lang.String, int, java.lang.String) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // ")V"
        // }
        // DIRECT <init>(Ljava/lang/String;I)V
        return ;
    }
    public kotlin.enums.EnumEntries static getEntries() {
        // value = {
        // "()",
        // "Lkotlin/enums/EnumEntries<",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.InputEditorLabel static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.InputEditorLabel[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        return v0;
    }
    public java.lang.String final getLabel() {
        return v0;
    }
}