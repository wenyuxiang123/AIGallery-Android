package com.google.ai.edge.gallery.data;

import androidx.camera.video.AudioStats;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a_\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013\u001a&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u001a:\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u001a\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0007¨\u0006\u0019"}, m922d2 = {"convertValueToTargetType", "", "value", "valueType", "Lcom/google/ai/edge/gallery/data/ValueType;", "createLlmChatConfigs", "", "Lcom/google/ai/edge/gallery/data/Config;", "defaultMaxToken", "", "defaultMaxContextLength", "defaultTopK", "defaultTopP", "", "defaultTemperature", "accelerators", "Lcom/google/ai/edge/gallery/data/Accelerator;", "supportThinking", "", "(ILjava/lang/Integer;IFFLjava/util/List;Z)Ljava/util/List;", "createLlmChatConfigsForNpuModel", "createAICoreConfigs", "getConfigValueString", "", "config", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ConfigKt {

    /* JADX INFO: compiled from: Config.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValueType.values().length];
            try {
                iArr[ValueType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ValueType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ValueType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[ValueType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[ValueType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Object convertValueToTargetType(Object value, ValueType valueType) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        switch (WhenMappings.$EnumSwitchMapping$0[valueType.ordinal()]) {
            case 1:
                if (!(value instanceof Integer)) {
                    if (value instanceof Float) {
                        return Integer.valueOf((int) ((Number) value).floatValue());
                    }
                    if (value instanceof Double) {
                        return Integer.valueOf((int) ((Number) value).doubleValue());
                    }
                    if (!(value instanceof String)) {
                        return value instanceof Boolean ? Integer.valueOf(((Boolean) value).booleanValue() ? 1 : 0) : "";
                    }
                    Integer intOrNull = StringsKt.toIntOrNull((String) value);
                    return intOrNull == null ? "" : intOrNull;
                }
                break;
            case 2:
                if (value instanceof Integer) {
                    return Float.valueOf(((Number) value).intValue());
                }
                if (!(value instanceof Float)) {
                    if (value instanceof Double) {
                        return Float.valueOf((float) ((Number) value).doubleValue());
                    }
                    if (value instanceof String) {
                        Float floatOrNull = StringsKt.toFloatOrNull((String) value);
                        return floatOrNull == null ? "" : floatOrNull;
                    }
                    if (value instanceof Boolean) {
                        return Float.valueOf(((Boolean) value).booleanValue() ? 1.0f : 0.0f);
                    }
                    return "";
                }
                break;
            case 3:
                if (value instanceof Integer) {
                    return Double.valueOf(((Number) value).intValue());
                }
                if (value instanceof Float) {
                    return Double.valueOf(((Number) value).floatValue());
                }
                if (!(value instanceof Double)) {
                    if (value instanceof String) {
                        Double doubleOrNull = StringsKt.toDoubleOrNull((String) value);
                        return doubleOrNull == null ? "" : doubleOrNull;
                    }
                    if (value instanceof Boolean) {
                        return Double.valueOf(((Boolean) value).booleanValue() ? 1.0d : AudioStats.AUDIO_AMPLITUDE_NONE);
                    }
                    return "";
                }
                break;
            case 4:
                boolean zBooleanValue = false;
                if (value instanceof Integer) {
                    zBooleanValue = Intrinsics.areEqual(value, (Object) 0);
                } else if (value instanceof Boolean) {
                    zBooleanValue = ((Boolean) value).booleanValue();
                } else if (value instanceof Float) {
                    if (Math.abs(((Number) value).floatValue()) > 1.0E-6d) {
                        zBooleanValue = true;
                    }
                } else if (value instanceof Double) {
                    if (Math.abs(((Number) value).doubleValue()) > 1.0E-6d) {
                        zBooleanValue = true;
                    }
                } else if ((value instanceof String) && ((CharSequence) value).length() > 0) {
                    zBooleanValue = true;
                }
                return Boolean.valueOf(zBooleanValue);
            case 5:
                return value.toString();
            default:
                throw new NoWhenBranchMatchedException();
        }
        return value;
    }

    public static /* synthetic */ List createLlmChatConfigs$default(int i, Integer num, int i2, float f, float f2, List list, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 1024;
        }
        return createLlmChatConfigs(i, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? 64 : i2, (i3 & 8) != 0 ? 0.95f : f, (i3 & 16) != 0 ? 1.0f : f2, (i3 & 32) != 0 ? ConstsKt.getDEFAULT_ACCELERATORS() : list, (i3 & 64) != 0 ? false : z);
    }

    public static final List<Config> createLlmChatConfigs(int defaultMaxToken, Integer defaultMaxContextLength, int defaultTopK, float defaultTopP, float defaultTemperature, List<? extends Accelerator> accelerators, boolean supportThinking) {
        Intrinsics.checkNotNullParameter(accelerators, "accelerators");
        LabelConfig maxTokensConfig = new LabelConfig(ConfigKeys.INSTANCE.getMAX_TOKENS(), String.valueOf(defaultMaxToken));
        if (defaultMaxContextLength != null) {
            maxTokensConfig = new NumberSliderConfig(ConfigKeys.INSTANCE.getMAX_TOKENS(), 2000.0f, defaultMaxContextLength.intValue(), defaultMaxToken, ValueType.INT, false, 32, null);
        }
        Config[] configArr = new Config[5];
        configArr[0] = maxTokensConfig;
        int i = 32;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        configArr[1] = new NumberSliderConfig(ConfigKeys.INSTANCE.getTOPK(), 5.0f, 100.0f, defaultTopK, ValueType.INT, z, i, defaultConstructorMarker);
        float f = 0.0f;
        configArr[2] = new NumberSliderConfig(ConfigKeys.INSTANCE.getTOPP(), f, 1.0f, defaultTopP, ValueType.FLOAT, z, i, defaultConstructorMarker);
        configArr[3] = new NumberSliderConfig(ConfigKeys.INSTANCE.getTEMPERATURE(), f, 2.0f, defaultTemperature, ValueType.FLOAT, z, i, defaultConstructorMarker);
        ConfigKey accelerator = ConfigKeys.INSTANCE.getACCELERATOR();
        String label = accelerators.get(0).getLabel();
        List<? extends Accelerator> $this$map$iv = accelerators;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Accelerator it = (Accelerator) item$iv$iv;
            destination$iv$iv.add(it.getLabel());
        }
        configArr[4] = new SegmentedButtonConfig(accelerator, label, (List) destination$iv$iv, false, 8, null);
        List<Config> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) configArr));
        if (supportThinking) {
            mutableList.add(new BooleanSwitchConfig(ConfigKeys.INSTANCE.getENABLE_THINKING(), false, false, 4, null));
        }
        return mutableList;
    }

    public static /* synthetic */ List createLlmChatConfigsForNpuModel$default(int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1024;
        }
        if ((i2 & 2) != 0) {
            list = ConstsKt.getDEFAULT_ACCELERATORS();
        }
        return createLlmChatConfigsForNpuModel(i, list);
    }

    public static final List<Config> createLlmChatConfigsForNpuModel(int defaultMaxToken, List<? extends Accelerator> accelerators) {
        Intrinsics.checkNotNullParameter(accelerators, "accelerators");
        Config[] configArr = new Config[2];
        configArr[0] = new LabelConfig(ConfigKeys.INSTANCE.getMAX_TOKENS(), String.valueOf(defaultMaxToken));
        ConfigKey accelerator = ConfigKeys.INSTANCE.getACCELERATOR();
        String label = accelerators.get(0).getLabel();
        List<? extends Accelerator> $this$map$iv = accelerators;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Accelerator it = (Accelerator) item$iv$iv;
            destination$iv$iv.add(it.getLabel());
        }
        configArr[1] = new SegmentedButtonConfig(accelerator, label, (List) destination$iv$iv, false, 8, null);
        return CollectionsKt.listOf((Object[]) configArr);
    }

    public static /* synthetic */ List createAICoreConfigs$default(int i, int i2, float f, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 1024;
        }
        if ((i3 & 2) != 0) {
            i2 = 64;
        }
        if ((i3 & 4) != 0) {
            f = 1.0f;
        }
        if ((i3 & 8) != 0) {
            list = ConstsKt.getDEFAULT_ACCELERATORS();
        }
        return createAICoreConfigs(i, i2, f, list);
    }

    public static final List<Config> createAICoreConfigs(int defaultMaxToken, int defaultTopK, float defaultTemperature, List<? extends Accelerator> accelerators) {
        Intrinsics.checkNotNullParameter(accelerators, "accelerators");
        Config[] configArr = new Config[4];
        configArr[0] = new LabelConfig(ConfigKeys.INSTANCE.getMAX_TOKENS(), String.valueOf(defaultMaxToken));
        configArr[1] = new NumberSliderConfig(ConfigKeys.INSTANCE.getTOPK(), 5.0f, 100.0f, defaultTopK, ValueType.INT, false, 32, null);
        configArr[2] = new NumberSliderConfig(ConfigKeys.INSTANCE.getTEMPERATURE(), 0.0f, 1.0f, defaultTemperature, ValueType.FLOAT, false, 32, null);
        ConfigKey accelerator = ConfigKeys.INSTANCE.getACCELERATOR();
        String label = accelerators.get(0).getLabel();
        List<? extends Accelerator> $this$map$iv = accelerators;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Accelerator it = (Accelerator) item$iv$iv;
            destination$iv$iv.add(it.getLabel());
        }
        configArr[3] = new SegmentedButtonConfig(accelerator, label, (List) destination$iv$iv, false, 8, null);
        return CollectionsKt.listOf((Object[]) configArr);
    }

    public static final String getConfigValueString(Object value, Config config) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(config, "config");
        String strNewValue = String.valueOf(value);
        if (config.getValueType() == ValueType.FLOAT) {
            String strNewValue2 = String.format("%.2f", Arrays.copyOf(new Object[]{value}, 1));
            Intrinsics.checkNotNullExpressionValue(strNewValue2, "format(...)");
            return strNewValue2;
        }
        return strNewValue;
    }
}
