package com.google.ai.edge.gallery.customtasks.common;

import android.content.Context;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CustomTask.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JC\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00070\u000fH&J.\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H&J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0001H'¢\u0006\u0002\u0010\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0019À\u0006\u0003"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/common/CustomTask;", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "getTask", "()Lcom/google/ai/edge/gallery/data/Task;", "initializeModelFn", "", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "onDone", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "error", "cleanUpModelFn", "Lkotlin/Function0;", "MainScreen", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public interface CustomTask {
    void MainScreen(Object obj, Composer composer, int i);

    void cleanUpModelFn(Context context, CoroutineScope coroutineScope, Model model, Function0<Unit> onDone);

    Task getTask();

    void initializeModelFn(Context context, CoroutineScope coroutineScope, Model model, Function1<? super String, Unit> onDone);
}
