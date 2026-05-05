// Class: final Lcom.google.ai.edge.gallery.data.AllowedModel
// Access: public
class AllowedModel extends Ljava/lang/Object {

    // Fields:
    private final com.google.ai.edge.gallery.data.AICoreModelPreference aicorePreference;
    private final com.google.ai.edge.gallery.data.AICoreModelReleaseStage aicoreReleaseStage;
    private final java.util.List bestForTaskTypes;
    private final java.util.List capabilities;
    private final java.util.Map capabilityToTaskTypes;
    private final java.lang.String commitHash;
    private final com.google.ai.edge.gallery.data.DefaultConfig defaultConfig;
    private final java.lang.String description;
    private final java.lang.Boolean disabled;
    private final java.lang.Boolean llmSupportAudio;
    private final java.lang.Boolean llmSupportImage;
    private final java.lang.Boolean llmSupportMobileActions;
    private final java.lang.Boolean llmSupportTinyGarden;
    private final java.lang.String localModelFilePathOverride;
    private final java.lang.Integer minDeviceMemoryInGb;
    private final java.lang.String modelFile;
    private final java.lang.String modelId;
    private final java.lang.String name;
    private final java.lang.String parentModelName;
    private final com.google.ai.edge.gallery.data.RuntimeType runtimeType;
    private final long sizeInBytes;
    private final java.util.Map socToModelFiles;
    private final java.util.List taskTypes;
    private final java.util.List updatableModelFiles;
    private final java.lang.String updateInfo;
    private final java.lang.String url;
    private final java.lang.String variantLabel;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->$stable:I
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.google.ai.edge.gallery.data.DefaultConfig, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, java.util.Map, com.google.ai.edge.gallery.data.RuntimeType, com.google.ai.edge.gallery.data.AICoreModelReleaseStage, com.google.ai.edge.gallery.data.AICoreModelPreference, java.lang.String, java.lang.String, java.util.Map, java.util.List, java.lang.String) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "J",
        // "Lcom/google/ai/edge/gallery/data/DefaultConfig;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;",
        // "Ljava/lang/Boolean;",
        // "Ljava/lang/Boolean;",
        // "Ljava/lang/Boolean;",
        // "Ljava/lang/Boolean;",
        // "Ljava/lang/Boolean;",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/gallery/data/ModelCapability;",
        // ... (truncated)
    }
    public void synthetic constructor <init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.google.ai.edge.gallery.data.DefaultConfig, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, java.util.Map, com.google.ai.edge.gallery.data.RuntimeType, com.google.ai.edge.gallery.data.AICoreModelReleaseStage, com.google.ai.edge.gallery.data.AICoreModelPreference, java.lang.String, java.lang.String, java.util.Map, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // move/from16 v0, p29
        // and-int/lit16 v1, v0, 0x100
        // const/4 v2, 0x0
        // if-eqz v1, :cond_0
        // move-object v13, v2
        // goto :goto_0
        // move-object/from16 v13, p10
        // and-int/lit16 v1, v0, 0x200
        // if-eqz v1, :cond_1
        // move-object v14, v2
        // goto :goto_1
        // move-object/from16 v14, p11
        // and-int/lit16 v1, v0, 0x400
        // if-eqz v1, :cond_2
        // move-object v15, v2
        // goto :goto_2
        // move-object/from16 v15, p12
        // and-int/lit16 v1, v0, 0x800
        // if-eqz v1, :cond_3
        // move-object/from16 v16, v2
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.AllowedModel static synthetic copy$default(com.google.ai.edge.gallery.data.AllowedModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.google.ai.edge.gallery.data.DefaultConfig, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, java.util.Map, com.google.ai.edge.gallery.data.RuntimeType, com.google.ai.edge.gallery.data.AICoreModelReleaseStage, com.google.ai.edge.gallery.data.AICoreModelPreference, java.lang.String, java.lang.String, java.util.Map, java.util.List, java.lang.String, int, java.lang.Object) {
        // move-object/from16 v0, p0
        // move/from16 v1, p29
        // and-int/lit8 v2, v1, 0x1
        // if-eqz v2, :cond_0
        // iget-object v2, v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->name:Ljava/lang/String;
        // goto :goto_0
        // move-object/from16 v2, p1
        // and-int/lit8 v3, v1, 0x2
        // if-eqz v3, :cond_1
        // iget-object v3, v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelId:Ljava/lang/String;
        // goto :goto_1
        // move-object/from16 v3, p2
        // and-int/lit8 v4, v1, 0x4
        // if-eqz v4, :cond_2
        // iget-object v4, v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelFile:Ljava/lang/String;
        // goto :goto_2
        // move-object/from16 v4, p3
        // and-int/lit8 v5, v1, 0x8
        // if-eqz v5, :cond_3
        // iget-object v5, v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->commitHash:Ljava/lang/String;
        // ... (truncated)
    }
    public java.lang.String final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->name:Ljava/lang/String;
        return v0;
    }
    public java.lang.Boolean final component10() {
        return v0;
    }
    public java.lang.Boolean final component11() {
        return v0;
    }
    public java.lang.Boolean final component12() {
        return v0;
    }
    public java.lang.Boolean final component13() {
        return v0;
    }
    public java.util.List final component14() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelCapability;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->capabilities:Ljava/util/List;
        return v0;
    }
    public java.lang.Integer final component15() {
        return v0;
    }
    public java.util.List final component16() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        return v0;
    }
    public java.lang.String final component17() {
        return v0;
    }
    public java.lang.String final component18() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->url:Ljava/lang/String;
        return v0;
    }
    public java.util.Map final component19() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Lcom/google/ai/edge/gallery/data/SocModelFile;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->socToModelFiles:Ljava/util/Map;
        return v0;
    }
    public java.lang.String final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelId:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.RuntimeType final component20() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelReleaseStage final component21() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelPreference final component22() {
        return v0;
    }
    public java.lang.String final component23() {
        return v0;
    }
    public java.lang.String final component24() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->variantLabel:Ljava/lang/String;
        return v0;
    }
    public java.util.Map final component25() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Lcom/google/ai/edge/gallery/data/ModelCapability;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;>;"
        // }
        return v0;
    }
    public java.util.List final component26() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelFile;",
        // ">;"
        // }
        return v0;
    }
    public java.lang.String final component27() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->updateInfo:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component3() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelFile:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component4() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->commitHash:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component5() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->description:Ljava/lang/String;
        return v0;
    }
    public long final component6() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->sizeInBytes:J
        return v0;
    }
    public com.google.ai.edge.gallery.data.DefaultConfig final component7() {
        return v0;
    }
    public java.util.List final component8() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->taskTypes:Ljava/util/List;
        return v0;
    }
    public java.lang.Boolean final component9() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->disabled:Ljava/lang/Boolean;
        return v0;
    }
    public com.google.ai.edge.gallery.data.AllowedModel final copy(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.google.ai.edge.gallery.data.DefaultConfig, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.util.List, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, java.util.Map, com.google.ai.edge.gallery.data.RuntimeType, com.google.ai.edge.gallery.data.AICoreModelReleaseStage, com.google.ai.edge.gallery.data.AICoreModelPreference, java.lang.String, java.lang.String, java.util.Map, java.util.List, java.lang.String) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "J",
        // "Lcom/google/ai/edge/gallery/data/DefaultConfig;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;",
        // "Ljava/lang/Boolean;",
        // "Ljava/lang/Boolean;",
        // "Ljava/lang/Boolean;",
        // "Ljava/lang/Boolean;",
        // "Ljava/lang/Boolean;",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/gallery/data/ModelCapability;",
        // ... (truncated)
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/AllowedModel;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/AllowedModel;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->name:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/AllowedModel;->name:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelId:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelId:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.AICoreModelPreference final getAicorePreference() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelReleaseStage final getAicoreReleaseStage() {
        return v0;
    }
    public java.util.List final getBestForTaskTypes() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        return v0;
    }
    public java.util.List final getCapabilities() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelCapability;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->capabilities:Ljava/util/List;
        return v0;
    }
    public java.util.Map final getCapabilityToTaskTypes() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Lcom/google/ai/edge/gallery/data/ModelCapability;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;>;"
        // }
        return v0;
    }
    public java.lang.String final getCommitHash() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->commitHash:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.DefaultConfig final getDefaultConfig() {
        return v0;
    }
    public java.lang.String final getDescription() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->description:Ljava/lang/String;
        return v0;
    }
    public java.lang.Boolean final getDisabled() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->disabled:Ljava/lang/Boolean;
        return v0;
    }
    public java.lang.Boolean final getLlmSupportAudio() {
        return v0;
    }
    public java.lang.Boolean final getLlmSupportImage() {
        return v0;
    }
    public java.lang.Boolean final getLlmSupportMobileActions() {
        return v0;
    }
    public java.lang.Boolean final getLlmSupportTinyGarden() {
        return v0;
    }
    public java.lang.String final getLocalModelFilePathOverride() {
        return v0;
    }
    public java.lang.Integer final getMinDeviceMemoryInGb() {
        return v0;
    }
    public java.lang.String final getModelFile() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelFile:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getModelId() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelId:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getName() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->name:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getParentModelName() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.RuntimeType final getRuntimeType() {
        return v0;
    }
    public long final getSizeInBytes() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->sizeInBytes:J
        return v0;
    }
    public java.util.Map final getSocToModelFiles() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Lcom/google/ai/edge/gallery/data/SocModelFile;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->socToModelFiles:Ljava/util/Map;
        return v0;
    }
    public java.util.List final getTaskTypes() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->taskTypes:Ljava/util/List;
        return v0;
    }
    public java.util.List final getUpdatableModelFiles() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelFile;",
        // ">;"
        // }
        return v0;
    }
    public java.lang.String final getUpdateInfo() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->updateInfo:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getUrl() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->url:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getVariantLabel() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->variantLabel:Ljava/lang/String;
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->name:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelId:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelFile:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v0, v2
        // mul-int/lit8 v1, v0, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->commitHash:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->description:Ljava/lang/String;
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.Model final toModel() {
        // move-object/from16 v0, p0
        // const/4 v1, 0x0
        // iget-object v1, v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->commitHash:Ljava/lang/String;
        // const/4 v2, 0x0
        // iget-object v2, v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelFile:Ljava/lang/String;
        // const/4 v3, 0x0
        // iget-object v4, v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->url:Ljava/lang/String;
        String v5 = "?download=true";
        String v6 = "/";
        String v7 = "/resolve/";
        String v8 = "https://huggingface.co/";
        // if-nez v4, :cond_0
        // iget-object v4, v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelId:Ljava/lang/String;
        // iget-object v9, v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->commitHash:Ljava/lang/String;
        // iget-object v10, v0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelFile:Ljava/lang/String;
        StringBuilder; v11 = new StringBuilder;();
        // DIRECT <init>()V
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v11
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // ... (truncated)
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelId:Ljava/lang/String;
        // iget-object v1, p0, Lcom/google/ai/edge/gallery/data/AllowedModel;->modelFile:Ljava/lang/String;
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v2 = "/";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}