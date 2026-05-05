package com.google.ai.edge.gallery.ui.benchmark;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material.MenuKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.PathEffect;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.graphics.drawscope.Stroke;
import androidx.compose.p000ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.TextUnitKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.location.LocationRequestCompat;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import com.google.ai.edge.gallery.proto.ValueSeries;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: BenchmarkValueSeriesViewer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m921d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002"}, m922d2 = {"BenchmarkValueSeriesViewer", "", "title", "", "valueSeries", "Lcom/google/ai/edge/gallery/proto/ValueSeries;", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/google/ai/edge/gallery/proto/ValueSeries;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "StatCell", "key", "value", "", "(Ljava/lang/String;DLandroidx/compose/runtime/Composer;I)V", "app_debug", "tappedValue"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class BenchmarkValueSeriesViewerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkValueSeriesViewer$lambda$11(String str, ValueSeries valueSeries, Function0 function0, int i, Composer composer, int i2) {
        BenchmarkValueSeriesViewer(str, valueSeries, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatCell$lambda$13(String str, double d, int i, Composer composer, int i2) {
        StatCell(str, d, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BenchmarkValueSeriesViewer(final String title, final ValueSeries valueSeries, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(valueSeries, "valueSeries");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(-1375817921);
        ComposerKt.sourceInformation($composer3, "C(BenchmarkValueSeriesViewer)P(1,2)57@2465L59,62@2644L11,63@2669L5276,59@2528L5417:BenchmarkValueSeriesViewer.kt#aos0mq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(valueSeries) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1375817921, $dirty2, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkValueSeriesViewer (BenchmarkValueSeriesViewer.kt:56)");
            }
            SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer3, 6, 2);
            $composer2 = $composer3;
            ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8(onDismiss, null, sheetState, 0.0f, false, null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1204447459, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkValueSeriesViewerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BenchmarkValueSeriesViewerKt.BenchmarkValueSeriesViewer$lambda$10(title, valueSeries, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, ($dirty2 >> 6) & 14, 3072, 8122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkValueSeriesViewerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkValueSeriesViewerKt.BenchmarkValueSeriesViewer$lambda$11(title, valueSeries, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkValueSeriesViewer$lambda$10(String $title, ValueSeries $valueSeries, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        String str;
        Composer $composer$iv$iv$iv;
        Composer $composer$iv;
        String str2;
        Composer $composer$iv$iv$iv2;
        Composer $composer$iv2;
        Composer $composer2;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Composer $composer$iv$iv;
        Composer $composer$iv$iv$iv3;
        String str3;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C64@2675L5266:BenchmarkValueSeriesViewer.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1204447459, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkValueSeriesViewer.<anonymous> (BenchmarkValueSeriesViewer.kt:64)");
            }
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null);
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
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
            ComposerKt.sourceInformationMarkerStart($composer, -1264387042, "C71@2900L10,72@2954L11,69@2849L135,189@7529L406:BenchmarkValueSeriesViewer.kt#aos0mq");
            TextKt.m4781TextNvy7gAk($title, null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131066);
            final List<Double> valueList = $valueSeries.getValueList();
            Intrinsics.checkNotNull(valueList);
            if (valueList.isEmpty()) {
                str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                $composer$iv$iv$iv = $composer;
                $composer$iv = $composer;
                str2 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                $composer$iv$iv$iv2 = $composer;
                $composer$iv2 = $composer;
                $composer2 = $composer;
                $composer2.startReplaceGroup(-1267371909);
                $composer2.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1264199524);
                ComposerKt.sourceInformation($composer, "77@3068L4429");
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
                $composer$iv2 = $composer;
                $composer$iv$iv$iv2 = $composer;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function03 = constructor2;
                    $composer.createNode(function03);
                } else {
                    function03 = constructor2;
                    $composer.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer);
                $composer$iv$iv$iv = $composer;
                $composer$iv = $composer;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i4 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1763245105, "C78@3167L11,79@3228L11,80@3293L11,81@3359L12,82@3411L42,91@3755L10,92@3813L11,85@3502L352,106@4355L11,109@4486L964,130@5463L2024,103@4228L3259:BenchmarkValueSeriesViewer.kt#aos0mq");
                final long lineColor = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline();
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int compositeKeyHash$iv$iv3 = MaterialTheme.$stable;
                final long dotBgColor = materialTheme.getColorScheme($composer, compositeKeyHash$iv$iv3).getSurface();
                final long dotBorderColor = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline();
                str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                str2 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
                final long tappedLineColor = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11232getLinkColor0d7_KjU();
                ComposerKt.sourceInformationMarkerStart($composer, -1719442400, "CC(remember):BenchmarkValueSeriesViewer.kt#9igjgp");
                Object value$iv = $composer.rememberedValue();
                if (value$iv == Composer.INSTANCE.getEmpty()) {
                    value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    $composer.updateRememberedValue(value$iv);
                }
                final MutableState tappedValue$delegate = (MutableState) value$iv;
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (BenchmarkValueSeriesViewer$lambda$10$lambda$9$lambda$7$lambda$1(tappedValue$delegate) == null) {
                    $composer.startReplaceGroup(-1762973019);
                    ComposerKt.sourceInformation($composer, "87@3561L41");
                    $composer$iv$iv = $composer;
                    String strStringResource = StringResources_androidKt.stringResource(C2421R.string.tap_to_see_value, $composer, 0);
                    $composer.endReplaceGroup();
                    $composer$iv$iv$iv3 = $composer;
                    str3 = strStringResource;
                } else {
                    $composer$iv$iv = $composer;
                    $composer.startReplaceGroup(-1762895829);
                    $composer.endReplaceGroup();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    $composer$iv$iv$iv3 = $composer;
                    String str4 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{BenchmarkValueSeriesViewer$lambda$10$lambda$9$lambda$7$lambda$1(tappedValue$delegate)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                    str3 = "Value: " + str4;
                }
                TextKt.m4781TextNvy7gAk(str3, null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 0, 0, 131066);
                double min = $valueSeries.getMin();
                double max = $valueSeries.getMax();
                double range = max - min;
                final double effectiveMin = min - (((double) 0.2f) * range);
                double effectiveMax = max + (((double) 0.2f) * range);
                final double scaledYRange = effectiveMax - effectiveMin;
                Modifier modifierM2022height3ABfNKs = SizeKt.m2022height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(8))), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainer(), null, 2, null), 0.0f, 1, null), C1654Dp.m9788constructorimpl(80));
                ComposerKt.sourceInformationMarkerStart($composer, -1719407078, "CC(remember):BenchmarkValueSeriesViewer.kt#9igjgp");
                boolean invalid$iv = $composer.changed(effectiveMin) | $composer.changed(scaledYRange);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv2 = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkValueSeriesViewerKt$BenchmarkValueSeriesViewer$1$1$1$1$1

                        /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.benchmark.BenchmarkValueSeriesViewerKt$BenchmarkValueSeriesViewer$1$1$1$1$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: BenchmarkValueSeriesViewer.kt */
                        @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                        @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.benchmark.BenchmarkValueSeriesViewerKt$BenchmarkValueSeriesViewer$1$1$1$1$1$1", m932f = "BenchmarkValueSeriesViewer.kt", m933i = {0}, m934l = {113}, m935m = "invokeSuspend", m936n = {"$this$awaitPointerEventScope"}, m938s = {"L$0"})
                        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ double $effectiveMin;
                            final /* synthetic */ double $scaledYRange;
                            final /* synthetic */ MutableState<Double> $tappedValue$delegate;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(double d, double d2, MutableState<Double> mutableState, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$effectiveMin = d;
                                this.$scaledYRange = d2;
                                this.$tappedValue$delegate = mutableState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$effectiveMin, this.$scaledYRange, this.$tappedValue$delegate, continuation);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
                            /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
                            /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x00bd A[LOOP:0: B:21:0x00b7->B:23:0x00bd, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00cb A[ADDED_TO_REGION] */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0035 -> B:11:0x0038). Please report as a decompilation issue!!! */
                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
                            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                                /*
                            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            // Method dump skipped - placeholder implementation
            return null;
        }
                        }

                        @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
                            Object objAwaitPointerEventScope = $this$pointerInput.awaitPointerEventScope(new AnonymousClass1(effectiveMin, scaledYRange, tappedValue$delegate, null), continuation);
                            return objAwaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
                        }
                    };
                    $composer.updateRememberedValue(value$iv2);
                    it$iv = value$iv2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierM2022height3ABfNKs, valueList, (PointerInputEventHandler) it$iv);
                ComposerKt.sourceInformationMarkerStart($composer, -1719374754, "CC(remember):BenchmarkValueSeriesViewer.kt#9igjgp");
                boolean invalid$iv2 = $composer.changedInstance(valueList) | $composer.changed(effectiveMin) | $composer.changed(scaledYRange) | $composer.changed(lineColor) | $composer.changed(dotBgColor) | $composer.changed(dotBorderColor) | $composer.changed(tappedLineColor);
                Object it$iv2 = $composer.rememberedValue();
                if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkValueSeriesViewerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BenchmarkValueSeriesViewerKt.m478x10890af2(valueList, lineColor, dotBgColor, dotBorderColor, effectiveMin, scaledYRange, tappedLineColor, tappedValue$delegate, (DrawScope) obj);
                        }
                    };
                    $composer.updateRememberedValue(value$iv3);
                    it$iv2 = value$iv3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                CanvasKt.Canvas(modifierPointerInput, (Function1) it$iv2, $composer, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer$iv$iv$iv3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
                $composer2 = $composer;
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Modifier modifier$iv3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal horizontalArrangement$iv = spaceBetween;
            Composer $composer$iv3 = $composer2;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer$iv3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv3 = (438 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, -1159599143, str2);
            int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv3, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer$iv3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer$iv3, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, -553112988, str);
            if (!($composer$iv3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv3.startReusableNode();
            if ($composer$iv3.getInserting()) {
                function02 = constructor3;
                $composer$iv3.createNode(function02);
            } else {
                function02 = constructor3;
                $composer$iv3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer$iv3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, 1448098471, "C194@7710L46,195@7765L52,196@7826L46,197@7881L46:BenchmarkValueSeriesViewer.kt#aos0mq");
            StatCell("avg", $valueSeries.getAvg(), $composer$iv3, 6);
            StatCell("median", $valueSeries.getMedium(), $composer$iv3, 6);
            StatCell("min", $valueSeries.getMin(), $composer$iv3, 6);
            StatCell("max", $valueSeries.getMax(), $composer$iv3, 6);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            $composer$iv3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer$iv$iv$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final Double BenchmarkValueSeriesViewer$lambda$10$lambda$9$lambda$7$lambda$1(MutableState<Double> mutableState) {
        MutableState<Double> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkValueSeriesViewer$lambda$10$lambda$9$lambda$7$lambda$6$lambda$5 */
    public static final Unit m478x10890af2(List $values, long $lineColor, long $dotBgColor, long $dotBorderColor, double $effectiveMin, double $scaledYRange, long $tappedLineColor, MutableState $tappedValue$delegate, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float horizontalPaddingDp = C1654Dp.m9788constructorimpl(12);
        float horizontalPaddingPx = Canvas.mo1524toPx0680j_4(horizontalPaddingDp);
        int bits$iv$iv$iv = (int) (Canvas.mo7496getSizeNHjbRc() >> 32);
        float width = Float.intBitsToFloat(bits$iv$iv$iv) - (2 * horizontalPaddingPx);
        int bits$iv$iv$iv2 = (int) (Canvas.mo7496getSizeNHjbRc() & 4294967295L);
        float height = Float.intBitsToFloat(bits$iv$iv$iv2);
        float xStep = $values.size() > 1 ? width / ($values.size() - 1) : 0.0f;
        Intrinsics.checkNotNull($values);
        List $this$mapIndexed$iv = $values;
        int $i$f$mapIndexed = 0;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10));
        Iterable $this$mapIndexedTo$iv$iv = $this$mapIndexed$iv;
        int $i$f$mapIndexedTo = 0;
        int index$iv$iv = 0;
        for (Object item$iv$iv : $this$mapIndexedTo$iv$iv) {
            int index$iv$iv2 = index$iv$iv + 1;
            if (index$iv$iv < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Double value = (Double) item$iv$iv;
            float x = (index$iv$iv * xStep) + horizontalPaddingPx;
            float y$iv = (float) (((double) height) - (((value.doubleValue() - $effectiveMin) / $scaledYRange) * ((double) height)));
            Iterable $this$mapIndexed$iv2 = $this$mapIndexed$iv;
            long v1$iv$iv = Float.floatToRawIntBits(x);
            Iterable $this$mapIndexedTo$iv$iv2 = $this$mapIndexedTo$iv$iv;
            long v2$iv$iv = Float.floatToRawIntBits(y$iv);
            destination$iv$iv.add(Offset.m6659boximpl(Offset.m6662constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L))));
            index$iv$iv = index$iv$iv2;
            horizontalPaddingDp = horizontalPaddingDp;
            $i$f$mapIndexed = $i$f$mapIndexed;
            $this$mapIndexed$iv = $this$mapIndexed$iv2;
            $this$mapIndexedTo$iv$iv = $this$mapIndexedTo$iv$iv2;
            $i$f$mapIndexedTo = $i$f$mapIndexedTo;
        }
        float horizontalPaddingDp2 = horizontalPaddingDp;
        List points = (List) destination$iv$iv;
        int size = points.size() - 1;
        int i = 0;
        while (i < size) {
            DrawScope.m7482drawLineNGM6Ib0$default(Canvas, $lineColor, ((Offset) points.get(i)).m6680unboximpl(), ((Offset) points.get(i + 1)).m6680unboximpl(), Canvas.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(2)), 0, null, 0.0f, null, 0, 496, null);
            i++;
            points = points;
            size = size;
            height = height;
            horizontalPaddingDp2 = horizontalPaddingDp2;
        }
        float dotRadius = Canvas.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(4));
        float dotBorderWidth = Canvas.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(2));
        Iterator it = points.iterator();
        while (it.hasNext()) {
            long offset = ((Offset) it.next()).m6680unboximpl();
            DrawScope.m7477drawCircleVaOC9Bg$default(Canvas, $dotBgColor, dotRadius, offset, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            DrawScope.m7477drawCircleVaOC9Bg$default(Canvas, $dotBorderColor, dotRadius, offset, 0.0f, new Stroke(dotBorderWidth, 0.0f, 0, 0, null, 30, null), null, 0, LocationRequestCompat.QUALITY_LOW_POWER, null);
        }
        if (BenchmarkValueSeriesViewer$lambda$10$lambda$9$lambda$7$lambda$1($tappedValue$delegate) != null) {
            int bits$iv$iv$iv3 = (int) (Canvas.mo7496getSizeNHjbRc() & 4294967295L);
            double dIntBitsToFloat = Float.intBitsToFloat(bits$iv$iv$iv3);
            Double dBenchmarkValueSeriesViewer$lambda$10$lambda$9$lambda$7$lambda$1 = BenchmarkValueSeriesViewer$lambda$10$lambda$9$lambda$7$lambda$1($tappedValue$delegate);
            Intrinsics.checkNotNull(dBenchmarkValueSeriesViewer$lambda$10$lambda$9$lambda$7$lambda$1);
            double dDoubleValue = (dBenchmarkValueSeriesViewer$lambda$10$lambda$9$lambda$7$lambda$1.doubleValue() - $effectiveMin) / $scaledYRange;
            int bits$iv$iv$iv4 = (int) (Canvas.mo7496getSizeNHjbRc() & 4294967295L);
            double y = dIntBitsToFloat - (dDoubleValue * ((double) Float.intBitsToFloat(bits$iv$iv$iv4)));
            float y$iv2 = (float) y;
            long v1$iv$iv2 = Float.floatToRawIntBits(0.0f);
            long v2$iv$iv2 = Float.floatToRawIntBits(y$iv2);
            long start = Offset.m6662constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L));
            int bits$iv$iv$iv5 = (int) (Canvas.mo7496getSizeNHjbRc() >> 32);
            float x$iv = Float.intBitsToFloat(bits$iv$iv$iv5);
            float y$iv3 = (float) y;
            long v1$iv$iv3 = Float.floatToRawIntBits(x$iv);
            long v2$iv$iv3 = Float.floatToRawIntBits(y$iv3);
            long end = Offset.m6662constructorimpl((v1$iv$iv3 << 32) | (v2$iv$iv3 & 4294967295L));
            float[] dashIntervals = {10.0f, 10.0f};
            DrawScope.m7482drawLineNGM6Ib0$default(Canvas, $tappedLineColor, start, end, Canvas.mo1524toPx0680j_4(C1654Dp.m9788constructorimpl(1)), 0, PathEffect.INSTANCE.dashPathEffect(dashIntervals, 0.0f), 0.0f, null, 0, 464, null);
        }
        return Unit.INSTANCE;
    }

    private static final void StatCell(final String key, final double value, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(1163230993);
        ComposerKt.sourceInformation($composer3, "C(StatCell)205@8014L471:BenchmarkValueSeriesViewer.kt#aos0mq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(key) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(value) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1163230993, $dirty2, -1, "com.google.ai.edge.gallery.ui.benchmark.StatCell (BenchmarkValueSeriesViewer.kt:204)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -810274620, "C208@8120L10,209@8172L11,206@8029L297,215@8376L10,216@8427L11,213@8331L150:BenchmarkValueSeriesViewer.kt#aos0mq");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(value)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            TextKt.m4781TextNvy7gAk(str, null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), TextAutoSize.INSTANCE.m2476StepBasedvU0ePk(TextUnitKt.getSp(8), TextUnitKt.getSp(12), TextUnitKt.getSp(1)), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelMedium(), $composer3, 0, 24576, 114674);
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelSmall();
            long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant();
            $composer2 = $composer3;
            TextKt.m4781TextNvy7gAk(key, null, Color.m6913copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m6917getAlphaimpl(onSurfaceVariant) : 0.7f, (14 & 2) != 0 ? Color.m6921getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(onSurfaceVariant) : 0.0f), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelSmall, $composer3, $dirty2 & 14, 0, 131066);
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkValueSeriesViewerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkValueSeriesViewerKt.StatCell$lambda$13(key, value, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
}
