// Class: final Lcom.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateSingleSelectInputEditor
// Access: public
class PromptTemplateSingleSelectInputEditor extends Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditor {

    // Fields:
    private final java.lang.String defaultOption;
    private final java.lang.String label;
    private final java.util.List options;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        return ;
    }
    public void constructor <init>(java.lang.String, java.util.List, java.lang.String) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;",
        // "Ljava/lang/String;",
        // ")V"
        // }
        String v0 = "label";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "options";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "defaultOption";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // nop
        // nop
        // v0 = SINGLE_SELECT:Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditorType;
        // nop
        // DIRECT <init>(Ljava/lang/String;Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditorType;Ljava/lang/String;)V
        // ... (truncated)
    }
    public void synthetic constructor <init>(java.lang.String, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p5, p4, 0x2
        // if-eqz p5, :cond_0
        // STATIC emptyList()Ljava/util/List;
        // move-result-object p2
        // and-int/lit8 p4, p4, 0x4
        // if-eqz p4, :cond_1
        // DIRECT <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
        return ;
    }
    public java.lang.String getDefaultOption() {
        return v0;
    }
    public java.lang.String getLabel() {
        return v0;
    }
    public java.util.List final getOptions() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        return v0;
    }
}