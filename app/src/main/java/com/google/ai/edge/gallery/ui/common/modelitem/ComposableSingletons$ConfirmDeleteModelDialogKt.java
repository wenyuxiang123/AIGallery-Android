package com.google.ai.edge.gallery.ui.common.modelitem;

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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConfirmDeleteModelDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ConfirmDeleteModelDialogKt {
    public static final ComposableSingletons$ConfirmDeleteModelDialogKt INSTANCE = new ComposableSingletons$ConfirmDeleteModelDialogKt();

    /* JADX INFO: renamed from: lambda$-817484445, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f877lambda$817484445 = ComposableLambdaKt.composableLambdaInstance(-817484445, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$ConfirmDeleteModelDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConfirmDeleteModelDialogKt.lambda__817484445$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$188531636 = ComposableLambdaKt.composableLambdaInstance(188531636, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$ConfirmDeleteModelDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConfirmDeleteModelDialogKt.lambda_188531636$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1789332431 = ComposableLambdaKt.composableLambdaInstance(1789332431, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$ConfirmDeleteModelDialogKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConfirmDeleteModelDialogKt.lambda_1789332431$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-817484445$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11008getLambda$817484445$app_debug() {
        return f877lambda$817484445;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1789332431$app_debug() {
        return lambda$1789332431;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$188531636$app_debug() {
        return lambda$188531636;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1789332431$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C32@1246L58,32@1241L64:ConfirmDeleteModelDialog.kt#13a6jo");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1789332431, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$ConfirmDeleteModelDialogKt.lambda$1789332431.<anonymous> (ConfirmDeleteModelDialog.kt:32)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.confirm_delete_model_dialog_title, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__817484445$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C36@1478L27,36@1473L33:ConfirmDeleteModelDialog.kt#13a6jo");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-817484445, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$ConfirmDeleteModelDialogKt.lambda$-817484445.<anonymous> (ConfirmDeleteModelDialog.kt:36)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.f270ok, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_188531636$lambda$1(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C37@1573L31,37@1568L37:ConfirmDeleteModelDialog.kt#13a6jo");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(188531636, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ComposableSingletons$ConfirmDeleteModelDialogKt.lambda$188531636.<anonymous> (ConfirmDeleteModelDialog.kt:37)");
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
