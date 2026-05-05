package com.google.ai.edge.gallery.ui.common;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MemoryWarning.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$MemoryWarningKt {
    public static final ComposableSingletons$MemoryWarningKt INSTANCE = new ComposableSingletons$MemoryWarningKt();

    /* JADX INFO: renamed from: lambda$-1295472729, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f851lambda$1295472729 = ComposableLambdaKt.composableLambdaInstance(-1295472729, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$MemoryWarningKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MemoryWarningKt.lambda__1295472729$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2051442601 = ComposableLambdaKt.composableLambdaInstance(2051442601, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$MemoryWarningKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MemoryWarningKt.lambda_2051442601$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1760517074, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f852lambda$1760517074 = ComposableLambdaKt.composableLambdaInstance(-1760517074, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$MemoryWarningKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MemoryWarningKt.lambda__1760517074$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2060424239 = ComposableLambdaKt.composableLambdaInstance(2060424239, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$MemoryWarningKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MemoryWarningKt.lambda_2060424239$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1295472729$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10835getLambda$1295472729$app_debug() {
        return f851lambda$1295472729;
    }

    /* JADX INFO: renamed from: getLambda$-1760517074$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10836getLambda$1760517074$app_debug() {
        return f852lambda$1760517074;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2051442601$app_debug() {
        return lambda$2051442601;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2060424239$app_debug() {
        return lambda$2060424239;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1760517074$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C37@1341L45,37@1336L51:MemoryWarning.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1760517074, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$MemoryWarningKt.lambda$-1760517074.<anonymous> (MemoryWarning.kt:37)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.memory_warning_title, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2060424239$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C38@1409L47,38@1404L53:MemoryWarning.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2060424239, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$MemoryWarningKt.lambda$2060424239.<anonymous> (MemoryWarning.kt:38)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.memory_warning_content, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1295472729$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C42@1574L54,42@1569L60:MemoryWarning.kt#t7sjiu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1295472729, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$MemoryWarningKt.lambda$-1295472729.<anonymous> (MemoryWarning.kt:42)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.memory_warning_proceed_anyway, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2051442601$lambda$1(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C45@1708L31,45@1703L37:MemoryWarning.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2051442601, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$MemoryWarningKt.lambda$2051442601.<anonymous> (MemoryWarning.kt:45)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.cancel, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
