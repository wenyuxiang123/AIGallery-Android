package com.google.ai.edge.gallery.ui.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* JADX INFO: compiled from: ConfigDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/Tab;", "", "labelResId", "", "<init>", "(I)V", "getLabelResId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
final /* data */ class Tab {
    private final int labelResId;

    public static /* synthetic */ Tab copy$default(Tab tab, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tab.labelResId;
        }
        return tab.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLabelResId() {
        return this.labelResId;
    }

    public final Tab copy(int labelResId) {
        return new Tab(labelResId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Tab) && this.labelResId == ((Tab) other).labelResId;
    }

    public int hashCode() {
        return Integer.hashCode(this.labelResId);
    }

    public String toString() {
        return "Tab(labelResId=" + this.labelResId + ")";
    }

    public Tab(int labelResId) {
        this.labelResId = labelResId;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }
}
