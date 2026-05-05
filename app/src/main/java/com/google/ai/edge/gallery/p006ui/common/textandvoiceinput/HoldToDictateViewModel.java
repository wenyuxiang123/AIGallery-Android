package com.google.ai.edge.gallery.p006ui.common.textandvoiceinput;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: HoldToDictateViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\u001a\u001a\u00020\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015J\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0017J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0016J\u0012\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020\u00172\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u0017H\u0016J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u0019H\u0016J\u0012\u00100\u001a\u00020\u00172\b\u00101\u001a\u0004\u0018\u00010%H\u0016J\u0012\u00102\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u00010%H\u0016J\u001a\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/speech/RecognitionListener;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/ai/edge/gallery/ui/common/textandvoiceinput/HoldToDictateUiState;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "recognizerIntent", "Landroid/content/Intent;", "onRecognitionDone", "Lkotlin/Function1;", "", "", "onAmplitudeChanged", "", "startSpeechRecognition", "onDone", "stopSpeechRecognition", "cancelSpeechRecognition", "setRecognizing", "recognizing", "", "setRecognizedText", "text", "onReadyForSpeech", "params", "Landroid/os/Bundle;", "onBeginningOfSpeech", "onRmsChanged", "rmsdB", "", "onBufferReceived", "buffer", "", "onEndOfSpeech", "onError", "error", "onResults", "results", "onPartialResults", "partialResults", "onEvent", "eventType", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class HoldToDictateViewModel extends ViewModel implements RecognitionListener {
    public static final int $stable = 8;
    private final MutableStateFlow<HoldToDictateUiState> _uiState;
    private final Context context;
    private Function1<? super Integer, Unit> onAmplitudeChanged;
    private Function1<? super String, Unit> onRecognitionDone;
    private final Intent recognizerIntent;
    private final SpeechRecognizer speechRecognizer;
    private final StateFlow<HoldToDictateUiState> uiState;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public HoldToDictateViewModel(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this._uiState = StateFlowKt.MutableStateFlow(new HoldToDictateUiState(false, null, 3, 0 == true ? 1 : 0));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(this.context);
        speechRecognizerCreateSpeechRecognizer.setRecognitionListener(this);
        Intrinsics.checkNotNullExpressionValue(speechRecognizerCreateSpeechRecognizer, "apply(...)");
        this.speechRecognizer = speechRecognizerCreateSpeechRecognizer;
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", "en-US");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        this.recognizerIntent = intent;
    }

    protected final MutableStateFlow<HoldToDictateUiState> get_uiState() {
        return this._uiState;
    }

    public final StateFlow<HoldToDictateUiState> getUiState() {
        return this.uiState;
    }

    public final void startSpeechRecognition(Function1<? super String, Unit> onDone, Function1<? super Integer, Unit> onAmplitudeChanged) {
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(onAmplitudeChanged, "onAmplitudeChanged");
        this.onRecognitionDone = onDone;
        this.onAmplitudeChanged = onAmplitudeChanged;
        this.speechRecognizer.startListening(this.recognizerIntent);
        setRecognizedText("");
        setRecognizing(true);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateViewModel$stopSpeechRecognition$1 */
    /* JADX INFO: compiled from: HoldToDictateViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.common.textandvoiceinput.HoldToDictateViewModel$stopSpeechRecognition$1", m932f = "HoldToDictateViewModel.kt", m933i = {}, m934l = {82}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C27481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C27481(Continuation<? super C27481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HoldToDictateViewModel.this.new C27481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (DelayKt.delay(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            HoldToDictateViewModel.this.speechRecognizer.stopListening();
            HoldToDictateViewModel.this.setRecognizing(false);
            return Unit.INSTANCE;
        }
    }

    public final void stopSpeechRecognition() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C27481(null), 3, null);
    }

    public final void cancelSpeechRecognition() {
        setRecognizing(false);
    }

    public final void setRecognizing(boolean recognizing) {
        HoldToDictateUiState value;
        HoldToDictateUiState it;
        MutableStateFlow<HoldToDictateUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = HoldToDictateUiState.copy$default(this.uiState.getValue(), recognizing, null, 2, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setRecognizedText(String text) {
        HoldToDictateUiState value;
        HoldToDictateUiState it;
        Intrinsics.checkNotNullParameter(text, "text");
        MutableStateFlow<HoldToDictateUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = HoldToDictateUiState.copy$default(this.uiState.getValue(), false, text, 1, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    @Override // android.speech.RecognitionListener
    public void onReadyForSpeech(Bundle params) {
    }

    @Override // android.speech.RecognitionListener
    public void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public void onRmsChanged(float rmsdB) {
        Function1<? super Integer, Unit> function1 = this.onAmplitudeChanged;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(HoldToDictateViewModelKt.convertRmsDbToAmplitude(rmsdB)));
        }
    }

    @Override // android.speech.RecognitionListener
    public void onBufferReceived(byte[] buffer) {
    }

    @Override // android.speech.RecognitionListener
    public void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public void onError(int error) {
    }

    @Override // android.speech.RecognitionListener
    public void onResults(Bundle results) {
        ArrayList<String> stringArrayList = results != null ? results.getStringArrayList("results_recognition") : null;
        if (stringArrayList != null && stringArrayList.size() > 0) {
            String str = stringArrayList.get(0);
            setRecognizedText(str != null ? str : "");
        } else {
            setRecognizedText("");
        }
        Function1<? super String, Unit> function1 = this.onRecognitionDone;
        if (function1 != null) {
            function1.invoke(this.uiState.getValue().getRecognizedText());
        }
        setRecognizing(false);
    }

    @Override // android.speech.RecognitionListener
    public void onPartialResults(Bundle partialResults) {
        ArrayList<String> stringArrayList = partialResults != null ? partialResults.getStringArrayList("results_recognition") : null;
        if (stringArrayList != null && stringArrayList.size() > 0) {
            String str = stringArrayList.get(0);
            setRecognizedText(str != null ? str : "");
        } else {
            setRecognizedText("");
        }
    }

    @Override // android.speech.RecognitionListener
    public void onEvent(int eventType, Bundle params) {
    }
}
