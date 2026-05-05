package com.google.ai.edge.gallery.di;

import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.BenchmarkResults;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes10.dex */
public final class AppModule_ProvideBenchmarkResultsSerializerFactory implements Factory<Serializer<BenchmarkResults>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Serializer<BenchmarkResults> get() {
        return provideBenchmarkResultsSerializer();
    }

    public static AppModule_ProvideBenchmarkResultsSerializerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Serializer<BenchmarkResults> provideBenchmarkResultsSerializer() {
        return (Serializer) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBenchmarkResultsSerializer());
    }

    private static final class InstanceHolder {
        static final AppModule_ProvideBenchmarkResultsSerializerFactory INSTANCE = new AppModule_ProvideBenchmarkResultsSerializerFactory();

        private InstanceHolder() {
        }
    }
}
