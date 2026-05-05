// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$7$1$1$1
// Access: final
class AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$7$1$1$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(androidx.compose.material3.SheetState, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
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
        AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$7$1$1$1; v0 = new AddOrEditSkillBottomSheetKt$AddOrEditSkillBottomSheet$7$1$1$1;();
        // DIRECT <init>(Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
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
        // move-object v2, p0
        // check-cast v2, Lkotlin/coroutines/Continuation;
        // const/4 v3, 0x1
        // VIRTUAL hide(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v1
        // if-ne v1, v0, :cond_0
        return v0;
        // INTERFACE invoke()Ljava/lang/Object;
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
        // ... (truncated)
    }
}