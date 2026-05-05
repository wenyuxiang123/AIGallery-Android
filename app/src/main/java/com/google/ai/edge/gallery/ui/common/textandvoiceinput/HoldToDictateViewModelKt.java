package com.google.ai.edge.gallery.ui.common.textandvoiceinput;

import kotlin.Metadata;




public final class HoldToDictateViewModelKt {
    private static final float AUDIO_METER_MAX_DB = 100.0f;
    private static final float AUDIO_METER_MIN_DB = -2.0f;
    private static final String TAG = "AGHTD";

    
    public static final int convertRmsDbToAmplitude(float rmsdB) {
        float clampedRmsdB = Math.max(rmsdB, AUDIO_METER_MIN_DB);
        return (int) (((Math.min(clampedRmsdB, AUDIO_METER_MAX_DB) - AUDIO_METER_MIN_DB) * 65535.0f) / 102.0f);
    }
}
