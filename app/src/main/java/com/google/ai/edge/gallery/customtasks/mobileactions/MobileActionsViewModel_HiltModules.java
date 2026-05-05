package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;


public final class MobileActionsViewModel_HiltModules {
    private MobileActionsViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(MobileActionsViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(MobileActionsViewModel mobileActionsViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(MobileActionsViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
