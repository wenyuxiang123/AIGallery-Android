package com.google.ai.edge.gallery.ui.common.textandvoiceinput;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;


public final class HoldToDictateViewModel_HiltModules {
    private HoldToDictateViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(HoldToDictateViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(HoldToDictateViewModel holdToDictateViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(HoldToDictateViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
