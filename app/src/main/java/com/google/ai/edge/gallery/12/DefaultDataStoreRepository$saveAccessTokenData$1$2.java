// Class: Lcom.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveAccessTokenData$1$2
// Access: final
class DefaultDataStoreRepository$saveAccessTokenData$1$2 extends Lkotlin/coroutines/jvm/internal/SuspendLambda {

    // Methods:
    constructor void <init>(java.lang.String, java.lang.String, long, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "J",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$saveAccessTokenData$1$2;",
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
        DefaultDataStoreRepository$saveAccessTokenData$1$2; v6 = new DefaultDataStoreRepository$saveAccessTokenData$1$2;();
        // move-object v0, v6
        // move-object v5, p2
        // check-cast v6, Lkotlin/coroutines/Continuation;
        return v6;
    }
    public java.lang.Object final invoke(com.google.ai.edge.gallery.proto.UserData, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;)",
        // "Ljava/lang/Object;"
        // }
        // VIRTUAL create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository$saveAccessTokenData$1$2;
        // v1 = INSTANCE:Lkotlin/Unit;
        // VIRTUAL invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic invoke(java.lang.Object, java.lang.Object) {
        // check-cast p1, Lcom/google/ai/edge/gallery/proto/UserData;
        // check-cast p2, Lkotlin/coroutines/Continuation;
        // VIRTUAL invoke(Lcom/google/ai/edge/gallery/proto/UserData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object final invokeSuspend(java.lang.Object) {
        // check-cast v0, Lcom/google/ai/edge/gallery/proto/UserData;
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // packed-switch v1, :pswitch_data_0
        IllegalStateException; v1 = new IllegalStateException;();
        String v2 = "call to \'resume\' before \'invoke\' with coroutine";
        // DIRECT <init>(Ljava/lang/String;)V
        // throw v1
        // STATIC throwOnFailure(Ljava/lang/Object;)V
        // nop
        // VIRTUAL toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;
        // move-result-object v1
        // check-cast v1, Lcom/google/ai/edge/gallery/proto/UserData$Builder;
        // STATIC newBuilder()Lcom/google/ai/edge/gallery/proto/AccessTokenData$Builder;
        // move-result-object v2
        // VIRTUAL setAccessToken(Ljava/lang/String;)Lcom/google/ai/edge/gallery/proto/AccessTokenData$Builder;
        // move-result-object v2
        // VIRTUAL setRefreshToken(Ljava/lang/String;)Lcom/google/ai/edge/gallery/proto/AccessTokenData$Builder;
        // move-result-object v2
        // VIRTUAL setExpiresAtMs(J)Lcom/google/ai/edge/gallery/proto/AccessTokenData$Builder;
        // move-result-object v2
        // ... (truncated)
    }
}