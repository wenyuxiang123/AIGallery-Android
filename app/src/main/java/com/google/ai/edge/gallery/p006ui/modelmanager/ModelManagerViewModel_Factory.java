package com.google.ai.edge.gallery.p006ui.modelmanager;

import android.content.Context;
import com.google.ai.edge.gallery.AppLifecycleProvider;
import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.data.DownloadRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ModelManagerViewModel_Factory implements Factory<ModelManagerViewModel> {
    private final Provider<Context> contextProvider;
    private final Provider<Set<CustomTask>> customTasksProvider;
    private final Provider<DataStoreRepository> dataStoreRepositoryProvider;
    private final Provider<DownloadRepository> downloadRepositoryProvider;
    private final Provider<AppLifecycleProvider> lifecycleProvider;

    private ModelManagerViewModel_Factory(Provider<DownloadRepository> downloadRepositoryProvider, Provider<DataStoreRepository> dataStoreRepositoryProvider, Provider<AppLifecycleProvider> lifecycleProvider, Provider<Set<CustomTask>> customTasksProvider, Provider<Context> contextProvider) {
        this.downloadRepositoryProvider = downloadRepositoryProvider;
        this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
        this.lifecycleProvider = lifecycleProvider;
        this.customTasksProvider = customTasksProvider;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ModelManagerViewModel get() {
        return newInstance(this.downloadRepositoryProvider.get(), this.dataStoreRepositoryProvider.get(), this.lifecycleProvider.get(), this.customTasksProvider.get(), this.contextProvider.get());
    }

    public static ModelManagerViewModel_Factory create(Provider<DownloadRepository> downloadRepositoryProvider, Provider<DataStoreRepository> dataStoreRepositoryProvider, Provider<AppLifecycleProvider> lifecycleProvider, Provider<Set<CustomTask>> customTasksProvider, Provider<Context> contextProvider) {
        return new ModelManagerViewModel_Factory(downloadRepositoryProvider, dataStoreRepositoryProvider, lifecycleProvider, customTasksProvider, contextProvider);
    }

    public static ModelManagerViewModel newInstance(DownloadRepository downloadRepository, DataStoreRepository dataStoreRepository, AppLifecycleProvider lifecycleProvider, Set<CustomTask> customTasks, Context context) {
        return new ModelManagerViewModel(downloadRepository, dataStoreRepository, lifecycleProvider, customTasks, context);
    }
}
