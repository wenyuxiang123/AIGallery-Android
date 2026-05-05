package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.LlmBenchmarkResult;
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
public final class BenchmarkResult extends GeneratedMessageLite<BenchmarkResult, Builder> implements BenchmarkResultOrBuilder {
    private static final BenchmarkResult DEFAULT_INSTANCE;
    public static final int LLM_RESULT_FIELD_NUMBER = 2;
    private static volatile Parser<BenchmarkResult> PARSER;
    private int resultCase_ = 0;
    private Object result_;

    private BenchmarkResult() {
    }

    public enum ResultCase {
        LLM_RESULT(2),
        RESULT_NOT_SET(0);

        private final int value;

        ResultCase(int value) {
            this.value = value;
        }

        @Deprecated
        public static ResultCase valueOf(int value) {
            return forNumber(value);
        }

        public static ResultCase forNumber(int value) {
            switch (value) {
                case 0:
                    return RESULT_NOT_SET;
                case 1:
                default:
                    return null;
                case 2:
                    return LLM_RESULT;
            }
        }

        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.ai.edge.gallery.proto.BenchmarkResultOrBuilder
    public ResultCase getResultCase() {
        return ResultCase.forNumber(this.resultCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    @Override // com.google.ai.edge.gallery.proto.BenchmarkResultOrBuilder
    public boolean hasLlmResult() {
        return this.resultCase_ == 2;
    }

    @Override // com.google.ai.edge.gallery.proto.BenchmarkResultOrBuilder
    public LlmBenchmarkResult getLlmResult() {
        if (this.resultCase_ == 2) {
            return (LlmBenchmarkResult) this.result_;
        }
        return LlmBenchmarkResult.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLlmResult(LlmBenchmarkResult value) {
        value.getClass();
        this.result_ = value;
        this.resultCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLlmResult(LlmBenchmarkResult value) {
        value.getClass();
        if (this.resultCase_ == 2 && this.result_ != LlmBenchmarkResult.getDefaultInstance()) {
            this.result_ = LlmBenchmarkResult.newBuilder((LlmBenchmarkResult) this.result_).mergeFrom(value).buildPartial();
        } else {
            this.result_ = value;
        }
        this.resultCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLlmResult() {
        if (this.resultCase_ == 2) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    public static BenchmarkResult parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (BenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BenchmarkResult parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BenchmarkResult parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (BenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BenchmarkResult parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BenchmarkResult parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (BenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BenchmarkResult parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BenchmarkResult parseFrom(InputStream input) throws IOException {
        return (BenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BenchmarkResult parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BenchmarkResult parseDelimitedFrom(InputStream input) throws IOException {
        return (BenchmarkResult) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static BenchmarkResult parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BenchmarkResult) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BenchmarkResult parseFrom(CodedInputStream input) throws IOException {
        return (BenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BenchmarkResult parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BenchmarkResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BenchmarkResult prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BenchmarkResult, Builder> implements BenchmarkResultOrBuilder {
        private Builder() {
            super(BenchmarkResult.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.BenchmarkResultOrBuilder
        public ResultCase getResultCase() {
            return ((BenchmarkResult) this.instance).getResultCase();
        }

        public Builder clearResult() {
            copyOnWrite();
            ((BenchmarkResult) this.instance).clearResult();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.BenchmarkResultOrBuilder
        public boolean hasLlmResult() {
            return ((BenchmarkResult) this.instance).hasLlmResult();
        }

        @Override // com.google.ai.edge.gallery.proto.BenchmarkResultOrBuilder
        public LlmBenchmarkResult getLlmResult() {
            return ((BenchmarkResult) this.instance).getLlmResult();
        }

        public Builder setLlmResult(LlmBenchmarkResult value) {
            copyOnWrite();
            ((BenchmarkResult) this.instance).setLlmResult(value);
            return this;
        }

        public Builder setLlmResult(LlmBenchmarkResult.Builder builderForValue) {
            copyOnWrite();
            ((BenchmarkResult) this.instance).setLlmResult(builderForValue.build());
            return this;
        }

        public Builder mergeLlmResult(LlmBenchmarkResult value) {
            copyOnWrite();
            ((BenchmarkResult) this.instance).mergeLlmResult(value);
            return this;
        }

        public Builder clearLlmResult() {
            copyOnWrite();
            ((BenchmarkResult) this.instance).clearLlmResult();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new BenchmarkResult();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"result_", "resultCase_", LlmBenchmarkResult.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BenchmarkResult> parser = PARSER;
                if (parser == null) {
                    synchronized (BenchmarkResult.class) {
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
        BenchmarkResult defaultInstance = new BenchmarkResult();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(BenchmarkResult.class, defaultInstance);
    }

    public static BenchmarkResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BenchmarkResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
