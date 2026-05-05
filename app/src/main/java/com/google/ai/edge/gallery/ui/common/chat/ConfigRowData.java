package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBodyConfigUpdate.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ConfigRowData;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "oldValueDisplay", "newValueDisplay", "isChanged", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getLabel", "()Ljava/lang/String;", "getOldValueDisplay", "getNewValueDisplay", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
final /* data */ class ConfigRowData {
    private final boolean isChanged;
    private final String label;
    private final String newValueDisplay;
    private final String oldValueDisplay;

    public static /* synthetic */ ConfigRowData copy$default(ConfigRowData configRowData, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = configRowData.label;
        }
        if ((i & 2) != 0) {
            str2 = configRowData.oldValueDisplay;
        }
        if ((i & 4) != 0) {
            str3 = configRowData.newValueDisplay;
        }
        if ((i & 8) != 0) {
            z = configRowData.isChanged;
        }
        return configRowData.copy(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOldValueDisplay() {
        return this.oldValueDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNewValueDisplay() {
        return this.newValueDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsChanged() {
        return this.isChanged;
    }

    public final ConfigRowData copy(String label, String oldValueDisplay, String newValueDisplay, boolean isChanged) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(oldValueDisplay, "oldValueDisplay");
        Intrinsics.checkNotNullParameter(newValueDisplay, "newValueDisplay");
        return new ConfigRowData(label, oldValueDisplay, newValueDisplay, isChanged);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigRowData)) {
            return false;
        }
        ConfigRowData configRowData = (ConfigRowData) other;
        return Intrinsics.areEqual(this.label, configRowData.label) && Intrinsics.areEqual(this.oldValueDisplay, configRowData.oldValueDisplay) && Intrinsics.areEqual(this.newValueDisplay, configRowData.newValueDisplay) && this.isChanged == configRowData.isChanged;
    }

    public int hashCode() {
        return (((((this.label.hashCode() * 31) + this.oldValueDisplay.hashCode()) * 31) + this.newValueDisplay.hashCode()) * 31) + Boolean.hashCode(this.isChanged);
    }

    public String toString() {
        return "ConfigRowData(label=" + this.label + ", oldValueDisplay=" + this.oldValueDisplay + ", newValueDisplay=" + this.newValueDisplay + ", isChanged=" + this.isChanged + ")";
    }

    public ConfigRowData(String label, String oldValueDisplay, String newValueDisplay, boolean isChanged) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(oldValueDisplay, "oldValueDisplay");
        Intrinsics.checkNotNullParameter(newValueDisplay, "newValueDisplay");
        this.label = label;
        this.oldValueDisplay = oldValueDisplay;
        this.newValueDisplay = newValueDisplay;
        this.isChanged = isChanged;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getOldValueDisplay() {
        return this.oldValueDisplay;
    }

    public final String getNewValueDisplay() {
        return this.newValueDisplay;
    }

    public final boolean isChanged() {
        return this.isChanged;
    }
}
