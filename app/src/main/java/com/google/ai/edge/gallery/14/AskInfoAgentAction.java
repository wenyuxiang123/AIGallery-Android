// Class: final Lcom.google.ai.edge.gallery.common.AskInfoAgentAction
// Access: public
class AskInfoAgentAction extends Lcom/google/ai/edge/gallery/common/AgentAction {

    // Fields:
    private final java.lang.String dialogTitle;
    private final java.lang.String fieldLabel;
    private final kotlinx.coroutines.CompletableDeferred result;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/common/AskInfoAgentAction;->$stable:I
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, kotlinx.coroutines.CompletableDeferred) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Lkotlinx/coroutines/CompletableDeferred<",
        // "Ljava/lang/String;",
        // ">;)V"
        // }
        String v0 = "dialogTitle";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "fieldLabel";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "result";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = ASK_INFO:Lcom/google/ai/edge/gallery/common/AgentActionName;
        // DIRECT <init>(Lcom/google/ai/edge/gallery/common/AgentActionName;)V
        return ;
    }
    public void synthetic constructor <init>(java.lang.String, java.lang.String, kotlinx.coroutines.CompletableDeferred, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p4, p4, 0x4
        // if-eqz p4, :cond_0
        // const/4 p3, 0x1
        // const/4 p4, 0x0
        // STATIC CompletableDeferred$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;
        // move-result-object p3
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/CompletableDeferred;)V
        return ;
    }
    public java.lang.String final getDialogTitle() {
        return v0;
    }
    public java.lang.String final getFieldLabel() {
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
}