package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBodyAudioClip.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m922d2 = {"MessageBodyAudioClip", "", "message", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageAudioClip;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageAudioClip;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MessageBodyAudioClipKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyAudioClip$lambda$0(ChatMessageAudioClip chatMessageAudioClip, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MessageBodyAudioClip(chatMessageAudioClip, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MessageBodyAudioClip(final ChatMessageAudioClip message, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer $composer2 = $composer.startRestartGroup(1949832090);
        ComposerKt.sourceInformation($composer2, "C(MessageBodyAudioClip)25@914L187:MessageBodyAudioClip.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(message) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            modifier2 = (i & 2) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949832090, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyAudioClip (MessageBodyAudioClip.kt:24)");
            }
            AudioPlaybackPanelKt.AudioPlaybackPanel(message.getAudioData(), message.getSampleRate(), false, PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(16), 0.0f, 11, null), true, $composer2, 28032, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyAudioClipKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyAudioClipKt.MessageBodyAudioClip$lambda$0(message, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
