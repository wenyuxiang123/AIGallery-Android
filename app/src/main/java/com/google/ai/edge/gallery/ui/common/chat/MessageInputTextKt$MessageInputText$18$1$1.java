package com.google.ai.edge.gallery.ui.common.chat;

import android.content.Context;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.lifecycle.ProcessCameraProviderExtKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: MessageInputText.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$18$1$1", m932f = "MessageInputText.kt", m933i = {}, m934l = {763}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MessageInputTextKt$MessageInputText$18$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<CameraControl> $cameraControl$delegate;
    final /* synthetic */ MutableState<ProcessCameraProvider> $cameraProvider$delegate;
    final /* synthetic */ MutableIntState $cameraSide$delegate;
    final /* synthetic */ ImageCapture $imageCaptureUseCase;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Context $localContext;
    final /* synthetic */ Preview $previewUseCase;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageInputTextKt$MessageInputText$18$1$1(Context context, MutableState<ProcessCameraProvider> mutableState, LifecycleOwner lifecycleOwner, Preview preview, ImageCapture imageCapture, MutableIntState mutableIntState, MutableState<CameraControl> mutableState2, Continuation<? super MessageInputTextKt$MessageInputText$18$1$1> continuation) {
        super(2, continuation);
        this.$localContext = context;
        this.$cameraProvider$delegate = mutableState;
        this.$lifecycleOwner = lifecycleOwner;
        this.$previewUseCase = preview;
        this.$imageCaptureUseCase = imageCapture;
        this.$cameraSide$delegate = mutableIntState;
        this.$cameraControl$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageInputTextKt$MessageInputText$18$1$1(this.$localContext, this.$cameraProvider$delegate, this.$lifecycleOwner, this.$previewUseCase, this.$imageCaptureUseCase, this.$cameraSide$delegate, this.$cameraControl$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageInputTextKt$MessageInputText$18$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objAwaitInstance;
        MutableState<ProcessCameraProvider> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MutableState<ProcessCameraProvider> mutableState2 = this.$cameraProvider$delegate;
                this.L$0 = mutableState2;
                this.label = 1;
                objAwaitInstance = ProcessCameraProviderExtKt.awaitInstance(ProcessCameraProvider.INSTANCE, this.$localContext, this);
                if (objAwaitInstance == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState = mutableState2;
                break;
                break;
            case 1:
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure($result);
                objAwaitInstance = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableState.setValue((ProcessCameraProvider) objAwaitInstance);
        MessageInputTextKt.MessageInputText$lambda$139$rebindCameraProvider(this.$cameraProvider$delegate, this.$lifecycleOwner, this.$previewUseCase, this.$imageCaptureUseCase, this.$cameraSide$delegate, this.$cameraControl$delegate);
        return Unit.INSTANCE;
    }
}
