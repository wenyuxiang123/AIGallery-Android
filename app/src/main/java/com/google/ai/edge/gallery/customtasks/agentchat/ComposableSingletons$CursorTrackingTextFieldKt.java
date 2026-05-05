package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: CursorTrackingTextField.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$CursorTrackingTextFieldKt {
    public static final ComposableSingletons$CursorTrackingTextFieldKt INSTANCE = new ComposableSingletons$CursorTrackingTextFieldKt();
    private static Function2<Composer, Integer, Unit> lambda$1863007836 = ComposableLambdaKt.composableLambdaInstance(1863007836, false, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$CursorTrackingTextFieldKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CursorTrackingTextFieldKt.lambda_1863007836$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1863007836$app_debug() {
        return lambda$1863007836;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1863007836$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:CursorTrackingTextField.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1863007836, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$CursorTrackingTextFieldKt.lambda$1863007836.<anonymous> (CursorTrackingTextField.kt:59)");
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
