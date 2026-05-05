package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/BooleanSwitchConfig;", "Lcom/google/ai/edge/gallery/data/Config;", "key", "Lcom/google/ai/edge/gallery/data/ConfigKey;", "defaultValue", "", "needReinitialization", "<init>", "(Lcom/google/ai/edge/gallery/data/ConfigKey;ZZ)V", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getDefaultValue", "()Ljava/lang/Boolean;", "getNeedReinitialization", "()Z", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
