package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
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

/* JADX INFO: compiled from: DataStoreRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0003H&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0016\u0010\u0019\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005H&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u001eH&J\b\u0010!\u001a\u00020\u0003H&J\b\u0010\"\u001a\u00020\u001eH&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001eH&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0005H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020'H&J\u0016\u0010+\u001a\u00020\u00032\f\u0010,\u001a\b\u0012\u0004\u0012\u00020'0\u0005H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u001eH&J\b\u0010/\u001a\u00020\u001eH&J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u000202H&J\u000e\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0005H&J\u0010\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u000206H&J\u0010\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u000209H&J\u0016\u0010:\u001a\u00020\u00032\f\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u0005H&J\u0018\u0010<\u001a\u00020\u00032\u0006\u00108\u001a\u0002092\u0006\u0010=\u001a\u00020\u001eH&J\u0010\u0010>\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u001eH&J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u0002090\u0005H&J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u0006H&J\u001c\u0010B\u001a\u00020\u00032\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060DH¦@¢\u0006\u0002\u0010EJ\u0010\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u0006H&J\u0010\u0010H\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u0006H&J\u0010\u0010I\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020\u0006H&¨\u0006JÀ\u0006\u0003"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "", "saveTextInputHistory", "", "history", "", "", "readTextInputHistory", "saveTheme", "theme", "Lcom/google/ai/edge/gallery/proto/Theme;", "readTheme", "saveSecret", "key", "value", "readSecret", "deleteSecret", "saveAccessTokenData", "accessToken", "refreshToken", "expiresAt", "", "clearAccessTokenData", "readAccessTokenData", "Lcom/google/ai/edge/gallery/proto/AccessTokenData;", "saveImportedModels", "importedModels", "Lcom/google/ai/edge/gallery/proto/ImportedModel;", "readImportedModels", "isTosAccepted", "", "acceptTos", "isGemmaTermsOfUseAccepted", "acceptGemmaTermsOfUse", "getHasRunTinyGarden", "setHasRunTinyGarden", "hasRun", "addCutout", "cutout", "Lcom/google/ai/edge/gallery/proto/Cutout;", "getAllCutouts", "setCutout", "newCutout", "setCutouts", "cutouts", "setHasSeenBenchmarkComparisonHelp", "seen", "getHasSeenBenchmarkComparisonHelp", "addBenchmarkResult", "result", "Lcom/google/ai/edge/gallery/proto/BenchmarkResult;", "getAllBenchmarkResults", "deleteBenchmarkResult", FirebaseAnalytics.Param.INDEX, "", "addSkill", "skill", "Lcom/google/ai/edge/gallery/proto/Skill;", "setSkills", "skills", "setSkillSelected", "selected", "setAllSkillsSelected", "getAllSkills", "deleteSkill", "name", "deleteSkills", "names", "", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addViewedPromoId", "promoId", "removeViewedPromoId", "hasViewedPromo", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
