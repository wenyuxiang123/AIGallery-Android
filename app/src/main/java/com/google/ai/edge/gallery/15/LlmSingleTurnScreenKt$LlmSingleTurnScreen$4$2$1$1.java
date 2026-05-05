// Class: Lcom.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1
// Access: final
class LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, android.content.Context, com.google.ai.edge.gallery.data.Task, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;",
        // "Landroid/content/Context;",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1;",
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
        LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1; v7 = new LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1;();
        // move-object v0, v7
        // move-object v6, p2
        // check-cast v7, Lkotlin/coroutines/Continuation;
        return v7;
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
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // packed-switch v0, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v0
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v1
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v0
        // if-nez v0, :cond_0
        // const/16 v7, 0x18
        // const/4 v8, 0x0
        // const/4 v5, 0x0
        // const/4 v6, 0x0
        // VIRTUAL selectModel(Lcom/google/ai/edge/gallery/data/Model;)V
        // v0 = INSTANCE:Lkotlin/Unit;
        // ... (truncated)
    }
}