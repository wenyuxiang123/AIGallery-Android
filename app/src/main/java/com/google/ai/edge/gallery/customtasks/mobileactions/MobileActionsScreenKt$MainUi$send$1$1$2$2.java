package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$MainUi$send$1$1$2$2", m932f = "MobileActionsScreen.kt", m933i = {}, m934l = {396}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MobileActionsScreenKt$MainUi$send$1$1$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $noFunctionCallSnackbarMessage;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileActionsScreenKt$MainUi$send$1$1$2$2(SnackbarHostState snackbarHostState, String str, Continuation<? super MobileActionsScreenKt$MainUi$send$1$1$2$2> continuation) {
        super(2, continuation);
        this.$snackbarHostState = snackbarHostState;
        this.$noFunctionCallSnackbarMessage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MobileActionsScreenKt$MainUi$send$1$1$2$2(this.$snackbarHostState, this.$noFunctionCallSnackbarMessage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MobileActionsScreenKt$MainUi$send$1$1$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (SnackbarHostState.showSnackbar$default(this.$snackbarHostState, this.$noFunctionCallSnackbarMessage, null, true, SnackbarDuration.Long, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
