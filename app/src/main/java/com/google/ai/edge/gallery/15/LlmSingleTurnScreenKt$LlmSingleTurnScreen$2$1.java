// Class: Lcom.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$LlmSingleTurnScreen$2$1
// Access: final
class LlmSingleTurnScreenKt$LlmSingleTurnScreen$2$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.data.ModelDownloadStatus, com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, android.content.Context, com.google.ai.edge.gallery.data.Task, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;",
        // "Landroid/content/Context;",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Boolean;",
        // ">;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnScreenKt$LlmSingleTurnScreen$2$1;",
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
        LlmSingleTurnScreenKt$LlmSingleTurnScreen$2$1; v8 = new LlmSingleTurnScreenKt$LlmSingleTurnScreen$2$1;();
        // move-object v0, v8
        // move-object v7, p2
        // check-cast v8, Lkotlin/coroutines/Continuation;
        return v8;
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
        // STATIC access$LlmSingleTurnScreen$lambda$3(Landroidx/compose/runtime/MutableState;)Z
        // move-result v0
        // if-nez v0, :cond_1
        // if-eqz v0, :cond_0
        // VIRTUAL getStatus()Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // move-result-object v0
        // goto :goto_0
        // const/4 v0, 0x0
        // v1 = SUCCEEDED:Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // if-ne v0, v1, :cond_1
        // nop
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v0
        // ... (truncated)
    }
}