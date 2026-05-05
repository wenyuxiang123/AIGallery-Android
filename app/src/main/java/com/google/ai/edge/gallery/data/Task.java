package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotLongStateKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.C2421R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



\u0010*R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0016\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0011\u0010\u0017\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0011\u0010\u0018\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u001a\u0010\u001c\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010:\"\u0004\b=\u0010>R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006_"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/Task;", "", "id", "", Constants.ScionAnalytics.PARAM_LABEL, "category", "Lcom/google/ai/edge/gallery/data/CategoryInfo;", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconVectorResourceId", "", "description", "shortDescription", "docUrl", "sourceCodeUrl", "models", "", "Lcom/google/ai/edge/gallery/data/Model;", "modelNames", "", "handleModelConfigChangesInTask", "", "experimental", "newFeature", "useThemeColor", "defaultSystemPrompt", "agentNameRes", "textInputPlaceHolderRes", FirebaseAnalytics.Param.INDEX, "updateTrigger", "Landroidx/compose/runtime/MutableState;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/ai/edge/gallery/data/CategoryInfo;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZZLjava/lang/String;IIILandroidx/compose/runtime/MutableState;)V", "getId", "()Ljava/lang/String;", "getLabel", "getCategory", "()Lcom/google/ai/edge/gallery/data/CategoryInfo;", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getIconVectorResourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "getShortDescription", "getDocUrl", "getSourceCodeUrl", "getModels", "()Ljava/util/List;", "getModelNames", "getHandleModelConfigChangesInTask", "()Z", "getExperimental", "getNewFeature", "getUseThemeColor", "getDefaultSystemPrompt", "getAgentNameRes", "()I", "getTextInputPlaceHolderRes", "getIndex", "setIndex", "(I)V", "getUpdateTrigger", "()Landroidx/compose/runtime/MutableState;", "allowCapability", "capability", "Lcom/google/ai/edge/gallery/data/ModelCapability;", "model", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/ai/edge/gallery/data/CategoryInfo;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZZLjava/lang/String;IIILandroidx/compose/runtime/MutableState;)Lcom/google/ai/edge/gallery/data/Task;", "equals", "other", "hashCode", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class Task {
    public static final int $stable = 8;
    private final int agentNameRes;
    private final CategoryInfo category;
    private final String defaultSystemPrompt;
    private final String description;
    private final String docUrl;
    private final boolean experimental;
    private final boolean handleModelConfigChangesInTask;
    private final ImageVector icon;
    private final Integer iconVectorResourceId;
    private final String id;
    private int index;
    private final String label;
    private final List<String> modelNames;
    private final List<Model> models;
    private final boolean newFeature;
    private final String shortDescription;
    private final String sourceCodeUrl;
    private final int textInputPlaceHolderRes;
    private final MutableState<Long> updateTrigger;
    private final boolean useThemeColor;

    
    public final String getId() {
        return this.id;
    }

    public final List<Model> component10() {
        return this.models;
    }

    public final List<String> component11() {
        return this.modelNames;
    }

    
    public final boolean getHandleModelConfigChangesInTask() {
        return this.handleModelConfigChangesInTask;
    }

    
    public final boolean getExperimental() {
        return this.experimental;
    }

    
    public final boolean getNewFeature() {
        return this.newFeature;
    }

    
    public final boolean getUseThemeColor() {
        return this.useThemeColor;
    }

    
    public final String getDefaultSystemPrompt() {
        return this.defaultSystemPrompt;
    }

    
    public final int getAgentNameRes() {
        return this.agentNameRes;
    }

    
    public final int getTextInputPlaceHolderRes() {
        return this.textInputPlaceHolderRes;
    }

    
    public final int getIndex() {
        return this.index;
    }

    
    public final String getLabel() {
        return this.label;
    }

    public final MutableState<Long> component20() {
        return this.updateTrigger;
    }

    
    public final CategoryInfo getCategory() {
        return this.category;
    }

    
    public final ImageVector getIcon() {
        return this.icon;
    }

    
    public final Integer getIconVectorResourceId() {
        return this.iconVectorResourceId;
    }

    
    public final String getDescription() {
        return this.description;
    }

    
    public final String getShortDescription() {
        return this.shortDescription;
    }

    
    public final String getDocUrl() {
        return this.docUrl;
    }

    
    public final String getSourceCodeUrl() {
        return this.sourceCodeUrl;
    }

    public final Task copy(String id, String label, CategoryInfo category, ImageVector icon, Integer iconVectorResourceId, String description, String shortDescription, String docUrl, String sourceCodeUrl, List<Model> models, List<String> modelNames, boolean handleModelConfigChangesInTask, boolean experimental, boolean newFeature, boolean useThemeColor, String defaultSystemPrompt, int agentNameRes, int textInputPlaceHolderRes, int index, MutableState<Long> updateTrigger) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(docUrl, "docUrl");
        Intrinsics.checkNotNullParameter(sourceCodeUrl, "sourceCodeUrl");
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(modelNames, "modelNames");
        Intrinsics.checkNotNullParameter(defaultSystemPrompt, "defaultSystemPrompt");
        Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
        return new Task(id, label, category, icon, iconVectorResourceId, description, shortDescription, docUrl, sourceCodeUrl, models, modelNames, handleModelConfigChangesInTask, experimental, newFeature, useThemeColor, defaultSystemPrompt, agentNameRes, textInputPlaceHolderRes, index, updateTrigger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Task)) {
            return false;
        }
        Task task = (Task) other;
        return Intrinsics.areEqual(this.id, task.id) && Intrinsics.areEqual(this.label, task.label) && Intrinsics.areEqual(this.category, task.category) && Intrinsics.areEqual(this.icon, task.icon) && Intrinsics.areEqual(this.iconVectorResourceId, task.iconVectorResourceId) && Intrinsics.areEqual(this.description, task.description) && Intrinsics.areEqual(this.shortDescription, task.shortDescription) && Intrinsics.areEqual(this.docUrl, task.docUrl) && Intrinsics.areEqual(this.sourceCodeUrl, task.sourceCodeUrl) && Intrinsics.areEqual(this.models, task.models) && Intrinsics.areEqual(this.modelNames, task.modelNames) && this.handleModelConfigChangesInTask == task.handleModelConfigChangesInTask && this.experimental == task.experimental && this.newFeature == task.newFeature && this.useThemeColor == task.useThemeColor && Intrinsics.areEqual(this.defaultSystemPrompt, task.defaultSystemPrompt) && this.agentNameRes == task.agentNameRes && this.textInputPlaceHolderRes == task.textInputPlaceHolderRes && this.index == task.index && Intrinsics.areEqual(this.updateTrigger, task.updateTrigger);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + this.category.hashCode()) * 31) + (this.icon == null ? 0 : this.icon.hashCode())) * 31) + (this.iconVectorResourceId != null ? this.iconVectorResourceId.hashCode() : 0)) * 31) + this.description.hashCode()) * 31) + this.shortDescription.hashCode()) * 31) + this.docUrl.hashCode()) * 31) + this.sourceCodeUrl.hashCode()) * 31) + this.models.hashCode()) * 31) + this.modelNames.hashCode()) * 31) + Boolean.hashCode(this.handleModelConfigChangesInTask)) * 31) + Boolean.hashCode(this.experimental)) * 31) + Boolean.hashCode(this.newFeature)) * 31) + Boolean.hashCode(this.useThemeColor)) * 31) + this.defaultSystemPrompt.hashCode()) * 31) + Integer.hashCode(this.agentNameRes)) * 31) + Integer.hashCode(this.textInputPlaceHolderRes)) * 31) + Integer.hashCode(this.index)) * 31) + this.updateTrigger.hashCode();
    }

    public String toString() {
        return "Task(id=" + this.id + ", label=" + this.label + ", category=" + this.category + ", icon=" + this.icon + ", iconVectorResourceId=" + this.iconVectorResourceId + ", description=" + this.description + ", shortDescription=" + this.shortDescription + ", docUrl=" + this.docUrl + ", sourceCodeUrl=" + this.sourceCodeUrl + ", models=" + this.models + ", modelNames=" + this.modelNames + ", handleModelConfigChangesInTask=" + this.handleModelConfigChangesInTask + ", experimental=" + this.experimental + ", newFeature=" + this.newFeature + ", useThemeColor=" + this.useThemeColor + ", defaultSystemPrompt=" + this.defaultSystemPrompt + ", agentNameRes=" + this.agentNameRes + ", textInputPlaceHolderRes=" + this.textInputPlaceHolderRes + ", index=" + this.index + ", updateTrigger=" + this.updateTrigger + ")";
    }

    public Task(String id, String label, CategoryInfo category, ImageVector icon, Integer iconVectorResourceId, String description, String shortDescription, String docUrl, String sourceCodeUrl, List<Model> models, List<String> modelNames, boolean handleModelConfigChangesInTask, boolean experimental, boolean newFeature, boolean useThemeColor, String defaultSystemPrompt, int agentNameRes, int textInputPlaceHolderRes, int index, MutableState<Long> updateTrigger) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(docUrl, "docUrl");
        Intrinsics.checkNotNullParameter(sourceCodeUrl, "sourceCodeUrl");
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(modelNames, "modelNames");
        Intrinsics.checkNotNullParameter(defaultSystemPrompt, "defaultSystemPrompt");
        Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
        this.id = id;
        this.label = label;
        this.category = category;
        this.icon = icon;
        this.iconVectorResourceId = iconVectorResourceId;
        this.description = description;
        this.shortDescription = shortDescription;
        this.docUrl = docUrl;
        this.sourceCodeUrl = sourceCodeUrl;
        this.models = models;
        this.modelNames = modelNames;
        this.handleModelConfigChangesInTask = handleModelConfigChangesInTask;
        this.experimental = experimental;
        this.newFeature = newFeature;
        this.useThemeColor = useThemeColor;
        this.defaultSystemPrompt = defaultSystemPrompt;
        this.agentNameRes = agentNameRes;
        this.textInputPlaceHolderRes = textInputPlaceHolderRes;
        this.index = index;
        this.updateTrigger = updateTrigger;
    }

    public /* synthetic */ Task(String str, String str2, CategoryInfo categoryInfo, ImageVector imageVector, Integer num, String str3, String str4, String str5, String str6, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, String str7, int i, int i2, int i3, MutableState mutableState, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, categoryInfo, (i4 & 8) != 0 ? null : imageVector, (i4 & 16) != 0 ? null : num, str3, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? "" : str5, (i4 & 256) != 0 ? "" : str6, list, (i4 & 1024) != 0 ? CollectionsKt.emptyList() : list2, (i4 & 2048) != 0 ? false : z, (i4 & 4096) != 0 ? false : z2, (i4 & 8192) != 0 ? false : z3, (i4 & 16384) != 0 ? false : z4, (32768 & i4) != 0 ? "" : str7, (65536 & i4) != 0 ? C2421R.string.chat_generic_agent_name : i, (131072 & i4) != 0 ? C2421R.string.chat_textinput_placeholder : i2, (262144 & i4) != 0 ? -1 : i3, (i4 & 524288) != 0 ? SnapshotLongStateKt.mutableLongStateOf(0L) : mutableState);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final CategoryInfo getCategory() {
        return this.category;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }

    public final Integer getIconVectorResourceId() {
        return this.iconVectorResourceId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getShortDescription() {
        return this.shortDescription;
    }

    public final String getDocUrl() {
        return this.docUrl;
    }

    public final String getSourceCodeUrl() {
        return this.sourceCodeUrl;
    }

    public final List<Model> getModels() {
        return this.models;
    }

    public final List<String> getModelNames() {
        return this.modelNames;
    }

    public final boolean getHandleModelConfigChangesInTask() {
        return this.handleModelConfigChangesInTask;
    }

    public final boolean getExperimental() {
        return this.experimental;
    }

    public final boolean getNewFeature() {
        return this.newFeature;
    }

    public final boolean getUseThemeColor() {
        return this.useThemeColor;
    }

    public final String getDefaultSystemPrompt() {
        return this.defaultSystemPrompt;
    }

    public final int getAgentNameRes() {
        return this.agentNameRes;
    }

    public final int getTextInputPlaceHolderRes() {
        return this.textInputPlaceHolderRes;
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final MutableState<Long> getUpdateTrigger() {
        return this.updateTrigger;
    }

    public final boolean allowCapability(ModelCapability capability, Model model) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        Intrinsics.checkNotNullParameter(model, "model");
        List<String> list = model.getCapabilityToTaskTypes().get(capability);
        return list != null && list.contains(this.id);
    }
}
