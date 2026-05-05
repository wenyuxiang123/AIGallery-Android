package com.google.ai.edge.gallery.p006ui.common.chat;

import android.content.Context;
import android.media.AudioRecord;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import java.io.ByteArrayOutputStream;
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

/* JADX INFO: compiled from: AudioRecorderPanel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$AudioRecorderPanel$2$2$3$1$1", m932f = "AudioRecorderPanel.kt", m933i = {}, m934l = {186}, m935m = "invokeSuspend", m936n = {}, m938s = {})
final class AudioRecorderPanelKt$AudioRecorderPanel$2$2$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<AudioRecord> $audioRecordState;
    final /* synthetic */ ByteArrayOutputStream $audioStream;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableLongState $elapsedMs;
    final /* synthetic */ MutableState<Boolean> $isRecording$delegate;
    final /* synthetic */ Function1<Integer, Unit> $onAmplitudeChanged;
    final /* synthetic */ Function1<byte[], Unit> $onSendAudioClip;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AudioRecorderPanelKt$AudioRecorderPanel$2$2$3$1$1(Context context, MutableState<AudioRecord> mutableState, ByteArrayOutputStream byteArrayOutputStream, MutableLongState mutableLongState, Function1<? super Integer, Unit> function1, Function1<? super byte[], Unit> function12, MutableState<Boolean> mutableState2, Continuation<? super AudioRecorderPanelKt$AudioRecorderPanel$2$2$3$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$audioRecordState = mutableState;
        this.$audioStream = byteArrayOutputStream;
        this.$elapsedMs = mutableLongState;
        this.$onAmplitudeChanged = function1;
        this.$onSendAudioClip = function12;
        this.$isRecording$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioRecorderPanelKt$AudioRecorderPanel$2$2$3$1$1(this.$context, this.$audioRecordState, this.$audioStream, this.$elapsedMs, this.$onAmplitudeChanged, this.$onSendAudioClip, this.$isRecording$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioRecorderPanelKt$AudioRecorderPanel$2$2$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!AudioRecorderPanelKt.AudioRecorderPanel$lambda$1(this.$isRecording$delegate)) {
                    AudioRecorderPanelKt.AudioRecorderPanel$lambda$2(this.$isRecording$delegate, true);
                    Context context = this.$context;
                    MutableState<AudioRecord> mutableState = this.$audioRecordState;
                    ByteArrayOutputStream byteArrayOutputStream = this.$audioStream;
                    MutableLongState mutableLongState = this.$elapsedMs;
                    Function1<Integer, Unit> function1 = this.$onAmplitudeChanged;
                    final MutableState<AudioRecord> mutableState2 = this.$audioRecordState;
                    final ByteArrayOutputStream byteArrayOutputStream2 = this.$audioStream;
                    final Function1<byte[], Unit> function12 = this.$onSendAudioClip;
                    final MutableState<Boolean> mutableState3 = this.$isRecording$delegate;
                    this.label = 1;
                    if (AudioRecorderPanelKt.startRecording(context, mutableState, byteArrayOutputStream, mutableLongState, function1, new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.AudioRecorderPanelKt$AudioRecorderPanel$2$2$3$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AudioRecorderPanelKt$AudioRecorderPanel$2$2$3$1$1.invokeSuspend$lambda$0(mutableState2, byteArrayOutputStream2, function12, mutableState3);
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    byte[] curRecordedBytes = AudioRecorderPanelKt.stopRecording(this.$audioRecordState, this.$audioStream);
                    this.$onSendAudioClip.invoke(curRecordedBytes);
                    AudioRecorderPanelKt.AudioRecorderPanel$lambda$2(this.$isRecording$delegate, false);
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
    public static final Unit invokeSuspend$lambda$0(MutableState $audioRecordState, ByteArrayOutputStream $audioStream, Function1 $onSendAudioClip, MutableState $isRecording$delegate) {
        byte[] curRecordedBytes = AudioRecorderPanelKt.stopRecording($audioRecordState, $audioStream);
        $onSendAudioClip.invoke(curRecordedBytes);
        AudioRecorderPanelKt.AudioRecorderPanel$lambda$2($isRecording$delegate, false);
        return Unit.INSTANCE;
    }
}
