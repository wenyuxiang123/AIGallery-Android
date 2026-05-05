// Class: final Lcom.google.ai.edge.gallery.ui.common.modelitem.DownloadModelPanelKt
// Access: public
class DownloadModelPanelKt extends Ljava/lang/Object {

    // Methods:
    public kotlin.Unit static synthetic $r8$lambda$-MUb9VQ5SfiO4tijEU4_8taHvSg(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, com.google.ai.edge.gallery.data.ModelDownloadStatusType, float, boolean, androidx.compose.animation.SharedTransitionScope, androidx.compose.animation.AnimatedVisibilityScope, kotlin.jvm.functions.Function0, com.google.ai.edge.gallery.ui.common.tos.TosViewModel, androidx.compose.ui.Modifier, long, int, int, int, androidx.compose.runtime.Composer, int) {
        // move-result-object v0
        return v0;
    }
    public kotlin.Unit static synthetic $r8$lambda$-XWIQFHTt4UhCLNlBkw5v303IEs(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, com.google.ai.edge.gallery.data.Task) {
        // STATIC DownloadModelPanel_KNANIv4$lambda$6$lambda$5$lambda$2$lambda$1(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;Lcom/google/ai/edge/gallery/data/Task;)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    public kotlin.Unit static synthetic $r8$lambda$YBpTI9XNmDJNlruULash9Z2-FLA(boolean, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int) {
        // STATIC DownloadModelPanel_KNANIv4$lambda$6$lambda$5$lambda$4(ZLandroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
        // move-result-object p0
        return p0;
    }
    public void static final DownloadModelPanel-KNANIv4(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, com.google.ai.edge.gallery.data.ModelDownloadStatusType, float, boolean, androidx.compose.animation.SharedTransitionScope, androidx.compose.animation.AnimatedVisibilityScope, kotlin.jvm.functions.Function0, com.google.ai.edge.gallery.ui.common.tos.TosViewModel, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int, int) {
        // value = {
        // "(",
        // "Lcom/google/ai/edge/gallery/data/Model;",
        // "Lcom/google/ai/edge/gallery/data/Task;",
        // "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;",
        // "Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;",
        // "FZ",
        // "Landroidx/compose/animation/SharedTransitionScope;",
        // "Landroidx/compose/animation/AnimatedVisibilityScope;",
        // "Lkotlin/jvm/functions/Function0<",
        // "Lkotlin/Unit;",
        // ">;",
        // "Lcom/google/ai/edge/gallery/ui/common/tos/TosViewModel;",
        // "Landroidx/compose/ui/Modifier;",
        // "J",
        // "Landroidx/compose/runtime/Composer;",
        // "III)V"
        // }
        // move-object/from16 v14, p0
        // move-object/from16 v12, p1
        // ... (truncated)
    }
    private boolean static final DownloadModelPanel_KNANIv4$lambda$6$lambda$5$isDownloadButtonEnabled(com.google.ai.edge.gallery.data.ModelDownloadStatusType, com.google.ai.edge.gallery.data.Model) {
        // v0 = FAILED:Lcom/google/ai/edge/gallery/data/ModelDownloadStatusType;
        // const/4 v1, 0x1
        // const/4 v2, 0x0
        // if-ne p0, v0, :cond_0
        // move v0, v1
        // goto :goto_0
        // move v0, v2
        // VIRTUAL getRuntimeType()Lcom/google/ai/edge/gallery/data/RuntimeType;
        // move-result-object v3
        // v4 = LITERT_LM:Lcom/google/ai/edge/gallery/data/RuntimeType;
        // if-ne v3, v4, :cond_1
        // move v3, v1
        // goto :goto_1
        // move v3, v2
        // if-eqz v0, :cond_3
        // if-eqz v3, :cond_2
        // goto :goto_2
        // move v1, v2
        return v1;
    }
    private kotlin.Unit static final DownloadModelPanel_KNANIv4$lambda$6$lambda$5$lambda$2$lambda$1(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, com.google.ai.edge.gallery.data.Task) {
        // VIRTUAL getLatestModelFile()Lcom/google/ai/edge/gallery/data/ModelFile;
        // move-result-object v0
        // if-eqz v0, :cond_0
        // const/4 v1, 0x0
        // VIRTUAL getCommitHash()Ljava/lang/String;
        // move-result-object v2
        // VIRTUAL setVersion(Ljava/lang/String;)V
        // VIRTUAL getFileName()Ljava/lang/String;
        // move-result-object v2
        // VIRTUAL setDownloadFileName(Ljava/lang/String;)V
        // nop
        // nop
        // const/4 v0, 0x0
        // VIRTUAL setUpdatable(Z)V
        // VIRTUAL downloadModel(Lcom/google/ai/edge/gallery/data/Task;Lcom/google/ai/edge/gallery/data/Model;)V
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
    private kotlin.Unit static final DownloadModelPanel_KNANIv4$lambda$6$lambda$5$lambda$4(boolean, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int) {
        // move-object/from16 v0, p2
        // move/from16 v1, p3
        String v2 = "$this$Button";
        // move-object/from16 v3, p1
        // STATIC checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
        String v2 = "C108@4402L11,109@4445L623:DownloadModelPanel.kt#13a6jo";
        // STATIC sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
        // and-int/lit8 v2, v1, 0x11
        // const/4 v5, 0x0
        // const/16 v6, 0x10
        // if-eq v2, v6, :cond_0
        // const/4 v2, 0x1
        // goto :goto_0
        // move v2, v5
        // and-int/lit8 v7, v1, 0x1
        // INTERFACE shouldExecute(ZI)Z
        // move-result v2
        // if-eqz v2, :cond_5
        // STATIC isTraceInProgress()Z
        // move-result v2
        // ... (truncated)
    }
    private kotlin.Unit static final DownloadModelPanel_KNANIv4$lambda$7(com.google.ai.edge.gallery.data.Model, com.google.ai.edge.gallery.data.Task, com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel, com.google.ai.edge.gallery.data.ModelDownloadStatusType, float, boolean, androidx.compose.animation.SharedTransitionScope, androidx.compose.animation.AnimatedVisibilityScope, kotlin.jvm.functions.Function0, com.google.ai.edge.gallery.ui.common.tos.TosViewModel, androidx.compose.ui.Modifier, long, int, int, int, androidx.compose.runtime.Composer, int) {
        // move-object/from16 v0, p0
        // move-object/from16 v1, p1
        // move-object/from16 v2, p2
        // move-object/from16 v3, p3
        // move/from16 v4, p4
        // move/from16 v5, p5
        // move-object/from16 v6, p6
        // move-object/from16 v7, p7
        // move-object/from16 v8, p8
        // move-object/from16 v9, p9
        // move-object/from16 v10, p10
        // move-wide/from16 v11, p11
        // move/from16 v16, p15
        // move-object/from16 v13, p16
        // or-int/lit8 v14, p13, 0x1
        // STATIC updateChangedFlags(I)I
        // move-result v14
        // move-result v15
        // v0 = INSTANCE:Lkotlin/Unit;
        return v0;
    }
}