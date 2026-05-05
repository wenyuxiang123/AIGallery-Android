package com.google.ai.edge.gallery.ui.benchmark;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class BenchmarkViewModel_HiltModules {
    private BenchmarkViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(BenchmarkViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(BenchmarkViewModel benchmarkViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(BenchmarkViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
