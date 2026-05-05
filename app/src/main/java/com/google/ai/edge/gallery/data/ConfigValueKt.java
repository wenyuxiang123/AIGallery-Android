package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.data.ConfigValue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConfigValue.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0006\u001a\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\b¨\u0006\t"}, m922d2 = {"getIntConfigValue", "", "configValue", "Lcom/google/ai/edge/gallery/data/ConfigValue;", "default", "getFloatConfigValue", "", "getStringConfigValue", "", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ConfigValueKt {
    public static final int getIntConfigValue(ConfigValue configValue, int i) {
        if (configValue == null) {
            return i;
        }
        if (configValue instanceof ConfigValue.IntValue) {
            return ((ConfigValue.IntValue) configValue).getValue();
        }
        if (configValue instanceof ConfigValue.FloatValue) {
            return (int) ((ConfigValue.FloatValue) configValue).getValue();
        }
        if (configValue instanceof ConfigValue.StringValue) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float getFloatConfigValue(ConfigValue configValue, float f) {
        if (configValue == null) {
            return f;
        }
        if (configValue instanceof ConfigValue.IntValue) {
            return ((ConfigValue.IntValue) configValue).getValue();
        }
        if (configValue instanceof ConfigValue.FloatValue) {
            return ((ConfigValue.FloatValue) configValue).getValue();
        }
        if (configValue instanceof ConfigValue.StringValue) {
            return 0.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getStringConfigValue(ConfigValue configValue, String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        if (configValue == null) {
            return str;
        }
        if (configValue instanceof ConfigValue.IntValue) {
            return String.valueOf(((ConfigValue.IntValue) configValue).getValue());
        }
        if (configValue instanceof ConfigValue.FloatValue) {
            return String.valueOf(((ConfigValue.FloatValue) configValue).getValue());
        }
        if (configValue instanceof ConfigValue.StringValue) {
            return ((ConfigValue.StringValue) configValue).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
