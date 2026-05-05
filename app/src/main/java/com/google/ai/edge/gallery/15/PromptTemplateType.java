// Class: final enum Lcom.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType
// Access: public
class PromptTemplateType extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType CODE_SNIPPET;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType FREE_FORM;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType REWRITE_TONE;
    public static final enum com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType SUMMARIZE_TEXT;
    private final com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateConfig config;
    private final java.util.List examplePrompts;
    private final kotlin.jvm.functions.Function2 genFullPrompt;
    private final java.lang.String label;

    // Methods:
    public androidx.compose.ui.text.AnnotatedString static synthetic $r8$lambda$Hp2_tQGTyn5EFmX2nniAmPHpHK4(java.lang.String, java.util.Map) {
        // STATIC _init_$lambda$13(Ljava/lang/String;Ljava/util/Map;)Landroidx/compose/ui/text/AnnotatedString;
        // move-result-object p0
        return p0;
    }
    public androidx.compose.ui.text.AnnotatedString static synthetic $r8$lambda$oSwGa8UssuE1Ih2amsPZSUGb4PQ(java.lang.String, java.util.Map) {
        // STATIC _init_$lambda$0(Ljava/lang/String;Ljava/util/Map;)Landroidx/compose/ui/text/AnnotatedString;
        // move-result-object p0
        return p0;
    }
    public androidx.compose.ui.text.AnnotatedString static synthetic $r8$lambda$vtkjDnveXFJV9gRkNywVChOD0ic(java.lang.String, java.util.Map) {
        // STATIC _init_$lambda$5(Ljava/lang/String;Ljava/util/Map;)Landroidx/compose/ui/text/AnnotatedString;
        // move-result-object p0
        return p0;
    }
    public androidx.compose.ui.text.AnnotatedString static synthetic $r8$lambda$z08u_zymCEEFCUCq0CypbJlwW6k(java.lang.String, java.util.Map) {
        // STATIC _init_$lambda$9(Ljava/lang/String;Ljava/util/Map;)Landroidx/compose/ui/text/AnnotatedString;
        // move-result-object p0
        return p0;
    }
    public androidx.compose.ui.text.AnnotatedString static synthetic $r8$lambda$zwhjHFMfz31uxo65T_d7XnBuK00(java.lang.String, java.util.Map) {
        // STATIC _init_$lambda$1(Ljava/lang/String;Ljava/util/Map;)Landroidx/compose/ui/text/AnnotatedString;
        // move-result-object p0
        return p0;
    }
    private com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType[] static final synthetic $values() {
        // v0 = FREE_FORM:Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;
        // v1 = REWRITE_TONE:Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;
        // v2 = SUMMARIZE_TEXT:Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;
        // v3 = CODE_SNIPPET:Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        PromptTemplateType; v7 = new PromptTemplateType;();
        // nop
        PromptTemplateConfig; v4 = new PromptTemplateConfig;();
        // const/4 v0, 0x0
        // const/4 v8, 0x1
        // DIRECT <init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        PromptTemplateType$$ExternalSyntheticLambda0; v5 = new PromptTemplateType$$ExternalSyntheticLambda0;();
        // DIRECT <init>()V
        // const/16 v0, 0x8
        // new-array v0, v0, [Ljava/lang/String;
        String v1 = "Suggest 3 topics for a podcast about \"Friendships in your 20s\".";
        // const/4 v9, 0x0
        // aput-object v1, v0, v9
        String v1 = "Outline the key sections needed in a basic logo design brief.";
        // aput-object v1, v0, v8
        // nop
        String v1 = "List 3 pros and 3 cons to consider before buying a smart watch.";
        // const/4 v10, 0x2
        // aput-object v1, v0, v10
        // nop
        // ... (truncated)
    }
    private void constructor <init>(java.lang.String, int, java.lang.String, com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateConfig, kotlin.jvm.functions.Function2, java.util.List) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateConfig;",
        // "Lkotlin/jvm/functions/Function2<",
        // "-",
        // "Ljava/lang/String;",
        // "-",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "+",
        // "Ljava/lang/Object;",
        // ">;",
        // "Landroidx/compose/ui/text/AnnotatedString;",
        // ">;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;)V"
        // }
        // DIRECT <init>(Ljava/lang/String;I)V
        // ... (truncated)
    }
    synthetic void constructor <init>(java.lang.String, int, java.lang.String, com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateConfig, kotlin.jvm.functions.Function2, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p8, p7, 0x4
        // if-eqz p8, :cond_0
        PromptTemplateType$$ExternalSyntheticLambda4; p5 = new PromptTemplateType$$ExternalSyntheticLambda4;();
        // DIRECT <init>()V
        // move-object v5, p5
        // goto :goto_0
        // move-object v5, p5
        // and-int/lit8 p5, p7, 0x8
        // if-eqz p5, :cond_1
        // STATIC emptyList()Ljava/util/List;
        // move-result-object p6
        // move-object v6, p6
        // goto :goto_1
        // move-object v6, p6
        // move-object v0, p0
        // move-object v1, p1
        // move v2, p2
        // move-object v3, p3
        // move-object v4, p4
        return ;
    }
    private androidx.compose.ui.text.AnnotatedString static final _init_$lambda$0(java.lang.String, java.util.Map) {
        String v0 = "<unused var>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        AnnotatedString; p0 = new AnnotatedString;();
        // const/4 p1, 0x0
        // const/4 v0, 0x2
        // DIRECT <init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        return p0;
    }
    private androidx.compose.ui.text.AnnotatedString static final _init_$lambda$1(java.lang.String, java.util.Map) {
        String v0 = "userInput";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "<unused var>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        AnnotatedString; p1 = new AnnotatedString;();
        // const/4 v0, 0x0
        // const/4 v1, 0x2
        // DIRECT <init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        return p1;
    }
    private androidx.compose.ui.text.AnnotatedString static final _init_$lambda$13(java.lang.String, java.util.Map) {
        String v0 = "userInput";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "inputEditorValues";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = LANGUAGE:Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // VIRTUAL getLabel()Ljava/lang/String;
        // move-result-object v0
        // INTERFACE get(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        String v1 = "null cannot be cast to non-null type kotlin.String";
        // STATIC checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/String;
        // const/4 v1, 0x0
        AnnotatedString$Builder; v2 = new AnnotatedString$Builder;();
        // const/4 v3, 0x1
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        // DIRECT <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
        // move-object v3, v2
        // const/4 v4, 0x0
        // ... (truncated)
    }
    private androidx.compose.ui.text.AnnotatedString static final _init_$lambda$5(java.lang.String, java.util.Map) {
        String v0 = "userInput";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "inputEditorValues";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = TONE:Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // VIRTUAL getLabel()Ljava/lang/String;
        // move-result-object v0
        // INTERFACE get(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        String v1 = "null cannot be cast to non-null type kotlin.String";
        // STATIC checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/String;
        // const/4 v1, 0x0
        AnnotatedString$Builder; v2 = new AnnotatedString$Builder;();
        // const/4 v3, 0x1
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        // DIRECT <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
        // move-object v3, v2
        // const/4 v4, 0x0
        // ... (truncated)
    }
    private androidx.compose.ui.text.AnnotatedString static final _init_$lambda$9(java.lang.String, java.util.Map) {
        String v0 = "userInput";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "inputEditorValues";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = STYLE:Lcom/google/ai/edge/gallery/ui/llmsingleturn/InputEditorLabel;
        // VIRTUAL getLabel()Ljava/lang/String;
        // move-result-object v0
        // INTERFACE get(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        String v1 = "null cannot be cast to non-null type kotlin.String";
        // STATIC checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/String;
        // const/4 v1, 0x0
        AnnotatedString$Builder; v2 = new AnnotatedString$Builder;();
        // const/4 v3, 0x1
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        // DIRECT <init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V
        // move-object v3, v2
        // const/4 v4, 0x0
        // ... (truncated)
    }
    public kotlin.enums.EnumEntries static getEntries() {
        // value = {
        // "()",
        // "Lkotlin/enums/EnumEntries<",
        // "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;
        return v0;
    }
    public com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateConfig final getConfig() {
        return v0;
    }
    public java.util.List final getExamplePrompts() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        return v0;
    }
    public kotlin.jvm.functions.Function2 final getGenFullPrompt() {
        // value = {
        // "()",
        // "Lkotlin/jvm/functions/Function2<",
        // "Ljava/lang/String;",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "+",
        // "Ljava/lang/Object;",
        // ">;",
        // "Landroidx/compose/ui/text/AnnotatedString;",
        // ">;"
        // }
        return v0;
    }
    public java.lang.String final getLabel() {
        return v0;
    }
}