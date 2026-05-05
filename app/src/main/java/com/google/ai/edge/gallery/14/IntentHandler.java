// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.IntentHandler
// Access: public
class IntentHandler extends Ljava/lang/Object {

    // Fields:
    public static final com.google.ai.edge.gallery.customtasks.agentchat.IntentHandler INSTANCE;
    private static final Ljava/lang/String; = "IntentHandler" TAG;

    // Methods:
    static void constructor <clinit>() {
        IntentHandler; v0 = new IntentHandler;();
        // DIRECT <init>()V
        return ;
    }
    private void constructor <init>() {
        // DIRECT <init>()V
        return ;
    }
    public boolean final handleAction(android.content.Context, java.lang.String, java.lang.String) {
        // move-object/from16 v1, p1
        // move-object/from16 v2, p2
        // move-object/from16 v3, p3
        String v4 = "Failed to parse send_sms parameters: ";
        String v5 = "Failed to parse send_email parameters: ";
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "action";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "parameters";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "send_email";
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v0
        // const/4 v6, 0x1
        String v7 = "IntentHandler";
        // const/4 v8, 0x0
        // if-eqz v0, :cond_1
        // nop
        Moshi$Builder; v0 = new Moshi$Builder;();
        // ... (truncated)
    }
}