// Class: final enum Lcom.google.ai.edge.gallery.data.ModelDownloadStatusType
// Access: public
class ModelDownloadStatusType extends Ljava/lang/Enum {

    // Fields:
    public static final enum com.google.ai.edge.gallery.data.ModelDownloadStatusType FAILED;
    public static final enum com.google.ai.edge.gallery.data.ModelDownloadStatusType IN_PROGRESS;
    public static final enum com.google.ai.edge.gallery.data.ModelDownloadStatusType NOT_DOWNLOADED;
    public static final enum com.google.ai.edge.gallery.data.ModelDownloadStatusType PARTIALLY_DOWNLOADED;
    public static final enum com.google.ai.edge.gallery.data.ModelDownloadStatusType SUCCEEDED;
    public static final enum com.google.ai.edge.gallery.data.ModelDownloadStatusType UNZIPPING;

    // Methods:
    private com.google.ai.edge.gallery.data.ModelDownloadStatusType[] static final synthetic $values() {
        // v0 = NOT_DOWNLOADED:Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // v1 = PARTIALLY_DOWNLOADED:Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // v2 = IN_PROGRESS:Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // v3 = UNZIPPING:Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // v4 = SUCCEEDED:Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // v5 = FAILED:Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // filled-new-array/range {v0 .. v5}, [Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // move-result-object v0
        return v0;
    }
    static void constructor <clinit>() {
        ModelDownloadStatusType; v0 = new ModelDownloadStatusType;();
        String v1 = "NOT_DOWNLOADED";
        // const/4 v2, 0x0
        // DIRECT <init>(Ljava/lang/String;I)V
        ModelDownloadStatusType; v0 = new ModelDownloadStatusType;();
        String v1 = "PARTIALLY_DOWNLOADED";
        // const/4 v2, 0x1
        // DIRECT <init>(Ljava/lang/String;I)V
        ModelDownloadStatusType; v0 = new ModelDownloadStatusType;();
        String v1 = "IN_PROGRESS";
        // const/4 v2, 0x2
        // DIRECT <init>(Ljava/lang/String;I)V
        ModelDownloadStatusType; v0 = new ModelDownloadStatusType;();
        String v1 = "UNZIPPING";
        // const/4 v2, 0x3
        // DIRECT <init>(Ljava/lang/String;I)V
        ModelDownloadStatusType; v0 = new ModelDownloadStatusType;();
        String v1 = "SUCCEEDED";
        // const/4 v2, 0x4
        // DIRECT <init>(Ljava/lang/String;I)V
        // ... (truncated)
    }
    private void constructor <init>(java.lang.String, int) {
        // value = {
        // "()V"
        // }
        // DIRECT <init>(Ljava/lang/String;I)V
        return ;
    }
    public kotlin.enums.EnumEntries static getEntries() {
        // value = {
        // "()",
        // "Lkotlin/enums/EnumEntries<",
        // "Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;",
        // ">;"
        // }
        // v0 = $ENTRIES:Lkotlin/enums/EnumEntries;
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelDownloadStatusType static valueOf(java.lang.String) {
        // const-class v0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // STATIC valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        return v0;
    }
    public com.google.ai.edge.gallery.data.ModelDownloadStatusType[] static values() {
        // v0 = $VALUES:[Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // VIRTUAL clone()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, [Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        return v0;
    }
}