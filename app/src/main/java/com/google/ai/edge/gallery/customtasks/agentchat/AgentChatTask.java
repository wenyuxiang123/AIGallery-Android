package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import com.google.ai.edge.gallery.customtasks.common.CustomTaskDataForBuiltinTask;
import com.google.ai.edge.gallery.data.BuiltInTaskId;
import com.google.ai.edge.gallery.data.Category;
import com.google.ai.edge.gallery.data.CategoryInfo;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmChatModelHelper;
import com.google.ai.edge.gallery.runtime.LlmModelHelper;
import com.google.ai.edge.litertlm.Contents;
import com.google.ai.edge.litertlm.ToolKt;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AgentChatTaskModule.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u0013H\u0016J.\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentChatTask;", "Lcom/google/ai/edge/gallery/customtasks/common/CustomTask;", "<init>", "()V", "agentTools", "Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "getTask", "()Lcom/google/ai/edge/gallery/data/Task;", "initializeModelFn", "", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "onDone", "Lkotlin/Function1;", "", "cleanUpModelFn", "Lkotlin/Function0;", "MainScreen", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AgentChatTask implements CustomTask {
    public static final int $stable = 8;
    private final AgentTools agentTools = new AgentTools();
    private final Task task;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainScreen$lambda$1(AgentChatTask agentChatTask, Object obj, int i, Composer composer, int i2) {
        agentChatTask.MainScreen(obj, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Inject
    public AgentChatTask() {
        CategoryInfo llm = Category.INSTANCE.getLLM();
        int i = C2421R.drawable.agent;
        ArrayList arrayList = new ArrayList();
        int i2 = C2421R.string.text_input_placeholder_llm_chat;
        this.task = new Task(BuiltInTaskId.LLM_AGENT_CHAT, "Agent Skills", llm, null, Integer.valueOf(i), "Chat with on-device large language models with skills and tools", "Complete agentic tasks with chat", "https://github.com/google-ai-edge/LiteRT-LM/blob/main/kotlin/README.md", "https://github.com/google-ai-edge/gallery/blob/main/Android/src/app/src/main/java/com/google/ai/edge/gallery/customtasks/agentchat/", arrayList, null, false, false, true, false, "You are an AI assistant that helps users by answering questions and completes tasks using skills. For EVERY new task or request or question, you MUST execute the following steps in exact order. You MUST NOT skip any steps.\n\nCRITICAL RULE: You MUST execute all steps silently. Do NOT generate or output any internal thoughts, reasoning, explanations, or intermediate text at ANY step.\n\n1. First, find the most relevant skill from the following list:\n\n___SKILLS___\n\nAfter this step you MUST go to next step. You MUST NOT use `run_intent` under any circumstances at this step.\n\n2. If a relevant skill exists, use the `load_skill` tool to read its instructions. You MUST NOT use `run_intent` under any circumstances at this step.\n\n3. Follow the skill's instructions exactly to complete the task. You MUST NOT output any intermediate thoughts or status updates. No exceptions! Output ONLY the final result when successful. It should contain one-sentence summary of the action taken, and the final result of the skill.", 0, i2, 0, null, 875528, null);
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public Task getTask() {
        return this.task;
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void initializeModelFn(final Context context, CoroutineScope coroutineScope, final Model model, final Function1<? super String, Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.agentTools.getSkillManagerViewModel().loadSkills(new Function0() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatTask$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AgentChatTask.initializeModelFn$lambda$0(context, model, onDone, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeModelFn$lambda$0(Context $context, Model $model, Function1 $onDone, AgentChatTask this$0) {
        Contents systemPrompt;
        LlmChatModelHelper llmChatModelHelper = LlmChatModelHelper.INSTANCE;
        if (this$0.agentTools.getSkillManagerViewModel().getSelectedSkills().isEmpty()) {
            systemPrompt = null;
        } else {
            systemPrompt = this$0.agentTools.getSkillManagerViewModel().getSystemPrompt(this$0.getTask().getDefaultSystemPrompt());
        }
        LlmModelHelper.initialize$default(llmChatModelHelper, $context, $model, true, true, $onDone, systemPrompt, CollectionsKt.listOf(ToolKt.tool(this$0.agentTools)), true, null, 256, null);
        return Unit.INSTANCE;
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void cleanUpModelFn(Context context, CoroutineScope coroutineScope, Model model, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        LlmChatModelHelper.INSTANCE.cleanUp(model, onDone);
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void MainScreen(final Object data, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(data, "data");
        Composer $composer2 = $composer.startRestartGroup(-1631576636);
        ComposerKt.sourceInformation($composer2, "C(MainScreen)110@4442L167:AgentChatTaskModule.kt#41d64j");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(data) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(this) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1631576636, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.agentchat.AgentChatTask.MainScreen (AgentChatTaskModule.kt:108)");
            }
            CustomTaskDataForBuiltinTask myData = (CustomTaskDataForBuiltinTask) data;
            AgentChatScreenKt.AgentChatScreen(getTask(), myData.getModelManagerViewModel(), myData.getOnNavUp(), this.agentTools, null, null, $composer2, 0, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatTask$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AgentChatTask.MainScreen$lambda$1(this.f$0, data, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
