package com.google.ai.edge.gallery.ui.common.chat;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getTitle", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class ProgressPanelItem {
    public static final int $stable = 0;
    private final String description;
    private final String title;

    public static /* synthetic */ ProgressPanelItem copy$default(ProgressPanelItem progressPanelItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = progressPanelItem.title;
        }
        if ((i & 2) != 0) {
            str2 = progressPanelItem.description;
        }
        return progressPanelItem.copy(str, str2);
    }

    
    public final String getTitle() {
        return this.title;
    }

    
    public final String getDescription() {
        return this.description;
    }

    public final ProgressPanelItem copy(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ProgressPanelItem(title, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressPanelItem)) {
            return false;
        }
        ProgressPanelItem progressPanelItem = (ProgressPanelItem) other;
        return Intrinsics.areEqual(this.title, progressPanelItem.title) && Intrinsics.areEqual(this.description, progressPanelItem.description);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.description.hashCode();
    }

    public String toString() {
        return "ProgressPanelItem(title=" + this.title + ", description=" + this.description + ")";
    }

    public ProgressPanelItem(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.title = title;
        this.description = description;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }
}
