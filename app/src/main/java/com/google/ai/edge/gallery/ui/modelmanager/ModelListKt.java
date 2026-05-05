package com.google.ai.edge.gallery.ui.modelmanager;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.text.TextStyle;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.ColorUtilsKt;
import com.google.ai.edge.gallery.ui.common.UtilsKt;
import com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelList.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\u001a_\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\u0010\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001fX\u008a\u0084\u0002²\u0006\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001fX\u008a\u0084\u0002²\u0006\u001c\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001f0\"X\u008a\u0084\u0002"}, m922d2 = {"TAG", "", "CONTENT_ANIMATION_OFFSET", "Landroidx/compose/ui/unit/Dp;", "F", "ANIMATION_INIT_DELAY", "", "TASK_DESCRIPTION_SECTION_ANIMATION_START", "", "MODEL_LIST_ANIMATION_START", "DEFAULT_ANIMATION_DURATION", "TASK_ICON_ANIMATION_DURATION", "ModelList", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "enableAnimation", "", "onModelClicked", "Lkotlin/Function1;", "Lcom/google/ai/edge/gallery/data/Model;", "onBenchmarkClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Landroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "models", "", "importedModels", "modelVariants", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ModelListKt {
    private static final long ANIMATION_INIT_DELAY = 80;
    private static final float CONTENT_ANIMATION_OFFSET = C1654Dp.m9788constructorimpl(16);
    private static final int DEFAULT_ANIMATION_DURATION = 700;
    private static final int MODEL_LIST_ANIMATION_START = 550;
    private static final String TAG = "AGModelList";
    private static final int TASK_DESCRIPTION_SECTION_ANIMATION_START = 400;
    private static final int TASK_ICON_ANIMATION_DURATION = 1100;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelList$lambda$46(Task task, ModelManagerViewModel modelManagerViewModel, PaddingValues paddingValues, boolean z, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ModelList(task, modelManagerViewModel, paddingValues, z, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ModelList(final Task task, final ModelManagerViewModel modelManagerViewModel, final PaddingValues contentPadding, final boolean enableAnimation, final Function1<? super Model, Unit> onModelClicked, final Function1<? super Model, Unit> onBenchmarkClicked, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        Modifier modifier3;
        Modifier modifier4;
        String str;
        int $dirty;
        Modifier modifier5;
        State modelVariants$delegate;
        State importedModels$delegate;
        Composer $composer3;
        float fRememberDelayedAnimationProgress;
        float taskIconProgress;
        float fRememberDelayedAnimationProgress2;
        float taskLabelProgress;
        float fRememberDelayedAnimationProgress3;
        float descriptionProgress;
        Function0<ComposeUiNode> function0;
        Composer $composer4;
        Composer $composer$iv;
        int $dirty2;
        BoxScope $this$ModelList_u24lambda_u2445;
        BoxScope $this$ModelList_u24lambda_u24452;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(onModelClicked, "onModelClicked");
        Intrinsics.checkNotNullParameter(onBenchmarkClicked, "onBenchmarkClicked");
        Composer $composer5 = $composer.startRestartGroup(-1845888254);
        ComposerKt.sourceInformation($composer5, "C(ModelList)P(6,2!2,5,4)98@4266L229,109@4524L228,120@4780L314,134@5114L23,179@6345L49,183@6490L27,181@6398L7853:ModelList.kt#ahf767");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer5.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty3 |= $composer5.changedInstance(modelManagerViewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty3 |= $composer5.changed(contentPadding) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty3 |= $composer5.changed(enableAnimation) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty3 |= $composer5.changedInstance(onModelClicked) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty3 |= $composer5.changedInstance(onBenchmarkClicked) ? 131072 : 65536;
        }
        int i2 = i & 64;
        if (i2 != 0) {
            $dirty3 |= 1572864;
            modifier2 = modifier;
        } else if ((1572864 & $changed) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer5.changed(modifier2) ? 1048576 : 524288;
        } else {
            modifier2 = modifier;
        }
        int $dirty4 = $dirty3;
        if ($composer5.shouldExecute((599187 & $dirty4) != 599186, $dirty4 & 1)) {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1845888254, $dirty4, -1, "com.google.ai.edge.gallery.ui.modelmanager.ModelList (ModelList.kt:94)");
            }
            ComposerKt.sourceInformationMarkerStart($composer5, -77105721, "CC(remember):ModelList.kt#9igjgp");
            boolean invalid$iv = $composer5.changed(task);
            Object it$iv = $composer5.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModelListKt.ModelList$lambda$2$lambda$1(task);
                    }
                });
                $composer5.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final State models$delegate = (State) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -77097466, "CC(remember):ModelList.kt#9igjgp");
            boolean invalid$iv2 = $composer5.changed(task);
            Object it$iv2 = $composer5.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModelListKt.ModelList$lambda$6$lambda$5(task);
                    }
                });
                $composer5.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            State importedModels$delegate2 = (State) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -77089188, "CC(remember):ModelList.kt#9igjgp");
            boolean invalid$iv3 = $composer5.changed(task);
            Object it$iv3 = $composer5.rememberedValue();
            if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModelListKt.ModelList$lambda$11$lambda$10(task);
                    }
                });
                $composer5.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            State modelVariants$delegate2 = (State) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            LazyListState listState = LazyListStateKt.rememberLazyListState(0, 0, $composer5, 0, 3);
            float fRememberDelayedAnimationProgress4 = 1.0f;
            if (!enableAnimation) {
                $composer5.startReplaceGroup(1905599952);
                $composer5.endReplaceGroup();
                str = "CC(remember):ModelList.kt#9igjgp";
                $dirty = $dirty4;
                modifier5 = modifier4;
                modelVariants$delegate = modelVariants$delegate2;
                importedModels$delegate = importedModels$delegate2;
                $composer3 = $composer5;
                fRememberDelayedAnimationProgress = 1.0f;
            } else {
                $composer5.startReplaceGroup(1905627418);
                ComposerKt.sourceInformation($composer5, "140@5220L184");
                str = "CC(remember):ModelList.kt#9igjgp";
                $dirty = $dirty4;
                modifier5 = modifier4;
                modelVariants$delegate = modelVariants$delegate2;
                importedModels$delegate = importedModels$delegate2;
                $composer3 = $composer5;
                fRememberDelayedAnimationProgress = UtilsKt.rememberDelayedAnimationProgress(ANIMATION_INIT_DELAY, TASK_ICON_ANIMATION_DURATION, "task icon", null, $composer5, 438, 8);
                $composer3.endReplaceGroup();
            }
            float taskIconProgress2 = fRememberDelayedAnimationProgress;
            if (!enableAnimation) {
                Composer $composer6 = $composer3;
                $composer6.startReplaceGroup(1905871760);
                $composer6.endReplaceGroup();
                taskIconProgress = taskIconProgress2;
                fRememberDelayedAnimationProgress2 = 1.0f;
            } else {
                Composer $composer7 = $composer3;
                $composer7.startReplaceGroup(1905899443);
                ComposerKt.sourceInformation($composer7, "151@5494L191");
                taskIconProgress = taskIconProgress2;
                fRememberDelayedAnimationProgress2 = UtilsKt.rememberDelayedAnimationProgress(380L, TASK_ICON_ANIMATION_DURATION, "task label", null, $composer7, 438, 8);
                $composer3.endReplaceGroup();
            }
            float taskLabelProgress2 = fRememberDelayedAnimationProgress2;
            if (!enableAnimation) {
                Composer $composer8 = $composer3;
                $composer8.startReplaceGroup(1906152496);
                $composer8.endReplaceGroup();
                taskLabelProgress = taskLabelProgress2;
                fRememberDelayedAnimationProgress3 = 1.0f;
            } else {
                Composer $composer9 = $composer3;
                $composer9.startReplaceGroup(1906181295);
                ComposerKt.sourceInformation($composer9, "162@5777L227");
                taskLabelProgress = taskLabelProgress2;
                fRememberDelayedAnimationProgress3 = UtilsKt.rememberDelayedAnimationProgress(480L, DEFAULT_ANIMATION_DURATION, "description", null, $composer9, 438, 8);
                $composer3.endReplaceGroup();
            }
            float descriptionProgress2 = fRememberDelayedAnimationProgress3;
            if (!enableAnimation) {
                Composer $composer10 = $composer3;
                $composer10.startReplaceGroup(1906466960);
                $composer10.endReplaceGroup();
                descriptionProgress = descriptionProgress2;
            } else {
                Composer $composer11 = $composer3;
                $composer11.startReplaceGroup(1906495294);
                ComposerKt.sourceInformation($composer11, "173@6094L212");
                descriptionProgress = descriptionProgress2;
                fRememberDelayedAnimationProgress4 = UtilsKt.rememberDelayedAnimationProgress(630L, DEFAULT_ANIMATION_DURATION, "model_list", null, $composer11, 438, 8);
                $composer3.endReplaceGroup();
            }
            final float modelListProgress = fRememberDelayedAnimationProgress4;
            Composer $composer12 = $composer3;
            String str2 = str;
            ComposerKt.sourceInformationMarkerStart($composer12, -77039373, str2);
            Object it$iv4 = $composer12.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = SnapshotStateKt.mutableStateMapOf();
                $composer12.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            final SnapshotStateMap modelItemExpandedStates = (SnapshotStateMap) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer12);
            Alignment contentAlignment$iv = Alignment.INSTANCE.getBottomEnd();
            int $dirty5 = $dirty;
            Modifier modifier$iv = BackgroundKt.m1359backgroundbw27NRU$default(Modifier.INSTANCE, ColorUtilsKt.getTaskBgColor(task, $composer12, $dirty5 & 14), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer12, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer12, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer12, 0));
            CompositionLocalMap localMap$iv$iv = $composer12.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer12, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer12, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer12.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer12.startReusableNode();
            if ($composer12.getInserting()) {
                function0 = constructor;
                $composer12.createNode(function0);
            } else {
                function0 = constructor;
                $composer12.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer12);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer12, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i4 = ((48 >> 6) & 112) | 6;
            BoxScope $this$ModelList_u24lambda_u24453 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer12, -434553162, "C190@6723L7142,185@6530L7335,393@14145L11,387@13910L337:ModelList.kt#ahf767");
            Modifier modifier6 = modifier5;
            Modifier modifierM1990paddingVpY3zN4$default = PaddingKt.m1990paddingVpY3zN4$default(modifier6, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer12, 1094366414, str2);
            final State importedModels$delegate3 = importedModels$delegate;
            final State modelVariants$delegate3 = modelVariants$delegate;
            boolean invalid$iv4 = $composer12.changedInstance(task) | $composer12.changed(taskIconProgress) | $composer12.changed(taskLabelProgress) | $composer12.changed(descriptionProgress) | $composer12.changed(models$delegate) | $composer12.changed(importedModels$delegate3) | $composer12.changed(modelListProgress) | $composer12.changed(modelVariants$delegate3) | $composer12.changedInstance(modelManagerViewModel) | ((57344 & $dirty5) == 16384) | ((458752 & $dirty5) == 131072);
            Object value$iv5 = $composer12.rememberedValue();
            if (invalid$iv4 || value$iv5 == Composer.INSTANCE.getEmpty()) {
                final float f = taskIconProgress;
                final float f2 = descriptionProgress;
                $composer4 = $composer12;
                final float f3 = taskLabelProgress;
                $composer$iv = $composer12;
                $dirty2 = $dirty5;
                $composer2 = $composer12;
                modifier3 = modifier6;
                $this$ModelList_u24lambda_u2445 = $this$ModelList_u24lambda_u24453;
                $this$ModelList_u24lambda_u24452 = null;
                value$iv5 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModelListKt.ModelList$lambda$45$lambda$44$lambda$43(task, f, f2, f3, models$delegate, importedModels$delegate3, modelListProgress, modelItemExpandedStates, modelManagerViewModel, onModelClicked, onBenchmarkClicked, modelVariants$delegate3, (LazyListScope) obj);
                    }
                };
                $composer12.updateRememberedValue(value$iv5);
            } else {
                $composer$iv = $composer12;
                $dirty2 = $dirty5;
                $composer2 = $composer12;
                modifier3 = modifier6;
                $this$ModelList_u24lambda_u2445 = $this$ModelList_u24lambda_u24453;
                $this$ModelList_u24lambda_u24452 = null;
                $composer4 = $composer12;
            }
            ComposerKt.sourceInformationMarkerEnd($composer4);
            LazyDslKt.LazyColumn(modifierM1990paddingVpY3zN4$default, listState, contentPadding, false, horizontalOrVerticalM1843spacedBy0680j_4, null, null, false, null, (Function1) value$iv5, $composer4, ($dirty2 & 896) | 24576, 488);
            Composer $composer13 = $composer4;
            BoxKt.Box($this$ModelList_u24lambda_u2445.align(BackgroundKt.background$default(SizeKt.m2022height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, $this$ModelList_u24lambda_u24452), contentPadding.getBottom()), Brush.Companion.m6870verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(Color.INSTANCE.m6950getTransparent0d7_KjU()), Color.m6905boximpl(MaterialTheme.INSTANCE.getColorScheme($composer13, MaterialTheme.$stable).getSurfaceContainer())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Alignment.INSTANCE.getBottomCenter()), $composer13, 0);
            ComposerKt.sourceInformationMarkerEnd($composer13);
            ComposerKt.sourceInformationMarkerEnd($composer12);
            $composer12.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer12);
            ComposerKt.sourceInformationMarkerEnd($composer12);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer5;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier7 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModelListKt.ModelList$lambda$46(task, modelManagerViewModel, contentPadding, enableAnimation, onModelClicked, onBenchmarkClicked, modifier7, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List<Model> ModelList$lambda$3(State<? extends List<Model>> state) {
        Object thisObj$iv = state.getValue();
        return (List) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List ModelList$lambda$2$lambda$1(Task $task) {
        long trigger = $task.getUpdateTrigger().getValue().longValue();
        if (trigger >= 0) {
            Iterable $this$filter$iv = CollectionsKt.toList($task.getModels());
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                Model it = (Model) element$iv$iv;
                if (!it.getImported()) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            return (List) destination$iv$iv;
        }
        return CollectionsKt.emptyList();
    }

    private static final List<Model> ModelList$lambda$7(State<? extends List<Model>> state) {
        Object thisObj$iv = state.getValue();
        return (List) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List ModelList$lambda$6$lambda$5(Task $task) {
        long trigger = $task.getUpdateTrigger().getValue().longValue();
        if (trigger >= 0) {
            Iterable $this$filter$iv = CollectionsKt.toList($task.getModels());
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                Model it = (Model) element$iv$iv;
                if (it.getImported()) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            return (List) destination$iv$iv;
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, List<Model>> ModelList$lambda$12(State<? extends Map<String, ? extends List<Model>>> state) {
        Object thisObj$iv = state.getValue();
        return (Map) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map ModelList$lambda$11$lambda$10(Task $task) {
        Object answer$iv$iv$iv;
        long trigger = $task.getUpdateTrigger().getValue().longValue();
        if (trigger >= 0) {
            Iterable $this$filter$iv = CollectionsKt.toList($task.getModels());
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv : $this$filter$iv) {
                Model it = (Model) element$iv$iv;
                if (it.getParentModelName() != null) {
                    destination$iv$iv.add(element$iv$iv);
                }
            }
            Iterable $this$groupBy$iv = (List) destination$iv$iv;
            Map destination$iv$iv2 = new LinkedHashMap();
            for (Object element$iv$iv2 : $this$groupBy$iv) {
                Model it2 = (Model) element$iv$iv2;
                String parentModelName = it2.getParentModelName();
                Intrinsics.checkNotNull(parentModelName);
                Object value$iv$iv$iv = destination$iv$iv2.get(parentModelName);
                if (value$iv$iv$iv == null) {
                    answer$iv$iv$iv = new ArrayList();
                    destination$iv$iv2.put(parentModelName, answer$iv$iv$iv);
                } else {
                    answer$iv$iv$iv = value$iv$iv$iv;
                }
                Object key$iv$iv$iv = answer$iv$iv$iv;
                List list$iv$iv = (List) key$iv$iv$iv;
                list$iv$iv.add(element$iv$iv2);
            }
            return destination$iv$iv2;
        }
        return MapsKt.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelList$lambda$45$lambda$44$lambda$43(final Task $task, final float $taskIconProgress, final float $descriptionProgress, final float $taskLabelProgress, final State $models$delegate, final State $importedModels$delegate, final float $modelListProgress, final SnapshotStateMap $modelItemExpandedStates, final ModelManagerViewModel $modelManagerViewModel, final Function1 $onModelClicked, final Function1 $onBenchmarkClicked, final State $modelVariants$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, "taskHeader", null, ComposableLambdaKt.composableLambdaInstance(-176736355, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ModelListKt.ModelList$lambda$45$lambda$44$lambda$43$lambda$29($task, $taskIconProgress, $descriptionProgress, $taskLabelProgress, $models$delegate, $importedModels$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        if (!ModelList$lambda$3($models$delegate).isEmpty()) {
            LazyListScope.item$default(LazyColumn, "recommendedModelsTitle", null, ComposableLambdaKt.composableLambdaInstance(-2059344072, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ModelListKt.ModelList$lambda$45$lambda$44$lambda$43$lambda$32($modelListProgress, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
        }
        final List<Model> listModelList$lambda$3 = ModelList$lambda$3($models$delegate);
        final Function1 contentType$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$ModelList$lambda$45$lambda$44$lambda$43$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Model) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Model model) {
                return null;
            }
        };
        LazyColumn.items(listModelList$lambda$3.size(), null, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$ModelList$lambda$45$lambda$44$lambda$43$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return contentType$iv.invoke(listModelList$lambda$3.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$ModelList$lambda$45$lambda$44$lambda$43$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Composer $composer2;
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                int $changed2 = $dirty & 14;
                final Model model = (Model) listModelList$lambda$3.get(it);
                $composer.startReplaceGroup(-939978535);
                ComposerKt.sourceInformation($composer, "C:ModelList.kt#ahf767");
                String parentModelName = model.getParentModelName();
                if (parentModelName == null || parentModelName.length() == 0) {
                    $composer.startReplaceGroup(-939937213);
                    ComposerKt.sourceInformation($composer, "340@12368L150,337@12222L44,329@11866L665");
                    Boolean expanded = (Boolean) $modelItemExpandedStates.getOrDefault(model.getName(), null);
                    List list = (List) ModelListKt.ModelList$lambda$12($modelVariants$delegate).getOrDefault(model.getName(), CollectionsKt.emptyList());
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, -1831417482, "CC(remember):ModelList.kt#9igjgp");
                    boolean invalid$iv = $composer.changed($modelListProgress);
                    Object it$iv = $composer.rememberedValue();
                    if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                        final float f = $modelListProgress;
                        Object value$iv = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$ModelList$1$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                invoke2(graphicsLayerScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(GraphicsLayerScope graphicsLayer) {
                                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                graphicsLayer.setAlpha(f);
                                float f2 = ModelListKt.CONTENT_ANIMATION_OFFSET;
                                float other$iv = 1 - f;
                                graphicsLayer.setTranslationY(graphicsLayer.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(f2 * other$iv)));
                            }
                        };
                        $composer.updateRememberedValue(value$iv);
                        it$iv = value$iv;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) it$iv);
                    Task task = $task;
                    ModelManagerViewModel modelManagerViewModel = $modelManagerViewModel;
                    Function1 function1 = $onModelClicked;
                    Function1 function12 = $onBenchmarkClicked;
                    ComposerKt.sourceInformationMarkerStart($composer, -1831422260, "CC(remember):ModelList.kt#9igjgp");
                    boolean invalid$iv2 = $composer.changedInstance(model);
                    Object it$iv2 = $composer.rememberedValue();
                    if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                        final SnapshotStateMap snapshotStateMap = $modelItemExpandedStates;
                        Object value$iv2 = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$ModelList$1$1$1$3$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean it2) {
                                snapshotStateMap.put(model.getName(), Boolean.valueOf(it2));
                            }
                        };
                        $composer.updateRememberedValue(value$iv2);
                        it$iv2 = value$iv2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer2 = $composer;
                    ModelItemKt.ModelItem(model, task, modelManagerViewModel, function1, function12, modifierGraphicsLayer, expanded, false, false, true, (Function1) it$iv2, list, null, $composer2, (($changed2 >> 3) & 14) | 805306368, 0, 4480);
                } else {
                    $composer2 = $composer;
                    $composer2.startReplaceGroup(-951641790);
                }
                $composer2.endReplaceGroup();
                $composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!ModelList$lambda$7($importedModels$delegate).isEmpty()) {
            LazyListScope.item$default(LazyColumn, "importedModelsTitle", null, ComposableLambdaKt.composableLambdaInstance(164876015, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ModelListKt.ModelList$lambda$45$lambda$44$lambda$43$lambda$38($modelListProgress, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 2, null);
        }
        final List<Model> listModelList$lambda$7 = ModelList$lambda$7($importedModels$delegate);
        final Function1 key$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModelListKt.ModelList$lambda$45$lambda$44$lambda$43$lambda$39((Model) obj);
            }
        };
        final Function1 contentType$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$ModelList$lambda$45$lambda$44$lambda$43$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Model) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Model model) {
                return null;
            }
        };
        LazyColumn.items(listModelList$lambda$7.size(), new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$ModelList$lambda$45$lambda$44$lambda$43$$inlined$items$default$6
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return key$iv.invoke(listModelList$lambda$7.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$ModelList$lambda$45$lambda$44$lambda$43$$inlined$items$default$7
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return contentType$iv2.invoke(listModelList$lambda$7.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$ModelList$lambda$45$lambda$44$lambda$43$$inlined$items$default$8
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Function0<ComposeUiNode> function0;
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                int $changed2 = $dirty & 14;
                Model model = (Model) listModelList$lambda$7.get(it);
                $composer.startReplaceGroup(-116695217);
                ComposerKt.sourceInformation($composer, "C*368@13342L509:ModelList.kt#ahf767");
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                Modifier modifier$iv = Modifier.INSTANCE;
                Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
                MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                int $changed$iv$iv = (0 << 3) & 112;
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
                int i2 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -116752573, "C377@13678L150,369@13358L483:ModelList.kt#ahf767");
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, 134791027, "CC(remember):ModelList.kt#9igjgp");
                boolean invalid$iv = $composer.changed($modelListProgress);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    final float f = $modelListProgress;
                    Object value$iv = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$ModelList$1$1$1$6$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(GraphicsLayerScope graphicsLayer) {
                            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                            graphicsLayer.setAlpha(f);
                            float f2 = ModelListKt.CONTENT_ANIMATION_OFFSET;
                            float other$iv = 1 - f;
                            graphicsLayer.setTranslationY(graphicsLayer.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(f2 * other$iv)));
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ModelItemKt.ModelItem(model, $task, $modelManagerViewModel, $onModelClicked, $onBenchmarkClicked, GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) it$iv), null, false, false, true, null, null, null, $composer, (($changed2 >> 3) & 14) | 805306368, 0, 7616);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:112:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit ModelList$lambda$45$lambda$44$lambda$43$lambda$29(final com.google.ai.edge.gallery.data.Task r115, float r116, final float r117, float r118, androidx.compose.runtime.State r119, androidx.compose.runtime.State r120, androidx.compose.foundation.lazy.LazyItemScope r121, androidx.compose.runtime.Composer r122, int r123) {
        /*
            Method dump skipped, instruction units count: 2573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt.ModelList$lambda$45$lambda$44$lambda$43$lambda$29(com.google.ai.edge.gallery.data.Task, float, float, float, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelList$lambda$45$lambda$44$lambda$43$lambda$29$lambda$28$lambda$15$lambda$14 */
    public static final Unit m577x1e061dca(Task $task, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, $task.getLabel());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelList$lambda$45$lambda$44$lambda$43$lambda$29$lambda$28$lambda$19$lambda$18$lambda$17 */
    public static final Unit m578x2fa642d1(float $descriptionProgress, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha($descriptionProgress);
        float other$iv = 1 - $descriptionProgress;
        graphicsLayer.setTranslationY(graphicsLayer.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(CONTENT_ANIMATION_OFFSET * other$iv)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelList$lambda$45$lambda$44$lambda$43$lambda$29$lambda$28$lambda$21$lambda$20 */
    public static final Unit m579xd224f840(float $descriptionProgress, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha($descriptionProgress);
        float other$iv = 1 - $descriptionProgress;
        graphicsLayer.setTranslationY(graphicsLayer.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(CONTENT_ANIMATION_OFFSET * other$iv)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelList$lambda$45$lambda$44$lambda$43$lambda$29$lambda$28$lambda$23$lambda$22 */
    public static final Unit m580xfbee5dc4(float $descriptionProgress, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha($descriptionProgress);
        float other$iv = 1 - $descriptionProgress;
        graphicsLayer.setTranslationY(graphicsLayer.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(CONTENT_ANIMATION_OFFSET * other$iv)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelList$lambda$45$lambda$44$lambda$43$lambda$29$lambda$28$lambda$27$lambda$26 */
    public static final Unit m581x4f8128cc(float $descriptionProgress, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(0.6f * $descriptionProgress);
        float other$iv = 1 - $descriptionProgress;
        graphicsLayer.setTranslationY(graphicsLayer.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(CONTENT_ANIMATION_OFFSET * other$iv)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelList$lambda$45$lambda$44$lambda$43$lambda$32(final float $modelListProgress, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C313@11181L60,314@11277L11,315@11334L10,317@11462L150,312@11163L462:ModelList.kt#ahf767");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2059344072, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.ModelList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ModelList.kt:312)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C2421R.string.model_list_recommended_models_title, $composer, 0);
            long jM3708getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface();
            TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge();
            Modifier modifierM1989paddingVpY3zN4 = PaddingKt.m1989paddingVpY3zN4(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 950280366, "CC(remember):ModelList.kt#9igjgp");
            boolean invalid$iv = $composer.changed($modelListProgress);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModelListKt.m582x414ad537($modelListProgress, (GraphicsLayerScope) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TextKt.m4781TextNvy7gAk(strStringResource, GraphicsLayerModifierKt.graphicsLayer(modifierM1989paddingVpY3zN4, (Function1) it$iv), jM3708getOnSurface0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelLarge, $composer, 0, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelList$lambda$45$lambda$44$lambda$43$lambda$32$lambda$31$lambda$30 */
    public static final Unit m582x414ad537(float $modelListProgress, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha($modelListProgress);
        float other$iv = 1 - $modelListProgress;
        graphicsLayer.setTranslationY(graphicsLayer.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(CONTENT_ANIMATION_OFFSET * other$iv)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelList$lambda$45$lambda$44$lambda$43$lambda$38(final float $modelListProgress, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C352@12700L57,353@12793L11,354@12850L10,358@13031L156,351@12682L518:ModelList.kt#ahf767");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(164876015, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.ModelList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ModelList.kt:351)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C2421R.string.model_list_imported_models_title, $composer, 0);
            long jM3708getOnSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface();
            TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge();
            Modifier modifierM1992paddingqDBjuR0$default = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, C1654Dp.m9788constructorimpl(32), 0.0f, C1654Dp.m9788constructorimpl(8), 5, null);
            ComposerKt.sourceInformationMarkerStart($composer, -467927829, "CC(remember):ModelList.kt#9igjgp");
            boolean invalid$iv = $composer.changed($modelListProgress);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelListKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModelListKt.m583xa3cc6c9($modelListProgress, (GraphicsLayerScope) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TextKt.m4781TextNvy7gAk(strStringResource, GraphicsLayerModifierKt.graphicsLayer(modifierM1992paddingqDBjuR0$default, (Function1) it$iv), jM3708getOnSurface0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelLarge, $composer, 0, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ModelList$lambda$45$lambda$44$lambda$43$lambda$38$lambda$37$lambda$36 */
    public static final Unit m583xa3cc6c9(float $modelListProgress, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha($modelListProgress);
        float other$iv = 1 - $modelListProgress;
        graphicsLayer.setTranslationY(graphicsLayer.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(CONTENT_ANIMATION_OFFSET * other$iv)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ModelList$lambda$45$lambda$44$lambda$43$lambda$39(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getName();
    }
}
