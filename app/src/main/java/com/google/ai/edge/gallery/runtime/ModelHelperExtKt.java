package com.google.ai.edge.gallery.runtime;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.RuntimeType;
import com.google.ai.edge.gallery.ui.llmchat.LlmChatModelHelper;
import com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelHelperExt.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m922d2 = {"runtimeHelper", "Lcom/google/ai/edge/gallery/runtime/LlmModelHelper;", "Lcom/google/ai/edge/gallery/data/Model;", "getRuntimeHelper", "(Lcom/google/ai/edge/gallery/data/Model;)Lcom/google/ai/edge/gallery/runtime/LlmModelHelper;", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ModelHelperExtKt {
    public static final LlmModelHelper getRuntimeHelper(Model $this$runtimeHelper) {
        Intrinsics.checkNotNullParameter($this$runtimeHelper, "<this>");
        if ($this$runtimeHelper.getRuntimeType() == RuntimeType.AICORE) {
            return AICoreModelHelper.INSTANCE;
        }
        return LlmChatModelHelper.INSTANCE;
    }
}
