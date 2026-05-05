package com.google.ai.edge.gallery.p006ui.benchmark;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BenchmarkViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m921d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006$"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkUiState;", "", "results", "", "Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkResultInfo;", "baselineResult", "showResultsViewer", "", "running", "totalRunCount", "", "completedRunCount", "<init>", "(Ljava/util/List;Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkResultInfo;ZZII)V", "getResults", "()Ljava/util/List;", "getBaselineResult", "()Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkResultInfo;", "getShowResultsViewer", "()Z", "getRunning", "getTotalRunCount", "()I", "getCompletedRunCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BenchmarkResultInfo getBaselineResult() {
        return this.baselineResult;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowResultsViewer() {
        return this.showResultsViewer;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getRunning() {
        return this.running;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalRunCount() {
        return this.totalRunCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
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
