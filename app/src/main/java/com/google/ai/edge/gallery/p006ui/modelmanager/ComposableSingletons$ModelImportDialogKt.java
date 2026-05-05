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

/* JADX INFO: compiled from: ModelImportDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ModelImportDialogKt {
    public static final ComposableSingletons$ModelImportDialogKt INSTANCE = new ComposableSingletons$ModelImportDialogKt();

    /* JADX INFO: renamed from: lambda$-859617590, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f907lambda$859617590 = ComposableLambdaKt.composableLambdaInstance(-859617590, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$ModelImportDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ModelImportDialogKt.lambda__859617590$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1831759043, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f906lambda$1831759043 = ComposableLambdaKt.composableLambdaInstance(-1831759043, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$ModelImportDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ModelImportDialogKt.lambda__1831759043$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1186641991 = ComposableLambdaKt.composableLambdaInstance(1186641991, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$ModelImportDialogKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ModelImportDialogKt.lambda_1186641991$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1831759043$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11153getLambda$1831759043$app_debug() {
        return f906lambda$1831759043;
    }

    /* JADX INFO: renamed from: getLambda$-859617590$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11154getLambda$859617590$app_debug() {
        return f907lambda$859617590;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1186641991$app_debug() {
        return lambda$1186641991;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__859617590$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C214@8175L14:ModelImportDialog.kt#ahf767");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-859617590, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$ModelImportDialogKt.lambda$-859617590.<anonymous> (ModelImportDialog.kt:214)");
            }
            TextKt.m4781TextNvy7gAk("Cancel", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1831759043$lambda$1(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C302@11780L14:ModelImportDialog.kt#ahf767");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1831759043, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$ModelImportDialogKt.lambda$-1831759043.<anonymous> (ModelImportDialog.kt:302)");
            }
            TextKt.m4781TextNvy7gAk("Import", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1186641991$lambda$2(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C389@14459L13:ModelImportDialog.kt#ahf767");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1186641991, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$ModelImportDialogKt.lambda$1186641991.<anonymous> (ModelImportDialog.kt:389)");
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
