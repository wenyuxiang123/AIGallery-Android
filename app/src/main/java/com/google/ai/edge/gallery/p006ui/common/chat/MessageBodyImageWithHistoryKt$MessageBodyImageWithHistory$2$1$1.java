package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputChange;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBodyImageWithHistory.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
final class MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$2$1$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableIntState $imageHistoryCurIndex;
    final /* synthetic */ ChatMessageImageWithHistory $message;
    final /* synthetic */ MutableIntState $savedIndex$delegate;
    final /* synthetic */ MutableFloatState $value$delegate;

    MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$2$1$1(MutableIntState mutableIntState, MutableFloatState mutableFloatState, MutableIntState mutableIntState2, ChatMessageImageWithHistory chatMessageImageWithHistory) {
        this.$imageHistoryCurIndex = mutableIntState;
        this.$value$delegate = mutableFloatState;
        this.$savedIndex$delegate = mutableIntState2;
        this.$message = chatMessageImageWithHistory;
    }

    @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
        final MutableIntState mutableIntState = this.$imageHistoryCurIndex;
        final MutableFloatState mutableFloatState = this.$value$delegate;
        final MutableIntState mutableIntState2 = this.$savedIndex$delegate;
        Function1 function1 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$2$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$2$1$1.invoke$lambda$0(mutableIntState, mutableFloatState, mutableIntState2, (Offset) obj);
            }
        };
        final MutableIntState mutableIntState3 = this.$imageHistoryCurIndex;
        final ChatMessageImageWithHistory chatMessageImageWithHistory = this.$message;
        final MutableFloatState mutableFloatState2 = this.$value$delegate;
        final MutableIntState mutableIntState4 = this.$savedIndex$delegate;
        Object objDetectHorizontalDragGestures = DragGestureDetectorKt.detectHorizontalDragGestures($this$pointerInput, (6 & 1) != 0 ? new Function1() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DragGestureDetectorKt.detectHorizontalDragGestures$lambda$0((Offset) obj);
            }
        } : function1, (6 & 2) != 0 ? new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : null, (6 & 4) != 0 ? new Function0() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : null, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$2$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$2$1$1.invoke$lambda$1(mutableIntState3, chatMessageImageWithHistory, mutableFloatState2, mutableIntState4, (PointerInputChange) obj, ((Float) obj2).floatValue());
            }
        }, continuation);
        return objDetectHorizontalDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectHorizontalDragGestures : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(MutableIntState $imageHistoryCurIndex, MutableFloatState $value$delegate, MutableIntState $savedIndex$delegate, Offset it) {
        $value$delegate.setFloatValue(0.0f);
        $savedIndex$delegate.setIntValue($imageHistoryCurIndex.getIntValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(MutableIntState $imageHistoryCurIndex, ChatMessageImageWithHistory $message, MutableFloatState $value$delegate, MutableIntState $savedIndex$delegate, PointerInputChange pointerInputChange, float dragAmount) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<unused var>");
        $value$delegate.setFloatValue(MessageBodyImageWithHistoryKt.MessageBodyImageWithHistory$lambda$9$lambda$3($value$delegate) + (dragAmount / 20.0f));
        $imageHistoryCurIndex.setIntValue((int) (MessageBodyImageWithHistoryKt.MessageBodyImageWithHistory$lambda$9$lambda$6($savedIndex$delegate) + MessageBodyImageWithHistoryKt.MessageBodyImageWithHistory$lambda$9$lambda$3($value$delegate)));
        if ($imageHistoryCurIndex.getIntValue() < 0) {
            $imageHistoryCurIndex.setIntValue(0);
        } else if ($imageHistoryCurIndex.getIntValue() > $message.getBitmaps().size() - 1) {
            $imageHistoryCurIndex.setIntValue($message.getBitmaps().size() - 1);
        }
        return Unit.INSTANCE;
    }
}
