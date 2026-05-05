package com.google.ai.edge.gallery.customtasks.agentchat;

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

/* JADX INFO: compiled from: SecretEditorDialog.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$SecretEditorDialogKt {
    public static final ComposableSingletons$SecretEditorDialogKt INSTANCE = new ComposableSingletons$SecretEditorDialogKt();

    /* JADX INFO: renamed from: lambda$-1909160355, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f824lambda$1909160355 = ComposableLambdaKt.composableLambdaInstance(-1909160355, false, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$SecretEditorDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SecretEditorDialogKt.lambda__1909160355$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-22649876, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f825lambda$22649876 = ComposableLambdaKt.composableLambdaInstance(-22649876, false, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$SecretEditorDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$SecretEditorDialogKt.lambda__22649876$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1909160355$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10458getLambda$1909160355$app_debug() {
        return f824lambda$1909160355;
    }

    /* JADX INFO: renamed from: getLambda$-22649876$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10459getLambda$22649876$app_debug() {
        return f825lambda$22649876;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1909160355$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C74@2916L29,74@2911L35:SecretEditorDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1909160355, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$SecretEditorDialogKt.lambda$-1909160355.<anonymous> (SecretEditorDialog.kt:74)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.done, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__22649876$lambda$1(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C75@3013L31,75@3008L37:SecretEditorDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-22649876, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$SecretEditorDialogKt.lambda$-22649876.<anonymous> (SecretEditorDialog.kt:75)");
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
