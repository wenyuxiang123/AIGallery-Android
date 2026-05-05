package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.p000ui.graphics.vector.ImageVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getLabelResId", "()I", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
final /* data */ class Tab {
    private final ImageVector icon;
    private final int labelResId;

    public static /* synthetic */ Tab copy$default(Tab tab, int i, ImageVector imageVector, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tab.labelResId;
        }
        if ((i2 & 2) != 0) {
            imageVector = tab.icon;
        }
        return tab.copy(i, imageVector);
    }

    
    public final int getLabelResId() {
        return this.labelResId;
    }

    
    public final ImageVector getIcon() {
        return this.icon;
    }

    public final Tab copy(int labelResId, ImageVector icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new Tab(labelResId, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) other;
        return this.labelResId == tab.labelResId && Intrinsics.areEqual(this.icon, tab.icon);
    }

    public int hashCode() {
        return (Integer.hashCode(this.labelResId) * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "Tab(labelResId=" + this.labelResId + ", icon=" + this.icon + ")";
    }

    public Tab(int labelResId, ImageVector icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.labelResId = labelResId;
        this.icon = icon;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }
}
