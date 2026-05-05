package com.google.ai.edge.gallery.data;

import android.content.Context;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.primitives.Ints;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



public final /* data */ class Model {
    public static final int $stable = 8;
    private final List<Accelerator> accelerators;
    private String accessToken;
    private final AICoreModelPreference aicorePreference;
    private final AICoreModelReleaseStage aicoreReleaseStage;
    private final List<String> bestForTaskIds;
    private final List<ModelCapability> capabilities;
    private final Map<ModelCapability, List<String>> capabilityToTaskTypes;
    private boolean cleanUpAfterInit;
    private Map<String, ? extends Object> configValues;
    private List<? extends Config> configs;
    private final String displayName;
    private String downloadFileName;
    private final List<ModelDataFile> extraDataFiles;
    private final boolean imported;
    private final String info;
    private boolean initializing;
    private Object instance;
    private final boolean isLlm;
    private final boolean isZip;
    private ModelFile latestModelFile;
    private final String learnMoreUrl;
    private final int llmMaxToken;
    private final List<PromptTemplate> llmPromptTemplates;
    private final boolean llmSupportAudio;
    private final boolean llmSupportImage;
    private final boolean llmSupportMobileActions;
    private final boolean llmSupportTinyGarden;
    private final String localFileRelativeDirPathOverride;
    private final String localModelFilePathOverride;
    private final Integer minDeviceMemoryInGb;
    private final String name;
    private String normalizedName;
    private final String parentModelName;
    private Map<String, ? extends Object> prevConfigValues;
    private final RuntimeType runtimeType;
    private final boolean showBenchmarkButton;
    private final boolean showRunAgainButton;
    private final long sizeInBytes;
    private long totalBytes;
    private final String unzipDir;
    private boolean updatable;
    private final List<ModelFile> updatableModelFiles;
    private final String updateInfo;
    private final String url;
    private final String variantLabel;
    private String version;
    private final Accelerator visionAccelerator;

    
    public final String getName() {
        return this.name;
    }

    
    public final String getDownloadFileName() {
        return this.downloadFileName;
    }

    
    public final String getVersion() {
        return this.version;
    }

    public final List<ModelDataFile> component12() {
        return this.extraDataFiles;
    }

    
    public final boolean getIsLlm() {
        return this.isLlm;
    }

    
    public final AICoreModelReleaseStage getAicoreReleaseStage() {
        return this.aicoreReleaseStage;
    }

    
    public final AICoreModelPreference getAicorePreference() {
        return this.aicorePreference;
    }

    
    public final String getParentModelName() {
        return this.parentModelName;
    }

    
    public final String getVariantLabel() {
        return this.variantLabel;
    }

    public final List<ModelFile> component18() {
        return this.updatableModelFiles;
    }

    
    public final String getUpdateInfo() {
        return this.updateInfo;
    }

    
    public final String getDisplayName() {
        return this.displayName;
    }

    
    public final RuntimeType getRuntimeType() {
        return this.runtimeType;
    }

    
    public final String getLocalFileRelativeDirPathOverride() {
        return this.localFileRelativeDirPathOverride;
    }

    
    public final String getLocalModelFilePathOverride() {
        return this.localModelFilePathOverride;
    }

    
    public final boolean getShowRunAgainButton() {
        return this.showRunAgainButton;
    }

    
    public final boolean getShowBenchmarkButton() {
        return this.showBenchmarkButton;
    }

    
    public final boolean getIsZip() {
        return this.isZip;
    }

    
    public final String getUnzipDir() {
        return this.unzipDir;
    }

    public final List<PromptTemplate> component27() {
        return this.llmPromptTemplates;
    }

    
    public final boolean getLlmSupportImage() {
        return this.llmSupportImage;
    }

    
    public final boolean getLlmSupportAudio() {
        return this.llmSupportAudio;
    }

    
    public final String getInfo() {
        return this.info;
    }

    
    public final boolean getLlmSupportTinyGarden() {
        return this.llmSupportTinyGarden;
    }

    
    public final boolean getLlmSupportMobileActions() {
        return this.llmSupportMobileActions;
    }

    public final List<ModelCapability> component32() {
        return this.capabilities;
    }

    
    public final int getLlmMaxToken() {
        return this.llmMaxToken;
    }

    public final List<Accelerator> component34() {
        return this.accelerators;
    }

    
    public final Accelerator getVisionAccelerator() {
        return this.visionAccelerator;
    }

    
    public final boolean getImported() {
        return this.imported;
    }

    public final Map<ModelCapability, List<String>> component37() {
        return this.capabilityToTaskTypes;
    }

    
    public final String getNormalizedName() {
        return this.normalizedName;
    }

    
    public final Object getInstance() {
        return this.instance;
    }

    public final List<Config> component4() {
        return this.configs;
    }

    
    public final boolean getInitializing() {
        return this.initializing;
    }

    
    public final boolean getCleanUpAfterInit() {
        return this.cleanUpAfterInit;
    }

    public final Map<String, Object> component42() {
        return this.configValues;
    }

    public final Map<String, Object> component43() {
        return this.prevConfigValues;
    }

    
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    
    public final String getAccessToken() {
        return this.accessToken;
    }

    
    public final boolean getUpdatable() {
        return this.updatable;
    }

    
    public final ModelFile getLatestModelFile() {
        return this.latestModelFile;
    }

    
    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final List<String> component6() {
        return this.bestForTaskIds;
    }

    
    public final Integer getMinDeviceMemoryInGb() {
        return this.minDeviceMemoryInGb;
    }

    
    public final String getUrl() {
        return this.url;
    }

    
    public final long getSizeInBytes() {
        return this.sizeInBytes;
    }

    public final Model copy(String name, String displayName, String info, List<? extends Config> configs, String learnMoreUrl, List<String> bestForTaskIds, Integer minDeviceMemoryInGb, String url, long sizeInBytes, String downloadFileName, String version, List<ModelDataFile> extraDataFiles, boolean isLlm, AICoreModelReleaseStage aicoreReleaseStage, AICoreModelPreference aicorePreference, String parentModelName, String variantLabel, List<ModelFile> updatableModelFiles, String updateInfo, RuntimeType runtimeType, String localFileRelativeDirPathOverride, String localModelFilePathOverride, boolean showRunAgainButton, boolean showBenchmarkButton, boolean isZip, String unzipDir, List<PromptTemplate> llmPromptTemplates, boolean llmSupportImage, boolean llmSupportAudio, boolean llmSupportTinyGarden, boolean llmSupportMobileActions, List<? extends ModelCapability> capabilities, int llmMaxToken, List<? extends Accelerator> accelerators, Accelerator visionAccelerator, boolean imported, Map<ModelCapability, ? extends List<String>> capabilityToTaskTypes, String normalizedName, Object instance, boolean initializing, boolean cleanUpAfterInit, Map<String, ? extends Object> configValues, Map<String, ? extends Object> prevConfigValues, long totalBytes, String accessToken, boolean updatable, ModelFile latestModelFile) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(bestForTaskIds, "bestForTaskIds");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(downloadFileName, "downloadFileName");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(extraDataFiles, "extraDataFiles");
        Intrinsics.checkNotNullParameter(updatableModelFiles, "updatableModelFiles");
        Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        Intrinsics.checkNotNullParameter(runtimeType, "runtimeType");
        Intrinsics.checkNotNullParameter(localFileRelativeDirPathOverride, "localFileRelativeDirPathOverride");
        Intrinsics.checkNotNullParameter(localModelFilePathOverride, "localModelFilePathOverride");
        Intrinsics.checkNotNullParameter(unzipDir, "unzipDir");
        Intrinsics.checkNotNullParameter(llmPromptTemplates, "llmPromptTemplates");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(accelerators, "accelerators");
        Intrinsics.checkNotNullParameter(visionAccelerator, "visionAccelerator");
        Intrinsics.checkNotNullParameter(capabilityToTaskTypes, "capabilityToTaskTypes");
        Intrinsics.checkNotNullParameter(normalizedName, "normalizedName");
        Intrinsics.checkNotNullParameter(configValues, "configValues");
        Intrinsics.checkNotNullParameter(prevConfigValues, "prevConfigValues");
        return new Model(name, displayName, info, configs, learnMoreUrl, bestForTaskIds, minDeviceMemoryInGb, url, sizeInBytes, downloadFileName, version, extraDataFiles, isLlm, aicoreReleaseStage, aicorePreference, parentModelName, variantLabel, updatableModelFiles, updateInfo, runtimeType, localFileRelativeDirPathOverride, localModelFilePathOverride, showRunAgainButton, showBenchmarkButton, isZip, unzipDir, llmPromptTemplates, llmSupportImage, llmSupportAudio, llmSupportTinyGarden, llmSupportMobileActions, capabilities, llmMaxToken, accelerators, visionAccelerator, imported, capabilityToTaskTypes, normalizedName, instance, initializing, cleanUpAfterInit, configValues, prevConfigValues, totalBytes, accessToken, updatable, latestModelFile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Model)) {
            return false;
        }
        Model model = (Model) other;
        return Intrinsics.areEqual(this.name, model.name) && Intrinsics.areEqual(this.displayName, model.displayName) && Intrinsics.areEqual(this.info, model.info) && Intrinsics.areEqual(this.configs, model.configs) && Intrinsics.areEqual(this.learnMoreUrl, model.learnMoreUrl) && Intrinsics.areEqual(this.bestForTaskIds, model.bestForTaskIds) && Intrinsics.areEqual(this.minDeviceMemoryInGb, model.minDeviceMemoryInGb) && Intrinsics.areEqual(this.url, model.url) && this.sizeInBytes == model.sizeInBytes && Intrinsics.areEqual(this.downloadFileName, model.downloadFileName) && Intrinsics.areEqual(this.version, model.version) && Intrinsics.areEqual(this.extraDataFiles, model.extraDataFiles) && this.isLlm == model.isLlm && this.aicoreReleaseStage == model.aicoreReleaseStage && this.aicorePreference == model.aicorePreference && Intrinsics.areEqual(this.parentModelName, model.parentModelName) && Intrinsics.areEqual(this.variantLabel, model.variantLabel) && Intrinsics.areEqual(this.updatableModelFiles, model.updatableModelFiles) && Intrinsics.areEqual(this.updateInfo, model.updateInfo) && this.runtimeType == model.runtimeType && Intrinsics.areEqual(this.localFileRelativeDirPathOverride, model.localFileRelativeDirPathOverride) && Intrinsics.areEqual(this.localModelFilePathOverride, model.localModelFilePathOverride) && this.showRunAgainButton == model.showRunAgainButton && this.showBenchmarkButton == model.showBenchmarkButton && this.isZip == model.isZip && Intrinsics.areEqual(this.unzipDir, model.unzipDir) && Intrinsics.areEqual(this.llmPromptTemplates, model.llmPromptTemplates) && this.llmSupportImage == model.llmSupportImage && this.llmSupportAudio == model.llmSupportAudio && this.llmSupportTinyGarden == model.llmSupportTinyGarden && this.llmSupportMobileActions == model.llmSupportMobileActions && Intrinsics.areEqual(this.capabilities, model.capabilities) && this.llmMaxToken == model.llmMaxToken && Intrinsics.areEqual(this.accelerators, model.accelerators) && this.visionAccelerator == model.visionAccelerator && this.imported == model.imported && Intrinsics.areEqual(this.capabilityToTaskTypes, model.capabilityToTaskTypes) && Intrinsics.areEqual(this.normalizedName, model.normalizedName) && Intrinsics.areEqual(this.instance, model.instance) && this.initializing == model.initializing && this.cleanUpAfterInit == model.cleanUpAfterInit && Intrinsics.areEqual(this.configValues, model.configValues) && Intrinsics.areEqual(this.prevConfigValues, model.prevConfigValues) && this.totalBytes == model.totalBytes && Intrinsics.areEqual(this.accessToken, model.accessToken) && this.updatable == model.updatable && Intrinsics.areEqual(this.latestModelFile, model.latestModelFile);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.info.hashCode()) * 31) + this.configs.hashCode()) * 31) + this.learnMoreUrl.hashCode()) * 31) + this.bestForTaskIds.hashCode()) * 31) + (this.minDeviceMemoryInGb == null ? 0 : this.minDeviceMemoryInGb.hashCode())) * 31) + this.url.hashCode()) * 31) + Long.hashCode(this.sizeInBytes)) * 31) + this.downloadFileName.hashCode()) * 31) + this.version.hashCode()) * 31) + this.extraDataFiles.hashCode()) * 31) + Boolean.hashCode(this.isLlm)) * 31) + (this.aicoreReleaseStage == null ? 0 : this.aicoreReleaseStage.hashCode())) * 31) + (this.aicorePreference == null ? 0 : this.aicorePreference.hashCode())) * 31) + (this.parentModelName == null ? 0 : this.parentModelName.hashCode())) * 31) + (this.variantLabel == null ? 0 : this.variantLabel.hashCode())) * 31) + this.updatableModelFiles.hashCode()) * 31) + this.updateInfo.hashCode()) * 31) + this.runtimeType.hashCode()) * 31) + this.localFileRelativeDirPathOverride.hashCode()) * 31) + this.localModelFilePathOverride.hashCode()) * 31) + Boolean.hashCode(this.showRunAgainButton)) * 31) + Boolean.hashCode(this.showBenchmarkButton)) * 31) + Boolean.hashCode(this.isZip)) * 31) + this.unzipDir.hashCode()) * 31) + this.llmPromptTemplates.hashCode()) * 31) + Boolean.hashCode(this.llmSupportImage)) * 31) + Boolean.hashCode(this.llmSupportAudio)) * 31) + Boolean.hashCode(this.llmSupportTinyGarden)) * 31) + Boolean.hashCode(this.llmSupportMobileActions)) * 31) + this.capabilities.hashCode()) * 31) + Integer.hashCode(this.llmMaxToken)) * 31) + this.accelerators.hashCode()) * 31) + this.visionAccelerator.hashCode()) * 31) + Boolean.hashCode(this.imported)) * 31) + this.capabilityToTaskTypes.hashCode()) * 31) + this.normalizedName.hashCode()) * 31) + (this.instance == null ? 0 : this.instance.hashCode())) * 31) + Boolean.hashCode(this.initializing)) * 31) + Boolean.hashCode(this.cleanUpAfterInit)) * 31) + this.configValues.hashCode()) * 31) + this.prevConfigValues.hashCode()) * 31) + Long.hashCode(this.totalBytes)) * 31) + (this.accessToken == null ? 0 : this.accessToken.hashCode())) * 31) + Boolean.hashCode(this.updatable)) * 31) + (this.latestModelFile != null ? this.latestModelFile.hashCode() : 0);
    }

    public String toString() {
        return "Model(name=" + this.name + ", displayName=" + this.displayName + ", info=" + this.info + ", configs=" + this.configs + ", learnMoreUrl=" + this.learnMoreUrl + ", bestForTaskIds=" + this.bestForTaskIds + ", minDeviceMemoryInGb=" + this.minDeviceMemoryInGb + ", url=" + this.url + ", sizeInBytes=" + this.sizeInBytes + ", downloadFileName=" + this.downloadFileName + ", version=" + this.version + ", extraDataFiles=" + this.extraDataFiles + ", isLlm=" + this.isLlm + ", aicoreReleaseStage=" + this.aicoreReleaseStage + ", aicorePreference=" + this.aicorePreference + ", parentModelName=" + this.parentModelName + ", variantLabel=" + this.variantLabel + ", updatableModelFiles=" + this.updatableModelFiles + ", updateInfo=" + this.updateInfo + ", runtimeType=" + this.runtimeType + ", localFileRelativeDirPathOverride=" + this.localFileRelativeDirPathOverride + ", localModelFilePathOverride=" + this.localModelFilePathOverride + ", showRunAgainButton=" + this.showRunAgainButton + ", showBenchmarkButton=" + this.showBenchmarkButton + ", isZip=" + this.isZip + ", unzipDir=" + this.unzipDir + ", llmPromptTemplates=" + this.llmPromptTemplates + ", llmSupportImage=" + this.llmSupportImage + ", llmSupportAudio=" + this.llmSupportAudio + ", llmSupportTinyGarden=" + this.llmSupportTinyGarden + ", llmSupportMobileActions=" + this.llmSupportMobileActions + ", capabilities=" + this.capabilities + ", llmMaxToken=" + this.llmMaxToken + ", accelerators=" + this.accelerators + ", visionAccelerator=" + this.visionAccelerator + ", imported=" + this.imported + ", capabilityToTaskTypes=" + this.capabilityToTaskTypes + ", normalizedName=" + this.normalizedName + ", instance=" + this.instance + ", initializing=" + this.initializing + ", cleanUpAfterInit=" + this.cleanUpAfterInit + ", configValues=" + this.configValues + ", prevConfigValues=" + this.prevConfigValues + ", totalBytes=" + this.totalBytes + ", accessToken=" + this.accessToken + ", updatable=" + this.updatable + ", latestModelFile=" + this.latestModelFile + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Model(String name, String displayName, String info, List<? extends Config> configs, String learnMoreUrl, List<String> bestForTaskIds, Integer minDeviceMemoryInGb, String url, long sizeInBytes, String downloadFileName, String version, List<ModelDataFile> extraDataFiles, boolean isLlm, AICoreModelReleaseStage aicoreReleaseStage, AICoreModelPreference aicorePreference, String parentModelName, String variantLabel, List<ModelFile> updatableModelFiles, String updateInfo, RuntimeType runtimeType, String localFileRelativeDirPathOverride, String localModelFilePathOverride, boolean showRunAgainButton, boolean showBenchmarkButton, boolean isZip, String unzipDir, List<PromptTemplate> llmPromptTemplates, boolean llmSupportImage, boolean llmSupportAudio, boolean llmSupportTinyGarden, boolean llmSupportMobileActions, List<? extends ModelCapability> capabilities, int llmMaxToken, List<? extends Accelerator> accelerators, Accelerator visionAccelerator, boolean imported, Map<ModelCapability, ? extends List<String>> capabilityToTaskTypes, String normalizedName, Object instance, boolean initializing, boolean cleanUpAfterInit, Map<String, ? extends Object> configValues, Map<String, ? extends Object> prevConfigValues, long totalBytes, String accessToken, boolean updatable, ModelFile latestModelFile) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "learnMoreUrl");
        Intrinsics.checkNotNullParameter(bestForTaskIds, "bestForTaskIds");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(downloadFileName, "downloadFileName");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(extraDataFiles, "extraDataFiles");
        Intrinsics.checkNotNullParameter(updatableModelFiles, "updatableModelFiles");
        Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        Intrinsics.checkNotNullParameter(runtimeType, "runtimeType");
        Intrinsics.checkNotNullParameter(localFileRelativeDirPathOverride, "localFileRelativeDirPathOverride");
        Intrinsics.checkNotNullParameter(localModelFilePathOverride, "localModelFilePathOverride");
        Intrinsics.checkNotNullParameter(unzipDir, "unzipDir");
        Intrinsics.checkNotNullParameter(llmPromptTemplates, "llmPromptTemplates");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(accelerators, "accelerators");
        Intrinsics.checkNotNullParameter(visionAccelerator, "visionAccelerator");
        Intrinsics.checkNotNullParameter(capabilityToTaskTypes, "capabilityToTaskTypes");
        Intrinsics.checkNotNullParameter(normalizedName, "normalizedName");
        Intrinsics.checkNotNullParameter(configValues, "configValues");
        Intrinsics.checkNotNullParameter(prevConfigValues, "prevConfigValues");
        this.name = name;
        this.displayName = displayName;
        this.info = info;
        this.configs = configs;
        this.learnMoreUrl = learnMoreUrl;
        this.bestForTaskIds = bestForTaskIds;
        this.minDeviceMemoryInGb = minDeviceMemoryInGb;
        this.url = url;
        this.sizeInBytes = sizeInBytes;
        this.downloadFileName = downloadFileName;
        this.version = version;
        this.extraDataFiles = extraDataFiles;
        this.isLlm = isLlm;
        this.aicoreReleaseStage = aicoreReleaseStage;
        this.aicorePreference = aicorePreference;
        this.parentModelName = parentModelName;
        this.variantLabel = variantLabel;
        this.updatableModelFiles = updatableModelFiles;
        this.updateInfo = updateInfo;
        this.runtimeType = runtimeType;
        this.localFileRelativeDirPathOverride = localFileRelativeDirPathOverride;
        this.localModelFilePathOverride = localModelFilePathOverride;
        this.showRunAgainButton = showRunAgainButton;
        this.showBenchmarkButton = showBenchmarkButton;
        this.isZip = isZip;
        this.unzipDir = unzipDir;
        this.llmPromptTemplates = llmPromptTemplates;
        this.llmSupportImage = llmSupportImage;
        this.llmSupportAudio = llmSupportAudio;
        this.llmSupportTinyGarden = llmSupportTinyGarden;
        this.llmSupportMobileActions = llmSupportMobileActions;
        this.capabilities = capabilities;
        this.llmMaxToken = llmMaxToken;
        this.accelerators = accelerators;
        this.visionAccelerator = visionAccelerator;
        this.imported = imported;
        this.capabilityToTaskTypes = capabilityToTaskTypes;
        this.normalizedName = normalizedName;
        this.instance = instance;
        this.initializing = initializing;
        this.cleanUpAfterInit = cleanUpAfterInit;
        this.configValues = configValues;
        this.prevConfigValues = prevConfigValues;
        this.totalBytes = totalBytes;
        this.accessToken = accessToken;
        this.updatable = updatable;
        this.latestModelFile = latestModelFile;
        this.normalizedName = ModelKt.NORMALIZE_NAME_REGEX.replace(this.name, "_");
    }

    public /* synthetic */ Model(String str, String str2, String str3, List list, String str4, List list2, Integer num, String str5, long j, String str6, String str7, List list3, boolean z, AICoreModelReleaseStage aICoreModelReleaseStage, AICoreModelPreference aICoreModelPreference, String str8, String str9, List list4, String str10, RuntimeType runtimeType, String str11, String str12, boolean z2, boolean z3, boolean z4, String str13, List list5, boolean z5, boolean z6, boolean z7, boolean z8, List list6, int i, List list7, Accelerator accelerator, boolean z9, Map map, String str14, Object obj, boolean z10, boolean z11, Map map2, Map map3, long j2, String str15, boolean z12, ModelFile modelFile, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? 0L : j, (i2 & 512) != 0 ? "_" : str6, (i2 & 1024) == 0 ? str7 : "_", (i2 & 2048) != 0 ? CollectionsKt.emptyList() : list3, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? null : aICoreModelReleaseStage, (i2 & 16384) != 0 ? null : aICoreModelPreference, (i2 & 32768) != 0 ? null : str8, (i2 & 65536) != 0 ? null : str9, (i2 & 131072) != 0 ? CollectionsKt.emptyList() : list4, (i2 & 262144) != 0 ? "" : str10, (i2 & 524288) != 0 ? RuntimeType.UNKNOWN : runtimeType, (i2 & 1048576) != 0 ? "" : str11, (i2 & 2097152) != 0 ? "" : str12, (i2 & 4194304) != 0 ? true : z2, (i2 & 8388608) == 0 ? z3 : true, (i2 & 16777216) != 0 ? false : z4, (i2 & 33554432) != 0 ? "" : str13, (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? CollectionsKt.emptyList() : list5, (i2 & 134217728) != 0 ? false : z5, (i2 & 268435456) != 0 ? false : z6, (i2 & 536870912) != 0 ? false : z7, (i2 & Ints.MAX_POWER_OF_TWO) != 0 ? false : z8, (i2 & Integer.MIN_VALUE) != 0 ? CollectionsKt.emptyList() : list6, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? CollectionsKt.emptyList() : list7, (i3 & 4) != 0 ? Accelerator.GPU : accelerator, (i3 & 8) != 0 ? false : z9, (i3 & 16) != 0 ? MapsKt.emptyMap() : map, (i3 & 32) != 0 ? "" : str14, (i3 & 64) != 0 ? null : obj, (i3 & 128) != 0 ? false : z10, (i3 & 256) != 0 ? false : z11, (i3 & 512) != 0 ? MapsKt.emptyMap() : map2, (i3 & 1024) != 0 ? MapsKt.emptyMap() : map3, (i3 & 2048) != 0 ? 0L : j2, (i3 & 4096) != 0 ? null : str15, (i3 & 8192) != 0 ? false : z12, (i3 & 16384) != 0 ? null : modelFile);
    }

    public final String getName() {
        return this.name;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getInfo() {
        return this.info;
    }

    public final List<Config> getConfigs() {
        return this.configs;
    }

    public final void setConfigs(List<? extends Config> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.configs = list;
    }

    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final List<String> getBestForTaskIds() {
        return this.bestForTaskIds;
    }

    public final Integer getMinDeviceMemoryInGb() {
        return this.minDeviceMemoryInGb;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getSizeInBytes() {
        return this.sizeInBytes;
    }

    public final String getDownloadFileName() {
        return this.downloadFileName;
    }

    public final void setDownloadFileName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.downloadFileName = str;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.version = str;
    }

    public final List<ModelDataFile> getExtraDataFiles() {
        return this.extraDataFiles;
    }

    public final boolean isLlm() {
        return this.isLlm;
    }

    public final AICoreModelReleaseStage getAicoreReleaseStage() {
        return this.aicoreReleaseStage;
    }

    public final AICoreModelPreference getAicorePreference() {
        return this.aicorePreference;
    }

    public final String getParentModelName() {
        return this.parentModelName;
    }

    public final String getVariantLabel() {
        return this.variantLabel;
    }

    public final List<ModelFile> getUpdatableModelFiles() {
        return this.updatableModelFiles;
    }

    public final String getUpdateInfo() {
        return this.updateInfo;
    }

    public final RuntimeType getRuntimeType() {
        return this.runtimeType;
    }

    public final String getLocalFileRelativeDirPathOverride() {
        return this.localFileRelativeDirPathOverride;
    }

    public final String getLocalModelFilePathOverride() {
        return this.localModelFilePathOverride;
    }

    public final boolean getShowRunAgainButton() {
        return this.showRunAgainButton;
    }

    public final boolean getShowBenchmarkButton() {
        return this.showBenchmarkButton;
    }

    public final boolean isZip() {
        return this.isZip;
    }

    public final String getUnzipDir() {
        return this.unzipDir;
    }

    public final List<PromptTemplate> getLlmPromptTemplates() {
        return this.llmPromptTemplates;
    }

    public final boolean getLlmSupportImage() {
        return this.llmSupportImage;
    }

    public final boolean getLlmSupportAudio() {
        return this.llmSupportAudio;
    }

    public final boolean getLlmSupportTinyGarden() {
        return this.llmSupportTinyGarden;
    }

    public final boolean getLlmSupportMobileActions() {
        return this.llmSupportMobileActions;
    }

    public final List<ModelCapability> getCapabilities() {
        return this.capabilities;
    }

    public final int getLlmMaxToken() {
        return this.llmMaxToken;
    }

    public final List<Accelerator> getAccelerators() {
        return this.accelerators;
    }

    public final Accelerator getVisionAccelerator() {
        return this.visionAccelerator;
    }

    public final boolean getImported() {
        return this.imported;
    }

    public final Map<ModelCapability, List<String>> getCapabilityToTaskTypes() {
        return this.capabilityToTaskTypes;
    }

    public final String getNormalizedName() {
        return this.normalizedName;
    }

    public final void setNormalizedName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.normalizedName = str;
    }

    public final Object getInstance() {
        return this.instance;
    }

    public final void setInstance(Object obj) {
        this.instance = obj;
    }

    public final boolean getInitializing() {
        return this.initializing;
    }

    public final void setInitializing(boolean z) {
        this.initializing = z;
    }

    public final boolean getCleanUpAfterInit() {
        return this.cleanUpAfterInit;
    }

    public final void setCleanUpAfterInit(boolean z) {
        this.cleanUpAfterInit = z;
    }

    public final Map<String, Object> getConfigValues() {
        return this.configValues;
    }

    public final void setConfigValues(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.configValues = map;
    }

    public final Map<String, Object> getPrevConfigValues() {
        return this.prevConfigValues;
    }

    public final void setPrevConfigValues(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.prevConfigValues = map;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final void setTotalBytes(long j) {
        this.totalBytes = j;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final boolean getUpdatable() {
        return this.updatable;
    }

    public final void setUpdatable(boolean z) {
        this.updatable = z;
    }

    public final ModelFile getLatestModelFile() {
        return this.latestModelFile;
    }

    public final void setLatestModelFile(ModelFile modelFile) {
        this.latestModelFile = modelFile;
    }

    public final void preProcess() {
        Map configValues = new LinkedHashMap();
        for (Config config : this.configs) {
            configValues.put(config.getKey().getLabel(), config.getDefaultValue());
        }
        this.configValues = configValues;
        long j = this.sizeInBytes;
        long sizeInBytes = 0;
        for (ModelDataFile it : this.extraDataFiles) {
            sizeInBytes += it.getSizeInBytes();
        }
        this.totalBytes = j + sizeInBytes;
    }

    public static /* synthetic */ String getPath$default(Model model, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = model.downloadFileName;
        }
        return model.getPath(context, str);
    }

    public final String getPath(Context context, String fileName) {
        String absolutePath;
        String absolutePath2;
        String absolutePath3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        String str = "";
        if (this.imported) {
            String[] strArr = new String[2];
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null && (absolutePath3 = externalFilesDir.getAbsolutePath()) != null) {
                str = absolutePath3;
            }
            strArr[0] = str;
            strArr[1] = fileName;
            List listListOf = CollectionsKt.listOf((Object[]) strArr);
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            return CollectionsKt.joinToString$default(listListOf, separator, null, null, 0, null, null, 62, null);
        }
        if (this.localModelFilePathOverride.length() > 0) {
            return this.localModelFilePathOverride;
        }
        if (this.localFileRelativeDirPathOverride.length() > 0) {
            String[] strArr2 = new String[3];
            File externalFilesDir2 = context.getExternalFilesDir(null);
            if (externalFilesDir2 != null && (absolutePath2 = externalFilesDir2.getAbsolutePath()) != null) {
                str = absolutePath2;
            }
            strArr2[0] = str;
            strArr2[1] = this.localFileRelativeDirPathOverride;
            strArr2[2] = fileName;
            List listListOf2 = CollectionsKt.listOf((Object[]) strArr2);
            String separator2 = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator2, "separator");
            return CollectionsKt.joinToString$default(listListOf2, separator2, null, null, 0, null, null, 62, null);
        }
        String[] strArr3 = new String[3];
        File externalFilesDir3 = context.getExternalFilesDir(null);
        if (externalFilesDir3 != null && (absolutePath = externalFilesDir3.getAbsolutePath()) != null) {
            str = absolutePath;
        }
        strArr3[0] = str;
        strArr3[1] = this.normalizedName;
        strArr3[2] = this.version;
        List listListOf3 = CollectionsKt.listOf((Object[]) strArr3);
        String separator3 = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator3, "separator");
        String baseDir = CollectionsKt.joinToString$default(listListOf3, separator3, null, null, 0, null, null, 62, null);
        if (this.isZip) {
            if (this.unzipDir.length() > 0) {
                List listListOf4 = CollectionsKt.listOf((Object[]) new String[]{baseDir, this.unzipDir});
                String separator4 = File.separator;
                Intrinsics.checkNotNullExpressionValue(separator4, "separator");
                return CollectionsKt.joinToString$default(listListOf4, separator4, null, null, 0, null, null, 62, null);
            }
        }
        List listListOf5 = CollectionsKt.listOf((Object[]) new String[]{baseDir, fileName});
        String separator5 = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator5, "separator");
        return CollectionsKt.joinToString$default(listListOf5, separator5, null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ int getIntConfigValue$default(Model model, ConfigKey configKey, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return model.getIntConfigValue(configKey, i);
    }

    public final int getIntConfigValue(ConfigKey key, int defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object typedConfigValue = getTypedConfigValue(key, ValueType.INT, Integer.valueOf(defaultValue));
        Intrinsics.checkNotNull(typedConfigValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) typedConfigValue).intValue();
    }

    public static /* synthetic */ float getFloatConfigValue$default(Model model, ConfigKey configKey, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return model.getFloatConfigValue(configKey, f);
    }

    public final float getFloatConfigValue(ConfigKey key, float defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object typedConfigValue = getTypedConfigValue(key, ValueType.FLOAT, Float.valueOf(defaultValue));
        Intrinsics.checkNotNull(typedConfigValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) typedConfigValue).floatValue();
    }

    public static /* synthetic */ boolean getBooleanConfigValue$default(Model model, ConfigKey configKey, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return model.getBooleanConfigValue(configKey, z);
    }

    public final boolean getBooleanConfigValue(ConfigKey key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object typedConfigValue = getTypedConfigValue(key, ValueType.BOOLEAN, Boolean.valueOf(defaultValue));
        Intrinsics.checkNotNull(typedConfigValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) typedConfigValue).booleanValue();
    }

    public static /* synthetic */ String getStringConfigValue$default(Model model, ConfigKey configKey, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return model.getStringConfigValue(configKey, str);
    }

    public final String getStringConfigValue(ConfigKey key, String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object typedConfigValue = getTypedConfigValue(key, ValueType.STRING, defaultValue);
        Intrinsics.checkNotNull(typedConfigValue, "null cannot be cast to non-null type kotlin.String");
        return (String) typedConfigValue;
    }

    public final ModelDataFile getExtraDataFile(String name) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<T> it = this.extraDataFiles.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ModelDataFile it2 = (ModelDataFile) next;
            if (Intrinsics.areEqual(it2.getName(), name)) {
                break;
            }
        }
        return (ModelDataFile) next;
    }

    private final Object getTypedConfigValue(ConfigKey key, ValueType valueType, Object defaultValue) {
        return ConfigKt.convertValueToTargetType(this.configValues.getOrDefault(key.getLabel(), defaultValue), valueType);
    }
}
