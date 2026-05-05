package com.google.ai.edge.gallery.ui.llmsingleturn;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.ai.edge.gallery.common.UtilsKt;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.runtime.ModelHelperExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;



V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/ai/edge/gallery/ui/llmsingleturn/LlmSingleTurnUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "generateResponse", "", "task", "Lcom/google/ai/edge/gallery/data/Task;", "model", "Lcom/google/ai/edge/gallery/data/Model;", "input", "", "selectPromptTemplate", "promptTemplateType", "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateType;", "setInProgress", "inProgress", "", "setPreparing", "preparing", "updateResponse", "response", "stopResponse", "createUiState", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class LlmSingleTurnViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<LlmSingleTurnUiState> _uiState = StateFlowKt.MutableStateFlow(createUiState());
    private final StateFlow<LlmSingleTurnUiState> uiState = FlowKt.asStateFlow(this._uiState);

    @Inject
    public LlmSingleTurnViewModel() {
    }

    public final StateFlow<LlmSingleTurnUiState> getUiState() {
        return this.uiState;
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel$generateResponse$1", m932f = "LlmSingleTurnViewModel.kt", m933i = {1, 1}, m934l = {65, 79}, m935m = "invokeSuspend", m936n = {"supportImage", "supportAudio"}, m938s = {"I$0", "I$1"})
    static final class C27721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $input;
        final /* synthetic */ Model $model;
        final /* synthetic */ Task $task;
        int I$0;
        int I$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27721(Model model, Task task, String str, Continuation<? super C27721> continuation) {
            super(2, continuation);
            this.$model = model;
            this.$task = task;
            this.$input = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LlmSingleTurnViewModel.this.new C27721(this.$model, this.$task, this.$input, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel.C27721.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
        public static final Unit invokeSuspend$lambda$0(Ref.BooleanRef $firstRun, LlmSingleTurnViewModel this$0, Ref.ObjectRef $response, Model $model, String partialResult, boolean done, String partialThinkingResult) {
            if ($firstRun.element) {
                this$0.setPreparing(false);
                $firstRun.element = false;
            }
            $response.element = UtilsKt.processLlmResponse($response.element + partialResult);
            this$0.updateResponse($model, this$0.getUiState().getValue().getSelectedPromptTemplateType(), (String) $response.element);
            if (done) {
                this$0.setInProgress(false);
            }
            return Unit.INSTANCE;
        }

        
        public static final Unit invokeSuspend$lambda$1(LlmSingleTurnViewModel this$0) {
            this$0.setPreparing(false);
            this$0.setInProgress(false);
            return Unit.INSTANCE;
        }

        
        public static final Unit invokeSuspend$lambda$2(LlmSingleTurnViewModel this$0, String str) {
            this$0.setPreparing(false);
            this$0.setInProgress(false);
            return Unit.INSTANCE;
        }
    }

    public final void generateResponse(Task task, Model model, String input) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(input, "input");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C27721(model, task, input, null), 2, null);
    }

    public final void selectPromptTemplate(Model model, PromptTemplateType promptTemplateType) {
        LlmSingleTurnUiState value;
        LlmSingleTurnUiState it;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(promptTemplateType, "promptTemplateType");
        Log.d("AGLlmSingleTurnVM", "selecting prompt template: " + promptTemplateType.getLabel());
        updateResponse(model, promptTemplateType, "");
        MutableStateFlow<LlmSingleTurnUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = LlmSingleTurnUiState.copy$default(this.uiState.getValue(), false, false, null, promptTemplateType, 7, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setInProgress(boolean inProgress) {
        LlmSingleTurnUiState value;
        LlmSingleTurnUiState it;
        MutableStateFlow<LlmSingleTurnUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = LlmSingleTurnUiState.copy$default(this._uiState.getValue(), inProgress, false, null, null, 14, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setPreparing(boolean preparing) {
        LlmSingleTurnUiState value;
        LlmSingleTurnUiState it;
        MutableStateFlow<LlmSingleTurnUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = LlmSingleTurnUiState.copy$default(this._uiState.getValue(), false, preparing, null, null, 13, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void updateResponse(Model model, PromptTemplateType promptTemplateType, String response) {
        LlmSingleTurnUiState value;
        LlmSingleTurnUiState currentState;
        LinkedHashMap linkedHashMap;
        Map newResponses;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(promptTemplateType, "promptTemplateType");
        Intrinsics.checkNotNullParameter(response, "response");
        MutableStateFlow<LlmSingleTurnUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            currentState = value;
            Map<String, Map<String, String>> responsesByModel = currentState.getResponsesByModel();
            Map<String, String> map = responsesByModel.get(model.getName());
            if (map == null || (linkedHashMap = MapsKt.toMutableMap(map)) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            Map modelResponses = linkedHashMap;
            modelResponses.put(promptTemplateType.getLabel(), response);
            newResponses = MapsKt.toMutableMap(responsesByModel);
            newResponses.put(model.getName(), modelResponses);
        } while (!mutableStateFlow.compareAndSet(value, LlmSingleTurnUiState.copy$default(currentState, false, false, newResponses, null, 11, null)));
    }

    
    
    
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel$stopResponse$1", m932f = "LlmSingleTurnViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C27761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Model $model;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27761(Model model, Continuation<? super C27761> continuation) {
            super(2, continuation);
            this.$model = model;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LlmSingleTurnViewModel.this.new C27761(this.$model, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    LlmSingleTurnViewModel.this.setInProgress(false);
                    ModelHelperExtKt.getRuntimeHelper(this.$model).stopResponse(this.$model);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void stopResponse(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Log.d("AGLlmSingleTurnVM", "Stopping response for model " + model.getName() + "...");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C27761(model, null), 2, null);
    }

    private final LlmSingleTurnUiState createUiState() {
        Map responsesByModel = new LinkedHashMap();
        return new LlmSingleTurnUiState(false, false, responsesByModel, null, 11, null);
    }
}
