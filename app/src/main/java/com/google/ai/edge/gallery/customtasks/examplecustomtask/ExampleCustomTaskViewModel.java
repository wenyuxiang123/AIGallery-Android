package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import androidx.compose.p000ui.graphics.Color;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;



V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTaskUiState;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "updateTextColor", "", "color", "Landroidx/compose/ui/graphics/Color;", "updateTextColor-8_81llA", "(J)V", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class ExampleCustomTaskViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<ExampleCustomTaskUiState> _uiState = StateFlowKt.MutableStateFlow(new ExampleCustomTaskUiState(Color.INSTANCE.m6941getBlack0d7_KjU(), null));
    private final StateFlow<ExampleCustomTaskUiState> uiState = FlowKt.asStateFlow(this._uiState);

    @Inject
    public ExampleCustomTaskViewModel() {
    }

    protected final MutableStateFlow<ExampleCustomTaskUiState> get_uiState() {
        return this._uiState;
    }

    public final StateFlow<ExampleCustomTaskUiState> getUiState() {
        return this.uiState;
    }

    
    public final void m10505updateTextColor8_81llA(long color) {
        ExampleCustomTaskUiState newUiState = this.uiState.getValue().m10503copy8_81llA(color);
        MutableStateFlow<ExampleCustomTaskUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), newUiState)) {
        }
    }
}
