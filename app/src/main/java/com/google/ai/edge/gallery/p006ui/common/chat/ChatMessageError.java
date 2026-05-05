package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageError;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", FirebaseAnalytics.Param.CONTENT, "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageError extends ChatMessage {
    public static final int $stable = 0;
    private final String content;

    public final String getContent() {
        return this.content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageError(String content) {
        super(ChatMessageType.ERROR, ChatSide.SYSTEM, 0.0f, null, false, false, 60, null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }
}
