package com.google.ai.edge.gallery.ui.llmsingleturn;

import androidx.compose.foundation.pager.PagerState;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmsingleturn.ResponsePanelKt$ResponsePanel$3$1", m932f = "ResponsePanel.kt", m933i = {}, m934l = {111}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class ResponsePanelKt$ResponsePanel$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Model $model;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ Task $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResponsePanelKt$ResponsePanel$3$1(PagerState pagerState, Task task, Model model, Continuation<? super ResponsePanelKt$ResponsePanel$3$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$task = task;
        this.$model = model;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResponsePanelKt$ResponsePanel$3$1(this.$pagerState, this.$task, this.$model, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResponsePanelKt$ResponsePanel$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (PagerState.animateScrollToPage$default(this.$pagerState, this.$task.getModels().indexOf(this.$model), 0.0f, null, this, 6, null) == coroutine_suspended) {
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
