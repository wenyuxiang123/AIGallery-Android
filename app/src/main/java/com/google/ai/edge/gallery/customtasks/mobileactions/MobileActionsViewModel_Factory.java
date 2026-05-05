package com.google.ai.edge.gallery.customtasks.mobileactions;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class MobileActionsViewModel_Factory implements Factory<MobileActionsViewModel> {
    private final Provider<Context> appContextProvider;

    private MobileActionsViewModel_Factory(Provider<Context> appContextProvider) {
        this.appContextProvider = appContextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public MobileActionsViewModel get() {
        return newInstance(this.appContextProvider.get());
    }

    public static MobileActionsViewModel_Factory create(Provider<Context> appContextProvider) {
        return new MobileActionsViewModel_Factory(appContextProvider);
    }

    public static MobileActionsViewModel newInstance(Context appContext) {
        return new MobileActionsViewModel(appContext);
    }
}
