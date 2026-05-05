package com.google.ai.edge.gallery.ui.llmsingleturn;

import android.content.Context;
import android.util.Log;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
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

/* JADX INFO: compiled from: ResponsePanel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmsingleturn.ResponsePanelKt$ResponsePanel$2$1", m932f = "ResponsePanel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class ResponsePanelKt$ResponsePanel$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Model $model;
    final /* synthetic */ ModelManagerViewModel $modelManagerViewModel;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ Task $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResponsePanelKt$ResponsePanel$2$1(Task task, PagerState pagerState, Model model, ModelManagerViewModel modelManagerViewModel, Context context, Continuation<? super ResponsePanelKt$ResponsePanel$2$1> continuation) {
        super(2, continuation);
        this.$task = task;
        this.$pagerState = pagerState;
        this.$model = model;
        this.$modelManagerViewModel = modelManagerViewModel;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResponsePanelKt$ResponsePanel$2$1(this.$task, this.$pagerState, this.$model, this.$modelManagerViewModel, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResponsePanelKt$ResponsePanel$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Model curSelectedModel = this.$task.getModels().get(this.$pagerState.getSettledPage());
                Log.d("AGResponsePanel", "Pager settled on model '" + curSelectedModel.getName() + "' from '" + this.$model.getName() + "'. Updating selected model.");
                if (!Intrinsics.areEqual(curSelectedModel.getName(), this.$model.getName())) {
                    ModelManagerViewModel.cleanupModel$default(this.$modelManagerViewModel, this.$context, this.$task, this.$model, null, null, 24, null);
                }
                this.$modelManagerViewModel.selectModel(curSelectedModel);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
