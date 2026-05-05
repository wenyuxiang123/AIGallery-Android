package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/NumberSliderConfig;", "Lcom/google/ai/edge/gallery/data/Config;", "key", "Lcom/google/ai/edge/gallery/data/ConfigKey;", "sliderMin", "", "sliderMax", "defaultValue", "valueType", "Lcom/google/ai/edge/gallery/data/ValueType;", "needReinitialization", "", "<init>", "(Lcom/google/ai/edge/gallery/data/ConfigKey;FFFLcom/google/ai/edge/gallery/data/ValueType;Z)V", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getSliderMin", "()F", "getSliderMax", "getDefaultValue", "()Ljava/lang/Float;", "getValueType", "()Lcom/google/ai/edge/gallery/data/ValueType;", "getNeedReinitialization", "()Z", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
