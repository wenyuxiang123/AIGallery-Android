package com.google.ai.edge.gallery.ui.llmchat;

import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import dagger.internal.Factory;
import dagger.internal.Preconditions;


public final class LlmChatTaskModule_ProvideTaskFactory implements Factory<CustomTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CustomTask get() {
        return provideTask();
    }

    public static LlmChatTaskModule_ProvideTaskFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CustomTask provideTask() {
        return (CustomTask) Preconditions.checkNotNullFromProvides(LlmChatTaskModule.INSTANCE.provideTask());
    }

    private static final class InstanceHolder {
        static final LlmChatTaskModule_ProvideTaskFactory INSTANCE = new LlmChatTaskModule_ProvideTaskFactory();

        private InstanceHolder() {
        }
    }
}
