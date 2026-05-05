package com.google.ai.edge.gallery.ui.llmchat;

import com.google.ai.edge.gallery.ui.llmchat.LlmAskAudioViewModel_HiltModules;
import dagger.internal.Factory;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmAskAudioViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static LlmAskAudioViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return LlmAskAudioViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final LlmAskAudioViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LlmAskAudioViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
