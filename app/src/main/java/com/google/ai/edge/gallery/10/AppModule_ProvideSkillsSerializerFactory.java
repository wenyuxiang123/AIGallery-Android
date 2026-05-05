// Class: final Lcom.google.ai.edge.gallery.di.AppModule_ProvideSkillsSerializerFactory
// Access: public
class AppModule_ProvideSkillsSerializerFactory extends Ljava/lang/Object {

    // Methods:
    public void constructor <init>() {
        // DIRECT <init>()V
        return ;
    }
    public com.google.ai.edge.gallery.di.AppModule_ProvideSkillsSerializerFactory static create() {
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/di/AppModule_ProvideSkillsSerializerFactory;
        return v0;
    }
    public androidx.datastore.core.Serializer static provideSkillsSerializer() {
        // value = {
        // "()",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/Skills;",
        // ">;"
        // }
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/di/AppModule;
        // VIRTUAL provideSkillsSerializer()Landroidx/datastore/core/Serializer;
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
        // "Lcom/google/ai/edge/gallery/proto/Skills;",
        // ">;"
        // }
        // STATIC provideSkillsSerializer()Landroidx/datastore/core/Serializer;
        // move-result-object v0
        return v0;
    }
    public java.lang.Object bridge synthetic get() {
        // VIRTUAL get()Landroidx/datastore/core/Serializer;
        // move-result-object v0
        return v0;
    }
}