package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelDownloadStatusInfoPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ModelDownloadStatusInfoPanelKt {
    public static final ComposableSingletons$ModelDownloadStatusInfoPanelKt INSTANCE = new ComposableSingletons$ModelDownloadStatusInfoPanelKt();
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> lambda$1976447827 = ComposableLambdaKt.composableLambdaInstance(1976447827, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$ModelDownloadStatusInfoPanelKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ModelDownloadStatusInfoPanelKt.lambda_1976447827$lambda$0((AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> getLambda$1976447827$app_debug() {
        return lambda$1976447827;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1976447827$lambda$0(AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C108@4297L10,104@4076L338:ModelDownloadStatusInfoPanel.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1976447827, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$ModelDownloadStatusInfoPanelKt.lambda$1976447827.<anonymous> (ModelDownloadStatusInfoPanel.kt:104)");
        }
        TextKt.m4781TextNvy7gAk("Feel free to switch apps or lock your device.\nThe download will continue in the background.\nWe'll send a notification when it's done.", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m9620boximpl(TextAlign.INSTANCE.m9627getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 48, 0, 130044);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
