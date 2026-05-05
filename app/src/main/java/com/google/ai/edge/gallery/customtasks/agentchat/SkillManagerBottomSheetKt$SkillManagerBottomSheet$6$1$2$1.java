package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SkillManagerBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
final class SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$2$1 implements PointerInputEventHandler {
    final /* synthetic */ FocusManager $focusManager;

    SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$2$1(FocusManager focusManager) {
        this.$focusManager = focusManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(FocusManager $focusManager, Offset it) {
        FocusManager.clearFocus$default($focusManager, false, 1, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
        final FocusManager focusManager = this.$focusManager;
        Object objDetectTapGestures = TapGestureDetectorKt.detectTapGestures($this$pointerInput, (13 & 1) != 0 ? null : null, (13 & 2) != 0 ? null : null, (13 & 4) != 0 ? TapGestureDetectorKt.NoPressGesture : null, (13 & 8) != 0 ? null : new Function1() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$2$1.invoke$lambda$0(focusManager, (Offset) obj);
            }
        }, continuation);
        return objDetectTapGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures : Unit.INSTANCE;
    }
}
