package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.geometry.CornerRadius;
import androidx.compose.p000ui.geometry.RoundRect;
import androidx.compose.p000ui.graphics.AndroidPath_androidKt;
import androidx.compose.p000ui.graphics.Outline;
import androidx.compose.p000ui.graphics.Path;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBubbleShape.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/MessageBubbleShape;", "Landroidx/compose/ui/graphics/Shape;", "radius", "Landroidx/compose/ui/unit/Dp;", "hardCornerAtLeftOrRight", "", "<init>", "(FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MessageBubbleShape implements Shape {
    public static final int $stable = 0;
    private final boolean hardCornerAtLeftOrRight;
    private final float radius;

    public /* synthetic */ MessageBubbleShape(float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, z);
    }

    private MessageBubbleShape(float radius, boolean hardCornerAtLeftOrRight) {
        this.radius = radius;
        this.hardCornerAtLeftOrRight = hardCornerAtLeftOrRight;
    }

    public /* synthetic */ MessageBubbleShape(float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? false : z, null);
    }

    @Override // androidx.compose.p000ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public Outline mo1425createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        long jM6624constructorimpl;
        long jM6624constructorimpl2;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float radiusPx = density.mo1524toPx0680j_4(this.radius);
        Path $this$createOutline_Pq9zytI_u24lambda_u241 = AndroidPath_androidKt.Path();
        int bits$iv$iv$iv = (int) (size >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (size & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (this.hardCornerAtLeftOrRight) {
            long v1$iv$iv = Float.floatToRawIntBits(0.0f);
            long v2$iv$iv = Float.floatToRawIntBits(0.0f);
            jM6624constructorimpl = CornerRadius.m6624constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        } else {
            long v1$iv$iv2 = Float.floatToRawIntBits(radiusPx);
            long v2$iv$iv2 = Float.floatToRawIntBits(radiusPx);
            jM6624constructorimpl = CornerRadius.m6624constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L));
        }
        if (this.hardCornerAtLeftOrRight) {
            long v1$iv$iv3 = Float.floatToRawIntBits(radiusPx);
            long v2$iv$iv3 = Float.floatToRawIntBits(radiusPx);
            jM6624constructorimpl2 = CornerRadius.m6624constructorimpl((v1$iv$iv3 << 32) | (v2$iv$iv3 & 4294967295L));
        } else {
            long v1$iv$iv4 = Float.floatToRawIntBits(0.0f);
            long v2$iv$iv4 = Float.floatToRawIntBits(0.0f);
            jM6624constructorimpl2 = CornerRadius.m6624constructorimpl((v1$iv$iv4 << 32) | (v2$iv$iv4 & 4294967295L));
        }
        long v1$iv$iv5 = Float.floatToRawIntBits(radiusPx);
        long v2$iv$iv5 = Float.floatToRawIntBits(radiusPx);
        long jM6624constructorimpl3 = CornerRadius.m6624constructorimpl((v1$iv$iv5 << 32) | (v2$iv$iv5 & 4294967295L));
        long v1$iv$iv6 = Float.floatToRawIntBits(radiusPx);
        long v2$iv$iv6 = Float.floatToRawIntBits(radiusPx);
        Path.addRoundRect$default($this$createOutline_Pq9zytI_u24lambda_u241, new RoundRect(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, jM6624constructorimpl, jM6624constructorimpl2, CornerRadius.m6624constructorimpl((v1$iv$iv6 << 32) | (v2$iv$iv6 & 4294967295L)), jM6624constructorimpl3, null), null, 2, null);
        return new Outline.Generic($this$createOutline_Pq9zytI_u24lambda_u241);
    }
}
