package com.google.ai.edge.gallery.ui.theme;


import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.google.ai.edge.gallery.proto.Theme;
import kotlin.Metadata;



V", "themeOverride", "Landroidx/compose/runtime/MutableState;", "Lcom/google/ai/edge/gallery/proto/Theme;", "getThemeOverride", "()Landroidx/compose/runtime/MutableState;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class ThemeSettings {
    public static final int $stable = 0;
    public static final ThemeSettings INSTANCE = new ThemeSettings();
    private static final MutableState<Theme> themeOverride = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Theme.THEME_AUTO, null, 2, null);

    private ThemeSettings() {
    }

    public final MutableState<Theme> getThemeOverride() {
        return themeOverride;
    }
}
