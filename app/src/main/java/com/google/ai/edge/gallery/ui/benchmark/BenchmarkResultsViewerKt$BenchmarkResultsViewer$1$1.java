package com.google.ai.edge.gallery.ui.benchmark;

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
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$1$1", m932f = "BenchmarkResultsViewer.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class BenchmarkResultsViewerKt$BenchmarkResultsViewer$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateList<String> $filterableModelNames;
    final /* synthetic */ String $strAll;
    final /* synthetic */ State<BenchmarkUiState> $uiState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BenchmarkResultsViewerKt$BenchmarkResultsViewer$1$1(SnapshotStateList<String> snapshotStateList, String str, State<BenchmarkUiState> state, Continuation<? super BenchmarkResultsViewerKt$BenchmarkResultsViewer$1$1> continuation) {
        super(2, continuation);
        this.$filterableModelNames = snapshotStateList;
        this.$strAll = str;
        this.$uiState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BenchmarkResultsViewerKt$BenchmarkResultsViewer$1$1(this.$filterableModelNames, this.$strAll, this.$uiState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BenchmarkResultsViewerKt$BenchmarkResultsViewer$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        LlmBenchmarkBasicInfo baiscInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$filterableModelNames.clear();
                this.$filterableModelNames.add(this.$strAll);
                SnapshotStateList<String> snapshotStateList = this.$filterableModelNames;
                Iterable $this$mapNotNull$iv = BenchmarkResultsViewerKt.BenchmarkResultsViewer$lambda$0(this.$uiState$delegate).getResults();
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                    BenchmarkResultInfo it = (BenchmarkResultInfo) element$iv$iv$iv;
                    LlmBenchmarkResult llmResult = it.getBenchmarkResult().getLlmResult();
                    String modelName = (llmResult == null || (baiscInfo = llmResult.getBaiscInfo()) == null) ? null : baiscInfo.getModelName();
                    if (modelName != null) {
                        destination$iv$iv.add(modelName);
                    }
                }
                snapshotStateList.addAll(CollectionsKt.distinct((List) destination$iv$iv));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
