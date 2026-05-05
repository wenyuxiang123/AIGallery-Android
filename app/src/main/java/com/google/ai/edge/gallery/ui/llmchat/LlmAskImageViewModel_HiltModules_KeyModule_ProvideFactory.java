package com.google.ai.edge.gallery.ui.llmchat;

import com.google.ai.edge.gallery.ui.llmchat.LlmAskImageViewModel_HiltModules;
import dagger.internal.Factory;


public final class LlmAskImageViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static LlmAskImageViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return LlmAskImageViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final LlmAskImageViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LlmAskImageViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
