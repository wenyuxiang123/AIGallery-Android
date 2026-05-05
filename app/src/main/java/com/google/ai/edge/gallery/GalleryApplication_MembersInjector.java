package com.google.ai.edge.gallery;

import com.google.ai.edge.gallery.data.DataStoreRepository;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class GalleryApplication_MembersInjector implements MembersInjector<GalleryApplication> {
    private final Provider<DataStoreRepository> dataStoreRepositoryProvider;

    private GalleryApplication_MembersInjector(Provider<DataStoreRepository> dataStoreRepositoryProvider) {
        this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GalleryApplication instance) {
        injectDataStoreRepository(instance, this.dataStoreRepositoryProvider.get());
    }

    public static MembersInjector<GalleryApplication> create(Provider<DataStoreRepository> dataStoreRepositoryProvider) {
        return new GalleryApplication_MembersInjector(dataStoreRepositoryProvider);
    }

    public static void injectDataStoreRepository(GalleryApplication instance, DataStoreRepository dataStoreRepository) {
        instance.dataStoreRepository = dataStoreRepository;
    }
}
