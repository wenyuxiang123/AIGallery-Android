package com.google.ai.edge.gallery.ui.benchmark;

import com.google.ai.edge.gallery.proto.BenchmarkResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getId", "()Ljava/lang/String;", "getBenchmarkResult", "()Lcom/google/ai/edge/gallery/proto/BenchmarkResult;", "getExpanded", "()Z", "getBasicInfoExpanded", "getStatsExpanded", "getAggregation", "()Lcom/google/ai/edge/gallery/ui/benchmark/Aggregation;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
