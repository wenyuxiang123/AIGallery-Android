// Class: final Lcom.google.ai.edge.gallery.di.AppModule_ProvideUserDataSerializerFactory
// Access: public
class AppModule_ProvideUserDataSerializerFactory extends Ljava/lang/Object {

    // Methods:
    public void constructor <init>() {
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.di.AppModule_ProvideUserDataSerializerFactory static create() {
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/di/AppModule_ProvideUserDataSerializerFactory;
        return v0;
    }
    public androidx.datastore.core.Serializer static provideUserDataSerializer() {
        // value = {
        // "()",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;"
        // }
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/di/AppModule;
        // VIRTUAL provideUserDataSerializer()Landroidx/datastore/core/Serializer;
        // move-result-object v0
        // STATIC checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Landroidx/datastore/core/Serializer;
        return v0;
    }
    public androidx.datastore.core.Serializer get() {
        // value = {
        // "()",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;"
        // }
        // STATIC provideUserDataSerializer()Landroidx/datastore/core/Serializer;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic get() {
        // VIRTUAL get()Landroidx/datastore/core/Serializer;
        // move-result-object v0
        return v0;
    }
}