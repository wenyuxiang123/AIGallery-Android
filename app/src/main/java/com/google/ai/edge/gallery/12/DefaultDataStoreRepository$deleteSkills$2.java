// Class: Lcom.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSkills$2
// Access: final
class DefaultDataStoreRepository$deleteSkills$2 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(java.util.Set, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Ljava/util/Set<",
        // "Ljava/lang/String;",
        // ">;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$deleteSkills$2;",
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
        DefaultDataStoreRepository$deleteSkills$2; v0 = new DefaultDataStoreRepository$deleteSkills$2;();
        // DIRECT <init>(Ljava/util/Set;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/coroutines/Continuation;
        return v0;
    }
    public java.lang.Object final invoke(com.google.ai.edge.gallery.proto.Skills, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/proto/Skills;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/proto/Skills;",
        // ">;)",
        // "Ljava/lang/Object;"
        // }
        // VIRTUAL create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$deleteSkills$2;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic invoke(java.lang.Object, java.lang.Object) {
        // check-cast p1, Lcom/google/ai/edge/gallery/proto/Skills;
        // check-cast p2, Lkotlin/coroutines/Continuation;
        // VIRTUAL invoke(Lcom/google/ai/edge/gallery/proto/Skills;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // check-cast v0, Lcom/google/ai/edge/gallery/proto/Skills;
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // iget v1, p0, Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$deleteSkills$2;->label:I
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v1 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v1
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // VIRTUAL getSkillList()Ljava/util/List;
        // move-result-object v1
        String v2 = "getSkillList(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v1, Ljava/lang/Iterable;
        // const/4 v3, 0x0
        ArrayList; v4 = new ArrayList;();
        // DIRECT <init>()V
        // check-cast v4, Ljava/util/Collection;
        // move-object v5, v1
        // const/4 v6, 0x0
        // ... (truncated)
    }
}