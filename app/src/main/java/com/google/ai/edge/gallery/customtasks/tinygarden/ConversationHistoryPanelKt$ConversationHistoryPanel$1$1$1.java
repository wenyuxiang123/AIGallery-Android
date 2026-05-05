package com.google.ai.edge.gallery.customtasks.tinygarden;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.DurationKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ConversationHistoryPanel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.tinygarden.ConversationHistoryPanelKt$ConversationHistoryPanel$1$1$1", m932f = "ConversationHistoryPanel.kt", m933i = {}, m934l = {79}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class ConversationHistoryPanelKt$ConversationHistoryPanel$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ScrollState $listState;
    final /* synthetic */ State<TinyGardenUiState> $uiState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationHistoryPanelKt$ConversationHistoryPanel$1$1$1(ScrollState scrollState, State<TinyGardenUiState> state, Continuation<? super ConversationHistoryPanelKt$ConversationHistoryPanel$1$1$1> continuation) {
        super(2, continuation);
        this.$listState = scrollState;
        this.$uiState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationHistoryPanelKt$ConversationHistoryPanel$1$1$1(this.$listState, this.$uiState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationHistoryPanelKt$ConversationHistoryPanel$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!ConversationHistoryPanelKt.ConversationHistoryPanel_uFdPcIQ$lambda$0(this.$uiState$delegate).getMessages().isEmpty()) {
                    this.label = 1;
                    if (ScrollState.animateScrollTo$default(this.$listState, DurationKt.NANOS_IN_MILLIS, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
