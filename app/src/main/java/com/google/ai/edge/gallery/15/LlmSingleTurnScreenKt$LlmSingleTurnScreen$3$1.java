// Class: Lcom.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$LlmSingleTurnScreen$3$1
// Access: final
class LlmSingleTurnScreenKt$LlmSingleTurnScreen$3$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatus, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatus;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Boolean;",
        // ">;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnScreenKt$LlmSingleTurnScreen$3$1;",
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
        LlmSingleTurnScreenKt$LlmSingleTurnScreen$3$1; v0 = new LlmSingleTurnScreenKt$LlmSingleTurnScreen$3$1;();
        // DIRECT <init>(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatus;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
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
        // if-eqz v1, :cond_0
        // VIRTUAL getStatus()Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatusType;
        // move-result-object v1
        // goto :goto_0
        // const/4 v1, 0x0
        // v2 = ERROR:Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatusType;
        // if-ne v1, v2, :cond_1
        // const/4 v1, 0x1
        // goto :goto_1
        // const/4 v1, 0x0
        // STATIC access$LlmSingleTurnScreen$lambda$7(Landroidx/compose/runtime/MutableState;Z)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
}