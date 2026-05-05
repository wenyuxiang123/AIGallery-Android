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


public final class LlmBenchmarkBasicInfo extends GeneratedMessageLite<LlmBenchmarkBasicInfo, Builder> implements LlmBenchmarkBasicInfoOrBuilder {
    public static final int ACCELERATOR_FIELD_NUMBER = 4;
    public static final int APP_VERSION_FIELD_NUMBER = 8;
    public static final int DECODE_TOKENS_FIELD_NUMBER = 6;
    private static final LlmBenchmarkBasicInfo DEFAULT_INSTANCE;
    public static final int END_MS_FIELD_NUMBER = 2;
    public static final int MODEL_NAME_FIELD_NUMBER = 3;
    public static final int NUMBER_OF_RUNS_FIELD_NUMBER = 7;
    private static volatile Parser<LlmBenchmarkBasicInfo> PARSER = null;
    public static final int PREFILL_TOKENS_FIELD_NUMBER = 5;
    public static final int START_MS_FIELD_NUMBER = 1;
    private int decodeTokens_;
    private long endMs_;
    private int numberOfRuns_;
    private int prefillTokens_;
    private long startMs_;
    private String modelName_ = "";
    private String accelerator_ = "";
    private String appVersion_ = "";

    private LlmBenchmarkBasicInfo() {
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public long getStartMs() {
        return this.startMs_;
    }

    
    public void setStartMs(long value) {
        this.startMs_ = value;
    }

    
    public void clearStartMs() {
        this.startMs_ = 0L;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public long getEndMs() {
        return this.endMs_;
    }

    
    public void setEndMs(long value) {
        this.endMs_ = value;
    }

    
    public void clearEndMs() {
        this.endMs_ = 0L;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public String getModelName() {
        return this.modelName_;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public ByteString getModelNameBytes() {
        return ByteString.copyFromUtf8(this.modelName_);
    }

    
    public void setModelName(String value) {
        value.getClass();
        this.modelName_ = value;
    }

    
    public void clearModelName() {
        this.modelName_ = getDefaultInstance().getModelName();
    }

    
    public void setModelNameBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.modelName_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public String getAccelerator() {
        return this.accelerator_;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public ByteString getAcceleratorBytes() {
        return ByteString.copyFromUtf8(this.accelerator_);
    }

    
    public void setAccelerator(String value) {
        value.getClass();
        this.accelerator_ = value;
    }

    
    public void clearAccelerator() {
        this.accelerator_ = getDefaultInstance().getAccelerator();
    }

    
    public void setAcceleratorBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.accelerator_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public int getPrefillTokens() {
        return this.prefillTokens_;
    }

    
    public void setPrefillTokens(int value) {
        this.prefillTokens_ = value;
    }

    
    public void clearPrefillTokens() {
        this.prefillTokens_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public int getDecodeTokens() {
        return this.decodeTokens_;
    }

    
    public void setDecodeTokens(int value) {
        this.decodeTokens_ = value;
    }

    
    public void clearDecodeTokens() {
        this.decodeTokens_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public int getNumberOfRuns() {
        return this.numberOfRuns_;
    }

    
    public void setNumberOfRuns(int value) {
        this.numberOfRuns_ = value;
    }

    
    public void clearNumberOfRuns() {
        this.numberOfRuns_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public String getAppVersion() {
        return this.appVersion_;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
    public ByteString getAppVersionBytes() {
        return ByteString.copyFromUtf8(this.appVersion_);
    }

    
    public void setAppVersion(String value) {
        value.getClass();
        this.appVersion_ = value;
    }

    
    public void clearAppVersion() {
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    
    public void setAppVersionBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.appVersion_ = value.toStringUtf8();
    }

    public static LlmBenchmarkBasicInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (LlmBenchmarkBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmBenchmarkBasicInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmBenchmarkBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmBenchmarkBasicInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (LlmBenchmarkBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmBenchmarkBasicInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmBenchmarkBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmBenchmarkBasicInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (LlmBenchmarkBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmBenchmarkBasicInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmBenchmarkBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmBenchmarkBasicInfo parseFrom(InputStream input) throws IOException {
        return (LlmBenchmarkBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmBenchmarkBasicInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmBenchmarkBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static LlmBenchmarkBasicInfo parseDelimitedFrom(InputStream input) throws IOException {
        return (LlmBenchmarkBasicInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmBenchmarkBasicInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmBenchmarkBasicInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static LlmBenchmarkBasicInfo parseFrom(CodedInputStream input) throws IOException {
        return (LlmBenchmarkBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmBenchmarkBasicInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmBenchmarkBasicInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(LlmBenchmarkBasicInfo prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LlmBenchmarkBasicInfo, Builder> implements LlmBenchmarkBasicInfoOrBuilder {
        private Builder() {
            super(LlmBenchmarkBasicInfo.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public long getStartMs() {
            return ((LlmBenchmarkBasicInfo) this.instance).getStartMs();
        }

        public Builder setStartMs(long value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setStartMs(value);
            return this;
        }

        public Builder clearStartMs() {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).clearStartMs();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public long getEndMs() {
            return ((LlmBenchmarkBasicInfo) this.instance).getEndMs();
        }

        public Builder setEndMs(long value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setEndMs(value);
            return this;
        }

        public Builder clearEndMs() {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).clearEndMs();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public String getModelName() {
            return ((LlmBenchmarkBasicInfo) this.instance).getModelName();
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public ByteString getModelNameBytes() {
            return ((LlmBenchmarkBasicInfo) this.instance).getModelNameBytes();
        }

        public Builder setModelName(String value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setModelName(value);
            return this;
        }

        public Builder clearModelName() {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).clearModelName();
            return this;
        }

        public Builder setModelNameBytes(ByteString value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setModelNameBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public String getAccelerator() {
            return ((LlmBenchmarkBasicInfo) this.instance).getAccelerator();
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public ByteString getAcceleratorBytes() {
            return ((LlmBenchmarkBasicInfo) this.instance).getAcceleratorBytes();
        }

        public Builder setAccelerator(String value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setAccelerator(value);
            return this;
        }

        public Builder clearAccelerator() {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).clearAccelerator();
            return this;
        }

        public Builder setAcceleratorBytes(ByteString value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setAcceleratorBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public int getPrefillTokens() {
            return ((LlmBenchmarkBasicInfo) this.instance).getPrefillTokens();
        }

        public Builder setPrefillTokens(int value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setPrefillTokens(value);
            return this;
        }

        public Builder clearPrefillTokens() {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).clearPrefillTokens();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public int getDecodeTokens() {
            return ((LlmBenchmarkBasicInfo) this.instance).getDecodeTokens();
        }

        public Builder setDecodeTokens(int value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setDecodeTokens(value);
            return this;
        }

        public Builder clearDecodeTokens() {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).clearDecodeTokens();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public int getNumberOfRuns() {
            return ((LlmBenchmarkBasicInfo) this.instance).getNumberOfRuns();
        }

        public Builder setNumberOfRuns(int value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setNumberOfRuns(value);
            return this;
        }

        public Builder clearNumberOfRuns() {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).clearNumberOfRuns();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public String getAppVersion() {
            return ((LlmBenchmarkBasicInfo) this.instance).getAppVersion();
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfoOrBuilder
        public ByteString getAppVersionBytes() {
            return ((LlmBenchmarkBasicInfo) this.instance).getAppVersionBytes();
        }

        public Builder setAppVersion(String value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setAppVersion(value);
            return this;
        }

        public Builder clearAppVersion() {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).clearAppVersion();
            return this;
        }

        public Builder setAppVersionBytes(ByteString value) {
            copyOnWrite();
            ((LlmBenchmarkBasicInfo) this.instance).setAppVersionBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new LlmBenchmarkBasicInfo();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"startMs_", "endMs_", "modelName_", "accelerator_", "prefillTokens_", "decodeTokens_", "numberOfRuns_", "appVersion_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006\u0004\u0007\u0004\bȈ", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<LlmBenchmarkBasicInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (LlmBenchmarkBasicInfo.class) {
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
        LlmBenchmarkBasicInfo defaultInstance = new LlmBenchmarkBasicInfo();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(LlmBenchmarkBasicInfo.class, defaultInstance);
    }

    public static LlmBenchmarkBasicInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LlmBenchmarkBasicInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
