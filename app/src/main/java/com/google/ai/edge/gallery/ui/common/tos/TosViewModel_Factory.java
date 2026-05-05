package com.google.ai.edge.gallery.ui.common.tos;

import com.google.ai.edge.gallery.data.DataStoreRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class TosViewModel_Factory implements Factory<TosViewModel> {
    private final Provider<DataStoreRepository> dataStoreRepositoryProvider;

    private TosViewModel_Factory(Provider<DataStoreRepository> dataStoreRepositoryProvider) {
        this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TosViewModel get() {
        return newInstance(this.dataStoreRepositoryProvider.get());
    }

    public static TosViewModel_Factory create(Provider<DataStoreRepository> dataStoreRepositoryProvider) {
        return new TosViewModel_Factory(dataStoreRepositoryProvider);
    }

    public static TosViewModel newInstance(DataStoreRepository dataStoreRepository) {
        return new TosViewModel(dataStoreRepository);
    }
}
