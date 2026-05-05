package com.google.ai.edge.gallery.ui.common.chat;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ShadowKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.p000ui.graphics.RectangleShapeKt;
import androidx.compose.p000ui.graphics.TileMode;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.data.PromptTemplate;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.ColorUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageBodyPromptTemplates.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m922d2 = {"CARD_HEIGHT", "", "MessageBodyPromptTemplates", "", "message", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessagePromptTemplates;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "onPromptClicked", "Lkotlin/Function1;", "Lcom/google/ai/edge/gallery/data/PromptTemplate;", "(Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessagePromptTemplates;Lcom/google/ai/edge/gallery/data/Task;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MessageBodyPromptTemplatesKt {
    private static final int CARD_HEIGHT = 100;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyPromptTemplates$lambda$9(ChatMessagePromptTemplates chatMessagePromptTemplates, Task task, Function1 function1, int i, int i2, Composer composer, int i3) {
        MessageBodyPromptTemplates(chatMessagePromptTemplates, task, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyPromptTemplates$lambda$1$lambda$0(PromptTemplate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void MessageBodyPromptTemplates(final ChatMessagePromptTemplates message, final Task task, Function1<? super PromptTemplate, Unit> function1, Composer $composer, final int $changed, final int i) {
        Function1<? super PromptTemplate, Unit> function12;
        Function1<? super PromptTemplate, Unit> function13;
        Function1<? super PromptTemplate, Unit> function14;
        Function0<ComposeUiNode> function0;
        Composer $composer2;
        boolean z;
        final Function1<? super PromptTemplate, Unit> function15;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(task, "task");
        Composer $composer3 = $composer.startRestartGroup(-1560753818);
        ComposerKt.sourceInformation($composer3, "C(MessageBodyPromptTemplates)P(!1,2)58@2385L2,61@2457L22,64@2546L1950:MessageBodyPromptTemplates.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(message) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(task) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            function12 = function1;
        } else if (($changed & 384) == 0) {
            function12 = function1;
            $dirty |= $composer3.changedInstance(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (i2 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -940828216, "CC(remember):MessageBodyPromptTemplates.kt#9igjgp");
                Object it$iv = $composer3.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyPromptTemplatesKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MessageBodyPromptTemplatesKt.MessageBodyPromptTemplates$lambda$1$lambda$0((PromptTemplate) obj);
                        }
                    };
                    $composer3.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                function14 = (Function1) it$iv;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                function14 = function12;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1560753818, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.MessageBodyPromptTemplates (MessageBodyPromptTemplates.kt:59)");
            }
            float rowCount = message.getTemplates().size();
            final long color = ColorUtilsKt.getTaskIconColor(task, $composer3, ($dirty2 >> 3) & 14);
            List gradientColors = CollectionsKt.listOf((Object[]) new Color[]{Color.m6905boximpl(Color.m6913copywmQWz5c(color, (14 & 1) != 0 ? Color.m6917getAlphaimpl(color) : 0.5f, (14 & 2) != 0 ? Color.m6921getRedimpl(color) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(color) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(color) : 0.0f)), Color.m6905boximpl(color)});
            Modifier modifier$iv$iv = PaddingKt.m1992paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C1654Dp.m9788constructorimpl(12), 0.0f, 0.0f, 13, null);
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            int $changed$iv$iv = (54 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap localMap$iv$iv = $composer3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer3, modifier$iv$iv);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
            Function1<? super PromptTemplate, Unit> function16 = function14;
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
            int i4 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1973349615, "C71@2737L10,68@2664L300,89@3356L1136,86@3213L1279:MessageBodyPromptTemplates.kt#ouynps");
            TextKt.m4781TextNvy7gAk("Try an example prompt", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m9620boximpl(TextAlign.INSTANCE.m9627getCentere0LSkKk()), 0L, 0, false, 0, 0, null, TextStyle.m9203copyNs73l9s$default(MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getTitleLarge(), Brush.INSTANCE.m6875linearGradientmHitzGk((List<Color>) gradientColors, (14 & 2) != 0 ? Offset.INSTANCE.m6686getZeroF1C5BW0() : 0L, (14 & 4) != 0 ? Offset.INSTANCE.m6684getInfiniteF1C5BW0() : 0L, (14 & 8) != 0 ? TileMode.INSTANCE.m7312getClamp3opZhB0() : 0), 0.0f, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554422, null), $composer3, 54, 0, 130044);
            if (message.getShowMakeYourOwn()) {
                $composer2 = $composer3;
                $composer2.startReplaceGroup(1973630784);
                ComposerKt.sourceInformation($composer2, "81@3070L10,79@3006L196");
                z = true;
                TextKt.m4781TextNvy7gAk("Or make your own", OffsetKt.m1945offsetVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1654Dp.m9788constructorimpl(-4), 1, null), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m9620boximpl(TextAlign.INSTANCE.m9627getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getTitleSmall(), $composer2, 54, 0, 130044);
            } else {
                $composer2 = $composer3;
                z = true;
                $composer2.startReplaceGroup(1970649266);
            }
            $composer2.endReplaceGroup();
            float $this$dp$iv = AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR * rowCount;
            Modifier modifierM2022height3ABfNKs = SizeKt.m2022height3ABfNKs(Modifier.INSTANCE, C1654Dp.m9788constructorimpl($this$dp$iv));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM1843spacedBy0680j_4 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer2, 1033509216, "CC(remember):MessageBodyPromptTemplates.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(message) | $composer3.changed(color);
            if (($dirty2 & 896) != 256) {
                z = false;
            }
            boolean invalid$iv = zChangedInstance | z;
            Composer $this$cache$iv = $composer2;
            Object it$iv2 = $this$cache$iv.rememberedValue();
            if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
                function15 = function16;
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyPromptTemplatesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageBodyPromptTemplatesKt.MessageBodyPromptTemplates$lambda$8$lambda$7$lambda$6(message, color, function15, (LazyListScope) obj);
                    }
                };
                $this$cache$iv.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            } else {
                function15 = function16;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(modifierM2022height3ABfNKs, null, null, false, horizontalOrVerticalM1843spacedBy0680j_4, null, null, false, null, (Function1) it$iv2, $composer2, 24576, 494);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function13 = function15;
        } else {
            $composer3.skipToGroupEnd();
            function13 = function12;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super PromptTemplate, Unit> function17 = function13;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyPromptTemplatesKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MessageBodyPromptTemplatesKt.MessageBodyPromptTemplates$lambda$9(message, task, function17, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageBodyPromptTemplates$lambda$8$lambda$7$lambda$6(ChatMessagePromptTemplates $message, final long $color, final Function1 $onPromptClicked, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<PromptTemplate> templates = $message.getTemplates();
        final Function1 contentType$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyPromptTemplatesKt$MessageBodyPromptTemplates$lambda$8$lambda$7$lambda$6$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((PromptTemplate) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(PromptTemplate promptTemplate) {
                return null;
            }
        };
        LazyColumn.items(templates.size(), null, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyPromptTemplatesKt$MessageBodyPromptTemplates$lambda$8$lambda$7$lambda$6$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return contentType$iv.invoke(templates.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyPromptTemplatesKt$MessageBodyPromptTemplates$lambda$8$lambda$7$lambda$6$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Function0<ComposeUiNode> function0;
                Function0<ComposeUiNode> function02;
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    int $changed2 = $dirty & 14;
                    final PromptTemplate template = (PromptTemplate) templates.get(it);
                    $composer.startReplaceGroup(-1504407619);
                    ComposerKt.sourceInformation($composer, "C*101@3801L11,102@3847L29,92@3427L1051:MessageBodyPromptTemplates.kt#ouynps");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    float fM9788constructorimpl = C1654Dp.m9788constructorimpl(1);
                    long j = $color;
                    Modifier modifierM1359backgroundbw27NRU$default = BackgroundKt.m1359backgroundbw27NRU$default(ShadowKt.m6512shadows4CzXII(SizeKt.m2022height3ABfNKs(BorderKt.m1374borderxT4_qwU(companion, fM9788constructorimpl, Color.m6913copywmQWz5c(j, (14 & 1) != 0 ? Color.m6917getAlphaimpl(j) : 0.3f, (14 & 2) != 0 ? Color.m6921getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(j) : 0.0f), RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(24))), C1654Dp.m9788constructorimpl(100)), C1654Dp.m9788constructorimpl(2), (24 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(24)), (24 & 4) != 0 ? C1654Dp.m9787compareTo0680j_4(28, C1654Dp.m9788constructorimpl((float) 0)) > 0 : false, (24 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (24 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : $color), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), null, 2, null);
                    ComposerKt.sourceInformationMarkerStart($composer, 90030472, "CC(remember):MessageBodyPromptTemplates.kt#9igjgp");
                    boolean invalid$iv = $composer.changed($onPromptClicked) | (((($changed2 & 112) ^ 48) > 32 && $composer.changed(template)) || ($changed2 & 48) == 32);
                    Object it$iv = $composer.rememberedValue();
                    if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                        final Function1 function1 = $onPromptClicked;
                        Object value$iv = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageBodyPromptTemplatesKt$MessageBodyPromptTemplates$2$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function1.invoke(template);
                            }
                        };
                        $composer.updateRememberedValue(value$iv);
                        it$iv = value$iv;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Modifier modifier$iv = ClickableKt.m1401clickableoSLSa3U(modifierM1359backgroundbw27NRU$default, (14 & 1) != 0, (14 & 2) != 0 ? null : null, (14 & 4) != 0 ? null : null, (14 & 8) != 0 ? null : null, (Function0) it$iv);
                    ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
                    MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                    int $changed$iv$iv = (0 << 3) & 112;
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
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i2 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 313420889, "C104@3899L569:MessageBodyPromptTemplates.kt#ouynps");
                    Modifier modifier$iv2 = SizeKt.fillMaxSize$default(PaddingKt.m1989paddingVpY3zN4(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(12), C1654Dp.m9788constructorimpl(20)), 0.0f, 1, null);
                    Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                    MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                    int $changed$iv$iv2 = (390 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap localMap$iv$iv2 = $composer.getCurrentCompositionLocalMap();
                    Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer, modifier$iv2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                        function02 = constructor2;
                        $composer.createNode(function02);
                    } else {
                        function02 = constructor2;
                        $composer.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer);
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    int i4 = ((390 >> 6) & 112) | 6;
                    ColumnScope $this$MessageBodyPromptTemplates_u24lambda_u248_u24lambda_u247_u24lambda_u246_u24lambda_u245_u24lambda_u244_u24lambda_u243 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, -2037876402, "C110@4162L10,108@4090L144,112@4247L38,115@4376L10,113@4298L158:MessageBodyPromptTemplates.kt#ouynps");
                    TextKt.m4781TextNvy7gAk(template.getTitle(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m9205copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), $composer, 0, 0, 131070);
                    SpacerKt.Spacer(ColumnScope.weight$default($this$MessageBodyPromptTemplates_u24lambda_u248_u24lambda_u247_u24lambda_u246_u24lambda_u245_u24lambda_u244_u24lambda_u243, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
                    TextKt.m4781TextNvy7gAk(template.getDescription(), null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m9620boximpl(TextAlign.INSTANCE.m9627getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 130046);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                $composer.skipToGroupEnd();
            }
        }));
        return Unit.INSTANCE;
    }
}
