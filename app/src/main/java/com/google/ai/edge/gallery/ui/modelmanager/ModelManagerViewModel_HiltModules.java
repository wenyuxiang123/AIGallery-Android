package com.google.ai.edge.gallery.ui.modelmanager;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;


public final class ModelManagerViewModel_HiltModules {
    private ModelManagerViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ModelManagerViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ModelManagerViewModel modelManagerViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ModelManagerViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
