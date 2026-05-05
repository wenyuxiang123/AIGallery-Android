package com.google.ai.edge.gallery.customtasks.tinygarden;

import com.google.ai.edge.gallery.ui.common.chat.ChatMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getProcessing", "()Z", "getResettingEngine", "getMessages", "()Ljava/util/List;", "getNumTurns", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class TinyGardenUiState {
    public static final int $stable = 8;
    private final List<ChatMessage> messages;
    private final int numTurns;
    private final boolean processing;
    private final boolean resettingEngine;

    public TinyGardenUiState() {
        this(false, false, null, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TinyGardenUiState copy$default(TinyGardenUiState tinyGardenUiState, boolean z, boolean z2, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = tinyGardenUiState.processing;
        }
        if ((i2 & 2) != 0) {
            z2 = tinyGardenUiState.resettingEngine;
        }
        if ((i2 & 4) != 0) {
            list = tinyGardenUiState.messages;
        }
        if ((i2 & 8) != 0) {
            i = tinyGardenUiState.numTurns;
        }
        return tinyGardenUiState.copy(z, z2, list, i);
    }

    
    public final boolean getProcessing() {
        return this.processing;
    }

    
    public final boolean getResettingEngine() {
        return this.resettingEngine;
    }

    public final List<ChatMessage> component3() {
        return this.messages;
    }

    
    public final int getNumTurns() {
        return this.numTurns;
    }

    public final TinyGardenUiState copy(boolean processing, boolean resettingEngine, List<? extends ChatMessage> messages, int numTurns) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new TinyGardenUiState(processing, resettingEngine, messages, numTurns);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TinyGardenUiState)) {
            return false;
        }
        TinyGardenUiState tinyGardenUiState = (TinyGardenUiState) other;
        return this.processing == tinyGardenUiState.processing && this.resettingEngine == tinyGardenUiState.resettingEngine && Intrinsics.areEqual(this.messages, tinyGardenUiState.messages) && this.numTurns == tinyGardenUiState.numTurns;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.processing) * 31) + Boolean.hashCode(this.resettingEngine)) * 31) + this.messages.hashCode()) * 31) + Integer.hashCode(this.numTurns);
    }

    public String toString() {
        return "TinyGardenUiState(processing=" + this.processing + ", resettingEngine=" + this.resettingEngine + ", messages=" + this.messages + ", numTurns=" + this.numTurns + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TinyGardenUiState(boolean processing, boolean resettingEngine, List<? extends ChatMessage> messages, int numTurns) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.processing = processing;
        this.resettingEngine = resettingEngine;
        this.messages = messages;
        this.numTurns = numTurns;
    }

    public /* synthetic */ TinyGardenUiState(boolean z, boolean z2, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? 0 : i);
    }

    public final boolean getProcessing() {
        return this.processing;
    }

    public final boolean getResettingEngine() {
        return this.resettingEngine;
    }

    public final List<ChatMessage> getMessages() {
        return this.messages;
    }

    public final int getNumTurns() {
        return this.numTurns;
    }
}
