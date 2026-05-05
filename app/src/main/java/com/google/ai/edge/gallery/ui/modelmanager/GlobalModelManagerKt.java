package com.google.ai.edge.gallery.ui.modelmanager;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.outlined.NoteAddKt;
import androidx.compose.material.icons.automirrored.rounded.ListAltKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.semantics.Role;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.unit.C1654Dp;
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
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.RuntimeType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.TaskIconKt;
import com.google.ai.edge.gallery.ui.common.modelitem.ModelItemKt;
import com.google.ai.edge.gallery.proto.ImportedModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p009io.CloseableKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;



V", "getFileName", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "modelForTaskCandidate", "showTaskSelectorBottomSheet", "", "showImportModelSheet", "showUnsupportedFileTypeDialog", "showUnsupportedWebModelDialog", "showImportDialog", "showImportingDialog", "showPromo", "modelVariants", "", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class GlobalModelManagerKt {
    private static final String TAG = "AGGlobalMM";

    
    public static final Unit GlobalModelManager$lambda$114(ModelManagerViewModel modelManagerViewModel, Function0 function0, Function2 function2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GlobalModelManager(modelManagerViewModel, function0, function2, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void GlobalModelManager(final ModelManagerViewModel viewModel, final Function0<Unit> navigateUp, final Function2<? super Task, ? super Model, Unit> onModelSelected, final Function1<? super Model, Unit> onBenchmarkClicked, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        Modifier modifier3;
        MutableState selectedImportedModelInfo;
        String promoId;
        SnackbarHostState snackbarHostState;
        State modelVariants$delegate;
        String str;
        int $dirty;
        MutableState showUnsupportedFileTypeDialog$delegate;
        final MutableState showTaskSelectorBottomSheet$delegate;
        final MutableState showImportModelSheet$delegate;
        MutableState showUnsupportedFileTypeDialog$delegate2;
        final SnapshotStateList importedModels;
        final Function0<Unit> function0;
        boolean z;
        int i2;
        Composer $composer3;
        String str2;
        final CoroutineScope scope;
        final ActivityResultLauncher filePickerLauncher;
        final CoroutineScope scope2;
        Composer $composer4;
        MutableState selectedImportedModelInfo2;
        final MutableState showImportingDialog$delegate;
        int i3;
        int i4;
        boolean z2;
        final MutableState showUnsupportedWebModelDialog$delegate;
        final MutableState showUnsupportedFileTypeDialog$delegate3;
        final SnackbarHostState snackbarHostState2;
        final MutableState showImportDialog$delegate;
        ActivityResultLauncher filePickerLauncher2;
        final MutableState selectedImportedModelInfo3;
        final MutableState showImportingDialog$delegate2;
        final MutableState showImportModelSheet$delegate2;
        final MutableState showTaskSelectorBottomSheet$delegate2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(navigateUp, "navigateUp");
        Intrinsics.checkNotNullParameter(onModelSelected, "onModelSelected");
        Intrinsics.checkNotNullParameter(onBenchmarkClicked, "onBenchmarkClicked");
        Composer $composer5 = $composer.startRestartGroup(1849113133);
        ComposerKt.sourceInformation($composer5, "C(GlobalModelManager)P(4,1,3,2)112@4827L16,113@4866L40,114@4930L40,115@4994L39,116@5065L41,117@5144L34,118@5209L34,119@5283L34,120@5357L34,121@5426L39,122@5500L49,123@5569L59,124@5655L34,125@5719L34,126@5768L24,127@5822L7,128@5856L32,129@5921L49,132@6020L34,133@6078L86,133@6057L107,140@6336L955,138@6229L1062,162@7347L899,162@7295L951,189@8348L233,196@8625L632,214@9306L16,214@9294L28,218@9374L1255,254@10658L527,266@11191L3005,216@9326L4870:GlobalModelManager.kt#ahf767");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer5.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer5.changedInstance(navigateUp) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer5.changedInstance(onModelSelected) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer5.changedInstance(onBenchmarkClicked) ? 2048 : 1024;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty2 |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer5.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        int $dirty3 = $dirty2;
        if ($composer5.shouldExecute(($dirty3 & 9363) != 9362, $dirty3 & 1)) {
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1849113133, $dirty3, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager (GlobalModelManager.kt:111)");
            }
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer5, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118729131, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv = $composer5.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt.mutableStateListOf();
                $composer5.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final SnapshotStateList builtInModels = (SnapshotStateList) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118727083, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv2 = $composer5.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt.mutableStateListOf();
                $composer5.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            SnapshotStateList importedModels2 = (SnapshotStateList) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118725036, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv3 = $composer5.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = SnapshotStateKt.mutableStateListOf();
                $composer5.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            final SnapshotStateList taskCandidates = (SnapshotStateList) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118722762, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv4 = $composer5.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer5.updateRememberedValue(mutableStateMutableStateOf$default);
                it$iv4 = mutableStateMutableStateOf$default;
            }
            final MutableState modelForTaskCandidate$delegate = (MutableState) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118720241, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv5 = $composer5.rememberedValue();
            if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv4);
                it$iv5 = value$iv4;
            }
            MutableState showTaskSelectorBottomSheet$delegate3 = (MutableState) it$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118718161, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object value$iv5 = $composer5.rememberedValue();
            if (value$iv5 == Composer.INSTANCE.getEmpty()) {
                value$iv5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv5);
            }
            MutableState showImportModelSheet$delegate3 = (MutableState) value$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118715793, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object value$iv6 = $composer5.rememberedValue();
            if (value$iv6 == Composer.INSTANCE.getEmpty()) {
                value$iv6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv6);
            }
            final MutableState showUnsupportedFileTypeDialog$delegate4 = (MutableState) value$iv6;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118713425, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object value$iv7 = $composer5.rememberedValue();
            if (value$iv7 == Composer.INSTANCE.getEmpty()) {
                value$iv7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv7);
            }
            final MutableState showUnsupportedWebModelDialog$delegate2 = (MutableState) value$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118711212, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object value$iv8 = $composer5.rememberedValue();
            if (value$iv8 == Composer.INSTANCE.getEmpty()) {
                value$iv8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer5.updateRememberedValue(value$iv8);
            }
            final MutableState selectedLocalModelFileUri = (MutableState) value$iv8;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118708834, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object value$iv9 = $composer5.rememberedValue();
            if (value$iv9 == Composer.INSTANCE.getEmpty()) {
                value$iv9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer5.updateRememberedValue(value$iv9);
            }
            MutableState selectedImportedModelInfo4 = (MutableState) value$iv9;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer5, 6, 2);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118703889, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv6 = $composer5.rememberedValue();
            if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv10);
                it$iv6 = value$iv10;
            }
            final MutableState showImportDialog$delegate2 = (MutableState) it$iv6;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118701841, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object value$iv11 = $composer5.rememberedValue();
            if (value$iv11 == Composer.INSTANCE.getEmpty()) {
                value$iv11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv11);
            }
            MutableState showImportingDialog$delegate3 = (MutableState) value$iv11;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer5, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer5.rememberedValue();
            final Modifier modifier5 = modifier4;
            if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer5);
                $composer5.updateRememberedValue(value$iv$iv);
                it$iv$iv = value$iv$iv;
            }
            final CoroutineScope scope3 = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer5.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer5, -1118697459, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv7 = $composer5.rememberedValue();
            if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                Object value$iv12 = new SnackbarHostState();
                $composer5.updateRememberedValue(value$iv12);
                it$iv7 = value$iv12;
            }
            SnackbarHostState snackbarHostState3 = (SnackbarHostState) it$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118695362, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv8 = $composer5.rememberedValue();
            if (it$iv8 == Composer.INSTANCE.getEmpty()) {
                Object value$iv13 = SnapshotStateKt.mutableStateMapOf();
                $composer5.updateRememberedValue(value$iv13);
                it$iv8 = value$iv13;
            }
            final SnapshotStateMap modelItemExpandedStates = (SnapshotStateMap) it$iv8;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118692209, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object value$iv14 = $composer5.rememberedValue();
            if (value$iv14 == Composer.INSTANCE.getEmpty()) {
                value$iv14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(value$iv14);
            }
            MutableState showPromo$delegate = (MutableState) value$iv14;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer5, -1118690301, "CC(remember):GlobalModelManager.kt#9igjgp");
            boolean invalid$iv = $composer5.changedInstance(viewModel);
            Object it$iv9 = $composer5.rememberedValue();
            if (invalid$iv || it$iv9 == Composer.INSTANCE.getEmpty()) {
                Object value$iv15 = (Function2) new GlobalModelManagerKt$GlobalModelManager$1$1(viewModel, "gm4_banner", showPromo$delegate, null);
                $composer5.updateRememberedValue(value$iv15);
                it$iv9 = value$iv15;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv9, $composer5, 6);
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            ComposerKt.sourceInformationMarkerStart($composer5, -1118681176, "CC(remember):GlobalModelManager.kt#9igjgp");
            boolean invalid$iv2 = $composer5.changedInstance(context);
            Object it$iv10 = $composer5.rememberedValue();
            if (invalid$iv2 || it$iv10 == Composer.INSTANCE.getEmpty()) {
                Object value$iv16 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$36$lambda$35(context, selectedLocalModelFileUri, showUnsupportedFileTypeDialog$delegate4, showUnsupportedWebModelDialog$delegate2, showImportDialog$delegate2, (ActivityResult) obj);
                    }
                };
                $composer5.updateRememberedValue(value$iv16);
                it$iv10 = value$iv16;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ActivityResultLauncher filePickerLauncher3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (Function1) it$iv10, $composer5, 0);
            Long lValueOf = Long.valueOf(GlobalModelManager$lambda$0(uiState$delegate).getModelImportingUpdateTrigger());
            ComposerKt.sourceInformationMarkerStart($composer5, -1118648880, "CC(remember):GlobalModelManager.kt#9igjgp");
            boolean invalid$iv3 = $composer5.changedInstance(viewModel);
            Object it$iv11 = $composer5.rememberedValue();
            if (invalid$iv3 || it$iv11 == Composer.INSTANCE.getEmpty()) {
                Object value$iv17 = (Function2) new GlobalModelManagerKt$GlobalModelManager$2$1(viewModel, builtInModels, importedModels2, null);
                $composer5.updateRememberedValue(value$iv17);
                it$iv11 = value$iv17;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            EffectsKt.LaunchedEffect(lValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv11, $composer5, 0);
            long modelImportingUpdateTrigger = GlobalModelManager$lambda$0(uiState$delegate).getModelImportingUpdateTrigger();
            ComposerKt.sourceInformationMarkerStart($composer5, -1118617514, "CC(remember):GlobalModelManager.kt#9igjgp");
            boolean invalid$iv4 = $composer5.changed(modelImportingUpdateTrigger);
            Object it$iv12 = $composer5.rememberedValue();
            if (invalid$iv4 || it$iv12 == Composer.INSTANCE.getEmpty()) {
                Object value$iv18 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$42$lambda$41(uiState$delegate);
                    }
                });
                $composer5.updateRememberedValue(value$iv18);
                it$iv12 = value$iv18;
            }
            State modelVariants$delegate2 = (State) it$iv12;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118608251, "CC(remember):GlobalModelManager.kt#9igjgp");
            boolean invalid$iv5 = $composer5.changedInstance(viewModel) | (($dirty3 & 896) == 256);
            Object value$iv19 = $composer5.rememberedValue();
            if (invalid$iv5 || value$iv19 == Composer.INSTANCE.getEmpty()) {
                selectedImportedModelInfo = selectedImportedModelInfo4;
                promoId = "gm4_banner";
                snackbarHostState = snackbarHostState3;
                modelVariants$delegate = modelVariants$delegate2;
                str = "CC(remember):GlobalModelManager.kt#9igjgp";
                $dirty = $dirty3;
                showUnsupportedFileTypeDialog$delegate = showUnsupportedFileTypeDialog$delegate4;
                showTaskSelectorBottomSheet$delegate = showTaskSelectorBottomSheet$delegate3;
                showImportModelSheet$delegate = showImportModelSheet$delegate3;
                showUnsupportedFileTypeDialog$delegate2 = showPromo$delegate;
                importedModels = importedModels2;
                value$iv19 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$47$lambda$46(viewModel, onModelSelected, taskCandidates, modelForTaskCandidate$delegate, showTaskSelectorBottomSheet$delegate, (Model) obj);
                    }
                };
                $composer5.updateRememberedValue(value$iv19);
            } else {
                modelVariants$delegate = modelVariants$delegate2;
                selectedImportedModelInfo = selectedImportedModelInfo4;
                promoId = "gm4_banner";
                showUnsupportedFileTypeDialog$delegate = showUnsupportedFileTypeDialog$delegate4;
                showTaskSelectorBottomSheet$delegate = showTaskSelectorBottomSheet$delegate3;
                showImportModelSheet$delegate = showImportModelSheet$delegate3;
                snackbarHostState = snackbarHostState3;
                str = "CC(remember):GlobalModelManager.kt#9igjgp";
                $dirty = $dirty3;
                showUnsupportedFileTypeDialog$delegate2 = showPromo$delegate;
                importedModels = importedModels2;
            }
            final Function1 handleClickModel = (Function1) value$iv19;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -1118587075, str);
            boolean invalid$iv6 = ($dirty & 112) == 32;
            Object it$iv13 = $composer5.rememberedValue();
            if (invalid$iv6 || it$iv13 == Composer.INSTANCE.getEmpty()) {
                function0 = navigateUp;
                Object value$iv20 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$49$lambda$48(function0);
                    }
                };
                $composer5.updateRememberedValue(value$iv20);
                it$iv13 = value$iv20;
            } else {
                function0 = navigateUp;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            BackHandlerKt.BackHandler(false, (Function0) it$iv13, $composer5, 0, 1);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1258713623, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GlobalModelManagerKt.GlobalModelManager$lambda$56(modifier5, builtInModels, importedModels, function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer5, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(87273542, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GlobalModelManagerKt.GlobalModelManager$lambda$61(showImportModelSheet$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer5, 54);
            modifier3 = modifier5;
            final SnackbarHostState snackbarHostState4 = snackbarHostState;
            MutableState showImportDialog$delegate3 = showImportDialog$delegate2;
            MutableState showImportingDialog$delegate4 = showImportingDialog$delegate3;
            final SnapshotStateList snapshotStateList = importedModels;
            final MutableState showPromo$delegate2 = showUnsupportedFileTypeDialog$delegate2;
            MutableState showImportModelSheet$delegate4 = showImportModelSheet$delegate;
            final String str3 = promoId;
            String str4 = str;
            final State modelVariants$delegate3 = modelVariants$delegate;
            ScaffoldKt.m4398ScaffoldTvnljyQ(modifier3, composableLambdaRememberComposableLambda, null, null, composableLambdaRememberComposableLambda2, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-302844802, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GlobalModelManagerKt.GlobalModelManager$lambda$74(viewModel, modelVariants$delegate3, handleClickModel, onBenchmarkClicked, snackbarHostState4, builtInModels, snapshotStateList, showPromo$delegate2, str3, modelItemExpandedStates, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer5, 54), $composer5, (($dirty >> 12) & 14) | 805330992, 492);
            if (GlobalModelManager$lambda$8(showTaskSelectorBottomSheet$delegate)) {
                $composer5.startReplaceGroup(-311528111);
                ComposerKt.sourceInformation($composer5, "354@14282L39,356@14360L1345,353@14239L1466");
                ComposerKt.sourceInformationMarkerStart($composer5, -1118427820, str4);
                Object it$iv14 = $composer5.rememberedValue();
                if (it$iv14 == Composer.INSTANCE.getEmpty()) {
                    showTaskSelectorBottomSheet$delegate2 = showTaskSelectorBottomSheet$delegate;
                    Object value$iv21 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GlobalModelManagerKt.GlobalModelManager$lambda$76$lambda$75(showTaskSelectorBottomSheet$delegate2);
                        }
                    };
                    $composer5.updateRememberedValue(value$iv21);
                    it$iv14 = value$iv21;
                } else {
                    showTaskSelectorBottomSheet$delegate2 = showTaskSelectorBottomSheet$delegate;
                }
                Function0 function02 = (Function0) it$iv14;
                ComposerKt.sourceInformationMarkerEnd($composer5);
                final MutableState mutableState = showTaskSelectorBottomSheet$delegate2;
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-253673836, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$81(taskCandidates, onModelSelected, scope3, sheetState, modelForTaskCandidate$delegate, mutableState, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer5, 54);
                z = true;
                i2 = 54;
                $composer3 = $composer5;
                str2 = str4;
                ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8(function02, null, sheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, composableLambdaRememberComposableLambda3, $composer3, 6, 3072, 8186);
            } else {
                z = true;
                i2 = 54;
                $composer3 = $composer5;
                str2 = str4;
                $composer3.startReplaceGroup(-325693995);
            }
            $composer3.endReplaceGroup();
            if (GlobalModelManager$lambda$11(showImportModelSheet$delegate4)) {
                $composer3.startReplaceGroup(-309999966);
                ComposerKt.sourceInformation($composer3, "399@15813L32,399@15872L1450,399@15777L1545");
                ComposerKt.sourceInformationMarkerStart($composer3, -1118378835, str2);
                Composer $this$cache$iv = $composer3;
                Object it$iv15 = $this$cache$iv.rememberedValue();
                if (it$iv15 == Composer.INSTANCE.getEmpty()) {
                    showImportModelSheet$delegate2 = showImportModelSheet$delegate4;
                    Object value$iv22 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GlobalModelManagerKt.GlobalModelManager$lambda$83$lambda$82(showImportModelSheet$delegate2);
                        }
                    };
                    $this$cache$iv.updateRememberedValue(value$iv22);
                    it$iv15 = value$iv22;
                } else {
                    showImportModelSheet$delegate2 = showImportModelSheet$delegate4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                scope = scope3;
                filePickerLauncher = filePickerLauncher3;
                ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8((Function0) it$iv15, null, sheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(1540441597, z, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$92(scope, filePickerLauncher, showImportModelSheet$delegate2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer3, i2), $composer3, 6, 3072, 8186);
            } else {
                scope = scope3;
                filePickerLauncher = filePickerLauncher3;
                $composer3.startReplaceGroup(-325693995);
            }
            $composer3.endReplaceGroup();
            if (GlobalModelManager$lambda$22(showImportDialog$delegate3)) {
                $composer3.startReplaceGroup(-1118328689);
                ComposerKt.sourceInformation($composer3, "");
                Uri uri = (Uri) selectedLocalModelFileUri.getValue();
                if (uri == null) {
                    $composer3.startReplaceGroup(-308413635);
                    $composer3.endReplaceGroup();
                    scope2 = scope;
                    $composer4 = $composer3;
                    selectedImportedModelInfo2 = selectedImportedModelInfo;
                } else {
                    $composer3.startReplaceGroup(-308413634);
                    ComposerKt.sourceInformation($composer3, "*447@17487L28,448@17534L140,445@17429L254");
                    ComposerKt.sourceInformationMarkerStart($composer3, 665494159, str2);
                    Composer $this$cache$iv2 = $composer3;
                    Object it$iv16 = $this$cache$iv2.rememberedValue();
                    if (it$iv16 == Composer.INSTANCE.getEmpty()) {
                        showImportDialog$delegate = showImportDialog$delegate3;
                        Object value$iv23 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GlobalModelManagerKt.GlobalModelManager$lambda$97$lambda$94$lambda$93(showImportDialog$delegate);
                            }
                        };
                        $this$cache$iv2.updateRememberedValue(value$iv23);
                        it$iv16 = value$iv23;
                    } else {
                        showImportDialog$delegate = showImportDialog$delegate3;
                    }
                    Function0 function03 = (Function0) it$iv16;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerStart($composer3, 665495775, str2);
                    Composer $this$cache$iv3 = $composer3;
                    Object it$iv17 = $this$cache$iv3.rememberedValue();
                    if (it$iv17 == Composer.INSTANCE.getEmpty()) {
                        filePickerLauncher2 = filePickerLauncher;
                        selectedImportedModelInfo3 = selectedImportedModelInfo;
                        showImportingDialog$delegate2 = showImportingDialog$delegate4;
                        Object value$iv24 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return GlobalModelManagerKt.GlobalModelManager$lambda$97$lambda$96$lambda$95(selectedImportedModelInfo3, showImportDialog$delegate, showImportingDialog$delegate2, (ImportedModel) obj);
                            }
                        };
                        $this$cache$iv3.updateRememberedValue(value$iv24);
                        it$iv17 = value$iv24;
                    } else {
                        filePickerLauncher2 = filePickerLauncher;
                        selectedImportedModelInfo3 = selectedImportedModelInfo;
                        showImportingDialog$delegate2 = showImportingDialog$delegate4;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer4 = $composer3;
                    scope2 = scope;
                    showImportDialog$delegate3 = showImportDialog$delegate;
                    showImportingDialog$delegate4 = showImportingDialog$delegate2;
                    selectedImportedModelInfo2 = selectedImportedModelInfo3;
                    ModelImportDialogKt.ModelImportDialog(uri, function03, (Function1) it$iv17, null, $composer4, 432, 8);
                    Unit unit2 = Unit.INSTANCE;
                    $composer4.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                }
            } else {
                scope2 = scope;
                $composer4 = $composer3;
                selectedImportedModelInfo2 = selectedImportedModelInfo;
                $composer4.startReplaceGroup(-325693995);
            }
            $composer4.endReplaceGroup();
            if (GlobalModelManager$lambda$25(showImportingDialog$delegate4)) {
                $composer4.startReplaceGroup(-1118316124);
                ComposerKt.sourceInformation($composer4, "");
                Uri uri2 = (Uri) selectedLocalModelFileUri.getValue();
                if (uri2 == null) {
                    $composer4.startReplaceGroup(-308024120);
                    $composer4.endReplaceGroup();
                    showImportingDialog$delegate = showImportingDialog$delegate4;
                } else {
                    $composer4.startReplaceGroup(-308024119);
                    ComposerKt.sourceInformation($composer4, "");
                    ImportedModel info = (ImportedModel) selectedImportedModelInfo2.getValue();
                    if (info == null) {
                        $composer4.startReplaceGroup(-1548392739);
                        $composer4.endReplaceGroup();
                        showImportingDialog$delegate = showImportingDialog$delegate4;
                    } else {
                        $composer4.startReplaceGroup(-1548392738);
                        ComposerKt.sourceInformation($composer4, "*464@17958L31,465@18010L253,461@17870L404");
                        ComposerKt.sourceInformationMarkerStart($composer4, 497246513, str2);
                        Composer $this$cache$iv4 = $composer4;
                        Object it$iv18 = $this$cache$iv4.rememberedValue();
                        if (it$iv18 == Composer.INSTANCE.getEmpty()) {
                            showImportingDialog$delegate = showImportingDialog$delegate4;
                            Object value$iv25 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return GlobalModelManagerKt.GlobalModelManager$lambda$103$lambda$102$lambda$99$lambda$98(showImportingDialog$delegate);
                                }
                            };
                            $this$cache$iv4.updateRememberedValue(value$iv25);
                            it$iv18 = value$iv25;
                        } else {
                            showImportingDialog$delegate = showImportingDialog$delegate4;
                        }
                        Function0 function04 = (Function0) it$iv18;
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ComposerKt.sourceInformationMarkerStart($composer4, 497248399, str2);
                        boolean invalid$iv7 = $composer4.changedInstance(viewModel) | $composer4.changedInstance(scope2);
                        Composer $this$cache$iv5 = $composer4;
                        Object it$iv19 = $this$cache$iv5.rememberedValue();
                        if (invalid$iv7 || it$iv19 == Composer.INSTANCE.getEmpty()) {
                            snackbarHostState2 = snackbarHostState;
                            Object value$iv26 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GlobalModelManagerKt.GlobalModelManager$lambda$103$lambda$102$lambda$101$lambda$100(viewModel, scope2, showImportingDialog$delegate, snackbarHostState2, (ImportedModel) obj);
                                }
                            };
                            $this$cache$iv5.updateRememberedValue(value$iv26);
                            it$iv19 = value$iv26;
                        } else {
                            snackbarHostState2 = snackbarHostState;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer4);
                        ModelImportDialogKt.ModelImportingDialog(uri2, info, function04, (Function1) it$iv19, $composer4, 384);
                        Unit unit4 = Unit.INSTANCE;
                        $composer4.endReplaceGroup();
                        Unit unit5 = Unit.INSTANCE;
                    }
                    $composer4.endReplaceGroup();
                }
                $composer4.endReplaceGroup();
                i3 = -325693995;
            } else {
                showImportingDialog$delegate = showImportingDialog$delegate4;
                i3 = -325693995;
                $composer4.startReplaceGroup(-325693995);
                $composer4.endReplaceGroup();
            }
            if (GlobalModelManager$lambda$14(showUnsupportedFileTypeDialog$delegate)) {
                $composer4.startReplaceGroup(-307446062);
                ComposerKt.sourceInformation($composer4, "487@18615L41,490@18811L133,479@18382L569");
                ComposerKt.sourceInformationMarkerStart($composer4, -1118289162, str2);
                Composer $this$cache$iv6 = $composer4;
                Object it$iv20 = $this$cache$iv6.rememberedValue();
                if (it$iv20 == Composer.INSTANCE.getEmpty()) {
                    showUnsupportedFileTypeDialog$delegate3 = showUnsupportedFileTypeDialog$delegate;
                    Object value$iv27 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GlobalModelManagerKt.GlobalModelManager$lambda$105$lambda$104(showUnsupportedFileTypeDialog$delegate3);
                        }
                    };
                    $this$cache$iv6.updateRememberedValue(value$iv27);
                    it$iv20 = value$iv27;
                } else {
                    showUnsupportedFileTypeDialog$delegate3 = showUnsupportedFileTypeDialog$delegate;
                }
                Function0 function05 = (Function0) it$iv20;
                ComposerKt.sourceInformationMarkerEnd($composer4);
                z2 = true;
                i4 = i3;
                Composer $composer6 = $composer4;
                AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0(function05, ComposableLambdaKt.rememberComposableLambda(124186880, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$108(showUnsupportedFileTypeDialog$delegate3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer4, 54), null, null, ComposableSingletons$GlobalModelManagerKt.INSTANCE.getLambda$1298278659$app_debug(), ComposableSingletons$GlobalModelManagerKt.INSTANCE.getLambda$257986820$app_debug(), ComposableSingletons$GlobalModelManagerKt.INSTANCE.m11151getLambda$782305019$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer6, 1794102, 0, 16268);
                $composer6.endReplaceGroup();
                $composer2 = $composer6;
            } else {
                i4 = i3;
                z2 = true;
                $composer2 = $composer4;
                $composer2.startReplaceGroup(i4);
                $composer2.endReplaceGroup();
            }
            if (GlobalModelManager$lambda$17(showUnsupportedWebModelDialog$delegate2)) {
                $composer2.startReplaceGroup(-306787777);
                ComposerKt.sourceInformation($composer2, "508@19278L41,511@19493L133,500@19045L588");
                ComposerKt.sourceInformationMarkerStart($composer2, -1118267946, str2);
                Composer $this$cache$iv7 = $composer2;
                Object it$iv21 = $this$cache$iv7.rememberedValue();
                if (it$iv21 == Composer.INSTANCE.getEmpty()) {
                    showUnsupportedWebModelDialog$delegate = showUnsupportedWebModelDialog$delegate2;
                    Object value$iv28 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GlobalModelManagerKt.GlobalModelManager$lambda$110$lambda$109(showUnsupportedWebModelDialog$delegate);
                        }
                    };
                    $this$cache$iv7.updateRememberedValue(value$iv28);
                    it$iv21 = value$iv28;
                } else {
                    showUnsupportedWebModelDialog$delegate = showUnsupportedWebModelDialog$delegate2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                AndroidAlertDialog_androidKt.m3499AlertDialogOix01E0((Function0) it$iv21, ComposableLambdaKt.rememberComposableLambda(-738117281, z2, new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$113(showUnsupportedWebModelDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer2, 54), null, null, ComposableSingletons$GlobalModelManagerKt.INSTANCE.getLambda$435974498$app_debug(), ComposableSingletons$GlobalModelManagerKt.INSTANCE.m11150getLambda$604317341$app_debug(), ComposableSingletons$GlobalModelManagerKt.INSTANCE.m11147getLambda$1644609180$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1794102, 0, 16268);
            } else {
                $composer2.startReplaceGroup(i4);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer5;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GlobalModelManagerKt.GlobalModelManager$lambda$114(viewModel, navigateUp, onModelSelected, onBenchmarkClicked, modifier6, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ModelManagerUiState GlobalModelManager$lambda$0(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final Model GlobalModelManager$lambda$5(MutableState<Model> mutableState) {
        MutableState<Model> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean GlobalModelManager$lambda$8(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    
    public static final void GlobalModelManager$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GlobalModelManager$lambda$11(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    
    public static final void GlobalModelManager$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GlobalModelManager$lambda$14(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void GlobalModelManager$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GlobalModelManager$lambda$17(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void GlobalModelManager$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GlobalModelManager$lambda$22(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void GlobalModelManager$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GlobalModelManager$lambda$25(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void GlobalModelManager$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GlobalModelManager$lambda$30(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    
    public static final void GlobalModelManager$lambda$31(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit GlobalModelManager$lambda$36$lambda$35(android.content.Context r9, androidx.compose.runtime.MutableState r10, androidx.compose.runtime.MutableState r11, androidx.compose.runtime.MutableState r12, androidx.compose.runtime.MutableState r13, androidx.activity.result.ActivityResult r14) {
        /*
            java.lang.String r0 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            int r0 = r14.getResultCode()
            r1 = -1
            java.lang.String r2 = "AGGlobalMM"
            if (r0 != r1) goto L7c
            android.content.Intent r0 = r14.getData()
            if (r0 == 0) goto L74
            android.net.Uri r0 = r0.getData()
            if (r0 == 0) goto L74
            r1 = 0
            java.lang.String r3 = getFileName(r9, r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Selected file: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r2, r4)
            r2 = 1
            r4 = 0
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L4f
            java.lang.String r7 = ".task"
            boolean r7 = kotlin.text.StringsKt.endsWith$default(r3, r7, r6, r5, r4)
            if (r7 != 0) goto L4f
            java.lang.String r7 = ".litertlm"
            boolean r7 = kotlin.text.StringsKt.endsWith$default(r3, r7, r6, r5, r4)
            if (r7 != 0) goto L4f
            GlobalModelManager$lambda$15(r11, r2)
            goto L72
        L4f:
            if (r3 == 0) goto L6c
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r7 = r3.toLowerCase(r7)
            java.lang.String r8 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r8 = "-web"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r4 = kotlin.text.StringsKt.contains$default(r7, r8, r6, r5, r4)
            if (r4 == 0) goto L6c
            GlobalModelManager$lambda$18(r12, r2)
            goto L72
        L6c:
            r10.setValue(r0)
            GlobalModelManager$lambda$23(r13, r2)
        L72:
            goto L81
        L74:
            r0 = 0
            java.lang.String r1 = "No file selected or URI is null."
            android.util.Log.d(r2, r1)
            goto L81
        L7c:
            java.lang.String r0 = "File picking cancelled."
            android.util.Log.d(r2, r0)
        L81:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt.GlobalModelManager$lambda$36$lambda$35(android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.activity.result.ActivityResult):kotlin.Unit");
    }

    
    public static final Map<String, List<Model>> GlobalModelManager$lambda$43(State<? extends Map<String, ? extends List<Model>>> state) {
        Object thisObj$iv = state.getValue();
        return (Map) thisObj$iv;
    }

    
    public static final Map GlobalModelManager$lambda$42$lambda$41(State $uiState$delegate) {
        Object answer$iv$iv$iv;
        Iterable<Task> $this$flatMap$iv = GlobalModelManager$lambda$0($uiState$delegate).getTasks();
        Collection destination$iv$iv = new ArrayList();
        for (Task it : $this$flatMap$iv) {
            Iterable list$iv$iv = it.getModels();
            CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
        }
        Iterable allModels = (List) destination$iv$iv;
        Iterable $this$filter$iv = allModels;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Model it2 = (Model) element$iv$iv;
            if (it2.getParentModelName() != null) {
                destination$iv$iv2.add(element$iv$iv);
            }
        }
        Iterable $this$groupBy$iv = (List) destination$iv$iv2;
        Map destination$iv$iv3 = new LinkedHashMap();
        for (Object element$iv$iv2 : $this$groupBy$iv) {
            Model it3 = (Model) element$iv$iv2;
            String parentModelName = it3.getParentModelName();
            Intrinsics.checkNotNull(parentModelName);
            Object value$iv$iv$iv = destination$iv$iv3.get(parentModelName);
            if (value$iv$iv$iv == null) {
                answer$iv$iv$iv = new ArrayList();
                destination$iv$iv3.put(parentModelName, answer$iv$iv$iv);
            } else {
                answer$iv$iv$iv = value$iv$iv$iv;
            }
            Object key$iv$iv$iv = answer$iv$iv$iv;
            List list$iv$iv2 = (List) key$iv$iv$iv;
            list$iv$iv2.add(element$iv$iv2);
        }
        return destination$iv$iv3;
    }

    
    public static final Unit GlobalModelManager$lambda$47$lambda$46(ModelManagerViewModel $viewModel, Function2 $onModelSelected, SnapshotStateList $taskCandidates, MutableState $modelForTaskCandidate$delegate, MutableState $showTaskSelectorBottomSheet$delegate, Model model) {
        boolean z;
        Intrinsics.checkNotNullParameter(model, "model");
        Iterable $this$filter$iv = $viewModel.getUiState().getValue().getTasks();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Task task = (Task) element$iv$iv;
            Iterable $this$any$iv = task.getModels();
            if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
                Iterator it = $this$any$iv.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    Object element$iv = it.next();
                    Model it2 = (Model) element$iv;
                    if (Intrinsics.areEqual(it2.getName(), model.getName())) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List tasksForModel = (List) destination$iv$iv;
        if (tasksForModel.size() == 1) {
            $onModelSelected.invoke(tasksForModel.get(0), model);
        } else if (tasksForModel.size() > 1) {
            $taskCandidates.clear();
            $taskCandidates.addAll(tasksForModel);
            $modelForTaskCandidate$delegate.setValue(model);
            GlobalModelManager$lambda$9($showTaskSelectorBottomSheet$delegate, true);
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$49$lambda$48(Function0 $navigateUp) {
        $navigateUp.invoke();
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$56(Modifier $modifier, final SnapshotStateList $builtInModels, final SnapshotStateList $importedModels, final Function0 $navigateUp, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C220@9422L807,242@10297L288,219@9382L1241:GlobalModelManager.kt#ahf767");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1258713623, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous> (GlobalModelManager.kt:219)");
            }
            AppBarKt.m3537CenterAlignedTopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-1199512796, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GlobalModelManagerKt.GlobalModelManager$lambda$56$lambda$52($builtInModels, $importedModels, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $modifier, null, ComposableLambdaKt.rememberComposableLambda(2115570649, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GlobalModelManagerKt.GlobalModelManager$lambda$56$lambda$55($navigateUp, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3078, 244);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$56$lambda$52(SnapshotStateList $builtInModels, SnapshotStateList $importedModels, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        ComposerKt.sourceInformation($composer, "C221@9434L785:GlobalModelManager.kt#ahf767");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1199512796, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous>.<anonymous> (GlobalModelManager.kt:221)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 1284452441, "C222@9507L700:GlobalModelManager.kt#ahf767");
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier$iv$iv = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv2 = (432 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv$iv);
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -2104839697, "C230@9858L11,226@9671L225,234@9961L44,235@10093L11,236@10154L10,232@9911L282:GlobalModelManager.kt#ahf767");
            IconKt.m4075Iconww6aTOc(ListAltKt.getListAlt(Icons.AutoMirrored.Rounded.INSTANCE), (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), $composer, 432, 0);
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.drawer_models_label, $composer, 0) + " (" + ($builtInModels.size() + $importedModels.size()) + ")", null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131066);
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
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$56$lambda$55(final Function0 $navigateUp, RowScope CenterAlignedTopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
        ComposerKt.sourceInformation($composer, "C243@10330L16,243@10309L266:GlobalModelManager.kt#ahf767");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2115570649, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous>.<anonymous> (GlobalModelManager.kt:243)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1543863753, "CC(remember):GlobalModelManager.kt#9igjgp");
            boolean invalid$iv = $composer.changed($navigateUp);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$56$lambda$55$lambda$54$lambda$53($navigateUp);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) it$iv, null, false, null, null, null, ComposableSingletons$GlobalModelManagerKt.INSTANCE.m11146getLambda$1529698057$app_debug(), $composer, 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$56$lambda$55$lambda$54$lambda$53(Function0 $navigateUp) {
        $navigateUp.invoke();
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$61(final MutableState $showImportModelSheet$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C256@10760L47,259@10931L11,260@11000L11,261@11061L41,258@10859L31,257@10814L365:GlobalModelManager.kt#ahf767");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(87273542, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous> (GlobalModelManager.kt:256)");
            }
            final String cdImportModelFab = StringResources_androidKt.stringResource(C2421R.string.cd_import_model_button, $composer, 0);
            long secondaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSecondaryContainer();
            long secondary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSecondary();
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -2029459121, "CC(remember):GlobalModelManager.kt#9igjgp");
            boolean invalid$iv = $composer.changed(cdImportModelFab);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$61$lambda$58$lambda$57(cdImportModelFab, (SemanticsPropertyReceiver) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) it$iv, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -2029465595, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$61$lambda$60$lambda$59($showImportModelSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            FloatingActionButtonKt.m4020SmallFloatingActionButtonXz6DiA((Function0) it$iv2, modifierSemantics$default, null, secondaryContainer, secondary, null, null, ComposableSingletons$GlobalModelManagerKt.INSTANCE.m11149getLambda$2127360413$app_debug(), $composer, 12582918, 100);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$61$lambda$60$lambda$59(MutableState $showImportModelSheet$delegate) {
        GlobalModelManager$lambda$12($showImportModelSheet$delegate, true);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$61$lambda$58$lambda$57(String $cdImportModelFab, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, $cdImportModelFab);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$74(final ModelManagerViewModel $viewModel, final State $modelVariants$delegate, final Function1 $handleClickModel, final Function1 $onBenchmarkClicked, SnackbarHostState $snackbarHostState, final SnapshotStateList $builtInModels, final SnapshotStateList $importedModels, final MutableState $showPromo$delegate, final String $promoId, final SnapshotStateMap $modelItemExpandedStates, PaddingValues innerPadding, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Object value$iv;
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        ComposerKt.sourceInformation($composer, "C267@11213L2979:GlobalModelManager.kt#ahf767");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(innerPadding) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-302844802, $dirty, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous> (GlobalModelManager.kt:267)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
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
            int i2 = ((0 >> 6) & 112) | 6;
            BoxScope $this$GlobalModelManager_u24lambda_u2474_u24lambda_u2473 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 270325072, "C270@11302L11,277@11650L1969,268@11227L2392,332@13627L155,344@14076L11,338@13831L355:GlobalModelManager.kt#ahf767");
            Modifier modifierM1992paddingqDBjuR0$default = PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1990paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(BackgroundKt.m1359backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainer(), null, 2, null), 0.0f, 1, null), C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), 0.0f, innerPadding.getTop(), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            PaddingValues paddingValuesM1985PaddingValuesa9UjIt4$default = PaddingKt.m1985PaddingValuesa9UjIt4$default(0.0f, C1654Dp.m9788constructorimpl(16), 0.0f, C1654Dp.m9788constructorimpl(innerPadding.getBottom() + C1654Dp.m9788constructorimpl(80)), 5, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM1843spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer, -545456619, "CC(remember):GlobalModelManager.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($viewModel) | $composer.changed($modelVariants$delegate) | $composer.changed($handleClickModel) | $composer.changed($onBenchmarkClicked);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$74$lambda$73$lambda$72$lambda$71($builtInModels, $importedModels, $showPromo$delegate, $viewModel, $promoId, $modelItemExpandedStates, $handleClickModel, $onBenchmarkClicked, $modelVariants$delegate, (LazyListScope) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
            } else {
                value$iv = it$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(modifierM1992paddingqDBjuR0$default, null, paddingValuesM1985PaddingValuesa9UjIt4$default, false, horizontalOrVertical, null, null, false, null, (Function1) value$iv, $composer, 24576, 490);
            SnackbarHostKt.SnackbarHost($snackbarHostState, PaddingKt.m1992paddingqDBjuR0$default($this$GlobalModelManager_u24lambda_u2474_u24lambda_u2473.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(32), 7, null), null, $composer, 6, 4);
            BoxKt.Box($this$GlobalModelManager_u24lambda_u2474_u24lambda_u2473.align(BackgroundKt.background$default(SizeKt.m2022height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding.getBottom()), Brush.Companion.m6870verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(Color.INSTANCE.m6950getTransparent0d7_KjU()), Color.m6905boximpl(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainer())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Alignment.INSTANCE.getBottomCenter()), $composer, 0);
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

    
    public static final Unit GlobalModelManager$lambda$74$lambda$73$lambda$72$lambda$71(SnapshotStateList $builtInModels, SnapshotStateList $importedModels, final MutableState $showPromo$delegate, final ModelManagerViewModel $viewModel, final String $promoId, final SnapshotStateMap $modelItemExpandedStates, final Function1 $handleClickModel, final Function1 $onBenchmarkClicked, final State $modelVariants$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, NotificationCompat.CATEGORY_PROMO, null, ComposableLambdaKt.composableLambdaInstance(690856985, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GlobalModelManagerKt.m568x8866fb53($showPromo$delegate, $viewModel, $promoId, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        final SnapshotStateList items$iv = $builtInModels;
        final Function1 contentType$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$lambda$74$lambda$73$lambda$72$lambda$71$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Model) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Model model) {
                return null;
            }
        };
        LazyColumn.items(items$iv.size(), null, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$lambda$74$lambda$73$lambda$72$lambda$71$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return contentType$iv.invoke(items$iv.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$lambda$74$lambda$73$lambda$72$lambda$71$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                int $changed2 = $dirty & 14;
                final Model model = (Model) items$iv.get(it);
                $composer.startReplaceGroup(-1692126858);
                ComposerKt.sourceInformation($composer, "C*304@12690L44,295@12266L481:GlobalModelManager.kt#ahf767");
                boolean expanded = ((Boolean) $modelItemExpandedStates.getOrDefault(model.getName(), true)).booleanValue();
                List list = (List) GlobalModelManagerKt.GlobalModelManager$lambda$43($modelVariants$delegate).getOrDefault(model.getName(), CollectionsKt.emptyList());
                boolean z = model.getRuntimeType() == RuntimeType.LITERT_LM;
                ModelManagerViewModel modelManagerViewModel = $viewModel;
                Function1 function1 = $handleClickModel;
                Function1 function12 = $onBenchmarkClicked;
                Boolean boolValueOf = Boolean.valueOf(expanded);
                ComposerKt.sourceInformationMarkerStart($composer, -1717137112, "CC(remember):GlobalModelManager.kt#9igjgp");
                boolean invalid$iv = $composer.changedInstance(model);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    final SnapshotStateMap snapshotStateMap = $modelItemExpandedStates;
                    Object value$iv = (Function1) new Function1<Boolean, Unit>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$6$1$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean it2) {
                            snapshotStateMap.put(model.getName(), Boolean.valueOf(it2));
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ModelItemKt.ModelItem(model, null, modelManagerViewModel, function1, function12, null, boolValueOf, false, false, z, (Function1) it$iv, list, null, $composer, (($changed2 >> 3) & 14) | 48, 0, 4512);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!$importedModels.isEmpty()) {
            LazyListScope.item$default(LazyColumn, "imported_models_label", null, ComposableSingletons$GlobalModelManagerKt.INSTANCE.m11145getLambda$1128282444$app_debug(), 2, null);
        }
        final SnapshotStateList items$iv2 = $importedModels;
        final Function1 contentType$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$lambda$74$lambda$73$lambda$72$lambda$71$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Model) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Model model) {
                return null;
            }
        };
        LazyColumn.items(items$iv2.size(), null, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$lambda$74$lambda$73$lambda$72$lambda$71$$inlined$items$default$7
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return contentType$iv2.invoke(items$iv2.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$GlobalModelManager$lambda$74$lambda$73$lambda$72$lambda$71$$inlined$items$default$8
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                int $changed2 = $dirty & 14;
                Model model = (Model) items$iv2.get(it);
                $composer.startReplaceGroup(-1913341656);
                ComposerKt.sourceInformation($composer, "C*320@13273L328:GlobalModelManager.kt#ahf767");
                ModelItemKt.ModelItem(model, null, $viewModel, $handleClickModel, $onBenchmarkClicked, null, true, false, false, model.getRuntimeType() == RuntimeType.LITERT_LM, null, null, null, $composer, (($changed2 >> 3) & 14) | 1572912, 0, 7584);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m568x8866fb53(final MutableState $showPromo$delegate, final ModelManagerViewModel $viewModel, final String $promoId, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C281@11811L11,283@11909L215,279@11692L432:GlobalModelManager.kt#ahf767");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(690856985, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GlobalModelManager.kt:279)");
            }
            boolean zGlobalModelManager$lambda$30 = GlobalModelManager$lambda$30($showPromo$delegate);
            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
            ComposerKt.sourceInformationMarkerStart($composer, -1806364092, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(GlobalModelManagerKt.m569xe470a27e(((Integer) obj).intValue()));
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AnimatedVisibilityKt.AnimatedVisibility(zGlobalModelManager$lambda$30, (Modifier) null, enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically$default(null, (Function1) it$iv, 1, null)).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(143543537, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GlobalModelManagerKt.m570xb8c3e8ac($viewModel, $promoId, $showPromo$delegate, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    
    public static final int m569xe470a27e(int it) {
        return (-it) / 2;
    }

    
    
    public static final Unit m570xb8c3e8ac(final ModelManagerViewModel $viewModel, final String $promoId, final MutableState $showPromo$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C285@11965L133,284@11923L189:GlobalModelManager.kt#ahf767");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(143543537, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GlobalModelManager.kt:284)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 506387510, "CC(remember):GlobalModelManager.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance($viewModel);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GlobalModelManagerKt.m571x750bcedb($viewModel, $promoId, $showPromo$delegate);
                }
            };
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        PromoBannerGm4Kt.PromoBannerGm4((Function0) it$iv, null, $composer, 0, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m571x750bcedb(ModelManagerViewModel $viewModel, String $promoId, MutableState $showPromo$delegate) {
        GlobalModelManager$lambda$31($showPromo$delegate, false);
        $viewModel.getDataStoreRepository().addViewedPromoId($promoId);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$76$lambda$75(MutableState $showTaskSelectorBottomSheet$delegate) {
        GlobalModelManager$lambda$9($showTaskSelectorBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$81(SnapshotStateList $taskCandidates, final Function2 $onModelSelected, final CoroutineScope $scope, final SheetState $sheetState, final MutableState $modelForTaskCandidate$delegate, final MutableState $showTaskSelectorBottomSheet$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Object value$iv;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C357@14368L1331:GlobalModelManager.kt#ahf767");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-253673836, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous> (GlobalModelManager.kt:357)");
            }
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 7, null);
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            int $changed$iv = 54;
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            int $changed$iv$iv = (54 << 3) & 112;
            Modifier modifier$iv$iv = modifier$iv;
            MeasurePolicy measurePolicy$iv$iv = measurePolicy$iv;
            String str = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            String str2 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
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
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            int i2 = 0;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1659274345, "C362@14521L56,363@14611L11,364@14666L10,361@14505L270:GlobalModelManager.kt#ahf767");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.model_manager_select_task_title, $composer, 0), PaddingKt.m1992paddingqDBjuR0$default(PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(8), 7, null), C1654Dp.m9788constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 48, 0, 131064);
            $composer.startReplaceGroup(-1161894987);
            ComposerKt.sourceInformation($composer, "*373@15040L326,368@14825L856");
            Iterator it = $taskCandidates.iterator();
            while (it.hasNext()) {
                final Task task = (Task) it.next();
                Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                Iterator it2 = it;
                int compositeKeyHash$iv$iv2 = compositeKeyHash$iv$iv;
                int $changed$iv2 = $changed$iv;
                int i4 = i2;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, -1161887376, "CC(remember):GlobalModelManager.kt#9igjgp");
                boolean invalid$iv = $composer.changed($onModelSelected) | $composer.changedInstance(task) | $composer.changedInstance($scope) | $composer.changed($sheetState);
                Object it$iv = $composer.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GlobalModelManagerKt.GlobalModelManager$lambda$81$lambda$80$lambda$78$lambda$77($onModelSelected, task, $scope, $modelForTaskCandidate$delegate, $sheetState, $showTaskSelectorBottomSheet$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                } else {
                    value$iv = it$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier modifier$iv2 = PaddingKt.m1989paddingVpY3zN4(ClickableKt.m1401clickableoSLSa3U(modifierFillMaxWidth$default, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) value$iv), C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(4));
                Arrangement.Horizontal horizontalArrangement$iv = spaceBetween;
                MeasurePolicy measurePolicy$iv2 = measurePolicy$iv;
                int $changed$iv$iv2 = $changed$iv$iv;
                ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, str);
                int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
                String str3 = str;
                Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv2 = ((((432 << 3) & 112) << 6) & 896) | 6;
                Modifier modifier$iv$iv2 = modifier$iv$iv;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, str2);
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
                String str4 = str2;
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = ($changed$iv$iv$iv2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1201397310, "C387@15524L11,388@15583L10,385@15456L164,390@15633L36:GlobalModelManager.kt#ahf767");
                TextKt.m4781TextNvy7gAk(task.getLabel(), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131066);
                TaskIconKt.m10898TaskIcon942rkJo(task, null, C1654Dp.m9788constructorimpl(40), 0.0f, $composer, 384, 10);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                modifier$iv$iv = modifier$iv$iv2;
                it = it2;
                compositeKeyHash$iv$iv = compositeKeyHash$iv$iv2;
                $changed$iv = $changed$iv2;
                i2 = i4;
                measurePolicy$iv = measurePolicy$iv2;
                $changed$iv$iv = $changed$iv$iv2;
                str = str3;
                str2 = str4;
                measurePolicy$iv$iv = measurePolicy$iv$iv;
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

    
    public static final Unit GlobalModelManager$lambda$81$lambda$80$lambda$78$lambda$77(Function2 $onModelSelected, Task $task, CoroutineScope $scope, MutableState $modelForTaskCandidate$delegate, SheetState $sheetState, MutableState $showTaskSelectorBottomSheet$delegate) {
        Model model = GlobalModelManager$lambda$5($modelForTaskCandidate$delegate);
        if (model != null) {
            $onModelSelected.invoke($task, model);
        }
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new GlobalModelManagerKt$GlobalModelManager$8$1$1$1$1($sheetState, $showTaskSelectorBottomSheet$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$83$lambda$82(MutableState $showImportModelSheet$delegate) {
        GlobalModelManager$lambda$12($showImportModelSheet$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$92(final CoroutineScope $scope, final ActivityResultLauncher $filePickerLauncher, final MutableState $showImportModelSheet$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C402@15940L10,400@15880L164,405@16079L63,408@16202L587,425@16813L105,406@16149L1167:GlobalModelManager.kt#ahf767");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1540441597, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous> (GlobalModelManager.kt:400)");
            }
            TextKt.m4781TextNvy7gAk("Import model", PaddingKt.m1989paddingVpY3zN4(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), C1654Dp.m9788constructorimpl(4)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 6, 0, 131068);
            final String cbImportFromLocalFile = StringResources_androidKt.stringResource(C2421R.string.cd_import_model_from_local_file_button, $composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1399331256, "CC(remember):GlobalModelManager.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($scope) | $composer.changedInstance($filePickerLauncher);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$92$lambda$85$lambda$84($scope, $filePickerLauncher, $showImportModelSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierM1401clickableoSLSa3U = ClickableKt.m1401clickableoSLSa3U(companion, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv);
            ComposerKt.sourceInformationMarkerStart($composer, -1399312186, "CC(remember):GlobalModelManager.kt#9igjgp");
            boolean invalid$iv2 = $composer.changed(cbImportFromLocalFile);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$92$lambda$87$lambda$86(cbImportFromLocalFile, (SemanticsPropertyReceiver) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifier$iv = SemanticsModifierKt.semantics$default(modifierM1401clickableoSLSa3U, false, (Function1) it$iv2, 1, null);
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
            int i2 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1854966989, "C430@16937L371:GlobalModelManager.kt#ahf767");
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(6));
            Modifier modifier$iv$iv = PaddingKt.m1988padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(16));
            Arrangement.Horizontal horizontalArrangement$iv = horizontalM1843spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv2 = (438 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv$iv);
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 698576963, "C435@17145L68,436@17295L2,436@17224L74:GlobalModelManager.kt#ahf767");
            IconKt.m4075Iconww6aTOc(NoteAddKt.getNoteAdd(Icons.AutoMirrored.Outlined.INSTANCE), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -670197271, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv3 = $composer.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GlobalModelManagerKt.m572x730c4ad((SemanticsPropertyReceiver) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TextKt.m4781TextNvy7gAk("From local model file", SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) it$iv3), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, $composer, 6, 0, 262140);
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

    
    public static final Unit GlobalModelManager$lambda$92$lambda$85$lambda$84(CoroutineScope $scope, ActivityResultLauncher $filePickerLauncher, MutableState $showImportModelSheet$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new GlobalModelManagerKt$GlobalModelManager$10$1$1$1($filePickerLauncher, $showImportModelSheet$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$92$lambda$87$lambda$86(String $cbImportFromLocalFile, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.m8952setRolekuIjeqM(semantics, Role.INSTANCE.m8933getButtono7Vup1c());
        SemanticsPropertiesKt.setContentDescription(semantics, $cbImportFromLocalFile);
        return Unit.INSTANCE;
    }

    
    
    public static final Unit m572x730c4ad(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$97$lambda$94$lambda$93(MutableState $showImportDialog$delegate) {
        GlobalModelManager$lambda$23($showImportDialog$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$97$lambda$96$lambda$95(MutableState $selectedImportedModelInfo, MutableState $showImportDialog$delegate, MutableState $showImportingDialog$delegate, ImportedModel info) {
        Intrinsics.checkNotNullParameter(info, "info");
        $selectedImportedModelInfo.setValue(info);
        GlobalModelManager$lambda$23($showImportDialog$delegate, false);
        GlobalModelManager$lambda$26($showImportingDialog$delegate, true);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$103$lambda$102$lambda$99$lambda$98(MutableState $showImportingDialog$delegate) {
        GlobalModelManager$lambda$26($showImportingDialog$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$103$lambda$102$lambda$101$lambda$100(ModelManagerViewModel $viewModel, CoroutineScope $scope, MutableState $showImportingDialog$delegate, SnackbarHostState $snackbarHostState, ImportedModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.addImportedLlmModel(it);
        GlobalModelManager$lambda$26($showImportingDialog$delegate, false);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new GlobalModelManagerKt$GlobalModelManager$12$1$2$1$1($snackbarHostState, null), 3, null);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$105$lambda$104(MutableState $showUnsupportedFileTypeDialog$delegate) {
        GlobalModelManager$lambda$15($showUnsupportedFileTypeDialog$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$108(final MutableState $showUnsupportedFileTypeDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C491@18838L41,491@18821L115:GlobalModelManager.kt#ahf767");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(124186880, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous> (GlobalModelManager.kt:491)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -915491703, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$108$lambda$107$lambda$106($showUnsupportedFileTypeDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$GlobalModelManagerKt.INSTANCE.m11152getLambda$889045776$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$108$lambda$107$lambda$106(MutableState $showUnsupportedFileTypeDialog$delegate) {
        GlobalModelManager$lambda$15($showUnsupportedFileTypeDialog$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$110$lambda$109(MutableState $showUnsupportedWebModelDialog$delegate) {
        GlobalModelManager$lambda$18($showUnsupportedWebModelDialog$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$113(final MutableState $showUnsupportedWebModelDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C512@19520L41,512@19503L115:GlobalModelManager.kt#ahf767");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-738117281, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManager.<anonymous> (GlobalModelManager.kt:512)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -661102296, "CC(remember):GlobalModelManager.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GlobalModelManagerKt.GlobalModelManager$lambda$113$lambda$112$lambda$111($showUnsupportedWebModelDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) it$iv, null, false, null, null, null, null, null, null, ComposableSingletons$GlobalModelManagerKt.INSTANCE.m11148getLambda$1751349937$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit GlobalModelManager$lambda$113$lambda$112$lambda$111(MutableState $showUnsupportedWebModelDialog$delegate) {
        GlobalModelManager$lambda$18($showUnsupportedWebModelDialog$delegate, false);
        return Unit.INSTANCE;
    }

    private static final String getFileName(Context context, Uri uri) {
        int nameIndex;
        if (Intrinsics.areEqual(uri.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    if (!cursor2.moveToFirst() || (nameIndex = cursor2.getColumnIndex("_display_name")) == -1) {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(cursor, null);
                    } else {
                        String string = cursor2.getString(nameIndex);
                        CloseableKt.closeFinally(cursor, null);
                        return string;
                    }
                } finally {
                }
            }
        } else if (Intrinsics.areEqual(uri.getScheme(), "file")) {
            return uri.getLastPathSegment();
        }
        return null;
    }
}
