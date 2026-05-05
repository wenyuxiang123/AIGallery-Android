package com.google.ai.edge.gallery.ui.common.chat;

import android.util.Log;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.ai.edge.gallery.common.UtilsKt;
import com.google.ai.edge.gallery.data.ConfigKeys;
import com.google.ai.edge.gallery.data.Model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: ChatViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010J\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cJ \u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"J\u001e\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(J\u001e\u0010)\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010*\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010+\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010JB\u0010,\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"2\n\b\u0002\u00104\u001a\u0004\u0018\u000105J\u0016\u00106\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u00020\f2\u0006\u0010.\u001a\u00020/J\u000e\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020/J\u000e\u0010<\u001a\u00020\f2\u0006\u0010=\u001a\u00020/J6\u0010>\u001a\u00020\f2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u0002050@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u0002050@2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010B\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010C\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006D"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addMessage", "", "model", "Lcom/google/ai/edge/gallery/data/Model;", "message", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "insertMessageAfter", "anchorMessage", "messageToAdd", "removeMessageAt", FirebaseAnalytics.Param.INDEX, "", "removeLastMessage", "clearAllMessages", "getLastMessage", "getLastMessageWithType", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageType;", "getLastMessageWithTypeAndSide", "side", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatSide;", "updateLastThinkingMessageContentIncrementally", "partialContent", "", "updateLastTextMessageContentIncrementally", "latencyMs", "", "updateLastTextMessageLlmBenchmarkResult", "llmBenchmarkResult", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessageBenchmarkLlmResult;", "replaceLastMessage", "replaceMessage", "updateStreamingMessage", "updateCollapsableProgressPanelMessage", "title", "inProgress", "", "doneIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "addItemTitle", "addItemDescription", "customData", "", "addLogMessageToLastCollapsableProgressPanel", "logMessage", "Lcom/google/ai/edge/gallery/ui/common/chat/LogMessage;", "setInProgress", "setIsResettingSession", "isResettingSession", "setPreparing", "preparing", "addConfigChangedMessage", "oldConfigValues", "", "newConfigValues", "getMessageIndex", "createUiState", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public abstract class ChatViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<ChatUiState> _uiState = StateFlowKt.MutableStateFlow(createUiState());
    private final StateFlow<ChatUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<ChatUiState> getUiState() {
        return this.uiState;
    }

    public final void addMessage(Model model, ChatMessage message) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        Map newMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel.get(model.getName());
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List newMessages = arrayList;
        newMessagesByModel.put(model.getName(), newMessages);
        if (newMessages.size() > 0 && ((ChatMessage) CollectionsKt.last(newMessages)).getType() == ChatMessageType.PROMPT_TEMPLATES) {
            newMessages.remove(newMessages.size() - 1);
        }
        newMessages.add(message);
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null))) {
        }
    }

    public final void insertMessageAfter(Model model, ChatMessage anchorMessage, ChatMessage messageToAdd) {
        ArrayList arrayList;
        ChatViewModel chatViewModel = this;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(anchorMessage, "anchorMessage");
        Intrinsics.checkNotNullParameter(messageToAdd, "messageToAdd");
        Map newMessagesByModel = MapsKt.toMutableMap(chatViewModel._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel.get(model.getName());
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List newMessages = arrayList;
        newMessagesByModel.put(model.getName(), newMessages);
        int anchorIndex = newMessages.indexOf(anchorMessage);
        if (anchorIndex != -1) {
            newMessages.add(anchorIndex + 1, messageToAdd);
        }
        MutableStateFlow<ChatUiState> mutableStateFlow = chatViewModel._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), ChatUiState.copy$default(chatViewModel._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null))) {
            chatViewModel = this;
        }
    }

    public final void removeMessageAt(Model model, int index) {
        Intrinsics.checkNotNullParameter(model, "model");
        Map newMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel.get(model.getName());
        List newMessages = list != null ? CollectionsKt.toMutableList((Collection) list) : null;
        if (newMessages != null) {
            newMessagesByModel.put(model.getName(), newMessages);
            if (index >= 0 && index < newMessages.size()) {
                newMessages.remove(index);
            }
        }
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null))) {
        }
    }

    public final void removeLastMessage(Model model) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(model, "model");
        Map newMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel.get(model.getName());
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List newMessages = arrayList;
        if (newMessages.size() > 0) {
            newMessages.remove(newMessages.size() - 1);
        }
        newMessagesByModel.put(model.getName(), newMessages);
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null))) {
        }
    }

    public final void clearAllMessages(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Map newMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        newMessagesByModel.put(model.getName(), new ArrayList());
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null))) {
        }
    }

    public final ChatMessage getLastMessage(Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        List<ChatMessage> listEmptyList = this._uiState.getValue().getMessagesByModel().get(model.getName());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return (ChatMessage) CollectionsKt.lastOrNull((List) listEmptyList);
    }

    public final ChatMessage getLastMessageWithType(Model model, ChatMessageType type) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(type, "type");
        List<ChatMessage> listEmptyList = this._uiState.getValue().getMessagesByModel().get(model.getName());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ListIterator<ChatMessage> listIterator = listEmptyList.listIterator(listEmptyList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                element$iv = listIterator.previous();
                ChatMessage it = (ChatMessage) element$iv;
                if (it.getType() == type) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        return (ChatMessage) element$iv;
    }

    public final ChatMessage getLastMessageWithTypeAndSide(Model model, ChatMessageType type, ChatSide side) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(side, "side");
        List<ChatMessage> listEmptyList = this._uiState.getValue().getMessagesByModel().get(model.getName());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ListIterator<ChatMessage> listIterator = listEmptyList.listIterator(listEmptyList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                element$iv = listIterator.previous();
                ChatMessage it = (ChatMessage) element$iv;
                if (it.getType() == type && it.getSide() == side) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        return (ChatMessage) element$iv;
    }

    public final void updateLastThinkingMessageContentIncrementally(Model model, String partialContent) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(partialContent, "partialContent");
        Map newMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel.get(model.getName());
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List newMessages = arrayList;
        if (!newMessages.isEmpty()) {
            ChatMessage lastMessage = (ChatMessage) CollectionsKt.last(newMessages);
            if (lastMessage instanceof ChatMessageThinking) {
                String newContent = UtilsKt.processLlmResponse(((ChatMessageThinking) lastMessage).getContent() + partialContent);
                ChatMessageThinking newLastMessage = new ChatMessageThinking(newContent, ((ChatMessageThinking) lastMessage).getInProgress(), ((ChatMessageThinking) lastMessage).getSide(), ((ChatMessageThinking) lastMessage).getHideSenderLabel(), ((ChatMessageThinking) lastMessage).getAccelerator());
                newMessages.remove(newMessages.size() - 1);
                newMessages.add(newLastMessage);
            }
        }
        newMessagesByModel.put(model.getName(), newMessages);
        ChatUiState newUiState = ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null);
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), newUiState)) {
        }
    }

    public final void updateLastTextMessageContentIncrementally(Model model, String partialContent, float latencyMs) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(partialContent, "partialContent");
        Map newMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel.get(model.getName());
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List newMessages = arrayList;
        if (!newMessages.isEmpty()) {
            ChatMessage lastMessage = (ChatMessage) CollectionsKt.last(newMessages);
            if (lastMessage instanceof ChatMessageText) {
                String newContent = UtilsKt.processLlmResponse(((ChatMessageText) lastMessage).getContent() + partialContent);
                ChatMessageText newLastMessage = new ChatMessageText(newContent, ((ChatMessageText) lastMessage).getSide(), latencyMs, false, null, ((ChatMessageText) lastMessage).getAccelerator(), ((ChatMessageText) lastMessage).getHideSenderLabel(), null, ModuleDescriptor.MODULE_VERSION, null);
                newMessages.remove(newMessages.size() - 1);
                newMessages.add(newLastMessage);
            }
        }
        newMessagesByModel.put(model.getName(), newMessages);
        ChatUiState newUiState = ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null);
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), newUiState)) {
        }
    }

    public final void updateLastTextMessageLlmBenchmarkResult(Model model, ChatMessageBenchmarkLlmResult llmBenchmarkResult) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(llmBenchmarkResult, "llmBenchmarkResult");
        Map newMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel.get(model.getName());
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List newMessages = arrayList;
        if (newMessages.size() > 0) {
            ChatMessage lastMessage = (ChatMessage) CollectionsKt.last(newMessages);
            if (lastMessage instanceof ChatMessageText) {
                ((ChatMessageText) lastMessage).setLlmBenchmarkResult(llmBenchmarkResult);
                newMessages.remove(newMessages.size() - 1);
                newMessages.add(lastMessage);
            }
        }
        newMessagesByModel.put(model.getName(), newMessages);
        ChatUiState newUiState = ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null);
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), newUiState)) {
        }
    }

    public final void replaceLastMessage(Model model, ChatMessage message, ChatMessageType type) {
        ArrayList arrayList;
        int iNextIndex;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        Map newMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel.get(model.getName());
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List newMessages = arrayList;
        if (newMessages.size() > 0) {
            ListIterator iterator$iv = newMessages.listIterator(newMessages.size());
            while (true) {
                if (iterator$iv.hasPrevious()) {
                    ChatMessage it = (ChatMessage) iterator$iv.previous();
                    if (it.getType() == type) {
                        iNextIndex = iterator$iv.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            int index = iNextIndex;
            if (index >= 0) {
                newMessages.set(index, message);
            }
        }
        newMessagesByModel.put(model.getName(), newMessages);
        ChatUiState newUiState = ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null);
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), newUiState)) {
        }
    }

    public final void replaceMessage(Model model, int index, ChatMessage message) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        Map newMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel.get(model.getName());
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List newMessages = arrayList;
        if (index >= 0 && index < newMessages.size()) {
            newMessages.set(index, message);
        }
        newMessagesByModel.put(model.getName(), newMessages);
        ChatUiState newUiState = ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null);
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), newUiState)) {
        }
    }

    public final void updateStreamingMessage(Model model, ChatMessage message) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        Map newStreamingMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getStreamingMessagesByModel());
        newStreamingMessagesByModel.put(model.getName(), message);
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), ChatUiState.copy$default(this._uiState.getValue(), false, false, false, null, newStreamingMessagesByModel, 15, null))) {
        }
    }

    public static /* synthetic */ void updateCollapsableProgressPanelMessage$default(ChatViewModel chatViewModel, Model model, String str, boolean z, ImageVector imageVector, String str2, String str3, Object obj, int i, Object obj2) {
        Object obj3;
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCollapsableProgressPanelMessage");
        }
        if ((i & 64) == 0) {
            obj3 = obj;
        } else {
            obj3 = null;
        }
        chatViewModel.updateCollapsableProgressPanelMessage(model, str, z, imageVector, str2, str3, obj3);
    }

    public final void updateCollapsableProgressPanelMessage(Model model, final String title, final boolean inProgress, final ImageVector doneIcon, final String addItemTitle, final String addItemDescription, final Object customData) {
        ArrayList arrayList;
        List newMessages;
        Map newMessagesByModel;
        List listEmptyList;
        ChatUiState value;
        ChatUiState it;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(doneIcon, "doneIcon");
        Intrinsics.checkNotNullParameter(addItemTitle, "addItemTitle");
        Intrinsics.checkNotNullParameter(addItemDescription, "addItemDescription");
        final String accelerator = model.getStringConfigValue(ConfigKeys.INSTANCE.getACCELERATOR(), "");
        Map newMessagesByModel2 = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel2.get(model.getName());
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List newMessages2 = arrayList;
        Function0 createNewCollapsableMessage = new Function0() { // from class: com.google.ai.edge.gallery.ui.common.chat.ChatViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatViewModel.updateCollapsableProgressPanelMessage$lambda$14(addItemTitle, addItemDescription, title, inProgress, accelerator, doneIcon, customData);
            }
        };
        if (!newMessages2.isEmpty() && (CollectionsKt.last(newMessages2) instanceof ChatMessageLoading)) {
            newMessages2.remove(newMessages2.size() - 1);
            newMessages2.add(createNewCollapsableMessage.invoke());
            newMessages = newMessages2;
            newMessagesByModel = newMessagesByModel2;
        } else {
            ChatMessage lastProgressPanelMessage = getLastMessageWithType(model, ChatMessageType.COLLAPSABLE_PROGRESS_PANEL);
            int lastProgressPanelMessageIndex = CollectionsKt.indexOf((List<? extends ChatMessage>) newMessages2, lastProgressPanelMessage);
            ChatMessage lastUserTextMessage = getLastMessageWithTypeAndSide(model, ChatMessageType.TEXT, ChatSide.USER);
            int lastUserTextMessageIndex = CollectionsKt.indexOf((List<? extends ChatMessage>) newMessages2, lastUserTextMessage);
            if (lastProgressPanelMessage != null && lastUserTextMessage != null && lastUserTextMessageIndex > lastProgressPanelMessageIndex) {
                newMessages2.add(lastUserTextMessageIndex + 1, createNewCollapsableMessage.invoke());
                newMessages = newMessages2;
                newMessagesByModel = newMessagesByModel2;
            } else if (lastProgressPanelMessage == null || !(lastProgressPanelMessage instanceof ChatMessageCollapsableProgressPanel)) {
                newMessages = newMessages2;
                newMessagesByModel = newMessagesByModel2;
                newMessages.add(createNewCollapsableMessage.invoke());
            } else {
                List<ProgressPanelItem> items = ((ChatMessageCollapsableProgressPanel) lastProgressPanelMessage).getItems();
                if (addItemTitle.length() > 0) {
                    listEmptyList = CollectionsKt.listOf(new ProgressPanelItem(addItemTitle, addItemDescription));
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                newMessages = newMessages2;
                newMessagesByModel = newMessagesByModel2;
                ChatMessageCollapsableProgressPanel updatedMessage = new ChatMessageCollapsableProgressPanel(title, inProgress, accelerator, doneIcon, CollectionsKt.plus((Collection) items, (Iterable) listEmptyList), ((ChatMessageCollapsableProgressPanel) lastProgressPanelMessage).getLogMessages(), ((ChatMessageCollapsableProgressPanel) lastProgressPanelMessage).getCustomData());
                newMessages.set(lastProgressPanelMessageIndex, updatedMessage);
            }
        }
        newMessagesByModel.put(model.getName(), newMessages);
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatMessageCollapsableProgressPanel updateCollapsableProgressPanelMessage$lambda$14(String $addItemTitle, String $addItemDescription, String $title, boolean $inProgress, String $accelerator, ImageVector $doneIcon, Object $customData) {
        return new ChatMessageCollapsableProgressPanel($title, $inProgress, $accelerator, $doneIcon, $addItemTitle.length() > 0 ? CollectionsKt.listOf(new ProgressPanelItem($addItemTitle, $addItemDescription)) : CollectionsKt.emptyList(), null, $customData, 32, null);
    }

    public final void addLogMessageToLastCollapsableProgressPanel(Model model, LogMessage logMessage) {
        ArrayList arrayList;
        int iNextIndex;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(logMessage, "logMessage");
        Map newMessagesByModel = MapsKt.toMutableMap(this._uiState.getValue().getMessagesByModel());
        List list = (List) newMessagesByModel.get(model.getName());
        if (list == null || (arrayList = CollectionsKt.toMutableList((Collection) list)) == null) {
            arrayList = new ArrayList();
        }
        List newMessages = arrayList;
        if (!newMessages.isEmpty()) {
            ListIterator iterator$iv = newMessages.listIterator(newMessages.size());
            while (true) {
                if (iterator$iv.hasPrevious()) {
                    ChatMessage it = (ChatMessage) iterator$iv.previous();
                    if (it instanceof ChatMessageCollapsableProgressPanel) {
                        iNextIndex = iterator$iv.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            int lastCollapsableIndex = iNextIndex;
            if (lastCollapsableIndex != -1) {
                Object obj = newMessages.get(lastCollapsableIndex);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.google.ai.edge.gallery.ui.common.chat.ChatMessageCollapsableProgressPanel");
                ChatMessageCollapsableProgressPanel lastMessage = (ChatMessageCollapsableProgressPanel) obj;
                List newLogMessages = CollectionsKt.plus((Collection<? extends LogMessage>) lastMessage.getLogMessages(), logMessage);
                ChatMessageCollapsableProgressPanel updatedMessage = new ChatMessageCollapsableProgressPanel(lastMessage.getTitle(), lastMessage.getInProgress(), lastMessage.getAccelerator(), lastMessage.getDoneIcon(), lastMessage.getItems(), newLogMessages, lastMessage.getCustomData());
                newMessages.set(lastCollapsableIndex, updatedMessage);
            }
        }
        newMessagesByModel.put(model.getName(), newMessages);
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), ChatUiState.copy$default(this._uiState.getValue(), false, false, false, newMessagesByModel, null, 23, null))) {
        }
    }

    public final void setInProgress(boolean inProgress) {
        ChatUiState value;
        ChatUiState it;
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = ChatUiState.copy$default(this._uiState.getValue(), inProgress, false, false, null, null, 30, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setIsResettingSession(boolean isResettingSession) {
        ChatUiState value;
        ChatUiState it;
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = ChatUiState.copy$default(this._uiState.getValue(), false, isResettingSession, false, null, null, 29, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void setPreparing(boolean preparing) {
        ChatUiState value;
        ChatUiState it;
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            it = ChatUiState.copy$default(this._uiState.getValue(), false, false, preparing, null, null, 27, null);
        } while (!mutableStateFlow.compareAndSet(value, it));
    }

    public final void addConfigChangedMessage(Map<String, ? extends Object> oldConfigValues, Map<String, ? extends Object> newConfigValues, Model model) {
        Intrinsics.checkNotNullParameter(oldConfigValues, "oldConfigValues");
        Intrinsics.checkNotNullParameter(newConfigValues, "newConfigValues");
        Intrinsics.checkNotNullParameter(model, "model");
        Log.d("AGChatViewModel", "Adding config changed message. Old: " + oldConfigValues + ", new: " + newConfigValues);
        ChatMessageConfigValuesChange message = new ChatMessageConfigValuesChange(model, oldConfigValues, newConfigValues);
        addMessage(model, message);
    }

    public final int getMessageIndex(Model model, ChatMessage message) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(message, "message");
        List<ChatMessage> listEmptyList = this._uiState.getValue().getMessagesByModel().get(model.getName());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList.indexOf(message);
    }

    private final ChatUiState createUiState() {
        return new ChatUiState(false, false, false, null, null, 31, null);
    }
}
