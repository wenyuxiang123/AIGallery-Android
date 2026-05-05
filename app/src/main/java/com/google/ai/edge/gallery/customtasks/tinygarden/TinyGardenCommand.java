package com.google.ai.edge.gallery.customtasks.tinygarden;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getItem", "()I", "getPlots", "()Ljava/util/List;", "getTs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class TinyGardenCommand {
    public static final int $stable = 8;
    private final int item;
    private final List<Integer> plots;
    private final long ts;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TinyGardenCommand copy$default(TinyGardenCommand tinyGardenCommand, int i, List list, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tinyGardenCommand.item;
        }
        if ((i2 & 2) != 0) {
            list = tinyGardenCommand.plots;
        }
        if ((i2 & 4) != 0) {
            j = tinyGardenCommand.ts;
        }
        return tinyGardenCommand.copy(i, list, j);
    }

    
    public final int getItem() {
        return this.item;
    }

    public final List<Integer> component2() {
        return this.plots;
    }

    
    public final long getTs() {
        return this.ts;
    }

    public final TinyGardenCommand copy(int item, List<Integer> plots, long ts) {
        Intrinsics.checkNotNullParameter(plots, "plots");
        return new TinyGardenCommand(item, plots, ts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TinyGardenCommand)) {
            return false;
        }
        TinyGardenCommand tinyGardenCommand = (TinyGardenCommand) other;
        return this.item == tinyGardenCommand.item && Intrinsics.areEqual(this.plots, tinyGardenCommand.plots) && this.ts == tinyGardenCommand.ts;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.item) * 31) + this.plots.hashCode()) * 31) + Long.hashCode(this.ts);
    }

    public String toString() {
        return "TinyGardenCommand(item=" + this.item + ", plots=" + this.plots + ", ts=" + this.ts + ")";
    }

    public TinyGardenCommand(int item, List<Integer> plots, long ts) {
        Intrinsics.checkNotNullParameter(plots, "plots");
        this.item = item;
        this.plots = plots;
        this.ts = ts;
    }

    public /* synthetic */ TinyGardenCommand(int i, List list, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i2 & 4) != 0 ? System.currentTimeMillis() : j);
    }

    public final int getItem() {
        return this.item;
    }

    public final List<Integer> getPlots() {
        return this.plots;
    }

    public final long getTs() {
        return this.ts;
    }
}
