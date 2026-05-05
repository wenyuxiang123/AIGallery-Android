package com.google.ai.edge.gallery.data;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class BottomSheetSelectorItem {
    public static final int $stable = 0;
    private final String label;

    public static /* synthetic */ BottomSheetSelectorItem copy$default(BottomSheetSelectorItem bottomSheetSelectorItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bottomSheetSelectorItem.label;
        }
        return bottomSheetSelectorItem.copy(str);
    }

    
    public final String getLabel() {
        return this.label;
    }

    public final BottomSheetSelectorItem copy(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new BottomSheetSelectorItem(label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BottomSheetSelectorItem) && Intrinsics.areEqual(this.label, ((BottomSheetSelectorItem) other).label);
    }

    public int hashCode() {
        return this.label.hashCode();
    }

    public String toString() {
        return "BottomSheetSelectorItem(label=" + this.label + ")";
    }

    public BottomSheetSelectorItem(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
    }

    public final String getLabel() {
        return this.label;
    }
}
