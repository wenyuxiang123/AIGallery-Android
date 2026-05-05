package com.google.ai.edge.gallery.ui.common.textandvoiceinput;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getRecognizing", "()Z", "getRecognizedText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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

    
    public final boolean getRecognizing() {
        return this.recognizing;
    }

    
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
