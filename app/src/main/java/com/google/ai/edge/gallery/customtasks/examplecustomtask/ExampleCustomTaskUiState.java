package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import androidx.compose.p000ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;



V", "getTextColor-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTaskUiState;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class ExampleCustomTaskUiState {
    public static final int $stable = 0;
    private final long textColor;

    public /* synthetic */ ExampleCustomTaskUiState(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    
    public static /* synthetic */ ExampleCustomTaskUiState m10501copy8_81llA$default(ExampleCustomTaskUiState exampleCustomTaskUiState, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = exampleCustomTaskUiState.textColor;
        }
        return exampleCustomTaskUiState.m10503copy8_81llA(j);
    }

    
    public final long getTextColor() {
        return this.textColor;
    }

    
    public final ExampleCustomTaskUiState m10503copy8_81llA(long textColor) {
        return new ExampleCustomTaskUiState(textColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExampleCustomTaskUiState) && Color.m6916equalsimpl0(this.textColor, ((ExampleCustomTaskUiState) other).textColor);
    }

    public int hashCode() {
        return Color.m6922hashCodeimpl(this.textColor);
    }

    public String toString() {
        return "ExampleCustomTaskUiState(textColor=" + Color.m6923toStringimpl(this.textColor) + ")";
    }

    private ExampleCustomTaskUiState(long textColor) {
        this.textColor = textColor;
    }

    
    public final long m10504getTextColor0d7_KjU() {
        return this.textColor;
    }
}
