package com.google.ai.edge.gallery.ui.llmchat;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmAskAudioViewModel_HiltModules {
    private LlmAskAudioViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(LlmAskAudioViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(LlmAskAudioViewModel llmAskAudioViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(LlmAskAudioViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
