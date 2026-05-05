package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.ai.edge.gallery.data.Config;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.ConfigKt;
import com.google.ai.edge.gallery.data.NumberSliderConfig;
import com.google.ai.edge.gallery.data.ValueType;
import com.google.ai.edge.gallery.ui.common.ConfigDialogKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;



V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class BenchmarkConfigDialogKt {
    private static final List<Config> BENCHMARK_CONFIGS = CollectionsKt.listOf((Object[]) new NumberSliderConfig[]{new NumberSliderConfig(ConfigKeys.INSTANCE.getWARM_UP_ITERATIONS(), 10.0f, 200.0f, 50.0f, ValueType.INT, false, 32, null), new NumberSliderConfig(ConfigKeys.INSTANCE.getBENCHMARK_ITERATIONS(), 50.0f, 500.0f, 200.0f, ValueType.INT, false, 32, null)});
    private static final Map<String, Float> BENCHMARK_CONFIGS_INITIAL_VALUES = MapsKt.mapOf(TuplesKt.m929to(ConfigKeys.INSTANCE.getWARM_UP_ITERATIONS().getLabel(), Float.valueOf(50.0f)), TuplesKt.m929to(ConfigKeys.INSTANCE.getBENCHMARK_ITERATIONS().getLabel(), Float.valueOf(200.0f)));
    private static final float DEFAULT_BENCHMARK_ITERATIONS = 200.0f;
    private static final float DEFAULT_BENCHMARK_WARM_UP_ITERATIONS = 50.0f;

    
    public static final Unit BenchmarkConfigDialog$lambda$3(Function0 function0, ChatMessage chatMessage, Function3 function3, int i, Composer composer, int i2) {
        BenchmarkConfigDialog(function0, chatMessage, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BenchmarkConfigDialog(final Function0<Unit> onDismissed, final ChatMessage messageToBenchmark, final Function3<? super ChatMessage, ? super Integer, ? super Integer, Unit> onBenchmarkClicked, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        Intrinsics.checkNotNullParameter(onBenchmarkClicked, "onBenchmarkClicked");
        Composer $composer3 = $composer.startRestartGroup(1293064708);
        ComposerKt.sourceInformation($composer3, "C(BenchmarkConfigDialog)P(2)74@2676L679,68@2474L886:BenchmarkConfigDialog.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onDismissed) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(messageToBenchmark) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onBenchmarkClicked) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1293064708, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.BenchmarkConfigDialog (BenchmarkConfigDialog.kt:67)");
            }
            List<Config> list = BENCHMARK_CONFIGS;
            Map<String, Float> map = BENCHMARK_CONFIGS_INITIAL_VALUES;
            ComposerKt.sourceInformationMarkerStart($composer3, 1389649451, "CC(remember):BenchmarkConfigDialog.kt#9igjgp");
            boolean invalid$iv = (($dirty2 & 14) == 4) | (($dirty2 & 112) == 32) | (($dirty2 & 896) == 256);
            Object it$iv = $composer3.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.BenchmarkConfigDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return BenchmarkConfigDialogKt.BenchmarkConfigDialog$lambda$2$lambda$1(onDismissed, messageToBenchmark, onBenchmarkClicked, (Map) obj, (String) obj2, (String) obj3);
                    }
                };
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            ConfigDialogKt.ConfigDialog("Benchmark configs", list, map, onDismissed, (Function3) it$iv, "Start", null, false, false, null, null, $composer3, (($dirty2 << 9) & 7168) | 196614, 0, 1984);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.BenchmarkConfigDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkConfigDialogKt.BenchmarkConfigDialog$lambda$3(onDismissed, messageToBenchmark, onBenchmarkClicked, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    
    public static final Unit BenchmarkConfigDialog$lambda$2$lambda$1(Function0 $onDismissed, ChatMessage $messageToBenchmark, Function3 $onBenchmarkClicked, Map curConfigValues, String str, String str2) {
        Intrinsics.checkNotNullParameter(curConfigValues, "curConfigValues");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        $onDismissed.invoke();
        if ($messageToBenchmark != null) {
            Object objConvertValueToTargetType = ConfigKt.convertValueToTargetType(MapsKt.getValue(curConfigValues, ConfigKeys.INSTANCE.getWARM_UP_ITERATIONS().getLabel()), ValueType.INT);
            Intrinsics.checkNotNull(objConvertValueToTargetType, "null cannot be cast to non-null type kotlin.Int");
            int warmUpIterations = ((Integer) objConvertValueToTargetType).intValue();
            Object objConvertValueToTargetType2 = ConfigKt.convertValueToTargetType(MapsKt.getValue(curConfigValues, ConfigKeys.INSTANCE.getBENCHMARK_ITERATIONS().getLabel()), ValueType.INT);
            Intrinsics.checkNotNull(objConvertValueToTargetType2, "null cannot be cast to non-null type kotlin.Int");
            int benchmarkIterations = ((Integer) objConvertValueToTargetType2).intValue();
            $onBenchmarkClicked.invoke($messageToBenchmark, Integer.valueOf(warmUpIterations), Integer.valueOf(benchmarkIterations));
        }
        return Unit.INSTANCE;
    }
}
