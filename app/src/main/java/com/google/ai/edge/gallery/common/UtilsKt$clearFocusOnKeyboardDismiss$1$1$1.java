package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.common.UtilsKt$clearFocusOnKeyboardDismiss$1$1$1", m932f = "Utils.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class UtilsKt$clearFocusOnKeyboardDismiss$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ boolean $imeIsVisible;
    final /* synthetic */ MutableState<Boolean> $keyboardAppearedSinceLastFocused$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UtilsKt$clearFocusOnKeyboardDismiss$1$1$1(boolean z, FocusManager focusManager, MutableState<Boolean> mutableState, Continuation<? super UtilsKt$clearFocusOnKeyboardDismiss$1$1$1> continuation) {
        super(2, continuation);
        this.$imeIsVisible = z;
        this.$focusManager = focusManager;
        this.$keyboardAppearedSinceLastFocused$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtilsKt$clearFocusOnKeyboardDismiss$1$1$1(this.$imeIsVisible, this.$focusManager, this.$keyboardAppearedSinceLastFocused$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UtilsKt$clearFocusOnKeyboardDismiss$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$imeIsVisible) {
                    UtilsKt.clearFocusOnKeyboardDismiss$lambda$13$lambda$9(this.$keyboardAppearedSinceLastFocused$delegate, true);
                } else if (UtilsKt.clearFocusOnKeyboardDismiss$lambda$13$lambda$8(this.$keyboardAppearedSinceLastFocused$delegate)) {
                    FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
