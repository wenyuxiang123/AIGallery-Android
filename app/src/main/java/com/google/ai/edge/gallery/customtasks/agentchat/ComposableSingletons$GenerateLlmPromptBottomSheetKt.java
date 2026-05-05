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

/* JADX INFO: compiled from: GenerateLlmPromptBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$GenerateLlmPromptBottomSheetKt {
    public static final ComposableSingletons$GenerateLlmPromptBottomSheetKt INSTANCE = new ComposableSingletons$GenerateLlmPromptBottomSheetKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1600954843 = ComposableLambdaKt.composableLambdaInstance(1600954843, false, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$GenerateLlmPromptBottomSheetKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GenerateLlmPromptBottomSheetKt.lambda_1600954843$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1600954843$app_debug() {
        return lambda$1600954843;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1600954843$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C171@7622L42,171@7617L48:GenerateLlmPromptBottomSheet.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600954843, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$GenerateLlmPromptBottomSheetKt.lambda$1600954843.<anonymous> (GenerateLlmPromptBottomSheet.kt:171)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.generate_and_copy, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
