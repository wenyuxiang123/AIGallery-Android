package com.google.ai.edge.gallery.ui.navigation;

import android.content.Context;
import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$GalleryNavHost$4$9$1$2$1", m932f = "GalleryNavGraph.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class GalleryNavGraphKt$GalleryNavHost$4$9$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Model $curModel;
    final /* synthetic */ CustomTask $customTask;
    final /* synthetic */ Object $instanceToCleanUp;
    final /* synthetic */ ModelManagerViewModel $modelManagerViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryNavGraphKt$GalleryNavHost$4$9$1$2$1(ModelManagerViewModel modelManagerViewModel, Context context, CustomTask customTask, Model model, Object obj, Continuation<? super GalleryNavGraphKt$GalleryNavHost$4$9$1$2$1> continuation) {
        super(2, continuation);
        this.$modelManagerViewModel = modelManagerViewModel;
        this.$context = context;
        this.$customTask = customTask;
        this.$curModel = model;
        this.$instanceToCleanUp = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GalleryNavGraphKt$GalleryNavHost$4$9$1$2$1(this.$modelManagerViewModel, this.$context, this.$customTask, this.$curModel, this.$instanceToCleanUp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GalleryNavGraphKt$GalleryNavHost$4$9$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ModelManagerViewModel.cleanupModel$default(this.$modelManagerViewModel, this.$context, this.$customTask.getTask(), this.$curModel, this.$instanceToCleanUp, null, 16, null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
