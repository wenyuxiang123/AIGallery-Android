package com.google.ai.edge.gallery.ui.llmsingleturn;

import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
public final class LlmSingleTurnTaskModule_ProvideTaskFactory implements Factory<CustomTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CustomTask get() {
        return provideTask();
    }

    public static LlmSingleTurnTaskModule_ProvideTaskFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CustomTask provideTask() {
        return (CustomTask) Preconditions.checkNotNullFromProvides(LlmSingleTurnTaskModule.INSTANCE.provideTask());
    }

    private static final class InstanceHolder {
        static final LlmSingleTurnTaskModule_ProvideTaskFactory INSTANCE = new LlmSingleTurnTaskModule_ProvideTaskFactory();

        private InstanceHolder() {
        }
    }
}
