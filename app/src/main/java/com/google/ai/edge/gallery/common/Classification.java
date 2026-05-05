package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/Classification;", "", Constants.ScionAnalytics.PARAM_LABEL, "", FirebaseAnalytics.Param.SCORE, "", "color", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;FJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLabel", "()Ljava/lang/String;", "getScore", "()F", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component3-0d7_KjU", "copy", "copy-mxwnekA", "(Ljava/lang/String;FJ)Lcom/google/ai/edge/gallery/common/Classification;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class Classification {
    public static final int $stable = 0;
    private final long color;
    private final String label;
    private final float score;

    public /* synthetic */ Classification(String str, float f, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, j);
    }

    /* JADX INFO: renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ Classification m10366copymxwnekA$default(Classification classification, String str, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = classification.label;
        }
        if ((i & 2) != 0) {
            f = classification.score;
        }
        if ((i & 4) != 0) {
            j = classification.color;
        }
        return classification.m10368copymxwnekA(str, f, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: copy-mxwnekA, reason: not valid java name */
    public final Classification m10368copymxwnekA(String label, float score, long color) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new Classification(label, score, color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Classification)) {
            return false;
        }
        Classification classification = (Classification) other;
        return Intrinsics.areEqual(this.label, classification.label) && Float.compare(this.score, classification.score) == 0 && Color.m6916equalsimpl0(this.color, classification.color);
    }

    public int hashCode() {
        return (((this.label.hashCode() * 31) + Float.hashCode(this.score)) * 31) + Color.m6922hashCodeimpl(this.color);
    }

    public String toString() {
        return "Classification(label=" + this.label + ", score=" + this.score + ", color=" + Color.m6923toStringimpl(this.color) + ")";
    }

    private Classification(String label, float score, long color) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.score = score;
        this.color = color;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m10369getColor0d7_KjU() {
        return this.color;
    }

    public final String getLabel() {
        return this.label;
    }

    public final float getScore() {
        return this.score;
    }
}
