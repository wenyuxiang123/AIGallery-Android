package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ExampleCustomTaskScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTaskScreenKt$ExampleCustomTaskScreen$1$1", m932f = "ExampleCustomTaskScreen.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class ExampleCustomTaskScreenKt$ExampleCustomTaskScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Color> $colors;
    final /* synthetic */ ExampleCustomTaskViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExampleCustomTaskScreenKt$ExampleCustomTaskScreen$1$1(ExampleCustomTaskViewModel exampleCustomTaskViewModel, List<Color> list, Continuation<? super ExampleCustomTaskScreenKt$ExampleCustomTaskScreen$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = exampleCustomTaskViewModel;
        this.$colors = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExampleCustomTaskScreenKt$ExampleCustomTaskScreen$1$1(this.$viewModel, this.$colors, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExampleCustomTaskScreenKt$ExampleCustomTaskScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$viewModel.m10505updateTextColor8_81llA(this.$colors.get(0).m6925unboximpl());
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
