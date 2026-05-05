package com.google.ai.edge.gallery.p006ui.home;

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

/* JADX INFO: compiled from: MobileActionsChallengeDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$MobileActionsChallengeDialogKt {
    public static final ComposableSingletons$MobileActionsChallengeDialogKt INSTANCE = new ComposableSingletons$MobileActionsChallengeDialogKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1023423865 = ComposableLambdaKt.composableLambdaInstance(1023423865, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.home.ComposableSingletons$MobileActionsChallengeDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MobileActionsChallengeDialogKt.lambda_1023423865$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-746245402, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f886lambda$746245402 = ComposableLambdaKt.composableLambdaInstance(-746245402, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.home.ComposableSingletons$MobileActionsChallengeDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MobileActionsChallengeDialogKt.lambda__746245402$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-746245402$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11057getLambda$746245402$app_debug() {
        return f886lambda$746245402;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1023423865$app_debug() {
        return lambda$1023423865;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1023423865$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C101@4215L61,101@4210L67:MobileActionsChallengeDialog.kt#lrhf9m");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1023423865, $changed, -1, "com.google.ai.edge.gallery.ui.home.ComposableSingletons$MobileActionsChallengeDialogKt.lambda$1023423865.<anonymous> (MobileActionsChallengeDialog.kt:101)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.mobile_actions_challenge_email_colab, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__746245402$lambda$1(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C104@4343L60,104@4338L66:MobileActionsChallengeDialog.kt#lrhf9m");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-746245402, $changed, -1, "com.google.ai.edge.gallery.ui.home.ComposableSingletons$MobileActionsChallengeDialogKt.lambda$-746245402.<anonymous> (MobileActionsChallengeDialog.kt:104)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.mobile_actions_challenge_load_model, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
