package com.google.ai.edge.gallery.customtasks.tinygarden;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;


public final class TinyGardenViewModel_HiltModules {
    private TinyGardenViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(TinyGardenViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(TinyGardenViewModel tinyGardenViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(TinyGardenViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
