package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.litertlm.Tool;
import com.google.ai.edge.litertlm.ToolParam;
import com.google.ai.edge.litertlm.ToolSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class TinyGardenTools implements ToolSet {
    private final Function1<TinyGardenCommand, Unit> onFunctionCalled;

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
        return MapsKt.mapOf(new kotlin.Tuples<>("result", FirebaseAnalytics.Param.SUCCESS), new kotlin.Tuples<>("plots", plots));
    }

    @com.google.ai.edge.litertlm.Tool(description = "Plant a seed in one or more garden plots.")
    public final Map<String, Object> plantSeed(@com.google.ai.edge.litertlm.ToolParam(description = "The name of the seed to plant.") String seed, @com.google.ai.edge.litertlm.ToolParam(description = "The IDs of the plots to plant a seed in.") List<Integer> plots) {
        Intrinsics.checkNotNullParameter(seed, "seed");
        Intrinsics.checkNotNullParameter(plots, "plots");
        Log.d("AGTGTools", "plantSeed. Seed=" + seed + ", Plots=" + plots);
        this.onFunctionCalled.invoke(new TinyGardenCommand(TinyGardenItem.getSeedType(seed), plots, 0L, 4, null));
        return MapsKt.mapOf(new kotlin.Tuples<>("result", FirebaseAnalytics.Param.SUCCESS), new kotlin.Tuples<>("plots", plots));
    }

    @Tool(description = "Harvest one or more garden plots.")
    public final Map<String, Object> harvestPlots(@ToolParam(description = "The IDs of the plots to harvest.") List<Integer> plots) {
        Intrinsics.checkNotNullParameter(plots, "plots");
        Log.d("AGTGTools", "harvestPlots. Plots=" + plots);
        this.onFunctionCalled.invoke(new TinyGardenCommand(TinyGardenItem.SCYTHE.ordinal() + 1, plots, 0L, 4, null));
        return MapsKt.mapOf(new kotlin.Tuples<>("result", FirebaseAnalytics.Param.SUCCESS), new kotlin.Tuples<>("plots", plots));
    }
}
