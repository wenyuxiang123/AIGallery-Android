package com.google.ai.edge.gallery.di;

import android.content.Context;
import com.google.ai.edge.gallery.AppLifecycleProvider;
import com.google.ai.edge.gallery.data.DownloadRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;


public final class AppModule_ProvideDownloadRepositoryFactory implements Factory<DownloadRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<AppLifecycleProvider> lifecycleProvider;

    private AppModule_ProvideDownloadRepositoryFactory(Provider<Context> contextProvider, Provider<AppLifecycleProvider> lifecycleProvider) {
        this.contextProvider = contextProvider;
        this.lifecycleProvider = lifecycleProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DownloadRepository get() {
        return provideDownloadRepository(this.contextProvider.get(), this.lifecycleProvider.get());
    }

    public static AppModule_ProvideDownloadRepositoryFactory create(Provider<Context> contextProvider, Provider<AppLifecycleProvider> lifecycleProvider) {
        return new AppModule_ProvideDownloadRepositoryFactory(contextProvider, lifecycleProvider);
    }

    public static DownloadRepository provideDownloadRepository(Context context, AppLifecycleProvider lifecycleProvider) {
        return (DownloadRepository) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDownloadRepository(context, lifecycleProvider));
    }
}
