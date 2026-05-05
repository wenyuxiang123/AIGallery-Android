// Class: Lcom.google.ai.edge.gallery.customtasks.agentchat.AddSkillOption
// Access: final
class AddSkillOption extends Ljava/lang/Object {

    // Fields:
    private final int descriptionResId;
    private final androidx.compose.ui.graphics.vector.ImageVector icon;
    private final int titleResId;
    private final com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOptionType type;

    // Methods:
    public void constructor <init>(com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOptionType, int, int, androidx.compose.ui.graphics.vector.ImageVector) {
        String v0 = "type";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "icon";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput p2, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->titleResId:I
        // iput p3, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->descriptionResId:I
        return ;
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOption static synthetic copy$default(com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOption, com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOptionType, int, int, androidx.compose.ui.graphics.vector.ImageVector, int, java.lang.Object) {
        // and-int/lit8 p6, p5, 0x1
        // if-eqz p6, :cond_0
        // and-int/lit8 p6, p5, 0x2
        // if-eqz p6, :cond_1
        // iget p2, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->titleResId:I
        // and-int/lit8 p6, p5, 0x4
        // if-eqz p6, :cond_2
        // iget p3, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->descriptionResId:I
        // and-int/lit8 p5, p5, 0x8
        // if-eqz p5, :cond_3
        // VIRTUAL copy(Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOptionType;IILandroidx/compose/ui/graphics/vector/ImageVector;)Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;
        // move-result-object p0
        return p0;
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOptionType final component1() {
        return v0;
    }
    public int final component2() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->titleResId:I
        return v0;
    }
    public int final component3() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->descriptionResId:I
        return v0;
    }
    public androidx.compose.ui.graphics.vector.ImageVector final component4() {
        return v0;
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOption final copy(com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOptionType, int, int, androidx.compose.ui.graphics.vector.ImageVector) {
        String v0 = "type";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "icon";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        AddSkillOption; v0 = new AddSkillOption;();
        // DIRECT <init>(Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOptionType;IILandroidx/compose/ui/graphics/vector/ImageVector;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;
        // if-eq v3, v4, :cond_2
        return v2;
        // iget v3, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->titleResId:I
        // iget v4, v1, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->titleResId:I
        // if-eq v3, v4, :cond_3
        return v2;
        // iget v3, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->descriptionResId:I
        // iget v4, v1, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->descriptionResId:I
        // if-eq v3, v4, :cond_4
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // ... (truncated)
    }
    public int final getDescriptionResId() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->descriptionResId:I
        return v0;
    }
    public androidx.compose.ui.graphics.vector.ImageVector final getIcon() {
        return v0;
    }
    public int final getTitleResId() {
        // iget v0, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->titleResId:I
        return v0;
    }
    public com.google.ai.edge.gallery.customtasks.agentchat.AddSkillOptionType final getType() {
        return v0;
    }
    public int hashCode() {
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // iget v2, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->titleResId:I
        // STATIC hashCode(I)I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // iget v2, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->descriptionResId:I
        // STATIC hashCode(I)I
        // move-result v2
        // add-int/2addr v0, v2
        // mul-int/lit8 v1, v0, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        return v1;
    }
    public java.lang.String toString() {
        // iget v1, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->titleResId:I
        // iget v2, p0, Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;->descriptionResId:I
        StringBuilder; v4 = new StringBuilder;();
        // DIRECT <init>()V
        String v5 = "AddSkillOption(type=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v4
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v4 = ", titleResId=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(I)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", descriptionResId=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(I)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", icon=";
        // ... (truncated)
    }
}