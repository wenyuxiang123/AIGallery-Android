package com.google.ai.edge.gallery.customtasks.agentchat;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$1$1", m932f = "GenerateLlmPromptBottomSheet.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $curDescription;
    final /* synthetic */ Function1<String, Unit> $onRequirementsChange;
    final /* synthetic */ String $requirements;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$1$1(String str, Function1<? super String, Unit> function1, String str2, Continuation<? super GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$1$1> continuation) {
        super(2, continuation);
        this.$requirements = str;
        this.$onRequirementsChange = function1;
        this.$curDescription = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$1$1(this.$requirements, this.$onRequirementsChange, this.$curDescription, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenerateLlmPromptBottomSheetKt$GenerateLlmPromptBottomSheet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (StringsKt.isBlank(this.$requirements)) {
                    this.$onRequirementsChange.invoke(this.$curDescription);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
