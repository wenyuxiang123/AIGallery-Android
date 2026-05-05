package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/AudioClip;", "", "audioData", "", "sampleRate", "", "<init>", "([BI)V", "getAudioData", "()[B", "getSampleRate", "()I", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AudioClip {
    public static final int $stable = 8;
    private final byte[] audioData;
    private final int sampleRate;

    public AudioClip(byte[] audioData, int sampleRate) {
        Intrinsics.checkNotNullParameter(audioData, "audioData");
        this.audioData = audioData;
        this.sampleRate = sampleRate;
    }

    public final byte[] getAudioData() {
        return this.audioData;
    }

    public final int getSampleRate() {
        return this.sampleRate;
    }
}
