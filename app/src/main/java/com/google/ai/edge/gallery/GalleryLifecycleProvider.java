package com.google.ai.edge.gallery;

import kotlin.Metadata;



V", "_isAppInForeground", "", "value", "isAppInForeground", "()Z", "setAppInForeground", "(Z)V", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final class GalleryLifecycleProvider implements AppLifecycleProvider {
    public static final int $stable = 8;
    private boolean _isAppInForeground;

    @Override // com.google.ai.edge.gallery.AppLifecycleProvider
    
    public boolean get_isAppInForeground() {
        return this._isAppInForeground;
    }

    @Override // com.google.ai.edge.gallery.AppLifecycleProvider
    public void setAppInForeground(boolean value) {
        this._isAppInForeground = value;
    }
}
