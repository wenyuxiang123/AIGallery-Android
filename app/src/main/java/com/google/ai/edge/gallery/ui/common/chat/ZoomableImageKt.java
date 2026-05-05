package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.ImageBitmap;
import androidx.compose.p000ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: ZoomableImage.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a¶\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2M\b\u0002\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0018\u001a\u001a\u0010\u0019\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, m922d2 = {"ZoomableImage", "", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "modifier", "Landroidx/compose/ui/Modifier;", "minScale", "", "maxScale", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "resetOnImageUpdate", "", "enabled", "twoFingerOnly", "onTransformed", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "offsetX", "offsetY", "scale", "(Landroidx/compose/ui/graphics/ImageBitmap;Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/layout/ContentScale;Landroidx/compose/foundation/pager/PagerState;ZZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "setScrolling", "value", "(Landroidx/compose/foundation/pager/PagerState;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ZoomableImageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ZoomableImage$lambda$10(ImageBitmap imageBitmap, Modifier modifier, float f, float f2, ContentScale contentScale, PagerState pagerState, boolean z, boolean z2, boolean z3, Function3 function3, int i, int i2, Composer composer, int i3) {
        ZoomableImage(imageBitmap, modifier, f, f2, contentScale, pagerState, z, z2, z3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ZoomableImage$lambda$1$lambda$0(float f, float f2, float f3) {
        return Unit.INSTANCE;
    }

    public static final void ZoomableImage(final ImageBitmap bitmap, Modifier modifier, float minScale, float maxScale, ContentScale contentScale, PagerState pagerState, boolean resetOnImageUpdate, boolean enabled, boolean twoFingerOnly, Function3<? super Float, ? super Float, ? super Float, Unit> function3, Composer $composer, final int $changed, final int i) {
        ContentScale contentScale2;
        Modifier modifier2;
        float minScale2;
        float maxScale2;
        PagerState pagerState2;
        boolean resetOnImageUpdate2;
        boolean enabled2;
        boolean twoFingerOnly2;
        Function3<? super Float, ? super Float, ? super Float, Unit> function32;
        ContentScale contentScale3;
        Modifier.Companion companionPointerInput;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Composer $composer2 = $composer.startRestartGroup(-1752260969);
        ComposerKt.sourceInformation($composer2, "C(ZoomableImage)P(!1,5,4,3!1,7,8!1,9)64@2592L14,66@2626L36,67@2679L36,68@2732L36,69@2792L24,71@2843L129,71@2820L152,120@4882L590:ZoomableImage.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(bitmap) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
        } else if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(modifier) ? 32 : 16;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
        } else if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(minScale) ? 256 : 128;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(maxScale) ? 2048 : 1024;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty |= 24576;
            contentScale2 = contentScale;
        } else if (($changed & 24576) == 0) {
            contentScale2 = contentScale;
            $dirty |= $composer2.changed(contentScale2) ? 16384 : 8192;
        } else {
            contentScale2 = contentScale;
        }
        int i6 = i & 32;
        if (i6 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f249xf2722a21;
        } else if (($changed & ProfileVerifier.CompilationStatus.f249xf2722a21) == 0) {
            $dirty |= $composer2.changed(pagerState) ? 131072 : 65536;
        }
        int i7 = i & 64;
        if (i7 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 1572864) == 0) {
            $dirty |= $composer2.changed(resetOnImageUpdate) ? 1048576 : 524288;
        }
        int i8 = i & 128;
        if (i8 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty |= $composer2.changed(enabled) ? 8388608 : 4194304;
        }
        int i9 = i & 256;
        if (i9 != 0) {
            $dirty |= 100663296;
        } else if (($changed & 100663296) == 0) {
            $dirty |= $composer2.changed(twoFingerOnly) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i10 = i & 512;
        if (i10 != 0) {
            $dirty |= 805306368;
        } else if (($changed & 805306368) == 0) {
            $dirty |= $composer2.changedInstance(function3) ? 536870912 : 268435456;
        }
        if ($composer2.shouldExecute(($dirty & 306783379) != 306783378, $dirty & 1)) {
            modifier2 = i2 != 0 ? Modifier.INSTANCE : modifier;
            minScale2 = i3 != 0 ? 1.0f : minScale;
            maxScale2 = i4 != 0 ? 3.0f : maxScale;
            if (i5 != 0) {
                contentScale2 = ContentScale.INSTANCE.getFit();
            }
            PagerState pagerState3 = i6 != 0 ? null : pagerState;
            resetOnImageUpdate2 = i7 != 0 ? true : resetOnImageUpdate;
            enabled2 = i8 != 0 ? true : enabled;
            twoFingerOnly2 = i9 != 0 ? false : twoFingerOnly;
            if (i10 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer2, -295598651, "CC(remember):ZoomableImage.kt#9igjgp");
                Object it$iv = $composer2.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return ZoomableImageKt.ZoomableImage$lambda$1$lambda$0(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    };
                    $composer2.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                function32 = (Function3) it$iv;
            } else {
                function32 = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1752260969, $dirty, -1, "com.google.ai.edge.gallery.ui.common.chat.ZoomableImage (ZoomableImage.kt:65)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -295597541, "CC(remember):ZoomableImage.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableFloatState scale = (MutableFloatState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -295595845, "CC(remember):ZoomableImage.kt#9igjgp");
            Object it$iv3 = $composer2.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer2.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            final MutableFloatState offsetX = (MutableFloatState) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -295594149, "CC(remember):ZoomableImage.kt#9igjgp");
            Object it$iv4 = $composer2.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer2.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            final MutableFloatState offsetY = (MutableFloatState) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object it$iv$iv = $composer2.rememberedValue();
            if (it$iv$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
                $composer2.updateRememberedValue(value$iv$iv);
                it$iv$iv = value$iv$iv;
            }
            final CoroutineScope coroutineScope = (CoroutineScope) it$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -295590504, "CC(remember):ZoomableImage.kt#9igjgp");
            boolean invalid$iv = (3670016 & $dirty) == 1048576;
            Object it$iv5 = $composer2.rememberedValue();
            if (invalid$iv || it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = (Function2) new ZoomableImageKt$ZoomableImage$2$1(resetOnImageUpdate2, scale, offsetX, offsetY, null);
                $composer2.updateRememberedValue(value$iv5);
                it$iv5 = value$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(bitmap, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv5, $composer2, $dirty & 14);
            if (enabled2) {
                $composer2.startReplaceGroup(-573150031);
                ComposerKt.sourceInformation($composer2, "81@3060L1703");
                Modifier.Companion companion = Modifier.INSTANCE;
                Boolean boolValueOf = Boolean.valueOf(twoFingerOnly2);
                ComposerKt.sourceInformationMarkerStart($composer2, -295581986, "CC(remember):ZoomableImage.kt#9igjgp");
                boolean invalid$iv2 = ((234881024 & $dirty) == 67108864) | (($dirty & 7168) == 2048) | (($dirty & 896) == 256) | $composer2.changedInstance(coroutineScope) | ((458752 & $dirty) == 131072) | ((1879048192 & $dirty) == 536870912);
                Object it$iv6 = $composer2.rememberedValue();
                if (invalid$iv2 || it$iv6 == Composer.INSTANCE.getEmpty()) {
                    final boolean z = twoFingerOnly2;
                    final float f = maxScale2;
                    final float f2 = minScale2;
                    final Function3<? super Float, ? super Float, ? super Float, Unit> function33 = function32;
                    final PagerState pagerState4 = pagerState3;
                    Object value$iv6 = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$ZoomableImage$gestureModifier$1$1

                        /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$ZoomableImage$gestureModifier$1$1$1 */
                        /* JADX INFO: compiled from: ZoomableImage.kt */
                        @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                        @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$ZoomableImage$gestureModifier$1$1$1", m932f = "ZoomableImage.kt", m933i = {0, 1}, m934l = {93, 95}, m935m = "invokeSuspend", m936n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, m938s = {"L$0", "L$0"})
                        static final class C27381 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ CoroutineScope $coroutineScope;
                            final /* synthetic */ float $maxScale;
                            final /* synthetic */ float $minScale;
                            final /* synthetic */ MutableFloatState $offsetX;
                            final /* synthetic */ MutableFloatState $offsetY;
                            final /* synthetic */ Function3<Float, Float, Float, Unit> $onTransformed;
                            final /* synthetic */ PagerState $pagerState;
                            final /* synthetic */ MutableFloatState $scale;
                            final /* synthetic */ boolean $twoFingerOnly;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C27381(boolean z, MutableFloatState mutableFloatState, float f, float f2, CoroutineScope coroutineScope, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, Function3<? super Float, ? super Float, ? super Float, Unit> function3, PagerState pagerState, Continuation<? super C27381> continuation) {
                                super(2, continuation);
                                this.$twoFingerOnly = z;
                                this.$scale = mutableFloatState;
                                this.$maxScale = f;
                                this.$minScale = f2;
                                this.$coroutineScope = coroutineScope;
                                this.$offsetX = mutableFloatState2;
                                this.$offsetY = mutableFloatState3;
                                this.$onTransformed = function3;
                                this.$pagerState = pagerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C27381 c27381 = new C27381(this.$twoFingerOnly, this.$scale, this.$maxScale, this.$minScale, this.$coroutineScope, this.$offsetX, this.$offsetY, this.$onTransformed, this.$pagerState, continuation);
                                c27381.L$0 = obj;
                                return c27381;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                return ((C27381) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Path cross not found for [B:21:0x0060, B:22:0x0062], limit reached: 52 */
                            /* JADX WARN: Path cross not found for [B:22:0x0062, B:21:0x0060], limit reached: 52 */
                            /* JADX WARN: Path cross not found for [B:35:0x014a, B:38:0x0155], limit reached: 52 */
                            /* JADX WARN: Path cross not found for [B:38:0x0155, B:35:0x014a], limit reached: 52 */
                            /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
                            /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
                            /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[ADDED_TO_REGION] */
                            /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
                            /* JADX WARN: Removed duplicated region for block: B:46:0x0172  */
                            /* JADX WARN: Removed duplicated region for block: B:48:0x0175  */
                            /* JADX WARN: Removed duplicated region for block: B:50:0x016f A[SYNTHETIC] */
                            /* JADX WARN: Type inference failed for: r10v0 */
                            /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.input.pointer.PointerEventPass, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r10v15 */
                            /* JADX WARN: Type inference failed for: r10v16 */
                            /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.coroutines.Continuation] */
                            /* JADX WARN: Type inference failed for: r10v6 */
                            /* JADX WARN: Type inference failed for: r7v1 */
                            /* JADX WARN: Type inference failed for: r7v10 */
                            /* JADX WARN: Type inference failed for: r7v2 */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004a -> B:15:0x004d). Please report as a decompilation issue!!! */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                                /*
                                    Method dump skipped, instruction units count: 388
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$ZoomableImage$gestureModifier$1$1.C27381.invokeSuspend(java.lang.Object):java.lang.Object");
                            }

                            /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$ZoomableImage$gestureModifier$1$1$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: ZoomableImage.kt */
                            @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                            @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$ZoomableImage$gestureModifier$1$1$1$1", m932f = "ZoomableImage.kt", m933i = {}, m934l = {100}, m935m = "invokeSuspend", m936n = {}, m938s = {})
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ PagerState $pagerState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(PagerState pagerState, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$pagerState = pagerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$pagerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object $result) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (this.label) {
                                        case 0:
                                            ResultKt.throwOnFailure($result);
                                            PagerState pagerState = this.$pagerState;
                                            if (pagerState != null) {
                                                this.label = 1;
                                                if (ZoomableImageKt.setScrolling(pagerState, false, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            break;
                                        case 1:
                                            ResultKt.throwOnFailure($result);
                                            break;
                                        default:
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$ZoomableImage$gestureModifier$1$1$1$3, reason: invalid class name */
                            /* JADX INFO: compiled from: ZoomableImage.kt */
                            @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
                            @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$ZoomableImage$gestureModifier$1$1$1$3", m932f = "ZoomableImage.kt", m933i = {}, m934l = {110}, m935m = "invokeSuspend", m936n = {}, m938s = {})
                            static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ PagerState $pagerState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass3(PagerState pagerState, Continuation<? super AnonymousClass3> continuation) {
                                    super(2, continuation);
                                    this.$pagerState = pagerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass3(this.$pagerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object $result) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (this.label) {
                                        case 0:
                                            ResultKt.throwOnFailure($result);
                                            PagerState pagerState = this.$pagerState;
                                            if (pagerState != null) {
                                                this.label = 1;
                                                if (ZoomableImageKt.setScrolling(pagerState, true, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                            break;
                                        case 1:
                                            ResultKt.throwOnFailure($result);
                                            break;
                                        default:
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }

                        @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
                            Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture($this$pointerInput, new C27381(z, scale, f, f2, coroutineScope, offsetX, offsetY, function33, pagerState4, null), continuation);
                            return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                        }
                    };
                    $composer2.updateRememberedValue(value$iv6);
                    it$iv6 = value$iv6;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                companionPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, boolValueOf, (PointerInputEventHandler) it$iv6);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-571455292);
                $composer2.endReplaceGroup();
                companionPointerInput = Modifier.INSTANCE;
            }
            Modifier gestureModifier = companionPointerInput;
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
            Modifier modifier$iv = ClipKt.clip(BackgroundKt.m1359backgroundbw27NRU$default(modifier2, Color.INSTANCE.m6950getTransparent0d7_KjU(), null, 2, null), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(0))).then(gestureModifier);
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
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
            int i11 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i12 = ((48 >> 6) & 112) | 6;
            BoxScope $this$ZoomableImage_u24lambda_u249 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -783408666, "C130@5222L239,125@5052L416:ZoomableImage.kt#ouynps");
            Modifier modifierAlign = $this$ZoomableImage_u24lambda_u249.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
            ComposerKt.sourceInformationMarkerStart($composer2, 390376012, "CC(remember):ZoomableImage.kt#9igjgp");
            boolean invalid$iv3 = (($dirty & 896) == 256) | (($dirty & 7168) == 2048);
            Object it$iv7 = $composer2.rememberedValue();
            if (invalid$iv3 || it$iv7 == Composer.INSTANCE.getEmpty()) {
                final float f3 = minScale2;
                final float f4 = maxScale2;
                Object value$iv7 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZoomableImageKt.ZoomableImage$lambda$9$lambda$8$lambda$7(f3, f4, scale, offsetX, offsetY, (GraphicsLayerScope) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv7);
                it$iv7 = value$iv7;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ImageKt.m1426Image5hnEew(bitmap, null, GraphicsLayerModifierKt.graphicsLayer(modifierAlign, (Function1) it$iv7), null, contentScale2, 0.0f, null, 0, $composer2, ($dirty & 14) | 48 | (57344 & $dirty), 232);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            pagerState2 = pagerState3;
            contentScale3 = contentScale2;
        } else {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            minScale2 = minScale;
            maxScale2 = maxScale;
            pagerState2 = pagerState;
            resetOnImageUpdate2 = resetOnImageUpdate;
            enabled2 = enabled;
            twoFingerOnly2 = twoFingerOnly;
            function32 = function3;
            contentScale3 = contentScale2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final float f5 = minScale2;
            final float f6 = maxScale2;
            final ContentScale contentScale4 = contentScale3;
            final PagerState pagerState5 = pagerState2;
            final boolean z2 = resetOnImageUpdate2;
            final boolean z3 = enabled2;
            final boolean z4 = twoFingerOnly2;
            final Function3<? super Float, ? super Float, ? super Float, Unit> function34 = function32;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ZoomableImageKt.ZoomableImage$lambda$10(bitmap, modifier3, f5, f6, contentScale4, pagerState5, z2, z3, z4, function34, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ZoomableImage$lambda$9$lambda$8$lambda$7(float $minScale, float $maxScale, MutableFloatState $scale, MutableFloatState $offsetX, MutableFloatState $offsetY, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(Math.max($minScale, Math.min($maxScale, $scale.getFloatValue())));
        graphicsLayer.setScaleY(Math.max($minScale, Math.min($maxScale, $scale.getFloatValue())));
        graphicsLayer.setTranslationX($offsetX.getFloatValue());
        graphicsLayer.setTranslationY($offsetY.getFloatValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$setScrolling$2 */
    /* JADX INFO: compiled from: ZoomableImage.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.ZoomableImageKt$setScrolling$2", m932f = "ZoomableImage.kt", m933i = {}, m934l = {151}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C27392 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27392(boolean z, Continuation<? super C27392> continuation) {
            super(2, continuation);
            this.$value = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27392(this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((C27392) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (!this.$value) {
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw new KotlinNothingValueException();
        }
    }

    public static final Object setScrolling(PagerState $this$setScrolling, boolean value, Continuation<? super Unit> continuation) {
        Object objScroll = $this$setScrolling.scroll(MutatePriority.PreventUserInput, new C27392(value, null), continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }
}
