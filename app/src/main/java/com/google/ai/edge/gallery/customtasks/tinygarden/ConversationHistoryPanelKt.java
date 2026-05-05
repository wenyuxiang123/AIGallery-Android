package com.google.ai.edge.gallery.customtasks.tinygarden;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.PrimitiveResources_androidKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessage;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageError;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageText;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageWarning;
import com.google.ai.edge.gallery.ui.common.chat.ChatSide;
import com.google.ai.edge.gallery.ui.common.chat.MessageBodyErrorKt;
import com.google.ai.edge.gallery.ui.common.chat.MessageBodyTextKt;
import com.google.ai.edge.gallery.ui.common.chat.MessageBodyWarningKt;
import com.google.ai.edge.gallery.ui.common.chat.MessageBubbleShape;
import com.google.ai.edge.gallery.ui.common.chat.MessageSenderKt;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ConversationHistoryPanel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m921d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, m922d2 = {"ConversationHistoryPanel", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "bottomPadding", "Landroidx/compose/ui/unit/Dp;", "viewModel", "Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenViewModel;", "onDismiss", "Lkotlin/Function0;", "ConversationHistoryPanel-uFdPcIQ", "(Lcom/google/ai/edge/gallery/data/Task;FLcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenUiState;"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ConversationHistoryPanelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationHistoryPanel_uFdPcIQ$lambda$10(Task task, float f, TinyGardenViewModel tinyGardenViewModel, Function0 function0, int i, Composer composer, int i2) {
        m10528ConversationHistoryPaneluFdPcIQ(task, f, tinyGardenViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: ConversationHistoryPanel-uFdPcIQ, reason: not valid java name */
    public static final void m10528ConversationHistoryPaneluFdPcIQ(final Task task, final float bottomPadding, final TinyGardenViewModel viewModel, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        int $dirty;
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        ConversationHistoryPanelKt$ConversationHistoryPanel$1$1$1 value$iv;
        Function0<ComposeUiNode> function02;
        Function0<ComposeUiNode> function03;
        Alignment.Horizontal hAlign;
        long backgroundColor;
        float extraPaddingEnd;
        float extraPaddingEnd2;
        MeasurePolicy measurePolicy$iv$iv;
        boolean hardCornerAtLeftOrRight;
        Function0<ComposeUiNode> function04;
        String str;
        Composer $composer$iv$iv;
        Composer $composer$iv;
        Composer $composer$iv$iv$iv;
        String str2;
        Composer $composer$iv$iv2;
        Function0<ComposeUiNode> function05;
        Function0<ComposeUiNode> function06;
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(-287721173);
        ComposerKt.sourceInformation($composer3, "C(ConversationHistoryPanel)P(2,0:c#ui.unit.Dp,3)66@2870L16,67@2905L21,71@3001L11,69@2930L3653:ConversationHistoryPanel.kt#pwpd1x");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(task) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changed(bottomPadding) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changedInstance(viewModel) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer3.changedInstance(onDismiss) ? 2048 : 1024;
        }
        int $dirty3 = $dirty2;
        if ($composer3.shouldExecute(($dirty3 & 1171) != 1170, $dirty3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-287721173, $dirty3, -1, "com.google.ai.edge.gallery.customtasks.tinygarden.ConversationHistoryPanel (ConversationHistoryPanel.kt:65)");
            }
            State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer3, 0, 1);
            ScrollState listState = ScrollKt.rememberScrollState(0, $composer3, 0, 1);
            Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxSize$default(BackgroundKt.m1359backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), null, 2, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bottomPadding, 7, null);
            String str3 = "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv = (0 << 3) & 112;
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
            $composer2 = $composer3;
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv, Integer.valueOf(compositeKeyHash$iv$iv), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.INSTANCE.getSetModifier());
            int i = ($changed$iv$iv$iv >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i2 = ((0 >> 6) & 112) | 6;
            ColumnScope $this$ConversationHistoryPanel_uFdPcIQ_u24lambda_u249 = ColumnScopeInstance.INSTANCE;
            Composer $composer4 = $composer3;
            ComposerKt.sourceInformationMarkerStart($composer4, -1967213850, "C76@3185L101,76@3147L139,85@3400L11,83@3328L616,104@3971L2608:ConversationHistoryPanel.kt#pwpd1x");
            Integer numValueOf = Integer.valueOf(ConversationHistoryPanel_uFdPcIQ$lambda$0(uiState$delegate).getMessages().size());
            ComposerKt.sourceInformationMarkerStart($composer4, 352181370, "CC(remember):ConversationHistoryPanel.kt#9igjgp");
            boolean invalid$iv = $composer4.changed(uiState$delegate) | $composer4.changed(listState);
            Object it$iv = $composer4.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                value$iv = new ConversationHistoryPanelKt$ConversationHistoryPanel$1$1$1(listState, uiState$delegate, null);
                $composer4.updateRememberedValue(value$iv);
            } else {
                value$iv = it$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer4);
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) value$iv, $composer4, 0);
            Modifier modifier$iv2 = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(BackgroundKt.m1359backgroundbw27NRU$default(Modifier.INSTANCE, MaterialTheme.INSTANCE.getColorScheme($composer4, MaterialTheme.$stable).getSurfaceContainerHighest(), null, 2, null), 0.0f, 1, null), C1654Dp.m9788constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null);
            Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer4, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicy$iv2 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer4, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            int $changed$iv$iv2 = (432 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer4, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer4, 0));
            CompositionLocalMap localMap$iv$iv2 = $composer4.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer4, modifier$iv2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer4.startReusableNode();
            if ($composer4.getInserting()) {
                function02 = constructor2;
                $composer4.createNode(function02);
            } else {
                function02 = constructor2;
                $composer4.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer4);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer4, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i4 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer4, 1980241430, "C92@3636L45,93@3713L10,91@3622L122,95@3772L15,95@3751L187:ConversationHistoryPanel.kt#pwpd1x");
            TextKt.m4781TextNvy7gAk(StringResources_androidKt.stringResource(C2421R.string.conversation_history, $composer4, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography($composer4, MaterialTheme.$stable).getTitleMedium(), $composer4, 0, 0, 131070);
            ComposerKt.sourceInformationMarkerStart($composer4, 1449356576, "CC(remember):ConversationHistoryPanel.kt#9igjgp");
            boolean invalid$iv2 = ($dirty3 & 7168) == 2048;
            $dirty = $dirty3;
            Object it$iv2 = $composer4.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.ConversationHistoryPanelKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationHistoryPanelKt.m464xb2282e5c(onDismiss);
                    }
                };
                $composer4.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer4);
            IconButtonKt.IconButton((Function0) it$iv2, null, false, null, null, null, ComposableSingletons$ConversationHistoryPanelKt.INSTANCE.getLambda$988996531$app_debug(), $composer4, 1572864, 62);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            $composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            Modifier modifier$iv3 = ScrollKt.verticalScroll$default(PaddingKt.m1990paddingVpY3zN4$default(ColumnScope.weight$default($this$ConversationHistoryPanel_uFdPcIQ_u24lambda_u249, Modifier.INSTANCE, 1.0f, false, 2, null), C1654Dp.m9788constructorimpl(16), 0.0f, 2, null), listState, false, null, false, 14, null);
            Composer $composer$iv2 = $composer4;
            ComposerKt.sourceInformationMarkerStart($composer$iv2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv2 = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv2 = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv3 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv2, horizontalAlignment$iv2, $composer$iv2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv3 = (0 << 3) & 112;
            Composer $composer$iv$iv3 = $composer$iv2;
            MeasurePolicy measurePolicy$iv$iv2 = measurePolicy$iv3;
            int $i$f$Layout = 0;
            String str4 = "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart($composer$iv$iv3, -1159599143, str4);
            int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv$iv3, 0));
            CompositionLocalMap localMap$iv$iv3 = $composer$iv$iv3.getCurrentCompositionLocalMap();
            Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer$iv$iv3, modifier$iv3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
            Composer $composer$iv$iv$iv2 = $composer$iv$iv3;
            String str5 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart($composer$iv$iv$iv2, -553112988, str5);
            if (!($composer$iv$iv$iv2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer$iv$iv$iv2.startReusableNode();
            if ($composer$iv$iv$iv2.getInserting()) {
                function03 = constructor3;
                $composer$iv$iv$iv2.createNode(function03);
            } else {
                function03 = constructor3;
                $composer$iv$iv$iv2.useNode();
            }
            Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer$iv$iv$iv2);
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
            Composer $composer$iv3 = $composer$iv$iv$iv2;
            int i6 = 0;
            String str6 = "C89@4557L9:Column.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart($composer$iv3, 2093002350, str6);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i7 = ((0 >> 6) & 112) | 6;
            Composer $composer5 = $composer$iv3;
            ComposerKt.sourceInformationMarkerStart($composer5, -781658541, "C:ConversationHistoryPanel.kt#pwpd1x");
            $composer5.startReplaceGroup(-302309456);
            ComposerKt.sourceInformation($composer5, "*109@4236L12,123@4816L52,125@4878L1687");
            Iterator<ChatMessage> it = ConversationHistoryPanel_uFdPcIQ$lambda$0(uiState$delegate).getMessages().iterator();
            while (it.hasNext()) {
                ChatMessage message = it.next();
                Alignment.Horizontal hAlign2 = Alignment.INSTANCE.getEnd();
                Iterator<ChatMessage> it2 = it;
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int $changed$iv$iv$iv4 = $changed$iv$iv$iv3;
                int $changed$iv$iv$iv5 = MaterialTheme.$stable;
                long backgroundColor2 = ThemeKt.getCustomColors(materialTheme, $composer5, $changed$iv$iv$iv5).m11241getUserBubbleBgColor0d7_KjU();
                float extraPaddingStart = C1654Dp.m9788constructorimpl(48);
                float extraPaddingStart2 = 0;
                float extraPaddingEnd3 = C1654Dp.m9788constructorimpl(extraPaddingStart2);
                if (message.getSide() == ChatSide.AGENT) {
                    $composer5.startReplaceGroup(-781395011);
                    ComposerKt.sourceInformation($composer5, "115@4507L12");
                    Alignment.Horizontal hAlign3 = Alignment.INSTANCE.getStart();
                    long backgroundColor3 = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer5, MaterialTheme.$stable).m11228getAgentBubbleBgColor0d7_KjU();
                    float extraPaddingStart3 = C1654Dp.m9788constructorimpl(0);
                    float extraPaddingStart4 = 48;
                    float extraPaddingEnd4 = C1654Dp.m9788constructorimpl(extraPaddingStart4);
                    $composer5.endReplaceGroup();
                    extraPaddingEnd = extraPaddingEnd4;
                    hAlign = hAlign3;
                    backgroundColor = backgroundColor3;
                    extraPaddingEnd2 = extraPaddingStart3;
                    measurePolicy$iv$iv = measurePolicy$iv$iv2;
                    hardCornerAtLeftOrRight = true;
                } else if (message.getSide() == ChatSide.SYSTEM) {
                    $composer5.startReplaceGroup(-781128814);
                    $composer5.endReplaceGroup();
                    float extraPaddingStart5 = C1654Dp.m9788constructorimpl(24);
                    float extraPaddingStart6 = 24;
                    extraPaddingEnd = C1654Dp.m9788constructorimpl(extraPaddingStart6);
                    hAlign = hAlign2;
                    backgroundColor = backgroundColor2;
                    extraPaddingEnd2 = extraPaddingStart5;
                    measurePolicy$iv$iv = measurePolicy$iv$iv2;
                    hardCornerAtLeftOrRight = false;
                } else {
                    $composer5.startReplaceGroup(-785795709);
                    $composer5.endReplaceGroup();
                    hAlign = hAlign2;
                    backgroundColor = backgroundColor2;
                    extraPaddingEnd = extraPaddingEnd3;
                    extraPaddingEnd2 = extraPaddingStart;
                    measurePolicy$iv$iv = measurePolicy$iv$iv2;
                    hardCornerAtLeftOrRight = false;
                }
                int i8 = i6;
                int $i$f$Layout2 = $i$f$Layout;
                float bubbleBorderRadius = PrimitiveResources_androidKt.dimensionResource(C2421R.dimen.chat_bubble_corner_radius, $composer5, 0);
                Composer $composer$iv4 = $composer$iv2;
                Composer $composer6 = $composer4;
                Composer $composer$iv$iv4 = $composer$iv$iv3;
                Modifier modifier$iv4 = PaddingKt.m1991paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), extraPaddingEnd2, C1654Dp.m9788constructorimpl(6), extraPaddingEnd, C1654Dp.m9788constructorimpl(6));
                Alignment.Horizontal horizontalAlignment$iv3 = hAlign;
                Composer $composer$iv5 = $composer5;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, 1341605231, str3);
                Arrangement.Vertical verticalArrangement$iv3 = Arrangement.INSTANCE.getTop();
                String str7 = str3;
                MeasurePolicy measurePolicy$iv4 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv3, horizontalAlignment$iv3, $composer$iv5, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                int $changed$iv$iv4 = (0 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, -1159599143, str4);
                int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv5, 0));
                CompositionLocalMap localMap$iv$iv4 = $composer$iv5.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer$iv5, modifier$iv4);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv6 = (($changed$iv$iv4 << 6) & 896) | 6;
                Composer $composer$iv$iv$iv3 = $composer$iv$iv$iv2;
                Composer $composer$iv$iv$iv4 = $composer$iv3;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, -553112988, str5);
                if (!($composer$iv5.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer$iv5.startReusableNode();
                if ($composer$iv5.getInserting()) {
                    function04 = constructor4;
                    $composer$iv5.createNode(function04);
                } else {
                    function04 = constructor4;
                    $composer$iv5.useNode();
                }
                Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer$iv5);
                Composer $composer7 = $composer5;
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = ($changed$iv$iv$iv6 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, 2093002350, str6);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i10 = ((0 >> 6) & 112) | 6;
                String str8 = str6;
                ComposerKt.sourceInformationMarkerStart($composer$iv5, -1999573670, "C132@5161L33,136@5330L55:ConversationHistoryPanel.kt#pwpd1x");
                String agentName = StringResources_androidKt.stringResource(task.getAgentNameRes(), $composer$iv5, 0);
                if (message.getAccelerator().length() > 0) {
                    agentName = agentName + " on " + message.getAccelerator();
                }
                MessageSenderKt.MessageSender(message, agentName, 0, $composer$iv5, 0, 4);
                if (message instanceof ChatMessageWarning) {
                    $composer$iv5.startReplaceGroup(1598074796);
                    ComposerKt.sourceInformation($composer$iv5, "140@5475L37");
                    MessageBodyWarningKt.MessageBodyWarning((ChatMessageWarning) message, $composer$iv5, 0);
                    $composer$iv5.endReplaceGroup();
                    str = str4;
                    $composer$iv$iv = $composer$iv5;
                    $composer$iv$iv2 = $composer$iv5;
                    $composer$iv = $composer$iv5;
                    $composer$iv$iv$iv = $composer$iv5;
                    str2 = str5;
                } else if (message instanceof ChatMessageError) {
                    $composer$iv5.startReplaceGroup(1598077866);
                    ComposerKt.sourceInformation($composer$iv5, "143@5571L35");
                    MessageBodyErrorKt.MessageBodyError((ChatMessageError) message, $composer$iv5, 0);
                    $composer$iv5.endReplaceGroup();
                    str = str4;
                    $composer$iv$iv = $composer$iv5;
                    $composer$iv$iv2 = $composer$iv5;
                    $composer$iv = $composer$iv5;
                    $composer$iv$iv$iv = $composer$iv5;
                    str2 = str5;
                } else {
                    $composer$iv5.startReplaceGroup(-1999109880);
                    ComposerKt.sourceInformation($composer$iv5, "");
                    if (message instanceof ChatMessageText) {
                        $composer$iv5.startReplaceGroup(-1998990561);
                        ComposerKt.sourceInformation($composer$iv5, "150@5774L694");
                        Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getTop();
                        Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart($composer$iv5, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        Modifier modifier$iv5 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicy$iv5 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer$iv5, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                        int $changed$iv$iv5 = (432 << 3) & 112;
                        ComposerKt.sourceInformationMarkerStart($composer$iv5, -1159599143, str4);
                        int compositeKeyHash$iv$iv5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv5, 0));
                        CompositionLocalMap localMap$iv$iv5 = $composer$iv5.getCurrentCompositionLocalMap();
                        Modifier materialized$iv$iv5 = ComposedModifierKt.materializeModifier($composer$iv5, modifier$iv5);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        int $changed$iv$iv$iv7 = (($changed$iv$iv5 << 6) & 896) | 6;
                        $composer$iv$iv = $composer$iv5;
                        $composer$iv$iv$iv = $composer$iv5;
                        ComposerKt.sourceInformationMarkerStart($composer$iv5, -553112988, str5);
                        if (!($composer$iv5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer$iv5.startReusableNode();
                        if ($composer$iv5.getInserting()) {
                            function05 = constructor5;
                            $composer$iv5.createNode(function05);
                        } else {
                            function05 = constructor5;
                            $composer$iv5.useNode();
                        }
                        Composer $this$Layout_u24lambda_u240$iv$iv5 = Updater.m6165constructorimpl($composer$iv5);
                        $composer$iv = $composer$iv5;
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, measurePolicy$iv5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, localMap$iv$iv5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv5, Integer.valueOf(compositeKeyHash$iv$iv5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv5, materialized$iv$iv5, ComposeUiNode.INSTANCE.getSetModifier());
                        int i11 = ($changed$iv$iv$iv7 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer$iv5, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        int i12 = ((432 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer$iv5, -1416714715, "C154@5948L500:ConversationHistoryPanel.kt#pwpd1x");
                        Modifier modifier$iv6 = BackgroundKt.m1359backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, new MessageBubbleShape(bubbleBorderRadius, hardCornerAtLeftOrRight, null)), backgroundColor, null, 2, null);
                        ComposerKt.sourceInformationMarkerStart($composer$iv5, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
                        MeasurePolicy measurePolicy$iv6 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                        int $changed$iv$iv6 = (0 << 3) & 112;
                        ComposerKt.sourceInformationMarkerStart($composer$iv5, -1159599143, str4);
                        int compositeKeyHash$iv$iv6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv5, 0));
                        str = str4;
                        CompositionLocalMap localMap$iv$iv6 = $composer$iv5.getCurrentCompositionLocalMap();
                        Modifier materialized$iv$iv6 = ComposedModifierKt.materializeModifier($composer$iv5, modifier$iv6);
                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        int $changed$iv$iv$iv8 = (($changed$iv$iv6 << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer$iv5, -553112988, str5);
                        if (!($composer$iv5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer$iv5.startReusableNode();
                        if ($composer$iv5.getInserting()) {
                            function06 = constructor6;
                            $composer$iv5.createNode(function06);
                        } else {
                            function06 = constructor6;
                            $composer$iv5.useNode();
                        }
                        str2 = str5;
                        Composer $this$Layout_u24lambda_u240$iv$iv6 = Updater.m6165constructorimpl($composer$iv5);
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, measurePolicy$iv6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, localMap$iv$iv6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv6, Integer.valueOf(compositeKeyHash$iv$iv6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv6, materialized$iv$iv6, ComposeUiNode.INSTANCE.getSetModifier());
                        int i13 = ($changed$iv$iv$iv8 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer$iv5, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        int i14 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer$iv5, -1019631767, "C164@6372L54:ConversationHistoryPanel.kt#pwpd1x");
                        MessageBodyTextKt.MessageBodyText((ChatMessageText) message, false, $composer$iv5, 48);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                        $composer$iv5.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                        $composer$iv5.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                        $composer$iv5.endReplaceGroup();
                        $composer$iv$iv2 = $composer$iv5;
                    } else {
                        str = str4;
                        $composer$iv$iv = $composer$iv5;
                        $composer$iv = $composer$iv5;
                        $composer$iv$iv$iv = $composer$iv5;
                        str2 = str5;
                        $composer$iv$iv2 = $composer$iv5;
                        $composer$iv$iv2.startReplaceGroup(-1998262247);
                        $composer$iv$iv2.endReplaceGroup();
                    }
                    $composer$iv$iv2.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv2);
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                $composer$iv$iv$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv5);
                $composer$iv2 = $composer$iv4;
                $composer$iv$iv3 = $composer$iv$iv4;
                measurePolicy$iv$iv2 = measurePolicy$iv$iv;
                it = it2;
                $changed$iv$iv$iv3 = $changed$iv$iv$iv4;
                i6 = i8;
                $i$f$Layout = $i$f$Layout2;
                $composer4 = $composer6;
                str3 = str7;
                $composer$iv3 = $composer$iv$iv$iv4;
                $composer$iv$iv$iv2 = $composer$iv$iv$iv3;
                $composer5 = $composer7;
                str6 = str8;
                str4 = str;
                str5 = str2;
            }
            Composer $composer8 = $composer5;
            Composer $composer$iv$iv$iv5 = $composer$iv$iv$iv2;
            $composer8.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer8);
            ComposerKt.sourceInformationMarkerEnd($composer$iv3);
            $composer$iv$iv$iv5.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv5);
            ComposerKt.sourceInformationMarkerEnd($composer$iv$iv3);
            ComposerKt.sourceInformationMarkerEnd($composer$iv2);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $dirty = $dirty3;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.ConversationHistoryPanelKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationHistoryPanelKt.ConversationHistoryPanel_uFdPcIQ$lambda$10(task, bottomPadding, viewModel, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TinyGardenUiState ConversationHistoryPanel_uFdPcIQ$lambda$0(State<TinyGardenUiState> state) {
        Object thisObj$iv = state.getValue();
        return (TinyGardenUiState) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ConversationHistoryPanel_uFdPcIQ$lambda$9$lambda$4$lambda$3$lambda$2 */
    public static final Unit m464xb2282e5c(Function0 $onDismiss) {
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }
}
