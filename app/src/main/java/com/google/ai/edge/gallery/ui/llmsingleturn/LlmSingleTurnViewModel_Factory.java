package com.google.ai.edge.gallery.ui.llmsingleturn;

import dagger.internal.Factory;


public final class LlmSingleTurnViewModel_Factory implements Factory<LlmSingleTurnViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LlmSingleTurnViewModel get() {
        return newInstance();
    }

    public static LlmSingleTurnViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LlmSingleTurnViewModel newInstance() {
        return new LlmSingleTurnViewModel();
    }

    private static final class InstanceHolder {
        static final LlmSingleTurnViewModel_Factory INSTANCE = new LlmSingleTurnViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
