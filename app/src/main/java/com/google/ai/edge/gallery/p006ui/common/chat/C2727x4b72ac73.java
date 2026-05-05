package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.material3.SheetState;
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

/* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$18$4$3$1$callback$1$onCaptureSuccess$1 */
/* JADX INFO: compiled from: MessageInputText.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$18$4$3$1$callback$1$onCaptureSuccess$1", m932f = "MessageInputText.kt", m933i = {}, m934l = {839}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class C2727x4b72ac73 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $cameraCaptureSheetState;
    final /* synthetic */ MutableState<Boolean> $showCameraCaptureBottomSheet$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2727x4b72ac73(SheetState sheetState, MutableState<Boolean> mutableState, Continuation<? super C2727x4b72ac73> continuation) {
        super(2, continuation);
        this.$cameraCaptureSheetState = sheetState;
        this.$showCameraCaptureBottomSheet$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C2727x4b72ac73(this.$cameraCaptureSheetState, this.$showCameraCaptureBottomSheet$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C2727x4b72ac73) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (this.$cameraCaptureSheetState.hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MessageInputTextKt.MessageInputText$lambda$23(this.$showCameraCaptureBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }
}
