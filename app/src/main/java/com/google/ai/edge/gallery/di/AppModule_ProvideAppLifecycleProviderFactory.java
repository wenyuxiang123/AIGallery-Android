package com.google.ai.edge.gallery.di;

import com.google.ai.edge.gallery.AppLifecycleProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;


public final class AppModule_ProvideAppLifecycleProviderFactory implements Factory<AppLifecycleProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AppLifecycleProvider get() {
        return provideAppLifecycleProvider();
    }

    public static AppModule_ProvideAppLifecycleProviderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppLifecycleProvider provideAppLifecycleProvider() {
        return (AppLifecycleProvider) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAppLifecycleProvider());
    }

    private static final class InstanceHolder {
        static final AppModule_ProvideAppLifecycleProviderFactory INSTANCE = new AppModule_ProvideAppLifecycleProviderFactory();

        private InstanceHolder() {
        }
    }
}
