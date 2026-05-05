package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.DeleteKt;
import androidx.compose.material.icons.rounded.DeleteSweepKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
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

/* JADX INFO: compiled from: TextInputHistorySheet.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$TextInputHistorySheetKt {
    public static final ComposableSingletons$TextInputHistorySheetKt INSTANCE = new ComposableSingletons$TextInputHistorySheetKt();
    private static Function2<Composer, Integer, Unit> lambda$1787619060 = ComposableLambdaKt.composableLambdaInstance(1787619060, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TextInputHistorySheetKt.lambda_1787619060$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2093159394 = ComposableLambdaKt.composableLambdaInstance(2093159394, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TextInputHistorySheetKt.lambda_2093159394$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1243409653, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f874lambda$1243409653 = ComposableLambdaKt.composableLambdaInstance(-1243409653, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$TextInputHistorySheetKt.lambda__1243409653$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-500037670, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f876lambda$500037670 = ComposableLambdaKt.composableLambdaInstance(-500037670, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$TextInputHistorySheetKt.lambda__500037670$lambda$3((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1516786145, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f875lambda$1516786145 = ComposableLambdaKt.composableLambdaInstance(-1516786145, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TextInputHistorySheetKt.lambda__1516786145$lambda$4((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$954993888 = ComposableLambdaKt.composableLambdaInstance(954993888, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TextInputHistorySheetKt.lambda_954993888$lambda$5((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1243409653$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10962getLambda$1243409653$app_debug() {
        return f874lambda$1243409653;
    }

    /* JADX INFO: renamed from: getLambda$-1516786145$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10963getLambda$1516786145$app_debug() {
        return f875lambda$1516786145;
    }

    /* JADX INFO: renamed from: getLambda$-500037670$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10964getLambda$500037670$app_debug() {
        return f876lambda$500037670;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1787619060$app_debug() {
        return lambda$1787619060;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2093159394$app_debug() {
        return lambda$2093159394;
    }

    public final Function2<Composer, Integer, Unit> getLambda$954993888$app_debug() {
        return lambda$954993888;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1787619060$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C133@4580L52,131@4506L137:TextInputHistorySheet.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1787619060, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt.lambda$1787619060.<anonymous> (TextInputHistorySheet.kt:131)");
            }
            IconKt.m4075Iconww6aTOc(DeleteSweepKt.getDeleteSweep(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_clear_input_history_icon, $composer, 0), (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2093159394$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C167@5790L59,165@5713L151:TextInputHistorySheet.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2093159394, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt.lambda$2093159394.<anonymous> (TextInputHistorySheet.kt:165)");
            }
            IconKt.m4075Iconww6aTOc(DeleteKt.getDelete(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_delete_input_history_entry_icon, $composer, 0), (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1516786145$lambda$4(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C178@6034L22:TextInputHistorySheet.kt#ouynps");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1516786145, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt.lambda$-1516786145.<anonymous> (TextInputHistorySheet.kt:178)");
            }
            TextKt.m4781TextNvy7gAk("Clear history?", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_954993888$lambda$5(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C179@6075L81:TextInputHistorySheet.kt#ouynps");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(954993888, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt.lambda$954993888.<anonymous> (TextInputHistorySheet.kt:179)");
            }
            TextKt.m4781TextNvy7gAk("Are you sure you want to clear the history? This action cannot be undone.", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1243409653$lambda$2(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C187@6343L27,187@6338L33:TextInputHistorySheet.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1243409653, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt.lambda$-1243409653.<anonymous> (TextInputHistorySheet.kt:187)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.f270ok, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__500037670$lambda$3(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C192@6498L31,192@6493L37:TextInputHistorySheet.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-500037670, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$TextInputHistorySheetKt.lambda$-500037670.<anonymous> (TextInputHistorySheet.kt:192)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.cancel, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
