// Class: final Lcom.google.ai.edge.gallery.di.AppModule_ProvideDataStoreRepositoryFactory
// Access: public
class AppModule_ProvideDataStoreRepositoryFactory extends Ljava/lang/Object {

    // Fields:
    private final dagger.internal.Provider benchmarkResultsStoreProvider;
    private final dagger.internal.Provider cutoutsDataStoreProvider;
    private final dagger.internal.Provider dataStoreProvider;
    private final dagger.internal.Provider skillsDataStoreProvider;
    private final dagger.internal.Provider userDataDataStoreProvider;

    // Methods:
    private void constructor <init>(dagger.internal.Provider, dagger.internal.Provider, dagger.internal.Provider, dagger.internal.Provider, dagger.internal.Provider) {
        // value = {
        // "(",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/Settings;",
        // ">;>;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;>;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // ">;>;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;",
        // ">;>;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/DataStore<",
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.di.AppModule_ProvideDataStoreRepositoryFactory static create(dagger.internal.Provider, dagger.internal.Provider, dagger.internal.Provider, dagger.internal.Provider, dagger.internal.Provider) {
        // value = {
        // "(",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/Settings;",
        // ">;>;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;>;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // ">;>;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;",
        // ">;>;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/DataStore<",
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.DataStoreRepository static provideDataStoreRepository(androidx.datastore.core.DataStore, androidx.datastore.core.DataStore, androidx.datastore.core.DataStore, androidx.datastore.core.DataStore, androidx.datastore.core.DataStore) {
        // value = {
        // "(",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/Settings;",
        // ">;",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // ">;",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;",
        // ">;",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/Skills;",
        // ">;)",
        // "Lcom/google/ai/edge/gallery/data/DataStoreRepository;"
        // }
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/di/AppModule;
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.DataStoreRepository get() {
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Landroidx/datastore/core/DataStore;
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v1
        // check-cast v1, Landroidx/datastore/core/DataStore;
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v2
        // check-cast v2, Landroidx/datastore/core/DataStore;
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v3
        // check-cast v3, Landroidx/datastore/core/DataStore;
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v4
        // check-cast v4, Landroidx/datastore/core/DataStore;
        // STATIC provideDataStoreRepository(Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;)Lcom/google/ai/edge/gallery/data/DataStoreRepository;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic get() {
        // VIRTUAL get()Lcom/google/ai/edge/gallery/data/DataStoreRepository;
        // move-result-object v0
        return v0;
    }
}