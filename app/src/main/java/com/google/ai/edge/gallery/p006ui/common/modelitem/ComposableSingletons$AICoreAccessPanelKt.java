package com.google.ai.edge.gallery.p006ui.common.modelitem;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AICoreAccessPanel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$AICoreAccessPanelKt {
    public static final ComposableSingletons$AICoreAccessPanelKt INSTANCE = new ComposableSingletons$AICoreAccessPanelKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$912254275 = ComposableLambdaKt.composableLambdaInstance(912254275, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$AICoreAccessPanelKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AICoreAccessPanelKt.lambda_912254275$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$912254275$app_debug() {
        return lambda$912254275;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_912254275$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C73@2667L51,74@2750L11,75@2801L10,72@2653L178:AICoreAccessPanel.kt#13a6jo");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912254275, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$AICoreAccessPanelKt.lambda$912254275.<anonymous> (AICoreAccessPanel.kt:72)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.aicore_access_panel_button, $composer, 0), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge(), $composer, 0, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
