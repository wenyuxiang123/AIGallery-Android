package com.google.ai.edge.gallery.p006ui.common.chat;

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

/* JADX INFO: compiled from: ModelNotDownloaded.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ModelNotDownloadedKt {
    public static final ComposableSingletons$ModelNotDownloadedKt INSTANCE = new ComposableSingletons$ModelNotDownloadedKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$72372873 = ComposableLambdaKt.composableLambdaInstance(72372873, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$ModelNotDownloadedKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ModelNotDownloadedKt.lambda_72372873$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$72372873$app_debug() {
        return lambda$72372873;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_72372873$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C40@1503L39:ModelNotDownloaded.kt#ouynps");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(72372873, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$ModelNotDownloadedKt.lambda$72372873.<anonymous> (ModelNotDownloaded.kt:40)");
            }
            TextKt.m4781TextNvy7gAk("Download & Try it", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, $composer, 6, 24576, 245758);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
