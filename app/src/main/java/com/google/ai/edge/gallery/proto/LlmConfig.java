package com.google.ai.edge.gallery.proto;

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


public final class LlmConfig extends GeneratedMessageLite<LlmConfig, Builder> implements LlmConfigOrBuilder {
    public static final int COMPATIBLE_ACCELERATORS_FIELD_NUMBER = 1;
    private static final LlmConfig DEFAULT_INSTANCE;
    public static final int DEFAULT_MAX_TOKENS_FIELD_NUMBER = 2;
    public static final int DEFAULT_TEMPERATURE_FIELD_NUMBER = 5;
    public static final int DEFAULT_TOPK_FIELD_NUMBER = 3;
    public static final int DEFAULT_TOPP_FIELD_NUMBER = 4;
    private static volatile Parser<LlmConfig> PARSER = null;
    public static final int SUPPORT_AUDIO_FIELD_NUMBER = 7;
    public static final int SUPPORT_IMAGE_FIELD_NUMBER = 6;
    public static final int SUPPORT_MOBILE_ACTIONS_FIELD_NUMBER = 9;
    public static final int SUPPORT_THINKING_FIELD_NUMBER = 10;
    public static final int SUPPORT_TINY_GARDEN_FIELD_NUMBER = 8;
    private Internal.ProtobufList<String> compatibleAccelerators_ = GeneratedMessageLite.emptyProtobufList();
    private int defaultMaxTokens_;
    private float defaultTemperature_;
    private int defaultTopk_;
    private float defaultTopp_;
    private boolean supportAudio_;
    private boolean supportImage_;
    private boolean supportMobileActions_;
    private boolean supportThinking_;
    private boolean supportTinyGarden_;

    private LlmConfig() {
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public List<String> getCompatibleAcceleratorsList() {
        return this.compatibleAccelerators_;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public int getCompatibleAcceleratorsCount() {
        return this.compatibleAccelerators_.size();
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public String getCompatibleAccelerators(int index) {
        return this.compatibleAccelerators_.get(index);
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public ByteString getCompatibleAcceleratorsBytes(int index) {
        return ByteString.copyFromUtf8(this.compatibleAccelerators_.get(index));
    }

    private void ensureCompatibleAcceleratorsIsMutable() {
        Internal.ProtobufList<String> tmp = this.compatibleAccelerators_;
        if (!tmp.isModifiable()) {
            this.compatibleAccelerators_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    
    public void setCompatibleAccelerators(int index, String value) {
        value.getClass();
        ensureCompatibleAcceleratorsIsMutable();
        this.compatibleAccelerators_.set(index, value);
    }

    
    public void addCompatibleAccelerators(String value) {
        value.getClass();
        ensureCompatibleAcceleratorsIsMutable();
        this.compatibleAccelerators_.add(value);
    }

    
    public void addAllCompatibleAccelerators(Iterable<String> values) {
        ensureCompatibleAcceleratorsIsMutable();
        AbstractMessageLite.addAll(values, this.compatibleAccelerators_);
    }

    
    public void clearCompatibleAccelerators() {
        this.compatibleAccelerators_ = GeneratedMessageLite.emptyProtobufList();
    }

    
    public void addCompatibleAcceleratorsBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        ensureCompatibleAcceleratorsIsMutable();
        this.compatibleAccelerators_.add(value.toStringUtf8());
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public int getDefaultMaxTokens() {
        return this.defaultMaxTokens_;
    }

    
    public void setDefaultMaxTokens(int value) {
        this.defaultMaxTokens_ = value;
    }

    
    public void clearDefaultMaxTokens() {
        this.defaultMaxTokens_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public int getDefaultTopk() {
        return this.defaultTopk_;
    }

    
    public void setDefaultTopk(int value) {
        this.defaultTopk_ = value;
    }

    
    public void clearDefaultTopk() {
        this.defaultTopk_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public float getDefaultTopp() {
        return this.defaultTopp_;
    }

    
    public void setDefaultTopp(float value) {
        this.defaultTopp_ = value;
    }

    
    public void clearDefaultTopp() {
        this.defaultTopp_ = 0.0f;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public float getDefaultTemperature() {
        return this.defaultTemperature_;
    }

    
    public void setDefaultTemperature(float value) {
        this.defaultTemperature_ = value;
    }

    
    public void clearDefaultTemperature() {
        this.defaultTemperature_ = 0.0f;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public boolean getSupportImage() {
        return this.supportImage_;
    }

    
    public void setSupportImage(boolean value) {
        this.supportImage_ = value;
    }

    
    public void clearSupportImage() {
        this.supportImage_ = false;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public boolean getSupportAudio() {
        return this.supportAudio_;
    }

    
    public void setSupportAudio(boolean value) {
        this.supportAudio_ = value;
    }

    
    public void clearSupportAudio() {
        this.supportAudio_ = false;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public boolean getSupportTinyGarden() {
        return this.supportTinyGarden_;
    }

    
    public void setSupportTinyGarden(boolean value) {
        this.supportTinyGarden_ = value;
    }

    
    public void clearSupportTinyGarden() {
        this.supportTinyGarden_ = false;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public boolean getSupportMobileActions() {
        return this.supportMobileActions_;
    }

    
    public void setSupportMobileActions(boolean value) {
        this.supportMobileActions_ = value;
    }

    
    public void clearSupportMobileActions() {
        this.supportMobileActions_ = false;
    }

    @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
    public boolean getSupportThinking() {
        return this.supportThinking_;
    }

    
    public void setSupportThinking(boolean value) {
        this.supportThinking_ = value;
    }

    
    public void clearSupportThinking() {
        this.supportThinking_ = false;
    }

    public static LlmConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (LlmConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (LlmConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (LlmConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static LlmConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (LlmConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static LlmConfig parseFrom(InputStream input) throws IOException {
        return (LlmConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static LlmConfig parseDelimitedFrom(InputStream input) throws IOException {
        return (LlmConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static LlmConfig parseFrom(CodedInputStream input) throws IOException {
        return (LlmConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static LlmConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (LlmConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(LlmConfig prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<LlmConfig, Builder> implements LlmConfigOrBuilder {
        private Builder() {
            super(LlmConfig.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public List<String> getCompatibleAcceleratorsList() {
            return Collections.unmodifiableList(((LlmConfig) this.instance).getCompatibleAcceleratorsList());
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public int getCompatibleAcceleratorsCount() {
            return ((LlmConfig) this.instance).getCompatibleAcceleratorsCount();
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public String getCompatibleAccelerators(int index) {
            return ((LlmConfig) this.instance).getCompatibleAccelerators(index);
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public ByteString getCompatibleAcceleratorsBytes(int index) {
            return ((LlmConfig) this.instance).getCompatibleAcceleratorsBytes(index);
        }

        public Builder setCompatibleAccelerators(int index, String value) {
            copyOnWrite();
            ((LlmConfig) this.instance).setCompatibleAccelerators(index, value);
            return this;
        }

        public Builder addCompatibleAccelerators(String value) {
            copyOnWrite();
            ((LlmConfig) this.instance).addCompatibleAccelerators(value);
            return this;
        }

        public Builder addAllCompatibleAccelerators(Iterable<String> values) {
            copyOnWrite();
            ((LlmConfig) this.instance).addAllCompatibleAccelerators(values);
            return this;
        }

        public Builder clearCompatibleAccelerators() {
            copyOnWrite();
            ((LlmConfig) this.instance).clearCompatibleAccelerators();
            return this;
        }

        public Builder addCompatibleAcceleratorsBytes(ByteString value) {
            copyOnWrite();
            ((LlmConfig) this.instance).addCompatibleAcceleratorsBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public int getDefaultMaxTokens() {
            return ((LlmConfig) this.instance).getDefaultMaxTokens();
        }

        public Builder setDefaultMaxTokens(int value) {
            copyOnWrite();
            ((LlmConfig) this.instance).setDefaultMaxTokens(value);
            return this;
        }

        public Builder clearDefaultMaxTokens() {
            copyOnWrite();
            ((LlmConfig) this.instance).clearDefaultMaxTokens();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public int getDefaultTopk() {
            return ((LlmConfig) this.instance).getDefaultTopk();
        }

        public Builder setDefaultTopk(int value) {
            copyOnWrite();
            ((LlmConfig) this.instance).setDefaultTopk(value);
            return this;
        }

        public Builder clearDefaultTopk() {
            copyOnWrite();
            ((LlmConfig) this.instance).clearDefaultTopk();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public float getDefaultTopp() {
            return ((LlmConfig) this.instance).getDefaultTopp();
        }

        public Builder setDefaultTopp(float value) {
            copyOnWrite();
            ((LlmConfig) this.instance).setDefaultTopp(value);
            return this;
        }

        public Builder clearDefaultTopp() {
            copyOnWrite();
            ((LlmConfig) this.instance).clearDefaultTopp();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public float getDefaultTemperature() {
            return ((LlmConfig) this.instance).getDefaultTemperature();
        }

        public Builder setDefaultTemperature(float value) {
            copyOnWrite();
            ((LlmConfig) this.instance).setDefaultTemperature(value);
            return this;
        }

        public Builder clearDefaultTemperature() {
            copyOnWrite();
            ((LlmConfig) this.instance).clearDefaultTemperature();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public boolean getSupportImage() {
            return ((LlmConfig) this.instance).getSupportImage();
        }

        public Builder setSupportImage(boolean value) {
            copyOnWrite();
            ((LlmConfig) this.instance).setSupportImage(value);
            return this;
        }

        public Builder clearSupportImage() {
            copyOnWrite();
            ((LlmConfig) this.instance).clearSupportImage();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public boolean getSupportAudio() {
            return ((LlmConfig) this.instance).getSupportAudio();
        }

        public Builder setSupportAudio(boolean value) {
            copyOnWrite();
            ((LlmConfig) this.instance).setSupportAudio(value);
            return this;
        }

        public Builder clearSupportAudio() {
            copyOnWrite();
            ((LlmConfig) this.instance).clearSupportAudio();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public boolean getSupportTinyGarden() {
            return ((LlmConfig) this.instance).getSupportTinyGarden();
        }

        public Builder setSupportTinyGarden(boolean value) {
            copyOnWrite();
            ((LlmConfig) this.instance).setSupportTinyGarden(value);
            return this;
        }

        public Builder clearSupportTinyGarden() {
            copyOnWrite();
            ((LlmConfig) this.instance).clearSupportTinyGarden();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public boolean getSupportMobileActions() {
            return ((LlmConfig) this.instance).getSupportMobileActions();
        }

        public Builder setSupportMobileActions(boolean value) {
            copyOnWrite();
            ((LlmConfig) this.instance).setSupportMobileActions(value);
            return this;
        }

        public Builder clearSupportMobileActions() {
            copyOnWrite();
            ((LlmConfig) this.instance).clearSupportMobileActions();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.LlmConfigOrBuilder
        public boolean getSupportThinking() {
            return ((LlmConfig) this.instance).getSupportThinking();
        }

        public Builder setSupportThinking(boolean value) {
            copyOnWrite();
            ((LlmConfig) this.instance).setSupportThinking(value);
            return this;
        }

        public Builder clearSupportThinking() {
            copyOnWrite();
            ((LlmConfig) this.instance).clearSupportThinking();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new LlmConfig();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"compatibleAccelerators_", "defaultMaxTokens_", "defaultTopk_", "defaultTopp_", "defaultTemperature_", "supportImage_", "supportAudio_", "supportTinyGarden_", "supportMobileActions_", "supportThinking_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001Ț\u0002\u0004\u0003\u0004\u0004\u0001\u0005\u0001\u0006\u0007\u0007\u0007\b\u0007\t\u0007\n\u0007", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<LlmConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (LlmConfig.class) {
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
        LlmConfig defaultInstance = new LlmConfig();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(LlmConfig.class, defaultInstance);
    }

    public static LlmConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LlmConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
