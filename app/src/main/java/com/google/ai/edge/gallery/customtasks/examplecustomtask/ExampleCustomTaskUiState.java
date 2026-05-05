package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ExampleCustomTaskViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTaskUiState;", "", "textColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTextColor-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTaskUiState;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class ExampleCustomTaskUiState {
    public static final int $stable = 0;
    private final long textColor;

    public /* synthetic */ ExampleCustomTaskUiState(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* JADX INFO: renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ ExampleCustomTaskUiState m10501copy8_81llA$default(ExampleCustomTaskUiState exampleCustomTaskUiState, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = exampleCustomTaskUiState.textColor;
        }
        return exampleCustomTaskUiState.m10503copy8_81llA(j);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: copy-8_81llA, reason: not valid java name */
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

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m10504getTextColor0d7_KjU() {
        return this.textColor;
    }
}
