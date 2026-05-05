package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.Point;
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
public final class StrokePath extends GeneratedMessageLite<StrokePath, Builder> implements StrokePathOrBuilder {
    public static final int BLUR_TYPE_FIELD_NUMBER = 5;
    public static final int BRUSH_COLOR_FIELD_NUMBER = 2;
    public static final int BRUSH_SIZE_FIELD_NUMBER = 3;
    public static final int BRUSH_SOFTNESS_FIELD_NUMBER = 4;
    private static final StrokePath DEFAULT_INSTANCE;
    private static volatile Parser<StrokePath> PARSER = null;
    public static final int POINT_FIELD_NUMBER = 1;
    private int blurType_;
    private int brushColor_;
    private float brushSize_;
    private float brushSoftness_;
    private Internal.ProtobufList<Point> point_ = emptyProtobufList();

    private StrokePath() {
    }

    @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
    public List<Point> getPointList() {
        return this.point_;
    }

    public List<? extends PointOrBuilder> getPointOrBuilderList() {
        return this.point_;
    }

    @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
    public int getPointCount() {
        return this.point_.size();
    }

    @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
    public Point getPoint(int index) {
        return this.point_.get(index);
    }

    public PointOrBuilder getPointOrBuilder(int index) {
        return this.point_.get(index);
    }

    private void ensurePointIsMutable() {
        Internal.ProtobufList<Point> tmp = this.point_;
        if (!tmp.isModifiable()) {
            this.point_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoint(int index, Point value) {
        value.getClass();
        ensurePointIsMutable();
        this.point_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoint(Point value) {
        value.getClass();
        ensurePointIsMutable();
        this.point_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoint(int index, Point value) {
        value.getClass();
        ensurePointIsMutable();
        this.point_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPoint(Iterable<? extends Point> values) {
        ensurePointIsMutable();
        AbstractMessageLite.addAll(values, this.point_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoint() {
        this.point_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePoint(int index) {
        ensurePointIsMutable();
        this.point_.remove(index);
    }

    @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
    public int getBrushColor() {
        return this.brushColor_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrushColor(int value) {
        this.brushColor_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrushColor() {
        this.brushColor_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
    public float getBrushSize() {
        return this.brushSize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrushSize(float value) {
        this.brushSize_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrushSize() {
        this.brushSize_ = 0.0f;
    }

    @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
    public float getBrushSoftness() {
        return this.brushSoftness_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrushSoftness(float value) {
        this.brushSoftness_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrushSoftness() {
        this.brushSoftness_ = 0.0f;
    }

    @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
    public int getBlurType() {
        return this.blurType_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlurType(int value) {
        this.blurType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBlurType() {
        this.blurType_ = 0;
    }

    public static StrokePath parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (StrokePath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static StrokePath parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (StrokePath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static StrokePath parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (StrokePath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static StrokePath parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (StrokePath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static StrokePath parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (StrokePath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static StrokePath parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (StrokePath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static StrokePath parseFrom(InputStream input) throws IOException {
        return (StrokePath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static StrokePath parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (StrokePath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static StrokePath parseDelimitedFrom(InputStream input) throws IOException {
        return (StrokePath) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static StrokePath parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (StrokePath) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static StrokePath parseFrom(CodedInputStream input) throws IOException {
        return (StrokePath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static StrokePath parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (StrokePath) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(StrokePath prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<StrokePath, Builder> implements StrokePathOrBuilder {
        private Builder() {
            super(StrokePath.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
        public List<Point> getPointList() {
            return Collections.unmodifiableList(((StrokePath) this.instance).getPointList());
        }

        @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
        public int getPointCount() {
            return ((StrokePath) this.instance).getPointCount();
        }

        @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
        public Point getPoint(int index) {
            return ((StrokePath) this.instance).getPoint(index);
        }

        public Builder setPoint(int index, Point value) {
            copyOnWrite();
            ((StrokePath) this.instance).setPoint(index, value);
            return this;
        }

        public Builder setPoint(int index, Point.Builder builderForValue) {
            copyOnWrite();
            ((StrokePath) this.instance).setPoint(index, builderForValue.build());
            return this;
        }

        public Builder addPoint(Point value) {
            copyOnWrite();
            ((StrokePath) this.instance).addPoint(value);
            return this;
        }

        public Builder addPoint(int index, Point value) {
            copyOnWrite();
            ((StrokePath) this.instance).addPoint(index, value);
            return this;
        }

        public Builder addPoint(Point.Builder builderForValue) {
            copyOnWrite();
            ((StrokePath) this.instance).addPoint(builderForValue.build());
            return this;
        }

        public Builder addPoint(int index, Point.Builder builderForValue) {
            copyOnWrite();
            ((StrokePath) this.instance).addPoint(index, builderForValue.build());
            return this;
        }

        public Builder addAllPoint(Iterable<? extends Point> values) {
            copyOnWrite();
            ((StrokePath) this.instance).addAllPoint(values);
            return this;
        }

        public Builder clearPoint() {
            copyOnWrite();
            ((StrokePath) this.instance).clearPoint();
            return this;
        }

        public Builder removePoint(int index) {
            copyOnWrite();
            ((StrokePath) this.instance).removePoint(index);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
        public int getBrushColor() {
            return ((StrokePath) this.instance).getBrushColor();
        }

        public Builder setBrushColor(int value) {
            copyOnWrite();
            ((StrokePath) this.instance).setBrushColor(value);
            return this;
        }

        public Builder clearBrushColor() {
            copyOnWrite();
            ((StrokePath) this.instance).clearBrushColor();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
        public float getBrushSize() {
            return ((StrokePath) this.instance).getBrushSize();
        }

        public Builder setBrushSize(float value) {
            copyOnWrite();
            ((StrokePath) this.instance).setBrushSize(value);
            return this;
        }

        public Builder clearBrushSize() {
            copyOnWrite();
            ((StrokePath) this.instance).clearBrushSize();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
        public float getBrushSoftness() {
            return ((StrokePath) this.instance).getBrushSoftness();
        }

        public Builder setBrushSoftness(float value) {
            copyOnWrite();
            ((StrokePath) this.instance).setBrushSoftness(value);
            return this;
        }

        public Builder clearBrushSoftness() {
            copyOnWrite();
            ((StrokePath) this.instance).clearBrushSoftness();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.StrokePathOrBuilder
        public int getBlurType() {
            return ((StrokePath) this.instance).getBlurType();
        }

        public Builder setBlurType(int value) {
            copyOnWrite();
            ((StrokePath) this.instance).setBlurType(value);
            return this;
        }

        public Builder clearBlurType() {
            copyOnWrite();
            ((StrokePath) this.instance).clearBlurType();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new StrokePath();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"point_", Point.class, "brushColor_", "brushSize_", "brushSoftness_", "blurType_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0003\u0001\u0004\u0001\u0005\u0004", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<StrokePath> parser = PARSER;
                if (parser == null) {
                    synchronized (StrokePath.class) {
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
        StrokePath defaultInstance = new StrokePath();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(StrokePath.class, defaultInstance);
    }

    public static StrokePath getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<StrokePath> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
