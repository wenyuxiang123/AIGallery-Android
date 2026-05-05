package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.LlmConfig;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public final class ImportedModel extends GeneratedMessageLite<ImportedModel, Builder> implements ImportedModelOrBuilder {
    private static final ImportedModel DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    public static final int FILE_SIZE_FIELD_NUMBER = 2;
    public static final int LLM_CONFIG_FIELD_NUMBER = 3;
    private static volatile Parser<ImportedModel> PARSER;
    private Object config_;
    private long fileSize_;
    private int configCase_ = 0;
    private String fileName_ = "";

    private ImportedModel() {
    }

    public enum ConfigCase {
        LLM_CONFIG(3),
        CONFIG_NOT_SET(0);

        private final int value;

        ConfigCase(int value) {
            this.value = value;
        }

        @Deprecated
        public static ConfigCase valueOf(int value) {
            return forNumber(value);
        }

        public static ConfigCase forNumber(int value) {
            switch (value) {
                case 0:
                    return CONFIG_NOT_SET;
                case 3:
                    return LLM_CONFIG;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
    public ConfigCase getConfigCase() {
        return ConfigCase.forNumber(this.configCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfig() {
        this.configCase_ = 0;
        this.config_ = null;
    }

    @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.copyFromUtf8(this.fileName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String value) {
        value.getClass();
        this.fileName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.fileName_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
    public long getFileSize() {
        return this.fileSize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileSize(long value) {
        this.fileSize_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileSize() {
        this.fileSize_ = 0L;
    }

    @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
    public boolean hasLlmConfig() {
        return this.configCase_ == 3;
    }

    @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
    public LlmConfig getLlmConfig() {
        if (this.configCase_ == 3) {
            return (LlmConfig) this.config_;
        }
        return LlmConfig.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLlmConfig(LlmConfig value) {
        value.getClass();
        this.config_ = value;
        this.configCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLlmConfig(LlmConfig value) {
        value.getClass();
        if (this.configCase_ == 3 && this.config_ != LlmConfig.getDefaultInstance()) {
            this.config_ = LlmConfig.newBuilder((LlmConfig) this.config_).mergeFrom(value).buildPartial();
        } else {
            this.config_ = value;
        }
        this.configCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLlmConfig() {
        if (this.configCase_ == 3) {
            this.configCase_ = 0;
            this.config_ = null;
        }
    }

    public static ImportedModel parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (ImportedModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ImportedModel parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ImportedModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ImportedModel parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (ImportedModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ImportedModel parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ImportedModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ImportedModel parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (ImportedModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ImportedModel parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ImportedModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ImportedModel parseFrom(InputStream input) throws IOException {
        return (ImportedModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static ImportedModel parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ImportedModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ImportedModel parseDelimitedFrom(InputStream input) throws IOException {
        return (ImportedModel) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static ImportedModel parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ImportedModel) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ImportedModel parseFrom(CodedInputStream input) throws IOException {
        return (ImportedModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static ImportedModel parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ImportedModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ImportedModel prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ImportedModel, Builder> implements ImportedModelOrBuilder {
        private Builder() {
            super(ImportedModel.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
        public ConfigCase getConfigCase() {
            return ((ImportedModel) this.instance).getConfigCase();
        }

        public Builder clearConfig() {
            copyOnWrite();
            ((ImportedModel) this.instance).clearConfig();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
        public String getFileName() {
            return ((ImportedModel) this.instance).getFileName();
        }

        @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
        public ByteString getFileNameBytes() {
            return ((ImportedModel) this.instance).getFileNameBytes();
        }

        public Builder setFileName(String value) {
            copyOnWrite();
            ((ImportedModel) this.instance).setFileName(value);
            return this;
        }

        public Builder clearFileName() {
            copyOnWrite();
            ((ImportedModel) this.instance).clearFileName();
            return this;
        }

        public Builder setFileNameBytes(ByteString value) {
            copyOnWrite();
            ((ImportedModel) this.instance).setFileNameBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
        public long getFileSize() {
            return ((ImportedModel) this.instance).getFileSize();
        }

        public Builder setFileSize(long value) {
            copyOnWrite();
            ((ImportedModel) this.instance).setFileSize(value);
            return this;
        }

        public Builder clearFileSize() {
            copyOnWrite();
            ((ImportedModel) this.instance).clearFileSize();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
        public boolean hasLlmConfig() {
            return ((ImportedModel) this.instance).hasLlmConfig();
        }

        @Override // com.google.ai.edge.gallery.proto.ImportedModelOrBuilder
        public LlmConfig getLlmConfig() {
            return ((ImportedModel) this.instance).getLlmConfig();
        }

        public Builder setLlmConfig(LlmConfig value) {
            copyOnWrite();
            ((ImportedModel) this.instance).setLlmConfig(value);
            return this;
        }

        public Builder setLlmConfig(LlmConfig.Builder builderForValue) {
            copyOnWrite();
            ((ImportedModel) this.instance).setLlmConfig(builderForValue.build());
            return this;
        }

        public Builder mergeLlmConfig(LlmConfig value) {
            copyOnWrite();
            ((ImportedModel) this.instance).mergeLlmConfig(value);
            return this;
        }

        public Builder clearLlmConfig() {
            copyOnWrite();
            ((ImportedModel) this.instance).clearLlmConfig();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new ImportedModel();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"config_", "configCase_", "fileName_", "fileSize_", LlmConfig.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003<\u0000", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ImportedModel> parser = PARSER;
                if (parser == null) {
                    synchronized (ImportedModel.class) {
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
        ImportedModel defaultInstance = new ImportedModel();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(ImportedModel.class, defaultInstance);
    }

    public static ImportedModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ImportedModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
