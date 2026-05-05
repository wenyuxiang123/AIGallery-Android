package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b=\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0011\u0010(\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0011\u0010,\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0011\u00106\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007R\u0011\u00108\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0007R\u0011\u0010:\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0007R\u0011\u0010<\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0007R\u0011\u0010>\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0007R\u0011\u0010@\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007¨\u0006B"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/ConfigKeys;", "", "<init>", "()V", "MAX_TOKENS", "Lcom/google/ai/edge/gallery/data/ConfigKey;", "getMAX_TOKENS", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "TOPK", "getTOPK", "TOPP", "getTOPP", "TEMPERATURE", "getTEMPERATURE", "DEFAULT_MAX_TOKENS", "getDEFAULT_MAX_TOKENS", "DEFAULT_TOPK", "getDEFAULT_TOPK", "DEFAULT_TOPP", "getDEFAULT_TOPP", "DEFAULT_TEMPERATURE", "getDEFAULT_TEMPERATURE", "SUPPORT_IMAGE", "getSUPPORT_IMAGE", "SUPPORT_AUDIO", "getSUPPORT_AUDIO", "SUPPORT_TINY_GARDEN", "getSUPPORT_TINY_GARDEN", "SUPPORT_MOBILE_ACTIONS", "getSUPPORT_MOBILE_ACTIONS", "SUPPORT_THINKING", "getSUPPORT_THINKING", "ENABLE_THINKING", "getENABLE_THINKING", "MAX_RESULT_COUNT", "getMAX_RESULT_COUNT", "USE_GPU", "getUSE_GPU", "ACCELERATOR", "getACCELERATOR", "VISION_ACCELERATOR", "getVISION_ACCELERATOR", "COMPATIBLE_ACCELERATORS", "getCOMPATIBLE_ACCELERATORS", "WARM_UP_ITERATIONS", "getWARM_UP_ITERATIONS", "BENCHMARK_ITERATIONS", "getBENCHMARK_ITERATIONS", "ITERATIONS", "getITERATIONS", "THEME", "getTHEME", "NAME", "getNAME", "MODEL_TYPE", "getMODEL_TYPE", "MODEL", "getMODEL", "RESET_CONVERSATION_TURN_COUNT", "getRESET_CONVERSATION_TURN_COUNT", "PREFILL_TOKENS", "getPREFILL_TOKENS", "DECODE_TOKENS", "getDECODE_TOKENS", "NUMBER_OF_RUNS", "getNUMBER_OF_RUNS", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ConfigKeys {
    public static final int $stable = 0;
    public static final ConfigKeys INSTANCE = new ConfigKeys();
    private static final ConfigKey MAX_TOKENS = new ConfigKey("max_tokens", "Max tokens");
    private static final ConfigKey TOPK = new ConfigKey("topk", "TopK");
    private static final ConfigKey TOPP = new ConfigKey("topp", "TopP");
    private static final ConfigKey TEMPERATURE = new ConfigKey("temperature", "Temperature");
    private static final ConfigKey DEFAULT_MAX_TOKENS = new ConfigKey("default_max_tokens", "Default max tokens");
    private static final ConfigKey DEFAULT_TOPK = new ConfigKey("default_topk", "Default TopK");
    private static final ConfigKey DEFAULT_TOPP = new ConfigKey("default_topp", "Default TopP");
    private static final ConfigKey DEFAULT_TEMPERATURE = new ConfigKey("default_temperature", "Default temperature");
    private static final ConfigKey SUPPORT_IMAGE = new ConfigKey("support_image", "Support image");
    private static final ConfigKey SUPPORT_AUDIO = new ConfigKey("support_audio", "Support audio");
    private static final ConfigKey SUPPORT_TINY_GARDEN = new ConfigKey("support_tiny_garden", "Support tiny garden");
    private static final ConfigKey SUPPORT_MOBILE_ACTIONS = new ConfigKey("support_mobile_actions", "Support mobile actions");
    private static final ConfigKey SUPPORT_THINKING = new ConfigKey("support_thinking", "Support thinking");
    private static final ConfigKey ENABLE_THINKING = new ConfigKey("enable_thinking", "Enable thinking");
    private static final ConfigKey MAX_RESULT_COUNT = new ConfigKey("max_result_count", "Max result count");
    private static final ConfigKey USE_GPU = new ConfigKey("use_gpu", "Use GPU");
    private static final ConfigKey ACCELERATOR = new ConfigKey("accelerator", "Accelerator");
    private static final ConfigKey VISION_ACCELERATOR = new ConfigKey("vision_accelerator", "Vision accelerator");
    private static final ConfigKey COMPATIBLE_ACCELERATORS = new ConfigKey("compatible_accelerators", "Compatible accelerators");
    private static final ConfigKey WARM_UP_ITERATIONS = new ConfigKey("warm_up_iterations", "Warm up iterations");
    private static final ConfigKey BENCHMARK_ITERATIONS = new ConfigKey("benchmark_iterations", "Benchmark iterations");
    private static final ConfigKey ITERATIONS = new ConfigKey("iterations", "Iterations");
    private static final ConfigKey THEME = new ConfigKey("theme", "Theme");
    private static final ConfigKey NAME = new ConfigKey("name", "Name");
    private static final ConfigKey MODEL_TYPE = new ConfigKey("model_type", "Model type");
    private static final ConfigKey MODEL = new ConfigKey("model", ExifInterface.TAG_MODEL);
    private static final ConfigKey RESET_CONVERSATION_TURN_COUNT = new ConfigKey("reset_conversation_turn_count", "Number of turns before the conversation resets");
    private static final ConfigKey PREFILL_TOKENS = new ConfigKey("prefill_tokens", "Prefill tokens");
    private static final ConfigKey DECODE_TOKENS = new ConfigKey("decode_tokens", "Decode tokens");
    private static final ConfigKey NUMBER_OF_RUNS = new ConfigKey("number_of_runs", "Number of runs");

    private ConfigKeys() {
    }

    public final ConfigKey getMAX_TOKENS() {
        return MAX_TOKENS;
    }

    public final ConfigKey getTOPK() {
        return TOPK;
    }

    public final ConfigKey getTOPP() {
        return TOPP;
    }

    public final ConfigKey getTEMPERATURE() {
        return TEMPERATURE;
    }

    public final ConfigKey getDEFAULT_MAX_TOKENS() {
        return DEFAULT_MAX_TOKENS;
    }

    public final ConfigKey getDEFAULT_TOPK() {
        return DEFAULT_TOPK;
    }

    public final ConfigKey getDEFAULT_TOPP() {
        return DEFAULT_TOPP;
    }

    public final ConfigKey getDEFAULT_TEMPERATURE() {
        return DEFAULT_TEMPERATURE;
    }

    public final ConfigKey getSUPPORT_IMAGE() {
        return SUPPORT_IMAGE;
    }

    public final ConfigKey getSUPPORT_AUDIO() {
        return SUPPORT_AUDIO;
    }

    public final ConfigKey getSUPPORT_TINY_GARDEN() {
        return SUPPORT_TINY_GARDEN;
    }

    public final ConfigKey getSUPPORT_MOBILE_ACTIONS() {
        return SUPPORT_MOBILE_ACTIONS;
    }

    public final ConfigKey getSUPPORT_THINKING() {
        return SUPPORT_THINKING;
    }

    public final ConfigKey getENABLE_THINKING() {
        return ENABLE_THINKING;
    }

    public final ConfigKey getMAX_RESULT_COUNT() {
        return MAX_RESULT_COUNT;
    }

    public final ConfigKey getUSE_GPU() {
        return USE_GPU;
    }

    public final ConfigKey getACCELERATOR() {
        return ACCELERATOR;
    }

    public final ConfigKey getVISION_ACCELERATOR() {
        return VISION_ACCELERATOR;
    }

    public final ConfigKey getCOMPATIBLE_ACCELERATORS() {
        return COMPATIBLE_ACCELERATORS;
    }

    public final ConfigKey getWARM_UP_ITERATIONS() {
        return WARM_UP_ITERATIONS;
    }

    public final ConfigKey getBENCHMARK_ITERATIONS() {
        return BENCHMARK_ITERATIONS;
    }

    public final ConfigKey getITERATIONS() {
        return ITERATIONS;
    }

    public final ConfigKey getTHEME() {
        return THEME;
    }

    public final ConfigKey getNAME() {
        return NAME;
    }

    public final ConfigKey getMODEL_TYPE() {
        return MODEL_TYPE;
    }

    public final ConfigKey getMODEL() {
        return MODEL;
    }

    public final ConfigKey getRESET_CONVERSATION_TURN_COUNT() {
        return RESET_CONVERSATION_TURN_COUNT;
    }

    public final ConfigKey getPREFILL_TOKENS() {
        return PREFILL_TOKENS;
    }

    public final ConfigKey getDECODE_TOKENS() {
        return DECODE_TOKENS;
    }

    public final ConfigKey getNUMBER_OF_RUNS() {
        return NUMBER_OF_RUNS;
    }
}
