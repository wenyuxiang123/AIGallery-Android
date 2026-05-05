package com.google.ai.edge.gallery.customtasks.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CustomTaskData.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/common/CustomTaskDataForBuiltinTask;", "", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "onNavUp", "Lkotlin/Function0;", "", "<init>", "(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function0;)V", "getModelManagerViewModel", "()Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "getOnNavUp", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class CustomTaskDataForBuiltinTask {
    public static final int $stable = 8;
    private final ModelManagerViewModel modelManagerViewModel;
    private final Function0<Unit> onNavUp;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomTaskDataForBuiltinTask copy$default(CustomTaskDataForBuiltinTask customTaskDataForBuiltinTask, ModelManagerViewModel modelManagerViewModel, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            modelManagerViewModel = customTaskDataForBuiltinTask.modelManagerViewModel;
        }
        if ((i & 2) != 0) {
            function0 = customTaskDataForBuiltinTask.onNavUp;
        }
        return customTaskDataForBuiltinTask.copy(modelManagerViewModel, function0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ModelManagerViewModel getModelManagerViewModel() {
        return this.modelManagerViewModel;
    }

    public final Function0<Unit> component2() {
        return this.onNavUp;
    }

    public final CustomTaskDataForBuiltinTask copy(ModelManagerViewModel modelManagerViewModel, Function0<Unit> onNavUp) {
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(onNavUp, "onNavUp");
        return new CustomTaskDataForBuiltinTask(modelManagerViewModel, onNavUp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomTaskDataForBuiltinTask)) {
            return false;
        }
        CustomTaskDataForBuiltinTask customTaskDataForBuiltinTask = (CustomTaskDataForBuiltinTask) other;
        return Intrinsics.areEqual(this.modelManagerViewModel, customTaskDataForBuiltinTask.modelManagerViewModel) && Intrinsics.areEqual(this.onNavUp, customTaskDataForBuiltinTask.onNavUp);
    }

    public int hashCode() {
        return (this.modelManagerViewModel.hashCode() * 31) + this.onNavUp.hashCode();
    }

    public String toString() {
        return "CustomTaskDataForBuiltinTask(modelManagerViewModel=" + this.modelManagerViewModel + ", onNavUp=" + this.onNavUp + ")";
    }

    public CustomTaskDataForBuiltinTask(ModelManagerViewModel modelManagerViewModel, Function0<Unit> onNavUp) {
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(onNavUp, "onNavUp");
        this.modelManagerViewModel = modelManagerViewModel;
        this.onNavUp = onNavUp;
    }

    public final ModelManagerViewModel getModelManagerViewModel() {
        return this.modelManagerViewModel;
    }

    public final Function0<Unit> getOnNavUp() {
        return this.onNavUp;
    }
}
