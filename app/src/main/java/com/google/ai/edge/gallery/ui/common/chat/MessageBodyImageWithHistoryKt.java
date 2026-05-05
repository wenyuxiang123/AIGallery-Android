package com.google.ai.edge.gallery.ui.common.chat;

import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.ImageBitmap;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: MessageBodyImageWithHistory.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m922d2 = {"MessageBodyImageWithHistory", "", "message", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageImageWithHistory;", "imageHistoryCurIndex", "Landroidx/compose/runtime/MutableIntState;", "(Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageImageWithHistory;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/Composer;I)V", "app_debug", "value", "", "savedIndex", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MessageBodyImageWithHistoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyImageWithHistory$lambda$10(ChatMessageImageWithHistory chatMessageImageWithHistory, MutableIntState mutableIntState, int i, Composer composer, int i2) {
        MessageBodyImageWithHistory(chatMessageImageWithHistory, mutableIntState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MessageBodyImageWithHistory(final ChatMessageImageWithHistory message, final MutableIntState imageHistoryCurIndex, Composer $composer, final int $changed) {
        Function0<ComposeUiNode> function0;
        Object it$iv;
        boolean z;
        Object value$iv;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(imageHistoryCurIndex, "imageHistoryCurIndex");
        Composer $composer2 = $composer.startRestartGroup(1359879462);
        ComposerKt.sourceInformation($composer2, "C(MessageBodyImageWithHistory)P(1)47@1883L33,49@1944L98,49@1920L122,54@2046L1416:MessageBodyImageWithHistory.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(message) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(imageHistoryCurIndex) ? 32 : 16;
        }
        if ($composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1359879462, $dirty, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyImageWithHistory (MessageBodyImageWithHistory.kt:46)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1174111239, "CC(remember):MessageBodyImageWithHistory.kt#9igjgp");
            Object it$iv2 = $composer2.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            MutableState prevMessage = (MutableState) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1174113256, "CC(remember):MessageBodyImageWithHistory.kt#9igjgp");
            boolean invalid$iv = (($dirty & 112) == 32) | $composer2.changedInstance(message);
            Object it$iv3 = $composer2.rememberedValue();
            if (invalid$iv || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = (Function2) new MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$1$1(imageHistoryCurIndex, message, prevMessage, null);
                $composer2.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(message, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) it$iv3, $composer2, $dirty & 14);
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier$iv$iv = Modifier.INSTANCE;
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i2 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1111416260, "C65@2520L36,66@2579L33,71@2785L627,67@2617L841:MessageBodyImageWithHistory.kt#ouynps");
            Bitmap curImage = message.getBitmaps().get(imageHistoryCurIndex.getIntValue());
            List<ImageBitmap> imageBitMaps = message.getImageBitMaps();
            int $changed$iv$iv$iv2 = imageHistoryCurIndex.getIntValue();
            ImageBitmap curImageBitmap = imageBitMaps.get($changed$iv$iv$iv2);
            int bitmapWidth = curImage.getWidth();
            int bitmapHeight = curImage.getHeight();
            int imageWidth = bitmapWidth >= bitmapHeight ? 200 : (int) ((200.0f / bitmapHeight) * bitmapWidth);
            int $this$dp$iv = bitmapHeight < bitmapWidth ? (int) (bitmapHeight * (200.0f / bitmapWidth)) : 200;
            ComposerKt.sourceInformationMarkerStart($composer2, 518350580, "CC(remember):MessageBodyImageWithHistory.kt#9igjgp");
            Object it$iv4 = $composer2.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer2.updateRememberedValue(value$iv4);
                it$iv = value$iv4;
            } else {
                it$iv = it$iv4;
            }
            MutableFloatState value$delegate = (MutableFloatState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 518352465, "CC(remember):MessageBodyImageWithHistory.kt#9igjgp");
            Object it$iv5 = $composer2.rememberedValue();
            if (it$iv5 == Composer.INSTANCE.getEmpty()) {
                z = false;
                value$iv = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer2.updateRememberedValue(value$iv);
            } else {
                z = false;
                value$iv = it$iv5;
            }
            MutableIntState savedIndex$delegate = (MutableIntState) value$iv;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierM2022height3ABfNKs = SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl($this$dp$iv));
            int $this$dp$iv2 = imageWidth;
            Modifier modifierM2041width3ABfNKs = SizeKt.m2041width3ABfNKs(modifierM2022height3ABfNKs, C1654Dp.m9788constructorimpl($this$dp$iv2));
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 518359651, "CC(remember):MessageBodyImageWithHistory.kt#9igjgp");
            if (($dirty & 112) == 32) {
                z = true;
            }
            boolean invalid$iv2 = z | $composer2.changedInstance(message);
            MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$2$1$1 value$iv5 = $composer2.rememberedValue();
            if (invalid$iv2 || value$iv5 == Composer.INSTANCE.getEmpty()) {
                value$iv5 = new MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$2$1$1(imageHistoryCurIndex, value$delegate, savedIndex$delegate, message);
                $composer2.updateRememberedValue(value$iv5);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ImageKt.m1426Image5hnEew(curImageBitmap, null, SuspendingPointerInputFilterKt.pointerInput(modifierM2041width3ABfNKs, unit, (PointerInputEventHandler) value$iv5), null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, $composer2, 24624, 232);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyImageWithHistoryKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyImageWithHistoryKt.MessageBodyImageWithHistory$lambda$10(message, imageHistoryCurIndex, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float MessageBodyImageWithHistory$lambda$9$lambda$3(MutableFloatState $value$delegate) {
        MutableFloatState $this$getValue$iv = $value$delegate;
        return $this$getValue$iv.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MessageBodyImageWithHistory$lambda$9$lambda$6(MutableIntState $savedIndex$delegate) {
        MutableIntState $this$getValue$iv = $savedIndex$delegate;
        return $this$getValue$iv.getIntValue();
    }
}
