// Class: Lcom.google.ai.edge.gallery.data.DefaultDataStoreRepository$setCutout$1$1
// Access: final
class DefaultDataStoreRepository$setCutout$1$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(com.google.ai.edge.gallery.proto.Cutout, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/proto/Cutout;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$setCutout$1$1;",
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
        DefaultDataStoreRepository$setCutout$1$1; v0 = new DefaultDataStoreRepository$setCutout$1$1;();
        // DIRECT <init>(Lcom/google/ai/edge/gallery/proto/Cutout;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/coroutines/Continuation;
        return v0;
    }
    public java.lang.Object final invoke(com.google.ai.edge.gallery.proto.CutoutCollection, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // ">;)",
        // "Ljava/lang/Object;"
        // }
        // VIRTUAL create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$setCutout$1$1;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic invoke(java.lang.Object, java.lang.Object) {
        // check-cast p1, Lcom/google/ai/edge/gallery/proto/CutoutCollection;
        // check-cast p2, Lkotlin/coroutines/Continuation;
        // VIRTUAL invoke(Lcom/google/ai/edge/gallery/proto/CutoutCollection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // check-cast v0, Lcom/google/ai/edge/gallery/proto/CutoutCollection;
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // iget v1, p0, Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$setCutout$1$1;->label:I
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v1 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v1
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // const/4 v1, -0x1
        // const/4 v2, 0x0
        // VIRTUAL getCutoutCount()I
        // move-result v3
        // if-ge v2, v3, :cond_1
        // VIRTUAL getCutoutList()Ljava/util/List;
        // move-result-object v4
        // INTERFACE get(I)Ljava/lang/Object;
        // move-result-object v4
        // check-cast v4, Lcom/google/ai/edge/gallery/proto/Cutout;
        // VIRTUAL getId()Ljava/lang/String;
        // ... (truncated)
    }
}