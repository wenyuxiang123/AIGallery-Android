package com.google.ai.edge.gallery.ui.llmsingleturn;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;



V", "getLabel", "()Ljava/lang/String;", "KEY_BULLET_POINT", "SHORT_PARAGRAPH", "CONCISE_SUMMARY", "HEADLINE_TITLE", "ONE_SENTENCE_SUMMARY", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public enum SummarizationType {
    KEY_BULLET_POINT("Key bullet points (3-5)"),
    SHORT_PARAGRAPH("Short paragraph (1-2 sentences)"),
    CONCISE_SUMMARY("Concise summary (~50 words)"),
    HEADLINE_TITLE("Headline / title"),
    ONE_SENTENCE_SUMMARY("One-sentence summary");

    private final String label;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<SummarizationType> getEntries() {
        return $ENTRIES;
    }

    SummarizationType(String label) {
        this.label = label;
    }

    public final String getLabel() {
        return this.label;
    }
}
