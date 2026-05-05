// Class: interface abstract Lcom.google.ai.edge.gallery.data.DownloadRepository
// Access: public
class DownloadRepository extends Ljava/lang/Object {

    // Methods:
    public void abstract cancelAll(kotlin.jvm.functions.Function0) {
        // value = {
        // "(",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
    }
    public void abstract cancelDownloadModel(com.google.ai.edge.gallery.data.Model) {

    }
    public void abstract downloadModel(com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function2) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lkotlin/jvm/functions/Function2<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
    }
    public void abstract observerWorkerProgress(java.util.UUID, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.data.Model, kotlin.jvm.functions.Function2) {
        // value = {
        // "(",
        // "Ljava/util/UUID;",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lkotlin/jvm/functions/Function2<",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "-",
        // "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;",
        // "Lkotlin/Unit;",
        // ">;)V"
        // }
    }
}