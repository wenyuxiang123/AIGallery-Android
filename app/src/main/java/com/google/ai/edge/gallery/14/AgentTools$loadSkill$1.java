// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.AgentTools$loadSkill$1
// Access: final
class AgentTools$loadSkill$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.customtasks.agentchat.AgentTools, java.lang.String, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;",
        // "Ljava/lang/String;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools$loadSkill$1;",
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
        AgentTools$loadSkill$1; v0 = new AgentTools$loadSkill$1;();
        // DIRECT <init>(Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
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
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;>;)",
        // "Ljava/lang/Object;"
        // }
        // VIRTUAL create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools$loadSkill$1;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // move-object/from16 v0, p0
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v1
        // iget v2, v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools$loadSkill$1;->label:I
        // const/4 v3, 0x1
        // const/4 v4, 0x2
        // packed-switch v2, :pswitch_data_0
        IllegalStateException; v1 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v1
        // check-cast v1, Ljava/lang/String;
        // check-cast v2, Lcom/google/ai/edge/gallery/proto/Skill;
        // check-cast v5, Ljava/util/List;
        // goto/16 :goto_3
        // check-cast v1, Ljava/lang/String;
        // check-cast v2, Lcom/google/ai/edge/gallery/proto/Skill;
        // check-cast v5, Ljava/util/List;
        // goto/16 :goto_2
        // VIRTUAL getSkillManagerViewModel()Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;
        // ... (truncated)
    }
}