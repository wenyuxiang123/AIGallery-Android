package com.google.ai.edge.gallery.p006ui.common.textandvoiceinput;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoldToDictateViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateUiState;", "", "recognizing", "", "recognizedText", "", "<init>", "(ZLjava/lang/String;)V", "getRecognizing", "()Z", "getRecognizedText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class HoldToDictateUiState {
    public static final int $stable = 0;
    private final String recognizedText;
    private final boolean recognizing;

    /* JADX WARN: Multi-variable type inference failed */
    public HoldToDictateUiState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HoldToDictateUiState copy$default(HoldToDictateUiState holdToDictateUiState, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = holdToDictateUiState.recognizing;
        }
        if ((i & 2) != 0) {
            str = holdToDictateUiState.recognizedText;
        }
        return holdToDictateUiState.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRecognizing() {
        return this.recognizing;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecognizedText() {
        return this.recognizedText;
    }

    public final HoldToDictateUiState copy(boolean recognizing, String recognizedText) {
        Intrinsics.checkNotNullParameter(recognizedText, "recognizedText");
        return new HoldToDictateUiState(recognizing, recognizedText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoldToDictateUiState)) {
            return false;
        }
        HoldToDictateUiState holdToDictateUiState = (HoldToDictateUiState) other;
        return this.recognizing == holdToDictateUiState.recognizing && Intrinsics.areEqual(this.recognizedText, holdToDictateUiState.recognizedText);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.recognizing) * 31) + this.recognizedText.hashCode();
    }

    public String toString() {
        return "HoldToDictateUiState(recognizing=" + this.recognizing + ", recognizedText=" + this.recognizedText + ")";
    }

    public HoldToDictateUiState(boolean recognizing, String recognizedText) {
        Intrinsics.checkNotNullParameter(recognizedText, "recognizedText");
        this.recognizing = recognizing;
        this.recognizedText = recognizedText;
    }

    public /* synthetic */ HoldToDictateUiState(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public final String getRecognizedText() {
        return this.recognizedText;
    }

    public final boolean getRecognizing() {
        return this.recognizing;
    }
}
