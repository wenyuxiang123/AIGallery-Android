package com.google.ai.edge.gallery.customtasks.mobileactions;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.provider.CalendarContract;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.net.MailTo;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.webkit.internal.AssetHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.C2421R;
import com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.ui.llmchat.LlmChatModelHelper;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatus;
import com.google.ai.edge.gallery.ui.modelmanager.ModelInitializationStatusType;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.runtime.LlmModelHelper;
import com.google.ai.edge.litertlm.Message;
import com.google.ai.edge.litertlm.ToolProvider;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.List;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: MobileActionsViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u001bJ\u0006\u0010\"\u001a\u00020\u0013J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0010JU\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001b2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130-2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00130/J\u001c\u00103\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*JO\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u00106\u001a\u0002072!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00130/J\u0016\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020:2\u0006\u00105\u001a\u00020\u0003J\u0018\u0010;\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u0010H\u0002J0\u0010=\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020\u001bH\u0002J(\u0010B\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00032\u0006\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020\u001bH\u0002J\u0018\u0010F\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00032\u0006\u0010G\u001a\u00020\u001bH\u0002J\u0010\u0010H\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u0003H\u0002J \u0010I\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u001b2\u0006\u0010K\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/MobileActionsViewModel;", "Landroidx/lifecycle/ViewModel;", "appContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/MobileActionsUiState;", "get_uiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_isResettingConversation", "", "isResettingConversation", "reset", "", "cleanUp", "setShowWelcomeMessage", "showWelcomeMessage", "setProcessing", "processing", "setUserPrompt", "prompt", "", "setModelResponse", "response", "appendModelResponse", "partialResponse", "addFunctionCallDetails", "details", "clearFunctionCallDetails", "setNoFunctionRecognized", "value", "processUserPrompt", "model", "Lcom/google/ai/edge/gallery/data/Model;", "userPrompt", "tools", "", "Lcom/google/ai/edge/litertlm/ToolProvider;", "onProcessDone", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "error", "resetConversation", "resetEngine", "context", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "performAction", "action", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/Action;", "setFlashlight", "isEnabled", "createContact", "firstName", "lastName", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "email", "sendEmail", "to", "subject", "body", "showLocationOnMap", FirebaseAnalytics.Param.LOCATION, "openWifiSettings", "createCalendarEvent", "datetime", "title", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MobileActionsViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _isResettingConversation;
    private final MutableStateFlow<MobileActionsUiState> _uiState;
    private final Context appContext;
    private final StateFlow<Boolean> isResettingConversation;
    private final StateFlow<MobileActionsUiState> uiState;

    @Inject
    public MobileActionsViewModel(@ApplicationContext Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this._uiState = StateFlowKt.MutableStateFlow(new MobileActionsUiState(false, false, null, null, null, false, 63, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._isResettingConversation = StateFlowKt.MutableStateFlow(false);
        this.isResettingConversation = FlowKt.asStateFlow(this._isResettingConversation);
    }

    protected final MutableStateFlow<MobileActionsUiState> get_uiState() {
        return this._uiState;
    }

    public final StateFlow<MobileActionsUiState> getUiState() {
        return this.uiState;
    }

    public final void reset() {
        setFlashlight(this.appContext, false);
        setShowWelcomeMessage(true);
        setUserPrompt("'");
        setModelResponse("");
        setNoFunctionRecognized(false);
        clearFunctionCallDetails();
    }

    public final void cleanUp() {
        setFlashlight(this.appContext, false);
    }

    public final void setShowWelcomeMessage(boolean showWelcomeMessage) {
        MobileActionsUiState value;
        MobileActionsUiState it;
        MutableStateFlow<MobileActionsUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = MobileActionsUiState.copy$default(this._uiState.getValue(), showWelcomeMessage, false, null, null, null, false, 62, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setProcessing(boolean processing) {
        MobileActionsUiState value;
        MobileActionsUiState it;
        MutableStateFlow<MobileActionsUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = MobileActionsUiState.copy$default(this._uiState.getValue(), false, processing, null, null, null, false, 61, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setUserPrompt(String prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        MutableStateFlow<MobileActionsUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), MobileActionsUiState.copy$default(this._uiState.getValue(), false, false, prompt, null, null, false, 59, null))) {
        }
    }

    public final void setModelResponse(String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        MutableStateFlow<MobileActionsUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), MobileActionsUiState.copy$default(this._uiState.getValue(), false, false, null, response, null, false, 55, null))) {
        }
    }

    public final void appendModelResponse(String partialResponse) {
        MobileActionsUiState value;
        MobileActionsUiState it;
        Intrinsics.checkNotNullParameter(partialResponse, "partialResponse");
        MutableStateFlow<MobileActionsUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = MobileActionsUiState.copy$default(this._uiState.getValue(), false, false, null, this._uiState.getValue().getModelResponse() + partialResponse, null, false, 55, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void addFunctionCallDetails(String details) {
        Intrinsics.checkNotNullParameter(details, "details");
        List newDetails = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getFunctionCallDetails());
        newDetails.add(details);
        MutableStateFlow<MobileActionsUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), MobileActionsUiState.copy$default(this._uiState.getValue(), false, false, null, null, newDetails, false, 47, null))) {
        }
    }

    public final void clearFunctionCallDetails() {
        MobileActionsUiState value;
        MobileActionsUiState it;
        MutableStateFlow<MobileActionsUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = MobileActionsUiState.copy$default(this._uiState.getValue(), false, false, null, null, CollectionsKt.emptyList(), false, 47, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setNoFunctionRecognized(boolean value) {
        MobileActionsUiState value2;
        MobileActionsUiState it;
        MutableStateFlow<MobileActionsUiState> mutableStateFlow = this._uiState;
        do {
            value2 = mutableStateFlow.getValue();
            it = MobileActionsUiState.copy$default(this._uiState.getValue(), false, false, null, null, null, value, 31, null);
        } while (!mutableStateFlow.compareAndSet(value2, it));
    }

    public final void processUserPrompt(Model model, String userPrompt, List<? extends ToolProvider> tools, Function0<Unit> onProcessDone, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(userPrompt, "userPrompt");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(onProcessDone, "onProcessDone");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (model.getInstance() != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C25431(userPrompt, this, model, onError, onProcessDone, tools, null), 2, null);
        } else {
            setProcessing(false);
        }
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$processUserPrompt$1 */
    /* JADX INFO: compiled from: MobileActionsViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$processUserPrompt$1", m932f = "MobileActionsViewModel.kt", m933i = {1, 1, 1}, m934l = {153, 175}, m935m = "invokeSuspend", m936n = {"instance", "conversation", "contents"}, m938s = {"L$0", "L$1", "L$2"})
    static final class C25431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Model $model;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onProcessDone;
        final /* synthetic */ List<ToolProvider> $tools;
        final /* synthetic */ String $userPrompt;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ MobileActionsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C25431(String str, MobileActionsViewModel mobileActionsViewModel, Model model, Function1<? super String, Unit> function1, Function0<Unit> function0, List<? extends ToolProvider> list, Continuation<? super C25431> continuation) {
            super(2, continuation);
            this.$userPrompt = str;
            this.this$0 = mobileActionsViewModel;
            this.$model = model;
            this.$onError = function1;
            this.$onProcessDone = function0;
            this.$tools = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25431(this.$userPrompt, this.this$0, this.$model, this.$onError, this.$onProcessDone, this.$tools, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x011a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x011b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel.C25431.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$processUserPrompt$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: MobileActionsViewModel.kt */
        @Metadata(m921d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m922d2 = {"<anonymous>", "", "it"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$processUserPrompt$1$1", m932f = "MobileActionsViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
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

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$processUserPrompt$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: MobileActionsViewModel.kt */
        @Metadata(m921d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/google/ai/edge/litertlm/Message;", "it", ""}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$processUserPrompt$1$2", m932f = "MobileActionsViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<? super Message>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $onError;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function1<? super String, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.$onError = function1;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super Message> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onError, continuation);
                anonymousClass2.L$0 = th;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Throwable it = (Throwable) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Log.e("AGMAViewModel", "Failed to run inference", it);
                        Function1<String, Unit> function1 = this.$onError;
                        String message = it.getMessage();
                        if (message == null) {
                            message = "Unknown error";
                        }
                        function1.invoke(message);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$processUserPrompt$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: MobileActionsViewModel.kt */
        @Metadata(m921d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/google/ai/edge/litertlm/Message;", "it", ""}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$processUserPrompt$1$3", m932f = "MobileActionsViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Message>, Throwable, Continuation<? super Unit>, Object> {
            final /* synthetic */ Model $model;
            final /* synthetic */ Function0<Unit> $onProcessDone;
            final /* synthetic */ List<ToolProvider> $tools;
            int label;
            final /* synthetic */ MobileActionsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(MobileActionsViewModel mobileActionsViewModel, Function0<Unit> function0, Model model, List<? extends ToolProvider> list, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = mobileActionsViewModel;
                this.$onProcessDone = function0;
                this.$model = model;
                this.$tools = list;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super Message> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return new AnonymousClass3(this.this$0, this.$onProcessDone, this.$model, this.$tools, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.this$0.setProcessing(false);
                        this.$onProcessDone.invoke();
                        this.this$0.resetConversation(this.$model, this.$tools);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void resetConversation(Model model, List<? extends ToolProvider> tools) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tools, "tools");
        this._isResettingConversation.setValue(true);
        LlmModelHelper.resetConversation$default(LlmChatModelHelper.INSTANCE, model, false, false, MobileActionsTaskKt.getSystemPrompt(), tools, false, 32, null);
        this._isResettingConversation.setValue(false);
    }

    public final void resetEngine(Context context, Model model, List<? extends ToolProvider> tools, ModelManagerViewModel modelManagerViewModel, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(onError, "onError");
        reset();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C25441(modelManagerViewModel, model, context, tools, onError, null), 2, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$resetEngine$1 */
    /* JADX INFO: compiled from: MobileActionsViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$resetEngine$1", m932f = "MobileActionsViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C25441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Model $model;
        final /* synthetic */ ModelManagerViewModel $modelManagerViewModel;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ List<ToolProvider> $tools;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C25441(ModelManagerViewModel modelManagerViewModel, Model model, Context context, List<? extends ToolProvider> list, Function1<? super String, Unit> function1, Continuation<? super C25441> continuation) {
            super(2, continuation);
            this.$modelManagerViewModel = modelManagerViewModel;
            this.$model = model;
            this.$context = context;
            this.$tools = list;
            this.$onError = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25441(this.$modelManagerViewModel, this.$model, this.$context, this.$tools, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.$modelManagerViewModel.setInitializationStatus(this.$model, new ModelInitializationStatus(ModelInitializationStatusType.NOT_INITIALIZED, null, null, 6, null));
                    LlmChatModelHelper llmChatModelHelper = LlmChatModelHelper.INSTANCE;
                    Model model = this.$model;
                    final Context context = this.$context;
                    final Model model2 = this.$model;
                    final List<ToolProvider> list = this.$tools;
                    final ModelManagerViewModel modelManagerViewModel = this.$modelManagerViewModel;
                    final Function1<String, Unit> function1 = this.$onError;
                    llmChatModelHelper.cleanUp(model, new Function0() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$resetEngine$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MobileActionsViewModel.C25441.invokeSuspend$lambda$1(context, model2, list, modelManagerViewModel, function1);
                        }
                    });
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(Context $context, final Model $model, List $tools, final ModelManagerViewModel $modelManagerViewModel, final Function1 $onError) {
            LlmModelHelper.initialize$default(LlmChatModelHelper.INSTANCE, $context, $model, false, false, new Function1() { // from class: com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel$resetEngine$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MobileActionsViewModel.C25441.invokeSuspend$lambda$1$lambda$0($modelManagerViewModel, $model, $onError, (String) obj);
                }
            }, MobileActionsTaskKt.getSystemPrompt(), $tools, false, null, 384, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1$lambda$0(ModelManagerViewModel $modelManagerViewModel, Model $model, Function1 $onError, String error) {
            $modelManagerViewModel.setInitializationStatus($model, new ModelInitializationStatus(ModelInitializationStatusType.INITIALIZED, null, null, 6, null));
            if (error.length() > 0) {
                $onError.invoke(error);
            }
            return Unit.INSTANCE;
        }
    }

    public final String performAction(Action action, Context context) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(context, "context");
        if (action instanceof FlashlightOnAction) {
            return setFlashlight(context, true);
        }
        if (action instanceof FlashlightOffAction) {
            return setFlashlight(context, false);
        }
        if (action instanceof CreateContactAction) {
            return createContact(context, ((CreateContactAction) action).getFirstName(), ((CreateContactAction) action).getLastName(), ((CreateContactAction) action).getPhoneNumber(), ((CreateContactAction) action).getEmail());
        }
        if (action instanceof SendEmailAction) {
            return sendEmail(context, ((SendEmailAction) action).getTo(), ((SendEmailAction) action).getSubject(), ((SendEmailAction) action).getBody());
        }
        if (action instanceof ShowLocationOnMap) {
            return showLocationOnMap(context, ((ShowLocationOnMap) action).getLocation());
        }
        if (action instanceof OpenWifiSettingsAction) {
            return openWifiSettings(context);
        }
        if (action instanceof CreateCalendarEventAction) {
            return createCalendarEvent(context, ((CreateCalendarEventAction) action).getDatetime(), ((CreateCalendarEventAction) action).getTitle());
        }
        return "";
    }

    private final String setFlashlight(Context context, boolean isEnabled) {
        Object systemService = context.getSystemService("camera");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        String cameraId = null;
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            int length = cameraIdList.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String id = cameraIdList[i];
                CameraCharacteristics characteristics = cameraManager.getCameraCharacteristics(id);
                Intrinsics.checkNotNullExpressionValue(characteristics, "getCameraCharacteristics(...)");
                Boolean bool = (Boolean) characteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                boolean isFlashAvailable = bool != null ? bool.booleanValue() : false;
                if (!isFlashAvailable) {
                    i++;
                } else {
                    cameraId = id;
                    break;
                }
            }
            if (cameraId != null) {
                try {
                    cameraManager.setTorchMode(cameraId, isEnabled);
                    return "";
                } catch (Exception e) {
                    Log.e("AGMAViewModel", "Failed to set flashlight", e);
                    String message = e.getMessage();
                    if (message != null) {
                        return message;
                    }
                    String string = context.getString(C2421R.string.unknown_error);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    return string;
                }
            }
            return "";
        } catch (Exception e2) {
            Log.e("AGMAViewModel", "Failed to set flashlight", e2);
            String message2 = e2.getMessage();
            if (message2 != null) {
                return message2;
            }
            String string2 = context.getString(C2421R.string.unknown_error);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
    }

    private final String createContact(Context context, String firstName, String lastName, String phoneNumber, String email) {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        intent.putExtra("name", firstName + " " + lastName);
        intent.putExtra("email", email);
        intent.putExtra("email_type", 2);
        intent.putExtra("phone", phoneNumber);
        intent.putExtra("phone_type", 3);
        try {
            context.startActivity(intent);
            return "";
        } catch (Exception e) {
            Log.e("AGMAViewModel", "Failed to create contact", e);
            String message = e.getMessage();
            if (message != null) {
                return message;
            }
            String string = context.getString(C2421R.string.unknown_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }

    private final String sendEmail(Context context, String to, String subject, String body) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setData(Uri.parse(MailTo.MAILTO_SCHEME));
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.EMAIL", new String[]{to});
        intent.putExtra("android.intent.extra.SUBJECT", subject);
        intent.putExtra("android.intent.extra.TEXT", body);
        try {
            context.startActivity(intent);
            return "";
        } catch (Exception e) {
            Log.e("AGMAViewModel", "Failed to send email", e);
            String message = e.getMessage();
            if (message != null) {
                return message;
            }
            String string = context.getString(C2421R.string.unknown_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }

    private final String showLocationOnMap(Context context, String location) throws UnsupportedEncodingException {
        String encodedLocation = URLEncoder.encode(location, StandardCharsets.UTF_8.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        String $this$toUri$iv = "geo:0,0?q=" + encodedLocation;
        intent.setData(Uri.parse($this$toUri$iv));
        try {
            context.startActivity(intent);
            return "";
        } catch (Exception e) {
            Log.e("AGMAViewModel", "Failed to show location on map", e);
            String message = e.getMessage();
            if (message != null) {
                return message;
            }
            String string = context.getString(C2421R.string.unknown_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }

    private final String openWifiSettings(Context context) {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
        try {
            context.startActivity(intent);
            return "";
        } catch (Exception e) {
            Log.e("AGMAViewModel", "Failed to open wifi settings", e);
            String message = e.getMessage();
            if (message != null) {
                return message;
            }
            String string = context.getString(C2421R.string.unknown_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.time.ZonedDateTime] */
    private final String createCalendarEvent(Context context, String datetime, String title) {
        long ms = System.currentTimeMillis();
        try {
            LocalDateTime localDateTime = LocalDateTime.parse(datetime);
            ZoneId systemDefaultZone = ZoneId.systemDefault();
            ms = localDateTime.atZone(systemDefaultZone).toInstant().toEpochMilli();
        } catch (Exception e) {
            Log.w("AGMAViewModel", "Failed to parse date time: '" + datetime + "'", e);
        }
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setData(CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", title);
        intent.putExtra("beginTime", ms);
        intent.putExtra("endTime", ((long) 3600000) + ms);
        try {
            context.startActivity(intent);
            return "";
        } catch (Exception e2) {
            Log.e("AGMAViewModel", "Failed to create calendar event", e2);
            String message = e2.getMessage();
            if (message != null) {
                return message;
            }
            String string = context.getString(C2421R.string.unknown_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }
}
