package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.p000ui.geometry.Rect;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextRange;
import androidx.compose.p000ui.text.input.TextFieldValue;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: CursorTrackingTextField.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$CursorTrackingTextField$2$1", m932f = "CursorTrackingTextField.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class CursorTrackingTextFieldKt$CursorTrackingTextField$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ Density $density;
    final /* synthetic */ float $extraOffset;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<TextFieldValue> $textFieldValue$delegate;
    final /* synthetic */ MutableState<TextLayoutResult> $textLayoutResult$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CursorTrackingTextFieldKt$CursorTrackingTextField$2$1(Density density, CoroutineScope coroutineScope, MutableState<TextLayoutResult> mutableState, MutableState<TextFieldValue> mutableState2, float f, BringIntoViewRequester bringIntoViewRequester, Continuation<? super CursorTrackingTextFieldKt$CursorTrackingTextField$2$1> continuation) {
        super(2, continuation);
        this.$density = density;
        this.$scope = coroutineScope;
        this.$textLayoutResult$delegate = mutableState;
        this.$textFieldValue$delegate = mutableState2;
        this.$extraOffset = f;
        this.$bringIntoViewRequester = bringIntoViewRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CursorTrackingTextFieldKt$CursorTrackingTextField$2$1(this.$density, this.$scope, this.$textLayoutResult$delegate, this.$textFieldValue$delegate, this.$extraOffset, this.$bringIntoViewRequester, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CursorTrackingTextFieldKt$CursorTrackingTextField$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                TextLayoutResult layout = CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$5(this.$textLayoutResult$delegate);
                if (layout == null) {
                    return Unit.INSTANCE;
                }
                long selection = CursorTrackingTextFieldKt.CursorTrackingTextField_f8_ukHw$lambda$2(this.$textFieldValue$delegate).getSelection();
                if (TextRange.m9192getStartimpl(selection) <= layout.getLayoutInput().getText().length()) {
                    Rect cursorRect = layout.getCursorRect(TextRange.m9192getStartimpl(selection));
                    Density $this$invokeSuspend_u24lambda_u240 = this.$density;
                    float bufferPx = $this$invokeSuspend_u24lambda_u240.mo1524toPx0680j_4(this.$extraOffset);
                    Rect biggerCursorRect = Rect.copy$default(cursorRect, 0.0f, 0.0f, 0.0f, cursorRect.getBottom() + bufferPx, 7, null);
                    BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C24991(this.$bringIntoViewRequester, biggerCursorRect, null), 3, null);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$CursorTrackingTextField$2$1$1 */
    /* JADX INFO: compiled from: CursorTrackingTextField.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.CursorTrackingTextFieldKt$CursorTrackingTextField$2$1$1", m932f = "CursorTrackingTextField.kt", m933i = {}, m934l = {91}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C24991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Rect $biggerCursorRect;
        final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24991(BringIntoViewRequester bringIntoViewRequester, Rect rect, Continuation<? super C24991> continuation) {
            super(2, continuation);
            this.$bringIntoViewRequester = bringIntoViewRequester;
            this.$biggerCursorRect = rect;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24991(this.$bringIntoViewRequester, this.$biggerCursorRect, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (this.$bringIntoViewRequester.bringIntoView(this.$biggerCursorRect, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }
}
