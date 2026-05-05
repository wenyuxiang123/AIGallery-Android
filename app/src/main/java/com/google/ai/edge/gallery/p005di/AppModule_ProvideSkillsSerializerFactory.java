package com.google.ai.edge.gallery.p005di;

import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.proto.Skills;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes10.dex */
public final class AppModule_ProvideSkillsSerializerFactory implements Factory<Serializer<Skills>> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Serializer<Skills> get() {
        return provideSkillsSerializer();
    }

    public static AppModule_ProvideSkillsSerializerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Serializer<Skills> provideSkillsSerializer() {
        return (Serializer) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSkillsSerializer());
    }

    private static final class InstanceHolder {
        static final AppModule_ProvideSkillsSerializerFactory INSTANCE = new AppModule_ProvideSkillsSerializerFactory();

        private InstanceHolder() {
        }
    }
}
