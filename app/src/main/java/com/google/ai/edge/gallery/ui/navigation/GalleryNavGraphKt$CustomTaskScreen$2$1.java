package com.google.ai.edge.gallery.ui.navigation;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
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
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$CustomTaskScreen$2$1", m932f = "GalleryNavGraph.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class GalleryNavGraphKt$CustomTaskScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ModelDownloadStatus $curDownloadStatus;
    final /* synthetic */ ModelManagerViewModel $modelManagerViewModel;
    final /* synthetic */ MutableState<Boolean> $navigatingUp$delegate;
    final /* synthetic */ Model $selectedModel;
    final /* synthetic */ Task $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryNavGraphKt$CustomTaskScreen$2$1(ModelDownloadStatus modelDownloadStatus, Model model, ModelManagerViewModel modelManagerViewModel, Context context, Task task, MutableState<Boolean> mutableState, Continuation<? super GalleryNavGraphKt$CustomTaskScreen$2$1> continuation) {
        super(2, continuation);
        this.$curDownloadStatus = modelDownloadStatus;
        this.$selectedModel = model;
        this.$modelManagerViewModel = modelManagerViewModel;
        this.$context = context;
        this.$task = task;
        this.$navigatingUp$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GalleryNavGraphKt$CustomTaskScreen$2$1(this.$curDownloadStatus, this.$selectedModel, this.$modelManagerViewModel, this.$context, this.$task, this.$navigatingUp$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GalleryNavGraphKt$CustomTaskScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!GalleryNavGraphKt.CustomTaskScreen$lambda$99(this.$navigatingUp$delegate)) {
                    ModelDownloadStatus modelDownloadStatus = this.$curDownloadStatus;
                    if ((modelDownloadStatus != null ? modelDownloadStatus.getStatus() : null) == ModelDownloadStatusType.SUCCEEDED) {
                        Log.d("AGGalleryNavGraph", "Initializing model '" + this.$selectedModel.getName() + "' from CustomTaskScreen launched effect");
                        ModelManagerViewModel.initializeModel$default(this.$modelManagerViewModel, this.$context, this.$task, this.$selectedModel, false, null, 24, null);
                    }
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
