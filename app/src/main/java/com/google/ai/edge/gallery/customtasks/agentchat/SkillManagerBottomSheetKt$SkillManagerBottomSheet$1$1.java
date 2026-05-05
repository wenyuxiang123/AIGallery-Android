package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$1$1", m932f = "SkillManagerBottomSheet.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class SkillManagerBottomSheetKt$SkillManagerBottomSheet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Integer> $selectedSkillsCount$delegate;
    final /* synthetic */ MutableState<Boolean> $showSkillLimitBanner$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkillManagerBottomSheetKt$SkillManagerBottomSheet$1$1(State<Integer> state, MutableState<Boolean> mutableState, Continuation<? super SkillManagerBottomSheetKt$SkillManagerBottomSheet$1$1> continuation) {
        super(2, continuation);
        this.$selectedSkillsCount$delegate = state;
        this.$showSkillLimitBanner$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SkillManagerBottomSheetKt$SkillManagerBottomSheet$1$1(this.$selectedSkillsCount$delegate, this.$showSkillLimitBanner$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SkillManagerBottomSheetKt$SkillManagerBottomSheet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$69(this.$selectedSkillsCount$delegate) > 15) {
                    SkillManagerBottomSheetKt.SkillManagerBottomSheet$lambda$65(this.$showSkillLimitBanner$delegate, true);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
