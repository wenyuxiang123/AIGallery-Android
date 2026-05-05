package com.google.ai.edge.gallery.ui.llmchat;

import android.content.Context;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.MicKt;
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
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.runtime.LlmModelHelper;
import com.google.ai.edge.gallery.runtime.ModelHelperExtKt;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: LlmChatTaskModule.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m921d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J.\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/llmchat/LlmAskAudioTask;", "Lcom/google/ai/edge/gallery/customtasks/common/CustomTask;", "<init>", "()V", "task", "Lcom/google/ai/edge/gallery/data/Task;", "getTask", "()Lcom/google/ai/edge/gallery/data/Task;", "initializeModelFn", "", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "onDone", "Lkotlin/Function1;", "", "cleanUpModelFn", "Lkotlin/Function0;", "MainScreen", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class LlmAskAudioTask implements CustomTask {
    public static final int $stable = 8;
    private final Task task = new Task(BuiltInTaskId.LLM_ASK_AUDIO, "Audio Scribe", Category.INSTANCE.getLLM(), MicKt.getMic(Icons.Outlined.INSTANCE), null, "Instantly transcribe and/or translate audio clips using on-device large language models", "Transcribe and translate audio", "https://github.com/google-ai-edge/LiteRT-LM/blob/main/kotlin/README.md", "https://github.com/google-ai-edge/gallery/blob/main/Android/src/app/src/main/java/com/google/ai/edge/gallery/ui/llmchat/LlmChatModelHelper.kt", new ArrayList(), null, false, false, false, false, null, 0, C2421R.string.text_input_placeholder_llm_chat, 0, null, 916496, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainScreen$lambda$0(LlmAskAudioTask llmAskAudioTask, Object obj, int i, Composer composer, int i2) {
        llmAskAudioTask.MainScreen(obj, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Inject
    public LlmAskAudioTask() {
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
        LlmModelHelper.initialize$default(ModelHelperExtKt.getRuntimeHelper(model), context, model, false, true, onDone, null, null, false, coroutineScope, 224, null);
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void cleanUpModelFn(Context context, CoroutineScope coroutineScope, Model model, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        ModelHelperExtKt.getRuntimeHelper(model).cleanUp(model, onDone);
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void MainScreen(final Object data, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(data, "data");
        Composer $composer2 = $composer.startRestartGroup(-1208997618);
        ComposerKt.sourceInformation($composer2, "C(MainScreen)248@8271L119:LlmChatTaskModule.kt#t2uuva");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(data) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1208997618, $dirty2, -1, "com.google.ai.edge.gallery.ui.llmchat.LlmAskAudioTask.MainScreen (LlmChatTaskModule.kt:246)");
            }
            CustomTaskDataForBuiltinTask myData = (CustomTaskDataForBuiltinTask) data;
            LlmChatScreenKt.LlmAskAudioScreen(myData.getModelManagerViewModel(), myData.getOnNavUp(), null, null, $composer2, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmAskAudioTask$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LlmAskAudioTask.MainScreen$lambda$0(this.f$0, data, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
