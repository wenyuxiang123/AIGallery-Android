package com.google.ai.edge.gallery.ui.modelmanager;

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




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$1$1", m932f = "GlobalModelManager.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class GlobalModelManagerKt$GlobalModelManager$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $promoId;
    final /* synthetic */ MutableState<Boolean> $showPromo$delegate;
    final /* synthetic */ ModelManagerViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlobalModelManagerKt$GlobalModelManager$1$1(ModelManagerViewModel modelManagerViewModel, String str, MutableState<Boolean> mutableState, Continuation<? super GlobalModelManagerKt$GlobalModelManager$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = modelManagerViewModel;
        this.$promoId = str;
        this.$showPromo$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlobalModelManagerKt$GlobalModelManager$1$1(this.$viewModel, this.$promoId, this.$showPromo$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlobalModelManagerKt$GlobalModelManager$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                GlobalModelManagerKt.GlobalModelManager$lambda$31(this.$showPromo$delegate, !this.$viewModel.getDataStoreRepository().hasViewedPromo(this.$promoId));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
