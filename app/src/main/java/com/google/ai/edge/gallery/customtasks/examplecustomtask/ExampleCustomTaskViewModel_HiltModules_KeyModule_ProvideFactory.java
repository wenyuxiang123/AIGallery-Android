package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTaskViewModel_HiltModules;
import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class ExampleCustomTaskViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ExampleCustomTaskViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ExampleCustomTaskViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ExampleCustomTaskViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ExampleCustomTaskViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
