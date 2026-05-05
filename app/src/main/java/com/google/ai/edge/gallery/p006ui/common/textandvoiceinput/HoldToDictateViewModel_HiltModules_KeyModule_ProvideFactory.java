package com.google.ai.edge.gallery.p006ui.common.textandvoiceinput;

import com.google.ai.edge.gallery.p006ui.common.textandvoiceinput.HoldToDictateViewModel_HiltModules;
import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class HoldToDictateViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static HoldToDictateViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return HoldToDictateViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final HoldToDictateViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new HoldToDictateViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
