package com.google.ai.edge.gallery.customtasks.tinygarden;

import android.content.Context;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes8.dex */
public final class TinyGardenViewModel_Factory implements Factory<TinyGardenViewModel> {
    private final Provider<Context> contextProvider;
    private final Provider<DataStoreRepository> dataStoreRepositoryProvider;

    private TinyGardenViewModel_Factory(Provider<Context> contextProvider, Provider<DataStoreRepository> dataStoreRepositoryProvider) {
        this.contextProvider = contextProvider;
        this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TinyGardenViewModel get() {
        return newInstance(this.contextProvider.get(), this.dataStoreRepositoryProvider.get());
    }

    public static TinyGardenViewModel_Factory create(Provider<Context> contextProvider, Provider<DataStoreRepository> dataStoreRepositoryProvider) {
        return new TinyGardenViewModel_Factory(contextProvider, dataStoreRepositoryProvider);
    }

    public static TinyGardenViewModel newInstance(Context context, DataStoreRepository dataStoreRepository) {
        return new TinyGardenViewModel(context, dataStoreRepository);
    }
}
