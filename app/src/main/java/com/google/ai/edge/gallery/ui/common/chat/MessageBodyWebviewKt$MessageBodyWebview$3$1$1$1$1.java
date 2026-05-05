package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.material3.SheetState;
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




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.MessageBodyWebviewKt$MessageBodyWebview$3$1$1$1$1", m932f = "MessageBodyWebview.kt", m933i = {}, m934l = {103}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MessageBodyWebviewKt$MessageBodyWebview$3$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ MutableState<Boolean> $showBottomSheet$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageBodyWebviewKt$MessageBodyWebview$3$1$1$1$1(SheetState sheetState, MutableState<Boolean> mutableState, Continuation<? super MessageBodyWebviewKt$MessageBodyWebview$3$1$1$1$1> continuation) {
        super(2, continuation);
        this.$sheetState = sheetState;
        this.$showBottomSheet$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageBodyWebviewKt$MessageBodyWebview$3$1$1$1$1(this.$sheetState, this.$showBottomSheet$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageBodyWebviewKt$MessageBodyWebview$3$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (this.$sheetState.hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MessageBodyWebviewKt.MessageBodyWebview$lambda$2(this.$showBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }
}
