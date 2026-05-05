package com.google.ai.edge.gallery.data;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;




public final class TasksKt {
    private static final Set<String> allLegacyTaskIds = SetsKt.mutableSetOf(BuiltInTaskId.LLM_CHAT, BuiltInTaskId.LLM_PROMPT_LAB, BuiltInTaskId.LLM_ASK_IMAGE, BuiltInTaskId.LLM_ASK_AUDIO, BuiltInTaskId.LLM_AGENT_CHAT);

    public static final boolean isLegacyTasks(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return allLegacyTaskIds.contains(id);
    }
}
