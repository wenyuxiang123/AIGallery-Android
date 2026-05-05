package com.google.ai.edge.gallery.proto;

import androidx.camera.video.AudioStats;
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


public final class ValueSeries extends GeneratedMessageLite<ValueSeries, Builder> implements ValueSeriesOrBuilder {
    public static final int AVG_FIELD_NUMBER = 4;
    private static final ValueSeries DEFAULT_INSTANCE;
    public static final int MAX_FIELD_NUMBER = 3;
    public static final int MEDIUM_FIELD_NUMBER = 5;
    public static final int MIN_FIELD_NUMBER = 2;
    private static volatile Parser<ValueSeries> PARSER = null;
    public static final int PCT25_FIELD_NUMBER = 7;
    public static final int PCT75_FIELD_NUMBER = 8;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double avg_;
    private double max_;
    private double medium_;
    private double min_;
    private double pct25_;
    private double pct75_;
    private int valueMemoizedSerializedSize = -1;
    private Internal.DoubleList value_ = emptyDoubleList();

    private ValueSeries() {
    }

    @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
    public List<Double> getValueList() {
        return this.value_;
    }

    @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
    public int getValueCount() {
        return this.value_.size();
    }

    @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
    public double getValue(int index) {
        return this.value_.getDouble(index);
    }

    private void ensureValueIsMutable() {
        Internal.DoubleList tmp = this.value_;
        if (!tmp.isModifiable()) {
            this.value_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    
    public void setValue(int index, double value) {
        ensureValueIsMutable();
        this.value_.setDouble(index, value);
    }

    
    public void addValue(double value) {
        ensureValueIsMutable();
        this.value_.addDouble(value);
    }

    
    public void addAllValue(Iterable<? extends Double> values) {
        ensureValueIsMutable();
        AbstractMessageLite.addAll(values, this.value_);
    }

    
    public void clearValue() {
        this.value_ = emptyDoubleList();
    }

    @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
    public double getMin() {
        return this.min_;
    }

    
    public void setMin(double value) {
        this.min_ = value;
    }

    
    public void clearMin() {
        this.min_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
    public double getMax() {
        return this.max_;
    }

    
    public void setMax(double value) {
        this.max_ = value;
    }

    
    public void clearMax() {
        this.max_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
    public double getAvg() {
        return this.avg_;
    }

    
    public void setAvg(double value) {
        this.avg_ = value;
    }

    
    public void clearAvg() {
        this.avg_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
    public double getMedium() {
        return this.medium_;
    }

    
    public void setMedium(double value) {
        this.medium_ = value;
    }

    
    public void clearMedium() {
        this.medium_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
    public double getPct25() {
        return this.pct25_;
    }

    
    public void setPct25(double value) {
        this.pct25_ = value;
    }

    
    public void clearPct25() {
        this.pct25_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
    public double getPct75() {
        return this.pct75_;
    }

    
    public void setPct75(double value) {
        this.pct75_ = value;
    }

    
    public void clearPct75() {
        this.pct75_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static ValueSeries parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (ValueSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ValueSeries parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ValueSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ValueSeries parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (ValueSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ValueSeries parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ValueSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ValueSeries parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (ValueSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ValueSeries parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ValueSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ValueSeries parseFrom(InputStream input) throws IOException {
        return (ValueSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static ValueSeries parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ValueSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ValueSeries parseDelimitedFrom(InputStream input) throws IOException {
        return (ValueSeries) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static ValueSeries parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ValueSeries) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ValueSeries parseFrom(CodedInputStream input) throws IOException {
        return (ValueSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static ValueSeries parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ValueSeries) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ValueSeries prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ValueSeries, Builder> implements ValueSeriesOrBuilder {
        private Builder() {
            super(ValueSeries.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
        public List<Double> getValueList() {
            return Collections.unmodifiableList(((ValueSeries) this.instance).getValueList());
        }

        @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
        public int getValueCount() {
            return ((ValueSeries) this.instance).getValueCount();
        }

        @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
        public double getValue(int index) {
            return ((ValueSeries) this.instance).getValue(index);
        }

        public Builder setValue(int index, double value) {
            copyOnWrite();
            ((ValueSeries) this.instance).setValue(index, value);
            return this;
        }

        public Builder addValue(double value) {
            copyOnWrite();
            ((ValueSeries) this.instance).addValue(value);
            return this;
        }

        public Builder addAllValue(Iterable<? extends Double> values) {
            copyOnWrite();
            ((ValueSeries) this.instance).addAllValue(values);
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((ValueSeries) this.instance).clearValue();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
        public double getMin() {
            return ((ValueSeries) this.instance).getMin();
        }

        public Builder setMin(double value) {
            copyOnWrite();
            ((ValueSeries) this.instance).setMin(value);
            return this;
        }

        public Builder clearMin() {
            copyOnWrite();
            ((ValueSeries) this.instance).clearMin();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
        public double getMax() {
            return ((ValueSeries) this.instance).getMax();
        }

        public Builder setMax(double value) {
            copyOnWrite();
            ((ValueSeries) this.instance).setMax(value);
            return this;
        }

        public Builder clearMax() {
            copyOnWrite();
            ((ValueSeries) this.instance).clearMax();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
        public double getAvg() {
            return ((ValueSeries) this.instance).getAvg();
        }

        public Builder setAvg(double value) {
            copyOnWrite();
            ((ValueSeries) this.instance).setAvg(value);
            return this;
        }

        public Builder clearAvg() {
            copyOnWrite();
            ((ValueSeries) this.instance).clearAvg();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
        public double getMedium() {
            return ((ValueSeries) this.instance).getMedium();
        }

        public Builder setMedium(double value) {
            copyOnWrite();
            ((ValueSeries) this.instance).setMedium(value);
            return this;
        }

        public Builder clearMedium() {
            copyOnWrite();
            ((ValueSeries) this.instance).clearMedium();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
        public double getPct25() {
            return ((ValueSeries) this.instance).getPct25();
        }

        public Builder setPct25(double value) {
            copyOnWrite();
            ((ValueSeries) this.instance).setPct25(value);
            return this;
        }

        public Builder clearPct25() {
            copyOnWrite();
            ((ValueSeries) this.instance).clearPct25();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.ValueSeriesOrBuilder
        public double getPct75() {
            return ((ValueSeries) this.instance).getPct75();
        }

        public Builder setPct75(double value) {
            copyOnWrite();
            ((ValueSeries) this.instance).setPct75(value);
            return this;
        }

        public Builder clearPct75() {
            copyOnWrite();
            ((ValueSeries) this.instance).clearPct75();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new ValueSeries();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"value_", "min_", "max_", "avg_", "medium_", "pct25_", "pct75_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0001\u0000\u0001#\u0002\u0000\u0003\u0000\u0004\u0000\u0005\u0000\u0007\u0000\b\u0000", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<ValueSeries> parser = PARSER;
                if (parser == null) {
                    synchronized (ValueSeries.class) {
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
        ValueSeries defaultInstance = new ValueSeries();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(ValueSeries.class, defaultInstance);
    }

    public static ValueSeries getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ValueSeries> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
