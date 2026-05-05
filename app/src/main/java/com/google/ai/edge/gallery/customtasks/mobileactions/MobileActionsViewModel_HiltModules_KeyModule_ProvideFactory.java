package com.google.ai.edge.gallery.customtasks.mobileactions;

import com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel_HiltModules;
import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class MobileActionsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static MobileActionsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return MobileActionsViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final MobileActionsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new MobileActionsViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
