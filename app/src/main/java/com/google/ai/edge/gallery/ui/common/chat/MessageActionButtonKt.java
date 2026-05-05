package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
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
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.ui.theme.TypeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class MessageActionButtonKt {
    
    public static final Unit MessageActionButton$lambda$3(String str, ImageVector imageVector, Function0 function0, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        MessageActionButton(str, imageVector, function0, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MessageActionButton(final String label, final ImageVector icon, final Function0<Unit> onClick, Modifier modifier, boolean enabled, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean enabled2;
        Composer $composer2;
        Modifier modifier3;
        long j;
        Modifier modifierM1401clickableoSLSa3U;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(-653554866);
        ComposerKt.sourceInformation($composer3, "C(MessageActionButton)P(2,1,4,3)57@2090L499:MessageActionButton.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(label) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(icon) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty |= 24576;
            enabled2 = enabled;
        } else if (($changed & 24576) == 0) {
            enabled2 = enabled;
            $dirty |= $composer3.changed(enabled2) ? 16384 : 8192;
        } else {
            enabled2 = enabled;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            boolean enabled3 = i3 != 0 ? true : enabled2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-653554866, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageActionButton (MessageActionButton.kt:47)");
            }
            Modifier modifierClip = ClipKt.clip(PaddingKt.m1992paddingqDBjuR0$default(modifier3, 0.0f, C1654Dp.m9788constructorimpl(4), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.getCircleShape());
            if (enabled3) {
                $composer3.startReplaceGroup(-1000990976);
                ComposerKt.sourceInformation($composer3, "53@1940L11");
                long secondaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSecondaryContainer();
                $composer3.endReplaceGroup();
                j = secondaryContainer;
            } else {
                $composer3.startReplaceGroup(-1000989118);
                ComposerKt.sourceInformation($composer3, "54@1998L11");
                long surfaceContainerHigh = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceContainerHigh();
                $composer3.endReplaceGroup();
                j = surfaceContainerHigh;
            }
            Modifier curModifier = BackgroundKt.m1359backgroundbw27NRU$default(modifierClip, j, null, 2, null);
            float alpha = enabled3 ? 1.0f : 0.3f;
            if (enabled3) {
                $composer3.startReplaceGroup(-1000985115);
                ComposerKt.sourceInformation($composer3, "58@2145L13");
                ComposerKt.sourceInformationMarkerStart($composer3, -1000984805, "CC(remember):MessageActionButton.kt#9igjgp");
                boolean invalid$iv = ($dirty2 & 896) == 256;
                Object it$iv = $composer3.rememberedValue();
                if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageActionButtonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageActionButtonKt.MessageActionButton$lambda$1$lambda$0(onClick);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                modifierM1401clickableoSLSa3U = ClickableKt.m1401clickableoSLSa3U(curModifier, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(-1000984202);
                $composer3.endReplaceGroup();
                modifierM1401clickableoSLSa3U = modifier3;
            }
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            Modifier modifier$iv = modifierM1401clickableoSLSa3U;
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            int $changed$iv$iv = (384 << 3) & 112;
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
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer3);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i5 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 611581148, "C61@2236L125,68@2413L11,66@2366L219:MessageActionButton.kt#ouynps");
            IconKt.m4075Iconww6aTOc(icon, (String) null, AlphaKt.alpha(OffsetKt.m1945offsetVpY3zN4$default(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(16)), C1654Dp.m9788constructorimpl(6), 0.0f, 2, null), alpha), 0L, $composer3, (($dirty2 >> 3) & 14) | 48, 8);
            $composer2 = $composer3;
            TextKt.m4781TextNvy7gAk(label, AlphaKt.alpha(PaddingKt.m1991paddingqDBjuR0(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(10), C1654Dp.m9788constructorimpl(4), C1654Dp.m9788constructorimpl(8), C1654Dp.m9788constructorimpl(4)), alpha), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSecondaryContainer(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getBodySmallNarrow(), $composer3, $dirty2 & 14, 12582912, 131064);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            enabled2 = enabled3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            final boolean z = enabled2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageActionButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageActionButtonKt.MessageActionButton$lambda$3(label, icon, onClick, modifier4, z, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    
    public static final Unit MessageActionButton$lambda$1$lambda$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }
}
