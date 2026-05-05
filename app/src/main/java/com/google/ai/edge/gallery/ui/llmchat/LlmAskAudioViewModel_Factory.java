package com.google.ai.edge.gallery.ui.llmchat;

import dagger.internal.Factory;


public final class LlmAskAudioViewModel_Factory implements Factory<LlmAskAudioViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LlmAskAudioViewModel get() {
        return newInstance();
    }

    public static LlmAskAudioViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LlmAskAudioViewModel newInstance() {
        return new LlmAskAudioViewModel();
    }

    private static final class InstanceHolder {
        static final LlmAskAudioViewModel_Factory INSTANCE = new LlmAskAudioViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
