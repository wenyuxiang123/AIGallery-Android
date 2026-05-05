package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsScreenKt$MainUi$send$1$1$1", m932f = "MobileActionsScreen.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MobileActionsScreenKt$MainUi$send$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableLongState $clearInputTextTrigger$delegate;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ MutableIntState $selectedTabIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileActionsScreenKt$MainUi$send$1$1$1(FocusManager focusManager, MutableIntState mutableIntState, MutableLongState mutableLongState, Continuation<? super MobileActionsScreenKt$MainUi$send$1$1$1> continuation) {
        super(2, continuation);
        this.$focusManager = focusManager;
        this.$selectedTabIndex$delegate = mutableIntState;
        this.$clearInputTextTrigger$delegate = mutableLongState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MobileActionsScreenKt$MainUi$send$1$1$1(this.$focusManager, this.$selectedTabIndex$delegate, this.$clearInputTextTrigger$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MobileActionsScreenKt$MainUi$send$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$selectedTabIndex$delegate.setIntValue(0);
                this.$clearInputTextTrigger$delegate.setLongValue(System.currentTimeMillis());
                FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
