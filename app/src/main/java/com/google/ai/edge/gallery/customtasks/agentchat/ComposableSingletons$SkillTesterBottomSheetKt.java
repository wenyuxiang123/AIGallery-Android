package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SkillTesterBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$SkillTesterBottomSheetKt {
    public static final ComposableSingletons$SkillTesterBottomSheetKt INSTANCE = new ComposableSingletons$SkillTesterBottomSheetKt();

    /* JADX INFO: renamed from: lambda$-1825637562, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f831lambda$1825637562 = ComposableLambdaKt.composableLambdaInstance(-1825637562, false, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$SkillTesterBottomSheetKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SkillTesterBottomSheetKt.lambda__1825637562$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$45234813 = ComposableLambdaKt.composableLambdaInstance(45234813, false, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$SkillTesterBottomSheetKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SkillTesterBottomSheetKt.lambda_45234813$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1825637562$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10468getLambda$1825637562$app_debug() {
        return f831lambda$1825637562;
    }

    public final Function2<Composer, Integer, Unit> getLambda$45234813$app_debug() {
        return lambda$45234813;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1825637562$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C92@4057L18:SkillTesterBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825637562, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$SkillTesterBottomSheetKt.lambda$-1825637562.<anonymous> (SkillTesterBottomSheet.kt:92)");
            }
            TextKt.m4781TextNvy7gAk("Input Data", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_45234813$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C100@4304L19:SkillTesterBottomSheet.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(45234813, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$SkillTesterBottomSheetKt.lambda$45234813.<anonymous> (SkillTesterBottomSheet.kt:100)");
            }
            TextKt.m4781TextNvy7gAk("Custom Data", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
