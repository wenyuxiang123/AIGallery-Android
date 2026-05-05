package com.google.ai.edge.gallery.ui.common;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: GalleryWebView.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0099\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "iframeWrapper", "GalleryWebView", "", "modifier", "Landroidx/compose/ui/Modifier;", "initialUrl", "useIframeWrapper", "", "preventParentScrolling", "allowRequestPermission", "onWebViewCreated", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "onConsoleMessage", "Landroid/webkit/ConsoleMessage;", "onPermissionRequest", "Landroid/webkit/PermissionRequest;", "customWebViewClient", "Landroid/webkit/WebViewClient;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/webkit/WebViewClient;Landroidx/compose/runtime/Composer;II)V", "app_debug", "pendingCameraPermissionRequest", "pendingAudioPermissionRequest"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GalleryWebViewKt {
    private static final String TAG = "AGGalleryWebView";
    private static final String iframeWrapper = "<html>\n  <body style=\"margin:0;padding:0;\">\n    <iframe\n        width=\"100%\"\n        height=\"100%\"\n        src=\"___\"\n        frameborder=\"0\"\n        style=\"border:0;\">\n    </iframe>\n  </body>\n</html>";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryWebView$lambda$21(Modifier modifier, String str, boolean z, boolean z2, boolean z3, Function1 function1, Function1 function12, Function1 function13, WebViewClient webViewClient, int i, int i2, Composer composer, int i3) {
        GalleryWebView(modifier, str, z, z2, z3, function1, function12, function13, webViewClient, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void GalleryWebView(Modifier modifier, String initialUrl, boolean useIframeWrapper, boolean preventParentScrolling, boolean allowRequestPermission, Function1<? super WebView, Unit> function1, Function1<? super ConsoleMessage, Unit> function12, Function1<? super PermissionRequest, Unit> function13, WebViewClient customWebViewClient, Composer $composer, final int $changed, final int i) {
        String str;
        boolean z;
        boolean z2;
        Function1<? super WebView, Unit> function14;
        Modifier modifier2;
        Function1<? super ConsoleMessage, Unit> function15;
        Function1<? super PermissionRequest, Unit> function16;
        WebViewClient customWebViewClient2;
        String initialUrl2;
        boolean preventParentScrolling2;
        final boolean useIframeWrapper2;
        Function1<? super WebView, Unit> function17;
        boolean allowRequestPermission2;
        Modifier.Companion modifier3;
        String initialUrl3;
        boolean useIframeWrapper3;
        boolean preventParentScrolling3;
        boolean allowRequestPermission3;
        Function1<? super WebView, Unit> function18;
        Function1<? super ConsoleMessage, Unit> function19;
        Function1<? super PermissionRequest, Unit> function110;
        BaseGalleryWebViewClient customWebViewClient3;
        WebViewClient customWebViewClient4;
        Object value$iv;
        Object value$iv2;
        Composer $composer2 = $composer.startRestartGroup(-334334641);
        ComposerKt.sourceInformation($composer2, "C(GalleryWebView)P(3,2,8,7!1,6,4,5)106@3771L7,108@3805L85,111@3931L53,112@4024L53,115@4206L487,115@4116L577,130@4821L349,130@4731L439,144@5226L2907,230@8151L70,142@5174L3052:GalleryWebView.kt#t7sjiu");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
        } else if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(modifier) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
            str = initialUrl;
        } else if (($changed & 48) == 0) {
            str = initialUrl;
            $dirty |= $composer2.changed(str) ? 32 : 16;
        } else {
            str = initialUrl;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
            z = useIframeWrapper;
        } else if (($changed & 384) == 0) {
            z = useIframeWrapper;
            $dirty |= $composer2.changed(z) ? 256 : 128;
        } else {
            z = useIframeWrapper;
        }
        int i5 = i & 8;
        if (i5 != 0) {
            $dirty |= 3072;
            z2 = preventParentScrolling;
        } else if (($changed & 3072) == 0) {
            z2 = preventParentScrolling;
            $dirty |= $composer2.changed(z2) ? 2048 : 1024;
        } else {
            z2 = preventParentScrolling;
        }
        int i6 = i & 16;
        if (i6 != 0) {
            $dirty |= 24576;
        } else if (($changed & 24576) == 0) {
            $dirty |= $composer2.changed(allowRequestPermission) ? 16384 : 8192;
        }
        int i7 = i & 32;
        if (i7 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            function14 = function1;
        } else if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            function14 = function1;
            $dirty |= $composer2.changedInstance(function14) ? 131072 : 65536;
        } else {
            function14 = function1;
        }
        int i8 = i & 64;
        if (i8 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 1572864) == 0) {
            $dirty |= $composer2.changedInstance(function12) ? 1048576 : 524288;
        }
        int i9 = i & 128;
        if (i9 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty |= $composer2.changedInstance(function13) ? 8388608 : 4194304;
        }
        int i10 = i & 256;
        if (i10 != 0) {
            $dirty |= 100663296;
        } else if (($changed & 100663296) == 0) {
            $dirty |= $composer2.changedInstance(customWebViewClient) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (!$composer2.shouldExecute(($dirty & 38347923) != 38347922, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            function15 = function12;
            function16 = function13;
            customWebViewClient2 = customWebViewClient;
            initialUrl2 = str;
            preventParentScrolling2 = z2;
            useIframeWrapper2 = z;
            function17 = function14;
            allowRequestPermission2 = allowRequestPermission;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (i3 == 0) {
                initialUrl3 = str;
            } else {
                initialUrl3 = null;
            }
            if (i4 == 0) {
                useIframeWrapper3 = z;
            } else {
                useIframeWrapper3 = false;
            }
            if (i5 == 0) {
                preventParentScrolling3 = z2;
            } else {
                preventParentScrolling3 = false;
            }
            if (i6 == 0) {
                allowRequestPermission3 = allowRequestPermission;
            } else {
                allowRequestPermission3 = false;
            }
            if (i7 == 0) {
                function18 = function14;
            } else {
                function18 = null;
            }
            if (i8 == 0) {
                function19 = function12;
            } else {
                function19 = null;
            }
            if (i9 == 0) {
                function110 = function13;
            } else {
                function110 = null;
            }
            if (i10 == 0) {
                customWebViewClient3 = customWebViewClient;
            } else {
                customWebViewClient3 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-334334641, $dirty, -1, "com.google.ai.edge.gallery.ui.common.GalleryWebView (GalleryWebView.kt:105)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, 826973284, "CC(remember):GalleryWebView.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                if (customWebViewClient3 == null) {
                    customWebViewClient4 = customWebViewClient3;
                    customWebViewClient3 = new BaseGalleryWebViewClient(context);
                } else {
                    customWebViewClient4 = customWebViewClient3;
                }
                $composer2.updateRememberedValue(customWebViewClient3);
                it$iv = customWebViewClient3;
            } else {
                customWebViewClient4 = customWebViewClient3;
            }
            final WebViewClient curWebViewClient = (WebViewClient) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 826977284, "CC(remember):GalleryWebView.kt#9igjgp");
            Object value$iv3 = $composer2.rememberedValue();
            if (value$iv3 == Composer.INSTANCE.getEmpty()) {
                value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(value$iv3);
            }
            final MutableState pendingCameraPermissionRequest$delegate = (MutableState) value$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 826980260, "CC(remember):GalleryWebView.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(value$iv4);
                it$iv2 = value$iv4;
            }
            final MutableState pendingAudioPermissionRequest$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            ComposerKt.sourceInformationMarkerStart($composer2, 826986518, "CC(remember):GalleryWebView.kt#9igjgp");
            Object it$iv3 = $composer2.rememberedValue();
            modifier2 = modifier3;
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.GalleryWebViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryWebViewKt.GalleryWebView$lambda$9$lambda$8(pendingCameraPermissionRequest$delegate, ((Boolean) obj).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(value$iv);
            } else {
                value$iv = it$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher cameraPermissionLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) value$iv, $composer2, 48);
            ActivityResultContracts.RequestPermission requestPermission2 = new ActivityResultContracts.RequestPermission();
            ComposerKt.sourceInformationMarkerStart($composer2, 827006060, "CC(remember):GalleryWebView.kt#9igjgp");
            Object it$iv4 = $composer2.rememberedValue();
            useIframeWrapper2 = useIframeWrapper3;
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.GalleryWebViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryWebViewKt.GalleryWebView$lambda$12$lambda$11(pendingAudioPermissionRequest$delegate, ((Boolean) obj).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(value$iv2);
            } else {
                value$iv2 = it$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher audioPermissionLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission2, (Function1) value$iv2, $composer2, 48);
            ComposerKt.sourceInformationMarkerStart($composer2, 827021578, "CC(remember):GalleryWebView.kt#9igjgp");
            boolean invalid$iv = ((3670016 & $dirty) == 1048576) | (($dirty & 7168) == 2048) | ((57344 & $dirty) == 16384) | ((29360128 & $dirty) == 8388608) | $composer2.changedInstance(cameraPermissionLauncher) | $composer2.changedInstance(audioPermissionLauncher) | $composer2.changedInstance(curWebViewClient) | (($dirty & 112) == 32) | (($dirty & 896) == 256) | ((458752 & $dirty) == 131072);
            Object it$iv5 = $composer2.rememberedValue();
            if (invalid$iv || it$iv5 == Composer.INSTANCE.getEmpty()) {
                final boolean z3 = preventParentScrolling3;
                final String str2 = initialUrl3;
                final Function1<? super WebView, Unit> function111 = function18;
                final Function1<? super ConsoleMessage, Unit> function112 = function19;
                final boolean z4 = allowRequestPermission3;
                final Function1<? super PermissionRequest, Unit> function113 = function110;
                Object value$iv5 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.GalleryWebViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryWebViewKt.GalleryWebView$lambda$18$lambda$17(z3, curWebViewClient, str2, function111, function112, z4, function113, cameraPermissionLauncher, audioPermissionLauncher, pendingCameraPermissionRequest$delegate, pendingAudioPermissionRequest$delegate, useIframeWrapper2, (Context) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv5);
                it$iv5 = value$iv5;
            }
            Function1 function114 = (Function1) it$iv5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 827112341, "CC(remember):GalleryWebView.kt#9igjgp");
            Function1<? super PermissionRequest, Unit> function115 = function110;
            Object it$iv6 = $composer2.rememberedValue();
            if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv6 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.GalleryWebViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GalleryWebViewKt.GalleryWebView$lambda$20$lambda$19((WebView) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv6);
                it$iv6 = value$iv6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AndroidView_androidKt.AndroidView(function114, modifier2, null, (Function1) it$iv6, null, $composer2, (($dirty << 3) & 112) | 3072, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            customWebViewClient2 = customWebViewClient4;
            function16 = function115;
            initialUrl2 = initialUrl3;
            preventParentScrolling2 = preventParentScrolling3;
            allowRequestPermission2 = allowRequestPermission3;
            function17 = function18;
            function15 = function19;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final String str3 = initialUrl2;
            final boolean z5 = useIframeWrapper2;
            final boolean z6 = preventParentScrolling2;
            final boolean z7 = allowRequestPermission2;
            final Function1<? super WebView, Unit> function116 = function17;
            final Function1<? super ConsoleMessage, Unit> function117 = function15;
            final Function1<? super PermissionRequest, Unit> function118 = function16;
            final WebViewClient webViewClient = customWebViewClient2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.GalleryWebViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GalleryWebViewKt.GalleryWebView$lambda$21(modifier4, str3, z5, z6, z7, function116, function117, function118, webViewClient, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final PermissionRequest GalleryWebView$lambda$2(MutableState<PermissionRequest> mutableState) {
        MutableState<PermissionRequest> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final PermissionRequest GalleryWebView$lambda$5(MutableState<PermissionRequest> mutableState) {
        MutableState<PermissionRequest> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryWebView$lambda$9$lambda$8(MutableState $pendingCameraPermissionRequest$delegate, boolean isGranted) {
        PermissionRequest request = GalleryWebView$lambda$2($pendingCameraPermissionRequest$delegate);
        if (request != null) {
            if (isGranted) {
                request.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
            }
            $pendingCameraPermissionRequest$delegate.setValue(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryWebView$lambda$12$lambda$11(MutableState $pendingAudioPermissionRequest$delegate, boolean isGranted) {
        PermissionRequest request = GalleryWebView$lambda$5($pendingAudioPermissionRequest$delegate);
        if (request != null) {
            if (isGranted) {
                request.grant(new String[]{"android.webkit.resource.AUDIO_CAPTURE"});
            }
            $pendingAudioPermissionRequest$delegate.setValue(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView GalleryWebView$lambda$18$lambda$17(boolean $preventParentScrolling, WebViewClient $curWebViewClient, String $initialUrl, Function1 $onWebViewCreated, final Function1 $onConsoleMessage, final boolean $allowRequestPermission, final Function1 $onPermissionRequest, final ManagedActivityResultLauncher $cameraPermissionLauncher, final ManagedActivityResultLauncher $audioPermissionLauncher, final MutableState $pendingCameraPermissionRequest$delegate, final MutableState $pendingAudioPermissionRequest$delegate, boolean $useIframeWrapper, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        WebView $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416 = new WebView(ctx);
        $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WebSettings $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416_u24lambda_u2413 = $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416.getSettings();
        $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416_u24lambda_u2413.setJavaScriptEnabled(true);
        $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416_u24lambda_u2413.setDomStorageEnabled(true);
        $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416_u24lambda_u2413.setAllowFileAccess(true);
        $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416_u24lambda_u2413.setMediaPlaybackRequiresUserGesture(false);
        if ($preventParentScrolling) {
            $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.ai.edge.gallery.ui.common.GalleryWebViewKt$$ExternalSyntheticLambda5
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return GalleryWebViewKt.GalleryWebView$lambda$18$lambda$17$lambda$16$lambda$14(view, motionEvent);
                }
            });
        }
        $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416.setWebChromeClient(new WebChromeClient() { // from class: com.google.ai.edge.gallery.ui.common.GalleryWebViewKt$GalleryWebView$1$1$1$3
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Log.d("AGGalleryWebView", (consoleMessage != null ? consoleMessage.message() : null) + " -- From line " + (consoleMessage != null ? Integer.valueOf(consoleMessage.lineNumber()) : null) + " of " + (consoleMessage != null ? consoleMessage.sourceId() : null));
                Function1<ConsoleMessage, Unit> function1 = $onConsoleMessage;
                if (function1 != null) {
                    function1.invoke(consoleMessage);
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest request) {
                boolean isCameraRequest;
                boolean isAudioRequest;
                if (!$allowRequestPermission) {
                    if (request != null) {
                        request.deny();
                        return;
                    }
                    return;
                }
                if (request == null) {
                    return;
                }
                Function1<PermissionRequest, Unit> function1 = $onPermissionRequest;
                if (function1 == null) {
                    ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher = $cameraPermissionLauncher;
                    ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher2 = $audioPermissionLauncher;
                    MutableState<PermissionRequest> mutableState = $pendingCameraPermissionRequest$delegate;
                    MutableState<PermissionRequest> mutableState2 = $pendingAudioPermissionRequest$delegate;
                    String[] resources = request.getResources();
                    Intrinsics.checkNotNull(resources);
                    int length = resources.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (Intrinsics.areEqual(resources[i], "android.webkit.resource.VIDEO_CAPTURE")) {
                                isCameraRequest = true;
                                break;
                            }
                            i++;
                        } else {
                            isCameraRequest = false;
                            break;
                        }
                    }
                    int length2 = resources.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            if (Intrinsics.areEqual(resources[i2], "android.webkit.resource.AUDIO_CAPTURE")) {
                                isAudioRequest = true;
                                break;
                            }
                            i2++;
                        } else {
                            isAudioRequest = false;
                            break;
                        }
                    }
                    if (isCameraRequest) {
                        mutableState.setValue(request);
                        managedActivityResultLauncher.launch("android.permission.CAMERA");
                    }
                    if (isAudioRequest) {
                        mutableState2.setValue(request);
                        managedActivityResultLauncher2.launch("android.permission.RECORD_AUDIO");
                    }
                    Collection destination$iv$iv = new ArrayList();
                    int length3 = resources.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        String str = resources[i3];
                        boolean isAudioRequest2 = isAudioRequest;
                        if ((Intrinsics.areEqual(str, "android.webkit.resource.VIDEO_CAPTURE") || Intrinsics.areEqual(str, "android.webkit.resource.AUDIO_CAPTURE")) ? false : true) {
                            destination$iv$iv.add(str);
                        }
                        i3++;
                        isAudioRequest = isAudioRequest2;
                    }
                    Collection $this$toTypedArray$iv = (List) destination$iv$iv;
                    String[] otherResources = (String[]) $this$toTypedArray$iv.toArray(new String[0]);
                    if (!(otherResources.length == 0)) {
                        request.grant(otherResources);
                        return;
                    }
                    return;
                }
                function1.invoke(request);
            }
        });
        $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416.setWebViewClient($curWebViewClient);
        if ($initialUrl != null) {
            if ($useIframeWrapper) {
                $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416.loadDataWithBaseURL(null, StringsKt.replace$default(iframeWrapper, "___", $initialUrl, false, 4, (Object) null), "text/html", "UTF-8", null);
            } else {
                $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416.loadUrl($initialUrl);
            }
        }
        if ($onWebViewCreated != null) {
            $onWebViewCreated.invoke($this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416);
        }
        return $this$GalleryWebView_u24lambda_u2418_u24lambda_u2417_u24lambda_u2416;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GalleryWebView$lambda$18$lambda$17$lambda$16$lambda$14(View v, MotionEvent event) {
        v.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GalleryWebView$lambda$20$lambda$19(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.stopLoading();
        webView.destroy();
        return Unit.INSTANCE;
    }
}
