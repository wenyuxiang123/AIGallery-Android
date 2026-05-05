package com.google.ai.edge.gallery.ui.benchmark;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getResults", "()Ljava/util/List;", "getBaselineResult", "()Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkResultInfo;", "getShowResultsViewer", "()Z", "getRunning", "getTotalRunCount", "()I", "getCompletedRunCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class BenchmarkUiState {
    public static final int $stable = 8;
    private final BenchmarkResultInfo baselineResult;
    private final int completedRunCount;
    private final List<BenchmarkResultInfo> results;
    private final boolean running;
    private final boolean showResultsViewer;
    private final int totalRunCount;

    public BenchmarkUiState() {
        this(null, null, false, false, 0, 0, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BenchmarkUiState copy$default(BenchmarkUiState benchmarkUiState, List list, BenchmarkResultInfo benchmarkResultInfo, boolean z, boolean z2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = benchmarkUiState.results;
        }
        if ((i3 & 2) != 0) {
            benchmarkResultInfo = benchmarkUiState.baselineResult;
        }
        BenchmarkResultInfo benchmarkResultInfo2 = benchmarkResultInfo;
        if ((i3 & 4) != 0) {
            z = benchmarkUiState.showResultsViewer;
        }
        boolean z3 = z;
        if ((i3 & 8) != 0) {
            z2 = benchmarkUiState.running;
        }
        boolean z4 = z2;
        if ((i3 & 16) != 0) {
            i = benchmarkUiState.totalRunCount;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = benchmarkUiState.completedRunCount;
        }
        return benchmarkUiState.copy(list, benchmarkResultInfo2, z3, z4, i4, i2);
    }

    public final List<BenchmarkResultInfo> component1() {
        return this.results;
    }

    
    public final BenchmarkResultInfo getBaselineResult() {
        return this.baselineResult;
    }

    
    public final boolean getShowResultsViewer() {
        return this.showResultsViewer;
    }

    
    public final boolean getRunning() {
        return this.running;
    }

    
    public final int getTotalRunCount() {
        return this.totalRunCount;
    }

    
    public final int getCompletedRunCount() {
        return this.completedRunCount;
    }

    public final BenchmarkUiState copy(List<BenchmarkResultInfo> results, BenchmarkResultInfo baselineResult, boolean showResultsViewer, boolean running, int totalRunCount, int completedRunCount) {
        Intrinsics.checkNotNullParameter(results, "results");
        return new BenchmarkUiState(results, baselineResult, showResultsViewer, running, totalRunCount, completedRunCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BenchmarkUiState)) {
            return false;
        }
        BenchmarkUiState benchmarkUiState = (BenchmarkUiState) other;
        return Intrinsics.areEqual(this.results, benchmarkUiState.results) && Intrinsics.areEqual(this.baselineResult, benchmarkUiState.baselineResult) && this.showResultsViewer == benchmarkUiState.showResultsViewer && this.running == benchmarkUiState.running && this.totalRunCount == benchmarkUiState.totalRunCount && this.completedRunCount == benchmarkUiState.completedRunCount;
    }

    public int hashCode() {
        return (((((((((this.results.hashCode() * 31) + (this.baselineResult == null ? 0 : this.baselineResult.hashCode())) * 31) + Boolean.hashCode(this.showResultsViewer)) * 31) + Boolean.hashCode(this.running)) * 31) + Integer.hashCode(this.totalRunCount)) * 31) + Integer.hashCode(this.completedRunCount);
    }

    public String toString() {
        return "BenchmarkUiState(results=" + this.results + ", baselineResult=" + this.baselineResult + ", showResultsViewer=" + this.showResultsViewer + ", running=" + this.running + ", totalRunCount=" + this.totalRunCount + ", completedRunCount=" + this.completedRunCount + ")";
    }

    public BenchmarkUiState(List<BenchmarkResultInfo> results, BenchmarkResultInfo baselineResult, boolean showResultsViewer, boolean running, int totalRunCount, int completedRunCount) {
        Intrinsics.checkNotNullParameter(results, "results");
        this.results = results;
        this.baselineResult = baselineResult;
        this.showResultsViewer = showResultsViewer;
        this.running = running;
        this.totalRunCount = totalRunCount;
        this.completedRunCount = completedRunCount;
    }

    public /* synthetic */ BenchmarkUiState(List list, BenchmarkResultInfo benchmarkResultInfo, boolean z, boolean z2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt.emptyList() : list, (i3 & 2) != 0 ? null : benchmarkResultInfo, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) == 0 ? i2 : 0);
    }

    public final List<BenchmarkResultInfo> getResults() {
        return this.results;
    }

    public final BenchmarkResultInfo getBaselineResult() {
        return this.baselineResult;
    }

    public final boolean getShowResultsViewer() {
        return this.showResultsViewer;
    }

    public final boolean getRunning() {
        return this.running;
    }

    public final int getTotalRunCount() {
        return this.totalRunCount;
    }

    public final int getCompletedRunCount() {
        return this.completedRunCount;
    }
}
