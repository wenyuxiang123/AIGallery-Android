package com.google.ai.edge.gallery.customtasks.examplecustomtask;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes5.dex */
public final class ExampleCustomTaskViewModel_HiltModules {
    private ExampleCustomTaskViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ExampleCustomTaskViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ExampleCustomTaskViewModel exampleCustomTaskViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ExampleCustomTaskViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
