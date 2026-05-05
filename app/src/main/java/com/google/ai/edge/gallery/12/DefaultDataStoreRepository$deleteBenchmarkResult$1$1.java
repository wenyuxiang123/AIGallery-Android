// Class: Lcom.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteBenchmarkResult$1$1
// Access: final
class DefaultDataStoreRepository$deleteBenchmarkResult$1$1 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(int, kotlin.coroutines.Continuation) {
        // value = {
        // "(I",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$deleteBenchmarkResult$1$1;",
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
        DefaultDataStoreRepository$deleteBenchmarkResult$1$1; v0 = new DefaultDataStoreRepository$deleteBenchmarkResult$1$1;();
        // DIRECT <init>(ILkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/coroutines/Continuation;
        return v0;
    }
    public java.lang.Object final invoke(com.google.ai.edge.gallery.proto.BenchmarkResults, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;",
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
    public java.lang.Object bridge synthetic invoke(java.lang.Object, java.lang.Object) {
        // check-cast p1, Lcom/google/ai/edge/gallery/proto/BenchmarkResults;
        // check-cast p2, Lkotlin/coroutines/Continuation;
        // VIRTUAL invoke(Lcom/google/ai/edge/gallery/proto/BenchmarkResults;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // check-cast v0, Lcom/google/ai/edge/gallery/proto/BenchmarkResults;
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v1 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v1
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // VIRTUAL toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;
        // move-result-object v1
        // check-cast v1, Lcom/google/ai/edge/gallery/proto/BenchmarkResults$Builder;
        // VIRTUAL removeResult(I)Lcom/google/ai/edge/gallery/proto/BenchmarkResults$Builder;
        // move-result-object v1
        // VIRTUAL build()Lcom/google/protobuf/GeneratedMessageLite;
        // move-result-object v1
        // check-cast v1, Lcom/google/ai/edge/gallery/proto/BenchmarkResults;
        // STATIC checkNotNull(Ljava/lang/Object;)V
        return v1;
        // nop
    }
}