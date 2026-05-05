package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.material.MenuKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.messaging.Constants;
import com.google.ai.edge.gallery.common.AgentAction;
import com.google.ai.edge.gallery.common.CallJsSkillResultImage;
import com.google.ai.edge.gallery.common.CallJsSkillResultWebview;
import com.google.ai.edge.gallery.common.SkillProgressAgentAction;
import com.google.ai.edge.gallery.proto.Skill;
import com.google.ai.edge.litertlm.Tool;
import com.google.ai.edge.litertlm.ToolParam;
import com.google.ai.edge.litertlm.ToolSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: compiled from: AgentTools.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0$2\b\b\u0001\u0010&\u001a\u00020%H\u0007J2\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020(0$2\b\b\u0001\u0010&\u001a\u00020%2\b\b\u0001\u0010)\u001a\u00020%2\b\b\u0001\u0010*\u001a\u00020%H\u0007J(\u0010+\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0$2\b\b\u0001\u0010,\u001a\u00020%2\b\b\u0001\u0010-\u001a\u00020%H\u0007J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00061"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/AgentTools;", "Lcom/google/ai/edge/litertlm/ToolSet;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "skillManagerViewModel", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;", "getSkillManagerViewModel", "()Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;", "setSkillManagerViewModel", "(Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerViewModel;)V", "_actionChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/google/ai/edge/gallery/common/AgentAction;", "actionChannel", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getActionChannel", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "resultImageToShow", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "getResultImageToShow", "()Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "setResultImageToShow", "(Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;)V", "resultWebviewToShow", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "getResultWebviewToShow", "()Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "setResultWebviewToShow", "(Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;)V", "loadSkill", "", "", "skillName", "runJs", "", "scriptName", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "runIntent", "intent", "parameters", "sendAgentAction", "", "action", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AgentTools implements ToolSet {
    public static final int $stable = 8;
    private final Channel<AgentAction> _actionChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    private final ReceiveChannel<AgentAction> actionChannel = this._actionChannel;
    public Context context;
    private CallJsSkillResultImage resultImageToShow;
    private CallJsSkillResultWebview resultWebviewToShow;
    public SkillManagerViewModel skillManagerViewModel;

    public final Context getContext() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("context");
        return null;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final SkillManagerViewModel getSkillManagerViewModel() {
        SkillManagerViewModel skillManagerViewModel = this.skillManagerViewModel;
        if (skillManagerViewModel != null) {
            return skillManagerViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("skillManagerViewModel");
        return null;
    }

    public final void setSkillManagerViewModel(SkillManagerViewModel skillManagerViewModel) {
        Intrinsics.checkNotNullParameter(skillManagerViewModel, "<set-?>");
        this.skillManagerViewModel = skillManagerViewModel;
    }

    public final ReceiveChannel<AgentAction> getActionChannel() {
        return this.actionChannel;
    }

    public final CallJsSkillResultImage getResultImageToShow() {
        return this.resultImageToShow;
    }

    public final void setResultImageToShow(CallJsSkillResultImage callJsSkillResultImage) {
        this.resultImageToShow = callJsSkillResultImage;
    }

    public final CallJsSkillResultWebview getResultWebviewToShow() {
        return this.resultWebviewToShow;
    }

    public final void setResultWebviewToShow(CallJsSkillResultWebview callJsSkillResultWebview) {
        this.resultWebviewToShow = callJsSkillResultWebview;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.agentchat.AgentTools$loadSkill$1 */
    /* JADX INFO: compiled from: AgentTools.kt */
    @Metadata(m921d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m922d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.AgentTools$loadSkill$1", m932f = "AgentTools.kt", m933i = {0, 0, 0, 1, 1, 1}, m934l = {65, MenuKt.OutTransitionDuration}, m935m = "invokeSuspend", m936n = {"skills", "skill", "skillContent", "skills", "skill", "skillContent"}, m938s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class C24321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends String>>, Object> {
        final /* synthetic */ String $skillName;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24321(String str, Continuation<? super C24321> continuation) {
            super(2, continuation);
            this.$skillName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AgentTools.this.new C24321(this.$skillName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<String, String>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, String>> continuation) {
            return ((C24321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object next;
            String skillContent;
            String skillContent2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    List<Skill> selectedSkills = AgentTools.this.getSkillManagerViewModel().getSelectedSkills();
                    String str = this.$skillName;
                    Iterator<T> it = selectedSkills.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            Skill it2 = (Skill) next;
                            if (Intrinsics.areEqual(it2.getName(), StringsKt.trim((CharSequence) str).toString())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Skill skill = (Skill) next;
                    if (skill != null) {
                        skillContent = "---\nname: " + skill.getName() + "\ndescription: " + skill.getDescription() + "\n---\n\n" + skill.getInstructions();
                    } else {
                        skillContent = "Skill not found";
                    }
                    Log.d("AGAgentTools", "load skill. Skill content:\n" + skillContent);
                    if (skill != null) {
                        Channel channel = AgentTools.this._actionChannel;
                        String str2 = "Loading skill \"" + this.$skillName + "\"";
                        String str3 = "Load \"" + skill.getName() + "\"";
                        String description = skill.getDescription();
                        this.L$0 = SpillingKt.nullOutSpilledVariable(selectedSkills);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(skill);
                        this.L$2 = skillContent;
                        this.label = 1;
                        if (channel.send(new SkillProgressAgentAction(str2, true, str3, "Description: " + description, skill), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        skillContent2 = skillContent;
                    } else {
                        Channel channel2 = AgentTools.this._actionChannel;
                        String str4 = this.$skillName;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(selectedSkills);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(skill);
                        this.L$2 = skillContent;
                        this.label = 2;
                        if (channel2.send(new SkillProgressAgentAction("Failed to load skill \"" + str4 + "\"", false, null, null, null, 28, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        skillContent2 = skillContent;
                    }
                    break;
                case 1:
                    skillContent2 = (String) this.L$2;
                    ResultKt.throwOnFailure($result);
                    break;
                case 2:
                    skillContent2 = (String) this.L$2;
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return MapsKt.mapOf(TuplesKt.m929to("skill_name", this.$skillName), TuplesKt.m929to("skill_instructions", skillContent2));
        }
    }

    @Tool(description = "Loads a skill.")
    public final Map<String, String> loadSkill(@ToolParam(description = "The name of the skill to load.") String skillName) {
        Intrinsics.checkNotNullParameter(skillName, "skillName");
        // FIXED: Security fix - Changed from Dispatchers.getDefault() to Dispatchers.IO
        // This prevents blocking the main thread work-stealing pool
        // Note: runBlocking still blocks the calling thread, but IO dispatcher is more appropriate
        // for I/O-bound operations
        return (Map) BuildersKt.runBlocking(Dispatchers.getIO(), new C24321(skillName, null));
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.agentchat.AgentTools$runJs$1 */
    /* JADX INFO: compiled from: AgentTools.kt */
    @Metadata(m921d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m922d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.AgentTools$runJs$1", m932f = "AgentTools.kt", m933i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5}, m934l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 137, 138, 162, 175, 176}, m935m = "invokeSuspend", m936n = {"$this$runBlocking", "skills", "skill", "$this$runBlocking", "skills", "skill", "secret", "savedSecret", "action", "$this$runBlocking", "skills", "skill", "secret", "savedSecret", "action", "$this$runBlocking", "skills", "skill", "secret", ImagesContract.URL, "$this$runBlocking", "skills", "skill", "secret", ImagesContract.URL, "action", "$this$runBlocking", "skills", "skill", "secret", ImagesContract.URL, "action"}, m938s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class C24341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends String>>, Object> {
        final /* synthetic */ String $data;
        final /* synthetic */ String $scriptName;
        final /* synthetic */ String $skillName;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ AgentTools this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24341(String str, String str2, String str3, AgentTools agentTools, Continuation<? super C24341> continuation) {
            super(2, continuation);
            this.$skillName = str;
            this.$scriptName = str2;
            this.$data = str3;
            this.this$0 = agentTools;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24341 c24341 = new C24341(this.$skillName, this.$scriptName, this.$data, this.this$0, continuation);
            c24341.L$0 = obj;
            return c24341;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<String, String>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, String>> continuation) {
            return ((C24341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:120:0x05e9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x02b2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x02c1  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x02c4  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x02fb  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x031c  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0327  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0415  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0417  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x041a  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0462 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0463  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0498 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x04da  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x04df  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x04e8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
        public final java.lang.Object invokeSuspend(java.lang.Object r38) {
            /*
        public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        public final java.lang.Object invokeSuspend(java.lang.Object r38) {
            // Method dump skipped - placeholder implementation
            return null;
        }
    }

    @Tool(description = "Runs JS script")
    public final Map<String, Object> runJs(@ToolParam(description = "The name of skill") String skillName, @ToolParam(description = "The script name to run. Use 'index.html' if not provided by user") String scriptName, @ToolParam(description = "The data to pass to the script. Use empty string if not provided by user") String data) {
        Intrinsics.checkNotNullParameter(skillName, "skillName");
        Intrinsics.checkNotNullParameter(scriptName, "scriptName");
        Intrinsics.checkNotNullParameter(data, "data");
        // FIXED: Security fix - Changed from Dispatchers.getDefault() to Dispatchers.IO
        return (Map) BuildersKt.runBlocking(Dispatchers.getIO(), new C24341(skillName, scriptName, data, this, null));
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.agentchat.AgentTools$runIntent$1 */
    /* JADX INFO: compiled from: AgentTools.kt */
    @Metadata(m921d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m922d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.AgentTools$runIntent$1", m932f = "AgentTools.kt", m933i = {}, m934l = {234}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C24331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends String>>, Object> {
        final /* synthetic */ String $intent;
        final /* synthetic */ String $parameters;
        int label;
        final /* synthetic */ AgentTools this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24331(String str, String str2, AgentTools agentTools, Continuation<? super C24331> continuation) {
            super(2, continuation);
            this.$intent = str;
            this.$parameters = str2;
            this.this$0 = agentTools;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24331(this.$intent, this.$parameters, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends String>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Map<String, String>>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Map<String, String>> continuation) {
            return ((C24331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d("AGAgentTools", "Run intent. Intent: '" + this.$intent + "', parameters: '" + this.$parameters + "'");
                    Channel channel = this.this$0._actionChannel;
                    String str = "Executing intent \"" + this.$intent + "\"";
                    String str2 = "Execute intent \"" + this.$intent + "\"";
                    String str3 = this.$parameters;
                    this.label = 1;
                    if (channel.send(new SkillProgressAgentAction(str, true, str2, "Parameters: " + str3, null, 16, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (IntentHandler.INSTANCE.handleAction(this.this$0.getContext(), this.$intent, this.$parameters)) {
                return MapsKt.mapOf(TuplesKt.m929to("action", this.$intent), TuplesKt.m929to("parameters", this.$parameters), TuplesKt.m929to("result", "succeeded"));
            }
            return MapsKt.mapOf(TuplesKt.m929to("action", this.$intent), TuplesKt.m929to("parameters", this.$parameters), TuplesKt.m929to("result", "failed"));
        }
    }

    @Tool(description = "Run an Android intent. It is used to interact with the app to perform certain actions.")
    public final Map<String, String> runIntent(@ToolParam(description = "The intent to run.") String intent, @ToolParam(description = "A JSON string containing the parameter values required for the intent.") String parameters) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        // FIXED: Security fix - Changed from Dispatchers.getDefault() to Dispatchers.IO
        return (Map) BuildersKt.runBlocking(Dispatchers.getIO(), new C24331(intent, parameters, this, null));
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.customtasks.agentchat.AgentTools$sendAgentAction$1 */
    /* JADX INFO: compiled from: AgentTools.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.customtasks.agentchat.AgentTools$sendAgentAction$1", m932f = "AgentTools.kt", m933i = {}, m934l = {259}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C24351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AgentAction $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C24351(AgentAction agentAction, Continuation<? super C24351> continuation) {
            super(2, continuation);
            this.$action = agentAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AgentTools.this.new C24351(this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (AgentTools.this._actionChannel.send(this.$action, this) == coroutine_suspended) {
                        return coroutine_suspended;
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

    public final void sendAgentAction(AgentAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        // FIXED: Security fix - Changed from Dispatchers.getDefault() to Dispatchers.IO
        BuildersKt.runBlocking(Dispatchers.getIO(), new C24351(action, null));
    }
}
}
}
