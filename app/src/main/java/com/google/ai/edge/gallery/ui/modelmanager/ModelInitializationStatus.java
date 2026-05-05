package com.google.ai.edge.gallery.ui.modelmanager;

import androidx.core.app.NotificationCompat;
import com.google.ai.edge.gallery.data.Accelerator;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.Model;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006!"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatus;", "", NotificationCompat.CATEGORY_STATUS, "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatusType;", "error", "", "initializedBackends", "", "<init>", "(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatusType;Ljava/lang/String;Ljava/util/Set;)V", "getStatus", "()Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatusType;", "getError", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "getInitializedBackends", "()Ljava/util/Set;", "setInitializedBackends", "(Ljava/util/Set;)V", "isFirstInitialization", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class ModelInitializationStatus {
    public static final int $stable = 8;
    private String error;
    private Set<String> initializedBackends;
    private final ModelInitializationStatusType status;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModelInitializationStatus copy$default(ModelInitializationStatus modelInitializationStatus, ModelInitializationStatusType modelInitializationStatusType, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            modelInitializationStatusType = modelInitializationStatus.status;
        }
        if ((i & 2) != 0) {
            str = modelInitializationStatus.error;
        }
        if ((i & 4) != 0) {
            set = modelInitializationStatus.initializedBackends;
        }
        return modelInitializationStatus.copy(modelInitializationStatusType, str, set);
    }

    
    public final ModelInitializationStatusType getStatus() {
        return this.status;
    }

    
    public final String getError() {
        return this.error;
    }

    public final Set<String> component3() {
        return this.initializedBackends;
    }

    public final ModelInitializationStatus copy(ModelInitializationStatusType status, String error, Set<String> initializedBackends) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(initializedBackends, "initializedBackends");
        return new ModelInitializationStatus(status, error, initializedBackends);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelInitializationStatus)) {
            return false;
        }
        ModelInitializationStatus modelInitializationStatus = (ModelInitializationStatus) other;
        return this.status == modelInitializationStatus.status && Intrinsics.areEqual(this.error, modelInitializationStatus.error) && Intrinsics.areEqual(this.initializedBackends, modelInitializationStatus.initializedBackends);
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.error.hashCode()) * 31) + this.initializedBackends.hashCode();
    }

    public String toString() {
        return "ModelInitializationStatus(status=" + this.status + ", error=" + this.error + ", initializedBackends=" + this.initializedBackends + ")";
    }

    public ModelInitializationStatus(ModelInitializationStatusType status, String error, Set<String> initializedBackends) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(initializedBackends, "initializedBackends");
        this.status = status;
        this.error = error;
        this.initializedBackends = initializedBackends;
    }

    public /* synthetic */ ModelInitializationStatus(ModelInitializationStatusType modelInitializationStatusType, String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modelInitializationStatusType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? SetsKt.emptySet() : set);
    }

    public final ModelInitializationStatusType getStatus() {
        return this.status;
    }

    public final String getError() {
        return this.error;
    }

    public final void setError(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.error = str;
    }

    public final Set<String> getInitializedBackends() {
        return this.initializedBackends;
    }

    public final void setInitializedBackends(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.initializedBackends = set;
    }

    public final boolean isFirstInitialization(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        String backend = model.getStringConfigValue(ConfigKeys.INSTANCE.getACCELERATOR(), Accelerator.GPU.getLabel());
        return !this.initializedBackends.contains(backend);
    }
}
