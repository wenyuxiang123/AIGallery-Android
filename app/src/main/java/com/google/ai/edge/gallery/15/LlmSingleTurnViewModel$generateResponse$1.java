// Class: Lcom.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel$generateResponse$1
// Access: final
class LlmSingleTurnViewModel$generateResponse$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    public kotlin.Unit static synthetic $r8$lambda$E4pC_Md2ueTddEQZZKZ8h0Y24jo(com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel) {
        // STATIC invokeSuspend$lambda$1(Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel;)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    public kotlin.Unit static synthetic $r8$lambda$S0Vlfhjm_QdjLVuyGjTy6GGn3sk(com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel, java.lang.String) {
        // STATIC invokeSuspend$lambda$2(Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel;Ljava/lang/String;)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    public kotlin.Unit static synthetic $r8$lambda$uAKTIb2v30l5OiSZK04DVfNvDT8(kotlin.jvm.internal.Ref$BooleanRef, com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel, kotlin.jvm.internal.Ref$ObjectRef, com.google.ai.edge.gallery.data.Model, java.lang.String, boolean, java.lang.String) {
        // move-result-object p0
        return p0;
    }
    constructor void <init>(com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel, com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.Task, java.lang.String, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Ljava/lang/String;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel$generateResponse$1;",
        // ">;)V"
        // }
        // const/4 v0, 0x2
        // DIRECT <init>(ILkotlin/coroutines/Continuation;)V
        return ;
    }
    private kotlin.Unit static final invokeSuspend$lambda$0(kotlin.jvm.internal.Ref$BooleanRef, com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel, kotlin.jvm.internal.Ref$ObjectRef, com.google.ai.edge.gallery.data.Model, java.lang.String, boolean, java.lang.String) {
        // iget-boolean v0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z
        // const/4 v1, 0x0
        // if-eqz v0, :cond_0
        // VIRTUAL setPreparing(Z)V
        // iput-boolean v1, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z
        // iget-object v0, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        // STATIC processLlmResponse(Ljava/lang/String;)Ljava/lang/String;
        // move-result-object v0
        // iput-object v0, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;
        // nop
        // nop
        // VIRTUAL getUiState()Lkotlinx/coroutines/flow/StateFlow;
        // ... (truncated)
    }
    private kotlin.Unit static final invokeSuspend$lambda$1(com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel) {
        // const/4 v0, 0x0
        // VIRTUAL setPreparing(Z)V
        // VIRTUAL setInProgress(Z)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
    private kotlin.Unit static final invokeSuspend$lambda$2(com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel, java.lang.String) {
        // const/4 p1, 0x0
        // VIRTUAL setPreparing(Z)V
        // VIRTUAL setInProgress(Z)V
        // p1 = INSTANCE:Lkotlin/Unit;
        return p1;
    }
    public kotlin.coroutines.Continuation final create(java.lang.Object, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Ljava/lang/Object;",
        // "Lkotlin/coroutines/Continuation<",
        // "*>;)",
        // "Lkotlin/coroutines/Continuation<",
        // "Lkotlin/Unit;",
        // ">;"
        // }
        LlmSingleTurnViewModel$generateResponse$1; v6 = new LlmSingleTurnViewModel$generateResponse$1;();
        // move-object v0, v6
        // move-object v5, p2
        // check-cast v6, Lkotlin/coroutines/Continuation;
        return v6;
    }
    public java.lang.Object bridge synthetic invoke(java.lang.Object, java.lang.Object) {
        // check-cast p1, Lkotlinx/coroutines/CoroutineScope;
        // check-cast p2, Lkotlin/coroutines/Continuation;
        // VIRTUAL invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lkotlinx/coroutines/CoroutineScope;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lkotlin/Unit;",
        // ">;)",
        // "Ljava/lang/Object;"
        // }
        // VIRTUAL create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
        // move-result-object v0
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // move-object/from16 v0, p0
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v1
        // const/4 v3, 0x1
        // packed-switch v2, :pswitch_data_0
        IllegalStateException; v1 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v1
        // move v6, v1
        // move-object/from16 v1, p1
        // goto/16 :goto_6
        // move-object v2, v1
        // move-object/from16 v1, p1
        // goto :goto_1
        // VIRTUAL setInProgress(Z)V
        // VIRTUAL setPreparing(Z)V
        // move-object v2, v1
        // move-object/from16 v1, p1
        // VIRTUAL getInstance()Ljava/lang/Object;
        // ... (truncated)
    }
}