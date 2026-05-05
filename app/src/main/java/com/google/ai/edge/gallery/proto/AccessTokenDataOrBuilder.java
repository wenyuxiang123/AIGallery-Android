package com.google.ai.edge.gallery.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes5.dex */
public interface AccessTokenDataOrBuilder extends MessageLiteOrBuilder {
    String getAccessToken();

    ByteString getAccessTokenBytes();

    long getExpiresAtMs();

    String getRefreshToken();

    ByteString getRefreshTokenBytes();
}
