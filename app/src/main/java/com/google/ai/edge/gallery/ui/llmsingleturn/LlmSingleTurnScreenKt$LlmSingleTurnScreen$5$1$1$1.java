package com.google.ai.edge.gallery.ui.llmsingleturn;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
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

/* JADX INFO: compiled from: LlmSingleTurnScreen.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$LlmSingleTurnScreen$5$1$1$1", m932f = "LlmSingleTurnScreen.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class LlmSingleTurnScreenKt$LlmSingleTurnScreen$5$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $mainUiVisible$delegate;
    final /* synthetic */ boolean $modelDownloaded;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LlmSingleTurnScreenKt$LlmSingleTurnScreen$5$1$1$1(boolean z, MutableState<Boolean> mutableState, Continuation<? super LlmSingleTurnScreenKt$LlmSingleTurnScreen$5$1$1$1> continuation) {
        super(2, continuation);
        this.$modelDownloaded = z;
        this.$mainUiVisible$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LlmSingleTurnScreenKt$LlmSingleTurnScreen$5$1$1$1(this.$modelDownloaded, this.$mainUiVisible$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LlmSingleTurnScreenKt$LlmSingleTurnScreen$5$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$41$lambda$40$lambda$23(this.$mainUiVisible$delegate, this.$modelDownloaded);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
