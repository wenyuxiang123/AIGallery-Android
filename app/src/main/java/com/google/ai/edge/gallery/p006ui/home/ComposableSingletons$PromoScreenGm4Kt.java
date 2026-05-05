package com.google.ai.edge.gallery.p006ui.home;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PromoScreenGm4.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$PromoScreenGm4Kt {
    public static final ComposableSingletons$PromoScreenGm4Kt INSTANCE = new ComposableSingletons$PromoScreenGm4Kt();

    /* JADX INFO: renamed from: lambda$-356862755, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f887lambda$356862755 = ComposableLambdaKt.composableLambdaInstance(-356862755, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.home.ComposableSingletons$PromoScreenGm4Kt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PromoScreenGm4Kt.lambda__356862755$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-356862755$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11059getLambda$356862755$app_debug() {
        return f887lambda$356862755;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__356862755$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C109@3815L42:PromoScreenGm4.kt#lrhf9m");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-356862755, $changed, -1, "com.google.ai.edge.gallery.ui.home.ComposableSingletons$PromoScreenGm4Kt.lambda$-356862755.<anonymous> (PromoScreenGm4.kt:109)");
            }
            TextKt.m4781TextNvy7gAk("Dismiss", null, ColorKt.Color(4289251322L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 390, 0, 262138);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
