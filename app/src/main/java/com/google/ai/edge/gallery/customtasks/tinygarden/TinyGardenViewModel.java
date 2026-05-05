package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.content.Context;
import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.p006ui.common.chat.ChatMessage;
import com.google.ai.edge.gallery.p006ui.common.chat.ChatMessageText;
import com.google.ai.edge.gallery.p006ui.common.chat.ChatMessageWarning;
import com.google.ai.edge.gallery.p006ui.common.chat.ChatSide;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmChatModelHelper;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmModelInstance;
import com.google.ai.edge.gallery.runtime.LlmModelHelper;
import com.google.ai.edge.litertlm.Content;
import com.google.ai.edge.litertlm.Contents;
import com.google.ai.edge.litertlm.Conversation;
import com.google.ai.edge.litertlm.Message;
import com.google.ai.edge.litertlm.ToolProvider;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: TinyGardenViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m921d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J>\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u001dJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0014J\u000e\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0014J\u0006\u0010'\u001a\u00020\u0017J\u0006\u0010(\u001a\u00020\u0017JG\u0010)\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00170\u001dJ4\u00100\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "dataStoreRepository", "Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "<init>", "(Landroid/content/Context;Lcom/google/ai/edge/gallery/data/DataStoreRepository;)V", "getDataStoreRepository", "()Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenUiState;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_isResettingConversation", "", "isResettingConversation", "getCommand", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "instructionText", "", "onDone", "Lkotlin/Function1;", "onError", "addMessage", "message", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "clearMessages", "setProcessing", "processing", "setResettingEngine", "resetting", "incrementNumTurns", "resetNumTurns", "resetEngine", "tools", "", "Lcom/google/ai/edge/litertlm/ToolProvider;", "Lkotlin/ParameterName;", "name", "error", "resetConversation", "prevSeed", "prevPlots", "prevAction", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class TinyGardenViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _isResettingConversation;
    private final MutableStateFlow<TinyGardenUiState> _uiState;
    private final Context context;
    private final DataStoreRepository dataStoreRepository;
    private final StateFlow<Boolean> isResettingConversation;
    private final StateFlow<TinyGardenUiState> uiState;

    public final DataStoreRepository getDataStoreRepository() {
        return this.dataStoreRepository;
    }

    @Inject
    public TinyGardenViewModel(@ApplicationContext Context context, DataStoreRepository dataStoreRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataStoreRepository, "dataStoreRepository");
        this.context = context;
        this.dataStoreRepository = dataStoreRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new TinyGardenUiState(false, false, null, 0, 15, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._isResettingConversation = StateFlowKt.MutableStateFlow(false);
        this.isResettingConversation = FlowKt.asStateFlow(this._isResettingConversation);
    }

    protected final MutableStateFlow<TinyGardenUiState> get_uiState() {
        return this._uiState;
    }

    public final StateFlow<TinyGardenUiState> getUiState() {
        return this.uiState;
    }

    public final void getCommand(Model model, String instructionText, Function1<? super String, Unit> onDone, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(instructionText, "instructionText");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (model.getInstance() == null) {
            setProcessing(false);
            return;
        }
        incrementNumTurns();
        Log.d("AGTGViewModel", "Turn #: " + this.uiState.getValue().getNumTurns());
        addMessage(new ChatMessageText(instructionText, ChatSide.USER, 0.0f, false, null, null, false, null, 252, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C25521(instructionText, this, model, onDone, onError, null), 2, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel$getCommand$1 */
    /* JADX INFO: compiled from: TinyGardenViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel$getCommand$1", m932f = "TinyGardenViewModel.kt", m933i = {}, m934l = {105}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $instructionText;
        final /* synthetic */ Model $model;
        final /* synthetic */ Function1<String, Unit> $onDone;
        final /* synthetic */ Function1<String, Unit> $onError;
        int label;
        final /* synthetic */ TinyGardenViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C25521(String str, TinyGardenViewModel tinyGardenViewModel, Model model, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super C25521> continuation) {
            super(2, continuation);
            this.$instructionText = str;
            this.this$0 = tinyGardenViewModel;
            this.$model = model;
            this.$onDone = function1;
            this.$onError = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25521(this.$instructionText, this.this$0, this.$model, this.$onDone, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d("AGTGViewModel", "Start processing user instruction: '" + this.$instructionText + "'");
                    this.this$0.setProcessing(true);
                    Log.d("AGTGViewModel", "Waiting for any ongoing conversation reset to be done...");
                    this.label = 1;
                    if (FlowKt.first(this.this$0.isResettingConversation, new AnonymousClass1(null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.d("AGTGViewModel", "Done waiting. Start inference.");
            Object model = this.$model.getInstance();
            Intrinsics.checkNotNull(model, "null cannot be cast to non-null type com.google.ai.edge.gallery.ui.llmchat.LlmModelInstance");
            LlmModelInstance instance = (LlmModelInstance) model;
            Conversation conversation = instance.getConversation();
            List contents = new ArrayList();
            if (StringsKt.trim((CharSequence) this.$instructionText).toString().length() > 0) {
                contents.add(new Content.Text(this.$instructionText));
            }
            try {
                try {
                    Message responseMessage = Conversation.sendMessage$default(conversation, Contents.INSTANCE.m596of((List<? extends Content>) contents), (Map) null, 2, (Object) null);
                    String response = responseMessage.toString();
                    Log.d("AGTGViewModel", "Done processing user instruction. Response: " + response);
                    this.$onDone.invoke(response);
                } catch (Exception e) {
                    Log.e("AGTGViewModel", "Failed to run inference", e);
                    Function1<String, Unit> function1 = this.$onError;
                    String message = e.getMessage();
                    if (message == null) {
                        message = this.this$0.context.getString(C2421R.string.unknown_error);
                        Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
                    }
                    function1.invoke(message);
                }
                this.this$0.setProcessing(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.setProcessing(false);
                throw th;
            }
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel$getCommand$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: TinyGardenViewModel.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "", "it"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel$getCommand$1$1", m932f = "TinyGardenViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                boolean it = this.Z$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        return Boxing.boxBoolean(!it);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void addMessage(ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        List newMessages = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getMessages());
        newMessages.add(message);
        MutableStateFlow<TinyGardenUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), TinyGardenUiState.copy$default(this._uiState.getValue(), false, false, newMessages, 0, 11, null))) {
        }
    }

    public final void clearMessages() {
        TinyGardenUiState value;
        TinyGardenUiState it;
        MutableStateFlow<TinyGardenUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = TinyGardenUiState.copy$default(this._uiState.getValue(), false, false, CollectionsKt.emptyList(), 0, 11, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setProcessing(boolean processing) {
        TinyGardenUiState value;
        TinyGardenUiState it;
        MutableStateFlow<TinyGardenUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = TinyGardenUiState.copy$default(this.uiState.getValue(), processing, false, null, 0, 14, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setResettingEngine(boolean resetting) {
        TinyGardenUiState value;
        TinyGardenUiState it;
        MutableStateFlow<TinyGardenUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = TinyGardenUiState.copy$default(this.uiState.getValue(), false, resetting, null, 0, 13, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void incrementNumTurns() {
        TinyGardenUiState value;
        TinyGardenUiState it;
        MutableStateFlow<TinyGardenUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = TinyGardenUiState.copy$default(this.uiState.getValue(), false, false, null, this.uiState.getValue().getNumTurns() + 1, 7, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void resetNumTurns() {
        TinyGardenUiState value;
        TinyGardenUiState it;
        MutableStateFlow<TinyGardenUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = TinyGardenUiState.copy$default(this.uiState.getValue(), false, false, null, 0, 7, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void resetEngine(Context context, Model model, List<? extends ToolProvider> tools, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(onError, "onError");
        resetNumTurns();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C25541(model, context, tools, onError, null), 2, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel$resetEngine$1 */
    /* JADX INFO: compiled from: TinyGardenViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel$resetEngine$1", m932f = "TinyGardenViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Model $model;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ List<ToolProvider> $tools;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C25541(Model model, Context context, List<? extends ToolProvider> list, Function1<? super String, Unit> function1, Continuation<? super C25541> continuation) {
            super(2, continuation);
            this.$model = model;
            this.$context = context;
            this.$tools = list;
            this.$onError = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TinyGardenViewModel.this.new C25541(this.$model, this.$context, this.$tools, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    TinyGardenViewModel.this.setResettingEngine(true);
                    LlmChatModelHelper llmChatModelHelper = LlmChatModelHelper.INSTANCE;
                    Model model = this.$model;
                    final Context context = this.$context;
                    final Model model2 = this.$model;
                    final List<ToolProvider> list = this.$tools;
                    final TinyGardenViewModel tinyGardenViewModel = TinyGardenViewModel.this;
                    final Function1<String, Unit> function1 = this.$onError;
                    llmChatModelHelper.cleanUp(model, new Function0() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel$resetEngine$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TinyGardenViewModel.C25541.invokeSuspend$lambda$1(context, model2, list, tinyGardenViewModel, function1);
                        }
                    });
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(final Context $context, Model $model, List $tools, final TinyGardenViewModel this$0, final Function1 $onError) {
            LlmModelHelper.initialize$default(LlmChatModelHelper.INSTANCE, $context, $model, false, false, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel$resetEngine$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TinyGardenViewModel.C25541.invokeSuspend$lambda$1$lambda$0(this$0, $onError, $context, (String) obj);
                }
            }, Contents.INSTANCE.m595of(TinyGardenTaskKt.getTinyGardenSystemPrompt$default(null, null, null, 7, null)), $tools, true, null, 256, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(TinyGardenViewModel this$0, Function1 $onError, Context $context, String error) {
            this$0.setResettingEngine(false);
            if (error.length() > 0) {
                $onError.invoke(error);
            }
            String string = $context.getString(C2421R.string.engin_reset_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this$0.addMessage(new ChatMessageWarning(string));
            return Unit.INSTANCE;
        }
    }

    public final void resetConversation(Model model, List<? extends ToolProvider> tools, String prevSeed, String prevPlots, String prevAction) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(prevSeed, "prevSeed");
        Intrinsics.checkNotNullParameter(prevPlots, "prevPlots");
        Intrinsics.checkNotNullParameter(prevAction, "prevAction");
        resetNumTurns();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C25531(prevSeed, prevPlots, prevAction, model, tools, null), 2, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel$resetConversation$1 */
    /* JADX INFO: compiled from: TinyGardenViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel$resetConversation$1", m932f = "TinyGardenViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Model $model;
        final /* synthetic */ String $prevAction;
        final /* synthetic */ String $prevPlots;
        final /* synthetic */ String $prevSeed;
        final /* synthetic */ List<ToolProvider> $tools;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C25531(String str, String str2, String str3, Model model, List<? extends ToolProvider> list, Continuation<? super C25531> continuation) {
            super(2, continuation);
            this.$prevSeed = str;
            this.$prevPlots = str2;
            this.$prevAction = str3;
            this.$model = model;
            this.$tools = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TinyGardenViewModel.this.new C25531(this.$prevSeed, this.$prevPlots, this.$prevAction, this.$model, this.$tools, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    TinyGardenViewModel.this._isResettingConversation.setValue(Boxing.boxBoolean(true));
                    String curSystemPrompt = TinyGardenTaskKt.getTinyGardenSystemPrompt(this.$prevSeed, this.$prevPlots, this.$prevAction);
                    Log.d("AGTGViewModel", "Current system prompt:\n" + curSystemPrompt);
                    LlmChatModelHelper.INSTANCE.resetConversation(this.$model, false, false, Contents.INSTANCE.m595of(curSystemPrompt), this.$tools, true);
                    TinyGardenViewModel.this._isResettingConversation.setValue(Boxing.boxBoolean(false));
                    TinyGardenViewModel tinyGardenViewModel = TinyGardenViewModel.this;
                    String string = TinyGardenViewModel.this.context.getString(C2421R.string.conversation_reset_message);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    tinyGardenViewModel.addMessage(new ChatMessageWarning(string));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
