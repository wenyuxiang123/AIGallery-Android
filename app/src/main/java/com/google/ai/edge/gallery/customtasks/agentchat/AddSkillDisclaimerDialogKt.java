package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m922d2 = {"AddSkillDisclaimerDialog", "", "onDismiss", "Lkotlin/Function0;", "onConfirm", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class AddSkillDisclaimerDialogKt {
    
    public static final Unit AddSkillDisclaimerDialog$lambda$2(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AddSkillDisclaimerDialog(function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AddSkillDisclaimerDialog(final Function0<Unit> onDismiss, final Function0<Unit> onConfirm, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer $composer3 = $composer.startRestartGroup(2004011333);
        ComposerKt.sourceInformation($composer3, "C(AddSkillDisclaimerDialog)P(1)32@1257L100,35@1379L91,28@1045L430:AddSkillDisclaimerDialog.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onConfirm) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2004011333, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillDisclaimerDialog (AddSkillDisclaimerDialog.kt:27)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-641130499, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillDisclaimerDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddSkillDisclaimerDialogKt.AddSkillDisclaimerDialog$lambda$0(onConfirm, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(1458607931, true, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillDisclaimerDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddSkillDisclaimerDialogKt.AddSkillDisclaimerDialog$lambda$1(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$AddSkillDisclaimerDialogKt.INSTANCE.m10444getLambda$736620935$app_debug(), ComposableSingletons$AddSkillDisclaimerDialogKt.INSTANCE.getLambda$313248280$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, ($dirty2 & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AddSkillDisclaimerDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddSkillDisclaimerDialogKt.AddSkillDisclaimerDialog$lambda$2(onDismiss, onConfirm, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    
    public static final Unit AddSkillDisclaimerDialog$lambda$0(Function0 $onConfirm, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C33@1265L86:AddSkillDisclaimerDialog.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-641130499, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillDisclaimerDialog.<anonymous> (AddSkillDisclaimerDialog.kt:33)");
            }
            ButtonKt.Button($onConfirm, null, false, null, null, null, null, null, null, ComposableSingletons$AddSkillDisclaimerDialogKt.INSTANCE.m10443getLambda$384886259$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit AddSkillDisclaimerDialog$lambda$1(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C36@1387L77:AddSkillDisclaimerDialog.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1458607931, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AddSkillDisclaimerDialog.<anonymous> (AddSkillDisclaimerDialog.kt:36)");
            }
            ButtonKt.OutlinedButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$AddSkillDisclaimerDialogKt.INSTANCE.getLambda$1394155913$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
