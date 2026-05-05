package com.google.ai.edge.gallery.ui.benchmark;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.ArrowDropDownKt;
import androidx.compose.material.icons.rounded.CheckCircleKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;



V", "app_debug", "showBottomSheet", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class BenchmarkModelPickerKt {
    
    public static final Unit BenchmarkModelPicker$lambda$15(String str, List list, int i, Function1 function1, int i2, Composer composer, int i3) {
        BenchmarkModelPicker(str, list, i, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void BenchmarkModelPicker(final String selectedModelName, final List<String> modelNames, final int titleResId, final Function1<? super String, Unit> onSelected, Composer $composer, final int $changed) {
        Composer $composer2;
        final MutableState showBottomSheet$delegate;
        Intrinsics.checkNotNullParameter(selectedModelName, "selectedModelName");
        Intrinsics.checkNotNullParameter(modelNames, "modelNames");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Composer $composer3 = $composer.startRestartGroup(-882916267);
        ComposerKt.sourceInformation($composer3, "C(BenchmarkModelPicker)P(2!1,3)64@2573L24,65@2623L34,66@2677L59,73@2933L26,74@2994L11,68@2740L708:BenchmarkModelPicker.kt#aos0mq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(selectedModelName) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(modelNames) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(titleResId) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onSelected) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-882916267, $dirty2, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPicker (BenchmarkModelPicker.kt:63)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer3.rememberedValue();
            if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(value$iv$iv);
                it$iv$iv = value$iv$iv;
            }
            final CoroutineScope scope = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1921000535, "CC(remember):BenchmarkModelPicker.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState showBottomSheet$delegate2 = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer3, 6, 2);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(4));
            Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(8)));
            ComposerKt.sourceInformationMarkerStart($composer3, 1921010447, "CC(remember):BenchmarkModelPicker.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkModelPickerKt.BenchmarkModelPicker$lambda$4$lambda$3(showBottomSheet$delegate2);
                    }
                };
                $composer3.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1988padding3ABfNKs(BackgroundKt.m1359backgroundbw27NRU$default(ClickableKt.m1401clickableoSLSa3U(modifierClip, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv2), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSecondaryContainer(), null, 2, null), C1654Dp.m9788constructorimpl(4)), C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
            Arrangement.Horizontal horizontalArrangement$iv = horizontalM1843spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv = (432 << 3) & 112;
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
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i2 = ((432 >> 6) & 112) | 6;
            RowScope $this$BenchmarkModelPicker_u24lambda_u245 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 627043569, "C80@3150L10,78@3091L205,85@3301L143:BenchmarkModelPicker.kt#aos0mq");
            TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelLarge();
            int iM9686getMiddleEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m9686getMiddleEllipsisgIe3tQ8();
            Modifier materialized$iv$iv2 = $this$BenchmarkModelPicker_u24lambda_u245.weight(Modifier.INSTANCE, 1.0f, false);
            TextKt.m4781TextNvy7gAk(selectedModelName, materialized$iv$iv2, 0L, null, 0L, null, null, null, 0L, null, null, 0L, iM9686getMiddleEllipsisgIe3tQ8, false, 1, 0, null, labelLarge, $composer3, $dirty2 & 14, 24960, 110588);
            IconKt.m4075Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Rounded.INSTANCE), (String) null, SizeKt.m2040sizeInqDBjuR0$default(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), C1654Dp.m9788constructorimpl(20), 0.0f, 0.0f, 0.0f, 14, null), 0L, $composer3, 432, 8);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (BenchmarkModelPicker$lambda$1(showBottomSheet$delegate2)) {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-577614839);
                ComposerKt.sourceInformation($composer2, "95@3541L27,97@3638L11,98@3665L1427,94@3498L1594");
                ComposerKt.sourceInformationMarkerStart($composer2, 1921029904, "CC(remember):BenchmarkModelPicker.kt#9igjgp");
                Object it$iv3 = $composer2.rememberedValue();
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    showBottomSheet$delegate = showBottomSheet$delegate2;
                    Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BenchmarkModelPickerKt.BenchmarkModelPicker$lambda$7$lambda$6(showBottomSheet$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv3);
                    it$iv3 = value$iv3;
                } else {
                    showBottomSheet$delegate = showBottomSheet$delegate2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                final MutableState mutableState = showBottomSheet$delegate;
                ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8((Function0) it$iv3, null, sheetState, 0.0f, false, null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface(), 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(1721242236, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return BenchmarkModelPickerKt.BenchmarkModelPicker$lambda$14(titleResId, modelNames, onSelected, scope, sheetState, selectedModelName, mutableState, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), $composer2, 6, 3072, 8122);
            } else {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-581129619);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkModelPickerKt.BenchmarkModelPicker$lambda$15(selectedModelName, modelNames, titleResId, onSelected, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean BenchmarkModelPicker$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    
    public static final void BenchmarkModelPicker$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    
    public static final Unit BenchmarkModelPicker$lambda$4$lambda$3(MutableState $showBottomSheet$delegate) {
        BenchmarkModelPicker$lambda$2($showBottomSheet$delegate, true);
        return Unit.INSTANCE;
    }

    
    public static final Unit BenchmarkModelPicker$lambda$7$lambda$6(MutableState $showBottomSheet$delegate) {
        BenchmarkModelPicker$lambda$2($showBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit BenchmarkModelPicker$lambda$14(int $titleResId, final List $modelNames, final Function1 $onSelected, final CoroutineScope $scope, final SheetState $sheetState, final String $selectedModelName, final MutableState $showBottomSheet$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Object value$iv;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C99@3673L1413:BenchmarkModelPicker.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1721242236, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPicker.<anonymous> (BenchmarkModelPicker.kt:99)");
            }
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
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
            int i2 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 224100961, "C101@3766L26,102@3826L10,103@3881L11,100@3750L209,106@3979L1099,106@3968L1110:BenchmarkModelPicker.kt#aos0mq");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource($titleResId, $composer, 0), PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 48, 0, 131064);
            ComposerKt.sourceInformationMarkerStart($composer, -1239689827, "CC(remember):BenchmarkModelPicker.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($modelNames) | $composer.changed($onSelected) | $composer.changedInstance($scope) | $composer.changed($sheetState) | $composer.changed($selectedModelName);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BenchmarkModelPickerKt.BenchmarkModelPicker$lambda$14$lambda$13$lambda$12$lambda$11($modelNames, $onSelected, $scope, $sheetState, $showBottomSheet$delegate, $selectedModelName, (LazyListScope) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
            } else {
                value$iv = it$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) value$iv, $composer, 0, FrameMetricsAggregator.EVERY_DURATION);
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

    
    public static final Unit BenchmarkModelPicker$lambda$14$lambda$13$lambda$12$lambda$11(final List $modelNames, final Function1 $onSelected, final CoroutineScope $scope, final SheetState $sheetState, final MutableState $showBottomSheet$delegate, final String $selectedModelName, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 contentType$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$BenchmarkModelPicker$lambda$14$lambda$13$lambda$12$lambda$11$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((String) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(String str) {
                return null;
            }
        };
        LazyColumn.items($modelNames.size(), null, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$BenchmarkModelPicker$lambda$14$lambda$13$lambda$12$lambda$11$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return contentType$iv.invoke($modelNames.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$BenchmarkModelPicker$lambda$14$lambda$13$lambda$12$lambda$11$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Composer $composer2;
                Function0<ComposeUiNode> function0;
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    int $changed2 = $dirty & 14;
                    final String modelName = (String) $modelNames.get(it);
                    $composer.startReplaceGroup(1551427901);
                    ComposerKt.sourceInformation($composer, "C*110@4101L239,108@4036L1020:BenchmarkModelPicker.kt#aos0mq");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, 881331353, "CC(remember):BenchmarkModelPicker.kt#9igjgp");
                    boolean invalid$iv = (((($changed2 & 112) ^ 48) > 32 && $composer.changed(modelName)) || ($changed2 & 48) == 32) | $composer.changed($onSelected) | $composer.changedInstance($scope) | $composer.changed($sheetState);
                    Object value$iv = $composer.rememberedValue();
                    if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                        final Function1 function1 = $onSelected;
                        final CoroutineScope coroutineScope = $scope;
                        final SheetState sheetState = $sheetState;
                        final MutableState mutableState = $showBottomSheet$delegate;
                        $composer2 = $composer;
                        value$iv = new Function0<Unit>() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$BenchmarkModelPicker$4$1$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            
                            
                            
                            @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$BenchmarkModelPicker$4$1$1$1$1$1$1$1", m932f = "BenchmarkModelPicker.kt", m933i = {}, m934l = {114, 115}, m935m = "invokeSuspend", m936n = {}, m938s = {})
                            static final class C26181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ SheetState $sheetState;
                                final /* synthetic */ MutableState<Boolean> $showBottomSheet$delegate;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C26181(SheetState sheetState, MutableState<Boolean> mutableState, Continuation<? super C26181> continuation) {
                                    super(2, continuation);
                                    this.$sheetState = sheetState;
                                    this.$showBottomSheet$delegate = mutableState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C26181(this.$sheetState, this.$showBottomSheet$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C26181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[RETURN] */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                                    /*
                                        r4 = this;
                                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                        int r1 = r4.label
                                        switch(r1) {
                                            case 0: goto L19;
                                            case 1: goto L15;
                                            case 2: goto L11;
                                            default: goto L9;
                                        }
                                    L9:
                                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                                        r0.<init>(r1)
                                        throw r0
                                    L11:
                                        kotlin.ResultKt.throwOnFailure(r5)
                                        goto L3a
                                    L15:
                                        kotlin.ResultKt.throwOnFailure(r5)
                                        goto L2b
                                    L19:
                                        kotlin.ResultKt.throwOnFailure(r5)
                                        r1 = r4
                                        kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                                        r2 = 1
                                        r4.label = r2
                                        r2 = 200(0xc8, double:9.9E-322)
                                        java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r2, r1)
                                        if (r1 != r0) goto L2b
                                        return r0
                                    L2b:
                                        androidx.compose.material3.SheetState r1 = r4.$sheetState
                                        r2 = r4
                                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                                        r3 = 2
                                        r4.label = r3
                                        java.lang.Object r1 = r1.hide(r2)
                                        if (r1 != r0) goto L3a
                                        return r0
                                    L3a:
                                        androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r4.$showBottomSheet$delegate
                                        r1 = 0
                                        com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt.access$BenchmarkModelPicker$lambda$2(r0, r1)
                                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                        return r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.ui.benchmark.BenchmarkModelPickerKt$BenchmarkModelPicker$4$1$1$1$1$1$1.C26181.invokeSuspend(java.lang.Object):java.lang.Object");
                                }
                            }

                            
                            public final void invoke2() {
                                function1.invoke(modelName);
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C26181(sheetState, mutableState, null), 3, null);
                            }
                        };
                        $composer.updateRememberedValue(value$iv);
                    } else {
                        $composer2 = $composer;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    Modifier modifier$iv = SizeKt.fillMaxWidth$default(PaddingKt.m1989paddingVpY3zN4(ClickableKt.m1401clickableoSLSa3U(companion, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) value$iv), C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(6)), 0.0f, 1, null);
                    Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(16));
                    Composer $composer$iv = $composer2;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer$iv, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                    int $changed$iv$iv = (432 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv, 0));
                    CompositionLocalMap localMap$iv$iv = $composer$iv.getCurrentCompositionLocalMap();
                    Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer$iv, modifier$iv);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer$iv.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer$iv.startReusableNode();
                    if ($composer$iv.getInserting()) {
                        function0 = constructor;
                        $composer$iv.createNode(function0);
                    } else {
                        function0 = constructor;
                        $composer$iv.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer$iv);
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                    int i = ($changed$iv$iv$iv >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i2 = ((432 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, 655835938, "C126@4728L11,123@4599L258,131@4943L11,132@5004L10,129@4872L170:BenchmarkModelPicker.kt#aos0mq");
                    IconKt.m4075Iconww6aTOc(CheckCircleKt.getCheckCircle(Icons.Rounded.INSTANCE), (String) null, AlphaKt.alpha(Modifier.INSTANCE, Intrinsics.areEqual(modelName, $selectedModelName) ? 1.0f : 0.0f), MaterialTheme.INSTANCE.getColorScheme($composer$iv, MaterialTheme.$stable).getSecondary(), $composer$iv, 48, 0);
                    TextKt.m4781TextNvy7gAk(modelName, null, MaterialTheme.INSTANCE.getColorScheme($composer$iv, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer$iv, MaterialTheme.$stable).getLabelLarge(), $composer$iv, ($changed2 >> 3) & 14, 0, 131066);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv);
                    $composer$iv.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer$iv);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv);
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
        return Unit.INSTANCE;
    }
}
