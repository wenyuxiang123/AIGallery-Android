package com.google.ai.edge.gallery.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;


public final class AccessTokenData extends GeneratedMessageLite<AccessTokenData, Builder> implements AccessTokenDataOrBuilder {
    public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
    private static final AccessTokenData DEFAULT_INSTANCE;
    public static final int EXPIRES_AT_MS_FIELD_NUMBER = 3;
    private static volatile Parser<AccessTokenData> PARSER = null;
    public static final int REFRESH_TOKEN_FIELD_NUMBER = 2;
    private long expiresAtMs_;
    private String accessToken_ = "";
    private String refreshToken_ = "";

    private AccessTokenData() {
    }

    @Override // com.google.ai.edge.gallery.proto.AccessTokenDataOrBuilder
    public String getAccessToken() {
        return this.accessToken_;
    }

    @Override // com.google.ai.edge.gallery.proto.AccessTokenDataOrBuilder
    public ByteString getAccessTokenBytes() {
        return ByteString.copyFromUtf8(this.accessToken_);
    }

    
    public void setAccessToken(String value) {
        value.getClass();
        this.accessToken_ = value;
    }

    
    public void clearAccessToken() {
        this.accessToken_ = getDefaultInstance().getAccessToken();
    }

    
    public void setAccessTokenBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.accessToken_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.AccessTokenDataOrBuilder
    public String getRefreshToken() {
        return this.refreshToken_;
    }

    @Override // com.google.ai.edge.gallery.proto.AccessTokenDataOrBuilder
    public ByteString getRefreshTokenBytes() {
        return ByteString.copyFromUtf8(this.refreshToken_);
    }

    
    public void setRefreshToken(String value) {
        value.getClass();
        this.refreshToken_ = value;
    }

    
    public void clearRefreshToken() {
        this.refreshToken_ = getDefaultInstance().getRefreshToken();
    }

    
    public void setRefreshTokenBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.refreshToken_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.AccessTokenDataOrBuilder
    public long getExpiresAtMs() {
        return this.expiresAtMs_;
    }

    
    public void setExpiresAtMs(long value) {
        this.expiresAtMs_ = value;
    }

    
    public void clearExpiresAtMs() {
        this.expiresAtMs_ = 0L;
    }

    public static AccessTokenData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (AccessTokenData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AccessTokenData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AccessTokenData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AccessTokenData parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (AccessTokenData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AccessTokenData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AccessTokenData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AccessTokenData parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (AccessTokenData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AccessTokenData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AccessTokenData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AccessTokenData parseFrom(InputStream input) throws IOException {
        return (AccessTokenData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AccessTokenData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AccessTokenData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AccessTokenData parseDelimitedFrom(InputStream input) throws IOException {
        return (AccessTokenData) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static AccessTokenData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AccessTokenData) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AccessTokenData parseFrom(CodedInputStream input) throws IOException {
        return (AccessTokenData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AccessTokenData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AccessTokenData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AccessTokenData prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AccessTokenData, Builder> implements AccessTokenDataOrBuilder {
        private Builder() {
            super(AccessTokenData.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.AccessTokenDataOrBuilder
        public String getAccessToken() {
            return ((AccessTokenData) this.instance).getAccessToken();
        }

        @Override // com.google.ai.edge.gallery.proto.AccessTokenDataOrBuilder
        public ByteString getAccessTokenBytes() {
            return ((AccessTokenData) this.instance).getAccessTokenBytes();
        }

        public Builder setAccessToken(String value) {
            copyOnWrite();
            ((AccessTokenData) this.instance).setAccessToken(value);
            return this;
        }

        public Builder clearAccessToken() {
            copyOnWrite();
            ((AccessTokenData) this.instance).clearAccessToken();
            return this;
        }

        public Builder setAccessTokenBytes(ByteString value) {
            copyOnWrite();
            ((AccessTokenData) this.instance).setAccessTokenBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.AccessTokenDataOrBuilder
        public String getRefreshToken() {
            return ((AccessTokenData) this.instance).getRefreshToken();
        }

        @Override // com.google.ai.edge.gallery.proto.AccessTokenDataOrBuilder
        public ByteString getRefreshTokenBytes() {
            return ((AccessTokenData) this.instance).getRefreshTokenBytes();
        }

        public Builder setRefreshToken(String value) {
            copyOnWrite();
            ((AccessTokenData) this.instance).setRefreshToken(value);
            return this;
        }

        public Builder clearRefreshToken() {
            copyOnWrite();
            ((AccessTokenData) this.instance).clearRefreshToken();
            return this;
        }

        public Builder setRefreshTokenBytes(ByteString value) {
            copyOnWrite();
            ((AccessTokenData) this.instance).setRefreshTokenBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.AccessTokenDataOrBuilder
        public long getExpiresAtMs() {
            return ((AccessTokenData) this.instance).getExpiresAtMs();
        }

        public Builder setExpiresAtMs(long value) {
            copyOnWrite();
            ((AccessTokenData) this.instance).setExpiresAtMs(value);
            return this;
        }

        public Builder clearExpiresAtMs() {
            copyOnWrite();
            ((AccessTokenData) this.instance).clearExpiresAtMs();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new AccessTokenData();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"accessToken_", "refreshToken_", "expiresAtMs_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<AccessTokenData> parser = PARSER;
                if (parser == null) {
                    synchronized (AccessTokenData.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                        break;
                    }
                }
                return parser;
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        AccessTokenData defaultInstance = new AccessTokenData();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(AccessTokenData.class, defaultInstance);
    }

    public static AccessTokenData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AccessTokenData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
