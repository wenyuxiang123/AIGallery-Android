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


public final class Skill extends GeneratedMessageLite<Skill, Builder> implements SkillOrBuilder {
    public static final int BUILT_IN_FIELD_NUMBER = 4;
    private static final Skill DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int HOMEPAGE_FIELD_NUMBER = 9;
    public static final int IMPORT_DIR_NAME_FIELD_NUMBER = 6;
    public static final int INSTRUCTIONS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Skill> PARSER = null;
    public static final int REQUIRE_SECRET_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int REQUIRE_SECRET_FIELD_NUMBER = 8;
    public static final int SELECTED_FIELD_NUMBER = 7;
    public static final int SKILL_URL_FIELD_NUMBER = 5;
    private boolean builtIn_;
    private boolean requireSecret_;
    private boolean selected_;
    private String name_ = "";
    private String description_ = "";
    private String instructions_ = "";
    private String skillUrl_ = "";
    private String importDirName_ = "";
    private String requireSecretDescription_ = "";
    private String homepage_ = "";

    private Skill() {
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    
    public void setName(String value) {
        value.getClass();
        this.name_ = value;
    }

    
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    
    public void setNameBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    
    public void setDescription(String value) {
        value.getClass();
        this.description_ = value;
    }

    
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    
    public void setDescriptionBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.description_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public String getInstructions() {
        return this.instructions_;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public ByteString getInstructionsBytes() {
        return ByteString.copyFromUtf8(this.instructions_);
    }

    
    public void setInstructions(String value) {
        value.getClass();
        this.instructions_ = value;
    }

    
    public void clearInstructions() {
        this.instructions_ = getDefaultInstance().getInstructions();
    }

    
    public void setInstructionsBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.instructions_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public boolean getBuiltIn() {
        return this.builtIn_;
    }

    
    public void setBuiltIn(boolean value) {
        this.builtIn_ = value;
    }

    
    public void clearBuiltIn() {
        this.builtIn_ = false;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public String getSkillUrl() {
        return this.skillUrl_;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public ByteString getSkillUrlBytes() {
        return ByteString.copyFromUtf8(this.skillUrl_);
    }

    
    public void setSkillUrl(String value) {
        value.getClass();
        this.skillUrl_ = value;
    }

    
    public void clearSkillUrl() {
        this.skillUrl_ = getDefaultInstance().getSkillUrl();
    }

    
    public void setSkillUrlBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.skillUrl_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public String getImportDirName() {
        return this.importDirName_;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public ByteString getImportDirNameBytes() {
        return ByteString.copyFromUtf8(this.importDirName_);
    }

    
    public void setImportDirName(String value) {
        value.getClass();
        this.importDirName_ = value;
    }

    
    public void clearImportDirName() {
        this.importDirName_ = getDefaultInstance().getImportDirName();
    }

    
    public void setImportDirNameBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.importDirName_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public boolean getSelected() {
        return this.selected_;
    }

    
    public void setSelected(boolean value) {
        this.selected_ = value;
    }

    
    public void clearSelected() {
        this.selected_ = false;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public boolean getRequireSecret() {
        return this.requireSecret_;
    }

    
    public void setRequireSecret(boolean value) {
        this.requireSecret_ = value;
    }

    
    public void clearRequireSecret() {
        this.requireSecret_ = false;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public String getRequireSecretDescription() {
        return this.requireSecretDescription_;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public ByteString getRequireSecretDescriptionBytes() {
        return ByteString.copyFromUtf8(this.requireSecretDescription_);
    }

    
    public void setRequireSecretDescription(String value) {
        value.getClass();
        this.requireSecretDescription_ = value;
    }

    
    public void clearRequireSecretDescription() {
        this.requireSecretDescription_ = getDefaultInstance().getRequireSecretDescription();
    }

    
    public void setRequireSecretDescriptionBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.requireSecretDescription_ = value.toStringUtf8();
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public String getHomepage() {
        return this.homepage_;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
    public ByteString getHomepageBytes() {
        return ByteString.copyFromUtf8(this.homepage_);
    }

    
    public void setHomepage(String value) {
        value.getClass();
        this.homepage_ = value;
    }

    
    public void clearHomepage() {
        this.homepage_ = getDefaultInstance().getHomepage();
    }

    
    public void setHomepageBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.homepage_ = value.toStringUtf8();
    }

    public static Skill parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Skill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Skill parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Skill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Skill parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Skill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Skill parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Skill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Skill parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Skill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Skill parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Skill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Skill parseFrom(InputStream input) throws IOException {
        return (Skill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Skill parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Skill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Skill parseDelimitedFrom(InputStream input) throws IOException {
        return (Skill) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Skill parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Skill) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Skill parseFrom(CodedInputStream input) throws IOException {
        return (Skill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Skill parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Skill) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Skill prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Skill, Builder> implements SkillOrBuilder {
        private Builder() {
            super(Skill.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public String getName() {
            return ((Skill) this.instance).getName();
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public ByteString getNameBytes() {
            return ((Skill) this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            copyOnWrite();
            ((Skill) this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Skill) this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            copyOnWrite();
            ((Skill) this.instance).setNameBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public String getDescription() {
            return ((Skill) this.instance).getDescription();
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public ByteString getDescriptionBytes() {
            return ((Skill) this.instance).getDescriptionBytes();
        }

        public Builder setDescription(String value) {
            copyOnWrite();
            ((Skill) this.instance).setDescription(value);
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((Skill) this.instance).clearDescription();
            return this;
        }

        public Builder setDescriptionBytes(ByteString value) {
            copyOnWrite();
            ((Skill) this.instance).setDescriptionBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public String getInstructions() {
            return ((Skill) this.instance).getInstructions();
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public ByteString getInstructionsBytes() {
            return ((Skill) this.instance).getInstructionsBytes();
        }

        public Builder setInstructions(String value) {
            copyOnWrite();
            ((Skill) this.instance).setInstructions(value);
            return this;
        }

        public Builder clearInstructions() {
            copyOnWrite();
            ((Skill) this.instance).clearInstructions();
            return this;
        }

        public Builder setInstructionsBytes(ByteString value) {
            copyOnWrite();
            ((Skill) this.instance).setInstructionsBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public boolean getBuiltIn() {
            return ((Skill) this.instance).getBuiltIn();
        }

        public Builder setBuiltIn(boolean value) {
            copyOnWrite();
            ((Skill) this.instance).setBuiltIn(value);
            return this;
        }

        public Builder clearBuiltIn() {
            copyOnWrite();
            ((Skill) this.instance).clearBuiltIn();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public String getSkillUrl() {
            return ((Skill) this.instance).getSkillUrl();
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public ByteString getSkillUrlBytes() {
            return ((Skill) this.instance).getSkillUrlBytes();
        }

        public Builder setSkillUrl(String value) {
            copyOnWrite();
            ((Skill) this.instance).setSkillUrl(value);
            return this;
        }

        public Builder clearSkillUrl() {
            copyOnWrite();
            ((Skill) this.instance).clearSkillUrl();
            return this;
        }

        public Builder setSkillUrlBytes(ByteString value) {
            copyOnWrite();
            ((Skill) this.instance).setSkillUrlBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public String getImportDirName() {
            return ((Skill) this.instance).getImportDirName();
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public ByteString getImportDirNameBytes() {
            return ((Skill) this.instance).getImportDirNameBytes();
        }

        public Builder setImportDirName(String value) {
            copyOnWrite();
            ((Skill) this.instance).setImportDirName(value);
            return this;
        }

        public Builder clearImportDirName() {
            copyOnWrite();
            ((Skill) this.instance).clearImportDirName();
            return this;
        }

        public Builder setImportDirNameBytes(ByteString value) {
            copyOnWrite();
            ((Skill) this.instance).setImportDirNameBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public boolean getSelected() {
            return ((Skill) this.instance).getSelected();
        }

        public Builder setSelected(boolean value) {
            copyOnWrite();
            ((Skill) this.instance).setSelected(value);
            return this;
        }

        public Builder clearSelected() {
            copyOnWrite();
            ((Skill) this.instance).clearSelected();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public boolean getRequireSecret() {
            return ((Skill) this.instance).getRequireSecret();
        }

        public Builder setRequireSecret(boolean value) {
            copyOnWrite();
            ((Skill) this.instance).setRequireSecret(value);
            return this;
        }

        public Builder clearRequireSecret() {
            copyOnWrite();
            ((Skill) this.instance).clearRequireSecret();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public String getRequireSecretDescription() {
            return ((Skill) this.instance).getRequireSecretDescription();
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public ByteString getRequireSecretDescriptionBytes() {
            return ((Skill) this.instance).getRequireSecretDescriptionBytes();
        }

        public Builder setRequireSecretDescription(String value) {
            copyOnWrite();
            ((Skill) this.instance).setRequireSecretDescription(value);
            return this;
        }

        public Builder clearRequireSecretDescription() {
            copyOnWrite();
            ((Skill) this.instance).clearRequireSecretDescription();
            return this;
        }

        public Builder setRequireSecretDescriptionBytes(ByteString value) {
            copyOnWrite();
            ((Skill) this.instance).setRequireSecretDescriptionBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public String getHomepage() {
            return ((Skill) this.instance).getHomepage();
        }

        @Override // com.google.ai.edge.gallery.proto.SkillOrBuilder
        public ByteString getHomepageBytes() {
            return ((Skill) this.instance).getHomepageBytes();
        }

        public Builder setHomepage(String value) {
            copyOnWrite();
            ((Skill) this.instance).setHomepage(value);
            return this;
        }

        public Builder clearHomepage() {
            copyOnWrite();
            ((Skill) this.instance).clearHomepage();
            return this;
        }

        public Builder setHomepageBytes(ByteString value) {
            copyOnWrite();
            ((Skill) this.instance).setHomepageBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new Skill();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"name_", "description_", "instructions_", "builtIn_", "skillUrl_", "importDirName_", "selected_", "requireSecret_", "homepage_", "requireSecretDescription_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005Ȉ\u0006Ȉ\u0007\u0007\b\u0007\tȈ\nȈ", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Skill> parser = PARSER;
                if (parser == null) {
                    synchronized (Skill.class) {
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
        Skill defaultInstance = new Skill();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(Skill.class, defaultInstance);
    }

    public static Skill getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Skill> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
