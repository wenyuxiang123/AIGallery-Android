package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/SegmentedButtonConfig;", "Lcom/google/ai/edge/gallery/data/Config;", "key", "Lcom/google/ai/edge/gallery/data/ConfigKey;", "defaultValue", "", "options", "", "allowMultiple", "", "<init>", "(Lcom/google/ai/edge/gallery/data/ConfigKey;Ljava/lang/String;Ljava/util/List;Z)V", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getDefaultValue", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getAllowMultiple", "()Z", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
