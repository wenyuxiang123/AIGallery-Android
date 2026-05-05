package com.google.ai.edge.gallery.ui.common.chat;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getBuckets", "()Ljava/util/List;", "getMaxCount", "()I", "getHighlightBucketIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class Histogram {
    public static final int $stable = 8;
    private final List<Integer> buckets;
    private final int highlightBucketIndex;
    private final int maxCount;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Histogram copy$default(Histogram histogram, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = histogram.buckets;
        }
        if ((i3 & 2) != 0) {
            i = histogram.maxCount;
        }
        if ((i3 & 4) != 0) {
            i2 = histogram.highlightBucketIndex;
        }
        return histogram.copy(list, i, i2);
    }

    public final List<Integer> component1() {
        return this.buckets;
    }

    
    public final int getMaxCount() {
        return this.maxCount;
    }

    
    public final int getHighlightBucketIndex() {
        return this.highlightBucketIndex;
    }

    public final Histogram copy(List<Integer> buckets, int maxCount, int highlightBucketIndex) {
        Intrinsics.checkNotNullParameter(buckets, "buckets");
        return new Histogram(buckets, maxCount, highlightBucketIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Histogram)) {
            return false;
        }
        Histogram histogram = (Histogram) other;
        return Intrinsics.areEqual(this.buckets, histogram.buckets) && this.maxCount == histogram.maxCount && this.highlightBucketIndex == histogram.highlightBucketIndex;
    }

    public int hashCode() {
        return (((this.buckets.hashCode() * 31) + Integer.hashCode(this.maxCount)) * 31) + Integer.hashCode(this.highlightBucketIndex);
    }

    public String toString() {
        return "Histogram(buckets=" + this.buckets + ", maxCount=" + this.maxCount + ", highlightBucketIndex=" + this.highlightBucketIndex + ")";
    }

    public Histogram(List<Integer> buckets, int maxCount, int highlightBucketIndex) {
        Intrinsics.checkNotNullParameter(buckets, "buckets");
        this.buckets = buckets;
        this.maxCount = maxCount;
        this.highlightBucketIndex = highlightBucketIndex;
    }

    public /* synthetic */ Histogram(List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, (i3 & 4) != 0 ? -1 : i2);
    }

    public final List<Integer> getBuckets() {
        return this.buckets;
    }

    public final int getHighlightBucketIndex() {
        return this.highlightBucketIndex;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }
}
