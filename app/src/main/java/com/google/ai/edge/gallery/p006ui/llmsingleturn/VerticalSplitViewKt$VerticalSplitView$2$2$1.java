package com.google.ai.edge.gallery.p006ui.llmsingleturn;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputChange;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VerticalSplitView.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
final class VerticalSplitViewKt$VerticalSplitView$2$2$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableState<C1654Dp> $columnHeightDp$delegate;
    final /* synthetic */ MutableFloatState $columnHeightPx$delegate;
    final /* synthetic */ Density $localDensity;
    final /* synthetic */ float $minBottomHeight;
    final /* synthetic */ float $minTopHeight;
    final /* synthetic */ MutableFloatState $splitRatio$delegate;

    VerticalSplitViewKt$VerticalSplitView$2$2$1(Density density, float f, float f2, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableState<C1654Dp> mutableState) {
        this.$localDensity = density;
        this.$minTopHeight = f;
        this.$minBottomHeight = f2;
        this.$columnHeightPx$delegate = mutableFloatState;
        this.$splitRatio$delegate = mutableFloatState2;
        this.$columnHeightDp$delegate = mutableState;
    }

    @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
        final Density density = this.$localDensity;
        final float f = this.$minTopHeight;
        final float f2 = this.$minBottomHeight;
        final MutableFloatState mutableFloatState = this.$columnHeightPx$delegate;
        final MutableFloatState mutableFloatState2 = this.$splitRatio$delegate;
        final MutableState<C1654Dp> mutableState = this.$columnHeightDp$delegate;
        Object objDetectDragGestures = DragGestureDetectorKt.detectDragGestures($this$pointerInput, (5 & 1) != 0 ? new Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DragGestureDetectorKt.detectDragGestures$lambda$0((Offset) obj);
            }
        } : null, (5 & 2) != 0 ? new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : null, (5 & 4) != 0 ? new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : null, new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.VerticalSplitViewKt$VerticalSplitView$2$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return VerticalSplitViewKt$VerticalSplitView$2$2$1.invoke$lambda$1(density, f, f2, mutableFloatState, mutableFloatState2, mutableState, (PointerInputChange) obj, (Offset) obj2);
            }
        }, continuation);
        return objDetectDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGestures : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Density $localDensity, float $minTopHeight, float $minBottomHeight, MutableFloatState $columnHeightPx$delegate, MutableFloatState $splitRatio$delegate, MutableState $columnHeightDp$delegate, PointerInputChange change, Offset dragAmount) {
        Intrinsics.checkNotNullParameter(change, "change");
        float fVerticalSplitView_ugZX9yg$lambda$4 = VerticalSplitViewKt.VerticalSplitView_ugZX9yg$lambda$4($columnHeightPx$delegate) * VerticalSplitViewKt.VerticalSplitView_ugZX9yg$lambda$1($splitRatio$delegate);
        int bits$iv$iv$iv = (int) (4294967295L & dragAmount.m6680unboximpl());
        float newTopHeightPx = fVerticalSplitView_ugZX9yg$lambda$4 + Float.intBitsToFloat(bits$iv$iv$iv);
        float newTopHeightDp = $localDensity.mo1520toDpu2uoSUM(newTopHeightPx);
        if (C1654Dp.m9787compareTo0680j_4(newTopHeightDp, $minTopHeight) < 0) {
            newTopHeightDp = $minTopHeight;
        }
        if (C1654Dp.m9787compareTo0680j_4(C1654Dp.m9788constructorimpl(VerticalSplitViewKt.VerticalSplitView_ugZX9yg$lambda$7($columnHeightDp$delegate) - newTopHeightDp), $minBottomHeight) < 0) {
            newTopHeightDp = C1654Dp.m9788constructorimpl(VerticalSplitViewKt.VerticalSplitView_ugZX9yg$lambda$7($columnHeightDp$delegate) - $minBottomHeight);
        }
        $splitRatio$delegate.setFloatValue(newTopHeightDp / VerticalSplitViewKt.VerticalSplitView_ugZX9yg$lambda$7($columnHeightDp$delegate));
        change.consume();
        return Unit.INSTANCE;
    }
}
