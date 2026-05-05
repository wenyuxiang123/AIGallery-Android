package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.p000ui.text.TextRange;
import androidx.compose.p000ui.text.TextRangeKt;
import androidx.compose.p000ui.text.input.TextFieldValue;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CursorTrackingTextField.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$CursorTrackingTextField$1$1", m932f = "CursorTrackingTextField.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class CursorTrackingTextFieldKt$CursorTrackingTextField$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $initialValue;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValue$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CursorTrackingTextFieldKt$CursorTrackingTextField$1$1(String str, MutableState<TextFieldValue> mutableState, Continuation<? super CursorTrackingTextFieldKt$CursorTrackingTextField$1$1> continuation) {
        super(2, continuation);
        this.$initialValue = str;
        this.$textFieldValue$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CursorTrackingTextFieldKt$CursorTrackingTextField$1$1(this.$initialValue, this.$textFieldValue$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CursorTrackingTextFieldKt$CursorTrackingTextField$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!Intrinsics.areEqual(this.$initialValue, CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$2(this.$textFieldValue$delegate).getText())) {
                    this.$textFieldValue$delegate.setValue(TextFieldValue.m9442copy3r_uNRQ$default(CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$2(this.$textFieldValue$delegate), this.$initialValue, TextRangeKt.m9198coerceIn8ffj60Q(CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$2(this.$textFieldValue$delegate).getSelection(), 0, this.$initialValue.length()), (TextRange) null, 4, (Object) null));
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
