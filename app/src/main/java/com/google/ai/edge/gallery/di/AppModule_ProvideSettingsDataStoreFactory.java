package com.google.ai.edge.gallery.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.Settings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;


public final class AppModule_ProvideSettingsDataStoreFactory implements Factory<DataStore<Settings>> {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer<Settings>> settingsSerializerProvider;

    private AppModule_ProvideSettingsDataStoreFactory(Provider<Context> contextProvider, Provider<Serializer<Settings>> settingsSerializerProvider) {
        this.contextProvider = contextProvider;
        this.settingsSerializerProvider = settingsSerializerProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DataStore<Settings> get() {
        return provideSettingsDataStore(this.contextProvider.get(), this.settingsSerializerProvider.get());
    }

    public static AppModule_ProvideSettingsDataStoreFactory create(Provider<Context> contextProvider, Provider<Serializer<Settings>> settingsSerializerProvider) {
        return new AppModule_ProvideSettingsDataStoreFactory(contextProvider, settingsSerializerProvider);
    }

    public static DataStore<Settings> provideSettingsDataStore(Context context, Serializer<Settings> settingsSerializer) {
        return (DataStore) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSettingsDataStore(context, settingsSerializer));
    }
}
