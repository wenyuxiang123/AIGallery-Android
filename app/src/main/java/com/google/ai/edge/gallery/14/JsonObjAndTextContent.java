// Class: final Lcom.google.ai.edge.gallery.common.JsonObjAndTextContent
// Access: public
class JsonObjAndTextContent extends Ljava/lang/Object {

    // Fields:
    private final java.lang.Object jsonObj;
    private final java.lang.String textContent;

    // Methods:
    static void constructor <clinit>() {
        return ;
    }
    public void constructor <init>(java.lang.Object, java.lang.String) {
        // value = {
        // "(TT;",
        // "Ljava/lang/String;",
        // ")V"
        // }
        String v0 = "textContent";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.common.JsonObjAndTextContent static synthetic copy$default(com.google.ai.edge.gallery.common.JsonObjAndTextContent, java.lang.Object, java.lang.String, int, java.lang.Object) {
        // and-int/lit8 p4, p3, 0x1
        // if-eqz p4, :cond_0
        // and-int/lit8 p3, p3, 0x2
        // if-eqz p3, :cond_1
        // VIRTUAL copy(Ljava/lang/Object;Ljava/lang/String;)Lcom/google/ai/edge/gallery/common/JsonObjAndTextContent;
        // move-result-object p0
        return p0;
    }
    public java.lang.Object final component1() {
        // value = {
        // "()TT;"
        // }
        return v0;
    }
    public java.lang.String final component2() {
        return v0;
    }
    public com.google.ai.edge.gallery.common.JsonObjAndTextContent final copy(java.lang.Object, java.lang.String) {
        // value = {
        // "(TT;",
        // "Ljava/lang/String;",
        // ")",
        // "Lcom/google/ai/edge/gallery/common/JsonObjAndTextContent<",
        // "TT;>;"
        // }
        String v0 = "textContent";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        JsonObjAndTextContent; v0 = new JsonObjAndTextContent;();
        // DIRECT <init>(Ljava/lang/Object;Ljava/lang/String;)V
        return v0;
    }
    public boolean equals(java.lang.Object) {
        // const/4 v0, 0x1
        // if-ne p0, p1, :cond_0
        return v0;
        // instance-of v1, p1, Lcom/google/ai/edge/gallery/common/JsonObjAndTextContent;
        // const/4 v2, 0x0
        // if-nez v1, :cond_1
        return v2;
        // move-object v1, p1
        // check-cast v1, Lcom/google/ai/edge/gallery/common/JsonObjAndTextContent;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v3
        // if-nez v3, :cond_2
        return v2;
        // STATIC areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
        // move-result v1
        // if-nez v1, :cond_3
        return v2;
        return v0;
    }
    public java.lang.Object final getJsonObj() {
        // value = {
        // "()TT;"
        // }
        return v0;
    }
    public java.lang.String final getTextContent() {
        return v0;
    }
    public int hashCode() {
        // if-nez v0, :cond_0
        // const/4 v0, 0x0
        // goto :goto_0
        // VIRTUAL hashCode()I
        // move-result v0
        // mul-int/lit8 v1, v0, 0x1f
        // VIRTUAL hashCode()I
        // move-result v2
        // add-int/2addr v1, v2
        return v1;
    }
    public java.lang.String toString() {
        StringBuilder; v2 = new StringBuilder;();
        // DIRECT <init>()V
        String v3 = "JsonObjAndTextContent(jsonObj=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v2
        // VIRTUAL append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        // move-result-object v0
        String v2 = ", textContent=";
        // VIRTUAL append(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // move-result-object v0
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