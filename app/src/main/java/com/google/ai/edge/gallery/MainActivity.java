package com.google.ai.edge.gallery;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.os.BundleKt;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.SplashScreenViewProvider;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import com.google.ai.edge.litertlm.ExperimentalFlags;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import okhttp3.internal.p013ws.WebSocketProtocol;



V", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "getModelManagerViewModel", "()Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "modelManagerViewModel$delegate", "Lkotlin/Lazy;", "splashScreenAboutToExit", "", "contentSet", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onResume", "Companion", "app_debug", "startMaskFadeout"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
@AndroidEntryPoint
public final class MainActivity extends Hilt_MainActivity {
    private static final String TAG = "AGMainActivity";
    private boolean contentSet;

    
    private final Lazy modelManagerViewModel;
    private boolean splashScreenAboutToExit;
    public static final int $stable = 8;

    public MainActivity() {
        final MainActivity $this$viewModels_u24default$iv = this;
        final Function0 extrasProducer$iv = null;
        this.modelManagerViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ModelManagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.google.ai.edge.gallery.MainActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return $this$viewModels_u24default$iv.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.google.ai.edge.gallery.MainActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return $this$viewModels_u24default$iv.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.google.ai.edge.gallery.MainActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = extrasProducer$iv;
                return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? $this$viewModels_u24default$iv.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final ModelManagerViewModel getModelManagerViewModel() {
        return (ModelManagerViewModel) this.modelManagerViewModel.getValue();
    }

    @Override // com.google.ai.edge.gallery.Hilt_MainActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(null);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            for (String key : extras.keySet()) {
                Log.d(TAG, "onCreate Extra -> Key: " + key + ", Value: " + extras.get(key));
            }
        }
        String link = getIntent().getStringExtra("deeplink");
        if (link != null) {
            Log.d(TAG, "onCreate: Found deeplink extra: " + link);
            if (StringsKt.startsWith$default(link, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(link, "https://", false, 2, (Object) null)) {
                Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse(link));
                startActivity(browserIntent);
            } else {
                getIntent().setData(Uri.parse(link));
            }
        }
        getModelManagerViewModel().loadModelAllowlist();
        SplashScreen splashScreen = SplashScreen.INSTANCE.installSplashScreen(this);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C24203(null), 3, null);
        splashScreen.setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: com.google.ai.edge.gallery.MainActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.splashscreen.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenViewProvider splashScreenViewProvider) {
                MainActivity.onCreate$lambda$10(this.f$0, splashScreenViewProvider);
            }
        });
        EdgeToEdge.enable$default(this, null, null, 3, null);
        getWindow().setNavigationBarContrastEnforced(false);
        getWindow().addFlags(128);
    }

    
    public static final void onCreate$setContent(final MainActivity this$0) {
        if (this$0.contentSet) {
            return;
        }
        ComponentActivityKt.setContent$default(this$0, null, ComposableLambdaKt.composableLambdaInstance(-510416780, true, new Function2() { // from class: com.google.ai.edge.gallery.MainActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.onCreate$setContent$lambda$8(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
        ExperimentalFlags.INSTANCE.setEnableBenchmark(false);
        this$0.contentSet = true;
    }

    
    public static final Unit onCreate$setContent$lambda$8(final MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C98@3778L831,98@3765L844:MainActivity.kt#9ty9oh");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-510416780, $changed, -1, "com.google.ai.edge.gallery.MainActivity.onCreate.setContent.<anonymous> (MainActivity.kt:98)");
            }
            ThemeKt.GalleryTheme(ComposableLambdaKt.rememberComposableLambda(666090960, true, new Function2() { // from class: com.google.ai.edge.gallery.MainActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$setContent$lambda$8$lambda$7(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit onCreate$setContent$lambda$8$lambda$7(final MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C99@3833L766,99@3790L809:MainActivity.kt#9ty9oh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(666090960, $changed, -1, "com.google.ai.edge.gallery.MainActivity.onCreate.setContent.<anonymous>.<anonymous> (MainActivity.kt:99)");
            }
            SurfaceKt.m4609SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1365424235, true, new Function2() { // from class: com.google.ai.edge.gallery.MainActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$setContent$lambda$8$lambda$7$lambda$6(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582918, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit onCreate$setContent$lambda$8$lambda$7$lambda$6(MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C100@3847L57,104@4087L34,105@4155L27,105@4134L48,106@4195L392:MainActivity.kt#9ty9oh");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1365424235, $changed, -1, "com.google.ai.edge.gallery.MainActivity.onCreate.setContent.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:100)");
            }
            GalleryAppKt.GalleryApp(null, this$0.getModelManagerViewModel(), $composer, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer, 2087310903, "CC(remember):MainActivity.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            MutableState startMaskFadeout$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 2087313072, "CC(remember):MainActivity.kt#9igjgp");
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = (Function2) new MainActivity$onCreate$setContent$1$1$1$1$1(startMaskFadeout$delegate, null);
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv2, $composer, 6);
            AnimatedVisibilityKt.AnimatedVisibility(!onCreate$setContent$lambda$8$lambda$7$lambda$6$lambda$3(startMaskFadeout$delegate), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.snap(0), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableSingletons$MainActivityKt.INSTANCE.m10362getLambda$696477075$app_debug(), $composer, 196992, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final boolean onCreate$setContent$lambda$8$lambda$7$lambda$6$lambda$3(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    
    public static final void onCreate$setContent$lambda$8$lambda$7$lambda$6$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.MainActivity$onCreate$3", m932f = "MainActivity.kt", m933i = {}, m934l = {137}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C24203 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C24203(Continuation<? super C24203> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainActivity.this.new C24203(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24203) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!MainActivity.this.splashScreenAboutToExit) {
                MainActivity.onCreate$setContent(MainActivity.this);
            }
            return Unit.INSTANCE;
        }
    }

    
    public static final void onCreate$lambda$10(MainActivity this$0, final SplashScreenViewProvider splashScreenView) {
        Intrinsics.checkNotNullParameter(splashScreenView, "splashScreenView");
        this$0.splashScreenAboutToExit = true;
        long now = System.currentTimeMillis();
        long iconAnimationStartMs = splashScreenView.getIconAnimationStartMillis();
        long duration = splashScreenView.getIconAnimationDurationMillis();
        ObjectAnimator fadeOut = ObjectAnimator.ofFloat(splashScreenView.getView(), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        fadeOut.setInterpolator(new DecelerateInterpolator());
        fadeOut.setDuration(300L);
        Intrinsics.checkNotNull(fadeOut);
        ObjectAnimator $this$doOnEnd$iv = fadeOut;
        $this$doOnEnd$iv.addListener(new Animator.AnimatorListener() { // from class: com.google.ai.edge.gallery.MainActivity$onCreate$lambda$10$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                splashScreenView.remove();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new MainActivity$onCreate$4$2(duration, now, iconAnimationStartMs, fadeOut, this$0, null), 3, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String key : extras.keySet()) {
                Log.d(TAG, "onNewIntent Extra -> Key: " + key + ", Value: " + extras.get(key));
            }
        }
        String link = intent.getStringExtra("deeplink");
        if (link != null) {
            Log.d(TAG, "onNewIntent: Found deeplink extra: " + link);
            if (StringsKt.startsWith$default(link, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(link, "https://", false, 2, (Object) null)) {
                Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse(link));
                startActivity(browserIntent);
            } else {
                intent.setData(Uri.parse(link));
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN, BundleKt.bundleOf(TuplesKt.m929to("app_version", BuildConfig.VERSION_NAME), TuplesKt.m929to("os_version", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.m929to("device_model", Build.MODEL)));
        }
    }
}
