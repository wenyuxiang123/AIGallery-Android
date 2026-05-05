package com.google.ai.edge.gallery.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface SettingsOrBuilder extends MessageLiteOrBuilder {
    boolean containsFeatureFlags(String str);

    AccessTokenData getAccessTokenData();

    @Deprecated
    Map<String, Boolean> getFeatureFlags();

    int getFeatureFlagsCount();

    Map<String, Boolean> getFeatureFlagsMap();

    boolean getFeatureFlagsOrDefault(String str, boolean z);

    boolean getFeatureFlagsOrThrow(String str);

    boolean getHasRunTinyGarden();

    boolean getHasSeenBenchmarkComparisonHelp();

    ImportedModel getImportedModel(int i);

    int getImportedModelCount();

    List<ImportedModel> getImportedModelList();

    boolean getIsGemmaTermsAccepted();

    boolean getIsTosAccepted();

    String getTextInputHistory(int i);

    ByteString getTextInputHistoryBytes(int i);

    int getTextInputHistoryCount();

    List<String> getTextInputHistoryList();

    Theme getTheme();

    int getThemeValue();

    String getViewedPromoId(int i);

    ByteString getViewedPromoIdBytes(int i);

    int getViewedPromoIdCount();

    List<String> getViewedPromoIdList();

    boolean hasAccessTokenData();
}
