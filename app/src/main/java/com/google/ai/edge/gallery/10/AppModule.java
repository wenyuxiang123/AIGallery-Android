// Class: final Lcom.google.ai.edge.gallery.di.AppModule
// Access: public
class AppModule extends Ljava/lang/Object {

    // Fields:
    public static final com.google.ai.edge.gallery.di.AppModule INSTANCE;

    // Methods:
    public java.io.File static synthetic $r8$lambda$2OHW9R_HlSUfiQaIHW0zLQ--X6Q(android.content.Context) {
        // STATIC provideSettingsDataStore$lambda$0(Landroid/content/Context;)Ljava/io/File;
        // move-result-object p0
        return p0;
    }
    public java.io.File static synthetic $r8$lambda$4PjSe3yz4FC9VaV4SLvoG-Bv8Y4(android.content.Context) {
        // STATIC provideBenchmarkResultsDataStore$lambda$3(Landroid/content/Context;)Ljava/io/File;
        // move-result-object p0
        return p0;
    }
    public java.io.File static synthetic $r8$lambda$AcGEgCQa54kArzCiHMOyp0bXS8Y(android.content.Context) {
        // STATIC provideUserDataDataStore$lambda$2(Landroid/content/Context;)Ljava/io/File;
        // move-result-object p0
        return p0;
    }
    public java.io.File static synthetic $r8$lambda$P_6wFdJyYiO9d1h376yssdUzlFg(android.content.Context) {
        // STATIC provideCutoutsDataStore$lambda$1(Landroid/content/Context;)Ljava/io/File;
        // move-result-object p0
        return p0;
    }
    public java.io.File static synthetic $r8$lambda$cI3p8sqWmf6lTGHmrSaZCRfZvuc(android.content.Context) {
        // STATIC provideSkillsDataStore$lambda$4(Landroid/content/Context;)Ljava/io/File;
        // move-result-object p0
        return p0;
    }
    static void constructor <clinit>() {
        AppModule; v0 = new AppModule;();
        // DIRECT <init>()V
        return ;
    }
    private void constructor <init>() {
        // DIRECT <init>()V
        return ;
    }
    private java.io.File static final provideBenchmarkResultsDataStore$lambda$3(android.content.Context) {
        String v0 = "benchmark_results.pb";
        // STATIC dataStoreFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
        // move-result-object v0
        return v0;
    }
    private java.io.File static final provideCutoutsDataStore$lambda$1(android.content.Context) {
        String v0 = "cutouts.pb";
        // STATIC dataStoreFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
        // move-result-object v0
        return v0;
    }
    private java.io.File static final provideSettingsDataStore$lambda$0(android.content.Context) {
        String v0 = "settings.pb";
        // STATIC dataStoreFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
        // move-result-object v0
        return v0;
    }
    private java.io.File static final provideSkillsDataStore$lambda$4(android.content.Context) {
        String v0 = "skills.pb";
        // STATIC dataStoreFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
        // move-result-object v0
        return v0;
    }
    private java.io.File static final provideUserDataDataStore$lambda$2(android.content.Context) {
        String v0 = "user_data.pb";
        // STATIC dataStoreFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
        // move-result-object v0
        return v0;
    }
    public com.google.ai.edge.gallery.AppLifecycleProvider final provideAppLifecycleProvider() {
        GalleryLifecycleProvider; v0 = new GalleryLifecycleProvider;();
        // DIRECT <init>()V
        // check-cast v0, Lcom/google/ai/edge/gallery/AppLifecycleProvider;
        return v0;
    }
    public androidx.datastore.core.DataStore final provideBenchmarkResultsDataStore(android.content.Context, androidx.datastore.core.Serializer) {
        // value = {
        // "(",
        // "Landroid/content/Context;",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;",
        // ">;)",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;",
        // ">;"
        // }
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "benchmarkResultsSerializer";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v1 = INSTANCE:Landroidx/datastore/core/DataStoreFactory;
        // nop
        AppModule$$ExternalSyntheticLambda4; v6 = new AppModule$$ExternalSyntheticLambda4;();
        // DIRECT <init>(Landroid/content/Context;)V
        // const/16 v7, 0xe
        // const/4 v8, 0x0
        // ... (truncated)
    }
    public androidx.datastore.core.Serializer final provideBenchmarkResultsSerializer() {
        // value = {
        // "()",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;",
        // ">;"
        // }
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/BenchmarkResultsSerializer;
        // check-cast v0, Landroidx/datastore/core/Serializer;
        return v0;
    }
    public androidx.datastore.core.Serializer final provideCutoutSerializer() {
        // value = {
        // "()",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/CutoutCollection;",
        // ">;"
        // }
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/CutoutsSerializer;
        // check-cast v0, Landroidx/datastore/core/Serializer;
        return v0;
    }
    public androidx.datastore.core.DataStore final provideCutoutsDataStore(android.content.Context, androidx.datastore.core.Serializer) {
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
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "cutoutsSerializer";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v1 = INSTANCE:Landroidx/datastore/core/DataStoreFactory;
        // nop
        AppModule$$ExternalSyntheticLambda0; v6 = new AppModule$$ExternalSyntheticLambda0;();
        // DIRECT <init>(Landroid/content/Context;)V
        // const/16 v7, 0xe
        // const/4 v8, 0x0
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.DataStoreRepository final provideDataStoreRepository(androidx.datastore.core.DataStore, androidx.datastore.core.DataStore, androidx.datastore.core.DataStore, androidx.datastore.core.DataStore, androidx.datastore.core.DataStore) {
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
        String v0 = "dataStore";
        // ... (truncated)
    }
    public com.google.ai.edge.gallery.data.DownloadRepository final provideDownloadRepository(android.content.Context, com.google.ai.edge.gallery.AppLifecycleProvider) {
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "lifecycleProvider";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDownloadRepository; v0 = new DefaultDownloadRepository;();
        // DIRECT <init>(Landroid/content/Context;Lcom/google/ai/edge/gallery/AppLifecycleProvider;)V
        // check-cast v0, Lcom/google/ai/edge/gallery/data/DownloadRepository;
        return v0;
    }
    public androidx.datastore.core.DataStore final provideSettingsDataStore(android.content.Context, androidx.datastore.core.Serializer) {
        // value = {
        // "(",
        // "Landroid/content/Context;",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/Settings;",
        // ">;)",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/Settings;",
        // ">;"
        // }
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "settingsSerializer";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v1 = INSTANCE:Landroidx/datastore/core/DataStoreFactory;
        // nop
        AppModule$$ExternalSyntheticLambda2; v6 = new AppModule$$ExternalSyntheticLambda2;();
        // DIRECT <init>(Landroid/content/Context;)V
        // const/16 v7, 0xe
        // const/4 v8, 0x0
        // ... (truncated)
    }
    public androidx.datastore.core.Serializer final provideSettingsSerializer() {
        // value = {
        // "()",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/Settings;",
        // ">;"
        // }
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/SettingsSerializer;
        // check-cast v0, Landroidx/datastore/core/Serializer;
        return v0;
    }
    public androidx.datastore.core.DataStore final provideSkillsDataStore(android.content.Context, androidx.datastore.core.Serializer) {
        // value = {
        // "(",
        // "Landroid/content/Context;",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/Skills;",
        // ">;)",
        // "Landroidx/datastore/core/DataStore<",
        // "Lcom/google/ai/edge/gallery/proto/Skills;",
        // ">;"
        // }
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "skillsSerializer";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v1 = INSTANCE:Landroidx/datastore/core/DataStoreFactory;
        // nop
        AppModule$$ExternalSyntheticLambda1; v6 = new AppModule$$ExternalSyntheticLambda1;();
        // DIRECT <init>(Landroid/content/Context;)V
        // const/16 v7, 0xe
        // const/4 v8, 0x0
        // ... (truncated)
    }
    public androidx.datastore.core.Serializer final provideSkillsSerializer() {
        // value = {
        // "()",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/Skills;",
        // ">;"
        // }
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/SkillsSerializer;
        // check-cast v0, Landroidx/datastore/core/Serializer;
        return v0;
    }
    public androidx.datastore.core.DataStore final provideUserDataDataStore(android.content.Context, androidx.datastore.core.Serializer) {
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
        String v0 = "context";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "userDataSerializer";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // v1 = INSTANCE:Landroidx/datastore/core/DataStoreFactory;
        // nop
        AppModule$$ExternalSyntheticLambda3; v6 = new AppModule$$ExternalSyntheticLambda3;();
        // DIRECT <init>(Landroid/content/Context;)V
        // const/16 v7, 0xe
        // const/4 v8, 0x0
        // ... (truncated)
    }
    public androidx.datastore.core.Serializer final provideUserDataSerializer() {
        // value = {
        // "()",
        // "Landroidx/datastore/core/Serializer<",
        // "Lcom/google/ai/edge/gallery/proto/UserData;",
        // ">;"
        // }
        // v0 = INSTANCE:Lcom/google/ai/edge/gallery/UserDataSerializer;
        // check-cast v0, Landroidx/datastore/core/Serializer;
        return v0;
    }
}