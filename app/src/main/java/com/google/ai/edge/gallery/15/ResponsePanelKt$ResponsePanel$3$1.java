// Class: Lcom.google.ai.edge.gallery.ui.llmsingleturn.ResponsePanelKt$ResponsePanel$3$1
// Access: final
class ResponsePanelKt$ResponsePanel$3$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(androidx.compose.foundation.pager.PagerState, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Landroidx/compose/foundation/pager/PagerState;",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/ResponsePanelKt$ResponsePanel$3$1;",
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
        ResponsePanelKt$ResponsePanel$3$1; v0 = new ResponsePanelKt$ResponsePanel$3$1;();
        // DIRECT <init>(Landroidx/compose/foundation/pager/PagerState;Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/data/Model;Lkotlin/coroutines/Continuation;)V
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
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/ResponsePanelKt$ResponsePanel$3$1;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v0
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // goto :goto_0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // VIRTUAL getModels()Ljava/util/List;
        // move-result-object v1
        // INTERFACE indexOf(Ljava/lang/Object;)I
        // move-result v3
        // move-object v6, p0
        // check-cast v6, Lkotlin/coroutines/Continuation;
        // const/4 v1, 0x1
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        // const/4 v7, 0x6
        // ... (truncated)
    }
}