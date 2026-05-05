package com.google.ai.edge.gallery;

import com.google.ai.edge.gallery.customtasks.agentchat.HiltWrapper_AgentChatTaskModule;
import com.google.ai.edge.gallery.customtasks.agentchat.SkillManagerViewModel_HiltModules;
import com.google.ai.edge.gallery.customtasks.examplecustomtask.ExampleCustomTaskViewModel_HiltModules;
import com.google.ai.edge.gallery.customtasks.examplecustomtask.HiltWrapper_ExampleCustomTaskModule;
import com.google.ai.edge.gallery.customtasks.mobileactions.HiltWrapper_MobileActionsModule;
import com.google.ai.edge.gallery.customtasks.mobileactions.MobileActionsViewModel_HiltModules;
import com.google.ai.edge.gallery.customtasks.tinygarden.HiltWrapper_TinyGardenTaskModule;
import com.google.ai.edge.gallery.customtasks.tinygarden.TinyGardenViewModel_HiltModules;
import com.google.ai.edge.gallery.p005di.HiltWrapper_AppModule;
import com.google.ai.edge.gallery.p006ui.benchmark.BenchmarkViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.common.textandvoiceinput.HoldToDictateViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.common.tos.TosViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.llmchat.HiltWrapper_LlmAskAudioModule;
import com.google.ai.edge.gallery.p006ui.llmchat.HiltWrapper_LlmAskImageModule;
import com.google.ai.edge.gallery.p006ui.llmchat.HiltWrapper_LlmChatTaskModule;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskAudioViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmAskImageViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.llmchat.LlmChatViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.llmsingleturn.HiltWrapper_LlmSingleTurnTaskModule;
import com.google.ai.edge.gallery.p006ui.llmsingleturn.LlmSingleTurnViewModel_HiltModules;
import com.google.ai.edge.gallery.p006ui.modelmanager.ModelManagerViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivitySavedStateHandleModule;
import dagger.hilt.android.internal.managers.InterfaceC3959xb4b32df6;
import dagger.hilt.android.internal.managers.InterfaceC3960x7709314e;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import jakarta.inject.Singleton;

/* JADX INFO: loaded from: classes3.dex */
public final class GalleryApplication_HiltComponents {

    @Subcomponent(modules = {FragmentCBuilderModule.class, ViewCBuilderModule.class, HiltWrapper_ActivityModule.class, HiltWrapper_DefaultViewModelFactories_ActivityModule.class})
    public static abstract class ActivityC implements MainActivity_GeneratedInjector, ActivityComponent, DefaultViewModelFactories.ActivityEntryPoint, HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint, FragmentComponentManager.FragmentComponentBuilderEntryPoint, ViewComponentManager.ViewComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ActivityComponentBuilder {
        }
    }

    @Module(subcomponents = {ActivityC.class})
    interface ActivityCBuilderModule {
        @Binds
        ActivityComponentBuilder bind(ActivityC.Builder builder);
    }

    @Subcomponent(modules = {BenchmarkViewModel_HiltModules.KeyModule.class, ExampleCustomTaskViewModel_HiltModules.KeyModule.class, ActivityCBuilderModule.class, ViewModelCBuilderModule.class, HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class, HiltWrapper_ActivitySavedStateHandleModule.class, HoldToDictateViewModel_HiltModules.KeyModule.class, LlmAskAudioViewModel_HiltModules.KeyModule.class, LlmAskImageViewModel_HiltModules.KeyModule.class, LlmChatViewModel_HiltModules.KeyModule.class, LlmSingleTurnViewModel_HiltModules.KeyModule.class, MobileActionsViewModel_HiltModules.KeyModule.class, ModelManagerViewModel_HiltModules.KeyModule.class, SkillManagerViewModel_HiltModules.KeyModule.class, TinyGardenViewModel_HiltModules.KeyModule.class, TosViewModel_HiltModules.KeyModule.class})
    public static abstract class ActivityRetainedC implements ActivityRetainedComponent, ActivityComponentManager.ActivityComponentBuilderEntryPoint, InterfaceC3960x7709314e, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ActivityRetainedComponentBuilder {
        }
    }

    @Module(subcomponents = {ActivityRetainedC.class})
    interface ActivityRetainedCBuilderModule {
        @Binds
        ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
    }

    @Subcomponent(modules = {ViewWithFragmentCBuilderModule.class})
    public static abstract class FragmentC implements FragmentComponent, DefaultViewModelFactories.FragmentEntryPoint, ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends FragmentComponentBuilder {
        }
    }

    @Module(subcomponents = {FragmentC.class})
    interface FragmentCBuilderModule {
        @Binds
        FragmentComponentBuilder bind(FragmentC.Builder builder);
    }

    @Subcomponent
    public static abstract class ServiceC implements ServiceComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ServiceComponentBuilder {
        }
    }

    @Module(subcomponents = {ServiceC.class})
    interface ServiceCBuilderModule {
        @Binds
        ServiceComponentBuilder bind(ServiceC.Builder builder);
    }

    @Singleton
    @Component(modules = {ApplicationContextModule.class, ActivityRetainedCBuilderModule.class, ServiceCBuilderModule.class, HiltWrapper_AgentChatTaskModule.class, HiltWrapper_AppModule.class, HiltWrapper_ExampleCustomTaskModule.class, HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class, HiltWrapper_LlmAskAudioModule.class, HiltWrapper_LlmAskImageModule.class, HiltWrapper_LlmChatTaskModule.class, HiltWrapper_LlmSingleTurnTaskModule.class, HiltWrapper_MobileActionsModule.class, HiltWrapper_TinyGardenTaskModule.class})
    @javax.inject.Singleton
    public static abstract class SingletonC implements GalleryApplication_GeneratedInjector, FragmentGetContextFix.FragmentGetContextFixEntryPoint, InterfaceC3959xb4b32df6, ServiceComponentManager.ServiceComponentBuilderEntryPoint, SingletonComponent, GeneratedComponent {
    }

    @Subcomponent
    public static abstract class ViewC implements ViewComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewC.class})
    interface ViewCBuilderModule {
        @Binds
        ViewComponentBuilder bind(ViewC.Builder builder);
    }

    @Subcomponent(modules = {BenchmarkViewModel_HiltModules.BindsModule.class, ExampleCustomTaskViewModel_HiltModules.BindsModule.class, HiltWrapper_HiltViewModelFactory_ViewModelModule.class, HoldToDictateViewModel_HiltModules.BindsModule.class, LlmAskAudioViewModel_HiltModules.BindsModule.class, LlmAskImageViewModel_HiltModules.BindsModule.class, LlmChatViewModel_HiltModules.BindsModule.class, LlmSingleTurnViewModel_HiltModules.BindsModule.class, MobileActionsViewModel_HiltModules.BindsModule.class, ModelManagerViewModel_HiltModules.BindsModule.class, SkillManagerViewModel_HiltModules.BindsModule.class, TinyGardenViewModel_HiltModules.BindsModule.class, TosViewModel_HiltModules.BindsModule.class})
    public static abstract class ViewModelC implements ViewModelComponent, HiltViewModelFactory.ViewModelFactoriesEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewModelComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewModelC.class})
    interface ViewModelCBuilderModule {
        @Binds
        ViewModelComponentBuilder bind(ViewModelC.Builder builder);
    }

    @Subcomponent
    public static abstract class ViewWithFragmentC implements ViewWithFragmentComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewWithFragmentComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewWithFragmentC.class})
    interface ViewWithFragmentCBuilderModule {
        @Binds
        ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
    }

    private GalleryApplication_HiltComponents() {
    }
}
