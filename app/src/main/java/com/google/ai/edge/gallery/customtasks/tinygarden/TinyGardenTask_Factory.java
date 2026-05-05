package com.google.ai.edge.gallery.customtasks.tinygarden;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes8.dex */
public final class TinyGardenTask_Factory implements Factory<TinyGardenTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TinyGardenTask get() {
        return newInstance();
    }

    public static TinyGardenTask_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TinyGardenTask newInstance() {
        return new TinyGardenTask();
    }

    private static final class InstanceHolder {
        static final TinyGardenTask_Factory INSTANCE = new TinyGardenTask_Factory();

        private InstanceHolder() {
        }
    }
}
