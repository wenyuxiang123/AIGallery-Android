package com.google.ai.edge.gallery.ui.common;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorFilter;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.painter.Painter;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.IntSize;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineScope;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: GlitteringShapesLoader.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000:\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\r\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018²\u0006\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u001dX\u008a\u0084\u0002"}, m922d2 = {"SHAPES", "", "", "PARTICLE_ANIMATION_DURATION", "PARTICLE_ALIVE_MS", "PARTICLE_BASE_SIZE", "BATCH_SIZE", "BATCH_INTERVAL_MS", "curId", "", "getCurId", "()J", "setCurId", "(J)V", "GlitteringShapesLoader", "", "(Landroidx/compose/runtime/Composer;I)V", "Particle", "shape", "Lcom/google/ai/edge/gallery/ui/common/Shape;", "boxSize", "Landroidx/compose/ui/unit/IntSize;", "Particle-95KtPRI", "(Lcom/google/ai/edge/gallery/ui/common/Shape;JLandroidx/compose/runtime/Composer;I)V", "app_debug", "shapes", "enterAnimation", "", "enterProgress", "", "exitAnimation", "exitProgress"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GlitteringShapesLoaderKt {
    private static final int BATCH_INTERVAL_MS = 300;
    private static final int BATCH_SIZE = 5;
    private static final int PARTICLE_ALIVE_MS = 600;
    private static final int PARTICLE_ANIMATION_DURATION = 300;
    private static final int PARTICLE_BASE_SIZE = 6;
    private static final List<Integer> SHAPES = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C2421R.drawable.circle), Integer.valueOf(C2421R.drawable.double_circle), Integer.valueOf(C2421R.drawable.pantegon), Integer.valueOf(C2421R.drawable.four_circle)});
    private static long curId;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlitteringShapesLoader$lambda$10(int i, Composer composer, int i2) throws XmlPullParserException {
        GlitteringShapesLoader(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Particle_95KtPRI$lambda$24(Shape shape, long j, int i, Composer composer, int i2) throws XmlPullParserException {
        m10878Particle95KtPRI(shape, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final long getCurId() {
        return curId;
    }

    public static final void setCurId(long j) {
        curId = j;
    }

    public static final void GlitteringShapesLoader(Composer $composer, final int $changed) throws XmlPullParserException {
        Function0<ComposeUiNode> function0;
        Composer $composer2 = $composer.startRestartGroup(-317788862);
        ComposerKt.sourceInformation($composer2, "C(GlitteringShapesLoader)75@2642L44,76@2704L41,77@2783L12,80@2888L954,80@2867L975,111@3903L16,110@3846L228:GlitteringShapesLoader.kt#t7sjiu");
        if (!$composer2.shouldExecute($changed != 0, $changed & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-317788862, $changed, -1, "com.google.ai.edge.gallery.ui.common.GlitteringShapesLoader (GlitteringShapesLoader.kt:74)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -452416434, "CC(remember):GlitteringShapesLoader.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            MutableState shapes$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -452414453, "CC(remember):GlitteringShapesLoader.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m9951boximpl(IntSize.INSTANCE.m9964getZeroYbymL2g()), null, 2, null);
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableState boxSize$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            List<Color> taskIconColors = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer2, MaterialTheme.$stable).getTaskIconColors();
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -452407652, "CC(remember):GlitteringShapesLoader.kt#9igjgp");
            boolean invalid$iv = $composer2.changedInstance(taskIconColors);
            Object it$iv3 = $composer2.rememberedValue();
            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = (Function2) new GlitteringShapesLoaderKt$GlitteringShapesLoader$1$1(taskIconColors, shapes$delegate, null);
                $composer2.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv3, $composer2, 6);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -452376110, "CC(remember):GlitteringShapesLoader.kt#9igjgp");
            Object it$iv4 = $composer2.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.GlitteringShapesLoaderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GlitteringShapesLoaderKt.GlitteringShapesLoader$lambda$8$lambda$7(boxSize$delegate, (IntSize) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifier$iv = OnRemeasuredModifierKt.onSizeChanged(modifierFillMaxSize$default, (Function1) it$iv4);
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (54 << 3) & 112;
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
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i2 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -157049369, "C:GlitteringShapesLoader.kt#t7sjiu");
            $composer2.startReplaceGroup(826217884);
            ComposerKt.sourceInformation($composer2, "");
            for (Iterator<Shape> it = GlitteringShapesLoader$lambda$1(shapes$delegate).iterator(); it.hasNext(); it = it) {
                Shape shape = it.next();
                $composer2.startMovableGroup(826218808, Long.valueOf(shape.getId()));
                ComposerKt.sourceInformation($composer2, "115@4020L42");
                m10878Particle95KtPRI(shape, GlitteringShapesLoader$lambda$4(boxSize$delegate), $composer2, 0);
                $composer2.endMovableGroup();
                shapes$delegate = shapes$delegate;
            }
            $composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.GlitteringShapesLoaderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GlitteringShapesLoaderKt.GlitteringShapesLoader$lambda$10($changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Shape> GlitteringShapesLoader$lambda$1(MutableState<List<Shape>> mutableState) {
        MutableState<List<Shape>> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final long GlitteringShapesLoader$lambda$4(MutableState<IntSize> mutableState) {
        MutableState<IntSize> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().m9963unboximpl();
    }

    private static final void GlitteringShapesLoader$lambda$5(MutableState<IntSize> mutableState, long j) {
        mutableState.setValue(IntSize.m9951boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlitteringShapesLoader$lambda$8$lambda$7(MutableState $boxSize$delegate, IntSize it) {
        GlitteringShapesLoader$lambda$5($boxSize$delegate, it.m9963unboximpl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Particle-95KtPRI, reason: not valid java name */
    private static final void m10878Particle95KtPRI(final Shape shape, final long boxSize, Composer $composer, final int $changed) throws XmlPullParserException {
        String str;
        boolean z;
        float fParticle_95KtPRI$lambda$14;
        Composer $composer2 = $composer.startRestartGroup(-97693355);
        ComposerKt.sourceInformation($composer2, "C(Particle)P(1,0:c#ui.unit.IntSize)122@4169L34,124@4238L162,128@4422L32,129@4478L55,129@4457L76,134@4558L34,136@4626L161,140@4811L83,140@4790L104,147@4996L28,150@5118L172,146@4975L432:GlitteringShapesLoader.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(shape) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(boxSize) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-97693355, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.Particle (GlitteringShapesLoader.kt:121)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 605969303, "CC(remember):GlitteringShapesLoader.kt#9igjgp");
            Object it$iv = $composer2.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            MutableState enterAnimation$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(Particle_95KtPRI$lambda$12(enterAnimation$delegate) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, null, null, $composer2, 0, 28);
            ComposerKt.sourceInformationMarkerStart($composer2, 605977397, "CC(remember):GlitteringShapesLoader.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                str = "CC(remember):GlitteringShapesLoader.kt#9igjgp";
                Object value$iv2 = Long.valueOf(Random.INSTANCE.nextLong(50L));
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            } else {
                str = "CC(remember):GlitteringShapesLoader.kt#9igjgp";
            }
            long initialDelay = ((Number) it$iv2).longValue();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Unit unit = Unit.INSTANCE;
            String str2 = str;
            ComposerKt.sourceInformationMarkerStart($composer2, 605979212, str2);
            Object it$iv3 = $composer2.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = (Function2) new GlitteringShapesLoaderKt$Particle$1$1(initialDelay, enterAnimation$delegate, null);
                $composer2.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv3, $composer2, 6);
            ComposerKt.sourceInformationMarkerStart($composer2, 605981751, str2);
            Object it$iv4 = $composer2.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(mutableStateMutableStateOf$default);
                it$iv4 = mutableStateMutableStateOf$default;
            }
            MutableState exitAnimation$delegate = (MutableState) it$iv4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(Particle_95KtPRI$lambda$18(exitAnimation$delegate) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, null, null, $composer2, 0, 28);
            Unit unit2 = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 605989896, str2);
            Object it$iv5 = $composer2.rememberedValue();
            if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = (Function2) new GlitteringShapesLoaderKt$Particle$2$1(initialDelay, exitAnimation$delegate, null);
                $composer2.updateRememberedValue(value$iv4);
                it$iv5 = value$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv5, $composer2, 6);
            if (Particle_95KtPRI$lambda$20(stateAnimateFloatAsState2) > 0.0f) {
                z = true;
                fParticle_95KtPRI$lambda$14 = 1 - Particle_95KtPRI$lambda$20(stateAnimateFloatAsState2);
            } else {
                z = true;
                fParticle_95KtPRI$lambda$14 = Particle_95KtPRI$lambda$14(stateAnimateFloatAsState);
            }
            final float progress = fParticle_95KtPRI$lambda$14;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(shape.getShape(), $composer2, 0);
            Modifier modifierM2036size3ABfNKs = SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, shape.m10896getSizeD9Ej5fM());
            ComposerKt.sourceInformationMarkerStart($composer2, 605999809, str2);
            boolean z2 = ($dirty2 & 112) == 32 ? z : false;
            if (($dirty2 & 14) != 4) {
                z = false;
            }
            boolean invalid$iv = z2 | z | $composer2.changed(progress);
            Object it$iv6 = $composer2.rememberedValue();
            if (invalid$iv || it$iv6 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.GlitteringShapesLoaderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GlitteringShapesLoaderKt.Particle_95KtPRI$lambda$23$lambda$22(boxSize, shape, progress, (GraphicsLayerScope) obj);
                    }
                };
                $composer2.updateRememberedValue(value$iv5);
                it$iv6 = value$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ImageKt.Image(painterPainterResource, (String) null, GraphicsLayerModifierKt.graphicsLayer(modifierM2036size3ABfNKs, (Function1) it$iv6), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, ColorFilter.Companion.m6956tintxETnrds$default(ColorFilter.INSTANCE, ColorKt.m6966lerpjxsXWHM(shape.m10895getColor0d7_KjU(), Color.INSTANCE.m6952getWhite0d7_KjU(), 0.95f), 0, 2, null), $composer2, Painter.$stable | 24624, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.GlitteringShapesLoaderKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GlitteringShapesLoaderKt.Particle_95KtPRI$lambda$24(shape, boxSize, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean Particle_95KtPRI$lambda$12(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Particle_95KtPRI$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final float Particle_95KtPRI$lambda$14(State<Float> state) {
        Object thisObj$iv = state.getValue();
        return ((Number) thisObj$iv).floatValue();
    }

    private static final boolean Particle_95KtPRI$lambda$18(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Particle_95KtPRI$lambda$19(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final float Particle_95KtPRI$lambda$20(State<Float> state) {
        Object thisObj$iv = state.getValue();
        return ((Number) thisObj$iv).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Particle_95KtPRI$lambda$23$lambda$22(long $boxSize, Shape $shape, float $progress, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationX(((int) ($boxSize >> 32)) * $shape.getRelativeX());
        graphicsLayer.setTranslationY(((int) (4294967295L & $boxSize)) * $shape.getRelativeY());
        graphicsLayer.setScaleX($progress);
        graphicsLayer.setScaleY($progress);
        return Unit.INSTANCE;
    }
}
