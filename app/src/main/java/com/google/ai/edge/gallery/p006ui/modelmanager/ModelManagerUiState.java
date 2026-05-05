package com.google.ai.edge.gallery.p006ui.modelmanager;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelKt;
import com.google.ai.edge.gallery.data.Task;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelManagerViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0010J\u000e\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0010J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001b\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0013HÆ\u0003J\t\u00103\u001a\u00020\u0013HÆ\u0003J£\u0001\u00104\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001J\u0013\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%¨\u0006:"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "", "tasks", "", "Lcom/google/ai/edge/gallery/data/Task;", "tasksByCategory", "", "", "modelDownloadStatus", "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;", "modelInitializationStatus", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatus;", "loadingModelAllowlist", "", "loadingModelAllowlistError", "selectedModel", "Lcom/google/ai/edge/gallery/data/Model;", "textInputHistory", "configValuesUpdateTrigger", "", "modelImportingUpdateTrigger", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZLjava/lang/String;Lcom/google/ai/edge/gallery/data/Model;Ljava/util/List;JJ)V", "getTasks", "()Ljava/util/List;", "getTasksByCategory", "()Ljava/util/Map;", "getModelDownloadStatus", "getModelInitializationStatus", "getLoadingModelAllowlist", "()Z", "getLoadingModelAllowlistError", "()Ljava/lang/String;", "getSelectedModel", "()Lcom/google/ai/edge/gallery/data/Model;", "getTextInputHistory", "getConfigValuesUpdateTrigger", "()J", "getModelImportingUpdateTrigger", "isModelInitialized", "model", "isModelInitializing", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class ModelManagerUiState {
    public static final int $stable = 8;
    private final long configValuesUpdateTrigger;
    private final boolean loadingModelAllowlist;
    private final String loadingModelAllowlistError;
    private final Map<String, ModelDownloadStatus> modelDownloadStatus;
    private final long modelImportingUpdateTrigger;
    private final Map<String, ModelInitializationStatus> modelInitializationStatus;
    private final Model selectedModel;
    private final List<Task> tasks;
    private final Map<String, List<Task>> tasksByCategory;
    private final List<String> textInputHistory;

    public final List<Task> component1() {
        return this.tasks;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getModelImportingUpdateTrigger() {
        return this.modelImportingUpdateTrigger;
    }

    public final Map<String, List<Task>> component2() {
        return this.tasksByCategory;
    }

    public final Map<String, ModelDownloadStatus> component3() {
        return this.modelDownloadStatus;
    }

    public final Map<String, ModelInitializationStatus> component4() {
        return this.modelInitializationStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getLoadingModelAllowlist() {
        return this.loadingModelAllowlist;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLoadingModelAllowlistError() {
        return this.loadingModelAllowlistError;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Model getSelectedModel() {
        return this.selectedModel;
    }

    public final List<String> component8() {
        return this.textInputHistory;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getConfigValuesUpdateTrigger() {
        return this.configValuesUpdateTrigger;
    }

    public final ModelManagerUiState copy(List<Task> tasks, Map<String, ? extends List<Task>> tasksByCategory, Map<String, ModelDownloadStatus> modelDownloadStatus, Map<String, ModelInitializationStatus> modelInitializationStatus, boolean loadingModelAllowlist, String loadingModelAllowlistError, Model selectedModel, List<String> textInputHistory, long configValuesUpdateTrigger, long modelImportingUpdateTrigger) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(tasksByCategory, "tasksByCategory");
        Intrinsics.checkNotNullParameter(modelDownloadStatus, "modelDownloadStatus");
        Intrinsics.checkNotNullParameter(modelInitializationStatus, "modelInitializationStatus");
        Intrinsics.checkNotNullParameter(loadingModelAllowlistError, "loadingModelAllowlistError");
        Intrinsics.checkNotNullParameter(selectedModel, "selectedModel");
        Intrinsics.checkNotNullParameter(textInputHistory, "textInputHistory");
        return new ModelManagerUiState(tasks, tasksByCategory, modelDownloadStatus, modelInitializationStatus, loadingModelAllowlist, loadingModelAllowlistError, selectedModel, textInputHistory, configValuesUpdateTrigger, modelImportingUpdateTrigger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelManagerUiState)) {
            return false;
        }
        ModelManagerUiState modelManagerUiState = (ModelManagerUiState) other;
        return Intrinsics.areEqual(this.tasks, modelManagerUiState.tasks) && Intrinsics.areEqual(this.tasksByCategory, modelManagerUiState.tasksByCategory) && Intrinsics.areEqual(this.modelDownloadStatus, modelManagerUiState.modelDownloadStatus) && Intrinsics.areEqual(this.modelInitializationStatus, modelManagerUiState.modelInitializationStatus) && this.loadingModelAllowlist == modelManagerUiState.loadingModelAllowlist && Intrinsics.areEqual(this.loadingModelAllowlistError, modelManagerUiState.loadingModelAllowlistError) && Intrinsics.areEqual(this.selectedModel, modelManagerUiState.selectedModel) && Intrinsics.areEqual(this.textInputHistory, modelManagerUiState.textInputHistory) && this.configValuesUpdateTrigger == modelManagerUiState.configValuesUpdateTrigger && this.modelImportingUpdateTrigger == modelManagerUiState.modelImportingUpdateTrigger;
    }

    public int hashCode() {
        return (((((((((((((((((this.tasks.hashCode() * 31) + this.tasksByCategory.hashCode()) * 31) + this.modelDownloadStatus.hashCode()) * 31) + this.modelInitializationStatus.hashCode()) * 31) + Boolean.hashCode(this.loadingModelAllowlist)) * 31) + this.loadingModelAllowlistError.hashCode()) * 31) + this.selectedModel.hashCode()) * 31) + this.textInputHistory.hashCode()) * 31) + Long.hashCode(this.configValuesUpdateTrigger)) * 31) + Long.hashCode(this.modelImportingUpdateTrigger);
    }

    public String toString() {
        return "ModelManagerUiState(tasks=" + this.tasks + ", tasksByCategory=" + this.tasksByCategory + ", modelDownloadStatus=" + this.modelDownloadStatus + ", modelInitializationStatus=" + this.modelInitializationStatus + ", loadingModelAllowlist=" + this.loadingModelAllowlist + ", loadingModelAllowlistError=" + this.loadingModelAllowlistError + ", selectedModel=" + this.selectedModel + ", textInputHistory=" + this.textInputHistory + ", configValuesUpdateTrigger=" + this.configValuesUpdateTrigger + ", modelImportingUpdateTrigger=" + this.modelImportingUpdateTrigger + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModelManagerUiState(List<Task> tasks, Map<String, ? extends List<Task>> tasksByCategory, Map<String, ModelDownloadStatus> modelDownloadStatus, Map<String, ModelInitializationStatus> modelInitializationStatus, boolean loadingModelAllowlist, String loadingModelAllowlistError, Model selectedModel, List<String> textInputHistory, long configValuesUpdateTrigger, long modelImportingUpdateTrigger) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(tasksByCategory, "tasksByCategory");
        Intrinsics.checkNotNullParameter(modelDownloadStatus, "modelDownloadStatus");
        Intrinsics.checkNotNullParameter(modelInitializationStatus, "modelInitializationStatus");
        Intrinsics.checkNotNullParameter(loadingModelAllowlistError, "loadingModelAllowlistError");
        Intrinsics.checkNotNullParameter(selectedModel, "selectedModel");
        Intrinsics.checkNotNullParameter(textInputHistory, "textInputHistory");
        this.tasks = tasks;
        this.tasksByCategory = tasksByCategory;
        this.modelDownloadStatus = modelDownloadStatus;
        this.modelInitializationStatus = modelInitializationStatus;
        this.loadingModelAllowlist = loadingModelAllowlist;
        this.loadingModelAllowlistError = loadingModelAllowlistError;
        this.selectedModel = selectedModel;
        this.textInputHistory = textInputHistory;
        this.configValuesUpdateTrigger = configValuesUpdateTrigger;
        this.modelImportingUpdateTrigger = modelImportingUpdateTrigger;
    }

    public /* synthetic */ ModelManagerUiState(List list, Map map, Map map2, Map map3, boolean z, String str, Model model, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, map, map2, map3, (i & 16) != 0 ? true : z, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? ModelKt.getEMPTY_MODEL() : model, (i & 128) != 0 ? CollectionsKt.emptyList() : list2, (i & 256) != 0 ? 0L : j, (i & 512) != 0 ? 0L : j2);
    }

    public final List<Task> getTasks() {
        return this.tasks;
    }

    public final Map<String, List<Task>> getTasksByCategory() {
        return this.tasksByCategory;
    }

    public final Map<String, ModelDownloadStatus> getModelDownloadStatus() {
        return this.modelDownloadStatus;
    }

    public final Map<String, ModelInitializationStatus> getModelInitializationStatus() {
        return this.modelInitializationStatus;
    }

    public final boolean getLoadingModelAllowlist() {
        return this.loadingModelAllowlist;
    }

    public final String getLoadingModelAllowlistError() {
        return this.loadingModelAllowlistError;
    }

    public final Model getSelectedModel() {
        return this.selectedModel;
    }

    public final List<String> getTextInputHistory() {
        return this.textInputHistory;
    }

    public final long getConfigValuesUpdateTrigger() {
        return this.configValuesUpdateTrigger;
    }

    public final long getModelImportingUpdateTrigger() {
        return this.modelImportingUpdateTrigger;
    }

    public final boolean isModelInitialized(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        ModelInitializationStatus modelInitializationStatus = this.modelInitializationStatus.get(model.getName());
        return (modelInitializationStatus != null ? modelInitializationStatus.getStatus() : null) == ModelInitializationStatusType.INITIALIZED;
    }

    public final boolean isModelInitializing(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        ModelInitializationStatus modelInitializationStatus = this.modelInitializationStatus.get(model.getName());
        return (modelInitializationStatus != null ? modelInitializationStatus.getStatus() : null) == ModelInitializationStatusType.INITIALIZING;
    }
}
