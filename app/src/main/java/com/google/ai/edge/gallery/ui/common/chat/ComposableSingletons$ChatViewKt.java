package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.rounded.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Model;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ChatViewKt {
    public static final ComposableSingletons$ChatViewKt INSTANCE = new ComposableSingletons$ChatViewKt();
    private static Function3<Model, Composer, Integer, Unit> lambda$1811211293 = ComposableLambdaKt.composableLambdaInstance(1811211293, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$ChatViewKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatViewKt.lambda_1811211293$lambda$0((Model) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1913560531, reason: not valid java name */
    private static Function3<Model, Composer, Integer, Unit> f858lambda$1913560531 = ComposableLambdaKt.composableLambdaInstance(-1913560531, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$ChatViewKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatViewKt.lambda__1913560531$lambda$1((Model) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1892102066 = ComposableLambdaKt.composableLambdaInstance(1892102066, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$ChatViewKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatViewKt.lambda_1892102066$lambda$2((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1913560531$app_debug, reason: not valid java name */
    public final Function3<Model, Composer, Integer, Unit> m10935getLambda$1913560531$app_debug() {
        return f858lambda$1913560531;
    }

    public final Function3<Model, Composer, Integer, Unit> getLambda$1811211293$app_debug() {
        return lambda$1811211293;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1892102066$app_debug() {
        return lambda$1892102066;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1811211293$lambda$0(Model it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C:ChatView.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1811211293, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$ChatViewKt.lambda$1811211293.<anonymous> (ChatView.kt:103)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1913560531$lambda$1(Model it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C:ChatView.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1913560531, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$ChatViewKt.lambda$-1913560531.<anonymous> (ChatView.kt:106)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1892102066$lambda$2(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C298@12267L51,299@12355L11,296@12191L207:ChatView.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1892102066, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ComposableSingletons$ChatViewKt.lambda$1892102066.<anonymous> (ChatView.kt:296)");
            }
            IconKt.m4075Iconww6aTOc(CloseKt.getClose(Icons.Rounded.INSTANCE), StringResources_androidKt.stringResource(C2421R.string.cd_close_image_viewer_icon, $composer, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
