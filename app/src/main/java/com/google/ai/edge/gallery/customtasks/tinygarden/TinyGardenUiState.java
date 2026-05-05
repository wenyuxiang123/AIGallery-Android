package com.google.ai.edge.gallery.customtasks.tinygarden;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.ui.common.chat.ChatMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TinyGardenViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenUiState;", "", "processing", "", "resettingEngine", "messages", "", "Lcom/google/ai/edge/gallery/ui/common/chat/ChatMessage;", "numTurns", "", "<init>", "(ZZLjava/util/List;I)V", "getProcessing", "()Z", "getResettingEngine", "getMessages", "()Ljava/util/List;", "getNumTurns", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getProcessing() {
        return this.processing;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getResettingEngine() {
        return this.resettingEngine;
    }

    public final List<ChatMessage> component3() {
        return this.messages;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
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
