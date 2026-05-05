package com.google.ai.edge.gallery.ui.common.chat;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.C1654Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.data.BuiltInTaskId;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.ModelDownloadStatus;
import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.ModelPageAppBarKt;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatus;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatusType;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: ChatView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÿ\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u000b2$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u00182\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00030\u000b2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0002\b 2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001e2\u0019\b\u0002\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0018¢\u0006\u0002\b 2\b\b\u0002\u0010$\u001a\u00020\u001e2\b\b\u0002\u0010%\u001a\u00020\u00012\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00182\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0002\u0010)\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006*²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\u0010\u00100\u001a\b\u0012\u0004\u0012\u0002010\rX\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020\u001eX\u008a\u008e\u0002"}, m922d2 = {"TAG", "", "ChatView", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "viewModel", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatViewModel;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "onSendMessage", "Lkotlin/Function2;", "Lcom/google/ai/edge/gallery/data/Model;", "", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "onRunAgainClicked", "onBenchmarkClicked", "Lkotlin/Function4;", "", "navigateUp", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onResetSessionClicked", "Lkotlin/Function1;", "onStreamImageMessage", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageImage;", "onStopButtonClicked", "onSkillClicked", "showStopButtonInInputWhenInProgress", "", "composableBelowMessageList", "Landroidx/compose/runtime/Composable;", "showImagePicker", "showAudioPicker", "emptyStateComposable", "allowEditingSystemPrompt", "curSystemPrompt", "onSystemPromptChanged", "sendMessageTrigger", "Lcom/google/ai/edge/gallery/ui/common/chat/SendMessageTrigger;", "(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/common/chat/ChatViewModel;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function3;ZZLkotlin/jvm/functions/Function3;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/google/ai/edge/gallery/ui/common/chat/SendMessageTrigger;Landroidx/compose/runtime/Composer;IIII)V", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatUiState;", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "selectedImageIndex", "allImageViewerImages", "Landroid/graphics/Bitmap;", "showImageViewer", "navigatingUp"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatViewKt {
    private static final String TAG = "AGChatView";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$62(Task task, ChatViewModel chatViewModel, ModelManagerViewModel modelManagerViewModel, Function2 function2, Function2 function22, Function4 function4, Function0 function0, Modifier modifier, Function1 function1, Function2 function23, Function1 function12, Function0 function02, boolean z, Function3 function3, boolean z2, boolean z3, Function3 function32, boolean z4, String str, Function1 function13, SendMessageTrigger sendMessageTrigger, int i, int i2, int i3, int i4, Composer composer, int i5) {
        ChatView(task, chatViewModel, modelManagerViewModel, function2, function22, function4, function0, modifier, function1, function23, function12, function02, z, function3, z2, z3, function32, z4, str, function13, sendMessageTrigger, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$1$lambda$0(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$3$lambda$2(Model model, ChatMessageImage chatMessageImage) {
        Intrinsics.checkNotNullParameter(model, "<unused var>");
        Intrinsics.checkNotNullParameter(chatMessageImage, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$5$lambda$4(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$9$lambda$8(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:338:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0787  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ChatView(final com.google.ai.edge.gallery.data.Task r54, final com.google.ai.edge.gallery.ui.common.chat.ChatViewModel r55, final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r56, final kotlin.jvm.functions.Function2<? super com.google.ai.edge.gallery.data.Model, ? super java.util.List<? extends com.google.ai.edge.gallery.ui.common.chat.ChatMessage>, kotlin.Unit> r57, final kotlin.jvm.functions.Function2<? super com.google.ai.edge.gallery.data.Model, ? super com.google.ai.edge.gallery.ui.common.chat.ChatMessage, kotlin.Unit> r58, final kotlin.jvm.functions.Function4<? super com.google.ai.edge.gallery.data.Model, ? super com.google.ai.edge.gallery.ui.common.chat.ChatMessage, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r59, final kotlin.jvm.functions.Function0<kotlin.Unit> r60, androidx.compose.p000ui.Modifier r61, kotlin.jvm.functions.Function1<? super com.google.ai.edge.gallery.data.Model, kotlin.Unit> r62, kotlin.jvm.functions.Function2<? super com.google.ai.edge.gallery.data.Model, ? super com.google.ai.edge.gallery.ui.common.chat.ChatMessageImage, kotlin.Unit> r63, kotlin.jvm.functions.Function1<? super com.google.ai.edge.gallery.data.Model, kotlin.Unit> r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, boolean r66, kotlin.jvm.functions.Function3<? super com.google.ai.edge.gallery.data.Model, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r67, boolean r68, boolean r69, kotlin.jvm.functions.Function3<? super com.google.ai.edge.gallery.data.Model, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r70, boolean r71, java.lang.String r72, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r73, com.google.ai.edge.gallery.ui.common.chat.SendMessageTrigger r74, androidx.compose.runtime.Composer r75, final int r76, final int r77, final int r78, final int r79) {
        /*
            Method dump skipped, instruction units count: 2072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt.ChatView(com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.ui.common.chat.ChatViewModel, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function4, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function3, boolean, boolean, kotlin.jvm.functions.Function3, boolean, java.lang.String, kotlin.jvm.functions.Function1, com.google.ai.edge.gallery.ui.common.chat.SendMessageTrigger, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    private static final ChatUiState ChatView$lambda$10(State<ChatUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ChatUiState) thisObj$iv;
    }

    private static final ModelManagerUiState ChatView$lambda$11(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final int ChatView$lambda$13(MutableIntState $selectedImageIndex$delegate) {
        MutableIntState $this$getValue$iv = $selectedImageIndex$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final List<Bitmap> ChatView$lambda$16(MutableState<List<Bitmap>> mutableState) {
        MutableState<List<Bitmap>> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean ChatView$lambda$19(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ChatView$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChatView$lambda$22(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ChatView$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job ChatView$lambda$25$lambda$24(Function0 $navigateUp, CoroutineScope $scope, MutableState $navigatingUp$delegate, Task $task, ModelManagerViewModel $modelManagerViewModel, Context $context) {
        ChatView$lambda$23($navigatingUp$delegate, true);
        $navigateUp.invoke();
        return BuildersKt__Builders_commonKt.launch$default($scope, Dispatchers.getDefault(), null, new ChatViewKt$ChatView$handleNavigateUp$1$1$1($task, $modelManagerViewModel, $context, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$29$lambda$28(Model $selectedModel, Function0 $handleNavigateUp, State $modelManagerUiState$delegate, State $uiState$delegate) {
        ModelInitializationStatus modelInitializationStatus = ChatView$lambda$11($modelManagerUiState$delegate).getModelInitializationStatus().get($selectedModel.getName());
        boolean isModelInitializing = (modelInitializationStatus != null ? modelInitializationStatus.getStatus() : null) == ModelInitializationStatusType.INITIALIZING;
        if (!isModelInitializing && !ChatView$lambda$10($uiState$delegate).getInProgress()) {
            $handleNavigateUp.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$36(final Task $task, final Model $selectedModel, final ModelManagerViewModel $modelManagerViewModel, final Function0 $handleNavigateUp, final Context $context, Function1 $onResetSessionClicked, final ChatViewModel $viewModel, boolean $allowEditingSystemPrompt, String $curSystemPrompt, Function1 $onSystemPromptChanged, State $uiState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C191@7864L22,192@7914L255,175@7142L696,166@6753L1584:ChatView.kt#ouynps");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(885095963, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ChatView.<anonymous> (ChatView.kt:166)");
            }
            boolean zIsResettingSession = ChatView$lambda$10($uiState$delegate).isResettingSession();
            boolean inProgress = ChatView$lambda$10($uiState$delegate).getInProgress();
            boolean preparing = ChatView$lambda$10($uiState$delegate).getPreparing();
            ComposerKt.sourceInformationMarkerStart($composer, 173731665, "CC(remember):ChatView.kt#9igjgp");
            boolean invalid$iv = $composer.changed($handleNavigateUp);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatViewKt.ChatView$lambda$36$lambda$31$lambda$30($handleNavigateUp);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            Function0 function0 = (Function0) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 173733498, "CC(remember):ChatView.kt#9igjgp");
            boolean invalid$iv2 = $composer.changedInstance($modelManagerViewModel) | $composer.changedInstance($context) | $composer.changedInstance($task);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatViewKt.ChatView$lambda$36$lambda$33$lambda$32($modelManagerViewModel, $context, $task, (Model) obj, (Model) obj2);
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            Function2 function2 = (Function2) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 173709235, "CC(remember):ChatView.kt#9igjgp");
            boolean invalid$iv3 = $composer.changedInstance($task) | $composer.changedInstance($viewModel) | $composer.changedInstance($selectedModel);
            Object it$iv3 = $composer.rememberedValue();
            if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatViewKt.ChatView$lambda$36$lambda$35$lambda$34($task, $viewModel, $selectedModel, (Map) obj, (Map) obj2);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ModelPageAppBarKt.ModelPageAppBar($task, $selectedModel, $modelManagerViewModel, function0, function2, inProgress, preparing, null, zIsResettingSession, $onResetSessionClicked, true, false, false, (Function2) it$iv3, $allowEditingSystemPrompt, $curSystemPrompt, $onSystemPromptChanged, $composer, 0, 6, 6272);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$36$lambda$35$lambda$34(Task $task, ChatViewModel $viewModel, Model $selectedModel, Map old, Map map) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(map, "new");
        Map<String, ? extends Object> mutableMap = MapsKt.toMutableMap(old);
        Map<String, ? extends Object> mutableMap2 = MapsKt.toMutableMap(map);
        if (!Intrinsics.areEqual($task.getId(), BuiltInTaskId.LLM_TINY_GARDEN)) {
            mutableMap.remove(ConfigKeys.INSTANCE.getRESET_CONVERSATION_TURN_COUNT().getLabel());
            mutableMap2.remove(ConfigKeys.INSTANCE.getRESET_CONVERSATION_TURN_COUNT().getLabel());
        }
        $viewModel.addConfigChangedMessage(mutableMap, mutableMap2, $selectedModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$36$lambda$31$lambda$30(Function0 $handleNavigateUp) {
        $handleNavigateUp.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$36$lambda$33$lambda$32(ModelManagerViewModel $modelManagerViewModel, Context $context, Task $task, Model prevModel, Model curModel) {
        Intrinsics.checkNotNullParameter(prevModel, "prevModel");
        Intrinsics.checkNotNullParameter(curModel, "curModel");
        if (!Intrinsics.areEqual(prevModel.getName(), curModel.getName())) {
            ModelManagerViewModel.cleanupModel$default($modelManagerViewModel, $context, $task, prevModel, null, null, 24, null);
        }
        $modelManagerViewModel.selectModel(curModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$61(final Model $selectedModel, Function3 $composableBelowMessageList, State $modelManagerUiState$delegate, final ModelManagerViewModel $modelManagerViewModel, final Task $task, final ChatViewModel $viewModel, final Function2 $onSendMessage, final Function2 $onRunAgainClicked, final Function4 $onBenchmarkClicked, final Function0 $navigateUp, final Function2 $onStreamImageMessage, final Function1 $onStopButtonClicked, final Function0 $onSkillClicked, final boolean $showStopButtonInInputWhenInProgress, final boolean $showImagePicker, final boolean $showAudioPicker, final Function3 $emptyStateComposable, final MutableIntState $selectedImageIndex$delegate, final MutableState $allImageViewerImages$delegate, final MutableState $showImageViewer$delegate, final PaddingValues innerPadding, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        ComposerKt.sourceInformation($composer, "C204@8371L4063:ChatView.kt#ouynps");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(innerPadding) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1377801008, $dirty2, -1, "com.google.ai.edge.gallery.ui.common.chat.ChatView.<anonymous> (ChatView.kt:204)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier modifier$iv = Modifier.INSTANCE;
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
                $composer.createNode(constructor);
            } else {
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
            ComposerKt.sourceInformationMarkerStart($composer, 1726188000, "C207@8479L41,209@8594L11,209@8528L2185,263@10850L28,264@10942L28,265@10993L1435,261@10744L1684:ChatView.kt#ouynps");
            ModelDownloadStatus curModelDownloadStatus = ChatView$lambda$11($modelManagerUiState$delegate).getModelDownloadStatus().get($selectedModel.getName());
            $composableBelowMessageList.invoke($selectedModel, $composer, 0);
            Modifier modifier$iv2 = BackgroundKt.m1359backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal horizontalAlignment$iv = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicy$iv2 = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            int $changed$iv$iv2 = (0 << 3) & 112;
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
                function0 = constructor2;
                $composer.createNode(function0);
            } else {
                function0 = constructor2;
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
            int i4 = ((0 >> 6) & 112) | 6;
            final ColumnScope $this$ChatView_u24lambda_u2461_u24lambda_u2460_u24lambda_u2446 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -570287656, "C212@8745L1960,210@8626L2079:ChatView.kt#ouynps");
            AnimatedContentKt.AnimatedContent(Boolean.valueOf((curModelDownloadStatus != null ? curModelDownloadStatus.getStatus() : null) == ModelDownloadStatusType.SUCCEEDED), null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1477406511, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return ChatViewKt.ChatView$lambda$61$lambda$60$lambda$46$lambda$45($this$ChatView_u24lambda_u2461_u24lambda_u2460_u24lambda_u2446, $modelManagerViewModel, $task, $selectedModel, $viewModel, innerPadding, $onSendMessage, $onRunAgainClicked, $onBenchmarkClicked, $navigateUp, $onStreamImageMessage, $onStopButtonClicked, $onSkillClicked, $showStopButtonInInputWhenInProgress, $showImagePicker, $showAudioPicker, $emptyStateComposable, $selectedImageIndex$delegate, $allImageViewerImages$delegate, $showImageViewer$delegate, (AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 1572864, 62);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            boolean zChatView$lambda$19 = ChatView$lambda$19($showImageViewer$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -775525582, "CC(remember):ChatView.kt#9igjgp");
            Object it$iv = $composer.rememberedValue();
            if (it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(ChatViewKt.ChatView$lambda$61$lambda$60$lambda$48$lambda$47(((Integer) obj).intValue()));
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically$default(null, (Function1) it$iv, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            ComposerKt.sourceInformationMarkerStart($composer, -775522638, "CC(remember):ChatView.kt#9igjgp");
            Object it$iv2 = $composer.rememberedValue();
            if (it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(ChatViewKt.ChatView$lambda$61$lambda$60$lambda$50$lambda$49(((Integer) obj).intValue()));
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AnimatedVisibilityKt.AnimatedVisibility(zChatView$lambda$19, (Modifier) null, enterTransitionPlus, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) it$iv2, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-43116018, true, new Function3() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatViewKt.ChatView$lambda$61$lambda$60$lambda$59(innerPadding, $selectedImageIndex$delegate, $allImageViewerImages$delegate, $showImageViewer$delegate, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 200064, 18);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$61$lambda$60$lambda$46$lambda$45(ColumnScope $this_Column, ModelManagerViewModel $modelManagerViewModel, Task $task, final Model $selectedModel, final ChatViewModel $viewModel, PaddingValues $innerPadding, final Function2 $onSendMessage, Function2 $onRunAgainClicked, Function4 $onBenchmarkClicked, Function0 $navigateUp, Function2 $onStreamImageMessage, final Function1 $onStopButtonClicked, Function0 $onSkillClicked, boolean $showStopButtonInInputWhenInProgress, boolean $showImagePicker, boolean $showAudioPicker, Function3 $emptyStateComposable, final MutableIntState $selectedImageIndex$delegate, final MutableState $allImageViewerImages$delegate, final MutableState $showImageViewer$delegate, AnimatedContentScope AnimatedContent, boolean targetState, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation($composer, "C:ChatView.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1477406511, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ChatView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatView.kt:213)");
        }
        if (targetState) {
            $composer.startReplaceGroup(-1407301738);
            ComposerKt.sourceInformation($composer, "223@9183L53,227@9441L318,236@9799L38,237@9873L200,216@8876L1565");
            Modifier modifierWeight$default = ColumnScope.weight$default($this_Column, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -1846503836, "CC(remember):ChatView.kt#9igjgp");
            boolean invalid$iv = $composer.changed($onSendMessage);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatViewKt.m490x27fa1a54($onSendMessage, (Model) obj, (List) obj2);
                    }
                };
                $composer.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            Function2 function2 = (Function2) it$iv;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1846495315, "CC(remember):ChatView.kt#9igjgp");
            boolean invalid$iv2 = $composer.changedInstance($viewModel) | $composer.changedInstance($selectedModel);
            Object it$iv2 = $composer.rememberedValue();
            if (invalid$iv2 || it$iv2 == Composer.INSTANCE.getEmpty()) {
                Object value$iv2 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ChatViewKt.m491x888629ad($viewModel, $selectedModel, ((Integer) obj).intValue());
                    }
                };
                $composer.updateRememberedValue(value$iv2);
                it$iv2 = value$iv2;
            }
            Function1 function1 = (Function1) it$iv2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1846484139, "CC(remember):ChatView.kt#9igjgp");
            boolean invalid$iv3 = $composer.changed($onStopButtonClicked) | $composer.changedInstance($selectedModel);
            Object it$iv3 = $composer.rememberedValue();
            if (invalid$iv3 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatViewKt.m492xb24f8f46($onStopButtonClicked, $selectedModel);
                    }
                };
                $composer.updateRememberedValue(value$iv3);
                it$iv3 = value$iv3;
            }
            Function0 function0 = (Function0) it$iv3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1846481609, "CC(remember):ChatView.kt#9igjgp");
            Object it$iv4 = $composer.rememberedValue();
            if (it$iv4 == Composer.INSTANCE.getEmpty()) {
                Object value$iv4 = new Function2() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatViewKt.m493xdc18f4ca($selectedImageIndex$delegate, $allImageViewerImages$delegate, $showImageViewer$delegate, (List) obj, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(value$iv4);
                it$iv4 = value$iv4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ChatPanelKt.ChatPanel($modelManagerViewModel, $task, $selectedModel, $viewModel, $innerPadding, function2, $onRunAgainClicked, $onBenchmarkClicked, $navigateUp, modifierWeight$default, $onStreamImageMessage, function1, function0, $onSkillClicked, (Function2) it$iv4, $showStopButtonInInputWhenInProgress, $showImagePicker, $showAudioPicker, $emptyStateComposable, $composer, 0, 24576, 0);
            $composer.endReplaceGroup();
        } else {
            if (targetState) {
                $composer.startReplaceGroup(-1846515118);
                $composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            $composer.startReplaceGroup(-1846461345);
            ComposerKt.sourceInformation($composer, "251@10507L176");
            ModelDownloadStatusInfoPanelKt.ModelDownloadStatusInfoPanel($selectedModel, $task, $modelManagerViewModel, $composer, 0);
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ChatView$lambda$61$lambda$60$lambda$46$lambda$45$lambda$38$lambda$37 */
    public static final Unit m490x27fa1a54(Function2 $onSendMessage, Model model, List messages) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(messages, "messages");
        $onSendMessage.invoke(model, messages);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ChatView$lambda$61$lambda$60$lambda$46$lambda$45$lambda$40$lambda$39 */
    public static final Unit m491x888629ad(ChatViewModel $viewModel, Model $selectedModel, int averageFps) {
        $viewModel.addMessage($selectedModel, new ChatMessageInfo("Live camera session ended. Average FPS: " + averageFps));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ChatView$lambda$61$lambda$60$lambda$46$lambda$45$lambda$42$lambda$41 */
    public static final Unit m492xb24f8f46(Function1 $onStopButtonClicked, Model $selectedModel) {
        $onStopButtonClicked.invoke($selectedModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ChatView$lambda$61$lambda$60$lambda$46$lambda$45$lambda$44$lambda$43 */
    public static final Unit m493xdc18f4ca(MutableIntState $selectedImageIndex$delegate, MutableState $allImageViewerImages$delegate, MutableState $showImageViewer$delegate, List bitmaps, int selectedBitmapIndex) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        $selectedImageIndex$delegate.setIntValue(selectedBitmapIndex);
        $allImageViewerImages$delegate.setValue(bitmaps);
        ChatView$lambda$20($showImageViewer$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChatView$lambda$61$lambda$60$lambda$48$lambda$47(int fullHeight) {
        return fullHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChatView$lambda$61$lambda$60$lambda$50$lambda$49(int fullHeight) {
        return fullHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChatView$lambda$61$lambda$60$lambda$59$lambda$52$lambda$51(MutableState $allImageViewerImages$delegate) {
        return ChatView$lambda$16($allImageViewerImages$delegate).size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$61$lambda$60$lambda$59(PaddingValues $innerPadding, MutableIntState $selectedImageIndex$delegate, final MutableState $allImageViewerImages$delegate, final MutableState $showImageViewer$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C268@11074L29,267@11030L132,271@11191L33,272@11233L1187:ChatView.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43116018, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ChatView.<anonymous>.<anonymous>.<anonymous> (ChatView.kt:266)");
        }
        int iChatView$lambda$13 = ChatView$lambda$13($selectedImageIndex$delegate);
        ComposerKt.sourceInformationMarkerStart($composer, 1515182283, "CC(remember):ChatView.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv == Composer.INSTANCE.getEmpty()) {
            Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(ChatViewKt.ChatView$lambda$61$lambda$60$lambda$59$lambda$52$lambda$51($allImageViewerImages$delegate));
                }
            };
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        final PagerState pagerState = PagerStateKt.rememberPagerState(iChatView$lambda$13, 0.0f, (Function0) it$iv, $composer, 384, 2);
        ComposerKt.sourceInformationMarkerStart($composer, 1515186031, "CC(remember):ChatView.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 == Composer.INSTANCE.getEmpty()) {
            Object value$iv2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            $composer.updateRememberedValue(value$iv2);
            it$iv2 = value$iv2;
        }
        MutableState scrollEnabled = (MutableState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier modifier$iv = PaddingKt.m1992paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, $innerPadding.getTop(), 0.0f, 0.0f, 13, null);
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
        int i2 = ((0 >> 6) & 112) | 6;
        BoxScope $this$ChatView_u24lambda_u2461_u24lambda_u2460_u24lambda_u2459_u24lambda_u2458 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, 1626991035, "C277@11539L274,273@11334L479,292@12034L11,291@11969L107,289@11886L27,288@11852L558:ChatView.kt#ouynps");
        boolean zBooleanValue = ((Boolean) scrollEnabled.getValue()).booleanValue();
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        long jM6941getBlack0d7_KjU = Color.INSTANCE.m6941getBlack0d7_KjU();
        Modifier materialized$iv$iv2 = BackgroundKt.m1359backgroundbw27NRU$default(modifierFillMaxSize$default, Color.m6913copywmQWz5c(jM6941getBlack0d7_KjU, (14 & 1) != 0 ? Color.m6917getAlphaimpl(jM6941getBlack0d7_KjU) : 0.95f, (14 & 2) != 0 ? Color.m6921getRedimpl(jM6941getBlack0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m6920getGreenimpl(jM6941getBlack0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m6918getBlueimpl(jM6941getBlack0d7_KjU) : 0.0f), null, 2, null);
        PagerKt.m2281HorizontalPager8jOkeI(pagerState, materialized$iv$iv2, null, null, 0, 0.0f, null, null, zBooleanValue, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(775342229, true, new Function4() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ChatViewKt.ChatView$lambda$61$lambda$60$lambda$59$lambda$58$lambda$55($allImageViewerImages$delegate, pagerState, (PagerScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }, $composer, 54), $composer, 48, 24576, 16124);
        IconButtonColors iconButtonColorsM4047iconButtonColorsro_MJ88 = IconButtonDefaults.INSTANCE.m4047iconButtonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant(), 0L, 0L, 0L, $composer, IconButtonDefaults.$stable << 12, 14);
        Modifier modifierAlign = $this$ChatView_u24lambda_u2461_u24lambda_u2460_u24lambda_u2459_u24lambda_u2458.align(OffsetKt.m1944offsetVpY3zN4(Modifier.INSTANCE, C1654Dp.m9788constructorimpl(-8), C1654Dp.m9788constructorimpl(8)), Alignment.INSTANCE.getTopEnd());
        ComposerKt.sourceInformationMarkerStart($composer, -1748615121, "CC(remember):ChatView.kt#9igjgp");
        Object it$iv3 = $composer.rememberedValue();
        if (it$iv3 == Composer.INSTANCE.getEmpty()) {
            Object value$iv3 = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatViewKt.m494x15b3e652($showImageViewer$delegate);
                }
            };
            $composer.updateRememberedValue(value$iv3);
            it$iv3 = value$iv3;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        IconButtonKt.IconButton((Function0) it$iv3, modifierAlign, false, iconButtonColorsM4047iconButtonColorsro_MJ88, null, null, ComposableSingletons$ChatViewKt.INSTANCE.getLambda$1892102066$app_debug(), $composer, 1572870, 52);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatView$lambda$61$lambda$60$lambda$59$lambda$58$lambda$55(MutableState $allImageViewerImages$delegate, PagerState $pagerState, PagerScope HorizontalPager, int page, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation($composer, "C*279@11617L170:ChatView.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(775342229, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ChatView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatView.kt:278)");
        }
        Bitmap image = ChatView$lambda$16($allImageViewerImages$delegate).get(page);
        ZoomableImageKt.ZoomableImage(AndroidImageBitmap_androidKt.asImageBitmap(image), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, null, $pagerState, false, false, false, null, $composer, 48, 988);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ChatView$lambda$61$lambda$60$lambda$59$lambda$58$lambda$57$lambda$56 */
    public static final Unit m494x15b3e652(MutableState $showImageViewer$delegate) {
        ChatView$lambda$20($showImageViewer$delegate, false);
        return Unit.INSTANCE;
    }
}
