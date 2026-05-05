package com.google.ai.edge.gallery.ui.common.modelitem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



V", "app_debug", "showConfirmDeleteDialog"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class DeleteModelButtonKt {

    
    
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModelDownloadStatusType.values().length];
            try {
                iArr[ModelDownloadStatusType.SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    
    public static final Unit DeleteModelButton$lambda$10(Model model, ModelManagerViewModel modelManagerViewModel, ModelDownloadStatus modelDownloadStatus, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        DeleteModelButton(model, modelManagerViewModel, modelDownloadStatus, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void DeleteModelButton(final Model model, final ModelManagerViewModel modelManagerViewModel, final ModelDownloadStatus downloadStatus, Modifier modifier, boolean showDeleteButton, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        Modifier modifier3;
        boolean showDeleteButton2;
        Modifier.Companion modifier4;
        boolean showDeleteButton3;
        Function0<ComposeUiNode> function0;
        boolean showDeleteButton4;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Composer $composer2 = $composer.startRestartGroup(-1925179487);
        ComposerKt.sourceInformation($composer2, "C(DeleteModelButton)P(1,2)48@1902L34,50@1940L611:DeleteModelButton.kt#13a6jo");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(model) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(modelManagerViewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(downloadStatus) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty |= 24576;
            z = showDeleteButton;
        } else if (($changed & 24576) == 0) {
            z = showDeleteButton;
            $dirty |= $composer2.changed(z) ? 16384 : 8192;
        } else {
            z = showDeleteButton;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i3 == 0) {
                showDeleteButton3 = z;
            } else {
                showDeleteButton3 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1925179487, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.modelitem.DeleteModelButton (DeleteModelButton.kt:47)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1033425443, "CC(remember):DeleteModelButton.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState showConfirmDeleteDialog$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            int $changed$iv = (($dirty2 >> 9) & 14) | 384;
            Modifier modifier$iv = modifier4;
            modifier3 = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
            int $changed$iv$iv = ($changed$iv << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i5 = (($changed$iv >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 226961238, "C:DeleteModelButton.kt#13a6jo");
            ModelDownloadStatusType status = downloadStatus != null ? downloadStatus.getStatus() : null;
            if ((status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) == 1) {
                $composer2.startReplaceGroup(227071008);
                ComposerKt.sourceInformation($composer2, "");
                if (showDeleteButton3) {
                    $composer2.startReplaceGroup(227101512);
                    ComposerKt.sourceInformation($composer2, "55@2199L34,55@2178L327");
                    ComposerKt.sourceInformationMarkerStart($composer2, -1239599393, "CC(remember):DeleteModelButton.kt#9igjgp");
                    Object value$iv2 = $composer2.rememberedValue();
                    showDeleteButton4 = showDeleteButton3;
                    if (value$iv2 == Composer.INSTANCE.getEmpty()) {
                        value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.DeleteModelButtonKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DeleteModelButtonKt.DeleteModelButton$lambda$5$lambda$4$lambda$3(showConfirmDeleteDialog$delegate);
                            }
                        };
                        $composer2.updateRememberedValue(value$iv2);
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    IconButtonKt.IconButton((Function0) value$iv2, null, false, null, null, null, ComposableSingletons$DeleteModelButtonKt.INSTANCE.m11009getLambda$1654224660$app_debug(), $composer2, 1572870, 62);
                } else {
                    showDeleteButton4 = showDeleteButton3;
                    $composer2.startReplaceGroup(224941029);
                }
                $composer2.endReplaceGroup();
                $composer2.endReplaceGroup();
            } else {
                showDeleteButton4 = showDeleteButton3;
                $composer2.startReplaceGroup(227460771);
                $composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (DeleteModelButton$lambda$1(showConfirmDeleteDialog$delegate)) {
                $composer2.startReplaceGroup(1972100686);
                ComposerKt.sourceInformation($composer2, "73@2655L106,77@2781L35,71@2590L233");
                ComposerKt.sourceInformationMarkerStart($composer2, 1033449611, "CC(remember):DeleteModelButton.kt#9igjgp");
                boolean invalid$iv = $composer2.changedInstance(modelManagerViewModel) | $composer2.changedInstance(model);
                Object it$iv2 = $composer2.rememberedValue();
                if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.DeleteModelButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DeleteModelButtonKt.DeleteModelButton$lambda$7$lambda$6(modelManagerViewModel, model, showConfirmDeleteDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv3);
                    it$iv2 = value$iv3;
                }
                Function0 function02 = (Function0) it$iv2;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1033453572, "CC(remember):DeleteModelButton.kt#9igjgp");
                Object it$iv3 = $composer2.rememberedValue();
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv4 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.DeleteModelButtonKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DeleteModelButtonKt.DeleteModelButton$lambda$9$lambda$8(showConfirmDeleteDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv4);
                    it$iv3 = value$iv4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ConfirmDeleteModelDialogKt.ConfirmDeleteModelDialog(model, function02, (Function0) it$iv3, $composer2, ($dirty2 & 14) | 384);
            } else {
                $composer2.startReplaceGroup(1969528833);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            showDeleteButton2 = showDeleteButton4;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            showDeleteButton2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            final boolean z2 = showDeleteButton2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.DeleteModelButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeleteModelButtonKt.DeleteModelButton$lambda$10(model, modelManagerViewModel, downloadStatus, modifier5, z2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean DeleteModelButton$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void DeleteModelButton$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    
    public static final Unit DeleteModelButton$lambda$5$lambda$4$lambda$3(MutableState $showConfirmDeleteDialog$delegate) {
        DeleteModelButton$lambda$2($showConfirmDeleteDialog$delegate, true);
        return Unit.INSTANCE;
    }

    
    public static final Unit DeleteModelButton$lambda$7$lambda$6(ModelManagerViewModel $modelManagerViewModel, Model $model, MutableState $showConfirmDeleteDialog$delegate) {
        $modelManagerViewModel.deleteModel($model);
        DeleteModelButton$lambda$2($showConfirmDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit DeleteModelButton$lambda$9$lambda$8(MutableState $showConfirmDeleteDialog$delegate) {
        DeleteModelButton$lambda$2($showConfirmDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }
}
