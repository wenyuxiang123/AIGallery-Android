package com.google.ai.edge.gallery.p006ui.common.chat;

import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.common.base.Ascii;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatMessage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0000H\u0016J\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageAudioClip;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "audioData", "", "sampleRate", "", "side", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "latencyMs", "", "<init>", "([BILcom/google/ai/edge/gallery/ui/common/chat/ChatSide;F)V", "getAudioData", "()[B", "getSampleRate", "()I", "getSide", "()Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "getLatencyMs", "()F", "clone", "genByteArrayForWav", "getDurationInSeconds", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatMessageAudioClip extends ChatMessage {
    public static final int $stable = 8;
    private final byte[] audioData;
    private final float latencyMs;
    private final int sampleRate;
    private final ChatSide side;

    public /* synthetic */ ChatMessageAudioClip(byte[] bArr, int i, ChatSide chatSide, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, i, chatSide, (i2 & 8) != 0 ? 0.0f : f);
    }

    public final byte[] getAudioData() {
        return this.audioData;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatSide getSide() {
        return this.side;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public float getLatencyMs() {
        return this.latencyMs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessageAudioClip(byte[] audioData, int sampleRate, ChatSide side, float latencyMs) {
        super(ChatMessageType.AUDIO_CLIP, side, latencyMs, null, false, false, 56, null);
        Intrinsics.checkNotNullParameter(audioData, "audioData");
        Intrinsics.checkNotNullParameter(side, "side");
        this.audioData = audioData;
        this.sampleRate = sampleRate;
        this.side = side;
        this.latencyMs = latencyMs;
    }

    @Override // com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage
    public ChatMessageAudioClip clone() {
        return new ChatMessageAudioClip(this.audioData, this.sampleRate, getSide(), getLatencyMs());
    }

    public final byte[] genByteArrayForWav() {
        int pcmDataSize = this.audioData.length;
        int wavFileSize = pcmDataSize + 44;
        int byteRate = ((this.sampleRate * 1) * 16) / 8;
        Log.d("AGChatMessage", "Wav metadata: sampleRate: " + this.sampleRate);
        byte[] header = {82, 73, 70, 70, (byte) (wavFileSize & 255), (byte) ((wavFileSize >> 8) & 255), (byte) ((wavFileSize >> 16) & 255), (byte) ((wavFileSize >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, Ascii.DLE, 0, 0, 0, 1, 0, (byte) 1, 0, (byte) (this.sampleRate & 255), (byte) ((this.sampleRate >> 8) & 255), (byte) ((this.sampleRate >> 16) & 255), (byte) ((this.sampleRate >> 24) & 255), (byte) (byteRate & 255), (byte) ((byteRate >> 8) & 255), (byte) ((byteRate >> 16) & 255), (byte) ((byteRate >> 24) & 255), (byte) ((1 * 16) / 8), 0, (byte) 16, (byte) ((16 >> 8) & 255), 100, 97, 116, 97, (byte) (pcmDataSize & 255), (byte) ((pcmDataSize >> 8) & 255), (byte) ((pcmDataSize >> 16) & 255), (byte) ((pcmDataSize >> 24) & 255)};
        return ArraysKt.plus(header, this.audioData);
    }

    public final float getDurationInSeconds() {
        int bytesPerFrame = 2 * 1;
        float totalFrames = this.audioData.length / bytesPerFrame;
        return totalFrames / this.sampleRate;
    }
}
