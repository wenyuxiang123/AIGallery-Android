package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.common.Classification;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\"\u0013\u0010\u0000\u001a\u00020\u0001¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0013\u0010\u0005\u001a\u00020\u0001¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003¨\u0006\u0010"}, m922d2 = {"CLASSIFICATION_BAR_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "getCLASSIFICATION_BAR_HEIGHT", "()F", "F", "CLASSIFICATION_BAR_MAX_WIDTH", "getCLASSIFICATION_BAR_MAX_WIDTH", "MessageBodyClassification", "", "message", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageClassification;", "modifier", "Landroidx/compose/ui/Modifier;", "oneLineLabel", "", "(Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageClassification;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class MessageBodyClassificationKt {
    private static final float CLASSIFICATION_BAR_HEIGHT = C1654Dp.m9788constructorimpl(8);
    private static final float CLASSIFICATION_BAR_MAX_WIDTH = C1654Dp.m9788constructorimpl(200);

    
    public static final Unit MessageBodyClassification$lambda$3(ChatMessageClassification chatMessageClassification, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        MessageBodyClassification(chatMessageClassification, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final float getCLASSIFICATION_BAR_HEIGHT() {
        return CLASSIFICATION_BAR_HEIGHT;
    }

    public static final float getCLASSIFICATION_BAR_MAX_WIDTH() {
        return CLASSIFICATION_BAR_MAX_WIDTH;
    }

    public static final void MessageBodyClassification(final ChatMessageClassification message, Modifier modifier, boolean oneLineLabel, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        Composer $composer2;
        Modifier modifier3;
        boolean oneLineLabel2;
        Modifier.Companion modifier4;
        boolean oneLineLabel3;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer $composer3 = $composer.startRestartGroup(-587530074);
        ComposerKt.sourceInformation($composer3, "C(MessageBodyClassification)54@1992L1307:MessageBodyClassification.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(message) ? 4 : 2;
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
            z = oneLineLabel;
        } else if (($changed & 384) == 0) {
            z = oneLineLabel;
            $dirty |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = oneLineLabel;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            oneLineLabel2 = z;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i3 == 0) {
                oneLineLabel3 = z;
            } else {
                oneLineLabel3 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-587530074, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyClassification (MessageBodyClassification.kt:53)");
            }
            Modifier modifier$iv = PaddingKt.m1988padding3ABfNKs(modifier4, C1654Dp.m9788constructorimpl(12));
            Composer $composer$iv = $composer3;
            ComposerKt.sourceInformationMarkerStart($composer$iv, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer$iv, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
            Composer $composer$iv$iv = $composer$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv$iv, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv$iv, 0));
            modifier3 = modifier4;
            CompositionLocalMap localMap$iv$iv = $composer$iv$iv.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer$iv$iv, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            String str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            Composer $composer$iv$iv$iv = $composer$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer$iv$iv$iv.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv$iv$iv.startReusableNode();
            if ($composer$iv$iv$iv.getInserting()) {
                function0 = constructor;
                $composer$iv$iv$iv.createNode(function0);
            } else {
                function0 = constructor;
                $composer$iv$iv$iv.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer$iv$iv$iv);
            MeasurePolicy measurePolicy$iv$iv = measurePolicy$iv;
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = ($changed$iv$iv$iv >> 6) & 14;
            int i5 = 0;
            ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, 857660033, "C:MessageBodyClassification.kt#ouynps");
            $composer$iv$iv$iv.startReplaceGroup(1551687106);
            ComposerKt.sourceInformation($composer$iv$iv$iv, "*56@2097L602,72@2706L40,74@2773L469,90@3249L40");
            Iterator<Classification> it = message.getClassifications().iterator();
            while (it.hasNext()) {
                Classification classification = it.next();
                Iterator<Classification> it2 = it;
                Modifier materialized$iv$iv2 = materialized$iv$iv;
                int compositeKeyHash$iv$iv2 = compositeKeyHash$iv$iv;
                int i7 = i5;
                Modifier modifier$iv2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getSpaceBetween();
                MeasurePolicy measurePolicy$iv$iv2 = measurePolicy$iv$iv;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer$iv$iv$iv, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv$iv$iv, 0));
                CompositionLocalMap localMap$iv$iv2 = $composer$iv$iv$iv.getCurrentCompositionLocalMap();
                int $changed$iv$iv2 = $changed$iv$iv;
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer$iv$iv$iv, modifier$iv2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv2 = ((((54 << 3) & 112) << 6) & 896) | 6;
                Composer $composer4 = $composer3;
                Composer $composer$iv$iv$iv2 = $composer$iv;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, -553112988, str);
                if (!($composer$iv$iv$iv.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv$iv$iv.startReusableNode();
                if ($composer$iv$iv$iv.getInserting()) {
                    function02 = constructor2;
                    $composer$iv$iv$iv.createNode(function02);
                } else {
                    function02 = constructor2;
                    $composer$iv$iv$iv.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer$iv$iv$iv);
                Composer $composer$iv$iv2 = $composer$iv$iv;
                Composer $composer$iv$iv$iv3 = $composer$iv$iv$iv;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                int i8 = ($changed$iv$iv$iv2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                int i9 = ((54 >> 6) & 112) | 6;
                RowScope $this$MessageBodyClassification_u24lambda_u242_u24lambda_u240 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, 1654423636, "C62@2405L10,58@2230L248,68@2605L10,66@2520L171:MessageBodyClassification.kt#ouynps");
                boolean oneLineLabel4 = oneLineLabel3;
                TextKt.m4781TextNvy7gAk(classification.getLabel(), RowScope.weight$default($this$MessageBodyClassification_u24lambda_u242_u24lambda_u240, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9685getEllipsisgIe3tQ8(), false, oneLineLabel3 ? 1 : Integer.MAX_VALUE, 0, null, MaterialTheme.INSTANCE.getTypography($composer$iv$iv$iv, MaterialTheme.$stable).getBodySmall(), $composer$iv$iv$iv, 0, 384, 110588);
                String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(classification.getScore())}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                TextKt.m4781TextNvy7gAk(str2, $this$MessageBodyClassification_u24lambda_u242_u24lambda_u240.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottom()), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer$iv$iv$iv, MaterialTheme.$stable).getBodySmall(), $composer$iv$iv$iv, 0, 0, 131068);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                $composer$iv$iv$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(2)), $composer$iv$iv$iv, 6);
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                Modifier modifier$iv3 = Modifier.INSTANCE;
                Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
                MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv$iv$iv, 0));
                CompositionLocalMap localMap$iv$iv3 = $composer$iv$iv$iv.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer$iv$iv$iv, modifier$iv3);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv3 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, -553112988, str);
                if (!($composer$iv$iv$iv.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv$iv$iv.startReusableNode();
                if ($composer$iv$iv$iv.getInserting()) {
                    function03 = constructor3;
                    $composer$iv$iv$iv.createNode(function03);
                } else {
                    function03 = constructor3;
                    $composer$iv$iv$iv.useNode();
                }
                String str3 = str;
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer$iv$iv$iv);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                int i10 = ($changed$iv$iv$iv3 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i11 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv, 1988706144, "C80@2971L11,75@2787L217,82@3013L221:MessageBodyClassification.kt#ouynps");
                BoxKt.Box(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(SizeKt.m2022height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), CLASSIFICATION_BAR_HEIGHT), RoundedCornerShapeKt.getCircleShape()), MaterialTheme.INSTANCE.getColorScheme($composer$iv$iv$iv, MaterialTheme.$stable).getSurfaceDim(), null, 2, null), $composer$iv$iv$iv, 0);
                BoxKt.Box(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(SizeKt.m2022height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, classification.getScore()), CLASSIFICATION_BAR_HEIGHT), RoundedCornerShapeKt.getCircleShape()), classification.m10369getColor0d7_KjU(), null, 2, null), $composer$iv$iv$iv, 0);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                $composer$iv$iv$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                SpacerKt.Spacer(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(6)), $composer$iv$iv$iv, 6);
                materialized$iv$iv = materialized$iv$iv2;
                it = it2;
                compositeKeyHash$iv$iv = compositeKeyHash$iv$iv2;
                i5 = i7;
                measurePolicy$iv$iv = measurePolicy$iv$iv2;
                $changed$iv$iv = $changed$iv$iv2;
                str = str3;
                $composer$iv = $composer$iv$iv$iv2;
                $composer3 = $composer4;
                $composer$iv$iv$iv = $composer$iv$iv$iv3;
                $composer$iv$iv = $composer$iv$iv2;
                oneLineLabel3 = oneLineLabel4;
            }
            oneLineLabel2 = oneLineLabel3;
            $composer2 = $composer3;
            Composer $composer$iv$iv$iv4 = $composer$iv$iv$iv;
            $composer$iv$iv$iv.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            $composer$iv$iv$iv4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv4);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer$iv);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            final boolean z2 = oneLineLabel2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyClassificationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyClassificationKt.MessageBodyClassification$lambda$3(message, modifier5, z2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
