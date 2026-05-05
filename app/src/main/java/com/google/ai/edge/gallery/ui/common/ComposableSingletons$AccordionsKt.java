package com.google.ai.edge.gallery.ui.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Accordions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$AccordionsKt {
    public static final ComposableSingletons$AccordionsKt INSTANCE = new ComposableSingletons$AccordionsKt();
    private static Function2<Composer, Integer, Unit> lambda$1599436987 = ComposableLambdaKt.composableLambdaInstance(1599436987, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$AccordionsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AccordionsKt.lambda_1599436987$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1599436987$app_debug() {
        return lambda$1599436987;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1599436987$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:Accordions.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1599436987, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$AccordionsKt.lambda$1599436987.<anonymous> (Accordions.kt:56)");
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
