package com.google.ai.edge.gallery.ui.llmchat;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmAskImageViewModel_Factory implements Factory<LlmAskImageViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LlmAskImageViewModel get() {
        return newInstance();
    }

    public static LlmAskImageViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LlmAskImageViewModel newInstance() {
        return new LlmAskImageViewModel();
    }

    private static final class InstanceHolder {
        static final LlmAskImageViewModel_Factory INSTANCE = new LlmAskImageViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
