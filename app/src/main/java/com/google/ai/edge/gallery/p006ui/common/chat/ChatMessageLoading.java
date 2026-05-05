package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\u0000H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageLoading;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "extraProgressLabel", "", "accelerator", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getExtraProgressLabel", "()Ljava/lang/String;", "setExtraProgressLabel", "(Ljava/lang/String;)V", "getAccelerator", "clone", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageLoading extends ChatMessage {
    public static final int $stable = 8;
    private final String accelerator;
    private String extraProgressLabel;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatMessageLoading() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ChatMessageLoading(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final String getExtraProgressLabel() {
        return this.extraProgressLabel;
    }

    public final void setExtraProgressLabel(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.extraProgressLabel = str;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public String getAccelerator() {
        return this.accelerator;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageLoading(String extraProgressLabel, String accelerator) {
        super(ChatMessageType.LOADING, ChatSide.AGENT, 0.0f, accelerator, false, false, 52, null);
        Intrinsics.checkNotNullParameter(extraProgressLabel, "extraProgressLabel");
        Intrinsics.checkNotNullParameter(accelerator, "accelerator");
        this.extraProgressLabel = extraProgressLabel;
        this.accelerator = accelerator;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatMessageLoading clone() {
        return new ChatMessageLoading(this.extraProgressLabel, getAccelerator());
    }
}
