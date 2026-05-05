package com.google.ai.edge.gallery.ui.common.modelitem;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.DeleteKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DeleteModelButton.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$DeleteModelButtonKt {
    public static final ComposableSingletons$DeleteModelButtonKt INSTANCE = new ComposableSingletons$DeleteModelButtonKt();

    /* JADX INFO: renamed from: lambda$-1654224660, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f878lambda$1654224660 = ComposableLambdaKt.composableLambdaInstance(-1654224660, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$DeleteModelButtonKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DeleteModelButtonKt.lambda__1654224660$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1654224660$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11009getLambda$1654224660$app_debug() {
        return f878lambda$1654224660;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1654224660$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C58@2327L39,59@2403L11,56@2249L244:DeleteModelButton.kt#13a6jo");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1654224660, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$DeleteModelButtonKt.lambda$-1654224660.<anonymous> (DeleteModelButton.kt:56)");
            }
            IconKt.m4075Iconww6aTOc(DeleteKt.getDelete(Icons.Outlined.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_delete_icon, $composer, 0), AlphaKt.alpha(Modifier.INSTANCE, 0.6f), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
