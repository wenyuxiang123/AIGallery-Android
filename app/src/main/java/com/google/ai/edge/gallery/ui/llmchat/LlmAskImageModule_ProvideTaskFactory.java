package com.google.ai.edge.gallery.ui.llmchat;

import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import dagger.internal.Factory;
import dagger.internal.Preconditions;


public final class LlmAskImageModule_ProvideTaskFactory implements Factory<CustomTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CustomTask get() {
        return provideTask();
    }

    public static LlmAskImageModule_ProvideTaskFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CustomTask provideTask() {
        return (CustomTask) Preconditions.checkNotNullFromProvides(LlmAskImageModule.INSTANCE.provideTask());
    }

    private static final class InstanceHolder {
        static final LlmAskImageModule_ProvideTaskFactory INSTANCE = new LlmAskImageModule_ProvideTaskFactory();

        private InstanceHolder() {
        }
    }
}
