package com.google.ai.edge.gallery.p006ui.common.tos;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes3.dex */
public final class TosViewModel_HiltModules {
    private TosViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(TosViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(TosViewModel tosViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(TosViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
