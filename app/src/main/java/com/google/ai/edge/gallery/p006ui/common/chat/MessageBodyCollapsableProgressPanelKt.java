package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.TextUnit;
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBodyCollapsableProgressPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u0015\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\tX\u008a\u008e\u0002"}, m922d2 = {"MAX_DESCRIPTION_LINES", "", "MessageBodyCollapsableProgressPanel", "", "message", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageCollapsableProgressPanel;", "(Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageCollapsableProgressPanel;Landroidx/compose/runtime/Composer;I)V", "app_debug", "isExpanded", "", "showLogsViewer"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MessageBodyCollapsableProgressPanelKt {
    private static final int MAX_DESCRIPTION_LINES = 5;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyCollapsableProgressPanel$lambda$27(ChatMessageCollapsableProgressPanel chatMessageCollapsableProgressPanel, int i, Composer composer, int i2) {
        MessageBodyCollapsableProgressPanel(chatMessageCollapsableProgressPanel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MessageBodyCollapsableProgressPanel(ChatMessageCollapsableProgressPanel message, Composer $composer, final int $changed) {
        final ChatMessageCollapsableProgressPanel chatMessageCollapsableProgressPanel;
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Function0<ComposeUiNode> function04;
        Function0<ComposeUiNode> function05;
        Object it$iv;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer $composer3 = $composer.startRestartGroup(-1011275444);
        ComposerKt.sourceInformation($composer3, "C(MessageBodyCollapsableProgressPanel)72@3088L34,73@3147L34,77@3248L11,78@3301L28,75@3185L4665:MessageBodyCollapsableProgressPanel.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(message) ? 4 : 2;
        }
        if (!$composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            chatMessageCollapsableProgressPanel = message;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1011275444, $dirty, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyCollapsableProgressPanel (MessageBodyCollapsableProgressPanel.kt:71)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -1173088914, "CC(remember):MessageBodyCollapsableProgressPanel.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv);
                it$iv2 = value$iv;
            }
            final MutableState isExpanded$delegate = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1173087026, "CC(remember):MessageBodyCollapsableProgressPanel.kt#9igjgp");
            Object it$iv3 = $composer3.rememberedValue();
            if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv2);
                it$iv3 = value$iv2;
            }
            final MutableState showLogsViewer$delegate = (MutableState) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierM1359backgroundbw27NRU$default = BackgroundKt.m1359backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -1173082104, "CC(remember):MessageBodyCollapsableProgressPanel.kt#9igjgp");
            Object it$iv4 = $composer3.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MessageBodyCollapsableProgressPanelKt.MessageBodyCollapsableProgressPanel$lambda$7$lambda$6(isExpanded$delegate);
                    }
                };
                $composer3.updateRememberedValue(value$iv3);
                it$iv4 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier$iv = SizeKt.fillMaxWidth$default(ClickableKt.m1401clickableoSLSa3U(modifierM1359backgroundbw27NRU$default, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv4), 0.0f, 1, null);
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
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int $changed2 = ((0 >> 6) & 112) | 6;
            ColumnScope $this$MessageBodyCollapsableProgressPanel_u24lambda_u2424 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 2087812784, "C82@3433L1612,132@5235L2611,128@5114L2732:MessageBodyCollapsableProgressPanel.kt#ouynps");
            Modifier modifier$iv2 = PaddingKt.m1988padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(16));
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            int $changed$iv$iv2 = (438 << 3) & 112;
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
            int i2 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i3 = ((438 >> 6) & 112) | 6;
            RowScope $this$MessageBodyCollapsableProgressPanel_u24lambda_u2424_u24lambda_u2415 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -867027707, "C87@3619L1152,120@4829L210:MessageBodyCollapsableProgressPanel.kt#ouynps");
            Modifier modifier$iv3 = RowScope.weight$default($this$MessageBodyCollapsableProgressPanel_u24lambda_u2424_u24lambda_u2415, Modifier.INSTANCE, 1.0f, false, 2, null);
            Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv3 = (432 << 3) & 112;
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
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i5 = ((432 >> 6) & 112) | 6;
            RowScope $this$MessageBodyCollapsableProgressPanel_u24lambda_u2424_u24lambda_u2415_u24lambda_u2414 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -670182686, "C93@3848L447,105@4305L458:MessageBodyCollapsableProgressPanel.kt#ouynps");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getCenter();
            Modifier modifier$iv4 = SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24));
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv4 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv4 = (54 << 3) & 112;
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
            int i6 = ($changed$iv$iv$iv4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i7 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 367409788, "C:MessageBodyCollapsableProgressPanel.kt#ouynps");
            if (message.getInProgress()) {
                $composer3.startReplaceGroup(367429317);
                ComposerKt.sourceInformation($composer3, "98@4116L11,95@3972L187");
                ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), C1654Dp.m9788constructorimpl(2), 0L, 0, 0.0f, $composer3, 390, 56);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(367643310);
                ComposerKt.sourceInformation($composer3, "101@4191L82");
                IconKt.m4075Iconww6aTOc(message.getDoneIcon(), (String) null, SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(24)), 0L, $composer3, 432, 8);
                $composer3.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier$iv5 = RowScope.weight$default($this$MessageBodyCollapsableProgressPanel_u24lambda_u2424_u24lambda_u2415_u24lambda_u2414, Modifier.INSTANCE, 1.0f, false, 2, null);
            Alignment contentAlignment$iv2 = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv5 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
            int $changed$iv$iv5 = (48 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv5 = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer3, modifier$iv5);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv5 = (($changed$iv$iv5 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function05 = constructor5;
                $composer3.createNode(function05);
            } else {
                function05 = constructor5;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv5, Integer.valueOf(compositeKeyHash$iv$iv5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = ($changed$iv$iv$iv5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i9 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1961150944, "C109@4502L133,107@4415L338:MessageBodyCollapsableProgressPanel.kt#ouynps");
            String title = message.getTitle();
            ComposerKt.sourceInformationMarkerStart($composer3, 768023638, "CC(remember):MessageBodyCollapsableProgressPanel.kt#9igjgp");
            Object it$iv5 = $composer3.rememberedValue();
            if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageBodyCollapsableProgressPanelKt.m496xd2d81e70((AnimatedContentTransitionScope) obj);
                    }
                };
                $composer3.updateRememberedValue(value$iv4);
                it$iv = value$iv4;
            } else {
                it$iv = it$iv5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            AnimatedContentKt.AnimatedContent(title, null, (Function1) it$iv, null, null, null, ComposableSingletons$MessageBodyCollapsableProgressPanelKt.INSTANCE.m10943getLambda$1145372345$app_debug(), $composer3, 1573248, 58);
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
            IconKt.m4075Iconww6aTOc(MessageBodyCollapsableProgressPanel$lambda$1(isExpanded$delegate) ? KeyboardArrowUpKt.getKeyboardArrowUp(Icons.Filled.INSTANCE) : KeyboardArrowDownKt.getKeyboardArrowDown(Icons.Filled.INSTANCE), MessageBodyCollapsableProgressPanel$lambda$1(isExpanded$delegate) ? "Collapse panel" : "Expand panel", (Modifier) null, 0L, $composer3, 0, 12);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            chatMessageCollapsableProgressPanel = message;
            AnimatedVisibilityKt.AnimatedVisibility($this$MessageBodyCollapsableProgressPanel_u24lambda_u2424, MessageBodyCollapsableProgressPanel$lambda$1(isExpanded$delegate), (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null), (String) null, ComposableLambdaKt.rememberComposableLambda(772707518, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MessageBodyCollapsableProgressPanelKt.MessageBodyCollapsableProgressPanel$lambda$24$lambda$23(chatMessageCollapsableProgressPanel, showLogsViewer$delegate, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, ($changed2 & 14) | 1600512, 18);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (MessageBodyCollapsableProgressPanel$lambda$4(showLogsViewer$delegate)) {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-2001268361);
                ComposerKt.sourceInformation($composer2, "211@7938L26,211@7880L85");
                List<LogMessage> logMessages = message.getLogMessages();
                ComposerKt.sourceInformationMarkerStart($composer2, -1172933722, "CC(remember):MessageBodyCollapsableProgressPanel.kt#9igjgp");
                Object it$iv6 = $composer2.rememberedValue();
                if (it$iv6 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv5 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageBodyCollapsableProgressPanelKt.MessageBodyCollapsableProgressPanel$lambda$26$lambda$25(showLogsViewer$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(value$iv5);
                    it$iv6 = value$iv5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                LogsViewerKt.LogsViewer(logMessages, (Function0) it$iv6, $composer2, 48);
            } else {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-2009083306);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyCollapsableProgressPanelKt.MessageBodyCollapsableProgressPanel$lambda$27(chatMessageCollapsableProgressPanel, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean MessageBodyCollapsableProgressPanel$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void MessageBodyCollapsableProgressPanel$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MessageBodyCollapsableProgressPanel$lambda$4(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void MessageBodyCollapsableProgressPanel$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyCollapsableProgressPanel$lambda$7$lambda$6(MutableState $isExpanded$delegate) {
        MessageBodyCollapsableProgressPanel$lambda$2($isExpanded$delegate, !MessageBodyCollapsableProgressPanel$lambda$1($isExpanded$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageBodyCollapsableProgressPanel$lambda$24$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11 */
    public static final ContentTransform m496xd2d81e70(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(MessageBodyCollapsableProgressPanelKt.m498xd2fa3e50(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)), EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(MessageBodyCollapsableProgressPanelKt.m497x8c4d8ae8(((Integer) obj).intValue()));
            }
        }, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageBodyCollapsableProgressPanel$lambda$24$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$9 */
    public static final int m498xd2fa3e50(int it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageBodyCollapsableProgressPanel$lambda$24$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10 */
    public static final int m497x8c4d8ae8(int it) {
        return -it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyCollapsableProgressPanel$lambda$24$lambda$23(ChatMessageCollapsableProgressPanel $message, final MutableState $showLogsViewer$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        float fM9788constructorimpl;
        Function0<ComposeUiNode> function0;
        Composer $composer2;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Function0<ComposeUiNode> function04;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C133@5243L2597:MessageBodyCollapsableProgressPanel.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(772707518, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyCollapsableProgressPanel.<anonymous>.<anonymous> (MessageBodyCollapsableProgressPanel.kt:133)");
        }
        Modifier modifierM1990paddingVpY3zN4$default = PaddingKt.m1990paddingVpY3zN4$default(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16), 0.0f, 2, null);
        if ($message.getLogMessages().isEmpty()) {
            fM9788constructorimpl = C1654Dp.m9788constructorimpl(12);
        } else {
            fM9788constructorimpl = C1654Dp.m9788constructorimpl(8);
        }
        Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(modifierM1990paddingVpY3zN4$default, 0.0f, 0.0f, 0.0f, fM9788constructorimpl, 7, null);
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
        Composer $composer$iv = $composer;
        String str = "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo";
        ComposerKt.sourceInformationMarkerStart($composer$iv, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer$iv, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        int $changed$iv$iv = (48 << 3) & 112;
        Composer $composer$iv$iv = $composer$iv;
        String str2 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart($composer$iv$iv, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv$iv, 0));
        CompositionLocalMap localMap$iv$iv = $composer$iv$iv.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer$iv$iv, modifier$iv);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        String str3 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
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
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
        int i = ($changed$iv$iv$iv >> 6) & 14;
        Composer $composer$iv2 = $composer$iv$iv$iv;
        int i2 = 0;
        String str4 = "C89@4557L9:Column.kt#2w3rfo";
        ComposerKt.sourceInformationMarkerStart($composer$iv2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        int i3 = ((48 >> 6) & 112) | 6;
        Composer $composer3 = $composer$iv2;
        ComposerKt.sourceInformationMarkerStart($composer3, -2034982304, "C:MessageBodyCollapsableProgressPanel.kt#ouynps");
        $composer3.startReplaceGroup(1596922749);
        ComposerKt.sourceInformation($composer3, "*150@5770L11,147@5637L1539");
        Iterator<ProgressPanelItem> it = $message.getItems().iterator();
        while (true) {
            int i4 = i2;
            if (!it.hasNext()) {
                break;
            }
            ProgressPanelItem item = it.next();
            Iterator<ProgressPanelItem> it2 = it;
            CompositionLocalMap localMap$iv$iv2 = localMap$iv$iv;
            Alignment.Horizontal horizontalAlignment$iv2 = horizontalAlignment$iv;
            Modifier modifier$iv2 = SizeKt.fillMaxWidth$default(PaddingKt.m1988padding3ABfNKs(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(12))), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceContainerLow(), null, 2, null), C1654Dp.m9788constructorimpl(12)), 0.0f, 1, null);
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            MeasurePolicy measurePolicy$iv2 = measurePolicy$iv;
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(12));
            Composer $composer$iv3 = $composer3;
            int $changed$iv$iv2 = $changed$iv$iv;
            Composer $composer$iv4 = $composer$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer$iv3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer$iv3, -1159599143, str2);
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv3, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer$iv3.getCurrentCompositionLocalMap();
            Composer $composer$iv$iv2 = $composer$iv$iv;
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer$iv3, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = ((((432 << 3) & 112) << 6) & 896) | 6;
            Composer $composer$iv$iv$iv2 = $composer$iv$iv$iv;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, -553112988, str3);
            if (!($composer$iv3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv3.startReusableNode();
            if ($composer$iv3.getInserting()) {
                function03 = constructor2;
                $composer$iv3.createNode(function03);
            } else {
                function03 = constructor2;
                $composer$iv3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer$iv3);
            Composer $composer$iv5 = $composer$iv2;
            Composer $composer4 = $composer3;
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, -910778810, "C161@6205L11,157@6049L201,163@6263L901:MessageBodyCollapsableProgressPanel.kt#ouynps");
            BoxKt.Box(BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(12)), RoundedCornerShapeKt.getCircleShape()), MaterialTheme.INSTANCE.getColorScheme($composer$iv3, MaterialTheme.$stable).getSecondaryContainer(), null, 2, null), $composer$iv3, 0);
            ComposerKt.sourceInformationMarkerStart($composer$iv3, 1341605231, str);
            Modifier modifier$iv3 = Modifier.INSTANCE;
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
            String str5 = str;
            MeasurePolicy measurePolicy$iv4 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, Alignment.INSTANCE.getStart(), $composer$iv3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer$iv3, -1159599143, str2);
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv3, 0));
            CompositionLocalMap localMap$iv$iv4 = $composer$iv3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer$iv3, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = ((((0 << 3) & 112) << 6) & 896) | 6;
            String str6 = str2;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, -553112988, str3);
            if (!($composer$iv3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv3.startReusableNode();
            if ($composer$iv3.getInserting()) {
                function04 = constructor3;
                $composer$iv3.createNode(function04);
            } else {
                function04 = constructor3;
                $composer$iv3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer$iv3);
            String str7 = str3;
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, 2093002350, str4);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i8 = ((0 >> 6) & 112) | 6;
            String str8 = str4;
            ComposerKt.sourceInformationMarkerStart($composer$iv3, -1828550991, "C167@6384L10,165@6312L171:MessageBodyCollapsableProgressPanel.kt#ouynps");
            TextKt.m4781TextNvy7gAk(item.getTitle(), PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(2), 7, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer$iv3, MaterialTheme.$stable).getLabelMedium(), $composer$iv3, 48, 0, 131068);
            if (item.getDescription().length() > 0) {
                $composer$iv3.startReplaceGroup(-1828308820);
                ComposerKt.sourceInformation($composer$iv3, "173@6609L7,180@6902L10,181@6964L11,183@7093L21,178@6820L314");
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart($composer$iv3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = $composer$iv3.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                Density density = (Density) objConsume;
                $composer$iv3.startReplaceGroup(2019235124);
                ComposerKt.sourceInformation($composer$iv3, "*176@6718L10");
                long jM9231getLineHeightXSAIIZE = MaterialTheme.INSTANCE.getTypography($composer$iv3, MaterialTheme.$stable).getLabelMedium().m9231getLineHeightXSAIIZE();
                TextUnitKt.m9995checkArithmeticR2X_6o(jM9231getLineHeightXSAIIZE);
                float maxHeight = density.mo1519toDpGaN1DYA(TextUnitKt.pack(TextUnit.m9980getRawTypeimpl(jM9231getLineHeightXSAIIZE), 5 * TextUnit.m9982getValueimpl(jM9231getLineHeightXSAIIZE)));
                $composer$iv3.endReplaceGroup();
                TextKt.m4781TextNvy7gAk(item.getDescription(), ScrollKt.verticalScroll$default(SizeKt.m2024heightInVpY3zN4$default(Modifier.INSTANCE, 0.0f, maxHeight, 1, null), ScrollKt.rememberScrollState(0, $composer$iv3, 0, 1), false, null, false, 14, null), MaterialTheme.INSTANCE.getColorScheme($composer$iv3, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer$iv3, MaterialTheme.$stable).getBodySmall(), $composer$iv3, 0, 0, 131064);
            } else {
                $composer$iv3.startReplaceGroup(-1834839466);
            }
            $composer$iv3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            $composer$iv3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            $composer$iv3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            i2 = i4;
            it = it2;
            horizontalAlignment$iv = horizontalAlignment$iv2;
            localMap$iv$iv = localMap$iv$iv2;
            measurePolicy$iv = measurePolicy$iv2;
            $changed$iv$iv = $changed$iv$iv2;
            $composer$iv = $composer$iv4;
            $composer$iv$iv = $composer$iv$iv2;
            $composer$iv$iv$iv = $composer$iv$iv$iv2;
            $composer3 = $composer4;
            $composer$iv2 = $composer$iv5;
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
        }
        String str9 = str3;
        Composer $composer$iv6 = $composer$iv;
        Composer $composer$iv$iv$iv3 = $composer$iv$iv$iv;
        String str10 = str2;
        Composer $composer$iv7 = $composer$iv2;
        Composer $composer5 = $composer3;
        Composer $composer$iv$iv3 = $composer$iv$iv;
        $composer5.endReplaceGroup();
        if ($message.getLogMessages().isEmpty()) {
            $composer2 = $composer5;
            $composer2.startReplaceGroup(-2040604806);
        } else {
            $composer2 = $composer5;
            $composer2.startReplaceGroup(-2033409148);
            ComposerKt.sourceInformation($composer2, "191@7246L576");
            Modifier modifier$iv4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment contentAlignment$iv = Alignment.INSTANCE.getBottomEnd();
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv5 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, str10);
            int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv5 = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer2, modifier$iv4);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv4 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, str9);
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function02 = constructor4;
                $composer2.createNode(function02);
            } else {
                function02 = constructor4;
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = ($changed$iv$iv$iv4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i10 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 467361670, "C193@7376L25,192@7340L470:MessageBodyCollapsableProgressPanel.kt#ouynps");
            ComposerKt.sourceInformationMarkerStart($composer2, -1924585760, "CC(remember):MessageBodyCollapsableProgressPanel.kt#9igjgp");
            Object value$iv = $composer2.rememberedValue();
            if (value$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyCollapsableProgressPanelKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MessageBodyCollapsableProgressPanelKt.m499x6a97bc6c($showLogsViewer$delegate);
                    }
                };
                $composer2.updateRememberedValue(value$iv);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ChipKt.AssistChip((Function0<Unit>) value$iv, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$MessageBodyCollapsableProgressPanelKt.INSTANCE.m10944getLambda$633289212$app_debug(), (Modifier) null, false, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$MessageBodyCollapsableProgressPanelKt.INSTANCE.m10945getLambda$846845791$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Shape) null, (ChipColors) null, (ChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, $composer2, 24630, 0, 2028);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
        }
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer$iv7);
        $composer$iv$iv$iv3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv3);
        ComposerKt.sourceInformationMarkerEnd($composer$iv$iv3);
        ComposerKt.sourceInformationMarkerEnd($composer$iv6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: MessageBodyCollapsableProgressPanel$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19 */
    public static final Unit m499x6a97bc6c(MutableState $showLogsViewer$delegate) {
        MessageBodyCollapsableProgressPanel$lambda$5($showLogsViewer$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyCollapsableProgressPanel$lambda$26$lambda$25(MutableState $showLogsViewer$delegate) {
        MessageBodyCollapsableProgressPanel$lambda$5($showLogsViewer$delegate, false);
        return Unit.INSTANCE;
    }
}
