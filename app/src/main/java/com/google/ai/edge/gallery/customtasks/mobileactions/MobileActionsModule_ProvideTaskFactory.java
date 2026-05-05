package com.google.ai.edge.gallery.customtasks.mobileactions;

import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes5.dex */
public final class MobileActionsModule_ProvideTaskFactory implements Factory<CustomTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CustomTask get() {
        return provideTask();
    }

    public static MobileActionsModule_ProvideTaskFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CustomTask provideTask() {
        return (CustomTask) Preconditions.checkNotNullFromProvides(MobileActionsModule.INSTANCE.provideTask());
    }

    private static final class InstanceHolder {
        static final MobileActionsModule_ProvideTaskFactory INSTANCE = new MobileActionsModule_ProvideTaskFactory();

        private InstanceHolder() {
        }
    }
}
