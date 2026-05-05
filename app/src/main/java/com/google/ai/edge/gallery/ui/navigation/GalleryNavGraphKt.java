package com.google.ai.edge.gallery.ui.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.LayoutCoordinates;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.IntOffset;
import androidx.compose.p000ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.ServiceStarter;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import com.google.ai.edge.gallery.customtasks.common.CustomTaskData;
import com.google.ai.edge.gallery.customtasks.common.CustomTaskDataForBuiltinTask;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.data.TasksKt;
import com.google.ai.edge.gallery.ui.benchmark.BenchmarkScreenKt;
import com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt;
import com.google.ai.edge.gallery.ui.common.chat.ModelDownloadStatusInfoPanelKt;
import com.google.ai.edge.gallery.ui.common.tos.TosViewModel;
import com.google.ai.edge.gallery.ui.home.HomeScreenKt;
import com.google.ai.edge.gallery.ui.home.PromoScreenGm4Kt;
import com.google.ai.edge.gallery.ui.modelmanager.GlobalModelManagerKt;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerKt;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: GalleryNavGraph.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u001a\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u0014H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\u0014H\u0002\u001a\u0010\u0010\u0017\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u0014H\u0002\u001a\u0010\u0010\u0018\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\u0014H\u0002\u001a'\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\u0010!\u001ak\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0*2&\u0010+\u001a\"\u0012\u0013\u0012\u00110-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u001a0,¢\u0006\u0002\b1H\u0003¢\u0006\u0002\u00102\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063²\u0006\n\u00104\u001a\u00020&X\u008a\u008e\u0002²\u0006\f\u00105\u001a\u0004\u0018\u00010$X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020&X\u008a\u008e\u0002²\u0006\u0012\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010*X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020-X\u008a\u0084\u0002"}, m922d2 = {"TAG", "", "ROUTE_HOMESCREEN", "ROUTE_MODEL_LIST", "ROUTE_MODEL", "ROUTE_BENCHMARK", "ROUTE_MODEL_MANAGER", "ENTER_ANIMATION_DURATION_MS", "", "ENTER_ANIMATION_EASING", "Landroidx/compose/animation/core/Easing;", "ENTER_ANIMATION_DELAY_MS", "EXIT_ANIMATION_DURATION_MS", "EXIT_ANIMATION_EASING", "enterTween", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "exitTween", "slideEnter", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "slideExit", "Landroidx/compose/animation/ExitTransition;", "slideUpEnter", "slideDownExit", "GalleryNavHost", "", "navController", "Landroidx/navigation/NavHostController;", "modifier", "Landroidx/compose/ui/Modifier;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "(Landroidx/navigation/NavHostController;Landroidx/compose/ui/Modifier;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Landroidx/compose/runtime/Composer;II)V", "CustomTaskScreen", "task", "Lcom/google/ai/edge/gallery/data/Task;", "disableAppBarControls", "", "hideTopBar", "useThemeColor", "onNavigateUp", "Lkotlin/Function0;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Dp;", "Lkotlin/ParameterName;", "name", "bottomPadding", "Landroidx/compose/runtime/Composable;", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "app_debug", "showModelManager", "pickedTask", "enableHomeScreenAnimation", "enableModelListAnimation", "promoDismissed", "startAnimation", "customNavigateUpCallback", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "navigatingUp", "showErrorDialog", "appBarHeight", "animatedTopPadding"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GalleryNavGraphKt {
    private static final int ENTER_ANIMATION_DELAY_MS = 100;
    private static final int ENTER_ANIMATION_DURATION_MS = 500;
    private static final int EXIT_ANIMATION_DURATION_MS = 500;
    private static final String ROUTE_BENCHMARK = "benchmark";
    private static final String ROUTE_HOMESCREEN = "homepage";
    private static final String ROUTE_MODEL = "route_model";
    private static final String ROUTE_MODEL_LIST = "model_list";
    private static final String ROUTE_MODEL_MANAGER = "model_manager";
    private static final String TAG = "AGGalleryNavGraph";
    private static final Easing ENTER_ANIMATION_EASING = EasingFunctionsKt.getEaseOutExpo();
    private static final Easing EXIT_ANIMATION_EASING = EasingFunctionsKt.getEaseOutExpo();

    /* JADX INFO: compiled from: GalleryNavGraph.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$134(Task task, ModelManagerViewModel modelManagerViewModel, boolean z, boolean z2, boolean z3, Function0 function0, Function3 function3, int i, Composer composer, int i2) {
        CustomTaskScreen(task, modelManagerViewModel, z, z2, z3, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$96(NavHostController navHostController, Modifier modifier, ModelManagerViewModel modelManagerViewModel, int i, int i2, Composer composer, int i3) {
        GalleryNavHost(navHostController, modifier, modelManagerViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final FiniteAnimationSpec<IntOffset> enterTween() {
        return AnimationSpecKt.tween(ServiceStarter.ERROR_UNKNOWN, 100, ENTER_ANIMATION_EASING);
    }

    private static final FiniteAnimationSpec<IntOffset> exitTween() {
        return AnimationSpecKt.tween$default(ServiceStarter.ERROR_UNKNOWN, 0, EXIT_ANIMATION_EASING, 2, null);
    }

    private static final EnterTransition slideEnter(AnimatedContentTransitionScope<?> animatedContentTransitionScope) {
        return AnimatedContentTransitionScope.m1115slideIntoContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m1128getLeftDKzdypw(), enterTween(), null, 4, null);
    }

    private static final ExitTransition slideExit(AnimatedContentTransitionScope<?> animatedContentTransitionScope) {
        return AnimatedContentTransitionScope.m1116slideOutOfContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m1129getRightDKzdypw(), exitTween(), null, 4, null);
    }

    private static final EnterTransition slideUpEnter(AnimatedContentTransitionScope<?> animatedContentTransitionScope) {
        return AnimatedContentTransitionScope.m1115slideIntoContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m1131getUpDKzdypw(), enterTween(), null, 4, null);
    }

    private static final ExitTransition slideDownExit(AnimatedContentTransitionScope<?> animatedContentTransitionScope) {
        return AnimatedContentTransitionScope.m1116slideOutOfContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m1126getDownDKzdypw(), exitTween(), null, 4, null);
    }

    /* JADX WARN: Type inference failed for: r4v19, types: [T, java.lang.String] */
    public static final void GalleryNavHost(final NavHostController navController, Modifier modifier, final ModelManagerViewModel modelManagerViewModel, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Composer $composer3 = $composer.startRestartGroup(34327023);
        ComposerKt.sourceInformation($composer3, "C(GalleryNavHost)P(2,1)152@6288L7,153@6322L34,154@6377L40,155@6453L33,156@6521L33,157@6586L15,160@6679L594,160@6646L627,185@7384L24,186@7431L23,182@7277L9051,442@16429L7:GalleryNavGraph.kt#jlis1r");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(navController) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(modelManagerViewModel) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(34327023, $dirty2, -1, "com.google.ai.edge.gallery.ui.navigation.GalleryNavHost (GalleryNavGraph.kt:151)");
            }
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, -1371461871, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1371460105, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState pickedTask$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1371457680, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv3 = $composer3.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer3.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            final MutableState enableHomeScreenAnimation$delegate = (MutableState) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1371455504, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv4 = $composer3.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer3.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            final MutableState enableModelListAnimation$delegate = (MutableState) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Ref.ObjectRef lastNavigatedModelName = new Ref.ObjectRef();
            ComposerKt.sourceInformationMarkerStart($composer3, -1371453442, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv5 = $composer3.rememberedValue();
            if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                $composer3.updateRememberedValue("");
                it$iv5 = "";
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            lastNavigatedModelName.element = (String) it$iv5;
            ComposerKt.sourceInformationMarkerStart($composer3, -1371449887, "CC(remember):GalleryNavGraph.kt#9igjgp");
            boolean invalid$iv = $composer3.changedInstance(modelManagerViewModel) | $composer3.changedInstance(lifecycleOwner);
            Object it$iv6 = $composer3.rememberedValue();
            if (invalid$iv || it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryNavGraphKt.GalleryNavHost$lambda$16$lambda$15(lifecycleOwner, modelManagerViewModel, (DisposableEffectScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv5);
                it$iv6 = value$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) it$iv6, $composer3, 0);
            ComposerKt.sourceInformationMarkerStart($composer3, -1371427897, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv7 = $composer3.rememberedValue();
            if (it$iv7 == Composer.INSTANCE.getEmpty()) {
                Object value$iv6 = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryNavGraphKt.GalleryNavHost$lambda$18$lambda$17((AnimatedContentTransitionScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv6);
                it$iv7 = value$iv6;
            }
            Function1 function1 = (Function1) it$iv7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1371426394, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv8 = $composer3.rememberedValue();
            if (it$iv8 == Composer.INSTANCE.getEmpty()) {
                Object value$iv7 = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryNavGraphKt.GalleryNavHost$lambda$20$lambda$19((AnimatedContentTransitionScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv7);
                it$iv8 = value$iv7;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Modifier modifier4 = modifier3;
            $composer2 = $composer3;
            NavHostKt.NavHost(navController, ROUTE_HOMESCREEN, null, null, null, function1, (Function1) it$iv8, null, null, null, new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GalleryNavGraphKt.GalleryNavHost$lambda$94(modifier4, modelManagerViewModel, navController, enableHomeScreenAnimation$delegate, pickedTask$delegate, enableModelListAnimation$delegate, lastNavigatedModelName, (NavGraphBuilder) obj);
                }
            }, $composer3, ($dirty2 & 14) | 1769520, 0, 924);
            ProvidableCompositionLocal<Activity> localActivity = LocalActivityKt.getLocalActivity();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer2.consume(localActivity);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Activity activity = (Activity) objConsume2;
            Intent intent = activity != null ? activity.getIntent() : null;
            Uri data = intent != null ? intent.getData() : null;
            if (data != null) {
                intent.setData(null);
                Log.d(TAG, "navigation link clicked: " + data);
                String string = data.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (StringsKt.startsWith$default(string, "com.google.ai.edge.gallery://model/", false, 2, (Object) null)) {
                    if (data.getPathSegments().size() >= 2) {
                        String taskId = data.getPathSegments().get(data.getPathSegments().size() - 2);
                        List<String> pathSegments = data.getPathSegments();
                        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
                        String modelName = (String) CollectionsKt.last((List) pathSegments);
                        Intrinsics.checkNotNull(modelName);
                        Model model = modelManagerViewModel.getModelByName(modelName);
                        if (model != null) {
                            NavController.navigate$default((NavController) navController, "route_model/" + taskId + "/" + model.getName(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                        }
                    } else {
                        Log.e(TAG, "Malformed deep link URI received: " + data);
                    }
                } else if (Intrinsics.areEqual(data.toString(), "com.google.ai.edge.gallery://global_model_manager")) {
                    NavController.navigate$default((NavController) navController, ROUTE_MODEL_MANAGER, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GalleryNavGraphKt.GalleryNavHost$lambda$96(navController, modifier5, modelManagerViewModel, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean GalleryNavHost$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final Task GalleryNavHost$lambda$4(MutableState<Task> mutableState) {
        MutableState<Task> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean GalleryNavHost$lambda$7(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void GalleryNavHost$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GalleryNavHost$lambda$10(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void GalleryNavHost$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult GalleryNavHost$lambda$16$lambda$15(final LifecycleOwner $lifecycleOwner, final ModelManagerViewModel $modelManagerViewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver observer = new LifecycleEventObserver() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                GalleryNavGraphKt.GalleryNavHost$lambda$16$lambda$15$lambda$13($modelManagerViewModel, lifecycleOwner, event);
            }
        };
        $lifecycleOwner.getLifecycle().addObserver(observer);
        return new DisposableEffectResult() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$GalleryNavHost$lambda$16$lambda$15$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                $lifecycleOwner.getLifecycle().removeObserver(observer);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GalleryNavHost$lambda$16$lambda$15$lambda$13(ModelManagerViewModel $modelManagerViewModel, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
            case 2:
                $modelManagerViewModel.setAppInForeground(true);
                break;
            case 3:
            case 4:
                $modelManagerViewModel.setAppInForeground(false);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition GalleryNavHost$lambda$18$lambda$17(AnimatedContentTransitionScope NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return EnterTransition.INSTANCE.getNone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition GalleryNavHost$lambda$20$lambda$19(AnimatedContentTransitionScope NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        return ExitTransition.INSTANCE.getNone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94(final Modifier $modifier, final ModelManagerViewModel $modelManagerViewModel, final NavHostController $navController, final MutableState $enableHomeScreenAnimation$delegate, final MutableState $pickedTask$delegate, final MutableState $enableModelListAnimation$delegate, final Ref.ObjectRef $lastNavigatedModelName, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, ROUTE_HOMESCREEN, (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-381246958, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$41($modifier, $modelManagerViewModel, $navController, $enableHomeScreenAnimation$delegate, $pickedTask$delegate, $enableModelListAnimation$delegate, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, ROUTE_MODEL_LIST, (List) null, (List) null, new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$42((AnimatedContentTransitionScope) obj);
            }
        }, new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$43((AnimatedContentTransitionScope) obj);
            }
        }, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1287252855, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$52($pickedTask$delegate, $modelManagerViewModel, $navController, $enableModelListAnimation$delegate, $enableHomeScreenAnimation$delegate, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 230, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "route_model/{taskId}/{modelName}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("taskId", new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$53((NavArgumentBuilder) obj);
            }
        }), NamedNavArgumentKt.navArgument("modelName", new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$54((NavArgumentBuilder) obj);
            }
        })}), (List) null, new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$55((AnimatedContentTransitionScope) obj);
            }
        }, new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$56((AnimatedContentTransitionScope) obj);
            }
        }, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-123671670, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$76($modelManagerViewModel, $lastNavigatedModelName, $navController, $enableModelListAnimation$delegate, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 228, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, ROUTE_MODEL_MANAGER, (List) null, (List) null, new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$77((AnimatedContentTransitionScope) obj);
            }
        }, new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$78((AnimatedContentTransitionScope) obj);
            }
        }, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1039909515, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$86($modelManagerViewModel, $navController, $enableHomeScreenAnimation$delegate, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 230, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "benchmark/{modelName}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("modelName", new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$87((NavArgumentBuilder) obj);
            }
        })), (List) null, new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$88((AnimatedContentTransitionScope) obj);
            }
        }, new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$89((AnimatedContentTransitionScope) obj);
            }
        }, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-2091476596, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$93($modelManagerViewModel, $navController, $enableModelListAnimation$delegate, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 228, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$41(Modifier $modifier, final ModelManagerViewModel $modelManagerViewModel, final NavHostController $navController, final MutableState $enableHomeScreenAnimation$delegate, final MutableState $pickedTask$delegate, final MutableState $enableModelListAnimation$delegate, AnimatedContentScope composable, NavBackStackEntry it, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C192@7623L2092:GalleryNavGraph.kt#jlis1r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-381246958, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.GalleryNavHost.<anonymous>.<anonymous> (GalleryNavGraph.kt:191)");
        }
        final String promoId = "gm4";
        Modifier modifier$iv = SizeKt.fillMaxSize$default($modifier, 0.0f, 1, null);
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
        ComposerKt.sourceInformationMarkerStart($composer, -1849026792, "C193@7694L34,195@7786L685:GalleryNavGraph.kt#jlis1r");
        ComposerKt.sourceInformationMarkerStart($composer, 633089338, "CC(remember):GalleryNavGraph.kt#9igjgp");
        Object value$iv = $composer.rememberedValue();
        if (value$iv == Composer.INSTANCE.getEmpty()) {
            value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            $composer.updateRememberedValue(value$iv);
        }
        final MutableState promoDismissed$delegate = (MutableState) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Function2 homeScreenContent = ComposableLambdaKt.rememberComposableLambda(-1932463506, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$29($modelManagerViewModel, $navController, $enableHomeScreenAnimation$delegate, $pickedTask$delegate, $enableModelListAnimation$delegate, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, $composer, 54);
        if ($modelManagerViewModel.getDataStoreRepository().hasViewedPromo("gm4")) {
            $composer.startReplaceGroup(-1848145215);
            ComposerKt.sourceInformation($composer, "216@8635L19");
            homeScreenContent.invoke($composer, 6);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(-1847992757);
            ComposerKt.sourceInformation($composer, "223@8883L35,224@8932L765,220@8760L937");
            Boolean boolValueOf = Boolean.valueOf(GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$22(promoDismissed$delegate));
            ComposerKt.sourceInformationMarkerStart($composer, 633127387, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$31$lambda$30((AnimatedContentTransitionScope) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) it$iv, null, "PromoToHome", null, ComposableLambdaKt.rememberComposableLambda(-1806455873, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$39(homeScreenContent, $modelManagerViewModel, promoId, promoDismissed$delegate, (AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 1597824, 42);
            $composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    private static final boolean GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$22(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$29(ModelManagerViewModel $modelManagerViewModel, final NavHostController $navController, MutableState $enableHomeScreenAnimation$delegate, final MutableState $pickedTask$delegate, final MutableState $enableModelListAnimation$delegate, Composer $composer, int $changed) {
        CreationExtras extras$iv$iv;
        ComposerKt.sourceInformation($composer, "C198@7896L15,200@8005L340,209@8377L47,196@7798L663:GalleryNavGraph.kt#jlis1r");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1932463506, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.GalleryNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GalleryNavGraph.kt:196)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1192010736, "CC(hiltViewModel)P(1)38@1622L7,43@1774L47,44@1833L54:HiltViewModel.kt#gplxbw");
            ViewModelStoreOwner viewModelStoreOwner$iv = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer, LocalViewModelStoreOwner.$stable);
            if (viewModelStoreOwner$iv == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModelProvider.Factory factory$iv = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner$iv, $composer, 0 & 14);
            int $changed$iv$iv = (0 & 14) | (0 & 112);
            ComposerKt.sourceInformationMarkerStart($composer, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
            if (viewModelStoreOwner$iv instanceof HasDefaultViewModelProviderFactory) {
                extras$iv$iv = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner$iv).getDefaultViewModelCreationExtras();
            } else {
                extras$iv$iv = CreationExtras.Empty.INSTANCE;
            }
            int $changed$iv = $changed$iv$iv << 3;
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(TosViewModel.class), viewModelStoreOwner$iv, (String) null, factory$iv, extras$iv$iv, $composer, ($changed$iv & 896) | (($changed$iv$iv << 3) & 112) | (($changed$iv$iv << 3) & 7168) | (($changed$iv$iv << 3) & 57344), 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            TosViewModel tosViewModel = (TosViewModel) viewModel;
            boolean zGalleryNavHost$lambda$7 = GalleryNavHost$lambda$7($enableHomeScreenAnimation$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1671550046, "CC(remember):GalleryNavGraph.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($navController);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryNavGraphKt.m584xe72af151($navController, $pickedTask$delegate, $enableModelListAnimation$delegate, (Task) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            Function1 function1 = (Function1) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1671538435, "CC(remember):GalleryNavGraph.kt#9igjgp");
            boolean invalid$iv2 = $composer.changedInstance($navController);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GalleryNavGraphKt.m585x10f456d5($navController);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            HomeScreenKt.HomeScreen($modelManagerViewModel, tosViewModel, function1, (Function0) it$iv2, zGalleryNavHost$lambda$7, null, true, $composer, 1572864, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$29$lambda$26$lambda$25 */
    public static final Unit m584xe72af151(NavHostController $navController, MutableState $pickedTask$delegate, MutableState $enableModelListAnimation$delegate, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        $pickedTask$delegate.setValue(task);
        GalleryNavHost$lambda$11($enableModelListAnimation$delegate, true);
        NavController.navigate$default((NavController) $navController, ROUTE_MODEL_LIST, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.CAPABILITY_SELECT.getId();
            Bundle $this$GalleryNavHost_u24lambda_u2494_u24lambda_u2441_u24lambda_u2440_u24lambda_u2429_u24lambda_u2426_u24lambda_u2425_u24lambda_u2424 = new Bundle();
            $this$GalleryNavHost_u24lambda_u2494_u24lambda_u2441_u24lambda_u2440_u24lambda_u2429_u24lambda_u2426_u24lambda_u2425_u24lambda_u2424.putString("capability_name", task.getId());
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$GalleryNavHost_u24lambda_u2494_u24lambda_u2441_u24lambda_u2440_u24lambda_u2429_u24lambda_u2426_u24lambda_u2425_u24lambda_u2424);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$29$lambda$28$lambda$27 */
    public static final Unit m585x10f456d5(NavHostController $navController) {
        NavController.navigate$default((NavController) $navController, ROUTE_MODEL_MANAGER, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$31$lambda$30(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$39(Function2 $homeScreenContent, final ModelManagerViewModel $modelManagerViewModel, final String $promoId, final MutableState $promoDismissed$delegate, AnimatedContentScope AnimatedContent, boolean dismissed, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C:GalleryNavGraph.kt#jlis1r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1806455873, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.GalleryNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GalleryNavGraph.kt:225)");
        }
        if (dismissed) {
            $composer.startReplaceGroup(-186650478);
            ComposerKt.sourceInformation($composer, "226@8990L19");
            $homeScreenContent.invoke($composer, 6);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(-186577101);
            ComposerKt.sourceInformation($composer, "228@9067L34,229@9137L81,229@9116L102,236@9412L259,233@9233L438");
            ComposerKt.sourceInformationMarkerStart($composer, -837302015, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            MutableState startAnimation$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -837299728, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = (Function2) new GalleryNavGraphKt$GalleryNavHost$4$1$1$2$1$1(startAnimation$delegate, null);
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv2, $composer, 6);
            AnimatedVisibilityKt.AnimatedVisibility(GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$39$lambda$33(startAnimation$delegate), (Modifier) null, EnterExitTransitionKt.m1159scaleInL8ZKhE$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 1.05f, 0L, 4, null), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1306856765, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$39$lambda$38($modelManagerViewModel, $promoId, $promoDismissed$delegate, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f249xf2722a21, 26);
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    private static final boolean GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$39$lambda$33(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$39$lambda$34(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$39$lambda$38(final ModelManagerViewModel $modelManagerViewModel, final String $promoId, final MutableState $promoDismissed$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C238@9476L161,237@9430L225:GalleryNavGraph.kt#jlis1r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1306856765, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.GalleryNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GalleryNavGraph.kt:237)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, -1758898524, "CC(remember):GalleryNavGraph.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance($modelManagerViewModel);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GalleryNavGraphKt.m586xb325e92e($modelManagerViewModel, $promoId, $promoDismissed$delegate);
                }
            };
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        PromoScreenGm4Kt.PromoScreenGm4((Function0) it$iv, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36 */
    public static final Unit m586xb325e92e(ModelManagerViewModel $modelManagerViewModel, String $promoId, MutableState $promoDismissed$delegate) {
        $modelManagerViewModel.getDataStoreRepository().addViewedPromoId($promoId);
        GalleryNavHost$lambda$94$lambda$41$lambda$40$lambda$23($promoDismissed$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition GalleryNavHost$lambda$94$lambda$42(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        if (Intrinsics.areEqual(((NavBackStackEntry) composable.getInitialState()).getDestination().getRoute(), ROUTE_HOMESCREEN)) {
            return slideEnter(composable);
        }
        return EnterTransition.INSTANCE.getNone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition GalleryNavHost$lambda$94$lambda$43(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        if (Intrinsics.areEqual(((NavBackStackEntry) composable.getTargetState()).getDestination().getRoute(), ROUTE_HOMESCREEN)) {
            return slideExit(composable);
        }
        return ExitTransition.INSTANCE.getNone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$52(MutableState $pickedTask$delegate, ModelManagerViewModel $modelManagerViewModel, final NavHostController $navController, MutableState $enableModelListAnimation$delegate, final MutableState $enableHomeScreenAnimation$delegate, AnimatedContentScope composable, NavBackStackEntry it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "C:GalleryNavGraph.kt#jlis1r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1287252855, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.GalleryNavHost.<anonymous>.<anonymous> (GalleryNavGraph.kt:268)");
        }
        final Task it2 = GalleryNavHost$lambda$4($pickedTask$delegate);
        if (it2 == null) {
            $composer.startReplaceGroup(1213225181);
        } else {
            $composer.startReplaceGroup(1213225182);
            ComposerKt.sourceInformation($composer, "*283@10790L98,273@10351L96,276@10480L285,269@10190L709");
            boolean zGalleryNavHost$lambda$10 = GalleryNavHost$lambda$10($enableModelListAnimation$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 259412769, "CC(remember):GalleryNavGraph.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($navController);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$52$lambda$51$lambda$45$lambda$44($navController, $enableHomeScreenAnimation$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            Function0 function0 = (Function0) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 259398719, "CC(remember):GalleryNavGraph.kt#9igjgp");
            boolean invalid$iv2 = $composer.changedInstance($navController) | $composer.changedInstance(it2);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$52$lambda$51$lambda$47$lambda$46($navController, it2, (Model) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            Function1 function1 = (Function1) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 259403036, "CC(remember):GalleryNavGraph.kt#9igjgp");
            boolean invalid$iv3 = $composer.changedInstance($navController);
            Object it$iv3 = $composer.rememberedValue();
            if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$52$lambda$51$lambda$50$lambda$49($navController, (Model) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ModelManagerKt.ModelManager(it2, $modelManagerViewModel, zGalleryNavHost$lambda$10, function0, function1, null, (Function1) it$iv3, $composer, 0, 32);
        }
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$52$lambda$51$lambda$47$lambda$46(NavHostController $navController, Task $it, Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        NavController.navigate$default((NavController) $navController, "route_model/" + $it.getId() + "/" + model.getName(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$52$lambda$51$lambda$50$lambda$49(NavHostController $navController, Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.CAPABILITY_SELECT.getId();
            Bundle $this$GalleryNavHost_u24lambda_u2494_u24lambda_u2452_u24lambda_u2451_u24lambda_u2450_u24lambda_u2449_u24lambda_u2448 = new Bundle();
            $this$GalleryNavHost_u24lambda_u2494_u24lambda_u2452_u24lambda_u2451_u24lambda_u2450_u24lambda_u2449_u24lambda_u2448.putString("capability_name", "benchmark_" + model.getName());
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$GalleryNavHost_u24lambda_u2494_u24lambda_u2452_u24lambda_u2451_u24lambda_u2450_u24lambda_u2449_u24lambda_u2448);
        }
        NavController.navigate$default((NavController) $navController, "benchmark/" + model.getName(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$52$lambda$51$lambda$45$lambda$44(NavHostController $navController, MutableState $enableHomeScreenAnimation$delegate) {
        GalleryNavHost$lambda$8($enableHomeScreenAnimation$delegate, false);
        $navController.navigateUp();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$53(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$54(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition GalleryNavHost$lambda$94$lambda$55(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return slideEnter(composable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition GalleryNavHost$lambda$94$lambda$56(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return slideExit(composable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [T, java.lang.Object, java.lang.String] */
    public static final Unit GalleryNavHost$lambda$94$lambda$76(final ModelManagerViewModel modelManagerViewModel, final Ref.ObjectRef $lastNavigatedModelName, final NavHostController $navController, final MutableState $enableModelListAnimation$delegate, AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer $composer, int $changed) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ComposerKt.sourceInformation($composer, "C304@11449L24,305@11507L7:GalleryNavGraph.kt#jlis1r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-123671670, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.GalleryNavHost.<anonymous>.<anonymous> (GalleryNavGraph.kt:302)");
        }
        Bundle arguments = backStackEntry.getArguments();
        if (arguments == null || (string = arguments.getString("modelName")) == null) {
            string = "";
        }
        String r9 = string;
        Bundle arguments2 = backStackEntry.getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("taskId")) == null) {
            string2 = "";
        }
        String taskId = string2;
        ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer, 683736516, "CC(remember):Effects.kt#9igjgp");
        Object value$iv$iv = $composer.rememberedValue();
        if (value$iv$iv == Composer.INSTANCE.getEmpty()) {
            value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer);
            $composer.updateRememberedValue(value$iv$iv);
        }
        final CoroutineScope scope = (CoroutineScope) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object objConsume = $composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Context context = (Context) objConsume;
        Model initialModel = modelManagerViewModel.getModelByName(r9);
        if (initialModel == null) {
            $composer.startReplaceGroup(779616078);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(779616079);
            ComposerKt.sourceInformation($composer, "");
            if (!Intrinsics.areEqual($lastNavigatedModelName.element, (Object) r9)) {
                modelManagerViewModel.selectModel(initialModel);
                $lastNavigatedModelName.element = r9;
            }
            final CustomTask customTask = modelManagerViewModel.getCustomTaskByTaskId(taskId);
            if (customTask != null) {
                $composer.startReplaceGroup(1736763104);
                ComposerKt.sourceInformation($composer, "");
                if (TasksKt.isLegacyTasks(customTask.getTask().getId())) {
                    $composer.startReplaceGroup(1736751417);
                    ComposerKt.sourceInformation($composer, "316@11955L374");
                    customTask.MainScreen(new CustomTaskDataForBuiltinTask(modelManagerViewModel, new Function0() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$57($lastNavigatedModelName, $navController, $enableModelListAnimation$delegate);
                        }
                    }), $composer, 0);
                    $composer.endReplaceGroup();
                } else {
                    $composer.startReplaceGroup(1737212542);
                    ComposerKt.sourceInformation($composer, "328@12390L34,329@12455L34,330@12534L48,359@13771L506,331@12595L1682");
                    ComposerKt.sourceInformationMarkerStart($composer, 1995701232, "CC(remember):GalleryNavGraph.kt#9igjgp");
                    Object value$iv = $composer.rememberedValue();
                    if (value$iv == Composer.INSTANCE.getEmpty()) {
                        value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        $composer.updateRememberedValue(value$iv);
                    }
                    final MutableState disableAppBarControls$delegate = (MutableState) value$iv;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 1995703312, "CC(remember):GalleryNavGraph.kt#9igjgp");
                    Object it$iv = $composer.rememberedValue();
                    if (it$iv == Composer.INSTANCE.getEmpty()) {
                        Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        $composer.updateRememberedValue(value$iv2);
                        it$iv = value$iv2;
                    }
                    final MutableState hideTopBar$delegate = (MutableState) it$iv;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 1995705854, "CC(remember):GalleryNavGraph.kt#9igjgp");
                    Object it$iv2 = $composer.rememberedValue();
                    if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        $composer.updateRememberedValue(value$iv3);
                        it$iv2 = value$iv3;
                    }
                    final MutableState customNavigateUpCallback$delegate = (MutableState) it$iv2;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    CustomTaskScreen(customTask.getTask(), modelManagerViewModel, GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$59(disableAppBarControls$delegate), GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$62(hideTopBar$delegate), customTask.getTask().getUseThemeColor(), new Function0() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda44
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$67($lastNavigatedModelName, $navController, customTask, scope, customNavigateUpCallback$delegate, $enableModelListAnimation$delegate, modelManagerViewModel, context);
                        }
                    }, ComposableLambdaKt.rememberComposableLambda(-115978739, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda51
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$74(customTask, modelManagerViewModel, disableAppBarControls$delegate, hideTopBar$delegate, customNavigateUpCallback$delegate, (C1654Dp) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, $composer, 54), $composer, 1572864);
                    $composer.endReplaceGroup();
                }
            } else {
                $composer.startReplaceGroup(1724903124);
            }
            $composer.endReplaceGroup();
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$57(Ref.ObjectRef $lastNavigatedModelName, NavHostController $navController, MutableState $enableModelListAnimation$delegate) {
        GalleryNavHost$lambda$11($enableModelListAnimation$delegate, false);
        $lastNavigatedModelName.element = "";
        $navController.navigateUp();
        return Unit.INSTANCE;
    }

    private static final boolean GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$59(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$60(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$62(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$63(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Function0<Unit> GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$65(MutableState<Function0<Unit>> mutableState) {
        MutableState<Function0<Unit>> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$67(Ref.ObjectRef $lastNavigatedModelName, NavHostController $navController, CustomTask $customTask, CoroutineScope $scope, MutableState $customNavigateUpCallback$delegate, MutableState $enableModelListAnimation$delegate, ModelManagerViewModel $modelManagerViewModel, Context $context) {
        if (GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$65($customNavigateUpCallback$delegate) != null) {
            Function0<Unit> function0GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$65 = GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$65($customNavigateUpCallback$delegate);
            if (function0GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$65 != null) {
                function0GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$65.invoke();
            }
        } else {
            GalleryNavHost$lambda$11($enableModelListAnimation$delegate, false);
            $lastNavigatedModelName.element = "";
            $navController.navigateUp();
            for (Model curModel : $customTask.getTask().getModels()) {
                Object instanceToCleanUp = curModel.getInstance();
                BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getDefault(), null, new GalleryNavGraphKt$GalleryNavHost$4$9$1$2$1($modelManagerViewModel, $context, $customTask, curModel, instanceToCleanUp, null), 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$74(CustomTask $customTask, ModelManagerViewModel $modelManagerViewModel, final MutableState $disableAppBarControls$delegate, final MutableState $hideTopBar$delegate, final MutableState $customNavigateUpCallback$delegate, C1654Dp bottomPadding, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "CP(0:c#ui.unit.Dp)365@14050L30,366@14121L20,367@14193L33,360@13815L448:GalleryNavGraph.kt#jlis1r");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(bottomPadding.m9802unboximpl()) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-115978739, $dirty, -1, "com.google.ai.edge.gallery.ui.navigation.GalleryNavHost.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GalleryNavGraph.kt:360)");
            }
            float fM9802unboximpl = bottomPadding.m9802unboximpl();
            ComposerKt.sourceInformationMarkerStart($composer, 213590475, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryNavGraphKt.m587xfcac9869($disableAppBarControls$delegate, ((Boolean) obj).booleanValue());
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            Function1 function1 = (Function1) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 213592737, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryNavGraphKt.m588x5d38a7d7($hideTopBar$delegate, ((Boolean) obj).booleanValue());
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            Function1 function12 = (Function1) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 213595054, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv3 = $composer.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryNavGraphKt.m589x87020d5b($customNavigateUpCallback$delegate, (Function0) obj);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            $customTask.MainScreen(new CustomTaskData($modelManagerViewModel, fM9802unboximpl, function1, function12, (Function1) it$iv3, null), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$74$lambda$69$lambda$68 */
    public static final Unit m587xfcac9869(MutableState $disableAppBarControls$delegate, boolean it) {
        GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$60($disableAppBarControls$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$74$lambda$71$lambda$70 */
    public static final Unit m588x5d38a7d7(MutableState $hideTopBar$delegate, boolean it) {
        GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$63($hideTopBar$delegate, !it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: GalleryNavHost$lambda$94$lambda$76$lambda$75$lambda$74$lambda$73$lambda$72 */
    public static final Unit m589x87020d5b(MutableState $customNavigateUpCallback$delegate, Function0 it) {
        $customNavigateUpCallback$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition GalleryNavHost$lambda$94$lambda$77(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        String route = ((NavBackStackEntry) composable.getInitialState()).getDestination().getRoute();
        if (route != null && StringsKt.startsWith$default(route, ROUTE_BENCHMARK, false, 2, (Object) null)) {
            return null;
        }
        String route2 = ((NavBackStackEntry) composable.getInitialState()).getDestination().getRoute();
        if (route2 != null && StringsKt.startsWith$default(route2, ROUTE_MODEL, false, 2, (Object) null)) {
            return null;
        }
        return slideUpEnter(composable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition GalleryNavHost$lambda$94$lambda$78(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        String route = ((NavBackStackEntry) composable.getTargetState()).getDestination().getRoute();
        if (route != null && StringsKt.startsWith$default(route, ROUTE_BENCHMARK, false, 2, (Object) null)) {
            return null;
        }
        String route2 = ((NavBackStackEntry) composable.getTargetState()).getDestination().getRoute();
        if (route2 != null && StringsKt.startsWith$default(route2, ROUTE_MODEL, false, 2, (Object) null)) {
            return null;
        }
        return slideDownExit(composable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$86(ModelManagerViewModel $modelManagerViewModel, final NavHostController $navController, final MutableState $enableHomeScreenAnimation$delegate, AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ComposerKt.sourceInformation($composer, "C402@15082L92,406@15202L100,409@15333L273,400@14998L617:GalleryNavGraph.kt#jlis1r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1039909515, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.GalleryNavHost.<anonymous>.<anonymous> (GalleryNavGraph.kt:400)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, -1374332441, "CC(remember):GalleryNavGraph.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance($navController);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda54
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$86$lambda$80$lambda$79($navController, $enableHomeScreenAnimation$delegate);
                }
            };
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        Function0 function0 = (Function0) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -1374328593, "CC(remember):GalleryNavGraph.kt#9igjgp");
        boolean invalid$iv2 = $composer.changedInstance($navController);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = new Function2() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$86$lambda$82$lambda$81($navController, (Task) obj, (Model) obj2);
                }
            };
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        Function2 function2 = (Function2) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -1374324228, "CC(remember):GalleryNavGraph.kt#9igjgp");
        boolean invalid$iv3 = $composer.changedInstance($navController);
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
            Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$86$lambda$85$lambda$84($navController, (Model) obj);
                }
            };
            $composer.updateRememberedValue(value$iv3);
            it$iv3 = value$iv3;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        GlobalModelManagerKt.GlobalModelManager($modelManagerViewModel, function0, function2, (Function1) it$iv3, null, $composer, 0, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$86$lambda$80$lambda$79(NavHostController $navController, MutableState $enableHomeScreenAnimation$delegate) {
        GalleryNavHost$lambda$8($enableHomeScreenAnimation$delegate, false);
        $navController.navigateUp();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$86$lambda$82$lambda$81(NavHostController $navController, Task task, Model model) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(model, "model");
        NavController.navigate$default((NavController) $navController, "route_model/" + task.getId() + "/" + model.getName(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$86$lambda$85$lambda$84(NavHostController $navController, Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.CAPABILITY_SELECT.getId();
            Bundle $this$GalleryNavHost_u24lambda_u2494_u24lambda_u2486_u24lambda_u2485_u24lambda_u2484_u24lambda_u2483 = new Bundle();
            $this$GalleryNavHost_u24lambda_u2494_u24lambda_u2486_u24lambda_u2485_u24lambda_u2484_u24lambda_u2483.putString("capability_name", "benchmark_" + model.getName());
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$GalleryNavHost_u24lambda_u2494_u24lambda_u2486_u24lambda_u2485_u24lambda_u2484_u24lambda_u2483);
        }
        NavController.navigate$default((NavController) $navController, "benchmark/" + model.getName(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$87(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition GalleryNavHost$lambda$94$lambda$88(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return slideEnter(composable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition GalleryNavHost$lambda$94$lambda$89(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return slideExit(composable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$93(ModelManagerViewModel $modelManagerViewModel, final NavHostController $navController, final MutableState $enableModelListAnimation$delegate, AnimatedContentScope composable, NavBackStackEntry backStackEntry, Composer $composer, int $changed) {
        String string;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        ComposerKt.sourceInformation($composer, "C:GalleryNavGraph.kt#jlis1r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091476596, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.GalleryNavHost.<anonymous>.<anonymous> (GalleryNavGraph.kt:426)");
        }
        Bundle arguments = backStackEntry.getArguments();
        if (arguments == null || (string = arguments.getString("modelName")) == null) {
            string = "";
        }
        String modelName = string;
        Model model = $modelManagerViewModel.getModelByName(modelName);
        if (model == null) {
            $composer.startReplaceGroup(-88541242);
        } else {
            $composer.startReplaceGroup(-88541241);
            ComposerKt.sourceInformation($composer, "*432@16202L97,429@16070L240");
            ComposerKt.sourceInformationMarkerStart($composer, 720756625, "CC(remember):GalleryNavGraph.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($navController);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda53
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GalleryNavGraphKt.GalleryNavHost$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90($navController, $enableModelListAnimation$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BenchmarkScreenKt.BenchmarkScreen(model, $modelManagerViewModel, null, null, (Function0) it$iv, $composer, 0, 12);
        }
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryNavHost$lambda$94$lambda$93$lambda$92$lambda$91$lambda$90(NavHostController $navController, MutableState $enableModelListAnimation$delegate) {
        GalleryNavHost$lambda$11($enableModelListAnimation$delegate, false);
        $navController.navigateUp();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0425  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void CustomTaskScreen(final com.google.ai.edge.gallery.data.Task r40, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r41, final boolean r42, final boolean r43, final boolean r44, final kotlin.jvm.functions.Function0<kotlin.Unit> r45, final kotlin.jvm.functions.Function3<? super androidx.compose.p000ui.unit.C1654Dp, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, androidx.compose.runtime.Composer r47, final int r48) {
        /*
    private static final void CustomTaskScreen(final com.google.ai.edge.gallery.data.Task r40, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r41, final boolean r42, final boolean r43, final boolean r44, final kotlin.jvm.functions.Function0<kotlin.Unit> r45, final kotlin.jvm.functions.Function3<? super androidx.compose.p000ui.unit.C1654Dp, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, androidx.compose.runtime.Composer r47, final int r48) {
            // Method dump skipped - placeholder implementation
        }

    private static final ModelManagerUiState CustomTaskScreen$lambda$97(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final void CustomTaskScreen$lambda$100(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CustomTaskScreen$lambda$99(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final boolean CustomTaskScreen$lambda$102(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CustomTaskScreen$lambda$103(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int CustomTaskScreen$lambda$105(MutableIntState $appBarHeight$delegate) {
        MutableIntState $this$getValue$iv = $appBarHeight$delegate;
        return $this$getValue$iv.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$108$lambda$107(Function0 $onNavigateUp, MutableState $navigatingUp$delegate) {
        CustomTaskScreen$lambda$100($navigatingUp$delegate, true);
        $onNavigateUp.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$110$lambda$109(Function0 $handleNavigateUp) {
        $handleNavigateUp.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$126(boolean $hideTopBar, final Task $task, final Model $selectedModel, final ModelManagerViewModel $modelManagerViewModel, final Function0 $handleNavigateUp, final CoroutineScope $scope, final Context $context, final boolean $disableAppBarControls, final boolean $useThemeColor, final MutableIntState $appBarHeight$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C512@18901L7,513@18944L7,514@18961L1335,510@18826L1470:GalleryNavGraph.kt#jlis1r");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(909831027, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.CustomTaskScreen.<anonymous> (GalleryNavGraph.kt:510)");
            }
            boolean z = !$hideTopBar;
            ComposerKt.sourceInformationMarkerStart($composer, -1825708774, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(GalleryNavGraphKt.CustomTaskScreen$lambda$126$lambda$114$lambda$113(((Integer) obj).intValue()));
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) it$iv, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -1825707398, "CC(remember):GalleryNavGraph.kt#9igjgp");
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(GalleryNavGraphKt.CustomTaskScreen$lambda$126$lambda$116$lambda$115(((Integer) obj).intValue()));
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, enterTransitionSlideInVertically$default, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) it$iv2, 1, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-369473461, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GalleryNavGraphKt.CustomTaskScreen$lambda$126$lambda$125($task, $selectedModel, $modelManagerViewModel, $handleNavigateUp, $scope, $context, $disableAppBarControls, $useThemeColor, $appBarHeight$delegate, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CustomTaskScreen$lambda$126$lambda$114$lambda$113(int it) {
        return -it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CustomTaskScreen$lambda$126$lambda$116$lambda$115(int it) {
        return -it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$126$lambda$125(final Task $task, Model $selectedModel, final ModelManagerViewModel $modelManagerViewModel, final Function0 $handleNavigateUp, final CoroutineScope $scope, final Context $context, boolean $disableAppBarControls, boolean $useThemeColor, final MutableIntState $appBarHeight$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C524@19346L57,527@19525L22,528@19577L700,526@19486L11,515@18971L1317:GalleryNavGraph.kt#jlis1r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-369473461, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.CustomTaskScreen.<anonymous>.<anonymous> (GalleryNavGraph.kt:515)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, 1418301924, "CC(remember):GalleryNavGraph.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GalleryNavGraphKt.CustomTaskScreen$lambda$126$lambda$125$lambda$118$lambda$117($appBarHeight$delegate, (LayoutCoordinates) obj);
                }
            };
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) it$iv);
        boolean z = $task.getModels().size() <= 1;
        ComposerKt.sourceInformationMarkerStart($composer, 1418307617, "CC(remember):GalleryNavGraph.kt#9igjgp");
        boolean invalid$iv = $composer.changed($handleNavigateUp);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GalleryNavGraphKt.CustomTaskScreen$lambda$126$lambda$125$lambda$120$lambda$119($handleNavigateUp);
                }
            };
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        Function0 function0 = (Function0) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1418309959, "CC(remember):GalleryNavGraph.kt#9igjgp");
        boolean invalid$iv2 = $composer.changedInstance($scope) | $composer.changedInstance($modelManagerViewModel) | $composer.changedInstance($context) | $composer.changedInstance($task);
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv2 || it$iv3 == Composer.INSTANCE.getEmpty()) {
            Object value$iv3 = new Function2() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GalleryNavGraphKt.CustomTaskScreen$lambda$126$lambda$125$lambda$122$lambda$121($scope, $modelManagerViewModel, $context, $task, (Model) obj, (Model) obj2);
                }
            };
            $composer.updateRememberedValue(value$iv3);
            it$iv3 = value$iv3;
        }
        Function2 function2 = (Function2) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1418306358, "CC(remember):GalleryNavGraph.kt#9igjgp");
        Object it$iv4 = $composer.rememberedValue();
        if (it$iv4 == Composer.INSTANCE.getEmpty()) {
            Object value$iv4 = new Function2() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GalleryNavGraphKt.CustomTaskScreen$lambda$126$lambda$125$lambda$124$lambda$123((Map) obj, (Map) obj2);
                }
            };
            $composer.updateRememberedValue(value$iv4);
            it$iv4 = value$iv4;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        ModelPageAppBarKt.ModelPageAppBar($task, $selectedModel, $modelManagerViewModel, function0, function2, $disableAppBarControls, $disableAppBarControls, modifierOnGloballyPositioned, false, null, false, z, $useThemeColor, (Function2) it$iv4, false, null, null, $composer, 12582912, 3078, 115456);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$126$lambda$125$lambda$118$lambda$117(MutableIntState $appBarHeight$delegate, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        $appBarHeight$delegate.setIntValue((int) (4294967295L & coordinates.mo8374getSizeYbymL2g()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$126$lambda$125$lambda$124$lambda$123(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        Intrinsics.checkNotNullParameter(map2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$126$lambda$125$lambda$120$lambda$119(Function0 $handleNavigateUp) {
        $handleNavigateUp.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$126$lambda$125$lambda$122$lambda$121(CoroutineScope $scope, ModelManagerViewModel $modelManagerViewModel, Context $context, Task $task, Model prevModel, Model newSelectedModel) {
        Intrinsics.checkNotNullParameter(prevModel, "prevModel");
        Intrinsics.checkNotNullParameter(newSelectedModel, "newSelectedModel");
        Object instanceToCleanUp = prevModel.getInstance();
        BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getDefault(), null, new GalleryNavGraphKt$CustomTaskScreen$4$3$3$1$1(prevModel, newSelectedModel, $modelManagerViewModel, $context, $task, instanceToCleanUp, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$131(boolean $hideTopBar, MutableIntState $appBarHeight$delegate, final Model $selectedModel, State $modelManagerUiState$delegate, final Function3 $content, final Task $task, final ModelManagerViewModel $modelManagerViewModel, final PaddingValues innerPadding, Composer $composer, int $changed) {
        float targetPaddingDp;
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        ComposerKt.sourceInformation($composer, "C561@20751L186,571@21158L7,572@21240L7,567@20943L950:GalleryNavGraph.kt#jlis1r");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(innerPadding) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-296902914, $dirty2, -1, "com.google.ai.edge.gallery.ui.navigation.CustomTaskScreen.<anonymous> (GalleryNavGraph.kt:551)");
            }
            if (!$hideTopBar && CustomTaskScreen$lambda$105($appBarHeight$delegate) > 0) {
                $composer.startReplaceGroup(-1696887215);
                ComposerKt.sourceInformation($composer, "554@20541L7");
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = $composer.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd($composer);
                Density $this$CustomTaskScreen_u24lambda_u24131_u24lambda_u24127 = (Density) objConsume;
                targetPaddingDp = $this$CustomTaskScreen_u24lambda_u24131_u24lambda_u24127.mo1521toDpu2uoSUM(CustomTaskScreen$lambda$105($appBarHeight$delegate));
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1696768237);
                ComposerKt.sourceInformation($composer, "556@20610L10,556@20621L17");
                targetPaddingDp = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, $composer, 6), $composer, 0).getTop();
                $composer.endReplaceGroup();
            }
            State<C1654Dp> stateM1234animateDpAsStateAjpBEmI = AnimateAsStateKt.m1234animateDpAsStateAjpBEmI(targetPaddingDp, AnimationSpecKt.tween$default(220, 0, EasingKt.getFastOutSlowInEasing(), 2, null), "TopPaddingAnimation", null, $composer, 384, 8);
            Modifier.Companion companion = Modifier.INSTANCE;
            float top = !$hideTopBar ? innerPadding.getTop() : CustomTaskScreen$lambda$131$lambda$128(stateM1234animateDpAsStateAjpBEmI);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd($composer);
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(innerPadding, (LayoutDirection) objConsume2);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume3 = $composer.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(companion, fCalculateStartPadding, top, PaddingKt.calculateStartPadding(innerPadding, (LayoutDirection) objConsume3), 0.0f, 8, null);
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
            ComposerKt.sourceInformationMarkerStart($composer, 822268550, "C578@21484L403,576@21369L518:GalleryNavGraph.kt#jlis1r");
            ModelDownloadStatus curModelDownloadStatus = CustomTaskScreen$lambda$97($modelManagerUiState$delegate).getModelDownloadStatus().get($selectedModel.getName());
            AnimatedContentKt.AnimatedContent(Boolean.valueOf((curModelDownloadStatus != null ? curModelDownloadStatus.getStatus() : null) == ModelDownloadStatusType.SUCCEEDED), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(748487829, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.navigation.GalleryNavGraphKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return GalleryNavGraphKt.CustomTaskScreen$lambda$131$lambda$130$lambda$129($content, innerPadding, $selectedModel, $task, $modelManagerViewModel, (AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 1572864, 62);
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

    private static final float CustomTaskScreen$lambda$131$lambda$128(State<C1654Dp> state) {
        Object thisObj$iv = state.getValue();
        return ((C1654Dp) thisObj$iv).m9802unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$131$lambda$130$lambda$129(Function3 $content, PaddingValues $innerPadding, Model $selectedModel, Task $task, ModelManagerViewModel $modelManagerViewModel, AnimatedContentScope AnimatedContent, boolean targetState, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C:GalleryNavGraph.kt#jlis1r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(748487829, $changed, -1, "com.google.ai.edge.gallery.ui.navigation.CustomTaskScreen.<anonymous>.<anonymous>.<anonymous> (GalleryNavGraph.kt:579)");
        }
        if (targetState) {
            $composer.startReplaceGroup(2037268835);
            ComposerKt.sourceInformation($composer, "581@21595L46");
            $content.invoke(C1654Dp.m9786boximpl($innerPadding.getBottom()), $composer, 0);
            $composer.endReplaceGroup();
        } else {
            if (targetState) {
                $composer.startReplaceGroup(2037266407);
                $composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            $composer.startReplaceGroup(2037272349);
            ComposerKt.sourceInformation($composer, "584@21701L168");
            ModelDownloadStatusInfoPanelKt.ModelDownloadStatusInfoPanel($selectedModel, $task, $modelManagerViewModel, $composer, 0);
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTaskScreen$lambda$133$lambda$132(Function0 $onNavigateUp, MutableState $showErrorDialog$delegate) {
        CustomTaskScreen$lambda$103($showErrorDialog$delegate, false);
        $onNavigateUp.invoke();
        return Unit.INSTANCE;
    }
}
