package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.litertlm.Tool;
import com.google.ai.edge.litertlm.ToolParam;
import com.google.ai.edge.litertlm.ToolSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TinyGardenTools.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m921d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B*\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007J.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\u000f2\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenTools;", "Lcom/google/ai/edge/litertlm/ToolSet;", "onFunctionCalled", "Lkotlin/Function1;", "Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenCommand;", "Lkotlin/ParameterName;", "name", "command", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnFunctionCalled", "()Lkotlin/jvm/functions/Function1;", "waterPlots", "", "", "", "plots", "", "", "plantSeed", "seed", "harvestPlots", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class TinyGardenTools implements ToolSet {
    public static final int $stable = 0;
    private final Function1<TinyGardenCommand, Unit> onFunctionCalled;

    /* JADX WARN: Multi-variable type inference failed */
    public TinyGardenTools(Function1<? super TinyGardenCommand, Unit> onFunctionCalled) {
        Intrinsics.checkNotNullParameter(onFunctionCalled, "onFunctionCalled");
        this.onFunctionCalled = onFunctionCalled;
    }

    public final Function1<TinyGardenCommand, Unit> getOnFunctionCalled() {
        return this.onFunctionCalled;
    }

    @Tool(description = "Water one or more garden plots.")
    public final Map<String, Object> waterPlots(@ToolParam(description = "The IDs of the plots to water.") List<Integer> plots) {
        Intrinsics.checkNotNullParameter(plots, "plots");
        Log.d("AGTGTools", "waterPlots. Plots=" + plots);
        this.onFunctionCalled.invoke(new TinyGardenCommand(TinyGardenItem.WATERING_CAN.ordinal() + 1, plots, 0L, 4, null));
        return MapsKt.mapOf(TuplesKt.m929to("result", FirebaseAnalytics.Param.SUCCESS), TuplesKt.m929to("plots", plots));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    @com.google.ai.edge.litertlm.Tool(description = "Plant a seed in one or more garden plots.")
    /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
    public final java.util.Map<java.lang.String, java.lang.Object> plantSeed(@com.google.ai.edge.litertlm.ToolParam(description = "The name of the seed to plant.") java.lang.String r14, @com.google.ai.edge.litertlm.ToolParam(description = "The IDs of the plots to plant a seed in.") java.util.List<java.lang.Integer> r15) {
        /*
    public final java.util.Map<java.lang.String, java.lang.Object> plantSeed(@com.google.ai.edge.litertlm.ToolParam(description = "The name of the seed to plant.") java.lang.String r14, @com.google.ai.edge.litertlm.ToolParam(description = "The IDs of the plots to plant a seed in.") java.util.List<java.lang.Integer> r15) {
            // Method dump skipped - placeholder implementation
            return 0;
        }

    @Tool(description = "Harvest one or more garden plots.")
    public final Map<String, Object> harvestPlots(@ToolParam(description = "The IDs of the plots to harvest.") List<Integer> plots) {
        Intrinsics.checkNotNullParameter(plots, "plots");
        Log.d("AGTGTools", "harvestPlots. Plots=" + plots);
        this.onFunctionCalled.invoke(new TinyGardenCommand(TinyGardenItem.SCYTHE.ordinal() + 1, plots, 0L, 4, null));
        return MapsKt.mapOf(TuplesKt.m929to("result", FirebaseAnalytics.Param.SUCCESS), TuplesKt.m929to("plots", plots));
    }
}
}
