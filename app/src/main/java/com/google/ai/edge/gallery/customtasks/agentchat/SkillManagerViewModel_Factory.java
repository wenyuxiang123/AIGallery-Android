package com.google.ai.edge.gallery.customtasks.agentchat;

import android.content.Context;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;


public final class SkillManagerViewModel_Factory implements Factory<SkillManagerViewModel> {
    private final Provider<Context> contextProvider;
    private final Provider<DataStoreRepository> dataStoreRepositoryProvider;

    private SkillManagerViewModel_Factory(Provider<DataStoreRepository> dataStoreRepositoryProvider, Provider<Context> contextProvider) {
        this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public SkillManagerViewModel get() {
        return newInstance(this.dataStoreRepositoryProvider.get(), this.contextProvider.get());
    }

    public static SkillManagerViewModel_Factory create(Provider<DataStoreRepository> dataStoreRepositoryProvider, Provider<Context> contextProvider) {
        return new SkillManagerViewModel_Factory(dataStoreRepositoryProvider, contextProvider);
    }

    public static SkillManagerViewModel newInstance(DataStoreRepository dataStoreRepository, Context context) {
        return new SkillManagerViewModel(dataStoreRepository, context);
    }
}
