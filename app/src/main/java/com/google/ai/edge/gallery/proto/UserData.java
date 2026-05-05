package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.AccessTokenData;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;


public final class UserData extends GeneratedMessageLite<UserData, Builder> implements UserDataOrBuilder {
    public static final int ACCESS_TOKEN_DATA_FIELD_NUMBER = 1;
    private static final UserData DEFAULT_INSTANCE;
    private static volatile Parser<UserData> PARSER = null;
    public static final int SECRETS_FIELD_NUMBER = 2;
    private AccessTokenData accessTokenData_;
    private int bitField0_;
    private MapFieldLite<String, String> secrets_ = MapFieldLite.emptyMapField();

    private UserData() {
    }

    @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
    public boolean hasAccessTokenData() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
    public AccessTokenData getAccessTokenData() {
        return this.accessTokenData_ == null ? AccessTokenData.getDefaultInstance() : this.accessTokenData_;
    }

    
    public void setAccessTokenData(AccessTokenData value) {
        value.getClass();
        this.accessTokenData_ = value;
        this.bitField0_ |= 1;
    }

    
    public void mergeAccessTokenData(AccessTokenData value) {
        value.getClass();
        if (this.accessTokenData_ != null && this.accessTokenData_ != AccessTokenData.getDefaultInstance()) {
            this.accessTokenData_ = AccessTokenData.newBuilder(this.accessTokenData_).mergeFrom(value).buildPartial();
        } else {
            this.accessTokenData_ = value;
        }
        this.bitField0_ |= 1;
    }

    
    public void clearAccessTokenData() {
        this.accessTokenData_ = null;
        this.bitField0_ &= -2;
    }

    private static final class SecretsDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

        private SecretsDefaultEntryHolder() {
        }
    }

    private MapFieldLite<String, String> internalGetSecrets() {
        return this.secrets_;
    }

    private MapFieldLite<String, String> internalGetMutableSecrets() {
        if (!this.secrets_.isMutable()) {
            this.secrets_ = this.secrets_.mutableCopy();
        }
        return this.secrets_;
    }

    @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
    public int getSecretsCount() {
        return internalGetSecrets().size();
    }

    @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
    public boolean containsSecrets(String key) {
        key.getClass();
        return internalGetSecrets().containsKey(key);
    }

    @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
    @Deprecated
    public Map<String, String> getSecrets() {
        return getSecretsMap();
    }

    @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
    public Map<String, String> getSecretsMap() {
        return Collections.unmodifiableMap(internalGetSecrets());
    }

    @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
    public String getSecretsOrDefault(String key, String defaultValue) {
        key.getClass();
        Map<String, String> map = internalGetSecrets();
        return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
    public String getSecretsOrThrow(String key) {
        key.getClass();
        Map<String, String> map = internalGetSecrets();
        if (!map.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return map.get(key);
    }

    
    public Map<String, String> getMutableSecretsMap() {
        return internalGetMutableSecrets();
    }

    public static UserData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (UserData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (UserData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserData parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (UserData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (UserData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserData parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (UserData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static UserData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (UserData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static UserData parseFrom(InputStream input) throws IOException {
        return (UserData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UserData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (UserData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UserData parseDelimitedFrom(InputStream input) throws IOException {
        return (UserData) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static UserData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (UserData) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static UserData parseFrom(CodedInputStream input) throws IOException {
        return (UserData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static UserData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (UserData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(UserData prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<UserData, Builder> implements UserDataOrBuilder {
        private Builder() {
            super(UserData.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
        public boolean hasAccessTokenData() {
            return ((UserData) this.instance).hasAccessTokenData();
        }

        @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
        public AccessTokenData getAccessTokenData() {
            return ((UserData) this.instance).getAccessTokenData();
        }

        public Builder setAccessTokenData(AccessTokenData value) {
            copyOnWrite();
            ((UserData) this.instance).setAccessTokenData(value);
            return this;
        }

        public Builder setAccessTokenData(AccessTokenData.Builder builderForValue) {
            copyOnWrite();
            ((UserData) this.instance).setAccessTokenData(builderForValue.build());
            return this;
        }

        public Builder mergeAccessTokenData(AccessTokenData value) {
            copyOnWrite();
            ((UserData) this.instance).mergeAccessTokenData(value);
            return this;
        }

        public Builder clearAccessTokenData() {
            copyOnWrite();
            ((UserData) this.instance).clearAccessTokenData();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
        public int getSecretsCount() {
            return ((UserData) this.instance).getSecretsMap().size();
        }

        @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
        public boolean containsSecrets(String key) {
            key.getClass();
            return ((UserData) this.instance).getSecretsMap().containsKey(key);
        }

        public Builder clearSecrets() {
            copyOnWrite();
            ((UserData) this.instance).getMutableSecretsMap().clear();
            return this;
        }

        public Builder removeSecrets(String key) {
            key.getClass();
            copyOnWrite();
            ((UserData) this.instance).getMutableSecretsMap().remove(key);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
        @Deprecated
        public Map<String, String> getSecrets() {
            return getSecretsMap();
        }

        @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
        public Map<String, String> getSecretsMap() {
            return Collections.unmodifiableMap(((UserData) this.instance).getSecretsMap());
        }

        @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
        public String getSecretsOrDefault(String key, String defaultValue) {
            key.getClass();
            Map<String, String> map = ((UserData) this.instance).getSecretsMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }

        @Override // com.google.ai.edge.gallery.proto.UserDataOrBuilder
        public String getSecretsOrThrow(String key) {
            key.getClass();
            Map<String, String> map = ((UserData) this.instance).getSecretsMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }

        public Builder putSecrets(String key, String value) {
            key.getClass();
            value.getClass();
            copyOnWrite();
            ((UserData) this.instance).getMutableSecretsMap().put(key, value);
            return this;
        }

        public Builder putAllSecrets(Map<String, String> values) {
            copyOnWrite();
            ((UserData) this.instance).getMutableSecretsMap().putAll(values);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new UserData();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "accessTokenData_", "secrets_", SecretsDefaultEntryHolder.defaultEntry};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<UserData> parser = PARSER;
                if (parser == null) {
                    synchronized (UserData.class) {
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
        UserData defaultInstance = new UserData();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(UserData.class, defaultInstance);
    }

    public static UserData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<UserData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
