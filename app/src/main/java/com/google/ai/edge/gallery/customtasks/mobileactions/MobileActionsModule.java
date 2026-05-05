package com.google.ai.edge.gallery.customtasks.mobileactions;

import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import kotlin.Metadata;



V", "provideTask", "Lcom/google/ai/edge/gallery/customtasks/common/CustomTask;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
@Module
public final class MobileActionsModule {
    public static final int $stable = 0;
    public static final MobileActionsModule INSTANCE = new MobileActionsModule();

    private MobileActionsModule() {
    }

    @Provides
    @IntoSet
    public final CustomTask provideTask() {
        return new MobileActionsTask();
    }
}
