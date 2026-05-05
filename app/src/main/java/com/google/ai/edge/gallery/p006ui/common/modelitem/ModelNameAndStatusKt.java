package com.google.ai.edge.gallery.p006ui.common.modelitem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.p006ui.common.UtilsKt;
import com.google.ai.edge.gallery.p006ui.theme.TypeKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ModelNameAndStatus.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m921d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\r\u001a;\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\tX\u008a\u008e\u0002"}, m922d2 = {"ModelNameAndStatus", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "downloadStatus", "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;", "isExpanded", "", "modifier", "Landroidx/compose/ui/Modifier;", "showModelSizeAndDownloadProgressLabel", "(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;ZLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "ModelStatusDetails", "(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "showUpdateDialog"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ModelNameAndStatusKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelNameAndStatus$lambda$16(Model model, Task task, ModelDownloadStatus modelDownloadStatus, boolean z, Modifier modifier, boolean z2, int i, int i2, Composer composer, int i3) {
        ModelNameAndStatus(model, task, modelDownloadStatus, z, modifier, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelStatusDetails$lambda$20(Model model, Task task, ModelDownloadStatus modelDownloadStatus, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ModelStatusDetails(model, task, modelDownloadStatus, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09b6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0433  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ModelNameAndStatus(final com.google.ai.edge.gallery.data.Model r103, final com.google.ai.edge.gallery.data.Task r104, final com.google.ai.edge.gallery.data.ModelDownloadStatus r105, final boolean r106, androidx.compose.p000ui.Modifier r107, boolean r108, androidx.compose.runtime.Composer r109, final int r110, final int r111) {
        /*
            Method dump skipped, instruction units count: 2569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.common.modelitem.ModelNameAndStatusKt.ModelNameAndStatus(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.ModelDownloadStatus, boolean, androidx.compose.ui.Modifier, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean ModelNameAndStatus$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ModelNameAndStatus$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelNameAndStatus$lambda$15$lambda$5$lambda$4(MutableState $showUpdateDialog$delegate) {
        ModelNameAndStatus$lambda$2($showUpdateDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelNameAndStatus$lambda$15$lambda$8$lambda$7(MutableState $showUpdateDialog$delegate) {
        ModelNameAndStatus$lambda$2($showUpdateDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelNameAndStatus$lambda$15$lambda$12(Model $model, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C138@5285L22:ModelNameAndStatus.kt#13a6jo");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1575340266, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelNameAndStatus.<anonymous>.<anonymous> (ModelNameAndStatus.kt:138)");
            }
            TextKt.m4781TextNvy7gAk($model.getUpdateInfo(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelNameAndStatus$lambda$15$lambda$11(final MutableState $showUpdateDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C140@5368L28,140@5347L118:ModelNameAndStatus.kt#13a6jo");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-721142981, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelNameAndStatus.<anonymous>.<anonymous> (ModelNameAndStatus.kt:140)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1528669001, "CC(remember):ModelNameAndStatus.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelNameAndStatusKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModelNameAndStatusKt.ModelNameAndStatus$lambda$15$lambda$11$lambda$10$lambda$9($showUpdateDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$ModelNameAndStatusKt.INSTANCE.getLambda$2020499614$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelNameAndStatus$lambda$15$lambda$11$lambda$10$lambda$9(MutableState $showUpdateDialog$delegate) {
        ModelNameAndStatus$lambda$2($showUpdateDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void ModelStatusDetails(final Model model, final Task task, final ModelDownloadStatus downloadStatus, final boolean isExpanded, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        Modifier modifier3;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(model, "model");
        Composer $composer3 = $composer.startRestartGroup(-1160465404);
        ComposerKt.sourceInformation($composer3, "C(ModelStatusDetails)P(2,4)198@7073L2923:ModelNameAndStatus.kt#13a6jo");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(model) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(task) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(downloadStatus) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(isExpanded) ? 2048 : 1024;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1160465404, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelStatusDetails (ModelNameAndStatus.kt:193)");
            }
            boolean inProgress = (downloadStatus != null ? downloadStatus.getStatus() : null) == ModelDownloadStatusType.IN_PROGRESS;
            boolean isPartiallyDownloaded = (downloadStatus != null ? downloadStatus.getStatus() : null) == ModelDownloadStatusType.PARTIALLY_DOWNLOADED;
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            int $changed$iv = (($dirty2 >> 12) & 14) | 384;
            Modifier modifier$iv = modifier3;
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
            int $changed$iv$iv = ($changed$iv << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = (($changed$iv >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 465691863, "C200@7172L143:ModelNameAndStatus.kt#13a6jo");
            $composer2 = $composer3;
            StatusIconKt.StatusIcon(task, model, downloadStatus, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(4), 0.0f, 11, null), $composer3, (($dirty2 >> 3) & 14) | 3072 | (($dirty2 << 3) & 112) | ($dirty2 & 896), 0);
            if (downloadStatus == null || downloadStatus.getStatus() != ModelDownloadStatusType.FAILED) {
                $composer3.startReplaceGroup(466229061);
                ComposerKt.sourceInformation($composer3, "257@9310L676");
                Object sizeLabel = UtilsKt.humanReadableSize$default(model.getTotalBytes(), false, false, 3, null);
                if (model.getLocalFileRelativeDirPathOverride().length() > 0) {
                    sizeLabel = "{ext_files_dir}/" + model.getLocalFileRelativeDirPathOverride();
                }
                if (downloadStatus != null) {
                    if (inProgress || isPartiallyDownloaded) {
                        long totalSize = downloadStatus.getTotalBytes();
                        if (totalSize == 0) {
                            totalSize = model.getTotalBytes();
                        }
                        sizeLabel = UtilsKt.humanReadableSize$default(downloadStatus.getReceivedBytes(), false, true, 1, null) + " of " + UtilsKt.humanReadableSize$default(totalSize, false, false, 3, null);
                        if (downloadStatus.getBytesPerSecond() > 0) {
                            sizeLabel = sizeLabel + " · " + UtilsKt.humanReadableSize$default(downloadStatus.getBytesPerSecond(), false, false, 3, null) + " / s";
                        }
                        if (isPartiallyDownloaded) {
                            sizeLabel = sizeLabel + " (resuming...)";
                        }
                        float curDownloadProgress = downloadStatus.getReceivedBytes() / downloadStatus.getTotalBytes();
                        if (Float.isNaN(curDownloadProgress)) {
                        }
                    } else if (downloadStatus.getStatus() == ModelDownloadStatusType.UNZIPPING) {
                        sizeLabel = "Unzipping...";
                    }
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal horizontalAlignment$iv = isExpanded ? companion.getCenterHorizontally() : companion.getStart();
                ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier$iv2 = Modifier.INSTANCE;
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                int $changed$iv$iv2 = (0 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function0 = constructor2;
                    $composer3.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer3);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = ($changed$iv$iv$iv2 >> 6) & 14;
                int i6 = 0;
                ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i7 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 676314271, "C:ModelNameAndStatus.kt#13a6jo");
                $composer3.startReplaceGroup(-1363656732);
                ComposerKt.sourceInformation($composer3, "*263@9559L11,266@9663L10,261@9501L467");
                int i8 = 0;
                Iterator it = StringsKt.split$default((CharSequence) sizeLabel, new String[]{"\n"}, false, 0, 6, (Object) null).iterator();
                while (it.hasNext()) {
                    int index = i8;
                    i8++;
                    String line = (String) it.next();
                    Object sizeLabel2 = sizeLabel;
                    Iterator it2 = it;
                    TextKt.m4781TextNvy7gAk(line, OffsetKt.m1945offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, index == 0 ? C1654Dp.m9788constructorimpl(0) : C1654Dp.m9788constructorimpl(-1), 1, null), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9688getVisiblegIe3tQ8(), false, 1, 0, null, TextStyle.m9205copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), 0L, 0L, null, null, null, null, "tnum", 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777151, null), $composer3, 0, 24960, 110584);
                    i6 = i6;
                    sizeLabel = sizeLabel2;
                    it = it2;
                    materialized$iv$iv2 = materialized$iv$iv2;
                }
                $composer3.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(465870701);
                ComposerKt.sourceInformation($composer3, "209@7440L255");
                Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier modifier$iv$iv = Modifier.INSTANCE;
                Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                int $changed$iv$iv3 = (384 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv$iv);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function02 = constructor3;
                    $composer3.createNode(function02);
                } else {
                    function02 = constructor3;
                    $composer3.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer3);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = ($changed$iv$iv$iv3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i10 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 564133731, "C212@7579L11,210@7502L185:ModelNameAndStatus.kt#13a6jo");
                TextKt.m4781TextNvy7gAk(downloadStatus.getErrorMessage(), null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getError(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9685getEllipsisgIe3tQ8(), false, 0, 0, null, TypeKt.getLabelSmallNarrow(), $composer3, 0, 12583296, 126970);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelNameAndStatusKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModelNameAndStatusKt.ModelStatusDetails$lambda$20(model, task, downloadStatus, isExpanded, modifier4, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
