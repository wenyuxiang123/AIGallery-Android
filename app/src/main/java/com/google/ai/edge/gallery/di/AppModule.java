package com.google.ai.edge.gallery.di;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import com.google.ai.edge.gallery.AppLifecycleProvider;
import com.google.ai.edge.gallery.BenchmarkResultsSerializer;
import com.google.ai.edge.gallery.CutoutsSerializer;
import com.google.ai.edge.gallery.GalleryLifecycleProvider;
import com.google.ai.edge.gallery.SettingsSerializer;
import com.google.ai.edge.gallery.SkillsSerializer;
import com.google.ai.edge.gallery.UserDataSerializer;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.data.DefaultDataStoreRepository;
import com.google.ai.edge.gallery.data.DefaultDownloadRepository;
import com.google.ai.edge.gallery.data.DownloadRepository;
import com.google.ai.edge.gallery.proto.BenchmarkResults;
import com.google.ai.edge.gallery.proto.CutoutCollection;
import com.google.ai.edge.gallery.proto.Settings;
import com.google.ai.edge.gallery.proto.Skills;
import com.google.ai.edge.gallery.proto.UserData;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.File;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;



V", "provideSettingsSerializer", "Landroidx/datastore/core/Serializer;", "Lcom/google/ai/edge/gallery/proto/Settings;", "provideCutoutSerializer", "Lcom/google/ai/edge/gallery/proto/CutoutCollection;", "provideUserDataSerializer", "Lcom/google/ai/edge/gallery/proto/UserData;", "provideBenchmarkResultsSerializer", "Lcom/google/ai/edge/gallery/proto/BenchmarkResults;", "provideSkillsSerializer", "Lcom/google/ai/edge/gallery/proto/Skills;", "provideSettingsDataStore", "Landroidx/datastore/core/DataStore;", "context", "Landroid/content/Context;", "settingsSerializer", "provideCutoutsDataStore", "cutoutsSerializer", "provideUserDataDataStore", "userDataSerializer", "provideBenchmarkResultsDataStore", "benchmarkResultsSerializer", "provideSkillsDataStore", "skillsSerializer", "provideAppLifecycleProvider", "Lcom/google/ai/edge/gallery/AppLifecycleProvider;", "provideDataStoreRepository", "Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "dataStore", "userDataDataStore", "cutoutsDataStore", "benchmarkResultsStore", "skillsDataStore", "provideDownloadRepository", "Lcom/google/ai/edge/gallery/data/DownloadRepository;", "lifecycleProvider", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
@Module
public final class AppModule {
    public static final int $stable = 0;
    public static final AppModule INSTANCE = new AppModule();

    private AppModule() {
    }

    @Provides
    @Singleton
    public final Serializer<Settings> provideSettingsSerializer() {
        return SettingsSerializer.INSTANCE;
    }

    @Provides
    @Singleton
    public final Serializer<CutoutCollection> provideCutoutSerializer() {
        return CutoutsSerializer.INSTANCE;
    }

    @Provides
    @Singleton
    public final Serializer<UserData> provideUserDataSerializer() {
        return UserDataSerializer.INSTANCE;
    }

    @Provides
    @Singleton
    public final Serializer<BenchmarkResults> provideBenchmarkResultsSerializer() {
        return BenchmarkResultsSerializer.INSTANCE;
    }

    @Provides
    @Singleton
    public final Serializer<Skills> provideSkillsSerializer() {
        return SkillsSerializer.INSTANCE;
    }

    @Provides
    @Singleton
    public final DataStore<Settings> provideSettingsDataStore(@ApplicationContext final Context context, Serializer<Settings> settingsSerializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settingsSerializer, "settingsSerializer");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, settingsSerializer, null, null, null, new Function0() { // from class: com.google.ai.edge.gallery.di.AppModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppModule.provideSettingsDataStore$lambda$0(context);
            }
        }, 14, null);
    }

    
    public static final File provideSettingsDataStore$lambda$0(Context $context) {
        return DataStoreFile.dataStoreFile($context, "settings.pb");
    }

    @Provides
    @Singleton
    public final DataStore<CutoutCollection> provideCutoutsDataStore(@ApplicationContext final Context context, Serializer<CutoutCollection> cutoutsSerializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cutoutsSerializer, "cutoutsSerializer");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, cutoutsSerializer, null, null, null, new Function0() { // from class: com.google.ai.edge.gallery.di.AppModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppModule.provideCutoutsDataStore$lambda$1(context);
            }
        }, 14, null);
    }

    
    public static final File provideCutoutsDataStore$lambda$1(Context $context) {
        return DataStoreFile.dataStoreFile($context, "cutouts.pb");
    }

    @Provides
    @Singleton
    public final DataStore<UserData> provideUserDataDataStore(@ApplicationContext final Context context, Serializer<UserData> userDataSerializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userDataSerializer, "userDataSerializer");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, userDataSerializer, null, null, null, new Function0() { // from class: com.google.ai.edge.gallery.di.AppModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppModule.provideUserDataDataStore$lambda$2(context);
            }
        }, 14, null);
    }

    
    public static final File provideUserDataDataStore$lambda$2(Context $context) {
        return DataStoreFile.dataStoreFile($context, "user_data.pb");
    }

    @Provides
    @Singleton
    public final DataStore<BenchmarkResults> provideBenchmarkResultsDataStore(@ApplicationContext final Context context, Serializer<BenchmarkResults> benchmarkResultsSerializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(benchmarkResultsSerializer, "benchmarkResultsSerializer");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, benchmarkResultsSerializer, null, null, null, new Function0() { // from class: com.google.ai.edge.gallery.di.AppModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppModule.provideBenchmarkResultsDataStore$lambda$3(context);
            }
        }, 14, null);
    }

    
    public static final File provideBenchmarkResultsDataStore$lambda$3(Context $context) {
        return DataStoreFile.dataStoreFile($context, "benchmark_results.pb");
    }

    @Provides
    @Singleton
    public final DataStore<Skills> provideSkillsDataStore(@ApplicationContext final Context context, Serializer<Skills> skillsSerializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(skillsSerializer, "skillsSerializer");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, skillsSerializer, null, null, null, new Function0() { // from class: com.google.ai.edge.gallery.di.AppModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppModule.provideSkillsDataStore$lambda$4(context);
            }
        }, 14, null);
    }

    
    public static final File provideSkillsDataStore$lambda$4(Context $context) {
        return DataStoreFile.dataStoreFile($context, "skills.pb");
    }

    @Provides
    @Singleton
    public final AppLifecycleProvider provideAppLifecycleProvider() {
        return new GalleryLifecycleProvider();
    }

    @Provides
    @Singleton
    public final DataStoreRepository provideDataStoreRepository(DataStore<Settings> dataStore, DataStore<UserData> userDataDataStore, DataStore<CutoutCollection> cutoutsDataStore, DataStore<BenchmarkResults> benchmarkResultsStore, DataStore<Skills> skillsDataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(userDataDataStore, "userDataDataStore");
        Intrinsics.checkNotNullParameter(cutoutsDataStore, "cutoutsDataStore");
        Intrinsics.checkNotNullParameter(benchmarkResultsStore, "benchmarkResultsStore");
        Intrinsics.checkNotNullParameter(skillsDataStore, "skillsDataStore");
        return new DefaultDataStoreRepository(dataStore, userDataDataStore, cutoutsDataStore, benchmarkResultsStore, skillsDataStore);
    }

    @Provides
    @Singleton
    public final DownloadRepository provideDownloadRepository(@ApplicationContext Context context, AppLifecycleProvider lifecycleProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleProvider, "lifecycleProvider");
        return new DefaultDownloadRepository(context, lifecycleProvider);
    }
}
