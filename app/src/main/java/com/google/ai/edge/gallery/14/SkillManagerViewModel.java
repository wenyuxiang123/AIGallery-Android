// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel
// Access: public
class SkillManagerViewModel extends Landroidx/lifecycle/ViewModel {

    // Fields:
    private final kotlinx.coroutines.flow.MutableStateFlow _uiState;
    private final android.content.Context context;
    private final com.google.ai.edge.gallery.data.DataStoreRepository dataStoreRepository;
    private boolean skillLoaded;
    private final kotlinx.coroutines.flow.StateFlow uiState;

    // Methods:
    public java.lang.CharSequence static synthetic $r8$lambda$CRgufJYJEab6lIybi5JqBnzX3KE(com.google.ai.edge.gallery.proto.Skill) {
        // STATIC getSelectedSkillsNamesAndDescriptions$lambda$29(Lcom/google/ai/edge/gallery/proto/Skill;)Ljava/lang/CharSequence;
        // move-result-object p0
        return p0;
    }
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;->$stable:I
        return ;
    }
    public void constructor <init>(com.google.ai.edge.gallery.data.DataStoreRepository, android.content.Context) {
        String v0 = "dataStoreRepository";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        SkillManagerUiState; v0 = new SkillManagerUiState;();
        // const/16 v10, 0xff
        // const/4 v11, 0x0
        // const/4 v2, 0x0
        // const/4 v3, 0x0
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        // const/4 v6, 0x0
        // const/4 v7, 0x0
        // const/4 v8, 0x0
        // const/4 v9, 0x0
        // move-object v1, v0
        // STATIC MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
        // move-result-object v0
        // STATIC asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;
        // ... (truncated)
    }
    public android.content.Context static final synthetic access$getContext$p(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel) {
        return v0;
    }
    public java.io.File static final synthetic access$getSkillDestinationDir(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, java.lang.String) {
        // DIRECT getSkillDestinationDir(Ljava/lang/String;)Ljava/io/File;
        // move-result-object v0
        return v0;
    }
    public java.lang.String static final synthetic access$getSkillNameForLogging(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, com.google.ai.edge.gallery.proto.Skill) {
        // DIRECT getSkillNameForLogging(Lcom/google/ai/edge/gallery/proto/Skill;)Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
    public kotlinx.coroutines.flow.MutableStateFlow static final synthetic access$get_uiState$p(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel) {
        return v0;
    }
    public void static final synthetic access$saveScripts(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, java.io.File, java.util.Map) {
        // DIRECT saveScripts(Ljava/io/File;Ljava/util/Map;)V
        return ;
    }
    public void static final synthetic access$updateSkillInDataStore(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, java.lang.String, com.google.ai.edge.gallery.proto.Skill) {
        // DIRECT updateSkillInDataStore(Ljava/lang/String;Lcom/google/ai/edge/gallery/proto/Skill;)V
        return ;
    }
    public void static final synthetic access$writeSkillMd(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, java.io.File, java.lang.String, java.lang.String, java.lang.String) {
        // DIRECT writeSkillMd(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        return ;
    }
    public kotlin.Pair static synthetic convertSkillMdToProto$default(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p7, p6, 0x8
        // if-eqz p7, :cond_0
        // move-object v5, v0
        // goto :goto_0
        // move-object v5, p4
        // and-int/lit8 p4, p6, 0x10
        // if-eqz p4, :cond_1
        // move-object v6, v0
        // goto :goto_1
        // move-object v6, p5
        // move-object v1, p0
        // move-object v2, p1
        // move v3, p2
        // move v4, p3
        // move-result-object p0
        return p0;
    }
    private java.lang.CharSequence static final getSelectedSkillsNamesAndDescriptions$lambda$29(com.google.ai.edge.gallery.proto.Skill) {
        String v0 = "skill";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v0
        // VIRTUAL getDescription()Ljava/lang/String;
        // move-result-object v1
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        String v3 = "- ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v2
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v2 = ": ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        // ... (truncated)
    }
    private java.io.File final getSkillDestinationDir(java.lang.String) {
        // move-object v0, p1
        // check-cast v0, Ljava/lang/CharSequence;
        Regex; v1 = new Regex;();
        String v2 = "\\s+";
        // DIRECT <init>(Ljava/lang/String;)V
        String v2 = "-";
        // VIRTUAL replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;
        // move-result-object v0
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "skills/";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v1
        // VIRTUAL getFilesDir()Ljava/io/File;
        // move-result-object v2
        String v3 = "getFilesDir(...)";
        // ... (truncated)
    }
    private java.lang.String final getSkillNameForLogging(com.google.ai.edge.gallery.proto.Skill) {
        // VIRTUAL getSkillUrl()Ljava/lang/String;
        // move-result-object v0
        String v1 = "getSkillUrl(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/CharSequence;
        // INTERFACE length()I
        // move-result v0
        // const/4 v1, 0x1
        // const/4 v2, 0x0
        // if-lez v0, :cond_0
        // move v0, v1
        // goto :goto_0
        // move v0, v2
        // if-eqz v0, :cond_4
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // VIRTUAL getFeaturedSkills()Ljava/util/List;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Iterable;
        // ... (truncated)
    }
    private void final loadSkillAllowlist() {
        // move-object/from16 v0, p0
        // const/4 v2, 0x0
        // nop
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v3
        // move-object v15, v3
        // check-cast v15, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // const/16 v16, 0x0
        // const/16 v13, 0x5f
        // const/4 v14, 0x0
        // const/4 v5, 0x0
        // const/4 v6, 0x0
        // const/4 v7, 0x0
        // const/4 v8, 0x0
        // const/4 v9, 0x0
        // const/4 v10, 0x1
        // const/4 v11, 0x0
        // const/4 v12, 0x0
        // move-object v4, v15
        // move-result-object v4
        // ... (truncated)
    }
    private void final saveScripts(java.io.File, java.util.Map) {
        // value = {
        // "(",
        // "Ljava/io/File;",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;)V"
        // }
        // VIRTUAL mkdirs()Z
        // VIRTUAL listFiles()[Ljava/io/File;
        // move-result-object v0
        // if-eqz v0, :cond_1
        // const/4 v1, 0x0
        // array-length v2, v0
        // const/4 v3, 0x0
        // if-ge v3, v2, :cond_0
        // aget-object v4, v0, v3
        // move-object v5, v4
        // const/4 v6, 0x0
        // VIRTUAL delete()Z
        // ... (truncated)
    }
    private void final updateSkillInDataStore(java.lang.String, com.google.ai.edge.gallery.proto.Skill) {
        // INTERFACE getAllSkills()Ljava/util/List;
        // move-result-object v0
        // move-object v1, v0
        // check-cast v1, Ljava/lang/Iterable;
        // const/4 v2, 0x0
        ArrayList; v3 = new ArrayList;();
        // const/16 v4, 0xa
        // STATIC collectionSizeOrDefault(Ljava/lang/Iterable;I)I
        // move-result v4
        // DIRECT <init>(I)V
        // check-cast v3, Ljava/util/Collection;
        // move-object v4, v1
        // const/4 v5, 0x0
        // INTERFACE iterator()Ljava/util/Iterator;
        // move-result-object v6
        // INTERFACE hasNext()Z
        // move-result v7
        // if-eqz v7, :cond_1
        // INTERFACE next()Ljava/lang/Object;
        // move-result-object v7
        // ... (truncated)
    }
    private void final writeSkillMd(java.io.File, java.lang.String, java.lang.String, java.lang.String) {
        // VIRTUAL getPath()Ljava/lang/String;
        // move-result-object v0
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "Writing skill.md: ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        String v1 = "AGSkillManagerVM";
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // nop
        // nop
        StringBuilder; v0 = new StringBuilder;();
        // DIRECT <init>()V
        String v1 = "\n    ---\n    name: ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
    public void final addSkill(com.google.ai.edge.gallery.proto.Skill, boolean) {
        // move-object/from16 v0, p0
        // move-object/from16 v1, p1
        String v2 = "skill";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        String v3 = "Adding skill: ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v2
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v2
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v2
        String v3 = "AGSkillManagerVM";
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // const/4 v3, 0x0
        // nop
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v4
        // move-object/from16 v16, v4
        // ... (truncated)
    }
    public boolean final checkBuiltInSkillExistedForImportedSkill(android.net.Uri) {
        // move-object/from16 v9, p0
        // move-object/from16 v10, p1
        String v0 = "directoryUri";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        StringBuilder; v0 = new StringBuilder;();
        // DIRECT <init>()V
        String v1 = "Checking built-in skill existed for imported skill: ";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        String v11 = "AGSkillManagerVM";
        // STATIC d(Ljava/lang/String;Ljava/lang/String;)I
        // STATIC fromTreeUri(Landroid/content/Context;Landroid/net/Uri;)Landroidx/documentfile/provider/DocumentFile;
        // move-result-object v12
        // const/4 v0, 0x0
        // if-eqz v12, :cond_0
        String v1 = "SKILL.md";
        // ... (truncated)
    }
    public boolean final checkLocalSkillExisted(android.net.Uri) {
        String v0 = "directoryUri";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // STATIC getDisplayName(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
        // move-result-object v0
        // move-object v1, v0
        // check-cast v1, Ljava/lang/CharSequence;
        // INTERFACE length()I
        // move-result v1
        // const/4 v2, 0x0
        // if-nez v1, :cond_0
        // const/4 v1, 0x1
        // goto :goto_0
        // move v1, v2
        // if-eqz v1, :cond_1
        return v2;
        // DIRECT getSkillDestinationDir(Ljava/lang/String;)Ljava/io/File;
        // move-result-object v1
        // VIRTUAL exists()Z
        // move-result v2
        return v2;
    }
    public kotlin.Pair final convertSkillMdToProto(java.lang.String, boolean, boolean, java.lang.String, java.lang.String) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "ZZ",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ")",
        // "Lkotlin/Pair<",
        // "Lcom/google/ai/edge/gallery/proto/Skill;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;>;"
        // }
        // move-object/from16 v0, p1
        // move-object/from16 v1, p4
        // move-object/from16 v2, p5
        String v3 = "mdContent";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v3 = "skillUrl";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // ... (truncated)
    }
    public void final deleteSkill(java.lang.String) {
        // move-object/from16 v0, p0
        // move-object/from16 v1, p1
        String v2 = "name";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v2
        // check-cast v2, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // VIRTUAL getSkills()Ljava/util/List;
        // move-result-object v2
        // check-cast v2, Ljava/lang/Iterable;
        // const/4 v3, 0x0
        // INTERFACE iterator()Ljava/util/Iterator;
        // move-result-object v4
        // INTERFACE hasNext()Z
        // move-result v5
        // if-eqz v5, :cond_1
        // INTERFACE next()Ljava/lang/Object;
        // move-result-object v5
        // move-object v7, v5
        // check-cast v7, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;
        // ... (truncated)
    }
    public void final deleteSkillScript(com.google.ai.edge.gallery.proto.Skill, java.lang.String) {
        String v0 = "skill";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "scriptName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getImportDirName()Ljava/lang/String;
        // move-result-object v0
        String v1 = "getImportDirName(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v0, Ljava/lang/CharSequence;
        // INTERFACE length()I
        // move-result v0
        // if-nez v0, :cond_0
        // const/4 v0, 0x1
        // goto :goto_0
        // const/4 v0, 0x0
        // if-eqz v0, :cond_1
        // VIRTUAL getName()Ljava/lang/String;
        // move-result-object v0
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        // ... (truncated)
    }
    public void final deleteSkills(java.util.Set) {
        // value = {
        // "(",
        // "Ljava/util/Set<",
        // "Ljava/lang/String;",
        // ">;)V"
        // }
        // move-object/from16 v0, p0
        // move-object/from16 v1, p1
        String v2 = "names";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v2
        // check-cast v2, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // VIRTUAL getSkills()Ljava/util/List;
        // move-result-object v2
        // check-cast v2, Ljava/lang/Iterable;
        // const/4 v3, 0x0
        ArrayList; v4 = new ArrayList;();
        // DIRECT <init>()V
        // check-cast v4, Ljava/util/Collection;
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.DataStoreRepository final getDataStoreRepository() {
        return v0;
    }
    public java.lang.String final getJsSkillUrl(java.lang.String, java.lang.String) {
        String v0 = "skillName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "scriptName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getSkill(Ljava/lang/String;)Lcom/google/ai/edge/gallery/proto/Skill;
        // move-result-object v0
        // const/4 v1, 0x0
        // if-nez v0, :cond_0
        return v1;
        // VIRTUAL getImportDirName()Ljava/lang/String;
        // move-result-object v3
        String v4 = "getImportDirName(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // check-cast v3, Ljava/lang/CharSequence;
        // INTERFACE length()I
        // move-result v3
        // const/4 v4, 0x1
        // const/4 v5, 0x0
        // if-lez v3, :cond_1
        // move v3, v4
        // ... (truncated)
    }
    public java.lang.String final getJsSkillWebviewUrl(java.lang.String, java.lang.String) {
        String v0 = "skillName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "url";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getSkill(Ljava/lang/String;)Lcom/google/ai/edge/gallery/proto/Skill;
        // move-result-object v0
        // if-nez v0, :cond_0
        return p2;
        // const/4 v1, 0x2
        // const/4 v2, 0x0
        String v3 = "http";
        // const/4 v4, 0x0
        // STATIC startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
        // move-result v1
        // if-eqz v1, :cond_1
        return p2;
        // VIRTUAL getImportDirName()Ljava/lang/String;
        // move-result-object v2
        String v3 = "getImportDirName(...)";
        // STATIC checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
        // ... (truncated)
    }
    public java.util.List final getSelectedSkills() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/Skill;",
        // ">;"
        // }
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // VIRTUAL getSkills()Ljava/util/List;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Iterable;
        // const/4 v1, 0x0
        ArrayList; v2 = new ArrayList;();
        // DIRECT <init>()V
        // check-cast v2, Ljava/util/Collection;
        // move-object v3, v0
        // const/4 v4, 0x0
        // INTERFACE iterator()Ljava/util/Iterator;
        // move-result-object v5
        // ... (truncated)
    }
    public java.lang.String final getSelectedSkillsNamesAndDescriptions() {
        // VIRTUAL getSelectedSkills()Ljava/util/List;
        // move-result-object v0
        // move-object v1, v0
        // check-cast v1, Ljava/lang/Iterable;
        String v0 = "\n";
        // move-object v2, v0
        // check-cast v2, Ljava/lang/CharSequence;
        SkillManagerViewModel$$ExternalSyntheticLambda0; v7 = new SkillManagerViewModel$$ExternalSyntheticLambda0;();
        // DIRECT <init>()V
        // const/16 v8, 0x1e
        // const/4 v9, 0x0
        // const/4 v3, 0x0
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        // const/4 v6, 0x0
        // move-result-object v0
        return v0;
    }
    public com.google.ai.edge.gallery.proto.Skill final getSkill(java.lang.String) {
        String v0 = "name";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // VIRTUAL getSkills()Ljava/util/List;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Iterable;
        // const/4 v1, 0x0
        // INTERFACE iterator()Ljava/util/Iterator;
        // move-result-object v2
        // INTERFACE hasNext()Z
        // move-result v3
        // const/4 v4, 0x0
        // if-eqz v3, :cond_1
        // INTERFACE next()Ljava/lang/Object;
        // move-result-object v3
        // move-object v5, v3
        // check-cast v5, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;
        // const/4 v6, 0x0
        // ... (truncated)
    }
    public boolean final getSkillLoaded() {
        return v0;
    }
    public com.google.ai.edge.litertlm.Contents final getSystemPrompt(java.lang.String) {
        String v0 = "baseSystemPrompt";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // VIRTUAL getSelectedSkillsNamesAndDescriptions()Ljava/lang/String;
        // move-result-object v0
        // const/4 v5, 0x4
        // const/4 v6, 0x0
        String v2 = "___SKILLS___";
        // const/4 v4, 0x0
        // move-object v1, p1
        // move-object v3, v0
        // move-result-object v1
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        String v3 = "System prompt:\n";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v2
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v2
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v2
        // ... (truncated)
    }
    public kotlinx.coroutines.flow.StateFlow final getUiState() {
        // value = {
        // "()",
        // "Lkotlinx/coroutines/flow/StateFlow<",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;",
        // ">;"
        // }
        return v0;
    }
    public boolean final isSkillSelected(java.lang.String) {
        String v0 = "skillName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // VIRTUAL getSkills()Ljava/util/List;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Iterable;
        // const/4 v1, 0x0
        // INTERFACE iterator()Ljava/util/Iterator;
        // move-result-object v2
        // INTERFACE hasNext()Z
        // move-result v3
        // if-eqz v3, :cond_1
        // INTERFACE next()Ljava/lang/Object;
        // move-result-object v3
        // move-object v4, v3
        // check-cast v4, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;
        // const/4 v5, 0x0
        // VIRTUAL getSkill()Lcom/google/ai/edge/gallery/proto/Skill;
        // ... (truncated)
    }
    public void final loadSkillScriptsContent(com.google.ai.edge.gallery.proto.Skill, kotlin.jvm.functions.Function1) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/proto/Skill;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        String v0 = "skill";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "onDone";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // move-object v0, p0
        // check-cast v0, Landroidx/lifecycle/ViewModel;
        // STATIC getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;
        // move-result-object v1
        // ... (truncated)
    }
    public void final loadSkills(kotlin.jvm.functions.Function0) {
        // value = {
        // "(",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        String v0 = "onDone";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // if-nez v0, :cond_0
        // const/4 v0, 0x1
        // VIRTUAL setLoading(Z)V
        // move-object v0, p0
        // check-cast v0, Landroidx/lifecycle/ViewModel;
        // STATIC getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;
        // move-result-object v1
        // STATIC getIO()Lkotlinx/coroutines/CoroutineDispatcher;
        // move-result-object v0
        // move-object v2, v0
        // check-cast v2, Lkotlin/coroutines/CoroutineContext;
        SkillManagerViewModel$loadSkills$1; v0 = new SkillManagerViewModel$loadSkills$1;();
        // ... (truncated)
    }
    public void final saveSkillEdit(int, java.lang.String, java.lang.String, java.lang.String, java.util.Map, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1) {
        // value = {
        // "(I",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/util/Map<",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // ">;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        String v0 = "name";
        // move-object/from16 v11, p2
        // ... (truncated)
    }
    public void final setAllSkillsSelected(boolean) {
        // move-object/from16 v0, p0
        // move/from16 v1, p1
        // const/4 v3, 0x0
        // nop
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v4
        // move-object/from16 v16, v4
        // check-cast v16, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // const/16 v17, 0x0
        // move-result-object v5
        // check-cast v5, Ljava/lang/Iterable;
        // const/4 v6, 0x0
        ArrayList; v7 = new ArrayList;();
        // const/16 v8, 0xa
        // STATIC collectionSizeOrDefault(Ljava/lang/Iterable;I)I
        // move-result v8
        // DIRECT <init>(I)V
        // check-cast v7, Ljava/util/Collection;
        // move-object v8, v5
        // const/4 v9, 0x0
        // ... (truncated)
    }
    public void final setImportDirectoryUri(android.net.Uri) {
        // move-object/from16 v0, p0
        // const/4 v2, 0x0
        // nop
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v3
        // move-object v15, v3
        // check-cast v15, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // const/16 v16, 0x0
        // const/16 v13, 0xef
        // const/4 v14, 0x0
        // const/4 v5, 0x0
        // const/4 v6, 0x0
        // const/4 v7, 0x0
        // const/4 v8, 0x0
        // const/4 v10, 0x0
        // const/4 v11, 0x0
        // const/4 v12, 0x0
        // move-object v4, v15
        // move-object/from16 v9, p1
        // move-result-object v4
        // ... (truncated)
    }
    public void final setLoading(boolean) {
        // move-object/from16 v0, p0
        // const/4 v2, 0x0
        // nop
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v3
        // move-object v15, v3
        // check-cast v15, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // const/16 v16, 0x0
        // const/16 v13, 0xfe
        // const/4 v14, 0x0
        // const/4 v6, 0x0
        // const/4 v7, 0x0
        // const/4 v8, 0x0
        // const/4 v9, 0x0
        // const/4 v10, 0x0
        // const/4 v11, 0x0
        // const/4 v12, 0x0
        // move-object v4, v15
        // move/from16 v5, p1
        // move-result-object v4
        // ... (truncated)
    }
    public void final setSkillLoaded(boolean) {
        return ;
    }
    public void final setSkillSelected(com.google.ai.edge.gallery.customtasks.agentchat.SkillState, boolean) {
        // move-object/from16 v0, p0
        // move-object/from16 v1, p1
        // move/from16 v2, p2
        String v3 = "skill";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // move-result-object v3
        // VIRTUAL toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;
        // move-result-object v3
        // check-cast v3, Lcom/google/ai/edge/gallery/proto/Skill$Builder;
        // VIRTUAL setSelected(Z)Lcom/google/ai/edge/gallery/proto/Skill$Builder;
        // move-result-object v3
        // VIRTUAL build()Lcom/google/protobuf/GeneratedMessageLite;
        // move-result-object v3
        // check-cast v3, Lcom/google/ai/edge/gallery/proto/Skill;
        // STATIC getFirebaseAnalytics()Lcom/google/firebase/analytics/FirebaseAnalytics;
        // move-result-object v4
        // if-eqz v4, :cond_1
        // v5 = SKILL_MANAGEMENT:Lcom/google/ai/edge/gallery/GalleryEvent;
        // VIRTUAL getId()Ljava/lang/String;
        // move-result-object v5
        // ... (truncated)
    }
    public void final setValidating(boolean) {
        // move-object/from16 v0, p0
        // const/4 v2, 0x0
        // nop
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v3
        // move-object v15, v3
        // check-cast v15, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // const/16 v16, 0x0
        // const/16 v13, 0xfb
        // const/4 v14, 0x0
        // const/4 v5, 0x0
        // const/4 v6, 0x0
        // const/4 v8, 0x0
        // const/4 v9, 0x0
        // const/4 v10, 0x0
        // const/4 v11, 0x0
        // const/4 v12, 0x0
        // move-object v4, v15
        // move/from16 v7, p1
        // move-result-object v4
        // ... (truncated)
    }
    public void final setValidationError(java.lang.String) {
        // move-object/from16 v0, p0
        // const/4 v2, 0x0
        // nop
        // INTERFACE getValue()Ljava/lang/Object;
        // move-result-object v3
        // move-object v15, v3
        // check-cast v15, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // const/16 v16, 0x0
        // const/16 v13, 0xf7
        // const/4 v14, 0x0
        // const/4 v5, 0x0
        // const/4 v6, 0x0
        // const/4 v7, 0x0
        // const/4 v9, 0x0
        // const/4 v10, 0x0
        // const/4 v11, 0x0
        // const/4 v12, 0x0
        // move-object v4, v15
        // move-object/from16 v8, p1
        // move-result-object v4
        // ... (truncated)
    }
    public void final validateAndAddSkillFromLocalImport(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1) {
        // value = {
        // "(",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        String v0 = "onSuccess";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "onValidationError";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v0, 0x1
        // VIRTUAL setValidating(Z)V
        // const/4 v0, 0x0
        // VIRTUAL setValidationError(Ljava/lang/String;)V
        // INTERFACE getValue()Ljava/lang/Object;
        // ... (truncated)
    }
    public void final validateAndAddSkillFromUrl(java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lkotlin/jvm/functions/Function1<",
        // "-",
        // "Ljava/lang/String;",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
        String v0 = "url";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "onSuccess";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "onValidationError";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // const/4 v0, 0x1
        // VIRTUAL setValidating(Z)V
        // ... (truncated)
    }
}