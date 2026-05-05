package com.google.ai.edge.gallery.customtasks.tinygarden;

import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class TinyGardenTaskModule_ProvideTaskFactory implements Factory<CustomTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CustomTask get() {
        return provideTask();
    }

    public static TinyGardenTaskModule_ProvideTaskFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CustomTask provideTask() {
        return (CustomTask) Preconditions.checkNotNullFromProvides(TinyGardenTaskModule.INSTANCE.provideTask());
    }

    private static final class InstanceHolder {
        static final TinyGardenTaskModule_ProvideTaskFactory INSTANCE = new TinyGardenTaskModule_ProvideTaskFactory();

        private InstanceHolder() {
        }
    }
}
