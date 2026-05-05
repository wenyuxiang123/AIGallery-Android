// Class: final Lcom.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateConfig
// Access: public
class PromptTemplateConfig extends Ljava/lang/Object {

    // Fields:
    private final java.util.List inputEditors;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateConfig;->$stable:I
        return ;
    }
    public void constructor <init>() {
        // const/4 v0, 0x0
        // const/4 v1, 0x1
        // DIRECT <init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        return ;
    }
    public void constructor <init>(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditor;",
        // ">;)V"
        // }
        String v0 = "inputEditors";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        return ;
    }
    public void synthetic constructor <init>(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p2, p2, 0x1
        // if-eqz p2, :cond_0
        // STATIC emptyList()Ljava/util/List;
        // move-result-object p1
        // DIRECT <init>(Ljava/util/List;)V
        return ;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateConfig static synthetic copy$default(com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateConfig, java.util.List, int, java.lang.Object) {
        // and-int/lit8 p2, p2, 0x1
        // if-eqz p2, :cond_0
        // VIRTUAL copy(Ljava/util/List;)Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateConfig;
        // move-result-object p0
        return p0;
    }
    public java.util.List final component1() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditor;",
        // ">;"
        // }
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateConfig final copy(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditor;",
        // ">;)",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateConfig;"
        // }
        String v0 = "inputEditors";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        PromptTemplateConfig; v0 = new PromptTemplateConfig;();
        // DIRECT <init>(Ljava/util/List;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateConfig;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateConfig;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_2
        return v2;
        return v0;
    }
    public java.util.List final getInputEditors() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditor;",
        // ">;"
        // }
        return v0;
    }
    public int hashCode() {
        // VIRTUAL hashCode()I
        // move-result v0
        return v0;
    }
    public java.lang.String toString() {
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "PromptTemplateConfig(inputEditors=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}