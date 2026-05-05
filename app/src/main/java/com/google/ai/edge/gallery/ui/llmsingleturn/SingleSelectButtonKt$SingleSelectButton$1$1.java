package com.google.ai.edge.gallery.ui.llmsingleturn;

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




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmsingleturn.SingleSelectButtonKt$SingleSelectButton$1$1", m932f = "SingleSelectButton.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class SingleSelectButtonKt$SingleSelectButton$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PromptTemplateSingleSelectInputEditor $config;
    final /* synthetic */ MutableState<String> $selectedOption$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleSelectButtonKt$SingleSelectButton$1$1(PromptTemplateSingleSelectInputEditor promptTemplateSingleSelectInputEditor, MutableState<String> mutableState, Continuation<? super SingleSelectButtonKt$SingleSelectButton$1$1> continuation) {
        super(2, continuation);
        this.$config = promptTemplateSingleSelectInputEditor;
        this.$selectedOption$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SingleSelectButtonKt$SingleSelectButton$1$1(this.$config, this.$selectedOption$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SingleSelectButtonKt$SingleSelectButton$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$selectedOption$delegate.setValue(this.$config.getDefaultOption());
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
