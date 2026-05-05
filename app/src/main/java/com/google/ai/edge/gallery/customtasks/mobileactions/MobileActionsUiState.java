package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MobileActionsViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/MobileActionsUiState;", "", "showWelcomeMessage", "", "processing", "userPrompt", "", "modelResponse", "functionCallDetails", "", "noFunctionRecognized", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getShowWelcomeMessage", "()Z", "getProcessing", "getUserPrompt", "()Ljava/lang/String;", "getModelResponse", "getFunctionCallDetails", "()Ljava/util/List;", "getNoFunctionRecognized", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class MobileActionsUiState {
    public static final int $stable = 8;
    private final List<String> functionCallDetails;
    private final String modelResponse;
    private final boolean noFunctionRecognized;
    private final boolean processing;
    private final boolean showWelcomeMessage;
    private final String userPrompt;

    public MobileActionsUiState() {
        this(false, false, null, null, null, false, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MobileActionsUiState copy$default(MobileActionsUiState mobileActionsUiState, boolean z, boolean z2, String str, String str2, List list, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mobileActionsUiState.showWelcomeMessage;
        }
        if ((i & 2) != 0) {
            z2 = mobileActionsUiState.processing;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            str = mobileActionsUiState.userPrompt;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = mobileActionsUiState.modelResponse;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            list = mobileActionsUiState.functionCallDetails;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            z3 = mobileActionsUiState.noFunctionRecognized;
        }
        return mobileActionsUiState.copy(z, z4, str3, str4, list2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowWelcomeMessage() {
        return this.showWelcomeMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getProcessing() {
        return this.processing;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserPrompt() {
        return this.userPrompt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModelResponse() {
        return this.modelResponse;
    }

    public final List<String> component5() {
        return this.functionCallDetails;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNoFunctionRecognized() {
        return this.noFunctionRecognized;
    }

    public final MobileActionsUiState copy(boolean showWelcomeMessage, boolean processing, String userPrompt, String modelResponse, List<String> functionCallDetails, boolean noFunctionRecognized) {
        Intrinsics.checkNotNullParameter(userPrompt, "userPrompt");
        Intrinsics.checkNotNullParameter(modelResponse, "modelResponse");
        Intrinsics.checkNotNullParameter(functionCallDetails, "functionCallDetails");
        return new MobileActionsUiState(showWelcomeMessage, processing, userPrompt, modelResponse, functionCallDetails, noFunctionRecognized);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileActionsUiState)) {
            return false;
        }
        MobileActionsUiState mobileActionsUiState = (MobileActionsUiState) other;
        return this.showWelcomeMessage == mobileActionsUiState.showWelcomeMessage && this.processing == mobileActionsUiState.processing && Intrinsics.areEqual(this.userPrompt, mobileActionsUiState.userPrompt) && Intrinsics.areEqual(this.modelResponse, mobileActionsUiState.modelResponse) && Intrinsics.areEqual(this.functionCallDetails, mobileActionsUiState.functionCallDetails) && this.noFunctionRecognized == mobileActionsUiState.noFunctionRecognized;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.showWelcomeMessage) * 31) + Boolean.hashCode(this.processing)) * 31) + this.userPrompt.hashCode()) * 31) + this.modelResponse.hashCode()) * 31) + this.functionCallDetails.hashCode()) * 31) + Boolean.hashCode(this.noFunctionRecognized);
    }

    public String toString() {
        return "MobileActionsUiState(showWelcomeMessage=" + this.showWelcomeMessage + ", processing=" + this.processing + ", userPrompt=" + this.userPrompt + ", modelResponse=" + this.modelResponse + ", functionCallDetails=" + this.functionCallDetails + ", noFunctionRecognized=" + this.noFunctionRecognized + ")";
    }

    public MobileActionsUiState(boolean showWelcomeMessage, boolean processing, String userPrompt, String modelResponse, List<String> functionCallDetails, boolean noFunctionRecognized) {
        Intrinsics.checkNotNullParameter(userPrompt, "userPrompt");
        Intrinsics.checkNotNullParameter(modelResponse, "modelResponse");
        Intrinsics.checkNotNullParameter(functionCallDetails, "functionCallDetails");
        this.showWelcomeMessage = showWelcomeMessage;
        this.processing = processing;
        this.userPrompt = userPrompt;
        this.modelResponse = modelResponse;
        this.functionCallDetails = functionCallDetails;
        this.noFunctionRecognized = noFunctionRecognized;
    }

    public /* synthetic */ MobileActionsUiState(boolean z, boolean z2, String str, String str2, List list, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) == 0 ? z3 : false);
    }

    public final boolean getShowWelcomeMessage() {
        return this.showWelcomeMessage;
    }

    public final boolean getProcessing() {
        return this.processing;
    }

    public final String getUserPrompt() {
        return this.userPrompt;
    }

    public final String getModelResponse() {
        return this.modelResponse;
    }

    public final List<String> getFunctionCallDetails() {
        return this.functionCallDetails;
    }

    public final boolean getNoFunctionRecognized() {
        return this.noFunctionRecognized;
    }
}
