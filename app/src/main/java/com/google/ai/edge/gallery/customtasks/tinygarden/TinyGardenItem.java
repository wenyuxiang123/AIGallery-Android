package com.google.ai.edge.gallery.customtasks.tinygarden;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;



V", "getLabel", "()Ljava/lang/String;", "SUNFLOWER", "DAISY", "ROSE", "SPECIAL", "WATERING_CAN", "SCYTHE", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public enum TinyGardenItem {
    SUNFLOWER("sunflower"),
    DAISY("daisy"),
    ROSE("rose"),
    SPECIAL("secret"),
    WATERING_CAN("water"),
    SCYTHE("harvest");

    private final String label;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<TinyGardenItem> getEntries() {
        return $ENTRIES;
    }

    TinyGardenItem(String label) {
        this.label = label;
    }

    public final String getLabel() {
        return this.label;
    }
}
