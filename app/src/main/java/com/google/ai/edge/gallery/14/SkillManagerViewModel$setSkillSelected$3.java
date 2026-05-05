// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$setSkillSelected$3
// Access: final
class SkillManagerViewModel$setSkillSelected$3 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, com.google.ai.edge.gallery.customtasks.agentchat.SkillState, boolean, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;",
        // "Z",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel$setSkillSelected$3;",
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
        SkillManagerViewModel$setSkillSelected$3; v0 = new SkillManagerViewModel$setSkillSelected$3;();
        // DIRECT <init>(Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;ZLkotlin/coroutines/Continuation;)V
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
        // VIRTUAL getDataStoreRepository()Lcom/google/ai/edge/gallery/data/DataStoreRepository;
        // move-result-object v0
        // VIRTUAL getSkill()Lcom/google/ai/edge/gallery/proto/Skill;
        // move-result-object v1
        // INTERFACE setSkillSelected(Lcom/google/ai/edge/gallery/proto/Skill;Z)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
        // nop
    }
}