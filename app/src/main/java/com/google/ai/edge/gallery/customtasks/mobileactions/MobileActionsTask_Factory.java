package com.google.ai.edge.gallery.customtasks.mobileactions;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes5.dex */
public final class MobileActionsTask_Factory implements Factory<MobileActionsTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public MobileActionsTask get() {
        return newInstance();
    }

    public static MobileActionsTask_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MobileActionsTask newInstance() {
        return new MobileActionsTask();
    }

    private static final class InstanceHolder {
        static final MobileActionsTask_Factory INSTANCE = new MobileActionsTask_Factory();

        private InstanceHolder() {
        }
    }
}
