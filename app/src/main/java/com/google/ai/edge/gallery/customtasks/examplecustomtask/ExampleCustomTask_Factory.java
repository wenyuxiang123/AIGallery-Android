package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import dagger.internal.Factory;


public final class ExampleCustomTask_Factory implements Factory<ExampleCustomTask> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ExampleCustomTask get() {
        return newInstance();
    }

    public static ExampleCustomTask_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ExampleCustomTask newInstance() {
        return new ExampleCustomTask();
    }

    private static final class InstanceHolder {
        static final ExampleCustomTask_Factory INSTANCE = new ExampleCustomTask_Factory();

        private InstanceHolder() {
        }
    }
}
