package com.google.ai.edge.gallery.ui.llmsingleturn;

import android.content.Context;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1", m932f = "LlmSingleTurnScreen.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ModelManagerViewModel $modelManagerViewModel;
    final /* synthetic */ Model $newSelectedModel;
    final /* synthetic */ Model $prevModel;
    final /* synthetic */ Task $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1(Model model, Model model2, ModelManagerViewModel modelManagerViewModel, Context context, Task task, Continuation<? super LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1> continuation) {
        super(2, continuation);
        this.$prevModel = model;
        this.$newSelectedModel = model2;
        this.$modelManagerViewModel = modelManagerViewModel;
        this.$context = context;
        this.$task = task;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1(this.$prevModel, this.$newSelectedModel, this.$modelManagerViewModel, this.$context, this.$task, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!Intrinsics.areEqual(this.$prevModel.getName(), this.$newSelectedModel.getName())) {
                    ModelManagerViewModel.cleanupModel$default(this.$modelManagerViewModel, this.$context, this.$task, this.$prevModel, null, null, 24, null);
                }
                this.$modelManagerViewModel.selectModel(this.$newSelectedModel);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
