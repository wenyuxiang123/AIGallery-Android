package com.google.ai.edge.gallery.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/NamedDeviceGroup;", "", "groupName", "", "description", "deviceModels", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGroupName", "()Ljava/lang/String;", "getDescription", "getDeviceModels", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class NamedDeviceGroup {
    public static final int $stable = 8;

    @SerializedName("description")
    private final String description;

    @SerializedName("deviceModels")
    private final List<String> deviceModels;

    @SerializedName("groupName")
    private final String groupName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NamedDeviceGroup copy$default(NamedDeviceGroup namedDeviceGroup, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = namedDeviceGroup.groupName;
        }
        if ((i & 2) != 0) {
            str2 = namedDeviceGroup.description;
        }
        if ((i & 4) != 0) {
            list = namedDeviceGroup.deviceModels;
        }
        return namedDeviceGroup.copy(str, str2, list);
    }

    
    public final String getGroupName() {
        return this.groupName;
    }

    
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component3() {
        return this.deviceModels;
    }

    public final NamedDeviceGroup copy(String groupName, String description, List<String> deviceModels) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(deviceModels, "deviceModels");
        return new NamedDeviceGroup(groupName, description, deviceModels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NamedDeviceGroup)) {
            return false;
        }
        NamedDeviceGroup namedDeviceGroup = (NamedDeviceGroup) other;
        return Intrinsics.areEqual(this.groupName, namedDeviceGroup.groupName) && Intrinsics.areEqual(this.description, namedDeviceGroup.description) && Intrinsics.areEqual(this.deviceModels, namedDeviceGroup.deviceModels);
    }

    public int hashCode() {
        return (((this.groupName.hashCode() * 31) + (this.description == null ? 0 : this.description.hashCode())) * 31) + this.deviceModels.hashCode();
    }

    public String toString() {
        return "NamedDeviceGroup(groupName=" + this.groupName + ", description=" + this.description + ", deviceModels=" + this.deviceModels + ")";
    }

    public NamedDeviceGroup(String groupName, String description, List<String> deviceModels) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(deviceModels, "deviceModels");
        this.groupName = groupName;
        this.description = description;
        this.deviceModels = deviceModels;
    }

    public /* synthetic */ NamedDeviceGroup(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getDeviceModels() {
        return this.deviceModels;
    }
}
