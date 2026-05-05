// Class: final Lcom.google.ai.edge.gallery.di.AppModule_ProvideDownloadRepositoryFactory
// Access: public
class AppModule_ProvideDownloadRepositoryFactory extends Ljava/lang/Object {

    // Fields:
    private final dagger.internal.Provider contextProvider;
    private final dagger.internal.Provider lifecycleProvider;

    // Methods:
    private void constructor <init>(dagger.internal.Provider, dagger.internal.Provider) {
        // value = {
        // "(",
        // "Ldagger/internal/Provider<",
        // "Landroid/content/Context;",
        // ">;",
        // "Ldagger/internal/Provider<",
        // "Lcom/google/ai/edge/gallery/AppLifecycleProvider;",
        // ">;)V"
        // }
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.di.AppModule_ProvideDownloadRepositoryFactory static create(dagger.internal.Provider, dagger.internal.Provider) {
        // value = {
        // "(",
        // "Ldagger/internal/Provider<",
        // "Landroid/content/Context;",
        // ">;",
        // "Ldagger/internal/Provider<",
        // "Lcom/google/ai/edge/gallery/AppLifecycleProvider;",
        // ">;)",
        // "Lcom/google/ai/edge/gallery/di/AppModule_ProvideDownloadRepositoryFactory;"
        // }
        AppModule_ProvideDownloadRepositoryFactory; v0 = new AppModule_ProvideDownloadRepositoryFactory;();
        // DIRECT <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;)V
        return v0;
    }
    public com.google.ai.edge.gallery.data.DownloadRepository static provideDownloadRepository(android.content.Context, com.google.ai.edge.gallery.AppLifecycleProvider) {
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/di/AppModule;
        // VIRTUAL provideDownloadRepository(Landroid/content/Context;Lcom/google/ai/edge/gallery/AppLifecycleProvider;)Lcom/google/ai/edge/gallery/data/DownloadRepository;
        // move-result-object v0
        // STATIC checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/data/DownloadRepository;
        return v0;
    }
    public com.google.ai.edge.gallery.data.DownloadRepository get() {
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Landroid/content/Context;
        // INTERFACE get()Ljava/lang/Object;
        // move-result-object v1
        // check-cast v1, Lcom/google/ai/edge/gallery/AppLifecycleProvider;
        // STATIC provideDownloadRepository(Landroid/content/Context;Lcom/google/ai/edge/gallery/AppLifecycleProvider;)Lcom/google/ai/edge/gallery/data/DownloadRepository;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic get() {
        // VIRTUAL get()Lcom/google/ai/edge/gallery/data/DownloadRepository;
        // move-result-object v0
        return v0;
    }
}