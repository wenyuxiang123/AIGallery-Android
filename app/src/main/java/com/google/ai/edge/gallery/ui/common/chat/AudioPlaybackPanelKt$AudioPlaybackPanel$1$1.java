package com.google.ai.edge.gallery.ui.common.chat;

import android.media.AudioTrack;
import androidx.compose.runtime.MutableFloatState;
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




@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$AudioPlaybackPanel$1$1", m932f = "AudioPlaybackPanel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class AudioPlaybackPanelKt$AudioPlaybackPanel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<AudioTrack> $audioTrackState;
    final /* synthetic */ MutableState<Boolean> $isPlaying$delegate;
    final /* synthetic */ boolean $isRecording;
    final /* synthetic */ MutableFloatState $playbackProgress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioPlaybackPanelKt$AudioPlaybackPanel$1$1(boolean z, MutableState<AudioTrack> mutableState, MutableState<Boolean> mutableState2, MutableFloatState mutableFloatState, Continuation<? super AudioPlaybackPanelKt$AudioPlaybackPanel$1$1> continuation) {
        super(2, continuation);
        this.$isRecording = z;
        this.$audioTrackState = mutableState;
        this.$isPlaying$delegate = mutableState2;
        this.$playbackProgress$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioPlaybackPanelKt$AudioPlaybackPanel$1$1(this.$isRecording, this.$audioTrackState, this.$isPlaying$delegate, this.$playbackProgress$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioPlaybackPanelKt$AudioPlaybackPanel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$isRecording) {
                    AudioTrack audioTrack = this.$audioTrackState.getValue();
                    if (audioTrack != null) {
                        audioTrack.stop();
                    }
                    AudioPlaybackPanelKt.AudioPlaybackPanel$lambda$2(this.$isPlaying$delegate, false);
                    this.$playbackProgress$delegate.setFloatValue(0.0f);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
