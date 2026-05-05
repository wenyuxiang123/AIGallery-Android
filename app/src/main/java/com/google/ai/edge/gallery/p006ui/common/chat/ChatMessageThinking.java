package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0000H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageThinking;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", FirebaseAnalytics.Param.CONTENT, "", "inProgress", "", "side", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "hideSenderLabel", "accelerator", "<init>", "(Ljava/lang/String;ZLcom/google/ai/edge/gallery/ui/common/chat/ChatSide;ZLjava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getInProgress", "()Z", "getSide", "()Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "getHideSenderLabel", "getAccelerator", "clone", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageThinking extends ChatMessage {
    public static final int $stable = 0;
    private final String accelerator;
    private final String content;
    private final boolean hideSenderLabel;
    private final boolean inProgress;
    private final ChatSide side;

    public /* synthetic */ ChatMessageThinking(String str, boolean z, ChatSide chatSide, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? ChatSide.AGENT : chatSide, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "" : str2);
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean getInProgress() {
        return this.inProgress;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatSide getSide() {
        return this.side;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public boolean getHideSenderLabel() {
        return this.hideSenderLabel;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public String getAccelerator() {
        return this.accelerator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageThinking(String content, boolean inProgress, ChatSide side, boolean hideSenderLabel, String accelerator) {
        super(ChatMessageType.THINKING, side, 0.0f, accelerator, hideSenderLabel, true, 4, null);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(accelerator, "accelerator");
        this.content = content;
        this.inProgress = inProgress;
        this.side = side;
        this.hideSenderLabel = hideSenderLabel;
        this.accelerator = accelerator;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatMessageThinking clone() {
        return new ChatMessageThinking(this.content, this.inProgress, getSide(), getHideSenderLabel(), getAccelerator());
    }
}
