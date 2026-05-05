package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import android.content.Context;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.TextFieldsKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import com.google.ai.edge.gallery.customtasks.common.CustomTaskData;
import com.google.ai.edge.gallery.data.CategoryInfo;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import java.io.File;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p009io.FilesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: ExampleCustomTask.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011H\u0016J.\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTask;", "Lcom/google/ai/edge/gallery/customtasks/common/CustomTask;", "<init>", "()V", "task", "Lcom/google/ai/edge/gallery/data/Task;", "getTask", "()Lcom/google/ai/edge/gallery/data/Task;", "initializeModelFn", "", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "onDone", "Lkotlin/Function1;", "", "cleanUpModelFn", "Lkotlin/Function0;", "MainScreen", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ExampleCustomTask implements CustomTask {
    public static final int $stable = 8;
    private final Task task = new Task("example_custom_task", "Model Viewer", new CategoryInfo("example", null, "Example", 2, null), TextFieldsKt.getTextFields(Icons.Outlined.INSTANCE), null, "This example task demonstrates a custom task that reads and displays the content of a model file (with text content for demonstration purpose). The \"models\" listed below are configured in different ways in terms of how the model file is provided (pushed to device manually, vs downloaded from internet).", null, "https://github.com/google-ai-edge/gallery/Android/src/app/src/main/java/com/google/ai/edge/gallery/customtasks/common/CustomTask.kt", "https://github.com/google-ai-edge/gallery/Android/src/app/src/main/java/com/google/ai/edge/gallery/customtasks/examplecustomtask/ExampleCustomTask.kt", CollectionsKt.mutableListOf(new Model("Local model", null, "Expects to read the model file `model.txt` manually pushed to `{ext_files_dir}/example_task/`.", ExampleCustomTaskScreenKt.getEXAMPLE_CUSTOM_TASK_CONFIGS(), null, CollectionsKt.listOf("example_custom_task"), null, null, 0, null, null, null, false, null, null, null, null, null, null, null, "example_task/", null, false, false, false, null, null, false, false, false, false, null, 0, null, null, false, null, null, null, false, false, null, null, 0, null, false, null, -1048622, 32767, null), new Model("Remote model", null, "Downloads the model file (a README.md file for demonstration purpose) from internet.", ExampleCustomTaskScreenKt.getEXAMPLE_CUSTOM_TASK_CONFIGS(), null, null, null, "https://raw.githubusercontent.com/google-ai-edge/gallery/refs/heads/main/README.md", 3798, "README.md", null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, null, null, false, false, false, false, null, 0, null, null, false, null, null, null, false, false, null, null, 0, null, false, null, -910, 32767, null)), null, false, false, false, false, null, 0, 0, 0, null, 1047632, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainScreen$lambda$0(ExampleCustomTask exampleCustomTask, Object obj, int i, Composer composer, int i2) {
        exampleCustomTask.MainScreen(obj, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Inject
    public ExampleCustomTask() {
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public Task getTask() {
        return this.task;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTask$initializeModelFn$1 */
    /* JADX INFO: compiled from: ExampleCustomTask.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTask$initializeModelFn$1", m932f = "ExampleCustomTask.kt", m933i = {0, 0, 0}, m934l = {132}, m935m = "invokeSuspend", m936n = {"file", FirebaseAnalytics.Param.CONTENT, "maxCharCount"}, m938s = {"L$0", "L$1", "I$0"})
    static final class C25361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Model $model;
        final /* synthetic */ Function1<String, Unit> $onDone;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C25361(Model model, Context context, Function1<? super String, Unit> function1, Continuation<? super C25361> continuation) {
            super(2, continuation);
            this.$model = model;
            this.$context = context;
            this.$onDone = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25361(this.$model, this.$context, this.$onDone, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            File file;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.$model.setInstance(null);
                        if (this.$model.getLocalFileRelativeDirPathOverride().length() == 0) {
                            file = new File(Model.getPath$default(this.$model, this.$context, null, 2, null));
                        } else {
                            file = new File(this.$model.getPath(this.$context, "model.txt"));
                        }
                        String content = FilesKt.readText$default(file, null, 1, null);
                        int maxCharCount = Model.getIntConfigValue$default(this.$model, ExampleCustomTaskScreenKt.getEXAMPLE_CUSTOM_TASK_CONFIG_KEY_MAX_CHAR_COUNT(), 0, 2, null);
                        String content2 = content.substring(0, Math.min(content.length(), maxCharCount));
                        Intrinsics.checkNotNullExpressionValue(content2, "substring(...)");
                        this.$model.setInstance(new ExampleCustomTaskModelInstance(content2));
                        this.L$0 = SpillingKt.nullOutSpilledVariable(file);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(content2);
                        this.I$0 = maxCharCount;
                        this.label = 1;
                        if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        int i = this.I$0;
                        ResultKt.throwOnFailure($result);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.$onDone.invoke("");
            } catch (Exception e) {
                Function1<String, Unit> function1 = this.$onDone;
                String message = e.getMessage();
                if (message == null) {
                    message = "Failed to read model file";
                }
                function1.invoke(message);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void initializeModelFn(Context context, CoroutineScope coroutineScope, Model model, Function1<? super String, Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new C25361(model, context, onDone, null), 2, null);
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void cleanUpModelFn(Context context, CoroutineScope coroutineScope, Model model, Function0<Unit> onDone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        model.setInstance(null);
        onDone.invoke();
    }

    @Override // com.google.ai.edge.gallery.customtasks.common.CustomTask
    public void MainScreen(final Object data, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(data, "data");
        Composer $composer2 = $composer.startRestartGroup(-594746793);
        ComposerKt.sourceInformation($composer2, "C(MainScreen)167@7194L70:ExampleCustomTask.kt#8jxark");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(data) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-594746793, $dirty, -1, "com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTask.MainScreen (ExampleCustomTask.kt:159)");
            }
            CustomTaskData myData = (CustomTaskData) data;
            ModelManagerViewModel modelManagerViewModel = myData.getModelManagerViewModel();
            ExampleCustomTaskScreenKt.ExampleCustomTaskScreen(modelManagerViewModel, null, $composer2, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTask$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExampleCustomTask.MainScreen$lambda$0(this.f$0, data, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
