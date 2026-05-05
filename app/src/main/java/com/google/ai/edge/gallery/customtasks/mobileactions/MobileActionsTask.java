package com.google.ai.edge.gallery.customtasks.mobileactions;

import android.content.Context;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.FunctionsKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
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
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.runtime.LlmModelHelper;
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

/* JADX INFO: compiled from: MobileActionsTask.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u0017H\u0016J.\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0016J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/MobileActionsTask;", "Lcom/google/ai/edge/gallery/customtasks/common/CustomTask;", "<init>", "()V", "curActions", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/Action;", "tools", "", "Lcom/google/ai/edge/litertlm/ToolProvider;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "getTask", "()Lcom/google/ai/edge/gallery/data/Task;", "initializeModelFn", "", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "onDone", "Lkotlin/Function1;", "", "cleanUpModelFn", "Lkotlin/Function0;", "MainScreen", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MobileActionsTask implements CustomTask {
    public static final int $stable = 8;
    private final Task task;
    private SnapshotStateList<Action> curActions = SnapshotStateKt.mutableStateListOf();
    private final List<ToolProvider> tools = CollectionsKt.listOf(ToolKt.tool(new MobileActionsTools(new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsTask$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MobileActionsTask.tools$lambda$0(this.f$0, (Action) obj);
        }
    })));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainScreen$lambda$3(MobileActionsTask mobileActionsTask, Object obj, int i, Composer composer, int i2) {
        mobileActionsTask.MainScreen(obj, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Inject
    public MobileActionsTask() {
        CategoryInfo llm = Category.INSTANCE.getLLM();
        ImageVector functions = FunctionsKt.getFunctions(Icons.Outlined.INSTANCE);
        int i = C2421R.string.chat_agent_agent_name;
        this.task = new Task(BuiltInTaskId.LLM_MOBILE_ACTIONS, "Mobile Actions", llm, functions, null, "Perform various device actions through Function Gemma", "Leverage device mobile actions", "https://github.com/google-ai-edge/LiteRT-LM/blob/main/kotlin/README.md", "https://github.com/google-ai-edge/gallery/blob/main/Android/src/app/src/main/java/com/google/ai/edge/gallery/customtasks/mobileactions", new ArrayList(), null, false, true, false, false, null, i, 0, 0, null, 977936, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tools$lambda$0(MobileActionsTask this$0, Action it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.curActions.add(it);
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
        this.curActions.clear();
        LlmModelHelper.initialize$default(LlmChatModelHelper.INSTANCE, context, model, false, false, onDone, MobileActionsTaskKt.getSystemPrompt(), this.tools, false, null, 384, null);
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void cleanUpModelFn(Context context, CoroutineScope coroutineScope, Model model, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        this.curActions.clear();
        LlmChatModelHelper.INSTANCE.cleanUp(model, onDone);
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void MainScreen(final Object data, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(data, "data");
        Composer $composer2 = $composer.startRestartGroup(860982610);
        ComposerKt.sourceInformation($composer2, "C(MainScreen)104@3749L22,97@3433L345:MobileActionsTask.kt#okf2md");
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
                ComposerKt.traceEventStart(860982610, $dirty2, -1, "com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsTask.MainScreen (MobileActionsTask.kt:95)");
            }
            CustomTaskData customTaskData = (CustomTaskData) data;
            Task task = getTask();
            ModelManagerViewModel modelManagerViewModel = customTaskData.getModelManagerViewModel();
            float fM10499getBottomPaddingD9Ej5fM = customTaskData.m10499getBottomPaddingD9Ej5fM();
            Function1<Boolean, Unit> setAppBarControlsDisabled = customTaskData.getSetAppBarControlsDisabled();
            SnapshotStateList<Action> snapshotStateList = this.curActions;
            List<ToolProvider> list = this.tools;
            ComposerKt.sourceInformationMarkerStart($composer2, -1524386488, "CC(remember):MobileActionsTask.kt#9igjgp");
            boolean invalid$iv = $composer2.changedInstance(this);
            Object it$iv = $composer2.rememberedValue();
            if (invalid$iv || it$iv == Composer.INSTANCE.getEmpty()) {
                Object value$iv = new Function0() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsTask$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MobileActionsTask.MainScreen$lambda$2$lambda$1(this.f$0);
                    }
                };
                $composer2.updateRememberedValue(value$iv);
                it$iv = value$iv;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            MobileActionsScreenKt.m10521MobileActionsScreenaA_HZ9I(task, modelManagerViewModel, null, fM10499getBottomPaddingD9Ej5fM, setAppBarControlsDisabled, snapshotStateList, list, (Function0) it$iv, $composer2, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsTask$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MobileActionsTask.MainScreen$lambda$3(this.f$0, data, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainScreen$lambda$2$lambda$1(MobileActionsTask this$0) {
        this$0.curActions.clear();
        return Unit.INSTANCE;
    }
}
