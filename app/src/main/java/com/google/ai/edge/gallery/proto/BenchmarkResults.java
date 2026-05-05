package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.BenchmarkResult;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;


public final class BenchmarkResults extends GeneratedMessageLite<BenchmarkResults, Builder> implements BenchmarkResultsOrBuilder {
    private static final BenchmarkResults DEFAULT_INSTANCE;
    private static volatile Parser<BenchmarkResults> PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private Internal.ProtobufList<BenchmarkResult> result_ = emptyProtobufList();

    private BenchmarkResults() {
    }

    @Override // com.google.ai.edge.gallery.proto.BenchmarkResultsOrBuilder
    public List<BenchmarkResult> getResultList() {
        return this.result_;
    }

    public List<? extends BenchmarkResultOrBuilder> getResultOrBuilderList() {
        return this.result_;
    }

    @Override // com.google.ai.edge.gallery.proto.BenchmarkResultsOrBuilder
    public int getResultCount() {
        return this.result_.size();
    }

    @Override // com.google.ai.edge.gallery.proto.BenchmarkResultsOrBuilder
    public BenchmarkResult getResult(int index) {
        return this.result_.get(index);
    }

    public BenchmarkResultOrBuilder getResultOrBuilder(int index) {
        return this.result_.get(index);
    }

    private void ensureResultIsMutable() {
        Internal.ProtobufList<BenchmarkResult> tmp = this.result_;
        if (!tmp.isModifiable()) {
            this.result_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    
    public void setResult(int index, BenchmarkResult value) {
        value.getClass();
        ensureResultIsMutable();
        this.result_.set(index, value);
    }

    
    public void addResult(BenchmarkResult value) {
        value.getClass();
        ensureResultIsMutable();
        this.result_.add(value);
    }

    
    public void addResult(int index, BenchmarkResult value) {
        value.getClass();
        ensureResultIsMutable();
        this.result_.add(index, value);
    }

    
    public void addAllResult(Iterable<? extends BenchmarkResult> values) {
        ensureResultIsMutable();
        AbstractMessageLite.addAll(values, this.result_);
    }

    
    public void clearResult() {
        this.result_ = emptyProtobufList();
    }

    
    public void removeResult(int index) {
        ensureResultIsMutable();
        this.result_.remove(index);
    }

    public static BenchmarkResults parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (BenchmarkResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BenchmarkResults parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BenchmarkResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BenchmarkResults parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (BenchmarkResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BenchmarkResults parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BenchmarkResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BenchmarkResults parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (BenchmarkResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BenchmarkResults parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BenchmarkResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BenchmarkResults parseFrom(InputStream input) throws IOException {
        return (BenchmarkResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BenchmarkResults parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BenchmarkResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BenchmarkResults parseDelimitedFrom(InputStream input) throws IOException {
        return (BenchmarkResults) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static BenchmarkResults parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BenchmarkResults) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BenchmarkResults parseFrom(CodedInputStream input) throws IOException {
        return (BenchmarkResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BenchmarkResults parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BenchmarkResults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BenchmarkResults prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BenchmarkResults, Builder> implements BenchmarkResultsOrBuilder {
        private Builder() {
            super(BenchmarkResults.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.BenchmarkResultsOrBuilder
        public List<BenchmarkResult> getResultList() {
            return Collections.unmodifiableList(((BenchmarkResults) this.instance).getResultList());
        }

        @Override // com.google.ai.edge.gallery.proto.BenchmarkResultsOrBuilder
        public int getResultCount() {
            return ((BenchmarkResults) this.instance).getResultCount();
        }

        @Override // com.google.ai.edge.gallery.proto.BenchmarkResultsOrBuilder
        public BenchmarkResult getResult(int index) {
            return ((BenchmarkResults) this.instance).getResult(index);
        }

        public Builder setResult(int index, BenchmarkResult value) {
            copyOnWrite();
            ((BenchmarkResults) this.instance).setResult(index, value);
            return this;
        }

        public Builder setResult(int index, BenchmarkResult.Builder builderForValue) {
            copyOnWrite();
            ((BenchmarkResults) this.instance).setResult(index, builderForValue.build());
            return this;
        }

        public Builder addResult(BenchmarkResult value) {
            copyOnWrite();
            ((BenchmarkResults) this.instance).addResult(value);
            return this;
        }

        public Builder addResult(int index, BenchmarkResult value) {
            copyOnWrite();
            ((BenchmarkResults) this.instance).addResult(index, value);
            return this;
        }

        public Builder addResult(BenchmarkResult.Builder builderForValue) {
            copyOnWrite();
            ((BenchmarkResults) this.instance).addResult(builderForValue.build());
            return this;
        }

        public Builder addResult(int index, BenchmarkResult.Builder builderForValue) {
            copyOnWrite();
            ((BenchmarkResults) this.instance).addResult(index, builderForValue.build());
            return this;
        }

        public Builder addAllResult(Iterable<? extends BenchmarkResult> values) {
            copyOnWrite();
            ((BenchmarkResults) this.instance).addAllResult(values);
            return this;
        }

        public Builder clearResult() {
            copyOnWrite();
            ((BenchmarkResults) this.instance).clearResult();
            return this;
        }

        public Builder removeResult(int index) {
            copyOnWrite();
            ((BenchmarkResults) this.instance).removeResult(index);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new BenchmarkResults();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"result_", BenchmarkResult.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<BenchmarkResults> parser = PARSER;
                if (parser == null) {
                    synchronized (BenchmarkResults.class) {
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
        BenchmarkResults defaultInstance = new BenchmarkResults();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(BenchmarkResults.class, defaultInstance);
    }

    public static BenchmarkResults getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BenchmarkResults> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
