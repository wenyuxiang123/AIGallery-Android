package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.Skill;
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


public final class Skills extends GeneratedMessageLite<Skills, Builder> implements SkillsOrBuilder {
    private static final Skills DEFAULT_INSTANCE;
    private static volatile Parser<Skills> PARSER = null;
    public static final int SKILL_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Skill> skill_ = emptyProtobufList();

    private Skills() {
    }

    @Override // com.google.ai.edge.gallery.proto.SkillsOrBuilder
    public List<Skill> getSkillList() {
        return this.skill_;
    }

    public List<? extends SkillOrBuilder> getSkillOrBuilderList() {
        return this.skill_;
    }

    @Override // com.google.ai.edge.gallery.proto.SkillsOrBuilder
    public int getSkillCount() {
        return this.skill_.size();
    }

    @Override // com.google.ai.edge.gallery.proto.SkillsOrBuilder
    public Skill getSkill(int index) {
        return this.skill_.get(index);
    }

    public SkillOrBuilder getSkillOrBuilder(int index) {
        return this.skill_.get(index);
    }

    private void ensureSkillIsMutable() {
        Internal.ProtobufList<Skill> tmp = this.skill_;
        if (!tmp.isModifiable()) {
            this.skill_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    
    public void setSkill(int index, Skill value) {
        value.getClass();
        ensureSkillIsMutable();
        this.skill_.set(index, value);
    }

    
    public void addSkill(Skill value) {
        value.getClass();
        ensureSkillIsMutable();
        this.skill_.add(value);
    }

    
    public void addSkill(int index, Skill value) {
        value.getClass();
        ensureSkillIsMutable();
        this.skill_.add(index, value);
    }

    
    public void addAllSkill(Iterable<? extends Skill> values) {
        ensureSkillIsMutable();
        AbstractMessageLite.addAll(values, this.skill_);
    }

    
    public void clearSkill() {
        this.skill_ = emptyProtobufList();
    }

    
    public void removeSkill(int index) {
        ensureSkillIsMutable();
        this.skill_.remove(index);
    }

    public static Skills parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Skills) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Skills parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Skills) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Skills parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Skills) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Skills parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Skills) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Skills parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Skills) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Skills parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Skills) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Skills parseFrom(InputStream input) throws IOException {
        return (Skills) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Skills parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Skills) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Skills parseDelimitedFrom(InputStream input) throws IOException {
        return (Skills) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Skills parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Skills) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Skills parseFrom(CodedInputStream input) throws IOException {
        return (Skills) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Skills parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Skills) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Skills prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Skills, Builder> implements SkillsOrBuilder {
        private Builder() {
            super(Skills.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.SkillsOrBuilder
        public List<Skill> getSkillList() {
            return Collections.unmodifiableList(((Skills) this.instance).getSkillList());
        }

        @Override // com.google.ai.edge.gallery.proto.SkillsOrBuilder
        public int getSkillCount() {
            return ((Skills) this.instance).getSkillCount();
        }

        @Override // com.google.ai.edge.gallery.proto.SkillsOrBuilder
        public Skill getSkill(int index) {
            return ((Skills) this.instance).getSkill(index);
        }

        public Builder setSkill(int index, Skill value) {
            copyOnWrite();
            ((Skills) this.instance).setSkill(index, value);
            return this;
        }

        public Builder setSkill(int index, Skill.Builder builderForValue) {
            copyOnWrite();
            ((Skills) this.instance).setSkill(index, builderForValue.build());
            return this;
        }

        public Builder addSkill(Skill value) {
            copyOnWrite();
            ((Skills) this.instance).addSkill(value);
            return this;
        }

        public Builder addSkill(int index, Skill value) {
            copyOnWrite();
            ((Skills) this.instance).addSkill(index, value);
            return this;
        }

        public Builder addSkill(Skill.Builder builderForValue) {
            copyOnWrite();
            ((Skills) this.instance).addSkill(builderForValue.build());
            return this;
        }

        public Builder addSkill(int index, Skill.Builder builderForValue) {
            copyOnWrite();
            ((Skills) this.instance).addSkill(index, builderForValue.build());
            return this;
        }

        public Builder addAllSkill(Iterable<? extends Skill> values) {
            copyOnWrite();
            ((Skills) this.instance).addAllSkill(values);
            return this;
        }

        public Builder clearSkill() {
            copyOnWrite();
            ((Skills) this.instance).clearSkill();
            return this;
        }

        public Builder removeSkill(int index) {
            copyOnWrite();
            ((Skills) this.instance).removeSkill(index);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new Skills();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"skill_", Skill.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Skills> parser = PARSER;
                if (parser == null) {
                    synchronized (Skills.class) {
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
        Skills defaultInstance = new Skills();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(Skills.class, defaultInstance);
    }

    public static Skills getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Skills> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
