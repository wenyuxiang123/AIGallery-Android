package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.LlmBenchmarkBasicInfo;
import com.google.ai.edge.gallery.proto.LlmBenchmarkStats;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;


public final class LlmBenchmarkResult extends GeneratedMessageLite<LlmBenchmarkResult, Builder> implements LlmBenchmarkResultOrBuilder {
    public static final int BAISC_INFO_FIELD_NUMBER = 2;
    private static final LlmBenchmarkResult DEFAULT_INSTANCE;
    private static volatile Parser<LlmBenchmarkResult> PARSER = null;
    public static final int STATS_FIELD_NUMBER = 3;
    private LlmBenchmarkBasicInfo baiscInfo_;
    private int bitField0_;
    private LlmBenchmarkStats stats_;

    private LlmBenchmarkResult() {
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkResultOrBuilder
    public boolean hasBaiscInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkResultOrBuilder
    public LlmBenchmarkBasicInfo getBaiscInfo() {
        return this.baiscInfo_ == null ? LlmBenchmarkBasicInfo.getDefaultInstance() : this.baiscInfo_;
    }

    
    public void setBaiscInfo(LlmBenchmarkBasicInfo value) {
        value.getClass();
        this.baiscInfo_ = value;
        this.bitField0_ |= 1;
    }

    
    public void mergeBaiscInfo(LlmBenchmarkBasicInfo value) {
        value.getClass();
        if (this.baiscInfo_ != null && this.baiscInfo_ != LlmBenchmarkBasicInfo.getDefaultInstance()) {
            this.baiscInfo_ = LlmBenchmarkBasicInfo.newBuilder(this.baiscInfo_).mergeFrom(value).buildPartial();
        } else {
            this.baiscInfo_ = value;
        }
        this.bitField0_ |= 1;
    }

    
    public void clearBaiscInfo() {
        this.baiscInfo_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkResultOrBuilder
    public boolean hasStats() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkResultOrBuilder
    public LlmBenchmarkStats getStats() {
        return this.stats_ == null ? LlmBenchmarkStats.getDefaultInstance() : this.stats_;
    }

    
    public void setStats(LlmBenchmarkStats value) {
        value.getClass();
        this.stats_ = value;
        this.bitField0_ |= 2;
    }

    
    public void mergeStats(LlmBenchmarkStats value) {
        value.getClass();
        if (this.stats_ != null && this.stats_ != LlmBenchmarkStats.getDefaultInstance()) {
            this.stats_ = LlmBenchmarkStats.newBuilder(this.stats_).mergeFrom(value).buildPartial();
        } else {
            this.stats_ = value;
        }
        this.bitField0_ |= 2;
    }

    
    public void clearStats() {
        this.stats_ = null;
        this.bitField0_ &= -3;
    }

    public static LlmBenchmarkResult parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (LlmBenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmBenchmarkResult parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmBenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmBenchmarkResult parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (LlmBenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmBenchmarkResult parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmBenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmBenchmarkResult parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (LlmBenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmBenchmarkResult parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmBenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmBenchmarkResult parseFrom(InputStream input) throws IOException {
        return (LlmBenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmBenchmarkResult parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmBenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static LlmBenchmarkResult parseDelimitedFrom(InputStream input) throws IOException {
        return (LlmBenchmarkResult) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmBenchmarkResult parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmBenchmarkResult) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static LlmBenchmarkResult parseFrom(CodedInputStream input) throws IOException {
        return (LlmBenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmBenchmarkResult parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmBenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(LlmBenchmarkResult prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LlmBenchmarkResult, Builder> implements LlmBenchmarkResultOrBuilder {
        private Builder() {
            super(LlmBenchmarkResult.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkResultOrBuilder
        public boolean hasBaiscInfo() {
            return ((LlmBenchmarkResult) this.instance).hasBaiscInfo();
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkResultOrBuilder
        public LlmBenchmarkBasicInfo getBaiscInfo() {
            return ((LlmBenchmarkResult) this.instance).getBaiscInfo();
        }

        public Builder setBaiscInfo(LlmBenchmarkBasicInfo value) {
            copyOnWrite();
            ((LlmBenchmarkResult) this.instance).setBaiscInfo(value);
            return this;
        }

        public Builder setBaiscInfo(LlmBenchmarkBasicInfo.Builder builderForValue) {
            copyOnWrite();
            ((LlmBenchmarkResult) this.instance).setBaiscInfo(builderForValue.build());
            return this;
        }

        public Builder mergeBaiscInfo(LlmBenchmarkBasicInfo value) {
            copyOnWrite();
            ((LlmBenchmarkResult) this.instance).mergeBaiscInfo(value);
            return this;
        }

        public Builder clearBaiscInfo() {
            copyOnWrite();
            ((LlmBenchmarkResult) this.instance).clearBaiscInfo();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkResultOrBuilder
        public boolean hasStats() {
            return ((LlmBenchmarkResult) this.instance).hasStats();
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkResultOrBuilder
        public LlmBenchmarkStats getStats() {
            return ((LlmBenchmarkResult) this.instance).getStats();
        }

        public Builder setStats(LlmBenchmarkStats value) {
            copyOnWrite();
            ((LlmBenchmarkResult) this.instance).setStats(value);
            return this;
        }

        public Builder setStats(LlmBenchmarkStats.Builder builderForValue) {
            copyOnWrite();
            ((LlmBenchmarkResult) this.instance).setStats(builderForValue.build());
            return this;
        }

        public Builder mergeStats(LlmBenchmarkStats value) {
            copyOnWrite();
            ((LlmBenchmarkResult) this.instance).mergeStats(value);
            return this;
        }

        public Builder clearStats() {
            copyOnWrite();
            ((LlmBenchmarkResult) this.instance).clearStats();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new LlmBenchmarkResult();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "baiscInfo_", "stats_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<LlmBenchmarkResult> parser = PARSER;
                if (parser == null) {
                    synchronized (LlmBenchmarkResult.class) {
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
        LlmBenchmarkResult defaultInstance = new LlmBenchmarkResult();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(LlmBenchmarkResult.class, defaultInstance);
    }

    public static LlmBenchmarkResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LlmBenchmarkResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
