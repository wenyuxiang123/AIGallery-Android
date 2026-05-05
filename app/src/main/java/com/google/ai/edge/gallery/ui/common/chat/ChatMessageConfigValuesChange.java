package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.data.Model;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageConfigValuesChange;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "oldValues", "", "", "", "newValues", "<init>", "(Lcom/google/ai/edge/gallery/data/Model;Ljava/util/Map;Ljava/util/Map;)V", "getModel", "()Lcom/google/ai/edge/gallery/data/Model;", "getOldValues", "()Ljava/util/Map;", "getNewValues", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageConfigValuesChange extends ChatMessage {
    public static final int $stable = 8;
    private final Model model;
    private final Map<String, Object> newValues;
    private final Map<String, Object> oldValues;

    public final Model getModel() {
        return this.model;
    }

    public final Map<String, Object> getOldValues() {
        return this.oldValues;
    }

    public final Map<String, Object> getNewValues() {
        return this.newValues;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageConfigValuesChange(Model model, Map<String, ? extends Object> oldValues, Map<String, ? extends Object> newValues) {
        super(ChatMessageType.CONFIG_VALUES_CHANGE, ChatSide.SYSTEM, 0.0f, null, false, false, 60, null);
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(oldValues, "oldValues");
        Intrinsics.checkNotNullParameter(newValues, "newValues");
        this.model = model;
        this.oldValues = oldValues;
        this.newValues = newValues;
    }
}
