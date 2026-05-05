package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.outlined.CancelKt;
import androidx.compose.material.icons.rounded.SearchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LogsViewer.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$LogsViewerKt {
    public static final ComposableSingletons$LogsViewerKt INSTANCE = new ComposableSingletons$LogsViewerKt();

    /* JADX INFO: renamed from: lambda$-1475180432, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f861lambda$1475180432 = ComposableLambdaKt.composableLambdaInstance(-1475180432, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$LogsViewerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$LogsViewerKt.lambda__1475180432$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2025475607 = ComposableLambdaKt.composableLambdaInstance(2025475607, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$LogsViewerKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$LogsViewerKt.lambda_2025475607$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-106189480, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f860lambda$106189480 = ComposableLambdaKt.composableLambdaInstance(-106189480, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$LogsViewerKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$LogsViewerKt.lambda__106189480$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$314480914 = ComposableLambdaKt.composableLambdaInstance(314480914, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$LogsViewerKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$LogsViewerKt.lambda_314480914$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-2000940542, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f862lambda$2000940542 = ComposableLambdaKt.composableLambdaInstance(-2000940542, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$LogsViewerKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$LogsViewerKt.lambda__2000940542$lambda$4((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-106189480$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10940getLambda$106189480$app_debug() {
        return f860lambda$106189480;
    }

    /* JADX INFO: renamed from: getLambda$-1475180432$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10941getLambda$1475180432$app_debug() {
        return f861lambda$1475180432;
    }

    /* JADX INFO: renamed from: getLambda$-2000940542$app_debug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m10942getLambda$2000940542$app_debug() {
        return f862lambda$2000940542;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2025475607$app_debug() {
        return lambda$2025475607;
    }

    public final Function2<Composer, Integer, Unit> getLambda$314480914$app_debug() {
        return lambda$314480914;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1475180432$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C96@4008L61:LogsViewer.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1475180432, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$LogsViewerKt.lambda$-1475180432.<anonymous> (LogsViewer.kt:96)");
            }
            IconKt.m4075Iconww6aTOc(CloseKt.getClose(Icons.Filled.INSTANCE), "Close viewer", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2025475607$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C105@4286L66,105@4281L72:LogsViewer.kt#ouynps");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025475607, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$LogsViewerKt.lambda$2025475607.<anonymous> (LogsViewer.kt:105)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.logs_viewer_filter_text_input_placeholder, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__106189480$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C113@4612L53:LogsViewer.kt#ouynps");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-106189480, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$LogsViewerKt.lambda$-106189480.<anonymous> (LogsViewer.kt:113)");
            }
            IconKt.m4075Iconww6aTOc(SearchKt.getSearch(Icons.Rounded.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_314480914$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C117@4805L64:LogsViewer.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(314480914, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$LogsViewerKt.lambda$314480914.<anonymous> (LogsViewer.kt:117)");
            }
            IconKt.m4075Iconww6aTOc(CancelKt.getCancel(Icons.Outlined.INSTANCE), "Clear filter", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__2000940542$lambda$4(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C170@6571L53,172@6712L11,169@6551L204:LogsViewer.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2000940542, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$LogsViewerKt.lambda$-2000940542.<anonymous> (LogsViewer.kt:169)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.logs_viewer_no_matching_logs, $composer, 0), PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 48, 0, 262136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
