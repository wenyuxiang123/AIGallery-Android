package com.google.ai.edge.gallery.p006ui.common;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AudioAnimation.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.AudioAnimationKt$AudioAnimation$1$1", m932f = "AudioAnimation.kt", m933i = {0}, m934l = {153}, m935m = "invokeSuspend", m936n = {"animatable"}, m938s = {"L$0"})
final class AudioAnimationKt$AudioAnimation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableFloatState $animatedAmplitude$delegate;
    final /* synthetic */ double $normalizedAmplitude;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioAnimationKt$AudioAnimation$1$1(double d, MutableFloatState mutableFloatState, Continuation<? super AudioAnimationKt$AudioAnimation$1$1> continuation) {
        super(2, continuation);
        this.$normalizedAmplitude = d;
        this.$animatedAmplitude$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioAnimationKt$AudioAnimation$1$1(this.$normalizedAmplitude, this.$animatedAmplitude$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioAnimationKt$AudioAnimation$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Animatable animatable = AnimatableKt.Animatable$default(AudioAnimationKt.AudioAnimation_KTwxG1Y$lambda$12(this.$animatedAmplitude$delegate), 0.0f, 2, null);
                Float fBoxFloat = Boxing.boxFloat((float) this.$normalizedAmplitude);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(100, 0, null, 6, null);
                final MutableFloatState mutableFloatState = this.$animatedAmplitude$delegate;
                Function1 function1 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.AudioAnimationKt$AudioAnimation$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AudioAnimationKt$AudioAnimation$1$1.invokeSuspend$lambda$0(mutableFloatState, (Animatable) obj);
                    }
                };
                this.L$0 = SpillingKt.nullOutSpilledVariable(animatable);
                this.label = 1;
                if (animatable.animateTo(fBoxFloat, (4 & 2) != 0 ? animatable.defaultSpringSpec : tweenSpecTween$default, (4 & 4) != 0 ? animatable.getVelocity() : null, (4 & 8) != 0 ? null : function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableFloatState $animatedAmplitude$delegate, Animatable $this$animateTo) {
        $animatedAmplitude$delegate.setFloatValue(((Number) $this$animateTo.getValue()).floatValue());
        return Unit.INSTANCE;
    }
}
