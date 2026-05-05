package com.google.ai.edge.gallery.di;

import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.UserData;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes10.dex */
public final class AppModule_ProvideUserDataSerializerFactory implements Factory<Serializer<UserData>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Serializer<UserData> get() {
        return provideUserDataSerializer();
    }

    public static AppModule_ProvideUserDataSerializerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Serializer<UserData> provideUserDataSerializer() {
        return (Serializer) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideUserDataSerializer());
    }

    private static final class InstanceHolder {
        static final AppModule_ProvideUserDataSerializerFactory INSTANCE = new AppModule_ProvideUserDataSerializerFactory();

        private InstanceHolder() {
        }
    }
}
