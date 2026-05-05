// Class: Lcom.google.ai.edge.gallery.common.UtilsKt$clearFocusOnKeyboardDismiss$1$1$1
// Access: final
class UtilsKt$clearFocusOnKeyboardDismiss$1$1$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(boolean, androidx.compose.ui.focus.FocusManager, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation) {
        // value = {
        // "(Z",
        // "Landroidx/compose/ui/focus/FocusManager;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Boolean;",
        // ">;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/common/UtilsKt$clearFocusOnKeyboardDismiss$1$1$1;",
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
        UtilsKt$clearFocusOnKeyboardDismiss$1$1$1; v0 = new UtilsKt$clearFocusOnKeyboardDismiss$1$1$1;();
        // DIRECT <init>(ZLandroidx/compose/ui/focus/FocusManager;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
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
        // check-cast v0, Lcom/google/ai/edge/gallery/common/UtilsKt$clearFocusOnKeyboardDismiss$1$1$1;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // iget v0, p0, Lcom/google/ai/edge/gallery/common/UtilsKt$clearFocusOnKeyboardDismiss$1$1$1;->label:I
        // packed-switch v0, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // const/4 v1, 0x1
        // if-eqz v0, :cond_0
        // STATIC access$clearFocusOnKeyboardDismiss$lambda$13$lambda$9(Landroidx/compose/runtime/MutableState;Z)V
        // goto :goto_0
        // STATIC access$clearFocusOnKeyboardDismiss$lambda$13$lambda$8(Landroidx/compose/runtime/MutableState;)Z
        // move-result v0
        // if-eqz v0, :cond_1
        // const/4 v2, 0x0
        // const/4 v3, 0x0
        // STATIC clearFocus$default(Landroidx/compose/ui/focus/FocusManager;ZILjava/lang/Object;)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
}