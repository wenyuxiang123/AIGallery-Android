package com.google.ai.edge.gallery;

import android.animation.ObjectAnimator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.MainActivity$onCreate$4$2", m932f = "MainActivity.kt", m933i = {0}, m934l = {168}, m935m = "invokeSuspend", m936n = {"setContentDelay"}, m938s = {"J$0"})
final class MainActivity$onCreate$4$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $duration;
    final /* synthetic */ ObjectAnimator $fadeOut;
    final /* synthetic */ long $iconAnimationStartMs;
    final /* synthetic */ long $now;
    long J$0;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$onCreate$4$2(long j, long j2, long j3, ObjectAnimator objectAnimator, MainActivity mainActivity, Continuation<? super MainActivity$onCreate$4$2> continuation) {
        super(2, continuation);
        this.$duration = j;
        this.$now = j2;
        this.$iconAnimationStartMs = j3;
        this.$fadeOut = objectAnimator;
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$onCreate$4$2(this.$duration, this.$now, this.$iconAnimationStartMs, this.$fadeOut, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$onCreate$4$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        long setContentDelay;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                long setContentDelay2 = (this.$duration - (this.$now - this.$iconAnimationStartMs)) - ((long) 300);
                if (setContentDelay2 > 0) {
                    this.J$0 = setContentDelay2;
                    this.label = 1;
                    if (DelayKt.delay(setContentDelay2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    setContentDelay = setContentDelay2;
                }
                MainActivity.onCreate$setContent(this.this$0);
                this.$fadeOut.start();
                return Unit.INSTANCE;
            case 1:
                setContentDelay = this.J$0;
                ResultKt.throwOnFailure($result);
                MainActivity.onCreate$setContent(this.this$0);
                this.$fadeOut.start();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
