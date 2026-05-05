package com.google.ai.edge.gallery.ui.modelmanager;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.ai.edge.gallery.GalleryAppTopBarKt;
import com.google.ai.edge.gallery.data.AppBarAction;
import com.google.ai.edge.gallery.data.AppBarActionType;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModelManager.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m922d2 = {"ModelManager", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "viewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "enableAnimation", "", "navigateUp", "Lkotlin/Function0;", "onModelClicked", "Lkotlin/Function1;", "Lcom/google/ai/edge/gallery/data/Model;", "modifier", "Landroidx/compose/ui/Modifier;", "onBenchmarkClicked", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_debug", "modelCount", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ModelManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelManager$lambda$10(Task task, ModelManagerViewModel modelManagerViewModel, boolean z, Function0 function0, Function1 function1, Modifier modifier, Function1 function12, int i, int i2, Composer composer, int i3) {
        ModelManager(task, modelManagerViewModel, z, function0, function1, modifier, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelManager$lambda$1$lambda$0(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void ModelManager(final Task task, final ModelManagerViewModel viewModel, final boolean enableAnimation, final Function0<Unit> navigateUp, final Function1<? super Model, Unit> onModelClicked, Modifier modifier, Function1<? super Model, Unit> function1, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Function1<? super Model, Unit> function12;
        Modifier modifier3;
        Function1<? super Model, Unit> function13;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(navigateUp, "navigateUp");
        Intrinsics.checkNotNullParameter(onModelClicked, "onModelClicked");
        Composer $composer2 = $composer.startRestartGroup(1035355603);
        ComposerKt.sourceInformation($composer2, "C(ModelManager)P(5,6!1,2,4)49@1918L2,54@2023L171,66@2273L57,66@2246L84,73@2379L16,73@2367L28,77@2447L163,83@2616L307,75@2399L524:ModelManager.kt#ahf767");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(enableAnimation) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(navigateUp) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onModelClicked) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 64;
        if (i3 != 0) {
            $dirty |= 1572864;
            function12 = function1;
        } else if ((1572864 & $changed) == 0) {
            function12 = function1;
            $dirty |= $composer2.changedInstance(function12) ? 1048576 : 524288;
        } else {
            function12 = function1;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute((599187 & $dirty2) != 599186, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            function13 = function12;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i3 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer2, -1455669163, "CC(remember):ModelManager.kt#9igjgp");
                Object it$iv = $composer2.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ModelManagerKt.ModelManager$lambda$1$lambda$0((Model) obj);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                function12 = (Function1) it$iv;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1035355603, $dirty2, -1, "com.google.ai.edge.gallery.ui.modelmanager.ModelManager (ModelManager.kt:50)");
            }
            final String title = task.getLabel();
            ComposerKt.sourceInformationMarkerStart($composer2, -1455665634, "CC(remember):ModelManager.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(ModelManagerKt.ModelManager$lambda$3$lambda$2(task));
                    }
                });
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            State modelCount$delegate = (State) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Integer numValueOf = Integer.valueOf(ModelManager$lambda$4(modelCount$delegate));
            ComposerKt.sourceInformationMarkerStart($composer2, -1455657748, "CC(remember):ModelManager.kt#9igjgp");
            boolean invalid$iv = ($dirty2 & 7168) == 2048;
            Object it$iv3 = $composer2.rememberedValue();
            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = (Function2) new ModelManagerKt$ModelManager$2$1(navigateUp, modelCount$delegate, null);
                $composer2.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv3, $composer2, 0);
            ComposerKt.sourceInformationMarkerStart($composer2, -1455654397, "CC(remember):ModelManager.kt#9igjgp");
            boolean invalid$iv2 = ($dirty2 & 7168) == 2048;
            Object it$iv4 = $composer2.rememberedValue();
            if (invalid$iv2 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = new Function0() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ModelManagerKt.ModelManager$lambda$7$lambda$6(navigateUp);
                    }
                };
                $composer2.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BackHandlerKt.BackHandler(false, (Function0) it$iv4, $composer2, 0, 1);
            final Function1<? super Model, Unit> function14 = function12;
            ScaffoldKt.m4398ScaffoldTvnljyQ(modifier3, ComposableLambdaKt.rememberComposableLambda(-817993321, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModelManagerKt.ModelManager$lambda$8(title, navigateUp, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1250830942, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ModelManagerKt.ModelManager$lambda$9(task, viewModel, enableAnimation, onModelClicked, function14, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 15) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function13 = function12;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            final Function1<? super Model, Unit> function15 = function13;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.modelmanager.ModelManagerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ModelManagerKt.ModelManager$lambda$10(task, viewModel, enableAnimation, navigateUp, onModelClicked, modifier4, function15, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ModelManager$lambda$4(State<Integer> state) {
        Object thisObj$iv = state.getValue();
        return ((Number) thisObj$iv).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ModelManager$lambda$3$lambda$2(Task $task) {
        long trigger = $task.getUpdateTrigger().getValue().longValue();
        if (trigger >= 0) {
            return $task.getModels().size();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelManager$lambda$7$lambda$6(Function0 $navigateUp) {
        $navigateUp.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelManager$lambda$8(String $title, Function0 $navigateUp, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C78@2455L149:ModelManager.kt#ahf767");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-817993321, $changed, -1, "com.google.ai.edge.gallery.ui.modelmanager.ModelManager.<anonymous> (ModelManager.kt:78)");
            }
            GalleryAppTopBarKt.GalleryTopAppBar($title, null, new AppBarAction(AppBarActionType.NAVIGATE_UP, $navigateUp), null, null, null, $composer, 0, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelManager$lambda$9(Task $task, ModelManagerViewModel $viewModel, boolean $enableAnimation, Function1 $onModelClicked, Function1 $onBenchmarkClicked, PaddingValues innerPadding, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        ComposerKt.sourceInformation($composer, "C84@2638L281:ModelManager.kt#ahf767");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(innerPadding) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1250830942, $dirty2, -1, "com.google.ai.edge.gallery.ui.modelmanager.ModelManager.<anonymous> (ModelManager.kt:84)");
            }
            ModelListKt.ModelList($task, $viewModel, innerPadding, $enableAnimation, $onModelClicked, $onBenchmarkClicked, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), $composer, (($dirty2 << 6) & 896) | 1572864, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
