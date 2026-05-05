package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u0000H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageType;", "side", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "latencyMs", "", "accelerator", "", "hideSenderLabel", "", "disableBubbleShape", "<init>", "(Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageType;Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;FLjava/lang/String;ZZ)V", "getType", "()Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageType;", "getSide", "()Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "getLatencyMs", "()F", "getAccelerator", "()Ljava/lang/String;", "getHideSenderLabel", "()Z", "getDisableBubbleShape", "clone", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public class ChatMessage {
    public static final int $stable = 0;
    private final String accelerator;
    private final boolean disableBubbleShape;
    private final boolean hideSenderLabel;
    private final float latencyMs;
    private final ChatSide side;
    private final ChatMessageType type;

    public ChatMessage(ChatMessageType type, ChatSide side, float latencyMs, String accelerator, boolean hideSenderLabel, boolean disableBubbleShape) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(accelerator, "accelerator");
        this.type = type;
        this.side = side;
        this.latencyMs = latencyMs;
        this.accelerator = accelerator;
        this.hideSenderLabel = hideSenderLabel;
        this.disableBubbleShape = disableBubbleShape;
    }

    public /* synthetic */ ChatMessage(ChatMessageType chatMessageType, ChatSide chatSide, float f, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatMessageType, chatSide, (i & 4) != 0 ? -1.0f : f, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public ChatMessageType getType() {
        return this.type;
    }

    public ChatSide getSide() {
        return this.side;
    }

    public float getLatencyMs() {
        return this.latencyMs;
    }

    public String getAccelerator() {
        return this.accelerator;
    }

    public boolean getHideSenderLabel() {
        return this.hideSenderLabel;
    }

    public boolean getDisableBubbleShape() {
        return this.disableBubbleShape;
    }

    public ChatMessage clone() {
        return new ChatMessage(getType(), getSide(), getLatencyMs(), getAccelerator(), getHideSenderLabel(), getDisableBubbleShape());
    }
}
