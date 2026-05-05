package com.google.ai.edge.gallery.ui.benchmark;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;



V", "getLabel", "()Ljava/lang/String;", "AVG", "MEDIAN", "MIN", "MAX", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public enum Aggregation {
    AVG("avg"),
    MEDIAN("median"),
    MIN("min"),
    MAX("max");

    private final String label;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<Aggregation> getEntries() {
        return $ENTRIES;
    }

    Aggregation(String label) {
        this.label = label;
    }

    public final String getLabel() {
        return this.label;
    }
}
