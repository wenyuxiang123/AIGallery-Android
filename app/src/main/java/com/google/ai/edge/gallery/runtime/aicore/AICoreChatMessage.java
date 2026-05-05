package com.google.ai.edge.gallery.runtime.aicore;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class AICoreChatMessage {
    public static final int $stable = 0;
    private final boolean isUser;
    private final String text;

    public static /* synthetic */ AICoreChatMessage copy$default(AICoreChatMessage aICoreChatMessage, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aICoreChatMessage.isUser;
        }
        if ((i & 2) != 0) {
            str = aICoreChatMessage.text;
        }
        return aICoreChatMessage.copy(z, str);
    }

    
    public final boolean getIsUser() {
        return this.isUser;
    }

    
    public final String getText() {
        return this.text;
    }

    public final AICoreChatMessage copy(boolean isUser, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new AICoreChatMessage(isUser, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AICoreChatMessage)) {
            return false;
        }
        AICoreChatMessage aICoreChatMessage = (AICoreChatMessage) other;
        return this.isUser == aICoreChatMessage.isUser && Intrinsics.areEqual(this.text, aICoreChatMessage.text);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isUser) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "AICoreChatMessage(isUser=" + this.isUser + ", text=" + this.text + ")";
    }

    public AICoreChatMessage(boolean isUser, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.isUser = isUser;
        this.text = text;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isUser() {
        return this.isUser;
    }
}
