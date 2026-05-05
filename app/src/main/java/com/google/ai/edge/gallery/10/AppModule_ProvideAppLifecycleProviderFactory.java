// Class: final Lcom.google.ai.edge.gallery.di.AppModule_ProvideAppLifecycleProviderFactory
// Access: public
class AppModule_ProvideAppLifecycleProviderFactory extends Ljava/lang/Object {

    // Methods:
    public void constructor <init>() {
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.di.AppModule_ProvideAppLifecycleProviderFactory static create() {
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/di/AppModule_ProvideAppLifecycleProviderFactory;
        return v0;
    }
    public com.google.ai.edge.gallery.AppLifecycleProvider static provideAppLifecycleProvider() {
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/di/AppModule;
        // VIRTUAL provideAppLifecycleProvider()Lcom/google/ai/edge/gallery/AppLifecycleProvider;
        // move-result-object v0
        // STATIC checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/AppLifecycleProvider;
        return v0;
    }
    public com.google.ai.edge.gallery.AppLifecycleProvider get() {
        // STATIC provideAppLifecycleProvider()Lcom/google/ai/edge/gallery/AppLifecycleProvider;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic get() {
        // VIRTUAL get()Lcom/google/ai/edge/gallery/AppLifecycleProvider;
        // move-result-object v0
        return v0;
    }
}