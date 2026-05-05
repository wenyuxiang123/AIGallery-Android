package com.google.ai.edge.gallery.p006ui.common;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelPickerChip.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$ModelPickerChipKt {
    public static final ComposableSingletons$ModelPickerChipKt INSTANCE = new ComposableSingletons$ModelPickerChipKt();

    /* JADX INFO: renamed from: lambda$-474284482, reason: not valid java name */
    private static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f856lambda$474284482 = ComposableLambdaKt.composableLambdaInstance(-474284482, false, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.ComposableSingletons$ModelPickerChipKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ModelPickerChipKt.lambda__474284482$lambda$0((AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-474284482$app_debug, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m10841getLambda$474284482$app_debug() {
        return f856lambda$474284482;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__474284482$lambda$0(AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C125@5531L11,122@5375L199:ModelPickerChip.kt#t7sjiu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-474284482, $changed, -1, "com.google.ai.edge.gallery.ui.common.ComposableSingletons$ModelPickerChipKt.lambda$-474284482.<anonymous> (ModelPickerChip.kt:122)");
        }
        ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(AlphaKt.alpha(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), 0.5f), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), C1654Dp.m9788constructorimpl(2), 0L, 0, 0.0f, $composer, 390, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
