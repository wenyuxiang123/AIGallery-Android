package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.ArticleKt;
import androidx.compose.material3.AssistChipDefaults;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBodyCollapsableProgressPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$MessageBodyCollapsableProgressPanelKt {
    public static final ComposableSingletons$MessageBodyCollapsableProgressPanelKt INSTANCE = new ComposableSingletons$MessageBodyCollapsableProgressPanelKt();

    /* JADX INFO: renamed from: lambda$-1145372345, reason: not valid java name */
    private static Function4<AnimatedContentScope, String, Composer, Integer, Unit> f863lambda$1145372345 = ComposableLambdaKt.composableLambdaInstance(-1145372345, false, new Function4() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ComposableSingletons$MessageBodyCollapsableProgressPanelKt.lambda__1145372345$lambda$0((AnimatedContentScope) obj, (String) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-633289212, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f864lambda$633289212 = ComposableLambdaKt.composableLambdaInstance(-633289212, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageBodyCollapsableProgressPanelKt.lambda__633289212$lambda$1((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-846845791, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f865lambda$846845791 = ComposableLambdaKt.composableLambdaInstance(-846845791, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MessageBodyCollapsableProgressPanelKt.lambda__846845791$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1145372345$app_debug, reason: not valid java name */
    public final Function4<AnimatedContentScope, String, Composer, Integer, Unit> m10943getLambda$1145372345$app_debug() {
        return f863lambda$1145372345;
    }

    /* JADX INFO: renamed from: getLambda$-633289212$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10944getLambda$633289212$app_debug() {
        return f864lambda$633289212;
    }

    /* JADX INFO: renamed from: getLambda$-846845791$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10945getLambda$846845791$app_debug() {
        return f865lambda$846845791;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1145372345$lambda$0(AnimatedContentScope AnimatedContent, String curTitle, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(curTitle, "curTitle");
        ComposerKt.sourceInformation($composer, "C114@4719L10,114@4675L66:MessageBodyCollapsableProgressPanel.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1145372345, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyCollapsableProgressPanelKt.lambda$-1145372345.<anonymous> (MessageBodyCollapsableProgressPanel.kt:114)");
        }
        TextKt.m4781TextNvy7gAk(curTitle, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge(), $composer, ($changed >> 3) & 14, 0, 131070);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__633289212$lambda$1(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C194@7432L42,194@7427L48:MessageBodyCollapsableProgressPanel.kt#ouynps");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-633289212, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyCollapsableProgressPanelKt.lambda$-633289212.<anonymous> (MessageBodyCollapsableProgressPanel.kt:194)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.view_console_logs, $composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__846845791$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C200@7732L11,196@7525L254:MessageBodyCollapsableProgressPanel.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-846845791, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$MessageBodyCollapsableProgressPanelKt.lambda$-846845791.<anonymous> (MessageBodyCollapsableProgressPanel.kt:196)");
            }
            IconKt.m4075Iconww6aTOc(ArticleKt.getArticle(Icons.AutoMirrored.Outlined.INSTANCE), (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, AssistChipDefaults.INSTANCE.m3559getIconSizeD9Ej5fM()), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
