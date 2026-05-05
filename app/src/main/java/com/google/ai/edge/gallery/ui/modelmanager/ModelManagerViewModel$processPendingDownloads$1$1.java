package com.google.ai.edge.gallery.ui.modelmanager;

import android.util.Log;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.Task;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$processPendingDownloads$1$1", m932f = "ModelManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class ModelManagerViewModel$processPendingDownloads$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ModelManagerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModelManagerViewModel$processPendingDownloads$1$1(ModelManagerViewModel modelManagerViewModel, Continuation<? super ModelManagerViewModel$processPendingDownloads$1$1> continuation) {
        super(2, continuation);
        this.this$0 = modelManagerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModelManagerViewModel$processPendingDownloads$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModelManagerViewModel$processPendingDownloads$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Set checkedModelNames = new LinkedHashSet();
                TokenStatusAndData tokenStatusAndData = this.this$0.getTokenStatusAndData();
                for (Task task : this.this$0.getUiState().getValue().getTasks()) {
                    for (Model model : task.getModels()) {
                        if (!checkedModelNames.contains(model.getName())) {
                            ModelDownloadStatus modelDownloadStatus = this.this$0.getUiState().getValue().getModelDownloadStatus().get(model.getName());
                            ModelDownloadStatusType downloadStatus = modelDownloadStatus != null ? modelDownloadStatus.getStatus() : null;
                            if (downloadStatus == ModelDownloadStatusType.PARTIALLY_DOWNLOADED) {
                                if (tokenStatusAndData.getStatus() == TokenStatus.NOT_EXPIRED && tokenStatusAndData.getData() != null) {
                                    model.setAccessToken(tokenStatusAndData.getData().getAccessToken());
                                }
                                Log.d("AGModelManagerViewModel", "Sending a new download request for '" + model.getName() + "'");
                                this.this$0.downloadRepository.downloadModel(task, model, new C28221(this.this$0));
                            }
                            checkedModelNames.add(model.getName());
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    
    
    
    static final /* synthetic */ class C28221 extends FunctionReferenceImpl implements Function2<Model, ModelDownloadStatus, Unit> {
        C28221(Object obj) {
            super(2, obj, ModelManagerViewModel.class, "setDownloadStatus", "setDownloadStatus(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Model model, ModelDownloadStatus modelDownloadStatus) {
            invoke2(model, modelDownloadStatus);
            return Unit.INSTANCE;
        }

        
        public final void invoke2(Model p0, ModelDownloadStatus p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((ModelManagerViewModel) this.receiver).setDownloadStatus(p0, p1);
        }
    }
}
