package com.google.ai.edge.gallery.ui.common.chat;

import android.media.AudioTrack;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: AudioPlaybackPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1", m932f = "AudioPlaybackPanel.kt", m933i = {}, m934l = {130}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ byte[] $audioData;
    final /* synthetic */ MutableState<AudioTrack> $audioTrackState;
    final /* synthetic */ MutableState<Boolean> $isPlaying$delegate;
    final /* synthetic */ MutableFloatState $playbackProgress$delegate;
    final /* synthetic */ int $sampleRate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1(MutableState<AudioTrack> mutableState, byte[] bArr, int i, MutableState<Boolean> mutableState2, MutableFloatState mutableFloatState, Continuation<? super AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1> continuation) {
        super(2, continuation);
        this.$audioTrackState = mutableState;
        this.$audioData = bArr;
        this.$sampleRate = i;
        this.$isPlaying$delegate = mutableState2;
        this.$playbackProgress$delegate = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1(this.$audioTrackState, this.$audioData, this.$sampleRate, this.$isPlaying$delegate, this.$playbackProgress$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!AudioPlaybackPanelKt.AudioPlaybackPanel$lambda$1(this.$isPlaying$delegate)) {
                    AudioPlaybackPanelKt.AudioPlaybackPanel$lambda$2(this.$isPlaying$delegate, true);
                    MutableState<AudioTrack> mutableState = this.$audioTrackState;
                    byte[] bArr = this.$audioData;
                    int i = this.$sampleRate;
                    final MutableFloatState mutableFloatState = this.$playbackProgress$delegate;
                    Function1 function1 = new Function1() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1.invokeSuspend$lambda$0(mutableFloatState, ((Float) obj).floatValue());
                        }
                    };
                    final MutableFloatState mutableFloatState2 = this.$playbackProgress$delegate;
                    final MutableState<Boolean> mutableState2 = this.$isPlaying$delegate;
                    this.label = 1;
                    if (AudioPlaybackPanelKt.playAudio(mutableState, bArr, i, function1, new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AudioPlaybackPanelKt$AudioPlaybackPanel$3$1$1$1.invokeSuspend$lambda$1(mutableFloatState2, mutableState2);
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    AudioPlaybackPanelKt.stopPlayAudio(this.$audioTrackState);
                    this.$playbackProgress$delegate.setFloatValue(0.0f);
                    AudioPlaybackPanelKt.AudioPlaybackPanel$lambda$2(this.$isPlaying$delegate, false);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableFloatState $playbackProgress$delegate, float it) {
        $playbackProgress$delegate.setFloatValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(MutableFloatState $playbackProgress$delegate, MutableState $isPlaying$delegate) {
        $playbackProgress$delegate.setFloatValue(0.0f);
        AudioPlaybackPanelKt.AudioPlaybackPanel$lambda$2($isPlaying$delegate, false);
        return Unit.INSTANCE;
    }
}
