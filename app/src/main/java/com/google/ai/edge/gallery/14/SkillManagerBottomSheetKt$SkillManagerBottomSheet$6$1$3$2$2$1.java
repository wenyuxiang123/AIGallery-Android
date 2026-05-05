// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1
// Access: final
class SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(androidx.compose.material3.SheetState, kotlin.jvm.functions.Function1, kotlin.jvm.internal.Ref$ObjectRef, com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Landroidx/compose/material3/SheetState;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/Boolean;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/internal/Ref$ObjectRef<",
        // "Ljava/lang/String;",
        // ">;",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;",
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
        SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1; v6 = new SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1;();
        // move-object v0, v6
        // move-object v5, p2
        // check-cast v6, Lkotlin/coroutines/Continuation;
        return v6;
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
        // const/4 v2, 0x1
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v1 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // goto :goto_0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // move-object v3, p0
        // check-cast v3, Lkotlin/coroutines/Continuation;
        // VIRTUAL hide(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v1
        // if-ne v1, v0, :cond_0
        return v0;
        // iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;
        // VIRTUAL getSelectedSkillsNamesAndDescriptions()Ljava/lang/String;
        // move-result-object v3
        // ... (truncated)
    }
}