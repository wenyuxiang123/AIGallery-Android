package com.google.ai.edge.gallery.ui.common;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.res.VectorResources_androidKt;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.ai.edge.gallery.data.BuiltInTaskId;
import com.google.ai.edge.gallery.data.Config;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.ConfigKt;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelCapability;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatus;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatusType;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;



V", "app_debug", "showConfigDialog", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class ModelPageAppBarKt {
    
    public static final Unit ModelPageAppBar$lambda$31(Task task, Model model, ModelManagerViewModel modelManagerViewModel, Function0 function0, Function2 function2, boolean z, boolean z2, Modifier modifier, boolean z3, Function1 function1, boolean z4, boolean z5, boolean z6, Function2 function22, boolean z7, String str, Function1 function12, int i, int i2, int i3, Composer composer, int i4) {
        ModelPageAppBar(task, model, modelManagerViewModel, function0, function2, z, z2, modifier, z3, function1, z4, z5, z6, function22, z7, str, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    
    public static final Unit ModelPageAppBar$lambda$1$lambda$0(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    
    public static final Unit ModelPageAppBar$lambda$3$lambda$2(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        Intrinsics.checkNotNullParameter(map2, "<unused var>");
        return Unit.INSTANCE;
    }

    
    public static final Unit ModelPageAppBar$lambda$5$lambda$4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void ModelPageAppBar(final Task task, final Model model, final ModelManagerViewModel modelManagerViewModel, final Function0<Unit> onBackClicked, final Function2<? super Model, ? super Model, Unit> onModelSelected, final boolean inProgress, final boolean modelPreparing, Modifier modifier, boolean isResettingSession, Function1<? super Model, Unit> function1, boolean canShowResetSessionButton, boolean hideModelSelector, boolean useThemeColor, Function2<? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, Unit> function2, boolean allowEditingSystemPrompt, String curSystemPrompt, Function1<? super String, Unit> function12, Composer $composer, final int $changed, final int $changed1, final int i) {
        int $dirty1;
        Composer $composer2;
        Modifier modifier2;
        boolean isResettingSession2;
        Function1<? super Model, Unit> function13;
        boolean canShowResetSessionButton2;
        boolean hideModelSelector2;
        boolean useThemeColor2;
        final Function2<? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, Unit> function22;
        boolean allowEditingSystemPrompt2;
        String curSystemPrompt2;
        Function1<? super String, Unit> function14;
        Function1<? super Model, Unit> function15;
        Function2<? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, Unit> function23;
        int $dirty12;
        String str;
        final MutableState showConfigDialog$delegate;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onModelSelected, "onModelSelected");
        Composer $composer3 = $composer.startRestartGroup(-1462244516);
        ComposerKt.sourceInformation($composer3, "C(ModelPageAppBar)P(15,6,7,10,12,4,8,9,5,13,1,3,16,11)75@3201L2,80@3427L15,84@3565L2,86@3599L34,87@3693L16,88@3739L7,97@4178L1189,134@5439L317,144@5825L2428,96@4142L4116:ModelPageAppBar.kt#t7sjiu");
        int $dirty = $changed;
        int $dirty13 = $changed1;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(model) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(modelManagerViewModel) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onBackClicked) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onModelSelected) ? 16384 : 8192;
        }
        if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty |= $composer3.changed(inProgress) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty |= $composer3.changed(modelPreparing) ? 1048576 : 524288;
        }
        int i2 = i & 128;
        if (i2 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty |= $composer3.changed(modifier) ? 8388608 : 4194304;
        }
        int i3 = i & 256;
        if (i3 != 0) {
            $dirty |= 100663296;
        } else if (($changed & 100663296) == 0) {
            $dirty |= $composer3.changed(isResettingSession) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i4 = i & 512;
        if (i4 != 0) {
            $dirty |= 805306368;
        } else if (($changed & 805306368) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 536870912 : 268435456;
        }
        int i5 = i & 1024;
        if (i5 != 0) {
            $dirty13 |= 6;
        } else if (($changed1 & 6) == 0) {
            $dirty13 |= $composer3.changed(canShowResetSessionButton) ? 4 : 2;
        }
        int i6 = i & 2048;
        if (i6 != 0) {
            $dirty13 |= 48;
        } else if (($changed1 & 48) == 0) {
            $dirty13 |= $composer3.changed(hideModelSelector) ? 32 : 16;
        }
        int i7 = i & 4096;
        if (i7 != 0) {
            $dirty13 |= 384;
        } else if (($changed1 & 384) == 0) {
            $dirty13 |= $composer3.changed(useThemeColor) ? 256 : 128;
        }
        int i8 = i & 8192;
        if (i8 != 0) {
            $dirty13 |= 3072;
        } else if (($changed1 & 3072) == 0) {
            $dirty13 |= $composer3.changedInstance(function2) ? 2048 : 1024;
        }
        int i9 = i & 16384;
        if (i9 != 0) {
            $dirty13 |= 24576;
        } else if (($changed1 & 24576) == 0) {
            $dirty13 |= $composer3.changed(allowEditingSystemPrompt) ? 16384 : 8192;
        }
        int i10 = i & 32768;
        if (i10 != 0) {
            $dirty13 |= ProfileVerifier.CompilationStatus.f249xf2722a21;
        } else if (($changed1 & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty13 |= $composer3.changed(curSystemPrompt) ? 131072 : 65536;
        }
        int i11 = i & 65536;
        if (i11 != 0) {
            $dirty13 |= 1572864;
        } else if (($changed1 & 1572864) == 0) {
            $dirty13 |= $composer3.changedInstance(function12) ? 1048576 : 524288;
        }
        if ($composer3.shouldExecute((($dirty & 306783379) == 306783378 && (599187 & $dirty13) == 599186) ? false : true, $dirty & 1)) {
            modifier2 = i2 != 0 ? Modifier.INSTANCE : modifier;
            isResettingSession2 = i3 != 0 ? false : isResettingSession;
            if (i4 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -762661314, "CC(remember):ModelPageAppBar.kt#9igjgp");
                Object it$iv = $composer3.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ModelPageAppBarKt.ModelPageAppBar$lambda$1$lambda$0((Model) obj);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                function15 = (Function1) it$iv;
            } else {
                function15 = function1;
            }
            canShowResetSessionButton2 = i5 != 0 ? false : canShowResetSessionButton;
            hideModelSelector2 = i6 != 0 ? false : hideModelSelector;
            boolean useThemeColor3 = i7 != 0 ? false : useThemeColor;
            if (i8 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -762654069, "CC(remember):ModelPageAppBar.kt#9igjgp");
                Object it$iv2 = $composer3.rememberedValue();
                if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv2 = new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ModelPageAppBarKt.ModelPageAppBar$lambda$3$lambda$2((Map) obj, (Map) obj2);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv2);
                    it$iv2 = value$iv2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                function23 = (Function2) it$iv2;
            } else {
                function23 = function2;
            }
            boolean allowEditingSystemPrompt3 = i9 != 0 ? false : allowEditingSystemPrompt;
            curSystemPrompt2 = i10 != 0 ? "" : curSystemPrompt;
            if (i11 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -762649666, "CC(remember):ModelPageAppBar.kt#9igjgp");
                Object it$iv3 = $composer3.rememberedValue();
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ModelPageAppBarKt.ModelPageAppBar$lambda$5$lambda$4((String) obj);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv3);
                    it$iv3 = value$iv3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                function14 = (Function1) it$iv3;
            } else {
                function14 = function12;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1462244516, $dirty, $dirty13, "com.google.ai.edge.gallery.ui.common.ModelPageAppBar (ModelPageAppBar.kt:85)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -762648546, "CC(remember):ModelPageAppBar.kt#9igjgp");
            Object it$iv4 = $composer3.rememberedValue();
            int $dirty2 = $dirty;
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                $dirty12 = $dirty13;
                Object value$iv4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            } else {
                $dirty12 = $dirty13;
            }
            final MutableState showConfigDialog$delegate2 = (MutableState) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            State modelManagerUiState$delegate = SnapshotStateKt.collectAsState(modelManagerViewModel.getUiState(), null, $composer3, 0, 1);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            final ModelDownloadStatus curDownloadStatus = ModelPageAppBar$lambda$9(modelManagerUiState$delegate).getModelDownloadStatus().get(model.getName());
            ModelInitializationStatus modelInitializationStatus = ModelPageAppBar$lambda$9(modelManagerUiState$delegate).getModelInitializationStatus().get(model.getName());
            final boolean isModelInitializing = (modelInitializationStatus != null ? modelInitializationStatus.getStatus() : null) == ModelInitializationStatusType.INITIALIZING;
            final boolean isModelInitialized = (modelInitializationStatus != null ? modelInitializationStatus.getStatus() : null) == ModelInitializationStatusType.INITIALIZED;
            final boolean z = hideModelSelector2;
            final boolean z2 = useThemeColor3;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-258987625, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModelPageAppBarKt.ModelPageAppBar$lambda$12(z, isModelInitializing, inProgress, task, model, modelManagerViewModel, onModelSelected, z2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-944755243, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModelPageAppBarKt.ModelPageAppBar$lambda$13(isModelInitializing, inProgress, onBackClicked, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54);
            $dirty1 = $dirty12;
            useThemeColor2 = useThemeColor3;
            final boolean isModelInitializing2 = canShowResetSessionButton2;
            allowEditingSystemPrompt2 = allowEditingSystemPrompt3;
            $composer2 = $composer3;
            function22 = function23;
            final boolean z3 = isResettingSession2;
            final Function1<? super Model, Unit> function16 = function15;
            AppBarKt.m3537CenterAlignedTopAppBarGHTll3U(composableLambdaRememberComposableLambda, modifier2, composableLambdaRememberComposableLambda2, ComposableLambdaKt.rememberComposableLambda(-1306609332, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ModelPageAppBarKt.ModelPageAppBar$lambda$19(curDownloadStatus, model, isModelInitializing2, isModelInitializing, inProgress, isModelInitialized, z3, modelPreparing, function16, showConfigDialog$delegate2, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), 0.0f, null, null, null, $composer2, (($dirty2 >> 18) & 112) | 3462, 240);
            if (ModelPageAppBar$lambda$7(showConfigDialog$delegate2)) {
                $composer2.startReplaceGroup(2132455492);
                ComposerKt.sourceInformation($composer2, "222@9019L28,223@9062L1990,218@8881L2333");
                final List modelConfigs = CollectionsKt.toMutableList((Collection) model.getConfigs());
                if (Intrinsics.areEqual(task.getId(), BuiltInTaskId.LLM_TINY_GARDEN)) {
                    str = "CC(remember):ModelPageAppBar.kt#9igjgp";
                    $composer2.startReplaceGroup(2124126598);
                } else {
                    $composer2.startReplaceGroup(-762487146);
                    ComposerKt.sourceInformation($composer2, "213@8671L54");
                    str = "CC(remember):ModelPageAppBar.kt#9igjgp";
                    ComposerKt.sourceInformationMarkerStart($composer2, -762486222, str);
                    Object it$iv5 = $composer2.rememberedValue();
                    if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function17 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ModelPageAppBarKt.ModelPageAppBar$lambda$22$lambda$20((Config) obj));
                            }
                        };
                        Object value$iv5 = new Predicate() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda3
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return ModelPageAppBarKt.ModelPageAppBar$lambda$22$lambda$21(function17, obj);
                            }
                        };
                        $composer2.updateRememberedValue(value$iv5);
                        it$iv5 = value$iv5;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    modelConfigs.removeIf((Predicate) it$iv5);
                }
                $composer2.endReplaceGroup();
                if (task.allowCapability(ModelCapability.LLM_THINKING, model)) {
                    $composer2.startReplaceGroup(2124126598);
                } else {
                    $composer2.startReplaceGroup(-762482072);
                    ComposerKt.sourceInformation($composer2, "216@8830L40");
                    ComposerKt.sourceInformationMarkerStart($composer2, -762481148, str);
                    Object it$iv6 = $composer2.rememberedValue();
                    if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function18 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(ModelPageAppBarKt.ModelPageAppBar$lambda$25$lambda$23((Config) obj));
                            }
                        };
                        Object value$iv6 = new Predicate() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda5
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return ModelPageAppBarKt.ModelPageAppBar$lambda$25$lambda$24(function18, obj);
                            }
                        };
                        $composer2.updateRememberedValue(value$iv6);
                        it$iv6 = value$iv6;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    modelConfigs.removeIf((Predicate) it$iv6);
                }
                $composer2.endReplaceGroup();
                Map<String, Object> configValues = model.getConfigValues();
                ComposerKt.sourceInformationMarkerStart($composer2, -762475112, str);
                Object it$iv7 = $composer2.rememberedValue();
                if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                    showConfigDialog$delegate = showConfigDialog$delegate2;
                    Object value$iv7 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ModelPageAppBarKt.ModelPageAppBar$lambda$27$lambda$26(showConfigDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv7);
                    it$iv7 = value$iv7;
                } else {
                    showConfigDialog$delegate = showConfigDialog$delegate2;
                }
                Function0 function0 = (Function0) it$iv7;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -762471774, str);
                boolean invalid$iv = $composer2.changedInstance(modelConfigs) | $composer2.changedInstance(model) | ((3670016 & $dirty1) == 1048576) | $composer2.changedInstance(modelManagerViewModel) | $composer2.changedInstance(task) | $composer2.changedInstance(context) | (($dirty1 & 7168) == 2048);
                Object it$iv8 = $composer2.rememberedValue();
                if (invalid$iv || it$iv8 == Composer.INSTANCE.getEmpty()) {
                    final Function1<? super String, Unit> function19 = function14;
                    final MutableState mutableState = showConfigDialog$delegate;
                    Object value$iv8 = new Function3() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return ModelPageAppBarKt.ModelPageAppBar$lambda$30$lambda$29(modelConfigs, model, function19, modelManagerViewModel, task, context, function22, mutableState, (Map) obj, (String) obj2, (String) obj3);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv8);
                    it$iv8 = value$iv8;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ConfigDialogKt.ConfigDialog("Configurations", modelConfigs, configValues, function0, (Function3) it$iv8, null, null, false, allowEditingSystemPrompt2, task.getDefaultSystemPrompt(), curSystemPrompt2, $composer2, (($dirty1 << 12) & 234881024) | 3078, ($dirty1 >> 15) & 14, 224);
            } else {
                $composer2.startReplaceGroup(2124126598);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function13 = function15;
        } else {
            $dirty1 = $dirty13;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            isResettingSession2 = isResettingSession;
            function13 = function1;
            canShowResetSessionButton2 = canShowResetSessionButton;
            hideModelSelector2 = hideModelSelector;
            useThemeColor2 = useThemeColor;
            function22 = function2;
            allowEditingSystemPrompt2 = allowEditingSystemPrompt;
            curSystemPrompt2 = curSystemPrompt;
            function14 = function12;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final boolean z4 = isResettingSession2;
            final Function1<? super Model, Unit> function110 = function13;
            final boolean z5 = canShowResetSessionButton2;
            final boolean z6 = hideModelSelector2;
            final boolean z7 = useThemeColor2;
            final Function2<? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, Unit> function24 = function22;
            final boolean z8 = allowEditingSystemPrompt2;
            final String str2 = curSystemPrompt2;
            final Function1<? super String, Unit> function111 = function14;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModelPageAppBarKt.ModelPageAppBar$lambda$31(task, model, modelManagerViewModel, onBackClicked, onModelSelected, inProgress, modelPreparing, modifier3, z4, function110, z5, z6, z7, function24, z8, str2, function111, $changed, $changed1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean ModelPageAppBar$lambda$7(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ModelPageAppBar$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final ModelManagerUiState ModelPageAppBar$lambda$9(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    
    public static final Unit ModelPageAppBar$lambda$12(boolean $hideModelSelector, boolean $isModelInitializing, boolean $inProgress, Task $task, Model $model, ModelManagerViewModel $modelManagerViewModel, Function2 $onModelSelected, boolean $useThemeColor, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        long tintColor;
        ImageVector imageVector;
        ComposerKt.sourceInformation($composer, "C98@4186L1175:ModelPageAppBar.kt#t7sjiu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-258987625, $changed, -1, "com.google.ai.edge.gallery.ui.common.ModelPageAppBar.<anonymous> (ModelPageAppBar.kt:98)");
            }
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv = (432 << 3) & 112;
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
            int i2 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 62795065, "C103@4352L603:ModelPageAppBar.kt#t7sjiu");
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(10));
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
            ComposerKt.sourceInformationMarkerStart($composer, -917571639, "C110@4640L213,116@4903L10,116@4864L81:ModelPageAppBar.kt#t7sjiu");
            if ($useThemeColor) {
                $composer.startReplaceGroup(-860881178);
                ComposerKt.sourceInformation($composer, "108@4561L11");
                long onSurface = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface();
                $composer.endReplaceGroup();
                tintColor = onSurface;
            } else {
                $composer.startReplaceGroup(-860880294);
                ComposerKt.sourceInformation($composer, "109@4600L29");
                long taskIconColor = ColorUtilsKt.getTaskIconColor($task, $composer, 0);
                $composer.endReplaceGroup();
                tintColor = taskIconColor;
            }
            ImageVector icon = $task.getIcon();
            if (icon == null) {
                $composer.startReplaceGroup(-860877624);
                ComposerKt.sourceInformation($composer, "111@4683L43");
                ImageVector.Companion companion = ImageVector.INSTANCE;
                Integer iconVectorResourceId = $task.getIconVectorResourceId();
                Intrinsics.checkNotNull(iconVectorResourceId);
                ImageVector imageVectorVectorResource = VectorResources_androidKt.vectorResource(companion, iconVectorResourceId.intValue(), $composer, 6);
                $composer.endReplaceGroup();
                imageVector = imageVectorVectorResource;
            } else {
                $composer.startReplaceGroup(-860878399);
                $composer.endReplaceGroup();
                imageVector = icon;
            }
            IconKt.m4075Iconww6aTOc(imageVector, (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), tintColor, $composer, 432, 0);
            TextKt.m4781TextNvy7gAk($task.getLabel(), null, tintColor, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($hideModelSelector) {
                $composer.startReplaceGroup(58445857);
            } else {
                $composer.startReplaceGroup(63436051);
                ComposerKt.sourceInformation($composer, "122@5105L238");
                boolean enableModelPickerChip = ($isModelInitializing || $inProgress) ? false : true;
                ModelPickerChipKt.ModelPickerChip(enableModelPickerChip, $task, $model, $modelManagerViewModel, $onModelSelected, $composer, 0);
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

    
    public static final Unit ModelPageAppBar$lambda$13(boolean $isModelInitializing, boolean $inProgress, Function0 $onBackClicked, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C136@5512L238:ModelPageAppBar.kt#t7sjiu");
        boolean enableBackButton = false;
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-944755243, $changed, -1, "com.google.ai.edge.gallery.ui.common.ModelPageAppBar.<anonymous> (ModelPageAppBar.kt:135)");
            }
            if (!$isModelInitializing && !$inProgress) {
                enableBackButton = true;
            }
            IconButtonKt.IconButton($onBackClicked, null, enableBackButton, null, null, null, ComposableSingletons$ModelPageAppBarKt.INSTANCE.m10838getLambda$1767215881$app_debug(), $composer, 1572864, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit ModelPageAppBar$lambda$19(ModelDownloadStatus $curDownloadStatus, final Model $model, boolean $canShowResetSessionButton, boolean $isModelInitializing, boolean $inProgress, boolean $isModelInitialized, boolean $isResettingSession, boolean $modelPreparing, final Function1 $onResetSessionClicked, final MutableState $showConfigDialog$delegate, RowScope CenterAlignedTopAppBar, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        float configButtonOffset;
        Intrinsics.checkNotNullParameter(CenterAlignedTopAppBar, "$this$CenterAlignedTopAppBar");
        ComposerKt.sourceInformation($composer, "C148@6085L2162:ModelPageAppBar.kt#t7sjiu");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1306609332, $changed, -1, "com.google.ai.edge.gallery.ui.common.ModelPageAppBar.<anonymous> (ModelPageAppBar.kt:145)");
            }
            boolean downloadSucceeded = ($curDownloadStatus != null ? $curDownloadStatus.getStatus() : null) == ModelDownloadStatusType.SUCCEEDED;
            boolean showConfigButton = !$model.getConfigs().isEmpty() && downloadSucceeded;
            boolean showResetSessionButton = $canShowResetSessionButton && downloadSucceeded;
            Modifier modifier$iv = SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(42));
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (54 << 3) & 112;
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
            int i2 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 923092699, "C:ModelPageAppBar.kt#t7sjiu");
            float configButtonOffset2 = C1654Dp.m9788constructorimpl(0);
            if (showConfigButton && $canShowResetSessionButton) {
                float configButtonOffset3 = -40;
                configButtonOffset = C1654Dp.m9788constructorimpl(configButtonOffset3);
            } else {
                configButtonOffset = configButtonOffset2;
            }
            if (showConfigButton) {
                $composer.startReplaceGroup(923217907);
                ComposerKt.sourceInformation($composer, "156@6479L27,155@6445L522");
                boolean enableConfigButton = ($isModelInitializing || $inProgress || !$isModelInitialized) ? false : true;
                Modifier modifierAlpha = AlphaKt.alpha(OffsetKt.m1945offsetVpY3zN4$default(Modifier.INSTANCE, configButtonOffset, 0.0f, 2, null), !enableConfigButton ? 0.5f : 1.0f);
                ComposerKt.sourceInformationMarkerStart($composer, 306879725, "CC(remember):ModelPageAppBar.kt#9igjgp");
                Object it$iv = $composer.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ModelPageAppBarKt.ModelPageAppBar$lambda$19$lambda$18$lambda$15$lambda$14($showConfigDialog$delegate);
                        }
                    };
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) it$iv, modifierAlpha, enableConfigButton, null, null, null, ComposableSingletons$ModelPageAppBarKt.INSTANCE.m10837getLambda$1635306174$app_debug(), $composer, 1572870, 56);
            } else {
                $composer.startReplaceGroup(916907888);
            }
            $composer.endReplaceGroup();
            if (showResetSessionButton) {
                $composer.startReplaceGroup(923904743);
                ComposerKt.sourceInformation($composer, "");
                if ($isResettingSession) {
                    $composer.startReplaceGroup(923909176);
                    ComposerKt.sourceInformation($composer, "172@7132L11,171@7064L190");
                    ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), 0L, C1654Dp.m9788constructorimpl(2), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant(), 0, 0.0f, $composer, 390, 50);
                    $composer.endReplaceGroup();
                } else {
                    $composer.startReplaceGroup(924152371);
                    ComposerKt.sourceInformation($composer, "180@7449L32,179@7413L804");
                    boolean enableResetButton = ($isModelInitializing || $modelPreparing || $inProgress || !$isModelInitialized) ? false : true;
                    Modifier modifierAlpha2 = AlphaKt.alpha(Modifier.INSTANCE, !enableResetButton ? 0.5f : 1.0f);
                    ComposerKt.sourceInformationMarkerStart($composer, 306910770, "CC(remember):ModelPageAppBar.kt#9igjgp");
                    boolean invalid$iv = $composer.changed($onResetSessionClicked) | $composer.changedInstance($model);
                    Object it$iv2 = $composer.rememberedValue();
                    if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ModelPageAppBarKt.ModelPageAppBar$lambda$19$lambda$18$lambda$17$lambda$16($onResetSessionClicked, $model);
                            }
                        };
                        $composer.updateRememberedValue(value$iv2);
                        it$iv2 = value$iv2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    IconButtonKt.IconButton((Function0) it$iv2, modifierAlpha2, enableResetButton, null, null, null, ComposableSingletons$ModelPageAppBarKt.INSTANCE.m10839getLambda$806051225$app_debug(), $composer, 1572864, 56);
                    $composer.endReplaceGroup();
                }
            } else {
                $composer.startReplaceGroup(916907888);
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

    
    public static final Unit ModelPageAppBar$lambda$19$lambda$18$lambda$15$lambda$14(MutableState $showConfigDialog$delegate) {
        ModelPageAppBar$lambda$8($showConfigDialog$delegate, true);
        return Unit.INSTANCE;
    }

    
    public static final Unit ModelPageAppBar$lambda$19$lambda$18$lambda$17$lambda$16(Function1 $onResetSessionClicked, Model $model) {
        $onResetSessionClicked.invoke($model);
        return Unit.INSTANCE;
    }

    
    public static final boolean ModelPageAppBar$lambda$22$lambda$20(Config it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getKey(), ConfigKeys.INSTANCE.getRESET_CONVERSATION_TURN_COUNT());
    }

    
    public static final boolean ModelPageAppBar$lambda$22$lambda$21(Function1 $tmp0, Object p0) {
        return ((Boolean) $tmp0.invoke(p0)).booleanValue();
    }

    
    public static final boolean ModelPageAppBar$lambda$25$lambda$23(Config it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getKey(), ConfigKeys.INSTANCE.getENABLE_THINKING());
    }

    
    public static final boolean ModelPageAppBar$lambda$25$lambda$24(Function1 $tmp0, Object p0) {
        return ((Boolean) $tmp0.invoke(p0)).booleanValue();
    }

    
    public static final Unit ModelPageAppBar$lambda$27$lambda$26(MutableState $showConfigDialog$delegate) {
        ModelPageAppBar$lambda$8($showConfigDialog$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit ModelPageAppBar$lambda$30$lambda$29(List $modelConfigs, Model $model, final Function1 $onSystemPromptChanged, ModelManagerViewModel $modelManagerViewModel, Task $task, Context $context, Function2 $onConfigChanged, MutableState $showConfigDialog$delegate, Map curConfigValues, final String oldSystemPrompt, final String newSystemPrompt) {
        boolean same;
        boolean needReinitialization;
        Intrinsics.checkNotNullParameter(curConfigValues, "curConfigValues");
        Intrinsics.checkNotNullParameter(oldSystemPrompt, "oldSystemPrompt");
        Intrinsics.checkNotNullParameter(newSystemPrompt, "newSystemPrompt");
        ModelPageAppBar$lambda$8($showConfigDialog$delegate, false);
        boolean needReinitialization2 = false;
        Iterator it = $modelConfigs.iterator();
        while (true) {
            if (!it.hasNext()) {
                same = true;
                needReinitialization = false;
                break;
            }
            Config config = (Config) it.next();
            String key = config.getKey().getLabel();
            Object oldValue = ConfigKt.convertValueToTargetType(MapsKt.getValue($model.getConfigValues(), key), config.getValueType());
            Object newValue = ConfigKt.convertValueToTargetType(MapsKt.getValue(curConfigValues, key), config.getValueType());
            if (!Intrinsics.areEqual(oldValue, newValue)) {
                if (config.getNeedReinitialization()) {
                    needReinitialization2 = true;
                }
                same = false;
                needReinitialization = needReinitialization2;
            }
        }
        if (same) {
            if (!Intrinsics.areEqual(newSystemPrompt, oldSystemPrompt)) {
                $onSystemPromptChanged.invoke(newSystemPrompt);
            }
            return Unit.INSTANCE;
        }
        Map<String, Object> configValues = $model.getConfigValues();
        $model.setPrevConfigValues(configValues);
        $model.setConfigValues(curConfigValues);
        $modelManagerViewModel.updateConfigValuesUpdateTrigger();
        if (!$task.getHandleModelConfigChangesInTask()) {
            if (needReinitialization) {
                $modelManagerViewModel.initializeModel($context, $task, $model, true, new Function0() { // from class: com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModelPageAppBarKt.ModelPageAppBar$lambda$30$lambda$29$lambda$28(oldSystemPrompt, newSystemPrompt, $onSystemPromptChanged);
                    }
                });
            }
            $onConfigChanged.invoke(configValues, $model.getConfigValues());
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit ModelPageAppBar$lambda$30$lambda$29$lambda$28(String $oldSystemPrompt, String $newSystemPrompt, Function1 $onSystemPromptChanged) {
        if (!Intrinsics.areEqual($oldSystemPrompt, $newSystemPrompt)) {
            $onSystemPromptChanged.invoke($newSystemPrompt);
        }
        return Unit.INSTANCE;
    }
}
