package com.google.ai.edge.gallery.ui.benchmark;

import com.google.ai.edge.gallery.ui.benchmark.BenchmarkViewModel_HiltModules;
import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class BenchmarkViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static BenchmarkViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return BenchmarkViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final BenchmarkViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new BenchmarkViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
