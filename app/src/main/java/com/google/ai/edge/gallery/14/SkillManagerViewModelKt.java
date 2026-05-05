// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModelKt
// Access: public
class SkillManagerViewModelKt extends Ljava/lang/Object {

    // Fields:
    private static final Ljava/lang/String; = "" SKILL_ALLOWLIST_URL;
    private static final Ljava/lang/String; = "AGSkillManagerVM" TAG;
    private static final java.util.List TRYOUT_CHIPS;

    // Methods:
    static void constructor <clinit>() {
        // nop
        // const/16 v0, 0x8
        // new-array v0, v0, [Lcom/google/ai/edge/gallery/common/SkillTryOutChip;
        SkillTryOutChip; v1 = new SkillTryOutChip;();
        // v2 = INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;
        // STATIC getMap(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
        // move-result-object v2
        // nop
        // nop
        // nop
        String v3 = "Interactive Map";
        String v4 = "Show me Googleplex on interactive map.";
        String v5 = "interactive-map";
        // DIRECT <init>(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        // const/4 v2, 0x0
        // aput-object v1, v0, v2
        SkillTryOutChip; v1 = new SkillTryOutChip;();
        // v2 = INSTANCE:Landroidx/compose/material/icons/Icons$Outlined;
        // STATIC getKitchen(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
        // move-result-object v2
        // ... (truncated)
    }
    public android.graphics.Bitmap static final decodeBase64ToBitmap(java.lang.String) {
        String v0 = "base64String";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // nop
        // const/4 v0, 0x0
        String v1 = ",";
        // const/4 v2, 0x2
        // STATIC substringAfter$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
        // move-result-object v1
        // v2 = Default:Lkotlin/io/encoding/Base64$Default;
        // move-object v3, v2
        // check-cast v3, Lkotlin/io/encoding/Base64;
        // move-object v4, v1
        // check-cast v4, Ljava/lang/CharSequence;
        // const/4 v7, 0x6
        // const/4 v8, 0x0
        // const/4 v5, 0x0
        // const/4 v6, 0x0
        // move-result-object v2
        // array-length v3, v2
        // const/4 v4, 0x0
        // ... (truncated)
    }
    public java.lang.String static final getDisplayName(android.content.Context, android.net.Uri) {
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "uri";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v0, 0x0
        // nop
        // const/4 v1, 0x0
        // VIRTUAL getContentResolver()Landroid/content/ContentResolver;
        // move-result-object v2
        // const/4 v6, 0x0
        // const/4 v7, 0x0
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        // move-object v3, p1
        // move-result-object v2
        // if-eqz v2, :cond_1
        // check-cast v2, Ljava/io/Closeable;
        // move-object v3, v2
        // check-cast v3, Landroid/database/Cursor;
        // const/4 v4, 0x0
        // ... (truncated)
    }
    public java.util.List static final getTRYOUT_CHIPS() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/common/SkillTryOutChip;",
        // ">;"
        // }
        // v0 = TRYOUT_CHIPS:Ljava/util/List;
        return v0;
    }
}