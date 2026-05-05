package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.util.Log;
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



V", "getOnFunctionCalled", "()Lkotlin/jvm/functions/Function1;", "waterPlots", "", "", "", "plots", "", "", "plantSeed", "seed", "harvestPlots", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> plantSeed(@com.google.ai.edge.litertlm.ToolParam(description = "The name of the seed to plant.") java.lang.String r14, @com.google.ai.edge.litertlm.ToolParam(description = "The IDs of the plots to plant a seed in.") java.util.List<java.lang.Integer> r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenTools.plantSeed(java.lang.String, java.util.List):java.util.Map");
    }

    @Tool(description = "Harvest one or more garden plots.")
    public final Map<String, Object> harvestPlots(@ToolParam(description = "The IDs of the plots to harvest.") List<Integer> plots) {
        Intrinsics.checkNotNullParameter(plots, "plots");
        Log.d("AGTGTools", "harvestPlots. Plots=" + plots);
        this.onFunctionCalled.invoke(new TinyGardenCommand(TinyGardenItem.SCYTHE.ordinal() + 1, plots, 0L, 4, null));
        return MapsKt.mapOf(TuplesKt.m929to("result", FirebaseAnalytics.Param.SUCCESS), TuplesKt.m929to("plots", plots));
    }
}
