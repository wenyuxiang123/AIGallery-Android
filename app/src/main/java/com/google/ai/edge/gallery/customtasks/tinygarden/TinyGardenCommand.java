package com.google.ai.edge.gallery.customtasks.tinygarden;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TinyGardenTools.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m921d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenCommand;", "", "item", "", "plots", "", "ts", "", "<init>", "(ILjava/util/List;J)V", "getItem", "()I", "getPlots", "()Ljava/util/List;", "getTs", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getItem() {
        return this.item;
    }

    public final List<Integer> component2() {
        return this.plots;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
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
