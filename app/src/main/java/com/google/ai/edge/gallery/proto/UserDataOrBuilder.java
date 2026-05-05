package com.google.ai.edge.gallery.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface UserDataOrBuilder extends MessageLiteOrBuilder {
    boolean containsSecrets(String str);

    AccessTokenData getAccessTokenData();

    @Deprecated
    Map<String, String> getSecrets();

    int getSecretsCount();

    Map<String, String> getSecretsMap();

    String getSecretsOrDefault(String str, String str2);

    String getSecretsOrThrow(String str);

    boolean hasAccessTokenData();
}
