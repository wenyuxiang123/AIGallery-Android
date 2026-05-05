package com.google.ai.edge.gallery.ui.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AudioAnimation.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.AudioAnimationKt$AudioAnimation$2$1", m932f = "AudioAnimation.kt", m933i = {}, m934l = {164}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class AudioAnimationKt$AudioAnimation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableFloatState $iTime$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioAnimationKt$AudioAnimation$2$1(MutableFloatState mutableFloatState, Continuation<? super AudioAnimationKt$AudioAnimation$2$1> continuation) {
        super(2, continuation);
        this.$iTime$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioAnimationKt$AudioAnimation$2$1(this.$iTime$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioAnimationKt$AudioAnimation$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object obj;
        AudioAnimationKt$AudioAnimation$2$1 audioAnimationKt$AudioAnimation$2$1;
        final MutableFloatState mutableFloatState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                obj = coroutine_suspended;
                audioAnimationKt$AudioAnimation$2$1 = this;
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                obj = coroutine_suspended;
                audioAnimationKt$AudioAnimation$2$1 = this;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            mutableFloatState = audioAnimationKt$AudioAnimation$2$1.$iTime$delegate;
            audioAnimationKt$AudioAnimation$2$1.label = 1;
        } while (MonotonicFrameClockKt.withFrameMillis(new Function1() { // from class: com.google.ai.edge.gallery.ui.common.AudioAnimationKt$AudioAnimation$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AudioAnimationKt$AudioAnimation$2$1.invokeSuspend$lambda$0(mutableFloatState, ((Long) obj2).longValue());
            }
        }, audioAnimationKt$AudioAnimation$2$1) != obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableFloatState $iTime$delegate, long frameTimeMs) {
        $iTime$delegate.setFloatValue(frameTimeMs / 1000.0f);
        return Unit.INSTANCE;
    }
}
