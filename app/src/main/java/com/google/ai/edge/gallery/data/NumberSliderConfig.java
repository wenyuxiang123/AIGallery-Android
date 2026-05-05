package com.google.ai.edge.gallery.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getSliderMin", "()F", "getSliderMax", "getDefaultValue", "()Ljava/lang/Float;", "getValueType", "()Lcom/google/ai/edge/gallery/data/ValueType;", "getNeedReinitialization", "()Z", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class NumberSliderConfig extends Config {
    public static final int $stable = 8;
    private final float defaultValue;
    private final ConfigKey key;
    private final boolean needReinitialization;
    private final float sliderMax;
    private final float sliderMin;
    private final ValueType valueType;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NumberSliderConfig(ConfigKey configKey, float f, float f2, float f3, ValueType valueType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        if ((i & 32) == 0) {
            z2 = z;
        } else {
            z2 = true;
        }
        this(configKey, f, f2, f3, valueType, z2);
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public ConfigKey getKey() {
        return this.key;
    }

    public final float getSliderMin() {
        return this.sliderMin;
    }

    public final float getSliderMax() {
        return this.sliderMax;
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public Float getDefaultValue() {
        return Float.valueOf(this.defaultValue);
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public ValueType getValueType() {
        return this.valueType;
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public boolean getNeedReinitialization() {
        return this.needReinitialization;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberSliderConfig(ConfigKey key, float sliderMin, float sliderMax, float defaultValue, ValueType valueType, boolean needReinitialization) {
        super(ConfigEditorType.NUMBER_SLIDER, key, Float.valueOf(defaultValue), valueType, false, 16, null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        this.key = key;
        this.sliderMin = sliderMin;
        this.sliderMax = sliderMax;
        this.defaultValue = defaultValue;
        this.valueType = valueType;
        this.needReinitialization = needReinitialization;
    }
}
