package com.google.ai.edge.gallery;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.FirebaseApp;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.ui.theme.ThemeSettings;
import dagger.hilt.android.HiltAndroidApp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GalleryApplication.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, m922d2 = {"Lcom/google/ai/edge/gallery/GalleryApplication;", "Landroid/app/Application;", "<init>", "()V", "dataStoreRepository", "Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "getDataStoreRepository", "()Lcom/google/ai/edge/gallery/data/DataStoreRepository;", "setDataStoreRepository", "(Lcom/google/ai/edge/gallery/data/DataStoreRepository;)V", "onCreate", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
