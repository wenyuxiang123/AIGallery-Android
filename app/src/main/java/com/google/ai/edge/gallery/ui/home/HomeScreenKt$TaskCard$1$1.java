package com.google.ai.edge.gallery.ui.home;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.core.view.PointerIconCompat;
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

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.home.HomeScreenKt$TaskCard$1$1", m932f = "HomeScreen.kt", m933i = {}, m934l = {PointerIconCompat.TYPE_TEXT}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class HomeScreenKt$TaskCard$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $curModelCountLabel$delegate;
    final /* synthetic */ State<String> $modelCountLabel$delegate;
    final /* synthetic */ MutableState<Boolean> $modelCountLabelVisible$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeScreenKt$TaskCard$1$1(MutableState<String> mutableState, State<String> state, MutableState<Boolean> mutableState2, Continuation<? super HomeScreenKt$TaskCard$1$1> continuation) {
        super(2, continuation);
        this.$curModelCountLabel$delegate = mutableState;
        this.$modelCountLabel$delegate = state;
        this.$modelCountLabelVisible$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeScreenKt$TaskCard$1$1(this.$curModelCountLabel$delegate, this.$modelCountLabel$delegate, this.$modelCountLabelVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeScreenKt$TaskCard$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!(HomeScreenKt.TaskCard$lambda$131(this.$curModelCountLabel$delegate).length() == 0)) {
                    HomeScreenKt.TaskCard$lambda$135(this.$modelCountLabelVisible$delegate, false);
                    this.label = 1;
                    if (DelayKt.delay(250L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.$curModelCountLabel$delegate.setValue(HomeScreenKt.TaskCard$lambda$129(this.$modelCountLabel$delegate));
                    HomeScreenKt.TaskCard$lambda$135(this.$modelCountLabelVisible$delegate, true);
                    return Unit.INSTANCE;
                }
                this.$curModelCountLabel$delegate.setValue(HomeScreenKt.TaskCard$lambda$129(this.$modelCountLabel$delegate));
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure($result);
                this.$curModelCountLabel$delegate.setValue(HomeScreenKt.TaskCard$lambda$129(this.$modelCountLabel$delegate));
                HomeScreenKt.TaskCard$lambda$135(this.$modelCountLabelVisible$delegate, true);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
