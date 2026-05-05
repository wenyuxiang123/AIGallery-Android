package com.google.ai.edge.gallery.p006ui.common;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageProxy;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
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

/* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.LiveCameraViewKt$LiveCameraView$liveCameraPermissionLauncher$1$1$1 */
/* JADX INFO: compiled from: LiveCameraView.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.LiveCameraViewKt$LiveCameraView$liveCameraPermissionLauncher$1$1$1", m932f = "LiveCameraView.kt", m933i = {}, m934l = {88}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class C2672xfaa47590 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<ProcessCameraProvider> $cameraProvider$delegate;
    final /* synthetic */ CameraSelector $cameraSelector;
    final /* synthetic */ Context $context;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Function2<Bitmap, ImageProxy, Unit> $onBitmapFn;
    final /* synthetic */ int $outputImageFormat;
    final /* synthetic */ int $preferredSize;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C2672xfaa47590(Context context, LifecycleOwner lifecycleOwner, Function2<? super Bitmap, ? super ImageProxy, Unit> function2, int i, int i2, CameraSelector cameraSelector, MutableState<ProcessCameraProvider> mutableState, Continuation<? super C2672xfaa47590> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$lifecycleOwner = lifecycleOwner;
        this.$onBitmapFn = function2;
        this.$preferredSize = i;
        this.$outputImageFormat = i2;
        this.$cameraSelector = cameraSelector;
        this.$cameraProvider$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C2672xfaa47590(this.$context, this.$lifecycleOwner, this.$onBitmapFn, this.$preferredSize, this.$outputImageFormat, this.$cameraSelector, this.$cameraProvider$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C2672xfaa47590) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objStartCamera;
        MutableState<ProcessCameraProvider> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                MutableState<ProcessCameraProvider> mutableState2 = this.$cameraProvider$delegate;
                this.L$0 = mutableState2;
                this.label = 1;
                objStartCamera = LiveCameraViewKt.startCamera(this.$context, this.$lifecycleOwner, this.$onBitmapFn, this.$preferredSize, this.$outputImageFormat, this.$cameraSelector, this);
                if (objStartCamera == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState = mutableState2;
                break;
                break;
            case 1:
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure($result);
                objStartCamera = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableState.setValue((ProcessCameraProvider) objStartCamera);
        return Unit.INSTANCE;
    }
}
