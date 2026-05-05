// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$CursorTrackingTextField$2$1
// Access: final
class CursorTrackingTextFieldKt$CursorTrackingTextField$2$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(androidx.compose.ui.unit.Density, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, float, androidx.compose.foundation.relocation.BringIntoViewRequester, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Landroidx/compose/ui/unit/Density;",
        // "Lkotlinx/coroutines/CoroutineScope;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Landroidx/compose/ui/text/TextLayoutResult;",
        // ">;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Landroidx/compose/ui/text/input/TextFieldValue;",
        // ">;F",
        // "Landroidx/compose/foundation/relocation/BringIntoViewRequester;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
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
        CursorTrackingTextFieldKt$CursorTrackingTextField$2$1; v8 = new CursorTrackingTextFieldKt$CursorTrackingTextField$2$1;();
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
        // STATIC access$CursorTrackingTextField_f8_ukHw$lambda$5(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/TextLayoutResult;
        // move-result-object v0
        // if-nez v0, :cond_0
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
        // STATIC access$CursorTrackingTextField_f8_ukHw$lambda$2(Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
        // move-result-object v1
        // VIRTUAL getSelection-d9O1mEE()J
        // move-result-wide v1
        // STATIC getStart-impl(J)I
        // move-result v3
        // VIRTUAL getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;
        // move-result-object v4
        // ... (truncated)
    }
}