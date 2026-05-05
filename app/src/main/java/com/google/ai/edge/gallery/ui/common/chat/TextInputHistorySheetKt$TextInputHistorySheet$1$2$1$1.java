package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.material3.SheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.TextInputHistorySheetKt$TextInputHistorySheet$1$2$1$1", m932f = "TextInputHistorySheet.kt", m933i = {}, m934l = {94}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class TextInputHistorySheetKt$TextInputHistorySheet$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onDismissed;
    final /* synthetic */ Function0<Unit> $onHistoryItemsDeleteAll;
    final /* synthetic */ SheetState $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputHistorySheetKt$TextInputHistorySheet$1$2$1$1(SheetState sheetState, Function0<Unit> function0, Function0<Unit> function02, Continuation<? super TextInputHistorySheetKt$TextInputHistorySheet$1$2$1$1> continuation) {
        super(2, continuation);
        this.$sheetState = sheetState;
        this.$onDismissed = function0;
        this.$onHistoryItemsDeleteAll = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextInputHistorySheetKt$TextInputHistorySheet$1$2$1$1(this.$sheetState, this.$onDismissed, this.$onHistoryItemsDeleteAll, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextInputHistorySheetKt$TextInputHistorySheet$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        this.$onDismissed.invoke();
        this.$onHistoryItemsDeleteAll.invoke();
        return Unit.INSTANCE;
    }
}
