package com.google.ai.edge.gallery.ui.common.textandvoiceinput;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* JADX INFO: compiled from: HoldToDictateViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m922d2 = {"TAG", "", "AUDIO_METER_MIN_DB", "", "AUDIO_METER_MAX_DB", "convertRmsDbToAmplitude", "", "rmsdB", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class HoldToDictateViewModelKt {
    private static final float AUDIO_METER_MAX_DB = 100.0f;
    private static final float AUDIO_METER_MIN_DB = -2.0f;
    private static final String TAG = "AGHTD";

    /* JADX INFO: Access modifiers changed from: private */
    public static final int convertRmsDbToAmplitude(float rmsdB) {
        float clampedRmsdB = Math.max(rmsdB, AUDIO_METER_MIN_DB);
        return (int) (((Math.min(clampedRmsdB, AUDIO_METER_MAX_DB) - AUDIO_METER_MIN_DB) * 65535.0f) / 102.0f);
    }
}
