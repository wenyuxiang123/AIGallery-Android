package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$ZoomableImage$2$1", m932f = "ZoomableImage.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class ZoomableImageKt$ZoomableImage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableFloatState $offsetX;
    final /* synthetic */ MutableFloatState $offsetY;
    final /* synthetic */ boolean $resetOnImageUpdate;
    final /* synthetic */ MutableFloatState $scale;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZoomableImageKt$ZoomableImage$2$1(boolean z, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, Continuation<? super ZoomableImageKt$ZoomableImage$2$1> continuation) {
        super(2, continuation);
        this.$resetOnImageUpdate = z;
        this.$scale = mutableFloatState;
        this.$offsetX = mutableFloatState2;
        this.$offsetY = mutableFloatState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ZoomableImageKt$ZoomableImage$2$1(this.$resetOnImageUpdate, this.$scale, this.$offsetX, this.$offsetY, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ZoomableImageKt$ZoomableImage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$resetOnImageUpdate) {
                    this.$scale.setFloatValue(1.0f);
                    this.$offsetX.setFloatValue(0.0f);
                    this.$offsetY.setFloatValue(0.0f);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
