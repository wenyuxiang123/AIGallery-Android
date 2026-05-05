package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CloseKt;
import androidx.compose.material.icons.outlined.FitScreenKt;
import androidx.compose.material3.AssistChipDefaults;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
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

/* JADX INFO: compiled from: MessageBodyWebview.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$MessageBodyWebviewKt {
    public static final ComposableSingletons$MessageBodyWebviewKt INSTANCE = new ComposableSingletons$MessageBodyWebviewKt();
    private static Function2<Composer, Integer, Unit> lambda$620831374 = ComposableLambdaKt.composableLambdaInstance(620831374, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyWebviewKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageBodyWebviewKt.lambda_620831374$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-127437717, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f866lambda$127437717 = ComposableLambdaKt.composableLambdaInstance(-127437717, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyWebviewKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageBodyWebviewKt.lambda__127437717$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1227949205 = ComposableLambdaKt.composableLambdaInstance(1227949205, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyWebviewKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageBodyWebviewKt.lambda_1227949205$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-127437717$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10947getLambda$127437717$app_debug() {
        return f866lambda$127437717;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1227949205$app_debug() {
        return lambda$1227949205;
    }

    public final Function2<Composer, Integer, Unit> getLambda$620831374$app_debug() {
        return lambda$620831374;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__127437717$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C78@3247L11,74@3083L203:MessageBodyWebview.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-127437717, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyWebviewKt.lambda$-127437717.<anonymous> (MessageBodyWebview.kt:74)");
            }
            IconKt.m4075Iconww6aTOc(FitScreenKt.getFitScreen(Icons.Outlined.INSTANCE), (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, AssistChipDefaults.INSTANCE.m3559getIconSizeD9Ej5fM()), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_620831374$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C81@3317L44,81@3312L50:MessageBodyWebview.kt#ouynps");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(620831374, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyWebviewKt.lambda$620831374.<anonymous> (MessageBodyWebview.kt:81)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.view_in_full_screen, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1227949205$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C119@4575L38,120@4648L11,117@4502L187:MessageBodyWebview.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1227949205, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyWebviewKt.lambda$1227949205.<anonymous> (MessageBodyWebview.kt:117)");
            }
            IconKt.m4075Iconww6aTOc(CloseKt.getClose(Icons.Outlined.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_close_icon, $composer, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
