package com.google.ai.edge.gallery.p005di;

import androidx.datastore.core.DataStore;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.proto.BenchmarkResults;
import com.google.ai.edge.gallery.proto.CutoutCollection;
import com.google.ai.edge.gallery.proto.Settings;
import com.google.ai.edge.gallery.proto.Skills;
import com.google.ai.edge.gallery.proto.UserData;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes10.dex */
public final class AppModule_ProvideDataStoreRepositoryFactory implements Factory<DataStoreRepository> {
    private final Provider<DataStore<BenchmarkResults>> benchmarkResultsStoreProvider;
    private final Provider<DataStore<CutoutCollection>> cutoutsDataStoreProvider;
    private final Provider<DataStore<Settings>> dataStoreProvider;
    private final Provider<DataStore<Skills>> skillsDataStoreProvider;
    private final Provider<DataStore<UserData>> userDataDataStoreProvider;

    private AppModule_ProvideDataStoreRepositoryFactory(Provider<DataStore<Settings>> dataStoreProvider, Provider<DataStore<UserData>> userDataDataStoreProvider, Provider<DataStore<CutoutCollection>> cutoutsDataStoreProvider, Provider<DataStore<BenchmarkResults>> benchmarkResultsStoreProvider, Provider<DataStore<Skills>> skillsDataStoreProvider) {
        this.dataStoreProvider = dataStoreProvider;
        this.userDataDataStoreProvider = userDataDataStoreProvider;
        this.cutoutsDataStoreProvider = cutoutsDataStoreProvider;
        this.benchmarkResultsStoreProvider = benchmarkResultsStoreProvider;
        this.skillsDataStoreProvider = skillsDataStoreProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DataStoreRepository get() {
        return provideDataStoreRepository(this.dataStoreProvider.get(), this.userDataDataStoreProvider.get(), this.cutoutsDataStoreProvider.get(), this.benchmarkResultsStoreProvider.get(), this.skillsDataStoreProvider.get());
    }

    public static AppModule_ProvideDataStoreRepositoryFactory create(Provider<DataStore<Settings>> dataStoreProvider, Provider<DataStore<UserData>> userDataDataStoreProvider, Provider<DataStore<CutoutCollection>> cutoutsDataStoreProvider, Provider<DataStore<BenchmarkResults>> benchmarkResultsStoreProvider, Provider<DataStore<Skills>> skillsDataStoreProvider) {
        return new AppModule_ProvideDataStoreRepositoryFactory(dataStoreProvider, userDataDataStoreProvider, cutoutsDataStoreProvider, benchmarkResultsStoreProvider, skillsDataStoreProvider);
    }

    public static DataStoreRepository provideDataStoreRepository(DataStore<Settings> dataStore, DataStore<UserData> userDataDataStore, DataStore<CutoutCollection> cutoutsDataStore, DataStore<BenchmarkResults> benchmarkResultsStore, DataStore<Skills> skillsDataStore) {
        return (DataStoreRepository) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDataStoreRepository(dataStore, userDataDataStore, cutoutsDataStore, benchmarkResultsStore, skillsDataStore));
    }
}
