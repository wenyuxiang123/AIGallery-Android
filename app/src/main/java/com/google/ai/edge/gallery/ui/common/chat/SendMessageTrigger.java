package com.google.ai.edge.gallery.ui.common.chat;

import com.google.ai.edge.gallery.data.Model;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getModel", "()Lcom/google/ai/edge/gallery/data/Model;", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
