package com.google.ai.edge.gallery.p006ui.modelmanager;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.p006ui.theme.TypeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ModelList.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ModelListKt {
    public static final ComposableSingletons$ModelListKt INSTANCE = new ComposableSingletons$ModelListKt();

    /* JADX INFO: renamed from: lambda$-1651324273, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f908lambda$1651324273 = ComposableLambdaKt.composableLambdaInstance(-1651324273, false, new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$ModelListKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ModelListKt.lambda__1651324273$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1651324273$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11156getLambda$1651324273$app_debug() {
        return f908lambda$1651324273;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1651324273$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C239@8561L54,238@8530L266:ModelList.kt#ahf767");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651324273, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.ComposableSingletons$ModelListKt.lambda$-1651324273.<anonymous> (ModelList.kt:238)");
            }
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.model_list_experimental_label, $composer, 0), PaddingKt.m1989paddingVpY3zN4(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(12), C1654Dp.m9788constructorimpl(4)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m9205copyp1EtxEg$default(TypeKt.getBodyLargeNarrow(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), $composer, 48, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
