package com.google.ai.edge.gallery.ui.llmsingleturn;

import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.SpanStyle;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */


V", "getLabel", "()Ljava/lang/String;", "getConfig", "()Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateConfig;", "getGenFullPrompt", "()Lkotlin/jvm/functions/Function2;", "getExamplePrompts", "()Ljava/util/List;", "FREE_FORM", "REWRITE_TONE", "SUMMARIZE_TEXT", "CODE_SNIPPET", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class PromptTemplateType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PromptTemplateType[] $VALUES;
    public static final PromptTemplateType CODE_SNIPPET;
    public static final PromptTemplateType FREE_FORM = new PromptTemplateType("FREE_FORM", 0, "Free form", new PromptTemplateConfig(null, 1, null), new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return PromptTemplateType._init_$lambda$1((String) obj, (Map) obj2);
        }
    }, CollectionsKt.listOf((Object[]) new String[]{"Suggest 3 topics for a podcast about \"Friendships in your 20s\".", "Outline the key sections needed in a basic logo design brief.", "List 3 pros and 3 cons to consider before buying a smart watch.", "Write a short, optimistic quote about the future of technology.", "Generate 3 potential names for a mobile app that helps users identify plants.", "Explain the difference between AI and machine learning in 2 sentences.", "Create a simple haiku about a cat sleeping in the sun.", "List 3 ways to make instant noodles taste better using common kitchen ingredients."}));
    public static final PromptTemplateType REWRITE_TONE;
    public static final PromptTemplateType SUMMARIZE_TEXT;
    private final PromptTemplateConfig config;
    private final List<String> examplePrompts;
    private final Function2<String, Map<String, ? extends Object>, AnnotatedString> genFullPrompt;
    private final String label;

    private static final /* synthetic */ PromptTemplateType[] $values() {
        return new PromptTemplateType[]{FREE_FORM, REWRITE_TONE, SUMMARIZE_TEXT, CODE_SNIPPET};
    }

    public static EnumEntries<PromptTemplateType> getEntries() {
        return $ENTRIES;
    }

    public static PromptTemplateType valueOf(String str) {
        return (PromptTemplateType) Enum.valueOf(PromptTemplateType.class, str);
    }

    public static PromptTemplateType[] values() {
        return (PromptTemplateType[]) $VALUES.clone();
    }

    private PromptTemplateType(String $enum$name, int $enum$ordinal, String label, PromptTemplateConfig config, Function2 genFullPrompt, List examplePrompts) {
        this.label = label;
        this.config = config;
        this.genFullPrompt = genFullPrompt;
        this.examplePrompts = examplePrompts;
    }

    /* synthetic */ PromptTemplateType(String str, int i, String str2, PromptTemplateConfig promptTemplateConfig, Function2 function2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Function2 function22;
        List listEmptyList;
        if ((i2 & 4) == 0) {
            function22 = function2;
        } else {
            function22 = new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PromptTemplateType._init_$lambda$0((String) obj, (Map) obj2);
                }
            };
        }
        if ((i2 & 8) == 0) {
            listEmptyList = list;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this(str, i, str2, promptTemplateConfig, function22, listEmptyList);
    }

    public final String getLabel() {
        return this.label;
    }

    public final PromptTemplateConfig getConfig() {
        return this.config;
    }

    public final Function2<String, Map<String, ? extends Object>, AnnotatedString> getGenFullPrompt() {
        return this.genFullPrompt;
    }

    
    /* JADX WARN: Multi-variable type inference failed */
    public static final AnnotatedString _init_$lambda$0(String str, Map map) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        return new AnnotatedString("", null, 2, 0 == true ? 1 : 0);
    }

    public final List<String> getExamplePrompts() {
        return this.examplePrompts;
    }

    static {
        String label = InputEditorLabel.TONE.getLabel();
        Iterable $this$map$iv = RewriteToneType.getEntries();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            RewriteToneType it = (RewriteToneType) item$iv$iv;
            destination$iv$iv.add(it.getLabel());
        }
        REWRITE_TONE = new PromptTemplateType("REWRITE_TONE", 1, "Rewrite tone", new PromptTemplateConfig(CollectionsKt.listOf(new PromptTemplateSingleSelectInputEditor(label, (List) destination$iv$iv, RewriteToneType.FORMAL.getLabel()))), new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PromptTemplateType._init_$lambda$5((String) obj, (Map) obj2);
            }
        }, CollectionsKt.listOf((Object[]) new String[]{"Hey team, just wanted to remind everyone about the meeting tomorrow @ 10. Be there!", "Our new software update includes several bug fixes and performance improvements.", "Due to the fact that the weather was bad, we decided to postpone the event.", "Please find attached the requested documentation for your perusal.", "Welcome to the team. Review the onboarding materials."}));
        String label2 = InputEditorLabel.STYLE.getLabel();
        Iterable $this$map$iv2 = SummarizationType.getEntries();
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        for (Object item$iv$iv2 : $this$map$iv2) {
            SummarizationType it2 = (SummarizationType) item$iv$iv2;
            destination$iv$iv2.add(it2.getLabel());
        }
        SUMMARIZE_TEXT = new PromptTemplateType("SUMMARIZE_TEXT", 2, "Summarize text", new PromptTemplateConfig(CollectionsKt.listOf(new PromptTemplateSingleSelectInputEditor(label2, (List) destination$iv$iv2, SummarizationType.KEY_BULLET_POINT.getLabel()))), new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PromptTemplateType._init_$lambda$9((String) obj, (Map) obj2);
            }
        }, CollectionsKt.listOf((Object[]) new String[]{"The new Pixel phone features an advanced camera system with improved low-light performance and AI-powered editing tools. The display is brighter and more energy-efficient. It runs on the latest Tensor chip, offering faster processing and enhanced security features. Battery life has also been extended, providing all-day power for most users.", "Beginning this Friday, January 24, giant pandas Bao Li and Qing Bao are officially on view to the public at the Smithsonian’s National Zoo and Conservation Biology Institute (NZCBI). The 3-year-old bears arrived in Washington this past October, undergoing a quarantine period before making their debut. Under NZCBI’s new agreement with the CWCA, Qing Bao and Bao Li will remain in the United States for ten years, until April 2034, in exchange for an annual fee of $1 million. The pair are still too young to breed, as pandas only reach sexual maturity between ages 4 and 7. “Kind of picture them as like awkward teenagers right now,” Lally told WUSA9. “We still have about two years before we would probably even see signs that they’re ready to start mating.”"}));
        String label3 = InputEditorLabel.LANGUAGE.getLabel();
        Iterable $this$map$iv3 = LanguageType.getEntries();
        Collection destination$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv3, 10));
        for (Object item$iv$iv3 : $this$map$iv3) {
            LanguageType it3 = (LanguageType) item$iv$iv3;
            destination$iv$iv3.add(it3.getLabel());
        }
        CODE_SNIPPET = new PromptTemplateType("CODE_SNIPPET", 3, "Code snippet", new PromptTemplateConfig(CollectionsKt.listOf(new PromptTemplateSingleSelectInputEditor(label3, (List) destination$iv$iv3, LanguageType.JAVASCRIPT.getLabel()))), new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateType$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PromptTemplateType._init_$lambda$13((String) obj, (Map) obj2);
            }
        }, CollectionsKt.listOf((Object[]) new String[]{"Create an alert box that says \"Hello, World!\"", "Declare an immutable variable named 'appName' with the value \"AI Gallery\"", "Print the numbers from 1 to 5 using a for loop.", "Write a function that returns the square of an integer input."}));
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }

    
    /* JADX WARN: Multi-variable type inference failed */
    public static final AnnotatedString _init_$lambda$1(String userInput, Map map) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        return new AnnotatedString(userInput, null, 2, 0 == true ? 1 : 0);
    }

    
    public static final AnnotatedString _init_$lambda$5(String userInput, Map inputEditorValues) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(inputEditorValues, "inputEditorValues");
        Object obj = inputEditorValues.get(InputEditorLabel.TONE.getLabel());
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String tone = (String) obj;
        AnnotatedString.Builder $this$lambda_u245_u24lambda_u244 = new AnnotatedString.Builder(0, 1, null);
        SpanStyle style$iv = PromptTemplateConfigsKt.GEMINI_GRADIENT_STYLE;
        int index$iv = $this$lambda_u245_u24lambda_u244.pushStyle(style$iv);
        try {
            String lowerCase = tone.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            $this$lambda_u245_u24lambda_u244.append("Rewrite the following text using a " + lowerCase + " tone: ");
            Unit unit = Unit.INSTANCE;
            $this$lambda_u245_u24lambda_u244.pop(index$iv);
            $this$lambda_u245_u24lambda_u244.append(userInput);
            return $this$lambda_u245_u24lambda_u244.toAnnotatedString();
        } catch (Throwable th) {
            $this$lambda_u245_u24lambda_u244.pop(index$iv);
            throw th;
        }
    }

    
    public static final AnnotatedString _init_$lambda$9(String userInput, Map inputEditorValues) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(inputEditorValues, "inputEditorValues");
        Object obj = inputEditorValues.get(InputEditorLabel.STYLE.getLabel());
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String style = (String) obj;
        AnnotatedString.Builder $this$lambda_u249_u24lambda_u248 = new AnnotatedString.Builder(0, 1, null);
        SpanStyle style$iv = PromptTemplateConfigsKt.GEMINI_GRADIENT_STYLE;
        int index$iv = $this$lambda_u249_u24lambda_u248.pushStyle(style$iv);
        try {
            String lowerCase = style.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            $this$lambda_u249_u24lambda_u248.append("Please summarize the following in " + lowerCase + ": ");
            Unit unit = Unit.INSTANCE;
            $this$lambda_u249_u24lambda_u248.pop(index$iv);
            $this$lambda_u249_u24lambda_u248.append(userInput);
            return $this$lambda_u249_u24lambda_u248.toAnnotatedString();
        } catch (Throwable th) {
            $this$lambda_u249_u24lambda_u248.pop(index$iv);
            throw th;
        }
    }

    
    public static final AnnotatedString _init_$lambda$13(String userInput, Map inputEditorValues) {
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        Intrinsics.checkNotNullParameter(inputEditorValues, "inputEditorValues");
        Object obj = inputEditorValues.get(InputEditorLabel.LANGUAGE.getLabel());
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String language = (String) obj;
        AnnotatedString.Builder $this$lambda_u2413_u24lambda_u2412 = new AnnotatedString.Builder(0, 1, null);
        SpanStyle style$iv = PromptTemplateConfigsKt.GEMINI_GRADIENT_STYLE;
        int index$iv = $this$lambda_u2413_u24lambda_u2412.pushStyle(style$iv);
        try {
            $this$lambda_u2413_u24lambda_u2412.append("Write a " + language + " code snippet to ");
            Unit unit = Unit.INSTANCE;
            $this$lambda_u2413_u24lambda_u2412.pop(index$iv);
            $this$lambda_u2413_u24lambda_u2412.append(userInput);
            return $this$lambda_u2413_u24lambda_u2412.toAnnotatedString();
        } catch (Throwable th) {
            $this$lambda_u2413_u24lambda_u2412.pop(index$iv);
            throw th;
        }
    }
}
