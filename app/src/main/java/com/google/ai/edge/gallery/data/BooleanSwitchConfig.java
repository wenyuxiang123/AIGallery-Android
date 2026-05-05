package com.google.ai.edge.gallery.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getDefaultValue", "()Ljava/lang/Boolean;", "getNeedReinitialization", "()Z", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class BooleanSwitchConfig extends Config {
    public static final int $stable = 8;
    private final boolean defaultValue;
    private final ConfigKey key;
    private final boolean needReinitialization;

    public /* synthetic */ BooleanSwitchConfig(ConfigKey configKey, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(configKey, z, (i & 4) != 0 ? true : z2);
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public ConfigKey getKey() {
        return this.key;
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public Boolean getDefaultValue() {
        return Boolean.valueOf(this.defaultValue);
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public boolean getNeedReinitialization() {
        return this.needReinitialization;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BooleanSwitchConfig(ConfigKey key, boolean defaultValue, boolean needReinitialization) {
        super(ConfigEditorType.BOOLEAN_SWITCH, key, Boolean.valueOf(defaultValue), ValueType.BOOLEAN, false, 16, null);
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.defaultValue = defaultValue;
        this.needReinitialization = needReinitialization;
    }
}
