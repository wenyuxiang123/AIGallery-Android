package com.google.ai.edge.gallery.ui.common.chat;

import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;



V", "Info", HttpHeaders.WARNING, "Error", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public enum LogMessageLevel {
    Info,
    Warning,
    Error;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<LogMessageLevel> getEntries() {
        return $ENTRIES;
    }
}
