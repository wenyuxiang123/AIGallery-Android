// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkillScriptsContent$1
// Access: final
class SkillManagerViewModel$loadSkillScriptsContent$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.proto.Skill, com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/proto/Skill;",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;",
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
        SkillManagerViewModel$loadSkillScriptsContent$1; v0 = new SkillManagerViewModel$loadSkillScriptsContent$1;();
        // DIRECT <init>(Lcom/google/ai/edge/gallery/proto/Skill;Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
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
        // move-object/from16 v1, p0
        String v2 = " for skill ";
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v3
        // packed-switch v0, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // check-cast v0, Ljava/util/Map;
        // check-cast v2, Ljava/io/File;
        // check-cast v3, Ljava/io/File;
        // goto/16 :goto_4
        // check-cast v0, Ljava/io/File;
        // check-cast v2, Ljava/io/File;
        // goto/16 :goto_6
        // goto :goto_1
        // VIRTUAL getImportDirName()Ljava/lang/String;
        // move-result-object v0
        String v4 = "getImportDirName(...)";
        // ... (truncated)
    }
}