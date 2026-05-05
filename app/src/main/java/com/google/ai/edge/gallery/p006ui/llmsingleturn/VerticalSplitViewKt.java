package com.google.ai.edge.gallery.p006ui.llmsingleturn;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.LayoutCoordinates;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VerticalSplitView.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m921d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001ag\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u000bX\u008a\u008e\u0002"}, m922d2 = {"VerticalSplitView", "", "topView", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "bottomView", "modifier", "Landroidx/compose/ui/Modifier;", "initialRatio", "", "minTopHeight", "Landroidx/compose/ui/unit/Dp;", "minBottomHeight", "handleThickness", "VerticalSplitView-ugZX9yg", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;FFFFLandroidx/compose/runtime/Composer;II)V", "app_debug", "splitRatio", "columnHeightPx", "columnHeightDp"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class VerticalSplitViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalSplitView_ugZX9yg$lambda$17(Function2 function2, Function2 function22, Modifier modifier, float f, float f2, float f3, float f4, int i, int i2, Composer composer, int i3) {
        m11139VerticalSplitViewugZX9yg(function2, function22, modifier, f, f2, f3, f4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: VerticalSplitView-ugZX9yg, reason: not valid java name */
    public static final void m11139VerticalSplitViewugZX9yg(final Function2<? super Composer, ? super Integer, Unit> topView, final Function2<? super Composer, ? super Integer, Unit> bottomView, Modifier modifier, float initialRatio, float minTopHeight, float minBottomHeight, float handleThickness, Composer $composer, final int $changed, final int i) {
        float initialRatio2;
        float minTopHeight2;
        float minBottomHeight2;
        int $dirty;
        Composer $composer2;
        Modifier modifier2;
        float handleThickness2;
        float initialRatio3;
        float minTopHeight3;
        float minBottomHeight3;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Function0<ComposeUiNode> function04;
        Intrinsics.checkNotNullParameter(topView, "topView");
        Intrinsics.checkNotNullParameter(bottomView, "bottomView");
        Composer $composer3 = $composer.startRestartGroup(1453411250);
        ComposerKt.sourceInformation($composer3, "C(VerticalSplitView)P(6!1,5,2,4:c#ui.unit.Dp,3:c#ui.unit.Dp,1:c#ui.unit.Dp)56@2219L46,57@2290L36,58@2351L33,59@2419L7,63@2503L219,61@2430L1527:VerticalSplitView.kt#32uq7b");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(topView) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(bottomView) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty2 |= 384;
        } else if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(modifier) ? 256 : 128;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty2 |= 3072;
            initialRatio2 = initialRatio;
        } else if (($changed & 3072) == 0) {
            initialRatio2 = initialRatio;
            $dirty2 |= $composer3.changed(initialRatio2) ? 2048 : 1024;
        } else {
            initialRatio2 = initialRatio;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty2 |= 24576;
            minTopHeight2 = minTopHeight;
        } else if (($changed & 24576) == 0) {
            minTopHeight2 = minTopHeight;
            $dirty2 |= $composer3.changed(minTopHeight2) ? 16384 : 8192;
        } else {
            minTopHeight2 = minTopHeight;
        }
        int i5 = i & 32;
        if (i5 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.f249xf2722a21;
            minBottomHeight2 = minBottomHeight;
        } else if ((196608 & $changed) == 0) {
            minBottomHeight2 = minBottomHeight;
            $dirty2 |= $composer3.changed(minBottomHeight2) ? 131072 : 65536;
        } else {
            minBottomHeight2 = minBottomHeight;
        }
        int i6 = i & 64;
        if (i6 != 0) {
            $dirty2 |= 1572864;
        } else if (($changed & 1572864) == 0) {
            $dirty2 |= $composer3.changed(handleThickness) ? 1048576 : 524288;
        }
        if ($composer3.shouldExecute(($dirty2 & 599187) != 599186, $dirty2 & 1)) {
            Modifier.Companion modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier;
            if (i3 != 0) {
                initialRatio2 = 0.5f;
            }
            if (i4 != 0) {
                minTopHeight2 = C1654Dp.m9788constructorimpl(ProgressIndicatorKt.FirstLineTailDelay);
            }
            if (i5 != 0) {
                minBottomHeight2 = C1654Dp.m9788constructorimpl(200);
            }
            float handleThickness3 = i6 != 0 ? C1654Dp.m9788constructorimpl(20) : handleThickness;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1453411250, $dirty2, -1, "com.google.ai.edge.gallery.ui.llmsingleturn.VerticalSplitView (VerticalSplitView.kt:55)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 863849280, "CC(remember):VerticalSplitView.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = PrimitiveSnapshotStateKt.mutableFloatStateOf(initialRatio2);
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            MutableFloatState splitRatio$delegate = (MutableFloatState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 863851542, "CC(remember):VerticalSplitView.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            float initialRatio4 = initialRatio2;
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer3.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            final MutableFloatState columnHeightPx$delegate = (MutableFloatState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 863853491, "CC(remember):VerticalSplitView.kt#9igjgp");
            Object value$iv3 = $composer3.rememberedValue();
            if (value$iv3 == Composer.INSTANCE.getEmpty()) {
                value$iv3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C1654Dp.m9786boximpl(C1654Dp.m9788constructorimpl(0)), null, 2, null);
                $composer3.updateRememberedValue(value$iv3);
            }
            final MutableState columnHeightDp$delegate = (MutableState) value$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Density localDensity2 = (Density) objConsume;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 863858541, "CC(remember):VerticalSplitView.kt#9igjgp");
            boolean invalid$iv = $composer3.changed(localDensity2);
            modifier2 = modifier3;
            Object value$iv4 = $composer3.rememberedValue();
            if (invalid$iv || value$iv4 == Composer.INSTANCE.getEmpty()) {
                value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.VerticalSplitViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return VerticalSplitViewKt.VerticalSplitView_ugZX9yg$lambda$11$lambda$10(localDensity2, columnHeightPx$delegate, columnHeightDp$delegate, (LayoutCoordinates) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv4);
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier$iv = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default, (Function1) value$iv4);
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            minBottomHeight3 = minBottomHeight2;
            minTopHeight3 = minTopHeight2;
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
            int i7 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i8 = ((0 >> 6) & 112) | 6;
            ColumnScope $this$VerticalSplitView_ugZX9yg_u24lambda_u2416 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -1505592061, "C69@2733L72,75@2936L12,76@2999L596,71@2811L1056,101@3873L80:VerticalSplitView.kt#32uq7b");
            Modifier modifier$iv2 = ColumnScope.weight$default($this$VerticalSplitView_ugZX9yg_u24lambda_u2416, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), VerticalSplitView_ugZX9yg$lambda$1(splitRatio$delegate), false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv2 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function02 = constructor2;
                $composer3.createNode(function02);
            } else {
                function02 = constructor2;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i10 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1219939940, "C69@2794L9:VerticalSplitView.kt#32uq7b");
            topView.invoke($composer3, Integer.valueOf($dirty2 & 14));
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierM1359backgroundbw27NRU$default = BackgroundKt.m1359backgroundbw27NRU$default(SizeKt.m2022height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), handleThickness3), ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer3, MaterialTheme.$stable).m11228getAgentBubbleBgColor0d7_KjU(), null, 2, null);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 2029650384, "CC(remember):VerticalSplitView.kt#9igjgp");
            boolean invalid$iv2 = $composer3.changed(localDensity2) | ((57344 & $dirty2) == 16384) | ((458752 & $dirty2) == 131072);
            Object it$iv3 = $composer3.rememberedValue();
            if (invalid$iv2 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv5 = (PointerInputEventHandler) new VerticalSplitViewKt$VerticalSplitView$2$2$1(localDensity2, minTopHeight3, minBottomHeight3, columnHeightPx$delegate, splitRatio$delegate, columnHeightDp$delegate);
                $composer3.updateRememberedValue(value$iv5);
                it$iv3 = value$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier$iv3 = SuspendingPointerInputFilterKt.pointerInput(modifierM1359backgroundbw27NRU$default, unit, (PointerInputEventHandler) it$iv3);
            Alignment contentAlignment$iv2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
            int $changed$iv$iv3 = (48 << 3) & 112;
            handleThickness2 = handleThickness3;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function03 = constructor3;
                $composer3.createNode(function03);
            } else {
                function03 = constructor3;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer3);
            $composer2 = $composer3;
            $dirty = $dirty2;
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i11 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i12 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 96797461, "C97@3805L11,92@3654L207:VerticalSplitView.kt#32uq7b");
            Modifier modifierClip = ClipKt.clip(SizeKt.m2022height3ABfNKs(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(32)), C1654Dp.m9788constructorimpl(4)), RoundedCornerShapeKt.getCircleShape());
            long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant();
            BoxKt.Box(BackgroundKt.m1359backgroundbw27NRU$default(modifierClip, Color.m6913copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m6917getAlphaimpl(onSurfaceVariant) : 0.4f, (14 & 2) != 0 ? Color.m6921getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(onSurfaceVariant) : 0.0f), null, 2, null), $composer3, 0);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier$iv4 = ColumnScope.weight$default($this$VerticalSplitView_ugZX9yg_u24lambda_u2416, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f - VerticalSplitView_ugZX9yg$lambda$1(splitRatio$delegate), false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv3 = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
            int $changed$iv$iv4 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv4 = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer3, modifier$iv4);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function04 = constructor4;
                $composer3.createNode(function04);
            } else {
                function04 = constructor4;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
            int i13 = ($changed$iv$iv$iv4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            int i14 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1662574407, "C101@3939L12:VerticalSplitView.kt#32uq7b");
            bottomView.invoke($composer3, Integer.valueOf(($dirty >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            initialRatio3 = initialRatio4;
        } else {
            $dirty = $dirty2;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            handleThickness2 = handleThickness;
            initialRatio3 = initialRatio2;
            minTopHeight3 = minTopHeight2;
            minBottomHeight3 = minBottomHeight2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final float f = initialRatio3;
            final float f2 = minTopHeight3;
            final float f3 = minBottomHeight3;
            final float f4 = handleThickness2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.llmsingleturn.VerticalSplitViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerticalSplitViewKt.VerticalSplitView_ugZX9yg$lambda$17(topView, bottomView, modifier4, f, f2, f3, f4, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float VerticalSplitView_ugZX9yg$lambda$1(MutableFloatState $splitRatio$delegate) {
        MutableFloatState $this$getValue$iv = $splitRatio$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float VerticalSplitView_ugZX9yg$lambda$4(MutableFloatState $columnHeightPx$delegate) {
        MutableFloatState $this$getValue$iv = $columnHeightPx$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float VerticalSplitView_ugZX9yg$lambda$7(MutableState<C1654Dp> mutableState) {
        MutableState<C1654Dp> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().m9802unboximpl();
    }

    private static final void VerticalSplitView_ugZX9yg$lambda$8(MutableState<C1654Dp> mutableState, float f) {
        mutableState.setValue(C1654Dp.m9786boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalSplitView_ugZX9yg$lambda$11$lambda$10(Density $localDensity, MutableFloatState $columnHeightPx$delegate, MutableState $columnHeightDp$delegate, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        $columnHeightPx$delegate.setFloatValue((int) (coordinates.mo8374getSizeYbymL2g() & 4294967295L));
        int $i$f$unpackInt2 = (int) (4294967295L & coordinates.mo8374getSizeYbymL2g());
        VerticalSplitView_ugZX9yg$lambda$8($columnHeightDp$delegate, $localDensity.mo1521toDpu2uoSUM($i$f$unpackInt2));
        return Unit.INSTANCE;
    }
}
