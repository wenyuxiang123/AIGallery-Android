package com.google.ai.edge.gallery.ui.common.tos;

import androidx.compose.foundation.layout.RowScope;
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

/* JADX INFO: compiled from: GemmaTermsOfUseDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$GemmaTermsOfUseDialogKt {
    public static final ComposableSingletons$GemmaTermsOfUseDialogKt INSTANCE = new ComposableSingletons$GemmaTermsOfUseDialogKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1842445377 = ComposableLambdaKt.composableLambdaInstance(1842445377, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.tos.ComposableSingletons$GemmaTermsOfUseDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GemmaTermsOfUseDialogKt.lambda_1842445377$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1842445377$app_debug() {
        return lambda$1842445377;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1842445377$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C96@4052L31,96@4047L37:GemmaTermsOfUseDialog.kt#8d38sg");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1842445377, $changed, -1, "com.google.ai.edge.gallery.ui.common.tos.ComposableSingletons$GemmaTermsOfUseDialogKt.lambda$1842445377.<anonymous> (GemmaTermsOfUseDialog.kt:96)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.cancel, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
