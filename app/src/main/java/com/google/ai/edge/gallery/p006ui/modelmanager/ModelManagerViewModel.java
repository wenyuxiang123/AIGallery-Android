package com.google.ai.edge.gallery.p006ui.modelmanager;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import com.google.ai.edge.gallery.AppLifecycleProvider;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.common.ProjectConfig;
import com.google.ai.edge.gallery.common.UtilsKt;
import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import com.google.ai.edge.gallery.data.Accelerator;
import com.google.ai.edge.gallery.data.BuiltInTaskId;
import com.google.ai.edge.gallery.data.Category;
import com.google.ai.edge.gallery.data.CategoryInfo;
import com.google.ai.edge.gallery.data.Config;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.ConfigKt;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.data.DeviceRequirements;
import com.google.ai.edge.gallery.data.DownloadRepository;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelAllowlist;
import com.google.ai.edge.gallery.data.ModelCapability;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.ModelFile;
import com.google.ai.edge.gallery.data.ModelKt;
import com.google.ai.edge.gallery.data.NamedDeviceGroup;
import com.google.ai.edge.gallery.data.RuntimeType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.proto.ImportedModel;
import com.google.ai.edge.gallery.proto.Theme;
import com.google.ai.edge.gallery.runtime.aicore.AICoreModelHelper;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.File;
import java.io.FilenameFilter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p009io.FilesKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import net.openid.appauth.AuthorizationException;
import net.openid.appauth.AuthorizationRequest;
import net.openid.appauth.AuthorizationResponse;
import net.openid.appauth.AuthorizationService;
import net.openid.appauth.ResponseTypeValues;
import net.openid.appauth.TokenResponse;

/* JADX INFO: compiled from: ModelManagerViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B>\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\t\u0012\b\b\u0001\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010.\u001a\u00020/H\u0014J\u0010\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020)J\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002010!2\f\u00104\u001a\b\u0012\u0004\u0012\u00020)0\tJ\u0010\u00105\u001a\u0004\u0018\u00010\n2\u0006\u00102\u001a\u00020)J\f\u00106\u001a\b\u0012\u0004\u0012\u00020\n0!J\b\u00107\u001a\u0004\u0018\u00010\u001fJ\u0010\u00108\u001a\u0004\u0018\u00010\u001f2\u0006\u00109\u001a\u00020)J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001f0!J\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001f0!J\u0006\u0010<\u001a\u00020/J\u0006\u0010=\u001a\u00020/J\u000e\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020\u001fJ\u001a\u0010@\u001a\u00020/2\b\u0010A\u001a\u0004\u0018\u0001012\u0006\u0010?\u001a\u00020\u001fH\u0016J\u000e\u0010B\u001a\u00020/2\u0006\u0010?\u001a\u00020\u001fJ\u000e\u0010C\u001a\u00020/2\u0006\u0010?\u001a\u00020\u001fJ8\u0010D\u001a\u00020/2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010A\u001a\u0002012\u0006\u0010?\u001a\u00020\u001f2\b\b\u0002\u0010E\u001a\u00020F2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020/0HJ:\u0010I\u001a\u00020/2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010A\u001a\u0002012\u0006\u0010?\u001a\u00020\u001f2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020/0HJ\u0016\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020OJ\u0016\u0010P\u001a\u00020/2\u0006\u0010?\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020QJ\u000e\u0010R\u001a\u00020/2\u0006\u0010S\u001a\u00020)J\u000e\u0010T\u001a\u00020/2\u0006\u0010S\u001a\u00020)J\u000e\u0010U\u001a\u00020/2\u0006\u0010S\u001a\u00020)J\u0006\u0010V\u001a\u00020/J\u0006\u0010W\u001a\u00020XJ\u000e\u0010Y\u001a\u00020/2\u0006\u0010Z\u001a\u00020XJ\u001a\u0010[\u001a\u00020\\2\u0006\u0010?\u001a\u00020\u001f2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010)J\u000e\u0010^\u001a\u00020/2\u0006\u0010_\u001a\u00020`J\u0006\u0010a\u001a\u00020bJ\u0006\u0010c\u001a\u00020dJ\"\u0010e\u001a\u00020/2\u0006\u0010f\u001a\u00020g2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020/0iJ\u001e\u0010k\u001a\u00020/2\u0006\u0010]\u001a\u00020)2\u0006\u0010l\u001a\u00020)2\u0006\u0010m\u001a\u00020nJ\u0006\u0010o\u001a\u00020/J\b\u0010p\u001a\u00020/H\u0002J\b\u0010q\u001a\u00020/H\u0002J\u0006\u0010r\u001a\u00020/J\u0006\u0010s\u001a\u00020/J\u000e\u0010t\u001a\u00020/2\u0006\u0010u\u001a\u00020FJ\u0010\u0010v\u001a\u00020/2\u0006\u0010w\u001a\u00020)H\u0002J\u0014\u0010x\u001a\u0004\u0018\u00010y2\b\b\u0002\u0010z\u001a\u00020)H\u0002J\u0010\u0010{\u001a\u00020F2\u0006\u0010?\u001a\u00020\u001fH\u0002J\b\u0010|\u001a\u00020\u0016H\u0002J\b\u0010}\u001a\u00020\u0016H\u0002J\u0010\u0010~\u001a\u00020\u001f2\u0006\u0010_\u001a\u00020`H\u0002J\u001b\u0010\u007f\u001a\u0015\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u0002010!0\u0080\u0001H\u0002J\u001b\u0010\u0081\u0001\u001a\u00020)2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J\u0011\u0010\u0084\u0001\u001a\u00020O2\u0006\u0010?\u001a\u00020\u001fH\u0002J\u0011\u0010\u0085\u0001\u001a\u00020F2\u0006\u0010z\u001a\u00020)H\u0002J\u0011\u0010\u0086\u0001\u001a\u00020F2\u0006\u0010z\u001a\u00020)H\u0002J\u0011\u0010\u0087\u0001\u001a\u00020/2\u0006\u0010z\u001a\u00020)H\u0002J\u0011\u0010\u0088\u0001\u001a\u00020/2\u0006\u0010z\u001a\u00020)H\u0002J\u0012\u0010\u0089\u0001\u001a\u00020/2\u0007\u0010\u008a\u0001\u001a\u00020)H\u0002J%\u0010\u008b\u0001\u001a\u00020/2\u0006\u0010?\u001a\u00020\u001f2\u0007\u0010N\u001a\u00030\u008c\u00012\t\b\u0002\u0010\u008d\u0001\u001a\u00020)H\u0002J\u0011\u0010\u008e\u0001\u001a\u00020F2\u0006\u0010?\u001a\u00020\u001fH\u0007J$\u0010\u008f\u0001\u001a\u00020F2\u0006\u0010?\u001a\u00020\u001f2\u0007\u0010\u0090\u0001\u001a\u00020)2\b\b\u0002\u0010z\u001a\u00020)H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006\u0091\u0001²\u0006\u000b\u0010\u0092\u0001\u001a\u00020FX\u008a\u0084\u0002"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "Landroidx/lifecycle/ViewModel;", "downloadRepository", "Lcom/google/ai/edge/gallery/data/DownloadRepository;", "dataStoreRepository", "Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "lifecycleProvider", "Lcom/google/ai/edge/gallery/AppLifecycleProvider;", "customTasks", "", "Lcom/google/ai/edge/gallery/customtasks/common/CustomTask;", "Lkotlin/jvm/JvmSuppressWildcards;", "context", "Landroid/content/Context;", "<init>", "(Lcom/google/ai/edge/gallery/data/DownloadRepository;Lcom/google/ai/edge/gallery/data/DataStoreRepository;Lcom/google/ai/edge/gallery/AppLifecycleProvider;Ljava/util/Set;Landroid/content/Context;)V", "getDataStoreRepository", "()Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "externalFilesDir", "Ljava/io/File;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_allowlistModels", "", "Lcom/google/ai/edge/gallery/data/Model;", "allowlistModels", "", "getAllowlistModels", "()Ljava/util/List;", "authService", "Lnet/openid/appauth/AuthorizationService;", "getAuthService", "()Lnet/openid/appauth/AuthorizationService;", "curAccessToken", "", "getCurAccessToken", "()Ljava/lang/String;", "setCurAccessToken", "(Ljava/lang/String;)V", "onCleared", "", "getTaskById", "Lcom/google/ai/edge/gallery/data/Task;", "id", "getTasksByIds", "ids", "getCustomTaskByTaskId", "getActiveCustomTasks", "getSelectedModel", "getModelByName", "name", "getAllModels", "getAllDownloadedModels", "processTasks", "updateConfigValuesUpdateTrigger", "selectModel", "model", "downloadModel", "task", "cancelDownloadModel", "deleteModel", "initializeModel", "force", "", "onDone", "Lkotlin/Function0;", "cleanupModel", "instanceToCleanUp", "", "setDownloadStatus", "curModel", NotificationCompat.CATEGORY_STATUS, "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;", "setInitializationStatus", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatus;", "addTextInputHistory", "text", "promoteTextInputHistoryItem", "deleteTextInputHistory", "clearTextInputHistory", "readThemeOverride", "Lcom/google/ai/edge/gallery/proto/Theme;", "saveThemeOverride", "theme", "getModelUrlResponse", "", "accessToken", "addImportedLlmModel", "info", "Lcom/google/ai/edge/gallery/proto/ImportedModel;", "getTokenStatusAndData", "Lcom/google/ai/edge/gallery/ui/modelmanager/TokenStatusAndData;", "getAuthorizationRequest", "Lnet/openid/appauth/AuthorizationRequest;", "handleAuthResult", "result", "Landroidx/activity/result/ActivityResult;", "onTokenRequested", "Lkotlin/Function1;", "Lcom/google/ai/edge/gallery/ui/modelmanager/TokenRequestResult;", "saveAccessToken", "refreshToken", "expiresAt", "", "clearAccessToken", "checkAICoreModelStatuses", "processPendingDownloads", "loadModelAllowlist", "clearLoadModelAllowlistError", "setAppInForeground", "foreground", "saveModelAllowlistToDisk", "modelAllowlistContent", "readModelAllowlistFromDisk", "Lcom/google/ai/edge/gallery/data/ModelAllowlist;", "fileName", "isModelPartiallyDownloaded", "createEmptyUiState", "createUiState", "createModelFromImportedModelInfo", "groupTasksByCategory", "", "getCategoryLabel", "category", "Lcom/google/ai/edge/gallery/data/CategoryInfo;", "getModelDownloadStatus", "isFileInExternalFilesDir", "isFileInDataLocalTmpDir", "deleteFileFromExternalFilesDir", "deleteFilesFromImportDir", "deleteDirFromExternalFilesDir", "dir", "updateModelInitializationStatus", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelInitializationStatusType;", "error", "isModelDownloaded", "checkIfModelDownloaded", "version", "app_debug", "isAICoreAvailable"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public class ModelManagerViewModel extends ViewModel {
    public static final int $stable = 8;
    private List<Model> _allowlistModels;
    private final MutableStateFlow<ModelManagerUiState> _uiState;
    private final AuthorizationService authService;
    private final Context context;
    private String curAccessToken;
    private final Set<CustomTask> customTasks;
    private final DataStoreRepository dataStoreRepository;
    private final DownloadRepository downloadRepository;
    private final File externalFilesDir;
    private final AppLifecycleProvider lifecycleProvider;
    private final StateFlow<ModelManagerUiState> uiState;

    public final DataStoreRepository getDataStoreRepository() {
        return this.dataStoreRepository;
    }

    @Inject
    public ModelManagerViewModel(DownloadRepository downloadRepository, DataStoreRepository dataStoreRepository, AppLifecycleProvider lifecycleProvider, Set<CustomTask> customTasks, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(downloadRepository, "downloadRepository");
        Intrinsics.checkNotNullParameter(dataStoreRepository, "dataStoreRepository");
        Intrinsics.checkNotNullParameter(lifecycleProvider, "lifecycleProvider");
        Intrinsics.checkNotNullParameter(customTasks, "customTasks");
        Intrinsics.checkNotNullParameter(context, "context");
        this.downloadRepository = downloadRepository;
        this.dataStoreRepository = dataStoreRepository;
        this.lifecycleProvider = lifecycleProvider;
        this.customTasks = customTasks;
        this.context = context;
        this.externalFilesDir = this.context.getExternalFilesDir(null);
        this._uiState = StateFlowKt.MutableStateFlow(createEmptyUiState());
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._allowlistModels = new ArrayList();
        this.authService = new AuthorizationService(this.context);
        this.curAccessToken = "";
    }

    protected final MutableStateFlow<ModelManagerUiState> get_uiState() {
        return this._uiState;
    }

    public StateFlow<ModelManagerUiState> getUiState() {
        return this.uiState;
    }

    public final List<Model> getAllowlistModels() {
        return this._allowlistModels;
    }

    public final AuthorizationService getAuthService() {
        return this.authService;
    }

    public final String getCurAccessToken() {
        return this.curAccessToken;
    }

    public final void setCurAccessToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.curAccessToken = str;
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        this.authService.dispose();
    }

    public final Task getTaskById(String id) {
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = getUiState().getValue().getTasks().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Task it2 = (Task) next;
            if (Intrinsics.areEqual(it2.getId(), id)) {
                break;
            }
        }
        return (Task) next;
    }

    public final List<Task> getTasksByIds(Set<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Iterable $this$filter$iv = getUiState().getValue().getTasks();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Task it = (Task) element$iv$iv;
            if (ids.contains(it.getId())) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return (List) destination$iv$iv;
    }

    public final CustomTask getCustomTaskByTaskId(String id) {
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = getActiveCustomTasks().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CustomTask it2 = (CustomTask) next;
            if (Intrinsics.areEqual(it2.getTask().getId(), id)) {
                break;
            }
        }
        return (CustomTask) next;
    }

    public final List<CustomTask> getActiveCustomTasks() {
        return CollectionsKt.toList(this.customTasks);
    }

    public final Model getSelectedModel() {
        return getUiState().getValue().getSelectedModel();
    }

    public final Model getModelByName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        for (Task task : getUiState().getValue().getTasks()) {
            for (Model model : task.getModels()) {
                if (Intrinsics.areEqual(model.getName(), name)) {
                    return model;
                }
            }
        }
        return null;
    }

    public final List<Model> getAllModels() {
        Set allModels = new LinkedHashSet();
        for (Task task : getUiState().getValue().getTasks()) {
            for (Model model : task.getModels()) {
                allModels.add(model);
            }
        }
        Iterable $this$sortedBy$iv = CollectionsKt.toList(allModels);
        return CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$getAllModels$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Model it = (Model) t;
                String displayName = it.getDisplayName();
                if (displayName.length() == 0) {
                    displayName = it.getName();
                }
                String str = displayName;
                Model it2 = (Model) t2;
                String displayName2 = it2.getDisplayName();
                if (displayName2.length() == 0) {
                    displayName2 = it2.getName();
                }
                return ComparisonsKt.compareValues(str, displayName2);
            }
        });
    }

    public final List<Model> getAllDownloadedModels() {
        Iterable $this$filter$iv = getAllModels();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Model it = (Model) element$iv$iv;
            ModelDownloadStatus modelDownloadStatus = getUiState().getValue().getModelDownloadStatus().get(it.getName());
            if ((modelDownloadStatus != null ? modelDownloadStatus.getStatus() : null) == ModelDownloadStatusType.SUCCEEDED && it.isLlm()) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return (List) destination$iv$iv;
    }

    public final void processTasks() {
        Object next;
        Iterable $this$map$iv = getActiveCustomTasks();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            CustomTask it = (CustomTask) item$iv$iv;
            destination$iv$iv.add(it.getTask());
        }
        List<Task> curTasks = (List) destination$iv$iv;
        for (Task task : curTasks) {
            for (Model model : task.getModels()) {
                model.preProcess();
            }
            Iterator<T> it2 = task.getModels().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Model it3 = (Model) next;
                if (it3.getBestForTaskIds().contains(task.getId())) {
                    break;
                }
            }
            Model bestModel = (Model) next;
            if (bestModel != null) {
                task.getModels().remove(bestModel);
                task.getModels().add(0, bestModel);
            }
        }
    }

    public final void updateConfigValuesUpdateTrigger() {
        ModelManagerUiState value;
        ModelManagerUiState it;
        MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            ModelManagerUiState value2 = this._uiState.getValue();
            it = value2.copy((991 & 1) != 0 ? value2.tasks : null, (991 & 2) != 0 ? value2.tasksByCategory : null, (991 & 4) != 0 ? value2.modelDownloadStatus : null, (991 & 8) != 0 ? value2.modelInitializationStatus : null, (991 & 16) != 0 ? value2.loadingModelAllowlist : false, (991 & 32) != 0 ? value2.loadingModelAllowlistError : null, (991 & 64) != 0 ? value2.selectedModel : null, (991 & 128) != 0 ? value2.textInputHistory : null, (991 & 256) != 0 ? value2.configValuesUpdateTrigger : System.currentTimeMillis(), (991 & 512) != 0 ? value2.modelImportingUpdateTrigger : 0L);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void selectModel(Model model) {
        ModelManagerUiState value;
        ModelManagerUiState value2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!Intrinsics.areEqual(this._uiState.getValue().getSelectedModel().getName(), model.getName())) {
            MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
            do {
                value = mutableStateFlow.getValue();
                value2 = this._uiState.getValue();
            } while (!mutableStateFlow.compareAndSet(value, value2.copy((991 & 1) != 0 ? value2.tasks : null, (991 & 2) != 0 ? value2.tasksByCategory : null, (991 & 4) != 0 ? value2.modelDownloadStatus : null, (991 & 8) != 0 ? value2.modelInitializationStatus : null, (991 & 16) != 0 ? value2.loadingModelAllowlist : false, (991 & 32) != 0 ? value2.loadingModelAllowlistError : null, (991 & 64) != 0 ? value2.selectedModel : model, (991 & 128) != 0 ? value2.textInputHistory : null, (991 & 256) != 0 ? value2.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value2.modelImportingUpdateTrigger : 0L)));
        }
    }

    public void downloadModel(Task task, final Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        setDownloadStatus(model, new ModelDownloadStatus(ModelDownloadStatusType.IN_PROGRESS, 0L, 0L, null, 0L, 0L, 62, null));
        if (model.getRuntimeType() == RuntimeType.AICORE) {
            AICoreModelHelper.INSTANCE.downloadModel(this.context, ViewModelKt.getViewModelScope(this), model, new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModelManagerViewModel.downloadModel$lambda$10(this.f$0, model, ((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }, new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModelManagerViewModel.downloadModel$lambda$11(this.f$0, model);
                }
            }, new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ModelManagerViewModel.downloadModel$lambda$12(this.f$0, model, (String) obj);
                }
            });
        } else {
            deleteModel(model);
            this.downloadRepository.downloadModel(task, model, new C28154(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadModel$lambda$10(ModelManagerViewModel this$0, Model $model, long downloaded, long total) {
        this$0.setDownloadStatus($model, new ModelDownloadStatus(ModelDownloadStatusType.IN_PROGRESS, total, downloaded, null, 0L, 0L, 56, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadModel$lambda$11(ModelManagerViewModel this$0, Model $model) {
        this$0.setDownloadStatus($model, new ModelDownloadStatus(ModelDownloadStatusType.SUCCEEDED, $model.getSizeInBytes(), $model.getSizeInBytes(), null, 0L, 0L, 56, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadModel$lambda$12(ModelManagerViewModel this$0, Model $model, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this$0.setDownloadStatus($model, new ModelDownloadStatus(ModelDownloadStatusType.FAILED, 0L, 0L, error, 0L, 0L, 54, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$downloadModel$4 */
    /* JADX INFO: compiled from: ModelManagerViewModel.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    static final /* synthetic */ class C28154 extends FunctionReferenceImpl implements Function2<Model, ModelDownloadStatus, Unit> {
        C28154(Object obj) {
            super(2, obj, ModelManagerViewModel.class, "setDownloadStatus", "setDownloadStatus(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Model model, ModelDownloadStatus modelDownloadStatus) {
            invoke2(model, modelDownloadStatus);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Model p0, ModelDownloadStatus p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((ModelManagerViewModel) this.receiver).setDownloadStatus(p0, p1);
        }
    }

    public final void cancelDownloadModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getRuntimeType() == RuntimeType.AICORE) {
            return;
        }
        this.downloadRepository.cancelDownloadModel(model);
        deleteModel(model);
    }

    public final void deleteModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getUpdatable()) {
            model.setUpdatable(false);
            ModelFile it = model.getLatestModelFile();
            if (it != null) {
                model.setVersion(it.getCommitHash());
                model.setDownloadFileName(it.getFileName());
            }
        }
        if (model.getImported()) {
            deleteFilesFromImportDir(model.getDownloadFileName());
        } else {
            deleteDirFromExternalFilesDir(model.getNormalizedName());
        }
        Map curModelDownloadStatus = MapsKt.toMutableMap(getUiState().getValue().getModelDownloadStatus());
        curModelDownloadStatus.put(model.getName(), new ModelDownloadStatus(ModelDownloadStatusType.NOT_DOWNLOADED, 0L, 0L, null, 0L, 0L, 62, null));
        if (model.getImported()) {
            for (Task curTask : getUiState().getValue().getTasks()) {
                int index = curTask.getModels().indexOf(model);
                if (index >= 0) {
                    curTask.getModels().remove(index);
                }
                curTask.getUpdateTrigger().setValue(Long.valueOf(System.currentTimeMillis()));
            }
            curModelDownloadStatus.remove(model.getName());
            List<ImportedModel> mutableList = CollectionsKt.toMutableList((Collection) this.dataStoreRepository.readImportedModels());
            int index$iv = 0;
            Iterator<ImportedModel> it2 = mutableList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    index$iv = -1;
                    break;
                }
                Object item$iv = it2.next();
                if (Intrinsics.areEqual(((ImportedModel) item$iv).getFileName(), model.getName())) {
                    break;
                } else {
                    index$iv++;
                }
            }
            int importedModelIndex = index$iv;
            if (importedModelIndex >= 0) {
                mutableList.remove(importedModelIndex);
            }
            this.dataStoreRepository.saveImportedModels(mutableList);
        }
        ModelManagerUiState value = getUiState().getValue();
        ModelManagerUiState newUiState = value.copy((991 & 1) != 0 ? value.tasks : CollectionsKt.toList(getUiState().getValue().getTasks()), (991 & 2) != 0 ? value.tasksByCategory : null, (991 & 4) != 0 ? value.modelDownloadStatus : curModelDownloadStatus, (991 & 8) != 0 ? value.modelInitializationStatus : null, (991 & 16) != 0 ? value.loadingModelAllowlist : false, (991 & 32) != 0 ? value.loadingModelAllowlistError : null, (991 & 64) != 0 ? value.selectedModel : null, (991 & 128) != 0 ? value.textInputHistory : null, (991 & 256) != 0 ? value.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value.modelImportingUpdateTrigger : System.currentTimeMillis());
        MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), newUiState)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initializeModel$default(ModelManagerViewModel modelManagerViewModel, Context context, Task task, Model model, boolean z, Function0 function0, int i, Object obj) {
        boolean z2;
        Function0 function02;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initializeModel");
        }
        if ((i & 8) == 0) {
            z2 = z;
        } else {
            z2 = false;
        }
        if ((i & 16) == 0) {
            function02 = function0;
        } else {
            function02 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        modelManagerViewModel.initializeModel(context, task, model, z2, function02);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$initializeModel$2 */
    /* JADX INFO: compiled from: ModelManagerViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$initializeModel$2", m932f = "ModelManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C28162 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $force;
        final /* synthetic */ Model $model;
        final /* synthetic */ Function0<Unit> $onDone;
        final /* synthetic */ Task $task;
        int label;
        final /* synthetic */ ModelManagerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28162(boolean z, ModelManagerViewModel modelManagerViewModel, Model model, Context context, Task task, Function0<Unit> function0, Continuation<? super C28162> continuation) {
            super(2, continuation);
            this.$force = z;
            this.this$0 = modelManagerViewModel;
            this.$model = model;
            this.$context = context;
            this.$task = task;
            this.$onDone = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C28162(this.$force, this.this$0, this.$model, this.$context, this.$task, this.$onDone, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28162) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (!this.$force) {
                        ModelInitializationStatus modelInitializationStatus = this.this$0.getUiState().getValue().getModelInitializationStatus().get(this.$model.getName());
                        if ((modelInitializationStatus != null ? modelInitializationStatus.getStatus() : null) == ModelInitializationStatusType.INITIALIZED) {
                            Log.d("AGModelManagerViewModel", "Model '" + this.$model.getName() + "' has been initialized. Skipping.");
                            return Unit.INSTANCE;
                        }
                    }
                    if (this.$model.getInitializing()) {
                        this.$model.setCleanUpAfterInit(false);
                        Log.d("AGModelManagerViewModel", "Model '" + this.$model.getName() + "' is being initialized. Skipping.");
                        return Unit.INSTANCE;
                    }
                    ModelManagerViewModel.cleanupModel$default(this.this$0, this.$context, this.$task, this.$model, null, null, 24, null);
                    Log.d("AGModelManagerViewModel", "Initializing model '" + this.$model.getName() + "'...");
                    this.$model.setInitializing(true);
                    ModelManagerViewModel.updateModelInitializationStatus$default(this.this$0, this.$model, ModelInitializationStatusType.INITIALIZING, null, 4, null);
                    final Model model = this.$model;
                    final ModelManagerViewModel modelManagerViewModel = this.this$0;
                    final Context context = this.$context;
                    final Task task = this.$task;
                    final Function0<Unit> function0 = this.$onDone;
                    Function1<? super String, Unit> function1 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$initializeModel$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ModelManagerViewModel.C28162.invokeSuspend$lambda$0(model, modelManagerViewModel, context, task, function0, (String) obj);
                        }
                    };
                    CustomTask customTaskByTaskId = this.this$0.getCustomTaskByTaskId(this.$task.getId());
                    if (customTaskByTaskId != null) {
                        customTaskByTaskId.initializeModelFn(this.$context, ViewModelKt.getViewModelScope(this.this$0), this.$model, function1);
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Model $model, ModelManagerViewModel this$0, Context $context, Task $task, Function0 $onDone, String error) {
            $model.setInitializing(false);
            if ($model.getInstance() != null) {
                Log.d("AGModelManagerViewModel", "Model '" + $model.getName() + "' initialized successfully");
                ModelManagerViewModel.updateModelInitializationStatus$default(this$0, $model, ModelInitializationStatusType.INITIALIZED, null, 4, null);
                if ($model.getCleanUpAfterInit()) {
                    Log.d("AGModelManagerViewModel", "Model '" + $model.getName() + "' needs cleaning up after init.");
                    ModelManagerViewModel.cleanupModel$default(this$0, $context, $task, $model, null, null, 24, null);
                }
                $onDone.invoke();
            } else {
                if (error.length() > 0) {
                    Log.d("AGModelManagerViewModel", "Model '" + $model.getName() + "' failed to initialize");
                    this$0.updateModelInitializationStatus($model, ModelInitializationStatusType.ERROR, error);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void initializeModel(Context context, Task task, Model model, boolean force, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C28162(force, this, model, context, task, onDone, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void cleanupModel$default(ModelManagerViewModel modelManagerViewModel, Context context, Task task, Model model, Object obj, Function0 function0, int i, Object obj2) {
        Object model2;
        Function0 function02;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cleanupModel");
        }
        if ((i & 8) == 0) {
            model2 = obj;
        } else {
            model2 = model.getInstance();
        }
        if ((i & 16) == 0) {
            function02 = function0;
        } else {
            function02 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        modelManagerViewModel.cleanupModel(context, task, model, model2, function02);
    }

    public final void cleanupModel(Context context, Task task, final Model model, Object instanceToCleanUp, final Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        if (instanceToCleanUp != null && instanceToCleanUp != model.getInstance()) {
            Log.d("AGModelManagerViewModel", "Stale cleanup request for " + model.getName() + ". Aborting.");
            onDone.invoke();
            return;
        }
        if (model.getInstance() != null) {
            model.setCleanUpAfterInit(false);
            Log.d("AGModelManagerViewModel", "Cleaning up model '" + model.getName() + "'...");
            Function0<Unit> function0 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModelManagerViewModel.cleanupModel$lambda$18(model, this, onDone);
                }
            };
            CustomTask customTaskByTaskId = getCustomTaskByTaskId(task.getId());
            if (customTaskByTaskId != null) {
                customTaskByTaskId.cleanUpModelFn(context, ViewModelKt.getViewModelScope(this), model, function0);
                return;
            }
            return;
        }
        if (model.getInitializing()) {
            Log.d("AGModelManagerViewModel", "Model '" + model.getName() + "' is still initializing.. Will clean up after it is done initializing");
            model.setCleanUpAfterInit(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cleanupModel$lambda$18(Model $model, ModelManagerViewModel this$0, Function0 $onDone) {
        $model.setInstance(null);
        $model.setInitializing(false);
        updateModelInitializationStatus$default(this$0, $model, ModelInitializationStatusType.NOT_INITIALIZED, null, 4, null);
        Log.d("AGModelManagerViewModel", "Clean up model '" + $model.getName() + "' done");
        $onDone.invoke();
        return Unit.INSTANCE;
    }

    public final void setDownloadStatus(Model curModel, ModelDownloadStatus status) {
        Intrinsics.checkNotNullParameter(curModel, "curModel");
        Intrinsics.checkNotNullParameter(status, "status");
        Map curModelDownloadStatus = MapsKt.toMutableMap(getUiState().getValue().getModelDownloadStatus());
        curModelDownloadStatus.put(curModel.getName(), status);
        ModelManagerUiState value = getUiState().getValue();
        ModelManagerUiState newUiState = value.copy((991 & 1) != 0 ? value.tasks : null, (991 & 2) != 0 ? value.tasksByCategory : null, (991 & 4) != 0 ? value.modelDownloadStatus : curModelDownloadStatus, (991 & 8) != 0 ? value.modelInitializationStatus : null, (991 & 16) != 0 ? value.loadingModelAllowlist : false, (991 & 32) != 0 ? value.loadingModelAllowlistError : null, (991 & 64) != 0 ? value.selectedModel : null, (991 & 128) != 0 ? value.textInputHistory : null, (991 & 256) != 0 ? value.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value.modelImportingUpdateTrigger : 0L);
        if (status.getStatus() == ModelDownloadStatusType.FAILED || status.getStatus() == ModelDownloadStatusType.NOT_DOWNLOADED) {
            deleteFileFromExternalFilesDir(curModel.getDownloadFileName());
        }
        MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), newUiState)) {
        }
    }

    public final void setInitializationStatus(Model model, ModelInitializationStatus status) {
        Set<String> setEmptySet;
        Set<String> setPlus;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(status, "status");
        Map curStatus = MapsKt.toMutableMap(getUiState().getValue().getModelInitializationStatus());
        if (curStatus.containsKey(model.getName())) {
            ModelInitializationStatus modelInitializationStatus = (ModelInitializationStatus) curStatus.get(model.getName());
            if (modelInitializationStatus == null || (setEmptySet = modelInitializationStatus.getInitializedBackends()) == null) {
                setEmptySet = SetsKt.emptySet();
            }
            Set<String> set = setEmptySet;
            String backend = model.getStringConfigValue(ConfigKeys.INSTANCE.getACCELERATOR(), Accelerator.GPU.getLabel());
            if (status.getStatus() == ModelInitializationStatusType.INITIALIZED) {
                setPlus = SetsKt.plus(set, backend);
            } else {
                setPlus = set;
            }
            curStatus.put(model.getName(), ModelInitializationStatus.copy$default(status, null, null, setPlus, 3, null));
            MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
            while (true) {
                ModelManagerUiState value = mutableStateFlow.getValue();
                ModelManagerUiState value2 = this._uiState.getValue();
                String backend2 = backend;
                Set<String> set2 = set;
                ModelManagerUiState it = value2.copy((991 & 1) != 0 ? value2.tasks : null, (991 & 2) != 0 ? value2.tasksByCategory : null, (991 & 4) != 0 ? value2.modelDownloadStatus : null, (991 & 8) != 0 ? value2.modelInitializationStatus : curStatus, (991 & 16) != 0 ? value2.loadingModelAllowlist : false, (991 & 32) != 0 ? value2.loadingModelAllowlistError : null, (991 & 64) != 0 ? value2.selectedModel : null, (991 & 128) != 0 ? value2.textInputHistory : null, (991 & 256) != 0 ? value2.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value2.modelImportingUpdateTrigger : 0L);
                if (mutableStateFlow.compareAndSet(value, it)) {
                    return;
                }
                backend = backend2;
                set = set2;
            }
        }
    }

    public final void addTextInputHistory(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (getUiState().getValue().getTextInputHistory().indexOf(text) < 0) {
            List newHistory = CollectionsKt.toMutableList((Collection) getUiState().getValue().getTextInputHistory());
            newHistory.add(0, text);
            if (newHistory.size() > 50) {
                newHistory.remove(newHistory.size() - 1);
            }
            MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
            while (true) {
                ModelManagerUiState value = mutableStateFlow.getValue();
                ModelManagerUiState value2 = this._uiState.getValue();
                MutableStateFlow<ModelManagerUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, value2.copy((991 & 1) != 0 ? value2.tasks : null, (991 & 2) != 0 ? value2.tasksByCategory : null, (991 & 4) != 0 ? value2.modelDownloadStatus : null, (991 & 8) != 0 ? value2.modelInitializationStatus : null, (991 & 16) != 0 ? value2.loadingModelAllowlist : false, (991 & 32) != 0 ? value2.loadingModelAllowlistError : null, (991 & 64) != 0 ? value2.selectedModel : null, (991 & 128) != 0 ? value2.textInputHistory : newHistory, (991 & 256) != 0 ? value2.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value2.modelImportingUpdateTrigger : 0L))) {
                    this.dataStoreRepository.saveTextInputHistory(this._uiState.getValue().getTextInputHistory());
                    return;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        } else {
            promoteTextInputHistoryItem(text);
        }
    }

    public final void promoteTextInputHistoryItem(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int index = getUiState().getValue().getTextInputHistory().indexOf(text);
        if (index >= 0) {
            List newHistory = CollectionsKt.toMutableList((Collection) getUiState().getValue().getTextInputHistory());
            newHistory.remove(index);
            newHistory.add(0, text);
            MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
            while (true) {
                ModelManagerUiState value = mutableStateFlow.getValue();
                ModelManagerUiState value2 = this._uiState.getValue();
                MutableStateFlow<ModelManagerUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, value2.copy((991 & 1) != 0 ? value2.tasks : null, (991 & 2) != 0 ? value2.tasksByCategory : null, (991 & 4) != 0 ? value2.modelDownloadStatus : null, (991 & 8) != 0 ? value2.modelInitializationStatus : null, (991 & 16) != 0 ? value2.loadingModelAllowlist : false, (991 & 32) != 0 ? value2.loadingModelAllowlistError : null, (991 & 64) != 0 ? value2.selectedModel : null, (991 & 128) != 0 ? value2.textInputHistory : newHistory, (991 & 256) != 0 ? value2.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value2.modelImportingUpdateTrigger : 0L))) {
                    this.dataStoreRepository.saveTextInputHistory(this._uiState.getValue().getTextInputHistory());
                    return;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void deleteTextInputHistory(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int index = getUiState().getValue().getTextInputHistory().indexOf(text);
        if (index >= 0) {
            List newHistory = CollectionsKt.toMutableList((Collection) getUiState().getValue().getTextInputHistory());
            newHistory.remove(index);
            MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
            while (true) {
                ModelManagerUiState value = mutableStateFlow.getValue();
                ModelManagerUiState value2 = this._uiState.getValue();
                MutableStateFlow<ModelManagerUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value, value2.copy((991 & 1) != 0 ? value2.tasks : null, (991 & 2) != 0 ? value2.tasksByCategory : null, (991 & 4) != 0 ? value2.modelDownloadStatus : null, (991 & 8) != 0 ? value2.modelInitializationStatus : null, (991 & 16) != 0 ? value2.loadingModelAllowlist : false, (991 & 32) != 0 ? value2.loadingModelAllowlistError : null, (991 & 64) != 0 ? value2.selectedModel : null, (991 & 128) != 0 ? value2.textInputHistory : newHistory, (991 & 256) != 0 ? value2.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value2.modelImportingUpdateTrigger : 0L))) {
                    this.dataStoreRepository.saveTextInputHistory(this._uiState.getValue().getTextInputHistory());
                    return;
                }
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void clearTextInputHistory() {
        ModelManagerUiState value;
        ModelManagerUiState it;
        MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            ModelManagerUiState value2 = this._uiState.getValue();
            it = value2.copy((991 & 1) != 0 ? value2.tasks : null, (991 & 2) != 0 ? value2.tasksByCategory : null, (991 & 4) != 0 ? value2.modelDownloadStatus : null, (991 & 8) != 0 ? value2.modelInitializationStatus : null, (991 & 16) != 0 ? value2.loadingModelAllowlist : false, (991 & 32) != 0 ? value2.loadingModelAllowlistError : null, (991 & 64) != 0 ? value2.selectedModel : null, (991 & 128) != 0 ? value2.textInputHistory : new ArrayList(), (991 & 256) != 0 ? value2.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value2.modelImportingUpdateTrigger : 0L);
        } while (!mutableStateFlow.compareAndSet(value, it));
        this.dataStoreRepository.saveTextInputHistory(this._uiState.getValue().getTextInputHistory());
    }

    public final Theme readThemeOverride() {
        return this.dataStoreRepository.readTheme();
    }

    public final void saveThemeOverride(Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.dataStoreRepository.saveTheme(theme);
    }

    public static /* synthetic */ int getModelUrlResponse$default(ModelManagerViewModel modelManagerViewModel, Model model, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getModelUrlResponse");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return modelManagerViewModel.getModelUrlResponse(model, str);
    }

    public final int getModelUrlResponse(Model model, String accessToken) {
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            URL url = new URL(model.getUrl());
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection connection = (HttpURLConnection) uRLConnectionOpenConnection;
            if (accessToken != null) {
                connection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
            }
            connection.connect();
            return connection.getResponseCode();
        } catch (Exception e) {
            Log.e("AGModelManagerViewModel", String.valueOf(e));
            return -1;
        }
    }

    public final void addImportedLlmModel(ImportedModel info) {
        ModelManagerUiState value;
        ModelManagerUiState value2;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(info, "info");
        Log.d("AGModelManagerViewModel", "adding imported llm model: " + info);
        Model model = createModelFromImportedModelInfo(info);
        for (Task task : getTasksByIds(SetsKt.mutableSetOf(BuiltInTaskId.LLM_CHAT, BuiltInTaskId.LLM_ASK_IMAGE, BuiltInTaskId.LLM_ASK_AUDIO, BuiltInTaskId.LLM_PROMPT_LAB, BuiltInTaskId.LLM_TINY_GARDEN, BuiltInTaskId.LLM_MOBILE_ACTIONS, BuiltInTaskId.LLM_AGENT_CHAT))) {
            int index$iv = 0;
            Iterator<Model> it = task.getModels().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object item$iv = it.next();
                Model it2 = (Model) item$iv;
                if (Intrinsics.areEqual(info.getFileName(), it2.getName()) && it2.getImported()) {
                    i2 = index$iv;
                    break;
                }
                index$iv++;
            }
            int modelIndex = i2;
            if (modelIndex >= 0) {
                Log.d("AGModelManagerViewModel", "duplicated imported model found in task. Removing it first");
                task.getModels().remove(modelIndex);
            }
            if ((Intrinsics.areEqual(task.getId(), BuiltInTaskId.LLM_ASK_IMAGE) && model.getLlmSupportImage()) || ((Intrinsics.areEqual(task.getId(), BuiltInTaskId.LLM_ASK_AUDIO) && model.getLlmSupportAudio()) || ((Intrinsics.areEqual(task.getId(), BuiltInTaskId.LLM_TINY_GARDEN) && model.getLlmSupportTinyGarden()) || ((Intrinsics.areEqual(task.getId(), BuiltInTaskId.LLM_MOBILE_ACTIONS) && model.getLlmSupportMobileActions()) || (!Intrinsics.areEqual(task.getId(), BuiltInTaskId.LLM_ASK_IMAGE) && !Intrinsics.areEqual(task.getId(), BuiltInTaskId.LLM_ASK_AUDIO) && !Intrinsics.areEqual(task.getId(), BuiltInTaskId.LLM_TINY_GARDEN) && !Intrinsics.areEqual(task.getId(), BuiltInTaskId.LLM_MOBILE_ACTIONS)))))) {
                task.getModels().add(model);
                if (Intrinsics.areEqual(task.getId(), BuiltInTaskId.LLM_TINY_GARDEN)) {
                    List<? extends Config> mutableList = CollectionsKt.toMutableList((Collection) model.getConfigs());
                    mutableList.add(ModelManagerViewModelKt.RESET_CONVERSATION_TURN_COUNT_CONFIG);
                    model.setConfigs(mutableList);
                    model.preProcess();
                }
            }
            task.getUpdateTrigger().setValue(Long.valueOf(System.currentTimeMillis()));
        }
        Map modelDownloadStatus = MapsKt.toMutableMap(getUiState().getValue().getModelDownloadStatus());
        Map modelInstances = MapsKt.toMutableMap(getUiState().getValue().getModelInitializationStatus());
        modelDownloadStatus.put(model.getName(), new ModelDownloadStatus(ModelDownloadStatusType.SUCCEEDED, info.getFileSize(), info.getFileSize(), null, 0L, 0L, 56, null));
        modelInstances.put(model.getName(), new ModelInitializationStatus(ModelInitializationStatusType.NOT_INITIALIZED, null, null, 6, null));
        MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            value2 = getUiState().getValue();
        } while (!mutableStateFlow.compareAndSet(value, value2.copy((991 & 1) != 0 ? value2.tasks : CollectionsKt.toList(getUiState().getValue().getTasks()), (991 & 2) != 0 ? value2.tasksByCategory : null, (991 & 4) != 0 ? value2.modelDownloadStatus : modelDownloadStatus, (991 & 8) != 0 ? value2.modelInitializationStatus : modelInstances, (991 & 16) != 0 ? value2.loadingModelAllowlist : false, (991 & 32) != 0 ? value2.loadingModelAllowlistError : null, (991 & 64) != 0 ? value2.selectedModel : null, (991 & 128) != 0 ? value2.textInputHistory : null, (991 & 256) != 0 ? value2.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value2.modelImportingUpdateTrigger : System.currentTimeMillis())));
        List<ImportedModel> mutableList2 = CollectionsKt.toMutableList((Collection) this.dataStoreRepository.readImportedModels());
        int index$iv2 = 0;
        Iterator<ImportedModel> it3 = mutableList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i = -1;
                break;
            }
            Object item$iv2 = it3.next();
            Model model2 = model;
            if (Intrinsics.areEqual(info.getFileName(), ((ImportedModel) item$iv2).getFileName())) {
                i = index$iv2;
                break;
            } else {
                index$iv2++;
                model = model2;
            }
        }
        int importedModelIndex = i;
        if (importedModelIndex >= 0) {
            Log.d("AGModelManagerViewModel", "duplicated imported model found in data store. Removing it first");
            mutableList2.remove(importedModelIndex);
        }
        mutableList2.add(info);
        this.dataStoreRepository.saveImportedModels(mutableList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ai.edge.gallery.p006ui.modelmanager.TokenStatusAndData getTokenStatusAndData() {
        /*
            r11 = this;
            com.google.ai.edge.gallery.ui.modelmanager.TokenStatus r0 = com.google.ai.edge.gallery.p006ui.modelmanager.TokenStatus.NOT_STORED
            java.lang.String r1 = "Reading token data from data store..."
            java.lang.String r2 = "AGModelManagerViewModel"
            android.util.Log.d(r2, r1)
            com.google.ai.edge.gallery.data.DataStoreRepository r1 = r11.dataStoreRepository
            com.google.ai.edge.gallery.proto.AccessTokenData r1 = r1.readAccessTokenData()
            if (r1 == 0) goto L76
            java.lang.String r3 = r1.getAccessToken()
            java.lang.String r4 = "getAccessToken(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L24
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            if (r3 == 0) goto L76
            java.lang.String r3 = "Token exists and loaded."
            android.util.Log.d(r2, r3)
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r1.getExpiresAtMs()
            r3 = 300(0x12c, float:4.2E-43)
            long r9 = (long) r3
            long r7 = r7 - r9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "Checking whether token has expired or not. Current ts: "
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r9 = ", expires at: "
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r2, r3)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L65
            java.lang.String r3 = "Token expired!"
            android.util.Log.d(r2, r3)
            com.google.ai.edge.gallery.ui.modelmanager.TokenStatus r0 = com.google.ai.edge.gallery.p006ui.modelmanager.TokenStatus.EXPIRED
            goto L7b
        L65:
            java.lang.String r3 = "Token not expired."
            android.util.Log.d(r2, r3)
            com.google.ai.edge.gallery.ui.modelmanager.TokenStatus r0 = com.google.ai.edge.gallery.p006ui.modelmanager.TokenStatus.NOT_EXPIRED
            java.lang.String r2 = r1.getAccessToken()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r11.curAccessToken = r2
            goto L7b
        L76:
            java.lang.String r3 = "Token doesn't exists."
            android.util.Log.d(r2, r3)
        L7b:
            com.google.ai.edge.gallery.ui.modelmanager.TokenStatusAndData r2 = new com.google.ai.edge.gallery.ui.modelmanager.TokenStatusAndData
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel.getTokenStatusAndData():com.google.ai.edge.gallery.ui.modelmanager.TokenStatusAndData");
    }

    public final AuthorizationRequest getAuthorizationRequest() {
        AuthorizationRequest authorizationRequestBuild = new AuthorizationRequest.Builder(ProjectConfig.INSTANCE.getAuthServiceConfig(), ProjectConfig.clientId, ResponseTypeValues.CODE, Uri.parse(ProjectConfig.redirectUri)).setScope("read-repos").build();
        Intrinsics.checkNotNullExpressionValue(authorizationRequestBuild, "build(...)");
        return authorizationRequestBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void handleAuthResult(ActivityResult result, final Function1<? super TokenRequestResult, Unit> onTokenRequested) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onTokenRequested, "onTokenRequested");
        Intent data = result.getData();
        if (data == null) {
            onTokenRequested.invoke(new TokenRequestResult(TokenRequestResultType.FAILED, "Empty auth result"));
            return;
        }
        AuthorizationResponse authorizationResponseFromIntent = AuthorizationResponse.fromIntent(data);
        AuthorizationException authorizationExceptionFromIntent = AuthorizationException.fromIntent(data);
        String str = null;
        Object[] objArr = 0;
        if ((authorizationResponseFromIntent != null ? authorizationResponseFromIntent.authorizationCode : null) != null) {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            this.authService.performTokenRequest(authorizationResponseFromIntent.createTokenExchangeRequest(), new AuthorizationService.TokenResponseCallback() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda10
                @Override // net.openid.appauth.AuthorizationService.TokenResponseCallback
                public final void onTokenRequestCompleted(TokenResponse tokenResponse, AuthorizationException authorizationException) {
                    ModelManagerViewModel.handleAuthResult$lambda$28(objectRef, this, onTokenRequested, tokenResponse, authorizationException);
                }
            });
        } else if (authorizationExceptionFromIntent != null) {
            onTokenRequested.invoke(new TokenRequestResult(Intrinsics.areEqual(authorizationExceptionFromIntent.getMessage(), "User cancelled flow") ? TokenRequestResultType.USER_CANCELLED : TokenRequestResultType.FAILED, authorizationExceptionFromIntent.getMessage()));
        } else {
            onTokenRequested.invoke(new TokenRequestResult(TokenRequestResultType.USER_CANCELLED, str, 2, objArr == true ? 1 : 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    public static final void handleAuthResult$lambda$28(Ref.ObjectRef objectRef, ModelManagerViewModel modelManagerViewModel, Function1 function1, TokenResponse tokenResponse, AuthorizationException authorizationException) {
        if (tokenResponse != null) {
            if (tokenResponse.accessToken == null) {
                objectRef.element = "Empty access token";
            } else if (tokenResponse.refreshToken == null) {
                objectRef.element = "Empty refresh token";
            } else if (tokenResponse.accessTokenExpirationTime == null) {
                objectRef.element = "Empty expiration time";
            } else {
                Log.d("AGModelManagerViewModel", "Token exchange successful. Storing tokens...");
                String str = tokenResponse.accessToken;
                Intrinsics.checkNotNull(str);
                String str2 = tokenResponse.refreshToken;
                Intrinsics.checkNotNull(str2);
                Long l = tokenResponse.accessTokenExpirationTime;
                Intrinsics.checkNotNull(l);
                modelManagerViewModel.saveAccessToken(str, str2, l.longValue());
                String str3 = tokenResponse.accessToken;
                Intrinsics.checkNotNull(str3);
                modelManagerViewModel.curAccessToken = str3;
                Log.d("AGModelManagerViewModel", "Token successfully saved.");
            }
        } else if (authorizationException != null) {
            objectRef.element = "Token exchange failed: " + authorizationException.getMessage();
        } else {
            objectRef.element = "Token exchange failed";
        }
        if (objectRef.element == 0) {
            function1.invoke(new TokenRequestResult(TokenRequestResultType.SUCCEEDED, null, 2, 0 == true ? 1 : 0));
        } else {
            function1.invoke(new TokenRequestResult(TokenRequestResultType.FAILED, (String) objectRef.element));
        }
    }

    public final void saveAccessToken(String accessToken, String refreshToken, long expiresAt) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        this.dataStoreRepository.saveAccessTokenData(accessToken, refreshToken, expiresAt);
    }

    public final void clearAccessToken() {
        this.dataStoreRepository.clearAccessTokenData();
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$checkAICoreModelStatuses$1 */
    /* JADX INFO: compiled from: ModelManagerViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$checkAICoreModelStatuses$1", m932f = "ModelManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C28141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C28141(Continuation<? super C28141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ModelManagerViewModel.this.new C28141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterable<Task> $this$flatMap$iv = ModelManagerViewModel.this.getUiState().getValue().getTasks();
                    Collection destination$iv$iv = new ArrayList();
                    for (Task it : $this$flatMap$iv) {
                        Iterable list$iv$iv = it.getModels();
                        CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
                    }
                    Iterable $this$filter$iv = (List) destination$iv$iv;
                    Collection destination$iv$iv2 = new ArrayList();
                    for (Object element$iv$iv : $this$filter$iv) {
                        Model it2 = (Model) element$iv$iv;
                        if (it2.getRuntimeType() == RuntimeType.AICORE) {
                            destination$iv$iv2.add(element$iv$iv);
                        }
                    }
                    Iterable $this$distinctBy$iv = (List) destination$iv$iv2;
                    HashSet set$iv = new HashSet();
                    ArrayList list$iv = new ArrayList();
                    for (Object e$iv : $this$distinctBy$iv) {
                        Model it3 = (Model) e$iv;
                        if (set$iv.add(it3.getName())) {
                            list$iv.add(e$iv);
                        }
                    }
                    ArrayList<Model> aicoreModels = list$iv;
                    for (Model model : aicoreModels) {
                        ModelManagerViewModel.this.downloadModel(null, model);
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAICoreModelStatuses() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C28141(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processPendingDownloads() {
        this.downloadRepository.cancelAll(new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModelManagerViewModel.processPendingDownloads$lambda$29(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processPendingDownloads$lambda$29(ModelManagerViewModel this$0) {
        Log.d("AGModelManagerViewModel", "All workers are cancelled.");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this$0), Dispatchers.getMain(), null, new ModelManagerViewModel$processPendingDownloads$1$1(this$0, null), 2, null);
        return Unit.INSTANCE;
    }

    public final void loadModelAllowlist() {
        ModelManagerUiState value;
        ModelManagerUiState it;
        MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            ModelManagerUiState value2 = getUiState().getValue();
            it = value2.copy((991 & 1) != 0 ? value2.tasks : null, (991 & 2) != 0 ? value2.tasksByCategory : null, (991 & 4) != 0 ? value2.modelDownloadStatus : null, (991 & 8) != 0 ? value2.modelInitializationStatus : null, (991 & 16) != 0 ? value2.loadingModelAllowlist : true, (991 & 32) != 0 ? value2.loadingModelAllowlistError : "", (991 & 64) != 0 ? value2.selectedModel : null, (991 & 128) != 0 ? value2.textInputHistory : null, (991 & 256) != 0 ? value2.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value2.modelImportingUpdateTrigger : 0L);
        } while (!mutableStateFlow.compareAndSet(value, it));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C28182(null), 2, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$loadModelAllowlist$2 */
    /* JADX INFO: compiled from: ModelManagerViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$loadModelAllowlist$2", m932f = "ModelManagerViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C28182 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C28182(Continuation<? super C28182> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ModelManagerViewModel.this.new C28182(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C28182) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0151 A[Catch: Exception -> 0x04a1, TryCatch #6 {Exception -> 0x04a1, blocks: (B:7:0x001c, B:12:0x0048, B:14:0x0054, B:17:0x0060, B:18:0x006c, B:20:0x0071, B:61:0x0151, B:63:0x0159, B:65:0x015f, B:73:0x0188, B:75:0x018c, B:76:0x0195, B:78:0x01c8, B:80:0x01cb, B:81:0x0208, B:83:0x020e, B:84:0x021e, B:85:0x0236, B:87:0x023c, B:90:0x0252, B:92:0x025a, B:95:0x0261, B:98:0x026d, B:99:0x029b, B:101:0x02a1, B:102:0x02bc, B:103:0x02d2, B:105:0x02d8, B:110:0x02f5, B:113:0x0300, B:115:0x030d, B:117:0x031a, B:119:0x0320, B:121:0x032b, B:122:0x0358, B:123:0x0374, B:125:0x037a, B:126:0x0387, B:128:0x038d, B:133:0x03a5, B:135:0x03aa, B:137:0x03b0, B:139:0x03b9, B:141:0x03bf, B:143:0x03c7, B:146:0x03e4, B:147:0x03e8, B:149:0x03ee, B:151:0x0400, B:152:0x0408, B:154:0x040e, B:156:0x041c, B:157:0x0447, B:158:0x044f, B:159:0x045d, B:161:0x0496, B:66:0x016f, B:68:0x0179, B:71:0x0181, B:57:0x0145), top: B:178:0x001c, inners: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x015f A[Catch: Exception -> 0x04a1, TryCatch #6 {Exception -> 0x04a1, blocks: (B:7:0x001c, B:12:0x0048, B:14:0x0054, B:17:0x0060, B:18:0x006c, B:20:0x0071, B:61:0x0151, B:63:0x0159, B:65:0x015f, B:73:0x0188, B:75:0x018c, B:76:0x0195, B:78:0x01c8, B:80:0x01cb, B:81:0x0208, B:83:0x020e, B:84:0x021e, B:85:0x0236, B:87:0x023c, B:90:0x0252, B:92:0x025a, B:95:0x0261, B:98:0x026d, B:99:0x029b, B:101:0x02a1, B:102:0x02bc, B:103:0x02d2, B:105:0x02d8, B:110:0x02f5, B:113:0x0300, B:115:0x030d, B:117:0x031a, B:119:0x0320, B:121:0x032b, B:122:0x0358, B:123:0x0374, B:125:0x037a, B:126:0x0387, B:128:0x038d, B:133:0x03a5, B:135:0x03aa, B:137:0x03b0, B:139:0x03b9, B:141:0x03bf, B:143:0x03c7, B:146:0x03e4, B:147:0x03e8, B:149:0x03ee, B:151:0x0400, B:152:0x0408, B:154:0x040e, B:156:0x041c, B:157:0x0447, B:158:0x044f, B:159:0x045d, B:161:0x0496, B:66:0x016f, B:68:0x0179, B:71:0x0181, B:57:0x0145), top: B:178:0x001c, inners: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x016f A[Catch: Exception -> 0x04a1, TryCatch #6 {Exception -> 0x04a1, blocks: (B:7:0x001c, B:12:0x0048, B:14:0x0054, B:17:0x0060, B:18:0x006c, B:20:0x0071, B:61:0x0151, B:63:0x0159, B:65:0x015f, B:73:0x0188, B:75:0x018c, B:76:0x0195, B:78:0x01c8, B:80:0x01cb, B:81:0x0208, B:83:0x020e, B:84:0x021e, B:85:0x0236, B:87:0x023c, B:90:0x0252, B:92:0x025a, B:95:0x0261, B:98:0x026d, B:99:0x029b, B:101:0x02a1, B:102:0x02bc, B:103:0x02d2, B:105:0x02d8, B:110:0x02f5, B:113:0x0300, B:115:0x030d, B:117:0x031a, B:119:0x0320, B:121:0x032b, B:122:0x0358, B:123:0x0374, B:125:0x037a, B:126:0x0387, B:128:0x038d, B:133:0x03a5, B:135:0x03aa, B:137:0x03b0, B:139:0x03b9, B:141:0x03bf, B:143:0x03c7, B:146:0x03e4, B:147:0x03e8, B:149:0x03ee, B:151:0x0400, B:152:0x0408, B:154:0x040e, B:156:0x041c, B:157:0x0447, B:158:0x044f, B:159:0x045d, B:161:0x0496, B:66:0x016f, B:68:0x0179, B:71:0x0181, B:57:0x0145), top: B:178:0x001c, inners: #2 }] */
        /* JADX WARN: Type inference failed for: r0v59, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v8, types: [T, com.google.ai.edge.gallery.data.ModelAllowlist] */
        /* JADX WARN: Type inference failed for: r2v15, types: [T, com.google.ai.edge.gallery.data.ModelAllowlist] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                Method dump skipped, instruction units count: 1198
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel.C28182.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static final boolean invokeSuspend$lambda$4(Lazy<Boolean> lazy) {
            return lazy.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final boolean invokeSuspend$lambda$3(Ref.ObjectRef $modelAllowlist) {
            List<NamedDeviceGroup> allowedDeviceGroups;
            Sequence sequenceAsSequence;
            Sequence sequenceFlatMapIterable;
            Sequence map;
            DeviceRequirements aicoreRequirements = ((ModelAllowlist) $modelAllowlist.element).getAicoreRequirements();
            Set allowedDeviceModelsSet = (aicoreRequirements == null || (allowedDeviceGroups = aicoreRequirements.getAllowedDeviceGroups()) == null || (sequenceAsSequence = CollectionsKt.asSequence(allowedDeviceGroups)) == null || (sequenceFlatMapIterable = SequencesKt.flatMapIterable(sequenceAsSequence, new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$loadModelAllowlist$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ModelManagerViewModel.C28182.invokeSuspend$lambda$3$lambda$1((NamedDeviceGroup) obj);
                }
            })) == null || (map = SequencesKt.map(sequenceFlatMapIterable, new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$loadModelAllowlist$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ModelManagerViewModel.C28182.invokeSuspend$lambda$3$lambda$2((String) obj);
                }
            })) == null) ? null : SequencesKt.toSet(map);
            return UtilsKt.isAICoreSupported(allowedDeviceModelsSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Iterable invokeSuspend$lambda$3$lambda$1(NamedDeviceGroup it) {
            return it.getDeviceModels();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$3$lambda$2(String it) {
            String lowerCase = it.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    public final void clearLoadModelAllowlistError() {
        ModelManagerUiState value;
        ModelManagerUiState modelManagerUiStateCreateUiState;
        Iterable $this$map$iv = getActiveCustomTasks();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            CustomTask it = (CustomTask) item$iv$iv;
            destination$iv$iv.add(it.getTask());
        }
        List curTasks = (List) destination$iv$iv;
        processTasks();
        MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            modelManagerUiStateCreateUiState = createUiState();
        } while (!mutableStateFlow.compareAndSet(value, modelManagerUiStateCreateUiState.copy((991 & 1) != 0 ? modelManagerUiStateCreateUiState.tasks : curTasks, (991 & 2) != 0 ? modelManagerUiStateCreateUiState.tasksByCategory : groupTasksByCategory(), (991 & 4) != 0 ? modelManagerUiStateCreateUiState.modelDownloadStatus : null, (991 & 8) != 0 ? modelManagerUiStateCreateUiState.modelInitializationStatus : null, (991 & 16) != 0 ? modelManagerUiStateCreateUiState.loadingModelAllowlist : false, (991 & 32) != 0 ? modelManagerUiStateCreateUiState.loadingModelAllowlistError : "", (991 & 64) != 0 ? modelManagerUiStateCreateUiState.selectedModel : null, (991 & 128) != 0 ? modelManagerUiStateCreateUiState.textInputHistory : null, (991 & 256) != 0 ? modelManagerUiStateCreateUiState.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? modelManagerUiStateCreateUiState.modelImportingUpdateTrigger : 0L)));
    }

    public final void setAppInForeground(boolean foreground) {
        this.lifecycleProvider.setAppInForeground(foreground);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveModelAllowlistToDisk(String modelAllowlistContent) {
        try {
            Log.d("AGModelManagerViewModel", "Saving model allowlist to disk...");
            File file = new File(this.externalFilesDir, "model_allowlist.json");
            FilesKt.writeText$default(file, modelAllowlistContent, null, 2, null);
            Log.d("AGModelManagerViewModel", "Done: saving model allowlist to disk.");
        } catch (Exception e) {
            Log.e("AGModelManagerViewModel", "failed to write model allowlist to disk", e);
        }
    }

    static /* synthetic */ ModelAllowlist readModelAllowlistFromDisk$default(ModelManagerViewModel modelManagerViewModel, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readModelAllowlistFromDisk");
        }
        if ((i & 1) != 0) {
            str = "model_allowlist.json";
        }
        return modelManagerViewModel.readModelAllowlistFromDisk(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModelAllowlist readModelAllowlistFromDisk(String fileName) {
        try {
            Log.d("AGModelManagerViewModel", "Reading model allowlist from disk: " + fileName);
            File baseDir = Intrinsics.areEqual(fileName, "model_allowlist_test.json") ? new File("/data/local/tmp") : this.externalFilesDir;
            File file = new File(baseDir, fileName);
            if (file.exists()) {
                String content = FilesKt.readText$default(file, null, 1, null);
                Log.d("AGModelManagerViewModel", "Model allowlist content from local file: " + content);
                Gson gson = new Gson();
                return (ModelAllowlist) gson.fromJson(content, ModelAllowlist.class);
            }
            return null;
        } catch (Exception e) {
            Log.e("AGModelManagerViewModel", "failed to read model allowlist from disk", e);
            return null;
        }
    }

    private final boolean isModelPartiallyDownloaded(Model model) {
        if (model.getLocalModelFilePathOverride().length() > 0) {
            return false;
        }
        String tmpFilePath = model.getPath(this.context, model.getDownloadFileName() + ".gallerytmp");
        return new File(tmpFilePath).exists();
    }

    private final ModelManagerUiState createEmptyUiState() {
        return new ModelManagerUiState(CollectionsKt.emptyList(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), false, null, null, null, 0L, 0L, PointerIconCompat.TYPE_TEXT, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModelManagerUiState createUiState() {
        Task task;
        List<Model> models;
        List<Model> models2;
        Task task2;
        List<Model> models3;
        Task task3;
        List<Model> models4;
        List<Model> models5;
        List<Model> models6;
        List<Model> models7;
        Map modelDownloadStatus = new LinkedHashMap();
        Map modelInstances = new LinkedHashMap();
        Map tasks = new LinkedHashMap();
        Set checkedModelNames = new LinkedHashSet();
        for (CustomTask customTask : getActiveCustomTasks()) {
            Task task4 = customTask.getTask();
            tasks.put(task4.getId(), task4);
            for (Model model : task4.getModels()) {
                if (!checkedModelNames.contains(model.getName())) {
                    modelDownloadStatus.put(model.getName(), getModelDownloadStatus(model));
                    modelInstances.put(model.getName(), new ModelInitializationStatus(ModelInitializationStatusType.NOT_INITIALIZED, null, null, 6, null));
                    checkedModelNames.add(model.getName());
                }
            }
        }
        for (ImportedModel importedModel : this.dataStoreRepository.readImportedModels()) {
            Log.d("AGModelManagerViewModel", "stored imported model: " + importedModel);
            Model model2 = createModelFromImportedModelInfo(importedModel);
            Task task5 = (Task) tasks.get(BuiltInTaskId.LLM_CHAT);
            if (task5 != null && (models7 = task5.getModels()) != null) {
                models7.add(model2);
            }
            Task task6 = (Task) tasks.get(BuiltInTaskId.LLM_PROMPT_LAB);
            if (task6 != null && (models6 = task6.getModels()) != null) {
                models6.add(model2);
            }
            Task task7 = (Task) tasks.get(BuiltInTaskId.LLM_AGENT_CHAT);
            if (task7 != null && (models5 = task7.getModels()) != null) {
                models5.add(model2);
            }
            if (model2.getLlmSupportImage() && (task3 = (Task) tasks.get(BuiltInTaskId.LLM_ASK_IMAGE)) != null && (models4 = task3.getModels()) != null) {
                models4.add(model2);
            }
            if (model2.getLlmSupportAudio() && (task2 = (Task) tasks.get(BuiltInTaskId.LLM_ASK_AUDIO)) != null && (models3 = task2.getModels()) != null) {
                models3.add(model2);
            }
            if (model2.getLlmSupportTinyGarden()) {
                Task task8 = (Task) tasks.get(BuiltInTaskId.LLM_TINY_GARDEN);
                if (task8 != null && (models2 = task8.getModels()) != null) {
                    models2.add(model2);
                }
                List<? extends Config> mutableList = CollectionsKt.toMutableList((Collection) model2.getConfigs());
                mutableList.add(ModelManagerViewModelKt.RESET_CONVERSATION_TURN_COUNT_CONFIG);
                model2.setConfigs(mutableList);
                model2.preProcess();
            }
            if (model2.getLlmSupportMobileActions() && (task = (Task) tasks.get(BuiltInTaskId.LLM_MOBILE_ACTIONS)) != null && (models = task.getModels()) != null) {
                models.add(model2);
            }
            modelDownloadStatus.put(model2.getName(), new ModelDownloadStatus(ModelDownloadStatusType.SUCCEEDED, importedModel.getFileSize(), importedModel.getFileSize(), null, 0L, 0L, 56, null));
        }
        List<String> textInputHistory = this.dataStoreRepository.readTextInputHistory();
        Log.d("AGModelManagerViewModel", "text input history: " + textInputHistory);
        Log.d("AGModelManagerViewModel", "model download status: " + modelDownloadStatus);
        Iterable $this$map$iv = getActiveCustomTasks();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            CustomTask it = (CustomTask) item$iv$iv;
            destination$iv$iv.add(it.getTask());
        }
        return new ModelManagerUiState(CollectionsKt.toList((List) destination$iv$iv), MapsKt.emptyMap(), modelDownloadStatus, modelInstances, false, null, null, textInputHistory, 0L, 0L, 880, null);
    }

    private final Model createModelFromImportedModelInfo(ImportedModel info) {
        Iterable compatibleAcceleratorsList = info.getLlmConfig().getCompatibleAcceleratorsList();
        Intrinsics.checkNotNullExpressionValue(compatibleAcceleratorsList, "getCompatibleAcceleratorsList(...)");
        Iterable $this$mapNotNull$iv = compatibleAcceleratorsList;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String acceleratorLabel = (String) element$iv$iv$iv;
            Intrinsics.checkNotNull(acceleratorLabel);
            String string = StringsKt.trim((CharSequence) acceleratorLabel).toString();
            Accelerator accelerator = Intrinsics.areEqual(string, Accelerator.GPU.getLabel()) ? Accelerator.GPU : Intrinsics.areEqual(string, Accelerator.CPU.getLabel()) ? Accelerator.CPU : Intrinsics.areEqual(string, Accelerator.NPU.getLabel()) ? Accelerator.NPU : null;
            if (accelerator != null) {
                destination$iv$iv.add(accelerator);
            }
        }
        List accelerators = CollectionsKt.toMutableList(destination$iv$iv);
        int llmMaxToken = info.getLlmConfig().getDefaultMaxTokens();
        boolean llmSupportImage = info.getLlmConfig().getSupportImage();
        boolean llmSupportAudio = info.getLlmConfig().getSupportAudio();
        boolean llmSupportTinyGarden = info.getLlmConfig().getSupportTinyGarden();
        boolean llmSupportMobileActions = info.getLlmConfig().getSupportMobileActions();
        boolean llmSupportThinking = info.getLlmConfig().getSupportThinking();
        List configs = CollectionsKt.toMutableList((Collection) ConfigKt.createLlmChatConfigs$default(llmMaxToken, null, info.getLlmConfig().getDefaultTopk(), info.getLlmConfig().getDefaultTopp(), info.getLlmConfig().getDefaultTemperature(), accelerators, llmSupportThinking, 2, null));
        String fileName = info.getFileName();
        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
        Model model = new Model(fileName, null, null, configs, null, null, null, "", info.getFileSize(), "__imports/" + info.getFileName(), null, null, true, null, null, null, null, null, null, RuntimeType.LITERT_LM, null, null, false, false, false, null, null, llmSupportImage, llmSupportAudio, llmSupportTinyGarden, llmSupportMobileActions, llmSupportThinking ? CollectionsKt.listOf(ModelCapability.LLM_THINKING) : CollectionsKt.emptyList(), llmMaxToken, accelerators, null, true, llmSupportThinking ? MapsKt.mapOf(TuplesKt.m929to(ModelCapability.LLM_THINKING, CollectionsKt.listOf((Object[]) new String[]{BuiltInTaskId.LLM_CHAT, BuiltInTaskId.LLM_ASK_IMAGE, BuiltInTaskId.LLM_ASK_AUDIO}))) : MapsKt.emptyMap(), null, null, false, false, null, null, 0L, null, false, null, 121105526, 32740, null);
        model.preProcess();
        return model;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, List<Task>> groupTasksByCategory() {
        Object answer$iv$iv$iv;
        Iterable $this$map$iv = getActiveCustomTasks();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            CustomTask it = (CustomTask) item$iv$iv;
            destination$iv$iv.add(it.getTask());
        }
        Iterable tasks = (List) destination$iv$iv;
        Iterable $this$associateBy$iv = tasks;
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
        Map destination$iv$iv2 = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associateBy$iv) {
            Task it2 = (Task) element$iv$iv;
            destination$iv$iv2.put(it2.getCategory().getId(), element$iv$iv);
        }
        final Map destination$iv$iv3 = new LinkedHashMap(MapsKt.mapCapacity(destination$iv$iv2.size()));
        Iterable $this$associateByTo$iv$iv$iv = destination$iv$iv2.entrySet();
        for (Object element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
            Map.Entry it$iv$iv = (Map.Entry) element$iv$iv$iv;
            Map.Entry it3 = (Map.Entry) element$iv$iv$iv;
            destination$iv$iv3.put(it$iv$iv.getKey(), ((Task) it3.getValue()).getCategory());
        }
        Iterable $this$groupBy$iv = tasks;
        Map destination$iv$iv4 = new LinkedHashMap();
        for (Object element$iv$iv2 : $this$groupBy$iv) {
            Task it4 = (Task) element$iv$iv2;
            String id = it4.getCategory().getId();
            Object value$iv$iv$iv = destination$iv$iv4.get(id);
            if (value$iv$iv$iv == null) {
                answer$iv$iv$iv = new ArrayList();
                destination$iv$iv4.put(id, answer$iv$iv$iv);
            } else {
                answer$iv$iv$iv = value$iv$iv$iv;
            }
            Object key$iv$iv$iv = answer$iv$iv$iv;
            List list$iv$iv = (List) key$iv$iv$iv;
            list$iv$iv.add(element$iv$iv2);
        }
        Map groupedSortedTasks = new LinkedHashMap();
        for (final String categoryId : destination$iv$iv4.keySet()) {
            Object obj = destination$iv$iv4.get(categoryId);
            Intrinsics.checkNotNull(obj);
            final Function2 function2 = new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Integer.valueOf(ModelManagerViewModel.groupTasksByCategory$lambda$39(categoryId, destination$iv$iv3, this, (Task) obj2, (Task) obj3));
                }
            };
            List<Task> sortedTasks = CollectionsKt.sortedWith((Iterable) obj, new Comparator() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda5
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return ModelManagerViewModel.groupTasksByCategory$lambda$40(function2, obj2, obj3);
                }
            });
            int i = 0;
            for (Task task : sortedTasks) {
                int index = i;
                i++;
                task.setIndex(index);
            }
            groupedSortedTasks.put(categoryId, sortedTasks);
        }
        return groupedSortedTasks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupTasksByCategory$lambda$40(Function2 $tmp0, Object p0, Object p1) {
        return ((Number) $tmp0.invoke(p0, p1)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupTasksByCategory$lambda$39(String $categoryId, Map $categoryMap, ModelManagerViewModel this$0, Task a, Task b) {
        List order;
        if (Intrinsics.areEqual($categoryId, Category.INSTANCE.getLLM().getId())) {
            if (Intrinsics.areEqual($categoryId, Category.INSTANCE.getLLM().getId())) {
                order = ModelManagerViewModelKt.PREDEFINED_LLM_TASK_ORDER;
            } else {
                order = CollectionsKt.emptyList();
            }
            int indexA = order.indexOf(a.getId());
            int indexB = order.indexOf(b.getId());
            if (indexA != -1 && indexB != -1) {
                return Intrinsics.compare(indexA, indexB);
            }
            if (indexA != -1) {
                return -1;
            }
            if (indexB != -1) {
                return 1;
            }
            Object obj = $categoryMap.get(a.getId());
            Intrinsics.checkNotNull(obj);
            CategoryInfo ca = (CategoryInfo) obj;
            Object obj2 = $categoryMap.get(b.getId());
            Intrinsics.checkNotNull(obj2);
            CategoryInfo cb = (CategoryInfo) obj2;
            String caLabel = this$0.getCategoryLabel(this$0.context, ca);
            String cbLabel = this$0.getCategoryLabel(this$0.context, cb);
            return caLabel.compareTo(cbLabel);
        }
        return a.getLabel().compareTo(b.getLabel());
    }

    private final String getCategoryLabel(Context context, CategoryInfo category) {
        Integer stringRes = category.getLabelStringRes();
        String label = category.getLabel();
        if (stringRes != null) {
            String string = context.getString(stringRes.intValue());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (label != null) {
            return label;
        }
        String string2 = context.getString(C2421R.string.category_unlabeled);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final ModelDownloadStatus getModelDownloadStatus(Model model) {
        Log.d("AGModelManagerViewModel", "Checking model " + model.getName() + " download status...");
        if (model.getLocalFileRelativeDirPathOverride().length() > 0) {
            Log.d("AGModelManagerViewModel", "Model has localFileRelativeDirPathOverride set. Set status to SUCCEEDED");
            return new ModelDownloadStatus(ModelDownloadStatusType.SUCCEEDED, 0L, 0L, null, 0L, 0L, 56, null);
        }
        ModelDownloadStatusType status = ModelDownloadStatusType.NOT_DOWNLOADED;
        long receivedBytes = 0;
        long totalBytes = 0;
        if (isModelPartiallyDownloaded(model)) {
            status = ModelDownloadStatusType.PARTIALLY_DOWNLOADED;
            String tmpFilePath = model.getPath(this.context, model.getDownloadFileName() + ".gallerytmp");
            File tmpFile = new File(tmpFilePath);
            receivedBytes = tmpFile.length();
            totalBytes = model.getTotalBytes();
            Log.d("AGModelManagerViewModel", model.getName() + " is partially downloaded. " + receivedBytes + "/" + totalBytes);
        } else if (isModelDownloaded(model)) {
            status = ModelDownloadStatusType.SUCCEEDED;
            Log.d("AGModelManagerViewModel", model.getName() + " has been downloaded.");
        } else {
            Log.d("AGModelManagerViewModel", model.getName() + " has not been downloaded.");
        }
        return new ModelDownloadStatus(status, totalBytes, receivedBytes, null, 0L, 0L, 56, null);
    }

    private final boolean isFileInExternalFilesDir(String fileName) {
        if (this.externalFilesDir != null) {
            File file = new File(this.externalFilesDir, fileName);
            return file.exists();
        }
        return false;
    }

    private final boolean isFileInDataLocalTmpDir(String fileName) {
        File file = new File("/data/local/tmp", fileName);
        return file.exists();
    }

    private final void deleteFileFromExternalFilesDir(String fileName) {
        if (isFileInExternalFilesDir(fileName)) {
            File file = new File(this.externalFilesDir, fileName);
            file.delete();
        }
    }

    private final void deleteFilesFromImportDir(String fileName) {
        File dir = this.context.getExternalFilesDir(null);
        if (dir == null) {
            return;
        }
        final String prefixAbsolutePath = this.context.getExternalFilesDir(null) + File.separator + fileName;
        File[] filesToDelete = new File(dir, ModelKt.IMPORTS_DIR).listFiles(new FilenameFilter() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return ModelManagerViewModel.deleteFilesFromImportDir$lambda$41(prefixAbsolutePath, file, str);
            }
        });
        if (filesToDelete == null) {
            filesToDelete = new File[0];
        }
        for (File file : filesToDelete) {
            Log.d("AGModelManagerViewModel", "Deleting file: " + file.getName());
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteFilesFromImportDir$lambda$41(String $prefixAbsolutePath, File dirFile, String name) {
        String absolutePath = new File(dirFile, name).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return StringsKt.startsWith$default(absolutePath, $prefixAbsolutePath, false, 2, (Object) null);
    }

    private final void deleteDirFromExternalFilesDir(String dir) {
        if (isFileInExternalFilesDir(dir)) {
            File file = new File(this.externalFilesDir, dir);
            FilesKt.deleteRecursively(file);
        }
    }

    static /* synthetic */ void updateModelInitializationStatus$default(ModelManagerViewModel modelManagerViewModel, Model model, ModelInitializationStatusType modelInitializationStatusType, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateModelInitializationStatus");
        }
        if ((i & 4) != 0) {
            str = "";
        }
        modelManagerViewModel.updateModelInitializationStatus(model, modelInitializationStatusType, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateModelInitializationStatus(Model model, ModelInitializationStatusType status, String error) {
        Set<String> setEmptySet;
        Set<String> setPlus;
        Map curModelInstance = MapsKt.toMutableMap(getUiState().getValue().getModelInitializationStatus());
        ModelInitializationStatus modelInitializationStatus = (ModelInitializationStatus) curModelInstance.get(model.getName());
        if (modelInitializationStatus == null || (setEmptySet = modelInitializationStatus.getInitializedBackends()) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        Set<String> set = setEmptySet;
        String backend = model.getStringConfigValue(ConfigKeys.INSTANCE.getACCELERATOR(), Accelerator.GPU.getLabel());
        if (status == ModelInitializationStatusType.INITIALIZED) {
            setPlus = SetsKt.plus(set, backend);
        } else {
            setPlus = set;
        }
        curModelInstance.put(model.getName(), new ModelInitializationStatus(status, error, setPlus));
        ModelManagerUiState value = getUiState().getValue();
        ModelManagerUiState newUiState = value.copy((991 & 1) != 0 ? value.tasks : null, (991 & 2) != 0 ? value.tasksByCategory : null, (991 & 4) != 0 ? value.modelDownloadStatus : null, (991 & 8) != 0 ? value.modelInitializationStatus : curModelInstance, (991 & 16) != 0 ? value.loadingModelAllowlist : false, (991 & 32) != 0 ? value.loadingModelAllowlistError : null, (991 & 64) != 0 ? value.selectedModel : null, (991 & 128) != 0 ? value.textInputHistory : null, (991 & 256) != 0 ? value.configValuesUpdateTrigger : 0L, (991 & 512) != 0 ? value.modelImportingUpdateTrigger : 0L);
        MutableStateFlow<ModelManagerUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), newUiState)) {
        }
    }

    public final boolean isModelDownloaded(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        model.setUpdatable(false);
        if (checkIfModelDownloaded$default(this, model, model.getVersion(), null, 4, null)) {
            return true;
        }
        for (ModelFile updatableFile : model.getUpdatableModelFiles()) {
            if (!(updatableFile.getCommitHash().length() == 0) && checkIfModelDownloaded(model, updatableFile.getCommitHash(), updatableFile.getFileName())) {
                model.setVersion(updatableFile.getCommitHash());
                model.setDownloadFileName(updatableFile.getFileName());
                model.setUpdatable(true);
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean checkIfModelDownloaded$default(ModelManagerViewModel modelManagerViewModel, Model model, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkIfModelDownloaded");
        }
        if ((i & 4) != 0) {
            str2 = model.getDownloadFileName();
        }
        return modelManagerViewModel.checkIfModelDownloaded(model, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean checkIfModelDownloaded(com.google.ai.edge.gallery.data.Model r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel.checkIfModelDownloaded(com.google.ai.edge.gallery.data.Model, java.lang.String, java.lang.String):boolean");
    }
}
