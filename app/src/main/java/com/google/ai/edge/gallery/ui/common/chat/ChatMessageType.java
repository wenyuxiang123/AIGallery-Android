package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageType;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "WARNING", "ERROR", "TEXT", "IMAGE", "IMAGE_WITH_HISTORY", "AUDIO_CLIP", "LOADING", "CLASSIFICATION", "CONFIG_VALUES_CHANGE", "BENCHMARK_RESULT", "BENCHMARK_LLM_RESULT", "PROMPT_TEMPLATES", "WEBVIEW", "COLLAPSABLE_PROGRESS_PANEL", "THINKING", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public enum ChatMessageType {
    INFO,
    WARNING,
    ERROR,
    TEXT,
    IMAGE,
    IMAGE_WITH_HISTORY,
    AUDIO_CLIP,
    LOADING,
    CLASSIFICATION,
    CONFIG_VALUES_CHANGE,
    BENCHMARK_RESULT,
    BENCHMARK_LLM_RESULT,
    PROMPT_TEMPLATES,
    WEBVIEW,
    COLLAPSABLE_PROGRESS_PANEL,
    THINKING;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<ChatMessageType> getEntries() {
        return $ENTRIES;
    }
}
