package com.google.ai.edge.gallery.ui.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.data.Model;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0002\u0010\t\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m922d2 = {"TAG", "", "BYTES_IN_GB", "", "MemoryWarningAlert", "", "onProceeded", "Lkotlin/Function0;", "onDismissed", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "isMemoryLow", "", "context", "Landroid/content/Context;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class MemoryWarningKt {
    private static final float BYTES_IN_GB = 1.07374182E9f;
    private static final String TAG = "AGMemoryWarning";

    
    public static final Unit MemoryWarningAlert$lambda$2(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        MemoryWarningAlert(function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MemoryWarningAlert(final Function0<Unit> onProceeded, final Function0<Unit> onDismissed, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(onProceeded, "onProceeded");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        Composer $composer3 = $composer.startRestartGroup(-248236574);
        ComposerKt.sourceInformation($composer3, "C(MemoryWarningAlert)P(1)40@1517L126,45@1665L79,36@1309L440:MemoryWarning.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onProceeded) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismissed) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-248236574, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.MemoryWarningAlert (MemoryWarning.kt:35)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0(onDismissed, ComposableLambdaKt.rememberComposableLambda(135586858, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.MemoryWarningKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MemoryWarningKt.MemoryWarningAlert$lambda$0(onProceeded, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-812465108, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.MemoryWarningKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MemoryWarningKt.MemoryWarningAlert$lambda$1(onDismissed, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$MemoryWarningKt.INSTANCE.m10836getLambda$1760517074$app_debug(), ComposableSingletons$MemoryWarningKt.INSTANCE.getLambda$2060424239$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty2 >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.MemoryWarningKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MemoryWarningKt.MemoryWarningAlert$lambda$2(onProceeded, onDismissed, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    
    public static final Unit MemoryWarningAlert$lambda$0(Function0 $onProceeded, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C41@1525L112:MemoryWarning.kt#t7sjiu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(135586858, $changed, -1, "com.google.ai.edge.gallery.ui.common.MemoryWarningAlert.<anonymous> (MemoryWarning.kt:41)");
            }
            ButtonKt.TextButton($onProceeded, null, false, null, null, null, null, null, null, ComposableSingletons$MemoryWarningKt.INSTANCE.m10835getLambda$1295472729$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit MemoryWarningAlert$lambda$1(Function0 $onDismissed, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C45@1667L75:MemoryWarning.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-812465108, $changed, -1, "com.google.ai.edge.gallery.ui.common.MemoryWarningAlert.<anonymous> (MemoryWarning.kt:45)");
            }
            ButtonKt.TextButton($onDismissed, null, false, null, null, null, null, null, null, ComposableSingletons$MemoryWarningKt.INSTANCE.getLambda$2051442601$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final boolean isMemoryLow(Context context, Model model) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        Integer minDeviceMemoryInGb = model.getMinDeviceMemoryInGb();
        if (activityManager == null || minDeviceMemoryInGb == null) {
            return false;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        float deviceMemInGb = memoryInfo.totalMem / BYTES_IN_GB;
        if (Build.VERSION.SDK_INT >= 34) {
            deviceMemInGb = memoryInfo.advertisedMem / BYTES_IN_GB;
        }
        Log.d(TAG, "Device memory (GB): " + deviceMemInGb + ". Model's required min device memory (GB): " + minDeviceMemoryInGb + ".");
        return deviceMemInGb < ((float) minDeviceMemoryInGb.intValue());
    }
}
