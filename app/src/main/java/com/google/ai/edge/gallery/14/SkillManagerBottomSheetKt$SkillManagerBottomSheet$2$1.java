// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$2$1
// Access: final
class SkillManagerBottomSheetKt$SkillManagerBottomSheet$2$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Boolean;",
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
        SkillManagerBottomSheetKt$SkillManagerBottomSheet$2$1; v0 = new SkillManagerBottomSheetKt$SkillManagerBottomSheet$2$1;();
        // DIRECT <init>(Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
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
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // goto :goto_0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // STATIC access$SkillManagerBottomSheet$lambda$64(Landroidx/compose/runtime/MutableState;)Z
        // move-result v1
        // if-eqz v1, :cond_1
        // move-object v1, p0
        // check-cast v1, Lkotlin/coroutines/Continuation;
        // const/4 v2, 0x1
        // const-wide/16 v2, 0xbb8
        // STATIC delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v1
        // if-ne v1, v0, :cond_0
        // ... (truncated)
    }
}