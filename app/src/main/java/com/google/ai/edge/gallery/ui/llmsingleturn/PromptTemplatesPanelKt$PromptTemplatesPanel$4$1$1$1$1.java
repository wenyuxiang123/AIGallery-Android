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
import kotlinx.coroutines.DelayKt;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplatesPanelKt$PromptTemplatesPanel$4$1$1$1$1", m932f = "PromptTemplatesPanel.kt", m933i = {}, m934l = {438}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class PromptTemplatesPanelKt$PromptTemplatesPanel$4$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $showExamplePromptBottomSheet$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromptTemplatesPanelKt$PromptTemplatesPanel$4$1$1$1$1(MutableState<Boolean> mutableState, Continuation<? super PromptTemplatesPanelKt$PromptTemplatesPanel$4$1$1$1$1> continuation) {
        super(2, continuation);
        this.$showExamplePromptBottomSheet$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PromptTemplatesPanelKt$PromptTemplatesPanel$4$1$1$1$1(this.$showExamplePromptBottomSheet$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PromptTemplatesPanelKt$PromptTemplatesPanel$4$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (DelayKt.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PromptTemplatesPanelKt.PromptTemplatesPanel$lambda$19(this.$showExamplePromptBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }
}
