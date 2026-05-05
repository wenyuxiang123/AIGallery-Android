package com.google.ai.edge.gallery.ui.common.chat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChatViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m921d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003JY\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/common/chat/ChatUiState;", "", "inProgress", "", "isResettingSession", "preparing", "messagesByModel", "", "", "", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "streamingMessagesByModel", "<init>", "(ZZZLjava/util/Map;Ljava/util/Map;)V", "getInProgress", "()Z", "getPreparing", "getMessagesByModel", "()Ljava/util/Map;", "getStreamingMessagesByModel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class ChatUiState {
    public static final int $stable = 8;
    private final boolean inProgress;
    private final boolean isResettingSession;
    private final Map<String, List<ChatMessage>> messagesByModel;
    private final boolean preparing;
    private final Map<String, ChatMessage> streamingMessagesByModel;

    public ChatUiState() {
        this(false, false, false, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatUiState copy$default(ChatUiState chatUiState, boolean z, boolean z2, boolean z3, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatUiState.inProgress;
        }
        if ((i & 2) != 0) {
            z2 = chatUiState.isResettingSession;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            z3 = chatUiState.preparing;
        }
        boolean z5 = z3;
        if ((i & 8) != 0) {
            map = chatUiState.messagesByModel;
        }
        Map map3 = map;
        if ((i & 16) != 0) {
            map2 = chatUiState.streamingMessagesByModel;
        }
        return chatUiState.copy(z, z4, z5, map3, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getInProgress() {
        return this.inProgress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsResettingSession() {
        return this.isResettingSession;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getPreparing() {
        return this.preparing;
    }

    public final Map<String, List<ChatMessage>> component4() {
        return this.messagesByModel;
    }

    public final Map<String, ChatMessage> component5() {
        return this.streamingMessagesByModel;
    }

    public final ChatUiState copy(boolean inProgress, boolean isResettingSession, boolean preparing, Map<String, ? extends List<ChatMessage>> messagesByModel, Map<String, ? extends ChatMessage> streamingMessagesByModel) {
        Intrinsics.checkNotNullParameter(messagesByModel, "messagesByModel");
        Intrinsics.checkNotNullParameter(streamingMessagesByModel, "streamingMessagesByModel");
        return new ChatUiState(inProgress, isResettingSession, preparing, messagesByModel, streamingMessagesByModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatUiState)) {
            return false;
        }
        ChatUiState chatUiState = (ChatUiState) other;
        return this.inProgress == chatUiState.inProgress && this.isResettingSession == chatUiState.isResettingSession && this.preparing == chatUiState.preparing && Intrinsics.areEqual(this.messagesByModel, chatUiState.messagesByModel) && Intrinsics.areEqual(this.streamingMessagesByModel, chatUiState.streamingMessagesByModel);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.inProgress) * 31) + Boolean.hashCode(this.isResettingSession)) * 31) + Boolean.hashCode(this.preparing)) * 31) + this.messagesByModel.hashCode()) * 31) + this.streamingMessagesByModel.hashCode();
    }

    public String toString() {
        return "ChatUiState(inProgress=" + this.inProgress + ", isResettingSession=" + this.isResettingSession + ", preparing=" + this.preparing + ", messagesByModel=" + this.messagesByModel + ", streamingMessagesByModel=" + this.streamingMessagesByModel + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatUiState(boolean inProgress, boolean isResettingSession, boolean preparing, Map<String, ? extends List<ChatMessage>> messagesByModel, Map<String, ? extends ChatMessage> streamingMessagesByModel) {
        Intrinsics.checkNotNullParameter(messagesByModel, "messagesByModel");
        Intrinsics.checkNotNullParameter(streamingMessagesByModel, "streamingMessagesByModel");
        this.inProgress = inProgress;
        this.isResettingSession = isResettingSession;
        this.preparing = preparing;
        this.messagesByModel = messagesByModel;
        this.streamingMessagesByModel = streamingMessagesByModel;
    }

    public /* synthetic */ ChatUiState(boolean z, boolean z2, boolean z3, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? MapsKt.emptyMap() : map2);
    }

    public final boolean getInProgress() {
        return this.inProgress;
    }

    public final boolean isResettingSession() {
        return this.isResettingSession;
    }

    public final boolean getPreparing() {
        return this.preparing;
    }

    public final Map<String, List<ChatMessage>> getMessagesByModel() {
        return this.messagesByModel;
    }

    public final Map<String, ChatMessage> getStreamingMessagesByModel() {
        return this.streamingMessagesByModel;
    }
}
