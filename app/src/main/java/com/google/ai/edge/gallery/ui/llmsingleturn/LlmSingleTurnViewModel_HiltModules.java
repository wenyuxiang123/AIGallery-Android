package com.google.ai.edge.gallery.ui.llmsingleturn;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes15.dex */
public final class LlmSingleTurnViewModel_HiltModules {
    private LlmSingleTurnViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(LlmSingleTurnViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(LlmSingleTurnViewModel llmSingleTurnViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(LlmSingleTurnViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
