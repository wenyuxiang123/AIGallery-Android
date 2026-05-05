package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.lifecycle.ViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: ExampleCustomTaskViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTaskViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTaskUiState;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "updateTextColor", "", "color", "Landroidx/compose/ui/graphics/Color;", "updateTextColor-8_81llA", "(J)V", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: updateTextColor-8_81llA, reason: not valid java name */
    public final void m10505updateTextColor8_81llA(long color) {
        ExampleCustomTaskUiState newUiState = this.uiState.getValue().m10503copy8_81llA(color);
        MutableStateFlow<ExampleCustomTaskUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), newUiState)) {
        }
    }
}
