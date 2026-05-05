package com.google.ai.edge.gallery.customtasks.mobileactions;

import android.util.Log;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatus;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatusType;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import java.util.Map;
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




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$MainUi$1$1", m932f = "MobileActionsScreen.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MobileActionsScreenKt$MainUi$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, Object> $initialModelConfigValues;
    final /* synthetic */ Model $model;
    final /* synthetic */ ModelManagerViewModel $modelManagerViewModel;
    final /* synthetic */ MobileActionsViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileActionsScreenKt$MainUi$1$1(Model model, Map<String, ? extends Object> map, ModelManagerViewModel modelManagerViewModel, MobileActionsViewModel mobileActionsViewModel, Continuation<? super MobileActionsScreenKt$MainUi$1$1> continuation) {
        super(2, continuation);
        this.$model = model;
        this.$initialModelConfigValues = map;
        this.$modelManagerViewModel = modelManagerViewModel;
        this.$viewModel = mobileActionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MobileActionsScreenKt$MainUi$1$1(this.$model, this.$initialModelConfigValues, this.$modelManagerViewModel, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MobileActionsScreenKt$MainUi$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!Intrinsics.areEqual(this.$model.getConfigValues(), this.$initialModelConfigValues)) {
                    Log.d("AGMAScreen", "model config values changed.");
                    this.$modelManagerViewModel.setInitializationStatus(this.$model, new ModelInitializationStatus(ModelInitializationStatusType.NOT_INITIALIZED, null, null, 6, null));
                    this.$viewModel.reset();
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
