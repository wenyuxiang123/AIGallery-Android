// Class: final Lcom.google.ai.edge.gallery.data.Category
// Access: public
class Category extends Ljava/lang/Object {

    // Fields:
    private static final com.google.ai.edge.gallery.data.CategoryInfo CLASSICAL_ML;
    private static final com.google.ai.edge.gallery.data.CategoryInfo EXPERIMENTAL;
    public static final com.google.ai.edge.gallery.data.Category INSTANCE;
    private static final com.google.ai.edge.gallery.data.CategoryInfo LLM;

    // Methods:
    static void constructor <clinit>() {
        Category; v0 = new Category;();
        // DIRECT <init>()V
        CategoryInfo; v0 = new CategoryInfo;();
        // v1 = category_llm:I
        // STATIC valueOf(I)Ljava/lang/Integer;
        // move-result-object v3
        // const/4 v5, 0x4
        // const/4 v6, 0x0
        String v2 = "llm";
        // const/4 v4, 0x0
        // move-object v1, v0
        CategoryInfo; v0 = new CategoryInfo;();
        // v1 = category_llm:I
        // STATIC valueOf(I)Ljava/lang/Integer;
        // move-result-object v9
        // const/4 v11, 0x4
        // const/4 v12, 0x0
        String v8 = "classical_ml";
        // const/4 v10, 0x0
        // move-object v7, v0
        // ... (truncated)
    }
    private void constructor <init>() {
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.data.CategoryInfo final getCLASSICAL_ML() {
        // v0 = CLASSICAL_ML:Lcom/google/ai/edge/gallery/data/CategoryInfo;
        return v0;
    }
    public com.google.ai.edge.gallery.data.CategoryInfo final getEXPERIMENTAL() {
        // v0 = EXPERIMENTAL:Lcom/google/ai/edge/gallery/data/CategoryInfo;
        return v0;
    }
    public com.google.ai.edge.gallery.data.CategoryInfo final getLLM() {
        // v0 = LLM:Lcom/google/ai/edge/gallery/data/CategoryInfo;
        return v0;
    }
}