package com.google.ai.edge.gallery.customtasks.agentchat;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.ai.edge.gallery.common.CallJsSkillResultWebview;
import com.google.ai.edge.gallery.proto.Skill;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(
    m931c = "com.google.ai.edge.gallery.customtasks.agentchat.SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1",
    m932f = "SkillTesterBottomSheet.kt",
    m933i = {0, 0, 0},
    m934l = {200},
    m935m = "invokeSuspend",
    m936n = {"$this$launch", ImagesContract.URL, "action"},
    m938s = {"L$0", "L$1", "L$2"}
)
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
    SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1(AgentTools agentTools, Skill skill, MutableState<String> result$delegate, MutableState<String> error$delegate, MutableState<Bitmap> resultImage$delegate, MutableState<CallJsSkillResultWebview> resultWebview$delegate, MutableState<String> inputData$delegate, MutableState<Boolean> running$delegate, Continuation<? super SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1> continuation) {
        super(2, continuation);
        this.$agentTools = agentTools;
        this.$skill = skill;
        this.$result$delegate = result$delegate;
        this.$error$delegate = error$delegate;
        this.$resultImage$delegate = resultImage$delegate;
        this.$resultWebview$delegate = resultWebview$delegate;
        this.$inputData$delegate = inputData$delegate;
        this.$running$delegate = running$delegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<? super Unit> continuation) {
        SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1 result = new SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1(
            this.$agentTools, this.$skill, this.$result$delegate, this.$error$delegate,
            this.$resultImage$delegate, this.$resultWebview$delegate, this.$inputData$delegate,
            this.$running$delegate, continuation
        );
        result.L$0 = obj;
        return result;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SkillTesterBottomSheetKt$SkillTesterBottomSheet$1$1$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                // Initial execution
                this.$running$delegate.setValue(true);
                this.$error$delegate.setValue("");
                this.$result$delegate.setValue("");
                this.label = 1;
                // Placeholder for actual skill execution
                return Unit.INSTANCE;
            case 1:
                this.$running$delegate.setValue(false);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
