package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.MutableState;
import com.google.ai.edge.gallery.common.AudioClip;
import com.google.ai.edge.gallery.data.ConstsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.MessageInputTextKt$MessageInputText$12$2$1$2$1$1", m932f = "MessageInputText.kt", m933i = {}, m934l = {676}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class MessageInputTextKt$MessageInputText$12$2$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ byte[] $audioData;
    final /* synthetic */ SheetState $audioRecorderSheetState;
    final /* synthetic */ Function1<Boolean, Unit> $onSetAudioRecorderVisible;
    final /* synthetic */ MutableState<Boolean> $showAudioRecorder$delegate;
    final /* synthetic */ Function1<List<AudioClip>, Unit> $updatePickedAudioClips;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MessageInputTextKt$MessageInputText$12$2$1$2$1$1(Function1<? super List<AudioClip>, Unit> function1, byte[] bArr, SheetState sheetState, Function1<? super Boolean, Unit> function12, MutableState<Boolean> mutableState, Continuation<? super MessageInputTextKt$MessageInputText$12$2$1$2$1$1> continuation) {
        super(2, continuation);
        this.$updatePickedAudioClips = function1;
        this.$audioData = bArr;
        this.$audioRecorderSheetState = sheetState;
        this.$onSetAudioRecorderVisible = function12;
        this.$showAudioRecorder$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageInputTextKt$MessageInputText$12$2$1$2$1$1(this.$updatePickedAudioClips, this.$audioData, this.$audioRecorderSheetState, this.$onSetAudioRecorderVisible, this.$showAudioRecorder$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageInputTextKt$MessageInputText$12$2$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$updatePickedAudioClips.invoke(CollectionsKt.listOf(new AudioClip(this.$audioData, ConstsKt.SAMPLE_RATE)));
                this.label = 1;
                if (this.$audioRecorderSheetState.hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MessageInputTextKt.MessageInputText$lambda$26(this.$showAudioRecorder$delegate, false);
        this.$onSetAudioRecorderVisible.invoke(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
