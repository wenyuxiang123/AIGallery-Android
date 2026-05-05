// Class: final Lcom.google.ai.edge.gallery.common.ProjectConfig
// Access: public
class ProjectConfig extends Ljava/lang/Object {

    // Fields:
    public static final com.google.ai.edge.gallery.common.ProjectConfig INSTANCE;
    private static final Ljava/lang/String; = "https://huggingface.co/oauth/authorize" authEndpoint;
    private static final net.openid.appauth.AuthorizationServiceConfiguration authServiceConfig;
    public static final Ljava/lang/String; = "REPLACE_WITH_YOUR_CLIENT_ID_IN_HUGGINGFACE_APP" clientId;
    public static final Ljava/lang/String; = "REPLACE_WITH_YOUR_REDIRECT_URI_IN_HUGGINGFACE_APP" redirectUri;
    private static final Ljava/lang/String; = "https://huggingface.co/oauth/token" tokenEndpoint;

    // Methods:
    static void constructor <clinit>() {
        ProjectConfig; v0 = new ProjectConfig;();
        // DIRECT <init>()V
        AuthorizationServiceConfiguration; v0 = new AuthorizationServiceConfiguration;();
        String v1 = "https://huggingface.co/oauth/authorize";
        // const/4 v2, 0x0
        // STATIC parse(Ljava/lang/String;)Landroid/net/Uri;
        // move-result-object v1
        String v2 = "https://huggingface.co/oauth/token";
        // const/4 v3, 0x0
        // STATIC parse(Ljava/lang/String;)Landroid/net/Uri;
        // move-result-object v2
        // DIRECT <init>(Landroid/net/Uri;Landroid/net/Uri;)V
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/common/ProjectConfig;->$stable:I
        return ;
    }
    private void constructor <init>() {
        // DIRECT <init>()V
        return ;
    }
    public net.openid.appauth.AuthorizationServiceConfiguration final getAuthServiceConfig() {
        // v0 = authServiceConfig:Lnet/openid/appauth/AuthorizationServiceConfiguration;
        return v0;
    }
}