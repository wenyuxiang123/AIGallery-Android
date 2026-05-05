package com.google.ai.edge.gallery.customtasks.agentchat;

import dagger.internal.Factory;


public final class AgentChatTask_Factory implements Factory<AgentChatTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AgentChatTask get() {
        return newInstance();
    }

    public static AgentChatTask_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AgentChatTask newInstance() {
        return new AgentChatTask();
    }

    private static final class InstanceHolder {
        static final AgentChatTask_Factory INSTANCE = new AgentChatTask_Factory();

        private InstanceHolder() {
        }
    }
}
