package com.google.ai.edge.gallery.p006ui.common;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.DrawModifierKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.graphics.BlendMode;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorFilter;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.TileMode;
import androidx.compose.p000ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.graphics.painter.Painter;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.location.LocationRequestCompat;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: RotationalLoader.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\u0001X\u008a\u0084\u0002"}, m922d2 = {"GRID_SPACING_FACTOR", "", "ICON_SIZE_FACTOR", "RotationalLoader", "", "size", "Landroidx/compose/ui/unit/Dp;", "RotationalLoader-8Feqmps", "(FLandroidx/compose/runtime/Composer;I)V", "app_debug", "rotationProgress", "scaleProgress"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class RotationalLoaderKt {
    private static final float GRID_SPACING_FACTOR = 0.1f;
    private static final float ICON_SIZE_FACTOR = 0.3f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RotationalLoader_8Feqmps$lambda$12(float f, int i, Composer composer, int i2) {
        m10889RotationalLoader8Feqmps(f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: RotationalLoader-8Feqmps, reason: not valid java name */
    public static final void m10889RotationalLoader8Feqmps(final float size, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-1624344042);
        ComposerKt.sourceInformation($composer3, "C(RotationalLoader)P(0:c#ui.unit.Dp)62@2760L46,64@2856L259,74@3162L229,92@3755L28,92@3805L2,93@3813L1433,87@3524L1722:RotationalLoader.kt#t7sjiu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(size) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1624344042, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.RotationalLoader (RotationalLoader.kt:61)");
            }
            InfiniteTransition infiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("infinite", $composer3, 6, 0);
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m1245infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(2000, 0, new CubicBezierEasing(0.5f, 0.16f, 0.0f, 0.71f), 2, null), RepeatMode.Restart, 0L, 4, null), null, $composer3, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransition, 1.0f, 0.4f, AnimationSpecKt.m1245infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, EasingFunctionsKt.getEaseInOut(), 2, null), RepeatMode.Reverse, 0L, 4, null), null, $composer3, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            final float curRotationZ = (RotationalLoader_8Feqmps$lambda$0(stateAnimateFloat) * 360.0f) + 45.0f;
            final float curScale = RotationalLoader_8Feqmps$lambda$1(stateAnimateFloat2);
            final float other$iv = C1654Dp.m9788constructorimpl(size * 0.1f);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(other$iv);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM1843spacedBy0680j_42 = Arrangement.INSTANCE.m1843spacedBy0680j_4(other$iv);
            Modifier modifierM2036size3ABfNKs = SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, size);
            ComposerKt.sourceInformationMarkerStart($composer3, -1921461742, "CC(remember):RotationalLoader.kt#9igjgp");
            boolean invalid$iv = $composer3.changed(curRotationZ);
            Object it$iv = $composer3.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.RotationalLoaderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RotationalLoaderKt.RotationalLoader_8Feqmps$lambda$3$lambda$2(curRotationZ, (GraphicsLayerScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM2036size3ABfNKs, (Function1) it$iv);
            ComposerKt.sourceInformationMarkerStart($composer3, -1921460168, "CC(remember):RotationalLoader.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.RotationalLoaderKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RotationalLoaderKt.RotationalLoader_8Feqmps$lambda$5$lambda$4((SemanticsPropertyReceiver) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifierGraphicsLayer, (Function1) it$iv2);
            GridCells.Fixed fixed2 = fixed;
            Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM1843spacedBy0680j_42;
            Arrangement.HorizontalOrVertical horizontalOrVertical2 = horizontalOrVerticalM1843spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer3, -1921458481, "CC(remember):RotationalLoader.kt#9igjgp");
            boolean invalid$iv2 = (($dirty2 & 14) == 4) | $composer3.changed(other$iv) | $composer3.changed(curRotationZ) | $composer3.changed(curScale);
            Object it$iv3 = $composer3.rememberedValue();
            if (invalid$iv2 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.RotationalLoaderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RotationalLoaderKt.RotationalLoader_8Feqmps$lambda$11$lambda$10(size, other$iv, curRotationZ, curScale, (LazyGridScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            LazyGridDslKt.LazyVerticalGrid(fixed2, modifierClearAndSetSemantics, null, null, false, horizontalOrVertical, horizontalOrVertical2, null, false, null, (Function1) it$iv3, $composer3, 0, 0, 924);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.RotationalLoaderKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RotationalLoaderKt.RotationalLoader_8Feqmps$lambda$12(size, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float RotationalLoader_8Feqmps$lambda$0(State<Float> state) {
        Object thisObj$iv = state.getValue();
        return ((Number) thisObj$iv).floatValue();
    }

    private static final float RotationalLoader_8Feqmps$lambda$1(State<Float> state) {
        Object thisObj$iv = state.getValue();
        return ((Number) thisObj$iv).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RotationalLoader_8Feqmps$lambda$3$lambda$2(float $curRotationZ, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationZ($curRotationZ);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RotationalLoader_8Feqmps$lambda$5$lambda$4(SemanticsPropertyReceiver clearAndSetSemantics) {
        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RotationalLoader_8Feqmps$lambda$11$lambda$10(final float $size, final float $gridSpacing, final float $curRotationZ, final float $curScale, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final List items$iv = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C2421R.drawable.four_circle), Integer.valueOf(C2421R.drawable.circle), Integer.valueOf(C2421R.drawable.double_circle), Integer.valueOf(C2421R.drawable.pantegon)});
        LazyVerticalGrid.items(items$iv.size(), null, null, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.common.RotationalLoaderKt$RotationalLoader_8Feqmps$lambda$11$lambda$10$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                items$iv.get(index);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1942245546, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.common.RotationalLoaderKt$RotationalLoader_8Feqmps$lambda$11$lambda$10$$inlined$itemsIndexed$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) throws XmlPullParserException {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope $this$items, int it, Composer $composer, int $changed) throws XmlPullParserException {
                Alignment contentAlignment$iv;
                Function0<ComposeUiNode> function0;
                int i;
                ComposerKt.sourceInformation($composer, "CN(it)576@25926L26:LazyGridDsl.kt#7791vq");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1942245546, $dirty, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:576)");
                    }
                    int $changed2 = ($dirty & 14) | ($dirty & 112);
                    int imageResource = ((Number) items$iv.get(it)).intValue();
                    $composer.startReplaceGroup(-686584605);
                    ComposerKt.sourceInformation($composer, "CP(1)*102@4015L1221:RotationalLoader.kt#t7sjiu");
                    Modifier modifier$iv = SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(C1654Dp.m9788constructorimpl($size - $gridSpacing) / 2));
                    switch (it) {
                        case 0:
                            contentAlignment$iv = Alignment.INSTANCE.getBottomEnd();
                            break;
                        case 1:
                            contentAlignment$iv = Alignment.INSTANCE.getBottomStart();
                            break;
                        case 2:
                            contentAlignment$iv = Alignment.INSTANCE.getTopEnd();
                            break;
                        case 3:
                            contentAlignment$iv = Alignment.INSTANCE.getTopStart();
                            break;
                        default:
                            contentAlignment$iv = Alignment.INSTANCE.getCenter();
                            break;
                    }
                    ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
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
                    int i2 = ($changed$iv$iv$iv >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i3 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1832673180, "C121@4547L12,123@4629L35,127@4804L222,134@5058L116,122@4602L626:RotationalLoader.kt#t7sjiu");
                    switch (it) {
                        case 0:
                            i = 2;
                            break;
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 0;
                            break;
                        default:
                            i = 3;
                            break;
                    }
                    int colorIndex = i;
                    final Brush brush = Brush.INSTANCE.m6875linearGradientmHitzGk((List<Color>) ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).getTaskBgGradientColors().get(colorIndex), (14 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : 0L, (14 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : 0L, (14 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0);
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(imageResource, $composer, ($changed2 >> 6) & 14);
                    Modifier modifierM2036size3ABfNKs = SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl($size * 0.3f));
                    ComposerKt.sourceInformationMarkerStart($composer, 1583153139, "CC(remember):RotationalLoader.kt#9igjgp");
                    boolean invalid$iv = $composer.changed($curRotationZ) | $composer.changed($curScale);
                    Object it$iv = $composer.rememberedValue();
                    if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                        final float f = $curRotationZ;
                        final float f2 = $curScale;
                        Object value$iv = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: com.google.ai.edge.gallery.ui.common.RotationalLoaderKt$RotationalLoader$3$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                invoke2(graphicsLayerScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(GraphicsLayerScope graphicsLayer) {
                                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                graphicsLayer.setAlpha(0.99f);
                                graphicsLayer.setRotationZ(-f);
                                graphicsLayer.setScaleX(f2);
                                graphicsLayer.setScaleY(f2);
                            }
                        };
                        $composer.updateRememberedValue(value$iv);
                        it$iv = value$iv;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM2036size3ABfNKs, (Function1) it$iv);
                    ComposerKt.sourceInformationMarkerStart($composer, 1583161161, "CC(remember):RotationalLoader.kt#9igjgp");
                    boolean invalid$iv2 = $composer.changed(brush);
                    Object it$iv2 = $composer.rememberedValue();
                    if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv2 = (Function1) new Function1<ContentDrawScope, Unit>() { // from class: com.google.ai.edge.gallery.ui.common.RotationalLoaderKt$RotationalLoader$3$1$1$1$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                invoke2(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ContentDrawScope drawWithContent) {
                                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                                drawWithContent.drawContent();
                                DrawScope.m7489drawRectAsUm42w$default(drawWithContent, brush, 0L, 0L, 0.0f, null, null, BlendMode.INSTANCE.m6853getSrcIn0nO6VwU(), 62, null);
                            }
                        };
                        $composer.updateRememberedValue(value$iv2);
                        it$iv2 = value$iv2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ImageKt.Image(painterPainterResource, (String) null, DrawModifierKt.drawWithContent(modifierGraphicsLayer, (Function1) it$iv2), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, $composer, Painter.$stable | 24624, LocationRequestCompat.QUALITY_LOW_POWER);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                $composer.skipToGroupEnd();
            }
        }));
        return Unit.INSTANCE;
    }
}
