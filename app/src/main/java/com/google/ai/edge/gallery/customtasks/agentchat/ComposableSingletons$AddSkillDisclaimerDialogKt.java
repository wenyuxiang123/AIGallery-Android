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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AddSkillDisclaimerDialog.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$AddSkillDisclaimerDialogKt {
    public static final ComposableSingletons$AddSkillDisclaimerDialogKt INSTANCE = new ComposableSingletons$AddSkillDisclaimerDialogKt();

    /* JADX INFO: renamed from: lambda$-384886259, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f815lambda$384886259 = ComposableLambdaKt.composableLambdaInstance(-384886259, false, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillDisclaimerDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AddSkillDisclaimerDialogKt.lambda__384886259$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1394155913 = ComposableLambdaKt.composableLambdaInstance(1394155913, false, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillDisclaimerDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AddSkillDisclaimerDialogKt.lambda_1394155913$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-736620935, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f816lambda$736620935 = ComposableLambdaKt.composableLambdaInstance(-736620935, false, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillDisclaimerDialogKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AddSkillDisclaimerDialogKt.lambda__736620935$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$313248280 = ComposableLambdaKt.composableLambdaInstance(313248280, false, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillDisclaimerDialogKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AddSkillDisclaimerDialogKt.lambda_313248280$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-384886259$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10443getLambda$384886259$app_debug() {
        return f815lambda$384886259;
    }

    /* JADX INFO: renamed from: getLambda$-736620935$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10444getLambda$736620935$app_debug() {
        return f816lambda$736620935;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1394155913$app_debug() {
        return lambda$1394155913;
    }

    public final Function2<Composer, Integer, Unit> getLambda$313248280$app_debug() {
        return lambda$313248280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__736620935$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C30@1111L48,30@1106L54:AddSkillDisclaimerDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-736620935, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillDisclaimerDialogKt.lambda$-736620935.<anonymous> (AddSkillDisclaimerDialog.kt:30)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.disclaimer_dialog_title, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_313248280$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C31@1182L50,31@1177L56:AddSkillDisclaimerDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(313248280, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillDisclaimerDialogKt.lambda$313248280.<anonymous> (AddSkillDisclaimerDialog.kt:31)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.disclaimer_dialog_content, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__384886259$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C33@1300L48,33@1295L54:AddSkillDisclaimerDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-384886259, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillDisclaimerDialogKt.lambda$-384886259.<anonymous> (AddSkillDisclaimerDialog.kt:33)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.disclaimer_dialog_agree, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1394155913$lambda$1(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C36@1430L31,36@1425L37:AddSkillDisclaimerDialog.kt#41d64j");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1394155913, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillDisclaimerDialogKt.lambda$1394155913.<anonymous> (AddSkillDisclaimerDialog.kt:36)");
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
