package com.google.ai.edge.gallery;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* JADX INFO: compiled from: GalleryLifecycleProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m921d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m922d2 = {"Lcom/google/ai/edge/gallery/GalleryLifecycleProvider;", "Lcom/google/ai/edge/gallery/AppLifecycleProvider;", "<init>", "()V", "_isAppInForeground", "", "value", "isAppInForeground", "()Z", "setAppInForeground", "(Z)V", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GalleryLifecycleProvider implements AppLifecycleProvider {
    public static final int $stable = 8;
    private boolean _isAppInForeground;

    @Override // com.google.ai.edge.gallery.AppLifecycleProvider
    /* JADX INFO: renamed from: isAppInForeground, reason: from getter */
    public boolean get_isAppInForeground() {
        return this._isAppInForeground;
    }

    @Override // com.google.ai.edge.gallery.AppLifecycleProvider
    public void setAppInForeground(boolean value) {
        this._isAppInForeground = value;
    }
}
