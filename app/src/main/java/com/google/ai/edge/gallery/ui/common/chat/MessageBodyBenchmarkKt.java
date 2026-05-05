package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class MessageBodyBenchmarkKt {
    private static final float DEFAULT_HISTOGRAM_BAR_HEIGHT = 50.0f;

    
    public static final Unit MessageBodyBenchmark$lambda$4(ChatMessageBenchmarkResult chatMessageBenchmarkResult, int i, Composer composer, int i2) {
        MessageBodyBenchmark(chatMessageBenchmarkResult, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MessageBodyBenchmark(final ChatMessageBenchmarkResult message, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Composer $composer3;
        Function0<ComposeUiNode> function03;
        float alpha;
        Function0<ComposeUiNode> function04;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer $composer4 = $composer.startRestartGroup(-1702473371);
        ComposerKt.sourceInformation($composer4, "C(MessageBodyBenchmark)48@1887L1855:MessageBodyBenchmark.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer4.changedInstance(message) ? 4 : 2;
        }
        if ($composer4.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1702473371, $dirty, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyBenchmark (MessageBodyBenchmark.kt:47)");
            }
            Modifier modifier$iv = SizeKt.fillMaxWidth$default(PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(12)), 0.0f, 1, null);
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            String str = "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart($composer4, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer4, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            int $changed$iv$iv = (54 << 3) & 112;
            String str2 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart($composer4, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer4, 0));
            CompositionLocalMap localMap$iv$iv = $composer4.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer4, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            String str3 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart($composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer4.startReusableNode();
            if ($composer4.getInserting()) {
                function0 = constructor;
                $composer4.createNode(function0);
            } else {
                function0 = constructor;
                $composer4.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer4);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer4, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((54 >> 6) & 112) | 6;
            Composer $composer5 = $composer4;
            ComposerKt.sourceInformationMarkerStart($composer5, 1121158687, "C53@2033L388:MessageBodyBenchmark.kt#ouynps");
            Modifier modifier$iv2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer5, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
            $composer2 = $composer4;
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer5, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            int $changed$iv$iv2 = (54 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer5, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer5, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer5.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer5, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer5, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer5.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer5.startReusableNode();
            if ($composer5.getInserting()) {
                function02 = constructor2;
                $composer5.createNode(function02);
            } else {
                function02 = constructor2;
                $composer5.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer5);
            String str4 = "C89@4557L9:Column.kt#2w3rfo";
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer5, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer5, -1349301176, "C:MessageBodyBenchmark.kt#ouynps");
            $composer5.startReplaceGroup(-597715173);
            ComposerKt.sourceInformation($composer5, "*55@2176L231");
            Iterator<Stat> it = message.getOrderedStats().iterator();
            while (it.hasNext()) {
                Stat stat = it.next();
                DataCardKt.DataCard(stat.getLabel(), message.getStatValues().get(stat.getId()), stat.getUnit(), Intrinsics.areEqual(stat.getId(), message.getHighlightStat()), message.isWarmingUp(), $composer5, 0, 0);
                it = it;
                $changed$iv$iv$iv2 = $changed$iv$iv$iv2;
            }
            $composer5.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            $composer5.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            if (message.getHistogram().getBuckets().isEmpty()) {
                $composer3 = $composer5;
                $composer3.startReplaceGroup(1119088103);
                $composer3.endReplaceGroup();
            } else {
                $composer5.startReplaceGroup(1121595941);
                ComposerKt.sourceInformation($composer5, "67@2496L1236");
                Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(2));
                Composer $composer$iv = $composer5;
                ComposerKt.sourceInformationMarkerStart($composer$iv, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier modifier$iv3 = Modifier.INSTANCE;
                Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer$iv, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                int $changed$iv$iv3 = (48 << 3) & 112;
                MeasurePolicy measurePolicy$iv$iv = measurePolicy$iv3;
                int $i$f$Layout = 0;
                ComposerKt.sourceInformationMarkerStart($composer$iv, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv, 0));
                CompositionLocalMap localMap$iv$iv3 = $composer$iv.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer$iv, modifier$iv3);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer$iv.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv.startReusableNode();
                if ($composer$iv.getInserting()) {
                    function03 = constructor3;
                    $composer$iv.createNode(function03);
                } else {
                    function03 = constructor3;
                    $composer$iv.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer$iv);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
                int i6 = 0;
                ComposerKt.sourceInformationMarkerStart($composer$iv, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i7 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer$iv, 217056223, "C:MessageBodyBenchmark.kt#ouynps");
                $composer$iv.startReplaceGroup(-1655566172);
                ComposerKt.sourceInformation($composer$iv, "*69@2667L11,79@2987L727");
                Iterator it2 = message.getHistogram().getBuckets().iterator();
                int i8 = 0;
                while (it2.hasNext()) {
                    int index = i8;
                    int i9 = i8 + 1;
                    Iterator it3 = it2;
                    int count = ((Number) it2.next()).intValue();
                    Modifier materialized$iv$iv4 = materialized$iv$iv3;
                    long barBgColor = MaterialTheme.INSTANCE.getColorScheme($composer$iv, MaterialTheme.$stable).getOnSurfaceVariant();
                    float alpha2 = count != 0 ? 0.5f : 0.3f;
                    float alpha3 = alpha2;
                    if (index == message.getHistogram().getHighlightBucketIndex()) {
                        $composer$iv.startReplaceGroup(217309895);
                        ComposerKt.sourceInformation($composer$iv, "75@2892L11");
                        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                        int index2 = MaterialTheme.$stable;
                        barBgColor = materialTheme.getColorScheme($composer$iv, index2).getPrimary();
                        alpha = 0.8f;
                        $composer$iv.endReplaceGroup();
                    } else {
                        $composer$iv.startReplaceGroup(214477704);
                        $composer$iv.endReplaceGroup();
                        alpha = alpha3;
                    }
                    int $changed$iv$iv$iv4 = $changed$iv$iv$iv3;
                    int i10 = i6;
                    Modifier modifier$iv4 = SizeKt.m2041width3ABfNKs(SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(50.0f)), C1654Dp.m9788constructorimpl(4));
                    Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getBottom();
                    MeasurePolicy measurePolicy$iv$iv2 = measurePolicy$iv$iv;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, 1341605231, str);
                    Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
                    int $i$f$Layout2 = $i$f$Layout;
                    int $i$f$Layout3 = ((54 >> 3) & 14) | ((54 >> 3) & 112);
                    MeasurePolicy measurePolicy$iv4 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer$iv, $i$f$Layout3);
                    int $changed$iv$iv4 = (54 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, -1159599143, str2);
                    int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv, 0));
                    String str5 = str2;
                    CompositionLocalMap localMap$iv$iv4 = $composer$iv.getCurrentCompositionLocalMap();
                    Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer$iv, modifier$iv4);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv5 = (($changed$iv$iv4 << 6) & 896) | 6;
                    Composer $composer6 = $composer5;
                    String str6 = str;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, -553112988, str3);
                    if (!($composer$iv.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer$iv.startReusableNode();
                    if ($composer$iv.getInserting()) {
                        function04 = constructor4;
                        $composer$iv.createNode(function04);
                    } else {
                        function04 = constructor4;
                        $composer$iv.useNode();
                    }
                    String str7 = str3;
                    Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer$iv);
                    Composer $composer$iv2 = $composer$iv;
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
                    int i11 = ($changed$iv$iv$iv5 >> 6) & 14;
                    String str8 = str4;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, 2093002350, str8);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i12 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv, 75481858, "C84@3188L514:MessageBodyBenchmark.kt#ouynps");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float $this$dp$iv = Math.max(1.0f, (count / message.getHistogram().getMaxCount()) * 50.0f);
                    BoxKt.Box(BackgroundKt.m1359backgroundbw27NRU$default(AlphaKt.alpha(ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m2022height3ABfNKs(companion, C1654Dp.m9788constructorimpl($this$dp$iv)), 0.0f, 1, null), RoundedCornerShapeKt.m2344RoundedCornerShapea9UjIt4(C1654Dp.m9788constructorimpl(20), C1654Dp.m9788constructorimpl(20), C1654Dp.m9788constructorimpl(0), C1654Dp.m9788constructorimpl(0))), alpha), barBgColor, null, 2, null), $composer$iv, 0);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv);
                    $composer$iv.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer$iv);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv);
                    measurePolicy$iv$iv = measurePolicy$iv$iv2;
                    $composer5 = $composer6;
                    i8 = i9;
                    it2 = it3;
                    materialized$iv$iv3 = materialized$iv$iv4;
                    $changed$iv$iv$iv3 = $changed$iv$iv$iv4;
                    i6 = i10;
                    $i$f$Layout = $i$f$Layout2;
                    str2 = str5;
                    str3 = str7;
                    str = str6;
                    $composer$iv = $composer$iv2;
                    str4 = str8;
                }
                Composer $composer7 = $composer5;
                $composer$iv.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                $composer$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                $composer7.endReplaceGroup();
                $composer3 = $composer7;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            $composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyBenchmarkKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyBenchmarkKt.MessageBodyBenchmark$lambda$4(message, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
