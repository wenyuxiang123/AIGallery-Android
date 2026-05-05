// Class: final Lcom.google.ai.edge.gallery.common.CallJsAgentAction
// Access: public
class CallJsAgentAction extends Lcom/google/ai/edge/gallery/common/AgentAction {

    // Fields:
    private final java.lang.String data;
    private final kotlinx.coroutines.CompletableDeferred result;
    private final java.lang.String secret;
    private final java.lang.String url;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/common/CallJsAgentAction;->$stable:I
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, java.lang.String, kotlinx.coroutines.CompletableDeferred) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Lkotlinx/coroutines/CompletableDeferred<",
        // "Ljava/lang/String;",
        // ">;)V"
        // }
        String v0 = "url";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "data";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "secret";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "result";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = CALL_JS_SKILL:Lcom/google/ai/edge/gallery/common/AgentActionName;
        // DIRECT <init>(Lcom/google/ai/edge/gallery/common/AgentActionName;)V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/common/CallJsAgentAction;->url:Ljava/lang/String;
        // ... (truncated)
    }
    public void synthetic constructor <init>(java.lang.String, java.lang.String, java.lang.String, kotlinx.coroutines.CompletableDeferred, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p6, p5, 0x4
        // if-eqz p6, :cond_0
        // and-int/lit8 p5, p5, 0x8
        // if-eqz p5, :cond_1
        // const/4 p4, 0x1
        // const/4 p5, 0x0
        // STATIC CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;
        // move-result-object p4
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/CompletableDeferred;)V
        return ;
    }
    public java.lang.String final getData() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/CallJsAgentAction;->data:Ljava/lang/String;
        return v0;
    }
    public kotlinx.coroutines.CompletableDeferred final getResult() {
        // value = {
        // "()",
        // "Lkotlinx/coroutines/CompletableDeferred<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        return v0;
    }
    public java.lang.String final getSecret() {
        return v0;
    }
    public java.lang.String final getUrl() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/CallJsAgentAction;->url:Ljava/lang/String;
        return v0;
    }
}