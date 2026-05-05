package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/Config;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/google/ai/edge/gallery/data/ConfigEditorType;", "key", "Lcom/google/ai/edge/gallery/data/ConfigKey;", "defaultValue", "valueType", "Lcom/google/ai/edge/gallery/data/ValueType;", "needReinitialization", "", "<init>", "(Lcom/google/ai/edge/gallery/data/ConfigEditorType;Lcom/google/ai/edge/gallery/data/ConfigKey;Ljava/lang/Object;Lcom/google/ai/edge/gallery/data/ValueType;Z)V", "getType", "()Lcom/google/ai/edge/gallery/data/ConfigEditorType;", "getKey", "()Lcom/google/ai/edge/gallery/data/ConfigKey;", "getDefaultValue", "()Ljava/lang/Object;", "getValueType", "()Lcom/google/ai/edge/gallery/data/ValueType;", "getNeedReinitialization", "()Z", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public class Config {
    public static final int $stable = 8;
    private final Object defaultValue;
    private final ConfigKey key;
    private final boolean needReinitialization;
    private final ConfigEditorType type;
    private final ValueType valueType;

    public Config(ConfigEditorType type, ConfigKey key, Object defaultValue, ValueType valueType, boolean needReinitialization) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        this.type = type;
        this.key = key;
        this.defaultValue = defaultValue;
        this.valueType = valueType;
        this.needReinitialization = needReinitialization;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Config(ConfigEditorType configEditorType, ConfigKey configKey, Object obj, ValueType valueType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        if ((i & 16) == 0) {
            z2 = z;
        } else {
            z2 = true;
        }
        this(configEditorType, configKey, obj, valueType, z2);
    }

    public final ConfigEditorType getType() {
        return this.type;
    }

    public ConfigKey getKey() {
        return this.key;
    }

    public Object getDefaultValue() {
        return this.defaultValue;
    }

    public ValueType getValueType() {
        return this.valueType;
    }

    public boolean getNeedReinitialization() {
        return this.needReinitialization;
    }
}
