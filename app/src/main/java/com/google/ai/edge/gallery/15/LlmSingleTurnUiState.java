// Class: final Lcom.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnUiState
// Access: public
class LlmSingleTurnUiState extends Ljava/lang/Object {

    // Fields:
    private final boolean inProgress;
    private final boolean preparing;
    private final java.util.Map responsesByModel;
    private final com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType selectedPromptTemplateType;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;->$stable:I
        return ;
    }
    public void constructor <init>(boolean, boolean, java.util.Map, com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType) {
        // value = {
        // "(ZZ",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "+",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;>;",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;",
        // ")V"
        // }
        String v0 = "responsesByModel";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "selectedPromptTemplateType";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        return ;
    }
    public void synthetic constructor <init>(boolean, boolean, java.util.Map, com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p6, p5, 0x1
        // const/4 v0, 0x0
        // if-eqz p6, :cond_0
        // move p1, v0
        // and-int/lit8 p6, p5, 0x2
        // if-eqz p6, :cond_1
        // move p2, v0
        // and-int/lit8 p5, p5, 0x8
        // if-eqz p5, :cond_2
        // STATIC getEntries()Lkotlin/enums/EnumEntries;
        // move-result-object p4
        // INTERFACE get(I)Ljava/lang/Object;
        // move-result-object p4
        // check-cast p4, Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;
        // DIRECT <init>(ZZLjava/util/Map;Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;)V
        return ;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnUiState static synthetic copy$default(com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnUiState, boolean, boolean, java.util.Map, com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType, int, java.lang.Object) {
        // and-int/lit8 p6, p5, 0x1
        // if-eqz p6, :cond_0
        // and-int/lit8 p6, p5, 0x2
        // if-eqz p6, :cond_1
        // and-int/lit8 p6, p5, 0x4
        // if-eqz p6, :cond_2
        // and-int/lit8 p5, p5, 0x8
        // if-eqz p5, :cond_3
        // VIRTUAL copy(ZZLjava/util/Map;Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;)Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;
        // move-result-object p0
        return p0;
    }
    public boolean final component1() {
        return v0;
    }
    public boolean final component2() {
        return v0;
    }
    public java.util.Map final component3() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;>;"
        // }
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType final component4() {
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnUiState final copy(boolean, boolean, java.util.Map, com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType) {
        // value = {
        // "(ZZ",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "+",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;>;",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;",
        // ")",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;"
        // }
        String v0 = "responsesByModel";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "selectedPromptTemplateType";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        LlmSingleTurnUiState; v0 = new LlmSingleTurnUiState;();
        // DIRECT <init>(ZZLjava/util/Map;Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;
        // if-eq v3, v4, :cond_2
        return v2;
        // if-eq v3, v4, :cond_3
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_4
        return v2;
        // if-eq v3, v1, :cond_5
        return v2;
        return v0;
    }
    public boolean final getInProgress() {
        return v0;
    }
    public boolean final getPreparing() {
        return v0;
    }
    public java.util.Map final getResponsesByModel() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;>;"
        // }
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType final getSelectedPromptTemplateType() {
        return v0;
    }
    public int hashCode() {
        // STATIC hashCode(Z)I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // STATIC hashCode(Z)I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v0, v2
        // mul-int/lit8 v1, v0, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        return v1;
    }
    public java.lang.String toString() {
        StringBuilder; v4 = new StringBuilder;();
        // DIRECT <init>()V
        String v5 = "LlmSingleTurnUiState(inProgress=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v4
        // VIRTUAL append(Z)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v4 = ", preparing=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Z)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", responsesByModel=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", selectedPromptTemplateType=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
}