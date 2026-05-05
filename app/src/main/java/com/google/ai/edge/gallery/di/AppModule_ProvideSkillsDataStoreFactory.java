package com.google.ai.edge.gallery.di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.Skills;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;


public final class AppModule_ProvideSkillsDataStoreFactory implements Factory<DataStore<Skills>> {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer<Skills>> skillsSerializerProvider;

    private AppModule_ProvideSkillsDataStoreFactory(Provider<Context> contextProvider, Provider<Serializer<Skills>> skillsSerializerProvider) {
        this.contextProvider = contextProvider;
        this.skillsSerializerProvider = skillsSerializerProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DataStore<Skills> get() {
        return provideSkillsDataStore(this.contextProvider.get(), this.skillsSerializerProvider.get());
    }

    public static AppModule_ProvideSkillsDataStoreFactory create(Provider<Context> contextProvider, Provider<Serializer<Skills>> skillsSerializerProvider) {
        return new AppModule_ProvideSkillsDataStoreFactory(contextProvider, skillsSerializerProvider);
    }

    public static DataStore<Skills> provideSkillsDataStore(Context context, Serializer<Skills> skillsSerializer) {
        return (DataStore) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSkillsDataStore(context, skillsSerializer));
    }
}
