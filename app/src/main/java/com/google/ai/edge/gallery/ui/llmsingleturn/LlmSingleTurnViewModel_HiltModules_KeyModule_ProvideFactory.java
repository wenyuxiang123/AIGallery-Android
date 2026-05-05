package com.google.ai.edge.gallery.ui.llmsingleturn;

import com.google.ai.edge.gallery.ui.llmsingleturn.LlmSingleTurnViewModel_HiltModules;
import dagger.internal.Factory;

/* JADX INFO: loaded from: classes15.dex */
public final class LlmSingleTurnViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static LlmSingleTurnViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return LlmSingleTurnViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final LlmSingleTurnViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LlmSingleTurnViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
