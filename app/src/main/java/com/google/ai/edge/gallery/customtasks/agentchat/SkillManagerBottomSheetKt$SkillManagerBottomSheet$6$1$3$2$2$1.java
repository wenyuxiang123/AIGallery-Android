package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.material3.SheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1", m932f = "SkillManagerBottomSheet.kt", m933i = {}, m934l = {333}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $onDismiss;
    final /* synthetic */ Ref.ObjectRef<String> $savedSelectedSkillsNamesAndDescriptions;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ SkillManagerViewModel $skillManagerViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1(SheetState sheetState, Function1<? super Boolean, Unit> function1, Ref.ObjectRef<String> objectRef, SkillManagerViewModel skillManagerViewModel, Continuation<? super SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1> continuation) {
        super(2, continuation);
        this.$sheetState = sheetState;
        this.$onDismiss = function1;
        this.$savedSelectedSkillsNamesAndDescriptions = objectRef;
        this.$skillManagerViewModel = skillManagerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1(this.$sheetState, this.$onDismiss, this.$savedSelectedSkillsNamesAndDescriptions, this.$skillManagerViewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SkillManagerBottomSheetKt$SkillManagerBottomSheet$6$1$3$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (this.$sheetState.hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$onDismiss.invoke(Boxing.boxBoolean(!Intrinsics.areEqual(this.$savedSelectedSkillsNamesAndDescriptions.element, this.$skillManagerViewModel.getSelectedSkillsNamesAndDescriptions())));
        return Unit.INSTANCE;
    }
}
