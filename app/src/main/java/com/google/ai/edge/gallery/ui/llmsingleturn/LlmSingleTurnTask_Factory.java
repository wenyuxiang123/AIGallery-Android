package com.google.ai.edge.gallery.ui.llmsingleturn;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes15.dex */
public final class LlmSingleTurnTask_Factory implements Factory<LlmSingleTurnTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LlmSingleTurnTask get() {
        return newInstance();
    }

    public static LlmSingleTurnTask_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LlmSingleTurnTask newInstance() {
        return new LlmSingleTurnTask();
    }

    private static final class InstanceHolder {
        static final LlmSingleTurnTask_Factory INSTANCE = new LlmSingleTurnTask_Factory();

        private InstanceHolder() {
        }
    }
}
