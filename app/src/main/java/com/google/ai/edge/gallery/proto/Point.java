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

/* JADX INFO: loaded from: classes5.dex */
public final class Point extends GeneratedMessageLite<Point, Builder> implements PointOrBuilder {
    private static final Point DEFAULT_INSTANCE;
    private static volatile Parser<Point> PARSER = null;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;

    /* JADX INFO: renamed from: x_ */
    private float f287x_;

    /* JADX INFO: renamed from: y_ */
    private float f288y_;

    private Point() {
    }

    @Override // com.google.ai.edge.gallery.proto.PointOrBuilder
    public float getX() {
        return this.f287x_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(float value) {
        this.f287x_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.f287x_ = 0.0f;
    }

    @Override // com.google.ai.edge.gallery.proto.PointOrBuilder
    public float getY() {
        return this.f288y_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(float value) {
        this.f288y_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.f288y_ = 0.0f;
    }

    public static Point parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Point parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Point parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Point parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Point parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Point parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Point parseFrom(InputStream input) throws IOException {
        return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Point parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Point parseDelimitedFrom(InputStream input) throws IOException {
        return (Point) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Point parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Point) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Point parseFrom(CodedInputStream input) throws IOException {
        return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Point parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Point) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Point prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Point, Builder> implements PointOrBuilder {
        private Builder() {
            super(Point.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.PointOrBuilder
        public float getX() {
            return ((Point) this.instance).getX();
        }

        public Builder setX(float value) {
            copyOnWrite();
            ((Point) this.instance).setX(value);
            return this;
        }

        public Builder clearX() {
            copyOnWrite();
            ((Point) this.instance).clearX();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.PointOrBuilder
        public float getY() {
            return ((Point) this.instance).getY();
        }

        public Builder setY(float value) {
            copyOnWrite();
            ((Point) this.instance).setY(value);
            return this;
        }

        public Builder clearY() {
            copyOnWrite();
            ((Point) this.instance).clearY();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new Point();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"x_", "y_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Point> parser = PARSER;
                if (parser == null) {
                    synchronized (Point.class) {
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
        Point defaultInstance = new Point();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(Point.class, defaultInstance);
    }

    public static Point getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Point> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
