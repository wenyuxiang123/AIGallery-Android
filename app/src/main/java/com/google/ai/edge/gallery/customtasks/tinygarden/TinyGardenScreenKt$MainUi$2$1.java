package com.google.ai.edge.gallery.customtasks.tinygarden;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenScreenKt$MainUi$2$1", m932f = "TinyGardenScreen.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class TinyGardenScreenKt$MainUi$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $setTopBarVisible;
    final /* synthetic */ MutableState<Boolean> $showConversationHistoryPanel$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TinyGardenScreenKt$MainUi$2$1(Function1<? super Boolean, Unit> function1, MutableState<Boolean> mutableState, Continuation<? super TinyGardenScreenKt$MainUi$2$1> continuation) {
        super(2, continuation);
        this.$setTopBarVisible = function1;
        this.$showConversationHistoryPanel$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TinyGardenScreenKt$MainUi$2$1(this.$setTopBarVisible, this.$showConversationHistoryPanel$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TinyGardenScreenKt$MainUi$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$setTopBarVisible.invoke(Boxing.boxBoolean(!TinyGardenScreenKt.MainUi___WMjBM$lambda$25(this.$showConversationHistoryPanel$delegate)));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
