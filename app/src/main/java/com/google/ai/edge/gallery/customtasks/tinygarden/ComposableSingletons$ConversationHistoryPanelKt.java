package com.google.ai.edge.gallery.customtasks.tinygarden;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.CloseKt;
import androidx.compose.material3.IconKt;
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

/* JADX INFO: compiled from: ConversationHistoryPanel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ConversationHistoryPanelKt {
    public static final ComposableSingletons$ConversationHistoryPanelKt INSTANCE = new ComposableSingletons$ConversationHistoryPanelKt();
    private static Function2<Composer, Integer, Unit> lambda$988996531 = ComposableLambdaKt.composableLambdaInstance(988996531, false, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.ComposableSingletons$ConversationHistoryPanelKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationHistoryPanelKt.lambda_988996531$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$988996531$app_debug() {
        return lambda$988996531;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_988996531$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C98@3881L38,96@3799L131:ConversationHistoryPanel.kt#pwpd1x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(988996531, $changed, -1, "com.google.ai.edge.gallery.customtasks.tinygarden.ComposableSingletons$ConversationHistoryPanelKt.lambda$988996531.<anonymous> (ConversationHistoryPanel.kt:96)");
            }
            IconKt.m4075Iconww6aTOc(CloseKt.getClose(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_close_icon, $composer, 0), (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
