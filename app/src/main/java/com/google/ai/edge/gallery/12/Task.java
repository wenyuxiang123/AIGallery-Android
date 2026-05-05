// Class: final Lcom.google.ai.edge.gallery.data.Task
// Access: public
class Task extends Ljava/lang/Object {

    // Fields:
    private final int agentNameRes;
    private final com.google.ai.edge.gallery.data.CategoryInfo category;
    private final java.lang.String defaultSystemPrompt;
    private final java.lang.String description;
    private final java.lang.String docUrl;
    private final boolean experimental;
    private final boolean handleModelConfigChangesInTask;
    private final androidx.compose.ui.graphics.vector.ImageVector icon;
    private final java.lang.Integer iconVectorResourceId;
    private final java.lang.String id;
    private int index;
    private final java.lang.String label;
    private final java.util.List modelNames;
    private final java.util.List models;
    private final boolean newFeature;
    private final java.lang.String shortDescription;
    private final java.lang.String sourceCodeUrl;
    private final int textInputPlaceHolderRes;
    private final androidx.compose.runtime.MutableState updateTrigger;
    private final boolean useThemeColor;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/Task;->$stable:I
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, com.google.ai.edge.gallery.data.CategoryInfo, androidx.compose.ui.graphics.vector.ImageVector, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean, boolean, java.lang.String, int, int, int, androidx.compose.runtime.MutableState) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Lcom/google/ai/edge/gallery/data/CategoryInfo;",
        // "Landroidx/compose/ui/graphics/vector/ImageVector;",
        // "Ljava/lang/Integer;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // ">;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;ZZZZ",
        // "Ljava/lang/String;",
        // "III",
        // "Landroidx/compose/runtime/MutableState<",
        // ... (truncated)
    }
    public void synthetic constructor <init>(java.lang.String, java.lang.String, com.google.ai.edge.gallery.data.CategoryInfo, androidx.compose.ui.graphics.vector.ImageVector, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean, boolean, java.lang.String, int, int, int, androidx.compose.runtime.MutableState, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // move/from16 v0, p21
        // and-int/lit8 v1, v0, 0x8
        // const/4 v2, 0x0
        // if-eqz v1, :cond_0
        // move-object v7, v2
        // goto :goto_0
        // move-object/from16 v7, p4
        // and-int/lit8 v1, v0, 0x10
        // if-eqz v1, :cond_1
        // move-object v8, v2
        // goto :goto_1
        // move-object/from16 v8, p5
        // and-int/lit8 v1, v0, 0x40
        // if-eqz v1, :cond_2
        // move-object v10, v2
        // goto :goto_2
        // move-object/from16 v10, p7
        // and-int/lit16 v1, v0, 0x80
        // if-eqz v1, :cond_3
        // move-object v11, v2
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.Task static synthetic copy$default(com.google.ai.edge.gallery.data.Task, java.lang.String, java.lang.String, com.google.ai.edge.gallery.data.CategoryInfo, androidx.compose.ui.graphics.vector.ImageVector, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean, boolean, java.lang.String, int, int, int, androidx.compose.runtime.MutableState, int, java.lang.Object) {
        // move-object/from16 v0, p0
        // move/from16 v1, p21
        // and-int/lit8 v2, v1, 0x1
        // if-eqz v2, :cond_0
        // iget-object v2, v0, Lcom/google/ai/edge/gallery/data/Task;->id:Ljava/lang/String;
        // goto :goto_0
        // move-object/from16 v2, p1
        // and-int/lit8 v3, v1, 0x2
        // if-eqz v3, :cond_1
        // iget-object v3, v0, Lcom/google/ai/edge/gallery/data/Task;->label:Ljava/lang/String;
        // goto :goto_1
        // move-object/from16 v3, p2
        // and-int/lit8 v4, v1, 0x4
        // if-eqz v4, :cond_2
        // goto :goto_2
        // move-object/from16 v4, p3
        // and-int/lit8 v5, v1, 0x8
        // if-eqz v5, :cond_3
        // goto :goto_3
        // move-object/from16 v5, p4
        // ... (truncated)
    }
    public boolean final allowCapability(com.google.ai.edge.gallery.data.ModelCapability, com.google.ai.edge.gallery.data.Model) {
        String v0 = "capability";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "model";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getCapabilityToTaskTypes()Ljava/util/Map;
        // move-result-object v0
        // INTERFACE get(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Ljava/util/List;
        // const/4 v1, 0x0
        // if-eqz v0, :cond_0
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/Task;->id:Ljava/lang/String;
        // INTERFACE contains(Ljava/lang/Object;)Z
        // move-result v0
        // const/4 v2, 0x1
        // if-ne v0, v2, :cond_0
        // move v1, v2
        return v1;
    }
    public java.lang.String final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->id:Ljava/lang/String;
        return v0;
    }
    public java.util.List final component10() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->models:Ljava/util/List;
        return v0;
    }
    public java.util.List final component11() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->modelNames:Ljava/util/List;
        return v0;
    }
    public boolean final component12() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Task;->handleModelConfigChangesInTask:Z
        return v0;
    }
    public boolean final component13() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Task;->experimental:Z
        return v0;
    }
    public boolean final component14() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Task;->newFeature:Z
        return v0;
    }
    public boolean final component15() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Task;->useThemeColor:Z
        return v0;
    }
    public java.lang.String final component16() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->defaultSystemPrompt:Ljava/lang/String;
        return v0;
    }
    public int final component17() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/Task;->agentNameRes:I
        return v0;
    }
    public int final component18() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/Task;->textInputPlaceHolderRes:I
        return v0;
    }
    public int final component19() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/Task;->index:I
        return v0;
    }
    public java.lang.String final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->label:Ljava/lang/String;
        return v0;
    }
    public androidx.compose.runtime.MutableState final component20() {
        // value = {
        // "()",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Long;",
        // ">;"
        // }
        return v0;
    }
    public com.google.ai.edge.gallery.data.CategoryInfo final component3() {
        return v0;
    }
    public androidx.compose.ui.graphics.vector.ImageVector final component4() {
        return v0;
    }
    public java.lang.Integer final component5() {
        return v0;
    }
    public java.lang.String final component6() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->description:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component7() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->shortDescription:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component8() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->docUrl:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component9() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->sourceCodeUrl:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.Task final copy(java.lang.String, java.lang.String, com.google.ai.edge.gallery.data.CategoryInfo, androidx.compose.ui.graphics.vector.ImageVector, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean, boolean, java.lang.String, int, int, int, androidx.compose.runtime.MutableState) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Lcom/google/ai/edge/gallery/data/CategoryInfo;",
        // "Landroidx/compose/ui/graphics/vector/ImageVector;",
        // "Ljava/lang/Integer;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // ">;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;ZZZZ",
        // "Ljava/lang/String;",
        // "III",
        // "Landroidx/compose/runtime/MutableState<",
        // ... (truncated)
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/Task;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/Task;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/Task;->id:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/Task;->id:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/Task;->label:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/Task;->label:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        // ... (truncated)
    }
    public int final getAgentNameRes() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/Task;->agentNameRes:I
        return v0;
    }
    public com.google.ai.edge.gallery.data.CategoryInfo final getCategory() {
        return v0;
    }
    public java.lang.String final getDefaultSystemPrompt() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->defaultSystemPrompt:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getDescription() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->description:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getDocUrl() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->docUrl:Ljava/lang/String;
        return v0;
    }
    public boolean final getExperimental() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Task;->experimental:Z
        return v0;
    }
    public boolean final getHandleModelConfigChangesInTask() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Task;->handleModelConfigChangesInTask:Z
        return v0;
    }
    public androidx.compose.ui.graphics.vector.ImageVector final getIcon() {
        return v0;
    }
    public java.lang.Integer final getIconVectorResourceId() {
        return v0;
    }
    public java.lang.String final getId() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->id:Ljava/lang/String;
        return v0;
    }
    public int final getIndex() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/Task;->index:I
        return v0;
    }
    public java.lang.String final getLabel() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->label:Ljava/lang/String;
        return v0;
    }
    public java.util.List final getModelNames() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->modelNames:Ljava/util/List;
        return v0;
    }
    public java.util.List final getModels() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->models:Ljava/util/List;
        return v0;
    }
    public boolean final getNewFeature() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Task;->newFeature:Z
        return v0;
    }
    public java.lang.String final getShortDescription() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->shortDescription:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getSourceCodeUrl() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->sourceCodeUrl:Ljava/lang/String;
        return v0;
    }
    public int final getTextInputPlaceHolderRes() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/Task;->textInputPlaceHolderRes:I
        return v0;
    }
    public androidx.compose.runtime.MutableState final getUpdateTrigger() {
        // value = {
        // "()",
        // "Landroidx/compose/runtime/MutableState<",
        // "Ljava/lang/Long;",
        // ">;"
        // }
        return v0;
    }
    public boolean final getUseThemeColor() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Task;->useThemeColor:Z
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Task;->id:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/Task;->label:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v0, v2
        // mul-int/lit8 v1, v0, 0x1f
        // const/4 v3, 0x0
        // if-nez v2, :cond_0
        // move v2, v3
        // goto :goto_0
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // ... (truncated)
    }
    public void final setIndex(int) {
        // iput p1, p0, Lcom/google/ai/edge/gallery/data/Task;->index:I
        return ;
    }
    public java.lang.String toString() {
        // move-object/from16 v0, p0
        // iget-object v1, v0, Lcom/google/ai/edge/gallery/data/Task;->id:Ljava/lang/String;
        // iget-object v2, v0, Lcom/google/ai/edge/gallery/data/Task;->label:Ljava/lang/String;
        // iget-object v6, v0, Lcom/google/ai/edge/gallery/data/Task;->description:Ljava/lang/String;
        // iget-object v7, v0, Lcom/google/ai/edge/gallery/data/Task;->shortDescription:Ljava/lang/String;
        // iget-object v8, v0, Lcom/google/ai/edge/gallery/data/Task;->docUrl:Ljava/lang/String;
        // iget-object v9, v0, Lcom/google/ai/edge/gallery/data/Task;->sourceCodeUrl:Ljava/lang/String;
        // iget-object v10, v0, Lcom/google/ai/edge/gallery/data/Task;->models:Ljava/util/List;
        // iget-object v11, v0, Lcom/google/ai/edge/gallery/data/Task;->modelNames:Ljava/util/List;
        // iget-boolean v12, v0, Lcom/google/ai/edge/gallery/data/Task;->handleModelConfigChangesInTask:Z
        // iget-boolean v13, v0, Lcom/google/ai/edge/gallery/data/Task;->experimental:Z
        // iget-boolean v14, v0, Lcom/google/ai/edge/gallery/data/Task;->newFeature:Z
        // iget-boolean v15, v0, Lcom/google/ai/edge/gallery/data/Task;->useThemeColor:Z
        // move/from16 v16, v15
        // iget-object v15, v0, Lcom/google/ai/edge/gallery/data/Task;->defaultSystemPrompt:Ljava/lang/String;
        // move-object/from16 v17, v15
        // iget v15, v0, Lcom/google/ai/edge/gallery/data/Task;->agentNameRes:I
        // move/from16 v18, v15
        // iget v15, v0, Lcom/google/ai/edge/gallery/data/Task;->textInputPlaceHolderRes:I
        // move/from16 v19, v15
        // ... (truncated)
    }
}