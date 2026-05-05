package com.google.ai.edge.gallery.ui.llmsingleturn;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: PromptTemplateConfigs.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m921d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/llmsingleturn/SummarizationType;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "KEY_BULLET_POINT", "SHORT_PARAGRAPH", "CONCISE_SUMMARY", "HEADLINE_TITLE", "ONE_SENTENCE_SUMMARY", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
