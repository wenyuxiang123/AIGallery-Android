package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.Clipboard;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: GenerateLlmPromptBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008b\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\n\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m922d2 = {"PROMPT_TEMPLATE", "", "GenerateLlmPromptBottomSheet", "", "curDescription", "requirements", "onRequirementsChange", "Lkotlin/Function1;", "inputData", "onInputDataChange", "outputData", "onOutputDataChange", "onDismiss", "Lkotlin/Function0;", "onLlmPromptGenerated", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GenerateLlmPromptBottomSheetKt {
    private static final String PROMPT_TEMPLATE = "# Task: Custom HTML/JS Implementation\nGenerate a single, self-contained HTML file that implements a specific feature or logic as described below.\n\n## 1. Requirement\nThe implementation must fulfill the following:\n> ___requirement___\n\n## 2. Technical Specifications\n* **Structure:** A complete, valid HTML5 document.\n* **Head (Dependencies):** If third-party JS libraries (e.g., Three.js, D3, Lodash, GSAP) are required, include them via CDN using `<script src=\"...\" defer>` tags inside the `<head>`. Do not put implementation logic here.\n* **Body (Implementation):** Place the actual logic implementation inside a single `<script>` tag at the very end of the `<body>`.\n* **Global Interface:** Within the body script, you must expose an `async` function to the global `window` object named: `window['ai_edge_gallery_get_result']`.\n\n## 3. Data Interface & Serialization\n* **Parameter 1 (`data`):** A **JSON-stringified string**.\n    * Once parsed, the input object follows this schema: `___input_data_schema___`\n* **Parameter 2 (`secret`):** A **string** representing a sensitive token or API key (e.g., Bearer token, private key). The implementation should use this if the requirement involves authenticated API calls or encrypted operations.\n* **Output (return value):** The function must return a **JSON-stringified string** with the following exact structure:\n    ```json\n    {\n      \"result\": \"___output_data_schema___\",\n      \"image\": { \"base64\": \"data:image/png;base64,...\" },\n      \"error\": \"Error message string or null\"\n    }\n    ```\n    **CRITICAL RULES:**\n    1. **Dual Output:** The `\"result\"` and `\"image\"` fields can and should coexist in the same response if the requirement involves returning both data/text and a visual asset.\n    2. **Result Serialization:** The value for `\"result\"` must be a JSON-stringified representation of the output data. Set to `null` only if no data is produced.\n    3. **Image Serialization:** The `\"image.base64\"` field must contain a full Data URI. Set the entire `\"image\"` object to `null` only if no image is produced.\n\n## 4. Error Handling\n* Wrap the entire function logic in a `try/catch` block.\n* If an error occurs, the function should return a JSON string where `result` is `null` and `error` contains the error message.\n\n## 5. Response Constraints\n* Return the **raw HTML code only**.\n* Do not provide any introductory text, markdown backticks, or concluding remarks.\n* Start the response immediately with `<!DOCTYPE html>`.\n* Put the output code into a Markdown code block so I can easily copy.";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenerateLlmPromptBottomSheet$lambda$8(String str, String str2, Function1 function1, String str3, Function1 function12, String str4, Function1 function13, Function0 function0, Function1 function14, int i, Composer composer, int i2) {
        GenerateLlmPromptBottomSheet(str, str2, function1, str3, function12, str4, function13, function0, function14, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GenerateLlmPromptBottomSheet(final String curDescription, final String requirements, final Function1<? super String, Unit> onRequirementsChange, final String inputData, final Function1<? super String, Unit> onInputDataChange, final String outputData, final Function1<? super String, Unit> onOutputDataChange, final Function0<Unit> onDismiss, final Function1<? super String, Unit> onLlmPromptGenerated, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(curDescription, "curDescription");
        Intrinsics.checkNotNullParameter(requirements, "requirements");
        Intrinsics.checkNotNullParameter(onRequirementsChange, "onRequirementsChange");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(onInputDataChange, "onInputDataChange");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(onOutputDataChange, "onOutputDataChange");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onLlmPromptGenerated, "onLlmPromptGenerated");
        Composer $composer2 = $composer.startRestartGroup(-2134651955);
        ComposerKt.sourceInformation($composer2, "C(GenerateLlmPromptBottomSheet)P(!1,8,6!1,3,7,5)106@5131L59,107@5205L24,108@5263L7,110@5305L88,110@5274L119,116@5469L2236,116@5397L2308:GenerateLlmPromptBottomSheet.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(curDescription) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(requirements) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onRequirementsChange) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(inputData) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onInputDataChange) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer2.changed(outputData) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer2.changedInstance(onOutputDataChange) ? 1048576 : 524288;
        }
        if ((12582912 & $changed) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 8388608 : 4194304;
        }
        if ((100663296 & $changed) == 0) {
            $dirty |= $composer2.changedInstance(onLlmPromptGenerated) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute((38347923 & $dirty2) != 38347922, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2134651955, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.GenerateLlmPromptBottomSheet (GenerateLlmPromptBottomSheet.kt:105)");
            }
            final SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer2, 6, 2);
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object value$iv$iv = $composer2.rememberedValue();
            if (value$iv$iv == Composer.INSTANCE.getEmpty()) {
                value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
                $composer2.updateRememberedValue(value$iv$iv);
            }
            final CoroutineScope scope = (CoroutineScope) value$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ProvidableCompositionLocal<Clipboard> localClipboard = CompositionLocalsKt.getLocalClipboard();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localClipboard);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Clipboard clipboard = (Clipboard) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, 1593856869, "CC(remember):GenerateLlmPromptBottomSheet.kt#9igjgp");
            boolean invalid$iv = (($dirty2 & 112) == 32) | (($dirty2 & 896) == 256) | (($dirty2 & 14) == 4);
            Object it$iv = $composer2.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = (Function2) new GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$1$1(requirements, onRequirementsChange, curDescription, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(curDescription, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv, $composer2, $dirty2 & 14);
            ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8(onDismiss, null, sheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1488641237, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.GenerateLlmPromptBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GenerateLlmPromptBottomSheetKt.GenerateLlmPromptBottomSheet$lambda$7(requirements, onRequirementsChange, inputData, onInputDataChange, outputData, onOutputDataChange, scope, clipboard, onLlmPromptGenerated, sheetState, onDismiss, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ($dirty2 >> 21) & 14, 3072, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.GenerateLlmPromptBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenerateLlmPromptBottomSheetKt.GenerateLlmPromptBottomSheet$lambda$8(curDescription, requirements, onRequirementsChange, inputData, onInputDataChange, outputData, onOutputDataChange, onDismiss, onLlmPromptGenerated, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenerateLlmPromptBottomSheet$lambda$7(final String $requirements, Function1 $onRequirementsChange, final String $inputData, Function1 $onInputDataChange, final String $outputData, Function1 $onOutputDataChange, final CoroutineScope $scope, final Clipboard $clipboard, final Function1 $onLlmPromptGenerated, final SheetState $sheetState, final Function0 $onDismiss, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Function0<ComposeUiNode> function04;
        Object value$iv;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C117@5475L2226:GenerateLlmPromptBottomSheet.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1488641237, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.GenerateLlmPromptBottomSheet.<anonymous> (GenerateLlmPromptBottomSheet.kt:117)");
            }
            Modifier modifier$iv = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment contentAlignment$iv = Alignment.INSTANCE.getBottomCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (54 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i2 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 440600172, "C118@5565L2130:GenerateLlmPromptBottomSheet.kt#41d64j");
            Modifier modifier$iv2 = WindowInsetsPadding_androidKt.imePadding(PaddingKt.m1988padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(16)));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv2 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i4 = ((0 >> 6) & 112) | 6;
            ColumnScope $this$GenerateLlmPromptBottomSheet_u24lambda_u247_u24lambda_u246_u24lambda_u245 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1676638714, "C120@5661L50,121@5745L10,119@5645L132,124@5787L41,127@5902L21,126@5838L971,152@6819L41,154@6870L817:GenerateLlmPromptBottomSheet.kt#41d64j");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.generate_llm_prompt_title, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 0, 0, 131070);
            SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), $composer, 6);
            Modifier modifier$iv3 = PaddingKt.m1992paddingqDBjuR0$default(ScrollKt.verticalScroll$default(ColumnScope.weight$default($this$GenerateLlmPromptBottomSheet_u24lambda_u247_u24lambda_u246_u24lambda_u245, Modifier.INSTANCE, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null), 0.0f, C1654Dp.m9788constructorimpl(16), 0.0f, 0.0f, 13, null);
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            int $changed$iv$iv3 = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function03 = constructor3;
                $composer.createNode(function03);
            } else {
                function03 = constructor3;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1770377463, "C130@6030L210,136@6251L279,143@6541L258:GenerateLlmPromptBottomSheet.kt#41d64j");
            CursorTrackingTextFieldKt.m10471CursorTrackingTextFieldf8ukHw(Integer.valueOf(C2421R.string.describe_requirements), null, $requirements, $onRequirementsChange, null, false, 3, 0.0f, false, null, $composer, 1572864, 946);
            CursorTrackingTextFieldKt.m10471CursorTrackingTextFieldf8ukHw(Integer.valueOf(C2421R.string.describe_input_data), Integer.valueOf(C2421R.string.describe_input_data_support_text), $inputData, $onInputDataChange, null, false, 7, 0.0f, false, null, $composer, 1572864, 944);
            CursorTrackingTextFieldKt.m10471CursorTrackingTextFieldf8ukHw(Integer.valueOf(C2421R.string.describe_output_data), null, $outputData, $onOutputDataChange, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 13, null), false, 5, 0.0f, false, null, $composer, 1597440, 930);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), $composer, 6);
            Modifier modifier$iv4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getEnd();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
            MeasurePolicy measurePolicy$iv4 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            int $changed$iv$iv4 = (54 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv4 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer, modifier$iv4);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int $i$f$Row = $changed$iv$iv4 << 6;
            int $changed$iv$iv$iv4 = ($i$f$Row & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function04 = constructor4;
                $composer.createNode(function04);
            } else {
                function04 = constructor4;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = ($changed$iv$iv$iv4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i8 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1338344114, "C156@6993L597,155@6963L714:GenerateLlmPromptBottomSheet.kt#41d64j");
            ComposerKt.sourceInformationMarkerStart($composer, -181718880, "CC(remember):GenerateLlmPromptBottomSheet.kt#9igjgp");
            boolean invalid$iv = $composer.changed($requirements) | $composer.changed($inputData) | $composer.changed($outputData) | $composer.changedInstance($scope) | $composer.changedInstance($clipboard) | $composer.changed($onLlmPromptGenerated) | $composer.changed($sheetState) | $composer.changed($onDismiss);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.GenerateLlmPromptBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GenerateLlmPromptBottomSheetKt.m429xef618ef5($requirements, $inputData, $outputData, $scope, $clipboard, $onLlmPromptGenerated, $sheetState, $onDismiss);
                    }
                };
                $composer.updateRememberedValue(value$iv);
            } else {
                value$iv = it$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) value$iv, null, false, null, null, null, null, null, null, ComposableSingletons$GenerateLlmPromptBottomSheetKt.INSTANCE.getLambda$1600954843$app_debug(), $composer, 805306368, 510);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: GenerateLlmPromptBottomSheet$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2 */
    public static final Unit m429xef618ef5(String $requirements, String $inputData, String $outputData, CoroutineScope $scope, Clipboard $clipboard, Function1 $onLlmPromptGenerated, SheetState $sheetState, Function0 $onDismiss) {
        String prompt = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(PROMPT_TEMPLATE, "___requirement___", $requirements, false, 4, (Object) null), "___input_data_schema___", $inputData, false, 4, (Object) null), "___output_data_schema___", $outputData, false, 4, (Object) null);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new C2500x4c804858(prompt, $clipboard, $onLlmPromptGenerated, $sheetState, $onDismiss, null), 3, null);
        return Unit.INSTANCE;
    }
}
