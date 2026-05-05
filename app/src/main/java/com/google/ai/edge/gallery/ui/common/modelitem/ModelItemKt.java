package com.google.ai.edge.gallery.ui.common.modelitem;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.MarkdownTextKt;
import com.google.ai.edge.gallery.ui.common.tos.TosViewModel;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelItem.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m921d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aµ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a{\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u001f\u001aE\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010!2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\"\u001a\u0010\u0010#\u001a\u00020$2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\f\u0010(\u001a\u0004\u0018\u00010\u001bX\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u000eX\u008a\u008e\u0002"}, m922d2 = {"ModelItem", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "onModelClicked", "Lkotlin/Function1;", "onBenchmarkClicked", "modifier", "Landroidx/compose/ui/Modifier;", "expanded", "", "showDeleteButton", "canExpand", "showBenchmarkButton", "onExpanded", "modelVariants", "", "tosViewModel", "Lcom/google/ai/edge/gallery/ui/common/tos/TosViewModel;", "(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/Boolean;ZZZLkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/google/ai/edge/gallery/ui/common/tos/TosViewModel;Landroidx/compose/runtime/Composer;III)V", "ModelVariantHeader", "variantModel", "downloadStatus", "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;", "isExpanded", "labelModifier", "menuModifier", "(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;ZLcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "ModelItemActionMenu", "Lkotlin/Function0;", "(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "calculateDownloadProgress", "", "app_debug", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "variantDownloadStatus", "showMenu", "showConfirmDeleteDialog"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ModelItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItem$lambda$36(Model model, Task task, ModelManagerViewModel modelManagerViewModel, Function1 function1, Function1 function12, Modifier modifier, Boolean bool, boolean z, boolean z2, boolean z3, Function1 function13, List list, TosViewModel tosViewModel, int i, int i2, int i3, Composer composer, int i4) {
        ModelItem(model, task, modelManagerViewModel, function1, function12, modifier, bool, z, z2, z3, function13, list, tosViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItemActionMenu$lambda$62(Model model, ModelManagerViewModel modelManagerViewModel, boolean z, Function0 function0, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ModelItemActionMenu(model, modelManagerViewModel, z, function0, z2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelVariantHeader$lambda$41(Model model, Task task, ModelDownloadStatus modelDownloadStatus, boolean z, ModelManagerViewModel modelManagerViewModel, boolean z2, boolean z3, Function1 function1, Modifier modifier, Modifier modifier2, Modifier modifier3, int i, int i2, int i3, Composer composer, int i4) {
        ModelVariantHeader(model, task, modelDownloadStatus, z, modelManagerViewModel, z2, z3, function1, modifier, modifier2, modifier3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItem$lambda$1$lambda$0(boolean it) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:271:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0ad1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ModelItem(final com.google.ai.edge.gallery.data.Model r136, final com.google.ai.edge.gallery.data.Task r137, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r138, final kotlin.jvm.functions.Function1<? super com.google.ai.edge.gallery.data.Model, kotlin.Unit> r139, final kotlin.jvm.functions.Function1<? super com.google.ai.edge.gallery.data.Model, kotlin.Unit> r140, androidx.compose.p000ui.Modifier r141, java.lang.Boolean r142, boolean r143, boolean r144, boolean r145, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r146, java.util.List<com.google.ai.edge.gallery.data.Model> r147, com.google.ai.edge.gallery.ui.common.tos.TosViewModel r148, androidx.compose.runtime.Composer r149, final int r150, final int r151, final int r152) {
        /*
    public static final void ModelItem(final com.google.ai.edge.gallery.data.Model r136, final com.google.ai.edge.gallery.data.Task r137, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r138, final kotlin.jvm.functions.Function1<? super com.google.ai.edge.gallery.data.Model, kotlin.Unit> r139, final kotlin.jvm.functions.Function1<? super com.google.ai.edge.gallery.data.Model, kotlin.Unit> r140, androidx.compose.p000ui.Modifier r141, java.lang.Boolean r142, boolean r143, boolean r144, boolean r145, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r146, java.util.List<com.google.ai.edge.gallery.data.Model> r147, com.google.ai.edge.gallery.ui.common.tos.TosViewModel r148, androidx.compose.runtime.Composer r149, final int r150, final int r151, final int r152) {
            // Method dump skipped - placeholder implementation
        }

    private static final ModelManagerUiState ModelItem$lambda$2(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final ModelDownloadStatus ModelItem$lambda$5(State<ModelDownloadStatus> state) {
        Object thisObj$iv = state.getValue();
        return (ModelDownloadStatus) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ModelDownloadStatus ModelItem$lambda$4$lambda$3(Model $model, State $modelManagerUiState$delegate) {
        return ModelItem$lambda$2($modelManagerUiState$delegate).getModelDownloadStatus().get($model.getName());
    }

    private static final boolean ModelItem$lambda$7(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ModelItem$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItem$lambda$11$lambda$10(Model $model, Function1 $onExpanded, boolean $showBenchmarkButton, Function1 $onModelClicked, MutableState $isExpanded$delegate) {
        if (!$model.getImported()) {
            ModelItem$lambda$8($isExpanded$delegate, !ModelItem$lambda$7($isExpanded$delegate));
            $onExpanded.invoke(Boolean.valueOf(ModelItem$lambda$7($isExpanded$delegate)));
        } else if (!$showBenchmarkButton) {
            $onModelClicked.invoke($model);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItem$lambda$35$lambda$34$lambda$13$lambda$12(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTraversalGroup(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelItem$lambda$35$lambda$34$lambda$17$lambda$16$lambda$15$lambda$14 */
    public static final Unit m516xf80d6ce7(Function1 $onBenchmarkClicked, Model $model) {
        $onBenchmarkClicked.invoke($model);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItem$lambda$35$lambda$34$lambda$19(Model $model, boolean $isAicore, boolean $isDownloadFailed, AnimatedContentScope AnimatedContent, boolean targetState, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C:ModelItem.kt#13a6jo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2037826113, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelItem.<anonymous>.<anonymous>.<anonymous> (ModelItem.kt:178)");
        }
        if (targetState) {
            $composer.startReplaceGroup(-484897189);
            ComposerKt.sourceInformation($composer, "179@7398L464");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            int $changed$iv$iv = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $i$f$Column = $changed$iv$iv << 6;
            int $changed$iv$iv$iv = ($i$f$Column & 896) | 6;
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
            int i2 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -295694857, "C:ModelItem.kt#13a6jo");
            if ($model.getInfo().length() > 0) {
                $composer.startReplaceGroup(-295669965);
                ComposerKt.sourceInformation($composer, "184@7637L11,181@7515L225");
                MarkdownTextKt.m10879MarkdownTextjA1GFJw($model.getInfo(), PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(12), 0.0f, 0.0f, 13, null), true, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, $composer, 432, 16);
            } else {
                $composer.startReplaceGroup(-303117870);
            }
            $composer.endReplaceGroup();
            if ($isAicore && $isDownloadFailed) {
                $composer.startReplaceGroup(-295376767);
                ComposerKt.sourceInformation($composer, "189@7817L19");
                AICoreAccessPanelKt.AICoreAccessPanel($composer, 0);
            } else {
                $composer.startReplaceGroup(-303117870);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
        } else {
            $composer.startReplaceGroup(-492240159);
        }
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItem$lambda$35$lambda$34$lambda$33(List $modelVariants, MutableState $isExpanded$delegate, final Model $model, final Task $task, final ModelManagerViewModel $modelManagerViewModel, final Function1 $onModelClicked, final TosViewModel $tosViewModel, final State $downloadStatus$delegate, final State $modelManagerUiState$delegate, final boolean $showBenchmarkButton, final boolean $showDeleteButton, final Function1 $onBenchmarkClicked, final SharedTransitionScope SharedTransitionLayout, Composer $composer, int $changed) {
        boolean showColumnLayout;
        Composer $composer$iv$iv;
        Intrinsics.checkNotNullParameter(SharedTransitionLayout, "$this$SharedTransitionLayout");
        ComposerKt.sourceInformation($composer, "C:ModelItem.kt#13a6jo");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(SharedTransitionLayout) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1926463620, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelItem.<anonymous>.<anonymous>.<anonymous> (ModelItem.kt:196)");
            }
            if ($modelVariants.isEmpty()) {
                $composer.startReplaceGroup(-1924565678);
                ComposerKt.sourceInformation($composer, "197@8055L738,197@8027L766");
                AnimatedContentKt.AnimatedContent(Boolean.valueOf(ModelItem$lambda$7($isExpanded$delegate)), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1730127398, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        return ModelItemKt.ModelItem$lambda$35$lambda$34$lambda$33$lambda$22($model, $task, $modelManagerViewModel, SharedTransitionLayout, $onModelClicked, $tosViewModel, $downloadStatus$delegate, (AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer, 54), $composer, 1572864, 62);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1923519800);
                ComposerKt.sourceInformation($composer, "216@8910L6248");
                Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, ModelItem$lambda$7($isExpanded$delegate) ? C1654Dp.m9788constructorimpl(12) : C1654Dp.m9788constructorimpl(0), 0.0f, 0.0f, 13, null);
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
                Composer $composer$iv = $composer;
                ComposerKt.sourceInformationMarkerStart($composer$iv, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
                MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer$iv, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                int $changed$iv$iv = (48 << 3) & 112;
                Composer $composer$iv$iv2 = $composer$iv;
                MeasurePolicy measurePolicy$iv$iv = measurePolicy$iv;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv$iv2, 0));
                CompositionLocalMap localMap$iv$iv = $composer$iv$iv2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer$iv$iv2, modifier$iv);
                int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer$iv$iv2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv$iv2.startReusableNode();
                if ($composer$iv$iv2.getInserting()) {
                    $composer$iv$iv2.createNode(constructor);
                } else {
                    $composer$iv$iv2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer$iv$iv2);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                int i = ($changed$iv$iv$iv >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i2 = ((48 >> 6) & 112) | 6;
                Composer $composer2 = $composer$iv$iv2;
                ComposerKt.sourceInformationMarkerStart($composer2, 1306558657, "C:ModelItem.kt#13a6jo");
                $composer2.startReplaceGroup(734883714);
                ComposerKt.sourceInformation($composer2, "*221@9183L120,235@9830L167,239@10056L5076,239@10013L5119");
                for (final Model variantModel : CollectionsKt.plus((Collection) CollectionsKt.listOf($model), (Iterable) $modelVariants)) {
                    Modifier materialized$iv$iv2 = materialized$iv$iv;
                    ComposerKt.sourceInformationMarkerStart($composer2, 734880878, "CC(remember):ModelItem.kt#9igjgp");
                    Composer $this$cache$iv = $composer2;
                    Object value$iv = $this$cache$iv.rememberedValue();
                    MeasurePolicy measurePolicy$iv$iv2 = measurePolicy$iv$iv;
                    if (value$iv == Composer.INSTANCE.getEmpty()) {
                        value$iv = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ModelItemKt.m518x23f5d97(variantModel, $modelManagerUiState$delegate);
                            }
                        });
                        $this$cache$iv.updateRememberedValue(value$iv);
                    }
                    final State variantDownloadStatus$delegate = (State) value$iv;
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ModelDownloadStatus modelDownloadStatusModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$25 = ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$25(variantDownloadStatus$delegate);
                    boolean isNotDownloaded = (modelDownloadStatusModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$25 != null ? modelDownloadStatusModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$25.getStatus() : null) == ModelDownloadStatusType.NOT_DOWNLOADED;
                    ModelDownloadStatus modelDownloadStatusModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$252 = ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$25(variantDownloadStatus$delegate);
                    boolean isDownloaded = (modelDownloadStatusModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$252 != null ? modelDownloadStatusModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$252.getStatus() : null) == ModelDownloadStatusType.SUCCEEDED;
                    boolean showColumnLayout2 = !(isNotDownloaded || isDownloaded) || ModelItem$lambda$7($isExpanded$delegate);
                    boolean zModelItem$lambda$7 = ModelItem$lambda$7($isExpanded$delegate);
                    ModelDownloadStatus modelDownloadStatusModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$253 = ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$25(variantDownloadStatus$delegate);
                    ModelDownloadStatusType status = modelDownloadStatusModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$253 != null ? modelDownloadStatusModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$253.getStatus() : null;
                    ComposerKt.sourceInformationMarkerStart($composer2, 734901629, "CC(remember):ModelItem.kt#9igjgp");
                    boolean invalid$iv = $composer2.changed(zModelItem$lambda$7) | $composer2.changed(showColumnLayout2) | $composer2.changed(status == null ? -1 : status.ordinal());
                    Composer $this$cache$iv2 = $composer2;
                    Object it$iv = $this$cache$iv2.rememberedValue();
                    if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                        showColumnLayout = showColumnLayout2;
                        $composer$iv$iv = $composer$iv$iv2;
                        Object value$iv2 = new Triple(Boolean.valueOf(showColumnLayout2), Boolean.valueOf(ModelItem$lambda$7($isExpanded$delegate)), ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$25(variantDownloadStatus$delegate));
                        $this$cache$iv2.updateRememberedValue(value$iv2);
                        it$iv = value$iv2;
                    } else {
                        showColumnLayout = showColumnLayout2;
                        $composer$iv$iv = $composer$iv$iv2;
                    }
                    Triple layoutState = (Triple) it$iv;
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    Composer $composer3 = $composer2;
                    AnimatedContentKt.AnimatedContent(layoutState, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(92101615, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            return ModelItemKt.ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$31(SharedTransitionLayout, variantModel, $task, $modelManagerViewModel, $showBenchmarkButton, $showDeleteButton, $onBenchmarkClicked, variantDownloadStatus$delegate, $onModelClicked, (AnimatedContentScope) obj, (Triple) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                        }
                    }, $composer3, 54), $composer3, 1572864, 62);
                    $composer2 = $composer3;
                    constructor = constructor;
                    materialized$iv$iv = materialized$iv$iv2;
                    measurePolicy$iv$iv = measurePolicy$iv$iv2;
                    $composer$iv$iv2 = $composer$iv$iv;
                    horizontalAlignment$iv = horizontalAlignment$iv;
                    $composer$iv = $composer$iv;
                    verticalArrangement$iv = verticalArrangement$iv;
                    $dirty2 = $dirty2;
                }
                Composer $composer4 = $composer2;
                $composer4.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer4);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv2);
                $composer$iv$iv2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItem$lambda$35$lambda$34$lambda$33$lambda$22(final Model $model, Task $task, ModelManagerViewModel $modelManagerViewModel, SharedTransitionScope $this_SharedTransitionLayout, final Function1 $onModelClicked, TosViewModel $tosViewModel, State $downloadStatus$delegate, AnimatedContentScope AnimatedContent, boolean targetIsExpanded, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C209@8698L25,198@8089L692:ModelItem.kt#13a6jo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1730127398, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ModelItem.kt:198)");
        }
        ModelDownloadStatus modelDownloadStatusModelItem$lambda$5 = ModelItem$lambda$5($downloadStatus$delegate);
        ModelDownloadStatusType status = modelDownloadStatusModelItem$lambda$5 != null ? modelDownloadStatusModelItem$lambda$5.getStatus() : null;
        float fCalculateDownloadProgress = calculateDownloadProgress(ModelItem$lambda$5($downloadStatus$delegate));
        Modifier modifierM1992paddingqDBjuR0$default = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, targetIsExpanded ? C1654Dp.m9788constructorimpl(12) : C1654Dp.m9788constructorimpl(0), 0.0f, 0.0f, 13, null);
        AnimatedContentScope animatedContentScope = AnimatedContent;
        ComposerKt.sourceInformationMarkerStart($composer, -500065325, "CC(remember):ModelItem.kt#9igjgp");
        boolean invalid$iv = $composer.changed($onModelClicked) | $composer.changedInstance($model);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModelItemKt.m517xbd0b8ab2($onModelClicked, $model);
                }
            };
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        DownloadModelPanelKt.m11023DownloadModelPanelKNANIv4($model, $task, $modelManagerViewModel, status, fCalculateDownloadProgress, targetIsExpanded, $this_SharedTransitionLayout, animatedContentScope, (Function0) it$iv, $tosViewModel, modifierM1992paddingqDBjuR0$default, 0L, $composer, (($changed << 12) & 458752) | (($changed << 21) & 29360128), 0, 2048);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelItem$lambda$35$lambda$34$lambda$33$lambda$22$lambda$21$lambda$20 */
    public static final Unit m517xbd0b8ab2(Function1 $onModelClicked, Model $model) {
        $onModelClicked.invoke($model);
        return Unit.INSTANCE;
    }

    private static final ModelDownloadStatus ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$25(State<ModelDownloadStatus> state) {
        Object thisObj$iv = state.getValue();
        return (ModelDownloadStatus) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$24$lambda$23 */
    public static final ModelDownloadStatus m518x23f5d97(Model $variantModel, State $modelManagerUiState$delegate) {
        return ModelItem$lambda$2($modelManagerUiState$delegate).getModelDownloadStatus().get($variantModel.getName());
    }

    /* JADX INFO: renamed from: ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$31$VariantHeader */
    private static final void m521x16dcaf47(Model variantModel, Task $task, boolean targetIsExpanded, ModelManagerViewModel $modelManagerViewModel, boolean $showBenchmarkButton, boolean $showDeleteButton, Function1<? super Model, Unit> function1, SharedTransitionScope $this_SharedTransitionLayout, AnimatedContentScope $this_AnimatedContent, boolean targetShowColumnLayout, State<ModelDownloadStatus> state, Modifier modifier, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, -466715534, "C(VariantHeader)260@11238L70,267@11644L69,243@10262L1573:ModelItem.kt#13a6jo");
        Modifier modifier2 = (i & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-466715534, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.VariantHeader (ModelItem.kt:242)");
        }
        ModelVariantHeader(variantModel, $task, ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$25(state), targetIsExpanded, $modelManagerViewModel, $showBenchmarkButton, $showDeleteButton, function1, modifier2, SharedTransitionScope.sharedElement$default($this_SharedTransitionLayout, Modifier.INSTANCE, $this_SharedTransitionLayout.rememberSharedContentState("variant_label_" + variantModel.getName(), $composer, 0), $this_AnimatedContent, null, null, false, 0.0f, null, 124, null), SharedTransitionScope.sharedElement$default($this_SharedTransitionLayout, OffsetKt.m1945offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, targetShowColumnLayout ? C1654Dp.m9788constructorimpl(0) : C1654Dp.m9788constructorimpl(12), 1, null), $this_SharedTransitionLayout.rememberSharedContentState("variant_menu_" + variantModel.getName(), $composer, 0), $this_AnimatedContent, null, null, false, 0.0f, null, 124, null), $composer, ($changed << 24) & 234881024, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
    }

    /* JADX INFO: renamed from: ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$31$VariantDownloadPanel */
    private static final void m519xf0dfb462(ModelDownloadStatus targetVariantDownloadStatus, final Model variantModel, Task $task, ModelManagerViewModel $modelManagerViewModel, boolean targetIsExpanded, SharedTransitionScope $this_SharedTransitionLayout, AnimatedContentScope $this_AnimatedContent, final Function1<? super Model, Unit> function1, State<ModelDownloadStatus> state, Modifier modifier, Composer $composer, int $changed, int i) {
        ComposerKt.sourceInformationMarkerStart($composer, -1086817741, "C(VariantDownloadPanel)291@13030L11,290@12930L32,275@11975L1108:ModelItem.kt#13a6jo");
        Modifier modifier2 = (i & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1086817741, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.VariantDownloadPanel (ModelItem.kt:274)");
        }
        ModelDownloadStatusType status = targetVariantDownloadStatus != null ? targetVariantDownloadStatus.getStatus() : null;
        float fCalculateDownloadProgress = calculateDownloadProgress(ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$25(state));
        long surfaceContainerHigh = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainerHigh();
        AnimatedContentScope animatedContentScope = $this_AnimatedContent;
        ComposerKt.sourceInformationMarkerStart($composer, -754762253, "CC(remember):ModelItem.kt#9igjgp");
        boolean invalid$iv = $composer.changed(function1) | $composer.changedInstance(variantModel);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModelItemKt.m520x70fa25df(function1, variantModel);
                }
            };
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        DownloadModelPanelKt.m11023DownloadModelPanelKNANIv4(variantModel, $task, $modelManagerViewModel, status, fCalculateDownloadProgress, targetIsExpanded, $this_SharedTransitionLayout, animatedContentScope, (Function0) it$iv, null, modifier2, surfaceContainerHigh, $composer, 0, $changed & 14, 512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$31$VariantDownloadPanel$lambda$28$lambda$27 */
    public static final Unit m520x70fa25df(Function1 $onModelClicked, Model $variantModel) {
        $onModelClicked.invoke($variantModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItem$lambda$35$lambda$34$lambda$33$lambda$32$lambda$31(SharedTransitionScope $this_SharedTransitionLayout, Model $variantModel, Task $task, ModelManagerViewModel $modelManagerViewModel, boolean $showBenchmarkButton, boolean $showDeleteButton, Function1 $onBenchmarkClicked, State $variantDownloadStatus$delegate, Function1 $onModelClicked, AnimatedContentScope AnimatedContent, Triple destruct$, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(destruct$, "$destruct$");
        ComposerKt.sourceInformation($composer, "C299@13288L74,303@13539L11:ModelItem.kt#13a6jo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(92101615, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ModelItem.kt:241)");
        }
        boolean targetShowColumnLayout = ((Boolean) destruct$.component1()).booleanValue();
        boolean targetIsExpanded = ((Boolean) destruct$.component2()).booleanValue();
        ModelDownloadStatus targetVariantDownloadStatus = (ModelDownloadStatus) destruct$.component3();
        Modifier containerModifier = PaddingKt.m1989paddingVpY3zN4(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(SharedTransitionScope.sharedElement$default($this_SharedTransitionLayout, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $this_SharedTransitionLayout.rememberSharedContentState("variant_container_" + $variantModel.getName(), $composer, 0), AnimatedContent, null, null, false, 0.0f, null, 124, null), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(12))), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainerLow(), null, 2, null), C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(12));
        if (targetShowColumnLayout) {
            $composer.startReplaceGroup(-681270644);
            ComposerKt.sourceInformation($composer, "307@13704L609");
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, containerModifier);
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
            int i2 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1087767567, "C308@13763L49,315@14104L62,309@13833L460:ModelItem.kt#13a6jo");
            m521x16dcaf47($variantModel, $task, targetIsExpanded, $modelManagerViewModel, $showBenchmarkButton, $showDeleteButton, $onBenchmarkClicked, $this_SharedTransitionLayout, AnimatedContent, targetShowColumnLayout, $variantDownloadStatus$delegate, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $composer, 6, 0);
            m519xf0dfb462(targetVariantDownloadStatus, $variantModel, $task, $modelManagerViewModel, targetIsExpanded, $this_SharedTransitionLayout, AnimatedContent, $onModelClicked, $variantDownloadStatus$delegate, SharedTransitionScope.sharedElement$default($this_SharedTransitionLayout, PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 13, null), $this_SharedTransitionLayout.rememberSharedContentState("panel_" + $variantModel.getName(), $composer, 0), AnimatedContent, null, null, false, 0.0f, null, 124, null), $composer, 0, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(-680618776);
            ComposerKt.sourceInformation($composer, "321@14357L741");
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv2 = (432 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, containerModifier);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor2);
            } else {
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i4 = ((432 >> 6) & 112) | 6;
            RowScope $this$ModelItem_u24lambda_u2435_u24lambda_u2434_u24lambda_u2433_u24lambda_u2432_u24lambda_u2431_u24lambda_u2430 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1727766586, "C326@14592L45,332@14889L62,327@14658L420:ModelItem.kt#13a6jo");
            m521x16dcaf47($variantModel, $task, targetIsExpanded, $modelManagerViewModel, $showBenchmarkButton, $showDeleteButton, $onBenchmarkClicked, $this_SharedTransitionLayout, AnimatedContent, targetShowColumnLayout, $variantDownloadStatus$delegate, RowScope.weight$default($this$ModelItem_u24lambda_u2435_u24lambda_u2434_u24lambda_u2433_u24lambda_u2432_u24lambda_u2431_u24lambda_u2430, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0, 0);
            m519xf0dfb462(targetVariantDownloadStatus, $variantModel, $task, $modelManagerViewModel, targetIsExpanded, $this_SharedTransitionLayout, AnimatedContent, $onModelClicked, $variantDownloadStatus$delegate, SharedTransitionScope.sharedElement$default($this_SharedTransitionLayout, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), $this_SharedTransitionLayout.rememberSharedContentState("panel_" + $variantModel.getName(), $composer, 0), AnimatedContent, null, null, false, 0.0f, null, 124, null), $composer, 0, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ModelVariantHeader(final com.google.ai.edge.gallery.data.Model r97, final com.google.ai.edge.gallery.data.Task r98, final com.google.ai.edge.gallery.data.ModelDownloadStatus r99, final boolean r100, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r101, final boolean r102, final boolean r103, final kotlin.jvm.functions.Function1<? super com.google.ai.edge.gallery.data.Model, kotlin.Unit> r104, androidx.compose.p000ui.Modifier r105, androidx.compose.p000ui.Modifier r106, androidx.compose.p000ui.Modifier r107, androidx.compose.runtime.Composer r108, final int r109, final int r110, final int r111) {
        /*
    public static final void ModelVariantHeader(final com.google.ai.edge.gallery.data.Model r97, final com.google.ai.edge.gallery.data.Task r98, final com.google.ai.edge.gallery.data.ModelDownloadStatus r99, final boolean r100, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r101, final boolean r102, final boolean r103, final kotlin.jvm.functions.Function1<? super com.google.ai.edge.gallery.data.Model, kotlin.Unit> r104, androidx.compose.p000ui.Modifier r105, androidx.compose.p000ui.Modifier r106, androidx.compose.p000ui.Modifier r107, androidx.compose.runtime.Composer r108, final int r109, final int r110, final int r111) {
            // Method dump skipped - placeholder implementation
        }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelVariantHeader$lambda$40$lambda$39$lambda$38(Function1 $onBenchmarkClicked, Model $variantModel) {
        $onBenchmarkClicked.invoke($variantModel);
        return Unit.INSTANCE;
    }

    public static final void ModelItemActionMenu(final Model model, final ModelManagerViewModel modelManagerViewModel, final boolean showBenchmarkButton, final Function0<Unit> onBenchmarkClicked, final boolean showDeleteButton, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Modifier modifier3;
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(onBenchmarkClicked, "onBenchmarkClicked");
        Composer $composer2 = $composer.startRestartGroup(-452726229);
        ComposerKt.sourceInformation($composer2, "C(ModelItemActionMenu)P(!2,4,3,5)415@17415L34,416@17483L34,418@17521L1664:ModelItem.kt#13a6jo");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(model) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(modelManagerViewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(showBenchmarkButton) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onBenchmarkClicked) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changed(showDeleteButton) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-452726229, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelItemActionMenu (ModelItem.kt:414)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1278201107, "CC(remember):ModelItem.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState showMenu$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1278198931, "CC(remember):ModelItem.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState showConfirmDeleteDialog$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            int $changed$iv = ($dirty2 >> 15) & 14;
            Modifier modifier$iv = modifier3;
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
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
            int i3 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i4 = (($changed$iv >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 201749505, "C419@17573L19,419@17552L231,426@17841L20,426@17863L1023,426@17788L1098:ModelItem.kt#13a6jo");
            ComposerKt.sourceInformationMarkerStart($composer2, 1669075096, "CC(remember):ModelItem.kt#9igjgp");
            Object value$iv3 = $composer2.rememberedValue();
            if (value$iv3 == Composer.INSTANCE.getEmpty()) {
                value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModelItemKt.ModelItemActionMenu$lambda$61$lambda$49$lambda$48(showMenu$delegate);
                    }
                };
                $composer2.updateRememberedValue(value$iv3);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            IconButtonKt.IconButton((Function0) value$iv3, null, false, null, null, null, ComposableSingletons$ModelItemKt.INSTANCE.m11013getLambda$839440121$app_debug(), $composer2, 1572870, 62);
            boolean zModelItemActionMenu$lambda$43 = ModelItemActionMenu$lambda$43(showMenu$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1669083673, "CC(remember):ModelItem.kt#9igjgp");
            Object value$iv4 = $composer2.rememberedValue();
            if (value$iv4 == Composer.INSTANCE.getEmpty()) {
                value$iv4 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModelItemKt.ModelItemActionMenu$lambda$61$lambda$51$lambda$50(showMenu$delegate);
                    }
                };
                $composer2.updateRememberedValue(value$iv4);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AndroidMenu_androidKt.m3505DropdownMenuIlH_yew(zModelItemActionMenu$lambda$43, (Function0) value$iv4, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1082300512, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ModelItemKt.ModelItemActionMenu$lambda$61$lambda$56(showBenchmarkButton, onBenchmarkClicked, showDeleteButton, showMenu$delegate, showConfirmDeleteDialog$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 48, 48, 2044);
            if (ModelItemActionMenu$lambda$46(showConfirmDeleteDialog$delegate)) {
                $composer2.startReplaceGroup(203064152);
                ComposerKt.sourceInformation($composer2, "465@18997L112,469@19131L35,463@18928L247");
                ComposerKt.sourceInformationMarkerStart($composer2, 1669120757, "CC(remember):ModelItem.kt#9igjgp");
                boolean invalid$iv = $composer2.changedInstance(modelManagerViewModel) | $composer2.changedInstance(model);
                Object it$iv3 = $composer2.rememberedValue();
                if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv5 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ModelItemKt.ModelItemActionMenu$lambda$61$lambda$58$lambda$57(modelManagerViewModel, model, showConfirmDeleteDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv5);
                    it$iv3 = value$iv5;
                }
                Function0 function02 = (Function0) it$iv3;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1669124968, "CC(remember):ModelItem.kt#9igjgp");
                Object it$iv4 = $composer2.rememberedValue();
                if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv6 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ModelItemKt.ModelItemActionMenu$lambda$61$lambda$60$lambda$59(showConfirmDeleteDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv6);
                    it$iv4 = value$iv6;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ConfirmDeleteModelDialogKt.ConfirmDeleteModelDialog(model, function02, (Function0) it$iv4, $composer2, ($dirty2 & 14) | 384);
            } else {
                $composer2.startReplaceGroup(184286429);
            }
            $composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModelItemKt.ModelItemActionMenu$lambda$62(model, modelManagerViewModel, showBenchmarkButton, onBenchmarkClicked, showDeleteButton, modifier4, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean ModelItemActionMenu$lambda$43(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ModelItemActionMenu$lambda$44(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ModelItemActionMenu$lambda$46(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ModelItemActionMenu$lambda$47(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItemActionMenu$lambda$61$lambda$49$lambda$48(MutableState $showMenu$delegate) {
        ModelItemActionMenu$lambda$44($showMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItemActionMenu$lambda$61$lambda$51$lambda$50(MutableState $showMenu$delegate) {
        ModelItemActionMenu$lambda$44($showMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItemActionMenu$lambda$61$lambda$56(boolean $showBenchmarkButton, final Function0 $onBenchmarkClicked, boolean $showDeleteButton, final MutableState $showMenu$delegate, final MutableState $showConfirmDeleteDialog$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C:ModelItem.kt#13a6jo");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1082300512, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ModelItemActionMenu.<anonymous>.<anonymous> (ModelItem.kt:427)");
            }
            if ($showBenchmarkButton) {
                $composer.startReplaceGroup(495109383);
                ComposerKt.sourceInformation($composer, "438@18277L75,428@17906L457");
                Function2<Composer, Integer, Unit> lambda$239839499$app_debug = ComposableSingletons$ModelItemKt.INSTANCE.getLambda$239839499$app_debug();
                ComposerKt.sourceInformationMarkerStart($composer, 708719723, "CC(remember):ModelItem.kt#9igjgp");
                boolean invalid$iv = $composer.changed($onBenchmarkClicked);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ModelItemKt.ModelItemActionMenu$lambda$61$lambda$56$lambda$53$lambda$52($onBenchmarkClicked, $showMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                str = "CC(remember):ModelItem.kt#9igjgp";
                AndroidMenu_androidKt.DropdownMenuItem(lambda$239839499$app_debug, (Function0) it$iv, null, null, null, false, null, null, null, $composer, 6, 508);
                $composer.endReplaceGroup();
                i = 477340834;
            } else {
                str = "CC(remember):ModelItem.kt#9igjgp";
                i = 477340834;
                $composer.startReplaceGroup(477340834);
                $composer.endReplaceGroup();
            }
            if ($showDeleteButton) {
                $composer.startReplaceGroup(495609506);
                ComposerKt.sourceInformation($composer, "455@18776L85,445@18410L462");
                Function2<Composer, Integer, Unit> function2M11012getLambda$244752126$app_debug = ComposableSingletons$ModelItemKt.INSTANCE.m11012getLambda$244752126$app_debug();
                ComposerKt.sourceInformationMarkerStart($composer, 708735701, str);
                Object it$iv2 = $composer.rememberedValue();
                if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ModelItemKt.ModelItemActionMenu$lambda$61$lambda$56$lambda$55$lambda$54($showMenu$delegate, $showConfirmDeleteDialog$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                AndroidMenu_androidKt.DropdownMenuItem(function2M11012getLambda$244752126$app_debug, (Function0) it$iv2, null, null, null, false, null, null, null, $composer, 54, 508);
            } else {
                $composer.startReplaceGroup(i);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItemActionMenu$lambda$61$lambda$56$lambda$53$lambda$52(Function0 $onBenchmarkClicked, MutableState $showMenu$delegate) {
        $onBenchmarkClicked.invoke();
        ModelItemActionMenu$lambda$44($showMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItemActionMenu$lambda$61$lambda$56$lambda$55$lambda$54(MutableState $showMenu$delegate, MutableState $showConfirmDeleteDialog$delegate) {
        ModelItemActionMenu$lambda$44($showMenu$delegate, false);
        ModelItemActionMenu$lambda$47($showConfirmDeleteDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItemActionMenu$lambda$61$lambda$58$lambda$57(ModelManagerViewModel $modelManagerViewModel, Model $model, MutableState $showConfirmDeleteDialog$delegate) {
        $modelManagerViewModel.deleteModel($model);
        ModelItemActionMenu$lambda$47($showConfirmDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelItemActionMenu$lambda$61$lambda$60$lambda$59(MutableState $showConfirmDeleteDialog$delegate) {
        ModelItemActionMenu$lambda$47($showConfirmDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final float calculateDownloadProgress(ModelDownloadStatus downloadStatus) {
        long receivedBytes = downloadStatus != null ? downloadStatus.getReceivedBytes() : 0L;
        long totalBytes = downloadStatus != null ? downloadStatus.getTotalBytes() : 0L;
        if (totalBytes == 0) {
            return 0.0f;
        }
        return receivedBytes / totalBytes;
    }
}
