package com.google.ai.edge.gallery.ui.llmchat;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmAskAudioTask_Factory implements Factory<LlmAskAudioTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LlmAskAudioTask get() {
        return newInstance();
    }

    public static LlmAskAudioTask_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LlmAskAudioTask newInstance() {
        return new LlmAskAudioTask();
    }

    private static final class InstanceHolder {
        static final LlmAskAudioTask_Factory INSTANCE = new LlmAskAudioTask_Factory();

        private InstanceHolder() {
        }
    }
}
