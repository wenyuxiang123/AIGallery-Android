// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$3$1
// Access: final
class SkillManagerBottomSheetKt$SkillManagerBottomSheet$3$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(androidx.compose.foundation.lazy.LazyListState, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Landroidx/compose/foundation/lazy/LazyListState;",
        // "Landroidx/compose/runtime/State<",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;",
        // ">;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Boolean;",
        // ">;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Boolean;",
        // ">;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/String;",
        // ">;",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;",
        // ">;>;",
        // "Landroidx/compose/runtime/MutableState<",
        // ... (truncated)
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
        SkillManagerBottomSheetKt$SkillManagerBottomSheet$3$1; v10 = new SkillManagerBottomSheetKt$SkillManagerBottomSheet$3$1;();
        // move-object v0, v10
        // move-object v9, p2
        // check-cast v10, Lkotlin/coroutines/Continuation;
        return v10;
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
        // move-object/from16 v0, p0
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v1
        // packed-switch v2, :pswitch_data_0
        IllegalStateException; v1 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v1
        // check-cast v1, Ljava/lang/String;
        // goto/16 :goto_9
        // STATIC access$SkillManagerBottomSheet$lambda$0(Landroidx/compose/runtime/State;)Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // move-result-object v2
        // VIRTUAL getLoading()Z
        // move-result v2
        // const/4 v4, 0x1
        // if-nez v2, :cond_4
        // STATIC access$SkillManagerBottomSheet$lambda$48(Landroidx/compose/runtime/MutableState;)Z
        // move-result v2
        // if-nez v2, :cond_4
        // STATIC access$SkillManagerBottomSheet$lambda$0(Landroidx/compose/runtime/State;)Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // ... (truncated)
    }
}