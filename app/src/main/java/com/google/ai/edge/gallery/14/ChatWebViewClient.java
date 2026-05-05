// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.ChatWebViewClient
// Access: public
class ChatWebViewClient extends Lcom/google/ai/edge/gallery/ui/common/BaseGalleryWebViewClient {

    // Fields:
    private final android.content.Context context;
    private kotlin.jvm.functions.Function0 onPageLoaded;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/ChatWebViewClient;->$stable:I
        return ;
    }
    public void constructor <init>(android.content.Context) {
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>(Landroid/content/Context;)V
        return ;
    }
    public android.content.Context final getContext() {
        return v0;
    }
    public void onPageFinished(android.webkit.WebView, java.lang.String) {
        // SUPER onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
        String v0 = "AGAgentChatScreen";
        String v1 = "page loaded";
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // if-eqz v0, :cond_0
        // INTERFACE invoke()Ljava/lang/Object;
        return ;
    }
    public void final setPageLoadListener(kotlin.jvm.functions.Function0) {
        // value = {
        // "(",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        return ;
    }
}