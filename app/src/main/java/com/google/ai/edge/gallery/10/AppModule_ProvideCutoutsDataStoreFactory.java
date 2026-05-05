// Class: final Lcom.google.ai.edge.gallery.di.AppModule_ProvideCutoutsDataStoreFactory
// Access: public
class AppModule_ProvideCutoutsDataStoreFactory extends Ljava/lang/Object {

    // Fields:
    private final dagger.internal.Provider contextProvider;
    private final dagger.internal.Provider cutoutsSerializerProvider;

    // Methods:
    private void constructor <init>(dagger.internal.Provider, dagger.internal.Provider) {
        // value = {
        // "(",
        // "Ldagger/internal/Provider<",
        // "Landroid/content/Context;",
        // ">;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // ">;>;)V"
        // }
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.di.AppModule_ProvideCutoutsDataStoreFactory static create(dagger.internal.Provider, dagger.internal.Provider) {
        // value = {
        // "(",
        // "Ldagger/internal/Provider<",
        // "Landroid/content/Context;",
        // ">;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // ">;>;)",
        // "Lcom/google/ai/edge/gallery/di/AppModule_ProvideCutoutsDataStoreFactory;"
        // }
        AppModule_ProvideCutoutsDataStoreFactory; v0 = new AppModule_ProvideCutoutsDataStoreFactory;();
        // DIRECT <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V
        return v0;
    }
    public androidx.datastore.core.DataStore static provideCutoutsDataStore(android.content.Context, androidx.datastore.core.Serializer) {
        // value = {
        // "(",
        // "Landroid/content/Context;",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // ">;)",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // ">;"
        // }
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/di/AppModule;
        // VIRTUAL provideCutoutsDataStore(Landroid/content/Context;Landroidx/datastore/core/Serializer;)Landroidx/datastore/core/DataStore;
        // move-result-object v0
        // STATIC checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Landroidx/datastore/core/DataStore;
        return v0;
    }
    public androidx.datastore.core.DataStore get() {
        // value = {
        // "()",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // ">;"
        // }
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Landroid/content/Context;
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v1
        // check-cast v1, Landroidx/datastore/core/Serializer;
        // STATIC provideCutoutsDataStore(Landroid/content/Context;Landroidx/datastore/core/Serializer;)Landroidx/datastore/core/DataStore;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic get() {
        // VIRTUAL get()Landroidx/datastore/core/DataStore;
        // move-result-object v0
        return v0;
    }
}