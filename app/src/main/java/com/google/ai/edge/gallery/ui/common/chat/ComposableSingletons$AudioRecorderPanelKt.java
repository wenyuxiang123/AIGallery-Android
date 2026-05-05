package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AudioRecorderPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$AudioRecorderPanelKt {
    public static final ComposableSingletons$AudioRecorderPanelKt INSTANCE = new ComposableSingletons$AudioRecorderPanelKt();
    private static Function2<Composer, Integer, Unit> lambda$722342468 = ComposableLambdaKt.composableLambdaInstance(722342468, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$AudioRecorderPanelKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AudioRecorderPanelKt.lambda_722342468$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$722342468$app_debug() {
        return lambda$722342468;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_722342468$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C140@5606L30,141@5667L11,138@5542L155:AudioRecorderPanel.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(722342468, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$AudioRecorderPanelKt.lambda$722342468.<anonymous> (AudioRecorderPanel.kt:138)");
            }
            IconKt.m4075Iconww6aTOc(CloseKt.getClose(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.close, $composer, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
