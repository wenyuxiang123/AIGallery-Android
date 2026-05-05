package com.google.ai.edge.gallery.di;

import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.CutoutCollection;
import dagger.internal.Factory;
import dagger.internal.Preconditions;


public final class AppModule_ProvideCutoutSerializerFactory implements Factory<Serializer<CutoutCollection>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Serializer<CutoutCollection> get() {
        return provideCutoutSerializer();
    }

    public static AppModule_ProvideCutoutSerializerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Serializer<CutoutCollection> provideCutoutSerializer() {
        return (Serializer) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCutoutSerializer());
    }

    private static final class InstanceHolder {
        static final AppModule_ProvideCutoutSerializerFactory INSTANCE = new AppModule_ProvideCutoutSerializerFactory();

        private InstanceHolder() {
        }
    }
}
