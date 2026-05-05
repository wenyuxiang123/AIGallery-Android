package com.google.ai.edge.gallery.ui.benchmark;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.proto.BenchmarkResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BenchmarkViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m921d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkResultInfo;", "", "id", "", "benchmarkResult", "Lcom/google/ai/edge/gallery/proto/BenchmarkResult;", "expanded", "", "basicInfoExpanded", "statsExpanded", "aggregation", "Lcom/google/ai/edge/gallery/ui/benchmark/Aggregation;", "<init>", "(Ljava/lang/String;Lcom/google/ai/edge/gallery/proto/BenchmarkResult;ZZZLcom/google/ai/edge/gallery/ui/benchmark/Aggregation;)V", "getId", "()Ljava/lang/String;", "getBenchmarkResult", "()Lcom/google/ai/edge/gallery/proto/BenchmarkResult;", "getExpanded", "()Z", "getBasicInfoExpanded", "getStatsExpanded", "getAggregation", "()Lcom/google/ai/edge/gallery/ui/benchmark/Aggregation;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class BenchmarkResultInfo {
    public static final int $stable = 0;
    private final Aggregation aggregation;
    private final boolean basicInfoExpanded;
    private final BenchmarkResult benchmarkResult;
    private final boolean expanded;
    private final String id;
    private final boolean statsExpanded;

    public static /* synthetic */ BenchmarkResultInfo copy$default(BenchmarkResultInfo benchmarkResultInfo, String str, BenchmarkResult benchmarkResult, boolean z, boolean z2, boolean z3, Aggregation aggregation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = benchmarkResultInfo.id;
        }
        if ((i & 2) != 0) {
            benchmarkResult = benchmarkResultInfo.benchmarkResult;
        }
        BenchmarkResult benchmarkResult2 = benchmarkResult;
        if ((i & 4) != 0) {
            z = benchmarkResultInfo.expanded;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = benchmarkResultInfo.basicInfoExpanded;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = benchmarkResultInfo.statsExpanded;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            aggregation = benchmarkResultInfo.aggregation;
        }
        return benchmarkResultInfo.copy(str, benchmarkResult2, z4, z5, z6, aggregation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BenchmarkResult getBenchmarkResult() {
        return this.benchmarkResult;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getExpanded() {
        return this.expanded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getBasicInfoExpanded() {
        return this.basicInfoExpanded;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getStatsExpanded() {
        return this.statsExpanded;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Aggregation getAggregation() {
        return this.aggregation;
    }

    public final BenchmarkResultInfo copy(String id, BenchmarkResult benchmarkResult, boolean expanded, boolean basicInfoExpanded, boolean statsExpanded, Aggregation aggregation) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(benchmarkResult, "benchmarkResult");
        Intrinsics.checkNotNullParameter(aggregation, "aggregation");
        return new BenchmarkResultInfo(id, benchmarkResult, expanded, basicInfoExpanded, statsExpanded, aggregation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BenchmarkResultInfo)) {
            return false;
        }
        BenchmarkResultInfo benchmarkResultInfo = (BenchmarkResultInfo) other;
        return Intrinsics.areEqual(this.id, benchmarkResultInfo.id) && Intrinsics.areEqual(this.benchmarkResult, benchmarkResultInfo.benchmarkResult) && this.expanded == benchmarkResultInfo.expanded && this.basicInfoExpanded == benchmarkResultInfo.basicInfoExpanded && this.statsExpanded == benchmarkResultInfo.statsExpanded && this.aggregation == benchmarkResultInfo.aggregation;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.benchmarkResult.hashCode()) * 31) + Boolean.hashCode(this.expanded)) * 31) + Boolean.hashCode(this.basicInfoExpanded)) * 31) + Boolean.hashCode(this.statsExpanded)) * 31) + this.aggregation.hashCode();
    }

    public String toString() {
        return "BenchmarkResultInfo(id=" + this.id + ", benchmarkResult=" + this.benchmarkResult + ", expanded=" + this.expanded + ", basicInfoExpanded=" + this.basicInfoExpanded + ", statsExpanded=" + this.statsExpanded + ", aggregation=" + this.aggregation + ")";
    }

    public BenchmarkResultInfo(String id, BenchmarkResult benchmarkResult, boolean expanded, boolean basicInfoExpanded, boolean statsExpanded, Aggregation aggregation) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(benchmarkResult, "benchmarkResult");
        Intrinsics.checkNotNullParameter(aggregation, "aggregation");
        this.id = id;
        this.benchmarkResult = benchmarkResult;
        this.expanded = expanded;
        this.basicInfoExpanded = basicInfoExpanded;
        this.statsExpanded = statsExpanded;
        this.aggregation = aggregation;
    }

    public /* synthetic */ BenchmarkResultInfo(String str, BenchmarkResult benchmarkResult, boolean z, boolean z2, boolean z3, Aggregation aggregation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, benchmarkResult, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3, (i & 32) != 0 ? Aggregation.AVG : aggregation);
    }

    public final String getId() {
        return this.id;
    }

    public final BenchmarkResult getBenchmarkResult() {
        return this.benchmarkResult;
    }

    public final boolean getExpanded() {
        return this.expanded;
    }

    public final boolean getBasicInfoExpanded() {
        return this.basicInfoExpanded;
    }

    public final boolean getStatsExpanded() {
        return this.statsExpanded;
    }

    public final Aggregation getAggregation() {
        return this.aggregation;
    }
}
