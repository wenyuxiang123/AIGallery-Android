package com.google.ai.edge.gallery.ui.common.tos;

import com.google.ai.edge.gallery.ui.common.tos.TosViewModel_HiltModules;
import dagger.internal.Factory;


public final class TosViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static TosViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return TosViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final TosViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TosViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
