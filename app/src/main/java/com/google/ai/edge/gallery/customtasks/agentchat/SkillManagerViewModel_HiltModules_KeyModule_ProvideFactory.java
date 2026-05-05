package com.google.ai.edge.gallery.customtasks.agentchat;

import com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel_HiltModules;
import dagger.internal.Factory;

/* JADX INFO: loaded from: classes14.dex */
public final class SkillManagerViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static SkillManagerViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return SkillManagerViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final SkillManagerViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new SkillManagerViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
