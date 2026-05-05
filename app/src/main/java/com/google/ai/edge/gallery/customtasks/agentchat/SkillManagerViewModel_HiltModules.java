package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes14.dex */
public final class SkillManagerViewModel_HiltModules {
    private SkillManagerViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(SkillManagerViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SkillManagerViewModel skillManagerViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(SkillManagerViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
