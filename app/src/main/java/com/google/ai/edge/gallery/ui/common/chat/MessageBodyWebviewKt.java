package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.SolidColor;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.window.core.layout.WindowSizeClass;
import com.google.ai.edge.gallery.ui.common.GalleryWebViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;



V", "app_debug", "showBottomSheet", ""}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class MessageBodyWebviewKt {
    private static final String TAG = "AGMessageBodyWebview";

    
    public static final Unit MessageBodyWebview$lambda$12(ChatMessageWebView chatMessageWebView, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MessageBodyWebview(chatMessageWebView, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MessageBodyWebview(ChatMessageWebView message, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        final ChatMessageWebView chatMessageWebView;
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer $composer3 = $composer.startRestartGroup(-1657446969);
        ComposerKt.sourceInformation($composer3, "C(MessageBodyWebview)59@2559L34,60@2613L59,61@2687L24,63@2715L660:MessageBodyWebview.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(message) ? 4 : 2;
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
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            Modifier modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1657446969, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyWebview (MessageBodyWebview.kt:58)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 626334825, "CC(remember):MessageBodyWebview.kt#9igjgp");
            Object it$iv = $composer3.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            final MutableState showBottomSheet$delegate = (MutableState) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer3, 6, 2);
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)600@27430L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object value$iv$iv = $composer3.rememberedValue();
            if (value$iv$iv == Composer.INSTANCE.getEmpty()) {
                value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(value$iv$iv);
            }
            final CoroutineScope scope = (CoroutineScope) value$iv$iv;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            int $changed$iv = ($dirty2 >> 3) & 14;
            Modifier modifier$iv = modifier3;
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
            int $changed$iv$iv = ($changed$iv << 3) & 112;
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
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = (($changed$iv >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -2073579164, "C64@2749L243,72@3025L26,71@2997L374:MessageBodyWebview.kt#ouynps");
            GalleryWebViewKt.GalleryWebView(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), message.getAspectRatio(), false, 2, null), message.getUrl(), message.getIframe(), true, true, null, null, null, null, $composer3, 27648, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
            ComposerKt.sourceInformationMarkerStart($composer3, 1595686571, "CC(remember):MessageBodyWebview.kt#9igjgp");
            Object it$iv2 = $composer3.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyWebviewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MessageBodyWebviewKt.MessageBodyWebview$lambda$5$lambda$4$lambda$3(showBottomSheet$delegate);
                    }
                };
                $composer3.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ChipKt.AssistChip((Function0<Unit>) it$iv2, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$MessageBodyWebviewKt.INSTANCE.getLambda$620831374$app_debug(), (Modifier) null, false, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$MessageBodyWebviewKt.INSTANCE.m10947getLambda$127437717$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Shape) null, (ChipColors) null, (ChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, $composer3, 24630, 0, 2028);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (MessageBodyWebview$lambda$1(showBottomSheet$delegate)) {
                $composer3.startReplaceGroup(-2057582858);
                ComposerKt.sourceInformation($composer3, "87@3449L27,90@3556L1157,86@3406L1307");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer3, 626363298, "CC(remember):MessageBodyWebview.kt#9igjgp");
                Object it$iv3 = $composer3.rememberedValue();
                if (it$iv3 == Composer.INSTANCE.getEmpty()) {
                    Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyWebviewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MessageBodyWebviewKt.MessageBodyWebview$lambda$7$lambda$6(showBottomSheet$delegate);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv3);
                    it$iv3 = value$iv3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                chatMessageWebView = message;
                $composer2 = $composer3;
                ModalBottomSheetKt.m4185ModalBottomSheetYbuCTN8((Function0) it$iv3, modifierFillMaxSize$default, sheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(946711534, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyWebviewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MessageBodyWebviewKt.MessageBodyWebview$lambda$11(chatMessageWebView, scope, sheetState, showBottomSheet$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer3, 54), $composer2, 54, 3072, 8184);
            } else {
                chatMessageWebView = message;
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-2060997477);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            chatMessageWebView = message;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyWebviewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyWebviewKt.MessageBodyWebview$lambda$12(chatMessageWebView, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean MessageBodyWebview$lambda$1(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    
    public static final void MessageBodyWebview$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    
    public static final Unit MessageBodyWebview$lambda$5$lambda$4$lambda$3(MutableState $showBottomSheet$delegate) {
        MessageBodyWebview$lambda$2($showBottomSheet$delegate, true);
        return Unit.INSTANCE;
    }

    
    public static final Unit MessageBodyWebview$lambda$7$lambda$6(MutableState $showBottomSheet$delegate) {
        MessageBodyWebview$lambda$2($showBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }

    
    public static final Unit MessageBodyWebview$lambda$11(ChatMessageWebView $message, final CoroutineScope $scope, final SheetState $sheetState, final MutableState $showBottomSheet$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C91@3564L1143:MessageBodyWebview.kt#ouynps");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(946711534, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyWebview.<anonymous> (MessageBodyWebview.kt:91)");
            }
            Modifier modifier$iv = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
            MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
            int $changed$iv$iv = (6 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m6165constructorimpl($composer);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i2 = ((6 >> 6) & 112) | 6;
            BoxScope $this$MessageBodyWebview_u24lambda_u2411_u24lambda_u2410 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1026916143, "C92@3613L233,108@4134L11,107@4071L105,111@4228L30,113@4329L11,100@3895L124,99@3855L844:MessageBodyWebview.kt#ouynps");
            GalleryWebViewKt.GalleryWebView(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), $message.getUrl(), $message.getIframe(), true, true, null, null, null, null, $composer, 27654, WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
            IconButtonColors iconButtonColorsM4047iconButtonColorsro_MJ88 = IconButtonDefaults.INSTANCE.m4047iconButtonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainer(), 0L, 0L, 0L, $composer, IconButtonDefaults.$stable << 12, 14);
            BorderStroke borderStrokeOutlinedIconButtonBorder = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(true, $composer, (IconButtonDefaults.$stable << 3) | 6);
            long outlineVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutlineVariant();
            BorderStroke borderStrokeM1389copyD5KLDUw$default = BorderStroke.m1389copyD5KLDUw$default(borderStrokeOutlinedIconButtonBorder, 0.0f, new SolidColor(Color.m6913copywmQWz5c(outlineVariant, (14 & 1) != 0 ? Color.m6917getAlphaimpl(outlineVariant) : 0.5f, (14 & 2) != 0 ? Color.m6921getRedimpl(outlineVariant) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(outlineVariant) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(outlineVariant) : 0.0f), null), 1, null);
            Modifier modifierM1992paddingqDBjuR0$default = PaddingKt.m1992paddingqDBjuR0$default($this$MessageBodyWebview_u24lambda_u2411_u24lambda_u2410.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), 0.0f, C1654Dp.m9788constructorimpl(8), C1654Dp.m9788constructorimpl(8), 0.0f, 9, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1352355056, "CC(remember):MessageBodyWebview.kt#9igjgp");
            boolean invalid$iv = $composer.changedInstance($scope) | $composer.changed($sheetState);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyWebviewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MessageBodyWebviewKt.MessageBodyWebview$lambda$11$lambda$10$lambda$9$lambda$8($scope, $sheetState, $showBottomSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.OutlinedIconButton((Function0) it$iv, modifierM1992paddingqDBjuR0$default, false, null, iconButtonColorsM4047iconButtonColorsro_MJ88, borderStrokeM1389copyD5KLDUw$default, null, ComposableSingletons$MessageBodyWebviewKt.INSTANCE.getLambda$1227949205$app_debug(), $composer, 12582912, 76);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    
    public static final Unit MessageBodyWebview$lambda$11$lambda$10$lambda$9$lambda$8(CoroutineScope $scope, SheetState $sheetState, MutableState $showBottomSheet$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new MessageBodyWebviewKt$MessageBodyWebview$3$1$1$1$1($sheetState, $showBottomSheet$delegate, null), 3, null);
        return Unit.INSTANCE;
    }
}
