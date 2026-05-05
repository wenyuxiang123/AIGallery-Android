// Class: final Lcom.google.ai.edge.gallery.ui.llmchat.LlmChatModelHelper$runInference$1
// Access: public
class LlmChatModelHelper$runInference$1 extends Ljava/lang/Object {

    // Methods:
    constructor void <init>(kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function1) {
        // value = {
        // "(",
        // "Lkotlin/jvm/functions/Function3<",
        // "-",
        // "Ljava/lang/String;",
        // "-",
        // "Ljava/lang/Boolean;",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        // DIRECT <init>()V
        return ;
    }
    public void onDone() {
        // const/4 v1, 0x1
        // STATIC valueOf(Z)Ljava/lang/Boolean;
        // move-result-object v1
        // const/4 v2, 0x0
        // INTERFACE invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void onError(java.lang.Throwable) {
        String v0 = "throwable";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // instance-of v0, p1, Ljava/util/concurrent/CancellationException;
        String v1 = "AGLlmChatModelHelper";
        // if-eqz v0, :cond_0
        String v0 = "The inference is cancelled.";
        // STATIC i(Ljava/lang/String;Ljava/lang/String;)I
        // const/4 v1, 0x1
        // STATIC valueOf(Z)Ljava/lang/Boolean;
        // move-result-object v1
        // const/4 v2, 0x0
        // INTERFACE invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // goto :goto_0
        String v0 = "onError";
        // STATIC e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        // VIRTUAL getMessage()Ljava/lang/String;
        // move-result-object v1
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        String v3 = "Error: ";
        // ... (truncated)
    }
    public void onMessage(com.google.ai.edge.litertlm.Message) {
        String v0 = "message";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v1
        // const/4 v2, 0x0
        // STATIC valueOf(Z)Ljava/lang/Boolean;
        // move-result-object v2
        // VIRTUAL getChannels()Ljava/util/Map;
        // move-result-object v3
        String v4 = "thought";
        // INTERFACE get(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v3
        // INTERFACE invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        return ;
    }
}