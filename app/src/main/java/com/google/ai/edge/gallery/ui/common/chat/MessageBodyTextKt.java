package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.semantics.LiveRegionMode;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.ui.common.MarkdownTextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class MessageBodyTextKt {
    
    public static final Unit MessageBodyText$lambda$5(ChatMessageText chatMessageText, boolean z, int i, Composer composer, int i2) {
        MessageBodyText(chatMessageText, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MessageBodyText(final ChatMessageText message, final boolean inProgress, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(message, "message");
        Composer $composer2 = $composer.startRestartGroup(1238678168);
        ComposerKt.sourceInformation($composer2, "C(MessageBodyText)P(1)40@1644L1223,40@1625L1242:MessageBodyText.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(message) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(inProgress) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1238678168, $dirty, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyText (MessageBodyText.kt:39)");
            }
            SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(1865040213, true, new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyTextKt.MessageBodyText$lambda$4(message, inProgress, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyTextKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyTextKt.MessageBodyText$lambda$5(message, inProgress, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    
    public static final Unit MessageBodyText$lambda$4(ChatMessageText $message, final boolean $inProgress, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:MessageBodyText.kt#ouynps");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1865040213, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyText.<anonymous> (MessageBodyText.kt:41)");
            }
            if ($message.getSide() == ChatSide.USER) {
                $composer.startReplaceGroup(1716090588);
                ComposerKt.sourceInformation($composer, "42@1693L163");
                MarkdownTextKt.m10879MarkdownTextjA1GFJw($message.getContent(), PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(12)), false, Color.INSTANCE.m6952getWhite0d7_KjU(), Color.INSTANCE.m6952getWhite0d7_KjU(), $composer, 27696, 4);
                $composer.endReplaceGroup();
            } else if ($message.getSide() == ChatSide.AGENT) {
                $composer.startReplaceGroup(1716332078);
                ComposerKt.sourceInformation($composer, "49@1929L47");
                final String cdResponse = StringResources_androidKt.stringResource(C2421R.string.cd_model_response_text, $composer, 0);
                if ($message.getIsMarkdown()) {
                    $composer.startReplaceGroup(1716416522);
                    ComposerKt.sourceInformation($composer, "54@2157L218,51@2017L369");
                    String content = $message.getContent();
                    Modifier modifierM1988padding3ABfNKs = PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(12));
                    ComposerKt.sourceInformationMarkerStart($composer, 1302298895, "CC(remember):MessageBodyText.kt#9igjgp");
                    boolean invalid$iv = $composer.changed(cdResponse) | $composer.changed($inProgress);
                    Object it$iv = $composer.rememberedValue();
                    if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                        Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyTextKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MessageBodyTextKt.MessageBodyText$lambda$4$lambda$1$lambda$0(cdResponse, $inProgress, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        $composer.updateRememberedValue(value$iv);
                        it$iv = value$iv;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    MarkdownTextKt.m10879MarkdownTextjA1GFJw(content, SemanticsModifierKt.semantics(modifierM1988padding3ABfNKs, true, (Function1) it$iv), false, 0L, 0L, $composer, 0, 28);
                    $composer.endReplaceGroup();
                } else {
                    $composer.startReplaceGroup(1716808548);
                    ComposerKt.sourceInformation($composer, "65@2475L10,66@2530L11,68@2620L218,63@2410L439");
                    String content2 = $message.getContent();
                    TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium();
                    long onSurface = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface();
                    Modifier modifierM1988padding3ABfNKs2 = PaddingKt.m1988padding3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(12));
                    ComposerKt.sourceInformationMarkerStart($composer, 1302313711, "CC(remember):MessageBodyText.kt#9igjgp");
                    boolean invalid$iv2 = $composer.changed(cdResponse) | $composer.changed($inProgress);
                    Object it$iv2 = $composer.rememberedValue();
                    if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                        Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyTextKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return MessageBodyTextKt.MessageBodyText$lambda$4$lambda$3$lambda$2(cdResponse, $inProgress, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        $composer.updateRememberedValue(value$iv2);
                        it$iv2 = value$iv2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    TextKt.m4781TextNvy7gAk(content2, SemanticsModifierKt.semantics$default(modifierM1988padding3ABfNKs2, false, (Function1) it$iv2, 1, null), onSurface, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyMedium, $composer, 0, 0, 131064);
                    $composer.endReplaceGroup();
                }
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1714412589);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit MessageBodyText$lambda$4$lambda$1$lambda$0(String $cdResponse, boolean $inProgress, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, $cdResponse);
        if (!$inProgress) {
            SemanticsPropertiesKt.m8951setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m8925getPolite0phEisY());
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit MessageBodyText$lambda$4$lambda$3$lambda$2(String $cdResponse, boolean $inProgress, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, $cdResponse);
        if (!$inProgress) {
            SemanticsPropertiesKt.m8951setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m8925getPolite0phEisY());
        }
        return Unit.INSTANCE;
    }
}
