package com.google.ai.edge.gallery.common;

import android.net.Uri;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import net.openid.appauth.AuthorizationServiceConfiguration;

/* JADX INFO: compiled from: ProjectConfig.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/ProjectConfig;", "", "<init>", "()V", "clientId", "", "redirectUri", "authEndpoint", "tokenEndpoint", "authServiceConfig", "Lnet/openid/appauth/AuthorizationServiceConfiguration;", "getAuthServiceConfig", "()Lnet/openid/appauth/AuthorizationServiceConfiguration;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ProjectConfig {
    public static final String clientId = "REPLACE_WITH_YOUR_CLIENT_ID_IN_HUGGINGFACE_APP";
    public static final String redirectUri = "REPLACE_WITH_YOUR_REDIRECT_URI_IN_HUGGINGFACE_APP";
    public static final ProjectConfig INSTANCE = new ProjectConfig();
    private static final String authEndpoint = "https://huggingface.co/oauth/authorize";
    private static final String tokenEndpoint = "https://huggingface.co/oauth/token";
    private static final AuthorizationServiceConfiguration authServiceConfig = new AuthorizationServiceConfiguration(Uri.parse(authEndpoint), Uri.parse(tokenEndpoint));
    public static final int $stable = 8;

    private ProjectConfig() {
    }

    public final AuthorizationServiceConfiguration getAuthServiceConfig() {
        return authServiceConfig;
    }
}
