package com.google.ai.edge.gallery.data;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.proto.AccessTokenData;
import com.google.ai.edge.gallery.proto.BenchmarkResult;
import com.google.ai.edge.gallery.proto.Cutout;
import com.google.ai.edge.gallery.proto.ImportedModel;
import com.google.ai.edge.gallery.proto.Skill;
import com.google.ai.edge.gallery.proto.Theme;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;



public interface DataStoreRepository {
    void acceptGemmaTermsOfUse();

    void acceptTos();

    void addBenchmarkResult(BenchmarkResult result);

    void addCutout(Cutout cutout);

    void addSkill(Skill skill);

    void addViewedPromoId(String promoId);

    void clearAccessTokenData();

    void deleteBenchmarkResult(int index);

    void deleteSecret(String key);

    void deleteSkill(String name);

    Object deleteSkills(Set<String> set, Continuation<? super Unit> continuation);

    List<BenchmarkResult> getAllBenchmarkResults();

    List<Cutout> getAllCutouts();

    List<Skill> getAllSkills();

    boolean getHasRunTinyGarden();

    boolean getHasSeenBenchmarkComparisonHelp();

    boolean hasViewedPromo(String promoId);

    boolean isGemmaTermsOfUseAccepted();

    boolean isTosAccepted();

    AccessTokenData readAccessTokenData();

    List<ImportedModel> readImportedModels();

    String readSecret(String key);

    List<String> readTextInputHistory();

    Theme readTheme();

    void removeViewedPromoId(String promoId);

    void saveAccessTokenData(String accessToken, String refreshToken, long expiresAt);

    void saveImportedModels(List<ImportedModel> importedModels);

    void saveSecret(String key, String value);

    void saveTextInputHistory(List<String> history);

    void saveTheme(Theme theme);

    void setAllSkillsSelected(boolean selected);

    void setCutout(Cutout newCutout);

    void setCutouts(List<Cutout> cutouts);

    void setHasRunTinyGarden(boolean hasRun);

    void setHasSeenBenchmarkComparisonHelp(boolean seen);

    void setSkillSelected(Skill skill, boolean selected);

    void setSkills(List<Skill> skills);
}
