// Class: final enum Lcom.google.ai.edge.gallery.ui.llmsingleturn.RewriteToneType
// Access: public
class RewriteToneType extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.RewriteToneType CASUAL;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.RewriteToneType CONCISE;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.RewriteToneType ENTHUSIASTIC;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.RewriteToneType FORMAL;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.RewriteToneType FRIENDLY;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.RewriteToneType POLITE;
    private final java.lang.String label;

    // Methods:
    private com.google.ai.edge.gallery.ui.llmsingleturn.RewriteToneType[] static final synthetic $values() {
        // v0 = FORMAL:Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        // v1 = CASUAL:Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        // v2 = FRIENDLY:Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        // v3 = POLITE:Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        // v4 = ENTHUSIASTIC:Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        // v5 = CONCISE:Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        // filled-new-array/range {v0 .. v5}, [Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        RewriteToneType; v0 = new RewriteToneType;();
        // const/4 v1, 0x0
        String v2 = "Formal";
        String v3 = "FORMAL";
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        RewriteToneType; v0 = new RewriteToneType;();
        // const/4 v1, 0x1
        String v2 = "Casual";
        String v3 = "CASUAL";
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        RewriteToneType; v0 = new RewriteToneType;();
        // const/4 v1, 0x2
        String v2 = "Friendly";
        String v3 = "FRIENDLY";
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        RewriteToneType; v0 = new RewriteToneType;();
        // const/4 v1, 0x3
        String v2 = "Polite";
        String v3 = "POLITE";
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        // ... (truncated)
    }
    private void constructor <init>(java.lang.String, int, java.lang.String) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // ")V"
        // }
        // DIRECT <init>(Ljava/lang/String;I)V
        return ;
    }
    public kotlin.enums.EnumEntries static getEntries() {
        // value = {
        // "()",
        // "Lkotlin/enums/EnumEntries<",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.RewriteToneType static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.RewriteToneType[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/ui/llmsingleturn/RewriteToneType;
        return v0;
    }
    public java.lang.String final getLabel() {
        return v0;
    }
}