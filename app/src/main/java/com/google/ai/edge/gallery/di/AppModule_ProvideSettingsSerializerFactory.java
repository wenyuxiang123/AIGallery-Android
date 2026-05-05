package com.google.ai.edge.gallery.di;

import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.Settings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes10.dex */
public final class AppModule_ProvideSettingsSerializerFactory implements Factory<Serializer<Settings>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Serializer<Settings> get() {
        return provideSettingsSerializer();
    }

    public static AppModule_ProvideSettingsSerializerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Serializer<Settings> provideSettingsSerializer() {
        return (Serializer) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSettingsSerializer());
    }

    private static final class InstanceHolder {
        static final AppModule_ProvideSettingsSerializerFactory INSTANCE = new AppModule_ProvideSettingsSerializerFactory();

        private InstanceHolder() {
        }
    }
}
