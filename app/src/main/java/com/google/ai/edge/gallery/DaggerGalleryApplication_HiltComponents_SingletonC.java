package com.google.ai.edge.gallery;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.Serializer;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.ai.edge.gallery.GalleryApplication_HiltComponents;
import com.google.ai.edge.gallery.customtasks.agentchat.AgentChatTaskModule_ProvideTaskFactory;
import com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel;
import com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel_HiltModules;
import com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.customtasks.common.CustomTask;
import com.google.ai.edge.gallery.customtasks.examplecustomtask.C2537x6ea22cd9;
import com.google.ai.edge.gallery.customtasks.examplecustomtask.C2538xcdab6385;
import com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTaskViewModel;
import com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTaskViewModel_HiltModules;
import com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsModule_ProvideTaskFactory;
import com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel;
import com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel_HiltModules;
import com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenTaskModule_ProvideTaskFactory;
import com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel;
import com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel_HiltModules;
import com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.data.DataStoreRepository;
import com.google.ai.edge.gallery.data.DownloadRepository;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideAppLifecycleProviderFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideBenchmarkResultsDataStoreFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideBenchmarkResultsSerializerFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideCutoutSerializerFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideCutoutsDataStoreFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideDataStoreRepositoryFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideDownloadRepositoryFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideSettingsDataStoreFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideSettingsSerializerFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideSkillsDataStoreFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideSkillsSerializerFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideUserDataDataStoreFactory;
import com.google.ai.edge.gallery.p005di.AppModule_ProvideUserDataSerializerFactory;
import com.google.ai.edge.gallery.p006ui.benchmark.BenchmarkViewModel;
import com.google.ai.edge.gallery.p006ui.benchmark.BenchmarkViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.benchmark.BenchmarkViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.benchmark.BenchmarkViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.common.textandvoiceinput.HoldToDictateViewModel;
import com.google.ai.edge.gallery.p006ui.common.textandvoiceinput.HoldToDictateViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.common.textandvoiceinput.HoldToDictateViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.common.textandvoiceinput.HoldToDictateViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.common.tos.TosViewModel;
import com.google.ai.edge.gallery.p006ui.common.tos.TosViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.common.tos.TosViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.common.tos.TosViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskAudioModule_ProvideTaskFactory;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskAudioViewModel;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskAudioViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskAudioViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskAudioViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskImageModule_ProvideTaskFactory;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskImageViewModel;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskImageViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskImageViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskImageViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmChatTaskModule_ProvideTaskFactory;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmChatViewModel;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmChatViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmChatViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmChatViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.llmsingleturn.LlmSingleTurnTaskModule_ProvideTaskFactory;
import com.google.ai.edge.gallery.p006ui.llmsingleturn.LlmSingleTurnViewModel;
import com.google.ai.edge.gallery.p006ui.llmsingleturn.LlmSingleTurnViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.llmsingleturn.LlmSingleTurnViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.llmsingleturn.LlmSingleTurnViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.ai.edge.gallery.proto.BenchmarkResults;
import com.google.ai.edge.gallery.proto.CutoutCollection;
import com.google.ai.edge.gallery.proto.Settings;
import com.google.ai.edge.gallery.proto.Skills;
import com.google.ai.edge.gallery.proto.UserData;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.C3958xa054dd2f;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class DaggerGalleryApplication_HiltComponents_SingletonC {
    private DaggerGalleryApplication_HiltComponents_SingletonC() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ApplicationContextModule applicationContextModule;

        private Builder() {
        }

        public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
            this.applicationContextModule = (ApplicationContextModule) Preconditions.checkNotNull(applicationContextModule);
            return this;
        }

        public GalleryApplication_HiltComponents.SingletonC build() {
            Preconditions.checkBuilderRequirement(this.applicationContextModule, ApplicationContextModule.class);
            return new SingletonCImpl(this.applicationContextModule);
        }
    }

    private static final class ActivityRetainedCBuilder implements GalleryApplication_HiltComponents.ActivityRetainedC.Builder {
        private SavedStateHandleHolder savedStateHandleHolder;
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public ActivityRetainedCBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder) {
            this.savedStateHandleHolder = (SavedStateHandleHolder) Preconditions.checkNotNull(savedStateHandleHolder);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public GalleryApplication_HiltComponents.ActivityRetainedC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandleHolder, SavedStateHandleHolder.class);
            return new ActivityRetainedCImpl(this.singletonCImpl, this.savedStateHandleHolder);
        }
    }

    private static final class ActivityCBuilder implements GalleryApplication_HiltComponents.ActivityC.Builder {
        private Activity activity;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public ActivityCBuilder activity(Activity activity) {
            this.activity = (Activity) Preconditions.checkNotNull(activity);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public GalleryApplication_HiltComponents.ActivityC build() {
            Preconditions.checkBuilderRequirement(this.activity, Activity.class);
            return new ActivityCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activity);
        }
    }

    private static final class FragmentCBuilder implements GalleryApplication_HiltComponents.FragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Fragment fragment;
        private final SingletonCImpl singletonCImpl;

        private FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public FragmentCBuilder fragment(Fragment fragment) {
            this.fragment = (Fragment) Preconditions.checkNotNull(fragment);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public GalleryApplication_HiltComponents.FragmentC build() {
            Preconditions.checkBuilderRequirement(this.fragment, Fragment.class);
            return new FragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragment);
        }
    }

    private static final class ViewWithFragmentCBuilder implements GalleryApplication_HiltComponents.ViewWithFragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public ViewWithFragmentCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public GalleryApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewWithFragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl, this.view);
        }
    }

    private static final class ViewCBuilder implements GalleryApplication_HiltComponents.ViewC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public ViewCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public GalleryApplication_HiltComponents.ViewC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.view);
        }
    }

    private static final class ViewModelCBuilder implements GalleryApplication_HiltComponents.ViewModelC.Builder {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private SavedStateHandle savedStateHandle;
        private final SingletonCImpl singletonCImpl;
        private ViewModelLifecycle viewModelLifecycle;

        private ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(handle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
            this.viewModelLifecycle = (ViewModelLifecycle) Preconditions.checkNotNull(viewModelLifecycle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public GalleryApplication_HiltComponents.ViewModelC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.viewModelLifecycle, ViewModelLifecycle.class);
            return new ViewModelCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.savedStateHandle, this.viewModelLifecycle);
        }
    }

    private static final class ServiceCBuilder implements GalleryApplication_HiltComponents.ServiceC.Builder {
        private Service service;
        private final SingletonCImpl singletonCImpl;

        private ServiceCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public ServiceCBuilder service(Service service) {
            this.service = (Service) Preconditions.checkNotNull(service);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public GalleryApplication_HiltComponents.ServiceC build() {
            Preconditions.checkBuilderRequirement(this.service, Service.class);
            return new ServiceCImpl(this.singletonCImpl, this.service);
        }
    }

    private static final class ViewWithFragmentCImpl extends GalleryApplication_HiltComponents.ViewWithFragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

        ViewWithFragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl, View viewParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }
    }

    private static final class FragmentCImpl extends GalleryApplication_HiltComponents.FragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl = this;
        private final SingletonCImpl singletonCImpl;

        FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, Fragment fragmentParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return this.activityCImpl.getHiltInternalFactoryFactory();
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
            return new ViewWithFragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl);
        }
    }

    private static final class ViewCImpl extends GalleryApplication_HiltComponents.ViewC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewCImpl viewCImpl = this;

        ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }
    }

    private static final class ActivityCImpl extends GalleryApplication_HiltComponents.ActivityC {
        private final ActivityCImpl activityCImpl = this;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // com.google.ai.edge.gallery.MainActivity_GeneratedInjector
        public void injectMainActivity(MainActivity arg0) {
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public Map<Class<?>, Boolean> getViewModelKeys() {
            return LazyClassKeyMap.m917of(ImmutableMap.builderWithExpectedSize(12).put(BenchmarkViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(BenchmarkViewModel_HiltModules.KeyModule.provide())).put(C2538xcdab6385.lazyClassKeyName, Boolean.valueOf(ExampleCustomTaskViewModel_HiltModules.KeyModule.provide())).put(HoldToDictateViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(HoldToDictateViewModel_HiltModules.KeyModule.provide())).put(LlmAskAudioViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(LlmAskAudioViewModel_HiltModules.KeyModule.provide())).put(LlmAskImageViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(LlmAskImageViewModel_HiltModules.KeyModule.provide())).put(LlmChatViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(LlmChatViewModel_HiltModules.KeyModule.provide())).put(LlmSingleTurnViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(LlmSingleTurnViewModel_HiltModules.KeyModule.provide())).put(MobileActionsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(MobileActionsViewModel_HiltModules.KeyModule.provide())).put(ModelManagerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ModelManagerViewModel_HiltModules.KeyModule.provide())).put(SkillManagerViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(SkillManagerViewModel_HiltModules.KeyModule.provide())).put(TinyGardenViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(TinyGardenViewModel_HiltModules.KeyModule.provide())).put(TosViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(TosViewModel_HiltModules.KeyModule.provide())).build());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public ViewModelComponentBuilder getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
        public FragmentComponentBuilder fragmentComponentBuilder() {
            return new FragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
        public ViewComponentBuilder viewComponentBuilder() {
            return new ViewCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }
    }

    private static final class ViewModelCImpl extends GalleryApplication_HiltComponents.ViewModelC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        Provider<BenchmarkViewModel> benchmarkViewModelProvider;
        Provider<ExampleCustomTaskViewModel> exampleCustomTaskViewModelProvider;
        Provider<HoldToDictateViewModel> holdToDictateViewModelProvider;
        Provider<LlmAskAudioViewModel> llmAskAudioViewModelProvider;
        Provider<LlmAskImageViewModel> llmAskImageViewModelProvider;
        Provider<LlmChatViewModel> llmChatViewModelProvider;
        Provider<LlmSingleTurnViewModel> llmSingleTurnViewModelProvider;
        Provider<MobileActionsViewModel> mobileActionsViewModelProvider;
        Provider<ModelManagerViewModel> modelManagerViewModelProvider;
        private final SingletonCImpl singletonCImpl;
        Provider<SkillManagerViewModel> skillManagerViewModelProvider;
        Provider<TinyGardenViewModel> tinyGardenViewModelProvider;
        Provider<TosViewModel> tosViewModelProvider;
        private final ViewModelCImpl viewModelCImpl = this;

        ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            initialize(savedStateHandleParam, viewModelLifecycleParam);
        }

        Set<CustomTask> setOfCustomTask() {
            return ImmutableSet.m751of(AgentChatTaskModule_ProvideTaskFactory.provideTask(), LlmAskAudioModule_ProvideTaskFactory.provideTask(), LlmAskImageModule_ProvideTaskFactory.provideTask(), LlmChatTaskModule_ProvideTaskFactory.provideTask(), LlmSingleTurnTaskModule_ProvideTaskFactory.provideTask(), MobileActionsModule_ProvideTaskFactory.provideTask(), TinyGardenTaskModule_ProvideTaskFactory.provideTask());
        }

        private void initialize(final SavedStateHandle savedStateHandleParam, final ViewModelLifecycle viewModelLifecycleParam) {
            this.benchmarkViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 0);
            this.exampleCustomTaskViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 1);
            this.holdToDictateViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 2);
            this.llmAskAudioViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 3);
            this.llmAskImageViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 4);
            this.llmChatViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 5);
            this.llmSingleTurnViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 6);
            this.mobileActionsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 7);
            this.modelManagerViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 8);
            this.skillManagerViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 9);
            this.tinyGardenViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 10);
            this.tosViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 11);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
            return LazyClassKeyMap.m917of(ImmutableMap.builderWithExpectedSize(12).put(BenchmarkViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.benchmarkViewModelProvider).put(C2537x6ea22cd9.lazyClassKeyName, this.exampleCustomTaskViewModelProvider).put(HoldToDictateViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.holdToDictateViewModelProvider).put(LlmAskAudioViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.llmAskAudioViewModelProvider).put(LlmAskImageViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.llmAskImageViewModelProvider).put(LlmChatViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.llmChatViewModelProvider).put(LlmSingleTurnViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.llmSingleTurnViewModelProvider).put(MobileActionsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.mobileActionsViewModelProvider).put(ModelManagerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.modelManagerViewModelProvider).put(SkillManagerViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.skillManagerViewModelProvider).put(TinyGardenViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.tinyGardenViewModelProvider).put(TosViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.tosViewModelProvider).build());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
            return ImmutableMap.m717of();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* JADX INFO: renamed from: id */
            private final int f268id;
            private final SingletonCImpl singletonCImpl;
            private final ViewModelCImpl viewModelCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.viewModelCImpl = viewModelCImpl;
                this.f268id = id;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public T get() {
                switch (this.f268id) {
                    case 0:
                        return (T) new BenchmarkViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), this.singletonCImpl.provideDataStoreRepositoryProvider.get());
                    case 1:
                        return (T) new ExampleCustomTaskViewModel();
                    case 2:
                        return (T) new HoldToDictateViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 3:
                        return (T) new LlmAskAudioViewModel();
                    case 4:
                        return (T) new LlmAskImageViewModel();
                    case 5:
                        return (T) new LlmChatViewModel();
                    case 6:
                        return (T) new LlmSingleTurnViewModel();
                    case 7:
                        return (T) new MobileActionsViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 8:
                        return (T) new ModelManagerViewModel(this.singletonCImpl.provideDownloadRepositoryProvider.get(), this.singletonCImpl.provideDataStoreRepositoryProvider.get(), this.singletonCImpl.provideAppLifecycleProvider.get(), this.viewModelCImpl.setOfCustomTask(), ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 9:
                        return (T) new SkillManagerViewModel(this.singletonCImpl.provideDataStoreRepositoryProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 10:
                        return (T) new TinyGardenViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), this.singletonCImpl.provideDataStoreRepositoryProvider.get());
                    case 11:
                        return (T) new TosViewModel(this.singletonCImpl.provideDataStoreRepositoryProvider.get());
                    default:
                        throw new AssertionError(this.f268id);
                }
            }
        }
    }

    private static final class ActivityRetainedCImpl extends GalleryApplication_HiltComponents.ActivityRetainedC {
        private final ActivityRetainedCImpl activityRetainedCImpl = this;
        Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;
        private final SingletonCImpl singletonCImpl;

        ActivityRetainedCImpl(SingletonCImpl singletonCImpl, SavedStateHandleHolder savedStateHandleHolderParam) {
            this.singletonCImpl = singletonCImpl;
            initialize(savedStateHandleHolderParam);
        }

        private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
            this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 0));
        }

        @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
        public ActivityComponentBuilder activityComponentBuilder() {
            return new ActivityCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
        public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
            return this.provideActivityRetainedLifecycleProvider.get();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* JADX INFO: renamed from: id */
            private final int f266id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.f266id = id;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public T get() {
                switch (this.f266id) {
                    case 0:
                        return (T) C3958xa054dd2f.provideActivityRetainedLifecycle();
                    default:
                        throw new AssertionError(this.f266id);
                }
            }
        }
    }

    private static final class ServiceCImpl extends GalleryApplication_HiltComponents.ServiceC {
        private final ServiceCImpl serviceCImpl = this;
        private final SingletonCImpl singletonCImpl;

        ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
            this.singletonCImpl = singletonCImpl;
        }
    }

    private static final class SingletonCImpl extends GalleryApplication_HiltComponents.SingletonC {
        private final ApplicationContextModule applicationContextModule;
        Provider<AppLifecycleProvider> provideAppLifecycleProvider;
        Provider<DataStore<BenchmarkResults>> provideBenchmarkResultsDataStoreProvider;
        Provider<Serializer<BenchmarkResults>> provideBenchmarkResultsSerializerProvider;
        Provider<Serializer<CutoutCollection>> provideCutoutSerializerProvider;
        Provider<DataStore<CutoutCollection>> provideCutoutsDataStoreProvider;
        Provider<DataStoreRepository> provideDataStoreRepositoryProvider;
        Provider<DownloadRepository> provideDownloadRepositoryProvider;
        Provider<DataStore<Settings>> provideSettingsDataStoreProvider;
        Provider<Serializer<Settings>> provideSettingsSerializerProvider;
        Provider<DataStore<Skills>> provideSkillsDataStoreProvider;
        Provider<Serializer<Skills>> provideSkillsSerializerProvider;
        Provider<DataStore<UserData>> provideUserDataDataStoreProvider;
        Provider<Serializer<UserData>> provideUserDataSerializerProvider;
        private final SingletonCImpl singletonCImpl = this;

        SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
            this.applicationContextModule = applicationContextModuleParam;
            initialize(applicationContextModuleParam);
        }

        private void initialize(final ApplicationContextModule applicationContextModuleParam) {
            this.provideSettingsSerializerProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 2));
            this.provideSettingsDataStoreProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 1));
            this.provideUserDataSerializerProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 4));
            this.provideUserDataDataStoreProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 3));
            this.provideCutoutSerializerProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 6));
            this.provideCutoutsDataStoreProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 5));
            this.provideBenchmarkResultsSerializerProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 8));
            this.provideBenchmarkResultsDataStoreProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 7));
            this.provideSkillsSerializerProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 10));
            this.provideSkillsDataStoreProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 9));
            this.provideDataStoreRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 0));
            this.provideAppLifecycleProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 12));
            this.provideDownloadRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 11));
        }

        @Override // com.google.ai.edge.gallery.GalleryApplication_GeneratedInjector
        public void injectGalleryApplication(GalleryApplication arg0) {
            injectGalleryApplication2(arg0);
        }

        @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
        public Set<Boolean> getDisableFragmentGetContextFix() {
            return ImmutableSet.m745of();
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
        public ActivityRetainedComponentBuilder retainedComponentBuilder() {
            return new ActivityRetainedCBuilder(this.singletonCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
        public ServiceComponentBuilder serviceComponentBuilder() {
            return new ServiceCBuilder(this.singletonCImpl);
        }

        private GalleryApplication injectGalleryApplication2(GalleryApplication instance) {
            GalleryApplication_MembersInjector.injectDataStoreRepository(instance, this.provideDataStoreRepositoryProvider.get());
            return instance;
        }

        private static final class SwitchingProvider<T> implements Provider<T> {

            /* JADX INFO: renamed from: id */
            private final int f267id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.f267id = id;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public T get() {
                switch (this.f267id) {
                    case 0:
                        return (T) AppModule_ProvideDataStoreRepositoryFactory.provideDataStoreRepository(this.singletonCImpl.provideSettingsDataStoreProvider.get(), this.singletonCImpl.provideUserDataDataStoreProvider.get(), this.singletonCImpl.provideCutoutsDataStoreProvider.get(), this.singletonCImpl.provideBenchmarkResultsDataStoreProvider.get(), this.singletonCImpl.provideSkillsDataStoreProvider.get());
                    case 1:
                        return (T) AppModule_ProvideSettingsDataStoreFactory.provideSettingsDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), this.singletonCImpl.provideSettingsSerializerProvider.get());
                    case 2:
                        return (T) AppModule_ProvideSettingsSerializerFactory.provideSettingsSerializer();
                    case 3:
                        return (T) AppModule_ProvideUserDataDataStoreFactory.provideUserDataDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), this.singletonCImpl.provideUserDataSerializerProvider.get());
                    case 4:
                        return (T) AppModule_ProvideUserDataSerializerFactory.provideUserDataSerializer();
                    case 5:
                        return (T) AppModule_ProvideCutoutsDataStoreFactory.provideCutoutsDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), this.singletonCImpl.provideCutoutSerializerProvider.get());
                    case 6:
                        return (T) AppModule_ProvideCutoutSerializerFactory.provideCutoutSerializer();
                    case 7:
                        return (T) AppModule_ProvideBenchmarkResultsDataStoreFactory.provideBenchmarkResultsDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), this.singletonCImpl.provideBenchmarkResultsSerializerProvider.get());
                    case 8:
                        return (T) AppModule_ProvideBenchmarkResultsSerializerFactory.provideBenchmarkResultsSerializer();
                    case 9:
                        return (T) AppModule_ProvideSkillsDataStoreFactory.provideSkillsDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), this.singletonCImpl.provideSkillsSerializerProvider.get());
                    case 10:
                        return (T) AppModule_ProvideSkillsSerializerFactory.provideSkillsSerializer();
                    case 11:
                        return (T) AppModule_ProvideDownloadRepositoryFactory.provideDownloadRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), this.singletonCImpl.provideAppLifecycleProvider.get());
                    case 12:
                        return (T) AppModule_ProvideAppLifecycleProviderFactory.provideAppLifecycleProvider();
                    default:
                        throw new AssertionError(this.f267id);
                }
            }
        }
    }
}
