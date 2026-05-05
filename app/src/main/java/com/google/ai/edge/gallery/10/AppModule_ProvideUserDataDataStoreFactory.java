// Class: final Lcom.google.ai.edge.gallery.di.AppModule_ProvideUserDataDataStoreFactory
// Access: public
class AppModule_ProvideUserDataDataStoreFactory extends Ljava/lang/Object {

    // Fields:
    private final dagger.internal.Provider contextProvider;
    private final dagger.internal.Provider userDataSerializerProvider;

    // Methods:
    private void constructor <init>(dagger.internal.Provider, dagger.internal.Provider) {
        // value = {
        // "(",
        // "Ldagger/internal/Provider<",
        // "Landroid/content/Context;",
        // ">;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;>;)V"
        // }
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.di.AppModule_ProvideUserDataDataStoreFactory static create(dagger.internal.Provider, dagger.internal.Provider) {
        // value = {
        // "(",
        // "Ldagger/internal/Provider<",
        // "Landroid/content/Context;",
        // ">;",
        // "Ldagger/internal/Provider<",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;>;)",
        // "Lcom/google/ai/edge/gallery/di/AppModule_ProvideUserDataDataStoreFactory;"
        // }
        AppModule_ProvideUserDataDataStoreFactory; v0 = new AppModule_ProvideUserDataDataStoreFactory;();
        // DIRECT <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V
        return v0;
    }
    public androidx.datastore.core.DataStore static provideUserDataDataStore(android.content.Context, androidx.datastore.core.Serializer) {
        // value = {
        // "(",
        // "Landroid/content/Context;",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;)",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;"
        // }
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/di/AppModule;
        // VIRTUAL provideUserDataDataStore(Landroid/content/Context;Landroidx/datastore/core/Serializer;)Landroidx/datastore/core/DataStore;
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
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;"
        // }
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Landroid/content/Context;
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v1
        // check-cast v1, Landroidx/datastore/core/Serializer;
        // STATIC provideUserDataDataStore(Landroid/content/Context;Landroidx/datastore/core/Serializer;)Landroidx/datastore/core/DataStore;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic get() {
        // VIRTUAL get()Landroidx/datastore/core/DataStore;
        // move-result-object v0
        return v0;
    }
}