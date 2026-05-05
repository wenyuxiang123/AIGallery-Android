package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/Histogram;", "", "buckets", "", "", "maxCount", "highlightBucketIndex", "<init>", "(Ljava/util/List;II)V", "getBuckets", "()Ljava/util/List;", "getMaxCount", "()I", "getHighlightBucketIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
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
