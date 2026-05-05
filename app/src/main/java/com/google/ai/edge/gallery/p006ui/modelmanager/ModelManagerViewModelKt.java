package com.google.ai.edge.gallery.p006ui.modelmanager;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.data.BuiltInTaskId;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.NumberSliderConfig;
import com.google.ai.edge.gallery.data.ValueType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: ModelManagerViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m922d2 = {"TAG", "", "TEXT_INPUT_HISTORY_MAX_SIZE", "", "MODEL_ALLOWLIST_FILENAME", "MODEL_ALLOWLIST_TEST_FILENAME", "ALLOWLIST_BASE_URL", "TEST_MODEL_ALLOW_LIST", "RESET_CONVERSATION_TURN_COUNT_CONFIG", "Lcom/google/ai/edge/gallery/data/NumberSliderConfig;", "PREDEFINED_LLM_TASK_ORDER", "", "getAllowlistUrl", "version", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ModelManagerViewModelKt {
    private static final String ALLOWLIST_BASE_URL = "https://raw.githubusercontent.com/wenyuxiang123/gallery/refs/heads/main/model_allowlists";
    private static final String MODEL_ALLOWLIST_FILENAME = "model_allowlist.json";
    private static final String MODEL_ALLOWLIST_TEST_FILENAME = "model_allowlist_test.json";
    private static final String TAG = "AGModelManagerViewModel";
    private static final String TEST_MODEL_ALLOW_LIST = "";
    private static final int TEXT_INPUT_HISTORY_MAX_SIZE = 50;
    private static final NumberSliderConfig RESET_CONVERSATION_TURN_COUNT_CONFIG = new NumberSliderConfig(ConfigKeys.INSTANCE.getRESET_CONVERSATION_TURN_COUNT(), 1.0f, 30.0f, 3.0f, ValueType.INT, false, 32, null);
    private static final List<String> PREDEFINED_LLM_TASK_ORDER = CollectionsKt.listOf((Object[]) new String[]{BuiltInTaskId.LLM_ASK_IMAGE, BuiltInTaskId.LLM_ASK_AUDIO, BuiltInTaskId.LLM_CHAT, BuiltInTaskId.LLM_AGENT_CHAT, BuiltInTaskId.LLM_PROMPT_LAB, BuiltInTaskId.LLM_TINY_GARDEN, BuiltInTaskId.LLM_MOBILE_ACTIONS});

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAllowlistUrl(String version) {
        return "https://raw.githubusercontent.com/wenyuxiang123/gallery/refs/heads/main/model_allowlists/" + version + ".json";
    }
}
