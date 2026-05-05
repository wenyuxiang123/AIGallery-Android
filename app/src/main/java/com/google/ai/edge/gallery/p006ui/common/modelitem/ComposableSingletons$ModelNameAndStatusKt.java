package com.google.ai.edge.gallery.p006ui.common.modelitem;

import android.R;
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

/* JADX INFO: compiled from: ModelNameAndStatus.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ModelNameAndStatusKt {
    public static final ComposableSingletons$ModelNameAndStatusKt INSTANCE = new ComposableSingletons$ModelNameAndStatusKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2020499614 = ComposableLambdaKt.composableLambdaInstance(2020499614, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$ModelNameAndStatusKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ModelNameAndStatusKt.lambda_2020499614$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1404500809, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f881lambda$1404500809 = ComposableLambdaKt.composableLambdaInstance(-1404500809, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$ModelNameAndStatusKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ModelNameAndStatusKt.lambda__1404500809$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1404500809$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11016getLambda$1404500809$app_debug() {
        return f881lambda$1404500809;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2020499614$app_debug() {
        return lambda$2020499614;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1404500809$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C137@5221L42,137@5216L48:ModelNameAndStatus.kt#13a6jo");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1404500809, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$ModelNameAndStatusKt.lambda$-1404500809.<anonymous> (ModelNameAndStatus.kt:137)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.about_this_update, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2020499614$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C141@5417L35,141@5412L41:ModelNameAndStatus.kt#13a6jo");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2020499614, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$ModelNameAndStatusKt.lambda$2020499614.<anonymous> (ModelNameAndStatus.kt:141)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(R.string.ok, $composer, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
