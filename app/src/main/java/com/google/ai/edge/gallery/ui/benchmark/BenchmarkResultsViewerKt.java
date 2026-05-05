package com.google.ai.edge.gallery.ui.benchmark;

import android.content.ClipData;
import android.content.res.Resources;
import androidx.camera.video.AudioStats;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.HelpOutlineKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.draw.DrawModifierKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.PathEffect;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.platform.ClipEntry;
import androidx.compose.p000ui.platform.Clipboard;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.ui.common.AccordionsKt;
import com.google.ai.edge.gallery.ui.common.MarkdownTextKt;
import com.google.ai.edge.gallery.ui.common.UtilsKt;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import com.google.ai.edge.gallery.proto.BenchmarkResult;
import com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfo;
import com.google.ai.edge.gallery.proto.LlmBenchmarkResult;
import com.google.ai.edge.gallery.proto.LlmBenchmarkStats;
import com.google.ai.edge.gallery.proto.ValueSeries;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BenchmarkResultsViewer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m921d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001aG\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a[\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001d\u001a\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u001a\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u0014X\u008a\u008e\u0002"}, m922d2 = {"BenchmarkResultsViewer", "", "initialModelName", "", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "viewModel", "Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkViewModel;", "onClose", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "StatRow", Constants.ScionAnalytics.PARAM_LABEL, "value", "modifier", "Landroidx/compose/ui/Modifier;", "unit", "baselineValue", "", "lessIsBetter", "", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Double;ZLandroidx/compose/runtime/Composer;II)V", "ValueSeriesRow", "valueSeries", "Lcom/google/ai/edge/gallery/proto/ValueSeries;", "aggregation", "Lcom/google/ai/edge/gallery/ui/benchmark/Aggregation;", "baselineValueSeries", "baselineAggregation", "(Ljava/lang/String;Lcom/google/ai/edge/gallery/proto/ValueSeries;Lcom/google/ai/edge/gallery/ui/benchmark/Aggregation;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/google/ai/edge/gallery/proto/ValueSeries;Lcom/google/ai/edge/gallery/ui/benchmark/Aggregation;ZLandroidx/compose/runtime/Composer;II)V", "getBenchmarkResultCsv", "llmResult", "Lcom/google/ai/edge/gallery/proto/LlmBenchmarkResult;", "getAggregationValue", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkUiState;", "showConfirmDeleteDialog", "showLazyListPlacementAnimation", "showBenchmarkComparisonHelpBottomSheet", "benchmarkResultIdToDelete", "selectedModelName", "showAggregationDropdown", "showValueSeriesBottomSheet"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class BenchmarkResultsViewerKt {

    /* JADX INFO: compiled from: BenchmarkResultsViewer.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Aggregation.values().length];
            try {
                iArr[Aggregation.AVG.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Aggregation.MEDIAN.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Aggregation.MIN.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Aggregation.MAX.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$74(String str, ModelManagerViewModel modelManagerViewModel, BenchmarkViewModel benchmarkViewModel, Function0 function0, int i, Composer composer, int i2) {
        BenchmarkResultsViewer(str, modelManagerViewModel, benchmarkViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatRow$lambda$81(String str, String str2, Modifier modifier, String str3, Double d, boolean z, int i, int i2, Composer composer, int i3) {
        StatRow(str, str2, modifier, str3, d, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValueSeriesRow$lambda$98(String str, ValueSeries valueSeries, Aggregation aggregation, Modifier modifier, String str2, ValueSeries valueSeries2, Aggregation aggregation2, boolean z, int i, int i2, Composer composer, int i3) {
        ValueSeriesRow(str, valueSeries, aggregation, modifier, str2, valueSeries2, aggregation2, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x055a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BenchmarkResultsViewer(final java.lang.String r46, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r47, final com.google.ai.edge.gallery.ui.benchmark.BenchmarkViewModel r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, androidx.compose.runtime.Composer r50, final int r51) {
        /*
            Method dump skipped, instruction units count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt.BenchmarkResultsViewer(java.lang.String, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, com.google.ai.edge.gallery.ui.benchmark.BenchmarkViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BenchmarkUiState BenchmarkResultsViewer$lambda$0(State<BenchmarkUiState> state) {
        Object thisObj$iv = state.getValue();
        return (BenchmarkUiState) thisObj$iv;
    }

    private static final boolean BenchmarkResultsViewer$lambda$2(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BenchmarkResultsViewer$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BenchmarkResultsViewer$lambda$5(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BenchmarkResultsViewer$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BenchmarkResultsViewer$lambda$8(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BenchmarkResultsViewer$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BenchmarkResultsViewer$lambda$11(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BenchmarkResultsViewer$lambda$15(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$23$lambda$22(Function0 $onClose, State $uiState$delegate) {
        if (!BenchmarkResultsViewer$lambda$0($uiState$delegate).getRunning()) {
            $onClose.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$32(final State $uiState$delegate, final SnapshotStateList $filterableModelNames, final CoroutineScope $scope, final MutableState $selectedModelName$delegate, final MutableState $showLazyListPlacementAnimation$delegate, final SnapshotStateList $filteredResults, final MutableState $showBenchmarkComparisonHelpBottomSheet$delegate, final Function0 $onClose, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C177@7417L863,201@8307L400,214@8756L208,175@7353L1620:BenchmarkResultsViewer.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1793383646, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous> (BenchmarkResultsViewer.kt:175)");
            }
            AppBarKt.m3537CenterAlignedTopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-735963747, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$32$lambda$27($uiState$delegate, $filterableModelNames, $scope, $selectedModelName$delegate, $showLazyListPlacementAnimation$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-971237285, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$32$lambda$30($filteredResults, $showBenchmarkComparisonHelpBottomSheet$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-1806506734, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$32$lambda$31($onClose, $uiState$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$32$lambda$27(State $uiState$delegate, SnapshotStateList $filterableModelNames, final CoroutineScope $scope, final MutableState $selectedModelName$delegate, final MutableState $showLazyListPlacementAnimation$delegate, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Object value$iv;
        ComposerKt.sourceInformation($composer, "C:BenchmarkResultsViewer.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-735963747, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:178)");
            }
            if (BenchmarkResultsViewer$lambda$0($uiState$delegate).getRunning()) {
                $composer.startReplaceGroup(704700549);
            } else {
                $composer.startReplaceGroup(712118322);
                ComposerKt.sourceInformation($composer, "179@7465L793");
                Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier$iv = Modifier.INSTANCE;
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                int $changed$iv$iv = (384 << 3) & 112;
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
                int i2 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 776747863, "C181@7562L42,182@7644L10,183@7706L11,180@7540L204,189@7968L259,185@7759L485:BenchmarkResultsViewer.kt#aos0mq");
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.benchmark_results, $composer, 0), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131066);
                String strBenchmarkResultsViewer$lambda$15 = BenchmarkResultsViewer$lambda$15($selectedModelName$delegate);
                SnapshotStateList snapshotStateList = $filterableModelNames;
                int i3 = C2421R.string.select_model;
                ComposerKt.sourceInformationMarkerStart($composer, 1549090287, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
                boolean invalid$iv = $composer.changedInstance($scope);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BenchmarkResultsViewerKt.m466x2879635($scope, $showLazyListPlacementAnimation$delegate, $selectedModelName$delegate, (String) obj);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                } else {
                    value$iv = it$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                BenchmarkModelPickerKt.BenchmarkModelPicker(strBenchmarkResultsViewer$lambda$15, snapshotStateList, i3, (Function1) value$iv, $composer, 48);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkResultsViewer$lambda$32$lambda$27$lambda$26$lambda$25$lambda$24 */
    public static final Unit m466x2879635(CoroutineScope $scope, MutableState $showLazyListPlacementAnimation$delegate, MutableState $selectedModelName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BenchmarkResultsViewer$lambda$6($showLazyListPlacementAnimation$delegate, true);
        $selectedModelName$delegate.setValue(it);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BenchmarkResultsViewerKt$BenchmarkResultsViewer$6$1$1$1$1$1($showLazyListPlacementAnimation$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$32$lambda$30(SnapshotStateList $filteredResults, final MutableState $showBenchmarkComparisonHelpBottomSheet$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:BenchmarkResultsViewer.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-971237285, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:202)");
            }
            if ($filteredResults.size() > 1) {
                $composer.startReplaceGroup(1064765970);
                ComposerKt.sourceInformation($composer, "203@8384L49,203@8363L251");
                ComposerKt.sourceInformationMarkerStart($composer, -1351125140, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
                Object it$iv = $composer.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$32$lambda$30$lambda$29$lambda$28($showBenchmarkComparisonHelpBottomSheet$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) it$iv, null, false, null, null, null, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.m10811getLambda$812879998$app_debug(), $composer, 1572870, 62);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1065040134);
                ComposerKt.sourceInformation($composer, "210@8646L39");
                SpacerKt.Spacer(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(48)), $composer, 6);
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
    public static final Unit BenchmarkResultsViewer$lambda$32$lambda$30$lambda$29$lambda$28(MutableState $showBenchmarkComparisonHelpBottomSheet$delegate) {
        BenchmarkResultsViewer$lambda$9($showBenchmarkComparisonHelpBottomSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$32$lambda$31(Function0 $onClose, State $uiState$delegate, RowScope CenterAlignedTopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
        ComposerKt.sourceInformation($composer, "C:BenchmarkResultsViewer.kt#aos0mq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1806506734, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:215)");
            }
            if (BenchmarkResultsViewer$lambda$0($uiState$delegate).getRunning()) {
                $composer.startReplaceGroup(-1710580656);
            } else {
                $composer.startReplaceGroup(-1701854900);
                ComposerKt.sourceInformation($composer, "216@8804L138");
                IconButtonKt.IconButton($onClose, null, false, null, null, null, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.getLambda$1434757579$app_debug(), $composer, 1572864, 62);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$58(final State $uiState$delegate, final SnapshotStateList $filteredResults, final BenchmarkViewModel $viewModel, final CoroutineScope $scope, final MutableState $showLazyListPlacementAnimation$delegate, final MutableState $benchmarkResultIdToDelete$delegate, final MutableState $showConfirmDeleteDialog$delegate, final PaddingValues innerPadding, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        ComposerKt.sourceInformation($composer, "C225@9046L23593:BenchmarkResultsViewer.kt#aos0mq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(innerPadding) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1968519287, $dirty2, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous> (BenchmarkResultsViewer.kt:225)");
            }
            Modifier modifier$iv = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (6 << 3) & 112;
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
                $composer.createNode(constructor);
            } else {
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
            int i2 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1879062642, "C228@9174L344,239@9528L23105,226@9093L23540:BenchmarkResultsViewer.kt#aos0mq");
            Boolean boolValueOf = Boolean.valueOf(BenchmarkResultsViewer$lambda$0($uiState$delegate).getRunning());
            ComposerKt.sourceInformationMarkerStart($composer, 1307520309, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$58$lambda$57$lambda$36$lambda$35((AnimatedContentTransitionScope) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) it$iv, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1731368128, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56(innerPadding, $uiState$delegate, $filteredResults, $viewModel, $scope, $showLazyListPlacementAnimation$delegate, $benchmarkResultIdToDelete$delegate, $showConfirmDeleteDialog$delegate, (AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 1573248, 58);
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
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform BenchmarkResultsViewer$lambda$58$lambda$57$lambda$36$lambda$35(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((Boolean) AnimatedContent.getTargetState()).booleanValue()) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.m1159scaleInL8ZKhE$default(null, 0.8f, 0L, 5, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.m1161scaleOutL8ZKhE$default(null, 0.8f, 0L, 5, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(BenchmarkResultsViewerKt.m467x83db2232(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(BenchmarkResultsViewerKt.m468x83db2233(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkResultsViewer$lambda$58$lambda$57$lambda$36$lambda$35$lambda$33 */
    public static final int m467x83db2232(int it) {
        return 40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkResultsViewer$lambda$58$lambda$57$lambda$36$lambda$35$lambda$34 */
    public static final int m468x83db2233(int it) {
        return 40;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56(final PaddingValues $innerPadding, final State $uiState$delegate, final SnapshotStateList $filteredResults, final BenchmarkViewModel $viewModel, final CoroutineScope $scope, final MutableState $showLazyListPlacementAnimation$delegate, final MutableState $benchmarkResultIdToDelete$delegate, final MutableState $showConfirmDeleteDialog$delegate, AnimatedContentScope AnimatedContent, boolean running, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Composer $composer$iv;
        Function0<ComposeUiNode> function03;
        Function0<ComposeUiNode> function04;
        Function0<ComposeUiNode> function05;
        Function0<ComposeUiNode> function06;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C:BenchmarkResultsViewer.kt#aos0mq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1731368128, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous>.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:241)");
        }
        if (running) {
            $composer.startReplaceGroup(-925535919);
            ComposerKt.sourceInformation($composer, "242@9606L1339");
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, $innerPadding.getTop(), 0.0f, 0.0f, 13, null);
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (48 << 3) & 112;
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
                function04 = constructor;
                $composer.createNode(function04);
            } else {
                function04 = constructor;
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
            int i2 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1791099558, "C246@9783L1150:BenchmarkResultsViewer.kt#aos0mq");
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical center = Arrangement.INSTANCE.getCenter();
            Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, $innerPadding.getBottom(), 7, null);
            Arrangement.Vertical verticalArrangement$iv = center;
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv2 = (432 << 3) & 112;
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
                function05 = constructor2;
                $composer.createNode(function05);
            } else {
                function05 = constructor2;
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -2015242717, "C252@10064L855:BenchmarkResultsViewer.kt#aos0mq");
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(24));
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv$iv = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv3 = (432 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer, modifier$iv$iv);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function06 = constructor3;
                $composer.createNode(function06);
            } else {
                function06 = constructor3;
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
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i6 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -2008641057, "C257@10278L78,260@10427L46,261@10515L10,262@10579L11,259@10403L216,267@10793L11,268@10863L10,265@10670L233:BenchmarkResultsViewer.kt#aos0mq");
            ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(36)), 0L, C1654Dp.m9788constructorimpl(4), 0L, 0, 0.0f, $composer, 390, 58);
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.running_benchmark_msg, $composer, 0), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131066);
            TextKt.m4781TextNvy7gAk(BenchmarkResultsViewer$lambda$0($uiState$delegate).getCompletedRunCount() + " / " + BenchmarkResultsViewer$lambda$0($uiState$delegate).getTotalRunCount(), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge(), $composer, 0, 0, 131066);
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
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(-923550462);
            ComposerKt.sourceInformation($composer, "278@11147L11,274@10973L21642");
            Modifier modifier$iv3 = BackgroundKt.m1359backgroundbw27NRU$default(PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, $innerPadding.getTop(), 0.0f, 0.0f, 13, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainer(), null, 2, null);
            Alignment contentAlignment$iv2 = Alignment.INSTANCE.getTopCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
            int $changed$iv$iv4 = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv4 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer, modifier$iv3);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor4;
                $composer.createNode(function0);
            } else {
                function0 = constructor4;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = ($changed$iv$iv$iv4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i8 = ((48 >> 6) & 112) | 6;
            BoxScope $this$BenchmarkResultsViewer_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1633519018, "C281@11256L20871,684@32469L11,678@32188L415:BenchmarkResultsViewer.kt#aos0mq");
            Modifier modifier$iv4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv3 = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv3 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv5 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv3, horizontalAlignment$iv3, $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            int $changed$iv$iv5 = (6 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv5 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer, modifier$iv4);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv5 = (($changed$iv$iv5 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor5;
                $composer.createNode(function02);
            } else {
                function02 = constructor5;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv5, Integer.valueOf(compositeKeyHash$iv$iv5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = ($changed$iv$iv$iv5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int i10 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 25145838, "C:BenchmarkResultsViewer.kt#aos0mq");
            if ($filteredResults.isEmpty()) {
                $composer.startReplaceGroup(24553644);
                ComposerKt.sourceInformation($composer, "286@11437L596");
                Arrangement.Vertical center2 = Arrangement.INSTANCE.getCenter();
                Alignment.Horizontal horizontalAlignment$iv4 = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifier$iv5 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Vertical verticalArrangement$iv4 = center2;
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv6 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv4, horizontalAlignment$iv4, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                int $changed$iv$iv6 = (438 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap localMap$iv$iv6 = $composer.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv6 = ComposedModifierKt.materializeModifier($composer, modifier$iv5);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv6 = (($changed$iv$iv6 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function03 = constructor6;
                    $composer.createNode(function03);
                } else {
                    function03 = constructor6;
                    $composer.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv6 = Updater.m6165constructorimpl($composer);
                $composer$iv = $composer;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, measurePolicy$iv6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, localMap$iv$iv6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv6, Integer.valueOf(compositeKeyHash$iv$iv6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, materialized$iv$iv6, ComposeUiNode.INSTANCE.getSetModifier());
                int i11 = ($changed$iv$iv$iv6 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                int i12 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 95951543, "C292@11692L45,293@11781L11,294@11853L10,291@11666L349:BenchmarkResultsViewer.kt#aos0mq");
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.benchmark_no_results, $composer, 0), PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(32), 0.0f, 2, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m9620boximpl(TextAlign.INSTANCE.m9627getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 48, 0, 130040);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer$iv = $composer;
                $composer.startReplaceGroup(25786824);
                ComposerKt.sourceInformation($composer, "301@12173L19924,301@12098L19999");
                Modifier modifierM1990paddingVpY3zN4$default = PaddingKt.m1990paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(16), 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer, 1109214132, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
                boolean invalid$iv = $composer.changedInstance($viewModel) | $composer.changed($uiState$delegate) | $composer.changedInstance($scope) | $composer.changed($innerPadding);
                Object value$iv = $composer.rememberedValue();
                if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                    value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BenchmarkResultsViewerKt.m469x7cb1531a($filteredResults, $viewModel, $showLazyListPlacementAnimation$delegate, $uiState$delegate, $scope, $benchmarkResultIdToDelete$delegate, $showConfirmDeleteDialog$delegate, $innerPadding, (LazyListScope) obj);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                LazyDslKt.LazyColumn(modifierM1990paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) value$iv, $composer, 6, 510);
                $composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            BoxKt.Box($this$BenchmarkResultsViewer_u24lambda_u2458_u24lambda_u2457_u24lambda_u2456_u24lambda_u2455.align(BackgroundKt.background$default(SizeKt.m2022height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $innerPadding.getBottom()), Brush.Companion.m6870verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(Color.INSTANCE.m6950getTransparent0d7_KjU()), Color.m6905boximpl(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainer())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Alignment.INSTANCE.getBottomCenter()), $composer, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52 */
    public static final Unit m469x7cb1531a(final SnapshotStateList $filteredResults, final BenchmarkViewModel $viewModel, final MutableState $showLazyListPlacementAnimation$delegate, final State $uiState$delegate, final CoroutineScope $scope, final MutableState $benchmarkResultIdToDelete$delegate, final MutableState $showConfirmDeleteDialog$delegate, final PaddingValues $innerPadding, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.m10806getLambda$1266842233$app_debug(), 3, null);
        if ($filteredResults.size() > 1) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-545931700, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BenchmarkResultsViewerKt.m470xcf147375($viewModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        final SnapshotStateList items$iv = $filteredResults;
        final Function2 key$iv = new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BenchmarkResultsViewerKt.m473xcf147376(((Integer) obj).intValue(), (BenchmarkResultInfo) obj2);
            }
        };
        LazyColumn.items(items$iv.size(), new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$itemsIndexed$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return key$iv.invoke(Integer.valueOf(index), items$iv.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                items$iv.get(index);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Modifier modifierAnimateItem$default;
                Composer $composer2;
                int $dirty;
                ComposerKt.sourceInformation($composer, "CN(it)214@10668L26:LazyDsl.kt#428nma");
                int $dirty2 = $changed;
                if (($changed & 6) == 0) {
                    $dirty2 |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty2 |= $composer.changed(it) ? 32 : 16;
                }
                if ($composer.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2039820996, $dirty2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    int $changed2 = ($dirty2 & 14) | ($dirty2 & 112);
                    final BenchmarkResultInfo result = (BenchmarkResultInfo) items$iv.get(it);
                    $composer.startReplaceGroup(-1858549240);
                    ComposerKt.sourceInformation($composer, "C:BenchmarkResultsViewer.kt#aos0mq");
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(20))), 0.0f, 1, null);
                    if (!BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$5($showLazyListPlacementAnimation$delegate)) {
                        modifierAnimateItem$default = modifierFillMaxWidth$default;
                    } else {
                        modifierAnimateItem$default = LazyItemScope.animateItem$default($this$items, modifierFillMaxWidth$default, null, null, null, 7, null);
                    }
                    final LlmBenchmarkResult llmResult = result.getBenchmarkResult().getLlmResult();
                    if (llmResult == null) {
                        $composer.startReplaceGroup(-1858292500);
                        $composer.endReplaceGroup();
                        $composer2 = $composer;
                        $dirty = it;
                    } else {
                        $composer.startReplaceGroup(-1858292499);
                        ComposerKt.sourceInformation($composer, "*352@14782L56,354@14930L1474,383@16430L15325,345@14356L17399");
                        final String modelName = llmResult.getBaiscInfo().getModelName();
                        String str = modelName + " · " + llmResult.getBaiscInfo().getAccelerator();
                        String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(llmResult.getBaiscInfo().getStartMs()));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                        boolean expanded = result.getExpanded();
                        ComposerKt.sourceInformationMarkerStart($composer, 1315545617, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
                        boolean invalid$iv = $composer.changedInstance($viewModel) | (((($changed2 & 896) ^ 384) > 256 && $composer.changed(result)) || ($changed2 & 384) == 256);
                        Object it$iv = $composer.rememberedValue();
                        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                            final BenchmarkViewModel benchmarkViewModel = $viewModel;
                            Object value$iv = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean it2) {
                                    benchmarkViewModel.setExpanded(result.getId(), it2);
                                }
                            };
                            $composer.updateRememberedValue(value$iv);
                            it$iv = value$iv;
                        }
                        Function1 function1 = (Function1) it$iv;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        final SnapshotStateList snapshotStateList = $filteredResults;
                        final BenchmarkViewModel benchmarkViewModel2 = $viewModel;
                        final State state = $uiState$delegate;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-34736102, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer $composer3, int $changed3) {
                                ComposerKt.sourceInformation($composer3, "C:BenchmarkResultsViewer.kt#aos0mq");
                                if ($composer3.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-34736102, $changed3, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:357)");
                                    }
                                    if (snapshotStateList.size() > 1) {
                                        $composer3.startReplaceGroup(264163808);
                                        ComposerKt.sourceInformation($composer3, "359@15236L41,358@15184L1166");
                                        String id = result.getId();
                                        BenchmarkResultInfo baselineResult = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state).getBaselineResult();
                                        boolean zAreEqual = Intrinsics.areEqual(id, baselineResult != null ? baselineResult.getId() : null);
                                        String id2 = result.getId();
                                        BenchmarkResultInfo baselineResult2 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state).getBaselineResult();
                                        Function2<Composer, Integer, Unit> function2M10810getLambda$763219676$app_debug = Intrinsics.areEqual(id2, baselineResult2 != null ? baselineResult2.getId() : null) ? ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.m10810getLambda$763219676$app_debug() : null;
                                        Modifier modifierM2022height3ABfNKs = SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24));
                                        ComposerKt.sourceInformationMarkerStart($composer3, 978354179, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
                                        boolean invalid$iv2 = $composer3.changedInstance(benchmarkViewModel2) | $composer3.changed(result);
                                        final BenchmarkViewModel benchmarkViewModel3 = benchmarkViewModel2;
                                        final BenchmarkResultInfo benchmarkResultInfo = result;
                                        Object it$iv2 = $composer3.rememberedValue();
                                        if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                                            Object value$iv2 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$2$1$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    benchmarkViewModel3.setBaseline(benchmarkResultInfo.getId());
                                                }
                                            };
                                            $composer3.updateRememberedValue(value$iv2);
                                            it$iv2 = value$iv2;
                                        }
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        ChipKt.FilterChip(zAreEqual, (Function0) it$iv2, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.m10809getLambda$342843892$app_debug(), modifierM2022height3ABfNKs, false, function2M10810getLambda$763219676$app_debug, null, null, null, null, null, null, $composer3, 3456, 0, 4048);
                                        $composer3.endReplaceGroup();
                                    } else {
                                        $composer3.startReplaceGroup(249092104);
                                        $composer3.endReplaceGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                $composer3.skipToGroupEnd();
                            }
                        }, $composer, 54);
                        final BenchmarkViewModel benchmarkViewModel3 = $viewModel;
                        final State state2 = $uiState$delegate;
                        final CoroutineScope coroutineScope = $scope;
                        final MutableState mutableState = $benchmarkResultIdToDelete$delegate;
                        final MutableState mutableState2 = $showConfirmDeleteDialog$delegate;
                        $composer2 = $composer;
                        $dirty = it;
                        AccordionsKt.m10821AccordionsueL0Wzs(str, expanded, function1, modifierAnimateItem$default, str2, true, 0L, composableLambdaRememberComposableLambda, false, ComposableLambdaKt.rememberComposableLambda(1667791320, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer $composer3, int $changed3) {
                                Function0<ComposeUiNode> function0;
                                Function0<ComposeUiNode> function02;
                                Composer $composer$iv$iv$iv;
                                Composer $composer4;
                                Composer $composer5;
                                Composer $composer$iv$iv$iv2;
                                Composer $composer$iv$iv$iv3;
                                ComposerKt.sourceInformation($composer3, "C384@16456L15275:BenchmarkResultsViewer.kt#aos0mq");
                                if (!$composer3.shouldExecute(($changed3 & 3) != 2, $changed3 & 1)) {
                                    $composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1667791320, $changed3, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:384)");
                                }
                                Arrangement.Vertical verticalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
                                Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(2), 7, null);
                                Arrangement.Vertical verticalArrangement$iv = verticalM1843spacedBy0680j_4;
                                final BenchmarkResultInfo benchmarkResultInfo = result;
                                final BenchmarkViewModel benchmarkViewModel4 = benchmarkViewModel3;
                                final LlmBenchmarkResult llmBenchmarkResult = llmResult;
                                final State<BenchmarkUiState> state3 = state2;
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                final String str3 = modelName;
                                final MutableState<String> mutableState3 = mutableState;
                                final MutableState<Boolean> mutableState4 = mutableState2;
                                ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
                                MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                int $changed$iv$iv = (54 << 3) & 112;
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
                                    function0 = constructor;
                                    $composer3.createNode(function0);
                                } else {
                                    function0 = constructor;
                                    $composer3.useNode();
                                }
                                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
                                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                                int i = ($changed$iv$iv$iv >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                int i2 = ((54 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer3, 1567406953, "C390@16753L35,391@16842L11,393@16987L123,397@17221L1325,389@16705L1841,424@18640L7,427@18755L32,432@19090L11,434@19231L119,438@19478L3086,493@22659L5459,425@18674L9444,597@28184L3521:BenchmarkResultsViewer.kt#aos0mq");
                                String strStringResource = StringResources_androidKt.stringResource(C2421R.string.basic_info, $composer3, 0);
                                long surfaceContainerLow = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceContainerLow();
                                boolean basicInfoExpanded = benchmarkResultInfo.getBasicInfoExpanded();
                                Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(12)));
                                ComposerKt.sourceInformationMarkerStart($composer3, -503633667, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
                                boolean invalid$iv2 = $composer3.changedInstance(benchmarkViewModel4) | $composer3.changed(benchmarkResultInfo);
                                Object it$iv2 = $composer3.rememberedValue();
                                if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                                    Object value$iv2 = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$3$1$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                            invoke(bool.booleanValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(boolean it2) {
                                            benchmarkViewModel4.setBasicInfoExpanded(benchmarkResultInfo.getId(), it2);
                                        }
                                    };
                                    $composer3.updateRememberedValue(value$iv2);
                                    it$iv2 = value$iv2;
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                AccordionsKt.m10821AccordionsueL0Wzs(strStringResource, basicInfoExpanded, (Function1) it$iv2, modifierClip, null, false, surfaceContainerLow, null, false, ComposableLambdaKt.rememberComposableLambda(1112578369, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$3$1$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer $composer6, int $changed4) {
                                        Function0<ComposeUiNode> function03;
                                        ComposerKt.sourceInformation($composer6, "C398@17251L1267:BenchmarkResultsViewer.kt#aos0mq");
                                        if (!$composer6.shouldExecute(($changed4 & 3) != 2, $changed4 & 1)) {
                                            $composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1112578369, $changed4, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:398)");
                                        }
                                        Arrangement.Vertical verticalM1843spacedBy0680j_42 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
                                        Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(6), C1654Dp.m9788constructorimpl(6), 0.0f, C1654Dp.m9788constructorimpl(4), 4, null);
                                        Arrangement.Vertical verticalArrangement$iv2 = verticalM1843spacedBy0680j_42;
                                        LlmBenchmarkResult llmBenchmarkResult2 = llmBenchmarkResult;
                                        ComposerKt.sourceInformationMarkerStart($composer6, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                        Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
                                        MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer6, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                        int $changed$iv$iv2 = (54 << 3) & 112;
                                        ComposerKt.sourceInformationMarkerStart($composer6, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                                        int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer6, 0));
                                        CompositionLocalMap localMap$iv$iv2 = $composer6.getCurrentCompositionLocalMap();
                                        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer6, modifier$iv2);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer6, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                        if (!($composer6.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        $composer6.startReusableNode();
                                        if ($composer6.getInserting()) {
                                            function03 = constructor2;
                                            $composer6.createNode(function03);
                                        } else {
                                            function03 = constructor2;
                                            $composer6.useNode();
                                        }
                                        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer6);
                                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer6, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                        int i4 = ((54 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer6, 808894237, "C402@17501L63,403@17595L168,407@17794L178,411@18003L176,415@18210L177,419@18418L70:BenchmarkResultsViewer.kt#aos0mq");
                                        String modelName2 = llmBenchmarkResult2.getBaiscInfo().getModelName();
                                        Intrinsics.checkNotNullExpressionValue(modelName2, "getModelName(...)");
                                        BenchmarkResultsViewerKt.StatRow(ExifInterface.TAG_MODEL, modelName2, null, null, null, false, $composer6, 6, 60);
                                        String accelerator = llmBenchmarkResult2.getBaiscInfo().getAccelerator();
                                        Intrinsics.checkNotNullExpressionValue(accelerator, "getAccelerator(...)");
                                        BenchmarkResultsViewerKt.StatRow("Accelerator", accelerator, null, null, null, false, $composer6, 6, 60);
                                        BenchmarkResultsViewerKt.StatRow("Prefill tokens", String.valueOf(llmBenchmarkResult2.getBaiscInfo().getPrefillTokens()), null, null, null, false, $composer6, 6, 60);
                                        BenchmarkResultsViewerKt.StatRow("Decode tokens", String.valueOf(llmBenchmarkResult2.getBaiscInfo().getDecodeTokens()), null, null, null, false, $composer6, 6, 60);
                                        BenchmarkResultsViewerKt.StatRow("Number of runs", String.valueOf(llmBenchmarkResult2.getBaiscInfo().getNumberOfRuns()), null, null, null, false, $composer6, 6, 60);
                                        String appVersion = llmBenchmarkResult2.getBaiscInfo().getAppVersion();
                                        Intrinsics.checkNotNullExpressionValue(appVersion, "getAppVersion(...)");
                                        BenchmarkResultsViewerKt.StatRow("App version", appVersion, null, null, null, false, $composer6, 6, 60);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        $composer6.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, $composer3, 54), $composer3, 805306368, 432);
                                ProvidableCompositionLocal<Resources> localResources = AndroidCompositionLocals_androidKt.getLocalResources();
                                ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object objConsume = $composer3.consume(localResources);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                Resources resources = (Resources) objConsume;
                                String str4 = StringResources_androidKt.stringResource(C2421R.string.results, $composer3, 0) + " (" + resources.getQuantityString(C2421R.plurals.runs, llmBenchmarkResult.getBaiscInfo().getNumberOfRuns(), Integer.valueOf(llmBenchmarkResult.getBaiscInfo().getNumberOfRuns())) + ")";
                                long surfaceContainerLow2 = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceContainerLow();
                                boolean statsExpanded = benchmarkResultInfo.getStatsExpanded();
                                Modifier modifierClip2 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(12)));
                                ComposerKt.sourceInformationMarkerStart($composer3, -503561863, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
                                boolean invalid$iv3 = $composer3.changedInstance(benchmarkViewModel4) | $composer3.changed(benchmarkResultInfo);
                                Object it$iv3 = $composer3.rememberedValue();
                                if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                                    Object value$iv3 = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$3$1$3$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                            invoke(bool.booleanValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(boolean it2) {
                                            benchmarkViewModel4.setStatsExpanded(benchmarkResultInfo.getId(), it2);
                                        }
                                    };
                                    $composer3.updateRememberedValue(value$iv3);
                                    it$iv3 = value$iv3;
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                AccordionsKt.m10821AccordionsueL0Wzs(str4, statsExpanded, (Function1) it$iv3, modifierClip2, null, false, surfaceContainerLow2, ComposableLambdaKt.rememberComposableLambda(1947515372, true, new C2630xe087b5c7(benchmarkResultInfo, benchmarkViewModel4), $composer3, 54), true, ComposableLambdaKt.rememberComposableLambda(-816030678, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$3$1$5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer $composer6, int $changed4) {
                                        Function0<ComposeUiNode> function03;
                                        BenchmarkResultInfo baselineResult;
                                        BenchmarkResultInfo baselineResult2;
                                        BenchmarkResultInfo baselineResult3;
                                        BenchmarkResultInfo baselineResult4;
                                        BenchmarkResult benchmarkResult;
                                        LlmBenchmarkResult llmResult2;
                                        ComposerKt.sourceInformation($composer6, "C494@22689L5401:BenchmarkResultsViewer.kt#aos0mq");
                                        if (!$composer6.shouldExecute(($changed4 & 3) != 2, $changed4 & 1)) {
                                            $composer6.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-816030678, $changed4, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:494)");
                                        }
                                        Arrangement.Vertical verticalM1843spacedBy0680j_42 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
                                        Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(6), C1654Dp.m9788constructorimpl(6), 0.0f, 0.0f, 12, null);
                                        Arrangement.Vertical verticalArrangement$iv2 = verticalM1843spacedBy0680j_42;
                                        LlmBenchmarkResult llmBenchmarkResult2 = llmBenchmarkResult;
                                        BenchmarkResultInfo benchmarkResultInfo2 = benchmarkResultInfo;
                                        State<BenchmarkUiState> state4 = state3;
                                        ComposerKt.sourceInformationMarkerStart($composer6, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                        Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
                                        MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer6, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                                        int $changed$iv$iv2 = (54 << 3) & 112;
                                        ComposerKt.sourceInformationMarkerStart($composer6, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                                        int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer6, 0));
                                        CompositionLocalMap localMap$iv$iv2 = $composer6.getCurrentCompositionLocalMap();
                                        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer6, modifier$iv2);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer6, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                        if (!($composer6.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        $composer6.startReusableNode();
                                        if ($composer6.getInserting()) {
                                            function03 = constructor2;
                                            $composer6.createNode(function03);
                                        } else {
                                            function03 = constructor2;
                                            $composer6.useNode();
                                        }
                                        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer6);
                                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer6, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                        int i4 = ((54 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer6, -1830070145, "C500@23064L947,518@24042L944,536@25017L1007,555@26055L810:BenchmarkResultsViewer.kt#aos0mq");
                                        BenchmarkResultInfo baselineResult5 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult();
                                        LlmBenchmarkStats baselineStats = (baselineResult5 == null || (benchmarkResult = baselineResult5.getBenchmarkResult()) == null || (llmResult2 = benchmarkResult.getLlmResult()) == null) ? null : llmResult2.getStats();
                                        ValueSeries prefillSpeed = llmBenchmarkResult2.getStats().getPrefillSpeed();
                                        Intrinsics.checkNotNullExpressionValue(prefillSpeed, "getPrefillSpeed(...)");
                                        Aggregation aggregation = benchmarkResultInfo2.getAggregation();
                                        String id = benchmarkResultInfo2.getId();
                                        BenchmarkResultInfo baselineResult6 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult();
                                        ValueSeries prefillSpeed2 = (Intrinsics.areEqual(id, baselineResult6 != null ? baselineResult6.getId() : null) || baselineStats == null) ? null : baselineStats.getPrefillSpeed();
                                        String id2 = benchmarkResultInfo2.getId();
                                        BenchmarkResultInfo baselineResult7 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult();
                                        Aggregation aggregation2 = (Intrinsics.areEqual(id2, baselineResult7 != null ? baselineResult7.getId() : null) || (baselineResult4 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult()) == null) ? null : baselineResult4.getAggregation();
                                        BenchmarkResultsViewerKt.ValueSeriesRow("Prefill speed", prefillSpeed, aggregation, null, "tokens/sec", prefillSpeed2, aggregation2, false, $composer6, 24582, 136);
                                        ValueSeries decodeSpeed = llmBenchmarkResult2.getStats().getDecodeSpeed();
                                        Intrinsics.checkNotNullExpressionValue(decodeSpeed, "getDecodeSpeed(...)");
                                        Aggregation aggregation3 = benchmarkResultInfo2.getAggregation();
                                        String id3 = benchmarkResultInfo2.getId();
                                        BenchmarkResultInfo baselineResult8 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult();
                                        ValueSeries decodeSpeed2 = (Intrinsics.areEqual(id3, baselineResult8 != null ? baselineResult8.getId() : null) || baselineStats == null) ? null : baselineStats.getDecodeSpeed();
                                        String id4 = benchmarkResultInfo2.getId();
                                        BenchmarkResultInfo baselineResult9 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult();
                                        Aggregation aggregation4 = (Intrinsics.areEqual(id4, baselineResult9 != null ? baselineResult9.getId() : null) || (baselineResult3 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult()) == null) ? null : baselineResult3.getAggregation();
                                        BenchmarkResultsViewerKt.ValueSeriesRow("Decode speed", decodeSpeed, aggregation3, null, "tokens/sec", decodeSpeed2, aggregation4, false, $composer6, 24582, 136);
                                        ValueSeries timeToFirstToken = llmBenchmarkResult2.getStats().getTimeToFirstToken();
                                        Intrinsics.checkNotNullExpressionValue(timeToFirstToken, "getTimeToFirstToken(...)");
                                        Aggregation aggregation5 = benchmarkResultInfo2.getAggregation();
                                        String id5 = benchmarkResultInfo2.getId();
                                        BenchmarkResultInfo baselineResult10 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult();
                                        ValueSeries timeToFirstToken2 = (Intrinsics.areEqual(id5, baselineResult10 != null ? baselineResult10.getId() : null) || baselineStats == null) ? null : baselineStats.getTimeToFirstToken();
                                        String id6 = benchmarkResultInfo2.getId();
                                        BenchmarkResultInfo baselineResult11 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult();
                                        Aggregation aggregation6 = (Intrinsics.areEqual(id6, baselineResult11 != null ? baselineResult11.getId() : null) || (baselineResult2 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult()) == null) ? null : baselineResult2.getAggregation();
                                        BenchmarkResultsViewerKt.ValueSeriesRow("Time to first token", timeToFirstToken, aggregation5, null, "sec", timeToFirstToken2, aggregation6, true, $composer6, 12607494, 8);
                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                        String str5 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(llmBenchmarkResult2.getStats().getFirstInitTimeMs())}, 1));
                                        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                                        String id7 = benchmarkResultInfo2.getId();
                                        BenchmarkResultInfo baselineResult12 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult();
                                        Double dValueOf = (Intrinsics.areEqual(id7, baselineResult12 != null ? baselineResult12.getId() : null) || baselineStats == null) ? null : Double.valueOf(baselineStats.getFirstInitTimeMs());
                                        BenchmarkResultsViewerKt.StatRow("First init time", str5, null, "ms", dValueOf, true, $composer6, 199686, 4);
                                        if (llmBenchmarkResult2.getStats().getNonFirstInitTimeMs().getValueCount() > 1) {
                                            $composer6.startReplaceGroup(-1826200199);
                                            ComposerKt.sourceInformation($composer6, "573@26985L1043");
                                            ValueSeries nonFirstInitTimeMs = llmBenchmarkResult2.getStats().getNonFirstInitTimeMs();
                                            Intrinsics.checkNotNullExpressionValue(nonFirstInitTimeMs, "getNonFirstInitTimeMs(...)");
                                            Aggregation aggregation7 = benchmarkResultInfo2.getAggregation();
                                            String id8 = benchmarkResultInfo2.getId();
                                            BenchmarkResultInfo baselineResult13 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult();
                                            ValueSeries nonFirstInitTimeMs2 = (Intrinsics.areEqual(id8, baselineResult13 != null ? baselineResult13.getId() : null) || baselineStats == null) ? null : baselineStats.getNonFirstInitTimeMs();
                                            String id9 = benchmarkResultInfo2.getId();
                                            BenchmarkResultInfo baselineResult14 = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult();
                                            Aggregation aggregation8 = (Intrinsics.areEqual(id9, baselineResult14 != null ? baselineResult14.getId() : null) || (baselineResult = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(state4).getBaselineResult()) == null) ? null : baselineResult.getAggregation();
                                            BenchmarkResultsViewerKt.ValueSeriesRow("Steady init time", nonFirstInitTimeMs, aggregation7, null, "ms", nonFirstInitTimeMs2, aggregation8, true, $composer6, 12607494, 8);
                                        } else {
                                            $composer6.startReplaceGroup(-1852970962);
                                        }
                                        $composer6.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        $composer6.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        ComposerKt.sourceInformationMarkerEnd($composer6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, $composer3, 54), $composer3, 918552576, 48);
                                Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                                Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getEnd();
                                Modifier modifier$iv2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                                int $changed$iv$iv2 = (438 << 3) & 112;
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
                                    function02 = constructor2;
                                    $composer3.createNode(function02);
                                } else {
                                    function02 = constructor2;
                                    $composer3.useNode();
                                }
                                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer3);
                                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                                int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
                                ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                int i4 = ((438 >> 6) & 112) | 6;
                                ComposerKt.sourceInformationMarkerStart($composer3, 1716739255, "C604@28551L166,603@28495L960,623@29485L39,626@29621L7,628@29705L759,644@30631L11,643@30552L143,627@29657L2020:BenchmarkResultsViewer.kt#aos0mq");
                                ComposerKt.sourceInformationMarkerStart($composer3, -1607190524, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
                                boolean invalid$iv4 = $composer3.changed(benchmarkResultInfo);
                                Object it$iv4 = $composer3.rememberedValue();
                                if (invalid$iv4 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                                    Object value$iv4 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$3$1$6$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            mutableState3.setValue(benchmarkResultInfo.getId());
                                            BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$3(mutableState4, true);
                                        }
                                    };
                                    $composer3.updateRememberedValue(value$iv4);
                                    it$iv4 = value$iv4;
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ButtonKt.OutlinedButton((Function0) it$iv4, null, false, null, null, null, null, UtilsKt.getSMALL_BUTTON_CONTENT_PADDING(), null, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.getLambda$618060940$app_debug(), $composer3, 817889280, 382);
                                SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8)), $composer3, 6);
                                ProvidableCompositionLocal<Clipboard> localClipboard = CompositionLocalsKt.getLocalClipboard();
                                ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object objConsume2 = $composer3.consume(localClipboard);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                final Clipboard clipboard = (Clipboard) objConsume2;
                                ComposerKt.sourceInformationMarkerStart($composer3, -1607153003, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
                                boolean invalid$iv5 = $composer3.changedInstance(coroutineScope2) | $composer3.changed(llmBenchmarkResult) | $composer3.changed(benchmarkResultInfo) | $composer3.changed(str3) | $composer3.changedInstance(clipboard);
                                Object value$iv5 = $composer3.rememberedValue();
                                if (invalid$iv5 || value$iv5 == Composer.INSTANCE.getEmpty()) {
                                    $composer$iv$iv$iv = $composer3;
                                    $composer4 = $composer3;
                                    $composer5 = $composer3;
                                    $composer$iv$iv$iv2 = $composer3;
                                    $composer$iv$iv$iv3 = $composer3;
                                    value$iv5 = new Function0<Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$3$1$6$2$1

                                        /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$3$1$6$2$1$1, reason: invalid class name */
                                        /* JADX INFO: compiled from: BenchmarkResultsViewer.kt */
                                        @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                                        @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$7$1$2$2$1$2$1$3$1$3$1$6$2$1$1", m932f = "BenchmarkResultsViewer.kt", m933i = {0, 0, 0}, m934l = {640}, m935m = "invokeSuspend", m936n = {"csv", "clipData", "clipEntry"}, m938s = {"L$0", "L$1", "L$2"})
                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ Clipboard $clipboard;
                                            final /* synthetic */ LlmBenchmarkResult $llmResult;
                                            final /* synthetic */ String $modelName;
                                            final /* synthetic */ BenchmarkResultInfo $result;
                                            Object L$0;
                                            Object L$1;
                                            Object L$2;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(LlmBenchmarkResult llmBenchmarkResult, BenchmarkResultInfo benchmarkResultInfo, String str, Clipboard clipboard, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$llmResult = llmBenchmarkResult;
                                                this.$result = benchmarkResultInfo;
                                                this.$modelName = str;
                                                this.$clipboard = clipboard;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$llmResult, this.$result, this.$modelName, this.$clipboard, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object $result) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                switch (this.label) {
                                                    case 0:
                                                        ResultKt.throwOnFailure($result);
                                                        String csv = BenchmarkResultsViewerKt.getBenchmarkResultCsv(this.$llmResult, this.$result.getAggregation());
                                                        ClipData clipData = ClipData.newPlainText("benchmark results for " + this.$modelName, csv);
                                                        Intrinsics.checkNotNull(clipData);
                                                        ClipEntry clipEntry = new ClipEntry(clipData);
                                                        this.L$0 = SpillingKt.nullOutSpilledVariable(csv);
                                                        this.L$1 = SpillingKt.nullOutSpilledVariable(clipData);
                                                        this.L$2 = SpillingKt.nullOutSpilledVariable(clipEntry);
                                                        this.label = 1;
                                                        if (this.$clipboard.setClipEntry(clipEntry, this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        break;
                                                    case 1:
                                                        ResultKt.throwOnFailure($result);
                                                        break;
                                                    default:
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(llmBenchmarkResult, benchmarkResultInfo, str3, clipboard, null), 3, null);
                                        }
                                    };
                                    $composer3.updateRememberedValue(value$iv5);
                                } else {
                                    $composer4 = $composer3;
                                    $composer$iv$iv$iv2 = $composer3;
                                    $composer$iv$iv$iv = $composer3;
                                    $composer5 = $composer3;
                                    $composer$iv$iv$iv3 = $composer3;
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer5);
                                Composer $composer6 = $composer5;
                                ButtonKt.Button((Function0) value$iv5, null, false, null, ButtonDefaults.INSTANCE.m3587buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer6, MaterialTheme.$stable).getSecondaryContainer(), 0L, 0L, 0L, $composer6, ButtonDefaults.$stable << 12, 14), null, null, UtilsKt.getSMALL_BUTTON_CONTENT_PADDING(), null, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.m10805getLambda$1226989234$app_debug(), $composer6, 817889280, 366);
                                ComposerKt.sourceInformationMarkerEnd($composer6);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                $composer$iv$iv$iv.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv3);
                                ComposerKt.sourceInformationMarkerEnd($composer4);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                $composer$iv$iv$iv2.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv2);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, $composer2, 54), $composer2, 818085888, 320);
                        $composer2.endReplaceGroup();
                    }
                    if ($dirty != $filteredResults.size() - 1) {
                        $composer2.startReplaceGroup(-1841382898);
                        ComposerKt.sourceInformation($composer2, "669@31861L75");
                        SpacerKt.Spacer(LazyItemScope.animateItem$default($this$items, SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(12)), null, null, null, 5, null), $composer2, 0);
                    } else {
                        $composer2.startReplaceGroup(-1872969945);
                    }
                    $composer2.endReplaceGroup();
                    $composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                $composer.skipToGroupEnd();
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(544066288, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BenchmarkResultsViewerKt.m474xcf14738f($innerPadding, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$lambda$46 */
    public static final Unit m470xcf147375(final BenchmarkViewModel $viewModel, LazyItemScope item, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Object value$iv;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C305@12343L1383:BenchmarkResultsViewer.kt#aos0mq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-545931700, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:305)");
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null);
            Arrangement.Horizontal horizontalArrangement$iv = horizontalM1843spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv = (438 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i2 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -193961476, "C311@12667L25,310@12615L529,322@13221L27,321@13169L533:BenchmarkResultsViewer.kt#aos0mq");
            ComposerKt.sourceInformationMarkerStart($composer, 963575105, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($viewModel);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkResultsViewerKt.m471x8c0c117c($viewModel);
                    }
                };
                $composer.updateRememberedValue(value$iv);
            } else {
                value$iv = it$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.OutlinedButton((Function0) value$iv, null, false, null, null, null, null, UtilsKt.getSMALL_BUTTON_CONTENT_PADDING(), null, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.getLambda$1460867382$app_debug(), $composer, 817889280, 382);
            ComposerKt.sourceInformationMarkerStart($composer, 963592835, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
            boolean invalid$iv2 = $composer.changedInstance($viewModel);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkResultsViewerKt.m472xb5d57700($viewModel);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.OutlinedButton((Function0) it$iv2, null, false, null, null, null, null, UtilsKt.getSMALL_BUTTON_CONTENT_PADDING(), null, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.m10808getLambda$259461793$app_debug(), $composer, 817889280, 382);
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
    /* JADX INFO: renamed from: BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$lambda$46$lambda$45$lambda$42$lambda$41 */
    public static final Unit m471x8c0c117c(BenchmarkViewModel $viewModel) {
        $viewModel.expandAll();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$lambda$46$lambda$45$lambda$44$lambda$43 */
    public static final Unit m472xb5d57700(BenchmarkViewModel $viewModel) {
        $viewModel.collapseAll();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$lambda$47 */
    public static final Object m473xcf147376(int index, BenchmarkResultInfo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkResultsViewer$lambda$58$lambda$57$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$lambda$51 */
    public static final Unit m474xcf14738f(PaddingValues $innerPadding, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C672@32004L73:BenchmarkResultsViewer.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(544066288, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:672)");
            }
            SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, $innerPadding.getBottom()), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$60$lambda$59(MutableState $showConfirmDeleteDialog$delegate) {
        BenchmarkResultsViewer$lambda$3($showConfirmDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$63(final BenchmarkViewModel $viewModel, final CoroutineScope $scope, final MutableState $showLazyListPlacementAnimation$delegate, final MutableState $showConfirmDeleteDialog$delegate, final MutableState $benchmarkResultIdToDelete$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C702@32992L303,701@32964L459:BenchmarkResultsViewer.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1147132173, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous> (BenchmarkResultsViewer.kt:701)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1412578338, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($viewModel) | $composer.changedInstance($scope);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$63$lambda$62$lambda$61($viewModel, $scope, $showLazyListPlacementAnimation$delegate, $showConfirmDeleteDialog$delegate, $benchmarkResultIdToDelete$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, null, null, null, UtilsKt.getSMALL_BUTTON_CONTENT_PADDING(), null, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.getLambda$2134602467$app_debug(), $composer, 817889280, 382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$63$lambda$62$lambda$61(BenchmarkViewModel $viewModel, CoroutineScope $scope, MutableState $showLazyListPlacementAnimation$delegate, MutableState $showConfirmDeleteDialog$delegate, MutableState $benchmarkResultIdToDelete$delegate) {
        BenchmarkResultsViewer$lambda$6($showLazyListPlacementAnimation$delegate, true);
        BenchmarkResultsViewer$lambda$3($showConfirmDeleteDialog$delegate, false);
        $viewModel.deleteBenchmarkResult(BenchmarkResultsViewer$lambda$11($benchmarkResultIdToDelete$delegate));
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BenchmarkResultsViewerKt$BenchmarkResultsViewer$9$1$1$1($showLazyListPlacementAnimation$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$66(final MutableState $showConfirmDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C719@33501L35,718@33465L199:BenchmarkResultsViewer.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1067251445, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous> (BenchmarkResultsViewer.kt:718)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -868543592, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$66$lambda$65$lambda$64($showConfirmDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.OutlinedButton((Function0) it$iv, null, false, null, null, null, null, UtilsKt.getSMALL_BUTTON_CONTENT_PADDING(), null, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.getLambda$303782375$app_debug(), $composer, 817889286, 382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$66$lambda$65$lambda$64(MutableState $showConfirmDeleteDialog$delegate) {
        BenchmarkResultsViewer$lambda$3($showConfirmDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$68$lambda$67(MutableState $showBenchmarkComparisonHelpBottomSheet$delegate) {
        BenchmarkResultsViewer$lambda$9($showBenchmarkComparisonHelpBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$73(final CoroutineScope $scope, final SheetState $sheetState, final MutableState $showBenchmarkComparisonHelpBottomSheet$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C733@33877L1006:BenchmarkResultsViewer.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-454744522, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewer.<anonymous> (BenchmarkResultsViewer.kt:733)");
            }
            Modifier modifier$iv$iv = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null);
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            int $changed$iv$iv = (54 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv$iv);
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
            int i2 = ((54 >> 6) & 112) | 6;
            ColumnScope $this$BenchmarkResultsViewer_u24lambda_u2473_u24lambda_u2472 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -612992809, "C737@34043L306,745@34389L58,744@34358L132,749@34535L147,748@34499L376:BenchmarkResultsViewer.kt#aos0mq");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            int $changed$iv$iv2 = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv);
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1588547983, "C738@34111L72,740@34212L56,741@34304L10,739@34194L145:BenchmarkResultsViewer.kt#aos0mq");
            IconKt.m4075Iconww6aTOc(HelpOutlineKt.getHelpOutline(Icons.AutoMirrored.Outlined.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.benchmark_comparison_help_title, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131070);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            MarkdownTextKt.m10879MarkdownTextjA1GFJw(StringResources_androidKt.stringResource(C2421R.string.benchmark_comparison_help_content, $composer, 0), null, true, 0L, 0L, $composer, 384, 26);
            PaddingValues small_button_content_padding = UtilsKt.getSMALL_BUTTON_CONTENT_PADDING();
            Modifier modifierAlign = $this$BenchmarkResultsViewer_u24lambda_u2473_u24lambda_u2472.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd());
            ComposerKt.sourceInformationMarkerStart($composer, 1781356415, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($scope) | $composer.changed($sheetState);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$73$lambda$72$lambda$71$lambda$70($scope, $sheetState, $showBenchmarkComparisonHelpBottomSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.OutlinedButton((Function0) it$iv, modifierAlign, false, null, null, null, null, small_button_content_padding, null, ComposableSingletons$BenchmarkResultsViewerKt.INSTANCE.getLambda$484045854$app_debug(), $composer, 817889280, 380);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkResultsViewer$lambda$73$lambda$72$lambda$71$lambda$70(CoroutineScope $scope, SheetState $sheetState, MutableState $showBenchmarkComparisonHelpBottomSheet$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BenchmarkResultsViewerKt$BenchmarkResultsViewer$12$1$2$1$1($sheetState, $showBenchmarkComparisonHelpBottomSheet$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StatRow(final String label, final String value, Modifier modifier, String unit, Double baselineValue, boolean lessIsBetter, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        String str;
        Double d;
        final boolean lessIsBetter2;
        Composer $composer$iv;
        Modifier modifier3;
        String unit2;
        Double baselineValue2;
        Modifier modifier4;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(396977534);
        ComposerKt.sourceInformation($composer3, "C(StatRow)P(1,5,3,4)774@35090L2021:BenchmarkResultsViewer.kt#aos0mq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(label) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(value) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            str = unit;
        } else if (($changed & 3072) == 0) {
            str = unit;
            $dirty |= $composer3.changed(str) ? 2048 : 1024;
        } else {
            str = unit;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            d = baselineValue;
        } else if (($changed & 24576) == 0) {
            d = baselineValue;
            $dirty |= $composer3.changed(d) ? 16384 : 8192;
        } else {
            d = baselineValue;
        }
        int i5 = i & 32;
        if (i5 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            lessIsBetter2 = lessIsBetter;
        } else if ((196608 & $changed) == 0) {
            lessIsBetter2 = lessIsBetter;
            $dirty |= $composer3.changed(lessIsBetter2) ? 131072 : 65536;
        } else {
            lessIsBetter2 = lessIsBetter;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i3 == 0) {
                unit2 = str;
            } else {
                unit2 = "";
            }
            if (i4 == 0) {
                baselineValue2 = d;
            } else {
                baselineValue2 = null;
            }
            if (i5 != 0) {
                lessIsBetter2 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(396977534, $dirty2, -1, "com.google.ai.edge.gallery.ui.benchmark.StatRow (BenchmarkResultsViewer.kt:773)");
            }
            Modifier modifier$iv = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            int $changed$iv$iv = (384 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
            boolean lessIsBetter3 = lessIsBetter2;
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            Modifier modifier5 = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i6 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i7 = ((384 >> 6) & 112) | 6;
            RowScope $this$StatRow_u24lambda_u2480 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 2046467943, "C778@35232L10,779@35284L11,776@35185L233,785@35436L1671:BenchmarkResultsViewer.kt#aos0mq");
            TextKt.m4781TextNvy7gAk(label, RowScope.weight$default($this$StatRow_u24lambda_u2480, Modifier.INSTANCE, 0.6f, false, 2, null), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9686getMiddleEllipsisgIe3tQ8(), false, 1, 0, null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelMedium(), $composer3, $dirty2 & 14, 24960, 110584);
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            Modifier modifier$iv2 = RowScope.weight$default($this$StatRow_u24lambda_u2480, Modifier.INSTANCE, 0.4f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv2 = (432 << 3) & 112;
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
                function02 = constructor2;
                $composer3.createNode(function02);
            } else {
                function02 = constructor2;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i9 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -298991402, "C790@35588L1297:BenchmarkResultsViewer.kt#aos0mq");
            Modifier modifier$iv3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv3 = (438 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor3);
            } else {
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i10 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i11 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 430523887, "C797@35824L10,798@35880L11,795@35769L217,805@36116L35,806@36163L714,802@35995L882:BenchmarkResultsViewer.kt#aos0mq");
            modifier3 = modifier5;
            $composer$iv = $composer3;
            TextKt.m4781TextNvy7gAk(value, null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9686getMiddleEllipsisgIe3tQ8(), false, 1, 0, null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelMedium(), $composer3, ($dirty2 >> 3) & 14, 24960, 110586);
            Alignment centerStart = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart($composer3, 845181891, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BenchmarkResultsViewerKt.StatRow$lambda$80$lambda$79$lambda$78$lambda$76$lambda$75((AnimatedContentTransitionScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            lessIsBetter2 = lessIsBetter3;
            AnimatedContentKt.AnimatedContent(baselineValue2, null, (Function1) it$iv, centerStart, null, null, ComposableLambdaKt.rememberComposableLambda(1431484630, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return BenchmarkResultsViewerKt.StatRow$lambda$80$lambda$79$lambda$78$lambda$77(value, lessIsBetter2, (AnimatedContentScope) obj, (Double) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, (($dirty2 >> 12) & 14) | 1576320, 50);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (unit2.length() > 0) {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-297716156);
                ComposerKt.sourceInformation($composer2, "826@36979L10,827@37035L11,824@36925L168");
                TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getLabelMedium();
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant();
                TextKt.m4781TextNvy7gAk(unit2, null, Color.m6913copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m6917getAlphaimpl(onSurfaceVariant) : 0.7f, (14 & 2) != 0 ? Color.m6921getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(onSurfaceVariant) : 0.0f), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelMedium, $composer2, ($dirty2 >> 9) & 14, 0, 131066);
            } else {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-334342594);
            }
            $composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
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
            $composer$iv = $composer3;
            $composer$iv.skipToGroupEnd();
            modifier3 = modifier2;
            unit2 = str;
            baselineValue2 = d;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer$iv.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier3;
            final String str2 = unit2;
            final Double d2 = baselineValue2;
            final boolean z = lessIsBetter2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkResultsViewerKt.StatRow$lambda$81(label, value, modifier6, str2, d2, z, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform StatRow$lambda$80$lambda$79$lambda$78$lambda$76$lambda$75(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatRow$lambda$80$lambda$79$lambda$78$lambda$77(String $value, boolean $lessIsBetter, AnimatedContentScope AnimatedContent, Double curBaselineValue, Composer $composer, int $changed) {
        long color;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C:BenchmarkResultsViewer.kt#aos0mq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1431484630, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.StatRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:807)");
        }
        if (curBaselineValue != null) {
            $composer.startReplaceGroup(628411754);
            ComposerKt.sourceInformation($composer, "819@36817L10,819@36773L82");
            double doubleValue = Double.parseDouble($value);
            double pct = ((doubleValue - curBaselineValue.doubleValue()) / curBaselineValue.doubleValue()) * ((double) 100);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strPct = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(Math.abs(pct))}, 1));
            Intrinsics.checkNotNullExpressionValue(strPct, "format(...)");
            String sign = pct >= AudioStats.AUDIO_AMPLITUDE_NONE ? "+" : "-";
            String betterSign = $lessIsBetter ? "-" : "+";
            if (Intrinsics.areEqual(sign, betterSign)) {
                $composer.startReplaceGroup(628772067);
                ComposerKt.sourceInformation($composer, "815@36638L12");
                long jM11237getSuccessColor0d7_KjU = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11237getSuccessColor0d7_KjU();
                $composer.endReplaceGroup();
                color = jM11237getSuccessColor0d7_KjU;
            } else {
                $composer.startReplaceGroup(628850497);
                ComposerKt.sourceInformation($composer, "817@36717L12");
                long jM11231getErrorTextColor0d7_KjU = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11231getErrorTextColor0d7_KjU();
                $composer.endReplaceGroup();
                color = jM11231getErrorTextColor0d7_KjU;
            }
            TextKt.m4781TextNvy7gAk(sign + strPct + "%", null, color, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 0, 0, 131066);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(592455660);
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ValueSeriesRow(final String label, final ValueSeries valueSeries, final Aggregation aggregation, Modifier modifier, String unit, ValueSeries baselineValueSeries, Aggregation baselineAggregation, boolean lessIsBetter, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        String unit2;
        ValueSeries baselineValueSeries2;
        boolean z;
        Composer $composer2;
        Aggregation baselineAggregation2;
        final boolean lessIsBetter2;
        Modifier modifier3;
        String unit3;
        ValueSeries baselineValueSeries3;
        Modifier.Companion modifier4;
        Aggregation baselineAggregation3;
        boolean lessIsBetter3;
        int $dirty;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        long onSurface;
        String str;
        final MutableState showValueSeriesBottomSheet$delegate;
        final Modifier.Companion textModifier;
        Composer $composer3 = $composer.startRestartGroup(2008216078);
        ComposerKt.sourceInformation($composer3, "C(ValueSeriesRow)P(3,7!1,5,6,2)851@37755L34,853@37793L3052:BenchmarkResultsViewer.kt#aos0mq");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(label) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changed(valueSeries) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(aggregation.ordinal()) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty2 |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty2 |= 24576;
            unit2 = unit;
        } else if (($changed & 24576) == 0) {
            unit2 = unit;
            $dirty2 |= $composer3.changed(unit2) ? 16384 : 8192;
        } else {
            unit2 = unit;
        }
        int i4 = i & 32;
        if (i4 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            baselineValueSeries2 = baselineValueSeries;
        } else if ((196608 & $changed) == 0) {
            baselineValueSeries2 = baselineValueSeries;
            $dirty2 |= $composer3.changed(baselineValueSeries2) ? 131072 : 65536;
        } else {
            baselineValueSeries2 = baselineValueSeries;
        }
        int i5 = i & 64;
        int i6 = 1572864;
        if (i5 != 0) {
            $dirty2 |= i6;
        } else if ((1572864 & $changed) == 0) {
            i6 = $composer3.changed(baselineAggregation == null ? -1 : baselineAggregation.ordinal()) ? 1048576 : 524288;
            $dirty2 |= i6;
        }
        int i7 = i & 128;
        if (i7 != 0) {
            $dirty2 |= 12582912;
            z = lessIsBetter;
        } else if (($changed & 12582912) == 0) {
            z = lessIsBetter;
            $dirty2 |= $composer3.changed(z) ? 8388608 : 4194304;
        } else {
            z = lessIsBetter;
        }
        if ($composer3.shouldExecute(($dirty2 & 4793491) != 4793490, $dirty2 & 1)) {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i3 != 0) {
                unit2 = "";
            }
            if (i4 != 0) {
                baselineValueSeries2 = null;
            }
            if (i5 == 0) {
                baselineAggregation3 = baselineAggregation;
            } else {
                baselineAggregation3 = null;
            }
            if (i7 == 0) {
                lessIsBetter3 = z;
            } else {
                lessIsBetter3 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2008216078, $dirty2, -1, "com.google.ai.edge.gallery.ui.benchmark.ValueSeriesRow (BenchmarkResultsViewer.kt:844)");
            }
            final double value = getAggregationValue(valueSeries, aggregation);
            Object baselineValue = null;
            if (baselineValueSeries2 != null && baselineAggregation3 != null) {
                baselineValue = Double.valueOf(getAggregationValue(baselineValueSeries2, baselineAggregation3));
            }
            Object baselineValue2 = baselineValue;
            ComposerKt.sourceInformationMarkerStart($composer3, 1455355568, "CC(remember):BenchmarkResultsViewer.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            } else {
                $dirty = $dirty2;
            }
            MutableState showValueSeriesBottomSheet$delegate2 = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier$iv = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            int $changed$iv$iv = (384 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            Aggregation baselineAggregation4 = baselineAggregation3;
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
            int i8 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i9 = ((384 >> 6) & 112) | 6;
            RowScope $this$ValueSeriesRow_u24lambda_u2495 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -385296536, "C857@37935L10,858@37987L11,855@37888L233,864@38139L2702:BenchmarkResultsViewer.kt#aos0mq");
            int $dirty3 = $dirty;
            String unit4 = unit2;
            baselineValueSeries3 = baselineValueSeries2;
            baselineAggregation2 = baselineAggregation4;
            lessIsBetter2 = lessIsBetter3;
            modifier3 = modifier4;
            TextKt.m4781TextNvy7gAk(label, RowScope.weight$default($this$ValueSeriesRow_u24lambda_u2495, Modifier.INSTANCE, 0.6f, false, 2, null), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9686getMiddleEllipsisgIe3tQ8(), false, 1, 0, null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelMedium(), $composer3, $dirty3 & 14, 24960, 110584);
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            Modifier modifier$iv2 = RowScope.weight$default($this$ValueSeriesRow_u24lambda_u2495, Modifier.INSTANCE, 0.4f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv2 = (432 << 3) & 112;
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
            int i10 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i11 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -224357717, "C869@38291L2328:BenchmarkResultsViewer.kt#aos0mq");
            Modifier modifier$iv3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv3 = (438 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
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
            int i12 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i13 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1529428860, "C874@38502L12,898@39420L321,898@39397L344,911@39871L35,912@39918L693,908@39750L861:BenchmarkResultsViewer.kt#aos0mq");
            final long linkColor = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer3, MaterialTheme.$stable).m11232getLinkColor0d7_KjU();
            boolean isMultipleRuns = valueSeries.getValueCount() > 1;
            if (isMultipleRuns) {
                $composer3.startReplaceGroup(326433845);
                $composer3.endReplaceGroup();
                onSurface = linkColor;
            } else {
                $composer3.startReplaceGroup(326435157);
                ComposerKt.sourceInformation($composer3, "876@38654L11");
                onSurface = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurface();
                $composer3.endReplaceGroup();
            }
            final long textColor = onSurface;
            if (isMultipleRuns) {
                $composer3.startReplaceGroup(1529640527);
                ComposerKt.sourceInformation($composer3, "879@38767L506,894@39299L37");
                Modifier.Companion companion = Modifier.INSTANCE;
                str = "CC(remember):BenchmarkResultsViewer.kt#9igjgp";
                ComposerKt.sourceInformationMarkerStart($composer3, 326438886, str);
                boolean invalid$iv = $composer3.changed(linkColor);
                Object it$iv2 = $composer3.rememberedValue();
                if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BenchmarkResultsViewerKt.ValueSeriesRow$lambda$95$lambda$94$lambda$93$lambda$86$lambda$85(linkColor, (DrawScope) obj);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                Modifier modifierDrawBehind = DrawModifierKt.drawBehind(companion, (Function1) it$iv2);
                ComposerKt.sourceInformationMarkerStart($composer3, 326455441, str);
                Object it$iv3 = $composer3.rememberedValue();
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    showValueSeriesBottomSheet$delegate = showValueSeriesBottomSheet$delegate2;
                    Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BenchmarkResultsViewerKt.ValueSeriesRow$lambda$95$lambda$94$lambda$93$lambda$88$lambda$87(showValueSeriesBottomSheet$delegate);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv3);
                    it$iv3 = value$iv3;
                } else {
                    showValueSeriesBottomSheet$delegate = showValueSeriesBottomSheet$delegate2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                textModifier = ClickableKt.m1401clickableoSLSa3U(modifierDrawBehind, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv3);
                $composer3.endReplaceGroup();
            } else {
                str = "CC(remember):BenchmarkResultsViewer.kt#9igjgp";
                showValueSeriesBottomSheet$delegate = showValueSeriesBottomSheet$delegate2;
                $composer3.startReplaceGroup(1530238548);
                $composer3.endReplaceGroup();
                textModifier = Modifier.INSTANCE;
            }
            AnimatedContentKt.AnimatedContent(Double.valueOf(value), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1194148278, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return BenchmarkResultsViewerKt.ValueSeriesRow$lambda$95$lambda$94$lambda$93$lambda$89(textModifier, textColor, (AnimatedContentScope) obj, ((Double) obj2).doubleValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 1572864, 62);
            Alignment centerStart = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart($composer3, 326473743, str);
            Object it$iv4 = $composer3.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BenchmarkResultsViewerKt.ValueSeriesRow$lambda$95$lambda$94$lambda$93$lambda$91$lambda$90((AnimatedContentTransitionScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            AnimatedContentKt.AnimatedContent(baselineValue2, null, (Function1) it$iv4, centerStart, null, null, ComposableLambdaKt.rememberComposableLambda(-1221929747, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return BenchmarkResultsViewerKt.ValueSeriesRow$lambda$95$lambda$94$lambda$93$lambda$92(value, lessIsBetter2, (AnimatedContentScope) obj, (Double) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 1576320, 50);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (unit4.length() > 0) {
                $composer3.startReplaceGroup(-222091680);
                ComposerKt.sourceInformation($composer3, "931@40713L10,932@40769L11,929@40659L168");
                TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelMedium();
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant();
                TextKt.m4781TextNvy7gAk(unit4, null, Color.m6913copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m6917getAlphaimpl(onSurfaceVariant) : 0.7f, (14 & 2) != 0 ? Color.m6921getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(onSurfaceVariant) : 0.0f), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelMedium, $composer3, ($dirty3 >> 12) & 14, 0, 131066);
            } else {
                $composer3.startReplaceGroup(-262422246);
            }
            $composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ValueSeriesRow$lambda$83(showValueSeriesBottomSheet$delegate)) {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-2125512562);
                ComposerKt.sourceInformation($composer2, "942@40998L38,939@40887L156");
                String str2 = label + " (" + unit4 + ")";
                ComposerKt.sourceInformationMarkerStart($composer2, 1455459348, str);
                Object it$iv5 = $composer2.rememberedValue();
                if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv5 = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BenchmarkResultsViewerKt.ValueSeriesRow$lambda$97$lambda$96(showValueSeriesBottomSheet$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv5);
                    it$iv5 = value$iv5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                BenchmarkValueSeriesViewerKt.BenchmarkValueSeriesViewer(str2, valueSeries, (Function0) it$iv5, $composer2, ($dirty3 & 112) | 384);
            } else {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(2128894644);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            unit3 = unit4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            baselineAggregation2 = baselineAggregation;
            lessIsBetter2 = z;
            modifier3 = modifier2;
            unit3 = unit2;
            baselineValueSeries3 = baselineValueSeries2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            final String str3 = unit3;
            final ValueSeries valueSeries2 = baselineValueSeries3;
            final Aggregation aggregation2 = baselineAggregation2;
            final boolean z2 = lessIsBetter2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkResultsViewerKt.ValueSeriesRow$lambda$98(label, valueSeries, aggregation, modifier5, str3, valueSeries2, aggregation2, z2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean ValueSeriesRow$lambda$83(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ValueSeriesRow$lambda$84(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValueSeriesRow$lambda$95$lambda$94$lambda$93$lambda$86$lambda$85(long $linkColor, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        int bits$iv$iv$iv = (int) (drawBehind.mo7496getSizeNHjbRc() & 4294967295L);
        float y = Float.intBitsToFloat(bits$iv$iv$iv) - 2.0f;
        PathEffect dashPath = PathEffect.INSTANCE.dashPathEffect(new float[]{8.0f, 8.0f}, 0.0f);
        long v1$iv$iv = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        long jM6662constructorimpl = Offset.m6662constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        int bits$iv$iv$iv2 = (int) (drawBehind.mo7496getSizeNHjbRc() >> 32);
        float x$iv = Float.intBitsToFloat(bits$iv$iv$iv2);
        long v1$iv$iv2 = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv2 = Float.floatToRawIntBits(y);
        DrawScope.m7482drawLineNGM6Ib0$default(drawBehind, $linkColor, jM6662constructorimpl, Offset.m6662constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L)), 2.0f, 0, dashPath, 0.0f, null, 0, 464, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValueSeriesRow$lambda$95$lambda$94$lambda$93$lambda$88$lambda$87(MutableState $showValueSeriesBottomSheet$delegate) {
        ValueSeriesRow$lambda$84($showValueSeriesBottomSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValueSeriesRow$lambda$95$lambda$94$lambda$93$lambda$89(Modifier $textModifier, long $textColor, AnimatedContentScope AnimatedContent, double curValue, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C901@39550L10,899@39444L287:BenchmarkResultsViewer.kt#aos0mq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1194148278, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.ValueSeriesRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:899)");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(curValue)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        TextKt.m4781TextNvy7gAk(str, $textModifier, $textColor, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9686getMiddleEllipsisgIe3tQ8(), false, 1, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 0, 24960, 110584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform ValueSeriesRow$lambda$95$lambda$94$lambda$93$lambda$91$lambda$90(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValueSeriesRow$lambda$95$lambda$94$lambda$93$lambda$92(double $value, boolean $lessIsBetter, AnimatedContentScope AnimatedContent, Double curBaselineValue, Composer $composer, int $changed) {
        long color;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C:BenchmarkResultsViewer.kt#aos0mq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1221929747, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.ValueSeriesRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BenchmarkResultsViewer.kt:913)");
        }
        if (curBaselineValue == null || Math.abs(curBaselineValue.doubleValue()) <= 1.0E-6d) {
            $composer.startReplaceGroup(1594108373);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(1633819528);
            ComposerKt.sourceInformation($composer, "924@40551L10,924@40507L82");
            double pct = (($value - curBaselineValue.doubleValue()) / curBaselineValue.doubleValue()) * ((double) 100);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strPct = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(Math.abs(pct))}, 1));
            Intrinsics.checkNotNullExpressionValue(strPct, "format(...)");
            String sign = pct >= AudioStats.AUDIO_AMPLITUDE_NONE ? "+" : "-";
            String betterSign = $lessIsBetter ? "-" : "+";
            if (Intrinsics.areEqual(sign, betterSign)) {
                $composer.startReplaceGroup(1634128908);
                ComposerKt.sourceInformation($composer, "920@40372L12");
                long jM11237getSuccessColor0d7_KjU = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11237getSuccessColor0d7_KjU();
                $composer.endReplaceGroup();
                color = jM11237getSuccessColor0d7_KjU;
            } else {
                $composer.startReplaceGroup(1634207338);
                ComposerKt.sourceInformation($composer, "922@40451L12");
                long jM11231getErrorTextColor0d7_KjU = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11231getErrorTextColor0d7_KjU();
                $composer.endReplaceGroup();
                color = jM11231getErrorTextColor0d7_KjU;
            }
            TextKt.m4781TextNvy7gAk(sign + strPct + "%", null, color, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 0, 0, 131066);
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValueSeriesRow$lambda$97$lambda$96(MutableState $showValueSeriesBottomSheet$delegate) {
        ValueSeriesRow$lambda$84($showValueSeriesBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBenchmarkResultCsv(LlmBenchmarkResult llmResult, Aggregation aggregation) {
        LlmBenchmarkBasicInfo basicInfo = llmResult.getBaiscInfo();
        LlmBenchmarkStats stats = llmResult.getStats();
        String header = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{"start time (ms)", "end time (ms)", "model name", "accelerator", "prefill tokens count", "decode tokens count", "runs count", "app version", "prefill speed (tokens/sec)", "decode speed (tokens/sec)", "time to first token (sec)", "first init time (ms)", "steady init time (ms)"}), ",", null, null, 0, null, null, 62, null);
        Long lValueOf = Long.valueOf(basicInfo.getStartMs());
        Long lValueOf2 = Long.valueOf(basicInfo.getEndMs());
        String modelName = basicInfo.getModelName();
        String accelerator = basicInfo.getAccelerator();
        Integer numValueOf = Integer.valueOf(basicInfo.getPrefillTokens());
        Integer numValueOf2 = Integer.valueOf(basicInfo.getDecodeTokens());
        Integer numValueOf3 = Integer.valueOf(basicInfo.getNumberOfRuns());
        String appVersion = basicInfo.getAppVersion();
        ValueSeries prefillSpeed = stats.getPrefillSpeed();
        Intrinsics.checkNotNullExpressionValue(prefillSpeed, "getPrefillSpeed(...)");
        Double dValueOf = Double.valueOf(getAggregationValue(prefillSpeed, aggregation));
        ValueSeries decodeSpeed = stats.getDecodeSpeed();
        Intrinsics.checkNotNullExpressionValue(decodeSpeed, "getDecodeSpeed(...)");
        Double dValueOf2 = Double.valueOf(getAggregationValue(decodeSpeed, aggregation));
        ValueSeries timeToFirstToken = stats.getTimeToFirstToken();
        Intrinsics.checkNotNullExpressionValue(timeToFirstToken, "getTimeToFirstToken(...)");
        Double dValueOf3 = Double.valueOf(getAggregationValue(timeToFirstToken, aggregation));
        Double dValueOf4 = Double.valueOf(stats.getFirstInitTimeMs());
        ValueSeries nonFirstInitTimeMs = stats.getNonFirstInitTimeMs();
        Intrinsics.checkNotNullExpressionValue(nonFirstInitTimeMs, "getNonFirstInitTimeMs(...)");
        String data = CollectionsKt.joinToString$default(CollectionsKt.listOf(lValueOf, lValueOf2, modelName, accelerator, numValueOf, numValueOf2, numValueOf3, appVersion, dValueOf, dValueOf2, dValueOf3, dValueOf4, Double.valueOf(getAggregationValue(nonFirstInitTimeMs, aggregation))), ",", null, null, 0, null, null, 62, null);
        return header + "\n" + data;
    }

    private static final double getAggregationValue(ValueSeries valueSeries, Aggregation aggregation) {
        switch (WhenMappings.$EnumSwitchMapping$0[aggregation.ordinal()]) {
            case 1:
                return valueSeries.getAvg();
            case 2:
                return valueSeries.getMedium();
            case 3:
                return valueSeries.getMin();
            case 4:
                return valueSeries.getMax();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
