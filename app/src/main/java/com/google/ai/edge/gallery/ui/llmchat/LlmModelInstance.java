package com.google.ai.edge.gallery.ui.llmchat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.litertlm.Conversation;
import com.google.ai.edge.litertlm.Engine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LlmChatModelHelper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m921d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/llmchat/LlmModelInstance;", "", "engine", "Lcom/google/ai/edge/litertlm/Engine;", "conversation", "Lcom/google/ai/edge/litertlm/Conversation;", "<init>", "(Lcom/google/ai/edge/litertlm/Engine;Lcom/google/ai/edge/litertlm/Conversation;)V", "getEngine", "()Lcom/google/ai/edge/litertlm/Engine;", "getConversation", "()Lcom/google/ai/edge/litertlm/Conversation;", "setConversation", "(Lcom/google/ai/edge/litertlm/Conversation;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class LlmModelInstance {
    public static final int $stable = 8;
    private Conversation conversation;
    private final Engine engine;

    public static /* synthetic */ LlmModelInstance copy$default(LlmModelInstance llmModelInstance, Engine engine, Conversation conversation, int i, Object obj) {
        if ((i & 1) != 0) {
            engine = llmModelInstance.engine;
        }
        if ((i & 2) != 0) {
            conversation = llmModelInstance.conversation;
        }
        return llmModelInstance.copy(engine, conversation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Engine getEngine() {
        return this.engine;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Conversation getConversation() {
        return this.conversation;
    }

    public final LlmModelInstance copy(Engine engine, Conversation conversation) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        return new LlmModelInstance(engine, conversation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LlmModelInstance)) {
            return false;
        }
        LlmModelInstance llmModelInstance = (LlmModelInstance) other;
        return Intrinsics.areEqual(this.engine, llmModelInstance.engine) && Intrinsics.areEqual(this.conversation, llmModelInstance.conversation);
    }

    public int hashCode() {
        return (this.engine.hashCode() * 31) + this.conversation.hashCode();
    }

    public String toString() {
        return "LlmModelInstance(engine=" + this.engine + ", conversation=" + this.conversation + ")";
    }

    public LlmModelInstance(Engine engine, Conversation conversation) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        this.engine = engine;
        this.conversation = conversation;
    }

    public final Conversation getConversation() {
        return this.conversation;
    }

    public final Engine getEngine() {
        return this.engine;
    }

    public final void setConversation(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "<set-?>");
        this.conversation = conversation;
    }
}
