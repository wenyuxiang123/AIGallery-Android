package com.google.ai.edge.gallery;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;



V", "getId", "()Ljava/lang/String;", "CAPABILITY_SELECT", "MODEL_DOWNLOAD", "GENERATE_ACTION", "BUTTON_CLICKED", "SKILL_MANAGEMENT", "SKILL_EXECUTION", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public enum GalleryEvent {
    CAPABILITY_SELECT("capability_select"),
    MODEL_DOWNLOAD("model_download"),
    GENERATE_ACTION("generate_action"),
    BUTTON_CLICKED("button_clicked"),
    SKILL_MANAGEMENT("skill_management"),
    SKILL_EXECUTION("skill_execution");

    private final String id;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<GalleryEvent> getEntries() {
        return $ENTRIES;
    }

    GalleryEvent(String id) {
        this.id = id;
    }

    public final String getId() {
        return this.id;
    }
}
