package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.StrokePath;
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
public final class Cutout extends GeneratedMessageLite<Cutout, Builder> implements CutoutOrBuilder {
    public static final int BORDER_COLOR_FIELD_NUMBER = 4;
    public static final int BORDER_WIDTH_FIELD_NUMBER = 3;
    private static final Cutout DEFAULT_INSTANCE;
    public static final int DOODLE_STROKE_FIELD_NUMBER = 7;
    public static final int FILL_COLOR_FIELD_NUMBER = 5;
    public static final int FILL_MODE_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Cutout> PARSER = null;
    public static final int ROTATION_DEGREE_FIELD_NUMBER = 2;
    private int borderColor_;
    private int borderWidth_;
    private int fillColor_;
    private int fillMode_;
    private int rotationDegree_;
    private String id_ = "";
    private Internal.ProtobufList<StrokePath> doodleStroke_ = emptyProtobufList();

    private Cutout() {
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String value) {
        value.getClass();
        this.id_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.id_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public int getRotationDegree() {
        return this.rotationDegree_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRotationDegree(int value) {
        this.rotationDegree_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRotationDegree() {
        this.rotationDegree_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public int getBorderWidth() {
        return this.borderWidth_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderWidth(int value) {
        this.borderWidth_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderWidth() {
        this.borderWidth_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public int getBorderColor() {
        return this.borderColor_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorderColor(int value) {
        this.borderColor_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorderColor() {
        this.borderColor_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public int getFillColor() {
        return this.fillColor_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFillColor(int value) {
        this.fillColor_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFillColor() {
        this.fillColor_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public int getFillModeValue() {
        return this.fillMode_;
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public FillMode getFillMode() {
        FillMode result = FillMode.forNumber(this.fillMode_);
        return result == null ? FillMode.UNRECOGNIZED : result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFillModeValue(int value) {
        this.fillMode_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFillMode(FillMode value) {
        this.fillMode_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFillMode() {
        this.fillMode_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public List<StrokePath> getDoodleStrokeList() {
        return this.doodleStroke_;
    }

    public List<? extends StrokePathOrBuilder> getDoodleStrokeOrBuilderList() {
        return this.doodleStroke_;
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public int getDoodleStrokeCount() {
        return this.doodleStroke_.size();
    }

    @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
    public StrokePath getDoodleStroke(int index) {
        return this.doodleStroke_.get(index);
    }

    public StrokePathOrBuilder getDoodleStrokeOrBuilder(int index) {
        return this.doodleStroke_.get(index);
    }

    private void ensureDoodleStrokeIsMutable() {
        Internal.ProtobufList<StrokePath> tmp = this.doodleStroke_;
        if (!tmp.isModifiable()) {
            this.doodleStroke_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoodleStroke(int index, StrokePath value) {
        value.getClass();
        ensureDoodleStrokeIsMutable();
        this.doodleStroke_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDoodleStroke(StrokePath value) {
        value.getClass();
        ensureDoodleStrokeIsMutable();
        this.doodleStroke_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDoodleStroke(int index, StrokePath value) {
        value.getClass();
        ensureDoodleStrokeIsMutable();
        this.doodleStroke_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDoodleStroke(Iterable<? extends StrokePath> values) {
        ensureDoodleStrokeIsMutable();
        AbstractMessageLite.addAll(values, this.doodleStroke_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoodleStroke() {
        this.doodleStroke_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDoodleStroke(int index) {
        ensureDoodleStrokeIsMutable();
        this.doodleStroke_.remove(index);
    }

    public static Cutout parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Cutout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Cutout parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Cutout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Cutout parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Cutout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Cutout parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Cutout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Cutout parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Cutout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Cutout parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Cutout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Cutout parseFrom(InputStream input) throws IOException {
        return (Cutout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Cutout parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Cutout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Cutout parseDelimitedFrom(InputStream input) throws IOException {
        return (Cutout) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Cutout parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Cutout) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Cutout parseFrom(CodedInputStream input) throws IOException {
        return (Cutout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Cutout parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Cutout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Cutout prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Cutout, Builder> implements CutoutOrBuilder {
        private Builder() {
            super(Cutout.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public String getId() {
            return ((Cutout) this.instance).getId();
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public ByteString getIdBytes() {
            return ((Cutout) this.instance).getIdBytes();
        }

        public Builder setId(String value) {
            copyOnWrite();
            ((Cutout) this.instance).setId(value);
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Cutout) this.instance).clearId();
            return this;
        }

        public Builder setIdBytes(ByteString value) {
            copyOnWrite();
            ((Cutout) this.instance).setIdBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public int getRotationDegree() {
            return ((Cutout) this.instance).getRotationDegree();
        }

        public Builder setRotationDegree(int value) {
            copyOnWrite();
            ((Cutout) this.instance).setRotationDegree(value);
            return this;
        }

        public Builder clearRotationDegree() {
            copyOnWrite();
            ((Cutout) this.instance).clearRotationDegree();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public int getBorderWidth() {
            return ((Cutout) this.instance).getBorderWidth();
        }

        public Builder setBorderWidth(int value) {
            copyOnWrite();
            ((Cutout) this.instance).setBorderWidth(value);
            return this;
        }

        public Builder clearBorderWidth() {
            copyOnWrite();
            ((Cutout) this.instance).clearBorderWidth();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public int getBorderColor() {
            return ((Cutout) this.instance).getBorderColor();
        }

        public Builder setBorderColor(int value) {
            copyOnWrite();
            ((Cutout) this.instance).setBorderColor(value);
            return this;
        }

        public Builder clearBorderColor() {
            copyOnWrite();
            ((Cutout) this.instance).clearBorderColor();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public int getFillColor() {
            return ((Cutout) this.instance).getFillColor();
        }

        public Builder setFillColor(int value) {
            copyOnWrite();
            ((Cutout) this.instance).setFillColor(value);
            return this;
        }

        public Builder clearFillColor() {
            copyOnWrite();
            ((Cutout) this.instance).clearFillColor();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public int getFillModeValue() {
            return ((Cutout) this.instance).getFillModeValue();
        }

        public Builder setFillModeValue(int value) {
            copyOnWrite();
            ((Cutout) this.instance).setFillModeValue(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public FillMode getFillMode() {
            return ((Cutout) this.instance).getFillMode();
        }

        public Builder setFillMode(FillMode value) {
            copyOnWrite();
            ((Cutout) this.instance).setFillMode(value);
            return this;
        }

        public Builder clearFillMode() {
            copyOnWrite();
            ((Cutout) this.instance).clearFillMode();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public List<StrokePath> getDoodleStrokeList() {
            return Collections.unmodifiableList(((Cutout) this.instance).getDoodleStrokeList());
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public int getDoodleStrokeCount() {
            return ((Cutout) this.instance).getDoodleStrokeCount();
        }

        @Override // com.google.ai.edge.gallery.proto.CutoutOrBuilder
        public StrokePath getDoodleStroke(int index) {
            return ((Cutout) this.instance).getDoodleStroke(index);
        }

        public Builder setDoodleStroke(int index, StrokePath value) {
            copyOnWrite();
            ((Cutout) this.instance).setDoodleStroke(index, value);
            return this;
        }

        public Builder setDoodleStroke(int index, StrokePath.Builder builderForValue) {
            copyOnWrite();
            ((Cutout) this.instance).setDoodleStroke(index, builderForValue.build());
            return this;
        }

        public Builder addDoodleStroke(StrokePath value) {
            copyOnWrite();
            ((Cutout) this.instance).addDoodleStroke(value);
            return this;
        }

        public Builder addDoodleStroke(int index, StrokePath value) {
            copyOnWrite();
            ((Cutout) this.instance).addDoodleStroke(index, value);
            return this;
        }

        public Builder addDoodleStroke(StrokePath.Builder builderForValue) {
            copyOnWrite();
            ((Cutout) this.instance).addDoodleStroke(builderForValue.build());
            return this;
        }

        public Builder addDoodleStroke(int index, StrokePath.Builder builderForValue) {
            copyOnWrite();
            ((Cutout) this.instance).addDoodleStroke(index, builderForValue.build());
            return this;
        }

        public Builder addAllDoodleStroke(Iterable<? extends StrokePath> values) {
            copyOnWrite();
            ((Cutout) this.instance).addAllDoodleStroke(values);
            return this;
        }

        public Builder clearDoodleStroke() {
            copyOnWrite();
            ((Cutout) this.instance).clearDoodleStroke();
            return this;
        }

        public Builder removeDoodleStroke(int index) {
            copyOnWrite();
            ((Cutout) this.instance).removeDoodleStroke(index);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new Cutout();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"id_", "rotationDegree_", "borderWidth_", "borderColor_", "fillColor_", "fillMode_", "doodleStroke_", StrokePath.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\f\u0007\u001b", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Cutout> parser = PARSER;
                if (parser == null) {
                    synchronized (Cutout.class) {
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
        Cutout defaultInstance = new Cutout();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(Cutout.class, defaultInstance);
    }

    public static Cutout getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Cutout> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
