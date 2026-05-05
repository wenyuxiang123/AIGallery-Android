// Class: final Lcom.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel
// Access: public
class LlmSingleTurnViewModel extends Landroidx/lifecycle/ViewModel {

    // Fields:
    private final kotlinx.coroutines.flow.MutableStateFlow _uiState;
    private final kotlinx.coroutines.flow.StateFlow uiState;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel;->$stable:I
        return ;
    }
    public void constructor <init>() {
        // DIRECT <init>()V
        // DIRECT createUiState()Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;
        // move-result-object v0
        // STATIC MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
        // move-result-object v0
        // STATIC asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;
        // move-result-object v0
        return ;
    }
    private com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnUiState final createUiState() {
        LinkedHashMap; v0 = new LinkedHashMap;();
        // DIRECT <init>()V
        // check-cast v0, Ljava/util/Map;
        LlmSingleTurnUiState; v8 = new LlmSingleTurnUiState;();
        // const/16 v6, 0xb
        // const/4 v7, 0x0
        // const/4 v2, 0x0
        // const/4 v3, 0x0
        // const/4 v5, 0x0
        // move-object v1, v8
        // move-object v4, v0
        return v8;
    }
    public void final generateResponse(com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, java.lang.String) {
        String v0 = "task";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "input";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // move-object v0, p0
        // check-cast v0, Landroidx/lifecycle/ViewModel;
        // STATIC getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;
        // move-result-object v1
        // STATIC getDefault()Lkotlinx/coroutines/CoroutineDispatcher;
        // move-result-object v0
        // move-object v2, v0
        // check-cast v2, Lkotlin/coroutines/CoroutineContext;
        LlmSingleTurnViewModel$generateResponse$1; v0 = new LlmSingleTurnViewModel$generateResponse$1;();
        // const/4 v8, 0x0
        // move-object v3, v0
        // move-object v4, p0
        // move-object v5, p2
        // move-object v6, p1
        // ... (truncated)
    }
    public kotlinx.coroutines.flow.StateFlow final getUiState() {
        // value = {
        // "()",
        // "Lkotlinx/coroutines/flow/StateFlow<",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;",
        // ">;"
        // }
        return v0;
    }
    public void final selectPromptTemplate(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType) {
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "promptTemplateType";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getLabel()Ljava/lang/String;
        // move-result-object v0
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "selecting prompt template: ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        String v1 = "AGLlmSingleTurnVM";
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // VIRTUAL updateResponse(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;Ljava/lang/String;)V
        // const/4 v1, 0x0
        // nop
        // ... (truncated)
    }
    public void final setInProgress(boolean) {
        // const/4 v1, 0x0
        // nop
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v2
        // move-object v3, v2
        // check-cast v3, Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;
        // const/4 v4, 0x0
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v5
        // move-object v6, v5
        // check-cast v6, Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;
        // const/16 v11, 0xe
        // const/4 v12, 0x0
        // const/4 v8, 0x0
        // const/4 v9, 0x0
        // const/4 v10, 0x0
        // move v7, p1
        // move-result-object v3
        // nop
        // INTERFACE compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z
        // ... (truncated)
    }
    public void final setPreparing(boolean) {
        // const/4 v1, 0x0
        // nop
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v2
        // move-object v3, v2
        // check-cast v3, Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;
        // const/4 v4, 0x0
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v5
        // move-object v6, v5
        // check-cast v6, Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;
        // const/16 v11, 0xd
        // const/4 v12, 0x0
        // const/4 v7, 0x0
        // const/4 v9, 0x0
        // const/4 v10, 0x0
        // move v8, p1
        // move-result-object v3
        // nop
        // INTERFACE compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z
        // ... (truncated)
    }
    public void final stopResponse(com.google.ai.edge.gallery.data.Model) {
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v0
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "Stopping response for model ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = "...";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        String v1 = "AGLlmSingleTurnVM";
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // move-object v0, p0
        // check-cast v0, Landroidx/lifecycle/ViewModel;
        // ... (truncated)
    }
    public void final updateResponse(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType, java.lang.String) {
        // move-object/from16 v0, p3
        String v1 = "model";
        // move-object/from16 v2, p1
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v1 = "promptTemplateType";
        // move-object/from16 v3, p2
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v1 = "response";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // move-object/from16 v1, p0
        // const/4 v5, 0x0
        // nop
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v6
        // move-object v14, v6
        // check-cast v14, Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;
        // const/4 v15, 0x0
        // VIRTUAL getResponsesByModel()Ljava/util/Map;
        // move-result-object v13
        // move-result-object v7
        // ... (truncated)
    }
}