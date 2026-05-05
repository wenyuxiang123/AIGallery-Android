package com.google.ai.edge.gallery.ui.llmsingleturn;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;



V", "getLabel", "()Ljava/lang/String;", "TONE", "STYLE", "LANGUAGE", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public enum InputEditorLabel {
    TONE("Tone"),
    STYLE("Style"),
    LANGUAGE("Language");

    private final String label;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<InputEditorLabel> getEntries() {
        return $ENTRIES;
    }

    InputEditorLabel(String label) {
        this.label = label;
    }

    public final String getLabel() {
        return this.label;
    }
}
