package com.google.ai.edge.gallery.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getDefaultValue", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getAllowMultiple", "()Z", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class SegmentedButtonConfig extends Config {
    public static final int $stable = 8;
    private final boolean allowMultiple;
    private final String defaultValue;
    private final ConfigKey key;
    private final List<String> options;

    public /* synthetic */ SegmentedButtonConfig(ConfigKey configKey, String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(configKey, str, list, (i & 8) != 0 ? false : z);
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public ConfigKey getKey() {
        return this.key;
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public final boolean getAllowMultiple() {
        return this.allowMultiple;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonConfig(ConfigKey key, String defaultValue, List<String> options, boolean allowMultiple) {
        super(ConfigEditorType.SEGMENTED_BUTTON, key, defaultValue, ValueType.STRING, false, 16, null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(options, "options");
        this.key = key;
        this.defaultValue = defaultValue;
        this.options = options;
        this.allowMultiple = allowMultiple;
    }
}
