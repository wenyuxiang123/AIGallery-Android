package com.google.ai.edge.gallery.p006ui.common.chat;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ChatPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.ChatPanelKt$ChatPanel$9$1", m932f = "ChatPanel.kt", m933i = {0, 0}, m934l = {220}, m935m = "invokeSuspend", m936n = {"lastVisibleItem", "canScroll"}, m938s = {"L$0", "I$0"})
final class ChatPanelKt$ChatPanel$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ List<ChatMessage> $messages;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChatPanelKt$ChatPanel$9$1(List<? extends ChatMessage> list, LazyListState lazyListState, Continuation<? super ChatPanelKt$ChatPanel$9$1> continuation) {
        super(2, continuation);
        this.$messages = list;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPanelKt$ChatPanel$9$1(this.$messages, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPanelKt$ChatPanel$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        LazyListItemInfo lastVisibleItem;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!this.$messages.isEmpty() && (lastVisibleItem = (LazyListItemInfo) CollectionsKt.lastOrNull((List) this.$listState.getLayoutInfo().getVisibleItemsInfo())) != null) {
                    int i = (lastVisibleItem.getIndex() != this.$messages.size() - 1 || (lastVisibleItem.getOffset() + lastVisibleItem.getSize()) - this.$listState.getLayoutInfo().getViewportEndOffset() >= 90) ? 0 : 1;
                    if (i != 0) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(lastVisibleItem);
                        this.I$0 = i;
                        this.label = 1;
                        if (ChatPanelKt.scrollToBottom(this.$listState, true, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                break;
            case 1:
                int i2 = this.I$0;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
