package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/LabelConfig;", "Lcom/google/ai/edge/gallery/data/Config;", "key", "Lcom/google/ai/edge/gallery/data/ConfigKey;", "defaultValue", "", "<init>", "(Lcom/google/ai/edge/gallery/data/ConfigKey;Ljava/lang/String;)V", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getDefaultValue", "()Ljava/lang/String;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
