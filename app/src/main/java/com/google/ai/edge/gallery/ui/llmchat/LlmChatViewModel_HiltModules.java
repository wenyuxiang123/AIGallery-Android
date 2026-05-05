package com.google.ai.edge.gallery.ui.llmchat;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmChatViewModel_HiltModules {
    private LlmChatViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(LlmChatViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(LlmChatViewModel llmChatViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(LlmChatViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
