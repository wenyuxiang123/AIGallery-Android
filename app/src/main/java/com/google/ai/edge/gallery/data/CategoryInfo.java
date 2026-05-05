package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Categories.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/CategoryInfo;", "", "id", "", "labelStringRes", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLabelStringRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLabel", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/google/ai/edge/gallery/data/CategoryInfo;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class CategoryInfo {
    public static final int $stable = 0;
    private final String id;
    private final String label;
    private final Integer labelStringRes;

    public static /* synthetic */ CategoryInfo copy$default(CategoryInfo categoryInfo, String str, Integer num, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = categoryInfo.id;
        }
        if ((i & 2) != 0) {
            num = categoryInfo.labelStringRes;
        }
        if ((i & 4) != 0) {
            str2 = categoryInfo.label;
        }
        return categoryInfo.copy(str, num, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getLabelStringRes() {
        return this.labelStringRes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final CategoryInfo copy(String id, Integer labelStringRes, String label) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new CategoryInfo(id, labelStringRes, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryInfo)) {
            return false;
        }
        CategoryInfo categoryInfo = (CategoryInfo) other;
        return Intrinsics.areEqual(this.id, categoryInfo.id) && Intrinsics.areEqual(this.labelStringRes, categoryInfo.labelStringRes) && Intrinsics.areEqual(this.label, categoryInfo.label);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + (this.labelStringRes == null ? 0 : this.labelStringRes.hashCode())) * 31) + (this.label != null ? this.label.hashCode() : 0);
    }

    public String toString() {
        return "CategoryInfo(id=" + this.id + ", labelStringRes=" + this.labelStringRes + ", label=" + this.label + ")";
    }

    public CategoryInfo(String id, Integer labelStringRes, String label) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.labelStringRes = labelStringRes;
        this.label = label;
    }

    public /* synthetic */ CategoryInfo(String str, Integer num, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2);
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getLabelStringRes() {
        return this.labelStringRes;
    }

    public final String getLabel() {
        return this.label;
    }
}
