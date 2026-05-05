package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.platform.WindowInfo;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.SpanStyle;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.data.Config;
import com.google.ai.edge.gallery.data.ConfigKt;
import com.google.ai.edge.gallery.ui.theme.TypeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class MessageBodyConfigUpdateKt {
    
    public static final Unit MessageBodyConfigUpdate$lambda$15(ChatMessageConfigValuesChange chatMessageConfigValuesChange, int i, Composer composer, int i2) {
        MessageBodyConfigUpdate(chatMessageConfigValuesChange, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public static final void MessageBodyConfigUpdate(final ChatMessageConfigValuesChange message, Composer $composer, final int $changed) {
        Composer $composer2;
        Density density;
        Object element$iv;
        WindowInfo windowInfo;
        int $i$f$cache;
        Object it$iv;
        int i;
        ConfigRowData configRowData;
        Function0<ComposeUiNode> function0;
        Composer $composer$iv$iv;
        Function0<ComposeUiNode> function02;
        Composer $composer$iv$iv2;
        Function0<ComposeUiNode> function03;
        Composer $composer$iv$iv$iv;
        Function0<ComposeUiNode> function04;
        Function0<ComposeUiNode> function05;
        Function0<ComposeUiNode> function06;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer $composer3 = $composer.startRestartGroup(-1789069391);
        ComposerKt.sourceInformation($composer3, "C(MessageBodyConfigUpdate)64@2585L7,65@2628L7,66@2658L68,69@2751L928,95@3683L2104:MessageBodyConfigUpdate.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(message) ? 4 : 2;
        }
        if ($composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1789069391, $dirty, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyConfigUpdate (MessageBodyConfigUpdate.kt:63)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Density density2 = (Density) objConsume;
            ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localWindowInfo);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            WindowInfo windowInfo2 = (WindowInfo) objConsume2;
            ComposerKt.sourceInformationMarkerStart($composer3, -1308760395, "CC(remember):MessageBodyConfigUpdate.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv = C1654Dp.m9786boximpl(density2.mo1521toDpu2uoSUM((int) (windowInfo2.mo8878getContainerSizeYbymL2g() >> 32)));
                $composer3.updateRememberedValue(value$iv);
                it$iv2 = value$iv;
            }
            float screenWidthDp = ((C1654Dp) it$iv2).m9802unboximpl();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1308756559, "CC(remember):MessageBodyConfigUpdate.kt#9igjgp");
            boolean invalid$iv = $composer3.changed(message);
            int $i$f$cache2 = 0;
            Object it$iv3 = $composer3.rememberedValue();
            int i2 = 0;
            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Iterable commonKeys = CollectionsKt.intersect(message.getOldValues().keySet(), message.getNewValues().keySet());
                Iterable $this$mapNotNull$iv = commonKeys;
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                    int $dirty2 = $dirty;
                    String key = (String) element$iv$iv$iv;
                    Iterable $this$firstOrNull$iv = message.getModel().getConfigs();
                    Iterator it = $this$firstOrNull$iv.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            density = density2;
                            element$iv = null;
                            break;
                        }
                        element$iv = it.next();
                        Config it2 = (Config) element$iv;
                        density = density2;
                        if (Intrinsics.areEqual(it2.getKey().getLabel(), key)) {
                            break;
                        } else {
                            density2 = density;
                        }
                    }
                    Config config = (Config) element$iv;
                    if (config == null) {
                        windowInfo = windowInfo2;
                        $i$f$cache = $i$f$cache2;
                        it$iv = it$iv3;
                        i = i2;
                        configRowData = null;
                    } else {
                        windowInfo = windowInfo2;
                        $i$f$cache = $i$f$cache2;
                        Object oldValue = ConfigKt.convertValueToTargetType(MapsKt.getValue(message.getOldValues(), key), config.getValueType());
                        it$iv = it$iv3;
                        Object newValue = ConfigKt.convertValueToTargetType(MapsKt.getValue(message.getNewValues(), key), config.getValueType());
                        boolean isChanged = !Intrinsics.areEqual(oldValue, newValue);
                        i = i2;
                        String oldValueDisplay = ConfigKt.getConfigValueString(oldValue, config);
                        String newValueDisplay = ConfigKt.getConfigValueString(newValue, config);
                        configRowData = new ConfigRowData(key, oldValueDisplay, newValueDisplay, isChanged);
                    }
                    if (configRowData != null) {
                        destination$iv$iv.add(configRowData);
                    }
                    $dirty = $dirty2;
                    windowInfo2 = windowInfo;
                    $i$f$cache2 = $i$f$cache;
                    it$iv3 = it$iv;
                    i2 = i;
                    density2 = density;
                }
                Object value$iv2 = (List) destination$iv$iv;
                $composer3.updateRememberedValue(value$iv2);
                it$iv3 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            List configRows = (List) it$iv3;
            Modifier modifier$iv = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getTop();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            int $changed$iv$iv = (54 << 3) & 112;
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
            int i3 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1926070596, "C99@3879L11,96@3773L2010:MessageBodyConfigUpdate.kt#ouynps");
            Modifier modifier$iv2 = BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(4))), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getTertiaryContainer(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv2 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
            $composer2 = $composer3;
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer$iv$iv = $composer3;
                function02 = constructor2;
                $composer3.createNode(function02);
            } else {
                $composer$iv$iv = $composer3;
                function02 = constructor2;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1296943745, "C101@3924L1853:MessageBodyConfigUpdate.kt#ouynps");
            Modifier modifier$iv3 = PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            int $changed$iv$iv3 = (6 << 3) & 112;
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
                $composer$iv$iv2 = $composer3;
                function03 = constructor3;
                $composer3.createNode(function03);
            } else {
                $composer$iv$iv2 = $composer3;
                function03 = constructor3;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = ($changed$iv$iv$iv3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i8 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1346597251, "C105@4061L11,103@3994L141,109@4145L1624:MessageBodyConfigUpdate.kt#ouynps");
            TextKt.m4781TextNvy7gAk("Configs updated", null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnTertiaryContainer(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getTitleSmaller(), $composer3, 6, 12582912, 131066);
            Modifier modifier$iv4 = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(8), 0.0f, 0.0f, 13, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.getStart();
            Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getTop();
            MeasurePolicy measurePolicy$iv4 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer3, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            int $changed$iv$iv4 = (6 << 3) & 112;
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
                $composer$iv$iv$iv = $composer3;
                function04 = constructor4;
                $composer3.createNode(function04);
            } else {
                $composer$iv$iv$iv = $composer3;
                function04 = constructor4;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = ($changed$iv$iv$iv4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i10 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -141612525, "C111@4220L379,123@4611L39,126@4682L1077:MessageBodyConfigUpdate.kt#ouynps");
            float screenWidthDp2 = 2;
            Modifier modifier$iv5 = SizeKt.m2043widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(screenWidthDp / screenWidthDp2), 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv5 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer3, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            int $changed$iv$iv5 = (6 << 3) & 112;
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
            int i11 = ($changed$iv$iv$iv5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i12 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -472178808, "C:MessageBodyConfigUpdate.kt#ouynps");
            $composer3.startReplaceGroup(1647336411);
            ComposerKt.sourceInformation($composer3, "*113@4339L234");
            for (Iterator it3 = configRows.iterator(); it3.hasNext(); it3 = it3) {
                TextKt.m4781TextNvy7gAk(((ConfigRowData) it3.next()).getLabel() + ":", AlphaKt.alpha(Modifier.INSTANCE, 0.6f), 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m9686getMiddleEllipsisgIe3tQ8(), false, 1, 0, null, TypeKt.getBodySmallNarrow(), $composer3, 48, 12607872, 110588);
            }
            $composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(4)), $composer3, 6);
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv6 = Modifier.INSTANCE;
            Arrangement.Vertical verticalArrangement$iv3 = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv3 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv6 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv3, horizontalAlignment$iv3, $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv6 = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv6 = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv6 = ComposedModifierKt.materializeModifier($composer3, modifier$iv6);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv6 = (($changed$iv$iv6 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function06 = constructor6;
                $composer3.createNode(function06);
            } else {
                function06 = constructor6;
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv6 = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, measurePolicy$iv6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, localMap$iv$iv6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv6, Integer.valueOf(compositeKeyHash$iv$iv6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, materialized$iv$iv6, ComposeUiNode.INSTANCE.getSetModifier());
            int i13 = ($changed$iv$iv$iv6 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int $changed2 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -888897457, "C:MessageBodyConfigUpdate.kt#ouynps");
            $composer3.startReplaceGroup(-444316108);
            ComposerKt.sourceInformation($composer3, "");
            Iterator it4 = configRows.iterator();
            while (it4.hasNext()) {
                ConfigRowData rowData = (ConfigRowData) it4.next();
                if (rowData.isChanged()) {
                    Iterator it5 = it4;
                    $composer3.startReplaceGroup(-888728756);
                    ComposerKt.sourceInformation($composer3, "148@5662L55");
                    $composer3.startReplaceGroup(-444309514);
                    ComposerKt.sourceInformation($composer3, "*143@5513L11");
                    List configRows2 = configRows;
                    int compositeKeyHash$iv$iv7 = compositeKeyHash$iv$iv6;
                    Modifier materialized$iv$iv7 = materialized$iv$iv6;
                    AnnotatedString.Builder $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249 = new AnnotatedString.Builder(0, 1, null);
                    SpanStyle style$iv = TypeKt.getBodySmallNarrow().toSpanStyle();
                    int index$iv = $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.pushStyle(style$iv);
                    try {
                        int $changed3 = $changed2;
                        try {
                            $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.append(rowData.getOldValueDisplay());
                            Unit unit = Unit.INSTANCE;
                            $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.pop(index$iv);
                            SpanStyle style$iv2 = TextStyle.m9205copyp1EtxEg$default(TypeKt.getBodySmallNarrow(), 0L, TextUnitKt.getSp(12), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null).toSpanStyle();
                            int index$iv2 = $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.pushStyle(style$iv2);
                            try {
                                $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.append(" ▸ ");
                                Unit unit2 = Unit.INSTANCE;
                                $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.pop(index$iv2);
                                SpanStyle style$iv3 = SpanStyle.m9123copyGSF8kmg$default(TextStyle.m9205copyp1EtxEg$default(TypeKt.getBodySmallNarrow(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null).toSpanStyle(), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null);
                                int index$iv3 = $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.pushStyle(style$iv3);
                                try {
                                    try {
                                        $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.append(rowData.getNewValueDisplay());
                                        Unit unit3 = Unit.INSTANCE;
                                        $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.pop(index$iv3);
                                        AnnotatedString annotatedString = $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.toAnnotatedString();
                                        $composer3.endReplaceGroup();
                                        TextKt.m4782TextZ58ophY(annotatedString, null, 0L, null, 0L, null, null, null, 0L, null, null, TextUnitKt.getSp(12), 0, false, 1, 0, null, null, null, $composer3, 0, 24624, 505854);
                                        $composer3.endReplaceGroup();
                                        compositeKeyHash$iv$iv6 = compositeKeyHash$iv$iv7;
                                        materialized$iv$iv6 = materialized$iv$iv7;
                                        it4 = it5;
                                        configRows = configRows2;
                                        $changed2 = $changed3;
                                    } catch (Throwable th) {
                                        th = th;
                                        $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.pop(index$iv3);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.pop(index$iv3);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.pop(index$iv2);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            $this$MessageBodyConfigUpdate_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.pop(index$iv);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } else {
                    $composer3.startReplaceGroup(-888859204);
                    ComposerKt.sourceInformation($composer3, "129@4789L68");
                    TextKt.m4781TextNvy7gAk(rowData.getNewValueDisplay(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, TypeKt.getBodySmallNarrow(), $composer3, 0, 12607488, 114686);
                    $composer3.endReplaceGroup();
                    it4 = it4;
                }
            }
            $composer3.endReplaceGroup();
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
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer$iv$iv$iv.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyConfigUpdateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyConfigUpdateKt.MessageBodyConfigUpdate$lambda$15(message, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
