package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.ui.theme.TypeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;



\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m922d2 = {"MessageSender", "", "message", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "agentName", "", "imageHistoryCurIndex", "", "(Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;Ljava/lang/String;ILandroidx/compose/runtime/Composer;II)V", "getMessageLayoutConfig", "Lcom/google/ai/edge/gallery/ui/common/chat/MessageLayoutConfig;", "(Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lcom/google/ai/edge/gallery/ui/common/chat/MessageLayoutConfig;", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class MessageSenderKt {
    
    public static final Unit MessageSender$lambda$0(ChatMessage chatMessage, String str, int i, int i2, int i3, Composer composer, int i4) {
        MessageSender(chatMessage, str, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    
    public static final Unit MessageSender$lambda$3(ChatMessage chatMessage, String str, int i, int i2, int i3, Composer composer, int i4) {
        MessageSender(chatMessage, str, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void MessageSender(final ChatMessage message, String agentName, int imageHistoryCurIndex, Composer $composer, final int $changed, final int i) {
        String str;
        int i2;
        String agentName2;
        int imageHistoryCurIndex2;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function02;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer $composer2 = $composer.startRestartGroup(-1911886945);
        ComposerKt.sourceInformation($composer2, "C(MessageSender)P(2)61@2292L134,67@2430L2421:MessageSender.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(message) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
            str = agentName;
        } else if (($changed & 48) == 0) {
            str = agentName;
            $dirty |= $composer2.changed(str) ? 32 : 16;
        } else {
            str = agentName;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
            i2 = imageHistoryCurIndex;
        } else if (($changed & 384) == 0) {
            i2 = imageHistoryCurIndex;
            $dirty |= $composer2.changed(i2) ? 256 : 128;
        } else {
            i2 = imageHistoryCurIndex;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            String agentName3 = i3 != 0 ? "" : str;
            int imageHistoryCurIndex3 = i4 != 0 ? 0 : i2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1911886945, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageSender (MessageSender.kt:54)");
            }
            if (message.getSide() != ChatSide.SYSTEM) {
                MessageLayoutConfig messageLayoutConfig = getMessageLayoutConfig(message, agentName3, imageHistoryCurIndex3, $composer2, ($dirty2 & 14) | ($dirty2 & 112) | ($dirty2 & 896));
                Arrangement.Horizontal horizontalArrangement = messageLayoutConfig.getHorizontalArrangement();
                Modifier modifier = messageLayoutConfig.getModifier();
                String userLabel = messageLayoutConfig.getUserLabel();
                String rightSideLabel = messageLayoutConfig.getRightSideLabel();
                Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement, verticalAlignment$iv, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                int $changed$iv$iv = (384 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier);
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
                agentName2 = agentName3;
                imageHistoryCurIndex2 = imageHistoryCurIndex3;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = ($changed$iv$iv$iv >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -82149442, "C72@2573L2022:MessageSender.kt#ouynps");
                Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier modifier$iv$iv = Modifier.INSTANCE;
                Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
                int compositeKeyHash$iv$iv2 = ((384 >> 3) & 14) | ((384 >> 3) & 112);
                MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv2, $composer2, compositeKeyHash$iv$iv2);
                int $changed$iv$iv2 = (384 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv$iv);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    function02 = constructor2;
                    $composer2.createNode(function02);
                } else {
                    function02 = constructor2;
                    $composer2.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer2);
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                int i7 = ($changed$iv$iv$iv2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i8 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -857014417, "C74@2694L10,74@2656L60:MessageSender.kt#ouynps");
                TextKt.m4781TextNvy7gAk(userLabel, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getTitleSmall(), $composer2, 0, 0, 131070);
                String strStringResource = "";
                if (message instanceof ChatMessageBenchmarkResult) {
                    $composer2.startReplaceGroup(-856889488);
                    ComposerKt.sourceInformation($composer2, "");
                    if (((ChatMessageBenchmarkResult) message).isRunning()) {
                        $composer2.startReplaceGroup(-856866269);
                        ComposerKt.sourceInformation($composer2, "80@2870L39,84@3068L11,81@2922L182,86@3117L39");
                        SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8)), $composer2, 6);
                        ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(10)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSecondary(), C1654Dp.m9788constructorimpl((float) 1.5d), 0L, 0, 0.0f, $composer2, 390, 56);
                        SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(4)), $composer2, 6);
                    } else {
                        $composer2.startReplaceGroup(-859710085);
                    }
                    $composer2.endReplaceGroup();
                    if (((ChatMessageBenchmarkResult) message).isWarmingUp()) {
                        $composer2.startReplaceGroup(-856496966);
                        ComposerKt.sourceInformation($composer2, "90@3252L35");
                        strStringResource = StringResources_androidKt.stringResource(C2421R.string.warming_up, $composer2, 0);
                        $composer2.endReplaceGroup();
                    } else if (((ChatMessageBenchmarkResult) message).isRunning()) {
                        $composer2.startReplaceGroup(-856401827);
                        ComposerKt.sourceInformation($composer2, "92@3348L32");
                        strStringResource = StringResources_androidKt.stringResource(C2421R.string.running, $composer2, 0);
                        $composer2.endReplaceGroup();
                    } else {
                        $composer2.startReplaceGroup(-856336233);
                        $composer2.endReplaceGroup();
                    }
                    String statusLabel = strStringResource;
                    if (statusLabel.length() > 0) {
                        $composer2.startReplaceGroup(-856290134);
                        ComposerKt.sourceInformation($composer2, "95@3497L11,95@3457L87");
                        TextKt.m4781TextNvy7gAk(statusLabel, null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSecondary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getBodySmallNarrow(), $composer2, 0, 12582912, 131066);
                    } else {
                        $composer2.startReplaceGroup(-859710085);
                    }
                    $composer2.endReplaceGroup();
                    $composer2.endReplaceGroup();
                } else if (message instanceof ChatMessageBenchmarkLlmResult) {
                    $composer2.startReplaceGroup(-856075924);
                    ComposerKt.sourceInformation($composer2, "");
                    if (((ChatMessageBenchmarkLlmResult) message).getRunning()) {
                        $composer2.startReplaceGroup(-856044521);
                        ComposerKt.sourceInformation($composer2, "102@3700L39,106@3898L11,103@3752L182");
                        SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8)), $composer2, 6);
                        ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(10)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSecondary(), C1654Dp.m9788constructorimpl((float) 1.5d), 0L, 0, 0.0f, $composer2, 390, 56);
                    } else {
                        $composer2.startReplaceGroup(-859710085);
                    }
                    $composer2.endReplaceGroup();
                    $composer2.endReplaceGroup();
                } else {
                    if (message instanceof ChatMessageImageWithHistory) {
                        $composer2.startReplaceGroup(-855680798);
                        ComposerKt.sourceInformation($composer2, "");
                        if (((ChatMessageImageWithHistory) message).isRunning()) {
                            $composer2.startReplaceGroup(-855645551);
                            ComposerKt.sourceInformation($composer2, "114@4095L39,118@4293L11,115@4147L182,120@4342L39,122@4414L32,123@4484L11,121@4394L165");
                            SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(8)), $composer2, 6);
                            ProgressIndicatorKt.m4356CircularProgressIndicator4lLiAd8(SizeKt.m2036size3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(10)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSecondary(), C1654Dp.m9788constructorimpl((float) 1.5d), 0L, 0, 0.0f, $composer2, 390, 56);
                            SpacerKt.Spacer(SizeKt.m2041width3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(4)), $composer2, 6);
                            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.running, $composer2, 0), null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSecondary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getBodySmallNarrow(), $composer2, 0, 12582912, 131066);
                        } else {
                            $composer2.startReplaceGroup(-859710085);
                        }
                        $composer2.endReplaceGroup();
                    } else {
                        $composer2.startReplaceGroup(-859710085);
                    }
                    $composer2.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                if ((message instanceof ChatMessageBenchmarkResult) || (message instanceof ChatMessageImageWithHistory) || (message instanceof ChatMessageBenchmarkLlmResult)) {
                    $composer2.startReplaceGroup(-80048883);
                    ComposerKt.sourceInformation($composer2, "136@4812L10,136@4769L64");
                    TextKt.m4781TextNvy7gAk(rightSideLabel, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, 0, 0, 131070);
                } else {
                    $composer2.startReplaceGroup(-84773345);
                }
                $composer2.endReplaceGroup();
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
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final String str2 = agentName3;
                    final int i9 = imageHistoryCurIndex3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageSenderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MessageSenderKt.MessageSender$lambda$0(message, str2, i9, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
        } else {
            $composer2.skipToGroupEnd();
            agentName2 = str;
            imageHistoryCurIndex2 = i2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final String str3 = agentName2;
            final int i10 = imageHistoryCurIndex2;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageSenderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageSenderKt.MessageSender$lambda$3(message, str3, i10, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final MessageLayoutConfig getMessageLayoutConfig(ChatMessage message, String agentName, int imageHistoryCurIndex, Composer $composer, int $changed) {
        String str;
        ComposerKt.sourceInformationMarkerStart($composer, -932247275, "C(getMessageLayoutConfig)P(2)148@5020L33:MessageSender.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-932247275, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.getMessageLayoutConfig (MessageSender.kt:147)");
        }
        String userLabel = StringResources_androidKt.stringResource(C2421R.string.chat_you, $composer, 0);
        String rightSideLabel = "";
        Arrangement.Horizontal horizontalArrangement = Arrangement.INSTANCE.getEnd();
        Modifier modifier = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1654Dp.m9788constructorimpl(2), 7, null);
        if (message.getSide() == ChatSide.AGENT) {
            userLabel = agentName;
        }
        if (message instanceof ChatMessageBenchmarkResult) {
            Arrangement.Horizontal horizontalArrangement2 = Arrangement.INSTANCE.getSpaceBetween();
            horizontalArrangement = horizontalArrangement2;
            modifier = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            userLabel = "Benchmark";
            if (((ChatMessageBenchmarkResult) message).isWarmingUp()) {
                str = ((ChatMessageBenchmarkResult) message).getWarmupCurrent() + "/" + ((ChatMessageBenchmarkResult) message).getWarmupTotal();
            } else {
                str = ((ChatMessageBenchmarkResult) message).getIterationCurrent() + "/" + ((ChatMessageBenchmarkResult) message).getIterationTotal();
            }
            rightSideLabel = str;
        } else if (message instanceof ChatMessageBenchmarkLlmResult) {
            Arrangement.Horizontal horizontalArrangement3 = Arrangement.INSTANCE.getSpaceBetween();
            horizontalArrangement = horizontalArrangement3;
            modifier = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            userLabel = "Stats";
            if (((ChatMessageBenchmarkLlmResult) message).getAccelerator().length() > 0) {
                userLabel = "Stats on " + ((ChatMessageBenchmarkLlmResult) message).getAccelerator();
            }
        } else if (message instanceof ChatMessageImageWithHistory) {
            Arrangement.Horizontal horizontalArrangement4 = Arrangement.INSTANCE.getSpaceBetween();
            horizontalArrangement = horizontalArrangement4;
            if (!((ChatMessageImageWithHistory) message).getBitmaps().isEmpty()) {
                modifier = SizeKt.m2041width3ABfNKs(modifier, C1654Dp.m9788constructorimpl(200));
            }
            rightSideLabel = (imageHistoryCurIndex + 1) + "/" + ((ChatMessageImageWithHistory) message).getTotalIterations();
        }
        MessageLayoutConfig messageLayoutConfig = new MessageLayoutConfig(horizontalArrangement, modifier, userLabel, rightSideLabel);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return messageLayoutConfig;
    }
}
