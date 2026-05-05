package com.google.ai.edge.gallery.ui.home;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.C2421R;
import kotlin.Metadata;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/home/HomeScreenDestination;", "", "<init>", "()V", "titleRes", "", "getTitleRes", "()I", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
final class HomeScreenDestination {
    public static final HomeScreenDestination INSTANCE = new HomeScreenDestination();
    private static final int titleRes = C2421R.string.app_name;

    private HomeScreenDestination() {
    }

    public final int getTitleRes() {
        return titleRes;
    }
}
