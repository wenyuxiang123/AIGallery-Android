package com.google.ai.edge.gallery.ui.modelmanager;

import com.google.ai.edge.gallery.data.BuiltInTaskId;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.NumberSliderConfig;
import com.google.ai.edge.gallery.data.ValueType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;




public final class ModelManagerViewModelKt {
    private static final String ALLOWLIST_BASE_URL = "https://raw.githubusercontent.com/wenyuxiang123/gallery/refs/heads/main/model_allowlists";
    private static final String MODEL_ALLOWLIST_FILENAME = "model_allowlist.json";
    private static final String MODEL_ALLOWLIST_TEST_FILENAME = "model_allowlist_test.json";
    private static final String TAG = "AGModelManagerViewModel";
    private static final String TEST_MODEL_ALLOW_LIST = "";
    private static final int TEXT_INPUT_HISTORY_MAX_SIZE = 50;
    private static final NumberSliderConfig RESET_CONVERSATION_TURN_COUNT_CONFIG = new NumberSliderConfig(ConfigKeys.INSTANCE.getRESET_CONVERSATION_TURN_COUNT(), 1.0f, 30.0f, 3.0f, ValueType.INT, false, 32, null);
    private static final List<String> PREDEFINED_LLM_TASK_ORDER = CollectionsKt.listOf((Object[]) new String[]{BuiltInTaskId.LLM_ASK_IMAGE, BuiltInTaskId.LLM_ASK_AUDIO, BuiltInTaskId.LLM_CHAT, BuiltInTaskId.LLM_AGENT_CHAT, BuiltInTaskId.LLM_PROMPT_LAB, BuiltInTaskId.LLM_TINY_GARDEN, BuiltInTaskId.LLM_MOBILE_ACTIONS});

    
    public static final String getAllowlistUrl(String version) {
        return "https://raw.githubusercontent.com/wenyuxiang123/gallery/refs/heads/main/model_allowlists/" + version + ".json";
    }
}
