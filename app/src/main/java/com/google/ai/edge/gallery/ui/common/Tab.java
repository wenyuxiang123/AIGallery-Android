package com.google.ai.edge.gallery.ui.common;

import kotlin.Metadata;



V", "getLabelResId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
final /* data */ class Tab {
    private final int labelResId;

    public static /* synthetic */ Tab copy$default(Tab tab, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tab.labelResId;
        }
        return tab.copy(i);
    }

    
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
