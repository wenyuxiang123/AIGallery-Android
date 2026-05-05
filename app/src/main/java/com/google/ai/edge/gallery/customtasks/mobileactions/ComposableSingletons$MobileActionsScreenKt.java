package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.graphics.Color;
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

/* JADX INFO: compiled from: MobileActionsScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$MobileActionsScreenKt {
    public static final ComposableSingletons$MobileActionsScreenKt INSTANCE = new ComposableSingletons$MobileActionsScreenKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1903548407 = ComposableLambdaKt.composableLambdaInstance(1903548407, false, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.ComposableSingletons$MobileActionsScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MobileActionsScreenKt.lambda_1903548407$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1146078024 = ComposableLambdaKt.composableLambdaInstance(1146078024, false, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.ComposableSingletons$MobileActionsScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$MobileActionsScreenKt.lambda_1146078024$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-118238621, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f832lambda$118238621 = ComposableLambdaKt.composableLambdaInstance(-118238621, false, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.ComposableSingletons$MobileActionsScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MobileActionsScreenKt.lambda__118238621$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-118238621$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10506getLambda$118238621$app_debug() {
        return f832lambda$118238621;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1146078024$app_debug() {
        return lambda$1146078024;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1903548407$app_debug() {
        return lambda$1903548407;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__118238621$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C701@27310L30,701@27305L36:MobileActionsScreen.kt#okf2md");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-118238621, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.ComposableSingletons$MobileActionsScreenKt.lambda$-118238621.<anonymous> (MobileActionsScreen.kt:701)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.error, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1146078024$lambda$1(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C714@27710L31,714@27705L37:MobileActionsScreen.kt#okf2md");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1146078024, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.ComposableSingletons$MobileActionsScreenKt.lambda$1146078024.<anonymous> (MobileActionsScreen.kt:714)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.cancel, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1903548407$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C736@28336L30,736@28331L57:MobileActionsScreen.kt#okf2md");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1903548407, $changed, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.ComposableSingletons$MobileActionsScreenKt.lambda$1903548407.<anonymous> (MobileActionsScreen.kt:736)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.reset, $composer, 0), null, Color.INSTANCE.m6952getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 384, 0, 262138);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
