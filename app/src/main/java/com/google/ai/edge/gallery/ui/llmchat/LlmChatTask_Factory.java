package com.google.ai.edge.gallery.ui.llmchat;

import dagger.internal.Factory;


public final class LlmChatTask_Factory implements Factory<LlmChatTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LlmChatTask get() {
        return newInstance();
    }

    public static LlmChatTask_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LlmChatTask newInstance() {
        return new LlmChatTask();
    }

    private static final class InstanceHolder {
        static final LlmChatTask_Factory INSTANCE = new LlmChatTask_Factory();

        private InstanceHolder() {
        }
    }
}
