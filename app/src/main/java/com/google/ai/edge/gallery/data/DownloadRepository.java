package com.google.ai.edge.gallery.data;

import androidx.core.app.NotificationCompat;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;




public interface DownloadRepository {
    void cancelAll(Function0<Unit> onComplete);

    void cancelDownloadModel(Model model);

    void downloadModel(Task task, Model model, Function2<? super Model, ? super ModelDownloadStatus, Unit> onStatusUpdated);

    void observerWorkerProgress(UUID workerId, Task task, Model model, Function2<? super Model, ? super ModelDownloadStatus, Unit> onStatusUpdated);
}
