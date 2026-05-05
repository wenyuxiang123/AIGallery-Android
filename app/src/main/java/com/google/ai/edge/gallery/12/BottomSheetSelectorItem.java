// Class: final Lcom.google.ai.edge.gallery.data.BottomSheetSelectorItem
// Access: public
class BottomSheetSelectorItem extends Ljava/lang/Object {

    // Fields:
    private final java.lang.String label;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.String) {
        String v0 = "label";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.data.BottomSheetSelectorItem static synthetic copy$default(com.google.ai.edge.gallery.data.BottomSheetSelectorItem, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p2, p2, 0x1
        // if-eqz p2, :cond_0
        // VIRTUAL copy(Ljava/lang/String;)Lcom/google/ai/edge/gallery/data/BottomSheetSelectorItem;
        // move-result-object p0
        return p0;
    }
    public java.lang.String final component1() {
        return v0;
    }
    public com.google.ai.edge.gallery.data.BottomSheetSelectorItem final copy(java.lang.String) {
        String v0 = "label";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        BottomSheetSelectorItem; v0 = new BottomSheetSelectorItem;();
        // DIRECT <init>(Ljava/lang/String;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/data/BottomSheetSelectorItem;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/data/BottomSheetSelectorItem;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_2
        return v2;
        return v0;
    }
    public java.lang.String final getLabel() {
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
        String v2 = "BottomSheetSelectorItem(label=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v1
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v1 = ")";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
        // VIRTUAL toString()Ljava/lang/String;
        // move-result-object v0
        return v0;
    }
}