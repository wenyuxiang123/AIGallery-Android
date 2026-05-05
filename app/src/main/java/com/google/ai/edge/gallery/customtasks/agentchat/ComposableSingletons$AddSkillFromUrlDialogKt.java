package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.OutlinedTextFieldDefaults;
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

/* JADX INFO: compiled from: AddSkillFromUrlDialog.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$AddSkillFromUrlDialogKt {
    public static final ComposableSingletons$AddSkillFromUrlDialogKt INSTANCE = new ComposableSingletons$AddSkillFromUrlDialogKt();
    private static Function2<Composer, Integer, Unit> lambda$1197534536 = ComposableLambdaKt.composableLambdaInstance(1197534536, false, new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillFromUrlDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AddSkillFromUrlDialogKt.lambda_1197534536$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$728746300 = ComposableLambdaKt.composableLambdaInstance(728746300, false, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillFromUrlDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AddSkillFromUrlDialogKt.lambda_728746300$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1018569530 = ComposableLambdaKt.composableLambdaInstance(1018569530, false, new Function3() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillFromUrlDialogKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$AddSkillFromUrlDialogKt.lambda_1018569530$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1018569530$app_debug() {
        return lambda$1018569530;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1197534536$app_debug() {
        return lambda$1197534536;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$728746300$app_debug() {
        return lambda$728746300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1197534536$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C142@5782L39,143@5878L8,144@5942L5,139@5658L452:AddSkillFromUrlDialog.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1197534536, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillFromUrlDialogKt.lambda$1197534536.<anonymous> (AddSkillFromUrlDialog.kt:139)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -220540753, "CC(remember):AddSkillFromUrlDialog.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = InteractionSourceKt.MutableInteractionSource();
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            outlinedTextFieldDefaults.m4318Container4EFweAY(true, false, (MutableInteractionSource) it$iv, null, OutlinedTextFieldDefaults.INSTANCE.colors($composer, 6), OutlinedTextFieldDefaults.INSTANCE.getShape($composer, 6), OutlinedTextFieldDefaults.INSTANCE.m4322getFocusedBorderThicknessD9Ej5fM(), OutlinedTextFieldDefaults.INSTANCE.m4325getUnfocusedBorderThicknessD9Ej5fM(), $composer, 100663734, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_728746300$lambda$2(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C177@7074L31,177@7069L37:AddSkillFromUrlDialog.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(728746300, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillFromUrlDialogKt.lambda$728746300.<anonymous> (AddSkillFromUrlDialog.kt:177)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.cancel, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1018569530$lambda$3(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C190@7491L28,190@7486L34:AddSkillFromUrlDialog.kt#41d64j");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1018569530, $changed, -1, "com.google.ai.edge.gallery.customtasks.agentchat.ComposableSingletons$AddSkillFromUrlDialogKt.lambda$1018569530.<anonymous> (AddSkillFromUrlDialog.kt:190)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.add, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
