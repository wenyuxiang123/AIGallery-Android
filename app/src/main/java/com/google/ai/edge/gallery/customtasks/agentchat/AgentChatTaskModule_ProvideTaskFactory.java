package com.google.ai.edge.gallery.customtasks.agentchat;

import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import dagger.internal.Factory;
import dagger.internal.Preconditions;


public final class AgentChatTaskModule_ProvideTaskFactory implements Factory<CustomTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CustomTask get() {
        return provideTask();
    }

    public static AgentChatTaskModule_ProvideTaskFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CustomTask provideTask() {
        return (CustomTask) Preconditions.checkNotNullFromProvides(AgentChatTaskModule.INSTANCE.provideTask());
    }

    private static final class InstanceHolder {
        static final AgentChatTaskModule_ProvideTaskFactory INSTANCE = new AgentChatTaskModule_ProvideTaskFactory();

        private InstanceHolder() {
        }
    }
}
