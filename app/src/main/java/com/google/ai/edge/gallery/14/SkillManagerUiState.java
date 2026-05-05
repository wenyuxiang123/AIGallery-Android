// Class: final Lcom.google.ai.edge.gallery.customtasks.agentchat.SkillManagerUiState
// Access: public
class SkillManagerUiState extends Ljava/lang/Object {

    // Fields:
    private final java.util.List featuredSkills;
    private final android.net.Uri importDirectoryUri;
    private final boolean loading;
    private final boolean loadingSkillAllowlist;
    private final java.lang.String skillAllowlistError;
    private final java.util.List skills;
    private final boolean validating;
    private final java.lang.String validationError;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;->$stable:I
        return ;
    }
    public void constructor <init>() {
        // const/16 v9, 0xff
        // const/4 v10, 0x0
        // const/4 v1, 0x0
        // const/4 v2, 0x0
        // const/4 v3, 0x0
        // const/4 v4, 0x0
        // const/4 v5, 0x0
        // const/4 v6, 0x0
        // const/4 v7, 0x0
        // const/4 v8, 0x0
        // move-object v0, p0
        return ;
    }
    public void constructor <init>(boolean, java.util.List, boolean, java.lang.String, android.net.Uri, boolean, java.util.List, java.lang.String) {
        // value = {
        // "(Z",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;",
        // ">;Z",
        // "Ljava/lang/String;",
        // "Landroid/net/Uri;",
        // "Z",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedSkill;",
        // ">;",
        // "Ljava/lang/String;",
        // ")V"
        // }
        String v0 = "skills";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "featuredSkills";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        return ;
    }
    public void synthetic constructor <init>(boolean, java.util.List, boolean, java.lang.String, android.net.Uri, boolean, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p10, p9, 0x1
        // const/4 v0, 0x0
        // if-eqz p10, :cond_0
        // move p1, v0
        // and-int/lit8 p10, p9, 0x2
        // if-eqz p10, :cond_1
        // STATIC emptyList()Ljava/util/List;
        // move-result-object p2
        // and-int/lit8 p10, p9, 0x4
        // if-eqz p10, :cond_2
        // move p3, v0
        // and-int/lit8 p10, p9, 0x8
        // const/4 v1, 0x0
        // if-eqz p10, :cond_3
        // move-object p4, v1
        // and-int/lit8 p10, p9, 0x10
        // if-eqz p10, :cond_4
        // move-object p5, v1
        // and-int/lit8 p10, p9, 0x20
        // if-eqz p10, :cond_5
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerUiState static synthetic copy$default(com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerUiState, boolean, java.util.List, boolean, java.lang.String, android.net.Uri, boolean, java.util.List, java.lang.String, int, java.lang.Object) {
        // move-object v0, p0
        // move/from16 v1, p9
        // and-int/lit8 v2, v1, 0x1
        // if-eqz v2, :cond_0
        // goto :goto_0
        // move v2, p1
        // and-int/lit8 v3, v1, 0x2
        // if-eqz v3, :cond_1
        // goto :goto_1
        // move-object v3, p2
        // and-int/lit8 v4, v1, 0x4
        // if-eqz v4, :cond_2
        // goto :goto_2
        // move v4, p3
        // and-int/lit8 v5, v1, 0x8
        // if-eqz v5, :cond_3
        // goto :goto_3
        // move-object v5, p4
        // and-int/lit8 v6, v1, 0x10
        // if-eqz v6, :cond_4
        // ... (truncated)
    }
    public boolean final component1() {
        return v0;
    }
    public java.util.List final component2() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;",
        // ">;"
        // }
        return v0;
    }
    public boolean final component3() {
        return v0;
    }
    public java.lang.String final component4() {
        return v0;
    }
    public android.net.Uri final component5() {
        return v0;
    }
    public boolean final component6() {
        return v0;
    }
    public java.util.List final component7() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedSkill;",
        // ">;"
        // }
        return v0;
    }
    public java.lang.String final component8() {
        return v0;
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerUiState final copy(boolean, java.util.List, boolean, java.lang.String, android.net.Uri, boolean, java.util.List, java.lang.String) {
        // value = {
        // "(Z",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;",
        // ">;Z",
        // "Ljava/lang/String;",
        // "Landroid/net/Uri;",
        // "Z",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedSkill;",
        // ">;",
        // "Ljava/lang/String;",
        // ")",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;"
        // }
        String v0 = "skills";
        // move-object v10, p2
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "featuredSkills";
        // move-object/from16 v11, p7
        // ... (truncated)
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;
        // if-eq v3, v4, :cond_2
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        return v2;
        // if-eq v3, v4, :cond_4
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_5
        // ... (truncated)
    }
    public java.util.List final getFeaturedSkills() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedSkill;",
        // ">;"
        // }
        return v0;
    }
    public android.net.Uri final getImportDirectoryUri() {
        return v0;
    }
    public boolean final getLoading() {
        return v0;
    }
    public boolean final getLoadingSkillAllowlist() {
        return v0;
    }
    public java.lang.String final getSkillAllowlistError() {
        return v0;
    }
    public java.util.List final getSkills() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;",
        // ">;"
        // }
        return v0;
    }
    public boolean final getValidating() {
        return v0;
    }
    public java.lang.String final getValidationError() {
        return v0;
    }
    public int hashCode() {
        // STATIC hashCode(Z)I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // STATIC hashCode(Z)I
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
        // mul-int/lit8 v0, v1, 0x1f
        // if-nez v2, :cond_1
        // ... (truncated)
    }
    public java.lang.String toString() {
        StringBuilder; v8 = new StringBuilder;();
        // DIRECT <init>()V
        String v9 = "SkillManagerUiState(loading=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v8
        // VIRTUAL append(Z)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v8 = ", skills=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", validating=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Z)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", validationError=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
}