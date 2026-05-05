package com.google.ai.edge.gallery.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getAudioData", "()[B", "getSampleRate", "()I", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
