package com.google.ai.edge.gallery.customtasks.agentchat;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.AnalyticsKt;
import com.google.ai.edge.gallery.GalleryEvent;
import com.google.ai.edge.gallery.common.AgentAction;
import com.google.ai.edge.gallery.common.AskInfoAgentAction;
import com.google.ai.edge.gallery.common.CallJsAgentAction;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: compiled from: AgentChatScreen.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$AgentChatScreen$5$1$1", m932f = "AgentChatScreen.kt", m933i = {0, 1, 1, 1, 1}, m934l = {216, 640}, m935m = "invokeSuspend", m936n = {"$this$LaunchedEffect", "$this$LaunchedEffect", "action", "skillName", "$i$f$suspendCancellableCoroutine"}, m938s = {"L$0", "L$0", "L$2", "L$3", "I$0"})
final class AgentChatScreenKt$AgentChatScreen$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<AgentAction> $actionChannel;
    final /* synthetic */ MutableState<String> $askInfoInputValue$delegate;
    final /* synthetic */ ChatWebViewClient $chatWebViewClient;
    final /* synthetic */ MutableState<AskInfoAgentAction> $currentAskInfoAction$delegate;
    final /* synthetic */ State<Model> $currentModel$delegate;
    final /* synthetic */ ImageVector $doneIcon;
    final /* synthetic */ MutableState<Boolean> $showAskInfoDialog$delegate;
    final /* synthetic */ LlmChatViewModel $viewModel;
    final /* synthetic */ MutableState<WebView> $webViewRef$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AgentChatScreenKt$AgentChatScreen$5$1$1(ReceiveChannel<? extends AgentAction> receiveChannel, LlmChatViewModel llmChatViewModel, ImageVector imageVector, State<Model> state, ChatWebViewClient chatWebViewClient, MutableState<WebView> mutableState, MutableState<AskInfoAgentAction> mutableState2, MutableState<String> mutableState3, MutableState<Boolean> mutableState4, Continuation<? super AgentChatScreenKt$AgentChatScreen$5$1$1> continuation) {
        super(2, continuation);
        this.$actionChannel = receiveChannel;
        this.$viewModel = llmChatViewModel;
        this.$doneIcon = imageVector;
        this.$currentModel$delegate = state;
        this.$chatWebViewClient = chatWebViewClient;
        this.$webViewRef$delegate = mutableState;
        this.$currentAskInfoAction$delegate = mutableState2;
        this.$askInfoInputValue$delegate = mutableState3;
        this.$showAskInfoDialog$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AgentChatScreenKt$AgentChatScreen$5$1$1 agentChatScreenKt$AgentChatScreen$5$1$1 = new AgentChatScreenKt$AgentChatScreen$5$1$1(this.$actionChannel, this.$viewModel, this.$doneIcon, this.$currentModel$delegate, this.$chatWebViewClient, this.$webViewRef$delegate, this.$currentAskInfoAction$delegate, this.$askInfoInputValue$delegate, this.$showAskInfoDialog$delegate, continuation);
        agentChatScreenKt$AgentChatScreen$5$1$1.L$0 = obj;
        return agentChatScreenKt$AgentChatScreen$5$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AgentChatScreenKt$AgentChatScreen$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:24|(2:27|(1:29)(1:30))(1:26)|31|74|32|33|34|(1:36)|37|(1:39)|(1:41)(7:42|72|43|(3:45|70|46)(1:50)|51|13|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0243, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0244, code lost:
    
        r7 = r15;
        r4 = r0;
        r0 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r8;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0066, code lost:
    
        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.google.ai.edge.gallery.common.CallJsAgentAction) r9).getResult().completeExceptionally(r4));
        r8 = r7;
        r4 = false;
        r5 = 1;
        r7 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d6  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01ca -> B:72:0x01cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x02cc -> B:13:0x0066). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            // Method dump skipped - placeholder implementation
            return null;
        }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$AgentChatScreen$5$1$1$1 */
    /* JADX INFO: compiled from: AgentChatScreen.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.AgentChatScreenKt$AgentChatScreen$5$1$1$1", m932f = "AgentChatScreen.kt", m933i = {}, m934l = {242}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C24311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AgentAction $action;
        final /* synthetic */ String $skillName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24311(AgentAction agentAction, String str, Continuation<? super C24311> continuation) {
            super(2, continuation);
            this.$action = agentAction;
            this.$skillName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24311(this.$action, this.$skillName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (DelayKt.delay(60000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((CallJsAgentAction) this.$action).getResult().isCompleted()) {
                Log.e("AGAgentChatScreen", "JS Execution timed out, completing with error.");
                Log.d("AGAgentChatScreen", "Analytics: skill_execution, skill_name=" + this.$skillName + ", success=false, error_type=timeout");
                FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
                if (firebaseAnalytics != null) {
                    String id = GalleryEvent.SKILL_EXECUTION.getId();
                    Bundle $this$invokeSuspend_u24lambda_u240 = new Bundle();
                    $this$invokeSuspend_u24lambda_u240.putString("skill_name", this.$skillName);
                    $this$invokeSuspend_u24lambda_u240.putBoolean(FirebaseAnalytics.Param.SUCCESS, false);
                    $this$invokeSuspend_u24lambda_u240.putString("error_type", "timeout");
                    Unit unit = Unit.INSTANCE;
                    firebaseAnalytics.logEvent(id, $this$invokeSuspend_u24lambda_u240);
                }
                ((CallJsAgentAction) this.$action).getResult().complete("{\"error\": \"Skill execution timed out. Please check network connection.\"}");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(AgentAction $action, String $skillName, String result) {
        Log.d("AGAgentChatScreen", "Got result:\n" + result);
        ((CallJsAgentAction) $action).getResult().complete(result);
        boolean isSuccess = !StringsKt.contains$default((CharSequence) result, (CharSequence) "\"error\":", false, 2, (Object) null);
        String errorType = isSuccess ? "" : "js_error";
        Log.d("AGAgentChatScreen", "Analytics: skill_execution, skill_name=" + $skillName + ", success=" + isSuccess + ", error_type=" + errorType);
        FirebaseAnalytics firebaseAnalytics = AnalyticsKt.getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            String id = GalleryEvent.SKILL_EXECUTION.getId();
            Bundle $this$invokeSuspend_u24lambda_u242_u24lambda_u241 = new Bundle();
            $this$invokeSuspend_u24lambda_u242_u24lambda_u241.putString("skill_name", $skillName);
            $this$invokeSuspend_u24lambda_u242_u24lambda_u241.putBoolean(FirebaseAnalytics.Param.SUCCESS, isSuccess);
            $this$invokeSuspend_u24lambda_u242_u24lambda_u241.putString("error_type", errorType);
            Unit unit = Unit.INSTANCE;
            firebaseAnalytics.logEvent(id, $this$invokeSuspend_u24lambda_u242_u24lambda_u241);
        }
        return Unit.INSTANCE;
    }
}
