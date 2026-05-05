package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelAllowlist.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/DeviceRequirements;", "", "allowedDeviceGroups", "", "Lcom/google/ai/edge/gallery/data/NamedDeviceGroup;", "<init>", "(Ljava/util/List;)V", "getAllowedDeviceGroups", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class DeviceRequirements {
    public static final int $stable = 8;

    @SerializedName("allowedDeviceGroups")
    private final List<NamedDeviceGroup> allowedDeviceGroups;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceRequirements() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceRequirements copy$default(DeviceRequirements deviceRequirements, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deviceRequirements.allowedDeviceGroups;
        }
        return deviceRequirements.copy(list);
    }

    public final List<NamedDeviceGroup> component1() {
        return this.allowedDeviceGroups;
    }

    public final DeviceRequirements copy(List<NamedDeviceGroup> allowedDeviceGroups) {
        return new DeviceRequirements(allowedDeviceGroups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeviceRequirements) && Intrinsics.areEqual(this.allowedDeviceGroups, ((DeviceRequirements) other).allowedDeviceGroups);
    }

    public int hashCode() {
        if (this.allowedDeviceGroups == null) {
            return 0;
        }
        return this.allowedDeviceGroups.hashCode();
    }

    public String toString() {
        return "DeviceRequirements(allowedDeviceGroups=" + this.allowedDeviceGroups + ")";
    }

    public DeviceRequirements(List<NamedDeviceGroup> list) {
        this.allowedDeviceGroups = list;
    }

    public /* synthetic */ DeviceRequirements(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public final List<NamedDeviceGroup> getAllowedDeviceGroups() {
        return this.allowedDeviceGroups;
    }
}
