// Class: interface abstract Lcom.google.ai.edge.gallery.data.DataStoreRepository
// Access: public
class DataStoreRepository extends Ljava/lang/Object {

    // Methods:
    public void abstract acceptGemmaTermsOfUse() {

    }
    public void abstract acceptTos() {

    }
    public void abstract addBenchmarkResult(com.google.ai.edge.gallery.proto.BenchmarkResult) {

    }
    public void abstract addCutout(com.google.ai.edge.gallery.proto.Cutout) {

    }
    public void abstract addSkill(com.google.ai.edge.gallery.proto.Skill) {

    }
    public void abstract addViewedPromoId(java.lang.String) {

    }
    public void abstract clearAccessTokenData() {

    }
    public void abstract deleteBenchmarkResult(int) {

    }
    public void abstract deleteSecret(java.lang.String) {

    }
    public void abstract deleteSkill(java.lang.String) {

    }
    public java.lang.Object abstract deleteSkills(java.util.Set, kotlin.coroutines.Continuation) {
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
    }
    public java.util.List abstract getAllBenchmarkResults() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/BenchmarkResult;",
        // ">;"
        // }
    }
    public java.util.List abstract getAllCutouts() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/Cutout;",
        // ">;"
        // }
    }
    public java.util.List abstract getAllSkills() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/Skill;",
        // ">;"
        // }
    }
    public boolean abstract getHasRunTinyGarden() {

    }
    public boolean abstract getHasSeenBenchmarkComparisonHelp() {

    }
    public boolean abstract hasViewedPromo(java.lang.String) {

    }
    public boolean abstract isGemmaTermsOfUseAccepted() {

    }
    public boolean abstract isTosAccepted() {

    }
    public com.google.ai.edge.gallery.proto.AccessTokenData abstract readAccessTokenData() {

    }
    public java.util.List abstract readImportedModels() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/ImportedModel;",
        // ">;"
        // }
    }
    public java.lang.String abstract readSecret(java.lang.String) {

    }
    public java.util.List abstract readTextInputHistory() {
        // value = {
        // "()",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;"
        // }
    }
    public com.google.ai.edge.gallery.proto.Theme abstract readTheme() {

    }
    public void abstract removeViewedPromoId(java.lang.String) {

    }
    public void abstract saveAccessTokenData(java.lang.String, java.lang.String, long) {

    }
    public void abstract saveImportedModels(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/ImportedModel;",
        // ">;)V"
        // }
    }
    public void abstract saveSecret(java.lang.String, java.lang.String) {

    }
    public void abstract saveTextInputHistory(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Ljava/lang/String;",
        // ">;)V"
        // }
    }
    public void abstract saveTheme(com.google.ai.edge.gallery.proto.Theme) {

    }
    public void abstract setAllSkillsSelected(boolean) {

    }
    public void abstract setCutout(com.google.ai.edge.gallery.proto.Cutout) {

    }
    public void abstract setCutouts(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/Cutout;",
        // ">;)V"
        // }
    }
    public void abstract setHasRunTinyGarden(boolean) {

    }
    public void abstract setHasSeenBenchmarkComparisonHelp(boolean) {

    }
    public void abstract setSkillSelected(com.google.ai.edge.gallery.proto.Skill, boolean) {

    }
    public void abstract setSkills(java.util.List) {
        // value = {
        // "(",
        // "Ljava/util/List<",
        // "Lcom/google/ai/edge/gallery/proto/Skill;",
        // ">;)V"
        // }
    }
}