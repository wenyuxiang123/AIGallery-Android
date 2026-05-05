package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m922d2 = {"allLegacyTaskIds", "", "", "isLegacyTasks", "", "id", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class TasksKt {
    private static final Set<String> allLegacyTaskIds = SetsKt.mutableSetOf(BuiltInTaskId.LLM_CHAT, BuiltInTaskId.LLM_PROMPT_LAB, BuiltInTaskId.LLM_ASK_IMAGE, BuiltInTaskId.LLM_ASK_AUDIO, BuiltInTaskId.LLM_AGENT_CHAT);

    public static final boolean isLegacyTasks(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return allLegacyTaskIds.contains(id);
    }
}
