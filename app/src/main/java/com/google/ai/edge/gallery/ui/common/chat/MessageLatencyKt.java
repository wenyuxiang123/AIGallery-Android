package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.AlphaKt;
import androidx.compose.p000ui.platform.TestTagKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.ai.edge.gallery.ui.common.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class MessageLatencyKt {
    
    public static final Unit LatencyText$lambda$0(ChatMessage chatMessage, int i, Composer composer, int i2) {
        LatencyText(chatMessage, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void LatencyText(final ChatMessage message, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer $composer3 = $composer.startRestartGroup(-453607403);
        ComposerKt.sourceInformation($composer3, "C(LatencyText):MessageLatency.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(message) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-453607403, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.LatencyText (MessageLatency.kt:31)");
            }
            if (message.getLatencyMs() >= 0.0f) {
                $composer3.startReplaceGroup(-1450942476);
                ComposerKt.sourceInformation($composer3, "36@1393L10,33@1246L175");
                TextKt.m4781TextNvy7gAk(UtilsKt.humanReadableDuration(message.getLatencyMs()), TestTagKt.testTag(AlphaKt.alpha(Modifier.INSTANCE, 0.5f), "latency_label"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelSmall(), $composer3, 48, 0, 131068);
                $composer3.endReplaceGroup();
                $composer2 = $composer3;
            } else {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-1452179283);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageLatencyKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageLatencyKt.LatencyText$lambda$0(message, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
