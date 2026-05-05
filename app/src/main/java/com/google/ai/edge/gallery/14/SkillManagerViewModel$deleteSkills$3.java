// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$deleteSkills$3
// Access: final
class SkillManagerViewModel$deleteSkills$3 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(java.util.List, com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, java.util.Set, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/Skill;",
        // ">;",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;",
        // "Ljava/util/Set<",
        // "Ljava/lang/String;",
        // ">;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel$deleteSkills$3;",
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
        SkillManagerViewModel$deleteSkills$3; v0 = new SkillManagerViewModel$deleteSkills$3;();
        // DIRECT <init>(Ljava/util/List;Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;Ljava/util/Set;Lkotlin/coroutines/Continuation;)V
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
        // goto/16 :goto_2
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // INTERFACE iterator()Ljava/util/Iterator;
        // move-result-object v1
        // INTERFACE hasNext()Z
        // move-result v2
        // const/4 v3, 0x1
        // if-eqz v2, :cond_2
        // INTERFACE next()Ljava/lang/Object;
        // move-result-object v2
        // check-cast v2, Lcom/google/ai/edge/gallery/proto/Skill;
        // VIRTUAL getImportDirName()Ljava/lang/String;
        // ... (truncated)
    }
}