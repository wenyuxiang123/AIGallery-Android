package com.google.ai.edge.gallery.p005di;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.UserData;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes10.dex */
public final class AppModule_ProvideUserDataDataStoreFactory implements Factory<DataStore<UserData>> {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer<UserData>> userDataSerializerProvider;

    private AppModule_ProvideUserDataDataStoreFactory(Provider<Context> contextProvider, Provider<Serializer<UserData>> userDataSerializerProvider) {
        this.contextProvider = contextProvider;
        this.userDataSerializerProvider = userDataSerializerProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DataStore<UserData> get() {
        return provideUserDataDataStore(this.contextProvider.get(), this.userDataSerializerProvider.get());
    }

    public static AppModule_ProvideUserDataDataStoreFactory create(Provider<Context> contextProvider, Provider<Serializer<UserData>> userDataSerializerProvider) {
        return new AppModule_ProvideUserDataDataStoreFactory(contextProvider, userDataSerializerProvider);
    }

    public static DataStore<UserData> provideUserDataDataStore(Context context, Serializer<UserData> userDataSerializer) {
        return (DataStore) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideUserDataDataStore(context, userDataSerializer));
    }
}
