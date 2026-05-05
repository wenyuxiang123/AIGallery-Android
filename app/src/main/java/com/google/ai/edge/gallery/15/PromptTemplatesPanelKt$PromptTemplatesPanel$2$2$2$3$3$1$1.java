// Class: Lcom.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplatesPanelKt$PromptTemplatesPanel$2$2$2$3$3$1$1
// Access: final
class PromptTemplatesPanelKt$PromptTemplatesPanel$2$2$2$3$3$1$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(androidx.compose.ui.platform.Clipboard, androidx.compose.runtime.State, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Landroidx/compose/ui/platform/Clipboard;",
        // "Landroidx/compose/runtime/State<",
        // "Landroidx/compose/ui/text/AnnotatedString;",
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
        PromptTemplatesPanelKt$PromptTemplatesPanel$2$2$2$3$3$1$1; v0 = new PromptTemplatesPanelKt$PromptTemplatesPanel$2$2$2$3$3$1$1;();
        // DIRECT <init>(Landroidx/compose/ui/platform/Clipboard;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V
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
        // move-result-object v0
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // check-cast v0, Landroidx/compose/ui/platform/ClipEntry;
        // check-cast v1, Landroid/content/ClipData;
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // goto :goto_0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        String v1 = "prompt";
        // check-cast v1, Ljava/lang/CharSequence;
        // STATIC access$PromptTemplatesPanel$lambda$12(Landroidx/compose/runtime/State;)Landroidx/compose/ui/text/AnnotatedString;
        // move-result-object v2
        // check-cast v2, Ljava/lang/CharSequence;
        // STATIC newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;
        // move-result-object v1
        ClipEntry; v2 = new ClipEntry;();
        // ... (truncated)
    }
}