package com.google.ai.edge.gallery.customtasks.mobileactions;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getShowWelcomeMessage", "()Z", "getProcessing", "getUserPrompt", "()Ljava/lang/String;", "getModelResponse", "getFunctionCallDetails", "()Ljava/util/List;", "getNoFunctionRecognized", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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

    public final List<String> component5() {
        return this.functionCallDetails;
    }

    
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
