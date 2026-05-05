package com.google.ai.edge.gallery.p006ui.benchmark;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BenchmarkResultsViewer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$2$1", m932f = "BenchmarkResultsViewer.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class BenchmarkResultsViewerKt$BenchmarkResultsViewer$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotStateList<BenchmarkResultInfo> $filteredResults;
    final /* synthetic */ MutableState<String> $selectedModelName$delegate;
    final /* synthetic */ String $strAll;
    final /* synthetic */ State<BenchmarkUiState> $uiState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BenchmarkResultsViewerKt$BenchmarkResultsViewer$2$1(SnapshotStateList<BenchmarkResultInfo> snapshotStateList, State<BenchmarkUiState> state, String str, MutableState<String> mutableState, Continuation<? super BenchmarkResultsViewerKt$BenchmarkResultsViewer$2$1> continuation) {
        super(2, continuation);
        this.$filteredResults = snapshotStateList;
        this.$uiState$delegate = state;
        this.$strAll = str;
        this.$selectedModelName$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BenchmarkResultsViewerKt$BenchmarkResultsViewer$2$1(this.$filteredResults, this.$uiState$delegate, this.$strAll, this.$selectedModelName$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BenchmarkResultsViewerKt$BenchmarkResultsViewer$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r14.label
            switch(r0) {
                case 0: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L10:
            kotlin.ResultKt.throwOnFailure(r15)
            androidx.compose.runtime.snapshots.SnapshotStateList<com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultInfo> r0 = r14.$filteredResults
            r0.clear()
            androidx.compose.runtime.snapshots.SnapshotStateList<com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultInfo> r0 = r14.$filteredResults
            androidx.compose.runtime.State<com.google.ai.edge.gallery.ui.benchmark.BenchmarkUiState> r1 = r14.$uiState$delegate
            com.google.ai.edge.gallery.ui.benchmark.BenchmarkUiState r1 = com.google.ai.edge.gallery.p006ui.benchmark.BenchmarkResultsViewerKt.access$BenchmarkResultsViewer$lambda$0(r1)
            java.util.List r1 = r1.getResults()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r2 = r14.$strAll
            androidx.compose.runtime.MutableState<java.lang.String> r3 = r14.$selectedModelName$delegate
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r1
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L38:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L7a
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.google.ai.edge.gallery.ui.benchmark.BenchmarkResultInfo r10 = (com.google.ai.edge.gallery.p006ui.benchmark.BenchmarkResultInfo) r10
            r11 = 0
            java.lang.String r12 = com.google.ai.edge.gallery.p006ui.benchmark.BenchmarkResultsViewerKt.access$BenchmarkResultsViewer$lambda$15(r3)
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r2)
            if (r12 != 0) goto L73
            com.google.ai.edge.gallery.proto.BenchmarkResult r12 = r10.getBenchmarkResult()
            com.google.ai.edge.gallery.proto.LlmBenchmarkResult r12 = r12.getLlmResult()
            if (r12 == 0) goto L65
            com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfo r12 = r12.getBaiscInfo()
            if (r12 == 0) goto L65
            java.lang.String r12 = r12.getModelName()
            goto L66
        L65:
            r12 = 0
        L66:
            java.lang.String r13 = com.google.ai.edge.gallery.p006ui.benchmark.BenchmarkResultsViewerKt.access$BenchmarkResultsViewer$lambda$15(r3)
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r13)
            if (r12 == 0) goto L71
            goto L73
        L71:
            r12 = 0
            goto L74
        L73:
            r12 = 1
        L74:
            if (r12 == 0) goto L38
            r5.add(r9)
            goto L38
        L7a:
            r2 = r5
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            r0.addAll(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.benchmark.BenchmarkResultsViewerKt$BenchmarkResultsViewer$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
