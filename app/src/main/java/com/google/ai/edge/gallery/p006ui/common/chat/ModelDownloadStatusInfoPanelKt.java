package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerUiState;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelDownloadStatusInfoPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m922d2 = {"ModelDownloadStatusInfoPanel", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "task", "Lcom/google/ai/edge/gallery/data/Task;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Landroidx/compose/runtime/Composer;I)V", "app_debug", "modelManagerUiState", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerUiState;"}, m923k = 2, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ModelDownloadStatusInfoPanelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelDownloadStatusInfoPanel$lambda$7(Model model, Task task, ModelManagerViewModel modelManagerViewModel, int i, Composer composer, int i2) {
        ModelDownloadStatusInfoPanel(model, task, modelManagerViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ModelDownloadStatusInfoPanel(final com.google.ai.edge.gallery.data.Model r88, final com.google.ai.edge.gallery.data.Task r89, final com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel r90, androidx.compose.runtime.Composer r91, final int r92) {
        /*
            Method dump skipped, instruction units count: 1507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.p006ui.common.chat.ModelDownloadStatusInfoPanelKt.ModelDownloadStatusInfoPanel(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, androidx.compose.runtime.Composer, int):void");
    }

    private static final ModelManagerUiState ModelDownloadStatusInfoPanel$lambda$0(State<ModelManagerUiState> state) {
        Object thisObj$iv = state.getValue();
        return (ModelManagerUiState) thisObj$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModelDownloadStatusInfoPanel$lambda$6$lambda$2$lambda$1(Model $model, Task $task, ModelManagerViewModel $modelManagerViewModel, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C76@3180L141:ModelDownloadStatusInfoPanel.kt#ouynps");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1730712476, $changed, -1, "com.google.ai.edge.gallery.ui.common.chat.ModelDownloadStatusInfoPanel.<anonymous>.<anonymous>.<anonymous> (ModelDownloadStatusInfoPanel.kt:76)");
        }
        ModelDownloadingAnimationKt.ModelDownloadingAnimation($model, $task, $modelManagerViewModel, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
