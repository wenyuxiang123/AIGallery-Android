// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel$loadSkills$1
// Access: final
class SkillManagerViewModel$loadSkills$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    public java.lang.CharSequence static synthetic $r8$lambda$TRbga4nrkyh2IIsaxfhFiK2cPZI(com.google.ai.edge.gallery.proto.Skill) {
        // STATIC invokeSuspend$lambda$2(Lcom/google/ai/edge/gallery/proto/Skill;)Ljava/lang/CharSequence;
        // move-result-object p0
        return p0;
    }
    public java.lang.CharSequence static synthetic $r8$lambda$UaxGrx9ySDtwv_oPtcVNtHXNOec(com.google.ai.edge.gallery.proto.Skill) {
        // STATIC invokeSuspend$lambda$3(Lcom/google/ai/edge/gallery/proto/Skill;)Ljava/lang/CharSequence;
        // move-result-object p0
        return p0;
    }
    public java.lang.CharSequence static synthetic $r8$lambda$l4gnLjnOpp5jjDLnQwXkFkL0XCQ(com.google.ai.edge.gallery.proto.Skill) {
        // STATIC invokeSuspend$lambda$8(Lcom/google/ai/edge/gallery/proto/Skill;)Ljava/lang/CharSequence;
        // move-result-object p0
        return p0;
    }
    constructor void <init>(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel$loadSkills$1;",
        // ">;)V"
        // }
        // const/4 v0, 0x2
        // DIRECT <init>(ILkotlin/coroutines/Continuation;)V
        return ;
    }
    private java.lang.CharSequence static final invokeSuspend$lambda$2(com.google.ai.edge.gallery.proto.Skill) {
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v0
        String v1 = "getName(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/CharSequence;
        return v0;
    }
    private java.lang.CharSequence static final invokeSuspend$lambda$3(com.google.ai.edge.gallery.proto.Skill) {
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v0
        String v1 = "getName(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/CharSequence;
        return v0;
    }
    private java.lang.CharSequence static final invokeSuspend$lambda$8(com.google.ai.edge.gallery.proto.Skill) {
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v0
        // VIRTUAL getSelected()Z
        // move-result v1
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v2 = "(";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Z)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        // check-cast v0, Ljava/lang/CharSequence;
        return v0;
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
        SkillManagerViewModel$loadSkills$1; v0 = new SkillManagerViewModel$loadSkills$1;();
        // DIRECT <init>(Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
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
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v2
        // packed-switch v0, :pswitch_data_0
        IllegalStateException; v0 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v0
        // check-cast v0, Ljava/util/List;
        // check-cast v2, Ljava/util/List;
        // check-cast v3, Ljava/util/Map;
        // check-cast v4, Ljava/util/List;
        // check-cast v5, Ljava/util/List;
        // check-cast v6, Ljava/util/List;
        // goto/16 :goto_12
        String v0 = "Loading skills index...";
        String v3 = "AGSkillManagerVM";
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // VIRTUAL getDataStoreRepository()Lcom/google/ai/edge/gallery/data/DataStoreRepository;
        // move-result-object v0
        // ... (truncated)
    }
}