// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$2$1$1$2$1$1$1
// Access: final
class GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$2$1$1$2$1$1$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(java.lang.String, androidx.compose.ui.platform.Clipboard, kotlin.jvm.functions.Function1, androidx.compose.material3.SheetState, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Landroidx/compose/ui/platform/Clipboard;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Landroidx/compose/material3/SheetState;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
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
        GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$2$1$1$2$1$1$1; v7 = new GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$2$1$1$2$1$1$1;();
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
        // move-result-object v0
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // check-cast v0, Landroidx/compose/ui/platform/ClipEntry;
        // check-cast v1, Landroid/content/ClipData;
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // goto :goto_1
        // check-cast v1, Landroidx/compose/ui/platform/ClipEntry;
        // check-cast v2, Landroid/content/ClipData;
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // goto :goto_0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        String v1 = "prompt";
        // check-cast v1, Ljava/lang/CharSequence;
        // check-cast v2, Ljava/lang/CharSequence;
        // STATIC newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;
        // ... (truncated)
    }
}