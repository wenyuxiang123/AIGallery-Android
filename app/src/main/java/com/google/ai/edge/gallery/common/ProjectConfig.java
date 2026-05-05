package com.google.ai.edge.gallery.common;

import android.net.Uri;
import kotlin.Metadata;
import net.openid.appauth.AuthorizationServiceConfiguration;



V", "clientId", "", "redirectUri", "authEndpoint", "tokenEndpoint", "authServiceConfig", "Lnet/openid/appauth/AuthorizationServiceConfiguration;", "getAuthServiceConfig", "()Lnet/openid/appauth/AuthorizationServiceConfiguration;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
