package com.google.ai.edge.gallery.p006ui.llmchat;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmChatViewModel_Factory implements Factory<LlmChatViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LlmChatViewModel get() {
        return newInstance();
    }

    public static LlmChatViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LlmChatViewModel newInstance() {
        return new LlmChatViewModel();
    }

    private static final class InstanceHolder {
        static final LlmChatViewModel_Factory INSTANCE = new LlmChatViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
