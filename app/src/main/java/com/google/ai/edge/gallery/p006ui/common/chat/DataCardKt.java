package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
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
import androidx.compose.runtime.Updater;
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.p006ui.theme.ThemeKt;
import com.google.ai.edge.gallery.p006ui.theme.TypeKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataCard.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m922d2 = {"DataCard", "", Constants.ScionAnalytics.PARAM_LABEL, "", "value", "", "unit", "highlight", "", "showPlaceholder", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V", "DataCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class DataCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataCard$lambda$3(String str, Float f, String str2, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        DataCard(str, f, str2, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataCardPreview$lambda$4(int i, Composer composer, int i2) {
        DataCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DataCard(final String label, final Float value, final String unit, boolean highlight, boolean showPlaceholder, Composer $composer, final int $changed, final int i) {
        boolean z;
        boolean z2;
        Composer $composer2;
        boolean highlight2;
        boolean showPlaceholder2;
        Composer $composer3;
        int i2;
        String str;
        Object strValue;
        Composer $composer4;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Composer $composer5 = $composer.startRestartGroup(1987605186);
        ComposerKt.sourceInformation($composer5, "C(DataCard)P(1,4,3)53@2095L27,53@2058L608:DataCard.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer5.changed(label) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer5.changed(value) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer5.changed(unit) ? 256 : 128;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            z = highlight;
        } else if (($changed & 3072) == 0) {
            z = highlight;
            $dirty |= $composer5.changed(z) ? 2048 : 1024;
        } else {
            z = highlight;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            z2 = showPlaceholder;
        } else if (($changed & 24576) == 0) {
            z2 = showPlaceholder;
            $dirty |= $composer5.changed(z2) ? 16384 : 8192;
        } else {
            z2 = showPlaceholder;
        }
        int $dirty2 = $dirty;
        if ($composer5.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            if (i3 != 0) {
                highlight2 = false;
            } else {
                highlight2 = z;
            }
            if (i4 == 0) {
                showPlaceholder2 = z2;
            } else {
                showPlaceholder2 = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1987605186, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.DataCard (DataCard.kt:51)");
            }
            Object strValue2 = Modifier.INSTANCE;
            Modifier.Companion companion = (Modifier) strValue2;
            ComposerKt.sourceInformationMarkerStart($composer5, -1171856355, "CC(remember):DataCard.kt#9igjgp");
            Object it$iv = $composer5.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.DataCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DataCardKt.DataCard$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                    }
                };
                $composer5.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            Modifier modifier$iv = SemanticsModifierKt.semantics$default(companion, false, (Function1) it$iv, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer5, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer5, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer5, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer5, 0));
            CompositionLocalMap localMap$iv$iv = $composer5.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer5, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer5, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer5.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer5.startReusableNode();
            if ($composer5.getInserting()) {
                $composer5.createNode(constructor);
            } else {
                $composer5.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer5);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer5, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer5, -346624861, "C54@2130L43:DataCard.kt#ouynps");
            $composer2 = $composer5;
            TextKt.m4781TextNvy7gAk(label, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getLabelSmallNarrowMedium(), $composer5, $dirty2 & 14, 12582912, 131070);
            if (showPlaceholder2) {
                $composer3 = $composer5;
                $composer3.startReplaceGroup(-346571232);
                ComposerKt.sourceInformation($composer3, "56@2207L40");
                TextKt.m4781TextNvy7gAk("-", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getBodySmallMediumNarrow(), $composer3, 6, 12582912, 131070);
                $composer3.endReplaceGroup();
                strValue = "-";
                i2 = 1;
            } else {
                $composer3 = $composer5;
                $composer3.startReplaceGroup(-346504892);
                ComposerKt.sourceInformation($composer3, "");
                if (value == null) {
                    str = "-";
                    i2 = 1;
                } else {
                    i2 = 1;
                    String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{value}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    str = str2;
                }
                if (highlight2) {
                    $composer3.startReplaceGroup(-346421688);
                    ComposerKt.sourceInformation($composer3, "60@2430L11,60@2358L92");
                    TextKt.m4781TextNvy7gAk(str, null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getBodySmallMediumNarrowBold(), $composer3, 0, 12582912, 131066);
                    $composer3.endReplaceGroup();
                } else {
                    $composer3.startReplaceGroup(-346308073);
                    ComposerKt.sourceInformation($composer3, "62@2474L45");
                    TextKt.m4781TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getBodySmallMediumNarrow(), $composer3, 0, 12582912, 131070);
                    $composer3.endReplaceGroup();
                }
                $composer3.endReplaceGroup();
                strValue = str;
            }
            if (Intrinsics.areEqual(strValue, "-")) {
                $composer4 = $composer3;
                $composer4.startReplaceGroup(-348755306);
                $composer4.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(-346212593);
                ComposerKt.sourceInformation($composer3, "66@2567L89");
                Composer $composer6 = $composer3;
                TextKt.m4781TextNvy7gAk(unit, OffsetKt.m1945offsetVpY3zN4$default(AlphaKt.alpha(Modifier.INSTANCE, 0.5f), 0.0f, C1654Dp.m9788constructorimpl(-1), i2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getLabelSmallNarrow(), $composer6, (($dirty2 >> 6) & 14) | 48, 12582912, 131068);
                $composer6.endReplaceGroup();
                $composer4 = $composer6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            $composer5.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer5;
            $composer2.skipToGroupEnd();
            highlight2 = z;
            showPlaceholder2 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z3 = highlight2;
            final boolean z4 = showPlaceholder2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.DataCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DataCardKt.DataCard$lambda$3(label, value, unit, z3, z4, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DataCard$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTraversalGroup(semantics, true);
        return Unit.INSTANCE;
    }

    public static final void DataCardPreview(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(957761398);
        ComposerKt.sourceInformation($composer2, "C(DataCardPreview)74@2740L581:DataCard.kt#ouynps");
        if (!$composer2.shouldExecute($changed != 0, $changed & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(957761398, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.DataCardPreview (DataCard.kt:73)");
            }
            ThemeKt.GalleryTheme(ComposableSingletons$DataCardKt.INSTANCE.m10936getLambda$560441134$app_debug(), $composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.DataCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DataCardKt.DataCardPreview$lambda$4($changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
