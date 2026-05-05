package com.google.ai.edge.gallery.proto;

import androidx.camera.video.AudioStats;
import com.google.ai.edge.gallery.proto.ValueSeries;
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
public final class LlmBenchmarkStats extends GeneratedMessageLite<LlmBenchmarkStats, Builder> implements LlmBenchmarkStatsOrBuilder {
    public static final int DECODE_SPEED_FIELD_NUMBER = 2;
    private static final LlmBenchmarkStats DEFAULT_INSTANCE;
    public static final int FIRST_INIT_TIME_MS_FIELD_NUMBER = 4;
    public static final int NON_FIRST_INIT_TIME_MS_FIELD_NUMBER = 5;
    private static volatile Parser<LlmBenchmarkStats> PARSER = null;
    public static final int PREFILL_SPEED_FIELD_NUMBER = 1;
    public static final int TIME_TO_FIRST_TOKEN_FIELD_NUMBER = 3;
    private int bitField0_;
    private ValueSeries decodeSpeed_;
    private double firstInitTimeMs_;
    private ValueSeries nonFirstInitTimeMs_;
    private ValueSeries prefillSpeed_;
    private ValueSeries timeToFirstToken_;

    private LlmBenchmarkStats() {
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
    public boolean hasPrefillSpeed() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
    public ValueSeries getPrefillSpeed() {
        return this.prefillSpeed_ == null ? ValueSeries.getDefaultInstance() : this.prefillSpeed_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrefillSpeed(ValueSeries value) {
        value.getClass();
        this.prefillSpeed_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrefillSpeed(ValueSeries value) {
        value.getClass();
        if (this.prefillSpeed_ != null && this.prefillSpeed_ != ValueSeries.getDefaultInstance()) {
            this.prefillSpeed_ = ValueSeries.newBuilder(this.prefillSpeed_).mergeFrom(value).buildPartial();
        } else {
            this.prefillSpeed_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrefillSpeed() {
        this.prefillSpeed_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
    public boolean hasDecodeSpeed() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
    public ValueSeries getDecodeSpeed() {
        return this.decodeSpeed_ == null ? ValueSeries.getDefaultInstance() : this.decodeSpeed_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDecodeSpeed(ValueSeries value) {
        value.getClass();
        this.decodeSpeed_ = value;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDecodeSpeed(ValueSeries value) {
        value.getClass();
        if (this.decodeSpeed_ != null && this.decodeSpeed_ != ValueSeries.getDefaultInstance()) {
            this.decodeSpeed_ = ValueSeries.newBuilder(this.decodeSpeed_).mergeFrom(value).buildPartial();
        } else {
            this.decodeSpeed_ = value;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDecodeSpeed() {
        this.decodeSpeed_ = null;
        this.bitField0_ &= -3;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
    public boolean hasTimeToFirstToken() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
    public ValueSeries getTimeToFirstToken() {
        return this.timeToFirstToken_ == null ? ValueSeries.getDefaultInstance() : this.timeToFirstToken_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToFirstToken(ValueSeries value) {
        value.getClass();
        this.timeToFirstToken_ = value;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeToFirstToken(ValueSeries value) {
        value.getClass();
        if (this.timeToFirstToken_ != null && this.timeToFirstToken_ != ValueSeries.getDefaultInstance()) {
            this.timeToFirstToken_ = ValueSeries.newBuilder(this.timeToFirstToken_).mergeFrom(value).buildPartial();
        } else {
            this.timeToFirstToken_ = value;
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToFirstToken() {
        this.timeToFirstToken_ = null;
        this.bitField0_ &= -5;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
    public double getFirstInitTimeMs() {
        return this.firstInitTimeMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstInitTimeMs(double value) {
        this.firstInitTimeMs_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstInitTimeMs() {
        this.firstInitTimeMs_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
    public boolean hasNonFirstInitTimeMs() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
    public ValueSeries getNonFirstInitTimeMs() {
        return this.nonFirstInitTimeMs_ == null ? ValueSeries.getDefaultInstance() : this.nonFirstInitTimeMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNonFirstInitTimeMs(ValueSeries value) {
        value.getClass();
        this.nonFirstInitTimeMs_ = value;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNonFirstInitTimeMs(ValueSeries value) {
        value.getClass();
        if (this.nonFirstInitTimeMs_ != null && this.nonFirstInitTimeMs_ != ValueSeries.getDefaultInstance()) {
            this.nonFirstInitTimeMs_ = ValueSeries.newBuilder(this.nonFirstInitTimeMs_).mergeFrom(value).buildPartial();
        } else {
            this.nonFirstInitTimeMs_ = value;
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNonFirstInitTimeMs() {
        this.nonFirstInitTimeMs_ = null;
        this.bitField0_ &= -9;
    }

    public static LlmBenchmarkStats parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (LlmBenchmarkStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmBenchmarkStats parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmBenchmarkStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmBenchmarkStats parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (LlmBenchmarkStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmBenchmarkStats parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmBenchmarkStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmBenchmarkStats parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (LlmBenchmarkStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmBenchmarkStats parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmBenchmarkStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmBenchmarkStats parseFrom(InputStream input) throws IOException {
        return (LlmBenchmarkStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmBenchmarkStats parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmBenchmarkStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static LlmBenchmarkStats parseDelimitedFrom(InputStream input) throws IOException {
        return (LlmBenchmarkStats) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmBenchmarkStats parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmBenchmarkStats) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static LlmBenchmarkStats parseFrom(CodedInputStream input) throws IOException {
        return (LlmBenchmarkStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmBenchmarkStats parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmBenchmarkStats) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(LlmBenchmarkStats prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LlmBenchmarkStats, Builder> implements LlmBenchmarkStatsOrBuilder {
        private Builder() {
            super(LlmBenchmarkStats.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
        public boolean hasPrefillSpeed() {
            return ((LlmBenchmarkStats) this.instance).hasPrefillSpeed();
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
        public ValueSeries getPrefillSpeed() {
            return ((LlmBenchmarkStats) this.instance).getPrefillSpeed();
        }

        public Builder setPrefillSpeed(ValueSeries value) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).setPrefillSpeed(value);
            return this;
        }

        public Builder setPrefillSpeed(ValueSeries.Builder builderForValue) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).setPrefillSpeed(builderForValue.build());
            return this;
        }

        public Builder mergePrefillSpeed(ValueSeries value) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).mergePrefillSpeed(value);
            return this;
        }

        public Builder clearPrefillSpeed() {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).clearPrefillSpeed();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
        public boolean hasDecodeSpeed() {
            return ((LlmBenchmarkStats) this.instance).hasDecodeSpeed();
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
        public ValueSeries getDecodeSpeed() {
            return ((LlmBenchmarkStats) this.instance).getDecodeSpeed();
        }

        public Builder setDecodeSpeed(ValueSeries value) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).setDecodeSpeed(value);
            return this;
        }

        public Builder setDecodeSpeed(ValueSeries.Builder builderForValue) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).setDecodeSpeed(builderForValue.build());
            return this;
        }

        public Builder mergeDecodeSpeed(ValueSeries value) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).mergeDecodeSpeed(value);
            return this;
        }

        public Builder clearDecodeSpeed() {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).clearDecodeSpeed();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
        public boolean hasTimeToFirstToken() {
            return ((LlmBenchmarkStats) this.instance).hasTimeToFirstToken();
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
        public ValueSeries getTimeToFirstToken() {
            return ((LlmBenchmarkStats) this.instance).getTimeToFirstToken();
        }

        public Builder setTimeToFirstToken(ValueSeries value) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).setTimeToFirstToken(value);
            return this;
        }

        public Builder setTimeToFirstToken(ValueSeries.Builder builderForValue) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).setTimeToFirstToken(builderForValue.build());
            return this;
        }

        public Builder mergeTimeToFirstToken(ValueSeries value) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).mergeTimeToFirstToken(value);
            return this;
        }

        public Builder clearTimeToFirstToken() {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).clearTimeToFirstToken();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
        public double getFirstInitTimeMs() {
            return ((LlmBenchmarkStats) this.instance).getFirstInitTimeMs();
        }

        public Builder setFirstInitTimeMs(double value) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).setFirstInitTimeMs(value);
            return this;
        }

        public Builder clearFirstInitTimeMs() {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).clearFirstInitTimeMs();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
        public boolean hasNonFirstInitTimeMs() {
            return ((LlmBenchmarkStats) this.instance).hasNonFirstInitTimeMs();
        }

        @Override // com.google.ai.edge.gallery.proto.LlmBenchmarkStatsOrBuilder
        public ValueSeries getNonFirstInitTimeMs() {
            return ((LlmBenchmarkStats) this.instance).getNonFirstInitTimeMs();
        }

        public Builder setNonFirstInitTimeMs(ValueSeries value) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).setNonFirstInitTimeMs(value);
            return this;
        }

        public Builder setNonFirstInitTimeMs(ValueSeries.Builder builderForValue) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).setNonFirstInitTimeMs(builderForValue.build());
            return this;
        }

        public Builder mergeNonFirstInitTimeMs(ValueSeries value) {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).mergeNonFirstInitTimeMs(value);
            return this;
        }

        public Builder clearNonFirstInitTimeMs() {
            copyOnWrite();
            ((LlmBenchmarkStats) this.instance).clearNonFirstInitTimeMs();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new LlmBenchmarkStats();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "prefillSpeed_", "decodeSpeed_", "timeToFirstToken_", "firstInitTimeMs_", "nonFirstInitTimeMs_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0000\u0005ဉ\u0003", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<LlmBenchmarkStats> parser = PARSER;
                if (parser == null) {
                    synchronized (LlmBenchmarkStats.class) {
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
        LlmBenchmarkStats defaultInstance = new LlmBenchmarkStats();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(LlmBenchmarkStats.class, defaultInstance);
    }

    public static LlmBenchmarkStats getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LlmBenchmarkStats> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
