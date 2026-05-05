// Class: final Lcom.google.ai.edge.gallery.common.SkillsIndex
// Access: public
class SkillsIndex extends Ljava/lang/Object {

    // Fields:
    private final java.util.List skills;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/common/SkillsIndex;->$stable:I
        return ;
    }
    public void constructor <init>(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/common/SkillInfo;",
        // ">;)V"
        // }
        String v0 = "skills";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        // iput-object p1, p0, Lcom/google/ai/edge/gallery/common/SkillsIndex;->skills:Ljava/util/List;
        return ;
    }
    public com.google.ai.edge.gallery.common.SkillsIndex static synthetic copy$default(com.google.ai.edge.gallery.common.SkillsIndex, java.util.List, int, java.lang.Object) {
        // and-int/lit8 p2, p2, 0x1
        // if-eqz p2, :cond_0
        // iget-object p1, p0, Lcom/google/ai/edge/gallery/common/SkillsIndex;->skills:Ljava/util/List;
        // VIRTUAL copy(Ljava/util/List;)Lcom/google/ai/edge/gallery/common/SkillsIndex;
        // move-result-object p0
        return p0;
    }
    public java.util.List final component1() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/common/SkillInfo;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/SkillsIndex;->skills:Ljava/util/List;
        return v0;
    }
    public com.google.ai.edge.gallery.common.SkillsIndex final copy(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/common/SkillInfo;",
        // ">;)",
        // "Lcom/google/ai/edge/gallery/common/SkillsIndex;"
        // }
        String v0 = "skills";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        SkillsIndex; v0 = new SkillsIndex;();
        // DIRECT <init>(Ljava/util/List;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/common/SkillsIndex;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/common/SkillsIndex;
        // iget-object v3, p0, Lcom/google/ai/edge/gallery/common/SkillsIndex;->skills:Ljava/util/List;
        // iget-object v1, v1, Lcom/google/ai/edge/gallery/common/SkillsIndex;->skills:Ljava/util/List;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_2
        return v2;
        return v0;
    }
    public java.util.List final getSkills() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/common/SkillInfo;",
        // ">;"
        // }
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/SkillsIndex;->skills:Ljava/util/List;
        return v0;
    }
    public int hashCode() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/SkillsIndex;->skills:Ljava/util/List;
        // VIRTUAL hashCode()I
        // move-result v0
        return v0;
    }
    public java.lang.String toString() {
        // iget-object v0, p0, Lcom/google/ai/edge/gallery/common/SkillsIndex;->skills:Ljava/util/List;
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "SkillsIndex(skills=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}