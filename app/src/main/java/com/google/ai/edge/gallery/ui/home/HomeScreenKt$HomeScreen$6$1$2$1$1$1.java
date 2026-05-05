package com.google.ai.edge.gallery.ui.home;

import androidx.compose.material3.DrawerState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.home.HomeScreenKt$HomeScreen$6$1$2$1$1$1", m932f = "HomeScreen.kt", m933i = {0, 0, 1, 1}, m934l = {360, 360}, m935m = "invokeSuspend", m936n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-HomeScreenKt$HomeScreen$6$1$2$1$1$1$1", "$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-HomeScreenKt$HomeScreen$6$1$2$1$1$1$1"}, m938s = {"L$1", "I$0", "L$1", "I$0"})
final class HomeScreenKt$HomeScreen$6$1$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DrawerState $drawerState;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenKt$HomeScreen$6$1$2$1$1$1(DrawerState drawerState, Continuation<? super HomeScreenKt$HomeScreen$6$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.$drawerState = drawerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenKt$HomeScreen$6$1$2$1$1$1(this.$drawerState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenKt$HomeScreen$6$1$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                DrawerState $this$invokeSuspend_u24lambda_u240 = this.$drawerState;
                boolean zIsClosed = $this$invokeSuspend_u24lambda_u240.isClosed();
                this.L$0 = $this$invokeSuspend_u24lambda_u240;
                this.L$1 = SpillingKt.nullOutSpilledVariable($this$invokeSuspend_u24lambda_u240);
                this.I$0 = 0;
                if (zIsClosed) {
                    this.label = 1;
                    if ($this$invokeSuspend_u24lambda_u240.open(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    if ($this$invokeSuspend_u24lambda_u240.close(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            case 1:
            case 2:
                int i = this.I$0;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
