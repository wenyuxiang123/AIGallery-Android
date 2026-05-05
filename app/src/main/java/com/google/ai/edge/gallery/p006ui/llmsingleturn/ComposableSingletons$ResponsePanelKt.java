package com.google.ai.edge.gallery.p006ui.llmsingleturn;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.ContentCopyKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ResponsePanel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ResponsePanelKt {
    public static final ComposableSingletons$ResponsePanelKt INSTANCE = new ComposableSingletons$ResponsePanelKt();
    private static Function2<Composer, Integer, Unit> lambda$441070290 = ComposableLambdaKt.composableLambdaInstance(441070290, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.ComposableSingletons$ResponsePanelKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ResponsePanelKt.lambda_441070290$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$441070290$app_debug() {
        return lambda$441070290;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_441070290$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C182@7401L50,180@7310L211:ResponsePanel.kt#32uq7b");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(441070290, $changed, -1, "com.google.ai.edge.gallery.ui.llmsingleturn.ComposableSingletons$ResponsePanelKt.lambda$441070290.<anonymous> (ResponsePanel.kt:180)");
            }
            IconKt.m4075Iconww6aTOc(ContentCopyKt.getContentCopy(Icons.Outlined.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_copy_to_clipboard_icon, $composer, 0), SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), 0L, $composer, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
