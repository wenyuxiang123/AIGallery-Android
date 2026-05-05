package com.google.ai.edge.gallery.ui.llmchat;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;


public final class LlmAskImageViewModel_HiltModules {
    private LlmAskImageViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(LlmAskImageViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(LlmAskImageViewModel llmAskImageViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(LlmAskImageViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
