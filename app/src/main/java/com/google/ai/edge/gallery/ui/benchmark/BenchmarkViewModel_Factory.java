package com.google.ai.edge.gallery.ui.benchmark;

import android.content.Context;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;


public final class BenchmarkViewModel_Factory implements Factory<BenchmarkViewModel> {
    private final Provider<Context> appContextProvider;
    private final Provider<DataStoreRepository> dataStoreRepositoryProvider;

    private BenchmarkViewModel_Factory(Provider<Context> appContextProvider, Provider<DataStoreRepository> dataStoreRepositoryProvider) {
        this.appContextProvider = appContextProvider;
        this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public BenchmarkViewModel get() {
        return newInstance(this.appContextProvider.get(), this.dataStoreRepositoryProvider.get());
    }

    public static BenchmarkViewModel_Factory create(Provider<Context> appContextProvider, Provider<DataStoreRepository> dataStoreRepositoryProvider) {
        return new BenchmarkViewModel_Factory(appContextProvider, dataStoreRepositoryProvider);
    }

    public static BenchmarkViewModel newInstance(Context appContext, DataStoreRepository dataStoreRepository) {
        return new BenchmarkViewModel(appContext, dataStoreRepository);
    }
}
