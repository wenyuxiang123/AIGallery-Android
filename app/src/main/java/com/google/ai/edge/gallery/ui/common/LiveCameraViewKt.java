package com.google.ai.edge.gallery.ui.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageProxy;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.geometry.Rect;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ImageBitmap;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.IntOffset;
import androidx.compose.p000ui.unit.IntSize;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LiveCameraView.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aY\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001aP\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002"}, m922d2 = {"LiveCameraView", "", "onBitmap", "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "Landroidx/camera/core/ImageProxy;", "modifier", "Landroidx/compose/ui/Modifier;", "preferredSize", "", "outputImageFormat", "renderPreview", "", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;IIZLandroidx/camera/core/CameraSelector;Landroidx/compose/runtime/Composer;II)V", "startCamera", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "context", "Landroid/content/Context;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;IILandroidx/camera/core/CameraSelector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "cameraProvider"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class LiveCameraViewKt {

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.LiveCameraViewKt$startCamera$1 */
    /* JADX INFO: compiled from: LiveCameraView.kt */
    @Metadata(m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.LiveCameraViewKt", m932f = "LiveCameraView.kt", m933i = {0, 0, 0, 0, 0, 0}, m934l = {177}, m935m = "startCamera", m936n = {"context", "lifecycleOwner", "onBitmap", "cameraSelector", "preferredSize", "outputImageFormat"}, m938s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    static final class C26731 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C26731(Continuation<? super C26731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LiveCameraViewKt.startCamera(null, null, null, 0, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveCameraView$lambda$17(Function2 function2, Modifier modifier, int i, int i2, boolean z, CameraSelector cameraSelector, int i3, int i4, Composer composer, int i5) {
        LiveCameraView(function2, modifier, i, i2, z, cameraSelector, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    public static final void LiveCameraView(final Function2<? super Bitmap, ? super ImageProxy, Unit> onBitmap, Modifier modifier, int preferredSize, int outputImageFormat, boolean renderPreview, CameraSelector cameraSelector, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        int preferredSize2;
        int outputImageFormat2;
        boolean renderPreview2;
        CameraSelector cameraSelector2;
        Modifier modifier3;
        CameraSelector cameraSelector3;
        int preferredSize3;
        Modifier.Companion modifier4;
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(onBitmap, "onBitmap");
        Composer $composer2 = $composer.startRestartGroup(-1893028827);
        ComposerKt.sourceInformation($composer2, "C(LiveCameraView)P(2,1,4,3,5)70@2858L7,71@2880L24,72@2948L7,73@2977L47,74@3073L33,76@3157L101,82@3380L434,82@3301L513,99@3839L669,99@3818L690,122@4535L45,122@4512L68:LiveCameraView.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBitmap) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            preferredSize2 = preferredSize;
        } else if (($changed & 384) == 0) {
            preferredSize2 = preferredSize;
            $dirty |= $composer2.changed(preferredSize2) ? 256 : 128;
        } else {
            preferredSize2 = preferredSize;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            outputImageFormat2 = outputImageFormat;
        } else if (($changed & 3072) == 0) {
            outputImageFormat2 = outputImageFormat;
            $dirty |= $composer2.changed(outputImageFormat2) ? 2048 : 1024;
        } else {
            outputImageFormat2 = outputImageFormat;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty |= 24576;
            renderPreview2 = renderPreview;
        } else if (($changed & 24576) == 0) {
            renderPreview2 = renderPreview;
            $dirty |= $composer2.changed(renderPreview2) ? 16384 : 8192;
        } else {
            renderPreview2 = renderPreview;
        }
        if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            if ((i & 32) == 0) {
                cameraSelector2 = cameraSelector;
                int i6 = $composer2.changedInstance(cameraSelector2) ? 131072 : 65536;
                $dirty |= i6;
            } else {
                cameraSelector2 = cameraSelector;
            }
            $dirty |= i6;
        } else {
            cameraSelector2 = cameraSelector;
        }
        if ($composer2.shouldExecute(($dirty & 74899) != 74898, $dirty & 1)) {
            $composer2.startDefaults();
            if (($changed & 1) == 0 || $composer2.getDefaultsInvalid()) {
                modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
                if (i3 != 0) {
                    preferredSize2 = 500;
                }
                if (i4 != 0) {
                    outputImageFormat2 = 2;
                }
                if (i5 != 0) {
                    renderPreview2 = true;
                }
                if ((i & 32) != 0) {
                    CameraSelector DEFAULT_FRONT_CAMERA = CameraSelector.DEFAULT_FRONT_CAMERA;
                    Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
                    $dirty &= -458753;
                    cameraSelector2 = DEFAULT_FRONT_CAMERA;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 32) != 0) {
                    $dirty &= -458753;
                }
                modifier4 = modifier2;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1893028827, $dirty, -1, "com.google.ai.edge.gallery.ui.common.LiveCameraView (LiveCameraView.kt:69)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object value$iv$iv = $composer2.rememberedValue();
            if (value$iv$iv == Composer.INSTANCE.getEmpty()) {
                value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
                $composer2.updateRememberedValue(value$iv$iv);
            }
            final CoroutineScope scope = (CoroutineScope) value$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer2.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume2;
            ComposerKt.sourceInformationMarkerStart($composer2, 1865446772, "CC(remember):LiveCameraView.kt#9igjgp");
            Object value$iv = $composer2.rememberedValue();
            if (value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(value$iv);
            }
            final MutableState imageBitmap$delegate = (MutableState) value$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1865449830, "CC(remember):LiveCameraView.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(value$iv2);
                it$iv = value$iv2;
            }
            final MutableState cameraProvider$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1865452586, "CC(remember):LiveCameraView.kt#9igjgp");
            boolean invalid$iv = ($dirty & 14) == 4;
            Modifier modifier5 = modifier4;
            Object value$iv3 = $composer2.rememberedValue();
            if (invalid$iv || value$iv3 == Composer.INSTANCE.getEmpty()) {
                value$iv3 = new Function2() { // from class: com.google.ai.edge.gallery.ui.common.LiveCameraViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiveCameraViewKt.LiveCameraView$lambda$7$lambda$6(onBitmap, imageBitmap$delegate, (Bitmap) obj, (ImageProxy) obj2);
                    }
                };
                $composer2.updateRememberedValue(value$iv3);
            }
            final Function2 onBitmapFn = (Function2) value$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            ComposerKt.sourceInformationMarkerStart($composer2, 1865460055, "CC(remember):LiveCameraView.kt#9igjgp");
            boolean invalid$iv2 = (($dirty & 896) == 256) | $composer2.changedInstance(scope) | $composer2.changedInstance(context) | $composer2.changedInstance(lifecycleOwner) | $composer2.changed(onBitmapFn) | (($dirty & 7168) == 2048) | $composer2.changedInstance(cameraSelector2);
            Object it$iv2 = $composer2.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                final int i7 = preferredSize2;
                final int i8 = outputImageFormat2;
                final CameraSelector cameraSelector4 = cameraSelector2;
                Object value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.LiveCameraViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiveCameraViewKt.LiveCameraView$lambda$9$lambda$8(scope, context, lifecycleOwner, onBitmapFn, i7, i8, cameraSelector4, cameraProvider$delegate, ((Boolean) obj).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(value$iv4);
                it$iv2 = value$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ManagedActivityResultLauncher liveCameraPermissionLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) it$iv2, $composer2, 0);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 1865474978, "CC(remember):LiveCameraView.kt#9igjgp");
            boolean invalid$iv3 = (($dirty & 896) == 256) | $composer2.changedInstance(context) | $composer2.changedInstance(lifecycleOwner) | $composer2.changed(onBitmapFn) | (($dirty & 7168) == 2048) | $composer2.changedInstance(cameraSelector2) | $composer2.changedInstance(liveCameraPermissionLauncher);
            Object it$iv3 = $composer2.rememberedValue();
            if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = (Function2) new LiveCameraViewKt$LiveCameraView$1$1(context, lifecycleOwner, onBitmapFn, preferredSize2, outputImageFormat2, cameraSelector2, liveCameraPermissionLauncher, cameraProvider$delegate, null);
                $composer2.updateRememberedValue(value$iv5);
                it$iv3 = value$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv3, $composer2, 6);
            Unit unit2 = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 1865496626, "CC(remember):LiveCameraView.kt#9igjgp");
            Object value$iv6 = $composer2.rememberedValue();
            if (value$iv6 == Composer.INSTANCE.getEmpty()) {
                value$iv6 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.LiveCameraViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiveCameraViewKt.LiveCameraView$lambda$13$lambda$12(cameraProvider$delegate, (DisposableEffectScope) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv6);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) value$iv6, $composer2, 54);
            if (renderPreview2) {
                $composer2.startReplaceGroup(1995961920);
                ComposerKt.sourceInformation($composer2, "126@4632L1683");
                Modifier modifier$iv = BackgroundKt.m1359backgroundbw27NRU$default(modifier5, Color.INSTANCE.m6949getRed0d7_KjU(), null, 2, null);
                Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                int $changed$iv$iv = (48 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
                cameraSelector3 = cameraSelector2;
                preferredSize3 = preferredSize2;
                ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    function0 = constructor;
                    $composer2.createNode(function0);
                } else {
                    function0 = constructor;
                    $composer2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer2);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = ($changed$iv$iv$iv >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i10 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -923058379, "C:LiveCameraView.kt#t7sjiu");
                final ImageBitmap ib = LiveCameraView$lambda$1(imageBitmap$delegate);
                if (ib != null) {
                    $composer2.startReplaceGroup(-923017057);
                    ComposerKt.sourceInformation($composer2, "129@4826L1475,129@4784L1517");
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer2, -1276699129, "CC(remember):LiveCameraView.kt#9igjgp");
                    boolean invalid$iv4 = $composer2.changedInstance(ib);
                    Object it$iv4 = $composer2.rememberedValue();
                    if (invalid$iv4 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv7 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.LiveCameraViewKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LiveCameraViewKt.LiveCameraView$lambda$16$lambda$15$lambda$14(ib, (DrawScope) obj);
                            }
                        };
                        $composer2.updateRememberedValue(value$iv7);
                        it$iv4 = value$iv7;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) it$iv4, $composer2, 6);
                } else {
                    $composer2.startReplaceGroup(-927801442);
                }
                $composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
            } else {
                cameraSelector3 = cameraSelector2;
                preferredSize3 = preferredSize2;
                $composer2.startReplaceGroup(1991319453);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            cameraSelector3 = cameraSelector2;
            preferredSize3 = preferredSize2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier3;
            final int i11 = preferredSize3;
            final int i12 = outputImageFormat2;
            final boolean z = renderPreview2;
            final CameraSelector cameraSelector5 = cameraSelector3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.LiveCameraViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LiveCameraViewKt.LiveCameraView$lambda$17(onBitmap, modifier6, i11, i12, z, cameraSelector5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ImageBitmap LiveCameraView$lambda$1(MutableState<ImageBitmap> mutableState) {
        MutableState<ImageBitmap> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessCameraProvider LiveCameraView$lambda$4(MutableState<ProcessCameraProvider> mutableState) {
        MutableState<ProcessCameraProvider> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveCameraView$lambda$7$lambda$6(Function2 $onBitmap, MutableState $imageBitmap$delegate, Bitmap bitmap, ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        $imageBitmap$delegate.setValue(AndroidImageBitmap_androidKt.asImageBitmap(bitmap));
        $onBitmap.invoke(bitmap, imageProxy);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveCameraView$lambda$9$lambda$8(CoroutineScope $scope, Context $context, LifecycleOwner $lifecycleOwner, Function2 $onBitmapFn, int $preferredSize, int $outputImageFormat, CameraSelector $cameraSelector, MutableState $cameraProvider$delegate, boolean permissionGranted) {
        if (permissionGranted) {
            BuildersKt__Builders_commonKt.launch$default($scope, null, null, new C2672xfaa47590($context, $lifecycleOwner, $onBitmapFn, $preferredSize, $outputImageFormat, $cameraSelector, $cameraProvider$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LiveCameraView$lambda$13$lambda$12(final MutableState $cameraProvider$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.google.ai.edge.gallery.ui.common.LiveCameraViewKt$LiveCameraView$lambda$13$lambda$12$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ProcessCameraProvider processCameraProviderLiveCameraView$lambda$4 = LiveCameraViewKt.LiveCameraView$lambda$4($cameraProvider$delegate);
                if (processCameraProviderLiveCameraView$lambda$4 != null) {
                    processCameraProviderLiveCameraView$lambda$4.unbindAll();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveCameraView$lambda$16$lambda$15$lambda$14(ImageBitmap $ib, DrawScope Canvas) {
        float f;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float bitmapWidth = $ib.getWidth();
        float bitmapHeight = $ib.getHeight();
        int bits$iv$iv$iv = (int) (Canvas.mo7496getSizeNHjbRc() >> 32);
        float canvasWidth = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (Canvas.mo7496getSizeNHjbRc() & 4294967295L);
        float canvasHeight = Float.intBitsToFloat(bits$iv$iv$iv2);
        if (bitmapWidth / bitmapHeight > canvasWidth / canvasHeight) {
            f = canvasHeight / bitmapHeight;
        } else {
            f = canvasWidth / bitmapWidth;
        }
        float scale = f;
        float f2 = 2;
        float srcLeft = (bitmapWidth - (canvasWidth / scale)) / f2;
        float srcTop = (bitmapHeight - (canvasHeight / scale)) / f2;
        float srcRight = srcLeft + (canvasWidth / scale);
        float srcBottom = srcTop + (canvasHeight / scale);
        Rect srcRect = new Rect(srcLeft, srcTop, srcRight, srcBottom);
        Rect dstRect = new Rect(0.0f, 0.0f, canvasWidth, canvasHeight);
        int bits$iv$iv$iv3 = (int) (srcRect.m6705getTopLeftF1C5BW0() >> 32);
        int x$iv = (int) Float.intBitsToFloat(bits$iv$iv$iv3);
        int bits$iv$iv$iv4 = (int) (srcRect.m6705getTopLeftF1C5BW0() & 4294967295L);
        int y$iv = (int) Float.intBitsToFloat(bits$iv$iv$iv4);
        long jM9910constructorimpl = IntOffset.m9910constructorimpl((((long) y$iv) & 4294967295L) | (((long) x$iv) << 32));
        int width$iv = (int) (srcRect.getRight() - srcRect.getLeft());
        int height$iv = (int) (srcRect.getBottom() - srcRect.getTop());
        long jM9954constructorimpl = IntSize.m9954constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
        int bits$iv$iv$iv5 = (int) (dstRect.m6705getTopLeftF1C5BW0() >> 32);
        int x$iv2 = (int) Float.intBitsToFloat(bits$iv$iv$iv5);
        int bits$iv$iv$iv6 = (int) (dstRect.m6705getTopLeftF1C5BW0() & 4294967295L);
        int y$iv2 = (int) Float.intBitsToFloat(bits$iv$iv$iv6);
        long jM9910constructorimpl2 = IntOffset.m9910constructorimpl((((long) x$iv2) << 32) | (((long) y$iv2) & 4294967295L));
        int width$iv2 = (int) (dstRect.getRight() - dstRect.getLeft());
        int height$iv2 = (int) (dstRect.getBottom() - dstRect.getTop());
        DrawScope.m7479drawImageAZ2fEMs$default(Canvas, $ib, jM9910constructorimpl, jM9954constructorimpl, jM9910constructorimpl2, IntSize.m9954constructorimpl((((long) width$iv2) << 32) | (((long) height$iv2) & 4294967295L)), 0.0f, null, null, 0, 0, 992, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object startCamera(android.content.Context r18, androidx.lifecycle.LifecycleOwner r19, kotlin.jvm.functions.Function2<? super android.graphics.Bitmap, ? super androidx.camera.core.ImageProxy, kotlin.Unit> r20, int r21, int r22, androidx.camera.core.CameraSelector r23, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.ProcessCameraProvider> r24) {
        /*
    public static final java.lang.Object startCamera(android.content.Context r18, androidx.lifecycle.LifecycleOwner r19, kotlin.jvm.functions.Function2<? super android.graphics.Bitmap, ? super androidx.camera.core.ImageProxy, kotlin.Unit> r20, int r21, int r22, androidx.camera.core.CameraSelector r23, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.ProcessCameraProvider> r24) {
            // Method dump skipped - placeholder implementation
            return 0;
        }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCamera$lambda$19$lambda$18(CameraSelector $cameraSelector, Function2 $onBitmap, ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Bitmap bitmap = imageProxy.toBitmap();
        Intrinsics.checkNotNullExpressionValue(bitmap, "toBitmap(...)");
        int rotation = imageProxy.getImageInfo().getRotationDegrees();
        Matrix matrix = new Matrix();
        if (rotation != 0) {
            matrix.postRotate(rotation);
        }
        if (Intrinsics.areEqual($cameraSelector, CameraSelector.DEFAULT_FRONT_CAMERA)) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Bitmap bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmap2, "createBitmap(...)");
        $onBitmap.invoke(bitmap2, imageProxy);
    }
}
