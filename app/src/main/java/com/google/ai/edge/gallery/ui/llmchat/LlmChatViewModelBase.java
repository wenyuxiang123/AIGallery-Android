package com.google.ai.edge.gallery.ui.llmchat;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.lifecycle.ViewModelKt;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.Model;
import com.google.ai.edge.gallery.data.Task;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageAudioClip;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageError;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageLoading;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageText;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessageWarning;
import com.google.ai.edge.gallery.ui.common.chat.ChatViewModel;
import com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase;
import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.runtime.ModelHelperExtKt;
import com.google.ai.edge.litertlm.Contents;
import com.google.ai.edge.litertlm.ToolProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: LlmChatViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m921d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jz\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J`\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u00152\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010 \u001a\u00020\u0015J4\u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0015J.\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\t¨\u0006*"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/llmchat/LlmChatViewModelBase;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatViewModel;", "<init>", "()V", "generateResponse", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "input", "", "images", "", "Landroid/graphics/Bitmap;", "audioMessages", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageAudioClip;", "onFirstToken", "Lkotlin/Function1;", "onDone", "Lkotlin/Function0;", "onError", "allowThinking", "", "stopResponse", "resetSession", "task", "Lcom/google/ai/edge/gallery/data/Task;", "systemInstruction", "Lcom/google/ai/edge/litertlm/Contents;", "tools", "Lcom/google/ai/edge/litertlm/ToolProvider;", "supportImage", "supportAudio", "enableConversationConstrainedDecoding", "runAgain", "message", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageText;", "handleError", "context", "Landroid/content/Context;", "modelManagerViewModel", "Lcom/google/ai/edge/gallery/ui/modelmanager/ModelManagerViewModel;", "errorMessage", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public class LlmChatViewModelBase extends ChatViewModel {
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void generateResponse$default(LlmChatViewModelBase llmChatViewModelBase, Model model, String str, List list, List list2, Function1 function1, Function0 function0, Function1 function12, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateResponse");
        }
        llmChatViewModelBase.generateResponse(model, str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? new Function1() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return LlmChatViewModelBase.generateResponse$lambda$0((Model) obj2);
            }
        } : function1, (i & 32) != 0 ? new Function0() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0, function12, (i & 128) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit generateResponse$lambda$0(Model it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$generateResponse$3 */
    /* JADX INFO: compiled from: LlmChatViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$generateResponse$3", m932f = "LlmChatViewModel.kt", m933i = {}, m934l = {70, 72}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C27603 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accelerator;
        final /* synthetic */ boolean $allowThinking;
        final /* synthetic */ List<ChatMessageAudioClip> $audioMessages;
        final /* synthetic */ List<Bitmap> $images;
        final /* synthetic */ String $input;
        final /* synthetic */ Model $model;
        final /* synthetic */ Function0<Unit> $onDone;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function1<Model, Unit> $onFirstToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C27603(Model model, String str, List<ChatMessageAudioClip> list, boolean z, String str2, List<Bitmap> list2, Function1<? super String, Unit> function1, Function1<? super Model, Unit> function12, Function0<Unit> function0, Continuation<? super C27603> continuation) {
            super(2, continuation);
            this.$model = model;
            this.$accelerator = str;
            this.$audioMessages = list;
            this.$allowThinking = z;
            this.$input = str2;
            this.$images = list2;
            this.$onError = function1;
            this.$onFirstToken = function12;
            this.$onDone = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LlmChatViewModelBase.this.new C27603(this.$model, this.$accelerator, this.$audioMessages, this.$allowThinking, this.$input, this.$images, this.$onError, this.$onFirstToken, this.$onDone, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27603) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[LOOP:0: B:20:0x0079->B:22:0x007f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase.C27603.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final kotlin.Unit invokeSuspend$lambda$0(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase r26, com.google.ai.edge.gallery.data.Model r27, java.lang.String r28, long r29, kotlin.jvm.internal.Ref.BooleanRef r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function0 r33, java.lang.String r34, boolean r35, java.lang.String r36) {
            /*
                Method dump skipped, instruction units count: 419
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase.C27603.invokeSuspend$lambda$0(com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase, com.google.ai.edge.gallery.data.Model, java.lang.String, long, kotlin.jvm.internal.Ref$BooleanRef, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String, boolean, java.lang.String):kotlin.Unit");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(LlmChatViewModelBase this$0) {
            this$0.setInProgress(false);
            this$0.setPreparing(false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(LlmChatViewModelBase this$0, Function1 $onError, String message) {
            Log.e("AGLlmChatViewModel", "Error occurred while running inference");
            this$0.setInProgress(false);
            this$0.setPreparing(false);
            $onError.invoke(message);
            return Unit.INSTANCE;
        }
    }

    public final void generateResponse(Model model, String input, List<Bitmap> images, List<ChatMessageAudioClip> audioMessages, Function1<? super Model, Unit> onFirstToken, Function0<Unit> onDone, Function1<? super String, Unit> onError, boolean allowThinking) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(audioMessages, "audioMessages");
        Intrinsics.checkNotNullParameter(onFirstToken, "onFirstToken");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Intrinsics.checkNotNullParameter(onError, "onError");
        String accelerator = model.getStringConfigValue(ConfigKeys.INSTANCE.getACCELERATOR(), "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C27603(model, accelerator, audioMessages, allowThinking, input, images, onError, onFirstToken, onDone, null), 2, null);
    }

    public final void stopResponse(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Log.d("AGLlmChatViewModel", "Stopping response for model " + model.getName() + "...");
        if (getLastMessage(model) instanceof ChatMessageLoading) {
            removeLastMessage(model);
        }
        setInProgress(false);
        ModelHelperExtKt.getRuntimeHelper(model).stopResponse(model);
        Log.d("AGLlmChatViewModel", "Done stopping response");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void resetSession$default(LlmChatViewModelBase llmChatViewModelBase, Task task, Model model, Contents contents, List list, boolean z, boolean z2, Function0 function0, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetSession");
        }
        llmChatViewModelBase.resetSession(task, model, (i & 4) != 0 ? null : contents, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? new Function0() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0, (i & 128) != 0 ? false : z3);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$resetSession$2 */
    /* JADX INFO: compiled from: LlmChatViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$resetSession$2", m932f = "LlmChatViewModel.kt", m933i = {}, m934l = {277}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C27652 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $enableConversationConstrainedDecoding;
        final /* synthetic */ Model $model;
        final /* synthetic */ Function0<Unit> $onDone;
        final /* synthetic */ boolean $supportAudio;
        final /* synthetic */ boolean $supportImage;
        final /* synthetic */ Contents $systemInstruction;
        final /* synthetic */ List<ToolProvider> $tools;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C27652(Model model, boolean z, boolean z2, Contents contents, List<? extends ToolProvider> list, boolean z3, Function0<Unit> function0, Continuation<? super C27652> continuation) {
            super(2, continuation);
            this.$model = model;
            this.$supportImage = z;
            this.$supportAudio = z2;
            this.$systemInstruction = contents;
            this.$tools = list;
            this.$enableConversationConstrainedDecoding = z3;
            this.$onDone = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LlmChatViewModelBase.this.new C27652(this.$model, this.$supportImage, this.$supportAudio, this.$systemInstruction, this.$tools, this.$enableConversationConstrainedDecoding, this.$onDone, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27652) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object obj;
            C27652 c27652;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    LlmChatViewModelBase.this.setIsResettingSession(true);
                    LlmChatViewModelBase.this.clearAllMessages(this.$model);
                    LlmChatViewModelBase.this.stopResponse(this.$model);
                    obj = coroutine_suspended;
                    c27652 = this;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    obj = coroutine_suspended;
                    c27652 = this;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            do {
                try {
                    ModelHelperExtKt.getRuntimeHelper(c27652.$model).resetConversation(c27652.$model, c27652.$supportImage, c27652.$supportAudio, c27652.$systemInstruction, c27652.$tools, c27652.$enableConversationConstrainedDecoding);
                    LlmChatViewModelBase.this.setIsResettingSession(false);
                    c27652.$onDone.invoke();
                    return Unit.INSTANCE;
                } catch (Exception e) {
                    Log.d("AGLlmChatViewModel", "Failed to reset session. Trying again");
                    c27652.label = 1;
                }
            } while (DelayKt.delay(200L, c27652) != obj);
            return obj;
        }
    }

    public final void resetSession(Task task, Model model, Contents systemInstruction, List<? extends ToolProvider> tools, boolean supportImage, boolean supportAudio, Function0<Unit> onDone, boolean enableConversationConstrainedDecoding) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C27652(model, supportImage, supportAudio, systemInstruction, tools, enableConversationConstrainedDecoding, onDone, null), 2, null);
    }

    public static /* synthetic */ void runAgain$default(LlmChatViewModelBase llmChatViewModelBase, Model model, ChatMessageText chatMessageText, Function1 function1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runAgain");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        llmChatViewModelBase.runAgain(model, chatMessageText, function1, z);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$runAgain$1 */
    /* JADX INFO: compiled from: LlmChatViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$runAgain$1", m932f = "LlmChatViewModel.kt", m933i = {}, m934l = {293}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C27661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $allowThinking;
        final /* synthetic */ ChatMessageText $message;
        final /* synthetic */ Model $model;
        final /* synthetic */ Function1<String, Unit> $onError;
        int label;
        final /* synthetic */ LlmChatViewModelBase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C27661(Model model, LlmChatViewModelBase llmChatViewModelBase, ChatMessageText chatMessageText, Function1<? super String, Unit> function1, boolean z, Continuation<? super C27661> continuation) {
            super(2, continuation);
            this.$model = model;
            this.this$0 = llmChatViewModelBase;
            this.$message = chatMessageText;
            this.$onError = function1;
            this.$allowThinking = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27661(this.$model, this.this$0, this.$message, this.$onError, this.$allowThinking, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object obj;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    obj = coroutine_suspended;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    obj = coroutine_suspended;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (this.$model.getInstance() == null) {
                this.label = 1;
                if (DelayKt.delay(100L, this) == obj) {
                    return obj;
                }
            }
            this.this$0.addMessage(this.$model, this.$message.clone());
            LlmChatViewModelBase.generateResponse$default(this.this$0, this.$model, this.$message.getContent(), null, null, null, null, this.$onError, this.$allowThinking, 60, null);
            return Unit.INSTANCE;
        }
    }

    public final void runAgain(Model model, ChatMessageText message, Function1<? super String, Unit> onError, boolean allowThinking) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C27661(model, this, message, onError, allowThinking, null), 2, null);
    }

    public final void handleError(Context context, Task task, Model model, ModelManagerViewModel modelManagerViewModel, String errorMessage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelManagerViewModel, "modelManagerViewModel");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (getLastMessage(model) instanceof ChatMessageLoading) {
            removeLastMessage(model);
        }
        addMessage(model, new ChatMessageError(errorMessage));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new C27641(modelManagerViewModel, context, task, model, this, null), 2, null);
    }

    /* JADX INFO: renamed from: com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$handleError$1 */
    /* JADX INFO: compiled from: LlmChatViewModel.kt */
    @Metadata(m921d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m922d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m923k = 3, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(m931c = "com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$handleError$1", m932f = "LlmChatViewModel.kt", m933i = {}, m934l = {}, m935m = "invokeSuspend", m936n = {}, m938s = {})
    static final class C27641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Model $model;
        final /* synthetic */ ModelManagerViewModel $modelManagerViewModel;
        final /* synthetic */ Task $task;
        int label;
        final /* synthetic */ LlmChatViewModelBase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27641(ModelManagerViewModel modelManagerViewModel, Context context, Task task, Model model, LlmChatViewModelBase llmChatViewModelBase, Continuation<? super C27641> continuation) {
            super(2, continuation);
            this.$modelManagerViewModel = modelManagerViewModel;
            this.$context = context;
            this.$task = task;
            this.$model = model;
            this.this$0 = llmChatViewModelBase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27641(this.$modelManagerViewModel, this.$context, this.$task, this.$model, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ModelManagerViewModel modelManagerViewModel = this.$modelManagerViewModel;
                    Context context = this.$context;
                    Task task = this.$task;
                    Model model = this.$model;
                    final ModelManagerViewModel modelManagerViewModel2 = this.$modelManagerViewModel;
                    final Context context2 = this.$context;
                    final Task task2 = this.$task;
                    final Model model2 = this.$model;
                    final LlmChatViewModelBase llmChatViewModelBase = this.this$0;
                    ModelManagerViewModel.cleanupModel$default(modelManagerViewModel, context, task, model, null, new Function0() { // from class: com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModelBase$handleError$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LlmChatViewModelBase.C27641.invokeSuspend$lambda$0(modelManagerViewModel2, context2, task2, model2, llmChatViewModelBase);
                        }
                    }, 8, null);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(ModelManagerViewModel $modelManagerViewModel, Context $context, Task $task, Model $model, LlmChatViewModelBase this$0) {
            ModelManagerViewModel.initializeModel$default($modelManagerViewModel, $context, $task, $model, false, null, 24, null);
            this$0.addMessage($model, new ChatMessageWarning("Session re-initialized"));
            return Unit.INSTANCE;
        }
    }
}
