package com.google.ai.edge.gallery.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getModels", "()Ljava/util/List;", "getAicoreRequirements", "()Lcom/google/ai/edge/gallery/data/DeviceRequirements;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class ModelAllowlist {
    public static final int $stable = 8;

    @SerializedName("aicoreRequirements")
    private final DeviceRequirements aicoreRequirements;
    private final List<AllowedModel> models;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModelAllowlist copy$default(ModelAllowlist modelAllowlist, List list, DeviceRequirements deviceRequirements, int i, Object obj) {
        if ((i & 1) != 0) {
            list = modelAllowlist.models;
        }
        if ((i & 2) != 0) {
            deviceRequirements = modelAllowlist.aicoreRequirements;
        }
        return modelAllowlist.copy(list, deviceRequirements);
    }

    public final List<AllowedModel> component1() {
        return this.models;
    }

    
    public final DeviceRequirements getAicoreRequirements() {
        return this.aicoreRequirements;
    }

    public final ModelAllowlist copy(List<AllowedModel> models, DeviceRequirements aicoreRequirements) {
        Intrinsics.checkNotNullParameter(models, "models");
        return new ModelAllowlist(models, aicoreRequirements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelAllowlist)) {
            return false;
        }
        ModelAllowlist modelAllowlist = (ModelAllowlist) other;
        return Intrinsics.areEqual(this.models, modelAllowlist.models) && Intrinsics.areEqual(this.aicoreRequirements, modelAllowlist.aicoreRequirements);
    }

    public int hashCode() {
        return (this.models.hashCode() * 31) + (this.aicoreRequirements == null ? 0 : this.aicoreRequirements.hashCode());
    }

    public String toString() {
        return "ModelAllowlist(models=" + this.models + ", aicoreRequirements=" + this.aicoreRequirements + ")";
    }

    public ModelAllowlist(List<AllowedModel> models, DeviceRequirements aicoreRequirements) {
        Intrinsics.checkNotNullParameter(models, "models");
        this.models = models;
        this.aicoreRequirements = aicoreRequirements;
    }

    public /* synthetic */ ModelAllowlist(List list, DeviceRequirements deviceRequirements, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : deviceRequirements);
    }

    public final List<AllowedModel> getModels() {
        return this.models;
    }

    public final DeviceRequirements getAicoreRequirements() {
        return this.aicoreRequirements;
    }
}
