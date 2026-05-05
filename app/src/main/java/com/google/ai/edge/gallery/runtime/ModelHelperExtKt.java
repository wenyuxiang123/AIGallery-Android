package com.google.ai.edge.gallery.runtime;

import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.RuntimeType;
import com.google.ai.edge.gallery.ui.llmchat.LlmChatModelHelper;
import com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



Lcom/google/ai/edge/gallery/runtime/LlmModelHelper;", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class ModelHelperExtKt {
    public static final LlmModelHelper getRuntimeHelper(Model $this$runtimeHelper) {
        Intrinsics.checkNotNullParameter($this$runtimeHelper, "<this>");
        if ($this$runtimeHelper.getRuntimeType() == RuntimeType.AICORE) {
            return AICoreModelHelper.INSTANCE;
        }
        return LlmChatModelHelper.INSTANCE;
    }
}
