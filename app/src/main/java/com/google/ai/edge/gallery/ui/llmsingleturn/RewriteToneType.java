package com.google.ai.edge.gallery.ui.llmsingleturn;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;



V", "getLabel", "()Ljava/lang/String;", "FORMAL", "CASUAL", "FRIENDLY", "POLITE", "ENTHUSIASTIC", "CONCISE", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public enum RewriteToneType {
    FORMAL("Formal"),
    CASUAL("Casual"),
    FRIENDLY("Friendly"),
    POLITE("Polite"),
    ENTHUSIASTIC("Enthusiastic"),
    CONCISE("Concise");

    private final String label;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<RewriteToneType> getEntries() {
        return $ENTRIES;
    }

    RewriteToneType(String label) {
        this.label = label;
    }

    public final String getLabel() {
        return this.label;
    }
}
