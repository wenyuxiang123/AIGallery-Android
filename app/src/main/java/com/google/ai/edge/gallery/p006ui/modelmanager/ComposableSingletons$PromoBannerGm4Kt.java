package com.google.ai.edge.gallery.p006ui.modelmanager;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PromoBannerGm4.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$PromoBannerGm4Kt {
    public static final ComposableSingletons$PromoBannerGm4Kt INSTANCE = new ComposableSingletons$PromoBannerGm4Kt();

    /* JADX INFO: renamed from: lambda$-338341439, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f910lambda$338341439 = ComposableLambdaKt.composableLambdaInstance(-338341439, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$PromoBannerGm4Kt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PromoBannerGm4Kt.lambda__338341439$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1855603410, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f909lambda$1855603410 = ComposableLambdaKt.composableLambdaInstance(-1855603410, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$PromoBannerGm4Kt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PromoBannerGm4Kt.lambda__1855603410$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1855603410$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11157getLambda$1855603410$app_debug() {
        return f909lambda$1855603410;
    }

    /* JADX INFO: renamed from: getLambda$-338341439$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11158getLambda$338341439$app_debug() {
        return f910lambda$338341439;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__338341439$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C105@4401L15:PromoBannerGm4.kt#ahf767");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-338341439, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$PromoBannerGm4Kt.lambda$-338341439.<anonymous> (PromoBannerGm4.kt:105)");
            }
            TextKt.m4781TextNvy7gAk("Dismiss", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1855603410$lambda$1(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C111@4642L17:PromoBannerGm4.kt#ahf767");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1855603410, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$PromoBannerGm4Kt.lambda$-1855603410.<anonymous> (PromoBannerGm4.kt:111)");
            }
            TextKt.m4781TextNvy7gAk("Read more", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
