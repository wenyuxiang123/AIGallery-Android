package com.google.ai.edge.gallery.ui.llmchat;

import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import dagger.internal.Factory;
import dagger.internal.Preconditions;


public final class LlmAskAudioModule_ProvideTaskFactory implements Factory<CustomTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CustomTask get() {
        return provideTask();
    }

    public static LlmAskAudioModule_ProvideTaskFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CustomTask provideTask() {
        return (CustomTask) Preconditions.checkNotNullFromProvides(LlmAskAudioModule.INSTANCE.provideTask());
    }

    private static final class InstanceHolder {
        static final LlmAskAudioModule_ProvideTaskFactory INSTANCE = new LlmAskAudioModule_ProvideTaskFactory();

        private InstanceHolder() {
        }
    }
}
