package com.google.ai.edge.gallery.p006ui.benchmark;

import android.os.Bundle;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.data.Accelerator;
import com.google.ai.edge.gallery.data.Config;
import com.google.ai.edge.gallery.data.ConfigKey;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.ConfigKt;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.NumberSliderConfig;
import com.google.ai.edge.gallery.data.SegmentedButtonConfig;
import com.google.ai.edge.gallery.data.ValueType;
import com.google.ai.edge.gallery.p006ui.common.ConfigDialogKt;
import com.google.ai.edge.gallery.p006ui.common.UtilsKt;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: BenchmarkScreen.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m921d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001a$\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a$\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0003X\u008a\u008e\u0002"}, m922d2 = {"BenchmarkScreen", "", "initialModel", "Lcom/google/ai/edge/gallery/data/Model;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkViewModel;", "onBackClicked", "Lkotlin/Function0;", "(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Landroidx/compose/ui/Modifier;Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "getStringConfigValue", "", "values", "", "", "key", "Lcom/google/ai/edge/gallery/data/ConfigKey;", "getIntConfigValue", "", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/ui/benchmark/BenchmarkUiState;", "enableBackButton", "", "showRunBenchmarkConfirmationDialog", "selectedModelName", "selectedModel"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class BenchmarkScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$57(Model model, ModelManagerViewModel modelManagerViewModel, Modifier modifier, BenchmarkViewModel benchmarkViewModel, Function0 function0, int i, int i2, Composer composer, int i3) {
        BenchmarkScreen(model, modelManagerViewModel, modifier, benchmarkViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
    public static final void BenchmarkScreen(final Model initialModel, final ModelManagerViewModel modelManagerViewModel, Modifier modifier, BenchmarkViewModel viewModel, final Function0<Unit> onBackClicked, Composer $composer, final int $changed, final int i) {
        final BenchmarkViewModel viewModel2;
        Modifier modifier2;
        BenchmarkViewModel viewModel3;
        Modifier modifier3;
        Modifier modifier4;
        String label;
        Intrinsics.checkNotNullParameter(initialModel, "initialModel");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer $composer2 = $composer.startRestartGroup(-1405809421);
        ComposerKt.sourceInformation($composer2, "C(BenchmarkScreen)P(!3,4)92@4121L16,93@4164L33,94@4242L34,95@4309L101,98@4438L46,100@4512L122,103@4659L54,105@4734L1144,146@5930L177,160@6449L186,160@6398L237,169@6639L4539:BenchmarkScreen.kt#aos0mq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(initialModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(modelManagerViewModel) ? 32 : 16;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                viewModel2 = viewModel;
                int i2 = $composer2.changedInstance(viewModel2) ? 2048 : 1024;
                $dirty |= i2;
            } else {
                viewModel2 = viewModel;
            }
            $dirty |= i2;
        } else {
            viewModel2 = viewModel;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onBackClicked) ? 16384 : 8192;
        }
        if ($composer2.shouldExecute(($dirty & 9235) != 9234, $dirty & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "89@4036L15");
            if (($changed & 1) == 0 || $composer2.getDefaultsInvalid()) {
                Modifier.Companion modifier5 = (i & 4) != 0 ? Modifier.INSTANCE : modifier;
                if ((i & 8) != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer2, 1192010736, "CC(hiltViewModel)P(1)38@1622L7,43@1774L47,44@1833L54:HiltViewModel.kt#gplxbw");
                    ViewModelStoreOwner viewModelStoreOwner$iv = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer2, LocalViewModelStoreOwner.$stable);
                    if (viewModelStoreOwner$iv == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModelProvider.Factory factory$iv = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner$iv, $composer2, 0 & 14);
                    int $changed$iv$iv = (0 & 14) | (0 & 112);
                    ComposerKt.sourceInformationMarkerStart($composer2, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
                    CreationExtras extras$iv$iv = viewModelStoreOwner$iv instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner$iv).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                    ViewModel viewModel4 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(BenchmarkViewModel.class), viewModelStoreOwner$iv, (String) null, factory$iv, extras$iv$iv, $composer2, (($changed$iv$iv << 3) & 896) | (($changed$iv$iv << 3) & 112) | (($changed$iv$iv << 3) & 7168) | (($changed$iv$iv << 3) & 57344), 0);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    $dirty &= -7169;
                    viewModel2 = (BenchmarkViewModel) viewModel4;
                    modifier3 = modifier5;
                } else {
                    viewModel2 = viewModel;
                    modifier3 = modifier5;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty &= -7169;
                }
                modifier3 = modifier;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1405809421, $dirty, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreen (BenchmarkScreen.kt:91)");
            }
            State uiState$delegate = SnapshotStateKt.collectAsState(viewModel2.getUiState(), null, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, 1931855540, "CC(remember):BenchmarkScreen.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                modifier4 = modifier3;
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            } else {
                modifier4 = modifier3;
            }
            final MutableState enableBackButton$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1931858037, "CC(remember):BenchmarkScreen.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(mutableStateMutableStateOf$default);
                it$iv2 = mutableStateMutableStateOf$default;
            }
            final MutableState showRunBenchmarkConfirmationDialog$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1931860248, "CC(remember):BenchmarkScreen.kt#9igjgp");
            boolean invalid$iv = false;
            Object it$iv3 = $composer2.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Iterable $this$filter$iv = modelManagerViewModel.getAllDownloadedModels();
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$filter$iv) {
                    boolean invalid$iv2 = invalid$iv;
                    Model it = (Model) element$iv$iv;
                    if (it.isLlm()) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                    invalid$iv = invalid$iv2;
                }
                Iterable $this$map$iv = (List) destination$iv$iv;
                Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
                for (Object item$iv$iv : $this$map$iv) {
                    Model it2 = (Model) item$iv$iv;
                    destination$iv$iv2.add(it2.getName());
                    $this$map$iv = $this$map$iv;
                }
                Object value$iv2 = (List) destination$iv$iv2;
                $composer2.updateRememberedValue(value$iv2);
                it$iv3 = value$iv2;
            }
            final List downloadedLlmModelNames = (List) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1931864321, "CC(remember):BenchmarkScreen.kt#9igjgp");
            Object it$iv4 = $composer2.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialModel.getName(), null, 2, null);
                $composer2.updateRememberedValue(mutableStateMutableStateOf$default2);
                it$iv4 = mutableStateMutableStateOf$default2;
            }
            final MutableState selectedModelName$delegate = (MutableState) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            String strBenchmarkScreen$lambda$11 = BenchmarkScreen$lambda$11(selectedModelName$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1931866765, "CC(remember):BenchmarkScreen.kt#9igjgp");
            boolean invalid$iv3 = $composer2.changed(strBenchmarkScreen$lambda$11);
            Object it$iv5 = $composer2.rememberedValue();
            if (invalid$iv3 || it$iv5 == Composer.INSTANCE.getEmpty()) {
                Model modelByName = modelManagerViewModel.getModelByName(BenchmarkScreen$lambda$11(selectedModelName$delegate));
                Intrinsics.checkNotNull(modelByName);
                Object value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(modelByName, null, 2, null);
                $composer2.updateRememberedValue(value$iv3);
                it$iv5 = value$iv3;
            }
            final MutableState selectedModel$delegate = (MutableState) it$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1931871401, "CC(remember):BenchmarkScreen.kt#9igjgp");
            Object it$iv6 = $composer2.rememberedValue();
            if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = SnapshotStateKt.mutableStateListOf();
                $composer2.updateRememberedValue(value$iv4);
                it$iv6 = value$iv4;
            }
            final SnapshotStateList filteredResults = (SnapshotStateList) it$iv6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Model modelBenchmarkScreen$lambda$14 = BenchmarkScreen$lambda$14(selectedModel$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1931874891, "CC(remember):BenchmarkScreen.kt#9igjgp");
            boolean invalid$iv4 = $composer2.changed(modelBenchmarkScreen$lambda$14);
            Object it$iv7 = $composer2.rememberedValue();
            if (invalid$iv4 || it$iv7 == Composer.INSTANCE.getEmpty()) {
                SnapshotStateList $this$BenchmarkScreen_u24lambda_u2419_u24lambda_u2418 = SnapshotStateKt.mutableStateListOf();
                ConfigKey accelerator = ConfigKeys.INSTANCE.getACCELERATOR();
                Accelerator accelerator2 = (Accelerator) CollectionsKt.getOrNull(BenchmarkScreen$lambda$14(selectedModel$delegate).getAccelerators(), 0);
                if (accelerator2 == null || (label = accelerator2.getLabel()) == null) {
                    label = Accelerator.CPU.getLabel();
                }
                Iterable $this$map$iv2 = BenchmarkScreen$lambda$14(selectedModel$delegate).getAccelerators();
                Collection destination$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
                for (Object item$iv$iv2 : $this$map$iv2) {
                    Accelerator it3 = (Accelerator) item$iv$iv2;
                    destination$iv$iv3.add(it3.getLabel());
                    $this$map$iv2 = $this$map$iv2;
                }
                $this$BenchmarkScreen_u24lambda_u2419_u24lambda_u2418.add(new SegmentedButtonConfig(accelerator, label, (List) destination$iv$iv3, false));
                $this$BenchmarkScreen_u24lambda_u2419_u24lambda_u2418.add(new NumberSliderConfig(ConfigKeys.INSTANCE.getPREFILL_TOKENS(), 16.0f, BenchmarkScreen$lambda$14(selectedModel$delegate).getLlmMaxToken(), 256.0f, ValueType.INT, false, 32, null));
                $this$BenchmarkScreen_u24lambda_u2419_u24lambda_u2418.add(new NumberSliderConfig(ConfigKeys.INSTANCE.getDECODE_TOKENS(), 16.0f, 1024.0f, 256.0f, ValueType.INT, false, 32, null));
                $this$BenchmarkScreen_u24lambda_u2419_u24lambda_u2418.add(new NumberSliderConfig(ConfigKeys.INSTANCE.getNUMBER_OF_RUNS(), 1.0f, 10.0f, 3.0f, ValueType.INT, false, 32, null));
                $composer2.updateRememberedValue($this$BenchmarkScreen_u24lambda_u2419_u24lambda_u2418);
                it$iv7 = $this$BenchmarkScreen_u24lambda_u2419_u24lambda_u2418;
            }
            final SnapshotStateList<Config> configs = (SnapshotStateList) it$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1931912196, "CC(remember):BenchmarkScreen.kt#9igjgp");
            boolean invalid$iv5 = $composer2.changed(configs);
            int $i$f$cache = 0;
            Object it$iv8 = $composer2.rememberedValue();
            if (invalid$iv5 || it$iv8 == Composer.INSTANCE.getEmpty()) {
                boolean invalid$iv6 = false;
                SnapshotStateMap $this$BenchmarkScreen_u24lambda_u2421_u24lambda_u2420 = SnapshotStateKt.mutableStateMapOf();
                for (Config config : configs) {
                    $this$BenchmarkScreen_u24lambda_u2421_u24lambda_u2420.put(config.getKey().getLabel(), config.getDefaultValue());
                    $i$f$cache = $i$f$cache;
                    invalid$iv6 = invalid$iv6;
                    it$iv8 = it$iv8;
                }
                $composer2.updateRememberedValue($this$BenchmarkScreen_u24lambda_u2421_u24lambda_u2420);
                it$iv8 = $this$BenchmarkScreen_u24lambda_u2421_u24lambda_u2420;
            }
            final SnapshotStateMap values = (SnapshotStateMap) it$iv8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final int sumOfPrefillAndDecodeTokens = getIntConfigValue(values, ConfigKeys.INSTANCE.getPREFILL_TOKENS()) + getIntConfigValue(values, ConfigKeys.INSTANCE.getDECODE_TOKENS());
            final int maxToken = BenchmarkScreen$lambda$14(selectedModel$delegate).getLlmMaxToken();
            String strBenchmarkScreen$lambda$112 = BenchmarkScreen$lambda$11(selectedModelName$delegate);
            List<BenchmarkResultInfo> results = BenchmarkScreen$lambda$0(uiState$delegate).getResults();
            ComposerKt.sourceInformationMarkerStart($composer2, 1931928813, "CC(remember):BenchmarkScreen.kt#9igjgp");
            boolean invalid$iv7 = $composer2.changed(uiState$delegate);
            Object it$iv9 = $composer2.rememberedValue();
            if (invalid$iv7 || it$iv9 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = (Function2) new BenchmarkScreenKt$BenchmarkScreen$1$1(filteredResults, uiState$delegate, selectedModelName$delegate, null);
                $composer2.updateRememberedValue(value$iv5);
                it$iv9 = value$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(strBenchmarkScreen$lambda$112, results, (Function2) it$iv9, $composer2, 0);
            Modifier modifier$iv = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor);
            } else {
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i4 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 268528070, "C172@6735L1122,203@7905L2731,171@6710L3926,278@10777L28,279@10867L28,280@10916L258,276@10665L509:BenchmarkScreen.kt#aos0mq");
            final BenchmarkViewModel benchmarkViewModel = viewModel2;
            ScaffoldKt.m4398ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.imePadding(Modifier.INSTANCE), ComposableLambdaKt.rememberComposableLambda(-1069622167, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkScreenKt.BenchmarkScreen$lambda$47$lambda$28(downloadedLlmModelNames, selectedModelName$delegate, onBackClicked, enableBackButton$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(858667198, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BenchmarkScreenKt.BenchmarkScreen$lambda$47$lambda$39(configs, values, sumOfPrefillAndDecodeTokens, maxToken, filteredResults, benchmarkViewModel, modelManagerViewModel, selectedModelName$delegate, showRunBenchmarkConfirmationDialog$delegate, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 508);
            boolean showResultsViewer = BenchmarkScreen$lambda$0(uiState$delegate).getShowResultsViewer();
            ComposerKt.sourceInformationMarkerStart($composer2, 1394261225, "CC(remember):BenchmarkScreen.kt#9igjgp");
            Object it$iv10 = $composer2.rememberedValue();
            if (it$iv10 == Composer.INSTANCE.getEmpty()) {
                Object value$iv6 = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(BenchmarkScreenKt.BenchmarkScreen$lambda$47$lambda$41$lambda$40(((Integer) obj).intValue()));
                    }
                };
                $composer2.updateRememberedValue(value$iv6);
                it$iv10 = value$iv6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically$default(null, (Function1) it$iv10, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            ComposerKt.sourceInformationMarkerStart($composer2, 1394264105, "CC(remember):BenchmarkScreen.kt#9igjgp");
            Object it$iv11 = $composer2.rememberedValue();
            if (it$iv11 == Composer.INSTANCE.getEmpty()) {
                Object value$iv7 = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(BenchmarkScreenKt.BenchmarkScreen$lambda$47$lambda$43$lambda$42(((Integer) obj).intValue()));
                    }
                };
                $composer2.updateRememberedValue(value$iv7);
                it$iv11 = value$iv7;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AnimatedVisibilityKt.AnimatedVisibility(showResultsViewer, (Modifier) null, enterTransitionPlus, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) it$iv11, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(1515821013, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BenchmarkScreenKt.BenchmarkScreen$lambda$47$lambda$46(modelManagerViewModel, viewModel2, selectedModelName$delegate, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 200064, 18);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (BenchmarkScreen$lambda$5(showRunBenchmarkConfirmationDialog$delegate)) {
                $composer2 = $composer2;
                $composer2.startReplaceGroup(-234925308);
                ComposerKt.sourceInformation($composer2, "295@11458L46,304@11780L994,296@11528L228,292@11276L1505");
                ComposerKt.sourceInformationMarkerStart($composer2, 1932088961, "CC(remember):BenchmarkScreen.kt#9igjgp");
                Object it$iv12 = $composer2.rememberedValue();
                if (it$iv12 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv8 = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BenchmarkScreenKt.BenchmarkScreen$lambda$49$lambda$48(showRunBenchmarkConfirmationDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv8);
                    it$iv12 = value$iv8;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                final BenchmarkViewModel benchmarkViewModel2 = viewModel2;
                AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0((Function0) it$iv12, ComposableLambdaKt.rememberComposableLambda(-2112679104, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BenchmarkScreenKt.BenchmarkScreen$lambda$53(benchmarkViewModel2, selectedModel$delegate, values, selectedModelName$delegate, showRunBenchmarkConfirmationDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(-1209758526, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BenchmarkScreenKt.BenchmarkScreen$lambda$56(showRunBenchmarkConfirmationDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, ComposableSingletons$BenchmarkScreenKt.INSTANCE.m10819getLambda$306837948$app_debug(), ComposableSingletons$BenchmarkScreenKt.INSTANCE.m10817getLambda$2002861307$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
            } else {
                $composer2 = $composer2;
                $composer2.startReplaceGroup(-246153105);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            viewModel3 = viewModel2;
        } else {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            viewModel3 = viewModel;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier2;
            final BenchmarkViewModel benchmarkViewModel3 = viewModel3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkScreenKt.BenchmarkScreen$lambda$57(initialModel, modelManagerViewModel, modifier6, benchmarkViewModel3, onBackClicked, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BenchmarkUiState BenchmarkScreen$lambda$0(State<BenchmarkUiState> state) {
        Object thisObj$iv = state.getValue();
        return (BenchmarkUiState) thisObj$iv;
    }

    private static final boolean BenchmarkScreen$lambda$2(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final boolean BenchmarkScreen$lambda$5(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void BenchmarkScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BenchmarkScreen$lambda$11(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final Model BenchmarkScreen$lambda$14(MutableState<Model> mutableState) {
        MutableState<Model> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$47$lambda$28(final List $downloadedLlmModelNames, final MutableState $selectedModelName$delegate, final Function0 $onBackClicked, final MutableState $enableBackButton$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C175@6822L598,191@7479L294,173@6745L1104:BenchmarkScreen.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1069622167, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreen.<anonymous>.<anonymous> (BenchmarkScreen.kt:173)");
            }
            AppBarKt.m3537CenterAlignedTopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-85952540, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkScreenKt.BenchmarkScreen$lambda$47$lambda$28$lambda$26($downloadedLlmModelNames, $selectedModelName$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1978637150, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BenchmarkScreenKt.BenchmarkScreen$lambda$47$lambda$28$lambda$27($onBackClicked, $enableBackButton$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableSingletons$BenchmarkScreenKt.INSTANCE.m10815getLambda$1828065703$app_debug(), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$47$lambda$28$lambda$26(List $downloadedLlmModelNames, final MutableState $selectedModelName$delegate, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        ComposerKt.sourceInformation($composer, "C176@6836L572:BenchmarkScreen.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-85952540, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreen.<anonymous>.<anonymous>.<anonymous> (BenchmarkScreen.kt:176)");
            }
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            int $changed$iv$iv = (384 << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -148750958, "C178@6933L40,179@7013L10,180@7075L11,177@6911L202,186@7351L26,182@7128L266:BenchmarkScreen.kt#aos0mq");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.benchmark_model, $composer, 0), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131066);
            String strBenchmarkScreen$lambda$11 = BenchmarkScreen$lambda$11($selectedModelName$delegate);
            int i3 = C2421R.string.select_downloaded_model;
            ComposerKt.sourceInformationMarkerStart($composer, -974616120, "CC(remember):BenchmarkScreen.kt#9igjgp");
            Object value$iv = $composer.rememberedValue();
            if (value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BenchmarkScreenKt.m475x9654a592($selectedModelName$delegate, (String) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BenchmarkModelPickerKt.BenchmarkModelPicker(strBenchmarkScreen$lambda$11, $downloadedLlmModelNames, i3, (Function1) value$iv, $composer, 3072);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkScreen$lambda$47$lambda$28$lambda$26$lambda$25$lambda$24$lambda$23 */
    public static final Unit m475x9654a592(MutableState $selectedModelName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $selectedModelName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$47$lambda$28$lambda$27(Function0 $onBackClicked, MutableState $enableBackButton$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C192@7493L268:BenchmarkScreen.kt#aos0mq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1978637150, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreen.<anonymous>.<anonymous>.<anonymous> (BenchmarkScreen.kt:192)");
            }
            IconButtonKt.IconButton($onBackClicked, null, BenchmarkScreen$lambda$2($enableBackButton$delegate), null, null, null, ComposableSingletons$BenchmarkScreenKt.INSTANCE.m10818getLambda$2089327804$app_debug(), $composer, 1572864, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$47$lambda$39(SnapshotStateList $configs, SnapshotStateMap $values, int $sumOfPrefillAndDecodeTokens, int $maxToken, SnapshotStateList $filteredResults, final BenchmarkViewModel $viewModel, final ModelManagerViewModel $modelManagerViewModel, MutableState $selectedModelName$delegate, final MutableState $showRunBenchmarkConfirmationDialog$delegate, PaddingValues innerPadding, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        long j;
        Function0<ComposeUiNode> function04;
        final MutableState mutableState;
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        ComposerKt.sourceInformation($composer, "C204@7929L2701:BenchmarkScreen.kt#aos0mq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(innerPadding) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(858667198, $dirty, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreen.<anonymous>.<anonymous> (BenchmarkScreen.kt:204)");
            }
            Modifier modifier$iv = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, innerPadding), 0.0f, 1, null);
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopCenter();
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
            ComposerKt.sourceInformationMarkerStart($composer, 1018091426, "C208@8065L2557:BenchmarkScreen.kt#aos0mq");
            Modifier modifier$iv2 = SizeKt.fillMaxSize$default(PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            int $changed$iv$iv2 = (6 << 3) & 112;
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
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i4 = ((6 >> 6) & 112) | 6;
            ColumnScope $this$BenchmarkScreen_u24lambda_u2447_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -905213962, "C211@8242L21,210@8161L815,232@9010L1602:BenchmarkScreen.kt#aos0mq");
            Modifier modifier$iv3 = ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default($this$BenchmarkScreen_u24lambda_u2447_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null);
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(24));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            int $changed$iv$iv3 = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function03 = constructor3;
                $composer.createNode(function03);
            } else {
                function03 = constructor3;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2120786898, "C214@8355L54,218@8522L159,223@8719L10,217@8502L462:BenchmarkScreen.kt#aos0mq");
            ConfigDialogKt.ConfigEditorsPanel($configs, $values, $composer, 0);
            String strStringResource = StringResources_androidKt.stringResource(C2421R.string.benchmark_tokens_limit_message, new Object[]{Integer.valueOf($sumOfPrefillAndDecodeTokens), Integer.valueOf($maxToken)}, $composer, 0);
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium();
            if ($sumOfPrefillAndDecodeTokens > $maxToken) {
                $composer.startReplaceGroup(622617664);
                ComposerKt.sourceInformation($composer, "226@8856L12");
                long jM11243getWarningTextColor0d7_KjU = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11243getWarningTextColor0d7_KjU();
                $composer.endReplaceGroup();
                j = jM11243getWarningTextColor0d7_KjU;
            } else {
                $composer.startReplaceGroup(622619712);
                ComposerKt.sourceInformation($composer, "227@8921L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j = onSurfaceVariant;
            }
            TextKt.m4781TextNvy7gAk(strStringResource, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, $composer, 0, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            Modifier modifier$iv4 = SizeKt.fillMaxWidth$default(PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            Arrangement.Horizontal horizontalArrangement$iv = horizontalM1843spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv4 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv4 = (438 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv4 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer, modifier$iv4);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function04 = constructor4;
                $composer.createNode(function04);
            } else {
                function04 = constructor4;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = ($changed$iv$iv$iv4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i8 = ((438 >> 6) & 112) | 6;
            RowScope $this$BenchmarkScreen_u24lambda_u2447_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437_u24lambda_u2436 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -893439029, "C240@9356L390,238@9262L752,259@10154L190,257@10057L543:BenchmarkScreen.kt#aos0mq");
            boolean z = !$filteredResults.isEmpty();
            Modifier modifierWeight$default = RowScope.weight$default($this$BenchmarkScreen_u24lambda_u2447_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437_u24lambda_u2436, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 2049391428, "CC(remember):BenchmarkScreen.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($viewModel);
            Object value$iv = $composer.rememberedValue();
            if (invalid$iv || value$iv == Composer.INSTANCE.getEmpty()) {
                mutableState = $selectedModelName$delegate;
                value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkScreenKt.m476xdbfcbbaa($viewModel, mutableState);
                    }
                };
                $composer.updateRememberedValue(value$iv);
            } else {
                mutableState = $selectedModelName$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.OutlinedButton((Function0) value$iv, modifierWeight$default, z, null, null, null, null, null, null, ComposableSingletons$BenchmarkScreenKt.INSTANCE.m10816getLambda$1902871280$app_debug(), $composer, 805306368, 504);
            boolean z2 = $sumOfPrefillAndDecodeTokens <= $maxToken;
            Modifier modifierWeight$default2 = RowScope.weight$default($this$BenchmarkScreen_u24lambda_u2447_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437_u24lambda_u2436, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 2049416764, "CC(remember):BenchmarkScreen.kt#9igjgp");
            boolean invalid$iv2 = $composer.changedInstance($modelManagerViewModel);
            Object value$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || value$iv2 == Composer.INSTANCE.getEmpty()) {
                value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkScreenKt.m477x9aaad3f0($modelManagerViewModel, mutableState, $showRunBenchmarkConfirmationDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) value$iv2, modifierWeight$default2, z2, null, null, null, null, null, null, ComposableSingletons$BenchmarkScreenKt.INSTANCE.getLambda$818705422$app_debug(), $composer, 805306368, 504);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkScreen$lambda$47$lambda$39$lambda$38$lambda$37$lambda$36$lambda$32$lambda$31 */
    public static final Unit m476xdbfcbbaa(BenchmarkViewModel $viewModel, MutableState $selectedModelName$delegate) {
        $viewModel.setShowResultsViewer(true);
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.BUTTON_CLICKED.getId();
            Bundle $this$BenchmarkScreen_u24lambda_u2447_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437_u24lambda_u2436_u24lambda_u2432_u24lambda_u2431_u24lambda_u2430 = new Bundle();
            $this$BenchmarkScreen_u24lambda_u2447_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437_u24lambda_u2436_u24lambda_u2432_u24lambda_u2431_u24lambda_u2430.putString("event_type", "view_benchmark_results");
            $this$BenchmarkScreen_u24lambda_u2447_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437_u24lambda_u2436_u24lambda_u2432_u24lambda_u2431_u24lambda_u2430.putString("model_id", BenchmarkScreen$lambda$11($selectedModelName$delegate));
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$BenchmarkScreen_u24lambda_u2447_u24lambda_u2439_u24lambda_u2438_u24lambda_u2437_u24lambda_u2436_u24lambda_u2432_u24lambda_u2431_u24lambda_u2430);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BenchmarkScreen$lambda$47$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35$lambda$34 */
    public static final Unit m477x9aaad3f0(ModelManagerViewModel $modelManagerViewModel, MutableState $selectedModelName$delegate, MutableState $showRunBenchmarkConfirmationDialog$delegate) {
        if ($modelManagerViewModel.getModelByName(BenchmarkScreen$lambda$11($selectedModelName$delegate)) != null) {
            BenchmarkScreen$lambda$6($showRunBenchmarkConfirmationDialog$delegate, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BenchmarkScreen$lambda$47$lambda$41$lambda$40(int fullHeight) {
        return fullHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BenchmarkScreen$lambda$47$lambda$43$lambda$42(int fullHeight) {
        return fullHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$47$lambda$46(ModelManagerViewModel $modelManagerViewModel, final BenchmarkViewModel $viewModel, MutableState $selectedModelName$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C285@11098L61,281@10924L244:BenchmarkScreen.kt#aos0mq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1515821013, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreen.<anonymous>.<anonymous> (BenchmarkScreen.kt:281)");
        }
        String strBenchmarkScreen$lambda$11 = BenchmarkScreen$lambda$11($selectedModelName$delegate);
        ComposerKt.sourceInformationMarkerStart($composer, 710086034, "CC(remember):BenchmarkScreen.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance($viewModel);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BenchmarkScreenKt.BenchmarkScreen$lambda$47$lambda$46$lambda$45$lambda$44($viewModel);
                }
            };
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        BenchmarkResultsViewerKt.BenchmarkResultsViewer(strBenchmarkScreen$lambda$11, $modelManagerViewModel, $viewModel, (Function0) it$iv, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$47$lambda$46$lambda$45$lambda$44(BenchmarkViewModel $viewModel) {
        $viewModel.setShowResultsViewer(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$49$lambda$48(MutableState $showRunBenchmarkConfirmationDialog$delegate) {
        BenchmarkScreen$lambda$6($showRunBenchmarkConfirmationDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$56(final MutableState $showRunBenchmarkConfirmationDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C298@11574L46,297@11538L210:BenchmarkScreen.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1209758526, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreen.<anonymous> (BenchmarkScreen.kt:297)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1358195248, "CC(remember):BenchmarkScreen.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkScreenKt.BenchmarkScreen$lambda$56$lambda$55$lambda$54($showRunBenchmarkConfirmationDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.OutlinedButton((Function0) it$iv, null, false, null, null, null, null, UtilsKt.getSMALL_BUTTON_CONTENT_PADDING(), null, ComposableSingletons$BenchmarkScreenKt.INSTANCE.getLambda$1440517428$app_debug(), $composer, 817889286, 382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$56$lambda$55$lambda$54(MutableState $showRunBenchmarkConfirmationDialog$delegate) {
        BenchmarkScreen$lambda$6($showRunBenchmarkConfirmationDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$53(final BenchmarkViewModel $viewModel, final MutableState $selectedModel$delegate, final SnapshotStateMap $values, final MutableState $selectedModelName$delegate, final MutableState $showRunBenchmarkConfirmationDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C306@11818L805,305@11790L976:BenchmarkScreen.kt#aos0mq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112679104, $changed, -1, "com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreen.<anonymous> (BenchmarkScreen.kt:305)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1234914085, "CC(remember):BenchmarkScreen.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($viewModel) | $composer.changed($selectedModel$delegate) | $composer.changed($values);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BenchmarkScreenKt.BenchmarkScreen$lambda$53$lambda$52$lambda$51($viewModel, $values, $selectedModel$delegate, $selectedModelName$delegate, $showRunBenchmarkConfirmationDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, null, null, null, UtilsKt.getSMALL_BUTTON_CONTENT_PADDING(), null, ComposableSingletons$BenchmarkScreenKt.INSTANCE.m10814getLambda$1085140176$app_debug(), $composer, 817889280, 382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BenchmarkScreen$lambda$53$lambda$52$lambda$51(BenchmarkViewModel $viewModel, SnapshotStateMap $values, MutableState $selectedModel$delegate, MutableState $selectedModelName$delegate, MutableState $showRunBenchmarkConfirmationDialog$delegate) {
        $viewModel.runBenchmark(BenchmarkScreen$lambda$14($selectedModel$delegate), getStringConfigValue($values, ConfigKeys.INSTANCE.getACCELERATOR()), getIntConfigValue($values, ConfigKeys.INSTANCE.getPREFILL_TOKENS()), getIntConfigValue($values, ConfigKeys.INSTANCE.getDECODE_TOKENS()), getIntConfigValue($values, ConfigKeys.INSTANCE.getNUMBER_OF_RUNS()));
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.BUTTON_CLICKED.getId();
            Bundle $this$BenchmarkScreen_u24lambda_u2453_u24lambda_u2452_u24lambda_u2451_u24lambda_u2450 = new Bundle();
            $this$BenchmarkScreen_u24lambda_u2453_u24lambda_u2452_u24lambda_u2451_u24lambda_u2450.putString("event_type", "run_benchmark");
            $this$BenchmarkScreen_u24lambda_u2453_u24lambda_u2452_u24lambda_u2451_u24lambda_u2450.putString("model_id", BenchmarkScreen$lambda$11($selectedModelName$delegate));
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$BenchmarkScreen_u24lambda_u2453_u24lambda_u2452_u24lambda_u2451_u24lambda_u2450);
        }
        BenchmarkScreen$lambda$6($showRunBenchmarkConfirmationDialog$delegate, false);
        return Unit.INSTANCE;
    }

    private static final String getStringConfigValue(Map<String, ? extends Object> map, ConfigKey key) {
        Object obj = map.get(key.getLabel());
        if (obj == null) {
            obj = "";
        }
        Object objConvertValueToTargetType = ConfigKt.convertValueToTargetType(obj, ValueType.STRING);
        Intrinsics.checkNotNull(objConvertValueToTargetType, "null cannot be cast to non-null type kotlin.String");
        return (String) objConvertValueToTargetType;
    }

    private static final int getIntConfigValue(Map<String, ? extends Object> map, ConfigKey key) {
        Object obj = map.get(key.getLabel());
        if (obj == null) {
            obj = 0;
        }
        Object objConvertValueToTargetType = ConfigKt.convertValueToTargetType(obj, ValueType.INT);
        Intrinsics.checkNotNull(objConvertValueToTargetType, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objConvertValueToTargetType).intValue();
    }
}
