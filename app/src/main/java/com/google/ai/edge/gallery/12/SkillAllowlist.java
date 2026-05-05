// Class: final Lcom.google.ai.edge.gallery.data.SkillAllowlist
// Access: public
class SkillAllowlist extends Ljava/lang/Object {

    // Fields:
    private final java.util.List featuredSkills;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/SkillAllowlist;->$stable:I
        return ;
    }
    public void constructor <init>(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedSkill;",
        // ">;)V"
        // }
        String v0 = "featuredSkills";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.data.SkillAllowlist static synthetic copy$default(com.google.ai.edge.gallery.data.SkillAllowlist, java.util.List, int, java.lang.Object) {
        // and-int/lit8 p2, p2, 0x1
        // if-eqz p2, :cond_0
        // VIRTUAL copy(Ljava/util/List;)Lcom/google/ai/edge/gallery/data/SkillAllowlist;
        // move-result-object p0
        return p0;
    }
    public java.util.List final component1() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedSkill;",
        // ">;"
        // }
        return v0;
    }
    public com.google.ai.edge.gallery.data.SkillAllowlist final copy(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/data/AllowedSkill;",
        // ">;)",
        // "Lcom/google/ai/edge/gallery/data/SkillAllowlist;"
        // }
        String v0 = "featuredSkills";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        SkillAllowlist; v0 = new SkillAllowlist;();
        // DIRECT <init>(Ljava/util/List;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/SkillAllowlist;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/SkillAllowlist;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_2
        return v2;
        return v0;
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
    public int hashCode() {
        // VIRTUAL hashCode()I
        // move-result v0
        return v0;
    }
    public java.lang.String toString() {
        StringBuilder; v1 = new StringBuilder;();
        // DIRECT <init>()V
        String v2 = "SkillAllowlist(featuredSkills=";
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