package com.google.ai.edge.gallery.customtasks.agentchat;

import android.graphics.Bitmap;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.ai.edge.gallery.common.CallJsSkillResultWebview;
import com.google.ai.edge.gallery.proto.Skill;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SkillTesterBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1", m932f = "SkillTesterBottomSheet.kt", m933i = {0, 0, 0}, m934l = {200}, m935m = "invokeSuspend", m936n = {"$this$launch", ImagesContract.URL, "action"}, m938s = {"L$0", "L$1", "L$2"})
final class SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AgentTools $agentTools;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<String> $inputData$delegate;
    final /* synthetic */ MutableState<String> $result$delegate;
    final /* synthetic */ MutableState<Bitmap> $resultImage$delegate;
    final /* synthetic */ MutableState<CallJsSkillResultWebview> $resultWebview$delegate;
    final /* synthetic */ MutableState<Boolean> $running$delegate;
    final /* synthetic */ Skill $skill;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1(AgentTools agentTools, Skill skill, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Bitmap> mutableState3, MutableState<CallJsSkillResultWebview> mutableState4, MutableState<String> mutableState5, MutableState<Boolean> mutableState6, Continuation<? super SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1> continuation) {
        super(2, continuation);
        this.$agentTools = agentTools;
        this.$skill = skill;
        this.$result$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$resultImage$delegate = mutableState3;
        this.$resultWebview$delegate = mutableState4;
        this.$inputData$delegate = mutableState5;
        this.$running$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1 skillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1 = new SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1(this.$agentTools, this.$skill, this.$result$delegate, this.$error$delegate, this.$resultImage$delegate, this.$resultWebview$delegate, this.$inputData$delegate, this.$running$delegate, continuation);
        skillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1.L$0 = obj;
        return skillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[Catch: all -> 0x014a, Exception -> 0x014c, TryCatch #1 {Exception -> 0x014c, blocks: (B:7:0x0024, B:16:0x00a0, B:22:0x00db, B:25:0x00e2, B:27:0x00e6, B:28:0x00ed, B:30:0x00f3, B:31:0x00f7, B:34:0x0104, B:38:0x010c, B:40:0x0134, B:42:0x013a, B:45:0x0144, B:21:0x00d1, B:10:0x0030, B:12:0x005d, B:13:0x0066), top: B:60:0x0011, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[Catch: all -> 0x014a, Exception -> 0x014c, TryCatch #1 {Exception -> 0x014c, blocks: (B:7:0x0024, B:16:0x00a0, B:22:0x00db, B:25:0x00e2, B:27:0x00e6, B:28:0x00ed, B:30:0x00f3, B:31:0x00f7, B:34:0x0104, B:38:0x010c, B:40:0x0134, B:42:0x013a, B:45:0x0144, B:21:0x00d1, B:10:0x0030, B:12:0x005d, B:13:0x0066), top: B:60:0x0011, outer: #2 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            // Method dump skipped - placeholder implementation
            return null;
        }
}
