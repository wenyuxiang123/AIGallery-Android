package com.google.ai.edge.gallery.p006ui.common;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ErrorDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ErrorDialogKt {
    public static final ComposableSingletons$ErrorDialogKt INSTANCE = new ComposableSingletons$ErrorDialogKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1082244754 = ComposableLambdaKt.composableLambdaInstance(1082244754, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$ErrorDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ErrorDialogKt.lambda_1082244754$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1082244754$app_debug() {
        return lambda$1082244754;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1082244754$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C56@2061L13:ErrorDialog.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1082244754, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$ErrorDialogKt.lambda$1082244754.<anonymous> (ErrorDialog.kt:56)");
            }
            TextKt.m4781TextNvy7gAk("Close", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
