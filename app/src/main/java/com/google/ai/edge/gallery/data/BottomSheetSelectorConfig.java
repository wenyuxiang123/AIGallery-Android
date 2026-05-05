package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/BottomSheetSelectorConfig;", "Lcom/google/ai/edge/gallery/data/Config;", "key", "Lcom/google/ai/edge/gallery/data/ConfigKey;", "defaultValue", "", "options", "", "Lcom/google/ai/edge/gallery/data/BottomSheetSelectorItem;", "bottomSheetTitleResId", "", "<init>", "(Lcom/google/ai/edge/gallery/data/ConfigKey;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getDefaultValue", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getBottomSheetTitleResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
