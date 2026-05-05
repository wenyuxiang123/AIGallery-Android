package com.google.ai.edge.gallery.p006ui.llmsingleturn;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MenuKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.os.BundleKt;
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.data.BuiltInTaskId;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.p006ui.common.ErrorDialogKt;
import com.google.ai.edge.gallery.p006ui.common.ModelPageAppBarKt;
import com.google.ai.edge.gallery.p006ui.common.chat.ModelDownloadStatusInfoPanelKt;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelInitializationStatus;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelInitializationStatusType;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: LlmSingleTurnScreen.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m921d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\u001a7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m922d2 = {"TAG", "", "LlmSingleTurnScreen", "", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "navigateUp", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel;", "(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnViewModel;Landroidx/compose/runtime/Composer;II)V", "app_debug", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "uiState", "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;", "navigatingUp", "", "showErrorDialog", "mainUiVisible", "animatedAlpha", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class LlmSingleTurnScreenKt {
    private static final String TAG = "AGLlmSingleTurnScreen";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$42(ModelManagerViewModel modelManagerViewModel, Function0 function0, Modifier modifier, LlmSingleTurnViewModel llmSingleTurnViewModel, int i, int i2, Composer composer, int i3) {
        LlmSingleTurnScreen(modelManagerViewModel, function0, modifier, llmSingleTurnViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LlmSingleTurnScreen(final ModelManagerViewModel modelManagerViewModel, final Function0<Unit> navigateUp, Modifier modifier, LlmSingleTurnViewModel viewModel, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        LlmSingleTurnViewModel llmSingleTurnViewModel;
        Composer $composer2;
        Modifier modifier3;
        LlmSingleTurnViewModel viewModel2;
        int $dirty;
        MutableState showErrorDialog$delegate;
        int $dirty2;
        String str;
        final Context context;
        CoroutineScope scope;
        final Model selectedModel;
        Context context2;
        String str2;
        ModelDownloadStatus curDownloadStatus;
        State uiState$delegate;
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(navigateUp, "navigateUp");
        Composer $composer3 = $composer.startRestartGroup(631368816);
        ComposerKt.sourceInformation($composer3, "C(LlmSingleTurnScreen)P(!1,2)73@3165L16,74@3217L16,76@3304L24,77@3358L7,78@3388L34,79@3448L34,81@3509L254,94@3812L315,94@3800L327,106@4328L348,106@4274L402,119@4822L100,119@4780L142,125@4974L767,147@5747L3344,123@4926L4165:LlmSingleTurnScreen.kt#32uq7b");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer3.changedInstance(modelManagerViewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty3 |= $composer3.changedInstance(navigateUp) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty3 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty3 |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                llmSingleTurnViewModel = viewModel;
                int i3 = $composer3.changedInstance(llmSingleTurnViewModel) ? 2048 : 1024;
                $dirty3 |= i3;
            } else {
                llmSingleTurnViewModel = viewModel;
            }
            $dirty3 |= i3;
        } else {
            llmSingleTurnViewModel = viewModel;
        }
        if ($composer3.shouldExecute(($dirty3 & 1171) != 1170, $dirty3 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "70@3001L15");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i & 8) != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer3, 1890788296, "CC(hiltViewModel)P(1)51@2126L7,55@2260L46:HiltViewModel.kt#9mcars");
                    ViewModelStoreOwner viewModelStoreOwner$iv = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer3, LocalViewModelStoreOwner.$stable);
                    if (viewModelStoreOwner$iv == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    int $changed$iv$iv = (0 & 14) | (0 & 112);
                    ComposerKt.sourceInformationMarkerStart($composer3, 1192010736, "CC(hiltViewModel)P(1)38@1622L7,43@1774L47,44@1833L54:HiltViewModel.kt#gplxbw");
                    ViewModelProvider.Factory factory$iv$iv = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner$iv, $composer3, $changed$iv$iv & 14);
                    int $changed$iv$iv$iv = ($changed$iv$iv & 14) | ($changed$iv$iv & 112);
                    modifier3 = modifier4;
                    ComposerKt.sourceInformationMarkerStart($composer3, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
                    CreationExtras extras$iv$iv$iv = viewModelStoreOwner$iv instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner$iv).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                    ViewModel viewModel3 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LlmSingleTurnViewModel.class), viewModelStoreOwner$iv, (String) null, factory$iv$iv, extras$iv$iv$iv, $composer3, (($changed$iv$iv$iv << 3) & 112) | (($changed$iv$iv$iv << 3) & 896) | (($changed$iv$iv$iv << 3) & 7168) | (($changed$iv$iv$iv << 3) & 57344), 0);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    viewModel2 = (LlmSingleTurnViewModel) viewModel3;
                    $dirty = $dirty3 & (-7169);
                } else {
                    modifier3 = modifier4;
                    $dirty = $dirty3;
                    viewModel2 = llmSingleTurnViewModel;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty3 &= -7169;
                }
                $dirty = $dirty3;
                modifier3 = modifier2;
                viewModel2 = llmSingleTurnViewModel;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(631368816, $dirty, -1, "com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreen (LlmSingleTurnScreen.kt:71)");
            }
            final Task task = modelManagerViewModel.getTaskById(BuiltInTaskId.LLM_PROMPT_LAB);
            Intrinsics.checkNotNull(task);
            final State modelManagerUiState$delegate = SnapshotStateKt.collectAsState(modelManagerViewModel.getUiState(), null, $composer3, 0, 1);
            final State uiState$delegate2 = SnapshotStateKt.collectAsState(viewModel2.getUiState(), null, $composer3, 0, 1);
            Model selectedModel2 = LlmSingleTurnScreen$lambda$0(modelManagerUiState$delegate).getSelectedModel();
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer3.rememberedValue();
            if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(value$iv$iv);
                it$iv$iv = value$iv$iv;
            }
            final CoroutineScope scope2 = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context3 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 1155061682, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState navigatingUp$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1155063602, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            MutableState showErrorDialog$delegate2 = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1155065774, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            boolean invalid$iv = (($dirty & 112) == 32) | $composer3.changedInstance(scope2) | $composer3.changedInstance(task) | $composer3.changedInstance(modelManagerViewModel) | $composer3.changedInstance(context3);
            Object value$iv3 = $composer3.rememberedValue();
            if (invalid$iv || value$iv3 == Composer.INSTANCE.getEmpty()) {
                showErrorDialog$delegate = showErrorDialog$delegate2;
                $dirty2 = $dirty;
                str = "CC(remember):LlmSingleTurnScreen.kt#9igjgp";
                context = context3;
                scope = scope2;
                selectedModel = selectedModel2;
                value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$9$lambda$8(navigateUp, scope2, navigatingUp$delegate, task, modelManagerViewModel, context);
                    }
                };
                $composer3.updateRememberedValue(value$iv3);
            } else {
                showErrorDialog$delegate = showErrorDialog$delegate2;
                context = context3;
                scope = scope2;
                $dirty2 = $dirty;
                str = "CC(remember):LlmSingleTurnScreen.kt#9igjgp";
                selectedModel = selectedModel2;
            }
            final Function0 handleNavigateUp = (Function0) value$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1155075531, str);
            boolean invalid$iv2 = $composer3.changed(modelManagerUiState$delegate) | $composer3.changedInstance(selectedModel) | $composer3.changed(uiState$delegate2) | $composer3.changed(handleNavigateUp);
            Object it$iv3 = $composer3.rememberedValue();
            if (invalid$iv2 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = new Function0() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$11$lambda$10(selectedModel, handleNavigateUp, modelManagerUiState$delegate, uiState$delegate2);
                    }
                };
                $composer3.updateRememberedValue(value$iv4);
                it$iv3 = value$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            BackHandlerKt.BackHandler(false, (Function0) it$iv3, $composer3, 0, 1);
            ModelDownloadStatus curDownloadStatus2 = LlmSingleTurnScreen$lambda$0(modelManagerUiState$delegate).getModelDownloadStatus().get(selectedModel.getName());
            String name = selectedModel.getName();
            ComposerKt.sourceInformationMarkerStart($composer3, 1155092076, str);
            Context context4 = context;
            boolean invalid$iv3 = $composer3.changed(curDownloadStatus2) | $composer3.changedInstance(selectedModel) | $composer3.changedInstance(modelManagerViewModel) | $composer3.changedInstance(context4) | $composer3.changedInstance(task);
            Object value$iv5 = $composer3.rememberedValue();
            if (invalid$iv3 || value$iv5 == Composer.INSTANCE.getEmpty()) {
                context2 = context4;
                str2 = name;
                curDownloadStatus = curDownloadStatus2;
                uiState$delegate = uiState$delegate2;
                value$iv5 = new LlmSingleTurnScreenKt$LlmSingleTurnScreen$2$1(curDownloadStatus2, selectedModel, modelManagerViewModel, context4, task, navigatingUp$delegate, null);
                $composer3.updateRememberedValue(value$iv5);
            } else {
                context2 = context4;
                str2 = name;
                curDownloadStatus = curDownloadStatus2;
                uiState$delegate = uiState$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(curDownloadStatus, str2, (Function2) value$iv5, $composer3, 0);
            final ModelInitializationStatus modelInitializationStatus = LlmSingleTurnScreen$lambda$0(modelManagerUiState$delegate).getModelInitializationStatus().get(selectedModel.getName());
            ComposerKt.sourceInformationMarkerStart($composer3, 1155107636, str);
            boolean invalid$iv4 = $composer3.changedInstance(modelInitializationStatus);
            Object it$iv4 = $composer3.rememberedValue();
            if (invalid$iv4 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv6 = (Function2) new LlmSingleTurnScreenKt$LlmSingleTurnScreen$3$1(modelInitializationStatus, showErrorDialog$delegate, null);
                $composer3.updateRememberedValue(value$iv6);
                it$iv4 = value$iv6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(modelInitializationStatus, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv4, $composer3, 0);
            final Model model = selectedModel;
            final CoroutineScope coroutineScope = scope;
            final Context context5 = context2;
            final State state = uiState$delegate;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1361937196, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$20(task, model, modelManagerViewModel, handleNavigateUp, coroutineScope, context5, state, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54);
            final ModelDownloadStatus modelDownloadStatus = curDownloadStatus;
            final Model model2 = selectedModel;
            final LlmSingleTurnViewModel llmSingleTurnViewModel2 = viewModel2;
            final MutableState mutableState = showErrorDialog$delegate;
            $composer2 = $composer3;
            ScaffoldKt.m4398ScaffoldTvnljyQ(modifier3, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1325210111, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$41(modelDownloadStatus, modelInitializationStatus, model2, llmSingleTurnViewModel2, modelManagerViewModel, task, mutableState, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty2 >> 6) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            viewModel2 = llmSingleTurnViewModel;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            final LlmSingleTurnViewModel llmSingleTurnViewModel3 = viewModel2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$42(modelManagerViewModel, navigateUp, modifier5, llmSingleTurnViewModel3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ModelManagerUiState LlmSingleTurnScreen$lambda$0(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final LlmSingleTurnUiState LlmSingleTurnScreen$lambda$1(State<LlmSingleTurnUiState> state) {
        Object thisObj$iv = state.getValue();
        return (LlmSingleTurnUiState) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LlmSingleTurnScreen$lambda$3(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void LlmSingleTurnScreen$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean LlmSingleTurnScreen$lambda$6(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LlmSingleTurnScreen$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job LlmSingleTurnScreen$lambda$9$lambda$8(Function0 $navigateUp, CoroutineScope $scope, MutableState $navigatingUp$delegate, Task $task, ModelManagerViewModel $modelManagerViewModel, Context $context) {
        LlmSingleTurnScreen$lambda$4($navigatingUp$delegate, true);
        $navigateUp.invoke();
        return BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getDefault(), null, new LlmSingleTurnScreenKt$LlmSingleTurnScreen$handleNavigateUp$1$1$1($task, $modelManagerViewModel, $context, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$11$lambda$10(Model $selectedModel, Function0 $handleNavigateUp, State $modelManagerUiState$delegate, State $uiState$delegate) {
        ModelInitializationStatus modelInitializationStatus = LlmSingleTurnScreen$lambda$0($modelManagerUiState$delegate).getModelInitializationStatus().get($selectedModel.getName());
        boolean isModelInitializing = (modelInitializationStatus != null ? modelInitializationStatus.getStatus() : null) == ModelInitializationStatusType.INITIALIZING;
        if (!isModelInitializing && !LlmSingleTurnScreen$lambda$1($uiState$delegate).getInProgress()) {
            $handleNavigateUp.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$20(final Task $task, Model $selectedModel, final ModelManagerViewModel $modelManagerViewModel, final Function0 $handleNavigateUp, final CoroutineScope $scope, final Context $context, State $uiState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C133@5254L22,134@5304L422,132@5217L11,126@4982L753:LlmSingleTurnScreen.kt#32uq7b");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1361937196, $changed, -1, "com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreen.<anonymous> (LlmSingleTurnScreen.kt:126)");
            }
            boolean inProgress = LlmSingleTurnScreen$lambda$1($uiState$delegate).getInProgress();
            boolean preparing = LlmSingleTurnScreen$lambda$1($uiState$delegate).getPreparing();
            ComposerKt.sourceInformationMarkerStart($composer, -1143370942, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            boolean invalid$iv = $composer.changed($handleNavigateUp);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$20$lambda$15$lambda$14($handleNavigateUp);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            Function0 function0 = (Function0) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1143368942, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            boolean invalid$iv2 = $composer.changedInstance($scope) | $composer.changedInstance($modelManagerViewModel) | $composer.changedInstance($context) | $composer.changedInstance($task);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$20$lambda$17$lambda$16($scope, $modelManagerViewModel, $context, $task, (Model) obj, (Model) obj2);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            Function2 function2 = (Function2) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1143372137, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            Object it$iv3 = $composer.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$20$lambda$19$lambda$18((Map) obj, (Map) obj2);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ModelPageAppBarKt.ModelPageAppBar($task, $selectedModel, $modelManagerViewModel, function0, function2, inProgress, preparing, null, false, null, false, false, false, (Function2) it$iv3, false, null, null, $composer, 0, 3072, 122752);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$20$lambda$19$lambda$18(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        Intrinsics.checkNotNullParameter(map2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$20$lambda$15$lambda$14(Function0 $handleNavigateUp) {
        $handleNavigateUp.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$20$lambda$17$lambda$16(CoroutineScope $scope, ModelManagerViewModel $modelManagerViewModel, Context $context, Task $task, Model prevModel, Model newSelectedModel) {
        Intrinsics.checkNotNullParameter(prevModel, "prevModel");
        Intrinsics.checkNotNullParameter(newSelectedModel, "newSelectedModel");
        BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getDefault(), null, new LlmSingleTurnScreenKt$LlmSingleTurnScreen$4$2$1$1(prevModel, newSelectedModel, $modelManagerViewModel, $context, $task, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$41(ModelDownloadStatus $curDownloadStatus, ModelInitializationStatus $modelInitializationStatus, final Model $selectedModel, final LlmSingleTurnViewModel $viewModel, final ModelManagerViewModel $modelManagerViewModel, final Task $task, final MutableState $showErrorDialog$delegate, final PaddingValues innerPadding, Composer $composer, int $changed) {
        LlmSingleTurnScreenKt$LlmSingleTurnScreen$5$1$1$1 value$iv;
        Function0<ComposeUiNode> function0;
        String error;
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        ComposerKt.sourceInformation($composer, "C152@5943L7,153@6025L7,148@5769L3318:LlmSingleTurnScreen.kt#32uq7b");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(innerPadding) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1325210111, $dirty2, -1, "com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreen.<anonymous> (LlmSingleTurnScreen.kt:148)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float top = innerPadding.getTop();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd($composer);
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(innerPadding, (LayoutDirection) objConsume);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(companion, fCalculateStartPadding, top, PaddingKt.calculateStartPadding(innerPadding, (LayoutDirection) objConsume2), 0.0f, 8, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i2 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1865513714, "C158@6215L44,159@6298L35,159@6266L67,160@6361L66,167@6711L25,161@6434L1818,215@8607L2,218@8733L170,212@8416L487:LlmSingleTurnScreen.kt#32uq7b");
            boolean modelDownloaded = ($curDownloadStatus != null ? $curDownloadStatus.getStatus() : null) == ModelDownloadStatusType.SUCCEEDED;
            ComposerKt.sourceInformationMarkerStart($composer, -1307101837, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            Object value$iv2 = $composer.rememberedValue();
            if (value$iv2 == Composer.INSTANCE.getEmpty()) {
                value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(modelDownloaded), null, 2, null);
                $composer.updateRememberedValue(value$iv2);
            }
            MutableState mainUiVisible$delegate = (MutableState) value$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            Boolean boolValueOf = Boolean.valueOf(modelDownloaded);
            ComposerKt.sourceInformationMarkerStart($composer, -1307099190, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            boolean invalid$iv = $composer.changed(modelDownloaded);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new LlmSingleTurnScreenKt$LlmSingleTurnScreen$5$1$1$1(modelDownloaded, mainUiVisible$delegate, null);
                $composer.updateRememberedValue(value$iv);
            } else {
                value$iv = it$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) value$iv, $composer, 0);
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(LlmSingleTurnScreen$lambda$41$lambda$40$lambda$22(mainUiVisible$delegate) ? 1.0f : 0.0f, null, 0.0f, null, null, $composer, 0, 30);
            Alignment contentAlignment$iv2 = Alignment.INSTANCE.getBottomCenter();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -1307085984, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            boolean invalid$iv2 = $composer.changed(stateAnimateFloatAsState);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$41$lambda$40$lambda$27$lambda$26(stateAnimateFloatAsState, (GraphicsLayerScope) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv2 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifier$iv2 = GraphicsLayerModifierKt.graphicsLayer(modifierFillMaxSize$default, (Function1) it$iv2);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
            int $changed$iv$iv2 = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor2;
                $composer.createNode(function0);
            } else {
                function0 = constructor2;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i4 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1383008070, "C171@6840L695,188@7560L673,169@6756L1488:LlmSingleTurnScreen.kt#32uq7b");
            VerticalSplitViewKt.m11139VerticalSplitViewugZX9yg(ComposableLambdaKt.rememberComposableLambda(-1853762197, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$41$lambda$40$lambda$35$lambda$32($selectedModel, $viewModel, $modelManagerViewModel, $task, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(2021086154, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$41$lambda$40$lambda$35$lambda$34($task, $selectedModel, $viewModel, $modelManagerViewModel, innerPadding, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 0.0f, $composer, 438, MenuKt.InTransitionDuration);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            boolean z = !modelDownloaded;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1307025335, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            Object it$iv3 = $composer.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$LlmSingleTurnScreen$5$1$4$1
                    @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
                        return Unit.INSTANCE;
                    }
                };
                $composer.updateRememberedValue(value$iv4);
                it$iv3 = value$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AnimatedVisibilityKt.AnimatedVisibility(z, SuspendingPointerInputFilterKt.pointerInput(companion2, unit, (PointerInputEventHandler) it$iv3), EnterExitTransitionKt.m1159scaleInL8ZKhE$default(null, 0.9f, 0L, 5, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.m1161scaleOutL8ZKhE$default(null, 0.9f, 0L, 5, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(1152763743, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$41$lambda$40$lambda$37($selectedModel, $task, $modelManagerViewModel, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 200064, 16);
            if (LlmSingleTurnScreen$lambda$6($showErrorDialog$delegate)) {
                $composer.startReplaceGroup(-1862752762);
                ComposerKt.sourceInformation($composer, "229@9035L27,227@8942L131");
                if ($modelInitializationStatus == null || (error = $modelInitializationStatus.getError()) == null) {
                    error = "";
                }
                ComposerKt.sourceInformationMarkerStart($composer, -1307011614, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
                Object it$iv4 = $composer.rememberedValue();
                if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv5 = new Function0() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LlmSingleTurnScreenKt.LlmSingleTurnScreen$lambda$41$lambda$40$lambda$39$lambda$38($showErrorDialog$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv5);
                    it$iv4 = value$iv5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ErrorDialogKt.ErrorDialog(error, (Function0) it$iv4, $composer, 48);
            } else {
                $composer.startReplaceGroup(-1871618917);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final boolean LlmSingleTurnScreen$lambda$41$lambda$40$lambda$22(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LlmSingleTurnScreen$lambda$41$lambda$40$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final float LlmSingleTurnScreen$lambda$41$lambda$40$lambda$25(State<Float> state) {
        Object thisObj$iv = state.getValue();
        return ((Number) thisObj$iv).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$41$lambda$40$lambda$27$lambda$26(State $animatedAlpha$delegate, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(LlmSingleTurnScreen$lambda$41$lambda$40$lambda$25($animatedAlpha$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$41$lambda$40$lambda$35$lambda$32(final Model $selectedModel, final LlmSingleTurnViewModel $viewModel, ModelManagerViewModel $modelManagerViewModel, final Task $task, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C176@7034L337,184@7409L50,172@6854L669:LlmSingleTurnScreen.kt#32uq7b");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1853762197, $changed, -1, "com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LlmSingleTurnScreen.kt:172)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 945963068, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($viewModel) | $composer.changedInstance($task) | $composer.changedInstance($selectedModel);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LlmSingleTurnScreenKt.m552x7b723b($viewModel, $task, $selectedModel, (String) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            Function1 function1 = (Function1) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 945974781, "CC(remember):LlmSingleTurnScreen.kt#9igjgp");
            boolean invalid$iv2 = $composer.changedInstance($viewModel);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LlmSingleTurnScreenKt.m553x610781a9($viewModel, (Model) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            PromptTemplatesPanelKt.PromptTemplatesPanel($selectedModel, $viewModel, $modelManagerViewModel, function1, (Function1) it$iv2, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), $composer, ProfileVerifier.CompilationStatus.f249xf2722a21, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: LlmSingleTurnScreen$lambda$41$lambda$40$lambda$35$lambda$32$lambda$29$lambda$28 */
    public static final Unit m552x7b723b(LlmSingleTurnViewModel $viewModel, Task $task, Model $selectedModel, String fullPrompt) {
        Intrinsics.checkNotNullParameter(fullPrompt, "fullPrompt");
        $viewModel.generateResponse($task, $selectedModel, fullPrompt);
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            firebaseAnalytics.logEvent(GalleryEvent.GENERATE_ACTION.getId(), BundleKt.bundleOf(TuplesKt.m929to("capability_name", $task.getId()), TuplesKt.m929to("model_id", $selectedModel.getName())));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: LlmSingleTurnScreen$lambda$41$lambda$40$lambda$35$lambda$32$lambda$31$lambda$30 */
    public static final Unit m553x610781a9(LlmSingleTurnViewModel $viewModel, Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        $viewModel.stopResponse(model);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$41$lambda$40$lambda$35$lambda$34(Task $task, Model $selectedModel, LlmSingleTurnViewModel $viewModel, ModelManagerViewModel $modelManagerViewModel, PaddingValues $innerPadding, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C192@7725L12,189@7574L647:LlmSingleTurnScreen.kt#32uq7b");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2021086154, $changed, -1, "com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LlmSingleTurnScreen.kt:189)");
            }
            Alignment contentAlignment$iv = Alignment.INSTANCE.getBottomCenter();
            Modifier modifier$iv = BackgroundKt.m1359backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11228getAgentBubbleBgColor0d7_KjU(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i2 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1058235491, "C:LlmSingleTurnScreen.kt#32uq7b");
            if ($task.getModels().indexOf($selectedModel) >= 0) {
                $composer.startReplaceGroup(-1058192247);
                ComposerKt.sourceInformation($composer, "195@7852L339");
                ResponsePanelKt.ResponsePanel($task, $selectedModel, $viewModel, $modelManagerViewModel, PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, $innerPadding.getBottom(), 7, null), $composer, 0, 0);
            } else {
                $composer.startReplaceGroup(-1065976130);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$41$lambda$40$lambda$37(Model $selectedModel, Task $task, ModelManagerViewModel $modelManagerViewModel, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C219@8743L152:LlmSingleTurnScreen.kt#32uq7b");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1152763743, $changed, -1, "com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnScreen.<anonymous>.<anonymous>.<anonymous> (LlmSingleTurnScreen.kt:219)");
        }
        ModelDownloadStatusInfoPanelKt.ModelDownloadStatusInfoPanel($selectedModel, $task, $modelManagerViewModel, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LlmSingleTurnScreen$lambda$41$lambda$40$lambda$39$lambda$38(MutableState $showErrorDialog$delegate) {
        LlmSingleTurnScreen$lambda$7($showErrorDialog$delegate, false);
        return Unit.INSTANCE;
    }
}
