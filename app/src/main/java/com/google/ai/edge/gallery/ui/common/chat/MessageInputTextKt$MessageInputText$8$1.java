package com.google.ai.edge.gallery.ui.common.chat;

import android.content.Context;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: MessageInputText.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$8$1", m932f = "MessageInputText.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MessageInputTextKt$MessageInputText$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $hasFrontCamera$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageInputTextKt$MessageInputText$8$1(Context context, MutableState<Boolean> mutableState, Continuation<? super MessageInputTextKt$MessageInputText$8$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$hasFrontCamera$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageInputTextKt$MessageInputText$8$1(this.$context, this.$hasFrontCamera$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageInputTextKt$MessageInputText$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableState $hasFrontCamera$delegate, boolean it) {
        MessageInputTextKt.MessageInputText$lambda$35($hasFrontCamera$delegate, it);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Context context = this.$context;
                final MutableState<Boolean> mutableState = this.$hasFrontCamera$delegate;
                MessageInputTextKt.checkFrontCamera(context, new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$8$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MessageInputTextKt$MessageInputText$8$1.invokeSuspend$lambda$0(mutableState, ((Boolean) obj).booleanValue());
                    }
                });
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
