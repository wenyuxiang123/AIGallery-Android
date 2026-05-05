// Class: final Lcom.google.ai.edge.gallery.data.Model
// Access: public
class Model extends Ljava/lang/Object {

    // Fields:
    private final java.util.List accelerators;
    private java.lang.String accessToken;
    private final com.google.ai.edge.gallery.data.AICoreModelPreference aicorePreference;
    private final com.google.ai.edge.gallery.data.AICoreModelReleaseStage aicoreReleaseStage;
    private final java.util.List bestForTaskIds;
    private final java.util.List capabilities;
    private final java.util.Map capabilityToTaskTypes;
    private boolean cleanUpAfterInit;
    private java.util.Map configValues;
    private java.util.List configs;
    private final java.lang.String displayName;
    private java.lang.String downloadFileName;
    private final java.util.List extraDataFiles;
    private final boolean imported;
    private final java.lang.String info;
    private boolean initializing;
    private java.lang.Object instance;
    private final boolean isLlm;
    private final boolean isZip;
    private com.google.ai.edge.gallery.data.ModelFile latestModelFile;
    private final java.lang.String learnMoreUrl;
    private final int llmMaxToken;
    private final java.util.List llmPromptTemplates;
    private final boolean llmSupportAudio;
    private final boolean llmSupportImage;
    private final boolean llmSupportMobileActions;
    private final boolean llmSupportTinyGarden;
    private final java.lang.String localFileRelativeDirPathOverride;
    private final java.lang.String localModelFilePathOverride;
    private final java.lang.Integer minDeviceMemoryInGb;
    private final java.lang.String name;
    private java.lang.String normalizedName;
    private final java.lang.String parentModelName;
    private java.util.Map prevConfigValues;
    private final com.google.ai.edge.gallery.data.RuntimeType runtimeType;
    private final boolean showBenchmarkButton;
    private final boolean showRunAgainButton;
    private final long sizeInBytes;
    private long totalBytes;
    private final java.lang.String unzipDir;
    private boolean updatable;
    private final java.util.List updatableModelFiles;
    private final java.lang.String updateInfo;
    private final java.lang.String url;
    private final java.lang.String variantLabel;
    private java.lang.String version;
    private final com.google.ai.edge.gallery.data.Accelerator visionAccelerator;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/Model;->$stable:I
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Integer, java.lang.String, long, java.lang.String, java.lang.String, java.util.List, boolean, com.google.ai.edge.gallery.data.AICoreModelReleaseStage, com.google.ai.edge.gallery.data.AICoreModelPreference, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.google.ai.edge.gallery.data.RuntimeType, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, java.util.List, int, java.util.List, com.google.ai.edge.gallery.data.Accelerator, boolean, java.util.Map, java.lang.String, java.lang.Object, boolean, boolean, java.util.Map, java.util.Map, long, java.lang.String, boolean, com.google.ai.edge.gallery.data.ModelFile) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/gallery/data/Config;",
        // ">;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;",
        // "Ljava/lang/Integer;",
        // "Ljava/lang/String;",
        // "J",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelDataFile;",
        // ... (truncated)
    }
    public void synthetic constructor <init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Integer, java.lang.String, long, java.lang.String, java.lang.String, java.util.List, boolean, com.google.ai.edge.gallery.data.AICoreModelReleaseStage, com.google.ai.edge.gallery.data.AICoreModelPreference, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.google.ai.edge.gallery.data.RuntimeType, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, java.util.List, int, java.util.List, com.google.ai.edge.gallery.data.Accelerator, boolean, java.util.Map, java.lang.String, java.lang.Object, boolean, boolean, java.util.Map, java.util.Map, long, java.lang.String, boolean, com.google.ai.edge.gallery.data.ModelFile, int, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // move/from16 v0, p50
        // move/from16 v1, p51
        // and-int/lit8 v2, v0, 0x2
        // if-eqz v2, :cond_0
        // move-object v2, v3
        // goto :goto_0
        // move-object/from16 v2, p2
        // and-int/lit8 v4, v0, 0x4
        // if-eqz v4, :cond_1
        // move-object v4, v3
        // goto :goto_1
        // move-object/from16 v4, p3
        // and-int/lit8 v5, v0, 0x8
        // if-eqz v5, :cond_2
        // STATIC emptyList()Ljava/util/List;
        // move-result-object v5
        // goto :goto_2
        // move-object/from16 v5, p4
        // and-int/lit8 v6, v0, 0x10
        // if-eqz v6, :cond_3
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.Model static synthetic copy$default(com.google.ai.edge.gallery.data.Model, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Integer, java.lang.String, long, java.lang.String, java.lang.String, java.util.List, boolean, com.google.ai.edge.gallery.data.AICoreModelReleaseStage, com.google.ai.edge.gallery.data.AICoreModelPreference, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.google.ai.edge.gallery.data.RuntimeType, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, java.util.List, int, java.util.List, com.google.ai.edge.gallery.data.Accelerator, boolean, java.util.Map, java.lang.String, java.lang.Object, boolean, boolean, java.util.Map, java.util.Map, long, java.lang.String, boolean, com.google.ai.edge.gallery.data.ModelFile, int, int, java.lang.Object) {
        // move-object/from16 v0, p0
        // move/from16 v1, p50
        // move/from16 v2, p51
        // and-int/lit8 v3, v1, 0x1
        // if-eqz v3, :cond_0
        // iget-object v3, v0, Lcom/google/ai/edge/gallery/data/Model;->name:Ljava/lang/String;
        // goto :goto_0
        // move-object/from16 v3, p1
        // and-int/lit8 v4, v1, 0x2
        // if-eqz v4, :cond_1
        // iget-object v4, v0, Lcom/google/ai/edge/gallery/data/Model;->displayName:Ljava/lang/String;
        // goto :goto_1
        // move-object/from16 v4, p2
        // and-int/lit8 v5, v1, 0x4
        // if-eqz v5, :cond_2
        // iget-object v5, v0, Lcom/google/ai/edge/gallery/data/Model;->info:Ljava/lang/String;
        // goto :goto_2
        // move-object/from16 v5, p3
        // and-int/lit8 v6, v1, 0x8
        // if-eqz v6, :cond_3
        // ... (truncated)
    }
    public boolean static synthetic getBooleanConfigValue$default(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.ConfigKey, boolean, int, java.lang.Object) {
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_0
        // const/4 p2, 0x0
        // VIRTUAL getBooleanConfigValue(Lcom/google/ai/edge/gallery/data/ConfigKey;Z)Z
        // move-result p0
        return p0;
    }
    public float static synthetic getFloatConfigValue$default(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.ConfigKey, float, int, java.lang.Object) {
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_0
        // const/4 p2, 0x0
        // VIRTUAL getFloatConfigValue(Lcom/google/ai/edge/gallery/data/ConfigKey;F)F
        // move-result p0
        return p0;
    }
    public int static synthetic getIntConfigValue$default(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.ConfigKey, int, int, java.lang.Object) {
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_0
        // const/4 p2, 0x0
        // VIRTUAL getIntConfigValue(Lcom/google/ai/edge/gallery/data/ConfigKey;I)I
        // move-result p0
        return p0;
    }
    public java.lang.String static synthetic getPath$default(com.google.ai.edge.gallery.data.Model, android.content.Context, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_0
        // iget-object p2, p0, Lcom/google/ai/edge/gallery/data/Model;->downloadFileName:Ljava/lang/String;
        // VIRTUAL getPath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        // move-result-object p0
        return p0;
    }
    public java.lang.String static synthetic getStringConfigValue$default(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.ConfigKey, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_0
        // VIRTUAL getStringConfigValue(Lcom/google/ai/edge/gallery/data/ConfigKey;Ljava/lang/String;)Ljava/lang/String;
        // move-result-object p0
        return p0;
    }
    private java.lang.Object final getTypedConfigValue(com.google.ai.edge.gallery.data.ConfigKey, com.google.ai.edge.gallery.data.ValueType, java.lang.Object) {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->configValues:Ljava/util/Map;
        // VIRTUAL getLabel()Ljava/lang/String;
        // move-result-object v1
        // INTERFACE getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // nop
        // STATIC convertValueToTargetType(Ljava/lang/Object;Lcom/google/ai/edge/gallery/data/ValueType;)Ljava/lang/Object;
        // move-result-object v0
        return v0;
    }
    public java.lang.String final component1() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->name:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component10() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->downloadFileName:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component11() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->version:Ljava/lang/String;
        return v0;
    }
    public java.util.List final component12() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelDataFile;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->extraDataFiles:Ljava/util/List;
        return v0;
    }
    public boolean final component13() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->isLlm:Z
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelReleaseStage final component14() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelPreference final component15() {
        return v0;
    }
    public java.lang.String final component16() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->parentModelName:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component17() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->variantLabel:Ljava/lang/String;
        return v0;
    }
    public java.util.List final component18() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelFile;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->updatableModelFiles:Ljava/util/List;
        return v0;
    }
    public java.lang.String final component19() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->updateInfo:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final component2() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->displayName:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.RuntimeType final component20() {
        return v0;
    }
    public java.lang.String final component21() {
        return v0;
    }
    public java.lang.String final component22() {
        return v0;
    }
    public boolean final component23() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->showRunAgainButton:Z
        return v0;
    }
    public boolean final component24() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->showBenchmarkButton:Z
        return v0;
    }
    public boolean final component25() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->isZip:Z
        return v0;
    }
    public java.lang.String final component26() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->unzipDir:Ljava/lang/String;
        return v0;
    }
    public java.util.List final component27() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/PromptTemplate;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmPromptTemplates:Ljava/util/List;
        return v0;
    }
    public boolean final component28() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmSupportImage:Z
        return v0;
    }
    public boolean final component29() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmSupportAudio:Z
        return v0;
    }
    public java.lang.String final component3() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->info:Ljava/lang/String;
        return v0;
    }
    public boolean final component30() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmSupportTinyGarden:Z
        return v0;
    }
    public boolean final component31() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmSupportMobileActions:Z
        return v0;
    }
    public java.util.List final component32() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelCapability;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->capabilities:Ljava/util/List;
        return v0;
    }
    public int final component33() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmMaxToken:I
        return v0;
    }
    public java.util.List final component34() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Accelerator;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->accelerators:Ljava/util/List;
        return v0;
    }
    public com.google.ai.edge.gallery.data.Accelerator final component35() {
        return v0;
    }
    public boolean final component36() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->imported:Z
        return v0;
    }
    public java.util.Map final component37() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Lcom/google/ai/edge/gallery/data/ModelCapability;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;>;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->capabilityToTaskTypes:Ljava/util/Map;
        return v0;
    }
    public java.lang.String final component38() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->normalizedName:Ljava/lang/String;
        return v0;
    }
    public java.lang.Object final component39() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->instance:Ljava/lang/Object;
        return v0;
    }
    public java.util.List final component4() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Config;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->configs:Ljava/util/List;
        return v0;
    }
    public boolean final component40() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->initializing:Z
        return v0;
    }
    public boolean final component41() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->cleanUpAfterInit:Z
        return v0;
    }
    public java.util.Map final component42() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/Object;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->configValues:Ljava/util/Map;
        return v0;
    }
    public java.util.Map final component43() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/Object;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->prevConfigValues:Ljava/util/Map;
        return v0;
    }
    public long final component44() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/Model;->totalBytes:J
        return v0;
    }
    public java.lang.String final component45() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->accessToken:Ljava/lang/String;
        return v0;
    }
    public boolean final component46() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->updatable:Z
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelFile final component47() {
        return v0;
    }
    public java.lang.String final component5() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->learnMoreUrl:Ljava/lang/String;
        return v0;
    }
    public java.util.List final component6() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->bestForTaskIds:Ljava/util/List;
        return v0;
    }
    public java.lang.Integer final component7() {
        return v0;
    }
    public java.lang.String final component8() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->url:Ljava/lang/String;
        return v0;
    }
    public long final component9() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/Model;->sizeInBytes:J
        return v0;
    }
    public com.google.ai.edge.gallery.data.Model final copy(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.Integer, java.lang.String, long, java.lang.String, java.lang.String, java.util.List, boolean, com.google.ai.edge.gallery.data.AICoreModelReleaseStage, com.google.ai.edge.gallery.data.AICoreModelPreference, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.google.ai.edge.gallery.data.RuntimeType, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, java.util.List, int, java.util.List, com.google.ai.edge.gallery.data.Accelerator, boolean, java.util.Map, java.lang.String, java.lang.Object, boolean, boolean, java.util.Map, java.util.Map, long, java.lang.String, boolean, com.google.ai.edge.gallery.data.ModelFile) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/gallery/data/Config;",
        // ">;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;",
        // "Ljava/lang/Integer;",
        // "Ljava/lang/String;",
        // "J",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelDataFile;",
        // ... (truncated)
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/Model;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/Model;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/Model;->name:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/Model;->name:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/data/Model;->displayName:Ljava/lang/String;
        // iget-object v4, v1, Lcom/google/ai/edge/gallery/data/Model;->displayName:Ljava/lang/String;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        // ... (truncated)
    }
    public java.util.List final getAccelerators() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Accelerator;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->accelerators:Ljava/util/List;
        return v0;
    }
    public java.lang.String final getAccessToken() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->accessToken:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelPreference final getAicorePreference() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.AICoreModelReleaseStage final getAicoreReleaseStage() {
        return v0;
    }
    public java.util.List final getBestForTaskIds() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->bestForTaskIds:Ljava/util/List;
        return v0;
    }
    public boolean final getBooleanConfigValue(com.google.ai.edge.gallery.data.ConfigKey, boolean) {
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // nop
        // nop
        // v0 = BOOLEAN:Lcom/google/ai/edge/gallery/data/ValueType;
        // STATIC valueOf(Z)Ljava/lang/Boolean;
        // move-result-object v1
        // DIRECT getTypedConfigValue(Lcom/google/ai/edge/gallery/data/ConfigKey;Lcom/google/ai/edge/gallery/data/ValueType;Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        String v1 = "null cannot be cast to non-null type kotlin.Boolean";
        // STATIC checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/Boolean;
        // VIRTUAL booleanValue()Z
        // move-result v0
        return v0;
    }
    public java.util.List final getCapabilities() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelCapability;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->capabilities:Ljava/util/List;
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
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->capabilityToTaskTypes:Ljava/util/Map;
        return v0;
    }
    public boolean final getCleanUpAfterInit() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->cleanUpAfterInit:Z
        return v0;
    }
    public java.util.Map final getConfigValues() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/Object;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->configValues:Ljava/util/Map;
        return v0;
    }
    public java.util.List final getConfigs() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/Config;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->configs:Ljava/util/List;
        return v0;
    }
    public java.lang.String final getDisplayName() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->displayName:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getDownloadFileName() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->downloadFileName:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelDataFile final getExtraDataFile(java.lang.String) {
        String v0 = "name";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->extraDataFiles:Ljava/util/List;
        // check-cast v0, Ljava/lang/Iterable;
        // INTERFACE iterator()Ljava/util/Iterator;
        // move-result-object v0
        // INTERFACE hasNext()Z
        // move-result v1
        // if-eqz v1, :cond_1
        // INTERFACE next()Ljava/lang/Object;
        // move-result-object v1
        // move-object v2, v1
        // check-cast v2, Lcom/google/ai/edge/gallery/data/ModelDataFile;
        // const/4 v3, 0x0
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v4
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v2
        // if-eqz v2, :cond_0
        // goto :goto_0
        // ... (truncated)
    }
    public java.util.List final getExtraDataFiles() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelDataFile;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->extraDataFiles:Ljava/util/List;
        return v0;
    }
    public float final getFloatConfigValue(com.google.ai.edge.gallery.data.ConfigKey, float) {
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = FLOAT:Lcom/google/ai/edge/gallery/data/ValueType;
        // STATIC valueOf(F)Ljava/lang/Float;
        // move-result-object v1
        // DIRECT getTypedConfigValue(Lcom/google/ai/edge/gallery/data/ConfigKey;Lcom/google/ai/edge/gallery/data/ValueType;Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        String v1 = "null cannot be cast to non-null type kotlin.Float";
        // STATIC checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/Float;
        // VIRTUAL floatValue()F
        // move-result v0
        return v0;
    }
    public boolean final getImported() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->imported:Z
        return v0;
    }
    public java.lang.String final getInfo() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->info:Ljava/lang/String;
        return v0;
    }
    public boolean final getInitializing() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->initializing:Z
        return v0;
    }
    public java.lang.Object final getInstance() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->instance:Ljava/lang/Object;
        return v0;
    }
    public int final getIntConfigValue(com.google.ai.edge.gallery.data.ConfigKey, int) {
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = INT:Lcom/google/ai/edge/gallery/data/ValueType;
        // STATIC valueOf(I)Ljava/lang/Integer;
        // move-result-object v1
        // DIRECT getTypedConfigValue(Lcom/google/ai/edge/gallery/data/ConfigKey;Lcom/google/ai/edge/gallery/data/ValueType;Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        String v1 = "null cannot be cast to non-null type kotlin.Int";
        // STATIC checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/Integer;
        // VIRTUAL intValue()I
        // move-result v0
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelFile final getLatestModelFile() {
        return v0;
    }
    public java.lang.String final getLearnMoreUrl() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->learnMoreUrl:Ljava/lang/String;
        return v0;
    }
    public int final getLlmMaxToken() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmMaxToken:I
        return v0;
    }
    public java.util.List final getLlmPromptTemplates() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/PromptTemplate;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmPromptTemplates:Ljava/util/List;
        return v0;
    }
    public boolean final getLlmSupportAudio() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmSupportAudio:Z
        return v0;
    }
    public boolean final getLlmSupportImage() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmSupportImage:Z
        return v0;
    }
    public boolean final getLlmSupportMobileActions() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmSupportMobileActions:Z
        return v0;
    }
    public boolean final getLlmSupportTinyGarden() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->llmSupportTinyGarden:Z
        return v0;
    }
    public java.lang.String final getLocalFileRelativeDirPathOverride() {
        return v0;
    }
    public java.lang.String final getLocalModelFilePathOverride() {
        return v0;
    }
    public java.lang.Integer final getMinDeviceMemoryInGb() {
        return v0;
    }
    public java.lang.String final getName() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->name:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getNormalizedName() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->normalizedName:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getParentModelName() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->parentModelName:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getPath(android.content.Context, java.lang.String) {
        // move-object/from16 v0, p0
        // move-object/from16 v1, p1
        // move-object/from16 v2, p2
        String v3 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v3 = "fileName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // iget-boolean v3, v0, Lcom/google/ai/edge/gallery/data/Model;->imported:Z
        // const/4 v5, 0x0
        String v6 = "separator";
        // const/4 v7, 0x2
        // const/4 v8, 0x1
        // const/4 v9, 0x0
        // if-eqz v3, :cond_2
        // new-array v3, v7, [Ljava/lang/String;
        // VIRTUAL getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;
        // move-result-object v5
        // if-eqz v5, :cond_1
        // VIRTUAL getAbsolutePath()Ljava/lang/String;
        // move-result-object v5
        // ... (truncated)
    }
    public java.util.Map final getPrevConfigValues() {
        // value = {
        // "()",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/Object;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->prevConfigValues:Ljava/util/Map;
        return v0;
    }
    public com.google.ai.edge.gallery.data.RuntimeType final getRuntimeType() {
        return v0;
    }
    public boolean final getShowBenchmarkButton() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->showBenchmarkButton:Z
        return v0;
    }
    public boolean final getShowRunAgainButton() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->showRunAgainButton:Z
        return v0;
    }
    public long final getSizeInBytes() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/Model;->sizeInBytes:J
        return v0;
    }
    public java.lang.String final getStringConfigValue(com.google.ai.edge.gallery.data.ConfigKey, java.lang.String) {
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "defaultValue";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v0 = STRING:Lcom/google/ai/edge/gallery/data/ValueType;
        // DIRECT getTypedConfigValue(Lcom/google/ai/edge/gallery/data/ConfigKey;Lcom/google/ai/edge/gallery/data/ValueType;Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        String v1 = "null cannot be cast to non-null type kotlin.String";
        // STATIC checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/String;
        return v0;
    }
    public long final getTotalBytes() {
        // iget-wide v0, p0, Lcom/google/ai/edge/gallery/data/Model;->totalBytes:J
        return v0;
    }
    public java.lang.String final getUnzipDir() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->unzipDir:Ljava/lang/String;
        return v0;
    }
    public boolean final getUpdatable() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->updatable:Z
        return v0;
    }
    public java.util.List final getUpdatableModelFiles() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/ModelFile;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->updatableModelFiles:Ljava/util/List;
        return v0;
    }
    public java.lang.String final getUpdateInfo() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->updateInfo:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getUrl() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->url:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getVariantLabel() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->variantLabel:Ljava/lang/String;
        return v0;
    }
    public java.lang.String final getVersion() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->version:Ljava/lang/String;
        return v0;
    }
    public com.google.ai.edge.gallery.data.Accelerator final getVisionAccelerator() {
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/data/Model;->name:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/Model;->displayName:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/Model;->info:Ljava/lang/String;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v0, v2
        // mul-int/lit8 v1, v0, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/Model;->configs:Ljava/util/List;
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget-object v2, p0, Lcom/google/ai/edge/gallery/data/Model;->learnMoreUrl:Ljava/lang/String;
        // ... (truncated)
    }
    public boolean final isLlm() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->isLlm:Z
        return v0;
    }
    public boolean final isZip() {
        // iget-boolean v0, p0, Lcom/google/ai/edge/gallery/data/Model;->isZip:Z
        return v0;
    }
    public void final preProcess() {
        LinkedHashMap; v0 = new LinkedHashMap;();
        // DIRECT <init>()V
        // check-cast v0, Ljava/util/Map;
        // iget-object v1, p0, Lcom/google/ai/edge/gallery/data/Model;->configs:Ljava/util/List;
        // INTERFACE iterator()Ljava/util/Iterator;
        // move-result-object v1
        // INTERFACE hasNext()Z
        // move-result v2
        // if-eqz v2, :cond_0
        // INTERFACE next()Ljava/lang/Object;
        // move-result-object v2
        // check-cast v2, Lcom/google/ai/edge/gallery/data/Config;
        // VIRTUAL getKey()Lcom/google/ai/edge/gallery/data/ConfigKey;
        // move-result-object v3
        // VIRTUAL getLabel()Ljava/lang/String;
        // move-result-object v3
        // VIRTUAL getDefaultValue()Ljava/lang/Object;
        // move-result-object v4
        // INTERFACE put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // goto :goto_0
        // ... (truncated)
    }
    public void final setAccessToken(java.lang.String) {
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/Model;->accessToken:Ljava/lang/String;
        return ;
    }
    public void final setCleanUpAfterInit(boolean) {
        // iput-boolean p1, p0, Lcom/google/ai/edge/gallery/data/Model;->cleanUpAfterInit:Z
        return ;
    }
    public void final setConfigValues(java.util.Map) {
        // value = {
        // "(",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "+",
        // "Ljava/lang/Object;",
        // ">;)V"
        // }
        String v0 = "<set-?>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/Model;->configValues:Ljava/util/Map;
        return ;
    }
    public void final setConfigs(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "+",
        // "Lcom/google/ai/edge/gallery/data/Config;",
        // ">;)V"
        // }
        String v0 = "<set-?>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/Model;->configs:Ljava/util/List;
        return ;
    }
    public void final setDownloadFileName(java.lang.String) {
        String v0 = "<set-?>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/Model;->downloadFileName:Ljava/lang/String;
        return ;
    }
    public void final setInitializing(boolean) {
        // iput-boolean p1, p0, Lcom/google/ai/edge/gallery/data/Model;->initializing:Z
        return ;
    }
    public void final setInstance(java.lang.Object) {
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/Model;->instance:Ljava/lang/Object;
        return ;
    }
    public void final setLatestModelFile(com.google.ai.edge.gallery.data.ModelFile) {
        return ;
    }
    public void final setNormalizedName(java.lang.String) {
        String v0 = "<set-?>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/Model;->normalizedName:Ljava/lang/String;
        return ;
    }
    public void final setPrevConfigValues(java.util.Map) {
        // value = {
        // "(",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "+",
        // "Ljava/lang/Object;",
        // ">;)V"
        // }
        String v0 = "<set-?>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/Model;->prevConfigValues:Ljava/util/Map;
        return ;
    }
    public void final setTotalBytes(long) {
        // iput-wide p1, p0, Lcom/google/ai/edge/gallery/data/Model;->totalBytes:J
        return ;
    }
    public void final setUpdatable(boolean) {
        // iput-boolean p1, p0, Lcom/google/ai/edge/gallery/data/Model;->updatable:Z
        return ;
    }
    public void final setVersion(java.lang.String) {
        String v0 = "<set-?>";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/data/Model;->version:Ljava/lang/String;
        return ;
    }
    public java.lang.String toString() {
        // move-object/from16 v0, p0
        // iget-object v1, v0, Lcom/google/ai/edge/gallery/data/Model;->name:Ljava/lang/String;
        // iget-object v2, v0, Lcom/google/ai/edge/gallery/data/Model;->displayName:Ljava/lang/String;
        // iget-object v3, v0, Lcom/google/ai/edge/gallery/data/Model;->info:Ljava/lang/String;
        // iget-object v4, v0, Lcom/google/ai/edge/gallery/data/Model;->configs:Ljava/util/List;
        // iget-object v5, v0, Lcom/google/ai/edge/gallery/data/Model;->learnMoreUrl:Ljava/lang/String;
        // iget-object v6, v0, Lcom/google/ai/edge/gallery/data/Model;->bestForTaskIds:Ljava/util/List;
        // iget-object v8, v0, Lcom/google/ai/edge/gallery/data/Model;->url:Ljava/lang/String;
        // iget-wide v9, v0, Lcom/google/ai/edge/gallery/data/Model;->sizeInBytes:J
        // iget-object v11, v0, Lcom/google/ai/edge/gallery/data/Model;->downloadFileName:Ljava/lang/String;
        // iget-object v12, v0, Lcom/google/ai/edge/gallery/data/Model;->version:Ljava/lang/String;
        // iget-object v13, v0, Lcom/google/ai/edge/gallery/data/Model;->extraDataFiles:Ljava/util/List;
        // iget-boolean v14, v0, Lcom/google/ai/edge/gallery/data/Model;->isLlm:Z
        // move-object/from16 v16, v15
        // move-object/from16 v17, v15
        // iget-object v15, v0, Lcom/google/ai/edge/gallery/data/Model;->parentModelName:Ljava/lang/String;
        // move-object/from16 v18, v15
        // iget-object v15, v0, Lcom/google/ai/edge/gallery/data/Model;->variantLabel:Ljava/lang/String;
        // move-object/from16 v19, v15
        // iget-object v15, v0, Lcom/google/ai/edge/gallery/data/Model;->updatableModelFiles:Ljava/util/List;
        // ... (truncated)
    }
}