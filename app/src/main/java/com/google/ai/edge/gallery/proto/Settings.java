package com.google.ai.edge.gallery.proto;

import com.google.ai.edge.gallery.proto.AccessTokenData;
import com.google.ai.edge.gallery.proto.ImportedModel;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public final class Settings extends GeneratedMessageLite<Settings, Builder> implements SettingsOrBuilder {
    public static final int ACCESS_TOKEN_DATA_FIELD_NUMBER = 2;
    private static final Settings DEFAULT_INSTANCE;
    public static final int FEATURE_FLAGS_FIELD_NUMBER = 9;
    public static final int HAS_RUN_TINY_GARDEN_FIELD_NUMBER = 6;
    public static final int HAS_SEEN_BENCHMARK_COMPARISON_HELP_FIELD_NUMBER = 7;
    public static final int IMPORTED_MODEL_FIELD_NUMBER = 4;
    public static final int IS_GEMMA_TERMS_ACCEPTED_FIELD_NUMBER = 8;
    public static final int IS_TOS_ACCEPTED_FIELD_NUMBER = 5;
    private static volatile Parser<Settings> PARSER = null;
    public static final int TEXT_INPUT_HISTORY_FIELD_NUMBER = 3;
    public static final int THEME_FIELD_NUMBER = 1;
    public static final int VIEWED_PROMO_ID_FIELD_NUMBER = 10;
    private AccessTokenData accessTokenData_;
    private int bitField0_;
    private boolean hasRunTinyGarden_;
    private boolean hasSeenBenchmarkComparisonHelp_;
    private boolean isGemmaTermsAccepted_;
    private boolean isTosAccepted_;
    private int theme_;
    private MapFieldLite<String, Boolean> featureFlags_ = MapFieldLite.emptyMapField();
    private Internal.ProtobufList<String> textInputHistory_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ImportedModel> importedModel_ = emptyProtobufList();
    private Internal.ProtobufList<String> viewedPromoId_ = GeneratedMessageLite.emptyProtobufList();

    private Settings() {
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public int getThemeValue() {
        return this.theme_;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public Theme getTheme() {
        Theme result = Theme.forNumber(this.theme_);
        return result == null ? Theme.UNRECOGNIZED : result;
    }

    
    public void setThemeValue(int value) {
        this.theme_ = value;
    }

    
    public void setTheme(Theme value) {
        this.theme_ = value.getNumber();
    }

    
    public void clearTheme() {
        this.theme_ = 0;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public boolean hasAccessTokenData() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public AccessTokenData getAccessTokenData() {
        return this.accessTokenData_ == null ? AccessTokenData.getDefaultInstance() : this.accessTokenData_;
    }

    
    public void setAccessTokenData(AccessTokenData value) {
        value.getClass();
        this.accessTokenData_ = value;
        this.bitField0_ |= 1;
    }

    
    public void mergeAccessTokenData(AccessTokenData value) {
        value.getClass();
        if (this.accessTokenData_ != null && this.accessTokenData_ != AccessTokenData.getDefaultInstance()) {
            this.accessTokenData_ = AccessTokenData.newBuilder(this.accessTokenData_).mergeFrom(value).buildPartial();
        } else {
            this.accessTokenData_ = value;
        }
        this.bitField0_ |= 1;
    }

    
    public void clearAccessTokenData() {
        this.accessTokenData_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public List<String> getTextInputHistoryList() {
        return this.textInputHistory_;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public int getTextInputHistoryCount() {
        return this.textInputHistory_.size();
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public String getTextInputHistory(int index) {
        return this.textInputHistory_.get(index);
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public ByteString getTextInputHistoryBytes(int index) {
        return ByteString.copyFromUtf8(this.textInputHistory_.get(index));
    }

    private void ensureTextInputHistoryIsMutable() {
        Internal.ProtobufList<String> tmp = this.textInputHistory_;
        if (!tmp.isModifiable()) {
            this.textInputHistory_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    
    public void setTextInputHistory(int index, String value) {
        value.getClass();
        ensureTextInputHistoryIsMutable();
        this.textInputHistory_.set(index, value);
    }

    
    public void addTextInputHistory(String value) {
        value.getClass();
        ensureTextInputHistoryIsMutable();
        this.textInputHistory_.add(value);
    }

    
    public void addAllTextInputHistory(Iterable<String> values) {
        ensureTextInputHistoryIsMutable();
        AbstractMessageLite.addAll(values, this.textInputHistory_);
    }

    
    public void clearTextInputHistory() {
        this.textInputHistory_ = GeneratedMessageLite.emptyProtobufList();
    }

    
    public void addTextInputHistoryBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        ensureTextInputHistoryIsMutable();
        this.textInputHistory_.add(value.toStringUtf8());
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public List<ImportedModel> getImportedModelList() {
        return this.importedModel_;
    }

    public List<? extends ImportedModelOrBuilder> getImportedModelOrBuilderList() {
        return this.importedModel_;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public int getImportedModelCount() {
        return this.importedModel_.size();
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public ImportedModel getImportedModel(int index) {
        return this.importedModel_.get(index);
    }

    public ImportedModelOrBuilder getImportedModelOrBuilder(int index) {
        return this.importedModel_.get(index);
    }

    private void ensureImportedModelIsMutable() {
        Internal.ProtobufList<ImportedModel> tmp = this.importedModel_;
        if (!tmp.isModifiable()) {
            this.importedModel_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    
    public void setImportedModel(int index, ImportedModel value) {
        value.getClass();
        ensureImportedModelIsMutable();
        this.importedModel_.set(index, value);
    }

    
    public void addImportedModel(ImportedModel value) {
        value.getClass();
        ensureImportedModelIsMutable();
        this.importedModel_.add(value);
    }

    
    public void addImportedModel(int index, ImportedModel value) {
        value.getClass();
        ensureImportedModelIsMutable();
        this.importedModel_.add(index, value);
    }

    
    public void addAllImportedModel(Iterable<? extends ImportedModel> values) {
        ensureImportedModelIsMutable();
        AbstractMessageLite.addAll(values, this.importedModel_);
    }

    
    public void clearImportedModel() {
        this.importedModel_ = emptyProtobufList();
    }

    
    public void removeImportedModel(int index) {
        ensureImportedModelIsMutable();
        this.importedModel_.remove(index);
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public boolean getIsTosAccepted() {
        return this.isTosAccepted_;
    }

    
    public void setIsTosAccepted(boolean value) {
        this.isTosAccepted_ = value;
    }

    
    public void clearIsTosAccepted() {
        this.isTosAccepted_ = false;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public boolean getHasRunTinyGarden() {
        return this.hasRunTinyGarden_;
    }

    
    public void setHasRunTinyGarden(boolean value) {
        this.hasRunTinyGarden_ = value;
    }

    
    public void clearHasRunTinyGarden() {
        this.hasRunTinyGarden_ = false;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public boolean getHasSeenBenchmarkComparisonHelp() {
        return this.hasSeenBenchmarkComparisonHelp_;
    }

    
    public void setHasSeenBenchmarkComparisonHelp(boolean value) {
        this.hasSeenBenchmarkComparisonHelp_ = value;
    }

    
    public void clearHasSeenBenchmarkComparisonHelp() {
        this.hasSeenBenchmarkComparisonHelp_ = false;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public boolean getIsGemmaTermsAccepted() {
        return this.isGemmaTermsAccepted_;
    }

    
    public void setIsGemmaTermsAccepted(boolean value) {
        this.isGemmaTermsAccepted_ = value;
    }

    
    public void clearIsGemmaTermsAccepted() {
        this.isGemmaTermsAccepted_ = false;
    }

    private static final class FeatureFlagsDefaultEntryHolder {
        static final MapEntryLite<String, Boolean> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BOOL, false);

        private FeatureFlagsDefaultEntryHolder() {
        }
    }

    private MapFieldLite<String, Boolean> internalGetFeatureFlags() {
        return this.featureFlags_;
    }

    private MapFieldLite<String, Boolean> internalGetMutableFeatureFlags() {
        if (!this.featureFlags_.isMutable()) {
            this.featureFlags_ = this.featureFlags_.mutableCopy();
        }
        return this.featureFlags_;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public int getFeatureFlagsCount() {
        return internalGetFeatureFlags().size();
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public boolean containsFeatureFlags(String key) {
        key.getClass();
        return internalGetFeatureFlags().containsKey(key);
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    @Deprecated
    public Map<String, Boolean> getFeatureFlags() {
        return getFeatureFlagsMap();
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public Map<String, Boolean> getFeatureFlagsMap() {
        return Collections.unmodifiableMap(internalGetFeatureFlags());
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public boolean getFeatureFlagsOrDefault(String key, boolean defaultValue) {
        key.getClass();
        Map<String, Boolean> map = internalGetFeatureFlags();
        return map.containsKey(key) ? map.get(key).booleanValue() : defaultValue;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public boolean getFeatureFlagsOrThrow(String key) {
        key.getClass();
        Map<String, Boolean> map = internalGetFeatureFlags();
        if (!map.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return map.get(key).booleanValue();
    }

    
    public Map<String, Boolean> getMutableFeatureFlagsMap() {
        return internalGetMutableFeatureFlags();
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public List<String> getViewedPromoIdList() {
        return this.viewedPromoId_;
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public int getViewedPromoIdCount() {
        return this.viewedPromoId_.size();
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public String getViewedPromoId(int index) {
        return this.viewedPromoId_.get(index);
    }

    @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
    public ByteString getViewedPromoIdBytes(int index) {
        return ByteString.copyFromUtf8(this.viewedPromoId_.get(index));
    }

    private void ensureViewedPromoIdIsMutable() {
        Internal.ProtobufList<String> tmp = this.viewedPromoId_;
        if (!tmp.isModifiable()) {
            this.viewedPromoId_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    
    public void setViewedPromoId(int index, String value) {
        value.getClass();
        ensureViewedPromoIdIsMutable();
        this.viewedPromoId_.set(index, value);
    }

    
    public void addViewedPromoId(String value) {
        value.getClass();
        ensureViewedPromoIdIsMutable();
        this.viewedPromoId_.add(value);
    }

    
    public void addAllViewedPromoId(Iterable<String> values) {
        ensureViewedPromoIdIsMutable();
        AbstractMessageLite.addAll(values, this.viewedPromoId_);
    }

    
    public void clearViewedPromoId() {
        this.viewedPromoId_ = GeneratedMessageLite.emptyProtobufList();
    }

    
    public void addViewedPromoIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        ensureViewedPromoIdIsMutable();
        this.viewedPromoId_.add(value.toStringUtf8());
    }

    public static Settings parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Settings parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Settings parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Settings parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Settings parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Settings parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Settings parseFrom(InputStream input) throws IOException {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Settings parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Settings parseDelimitedFrom(InputStream input) throws IOException {
        return (Settings) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Settings parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Settings) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Settings parseFrom(CodedInputStream input) throws IOException {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Settings parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Settings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Settings prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Settings, Builder> implements SettingsOrBuilder {
        private Builder() {
            super(Settings.DEFAULT_INSTANCE);
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public int getThemeValue() {
            return ((Settings) this.instance).getThemeValue();
        }

        public Builder setThemeValue(int value) {
            copyOnWrite();
            ((Settings) this.instance).setThemeValue(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public Theme getTheme() {
            return ((Settings) this.instance).getTheme();
        }

        public Builder setTheme(Theme value) {
            copyOnWrite();
            ((Settings) this.instance).setTheme(value);
            return this;
        }

        public Builder clearTheme() {
            copyOnWrite();
            ((Settings) this.instance).clearTheme();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public boolean hasAccessTokenData() {
            return ((Settings) this.instance).hasAccessTokenData();
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public AccessTokenData getAccessTokenData() {
            return ((Settings) this.instance).getAccessTokenData();
        }

        public Builder setAccessTokenData(AccessTokenData value) {
            copyOnWrite();
            ((Settings) this.instance).setAccessTokenData(value);
            return this;
        }

        public Builder setAccessTokenData(AccessTokenData.Builder builderForValue) {
            copyOnWrite();
            ((Settings) this.instance).setAccessTokenData(builderForValue.build());
            return this;
        }

        public Builder mergeAccessTokenData(AccessTokenData value) {
            copyOnWrite();
            ((Settings) this.instance).mergeAccessTokenData(value);
            return this;
        }

        public Builder clearAccessTokenData() {
            copyOnWrite();
            ((Settings) this.instance).clearAccessTokenData();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public List<String> getTextInputHistoryList() {
            return Collections.unmodifiableList(((Settings) this.instance).getTextInputHistoryList());
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public int getTextInputHistoryCount() {
            return ((Settings) this.instance).getTextInputHistoryCount();
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public String getTextInputHistory(int index) {
            return ((Settings) this.instance).getTextInputHistory(index);
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public ByteString getTextInputHistoryBytes(int index) {
            return ((Settings) this.instance).getTextInputHistoryBytes(index);
        }

        public Builder setTextInputHistory(int index, String value) {
            copyOnWrite();
            ((Settings) this.instance).setTextInputHistory(index, value);
            return this;
        }

        public Builder addTextInputHistory(String value) {
            copyOnWrite();
            ((Settings) this.instance).addTextInputHistory(value);
            return this;
        }

        public Builder addAllTextInputHistory(Iterable<String> values) {
            copyOnWrite();
            ((Settings) this.instance).addAllTextInputHistory(values);
            return this;
        }

        public Builder clearTextInputHistory() {
            copyOnWrite();
            ((Settings) this.instance).clearTextInputHistory();
            return this;
        }

        public Builder addTextInputHistoryBytes(ByteString value) {
            copyOnWrite();
            ((Settings) this.instance).addTextInputHistoryBytes(value);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public List<ImportedModel> getImportedModelList() {
            return Collections.unmodifiableList(((Settings) this.instance).getImportedModelList());
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public int getImportedModelCount() {
            return ((Settings) this.instance).getImportedModelCount();
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public ImportedModel getImportedModel(int index) {
            return ((Settings) this.instance).getImportedModel(index);
        }

        public Builder setImportedModel(int index, ImportedModel value) {
            copyOnWrite();
            ((Settings) this.instance).setImportedModel(index, value);
            return this;
        }

        public Builder setImportedModel(int index, ImportedModel.Builder builderForValue) {
            copyOnWrite();
            ((Settings) this.instance).setImportedModel(index, builderForValue.build());
            return this;
        }

        public Builder addImportedModel(ImportedModel value) {
            copyOnWrite();
            ((Settings) this.instance).addImportedModel(value);
            return this;
        }

        public Builder addImportedModel(int index, ImportedModel value) {
            copyOnWrite();
            ((Settings) this.instance).addImportedModel(index, value);
            return this;
        }

        public Builder addImportedModel(ImportedModel.Builder builderForValue) {
            copyOnWrite();
            ((Settings) this.instance).addImportedModel(builderForValue.build());
            return this;
        }

        public Builder addImportedModel(int index, ImportedModel.Builder builderForValue) {
            copyOnWrite();
            ((Settings) this.instance).addImportedModel(index, builderForValue.build());
            return this;
        }

        public Builder addAllImportedModel(Iterable<? extends ImportedModel> values) {
            copyOnWrite();
            ((Settings) this.instance).addAllImportedModel(values);
            return this;
        }

        public Builder clearImportedModel() {
            copyOnWrite();
            ((Settings) this.instance).clearImportedModel();
            return this;
        }

        public Builder removeImportedModel(int index) {
            copyOnWrite();
            ((Settings) this.instance).removeImportedModel(index);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public boolean getIsTosAccepted() {
            return ((Settings) this.instance).getIsTosAccepted();
        }

        public Builder setIsTosAccepted(boolean value) {
            copyOnWrite();
            ((Settings) this.instance).setIsTosAccepted(value);
            return this;
        }

        public Builder clearIsTosAccepted() {
            copyOnWrite();
            ((Settings) this.instance).clearIsTosAccepted();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public boolean getHasRunTinyGarden() {
            return ((Settings) this.instance).getHasRunTinyGarden();
        }

        public Builder setHasRunTinyGarden(boolean value) {
            copyOnWrite();
            ((Settings) this.instance).setHasRunTinyGarden(value);
            return this;
        }

        public Builder clearHasRunTinyGarden() {
            copyOnWrite();
            ((Settings) this.instance).clearHasRunTinyGarden();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public boolean getHasSeenBenchmarkComparisonHelp() {
            return ((Settings) this.instance).getHasSeenBenchmarkComparisonHelp();
        }

        public Builder setHasSeenBenchmarkComparisonHelp(boolean value) {
            copyOnWrite();
            ((Settings) this.instance).setHasSeenBenchmarkComparisonHelp(value);
            return this;
        }

        public Builder clearHasSeenBenchmarkComparisonHelp() {
            copyOnWrite();
            ((Settings) this.instance).clearHasSeenBenchmarkComparisonHelp();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public boolean getIsGemmaTermsAccepted() {
            return ((Settings) this.instance).getIsGemmaTermsAccepted();
        }

        public Builder setIsGemmaTermsAccepted(boolean value) {
            copyOnWrite();
            ((Settings) this.instance).setIsGemmaTermsAccepted(value);
            return this;
        }

        public Builder clearIsGemmaTermsAccepted() {
            copyOnWrite();
            ((Settings) this.instance).clearIsGemmaTermsAccepted();
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public int getFeatureFlagsCount() {
            return ((Settings) this.instance).getFeatureFlagsMap().size();
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public boolean containsFeatureFlags(String key) {
            key.getClass();
            return ((Settings) this.instance).getFeatureFlagsMap().containsKey(key);
        }

        public Builder clearFeatureFlags() {
            copyOnWrite();
            ((Settings) this.instance).getMutableFeatureFlagsMap().clear();
            return this;
        }

        public Builder removeFeatureFlags(String key) {
            key.getClass();
            copyOnWrite();
            ((Settings) this.instance).getMutableFeatureFlagsMap().remove(key);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        @Deprecated
        public Map<String, Boolean> getFeatureFlags() {
            return getFeatureFlagsMap();
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public Map<String, Boolean> getFeatureFlagsMap() {
            return Collections.unmodifiableMap(((Settings) this.instance).getFeatureFlagsMap());
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public boolean getFeatureFlagsOrDefault(String key, boolean defaultValue) {
            key.getClass();
            Map<String, Boolean> map = ((Settings) this.instance).getFeatureFlagsMap();
            return map.containsKey(key) ? map.get(key).booleanValue() : defaultValue;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public boolean getFeatureFlagsOrThrow(String key) {
            key.getClass();
            Map<String, Boolean> map = ((Settings) this.instance).getFeatureFlagsMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key).booleanValue();
        }

        public Builder putFeatureFlags(String key, boolean value) {
            key.getClass();
            copyOnWrite();
            ((Settings) this.instance).getMutableFeatureFlagsMap().put(key, Boolean.valueOf(value));
            return this;
        }

        public Builder putAllFeatureFlags(Map<String, Boolean> values) {
            copyOnWrite();
            ((Settings) this.instance).getMutableFeatureFlagsMap().putAll(values);
            return this;
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public List<String> getViewedPromoIdList() {
            return Collections.unmodifiableList(((Settings) this.instance).getViewedPromoIdList());
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public int getViewedPromoIdCount() {
            return ((Settings) this.instance).getViewedPromoIdCount();
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public String getViewedPromoId(int index) {
            return ((Settings) this.instance).getViewedPromoId(index);
        }

        @Override // com.google.ai.edge.gallery.proto.SettingsOrBuilder
        public ByteString getViewedPromoIdBytes(int index) {
            return ((Settings) this.instance).getViewedPromoIdBytes(index);
        }

        public Builder setViewedPromoId(int index, String value) {
            copyOnWrite();
            ((Settings) this.instance).setViewedPromoId(index, value);
            return this;
        }

        public Builder addViewedPromoId(String value) {
            copyOnWrite();
            ((Settings) this.instance).addViewedPromoId(value);
            return this;
        }

        public Builder addAllViewedPromoId(Iterable<String> values) {
            copyOnWrite();
            ((Settings) this.instance).addAllViewedPromoId(values);
            return this;
        }

        public Builder clearViewedPromoId() {
            copyOnWrite();
            ((Settings) this.instance).clearViewedPromoId();
            return this;
        }

        public Builder addViewedPromoIdBytes(ByteString value) {
            copyOnWrite();
            ((Settings) this.instance).addViewedPromoIdBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new Settings();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "theme_", "accessTokenData_", "textInputHistory_", "importedModel_", ImportedModel.class, "isTosAccepted_", "hasRunTinyGarden_", "hasSeenBenchmarkComparisonHelp_", "isGemmaTermsAccepted_", "featureFlags_", FeatureFlagsDefaultEntryHolder.defaultEntry, "viewedPromoId_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0001\u0003\u0000\u0001\f\u0002ဉ\u0000\u0003Ț\u0004\u001b\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\t2\nȚ", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Settings> parser = PARSER;
                if (parser == null) {
                    synchronized (Settings.class) {
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
        Settings defaultInstance = new Settings();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(Settings.class, defaultInstance);
    }

    public static Settings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Settings> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
