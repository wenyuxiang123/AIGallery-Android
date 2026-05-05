package com.google.ai.edge.gallery.p006ui.common;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ColorUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m922d2 = {"getTaskBgColor", "Landroidx/compose/ui/graphics/Color;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "(Lcom/google/ai/edge/gallery/data/Task;Landroidx/compose/runtime/Composer;I)J", "getTaskBgGradientColors", "", "(Lcom/google/ai/edge/gallery/data/Task;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "getTaskIconColor", FirebaseAnalytics.Param.INDEX, "", "(ILandroidx/compose/runtime/Composer;I)J", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ColorUtilsKt {
    public static final long getTaskBgColor(Task task, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(task, "task");
        ComposerKt.sourceInformationMarkerStart($composer, -394086825, "C(getTaskBgColor)26@997L12,27@1051L12:ColorUtils.kt#t7sjiu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-394086825, $changed, -1, "com.google.ai.edge.gallery.ui.common.getTaskBgColor (ColorUtils.kt:25)");
        }
        int colorIndex = RangesKt.coerceAtLeast(task.getIndex(), 0) % ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).getTaskBgColors().size();
        long jM6925unboximpl = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).getTaskBgColors().get(colorIndex).m6925unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return jM6925unboximpl;
    }

    public static final List<Color> getTaskBgGradientColors(Task task, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(task, "task");
        ComposerKt.sourceInformationMarkerStart($composer, -268650163, "C(getTaskBgGradientColors)32@1229L12,33@1283L12:ColorUtils.kt#t7sjiu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-268650163, $changed, -1, "com.google.ai.edge.gallery.ui.common.getTaskBgGradientColors (ColorUtils.kt:31)");
        }
        int colorIndex = RangesKt.coerceAtLeast(task.getIndex(), 0) % ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).getTaskBgColors().size();
        List<Color> list = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).getTaskBgGradientColors().get(colorIndex);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return list;
    }

    public static final long getTaskIconColor(Task task, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(task, "task");
        ComposerKt.sourceInformationMarkerStart($composer, -1753380533, "C(getTaskIconColor)39@1460L12,40@1516L12:ColorUtils.kt#t7sjiu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1753380533, $changed, -1, "com.google.ai.edge.gallery.ui.common.getTaskIconColor (ColorUtils.kt:37)");
        }
        int colorIndex = RangesKt.coerceAtLeast(task.getIndex(), 0) % ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).getTaskIconColors().size();
        long jM6925unboximpl = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).getTaskIconColors().get(colorIndex).m6925unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return jM6925unboximpl;
    }

    public static final long getTaskIconColor(int index, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -674671873, "C(getTaskIconColor)45@1678L12,46@1734L12:ColorUtils.kt#t7sjiu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-674671873, $changed, -1, "com.google.ai.edge.gallery.ui.common.getTaskIconColor (ColorUtils.kt:44)");
        }
        int colorIndex = RangesKt.coerceAtLeast(index, 0) % ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).getTaskIconColors().size();
        long jM6925unboximpl = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).getTaskIconColors().get(colorIndex).m6925unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return jM6925unboximpl;
    }
}
