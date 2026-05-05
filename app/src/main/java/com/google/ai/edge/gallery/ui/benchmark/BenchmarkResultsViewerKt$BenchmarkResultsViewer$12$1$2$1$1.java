package com.google.ai.edge.gallery.ui.benchmark;

import androidx.compose.material3.SheetState;
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

/* JADX INFO: compiled from: BenchmarkResultsViewer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$12$1$2$1$1", m932f = "BenchmarkResultsViewer.kt", m933i = {}, m934l = {752}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class BenchmarkResultsViewerKt$BenchmarkResultsViewer$12$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ MutableState<Boolean> $showBenchmarkComparisonHelpBottomSheet$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BenchmarkResultsViewerKt$BenchmarkResultsViewer$12$1$2$1$1(SheetState sheetState, MutableState<Boolean> mutableState, Continuation<? super BenchmarkResultsViewerKt$BenchmarkResultsViewer$12$1$2$1$1> continuation) {
        super(2, continuation);
        this.$sheetState = sheetState;
        this.$showBenchmarkComparisonHelpBottomSheet$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BenchmarkResultsViewerKt$BenchmarkResultsViewer$12$1$2$1$1(this.$sheetState, this.$showBenchmarkComparisonHelpBottomSheet$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BenchmarkResultsViewerKt$BenchmarkResultsViewer$12$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$9(this.$showBenchmarkComparisonHelpBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }
}
