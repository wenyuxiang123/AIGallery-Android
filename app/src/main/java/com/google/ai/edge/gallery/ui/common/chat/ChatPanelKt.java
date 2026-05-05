package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.TimerKt;
import androidx.compose.material.icons.rounded.RefreshKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.PrimitiveResources_androidKt;
import androidx.compose.p000ui.res.StringResources_androidKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.PromptTemplate;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.AudioAnimationKt;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.ui.theme.ThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

/* JADX INFO: compiled from: ChatPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0096\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\r2B\u0010\u0011\u001a>\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\r2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192>\b\u0002\u0010\"\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020#0\u000e¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020'2\u0019\b\u0002\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u001f¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u0010,\u001a \u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020'H\u0082@¢\u0006\u0002\u00101¨\u00062²\u0006\n\u00103\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020'X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020'X\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020'X\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020'X\u008a\u008e\u0002"}, m922d2 = {"ChatPanel", "", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "selectedModel", "Lcom/google/ai/edge/gallery/data/Model;", "viewModel", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatViewModel;", "innerPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "onSendMessage", "Lkotlin/Function2;", "", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "onRunAgainClicked", "onBenchmarkClicked", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "warmUpIterations", "benchmarkIterations", "navigateUp", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onStreamImageMessage", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageImage;", "onStreamEnd", "Lkotlin/Function1;", "onStopButtonClicked", "onSkillClicked", "onImageSelected", "Landroid/graphics/Bitmap;", "bitmaps", "selectedBitmapIndex", "showStopButtonInInputWhenInProgress", "", "showImagePicker", "showAudioPicker", "emptyStateComposable", "Landroidx/compose/runtime/Composable;", "(Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/ui/common/chat/ChatViewModel;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "scrollToBottom", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "animate", "(Landroidx/compose/foundation/lazy/LazyListState;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug", "uiState", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatUiState;", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;", "curMessage", "", "showBenchmarkConfigsDialog", "showErrorDialog", "showAudioRecorder", "curAmplitude", "pickedImagesCount", "pickedAudioClipsCount", "showImageLimitBanner"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ChatPanelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$92(ModelManagerViewModel modelManagerViewModel, Task task, Model model, ChatViewModel chatViewModel, PaddingValues paddingValues, Function2 function2, Function2 function22, Function4 function4, Function0 function0, Modifier modifier, Function2 function23, Function1 function1, Function0 function02, Function0 function03, Function2 function24, boolean z, boolean z2, boolean z3, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        ChatPanel(modelManagerViewModel, task, model, chatViewModel, paddingValues, function2, function22, function4, function0, modifier, function23, function1, function02, function03, function24, z, z2, z3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$1$lambda$0(Model model, ChatMessageImage chatMessageImage) {
        Intrinsics.checkNotNullParameter(model, "<unused var>");
        Intrinsics.checkNotNullParameter(chatMessageImage, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$3$lambda$2(int it) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$9$lambda$8(List list, int i) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:433:0x0ff3  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0fff  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x1005  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x1153  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x115c  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x115e  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x116b  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x116e  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x117b  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x1187  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x11ab  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x11bb  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x11d4  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x11d6  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x122d  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x122f  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x127f  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x1293  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x12bd  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x12cb  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x12f1  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x1303  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x132c  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x133e  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x136c  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x137e  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x1463  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x14ae  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x14c3  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1546  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x155b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ChatPanel(final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r157, final com.google.ai.edge.gallery.data.Task r158, final com.google.ai.edge.gallery.data.Model r159, final com.google.ai.edge.gallery.ui.common.chat.ChatViewModel r160, final androidx.compose.foundation.layout.PaddingValues r161, final kotlin.jvm.functions.Function2<? super com.google.ai.edge.gallery.data.Model, ? super java.util.List<? extends com.google.ai.edge.gallery.ui.common.chat.ChatMessage>, kotlin.Unit> r162, final kotlin.jvm.functions.Function2<? super com.google.ai.edge.gallery.data.Model, ? super com.google.ai.edge.gallery.ui.common.chat.ChatMessage, kotlin.Unit> r163, final kotlin.jvm.functions.Function4<? super com.google.ai.edge.gallery.data.Model, ? super com.google.ai.edge.gallery.ui.common.chat.ChatMessage, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r164, final kotlin.jvm.functions.Function0<kotlin.Unit> r165, androidx.compose.p000ui.Modifier r166, kotlin.jvm.functions.Function2<? super com.google.ai.edge.gallery.data.Model, ? super com.google.ai.edge.gallery.ui.common.chat.ChatMessageImage, kotlin.Unit> r167, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r168, kotlin.jvm.functions.Function0<kotlin.Unit> r169, kotlin.jvm.functions.Function0<kotlin.Unit> r170, kotlin.jvm.functions.Function2<? super java.util.List<android.graphics.Bitmap>, ? super java.lang.Integer, kotlin.Unit> r171, boolean r172, boolean r173, boolean r174, kotlin.jvm.functions.Function3<? super com.google.ai.edge.gallery.data.Model, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r175, androidx.compose.runtime.Composer r176, final int r177, final int r178, final int r179) {
        /*
    public static final void ChatPanel(final com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel r157, final com.google.ai.edge.gallery.data.Task r158, final com.google.ai.edge.gallery.data.Model r159, final com.google.ai.edge.gallery.ui.common.chat.ChatViewModel r160, final androidx.compose.foundation.layout.PaddingValues r161, final kotlin.jvm.functions.Function2<? super com.google.ai.edge.gallery.data.Model, ? super java.util.List<? extends com.google.ai.edge.gallery.ui.common.chat.ChatMessage>, kotlin.Unit> r162, final kotlin.jvm.functions.Function2<? super com.google.ai.edge.gallery.data.Model, ? super com.google.ai.edge.gallery.ui.common.chat.ChatMessage, kotlin.Unit> r163, final kotlin.jvm.functions.Function4<? super com.google.ai.edge.gallery.data.Model, ? super com.google.ai.edge.gallery.ui.common.chat.ChatMessage, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r164, final kotlin.jvm.functions.Function0<kotlin.Unit> r165, androidx.compose.p000ui.Modifier r166, kotlin.jvm.functions.Function2<? super com.google.ai.edge.gallery.data.Model, ? super com.google.ai.edge.gallery.ui.common.chat.ChatMessageImage, kotlin.Unit> r167, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r168, kotlin.jvm.functions.Function0<kotlin.Unit> r169, kotlin.jvm.functions.Function0<kotlin.Unit> r170, kotlin.jvm.functions.Function2<? super java.util.List<android.graphics.Bitmap>, ? super java.lang.Integer, kotlin.Unit> r171, boolean r172, boolean r173, boolean r174, kotlin.jvm.functions.Function3<? super com.google.ai.edge.gallery.data.Model, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r175, androidx.compose.runtime.Composer r176, final int r177, final int r178, final int r179) {
            // Method dump skipped - placeholder implementation
        }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatUiState ChatPanel$lambda$10(State<ChatUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ChatUiState) thisObj$iv;
    }

    private static final ModelManagerUiState ChatPanel$lambda$11(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    private static final String ChatPanel$lambda$16(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final boolean ChatPanel$lambda$19(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatPanel$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatPanel$lambda$23(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatPanel$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatPanel$lambda$26(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    private static final void ChatPanel$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int ChatPanel$lambda$29(MutableIntState $curAmplitude$delegate) {
        MutableIntState $this$getValue$iv = $curAmplitude$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final int ChatPanel$lambda$32(MutableIntState $pickedImagesCount$delegate) {
        MutableIntState $this$getValue$iv = $pickedImagesCount$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private static final int ChatPanel$lambda$35(MutableIntState $pickedAudioClipsCount$delegate) {
        MutableIntState $this$getValue$iv = $pickedAudioClipsCount$delegate;
        return $this$getValue$iv.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChatPanel$lambda$38(MutableState<Boolean> mutableState) {
        MutableState<Boolean> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatPanel$lambda$39(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChatPanel$lambda$85$lambda$49$lambda$48(int it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$51$lambda$50(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(0.8f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$52(MutableIntState $curAmplitude$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C263@10919L11,263@10880L85:ChatPanel.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-390566245, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ChatPanel.<anonymous>.<anonymous> (ChatPanel.kt:263)");
        }
        AudioAnimationKt.m10823AudioAnimationKTwxG1Y(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), ChatPanel$lambda$29($curAmplitude$delegate), null, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$84$lambda$67$lambda$54$lambda$53(String $cdChatPanel, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, $cdChatPanel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$84$lambda$67$lambda$65$lambda$64(final List $messages, final Task $task, final Function2 $onSendMessage, final Model $selectedModel, final Function2 $onImageSelected, final State $uiState$delegate, final Function2 $onRunAgainClicked, final MutableState $benchmarkMessage, final MutableState $showBenchmarkConfigsDialog$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.items($messages.size(), null, new Function1<Integer, Object>() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatPanelKt$ChatPanel$lambda$85$lambda$84$lambda$67$lambda$65$lambda$64$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                $messages.get(index);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatPanelKt$ChatPanel$lambda$85$lambda$84$lambda$67$lambda$65$lambda$64$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Alignment.Horizontal hAlign;
                float extraPaddingEnd;
                Function0<ComposeUiNode> function0;
                Composer $composer$iv$iv;
                float bubbleBorderRadius;
                String str;
                Composer $composer2;
                boolean hardCornerAtLeftOrRight;
                Composer $composer$iv$iv$iv;
                Composer $composer$iv;
                Function0<ComposeUiNode> function02;
                Function0<ComposeUiNode> function03;
                String str2;
                int $changed2;
                Function0<ComposeUiNode> function04;
                Modifier messageBubbleModifier;
                ComposerKt.sourceInformation($composer, "CN(it)214@10668L26:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2039820996, $dirty, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                int $changed3 = ($dirty & 14) | ($dirty & 112);
                final ChatMessage message = (ChatMessage) $messages.get(it);
                $composer.startReplaceGroup(-514660554);
                ComposerKt.sourceInformation($composer, "C*280@11609L33,282@11759L12,309@12939L52,311@13005L7137:ChatPanel.kt#ouynps");
                ComposerKt.sourceInformationMarkerStart($composer, -1679177602, "CC(remember):ChatPanel.kt#9igjgp");
                Object it$iv = $composer.rememberedValue();
                if (it$iv == Composer.INSTANCE.getEmpty()) {
                    Object value$iv = SnapshotIntStateKt.mutableIntStateOf(0);
                    $composer.updateRememberedValue(value$iv);
                    it$iv = value$iv;
                }
                MutableIntState imageHistoryCurIndex = (MutableIntState) it$iv;
                ComposerKt.sourceInformationMarkerEnd($composer);
                Alignment.Horizontal hAlign2 = Alignment.INSTANCE.getEnd();
                long backgroundColor = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11241getUserBubbleBgColor0d7_KjU();
                boolean hardCornerAtLeftOrRight2 = false;
                float extraPaddingStart = C1654Dp.m9788constructorimpl(48);
                float extraPaddingEnd2 = C1654Dp.m9788constructorimpl(0);
                if (message.getSide() == ChatSide.AGENT) {
                    $composer.startReplaceGroup(-514528216);
                    ComposerKt.sourceInformation($composer, "288@12054L12");
                    Alignment.Horizontal hAlign3 = Alignment.INSTANCE.getStart();
                    backgroundColor = ThemeKt.getCustomColors(MaterialTheme.INSTANCE, $composer, MaterialTheme.$stable).m11228getAgentBubbleBgColor0d7_KjU();
                    hardCornerAtLeftOrRight2 = true;
                    extraPaddingStart = C1654Dp.m9788constructorimpl(0);
                    extraPaddingEnd = (message.getType() == ChatMessageType.LOADING || message.getType() == ChatMessageType.WEBVIEW || message.getType() == ChatMessageType.COLLAPSABLE_PROGRESS_PANEL) ? extraPaddingEnd2 : C1654Dp.m9788constructorimpl(48);
                    $composer.endReplaceGroup();
                    hAlign = hAlign3;
                } else if (message.getSide() == ChatSide.SYSTEM) {
                    $composer.startReplaceGroup(-513988320);
                    $composer.endReplaceGroup();
                    extraPaddingStart = C1654Dp.m9788constructorimpl(24);
                    extraPaddingEnd = C1654Dp.m9788constructorimpl(24);
                    if (message.getType() == ChatMessageType.PROMPT_TEMPLATES) {
                        extraPaddingStart = C1654Dp.m9788constructorimpl(12);
                        extraPaddingEnd = C1654Dp.m9788constructorimpl(12);
                        hAlign = hAlign2;
                    } else {
                        hAlign = hAlign2;
                    }
                } else {
                    $composer.startReplaceGroup(-526416251);
                    $composer.endReplaceGroup();
                    hAlign = hAlign2;
                    extraPaddingEnd = extraPaddingEnd2;
                }
                long backgroundColor2 = message.getType() == ChatMessageType.IMAGE ? Color.INSTANCE.m6950getTransparent0d7_KjU() : backgroundColor;
                float bubbleBorderRadius2 = PrimitiveResources_androidKt.dimensionResource(C2421R.dimen.chat_bubble_corner_radius, $composer, 0);
                float extraPaddingStart2 = 6;
                Modifier modifier$iv = PaddingKt.m1991paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1654Dp.m9788constructorimpl(C1654Dp.m9788constructorimpl(12) + extraPaddingStart), C1654Dp.m9788constructorimpl(6), C1654Dp.m9788constructorimpl(C1654Dp.m9788constructorimpl(12) + extraPaddingEnd), C1654Dp.m9788constructorimpl(extraPaddingStart2));
                Alignment.Horizontal horizontalAlignment$iv = hAlign;
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
                MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                int $changed$iv$iv = (0 << 3) & 112;
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int compositeKeyHash$iv$iv = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
                Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
                boolean hardCornerAtLeftOrRight3 = hardCornerAtLeftOrRight2;
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
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i2 = ((0 >> 6) & 112) | 6;
                Composer $composer3 = $composer;
                ComposerKt.sourceInformationMarkerStart($composer3, -1326367751, "C323@13433L33:ChatPanel.kt#ouynps");
                String agentName = StringResources_androidKt.stringResource($task.getAgentNameRes(), $composer3, 0);
                if (message.getAccelerator().length() > 0) {
                    agentName = agentName + " on " + message.getAccelerator();
                }
                if (message.getHideSenderLabel()) {
                    $composer$iv$iv = $composer;
                    bubbleBorderRadius = bubbleBorderRadius2;
                    str = "CC(remember):ChatPanel.kt#9igjgp";
                    $composer2 = $composer;
                    $composer3.startReplaceGroup(-1339886449);
                    $composer3.endReplaceGroup();
                } else {
                    $composer3.startReplaceGroup(-1326339945);
                    ComposerKt.sourceInformation($composer3, "328@13666L182");
                    $composer$iv$iv = $composer;
                    bubbleBorderRadius = bubbleBorderRadius2;
                    str = "CC(remember):ChatPanel.kt#9igjgp";
                    $composer2 = $composer;
                    MessageSenderKt.MessageSender(message, agentName, imageHistoryCurIndex.getIntValue(), $composer3, ($changed3 >> 6) & 14, 0);
                    $composer3.endReplaceGroup();
                    $composer3 = $composer3;
                }
                if (message instanceof ChatMessageLoading) {
                    $composer3.startReplaceGroup(-1566794824);
                    ComposerKt.sourceInformation($composer3, "338@13997L37");
                    MessageBodyLoadingKt.MessageBodyLoading((ChatMessageLoading) message, $composer3, 0, 0);
                    $composer3.endReplaceGroup();
                    $composer$iv = $composer;
                    $composer$iv$iv$iv = $composer;
                } else if (message instanceof ChatMessageInfo) {
                    $composer3.startReplaceGroup(-1566791563);
                    ComposerKt.sourceInformation($composer3, "341@14099L34");
                    MessageBodyInfoKt.MessageBodyInfo((ChatMessageInfo) message, false, $composer3, 0, 2);
                    $composer3.endReplaceGroup();
                    $composer$iv = $composer;
                    $composer$iv$iv$iv = $composer;
                } else if (message instanceof ChatMessageWarning) {
                    $composer3.startReplaceGroup(-1566788232);
                    ComposerKt.sourceInformation($composer3, "344@14203L37");
                    MessageBodyWarningKt.MessageBodyWarning((ChatMessageWarning) message, $composer3, 0);
                    $composer3.endReplaceGroup();
                    $composer$iv = $composer;
                    $composer$iv$iv$iv = $composer;
                } else if (message instanceof ChatMessageError) {
                    $composer3.startReplaceGroup(-1566784938);
                    ComposerKt.sourceInformation($composer3, "347@14306L35");
                    MessageBodyErrorKt.MessageBodyError((ChatMessageError) message, $composer3, 0);
                    $composer3.endReplaceGroup();
                    $composer$iv = $composer;
                    $composer$iv$iv$iv = $composer;
                } else if (message instanceof ChatMessageConfigValuesChange) {
                    $composer3.startReplaceGroup(-1566780771);
                    ComposerKt.sourceInformation($composer3, "350@14436L42");
                    MessageBodyConfigUpdateKt.MessageBodyConfigUpdate((ChatMessageConfigValuesChange) message, $composer3, 0);
                    $composer3.endReplaceGroup();
                    $composer$iv = $composer;
                    $composer$iv$iv$iv = $composer;
                } else if (message instanceof ChatMessagePromptTemplates) {
                    $composer3.startReplaceGroup(-1566775685);
                    ComposerKt.sourceInformation($composer3, "357@14722L233,354@14584L392");
                    ChatMessagePromptTemplates chatMessagePromptTemplates = (ChatMessagePromptTemplates) message;
                    Task task = $task;
                    ComposerKt.sourceInformationMarkerStart($composer3, -1566771428, str);
                    boolean invalid$iv = $composer3.changed($onSendMessage) | $composer3.changedInstance($selectedModel);
                    Composer $this$cache$iv = $composer3;
                    Object it$iv2 = $this$cache$iv.rememberedValue();
                    if (invalid$iv || it$iv2 == Composer.INSTANCE.getEmpty()) {
                        final Function2 function2 = $onSendMessage;
                        final Model model = $selectedModel;
                        Object value$iv2 = (Function1) new Function1<PromptTemplate, Unit>() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatPanelKt$ChatPanel$11$4$1$2$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PromptTemplate promptTemplate) {
                                invoke2(promptTemplate);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PromptTemplate template) {
                                Intrinsics.checkNotNullParameter(template, "template");
                                function2.invoke(model, CollectionsKt.listOf(new ChatMessageText(template.getPrompt(), ChatSide.USER, 0.0f, false, null, null, false, null, 252, null)));
                            }
                        };
                        $this$cache$iv.updateRememberedValue(value$iv2);
                        it$iv2 = value$iv2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    MessageBodyPromptTemplatesKt.MessageBodyPromptTemplates(chatMessagePromptTemplates, task, (Function1) it$iv2, $composer3, 0, 0);
                    $composer3.endReplaceGroup();
                    $composer$iv = $composer;
                    $composer$iv$iv$iv = $composer;
                } else {
                    String str3 = str;
                    $composer3.startReplaceGroup(-1324806623);
                    ComposerKt.sourceInformation($composer3, "386@16098L2331");
                    Modifier.Companion messageBubbleModifier2 = Modifier.INSTANCE;
                    if (message.getDisableBubbleShape()) {
                        hardCornerAtLeftOrRight = hardCornerAtLeftOrRight3;
                    } else {
                        if (!(message instanceof ChatMessageImage) || ((ChatMessageImage) message).getBitmaps().size() <= 1) {
                            hardCornerAtLeftOrRight = hardCornerAtLeftOrRight3;
                            messageBubbleModifier = ClipKt.clip(messageBubbleModifier2, new MessageBubbleShape(bubbleBorderRadius, hardCornerAtLeftOrRight, null));
                        } else {
                            messageBubbleModifier = ClipKt.clip(messageBubbleModifier2, RoundedCornerShapeKt.m2343RoundedCornerShape0680j_4(C1654Dp.m9788constructorimpl(6)));
                            hardCornerAtLeftOrRight = hardCornerAtLeftOrRight3;
                        }
                        messageBubbleModifier2 = BackgroundKt.m1359backgroundbw27NRU$default(messageBubbleModifier, backgroundColor2, null, 2, null);
                    }
                    Modifier modifier$iv2 = messageBubbleModifier2;
                    Composer $composer$iv2 = $composer3;
                    ComposerKt.sourceInformationMarkerStart($composer$iv2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    Alignment contentAlignment$iv = Alignment.INSTANCE.getTopStart();
                    MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
                    int $changed$iv$iv2 = (0 << 3) & 112;
                    ComposerKt.sourceInformationMarkerStart($composer$iv2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int compositeKeyHash$iv$iv2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv2, 0));
                    CompositionLocalMap localMap$iv$iv2 = $composer$iv2.getCurrentCompositionLocalMap();
                    Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer$iv2, modifier$iv2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
                    $composer$iv$iv$iv = $composer;
                    $composer$iv = $composer;
                    ComposerKt.sourceInformationMarkerStart($composer$iv2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer$iv2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer$iv2.startReusableNode();
                    if ($composer$iv2.getInserting()) {
                        function02 = constructor2;
                        $composer$iv2.createNode(function02);
                    } else {
                        function02 = constructor2;
                        $composer$iv2.useNode();
                    }
                    Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m6165constructorimpl($composer$iv2);
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv2, Integer.valueOf(compositeKeyHash$iv$iv2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = ($changed$iv$iv$iv2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer$iv2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i4 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer$iv2, 1962202910, "C:ChatPanel.kt#ouynps");
                    if (message instanceof ChatMessageText) {
                        $composer$iv2.startReplaceGroup(1171677021);
                        ComposerKt.sourceInformation($composer$iv2, "390@16273L67");
                        MessageBodyTextKt.MessageBodyText((ChatMessageText) message, ChatPanelKt.ChatPanel$lambda$10($uiState$delegate).getInProgress(), $composer$iv2, 0);
                        $composer$iv2.endReplaceGroup();
                    } else if (message instanceof ChatMessageImage) {
                        $composer$iv2.startReplaceGroup(1962394737);
                        ComposerKt.sourceInformation($composer$iv2, "394@16444L69");
                        MessageBodyImageKt.MessageBodyImage((ChatMessageImage) message, $onImageSelected, null, $composer$iv2, 0, 4);
                        $composer$iv2.endReplaceGroup();
                    } else if (message instanceof ChatMessageImageWithHistory) {
                        $composer$iv2.startReplaceGroup(1171690116);
                        ComposerKt.sourceInformation($composer$iv2, "399@16679L170");
                        MessageBodyImageWithHistoryKt.MessageBodyImageWithHistory((ChatMessageImageWithHistory) message, imageHistoryCurIndex, $composer$iv2, 48);
                        $composer$iv2.endReplaceGroup();
                    } else if (message instanceof ChatMessageAudioClip) {
                        $composer$iv2.startReplaceGroup(1171698241);
                        ComposerKt.sourceInformation($composer$iv2, "405@16937L39");
                        MessageBodyAudioClipKt.MessageBodyAudioClip((ChatMessageAudioClip) message, null, $composer$iv2, 0, 2);
                        $composer$iv2.endReplaceGroup();
                    } else if (message instanceof ChatMessageClassification) {
                        $composer$iv2.startReplaceGroup(1171703745);
                        ComposerKt.sourceInformation($composer$iv2, "409@17103L231");
                        ChatMessageClassification chatMessageClassification = (ChatMessageClassification) message;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        C1654Dp maxBarWidth = ((ChatMessageClassification) message).getMaxBarWidth();
                        MessageBodyClassificationKt.MessageBodyClassification(chatMessageClassification, SizeKt.m2041width3ABfNKs(companion, maxBarWidth != null ? maxBarWidth.m9802unboximpl() : MessageBodyClassificationKt.getCLASSIFICATION_BAR_MAX_WIDTH()), false, $composer$iv2, 0, 4);
                        $composer$iv2.endReplaceGroup();
                    } else if (message instanceof ChatMessageBenchmarkResult) {
                        $composer$iv2.startReplaceGroup(1171714145);
                        ComposerKt.sourceInformation($composer$iv2, "416@17434L39");
                        MessageBodyBenchmarkKt.MessageBodyBenchmark((ChatMessageBenchmarkResult) message, $composer$iv2, 0);
                        $composer$iv2.endReplaceGroup();
                    } else if (message instanceof ChatMessageBenchmarkLlmResult) {
                        $composer$iv2.startReplaceGroup(1171719707);
                        ComposerKt.sourceInformation($composer$iv2, "420@17604L161");
                        MessageBodyBenchmarkLlmKt.MessageBodyBenchmarkLlm((ChatMessageBenchmarkLlmResult) message, SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), $composer$iv2, 48, 0);
                        $composer$iv2.endReplaceGroup();
                    } else if (message instanceof ChatMessageWebView) {
                        $composer$iv2.startReplaceGroup(1171727391);
                        ComposerKt.sourceInformation($composer$iv2, "426@17848L37");
                        MessageBodyWebviewKt.MessageBodyWebview((ChatMessageWebView) message, null, $composer$iv2, 0, 2);
                        $composer$iv2.endReplaceGroup();
                    } else if (message instanceof ChatMessageCollapsableProgressPanel) {
                        $composer$iv2.startReplaceGroup(1171733168);
                        ComposerKt.sourceInformation($composer$iv2, "430@18028L54");
                        MessageBodyCollapsableProgressPanelKt.MessageBodyCollapsableProgressPanel((ChatMessageCollapsableProgressPanel) message, $composer$iv2, 0);
                        $composer$iv2.endReplaceGroup();
                    } else if (message instanceof ChatMessageThinking) {
                        $composer$iv2.startReplaceGroup(1171738461);
                        ComposerKt.sourceInformation($composer$iv2, "434@18190L163");
                        MessageBodyThinkingKt.MessageBodyThinking(((ChatMessageThinking) message).getContent(), ((ChatMessageThinking) message).getInProgress(), $composer$iv2, 0);
                        $composer$iv2.endReplaceGroup();
                    } else {
                        $composer$iv2.startReplaceGroup(1964342374);
                        $composer$iv2.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                    $composer$iv2.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                    ComposerKt.sourceInformationMarkerEnd($composer$iv2);
                    if (message.getSide() == ChatSide.AGENT) {
                        $composer3.startReplaceGroup(-1321539378);
                        ComposerKt.sourceInformation($composer3, "444@18507L247");
                        Alignment.Vertical verticalAlignment$iv = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(8));
                        Composer $composer$iv3 = $composer3;
                        ComposerKt.sourceInformationMarkerStart($composer$iv3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        Modifier modifier$iv3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicy$iv3 = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer$iv3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                        int $changed$iv$iv3 = (432 << 3) & 112;
                        ComposerKt.sourceInformationMarkerStart($composer$iv3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                        int compositeKeyHash$iv$iv3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv3, 0));
                        CompositionLocalMap localMap$iv$iv3 = $composer$iv3.getCurrentCompositionLocalMap();
                        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer$iv3, modifier$iv3);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer$iv3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!($composer$iv3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer$iv3.startReusableNode();
                        if ($composer$iv3.getInserting()) {
                            function04 = constructor3;
                            $composer$iv3.createNode(function04);
                        } else {
                            function04 = constructor3;
                            $composer$iv3.useNode();
                        }
                        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m6165constructorimpl($composer$iv3);
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv3, Integer.valueOf(compositeKeyHash$iv$iv3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.INSTANCE.getSetModifier());
                        int i5 = ($changed$iv$iv$iv3 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer$iv3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i6 = ((432 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer$iv3, 2107797947, "C448@18702L30:ChatPanel.kt#ouynps");
                        MessageLatencyKt.LatencyText(message, $composer$iv3, ($changed3 >> 6) & 14);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                        $composer$iv3.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                        ComposerKt.sourceInformationMarkerEnd($composer$iv3);
                        $composer3.endReplaceGroup();
                    } else {
                        if (message.getSide() == ChatSide.USER) {
                            $composer3.startReplaceGroup(-1321181328);
                            ComposerKt.sourceInformation($composer3, "451@18837L1237");
                            Alignment.Vertical verticalAlignment$iv2 = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.Horizontal horizontalArrangement$iv2 = Arrangement.INSTANCE.m1843spacedBy0680j_4(C1654Dp.m9788constructorimpl(4));
                            Composer $composer$iv4 = $composer3;
                            ComposerKt.sourceInformationMarkerStart($composer$iv4, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                            Modifier modifier$iv4 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicy$iv4 = RowKt.rowMeasurePolicy(horizontalArrangement$iv2, verticalAlignment$iv2, $composer$iv4, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                            int $changed$iv$iv4 = (432 << 3) & 112;
                            ComposerKt.sourceInformationMarkerStart($composer$iv4, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                            int compositeKeyHash$iv$iv4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer$iv4, 0));
                            CompositionLocalMap localMap$iv$iv4 = $composer$iv4.getCurrentCompositionLocalMap();
                            Modifier materialized$iv$iv4 = ComposedModifierKt.materializeModifier($composer$iv4, modifier$iv4);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            int $changed$iv$iv$iv4 = (($changed$iv$iv4 << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer$iv4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!($composer$iv4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer$iv4.startReusableNode();
                            if ($composer$iv4.getInserting()) {
                                function03 = constructor4;
                                $composer$iv4.createNode(function03);
                            } else {
                                function03 = constructor4;
                                $composer$iv4.useNode();
                            }
                            Composer $this$Layout_u24lambda_u240$iv$iv4 = Updater.m6165constructorimpl($composer$iv4);
                            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, measurePolicy$iv4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, localMap$iv$iv4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Updater.m6169initimpl($this$Layout_u24lambda_u240$iv$iv4, Integer.valueOf(compositeKeyHash$iv$iv4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            Updater.m6171reconcileimpl($this$Layout_u24lambda_u240$iv$iv4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            Updater.m6173setimpl($this$Layout_u24lambda_u240$iv$iv4, materialized$iv$iv4, ComposeUiNode.INSTANCE.getSetModifier());
                            int i7 = ($changed$iv$iv$iv4 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer$iv4, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            int i8 = ((432 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer$iv4, 588136447, "C:ChatPanel.kt#ouynps");
                            if ($selectedModel.getShowRunAgainButton()) {
                                $composer$iv4.startReplaceGroup(588155077);
                                ComposerKt.sourceInformation($composer$iv4, "458@19194L34,460@19322L45,457@19139L312");
                                String strStringResource = StringResources_androidKt.stringResource(C2421R.string.run_again, $composer$iv4, 0);
                                ImageVector refresh = RefreshKt.getRefresh(Icons.Rounded.INSTANCE);
                                str2 = str3;
                                ComposerKt.sourceInformationMarkerStart($composer$iv4, 711715776, str2);
                                $changed2 = $changed3;
                                int $changed$iv$iv$iv5 = $changed2 & 896;
                                boolean invalid$iv2 = $composer$iv4.changed($onRunAgainClicked) | $composer$iv4.changedInstance($selectedModel) | ((($changed$iv$iv$iv5 ^ 384) > 256 && $composer$iv4.changed(message)) || ($changed2 & 384) == 256);
                                Object it$iv3 = $composer$iv4.rememberedValue();
                                if (invalid$iv2 || it$iv3 == Composer.INSTANCE.getEmpty()) {
                                    final Function2 function22 = $onRunAgainClicked;
                                    final Model model2 = $selectedModel;
                                    Object value$iv3 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatPanelKt$ChatPanel$11$4$1$2$1$1$1$4$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            function22.invoke(model2, message);
                                        }
                                    };
                                    $composer$iv4.updateRememberedValue(value$iv3);
                                    it$iv3 = value$iv3;
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                                MessageActionButtonKt.MessageActionButton(strStringResource, refresh, (Function0) it$iv3, null, !ChatPanelKt.ChatPanel$lambda$10($uiState$delegate).getInProgress(), $composer$iv4, 0, 8);
                            } else {
                                str2 = str3;
                                $changed2 = $changed3;
                                $composer$iv4.startReplaceGroup(569182767);
                            }
                            $composer$iv4.endReplaceGroup();
                            if ($selectedModel.getShowBenchmarkButton()) {
                                $composer$iv4.startReplaceGroup(588621751);
                                ComposerKt.sourceInformation($composer$iv4, "468@19661L38,470@19792L152,467@19606L422");
                                String strStringResource2 = StringResources_androidKt.stringResource(C2421R.string.run_benchmark, $composer$iv4, 0);
                                ImageVector timer = TimerKt.getTimer(Icons.Outlined.INSTANCE);
                                ComposerKt.sourceInformationMarkerStart($composer$iv4, 711730923, str2);
                                boolean invalid$iv3 = ((($changed2 & 896) ^ 384) > 256 && $composer$iv4.changed(message)) || ($changed2 & 384) == 256;
                                Object it$iv4 = $composer$iv4.rememberedValue();
                                if (invalid$iv3 || it$iv4 == Composer.INSTANCE.getEmpty()) {
                                    final MutableState mutableState = $benchmarkMessage;
                                    final MutableState mutableState2 = $showBenchmarkConfigsDialog$delegate;
                                    Object value$iv4 = (Function0) new Function0<Unit>() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatPanelKt$ChatPanel$11$4$1$2$1$1$1$4$2$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            ChatPanelKt.ChatPanel$lambda$20(mutableState2, true);
                                            mutableState.setValue(message);
                                        }
                                    };
                                    $composer$iv4.updateRememberedValue(value$iv4);
                                    it$iv4 = value$iv4;
                                }
                                ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                                MessageActionButtonKt.MessageActionButton(strStringResource2, timer, (Function0) it$iv4, null, !ChatPanelKt.ChatPanel$lambda$10($uiState$delegate).getInProgress(), $composer$iv4, 0, 8);
                            } else {
                                $composer$iv4.startReplaceGroup(569182767);
                            }
                            $composer$iv4.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                            $composer$iv4.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                            ComposerKt.sourceInformationMarkerEnd($composer$iv4);
                        } else {
                            $composer3.startReplaceGroup(-1339886449);
                        }
                        $composer3.endReplaceGroup();
                    }
                    $composer3.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer$iv);
                $composer$iv$iv$iv.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer$iv$iv);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$84$lambda$69$lambda$68(MutableState $curMessage$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $curMessage$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$84$lambda$71$lambda$70(Function2 $onSendMessage, Model $selectedModel, FocusManager $focusManager, MutableState $curMessage$delegate, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $onSendMessage.invoke($selectedModel, it);
        $curMessage$delegate.setValue("");
        FocusManager.clearFocus$default($focusManager, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$84$lambda$73$lambda$72(Function2 $onSendMessage, Model $selectedModel) {
        $onSendMessage.invoke($selectedModel, CollectionsKt.listOf(new ChatMessagePromptTemplates($selectedModel.getLlmPromptTemplates(), false)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$84$lambda$75$lambda$74(MutableState $showAudioRecorder$delegate, MutableIntState $curAmplitude$delegate, boolean start) {
        ChatPanel$lambda$27($showAudioRecorder$delegate, start);
        if (!ChatPanel$lambda$26($showAudioRecorder$delegate)) {
            $curAmplitude$delegate.setIntValue(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$84$lambda$77$lambda$76(MutableIntState $curAmplitude$delegate, int it) {
        $curAmplitude$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$84$lambda$79$lambda$78(MutableIntState $pickedImagesCount$delegate, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $pickedImagesCount$delegate.setIntValue(it.size());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$84$lambda$81$lambda$80(MutableIntState $pickedAudioClipsCount$delegate, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $pickedAudioClipsCount$delegate.setIntValue(it.size());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$85$lambda$84$lambda$83$lambda$82(MutableState $showImageLimitBanner$delegate) {
        ChatPanel$lambda$39($showImageLimitBanner$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$87$lambda$86(MutableState $showErrorDialog$delegate) {
        ChatPanel$lambda$24($showErrorDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$89$lambda$88(MutableState $showBenchmarkConfigsDialog$delegate) {
        ChatPanel$lambda$20($showBenchmarkConfigsDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatPanel$lambda$91$lambda$90(Function4 $onBenchmarkClicked, Model $selectedModel, ChatMessage message, int warmUpIterations, int benchmarkIterations) {
        Intrinsics.checkNotNullParameter(message, "message");
        $onBenchmarkClicked.invoke($selectedModel, message, Integer.valueOf(warmUpIterations), Integer.valueOf(benchmarkIterations));
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object scrollToBottom$default(LazyListState lazyListState, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return scrollToBottom(lazyListState, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object scrollToBottom(LazyListState listState, boolean animate, Continuation<? super Unit> continuation) {
        int itemCount = listState.getLayoutInfo().getTotalItemsCount();
        if (itemCount <= 0) {
            return Unit.INSTANCE;
        }
        if (animate) {
            Object objAnimateScrollToItem = listState.animateScrollToItem(itemCount - 1, DurationKt.NANOS_IN_MILLIS, continuation);
            return objAnimateScrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : Unit.INSTANCE;
        }
        Object objScrollToItem = listState.scrollToItem(itemCount - 1, DurationKt.NANOS_IN_MILLIS, continuation);
        return objScrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScrollToItem : Unit.INSTANCE;
    }
}
