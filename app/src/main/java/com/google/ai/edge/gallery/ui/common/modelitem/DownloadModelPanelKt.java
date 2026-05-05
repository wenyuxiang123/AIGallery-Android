package com.google.ai.edge.gallery.ui.common.modelitem;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.UpdateKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.ModelFile;
import com.google.ai.edge.gallery.data.RuntimeType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.DownloadAndTryButtonKt;
import com.google.ai.edge.gallery.ui.common.tos.TosViewModel;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;



V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class DownloadModelPanelKt {
    
    public static final Unit DownloadModelPanel_KNANIv4$lambda$7(Model model, Task task, ModelManagerViewModel modelManagerViewModel, ModelDownloadStatusType modelDownloadStatusType, float f, boolean z, SharedTransitionScope sharedTransitionScope, AnimatedVisibilityScope animatedVisibilityScope, Function0 function0, TosViewModel tosViewModel, Modifier modifier, long j, int i, int i2, int i3, Composer composer, int i4) {
        m11023DownloadModelPanelKNANIv4(model, task, modelManagerViewModel, modelDownloadStatusType, f, z, sharedTransitionScope, animatedVisibilityScope, function0, tosViewModel, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    
    public static final void m11023DownloadModelPanelKNANIv4(final Model model, final Task task, final ModelManagerViewModel modelManagerViewModel, final ModelDownloadStatusType downloadStatus, final float downloadProgress, final boolean isExpanded, final SharedTransitionScope sharedTransitionScope, final AnimatedVisibilityScope animatedVisibilityScope, final Function0<Unit> onTryItClicked, TosViewModel tosViewModel, Modifier modifier, long downloadButtonBackgroundColor, Composer $composer, final int $changed, final int $changed1, final int i) {
        Composer $composer2;
        TosViewModel tosViewModel2;
        Modifier modifier2;
        long downloadButtonBackgroundColor2;
        int $dirty1;
        Composer $composer$iv;
        Modifier materialized$iv$iv;
        Composer $composer$iv2;
        TosViewModel tosViewModel3;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(sharedTransitionScope, "sharedTransitionScope");
        Intrinsics.checkNotNullParameter(animatedVisibilityScope, "animatedVisibilityScope");
        Intrinsics.checkNotNullParameter(onTryItClicked, "onTryItClicked");
        Composer $composer3 = $composer.startRestartGroup(798174604);
        ComposerKt.sourceInformation($composer3, "C(DownloadModelPanel)P(5,10,6,3,2,4,9!1,8,11,7,1:c#ui.graphics.Color)*69@2859L3045:DownloadModelPanel.kt#13a6jo");
        int $dirty = $changed;
        int $dirty12 = $changed1;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(model) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(task) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(modelManagerViewModel) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(downloadStatus == null ? -1 : downloadStatus.ordinal()) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changed(downloadProgress) ? 16384 : 8192;
        }
        if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty |= $composer3.changed(isExpanded) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty |= $composer3.changed(sharedTransitionScope) ? 1048576 : 524288;
        }
        if (($changed & 12582912) == 0) {
            $dirty |= $composer3.changedInstance(animatedVisibilityScope) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty |= $composer3.changedInstance(onTryItClicked) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i2 = i & 512;
        if (i2 != 0) {
            $dirty |= 805306368;
        } else if (($changed & 805306368) == 0) {
            $dirty |= $composer3.changedInstance(tosViewModel) ? 536870912 : 268435456;
        }
        int i3 = i & 1024;
        if (i3 != 0) {
            $dirty12 |= 6;
        } else if (($changed1 & 6) == 0) {
            $dirty12 |= $composer3.changed(modifier) ? 4 : 2;
        }
        if (($changed1 & 48) == 0) {
            $dirty12 |= ((i & 2048) == 0 && $composer3.changed(downloadButtonBackgroundColor)) ? 32 : 16;
        }
        if ($composer3.shouldExecute((($dirty & 306783379) == 306783378 && ($dirty12 & 19) == 18) ? false : true, $dirty & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "66@2789L11");
            if (($changed & 1) == 0 || $composer3.getDefaultsInvalid()) {
                TosViewModel tosViewModel4 = i2 != 0 ? null : tosViewModel;
                Modifier.Companion modifier3 = i3 != 0 ? Modifier.INSTANCE : modifier;
                if ((i & 2048) != 0) {
                    modifier2 = modifier3;
                    $dirty1 = $dirty12 & (-113);
                    tosViewModel2 = tosViewModel4;
                    downloadButtonBackgroundColor2 = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceContainer();
                } else {
                    downloadButtonBackgroundColor2 = downloadButtonBackgroundColor;
                    modifier2 = modifier3;
                    $dirty1 = $dirty12;
                    tosViewModel2 = tosViewModel4;
                }
            } else {
                $composer3.skipToGroupEnd();
                if ((i & 2048) != 0) {
                    $dirty12 &= -113;
                }
                tosViewModel2 = tosViewModel;
                modifier2 = modifier;
                downloadButtonBackgroundColor2 = downloadButtonBackgroundColor;
                $dirty1 = $dirty12;
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(798174604, $dirty, $dirty1, "com.google.ai.edge.gallery.ui.common.modelitem.DownloadModelPanel (DownloadModelPanel.kt:67)");
            }
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getEnd();
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            int $changed$iv = ($dirty1 & 14) | 432;
            Modifier modifier$iv = modifier2;
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (((($changed$iv << 3) & 112) << 6) & 896) | 6;
            int $dirty13 = $dirty1;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i5 = (($changed$iv >> 6) & 112) | 6;
            RowScope $this$DownloadModelPanel_KNANIv4_u24lambda_u246_u24lambda_u245 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 841590991, "C142@5569L65,131@5143L755:DownloadModelPanel.kt#13a6jo");
            if (model.getUpdatable()) {
                $composer3.startReplaceGroup(841935400);
                ComposerKt.sourceInformation($composer3, "90@3670L63,96@3960L11,95@3901L103,99@4088L260,107@4360L718,86@3550L1528,128@5088L39");
                $composer$iv = $composer3;
                Modifier buttonModifier = SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(42));
                if (isExpanded) {
                    buttonModifier = RowScope.weight$default($this$DownloadModelPanel_KNANIv4_u24lambda_u246_u24lambda_u245, buttonModifier, 1.0f, false, 2, null);
                }
                materialized$iv$iv = materialized$iv$iv2;
                $composer$iv2 = $composer3;
                Modifier modifierThen = SharedTransitionScope.sharedElement$default(sharedTransitionScope, Modifier.INSTANCE, sharedTransitionScope.rememberSharedContentState("update_button_" + model.getName(), $composer3, 0), animatedVisibilityScope, null, null, false, 0.0f, null, 124, null).then(buttonModifier);
                ButtonColors buttonColorsM3587buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m3587buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSecondaryContainer(), 0L, 0L, 0L, $composer3, ButtonDefaults.$stable << 12, 14);
                PaddingValues paddingValuesM1983PaddingValuesYgX7TsA$default = PaddingKt.m1983PaddingValuesYgX7TsA$default(C1654Dp.m9788constructorimpl(12), 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer3, -388461908, "CC(remember):DownloadModelPanel.kt#9igjgp");
                boolean invalid$iv = $composer3.changedInstance(model) | $composer3.changedInstance(modelManagerViewModel) | $composer3.changedInstance(task);
                Object it$iv = $composer3.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.DownloadModelPanelKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DownloadModelPanelKt.DownloadModelPanel_KNANIv4$lambda$6$lambda$5$lambda$2$lambda$1(model, modelManagerViewModel, task);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ButtonKt.Button((Function0) it$iv, modifierThen, false, null, buttonColorsM3587buttonColorsro_MJ88, null, null, paddingValuesM1983PaddingValuesYgX7TsA$default, null, ComposableLambdaKt.rememberComposableLambda(-236169859, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.DownloadModelPanelKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return DownloadModelPanelKt.DownloadModelPanel_KNANIv4$lambda$6$lambda$5$lambda$4(isExpanded, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer3, 54), $composer3, 817889280, 364);
                SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8)), $composer3, 6);
            } else {
                $composer$iv = $composer3;
                materialized$iv$iv = materialized$iv$iv2;
                $composer$iv2 = $composer3;
                $composer3.startReplaceGroup(838518394);
            }
            $composer3.endReplaceGroup();
            boolean zM515x4b3a66d3 = m515x4b3a66d3(downloadStatus, model);
            boolean z = !isExpanded;
            Modifier modifierSharedElement$default = SharedTransitionScope.sharedElement$default(sharedTransitionScope, Modifier.INSTANCE, sharedTransitionScope.rememberSharedContentState("download_button_" + model.getName(), $composer3, 0), animatedVisibilityScope, null, null, false, 0.0f, null, 124, null);
            Modifier modifierWeight$default = RowScope.weight$default($this$DownloadModelPanel_KNANIv4_u24lambda_u246_u24lambda_u245, Modifier.INSTANCE, 1.0f, false, 2, null);
            if (tosViewModel2 == null) {
                $composer3.startReplaceGroup(-388407273);
                ComposerKt.sourceInformation($composer3, "146@5803L15");
                $composer2 = $composer3;
                ComposerKt.sourceInformationMarkerStart($composer3, 1192010736, "CC(hiltViewModel)P(1)38@1622L7,43@1774L47,44@1833L54:HiltViewModel.kt#gplxbw");
                ViewModelStoreOwner viewModelStoreOwner$iv = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer3, LocalViewModelStoreOwner.$stable);
                if (viewModelStoreOwner$iv == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModelProvider.Factory factory$iv = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner$iv, $composer3, 0 & 14);
                int $changed$iv$iv = (0 & 14) | (0 & 112);
                ComposerKt.sourceInformationMarkerStart($composer3, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
                CreationExtras extras$iv$iv = viewModelStoreOwner$iv instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner$iv).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(TosViewModel.class), viewModelStoreOwner$iv, (String) null, factory$iv, extras$iv$iv, $composer3, (($changed$iv$iv << 3) & 112) | (($changed$iv$iv << 3) & 896) | (($changed$iv$iv << 3) & 7168) | (($changed$iv$iv << 3) & 57344), 0);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
                tosViewModel3 = (TosViewModel) viewModel;
            } else {
                $composer2 = $composer3;
                $composer3.startReplaceGroup(-388407769);
                $composer3.endReplaceGroup();
                tosViewModel3 = tosViewModel2;
            }
            DownloadAndTryButtonKt.m10870DownloadAndTryButtoncTzpE40(task, model, zM515x4b3a66d3, downloadStatus, downloadProgress, modelManagerViewModel, onTryItClicked, modifierSharedElement$default, tosViewModel3, modifierWeight$default, z, false, downloadButtonBackgroundColor2, $composer3, (($dirty >> 3) & 14) | (($dirty << 3) & 112) | ($dirty & 7168) | (57344 & $dirty) | (($dirty << 9) & 458752) | (($dirty >> 6) & 3670016), ($dirty13 << 3) & 896, 2048);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            Unit unit = Unit.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            tosViewModel2 = tosViewModel;
            modifier2 = modifier;
            downloadButtonBackgroundColor2 = downloadButtonBackgroundColor;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final TosViewModel tosViewModel5 = tosViewModel2;
            final Modifier modifier4 = modifier2;
            final long j = downloadButtonBackgroundColor2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.modelitem.DownloadModelPanelKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DownloadModelPanelKt.DownloadModelPanel_KNANIv4$lambda$7(model, task, modelManagerViewModel, downloadStatus, downloadProgress, isExpanded, sharedTransitionScope, animatedVisibilityScope, onTryItClicked, tosViewModel5, modifier4, j, $changed, $changed1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    
    private static final boolean m515x4b3a66d3(ModelDownloadStatusType downloadStatus, Model model) {
        boolean downloadFailed = downloadStatus == ModelDownloadStatusType.FAILED;
        boolean isLitertLm = model.getRuntimeType() == RuntimeType.LITERT_LM;
        return !downloadFailed || isLitertLm;
    }

    
    public static final Unit DownloadModelPanel_KNANIv4$lambda$6$lambda$5$lambda$2$lambda$1(Model $model, ModelManagerViewModel $modelManagerViewModel, Task $task) {
        ModelFile it = $model.getLatestModelFile();
        if (it != null) {
            $model.setVersion(it.getCommitHash());
            $model.setDownloadFileName(it.getFileName());
        }
        $model.setUpdatable(false);
        $modelManagerViewModel.downloadModel($task, $model);
        return Unit.INSTANCE;
    }

    
    public static final Unit DownloadModelPanel_KNANIv4$lambda$6$lambda$5$lambda$4(boolean $isExpanded, RowScope Button, Composer $composer, int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C108@4402L11,109@4445L623:DownloadModelPanel.kt#13a6jo");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-236169859, $changed, -1, "com.google.ai.edge.gallery.ui.common.modelitem.DownloadModelPanel.<anonymous>.<anonymous>.<anonymous> (DownloadModelPanel.kt:108)");
            }
            long textColor = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSecondaryContainer();
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
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
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i2 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1336877050, "C113@4600L72:DownloadModelPanel.kt#13a6jo");
            IconKt.m4075Iconww6aTOc(UpdateKt.getUpdate(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, textColor, $composer, 48, 4);
            if ($isExpanded) {
                $composer.startReplaceGroup(1336975071);
                ComposerKt.sourceInformation($composer, "117@4740L31,119@4846L10,116@4718L324");
                TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.update, $composer, 0), null, textColor, TextAutoSize.INSTANCE.m2476StepBasedvU0ePk(TextUnitKt.getSp(8), TextUnitKt.getSp(16), TextUnitKt.getSp(1)), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 24576, 114674);
                $composer.endReplaceGroup();
                $composer2 = $composer;
            } else {
                $composer2 = $composer;
                $composer2.startReplaceGroup(1332298721);
                $composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
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
}
