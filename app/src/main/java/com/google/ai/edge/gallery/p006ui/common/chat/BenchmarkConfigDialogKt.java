package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.ai.edge.gallery.data.Config;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.ConfigKt;
import com.google.ai.edge.gallery.data.NumberSliderConfig;
import com.google.ai.edge.gallery.data.ValueType;
import com.google.ai.edge.gallery.p006ui.common.ConfigDialogKt;
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

/* JADX INFO: compiled from: BenchmarkConfigDialog.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ac\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2<\u0010\u000f\u001a8\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\n0\u0010H\u0007¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m922d2 = {"DEFAULT_BENCHMARK_WARM_UP_ITERATIONS", "", "DEFAULT_BENCHMARK_ITERATIONS", "BENCHMARK_CONFIGS", "", "Lcom/google/ai/edge/gallery/data/Config;", "BENCHMARK_CONFIGS_INITIAL_VALUES", "", "", "BenchmarkConfigDialog", "", "onDismissed", "Lkotlin/Function0;", "messageToBenchmark", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "onBenchmarkClicked", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "warmUpIterations", "benchmarkIterations", "(Lkotlin/jvm/functions/Function0;Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class BenchmarkConfigDialogKt {
    private static final List<Config> BENCHMARK_CONFIGS = CollectionsKt.listOf((Object[]) new NumberSliderConfig[]{new NumberSliderConfig(ConfigKeys.INSTANCE.getWARM_UP_ITERATIONS(), 10.0f, 200.0f, 50.0f, ValueType.INT, false, 32, null), new NumberSliderConfig(ConfigKeys.INSTANCE.getBENCHMARK_ITERATIONS(), 50.0f, 500.0f, 200.0f, ValueType.INT, false, 32, null)});
    private static final Map<String, Float> BENCHMARK_CONFIGS_INITIAL_VALUES = MapsKt.mapOf(TuplesKt.m929to(ConfigKeys.INSTANCE.getWARM_UP_ITERATIONS().getLabel(), Float.valueOf(50.0f)), TuplesKt.m929to(ConfigKeys.INSTANCE.getBENCHMARK_ITERATIONS().getLabel(), Float.valueOf(200.0f)));
    private static final float DEFAULT_BENCHMARK_ITERATIONS = 200.0f;
    private static final float DEFAULT_BENCHMARK_WARM_UP_ITERATIONS = 50.0f;

    /* JADX INFO: Access modifiers changed from: private */
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

    /* JADX INFO: Access modifiers changed from: private */
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
