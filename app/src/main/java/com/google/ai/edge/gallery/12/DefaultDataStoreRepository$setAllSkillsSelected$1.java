// Class: Lcom.google.ai.edge.gallery.data.DefaultDataStoreRepository$setAllSkillsSelected$1
// Access: final
class DefaultDataStoreRepository$setAllSkillsSelected$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.data.DefaultDataStoreRepository, boolean, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;",
        // "Z",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$setAllSkillsSelected$1;",
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
        DefaultDataStoreRepository$setAllSkillsSelected$1; v0 = new DefaultDataStoreRepository$setAllSkillsSelected$1;();
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;ZLkotlin/coroutines/Continuation;)V
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
        // "Lcom/google/ai/edge/gallery/proto/Skills;",
        // ">;)",
        // "Ljava/lang/Object;"
        // }
        // VIRTUAL create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$setAllSkillsSelected$1;
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
        // move-object v1, p1
        // goto :goto_0
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // STATIC access$getSkillsDataStore$p(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;)Landroidx/datastore/core/DataStore;
        // move-result-object v1
        DefaultDataStoreRepository$setAllSkillsSelected$1$1; v2 = new DefaultDataStoreRepository$setAllSkillsSelected$1$1;();
        // const/4 v4, 0x0
        // DIRECT <init>(ZLkotlin/coroutines/Continuation;)V
        // check-cast v2, Lkotlin/jvm/functions/Function2;
        // move-object v3, p0
        // check-cast v3, Lkotlin/coroutines/Continuation;
        // const/4 v4, 0x1
        // ... (truncated)
    }
}