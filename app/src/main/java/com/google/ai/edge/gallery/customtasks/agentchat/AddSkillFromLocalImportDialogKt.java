package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
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
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AddSkillFromLocalImportDialog.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "AddSkillFromLocalImportDialog", "", "skillManagerViewModel", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;", "onDismissRequest", "Lkotlin/Function0;", "onSuccess", "(Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;", "showReplaceSkillConfirmationDialog", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AddSkillFromLocalImportDialogKt {
    private static final String TAG = "AGAddSkillFromLocalImportDialog";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromLocalImportDialog$lambda$34(SkillManagerViewModel skillManagerViewModel, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AddSkillFromLocalImportDialog(skillManagerViewModel, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AddSkillFromLocalImportDialog(final SkillManagerViewModel skillManagerViewModel, final Function0<Unit> onDismissRequest, final Function0<Unit> onSuccess, Composer $composer, final int $changed) {
        final SkillManagerViewModel skillManagerViewModel2;
        final Function0<Unit> function0;
        Composer $composer2;
        final MutableState showReplaceSkillConfirmationDialog$delegate;
        Intrinsics.checkNotNullParameter(skillManagerViewModel, "skillManagerViewModel");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Composer $composer3 = $composer.startRestartGroup(-1136245085);
        ComposerKt.sourceInformation($composer3, "C(AddSkillFromLocalImportDialog)P(2)66@2734L16,70@2929L34,72@2994L7,75@3117L122,75@3039L200,80@3287L4105,80@3243L4149:AddSkillFromLocalImportDialog.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(skillManagerViewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onSuccess) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            skillManagerViewModel2 = skillManagerViewModel;
            function0 = onDismissRequest;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1136245085, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialog (AddSkillFromLocalImportDialog.kt:65)");
            }
            State uiState$delegate = SnapshotStateKt.collectAsState(skillManagerViewModel.getUiState(), null, $composer3, 0, 1);
            final boolean validating = AddSkillFromLocalImportDialog$lambda$0(uiState$delegate).getValidating();
            final String validationError = AddSkillFromLocalImportDialog$lambda$0(uiState$delegate).getValidationError();
            final Uri directoryUri = AddSkillFromLocalImportDialog$lambda$0(uiState$delegate).getImportDirectoryUri();
            ComposerKt.sourceInformationMarkerStart($composer3, -1009820731, "CC(remember):AddSkillFromLocalImportDialog.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState showReplaceSkillConfirmationDialog$delegate2 = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ActivityResultContracts.OpenDocumentTree openDocumentTree = new ActivityResultContracts.OpenDocumentTree();
            ComposerKt.sourceInformationMarkerStart($composer3, -1009814627, "CC(remember):AddSkillFromLocalImportDialog.kt#9igjgp");
            boolean invalid$iv = $composer3.changedInstance(skillManagerViewModel);
            Object it$iv2 = $composer3.rememberedValue();
            if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AddSkillFromLocalImportDialogKt.AddSkillFromLocalImportDialog$lambda$5$lambda$4(skillManagerViewModel, (Uri) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final ManagedActivityResultLauncher directoryPickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(openDocumentTree, (Function1) it$iv2, $composer3, 0);
            AndroidDialog_androidKt.Dialog(onDismissRequest, null, ComposableLambdaKt.rememberComposableLambda(435154170, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddSkillFromLocalImportDialogKt.AddSkillFromLocalImportDialog$lambda$23(validating, validationError, directoryPickerLauncher, directoryUri, context, onDismissRequest, skillManagerViewModel, onSuccess, showReplaceSkillConfirmationDialog$delegate2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), $composer3, (($dirty2 >> 3) & 14) | 384, 2);
            if (AddSkillFromLocalImportDialog$lambda$2(showReplaceSkillConfirmationDialog$delegate2)) {
                $composer3.startReplaceGroup(-1235174758);
                ComposerKt.sourceInformation($composer3, "196@7480L46,199@7705L415,215@8144L150,195@7442L859");
                ComposerKt.sourceInformationMarkerStart($composer3, -1009675087, "CC(remember):AddSkillFromLocalImportDialog.kt#9igjgp");
                Object it$iv3 = $composer3.rememberedValue();
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    showReplaceSkillConfirmationDialog$delegate = showReplaceSkillConfirmationDialog$delegate2;
                    Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddSkillFromLocalImportDialogKt.AddSkillFromLocalImportDialog$lambda$25$lambda$24(showReplaceSkillConfirmationDialog$delegate);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv3);
                    it$iv3 = value$iv3;
                } else {
                    showReplaceSkillConfirmationDialog$delegate = showReplaceSkillConfirmationDialog$delegate2;
                }
                Function0 function02 = (Function0) it$iv3;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                skillManagerViewModel2 = skillManagerViewModel;
                function0 = onDismissRequest;
                $composer2 = $composer3;
                AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0(function02, ComposableLambdaKt.rememberComposableLambda(26715510, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddSkillFromLocalImportDialogKt.AddSkillFromLocalImportDialog$lambda$30(skillManagerViewModel2, function0, onSuccess, showReplaceSkillConfirmationDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(240332596, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddSkillFromLocalImportDialogKt.AddSkillFromLocalImportDialog$lambda$33(showReplaceSkillConfirmationDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableSingletons$AddSkillFromLocalImportDialogKt.INSTANCE.getLambda$453949682$app_debug(), ComposableSingletons$AddSkillFromLocalImportDialogKt.INSTANCE.m10453getLambda$1586725423$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
            } else {
                skillManagerViewModel2 = skillManagerViewModel;
                function0 = onDismissRequest;
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-1242579201);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddSkillFromLocalImportDialogKt.AddSkillFromLocalImportDialog$lambda$34(skillManagerViewModel2, function0, onSuccess, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final SkillManagerUiState AddSkillFromLocalImportDialog$lambda$0(State<SkillManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (SkillManagerUiState) thisObj$iv;
    }

    private static final boolean AddSkillFromLocalImportDialog$lambda$2(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void AddSkillFromLocalImportDialog$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromLocalImportDialog$lambda$5$lambda$4(SkillManagerViewModel $skillManagerViewModel, Uri uri) {
        $skillManagerViewModel.setImportDirectoryUri(uri);
        $skillManagerViewModel.setValidationError(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromLocalImportDialog$lambda$23(final boolean $validating, final String $validationError, final ManagedActivityResultLauncher $directoryPickerLauncher, final Uri $directoryUri, final Context $context, final Function0 $onDismissRequest, final SkillManagerViewModel $skillManagerViewModel, final Function0 $onSuccess, final MutableState $showReplaceSkillConfirmationDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C81@3369L4019,81@3293L4095:AddSkillFromLocalImportDialog.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(435154170, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialog.<anonymous> (AddSkillFromLocalImportDialog.kt:81)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(16)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1362828780, true, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AddSkillFromLocalImportDialogKt.AddSkillFromLocalImportDialog$lambda$23$lambda$22($validating, $validationError, $directoryPickerLauncher, $directoryUri, $context, $onDismissRequest, $skillManagerViewModel, $onSuccess, $showReplaceSkillConfirmationDialog$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromLocalImportDialog$lambda$23$lambda$22(boolean $validating, String $validationError, final ManagedActivityResultLauncher $directoryPickerLauncher, final Uri $directoryUri, Context $context, final Function0 $onDismissRequest, final SkillManagerViewModel $skillManagerViewModel, final Function0 $onSuccess, final MutableState $showReplaceSkillConfirmationDialog$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Function0<ComposeUiNode> function04;
        Function0<ComposeUiNode> function05;
        String str;
        long j;
        Composer $composer2;
        Composer $composer3;
        Function0<ComposeUiNode> function06;
        Composer $composer4;
        Composer $composer$iv;
        Composer $composer$iv$iv;
        Function0<ComposeUiNode> function07;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C82@3377L4005:AddSkillFromLocalImportDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362828780, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialog.<anonymous>.<anonymous> (AddSkillFromLocalImportDialog.kt:82)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 980703621, "C86@3506L588,103@4137L1793:AddSkillFromLocalImportDialog.kt#41d64j");
            Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            int $changed$iv$iv2 = (6 << 3) & 112;
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
            int i4 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -87885540, "C89@3614L65,90@3715L10,88@3589L161,95@3810L68,96@3914L10,97@3971L11,94@3785L299:AddSkillFromLocalImportDialog.kt#41d64j");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.add_skill_dialog_title_from_local_import, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131070);
            String strStringResource = StringResources_androidKt.stringResource(C2421R.string.add_skill_dialog_subtitle_from_local_import, $composer, 0);
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
            TextKt.m4781TextNvy7gAk(strStringResource, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(2), 0.0f, 0.0f, 13, null), Color.m6913copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m6917getAlphaimpl(onSurfaceVariant) : 0.7f, (14 & 2) != 0 ? Color.m6921getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(onSurfaceVariant) : 0.0f), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelSmall, $composer, 48, 0, 131064);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Arrangement.Vertical verticalArrangement$iv3 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(2));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv3 = Modifier.INSTANCE;
            Alignment.Horizontal horizontalAlignment$iv3 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv3, horizontalAlignment$iv3, $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
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
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2101156002, "C105@4231L39,106@4306L10,104@4206L135,108@4352L1341:AddSkillFromLocalImportDialog.kt#41d64j");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.pick_skill_dir, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 0, 0, 131070);
            Modifier modifier$iv4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv4 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv4 = (438 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv4 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer, modifier$iv4);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
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
            int i8 = ((438 >> 6) & 112) | 6;
            RowScope $this$AddSkillFromLocalImportDialog_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421_u24lambda_u2413_u24lambda_u2411 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1167799990, "C117@4715L11,113@4555L882,135@5471L40,135@5450L231:AddSkillFromLocalImportDialog.kt#41d64j");
            Modifier modifier$iv5 = PaddingKt.m1989paddingVpY3zN4(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(RowScope.weight$default($this$AddSkillFromLocalImportDialog_u24lambda_u2423_u24lambda_u2422_u24lambda_u2421_u24lambda_u2413_u24lambda_u2411, Modifier.INSTANCE, 1.0f, false, 2, null), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(4))), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 2, null), C1654Dp.m9788constructorimpl(12), C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv5 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv5 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv5 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer, modifier$iv5);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv5 = (($changed$iv$iv5 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function05 = constructor5;
                $composer.createNode(function05);
            } else {
                function05 = constructor5;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv5, Integer.valueOf(compositeKeyHash$iv$iv5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = ($changed$iv$iv$iv5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i10 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1562611930, "C124@5049L10,120@4843L580:AddSkillFromLocalImportDialog.kt#41d64j");
            String displayName = $directoryUri != null ? SkillManagerViewModelKt.getDisplayName($context, $directoryUri) : null;
            if (displayName == null) {
                $composer.startReplaceGroup(1612164455);
                ComposerKt.sourceInformation($composer, "123@4963L46");
                String strStringResource2 = StringResources_androidKt.stringResource(C2421R.string.no_directory_selected, $composer, 0);
                $composer.endReplaceGroup();
                str = strStringResource2;
            } else {
                $composer.startReplaceGroup(1612162192);
                $composer.endReplaceGroup();
                str = displayName;
            }
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium();
            if ($directoryUri == null) {
                $composer.startReplaceGroup(-1562332094);
                ComposerKt.sourceInformation($composer, "127@5176L11");
                long onSurfaceVariant2 = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                long jM6913copywmQWz5c = Color.m6913copywmQWz5c(onSurfaceVariant2, (14 & 1) != 0 ? Color.m6917getAlphaimpl(onSurfaceVariant2) : 0.7f, (14 & 2) != 0 ? Color.m6921getRedimpl(onSurfaceVariant2) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(onSurfaceVariant2) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(onSurfaceVariant2) : 0.0f);
                $composer.endReplaceGroup();
                j = jM6913copywmQWz5c;
            } else {
                $composer.startReplaceGroup(-1562224772);
                ComposerKt.sourceInformation($composer, "129@5285L11");
                long onSurface = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface();
                $composer.endReplaceGroup();
                j = onSurface;
            }
            TextKt.m4781TextNvy7gAk(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9685getEllipsisgIe3tQ8(), false, 1, 0, null, bodyMedium, $composer, 0, 24960, 110586);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 516546587, "CC(remember):AddSkillFromLocalImportDialog.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($directoryPickerLauncher);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddSkillFromLocalImportDialogKt.m418x7f9a930b($directoryPickerLauncher);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) it$iv, null, false, null, null, null, ComposableSingletons$AddSkillFromLocalImportDialogKt.INSTANCE.m10455getLambda$258048623$app_debug(), $composer, 1572864, 62);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($validationError == null) {
                $composer2 = $composer;
                $composer2.startReplaceGroup(2102611915);
                $composer2.endReplaceGroup();
            } else {
                $composer2 = $composer;
                $composer2.startReplaceGroup(2102611916);
                ComposerKt.sourceInformation($composer2, "*145@5818L11,146@5873L10,143@5748L160");
                TextKt.m4781TextNvy7gAk($validationError, null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, 0, 0, 131066);
                Unit unit = Unit.INSTANCE;
                $composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($validating) {
                $composer3 = $composer;
                $composer3.startReplaceGroup(983064270);
                ComposerKt.sourceInformation($composer3, "153@6009L284");
                Modifier modifier$iv6 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment contentAlignment$iv2 = Alignment.INSTANCE.getCenterEnd();
                ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv6 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
                int $changed$iv$iv6 = (54 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap localMap$iv$iv6 = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv6 = ComposedModifierKt.materializeModifier($composer3, modifier$iv6);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                int $i$f$Box = $changed$iv$iv6 << 6;
                int $changed$iv$iv$iv6 = ($i$f$Box & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function07 = constructor6;
                    $composer3.createNode(function07);
                } else {
                    function07 = constructor6;
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv6 = Updater.m6165constructorimpl($composer3);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, measurePolicy$iv6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, localMap$iv$iv6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv6, Integer.valueOf(compositeKeyHash$iv$iv6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, materialized$iv$iv6, ComposeUiNode.INSTANCE.getSetModifier());
                int i11 = ($changed$iv$iv$iv6 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i12 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -1482388946, "C157@6247L11,154@6103L178:AddSkillFromLocalImportDialog.kt#41d64j");
                ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary(), C1654Dp.m9788constructorimpl(2), 0L, 0, 0.0f, $composer3, 390, 56);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            } else {
                $composer3 = $composer;
                $composer3.startReplaceGroup(983397303);
                ComposerKt.sourceInformation($composer3, "162@6345L1019");
                Modifier modifier$iv7 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 13, null);
                Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getEnd();
                ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv7 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                int $changed$iv$iv7 = (54 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap localMap$iv$iv7 = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv7 = ComposedModifierKt.materializeModifier($composer3, modifier$iv7);
                Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv7 = (($changed$iv$iv7 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function06 = constructor7;
                    $composer3.createNode(function06);
                } else {
                    function06 = constructor7;
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv7 = Updater.m6165constructorimpl($composer3);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv7, measurePolicy$iv7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv7, localMap$iv$iv7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv7, Integer.valueOf(compositeKeyHash$iv$iv7), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv7, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv7, materialized$iv$iv7, ComposeUiNode.INSTANCE.getSetModifier());
                int i13 = ($changed$iv$iv$iv7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i14 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -944494558, "C166@6497L84,167@6594L39,170@6724L548,168@6646L706:AddSkillFromLocalImportDialog.kt#41d64j");
                ButtonKt.OutlinedButton($onDismissRequest, null, false, null, null, null, null, null, null, ComposableSingletons$AddSkillFromLocalImportDialogKt.INSTANCE.m10454getLambda$1678582948$app_debug(), $composer3, 805306368, 510);
                SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8)), $composer3, 6);
                boolean z = $directoryUri != null;
                ComposerKt.sourceInformationMarkerStart($composer3, -584649938, "CC(remember):AddSkillFromLocalImportDialog.kt#9igjgp");
                boolean invalid$iv2 = $composer3.changedInstance($directoryUri) | $composer3.changedInstance($skillManagerViewModel) | $composer3.changed($onDismissRequest) | $composer3.changed($onSuccess);
                Object it$iv2 = $composer3.rememberedValue();
                if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                    $composer4 = $composer3;
                    $composer$iv = $composer3;
                    $composer$iv$iv = $composer3;
                    Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AddSkillFromLocalImportDialogKt.m419x1c91eb81($directoryUri, $skillManagerViewModel, $showReplaceSkillConfirmationDialog$delegate, $onDismissRequest, $onSuccess);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                } else {
                    $composer4 = $composer3;
                    $composer$iv = $composer3;
                    $composer$iv$iv = $composer3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ButtonKt.Button((Function0) it$iv2, null, z, null, null, null, null, null, null, ComposableSingletons$AddSkillFromLocalImportDialogKt.INSTANCE.getLambda$2012313946$app_debug(), $composer4, 805306368, 506);
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromLocalImportDialog$lambda$23$lambda$22$lambda$21$lambda$13$lambda$11$lambda$10$lambda$9 */
    public static final Unit m418x7f9a930b(ManagedActivityResultLauncher $directoryPickerLauncher) {
        $directoryPickerLauncher.launch(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromLocalImportDialog$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18 */
    public static final Unit m419x1c91eb81(Uri $directoryUri, SkillManagerViewModel $skillManagerViewModel, MutableState $showReplaceSkillConfirmationDialog$delegate, final Function0 $onDismissRequest, final Function0 $onSuccess) {
        if ($directoryUri != null) {
            if ($skillManagerViewModel.checkLocalSkillExisted($directoryUri)) {
                AddSkillFromLocalImportDialog$lambda$3($showReplaceSkillConfirmationDialog$delegate, true);
            } else {
                $skillManagerViewModel.validateAndAddSkillFromLocalImport(new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddSkillFromLocalImportDialogKt.m420x965a3f3d($onDismissRequest, $onSuccess);
                    }
                }, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AddSkillFromLocalImportDialogKt.m421x965a3f3e((String) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromLocalImportDialog$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17$lambda$15 */
    public static final Unit m420x965a3f3d(Function0 $onDismissRequest, Function0 $onSuccess) {
        $onDismissRequest.invoke();
        $onSuccess.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromLocalImportDialog$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19$lambda$18$lambda$17$lambda$16 */
    public static final Unit m421x965a3f3e(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromLocalImportDialog$lambda$25$lambda$24(MutableState $showReplaceSkillConfirmationDialog$delegate) {
        AddSkillFromLocalImportDialog$lambda$3($showReplaceSkillConfirmationDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromLocalImportDialog$lambda$30(final SkillManagerViewModel $skillManagerViewModel, final Function0 $onDismissRequest, final Function0 $onSuccess, final MutableState $showReplaceSkillConfirmationDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C201@7743L298,200@7715L397:AddSkillFromLocalImportDialog.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(26715510, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialog.<anonymous> (AddSkillFromLocalImportDialog.kt:200)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -96197152, "CC(remember):AddSkillFromLocalImportDialog.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($skillManagerViewModel) | $composer.changed($onDismissRequest) | $composer.changed($onSuccess);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddSkillFromLocalImportDialogKt.AddSkillFromLocalImportDialog$lambda$30$lambda$29$lambda$28($skillManagerViewModel, $showReplaceSkillConfirmationDialog$delegate, $onDismissRequest, $onSuccess);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$AddSkillFromLocalImportDialogKt.INSTANCE.getLambda$1692142470$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromLocalImportDialog$lambda$30$lambda$29$lambda$28(SkillManagerViewModel $skillManagerViewModel, MutableState $showReplaceSkillConfirmationDialog$delegate, final Function0 $onDismissRequest, final Function0 $onSuccess) {
        AddSkillFromLocalImportDialog$lambda$3($showReplaceSkillConfirmationDialog$delegate, false);
        $skillManagerViewModel.validateAndAddSkillFromLocalImport(new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AddSkillFromLocalImportDialogKt.m422x5dc748b0($onDismissRequest, $onSuccess);
            }
        }, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddSkillFromLocalImportDialogKt.m423x5dc748b1((String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromLocalImportDialog$lambda$30$lambda$29$lambda$28$lambda$26 */
    public static final Unit m422x5dc748b0(Function0 $onDismissRequest, Function0 $onSuccess) {
        $onDismissRequest.invoke();
        $onSuccess.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AddSkillFromLocalImportDialog$lambda$30$lambda$29$lambda$28$lambda$27 */
    public static final Unit m423x5dc748b1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromLocalImportDialog$lambda$33(final MutableState $showReplaceSkillConfirmationDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C216@8179L46,216@8154L132:AddSkillFromLocalImportDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240332596, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialog.<anonymous> (AddSkillFromLocalImportDialog.kt:216)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -968608062, "CC(remember):AddSkillFromLocalImportDialog.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillFromLocalImportDialogKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddSkillFromLocalImportDialogKt.AddSkillFromLocalImportDialog$lambda$33$lambda$32$lambda$31($showReplaceSkillConfirmationDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.OutlinedButton((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$AddSkillFromLocalImportDialogKt.INSTANCE.getLambda$2015295490$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddSkillFromLocalImportDialog$lambda$33$lambda$32$lambda$31(MutableState $showReplaceSkillConfirmationDialog$delegate) {
        AddSkillFromLocalImportDialog$lambda$3($showReplaceSkillConfirmationDialog$delegate, false);
        return Unit.INSTANCE;
    }
}
