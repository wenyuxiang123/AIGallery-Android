package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: MessageBodyImageWithHistory.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$1$1", m932f = "MessageBodyImageWithHistory.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $imageHistoryCurIndex;
    final /* synthetic */ ChatMessageImageWithHistory $message;
    final /* synthetic */ MutableState<ChatMessageImageWithHistory> $prevMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$1$1(MutableIntState mutableIntState, ChatMessageImageWithHistory chatMessageImageWithHistory, MutableState<ChatMessageImageWithHistory> mutableState, Continuation<? super MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$1$1> continuation) {
        super(2, continuation);
        this.$imageHistoryCurIndex = mutableIntState;
        this.$message = chatMessageImageWithHistory;
        this.$prevMessage = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$1$1(this.$imageHistoryCurIndex, this.$message, this.$prevMessage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageBodyImageWithHistoryKt$MessageBodyImageWithHistory$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$imageHistoryCurIndex.setIntValue(this.$message.getBitmaps().size() - 1);
                this.$prevMessage.setValue(this.$message);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
