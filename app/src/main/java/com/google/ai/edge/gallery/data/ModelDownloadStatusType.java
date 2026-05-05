package com.google.ai.edge.gallery.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;



V", "NOT_DOWNLOADED", "PARTIALLY_DOWNLOADED", "IN_PROGRESS", "UNZIPPING", "SUCCEEDED", "FAILED", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public enum ModelDownloadStatusType {
    NOT_DOWNLOADED,
    PARTIALLY_DOWNLOADED,
    IN_PROGRESS,
    UNZIPPING,
    SUCCEEDED,
    FAILED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<ModelDownloadStatusType> getEntries() {
        return $ENTRIES;
    }
}
