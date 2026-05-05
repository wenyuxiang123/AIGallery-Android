package com.google.ai.edge.gallery.ui.benchmark;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfo;
import com.google.ai.edge.gallery.proto.LlmBenchmarkResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$BenchmarkScreen$1$1", m932f = "BenchmarkScreen.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class BenchmarkScreenKt$BenchmarkScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateList<BenchmarkResultInfo> $filteredResults;
    final /* synthetic */ MutableState<String> $selectedModelName$delegate;
    final /* synthetic */ State<BenchmarkUiState> $uiState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BenchmarkScreenKt$BenchmarkScreen$1$1(SnapshotStateList<BenchmarkResultInfo> snapshotStateList, State<BenchmarkUiState> state, MutableState<String> mutableState, Continuation<? super BenchmarkScreenKt$BenchmarkScreen$1$1> continuation) {
        super(2, continuation);
        this.$filteredResults = snapshotStateList;
        this.$uiState$delegate = state;
        this.$selectedModelName$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BenchmarkScreenKt$BenchmarkScreen$1$1(this.$filteredResults, this.$uiState$delegate, this.$selectedModelName$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BenchmarkScreenKt$BenchmarkScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        LlmBenchmarkBasicInfo baiscInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$filteredResults.clear();
                SnapshotStateList<BenchmarkResultInfo> snapshotStateList = this.$filteredResults;
                Iterable $this$filter$iv = BenchmarkScreenKt.BenchmarkScreen$lambda$0(this.$uiState$delegate).getResults();
                MutableState<String> mutableState = this.$selectedModelName$delegate;
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$filter$iv) {
                    BenchmarkResultInfo it = (BenchmarkResultInfo) element$iv$iv;
                    LlmBenchmarkResult llmResult = it.getBenchmarkResult().getLlmResult();
                    if (Intrinsics.areEqual((llmResult == null || (baiscInfo = llmResult.getBaiscInfo()) == null) ? null : baiscInfo.getModelName(), BenchmarkScreenKt.BenchmarkScreen$lambda$11(mutableState))) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                }
                snapshotStateList.addAll((List) destination$iv$iv);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
