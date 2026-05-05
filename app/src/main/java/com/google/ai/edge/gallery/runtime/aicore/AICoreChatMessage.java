package com.google.ai.edge.gallery.runtime.aicore;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AICoreModelHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m921d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m922d2 = {"Lcom/google/ai/edge/gallery/runtime/aicore/AICoreChatMessage;", "", "isUser", "", "text", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsUser() {
        return this.isUser;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
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
