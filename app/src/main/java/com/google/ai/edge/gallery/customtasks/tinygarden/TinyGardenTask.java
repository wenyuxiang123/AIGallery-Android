package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.content.Context;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.LocalFloristKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import com.google.ai.edge.gallery.customtasks.common.CustomTaskData;
import com.google.ai.edge.gallery.data.BuiltInTaskId;
import com.google.ai.edge.gallery.data.Category;
import com.google.ai.edge.gallery.data.CategoryInfo;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.llmchat.LlmChatModelHelper;
import com.google.ai.edge.gallery.runtime.LlmModelHelper;
import com.google.ai.edge.litertlm.Contents;
import com.google.ai.edge.litertlm.ToolKt;
import com.google.ai.edge.litertlm.ToolProvider;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;



V", "_updateChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenCommand;", "commandFlow", "Lkotlinx/coroutines/flow/Flow;", "tools", "", "Lcom/google/ai/edge/litertlm/ToolProvider;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "getTask", "()Lcom/google/ai/edge/gallery/data/Task;", "initializeModelFn", "", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "onDone", "Lkotlin/Function1;", "", "cleanUpModelFn", "Lkotlin/Function0;", "MainScreen", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "clearQueue", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class TinyGardenTask implements CustomTask {
    public static final int $stable = 8;
    private final Task task;
    private final Channel<TinyGardenCommand> _updateChannel = ChannelKt.Channel$default(-2, null, null, 6, null);
    private final Flow<TinyGardenCommand> commandFlow = FlowKt.receiveAsFlow(this._updateChannel);
    private final List<ToolProvider> tools = CollectionsKt.listOf(ToolKt.tool(new TinyGardenTools(new Function1() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenTask$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return TinyGardenTask.tools$lambda$0(this.f$0, (TinyGardenCommand) obj);
        }
    })));

    
    public static final Unit MainScreen$lambda$1(TinyGardenTask tinyGardenTask, Object obj, int i, Composer composer, int i2) {
        tinyGardenTask.MainScreen(obj, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Inject
    public TinyGardenTask() {
        CategoryInfo llm = Category.INSTANCE.getLLM();
        ImageVector localFlorist = LocalFloristKt.getLocalFlorist(Icons.Outlined.INSTANCE);
        int i = C2421R.string.chat_agent_agent_name;
        this.task = new Task(BuiltInTaskId.LLM_TINY_GARDEN, "Tiny Garden", llm, localFlorist, null, "Use natural language to plant, water, and harvest in this fully offline mini-game.\n\nNote: This is powered by the experimental FunctionGemma model optimized for latency. Due to its compact size (270M), it works well on simple instructions but responses may vary to more complex interactions.", "Use natural language to plant", "https://github.com/google-ai-edge/LiteRT-LM/blob/main/kotlin/README.md", "https://github.com/google-ai-edge/gallery/blob/main/Android/src/app/src/main/java/com/google/ai/edge/gallery/customtasks/tinygarden", new ArrayList(), null, true, true, false, false, null, i, 0, 0, null, 975888, null);
    }

    
    public static final Unit tools$lambda$0(TinyGardenTask this$0, TinyGardenCommand it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this$0._updateChannel.mo12888trySendJP2dKIU(it);
        return Unit.INSTANCE;
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public Task getTask() {
        return this.task;
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void initializeModelFn(Context context, CoroutineScope coroutineScope, Model model, Function1<? super String, Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        clearQueue();
        LlmModelHelper.initialize$default(LlmChatModelHelper.INSTANCE, context, model, false, false, onDone, Contents.INSTANCE.m595of(TinyGardenTaskKt.getTinyGardenSystemPrompt$default(null, null, null, 7, null)), this.tools, true, null, 256, null);
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void cleanUpModelFn(Context context, CoroutineScope coroutineScope, Model model, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        clearQueue();
        LlmChatModelHelper.INSTANCE.cleanUp(model, onDone);
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void MainScreen(final Object data, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(data, "data");
        Composer $composer2 = $composer.startRestartGroup(-1261690482);
        ComposerKt.sourceInformation($composer2, "C(MainScreen)133@4646L350:TinyGardenTask.kt#pwpd1x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(data) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(this) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1261690482, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenTask.MainScreen (TinyGardenTask.kt:131)");
            }
            CustomTaskData customTaskData = (CustomTaskData) data;
            TinyGardenScreenKt.m10536TinyGardenScreenaA_HZ9I(getTask(), customTaskData.getModelManagerViewModel(), this.tools, customTaskData.m10499getBottomPaddingD9Ej5fM(), customTaskData.getSetAppBarControlsDisabled(), customTaskData.getSetTopBarVisible(), this.commandFlow, null, $composer2, 0, 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenTask$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TinyGardenTask.MainScreen$lambda$1(this.f$0, data, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void clearQueue() {
        while (ChannelResult.m12913isSuccessimpl(this._updateChannel.mo12896tryReceivePtdJZtk())) {
        }
    }
}
