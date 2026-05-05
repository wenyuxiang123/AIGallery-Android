package com.google.ai.edge.gallery.ui.modelmanager;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.BlendMode;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.layout.LayoutCoordinates;
import androidx.compose.p000ui.platform.UriHandler;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PromoBannerGm4.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a%\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m922d2 = {"BUTTON_PADDING", "Landroidx/compose/foundation/layout/PaddingValues;", "PromoBannerGm4", "", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "columnHeightDp", "Landroidx/compose/ui/unit/Dp;"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class PromoBannerGm4Kt {
    private static final PaddingValues BUTTON_PADDING = PaddingKt.m1984PaddingValuesa9UjIt4(C1654Dp.m9788constructorimpl(8), C1654Dp.m9788constructorimpl(0), C1654Dp.m9788constructorimpl(8), C1654Dp.m9788constructorimpl(0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromoBannerGm4$lambda$13(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PromoBannerGm4(function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0742  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PromoBannerGm4(final kotlin.jvm.functions.Function0<kotlin.Unit> r127, androidx.compose.p000ui.Modifier r128, androidx.compose.runtime.Composer r129, final int r130, final int r131) {
        /*
    public static final void PromoBannerGm4(final kotlin.jvm.functions.Function0<kotlin.Unit> r127, androidx.compose.p000ui.Modifier r128, androidx.compose.runtime.Composer r129, final int r130, final int r131) {
            // Method dump skipped - placeholder implementation
        }

    private static final float PromoBannerGm4$lambda$1(MutableState<C1654Dp> mutableState) {
        MutableState<C1654Dp> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().m9802unboximpl();
    }

    private static final void PromoBannerGm4$lambda$2(MutableState<C1654Dp> mutableState, float f) {
        mutableState.setValue(C1654Dp.m9786boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromoBannerGm4$lambda$12$lambda$4$lambda$3(Brush $iconBrush, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        DrawScope.m7489drawRectAsUm42w$default(drawWithContent, $iconBrush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6853getSrcIn0nO6VwU(), 62, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromoBannerGm4$lambda$12$lambda$7$lambda$6(Density $density, MutableState $columnHeightDp$delegate, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        PromoBannerGm4$lambda$2($columnHeightDp$delegate, $density.mo1521toDpu2uoSUM((int) (4294967295L & coordinates.mo8374getSizeYbymL2g())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromoBannerGm4$lambda$12$lambda$11$lambda$10$lambda$9$lambda$8(UriHandler $uriHandler) {
        $uriHandler.openUri("https://ai.google.dev/gemma");
        return Unit.INSTANCE;
    }
}
