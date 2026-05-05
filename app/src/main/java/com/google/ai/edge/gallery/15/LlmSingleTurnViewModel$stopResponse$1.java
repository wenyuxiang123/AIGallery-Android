// Class: Lcom.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel$stopResponse$1
// Access: final
class LlmSingleTurnViewModel$stopResponse$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel, com.google.ai.edge.gallery.data.Model, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel$stopResponse$1;",
        // ">;)V"
        // }
        // const/4 v0, 0x2
        // DIRECT <init>(ILkotlin/coroutines/Continuation;)V
        return ;
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
        LlmSingleTurnViewModel$stopResponse$1; v0 = new LlmSingleTurnViewModel$stopResponse$1;();
        // DIRECT <init>(Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel;Lcom/google/ai/edge/gallery/data/Model;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/coroutines/Continuation;
        return v0;
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
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel$stopResponse$1;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // packed-switch v0, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // const/4 v1, 0x0
        // VIRTUAL setInProgress(Z)V
        // STATIC getRuntimeHelper(Lcom/google/ai/edge/gallery/data/Model;)Lcom/google/ai/edge/gallery/runtime/LlmModelHelper;
        // move-result-object v0
        // INTERFACE stopResponse(Lcom/google/ai/edge/gallery/data/Model;)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
        // nop
    }
}