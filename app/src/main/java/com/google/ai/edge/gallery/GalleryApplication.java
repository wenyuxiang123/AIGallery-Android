package com.google.ai.edge.gallery;

import com.google.firebase.FirebaseApp;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.ui.theme.ThemeSettings;
import dagger.hilt.android.HiltAndroidApp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "dataStoreRepository", "Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "getDataStoreRepository", "()Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "setDataStoreRepository", "(Lcom/google/ai/edge/gallery/data/DataStoreRepository;)V", "onCreate", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
@HiltAndroidApp
public final class GalleryApplication extends Hilt_GalleryApplication {
    public static final int $stable = 8;

    @Inject
    public DataStoreRepository dataStoreRepository;

    public final DataStoreRepository getDataStoreRepository() {
        DataStoreRepository dataStoreRepository = this.dataStoreRepository;
        if (dataStoreRepository != null) {
            return dataStoreRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataStoreRepository");
        return null;
    }

    public final void setDataStoreRepository(DataStoreRepository dataStoreRepository) {
        Intrinsics.checkNotNullParameter(dataStoreRepository, "<set-?>");
        this.dataStoreRepository = dataStoreRepository;
    }

    @Override // com.google.ai.edge.gallery.Hilt_GalleryApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        ThemeSettings.INSTANCE.getThemeOverride().setValue(getDataStoreRepository().readTheme());
        FirebaseApp.initializeApp(this);
    }
}
