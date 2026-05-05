package com.google.ai.edge.gallery.ui.llmchat;

import com.google.ai.edge.gallery.ui.llmchat.LlmChatViewModel_HiltModules;
import dagger.internal.Factory;


public final class LlmChatViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static LlmChatViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return LlmChatViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final LlmChatViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LlmChatViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
