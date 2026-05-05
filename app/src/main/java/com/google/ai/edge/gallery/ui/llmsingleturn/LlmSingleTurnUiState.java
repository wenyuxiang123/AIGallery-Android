package com.google.ai.edge.gallery.ui.llmsingleturn;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;", "", "inProgress", "", "preparing", "responsesByModel", "", "", "selectedPromptTemplateType", "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;", "<init>", "(ZZLjava/util/Map;Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;)V", "getInProgress", "()Z", "getPreparing", "getResponsesByModel", "()Ljava/util/Map;", "getSelectedPromptTemplateType", "()Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class LlmSingleTurnUiState {
    public static final int $stable = 8;
    private final boolean inProgress;
    private final boolean preparing;
    private final Map<String, Map<String, String>> responsesByModel;
    private final PromptTemplateType selectedPromptTemplateType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LlmSingleTurnUiState copy$default(LlmSingleTurnUiState llmSingleTurnUiState, boolean z, boolean z2, Map map, PromptTemplateType promptTemplateType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = llmSingleTurnUiState.inProgress;
        }
        if ((i & 2) != 0) {
            z2 = llmSingleTurnUiState.preparing;
        }
        if ((i & 4) != 0) {
            map = llmSingleTurnUiState.responsesByModel;
        }
        if ((i & 8) != 0) {
            promptTemplateType = llmSingleTurnUiState.selectedPromptTemplateType;
        }
        return llmSingleTurnUiState.copy(z, z2, map, promptTemplateType);
    }

    
    public final boolean getInProgress() {
        return this.inProgress;
    }

    
    public final boolean getPreparing() {
        return this.preparing;
    }

    public final Map<String, Map<String, String>> component3() {
        return this.responsesByModel;
    }

    
    public final PromptTemplateType getSelectedPromptTemplateType() {
        return this.selectedPromptTemplateType;
    }

    public final LlmSingleTurnUiState copy(boolean inProgress, boolean preparing, Map<String, ? extends Map<String, String>> responsesByModel, PromptTemplateType selectedPromptTemplateType) {
        Intrinsics.checkNotNullParameter(responsesByModel, "responsesByModel");
        Intrinsics.checkNotNullParameter(selectedPromptTemplateType, "selectedPromptTemplateType");
        return new LlmSingleTurnUiState(inProgress, preparing, responsesByModel, selectedPromptTemplateType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LlmSingleTurnUiState)) {
            return false;
        }
        LlmSingleTurnUiState llmSingleTurnUiState = (LlmSingleTurnUiState) other;
        return this.inProgress == llmSingleTurnUiState.inProgress && this.preparing == llmSingleTurnUiState.preparing && Intrinsics.areEqual(this.responsesByModel, llmSingleTurnUiState.responsesByModel) && this.selectedPromptTemplateType == llmSingleTurnUiState.selectedPromptTemplateType;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.inProgress) * 31) + Boolean.hashCode(this.preparing)) * 31) + this.responsesByModel.hashCode()) * 31) + this.selectedPromptTemplateType.hashCode();
    }

    public String toString() {
        return "LlmSingleTurnUiState(inProgress=" + this.inProgress + ", preparing=" + this.preparing + ", responsesByModel=" + this.responsesByModel + ", selectedPromptTemplateType=" + this.selectedPromptTemplateType + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LlmSingleTurnUiState(boolean inProgress, boolean preparing, Map<String, ? extends Map<String, String>> responsesByModel, PromptTemplateType selectedPromptTemplateType) {
        Intrinsics.checkNotNullParameter(responsesByModel, "responsesByModel");
        Intrinsics.checkNotNullParameter(selectedPromptTemplateType, "selectedPromptTemplateType");
        this.inProgress = inProgress;
        this.preparing = preparing;
        this.responsesByModel = responsesByModel;
        this.selectedPromptTemplateType = selectedPromptTemplateType;
    }

    public /* synthetic */ LlmSingleTurnUiState(boolean z, boolean z2, Map map, PromptTemplateType promptTemplateType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, map, (i & 8) != 0 ? PromptTemplateType.getEntries().get(0) : promptTemplateType);
    }

    public final boolean getInProgress() {
        return this.inProgress;
    }

    public final boolean getPreparing() {
        return this.preparing;
    }

    public final Map<String, Map<String, String>> getResponsesByModel() {
        return this.responsesByModel;
    }

    public final PromptTemplateType getSelectedPromptTemplateType() {
        return this.selectedPromptTemplateType;
    }
}
