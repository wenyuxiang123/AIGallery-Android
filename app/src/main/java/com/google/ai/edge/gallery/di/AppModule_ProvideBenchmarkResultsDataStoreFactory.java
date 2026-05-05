package com.google.ai.edge.gallery.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.BenchmarkResults;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;


public final class AppModule_ProvideBenchmarkResultsDataStoreFactory implements Factory<DataStore<BenchmarkResults>> {
    private final Provider<Serializer<BenchmarkResults>> benchmarkResultsSerializerProvider;
    private final Provider<Context> contextProvider;

    private AppModule_ProvideBenchmarkResultsDataStoreFactory(Provider<Context> contextProvider, Provider<Serializer<BenchmarkResults>> benchmarkResultsSerializerProvider) {
        this.contextProvider = contextProvider;
        this.benchmarkResultsSerializerProvider = benchmarkResultsSerializerProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DataStore<BenchmarkResults> get() {
        return provideBenchmarkResultsDataStore(this.contextProvider.get(), this.benchmarkResultsSerializerProvider.get());
    }

    public static AppModule_ProvideBenchmarkResultsDataStoreFactory create(Provider<Context> contextProvider, Provider<Serializer<BenchmarkResults>> benchmarkResultsSerializerProvider) {
        return new AppModule_ProvideBenchmarkResultsDataStoreFactory(contextProvider, benchmarkResultsSerializerProvider);
    }

    public static DataStore<BenchmarkResults> provideBenchmarkResultsDataStore(Context context, Serializer<BenchmarkResults> benchmarkResultsSerializer) {
        return (DataStore) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBenchmarkResultsDataStore(context, benchmarkResultsSerializer));
    }
}
