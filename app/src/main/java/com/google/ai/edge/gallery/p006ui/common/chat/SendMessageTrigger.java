package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.data.Model;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/SendMessageTrigger;", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "messages", "", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "<init>", "(Lcom/google/ai/edge/gallery/data/Model;Ljava/util/List;)V", "getModel", "()Lcom/google/ai/edge/gallery/data/Model;", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class SendMessageTrigger {
    public static final int $stable = 8;
    private final List<ChatMessage> messages;
    private final Model model;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendMessageTrigger copy$default(SendMessageTrigger sendMessageTrigger, Model model, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            model = sendMessageTrigger.model;
        }
        if ((i & 2) != 0) {
            list = sendMessageTrigger.messages;
        }
        return sendMessageTrigger.copy(model, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Model getModel() {
        return this.model;
    }

    public final List<ChatMessage> component2() {
        return this.messages;
    }

    public final SendMessageTrigger copy(Model model, List<? extends ChatMessage> messages) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new SendMessageTrigger(model, messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMessageTrigger)) {
            return false;
        }
        SendMessageTrigger sendMessageTrigger = (SendMessageTrigger) other;
        return Intrinsics.areEqual(this.model, sendMessageTrigger.model) && Intrinsics.areEqual(this.messages, sendMessageTrigger.messages);
    }

    public int hashCode() {
        return (this.model.hashCode() * 31) + this.messages.hashCode();
    }

    public String toString() {
        return "SendMessageTrigger(model=" + this.model + ", messages=" + this.messages + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SendMessageTrigger(Model model, List<? extends ChatMessage> messages) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.model = model;
        this.messages = messages;
    }

    public final List<ChatMessage> getMessages() {
        return this.messages;
    }

    public final Model getModel() {
        return this.model;
    }
}
