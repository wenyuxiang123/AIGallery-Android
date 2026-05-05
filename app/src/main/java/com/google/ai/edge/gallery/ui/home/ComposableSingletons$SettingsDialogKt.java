package com.google.ai.edge.gallery.ui.home;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.CheckCircleKt;
import androidx.compose.material3.IconKt;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SettingsDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$SettingsDialogKt {
    public static final ComposableSingletons$SettingsDialogKt INSTANCE = new ComposableSingletons$SettingsDialogKt();

    /* JADX INFO: renamed from: lambda$-884489038, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f891lambda$884489038 = ComposableLambdaKt.composableLambdaInstance(-884489038, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.home.ComposableSingletons$SettingsDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SettingsDialogKt.lambda__884489038$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-38038496, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f889lambda$38038496 = ComposableLambdaKt.composableLambdaInstance(-38038496, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.home.ComposableSingletons$SettingsDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SettingsDialogKt.lambda__38038496$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1019955663 = ComposableLambdaKt.composableLambdaInstance(1019955663, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.home.ComposableSingletons$SettingsDialogKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SettingsDialogKt.lambda_1019955663$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1811373616, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f888lambda$1811373616 = ComposableLambdaKt.composableLambdaInstance(-1811373616, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.home.ComposableSingletons$SettingsDialogKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SettingsDialogKt.lambda__1811373616$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-523107306, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f890lambda$523107306 = ComposableLambdaKt.composableLambdaInstance(-523107306, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.home.ComposableSingletons$SettingsDialogKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SettingsDialogKt.lambda__523107306$lambda$4((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1811373616$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11060getLambda$1811373616$app_debug() {
        return f888lambda$1811373616;
    }

    /* JADX INFO: renamed from: getLambda$-38038496$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11061getLambda$38038496$app_debug() {
        return f889lambda$38038496;
    }

    /* JADX INFO: renamed from: getLambda$-523107306$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11062getLambda$523107306$app_debug() {
        return f890lambda$523107306;
    }

    /* JADX INFO: renamed from: getLambda$-884489038$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11063getLambda$884489038$app_debug() {
        return f891lambda$884489038;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1019955663$app_debug() {
        return lambda$1019955663;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__884489038$lambda$0(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C231@9755L13:SettingsDialog.kt#lrhf9m");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-884489038, $changed, -1, "com.google.ai.edge.gallery.ui.home.ComposableSingletons$SettingsDialogKt.lambda$-884489038.<anonymous> (SettingsDialog.kt:231)");
            }
            TextKt.m4781TextNvy7gAk("Clear", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__38038496$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C283@12295L37,281@12189L170:SettingsDialog.kt#lrhf9m");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38038496, $changed, -1, "com.google.ai.edge.gallery.ui.home.ComposableSingletons$SettingsDialogKt.lambda$-38038496.<anonymous> (SettingsDialog.kt:281)");
            }
            IconKt.m4075Iconww6aTOc(CheckCircleKt.getCheckCircle(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_done_icon, $composer, 0), (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1019955663$lambda$2(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C307@13190L21:SettingsDialog.kt#lrhf9m");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1019955663, $changed, -1, "com.google.ai.edge.gallery.ui.home.ComposableSingletons$SettingsDialogKt.lambda$1019955663.<anonymous> (SettingsDialog.kt:307)");
            }
            TextKt.m4781TextNvy7gAk("View licenses", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1811373616$lambda$3(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C318@13621L66,318@13616L72:SettingsDialog.kt#lrhf9m");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1811373616, $changed, -1, "com.google.ai.edge.gallery.ui.home.ComposableSingletons$SettingsDialogKt.lambda$-1811373616.<anonymous> (SettingsDialog.kt:318)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.settings_dialog_view_app_terms_of_service, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__523107306$lambda$4(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C339@14456L13:SettingsDialog.kt#lrhf9m");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-523107306, $changed, -1, "com.google.ai.edge.gallery.ui.home.ComposableSingletons$SettingsDialogKt.lambda$-523107306.<anonymous> (SettingsDialog.kt:339)");
            }
            TextKt.m4781TextNvy7gAk("Close", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
