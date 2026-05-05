package com.google.ai.edge.gallery.ui.common.textandvoiceinput;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;


public final class HoldToDictateViewModel_Factory implements Factory<HoldToDictateViewModel> {
    private final Provider<Context> contextProvider;

    private HoldToDictateViewModel_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public HoldToDictateViewModel get() {
        return newInstance(this.contextProvider.get());
    }

    public static HoldToDictateViewModel_Factory create(Provider<Context> contextProvider) {
        return new HoldToDictateViewModel_Factory(contextProvider);
    }

    public static HoldToDictateViewModel newInstance(Context context) {
        return new HoldToDictateViewModel(context);
    }
}
