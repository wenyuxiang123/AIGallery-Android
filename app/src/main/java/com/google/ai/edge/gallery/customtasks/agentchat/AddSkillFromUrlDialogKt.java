package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextRange;
import androidx.compose.p000ui.text.TextRangeKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.input.TextFieldValue;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.ai.edge.gallery.C2421R;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "isHostApproved", "", ImagesContract.URL, "app_debug", "uiState", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "showDisclaimerDialog"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class AddSkillFromUrlDialogKt {
    private static final List<String> APPROVED_SKILL_HOSTS = CollectionsKt.listOf("google-ai-edge.github.io");

    
    public static final Unit AddSkillFromUrlDialog$lambda$35(SkillManagerViewModel skillManagerViewModel, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AddSkillFromUrlDialog(skillManagerViewModel, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AddSkillFromUrlDialog(final SkillManagerViewModel skillManagerViewModel, final Function0<Unit> onDismissRequest, final Function0<Unit> onSuccess, Composer $composer, final int $changed) {
        boolean z;
        final MutableState showDisclaimerDialog$delegate;
        Intrinsics.checkNotNullParameter(skillManagerViewModel, "skillManagerViewModel");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Composer $composer2 = $composer.startRestartGroup(-8871293);
        ComposerKt.sourceInformation($composer2, "C(AddSkillFromUrlDialog)P(2)67@2875L16,71@3005L39,72@3069L47,73@3147L34,75@3229L346,89@3605L39,89@3646L3928,89@3579L3995:AddSkillFromUrlDialog.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(skillManagerViewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onSuccess) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-8871293, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialog (AddSkillFromUrlDialog.kt:66)");
            }
            State uiState$delegate = SnapshotStateKt.collectAsState(skillManagerViewModel.getUiState(), null, $composer2, 0, 1);
            final boolean validating = AddSkillFromUrlDialog$lambda$0(uiState$delegate).getValidating();
            final String validationError = AddSkillFromUrlDialog$lambda$0(uiState$delegate).getValidationError();
            ComposerKt.sourceInformationMarkerStart($composer2, 64632458, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = InteractionSourceKt.MutableInteractionSource();
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableInteractionSource interactionSource = (MutableInteractionSource) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 64634514, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState textFieldValue$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 64636997, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
            Object it$iv3 = $composer2.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                z = false;
                Object value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            } else {
                z = false;
            }
            final MutableState showDisclaimerDialog$delegate2 = (MutableState) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 64639933, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
            boolean invalid$iv = $composer2.changedInstance(skillManagerViewModel) | (($dirty2 & 112) == 32 ? true : z) | (($dirty2 & 896) == 256 ? true : z);
            Object it$iv4 = $composer2.rememberedValue();
            if (invalid$iv || it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AddSkillFromUrlDialogKt.AddSkillFromUrlDialog$lambda$11$lambda$10(skillManagerViewModel, onDismissRequest, onSuccess, textFieldValue$delegate, (String) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            final Function1 validateAndAddSkill = (Function1) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 64651658, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
            boolean zChanged = $composer2.changed(validating);
            if (($dirty2 & 112) == 32) {
                z = true;
            }
            boolean invalid$iv2 = zChanged | z;
            Object it$iv5 = $composer2.rememberedValue();
            if (invalid$iv2 || it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddSkillFromUrlDialogKt.AddSkillFromUrlDialog$lambda$13$lambda$12(validating, onDismissRequest);
                    }
                };
                $composer2.updateRememberedValue(value$iv5);
                it$iv5 = value$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AndroidDialog_androidKt.Dialog((Function0) it$iv5, null, ComposableLambdaKt.rememberComposableLambda(5232346, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddSkillFromUrlDialogKt.AddSkillFromUrlDialog$lambda$30(interactionSource, validating, skillManagerViewModel, validationError, textFieldValue$delegate, onDismissRequest, validateAndAddSkill, showDisclaimerDialog$delegate2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 384, 2);
            if (AddSkillFromUrlDialog$lambda$6(showDisclaimerDialog$delegate2)) {
                $composer2.startReplaceGroup(2008173647);
                ComposerKt.sourceInformation($composer2, "200@7654L32,201@7706L95,199@7610L198");
                ComposerKt.sourceInformationMarkerStart($composer2, 64781219, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
                Object it$iv6 = $composer2.rememberedValue();
                if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                    showDisclaimerDialog$delegate = showDisclaimerDialog$delegate2;
                    Object value$iv6 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddSkillFromUrlDialogKt.AddSkillFromUrlDialog$lambda$32$lambda$31(showDisclaimerDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv6);
                    it$iv6 = value$iv6;
                } else {
                    showDisclaimerDialog$delegate = showDisclaimerDialog$delegate2;
                }
                Function0 function0 = (Function0) it$iv6;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 64782946, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
                boolean invalid$iv3 = $composer2.changed(validateAndAddSkill);
                Object it$iv7 = $composer2.rememberedValue();
                if (invalid$iv3 || it$iv7 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv7 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddSkillFromUrlDialogKt.AddSkillFromUrlDialog$lambda$34$lambda$33(validateAndAddSkill, showDisclaimerDialog$delegate, textFieldValue$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv7);
                    it$iv7 = value$iv7;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                AddSkillDisclaimerDialogKt.AddSkillDisclaimerDialog(function0, (Function0) it$iv7, $composer2, 6);
            } else {
                $composer2.startReplaceGroup(2000623039);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddSkillFromUrlDialogKt.AddSkillFromUrlDialog$lambda$35(skillManagerViewModel, onDismissRequest, onSuccess, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final SkillManagerUiState AddSkillFromUrlDialog$lambda$0(State<SkillManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (SkillManagerUiState) thisObj$iv;
    }

    private static final TextFieldValue AddSkillFromUrlDialog$lambda$3(MutableState<TextFieldValue> mutableState) {
        MutableState<TextFieldValue> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean AddSkillFromUrlDialog$lambda$6(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void AddSkillFromUrlDialog$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    
    public static final Unit AddSkillFromUrlDialog$lambda$11$lambda$10(SkillManagerViewModel $skillManagerViewModel, final Function0 $onDismissRequest, final Function0 $onSuccess, final MutableState $textFieldValue$delegate, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        $skillManagerViewModel.validateAndAddSkillFromUrl(url, new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddSkillFromUrlDialogKt.AddSkillFromUrlDialog$lambda$11$lambda$10$lambda$8($onDismissRequest, $onSuccess);
            }
        }, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddSkillFromUrlDialogKt.AddSkillFromUrlDialog$lambda$11$lambda$10$lambda$9($textFieldValue$delegate, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    
    public static final Unit AddSkillFromUrlDialog$lambda$11$lambda$10$lambda$8(Function0 $onDismissRequest, Function0 $onSuccess) {
        $onDismissRequest.invoke();
        $onSuccess.invoke();
        return Unit.INSTANCE;
    }

    
    public static final Unit AddSkillFromUrlDialog$lambda$11$lambda$10$lambda$9(MutableState $textFieldValue$delegate, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        $textFieldValue$delegate.setValue(TextFieldValue.m9441copy3r_uNRQ$default(AddSkillFromUrlDialog$lambda$3($textFieldValue$delegate), (AnnotatedString) null, TextRangeKt.TextRange(0, AddSkillFromUrlDialog$lambda$3($textFieldValue$delegate).getText().length()), (TextRange) null, 5, (Object) null));
        return Unit.INSTANCE;
    }

    
    public static final Unit AddSkillFromUrlDialog$lambda$13$lambda$12(boolean $validating, Function0 $onDismissRequest) {
        if (!$validating) {
            $onDismissRequest.invoke();
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit AddSkillFromUrlDialog$lambda$30(MutableInteractionSource $interactionSource, final boolean $validating, final SkillManagerViewModel $skillManagerViewModel, final String $validationError, final MutableState $textFieldValue$delegate, final Function0 $onDismissRequest, final Function1 $validateAndAddSkill, final MutableState $showDisclaimerDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C90@3689L7,96@3884L47,100@3980L3590,91@3701L3869:AddSkillFromUrlDialog.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(5232346, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialog.<anonymous> (AddSkillFromUrlDialog.kt:90)");
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd($composer);
            final FocusManager focusManager = (FocusManager) objConsume;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 733324873, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance(focusManager);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddSkillFromUrlDialogKt.AddSkillFromUrlDialog$lambda$30$lambda$15$lambda$14(focusManager);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            CardKt.Card(ClickableKt.m1397clickableO2vRcR0(modifierFillMaxWidth$default, $interactionSource, null, (24 & 4) != 0, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null, (Function0) it$iv), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(16)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-667997236, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AddSkillFromUrlDialogKt.AddSkillFromUrlDialog$lambda$30$lambda$29($validating, $skillManagerViewModel, $validationError, $textFieldValue$delegate, $onDismissRequest, $validateAndAddSkill, $showDisclaimerDialog$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f249xf2722a21, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit AddSkillFromUrlDialog$lambda$30$lambda$15$lambda$14(FocusManager $focusManager) {
        FocusManager.clearFocus$default($focusManager, false, 1, null);
        return Unit.INSTANCE;
    }

    
    public static final Unit AddSkillFromUrlDialog$lambda$30$lambda$29(boolean $validating, final SkillManagerViewModel $skillManagerViewModel, String $validationError, final MutableState $textFieldValue$delegate, final Function0 $onDismissRequest, final Function1 $validateAndAddSkill, final MutableState $showDisclaimerDialog$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Object value$iv;
        Function0<ComposeUiNode> function04;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C101@3988L3576:AddSkillFromUrlDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-667997236, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialog.<anonymous>.<anonymous> (AddSkillFromUrlDialog.kt:101)");
            }
            Modifier modifier$iv = PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20));
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
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
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1905025102, "C106@4133L56,107@4223L10,105@4117L193,110@4319L2090:AddSkillFromUrlDialog.kt#41d64j");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.add_skill_from_url_dialog_title, $composer, 0), PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 48, 0, 131068);
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv2 = Modifier.INSTANCE;
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            int $changed$iv$iv2 = (48 << 3) & 112;
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
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i4 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 149270864, "C112@4406L40,113@4482L10,111@4388L129,117@4608L284,127@4994L10,127@5042L11,129@5120L1039,115@4528L1644:AddSkillFromUrlDialog.kt#41d64j");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.enter_skill_url, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 0, 0, 131070);
            TextFieldValue textFieldValueAddSkillFromUrlDialog$lambda$3 = AddSkillFromUrlDialog$lambda$3($textFieldValue$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 2083030484, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($skillManagerViewModel);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AddSkillFromUrlDialogKt.m424xe388b027($skillManagerViewModel, $textFieldValue$delegate, (TextFieldValue) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BasicTextFieldKt.BasicTextField(textFieldValueAddSkillFromUrlDialog$lambda$3, (Function1<? super TextFieldValue, Unit>) it$iv, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, TextStyle.m9205copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), (KeyboardOptions) null, (KeyboardActions) null, false, 3, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) null, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1698283701, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AddSkillFromUrlDialogKt.m425x2dacc6eb($textFieldValue$delegate, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306752, ProfileVerifier.CompilationStatus.f249xf2722a21, 32216);
            if ($validationError == null) {
                $composer.startReplaceGroup(151012194);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(151012195);
                ComposerKt.sourceInformation($composer, "*155@6297L11,156@6352L10,153@6227L160");
                TextKt.m4781TextNvy7gAk($validationError, null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 131066);
                Unit unit = Unit.INSTANCE;
                $composer.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($validating) {
                $composer.startReplaceGroup(-1902783090);
                ComposerKt.sourceInformation($composer, "162@6487L284");
                Modifier modifier$iv3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment contentAlignment$iv = Alignment.INSTANCE.getCenterEnd();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                int $changed$iv$iv3 = (54 << 3) & 112;
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
                    function04 = constructor3;
                    $composer.createNode(function04);
                } else {
                    function04 = constructor3;
                    $composer.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i6 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1200218702, "C166@6725L11,163@6581L178:AddSkillFromUrlDialog.kt#41d64j");
                ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), C1654Dp.m9788constructorimpl(2), 0L, 0, 0.0f, $composer, 390, 56);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1902408300);
                ComposerKt.sourceInformation($composer, "172@6852L694");
                Modifier modifier$iv4 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 13, null);
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
                    function03 = constructor4;
                    $composer.createNode(function03);
                } else {
                    function03 = constructor4;
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
                ComposerKt.sourceInformationMarkerStart($composer, -1665504537, "C176@7029L22,176@7004L116,179@7133L39,181@7217L238,180@7185L349:AddSkillFromUrlDialog.kt#41d64j");
                ComposerKt.sourceInformationMarkerStart($composer, 916105664, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
                boolean invalid$iv2 = $composer.changed($onDismissRequest);
                Object it$iv2 = $composer.rememberedValue();
                if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddSkillFromUrlDialogKt.m426x7821fe65($onDismissRequest);
                        }
                    };
                    $composer.updateRememberedValue(value$iv3);
                    it$iv2 = value$iv3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ButtonKt.OutlinedButton((Function0) it$iv2, null, false, null, null, null, null, null, null, ComposableSingletons$AddSkillFromUrlDialogKt.INSTANCE.getLambda$728746300$app_debug(), $composer, 805306368, 510);
                SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(4)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, 916111896, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
                boolean invalid$iv3 = $composer.changed($validateAndAddSkill);
                Object it$iv3 = $composer.rememberedValue();
                if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                    value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialogKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddSkillFromUrlDialogKt.m427xa1eb63e9($validateAndAddSkill, $textFieldValue$delegate, $showDisclaimerDialog$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                } else {
                    value$iv = it$iv3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ButtonKt.Button((Function0) value$iv, null, false, null, null, null, null, null, null, ComposableSingletons$AddSkillFromUrlDialogKt.INSTANCE.getLambda$1018569530$app_debug(), $composer, 805306368, 510);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m424xe388b027(SkillManagerViewModel $skillManagerViewModel, MutableState $textFieldValue$delegate, TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String oldText = AddSkillFromUrlDialog$lambda$3($textFieldValue$delegate).getText();
        $textFieldValue$delegate.setValue(newValue);
        if (!Intrinsics.areEqual(newValue.getText(), oldText)) {
            $skillManagerViewModel.setValidationError(null);
        }
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m425x2dacc6eb(MutableState $textFieldValue$delegate, Function2 innerTextField, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        ComposerKt.sourceInformation($composer, "C136@5459L39,130@5180L965:AddSkillFromUrlDialog.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changedInstance(innerTextField) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1698283701, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromUrlDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddSkillFromUrlDialog.kt:130)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            String text = AddSkillFromUrlDialog$lambda$3($textFieldValue$delegate).getText();
            VisualTransformation none = VisualTransformation.INSTANCE.getNone();
            ComposerKt.sourceInformationMarkerStart($composer, -36924932, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = InteractionSourceKt.MutableInteractionSource();
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            outlinedTextFieldDefaults.DecorationBox(text, innerTextField, true, false, none, (MutableInteractionSource) it$iv, false, null, null, null, null, null, null, null, null, PaddingKt.m1982PaddingValuesYgX7TsA(C1654Dp.m9788constructorimpl(8), C1654Dp.m9788constructorimpl(6)), ComposableSingletons$AddSkillFromUrlDialogKt.INSTANCE.getLambda$1197534536$app_debug(), $composer, (($dirty2 << 3) & 112) | 224640, 14352384, 32704);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m426x7821fe65(Function0 $onDismissRequest) {
        $onDismissRequest.invoke();
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m427xa1eb63e9(Function1 $validateAndAddSkill, MutableState $textFieldValue$delegate, MutableState $showDisclaimerDialog$delegate) {
        String url = AddSkillFromUrlDialog$lambda$3($textFieldValue$delegate).getText();
        if (isHostApproved(url)) {
            $validateAndAddSkill.invoke(url);
        } else {
            AddSkillFromUrlDialog$lambda$7($showDisclaimerDialog$delegate, true);
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit AddSkillFromUrlDialog$lambda$32$lambda$31(MutableState $showDisclaimerDialog$delegate) {
        AddSkillFromUrlDialog$lambda$7($showDisclaimerDialog$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit AddSkillFromUrlDialog$lambda$34$lambda$33(Function1 $validateAndAddSkill, MutableState $showDisclaimerDialog$delegate, MutableState $textFieldValue$delegate) {
        AddSkillFromUrlDialog$lambda$7($showDisclaimerDialog$delegate, false);
        $validateAndAddSkill.invoke(AddSkillFromUrlDialog$lambda$3($textFieldValue$delegate).getText());
        return Unit.INSTANCE;
    }

    public static final boolean isHostApproved(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            URI uri = new URI(url).normalize();
            String host = uri.getHost();
            if (host != null) {
                String parsedHost = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(parsedHost, "toLowerCase(...)");
                if (parsedHost != null) {
                    Iterable $this$any$iv = APPROVED_SKILL_HOSTS;
                    if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
                        return false;
                    }
                    for (Object element$iv : $this$any$iv) {
                        String allowed = (String) element$iv;
                        String lowerCase = allowed.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (Intrinsics.areEqual(parsedHost, lowerCase)) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
