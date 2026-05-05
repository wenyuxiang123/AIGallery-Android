package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.datastore.core.DataStore;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.proto.AccessTokenData;
import com.google.ai.edge.gallery.proto.BenchmarkResult;
import com.google.ai.edge.gallery.proto.BenchmarkResults;
import com.google.ai.edge.gallery.proto.Cutout;
import com.google.ai.edge.gallery.proto.CutoutCollection;
import com.google.ai.edge.gallery.proto.ImportedModel;
import com.google.ai.edge.gallery.proto.Settings;
import com.google.ai.edge.gallery.proto.Skill;
import com.google.ai.edge.gallery.proto.Skills;
import com.google.ai.edge.gallery.proto.Theme;
import com.google.ai.edge.gallery.proto.UserData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: DataStoreRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0016\u0010&\u001a\u00020\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0012H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0012H\u0016J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0010H\u0016J\b\u0010-\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020\u0010H\u0016J\b\u0010/\u001a\u00020+H\u0016J\u0010\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020+H\u0016J\u0010\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u000204H\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0012H\u0016J\u0010\u00106\u001a\u00020\u00102\u0006\u00107\u001a\u000204H\u0016J\u0016\u00108\u001a\u00020\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u0002040\u0012H\u0016J\u0010\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020+H\u0016J\b\u0010<\u001a\u00020+H\u0016J\u0010\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020?H\u0016J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u0012H\u0016J\u0010\u0010A\u001a\u00020\u00102\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020FH\u0016J\u0016\u0010G\u001a\u00020\u00102\f\u0010H\u001a\b\u0012\u0004\u0012\u00020F0\u0012H\u0016J\u0018\u0010I\u001a\u00020\u00102\u0006\u0010E\u001a\u00020F2\u0006\u0010J\u001a\u00020+H\u0016J\u0010\u0010K\u001a\u00020\u00102\u0006\u0010J\u001a\u00020+H\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020F0\u0012H\u0016J\u0010\u0010M\u001a\u00020\u00102\u0006\u0010N\u001a\u00020\u0013H\u0016J\u001c\u0010O\u001a\u00020\u00102\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00130QH\u0096@¢\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u00020\u00102\u0006\u0010T\u001a\u00020\u0013H\u0016J\u0010\u0010U\u001a\u00020\u00102\u0006\u0010T\u001a\u00020\u0013H\u0016J\u0010\u0010V\u001a\u00020+2\u0006\u0010T\u001a\u00020\u0013H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006W"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/DefaultDataStoreRepository;", "Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "dataStore", "Landroidx/datastore/core/DataStore;", "Lcom/google/ai/edge/gallery/proto/Settings;", "userDataDataStore", "Lcom/google/ai/edge/gallery/proto/UserData;", "cutoutDataStore", "Lcom/google/ai/edge/gallery/proto/CutoutCollection;", "benchmarkResultsDataStore", "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;", "skillsDataStore", "Lcom/google/ai/edge/gallery/proto/Skills;", "<init>", "(Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;)V", "saveTextInputHistory", "", "history", "", "", "readTextInputHistory", "saveTheme", "theme", "Lcom/google/ai/edge/gallery/proto/Theme;", "readTheme", "saveSecret", "key", "value", "readSecret", "deleteSecret", "saveAccessTokenData", "accessToken", "refreshToken", "expiresAt", "", "clearAccessTokenData", "readAccessTokenData", "Lcom/google/ai/edge/gallery/proto/AccessTokenData;", "saveImportedModels", "importedModels", "Lcom/google/ai/edge/gallery/proto/ImportedModel;", "readImportedModels", "isTosAccepted", "", "acceptTos", "isGemmaTermsOfUseAccepted", "acceptGemmaTermsOfUse", "getHasRunTinyGarden", "setHasRunTinyGarden", "hasRun", "addCutout", "cutout", "Lcom/google/ai/edge/gallery/proto/Cutout;", "getAllCutouts", "setCutout", "newCutout", "setCutouts", "cutouts", "setHasSeenBenchmarkComparisonHelp", "seen", "getHasSeenBenchmarkComparisonHelp", "addBenchmarkResult", "result", "Lcom/google/ai/edge/gallery/proto/BenchmarkResult;", "getAllBenchmarkResults", "deleteBenchmarkResult", FirebaseAnalytics.Param.INDEX, "", "addSkill", "skill", "Lcom/google/ai/edge/gallery/proto/Skill;", "setSkills", "skills", "setSkillSelected", "selected", "setAllSkillsSelected", "getAllSkills", "deleteSkill", "name", "deleteSkills", "names", "", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addViewedPromoId", "promoId", "removeViewedPromoId", "hasViewedPromo", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class DefaultDataStoreRepository implements DataStoreRepository {
    public static final int $stable = 8;
    private final DataStore<BenchmarkResults> benchmarkResultsDataStore;
    private final DataStore<CutoutCollection> cutoutDataStore;
    private final DataStore<Settings> dataStore;
    private final DataStore<Skills> skillsDataStore;
    private final DataStore<UserData> userDataDataStore;

    public DefaultDataStoreRepository(DataStore<Settings> dataStore, DataStore<UserData> userDataDataStore, DataStore<CutoutCollection> cutoutDataStore, DataStore<BenchmarkResults> benchmarkResultsDataStore, DataStore<Skills> skillsDataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(userDataDataStore, "userDataDataStore");
        Intrinsics.checkNotNullParameter(cutoutDataStore, "cutoutDataStore");
        Intrinsics.checkNotNullParameter(benchmarkResultsDataStore, "benchmarkResultsDataStore");
        Intrinsics.checkNotNullParameter(skillsDataStore, "skillsDataStore");
        this.dataStore = dataStore;
        this.userDataDataStore = userDataDataStore;
        this.cutoutDataStore = cutoutDataStore;
        this.benchmarkResultsDataStore = benchmarkResultsDataStore;
        this.skillsDataStore = skillsDataStore;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveTextInputHistory$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveTextInputHistory$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {124}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        final /* synthetic */ List<String> $history;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25831(List<String> list, Continuation<? super C25831> continuation) {
            super(2, continuation);
            this.$history = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25831(this.$history, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Settings> continuation) {
            return ((C25831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveTextInputHistory$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveTextInputHistory$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            final /* synthetic */ List<String> $history;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<String> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$history = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$history, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Settings settingsBuild = settings.toBuilder().clearTextInputHistory().addAllTextInputHistory(this.$history).build();
                        Intrinsics.checkNotNullExpressionValue(settingsBuild, "build(...)");
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(this.$history, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void saveTextInputHistory(List<String> history) throws InterruptedException {
        Intrinsics.checkNotNullParameter(history, "history");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25831(history, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$readTextInputHistory$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, m922d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$readTextInputHistory$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {132}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<String>>, Object> {
        int label;

        C25771(Continuation<? super C25771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25771(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<String>> continuation) {
            return ((C25771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.dataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Settings settings = (Settings) objFirst;
            return settings.getTextInputHistoryList();
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public List<String> readTextInputHistory() throws InterruptedException {
        Object objRunBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C25771(null), 1, null);
        Intrinsics.checkNotNull(objRunBlocking$default);
        return (List) objRunBlocking$default;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveTheme$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveTheme$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {139}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        final /* synthetic */ Theme $theme;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25841(Theme theme, Continuation<? super C25841> continuation) {
            super(2, continuation);
            this.$theme = theme;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25841(this.$theme, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Settings> continuation) {
            return ((C25841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveTheme$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveTheme$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            final /* synthetic */ Theme $theme;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Theme theme, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$theme = theme;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$theme, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Settings settingsBuild = settings.toBuilder().setTheme(this.$theme).build();
                        Intrinsics.checkNotNullExpressionValue(settingsBuild, "build(...)");
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(this.$theme, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void saveTheme(Theme theme) throws InterruptedException {
        Intrinsics.checkNotNullParameter(theme, "theme");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25841(theme, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$readTheme$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Theme;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$readTheme$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {145}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Theme>, Object> {
        int label;

        C25781(Continuation<? super C25781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Theme> continuation) {
            return ((C25781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.dataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Settings settings = (Settings) objFirst;
            Theme curTheme = settings.getTheme();
            return curTheme == Theme.THEME_UNSPECIFIED ? Theme.THEME_AUTO : curTheme;
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public Theme readTheme() throws InterruptedException {
        Object objRunBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C25781(null), 1, null);
        Intrinsics.checkNotNull(objRunBlocking$default);
        return (Theme) objRunBlocking$default;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveSecret$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/UserData;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveSecret$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {154}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserData>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25821(String str, String str2, Continuation<? super C25821> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$value = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25821(this.$key, this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserData> continuation) {
            return ((C25821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveSecret$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/UserData;", "userData"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveSecret$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<UserData, Continuation<? super UserData>, Object> {
            final /* synthetic */ String $key;
            final /* synthetic */ String $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, String str2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$key = str;
                this.$value = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$value, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UserData userData, Continuation<? super UserData> continuation) {
                return ((AnonymousClass1) create(userData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                UserData userData = (UserData) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        UserData userDataBuild = userData.toBuilder().putSecrets(this.$key, this.$value).build();
                        Intrinsics.checkNotNullExpressionValue(userDataBuild, "build(...)");
                        return userDataBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.userDataDataStore.updateData(new AnonymousClass1(this.$key, this.$value, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void saveSecret(String key, String value) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25821(key, value, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$readSecret$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$readSecret$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {161}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ String $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25761(String str, Continuation<? super C25761> continuation) {
            super(2, continuation);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25761(this.$key, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C25761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.userDataDataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((UserData) objFirst).getSecretsMap().get(this.$key);
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public String readSecret(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) BuildersKt__BuildersKt.runBlocking$default(null, new C25761(key, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSecret$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/UserData;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSecret$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {166}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserData>, Object> {
        final /* synthetic */ String $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25631(String str, Continuation<? super C25631> continuation) {
            super(2, continuation);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25631(this.$key, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserData> continuation) {
            return ((C25631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSecret$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/UserData;", "userData"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSecret$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<UserData, Continuation<? super UserData>, Object> {
            final /* synthetic */ String $key;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$key = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UserData userData, Continuation<? super UserData> continuation) {
                return ((AnonymousClass1) create(userData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                UserData userData = (UserData) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        UserData userDataBuild = userData.toBuilder().removeSecrets(this.$key).build();
                        Intrinsics.checkNotNullExpressionValue(userDataBuild, "build(...)");
                        return userDataBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.userDataDataStore.updateData(new AnonymousClass1(this.$key, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void deleteSecret(String key) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25631(key, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveAccessTokenData$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/UserData;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveAccessTokenData$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {173, 177}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserData>, Object> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ long $expiresAt;
        final /* synthetic */ String $refreshToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25801(String str, String str2, long j, Continuation<? super C25801> continuation) {
            super(2, continuation);
            this.$accessToken = str;
            this.$refreshToken = str2;
            this.$expiresAt = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25801(this.$accessToken, this.$refreshToken, this.$expiresAt, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserData> continuation) {
            return ((C25801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                case 2:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.label = 2;
            Object objUpdateData = DefaultDataStoreRepository.this.userDataDataStore.updateData(new AnonymousClass2(this.$accessToken, this.$refreshToken, this.$expiresAt, null), this);
            if (objUpdateData == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objUpdateData;
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveAccessTokenData$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveAccessTokenData$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Settings settingsBuild = settings.toBuilder().setAccessTokenData(AccessTokenData.getDefaultInstance()).build();
                        Intrinsics.checkNotNullExpressionValue(settingsBuild, "build(...)");
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveAccessTokenData$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/UserData;", "userData"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveAccessTokenData$1$2", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<UserData, Continuation<? super UserData>, Object> {
            final /* synthetic */ String $accessToken;
            final /* synthetic */ long $expiresAt;
            final /* synthetic */ String $refreshToken;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(String str, String str2, long j, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$accessToken = str;
                this.$refreshToken = str2;
                this.$expiresAt = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$accessToken, this.$refreshToken, this.$expiresAt, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UserData userData, Continuation<? super UserData> continuation) {
                return ((AnonymousClass2) create(userData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                UserData userData = (UserData) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        UserData userDataBuild = userData.toBuilder().setAccessTokenData(AccessTokenData.newBuilder().setAccessToken(this.$accessToken).setRefreshToken(this.$refreshToken).setExpiresAtMs(this.$expiresAt).build()).build();
                        Intrinsics.checkNotNullExpressionValue(userDataBuild, "build(...)");
                        return userDataBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void saveAccessTokenData(String accessToken, String refreshToken, long expiresAt) throws InterruptedException {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25801(accessToken, refreshToken, expiresAt, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$clearAccessTokenData$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/UserData;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$clearAccessTokenData$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {194, 195}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserData>, Object> {
        int label;

        C25611(Continuation<? super C25611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserData> continuation) {
            return ((C25611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$clearAccessTokenData$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$clearAccessTokenData$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Settings settingsBuild = settings.toBuilder().clearAccessTokenData().build();
                        Intrinsics.checkNotNullExpressionValue(settingsBuild, "build(...)");
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                case 2:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.label = 2;
            Object objUpdateData = DefaultDataStoreRepository.this.userDataDataStore.updateData(new AnonymousClass2(null), this);
            if (objUpdateData == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objUpdateData;
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$clearAccessTokenData$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/UserData;", "userData"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$clearAccessTokenData$1$2", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<UserData, Continuation<? super UserData>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UserData userData, Continuation<? super UserData> continuation) {
                return ((AnonymousClass2) create(userData, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                UserData userData = (UserData) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        UserData userDataBuild = userData.toBuilder().clearAccessTokenData().build();
                        Intrinsics.checkNotNullExpressionValue(userDataBuild, "build(...)");
                        return userDataBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void clearAccessTokenData() throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new C25611(null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$readAccessTokenData$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/AccessTokenData;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$readAccessTokenData$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {203}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AccessTokenData>, Object> {
        int label;

        C25741(Continuation<? super C25741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AccessTokenData> continuation) {
            return ((C25741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.userDataDataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UserData userData = (UserData) objFirst;
            return userData.getAccessTokenData();
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public AccessTokenData readAccessTokenData() {
        return (AccessTokenData) BuildersKt__BuildersKt.runBlocking$default(null, new C25741(null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveImportedModels$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveImportedModels$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {210}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        final /* synthetic */ List<ImportedModel> $importedModels;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25811(List<ImportedModel> list, Continuation<? super C25811> continuation) {
            super(2, continuation);
            this.$importedModels = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25811(this.$importedModels, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Settings> continuation) {
            return ((C25811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveImportedModels$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$saveImportedModels$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            final /* synthetic */ List<ImportedModel> $importedModels;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<ImportedModel> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$importedModels = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$importedModels, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Settings settingsBuild = settings.toBuilder().clearImportedModel().addAllImportedModel(this.$importedModels).build();
                        Intrinsics.checkNotNullExpressionValue(settingsBuild, "build(...)");
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(this.$importedModels, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void saveImportedModels(List<ImportedModel> importedModels) throws InterruptedException {
        Intrinsics.checkNotNullParameter(importedModels, "importedModels");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25811(importedModels, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$readImportedModels$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, m922d2 = {"<anonymous>", "", "Lcom/google/ai/edge/gallery/proto/ImportedModel;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$readImportedModels$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {218}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<ImportedModel>>, Object> {
        int label;

        C25751(Continuation<? super C25751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<ImportedModel>> continuation) {
            return ((C25751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.dataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Settings settings = (Settings) objFirst;
            return settings.getImportedModelList();
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public List<ImportedModel> readImportedModels() throws InterruptedException {
        Object objRunBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C25751(null), 1, null);
        Intrinsics.checkNotNull(objRunBlocking$default);
        return (List) objRunBlocking$default;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$isTosAccepted$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$isTosAccepted$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {225}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C25731(Continuation<? super C25731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C25731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.dataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Settings settings = (Settings) objFirst;
            return Boxing.boxBoolean(settings.getIsTosAccepted());
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public boolean isTosAccepted() {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new C25731(null), 1, null)).booleanValue();
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$acceptTos$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$acceptTos$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {232}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        int label;

        C25561(Continuation<? super C25561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Settings> continuation) {
            return ((C25561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$acceptTos$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$acceptTos$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Settings settingsBuild = settings.toBuilder().setIsTosAccepted(true).build();
                        Intrinsics.checkNotNullExpressionValue(settingsBuild, "build(...)");
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void acceptTos() throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new C25561(null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$isGemmaTermsOfUseAccepted$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$isGemmaTermsOfUseAccepted$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {238}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C25721(Continuation<? super C25721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C25721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.dataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Settings settings = (Settings) objFirst;
            return Boxing.boxBoolean(settings.getIsGemmaTermsAccepted());
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public boolean isGemmaTermsOfUseAccepted() {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new C25721(null), 1, null)).booleanValue();
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$acceptGemmaTermsOfUse$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$acceptGemmaTermsOfUse$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {245}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        int label;

        C25551(Continuation<? super C25551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Settings> continuation) {
            return ((C25551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$acceptGemmaTermsOfUse$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$acceptGemmaTermsOfUse$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Settings settingsBuild = settings.toBuilder().setIsGemmaTermsAccepted(true).build();
                        Intrinsics.checkNotNullExpressionValue(settingsBuild, "build(...)");
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void acceptGemmaTermsOfUse() throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new C25551(null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$getHasRunTinyGarden$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$getHasRunTinyGarden$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {253}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C25691(Continuation<? super C25691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C25691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.dataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Settings settings = (Settings) objFirst;
            return Boxing.boxBoolean(settings.getHasRunTinyGarden());
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public boolean getHasRunTinyGarden() {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new C25691(null), 1, null)).booleanValue();
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setHasRunTinyGarden$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setHasRunTinyGarden$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {260}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        final /* synthetic */ boolean $hasRun;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25881(boolean z, Continuation<? super C25881> continuation) {
            super(2, continuation);
            this.$hasRun = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25881(this.$hasRun, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Settings> continuation) {
            return ((C25881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setHasRunTinyGarden$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setHasRunTinyGarden$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            final /* synthetic */ boolean $hasRun;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$hasRun = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$hasRun, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Settings settingsBuild = settings.toBuilder().setHasRunTinyGarden(this.$hasRun).build();
                        Intrinsics.checkNotNullExpressionValue(settingsBuild, "build(...)");
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(this.$hasRun, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void setHasRunTinyGarden(boolean hasRun) throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new C25881(hasRun, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addCutout$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/CutoutCollection;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addCutout$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {266}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CutoutCollection>, Object> {
        final /* synthetic */ Cutout $cutout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25581(Cutout cutout, Continuation<? super C25581> continuation) {
            super(2, continuation);
            this.$cutout = cutout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25581(this.$cutout, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CutoutCollection> continuation) {
            return ((C25581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addCutout$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/CutoutCollection;", "cutouts"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addCutout$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CutoutCollection, Continuation<? super CutoutCollection>, Object> {
            final /* synthetic */ Cutout $cutout;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Cutout cutout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$cutout = cutout;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cutout, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CutoutCollection cutoutCollection, Continuation<? super CutoutCollection> continuation) {
                return ((AnonymousClass1) create(cutoutCollection, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                CutoutCollection cutouts = (CutoutCollection) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        CutoutCollection cutoutCollectionBuild = cutouts.toBuilder().addCutout(this.$cutout).build();
                        Intrinsics.checkNotNullExpressionValue(cutoutCollectionBuild, "build(...)");
                        return cutoutCollectionBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.cutoutDataStore.updateData(new AnonymousClass1(this.$cutout, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void addCutout(Cutout cutout) throws InterruptedException {
        Intrinsics.checkNotNullParameter(cutout, "cutout");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25581(cutout, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$getAllCutouts$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, m922d2 = {"<anonymous>", "", "Lcom/google/ai/edge/gallery/proto/Cutout;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$getAllCutouts$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {271}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<Cutout>>, Object> {
        int label;

        C25671(Continuation<? super C25671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Cutout>> continuation) {
            return ((C25671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.cutoutDataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((CutoutCollection) objFirst).getCutoutList();
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public List<Cutout> getAllCutouts() throws InterruptedException {
        Object objRunBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C25671(null), 1, null);
        Intrinsics.checkNotNull(objRunBlocking$default);
        return (List) objRunBlocking$default;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setCutout$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/CutoutCollection;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setCutout$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {276}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CutoutCollection>, Object> {
        final /* synthetic */ Cutout $newCutout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25861(Cutout cutout, Continuation<? super C25861> continuation) {
            super(2, continuation);
            this.$newCutout = cutout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25861(this.$newCutout, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CutoutCollection> continuation) {
            return ((C25861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setCutout$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/CutoutCollection;", "cutouts"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setCutout$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CutoutCollection, Continuation<? super CutoutCollection>, Object> {
            final /* synthetic */ Cutout $newCutout;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Cutout cutout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$newCutout = cutout;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$newCutout, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CutoutCollection cutoutCollection, Continuation<? super CutoutCollection> continuation) {
                return ((AnonymousClass1) create(cutoutCollection, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                CutoutCollection cutouts = (CutoutCollection) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        int index = -1;
                        int i = 0;
                        int cutoutCount = cutouts.getCutoutCount();
                        while (true) {
                            if (i < cutoutCount) {
                                Cutout cutout = cutouts.getCutoutList().get(i);
                                if (!Intrinsics.areEqual(cutout.getId(), this.$newCutout.getId())) {
                                    i++;
                                } else {
                                    index = i;
                                }
                            }
                        }
                        if (index >= 0) {
                            CutoutCollection cutoutCollectionBuild = cutouts.toBuilder().setCutout(index, this.$newCutout).build();
                            Intrinsics.checkNotNull(cutoutCollectionBuild);
                            return cutoutCollectionBuild;
                        }
                        return cutouts;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.cutoutDataStore.updateData(new AnonymousClass1(this.$newCutout, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void setCutout(Cutout newCutout) throws InterruptedException {
        Intrinsics.checkNotNullParameter(newCutout, "newCutout");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25861(newCutout, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setCutouts$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/CutoutCollection;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setCutouts$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {296}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CutoutCollection>, Object> {
        final /* synthetic */ List<Cutout> $cutouts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25871(List<Cutout> list, Continuation<? super C25871> continuation) {
            super(2, continuation);
            this.$cutouts = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25871(this.$cutouts, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CutoutCollection> continuation) {
            return ((C25871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setCutouts$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/CutoutCollection;", "it"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setCutouts$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CutoutCollection, Continuation<? super CutoutCollection>, Object> {
            final /* synthetic */ List<Cutout> $cutouts;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<Cutout> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$cutouts = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$cutouts, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CutoutCollection cutoutCollection, Continuation<? super CutoutCollection> continuation) {
                return ((AnonymousClass1) create(cutoutCollection, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        CutoutCollection cutoutCollectionBuild = CutoutCollection.newBuilder().addAllCutout(this.$cutouts).build();
                        Intrinsics.checkNotNullExpressionValue(cutoutCollectionBuild, "build(...)");
                        return cutoutCollectionBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.cutoutDataStore.updateData(new AnonymousClass1(this.$cutouts, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void setCutouts(List<Cutout> cutouts) throws InterruptedException {
        Intrinsics.checkNotNullParameter(cutouts, "cutouts");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25871(cutouts, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setHasSeenBenchmarkComparisonHelp$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setHasSeenBenchmarkComparisonHelp$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {302}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        final /* synthetic */ boolean $seen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25891(boolean z, Continuation<? super C25891> continuation) {
            super(2, continuation);
            this.$seen = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25891(this.$seen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Settings> continuation) {
            return ((C25891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setHasSeenBenchmarkComparisonHelp$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setHasSeenBenchmarkComparisonHelp$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            final /* synthetic */ boolean $seen;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$seen = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$seen, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Settings settingsBuild = settings.toBuilder().setHasSeenBenchmarkComparisonHelp(this.$seen).build();
                        Intrinsics.checkNotNullExpressionValue(settingsBuild, "build(...)");
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(this.$seen, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void setHasSeenBenchmarkComparisonHelp(boolean seen) throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new C25891(seen, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$getHasSeenBenchmarkComparisonHelp$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$getHasSeenBenchmarkComparisonHelp$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {310}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C25701(Continuation<? super C25701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25701(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C25701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.dataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Settings settings = (Settings) objFirst;
            return Boxing.boxBoolean(settings.getHasSeenBenchmarkComparisonHelp());
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public boolean getHasSeenBenchmarkComparisonHelp() {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new C25701(null), 1, null)).booleanValue();
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addBenchmarkResult$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addBenchmarkResult$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {317}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BenchmarkResults>, Object> {
        final /* synthetic */ BenchmarkResult $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25571(BenchmarkResult benchmarkResult, Continuation<? super C25571> continuation) {
            super(2, continuation);
            this.$result = benchmarkResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25571(this.$result, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BenchmarkResults> continuation) {
            return ((C25571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addBenchmarkResult$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;", "results"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addBenchmarkResult$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<BenchmarkResults, Continuation<? super BenchmarkResults>, Object> {
            final /* synthetic */ BenchmarkResult $result;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BenchmarkResult benchmarkResult, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$result = benchmarkResult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BenchmarkResults benchmarkResults, Continuation<? super BenchmarkResults> continuation) {
                return ((AnonymousClass1) create(benchmarkResults, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                BenchmarkResults results = (BenchmarkResults) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        BenchmarkResults benchmarkResultsBuild = results.toBuilder().addResult(0, this.$result).build();
                        Intrinsics.checkNotNullExpressionValue(benchmarkResultsBuild, "build(...)");
                        return benchmarkResultsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.benchmarkResultsDataStore.updateData(new AnonymousClass1(this.$result, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void addBenchmarkResult(BenchmarkResult result) throws InterruptedException {
        Intrinsics.checkNotNullParameter(result, "result");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25571(result, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$getAllBenchmarkResults$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, m922d2 = {"<anonymous>", "", "Lcom/google/ai/edge/gallery/proto/BenchmarkResult;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$getAllBenchmarkResults$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {324}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<BenchmarkResult>>, Object> {
        int label;

        C25661(Continuation<? super C25661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<BenchmarkResult>> continuation) {
            return ((C25661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.benchmarkResultsDataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((BenchmarkResults) objFirst).getResultList();
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public List<BenchmarkResult> getAllBenchmarkResults() throws InterruptedException {
        Object objRunBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C25661(null), 1, null);
        Intrinsics.checkNotNull(objRunBlocking$default);
        return (List) objRunBlocking$default;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteBenchmarkResult$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteBenchmarkResult$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {329}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BenchmarkResults>, Object> {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25621(int i, Continuation<? super C25621> continuation) {
            super(2, continuation);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25621(this.$index, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BenchmarkResults> continuation) {
            return ((C25621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteBenchmarkResult$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;", "results"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteBenchmarkResult$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<BenchmarkResults, Continuation<? super BenchmarkResults>, Object> {
            final /* synthetic */ int $index;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(int i, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$index = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$index, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BenchmarkResults benchmarkResults, Continuation<? super BenchmarkResults> continuation) {
                return ((AnonymousClass1) create(benchmarkResults, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                BenchmarkResults results = (BenchmarkResults) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        BenchmarkResults newResults = results.toBuilder().removeResult(this.$index).build();
                        Intrinsics.checkNotNull(newResults);
                        return newResults;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.benchmarkResultsDataStore.updateData(new AnonymousClass1(this.$index, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void deleteBenchmarkResult(int index) throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new C25621(index, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addSkill$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addSkill$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {338}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Skills>, Object> {
        final /* synthetic */ Skill $skill;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25591(Skill skill, Continuation<? super C25591> continuation) {
            super(2, continuation);
            this.$skill = skill;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25591(this.$skill, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Skills> continuation) {
            return ((C25591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addSkill$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "skills"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addSkill$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Skills, Continuation<? super Skills>, Object> {
            final /* synthetic */ Skill $skill;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Skill skill, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$skill = skill;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$skill, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Skills skills, Continuation<? super Skills> continuation) {
                return ((AnonymousClass1) create(skills, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Skills skills = (Skills) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Skill skill = this.$skill;
                        List $this$invokeSuspend_u24lambda_u240 = CollectionsKt.createListBuilder();
                        $this$invokeSuspend_u24lambda_u240.add(skill);
                        List<Skill> skillList = skills.getSkillList();
                        Intrinsics.checkNotNullExpressionValue(skillList, "getSkillList(...)");
                        $this$invokeSuspend_u24lambda_u240.addAll(skillList);
                        List newSkills = CollectionsKt.build($this$invokeSuspend_u24lambda_u240);
                        Skills skillsBuild = skills.toBuilder().clearSkill().addAllSkill(newSkills).build();
                        Intrinsics.checkNotNullExpressionValue(skillsBuild, "build(...)");
                        return skillsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.skillsDataStore.updateData(new AnonymousClass1(this.$skill, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void addSkill(Skill skill) throws InterruptedException {
        Intrinsics.checkNotNullParameter(skill, "skill");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25591(skill, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setSkills$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setSkills$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {350}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Skills>, Object> {
        final /* synthetic */ List<Skill> $skills;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25911(List<Skill> list, Continuation<? super C25911> continuation) {
            super(2, continuation);
            this.$skills = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25911(this.$skills, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Skills> continuation) {
            return ((C25911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setSkills$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "curSkills"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setSkills$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Skills, Continuation<? super Skills>, Object> {
            final /* synthetic */ List<Skill> $skills;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(List<Skill> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$skills = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$skills, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Skills skills, Continuation<? super Skills> continuation) {
                return ((AnonymousClass1) create(skills, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Skills curSkills = (Skills) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Skills skillsBuild = curSkills.toBuilder().clearSkill().addAllSkill(this.$skills).build();
                        Intrinsics.checkNotNullExpressionValue(skillsBuild, "build(...)");
                        return skillsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.skillsDataStore.updateData(new AnonymousClass1(this.$skills, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void setSkills(List<Skill> skills) throws InterruptedException {
        Intrinsics.checkNotNullParameter(skills, "skills");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25911(skills, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setSkillSelected$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setSkillSelected$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {358}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Skills>, Object> {
        final /* synthetic */ boolean $selected;
        final /* synthetic */ Skill $skill;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25901(Skill skill, boolean z, Continuation<? super C25901> continuation) {
            super(2, continuation);
            this.$skill = skill;
            this.$selected = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25901(this.$skill, this.$selected, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Skills> continuation) {
            return ((C25901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setSkillSelected$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "skills"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setSkillSelected$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Skills, Continuation<? super Skills>, Object> {
            final /* synthetic */ boolean $selected;
            final /* synthetic */ Skill $skill;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Skill skill, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$skill = skill;
                this.$selected = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$skill, this.$selected, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Skills skills, Continuation<? super Skills> continuation) {
                return ((AnonymousClass1) create(skills, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Skills skills = (Skills) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        List newSkills = new ArrayList();
                        for (Skill curSkill : skills.getSkillList()) {
                            if (Intrinsics.areEqual(curSkill.getName(), this.$skill.getName())) {
                                Skill skillBuild = curSkill.toBuilder().setSelected(this.$selected).build();
                                Intrinsics.checkNotNullExpressionValue(skillBuild, "build(...)");
                                newSkills.add(skillBuild);
                            } else {
                                Intrinsics.checkNotNull(curSkill);
                                newSkills.add(curSkill);
                            }
                        }
                        Skills skillsBuild = Skills.newBuilder().addAllSkill(newSkills).build();
                        Intrinsics.checkNotNullExpressionValue(skillsBuild, "build(...)");
                        return skillsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.skillsDataStore.updateData(new AnonymousClass1(this.$skill, this.$selected, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void setSkillSelected(Skill skill, boolean selected) throws InterruptedException {
        Intrinsics.checkNotNullParameter(skill, "skill");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25901(skill, selected, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setAllSkillsSelected$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setAllSkillsSelected$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {374}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Skills>, Object> {
        final /* synthetic */ boolean $selected;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25851(boolean z, Continuation<? super C25851> continuation) {
            super(2, continuation);
            this.$selected = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25851(this.$selected, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Skills> continuation) {
            return ((C25851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setAllSkillsSelected$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "skills"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$setAllSkillsSelected$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Skills, Continuation<? super Skills>, Object> {
            final /* synthetic */ boolean $selected;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$selected = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$selected, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Skills skills, Continuation<? super Skills> continuation) {
                return ((AnonymousClass1) create(skills, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Skills skills = (Skills) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        List newSkills = new ArrayList();
                        for (Skill curSkill : skills.getSkillList()) {
                            Skill skillBuild = curSkill.toBuilder().setSelected(this.$selected).build();
                            Intrinsics.checkNotNullExpressionValue(skillBuild, "build(...)");
                            newSkills.add(skillBuild);
                        }
                        Skills skillsBuild = Skills.newBuilder().addAllSkill(newSkills).build();
                        Intrinsics.checkNotNullExpressionValue(skillsBuild, "build(...)");
                        return skillsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.skillsDataStore.updateData(new AnonymousClass1(this.$selected, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void setAllSkillsSelected(boolean selected) throws InterruptedException {
        BuildersKt__BuildersKt.runBlocking$default(null, new C25851(selected, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$getAllSkills$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, m922d2 = {"<anonymous>", "", "Lcom/google/ai/edge/gallery/proto/Skill;", "kotlin.jvm.PlatformType", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$getAllSkills$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {385}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<Skill>>, Object> {
        int label;

        C25681(Continuation<? super C25681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25681(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Skill>> continuation) {
            return ((C25681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.skillsDataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((Skills) objFirst).getSkillList();
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public List<Skill> getAllSkills() throws InterruptedException {
        Object objRunBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C25681(null), 1, null);
        Intrinsics.checkNotNull(objRunBlocking$default);
        return (List) objRunBlocking$default;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSkill$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSkill$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {390}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Skills>, Object> {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25641(String str, Continuation<? super C25641> continuation) {
            super(2, continuation);
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25641(this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Skills> continuation) {
            return ((C25641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSkill$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "skills"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSkill$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Skills, Continuation<? super Skills>, Object> {
            final /* synthetic */ String $name;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$name = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$name, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Skills skills, Continuation<? super Skills> continuation) {
                return ((AnonymousClass1) create(skills, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Skills skills = (Skills) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        List newSkills = new ArrayList();
                        for (Skill skill : skills.getSkillList()) {
                            if (!Intrinsics.areEqual(skill.getName(), this.$name)) {
                                Intrinsics.checkNotNull(skill);
                                newSkills.add(skill);
                            }
                        }
                        Skills skillsBuild = Skills.newBuilder().addAllSkill(newSkills).build();
                        Intrinsics.checkNotNullExpressionValue(skillsBuild, "build(...)");
                        return skillsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.skillsDataStore.updateData(new AnonymousClass1(this.$name, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void deleteSkill(String name) throws InterruptedException {
        Intrinsics.checkNotNullParameter(name, "name");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25641(name, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSkills$2 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Skills;", "skills"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$deleteSkills$2", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25652 extends SuspendLambda implements Function2<Skills, Continuation<? super Skills>, Object> {
        final /* synthetic */ Set<String> $names;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25652(Set<String> set, Continuation<? super C25652> continuation) {
            super(2, continuation);
            this.$names = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25652 c25652 = new C25652(this.$names, continuation);
            c25652.L$0 = obj;
            return c25652;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Skills skills, Continuation<? super Skills> continuation) {
            return ((C25652) create(skills, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Skills skills = (Skills) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterable skillList = skills.getSkillList();
                    Intrinsics.checkNotNullExpressionValue(skillList, "getSkillList(...)");
                    Iterable $this$filter$iv = skillList;
                    Set<String> set = this.$names;
                    Collection destination$iv$iv = new ArrayList();
                    for (Object element$iv$iv : $this$filter$iv) {
                        Skill it = (Skill) element$iv$iv;
                        if (!set.contains(it.getName())) {
                            destination$iv$iv.add(element$iv$iv);
                        }
                    }
                    List newSkills = (List) destination$iv$iv;
                    Skills skillsBuild = skills.toBuilder().clearSkill().addAllSkill(newSkills).build();
                    Intrinsics.checkNotNullExpressionValue(skillsBuild, "build(...)");
                    return skillsBuild;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public Object deleteSkills(Set<String> set, Continuation<? super Unit> continuation) {
        Object objUpdateData = this.skillsDataStore.updateData(new C25652(set, null), continuation);
        return objUpdateData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateData : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addViewedPromoId$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addViewedPromoId$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {411}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        final /* synthetic */ String $promoId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25601(String str, Continuation<? super C25601> continuation) {
            super(2, continuation);
            this.$promoId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25601(this.$promoId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Settings> continuation) {
            return ((C25601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addViewedPromoId$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$addViewedPromoId$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            final /* synthetic */ String $promoId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$promoId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$promoId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        if (settings.getViewedPromoIdList().contains(this.$promoId)) {
                            return settings;
                        }
                        Settings settingsBuild = settings.toBuilder().addViewedPromoId(this.$promoId).build();
                        Intrinsics.checkNotNull(settingsBuild);
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(this.$promoId, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void addViewedPromoId(String promoId) throws InterruptedException {
        Intrinsics.checkNotNullParameter(promoId, "promoId");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25601(promoId, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$removeViewedPromoId$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$removeViewedPromoId$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {423}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Settings>, Object> {
        final /* synthetic */ String $promoId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25791(String str, Continuation<? super C25791> continuation) {
            super(2, continuation);
            this.$promoId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25791(this.$promoId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Settings> continuation) {
            return ((C25791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$removeViewedPromoId$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: DataStoreRepository.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "Lcom/google/ai/edge/gallery/proto/Settings;", "settings"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$removeViewedPromoId$1$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Settings, Continuation<? super Settings>, Object> {
            final /* synthetic */ String $promoId;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$promoId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$promoId, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Settings settings, Continuation<? super Settings> continuation) {
                return ((AnonymousClass1) create(settings, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Settings settings = (Settings) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Iterable viewedPromoIdList = settings.getViewedPromoIdList();
                        Intrinsics.checkNotNullExpressionValue(viewedPromoIdList, "getViewedPromoIdList(...)");
                        Iterable $this$filter$iv = viewedPromoIdList;
                        String str = this.$promoId;
                        Collection destination$iv$iv = new ArrayList();
                        for (Object element$iv$iv : $this$filter$iv) {
                            String it = (String) element$iv$iv;
                            if (!Intrinsics.areEqual(it, str)) {
                                destination$iv$iv.add(element$iv$iv);
                            }
                        }
                        List newList = (List) destination$iv$iv;
                        Settings settingsBuild = settings.toBuilder().clearViewedPromoId().addAllViewedPromoId(newList).build();
                        Intrinsics.checkNotNullExpressionValue(settingsBuild, "build(...)");
                        return settingsBuild;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objUpdateData = DefaultDataStoreRepository.this.dataStore.updateData(new AnonymousClass1(this.$promoId, null), this);
                    if (objUpdateData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objUpdateData;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public void removeViewedPromoId(String promoId) throws InterruptedException {
        Intrinsics.checkNotNullParameter(promoId, "promoId");
        BuildersKt__BuildersKt.runBlocking$default(null, new C25791(promoId, null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.data.DefaultDataStoreRepository$hasViewedPromo$1 */
    /* JADX INFO: compiled from: DataStoreRepository.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.data.DefaultDataStoreRepository$hasViewedPromo$1", m932f = "DataStoreRepository.kt", m933i = {}, m934l = {432}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $promoId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25711(String str, Continuation<? super C25711> continuation) {
            super(2, continuation);
            this.$promoId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultDataStoreRepository.this.new C25711(this.$promoId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C25711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objFirst = FlowKt.first(DefaultDataStoreRepository.this.dataStore.getData(), this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objFirst = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Settings settings = (Settings) objFirst;
            return Boxing.boxBoolean(settings.getViewedPromoIdList().contains(this.$promoId));
        }
    }

    @Override // com.google.ai.edge.gallery.data.DataStoreRepository
    public boolean hasViewedPromo(String promoId) {
        Intrinsics.checkNotNullParameter(promoId, "promoId");
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new C25711(promoId, null), 1, null)).booleanValue();
    }
}
