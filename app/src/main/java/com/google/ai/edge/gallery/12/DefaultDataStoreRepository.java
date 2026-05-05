// Class: final Lcom.google.ai.edge.gallery.data.DefaultDataStoreRepository
// Access: public
class DefaultDataStoreRepository extends Ljava/lang/Object {

    // Fields:
    private final androidx.datastore.core.DataStore benchmarkResultsDataStore;
    private final androidx.datastore.core.DataStore cutoutDataStore;
    private final androidx.datastore.core.DataStore dataStore;
    private final androidx.datastore.core.DataStore skillsDataStore;
    private final androidx.datastore.core.DataStore userDataDataStore;

    // Methods:
    static void constructor <clinit>() {
        // const/16 v0, 0x8
        // sput v0, Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;->$stable:I
        return ;
    }
    public void constructor <init>(androidx.datastore.core.DataStore, androidx.datastore.core.DataStore, androidx.datastore.core.DataStore, androidx.datastore.core.DataStore, androidx.datastore.core.DataStore) {
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
        // ">;)V"
        // }
        String v0 = "dataStore";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        // ... (truncated)
    }
    public androidx.datastore.core.DataStore static final synthetic access$getBenchmarkResultsDataStore$p(com.google.ai.edge.gallery.data.DefaultDataStoreRepository) {
        return v0;
    }
    public androidx.datastore.core.DataStore static final synthetic access$getCutoutDataStore$p(com.google.ai.edge.gallery.data.DefaultDataStoreRepository) {
        return v0;
    }
    public androidx.datastore.core.DataStore static final synthetic access$getDataStore$p(com.google.ai.edge.gallery.data.DefaultDataStoreRepository) {
        return v0;
    }
    public androidx.datastore.core.DataStore static final synthetic access$getSkillsDataStore$p(com.google.ai.edge.gallery.data.DefaultDataStoreRepository) {
        return v0;
    }
    public androidx.datastore.core.DataStore static final synthetic access$getUserDataDataStore$p(com.google.ai.edge.gallery.data.DefaultDataStoreRepository) {
        return v0;
    }
    public void acceptGemmaTermsOfUse() {
        DefaultDataStoreRepository$acceptGemmaTermsOfUse$1; v0 = new DefaultDataStoreRepository$acceptGemmaTermsOfUse$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void acceptTos() {
        DefaultDataStoreRepository$acceptTos$1; v0 = new DefaultDataStoreRepository$acceptTos$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void addBenchmarkResult(com.google.ai.edge.gallery.proto.BenchmarkResult) {
        String v0 = "result";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$addBenchmarkResult$1; v0 = new DefaultDataStoreRepository$addBenchmarkResult$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lcom/google/ai/edge/gallery/proto/BenchmarkResult;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void addCutout(com.google.ai.edge.gallery.proto.Cutout) {
        String v0 = "cutout";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$addCutout$1; v0 = new DefaultDataStoreRepository$addCutout$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lcom/google/ai/edge/gallery/proto/Cutout;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void addSkill(com.google.ai.edge.gallery.proto.Skill) {
        String v0 = "skill";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$addSkill$1; v0 = new DefaultDataStoreRepository$addSkill$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lcom/google/ai/edge/gallery/proto/Skill;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void addViewedPromoId(java.lang.String) {
        String v0 = "promoId";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$addViewedPromoId$1; v0 = new DefaultDataStoreRepository$addViewedPromoId$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void clearAccessTokenData() {
        DefaultDataStoreRepository$clearAccessTokenData$1; v0 = new DefaultDataStoreRepository$clearAccessTokenData$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void deleteBenchmarkResult(int) {
        DefaultDataStoreRepository$deleteBenchmarkResult$1; v0 = new DefaultDataStoreRepository$deleteBenchmarkResult$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;ILkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void deleteSecret(java.lang.String) {
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$deleteSecret$1; v0 = new DefaultDataStoreRepository$deleteSecret$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void deleteSkill(java.lang.String) {
        String v0 = "name";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$deleteSkill$1; v0 = new DefaultDataStoreRepository$deleteSkill$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public java.lang.Object deleteSkills(java.util.Set, kotlin.coroutines.Continuation) {
        // value = {
        // "(",
        // "Ljava/util/Set<",
        // "Ljava/lang/String;",
        // ">;",
        // "Lkotlin/coroutines/Continuation<",
        // "-",
        // "Lkotlin/Unit;",
        // ">;)",
        // "Ljava/lang/Object;"
        // }
        DefaultDataStoreRepository$deleteSkills$2; v1 = new DefaultDataStoreRepository$deleteSkills$2;();
        // const/4 v2, 0x0
        // DIRECT <init>(Ljava/util/Set;Lkotlin/coroutines/Continuation;)V
        // check-cast v1, Lkotlin/jvm/functions/Function2;
        // INTERFACE updateData(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        // move-result-object v0
        // STATIC getCOROUTINE_SUSPENDED()Ljava/lang/Object;
        // move-result-object v1
        // if-ne v0, v1, :cond_0
        // ... (truncated)
    }
    public java.util.List getAllBenchmarkResults() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/BenchmarkResult;",
        // ">;"
        // }
        DefaultDataStoreRepository$getAllBenchmarkResults$1; v0 = new DefaultDataStoreRepository$getAllBenchmarkResults$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // STATIC checkNotNull(Ljava/lang/Object;)V
        // check-cast v0, Ljava/util/List;
        return v0;
    }
    public java.util.List getAllCutouts() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/Cutout;",
        // ">;"
        // }
        DefaultDataStoreRepository$getAllCutouts$1; v0 = new DefaultDataStoreRepository$getAllCutouts$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // STATIC checkNotNull(Ljava/lang/Object;)V
        // check-cast v0, Ljava/util/List;
        return v0;
    }
    public java.util.List getAllSkills() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/Skill;",
        // ">;"
        // }
        DefaultDataStoreRepository$getAllSkills$1; v0 = new DefaultDataStoreRepository$getAllSkills$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // STATIC checkNotNull(Ljava/lang/Object;)V
        // check-cast v0, Ljava/util/List;
        return v0;
    }
    public boolean getHasRunTinyGarden() {
        DefaultDataStoreRepository$getHasRunTinyGarden$1; v0 = new DefaultDataStoreRepository$getHasRunTinyGarden$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Boolean;
        // VIRTUAL booleanValue()Z
        // move-result v0
        return v0;
    }
    public boolean getHasSeenBenchmarkComparisonHelp() {
        DefaultDataStoreRepository$getHasSeenBenchmarkComparisonHelp$1; v0 = new DefaultDataStoreRepository$getHasSeenBenchmarkComparisonHelp$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Boolean;
        // VIRTUAL booleanValue()Z
        // move-result v0
        return v0;
    }
    public boolean hasViewedPromo(java.lang.String) {
        String v0 = "promoId";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$hasViewedPromo$1; v0 = new DefaultDataStoreRepository$hasViewedPromo$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Boolean;
        // VIRTUAL booleanValue()Z
        // move-result v0
        return v0;
    }
    public boolean isGemmaTermsOfUseAccepted() {
        DefaultDataStoreRepository$isGemmaTermsOfUseAccepted$1; v0 = new DefaultDataStoreRepository$isGemmaTermsOfUseAccepted$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Boolean;
        // VIRTUAL booleanValue()Z
        // move-result v0
        return v0;
    }
    public boolean isTosAccepted() {
        DefaultDataStoreRepository$isTosAccepted$1; v0 = new DefaultDataStoreRepository$isTosAccepted$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Ljava/lang/Boolean;
        // VIRTUAL booleanValue()Z
        // move-result v0
        return v0;
    }
    public com.google.ai.edge.gallery.proto.AccessTokenData readAccessTokenData() {
        DefaultDataStoreRepository$readAccessTokenData$1; v0 = new DefaultDataStoreRepository$readAccessTokenData$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Lcom/google/ai/edge/gallery/proto/AccessTokenData;
        return v0;
    }
    public java.util.List readImportedModels() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/ImportedModel;",
        // ">;"
        // }
        DefaultDataStoreRepository$readImportedModels$1; v0 = new DefaultDataStoreRepository$readImportedModels$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // STATIC checkNotNull(Ljava/lang/Object;)V
        // check-cast v0, Ljava/util/List;
        return v0;
    }
    public java.lang.String readSecret(java.lang.String) {
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$readSecret$1; v0 = new DefaultDataStoreRepository$readSecret$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // check-cast v0, Ljava/lang/String;
        return v0;
    }
    public java.util.List readTextInputHistory() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
        DefaultDataStoreRepository$readTextInputHistory$1; v0 = new DefaultDataStoreRepository$readTextInputHistory$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // STATIC checkNotNull(Ljava/lang/Object;)V
        // check-cast v0, Ljava/util/List;
        return v0;
    }
    public com.google.ai.edge.gallery.proto.Theme readTheme() {
        DefaultDataStoreRepository$readTheme$1; v0 = new DefaultDataStoreRepository$readTheme$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        // move-result-object v0
        // STATIC checkNotNull(Ljava/lang/Object;)V
        // check-cast v0, Lcom/google/ai/edge/gallery/proto/Theme;
        return v0;
    }
    public void removeViewedPromoId(java.lang.String) {
        String v0 = "promoId";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$removeViewedPromoId$1; v0 = new DefaultDataStoreRepository$removeViewedPromoId$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void saveAccessTokenData(java.lang.String, java.lang.String, long) {
        String v0 = "accessToken";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "refreshToken";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$saveAccessTokenData$1; v0 = new DefaultDataStoreRepository$saveAccessTokenData$1;();
        // const/4 v7, 0x0
        // move-object v1, v0
        // move-object v2, p0
        // move-object v3, p1
        // move-object v4, p2
        // move-wide v5, p3
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v1, 0x1
        // const/4 v2, 0x0
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void saveImportedModels(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/ImportedModel;",
        // ">;)V"
        // }
        String v0 = "importedModels";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$saveImportedModels$1; v0 = new DefaultDataStoreRepository$saveImportedModels$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void saveSecret(java.lang.String, java.lang.String) {
        String v0 = "key";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v0 = "value";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$saveSecret$1; v0 = new DefaultDataStoreRepository$saveSecret$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void saveTextInputHistory(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;)V"
        // }
        String v0 = "history";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$saveTextInputHistory$1; v0 = new DefaultDataStoreRepository$saveTextInputHistory$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void saveTheme(com.google.ai.edge.gallery.proto.Theme) {
        String v0 = "theme";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$saveTheme$1; v0 = new DefaultDataStoreRepository$saveTheme$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lcom/google/ai/edge/gallery/proto/Theme;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void setAllSkillsSelected(boolean) {
        DefaultDataStoreRepository$setAllSkillsSelected$1; v0 = new DefaultDataStoreRepository$setAllSkillsSelected$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;ZLkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void setCutout(com.google.ai.edge.gallery.proto.Cutout) {
        String v0 = "newCutout";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$setCutout$1; v0 = new DefaultDataStoreRepository$setCutout$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lcom/google/ai/edge/gallery/proto/Cutout;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void setCutouts(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/Cutout;",
        // ">;)V"
        // }
        String v0 = "cutouts";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$setCutouts$1; v0 = new DefaultDataStoreRepository$setCutouts$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void setHasRunTinyGarden(boolean) {
        DefaultDataStoreRepository$setHasRunTinyGarden$1; v0 = new DefaultDataStoreRepository$setHasRunTinyGarden$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;ZLkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void setHasSeenBenchmarkComparisonHelp(boolean) {
        DefaultDataStoreRepository$setHasSeenBenchmarkComparisonHelp$1; v0 = new DefaultDataStoreRepository$setHasSeenBenchmarkComparisonHelp$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;ZLkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void setSkillSelected(com.google.ai.edge.gallery.proto.Skill, boolean) {
        String v0 = "skill";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$setSkillSelected$1; v0 = new DefaultDataStoreRepository$setSkillSelected$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Lcom/google/ai/edge/gallery/proto/Skill;ZLkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
    public void setSkills(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/Skill;",
        // ">;)V"
        // }
        String v0 = "skills";
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        DefaultDataStoreRepository$setSkills$1; v0 = new DefaultDataStoreRepository$setSkills$1;();
        // const/4 v1, 0x0
        // DIRECT <init>(Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
        // check-cast v0, Lkotlin/jvm/functions/Function2;
        // const/4 v2, 0x1
        // STATIC runBlocking$default(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
        return ;
    }
}