package com.google.ai.edge.gallery.p006ui.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EmptyState.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$EmptyStateKt {
    public static final ComposableSingletons$EmptyStateKt INSTANCE = new ComposableSingletons$EmptyStateKt();
    private static Function2<Composer, Integer, Unit> lambda$1137270977 = ComposableLambdaKt.composableLambdaInstance(1137270977, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$EmptyStateKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$EmptyStateKt.lambda_1137270977$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1137270977$app_debug() {
        return lambda$1137270977;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1137270977$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:EmptyState.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1137270977, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$EmptyStateKt.lambda$1137270977.<anonymous> (EmptyState.kt:40)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
