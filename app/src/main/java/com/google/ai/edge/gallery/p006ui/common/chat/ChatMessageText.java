package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010#\u001a\u00020\u0000H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0014\u0010\r\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageText;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", FirebaseAnalytics.Param.CONTENT, "", "side", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "latencyMs", "", "isMarkdown", "", "llmBenchmarkResult", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageBenchmarkLlmResult;", "accelerator", "hideSenderLabel", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "<init>", "(Ljava/lang/String;Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;FZLcom/google/ai/edge/gallery/ui/common/chat/ChatMessageBenchmarkLlmResult;Ljava/lang/String;ZLjava/lang/Object;)V", "getContent", "()Ljava/lang/String;", "getSide", "()Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "getLatencyMs", "()F", "()Z", "getLlmBenchmarkResult", "()Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageBenchmarkLlmResult;", "setLlmBenchmarkResult", "(Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageBenchmarkLlmResult;)V", "getAccelerator", "getHideSenderLabel", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "clone", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public class ChatMessageText extends ChatMessage {
    public static final int $stable = 8;
    private final String accelerator;
    private final String content;
    private Object data;
    private final boolean hideSenderLabel;
    private final boolean isMarkdown;
    private final float latencyMs;
    private ChatMessageBenchmarkLlmResult llmBenchmarkResult;
    private final ChatSide side;

    public /* synthetic */ ChatMessageText(String str, ChatSide chatSide, float f, boolean z, ChatMessageBenchmarkLlmResult chatMessageBenchmarkLlmResult, String str2, boolean z2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, chatSide, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : chatMessageBenchmarkLlmResult, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : obj);
    }

    public final String getContent() {
        return this.content;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatSide getSide() {
        return this.side;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public float getLatencyMs() {
        return this.latencyMs;
    }

    /* JADX INFO: renamed from: isMarkdown, reason: from getter */
    public final boolean getIsMarkdown() {
        return this.isMarkdown;
    }

    public final ChatMessageBenchmarkLlmResult getLlmBenchmarkResult() {
        return this.llmBenchmarkResult;
    }

    public final void setLlmBenchmarkResult(ChatMessageBenchmarkLlmResult chatMessageBenchmarkLlmResult) {
        this.llmBenchmarkResult = chatMessageBenchmarkLlmResult;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public String getAccelerator() {
        return this.accelerator;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public boolean getHideSenderLabel() {
        return this.hideSenderLabel;
    }

    public final Object getData() {
        return this.data;
    }

    public final void setData(Object obj) {
        this.data = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageText(String content, ChatSide side, float latencyMs, boolean isMarkdown, ChatMessageBenchmarkLlmResult llmBenchmarkResult, String accelerator, boolean hideSenderLabel, Object data) {
        super(ChatMessageType.TEXT, side, latencyMs, accelerator, hideSenderLabel, false, 32, null);
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(accelerator, "accelerator");
        this.content = content;
        this.side = side;
        this.latencyMs = latencyMs;
        this.isMarkdown = isMarkdown;
        this.llmBenchmarkResult = llmBenchmarkResult;
        this.accelerator = accelerator;
        this.hideSenderLabel = hideSenderLabel;
        this.data = data;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatMessageText clone() {
        return new ChatMessageText(this.content, getSide(), getLatencyMs(), this.isMarkdown, this.llmBenchmarkResult, getAccelerator(), getHideSenderLabel(), this.data);
    }
}
