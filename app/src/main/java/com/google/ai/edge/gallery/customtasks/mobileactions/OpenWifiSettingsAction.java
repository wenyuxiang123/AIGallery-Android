package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.WifiKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: Actions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/OpenWifiSettingsAction;", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/Action;", "<init>", "()V", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class OpenWifiSettingsAction extends Action {
    public static final int $stable = 8;

    public OpenWifiSettingsAction() {
        super(ActionType.ACTION_OPEN_WIFI_SETTINGS, WifiKt.getWifi(Icons.Outlined.INSTANCE), new FunctionCallDetails("openWifiSettings", CollectionsKt.emptyList(), 0L, 4, null));
    }
}
