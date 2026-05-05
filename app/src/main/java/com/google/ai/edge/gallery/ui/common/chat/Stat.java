package com.google.ai.edge.gallery.ui.common.chat;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getId", "()Ljava/lang/String;", "getLabel", "getUnit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class Stat {
    public static final int $stable = 0;
    private final String id;
    private final String label;
    private final String unit;

    public static /* synthetic */ Stat copy$default(Stat stat, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stat.id;
        }
        if ((i & 2) != 0) {
            str2 = stat.label;
        }
        if ((i & 4) != 0) {
            str3 = stat.unit;
        }
        return stat.copy(str, str2, str3);
    }

    
    public final String getId() {
        return this.id;
    }

    
    public final String getLabel() {
        return this.label;
    }

    
    public final String getUnit() {
        return this.unit;
    }

    public final Stat copy(String id, String label, String unit) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new Stat(id, label, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stat)) {
            return false;
        }
        Stat stat = (Stat) other;
        return Intrinsics.areEqual(this.id, stat.id) && Intrinsics.areEqual(this.label, stat.label) && Intrinsics.areEqual(this.unit, stat.unit);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + this.unit.hashCode();
    }

    public String toString() {
        return "Stat(id=" + this.id + ", label=" + this.label + ", unit=" + this.unit + ")";
    }

    public Stat(String id, String label, String unit) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.id = id;
        this.label = label;
        this.unit = unit;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUnit() {
        return this.unit;
    }
}
