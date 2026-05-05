package com.google.ai.edge.gallery.ui.common;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.CloseKt;
import androidx.compose.material.icons.rounded.ErrorKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
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

/* JADX INFO: compiled from: DownloadAndTryButton.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$DownloadAndTryButtonKt {
    public static final ComposableSingletons$DownloadAndTryButtonKt INSTANCE = new ComposableSingletons$DownloadAndTryButtonKt();

    /* JADX INFO: renamed from: lambda$-543375898, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f850lambda$543375898 = ComposableLambdaKt.composableLambdaInstance(-543375898, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DownloadAndTryButtonKt.lambda__543375898$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$645975206 = ComposableLambdaKt.composableLambdaInstance(645975206, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DownloadAndTryButtonKt.lambda_645975206$lambda$1((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1990123978 = ComposableLambdaKt.composableLambdaInstance(1990123978, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DownloadAndTryButtonKt.lambda_1990123978$lambda$2((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$27800196 = ComposableLambdaKt.composableLambdaInstance(27800196, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DownloadAndTryButtonKt.lambda_27800196$lambda$3((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1907326819 = ComposableLambdaKt.composableLambdaInstance(1907326819, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DownloadAndTryButtonKt.lambda_1907326819$lambda$4((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-508113854, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f849lambda$508113854 = ComposableLambdaKt.composableLambdaInstance(-508113854, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DownloadAndTryButtonKt.lambda__508113854$lambda$5((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-508113854$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10831getLambda$508113854$app_debug() {
        return f849lambda$508113854;
    }

    /* JADX INFO: renamed from: getLambda$-543375898$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10832getLambda$543375898$app_debug() {
        return f850lambda$543375898;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1907326819$app_debug() {
        return lambda$1907326819;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1990123978$app_debug() {
        return lambda$1990123978;
    }

    public final Function2<Composer, Integer, Unit> getLambda$27800196$app_debug() {
        return lambda$27800196;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$645975206$app_debug() {
        return lambda$645975206;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__543375898$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C492@19961L11,489@19849L146:DownloadAndTryButton.kt#t7sjiu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-543375898, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt.lambda$-543375898.<anonymous> (DownloadAndTryButton.kt:489)");
            }
            IconKt.m4075Iconww6aTOc(CloseKt.getClose(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_645975206$lambda$1(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C541@21847L27:DownloadAndTryButton.kt#t7sjiu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(645975206, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt.lambda$645975206.<anonymous> (DownloadAndTryButton.kt:541)");
            }
            TextKt.m4781TextNvy7gAk("Open user agreement", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_27800196$lambda$3(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C552@22037L33,553@22103L11,550@21969L162:DownloadAndTryButton.kt#t7sjiu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(27800196, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt.lambda$27800196.<anonymous> (DownloadAndTryButton.kt:550)");
            }
            IconKt.m4075Iconww6aTOc(ErrorKt.getError(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_error, $composer, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1907326819$lambda$4(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C556@22157L29:DownloadAndTryButton.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1907326819, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt.lambda$1907326819.<anonymous> (DownloadAndTryButton.kt:556)");
            }
            TextKt.m4781TextNvy7gAk("Unknown network error", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__508113854$lambda$5(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C557@22205L46:DownloadAndTryButton.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-508113854, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt.lambda$-508113854.<anonymous> (DownloadAndTryButton.kt:557)");
            }
            TextKt.m4781TextNvy7gAk("Please check your internet connection.", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1990123978$lambda$2(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C559@22385L13:DownloadAndTryButton.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1990123978, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$DownloadAndTryButtonKt.lambda$1990123978.<anonymous> (DownloadAndTryButton.kt:559)");
            }
            TextKt.m4781TextNvy7gAk("Close", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
