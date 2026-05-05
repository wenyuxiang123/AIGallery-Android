// Class: final Lcom.google.ai.edge.gallery.data.NamedDeviceGroup
// Access: public
class NamedDeviceGroup extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String description;
    private final java.util.List deviceModels;
    private final java.lang.String groupName;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/NamedDeviceGroup;->$stable:I
        return ;
    }
    public void constructor <init>(java.lang.String, java.lang.String, java.util.List) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;)V"
        // }
        String v0 = "groupName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "deviceModels";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        return ;
    }
    public void synthetic constructor <init>(java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker) {
        // and-int/lit8 p4, p4, 0x2
        // if-eqz p4, :cond_0
        // const/4 p2, 0x0
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
        return ;
    }
    public com.google.ai.edge.gallery.data.NamedDeviceGroup static synthetic copy$default(com.google.ai.edge.gallery.data.NamedDeviceGroup, java.lang.String, java.lang.String, java.util.List, int, java.lang.Object) {
        // and-int/lit8 p5, p4, 0x1
        // if-eqz p5, :cond_0
        // and-int/lit8 p5, p4, 0x2
        // if-eqz p5, :cond_1
        // and-int/lit8 p4, p4, 0x4
        // if-eqz p4, :cond_2
        // VIRTUAL copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/google/ai/edge/gallery/data/NamedDeviceGroup;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        return v0;
    }
    public java.lang.String final component2() {
        return v0;
    }
    public java.util.List final component3() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        return v0;
    }
    public com.google.ai.edge.gallery.data.NamedDeviceGroup final copy(java.lang.String, java.lang.String, java.util.List) {
        // value = {
        // "(",
        // "Ljava/lang/String;",
        // "Ljava/lang/String;",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;)",
        // "Lcom/google/ai/edge/gallery/data/NamedDeviceGroup;"
        // }
        String v0 = "groupName";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "deviceModels";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        NamedDeviceGroup; v0 = new NamedDeviceGroup;();
        // DIRECT <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/NamedDeviceGroup;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/NamedDeviceGroup;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_3
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_4
        // ... (truncated)
    }
    public java.lang.String final getDescription() {
        return v0;
    }
    public java.util.List final getDeviceModels() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        return v0;
    }
    public java.lang.String final getGroupName() {
        return v0;
    }
    public int hashCode() {
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // if-nez v2, :cond_0
        // const/4 v2, 0x0
        // goto :goto_0
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        // mul-int/lit8 v0, v1, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v0, v2
        return v0;
    }
    public java.lang.String toString() {
        StringBuilder; v3 = new StringBuilder;();
        // DIRECT <init>()V
        String v4 = "NamedDeviceGroup(groupName=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v3
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v3 = ", description=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ", deviceModels=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // ... (truncated)
    }
}