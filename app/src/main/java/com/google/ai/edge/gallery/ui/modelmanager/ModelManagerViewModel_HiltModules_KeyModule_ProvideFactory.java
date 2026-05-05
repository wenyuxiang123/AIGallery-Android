package com.google.ai.edge.gallery.ui.modelmanager;

import com.google.ai.edge.gallery.ui.modelmanager.ModelManagerViewModel_HiltModules;
import dagger.internal.Factory;


public final class ModelManagerViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ModelManagerViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ModelManagerViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ModelManagerViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ModelManagerViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
