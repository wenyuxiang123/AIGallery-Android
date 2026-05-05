package com.google.ai.edge.gallery.p006ui.common.modelitem;

import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Model;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConfirmDeleteModelDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m921d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m922d2 = {"ConfirmDeleteModelDialog", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "onConfirm", "Lkotlin/Function0;", "onDismiss", "(Lcom/google/ai/edge/gallery/data/Model;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ConfirmDeleteModelDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmDeleteModelDialog$lambda$3(Model model, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ConfirmDeleteModelDialog(model, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ConfirmDeleteModelDialog(final Model model, final Function0<Unit> onConfirm, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(424640667);
        ComposerKt.sourceInformation($composer3, "C(ConfirmDeleteModelDialog)36@1441L69,37@1532L77,33@1320L99,30@1180L434:ConfirmDeleteModelDialog.kt#13a6jo");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(model) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onConfirm) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(424640667, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ConfirmDeleteModelDialog (ConfirmDeleteModelDialog.kt:29)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(648788819, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ConfirmDeleteModelDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConfirmDeleteModelDialogKt.ConfirmDeleteModelDialog$lambda$0(onConfirm, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(1219060625, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ConfirmDeleteModelDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConfirmDeleteModelDialogKt.ConfirmDeleteModelDialog$lambda$1(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$ConfirmDeleteModelDialogKt.INSTANCE.getLambda$1789332431$app_debug(), ComposableLambdaKt.rememberComposableLambda(2074468334, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ConfirmDeleteModelDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConfirmDeleteModelDialogKt.ConfirmDeleteModelDialog$lambda$2(model, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty2 >> 6) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.ConfirmDeleteModelDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConfirmDeleteModelDialogKt.ConfirmDeleteModelDialog$lambda$3(model, onConfirm, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmDeleteModelDialog$lambda$2(Model $model, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C34@1333L60,34@1328L85:ConfirmDeleteModelDialog.kt#13a6jo");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2074468334, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ConfirmDeleteModelDialog.<anonymous> (ConfirmDeleteModelDialog.kt:34)");
            }
            String str = String.format(StringResources_androidKt.stringResource(C2421R.string.confirm_delete_model_dialog_content, $composer, 0), Arrays.copyOf(new Object[]{$model.getName()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            TextKt.m4781TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmDeleteModelDialog$lambda$0(Function0 $onConfirm, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C36@1443L65:ConfirmDeleteModelDialog.kt#13a6jo");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(648788819, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ConfirmDeleteModelDialog.<anonymous> (ConfirmDeleteModelDialog.kt:36)");
            }
            ButtonKt.Button($onConfirm, null, false, null, null, null, null, null, null, ComposableSingletons$ConfirmDeleteModelDialogKt.INSTANCE.m11008getLambda$817484445$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmDeleteModelDialog$lambda$1(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C37@1534L73:ConfirmDeleteModelDialog.kt#13a6jo");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1219060625, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.ConfirmDeleteModelDialog.<anonymous> (ConfirmDeleteModelDialog.kt:37)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ConfirmDeleteModelDialogKt.INSTANCE.getLambda$188531636$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
