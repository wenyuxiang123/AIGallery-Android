package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DownloadRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JR\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u000726\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\tH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&JZ\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u000726\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\tH&¨\u0006\u0015À\u0006\u0003"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/DownloadRepository;", "", "downloadModel", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "onStatusUpdated", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;", NotificationCompat.CATEGORY_STATUS, "cancelDownloadModel", "cancelAll", "onComplete", "Lkotlin/Function0;", "observerWorkerProgress", "workerId", "Ljava/util/UUID;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public interface DownloadRepository {
    void cancelAll(Function0<Unit> onComplete);

    void cancelDownloadModel(Model model);

    void downloadModel(Task task, Model model, Function2<? super Model, ? super ModelDownloadStatus, Unit> onStatusUpdated);

    void observerWorkerProgress(UUID workerId, Task task, Model model, Function2<? super Model, ? super ModelDownloadStatus, Unit> onStatusUpdated);
}
