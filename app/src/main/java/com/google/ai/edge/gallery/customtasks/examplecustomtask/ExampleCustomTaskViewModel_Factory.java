package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import dagger.internal.Factory;


public final class ExampleCustomTaskViewModel_Factory implements Factory<ExampleCustomTaskViewModel> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ExampleCustomTaskViewModel get() {
        return newInstance();
    }

    public static ExampleCustomTaskViewModel_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ExampleCustomTaskViewModel newInstance() {
        return new ExampleCustomTaskViewModel();
    }

    private static final class InstanceHolder {
        static final ExampleCustomTaskViewModel_Factory INSTANCE = new ExampleCustomTaskViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
