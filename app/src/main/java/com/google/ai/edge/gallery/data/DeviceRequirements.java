package com.google.ai.edge.gallery.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getAllowedDeviceGroups", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
