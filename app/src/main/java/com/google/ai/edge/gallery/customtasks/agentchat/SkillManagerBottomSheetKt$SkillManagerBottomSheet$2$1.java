package com.google.ai.edge.gallery.customtasks.agentchat;

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
import kotlinx.coroutines.DelayKt;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$2$1", m932f = "SkillManagerBottomSheet.kt", m933i = {}, m934l = {202}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class SkillManagerBottomSheetKt$SkillManagerBottomSheet$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $showSkillLimitBanner$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkillManagerBottomSheetKt$SkillManagerBottomSheet$2$1(MutableState<Boolean> mutableState, Continuation<? super SkillManagerBottomSheetKt$SkillManagerBottomSheet$2$1> continuation) {
        super(2, continuation);
        this.$showSkillLimitBanner$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SkillManagerBottomSheetKt$SkillManagerBottomSheet$2$1(this.$showSkillLimitBanner$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SkillManagerBottomSheetKt$SkillManagerBottomSheet$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$64(this.$showSkillLimitBanner$delegate)) {
                    this.label = 1;
                    if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$65(this.$showSkillLimitBanner$delegate, false);
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure($result);
                SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$65(this.$showSkillLimitBanner$delegate, false);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
