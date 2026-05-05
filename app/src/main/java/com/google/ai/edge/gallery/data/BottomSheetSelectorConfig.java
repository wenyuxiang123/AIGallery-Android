package com.google.ai.edge.gallery.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getDefaultValue", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getBottomSheetTitleResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class BottomSheetSelectorConfig extends Config {
    public static final int $stable = 8;
    private final Integer bottomSheetTitleResId;
    private final String defaultValue;
    private final ConfigKey key;
    private final List<BottomSheetSelectorItem> options;

    public /* synthetic */ BottomSheetSelectorConfig(ConfigKey configKey, String str, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(configKey, str, list, (i & 8) != 0 ? null : num);
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public ConfigKey getKey() {
        return this.key;
    }

    @Override // com.google.ai.edge.gallery.data.Config
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public final List<BottomSheetSelectorItem> getOptions() {
        return this.options;
    }

    public final Integer getBottomSheetTitleResId() {
        return this.bottomSheetTitleResId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetSelectorConfig(ConfigKey key, String defaultValue, List<BottomSheetSelectorItem> options, Integer bottomSheetTitleResId) {
        super(ConfigEditorType.BOTTOMSHEET_SELECTOR, key, defaultValue, ValueType.STRING, false, 16, null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(options, "options");
        this.key = key;
        this.defaultValue = defaultValue;
        this.options = options;
        this.bottomSheetTitleResId = bottomSheetTitleResId;
    }
}
