// Class: final enum Lcom.google.ai.edge.gallery.ui.llmsingleturn.SummarizationType
// Access: public
class SummarizationType extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.SummarizationType CONCISE_SUMMARY;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.SummarizationType HEADLINE_TITLE;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.SummarizationType KEY_BULLET_POINT;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.SummarizationType ONE_SENTENCE_SUMMARY;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.SummarizationType SHORT_PARAGRAPH;
    private final java.lang.String label;

    // Methods:
    private com.google.ai.edge.gallery.ui.llmsingleturn.SummarizationType[] static final synthetic $values() {
        // v0 = KEY_BULLET_POINT:Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;
        // v1 = SHORT_PARAGRAPH:Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;
        // v2 = CONCISE_SUMMARY:Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;
        // v3 = HEADLINE_TITLE:Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;
        // v4 = ONE_SENTENCE_SUMMARY:Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        SummarizationType; v0 = new SummarizationType;();
        // const/4 v1, 0x0
        String v2 = "Key bullet points (3-5)";
        String v3 = "KEY_BULLET_POINT";
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        SummarizationType; v0 = new SummarizationType;();
        // const/4 v1, 0x1
        String v2 = "Short paragraph (1-2 sentences)";
        String v3 = "SHORT_PARAGRAPH";
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        SummarizationType; v0 = new SummarizationType;();
        // const/4 v1, 0x2
        String v2 = "Concise summary (~50 words)";
        String v3 = "CONCISE_SUMMARY";
        // DIRECT <init>(Ljava/lang/String;ILjava/lang/String;)V
        SummarizationType; v0 = new SummarizationType;();
        // const/4 v1, 0x3
        String v2 = "Headline / title";
        String v3 = "HEADLINE_TITLE";
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
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.SummarizationType static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.SummarizationType[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;
        return v0;
    }
    public java.lang.String final getLabel() {
        return v0;
    }
}