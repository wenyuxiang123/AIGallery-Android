package com.google.ai.edge.gallery.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getDefaultValue", "()Ljava/lang/String;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class LabelConfig extends Config {
    public static final int $stable = 8;
    private final String defaultValue;
    private final ConfigKey key;

    public /* synthetic */ LabelConfig(ConfigKey configKey, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(configKey, (i & 2) != 0 ? "" : str);
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public String getDefaultValue() {
        return this.defaultValue;
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public ConfigKey getKey() {
        return this.key;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelConfig(ConfigKey key, String defaultValue) {
        super(ConfigEditorType.LABEL, key, defaultValue, ValueType.STRING, false, 16, null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.key = key;
        this.defaultValue = defaultValue;
    }
}
