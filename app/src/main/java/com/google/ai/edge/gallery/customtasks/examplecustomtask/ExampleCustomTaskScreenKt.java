package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.google.ai.edge.gallery.data.ConfigKey;
import com.google.ai.edge.gallery.data.NumberSliderConfig;
import com.google.ai.edge.gallery.data.ValueType;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import java.util.List;
import kotlin.Unit;

public final class ExampleCustomTaskScreenKt {
    private static final ConfigKey EXAMPLE_CUSTOM_TASK_CONFIG_KEY_FONT_SIZE = new ConfigKey("font_size", "Font size");
    private static final ConfigKey EXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT = new ConfigKey("max_char_count", "Max character count");
    private static final List<NumberSliderConfig> EXAMPLE_CUSTOM_TASK_CONFIGS = kotlin.collections.CollectionsKt.listOf(
        new NumberSliderConfig(EXAMPLE_CUSTOM_TASK_CONFIG_KEY_FONT_SIZE, 8.0f, 24.0f, 14.0f, ValueType.INT, false),
        new NumberSliderConfig(EXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT, 100.0f, 2000.0f, 2000.0f, ValueType.INT, true)
    );

    public static final ConfigKey getEXAMPLE_CUSTOM_TASK_CONFIG_KEY_FONT_SIZE() {
        return EXAMPLE_CUSTOM_TASK_CONFIG_KEY_FONT_SIZE;
    }

    public static final ConfigKey getEXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT() {
        return EXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT;
    }

    public static final List<NumberSliderConfig> getEXAMPLE_CUSTOM_TASK_CONFIGS() {
        return EXAMPLE_CUSTOM_TASK_CONFIGS;
    }

    public static final void ExampleCustomTaskScreen(ModelManagerViewModel modelManagerViewModel, ExampleCustomTaskViewModel viewModel, Composer composer, int i, int i2) {
    }

    private static final ModelManagerUiState ExampleCustomTaskScreen$lambda$0(State<ModelManagerUiState> state) {
        return (ModelManagerUiState) state.getValue();
    }

    private static final ExampleCustomTaskUiState ExampleCustomTaskScreen$lambda$1(State<ExampleCustomTaskUiState> state) {
        return (ExampleCustomTaskUiState) state.getValue();
    }

    private static final int ExampleCustomTaskScreen$lambda$3(MutableIntState fontSize$delegate) {
        return fontSize$delegate.getIntValue();
    }
}
