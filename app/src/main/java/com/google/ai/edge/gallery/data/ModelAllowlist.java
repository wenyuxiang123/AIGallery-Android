package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelAllowlist.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/ModelAllowlist;", "", "models", "", "Lcom/google/ai/edge/gallery/data/AllowedModel;", "aicoreRequirements", "Lcom/google/ai/edge/gallery/data/DeviceRequirements;", "<init>", "(Ljava/util/List;Lcom/google/ai/edge/gallery/data/DeviceRequirements;)V", "getModels", "()Ljava/util/List;", "getAicoreRequirements", "()Lcom/google/ai/edge/gallery/data/DeviceRequirements;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component2, reason: from getter */
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
