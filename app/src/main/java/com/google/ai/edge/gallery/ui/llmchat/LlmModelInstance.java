package com.google.ai.edge.gallery.ui.llmchat;

import com.google.ai.edge.litertlm.Conversation;
import com.google.ai.edge.litertlm.Engine;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getEngine", "()Lcom/google/ai/edge/litertlm/Engine;", "getConversation", "()Lcom/google/ai/edge/litertlm/Conversation;", "setConversation", "(Lcom/google/ai/edge/litertlm/Conversation;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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

    
    public final Engine getEngine() {
        return this.engine;
    }

    
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
