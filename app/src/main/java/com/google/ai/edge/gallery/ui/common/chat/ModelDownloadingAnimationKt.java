package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.RotationalLoaderKt;
import com.google.ai.edge.gallery.ui.common.UtilsKt;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.ui.theme.TypeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelDownloadingAnimation.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002"}, m922d2 = {"ModelDownloadingAnimation", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Landroidx/compose/runtime/Composer;I)V", "app_debug", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "downloadStatus", "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ModelDownloadingAnimationKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelDownloadingAnimation$lambda$6(Model model, Task task, ModelManagerViewModel modelManagerViewModel, int i, Composer composer, int i2) {
        ModelDownloadingAnimation(model, task, modelManagerViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ModelDownloadingAnimation(final Model model, final Task task, final ModelManagerViewModel modelManagerViewModel, Composer $composer, final int $changed) {
        Function0<ComposeUiNode> function0;
        boolean isPartiallyDownloaded;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Composer $composer2 = $composer.startRestartGroup(-432898476);
        ComposerKt.sourceInformation($composer2, "C(ModelDownloadingAnimation)P(!1,2)54@2201L16,55@2242L89:ModelDownloadingAnimation.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(model) ? 4 : 2;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(modelManagerViewModel) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty & 131) != 130, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-432898476, $dirty, -1, "com.google.ai.edge.gallery.ui.common.chat.ModelDownloadingAnimation (ModelDownloadingAnimation.kt:53)");
            }
            final State modelManagerUiState$delegate = SnapshotStateKt.collectAsState(modelManagerViewModel.getUiState(), null, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, 596399565, "CC(remember):ModelDownloadingAnimation.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.ModelDownloadingAnimationKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModelDownloadingAnimationKt.ModelDownloadingAnimation$lambda$2$lambda$1(model, modelManagerUiState$delegate);
                    }
                });
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            State downloadStatus$delegate = (State) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ModelDownloadStatus modelDownloadStatusModelDownloadingAnimation$lambda$3 = ModelDownloadingAnimation$lambda$3(downloadStatus$delegate);
            boolean inProgress = (modelDownloadStatusModelDownloadingAnimation$lambda$3 != null ? modelDownloadStatusModelDownloadingAnimation$lambda$3.getStatus() : null) == ModelDownloadStatusType.IN_PROGRESS;
            ModelDownloadStatus modelDownloadStatusModelDownloadingAnimation$lambda$32 = ModelDownloadingAnimation$lambda$3(downloadStatus$delegate);
            boolean isPartiallyDownloaded2 = (modelDownloadStatusModelDownloadingAnimation$lambda$32 != null ? modelDownloadStatusModelDownloadingAnimation$lambda$32.getStatus() : null) == ModelDownloadStatusType.PARTIALLY_DOWNLOADED;
            ModelDownloadStatus curDownloadStatus = ModelDownloadingAnimation$lambda$3(downloadStatus$delegate);
            if (curDownloadStatus == null || curDownloadStatus.getStatus() != ModelDownloadStatusType.FAILED) {
                float curDownloadProgress = 0.0f;
                $composer2.startReplaceGroup(1309309569);
                ComposerKt.sourceInformation($composer2, "76@2988L1955");
                Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifier$iv$iv = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(32), 0.0f, 0.0f, 13, null);
                ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                int $changed$iv$iv = (390 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv$iv);
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
                int i = ($changed$iv$iv$iv >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i2 = ((390 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, 1134361769, "C81@3133L31,83@3172L41:ModelDownloadingAnimation.kt#ouynps");
                RotationalLoaderKt.m10889RotationalLoader8Feqmps(C1654Dp.m9788constructorimpl(160), $composer2, 6);
                SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(32)), $composer2, 6);
                String sizeLabel = UtilsKt.humanReadableSize$default(model.getTotalBytes(), false, false, 3, null);
                if (curDownloadStatus != null) {
                    $composer2.startReplaceGroup(1134555890);
                    ComposerKt.sourceInformation($composer2, "118@4697L11,119@4759L10,116@4638L291");
                    if (inProgress || isPartiallyDownloaded2) {
                        long totalSize = curDownloadStatus.getTotalBytes();
                        if (totalSize == 0) {
                            totalSize = model.getTotalBytes();
                        }
                        String sizeLabel2 = UtilsKt.humanReadableSize$default(curDownloadStatus.getReceivedBytes(), false, true, 1, null) + " of " + UtilsKt.humanReadableSize$default(totalSize, false, false, 3, null);
                        if (curDownloadStatus.getBytesPerSecond() > 0) {
                            String sizeLabel3 = sizeLabel2 + " · " + UtilsKt.humanReadableSize$default(curDownloadStatus.getBytesPerSecond(), false, false, 3, null) + " / s";
                            sizeLabel2 = curDownloadStatus.getRemainingMs() >= 0 ? sizeLabel3 + " · " + UtilsKt.formatToHourMinSecond(curDownloadStatus.getRemainingMs()) + " left" : sizeLabel3;
                        }
                        if (isPartiallyDownloaded2) {
                            sizeLabel2 = sizeLabel2 + " (resuming...)";
                        }
                        String sizeLabel4 = sizeLabel2;
                        isPartiallyDownloaded = isPartiallyDownloaded2;
                        float curDownloadProgress2 = curDownloadStatus.getReceivedBytes() / curDownloadStatus.getTotalBytes();
                        if (!Float.isNaN(curDownloadProgress2)) {
                            curDownloadProgress = curDownloadProgress2;
                            sizeLabel = sizeLabel4;
                        } else {
                            curDownloadProgress = 0.0f;
                            sizeLabel = sizeLabel4;
                        }
                    } else if (curDownloadStatus.getStatus() == ModelDownloadStatusType.UNZIPPING) {
                        sizeLabel = "Unzipping...";
                        isPartiallyDownloaded = isPartiallyDownloaded2;
                    } else {
                        isPartiallyDownloaded = isPartiallyDownloaded2;
                    }
                    TextKt.m4781TextNvy7gAk(sizeLabel, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(4), 7, null), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m9620boximpl(TextAlign.INSTANCE.m9627getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m9688getVisiblegIe3tQ8(), false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getLabelMedium(), $composer2, 48, 384, 125944);
                    $composer2.endReplaceGroup();
                } else {
                    $composer2.startReplaceGroup(1131196916);
                    $composer2.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(1308980752);
                ComposerKt.sourceInformation($composer2, "65@2710L244");
                Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier modifier$iv = Modifier.INSTANCE;
                Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                int $changed$iv$iv2 = (384 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    function02 = constructor2;
                    $composer2.createNode(function02);
                } else {
                    function02 = constructor2;
                    $composer2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer2);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i4 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, 161012702, "C68@2846L11,66@2770L178:ModelDownloadingAnimation.kt#ouynps");
                TextKt.m4781TextNvy7gAk(curDownloadStatus.getErrorMessage(), null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9685getEllipsisgIe3tQ8(), false, 0, 0, null, TypeKt.getLabelSmallNarrow(), $composer2, 0, 12583296, 126970);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ModelDownloadingAnimationKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModelDownloadingAnimationKt.ModelDownloadingAnimation$lambda$6(model, task, modelManagerViewModel, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ModelManagerUiState ModelDownloadingAnimation$lambda$0(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final ModelDownloadStatus ModelDownloadingAnimation$lambda$3(State<ModelDownloadStatus> state) {
        Object thisObj$iv = state.getValue();
        return (ModelDownloadStatus) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ModelDownloadStatus ModelDownloadingAnimation$lambda$2$lambda$1(Model $model, State $modelManagerUiState$delegate) {
        return ModelDownloadingAnimation$lambda$0($modelManagerUiState$delegate).getModelDownloadStatus().get($model.getName());
    }
}
