package com.google.ai.edge.gallery.ui.common;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.DrawModifierKt;
import androidx.compose.p000ui.draw.ScaleKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.graphics.BlendMode;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorFilter;
import androidx.compose.p000ui.graphics.CompositingStrategy;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.TileMode;
import androidx.compose.p000ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.graphics.painter.Painter;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.p000ui.res.VectorResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.location.LocationRequestCompat;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Task;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: TaskIcon.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u00004\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0011\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m922d2 = {"SHAPES", "", "", "TaskIcon", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "modifier", "Landroidx/compose/ui/Modifier;", "width", "Landroidx/compose/ui/unit/Dp;", "animationProgress", "", "TaskIcon-942rkJo", "(Lcom/google/ai/edge/gallery/data/Task;Landroidx/compose/ui/Modifier;FFLandroidx/compose/runtime/Composer;II)V", "getTaskIconBgShape", "Landroidx/compose/ui/graphics/painter/Painter;", "(Lcom/google/ai/edge/gallery/data/Task;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class TaskIconKt {
    private static final List<Integer> SHAPES = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C2421R.drawable.circle), Integer.valueOf(C2421R.drawable.double_circle), Integer.valueOf(C2421R.drawable.pantegon), Integer.valueOf(C2421R.drawable.four_circle)});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaskIcon_942rkJo$lambda$4(Task task, Modifier modifier, float f, float f2, int i, int i2, Composer composer, int i3) {
        m10898TaskIcon942rkJo(task, modifier, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: TaskIcon-942rkJo, reason: not valid java name */
    public static final void m10898TaskIcon942rkJo(final Task task, Modifier modifier, float width, float animationProgress, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        float f;
        float animationProgress2;
        Composer $composer2;
        Modifier modifier3;
        float width2;
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(task, "task");
        Composer $composer3 = $composer.startRestartGroup(-1275564488);
        ComposerKt.sourceInformation($composer3, "C(TaskIcon)P(2,1,3:c#ui.unit.Dp)76@2583L1325:TaskIcon.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(task) ? 4 : 2;
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
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            f = width;
        } else if (($changed & 384) == 0) {
            f = width;
            $dirty |= $composer3.changed(f) ? 256 : 128;
        } else {
            f = width;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            animationProgress2 = animationProgress;
        } else if (($changed & 3072) == 0) {
            animationProgress2 = animationProgress;
            $dirty |= $composer3.changed(animationProgress2) ? 2048 : 1024;
        } else {
            animationProgress2 = animationProgress;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            float width3 = i3 != 0 ? C1654Dp.m9788constructorimpl(56) : f;
            if (i4 != 0) {
                animationProgress2 = 1.0f;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1275564488, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.TaskIcon (TaskIcon.kt:67)");
            }
            float f2 = 1;
            final Brush revealingBrush = Brush.INSTANCE.m6876linearGradientmHitzGk((Pair<Float, Color>[]) new Pair[]{TuplesKt.m929to(Float.valueOf(((f2 - animationProgress2) * 1.2f) - 0.2f), Color.m6905boximpl(Color.INSTANCE.m6949getRed0d7_KjU())), TuplesKt.m929to(Float.valueOf((f2 - animationProgress2) * 1.2f), Color.m6905boximpl(Color.INSTANCE.m6950getTransparent0d7_KjU()))}, (8 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : 0L, (8 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : 0L, (8 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0);
            Modifier modifier$iv = AspectRatioKt.aspectRatio$default(SizeKt.m2041width3ABfNKs(modifier4, width3), 1.0f, false, 2, null);
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (48 << 3) & 112;
            modifier3 = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            $composer2 = $composer3;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 566236745, "C77@2716L36,79@2781L31,90@3226L179,78@2758L700,101@3604L300:TaskIcon.kt#t7sjiu");
            final Brush brush = Brush.INSTANCE.m6875linearGradientmHitzGk((List<Color>) ColorUtilsKt.getTaskBgGradientColors(task, $composer3, $dirty2 & 14), (14 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : 0L, (14 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : 0L, (14 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0);
            Painter taskIconBgShape = getTaskIconBgShape(task, $composer3, $dirty2 & 14);
            Modifier modifierM7082graphicsLayer_6ThJ44$default = GraphicsLayerModifierKt.m7082graphicsLayer_6ThJ44$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.99f, 80 * (f2 - animationProgress2), 0.0f, 0.0f, 0.0f, 0.0f, (-180) * (f2 - animationProgress2), 0.0f, 0L, null, false, null, 0L, 0L, CompositingStrategy.INSTANCE.m7008getOffscreenNrFUSI(), 0, null, 458483, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 711018789, "CC(remember):TaskIcon.kt#9igjgp");
            boolean invalid$iv = $composer3.changed(brush) | $composer3.changed(revealingBrush);
            Object it$iv = $composer3.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.TaskIconKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaskIconKt.TaskIcon_942rkJo$lambda$3$lambda$1$lambda$0(brush, revealingBrush, (ContentDrawScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ImageKt.Image(taskIconBgShape, (String) null, DrawModifierKt.drawWithContent(modifierM7082graphicsLayer_6ThJ44$default, (Function1) it$iv), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, $composer3, Painter.$stable | 24624, LocationRequestCompat.QUALITY_LOW_POWER);
            final Ref.FloatRef iconAnimationProgress = new Ref.FloatRef();
            if (animationProgress2 >= 0.8d) {
                iconAnimationProgress.element = (animationProgress2 - 0.8f) / 0.2f;
            }
            ImageVector icon = task.getIcon();
            if (icon == null) {
                $composer3.startReplaceGroup(711031933);
                ComposerKt.sourceInformation($composer3, "102@3641L43");
                ImageVector.Companion companion = ImageVector.INSTANCE;
                Integer iconVectorResourceId = task.getIconVectorResourceId();
                Intrinsics.checkNotNull(iconVectorResourceId);
                icon = VectorResources_androidKt.vectorResource(companion, iconVectorResourceId.intValue(), $composer3, 6);
            } else {
                $composer3.startReplaceGroup(711031158);
            }
            $composer3.endReplaceGroup();
            ImageVector imageVector = icon;
            long jM6952getWhite0d7_KjU = Color.INSTANCE.m6952getWhite0d7_KjU();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float other$iv = C1654Dp.m9788constructorimpl(width3 * 0.55f);
            IconKt.m4075Iconww6aTOc(imageVector, (String) null, ScaleKt.scale(GraphicsLayerModifierKt.graphicsLayer(SizeKt.m2036size3ABfNKs(companion2, other$iv), new Function1() { // from class: com.google.ai.edge.gallery.ui.common.TaskIconKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaskIconKt.TaskIcon_942rkJo$lambda$3$lambda$2(iconAnimationProgress, (GraphicsLayerScope) obj);
                }
            }), iconAnimationProgress.element), jM6952getWhite0d7_KjU, $composer3, 3120, 0);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            width2 = width3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            width2 = f;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            final float f3 = width2;
            final float f4 = animationProgress2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.TaskIconKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaskIconKt.TaskIcon_942rkJo$lambda$4(task, modifier5, f3, f4, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaskIcon_942rkJo$lambda$3$lambda$1$lambda$0(Brush $brush, Brush $revealingBrush, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        DrawScope.m7489drawRectAsUm42w$default(drawWithContent, $brush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6853getSrcIn0nO6VwU(), 62, null);
        DrawScope.m7489drawRectAsUm42w$default(drawWithContent, $revealingBrush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6837getDstOut0nO6VwU(), 62, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaskIcon_942rkJo$lambda$3$lambda$2(Ref.FloatRef $iconAnimationProgress, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha($iconAnimationProgress.element);
        return Unit.INSTANCE;
    }

    private static final Painter getTaskIconBgShape(Task task, Composer $composer, int $changed) throws XmlPullParserException {
        ComposerKt.sourceInformationMarkerStart($composer, -1823713526, "C(getTaskIconBgShape)116@4036L35:TaskIcon.kt#t7sjiu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1823713526, $changed, -1, "com.google.ai.edge.gallery.ui.common.getTaskIconBgShape (TaskIcon.kt:114)");
        }
        int colorIndex = task.getIndex() % SHAPES.size();
        Painter painterPainterResource = PainterResources_androidKt.painterResource(SHAPES.get(colorIndex).intValue(), $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return painterPainterResource;
    }
}
