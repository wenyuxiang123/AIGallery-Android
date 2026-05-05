package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.Cutout;
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

/* JADX INFO: loaded from: classes5.dex */
public final class CutoutCollection extends GeneratedMessageLite<CutoutCollection, Builder> implements CutoutCollectionOrBuilder {
    public static final int CUTOUT_FIELD_NUMBER = 1;
    private static final CutoutCollection DEFAULT_INSTANCE;
    private static volatile Parser<CutoutCollection> PARSER;
    private Internal.ProtobufList<Cutout> cutout_ = emptyProtobufList();

    private CutoutCollection() {
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutCollectionOrBuilder
    public List<Cutout> getCutoutList() {
        return this.cutout_;
    }

    public List<? extends CutoutOrBuilder> getCutoutOrBuilderList() {
        return this.cutout_;
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutCollectionOrBuilder
    public int getCutoutCount() {
        return this.cutout_.size();
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutCollectionOrBuilder
    public Cutout getCutout(int index) {
        return this.cutout_.get(index);
    }

    public CutoutOrBuilder getCutoutOrBuilder(int index) {
        return this.cutout_.get(index);
    }

    private void ensureCutoutIsMutable() {
        Internal.ProtobufList<Cutout> tmp = this.cutout_;
        if (!tmp.isModifiable()) {
            this.cutout_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCutout(int index, Cutout value) {
        value.getClass();
        ensureCutoutIsMutable();
        this.cutout_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCutout(Cutout value) {
        value.getClass();
        ensureCutoutIsMutable();
        this.cutout_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCutout(int index, Cutout value) {
        value.getClass();
        ensureCutoutIsMutable();
        this.cutout_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCutout(Iterable<? extends Cutout> values) {
        ensureCutoutIsMutable();
        AbstractMessageLite.addAll(values, this.cutout_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCutout() {
        this.cutout_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCutout(int index) {
        ensureCutoutIsMutable();
        this.cutout_.remove(index);
    }

    public static CutoutCollection parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (CutoutCollection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static CutoutCollection parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (CutoutCollection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static CutoutCollection parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (CutoutCollection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static CutoutCollection parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (CutoutCollection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static CutoutCollection parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (CutoutCollection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static CutoutCollection parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (CutoutCollection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static CutoutCollection parseFrom(InputStream input) throws IOException {
        return (CutoutCollection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static CutoutCollection parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (CutoutCollection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static CutoutCollection parseDelimitedFrom(InputStream input) throws IOException {
        return (CutoutCollection) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static CutoutCollection parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (CutoutCollection) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static CutoutCollection parseFrom(CodedInputStream input) throws IOException {
        return (CutoutCollection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static CutoutCollection parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (CutoutCollection) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(CutoutCollection prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<CutoutCollection, Builder> implements CutoutCollectionOrBuilder {
        private Builder() {
            super(CutoutCollection.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutCollectionOrBuilder
        public List<Cutout> getCutoutList() {
            return Collections.unmodifiableList(((CutoutCollection) this.instance).getCutoutList());
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutCollectionOrBuilder
        public int getCutoutCount() {
            return ((CutoutCollection) this.instance).getCutoutCount();
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutCollectionOrBuilder
        public Cutout getCutout(int index) {
            return ((CutoutCollection) this.instance).getCutout(index);
        }

        public Builder setCutout(int index, Cutout value) {
            copyOnWrite();
            ((CutoutCollection) this.instance).setCutout(index, value);
            return this;
        }

        public Builder setCutout(int index, Cutout.Builder builderForValue) {
            copyOnWrite();
            ((CutoutCollection) this.instance).setCutout(index, builderForValue.build());
            return this;
        }

        public Builder addCutout(Cutout value) {
            copyOnWrite();
            ((CutoutCollection) this.instance).addCutout(value);
            return this;
        }

        public Builder addCutout(int index, Cutout value) {
            copyOnWrite();
            ((CutoutCollection) this.instance).addCutout(index, value);
            return this;
        }

        public Builder addCutout(Cutout.Builder builderForValue) {
            copyOnWrite();
            ((CutoutCollection) this.instance).addCutout(builderForValue.build());
            return this;
        }

        public Builder addCutout(int index, Cutout.Builder builderForValue) {
            copyOnWrite();
            ((CutoutCollection) this.instance).addCutout(index, builderForValue.build());
            return this;
        }

        public Builder addAllCutout(Iterable<? extends Cutout> values) {
            copyOnWrite();
            ((CutoutCollection) this.instance).addAllCutout(values);
            return this;
        }

        public Builder clearCutout() {
            copyOnWrite();
            ((CutoutCollection) this.instance).clearCutout();
            return this;
        }

        public Builder removeCutout(int index) {
            copyOnWrite();
            ((CutoutCollection) this.instance).removeCutout(index);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new CutoutCollection();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"cutout_", Cutout.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<CutoutCollection> parser = PARSER;
                if (parser == null) {
                    synchronized (CutoutCollection.class) {
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
        CutoutCollection defaultInstance = new CutoutCollection();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(CutoutCollection.class, defaultInstance);
    }

    public static CutoutCollection getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<CutoutCollection> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
