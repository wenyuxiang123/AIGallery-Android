package com.google.ai.edge.gallery.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.CutoutCollection;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;


public final class AppModule_ProvideCutoutsDataStoreFactory implements Factory<DataStore<CutoutCollection>> {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer<CutoutCollection>> cutoutsSerializerProvider;

    private AppModule_ProvideCutoutsDataStoreFactory(Provider<Context> contextProvider, Provider<Serializer<CutoutCollection>> cutoutsSerializerProvider) {
        this.contextProvider = contextProvider;
        this.cutoutsSerializerProvider = cutoutsSerializerProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DataStore<CutoutCollection> get() {
        return provideCutoutsDataStore(this.contextProvider.get(), this.cutoutsSerializerProvider.get());
    }

    public static AppModule_ProvideCutoutsDataStoreFactory create(Provider<Context> contextProvider, Provider<Serializer<CutoutCollection>> cutoutsSerializerProvider) {
        return new AppModule_ProvideCutoutsDataStoreFactory(contextProvider, cutoutsSerializerProvider);
    }

    public static DataStore<CutoutCollection> provideCutoutsDataStore(Context context, Serializer<CutoutCollection> cutoutsSerializer) {
        return (DataStore) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCutoutsDataStore(context, cutoutsSerializer));
    }
}
