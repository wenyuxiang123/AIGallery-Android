package com.google.ai.edge.gallery.ui.common;

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

/* JADX INFO: compiled from: ConfigDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ConfigDialogKt {
    public static final ComposableSingletons$ConfigDialogKt INSTANCE = new ComposableSingletons$ConfigDialogKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$890106454 = ComposableLambdaKt.composableLambdaInstance(890106454, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$ConfigDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConfigDialogKt.lambda_890106454$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1837137669 = ComposableLambdaKt.composableLambdaInstance(1837137669, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$ConfigDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConfigDialogKt.lambda_1837137669$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1837137669$app_debug() {
        return lambda$1837137669;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$890106454$app_debug() {
        return lambda$890106454;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_890106454$lambda$0(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C235@9408L40,235@9403L46:ConfigDialog.kt#t7sjiu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(890106454, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$ConfigDialogKt.lambda$890106454.<anonymous> (ConfigDialog.kt:235)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.restore_default, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1837137669$lambda$1(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C246@9783L14:ConfigDialog.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1837137669, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$ConfigDialogKt.lambda$1837137669.<anonymous> (ConfigDialog.kt:246)");
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
}
