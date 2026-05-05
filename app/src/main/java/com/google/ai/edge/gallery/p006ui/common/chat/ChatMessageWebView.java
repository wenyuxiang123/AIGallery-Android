package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0000H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0017"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageWebView;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", ImagesContract.URL, "", "iframe", "", "aspectRatio", "", "side", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "hideSenderLabel", "<init>", "(Ljava/lang/String;ZFLcom/google/ai/edge/gallery/ui/common/chat/ChatSide;Z)V", "getUrl", "()Ljava/lang/String;", "getIframe", "()Z", "getAspectRatio", "()F", "getSide", "()Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "getHideSenderLabel", "clone", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageWebView extends ChatMessage {
    public static final int $stable = 0;
    private final float aspectRatio;
    private final boolean hideSenderLabel;
    private final boolean iframe;
    private final ChatSide side;
    private final String url;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChatMessageWebView(String str, boolean z, float f, ChatSide chatSide, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ChatSide chatSide2;
        boolean z3;
        if ((i & 8) == 0) {
            chatSide2 = chatSide;
        } else {
            chatSide2 = ChatSide.AGENT;
        }
        if ((i & 16) == 0) {
            z3 = z2;
        } else {
            z3 = false;
        }
        this(str, z, f, chatSide2, z3);
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getIframe() {
        return this.iframe;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatSide getSide() {
        return this.side;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public boolean getHideSenderLabel() {
        return this.hideSenderLabel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageWebView(String url, boolean iframe, float aspectRatio, ChatSide side, boolean hideSenderLabel) {
        super(ChatMessageType.WEBVIEW, side, 0.0f, null, hideSenderLabel, true, 12, null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(side, "side");
        this.url = url;
        this.iframe = iframe;
        this.aspectRatio = aspectRatio;
        this.side = side;
        this.hideSenderLabel = hideSenderLabel;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatMessageWebView clone() {
        return new ChatMessageWebView(this.url, this.iframe, this.aspectRatio, getSide(), getHideSenderLabel());
    }
}
