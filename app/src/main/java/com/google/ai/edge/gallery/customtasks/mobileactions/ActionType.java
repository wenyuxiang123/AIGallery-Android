package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Actions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_FLASHLIGHT_ON", "ACTION_FLASHLIGHT_OFF", "ACTION_CREATE_CONTACT", "ACTION_SEND_EMAIL", "ACTION_SHOW_LOCATION_ON_MAP", "ACTION_OPEN_WIFI_SETTINGS", "ACTION_CREATE_CALENDAR_EVENT", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public enum ActionType {
    ACTION_FLASHLIGHT_ON,
    ACTION_FLASHLIGHT_OFF,
    ACTION_CREATE_CONTACT,
    ACTION_SEND_EMAIL,
    ACTION_SHOW_LOCATION_ON_MAP,
    ACTION_OPEN_WIFI_SETTINGS,
    ACTION_CREATE_CALENDAR_EVENT;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<ActionType> getEntries() {
        return $ENTRIES;
    }
}
