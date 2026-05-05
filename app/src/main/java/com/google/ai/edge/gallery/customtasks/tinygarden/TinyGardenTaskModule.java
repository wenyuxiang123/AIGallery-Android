package com.google.ai.edge.gallery.customtasks.tinygarden;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: TinyGardenTaskModule.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m921d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/tinygarden/TinyGardenTaskModule;", "", "<init>", "()V", "provideTask", "Lcom/google/ai/edge/gallery/customtasks/common/CustomTask;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@Module
public final class TinyGardenTaskModule {
    public static final int $stable = 0;
    public static final TinyGardenTaskModule INSTANCE = new TinyGardenTaskModule();

    private TinyGardenTaskModule() {
    }

    @Provides
    @IntoSet
    public final CustomTask provideTask() {
        return new TinyGardenTask();
    }
}
