package com.google.ai.edge.gallery.p006ui.llmchat;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmAskImageTask_Factory implements Factory<LlmAskImageTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LlmAskImageTask get() {
        return newInstance();
    }

    public static LlmAskImageTask_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LlmAskImageTask newInstance() {
        return new LlmAskImageTask();
    }

    private static final class InstanceHolder {
        static final LlmAskImageTask_Factory INSTANCE = new LlmAskImageTask_Factory();

        private InstanceHolder() {
        }
    }
}
