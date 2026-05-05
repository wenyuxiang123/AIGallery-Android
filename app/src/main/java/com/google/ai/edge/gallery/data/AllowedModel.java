package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelAllowlist.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\r\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b*\u0010+J\u0006\u0010S\u001a\u00020TJ\b\u0010U\u001a\u00020\u0003H\u0016J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\t\u0010\\\u001a\u00020\u000bHÆ\u0003J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010_\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010`\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010a\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00109J\u0010\u0010b\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00109J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\rHÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010n\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0018\u00010\u001cHÆ\u0003J\u0011\u0010o\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\rHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jø\u0002\u0010q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0018\u00010\u001c2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\r2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020\u000f2\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010:\u001a\u0004\b;\u00109R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010:\u001a\u0004\b<\u00109R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010:\u001a\u0004\b=\u00109R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010:\u001a\u0004\b>\u00109R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bC\u00107R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010-R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010-R\u001f\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010-R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010-R%\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bP\u0010GR\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bQ\u00107R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010-¨\u0006v"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/AllowedModel;", "", "name", "", "modelId", "modelFile", "commitHash", "description", "sizeInBytes", "", "defaultConfig", "Lcom/google/ai/edge/gallery/data/DefaultConfig;", "taskTypes", "", "disabled", "", "llmSupportImage", "llmSupportAudio", "llmSupportTinyGarden", "llmSupportMobileActions", "capabilities", "Lcom/google/ai/edge/gallery/data/ModelCapability;", "minDeviceMemoryInGb", "", "bestForTaskTypes", "localModelFilePathOverride", ImagesContract.URL, "socToModelFiles", "", "Lcom/google/ai/edge/gallery/data/SocModelFile;", "runtimeType", "Lcom/google/ai/edge/gallery/data/RuntimeType;", "aicoreReleaseStage", "Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;", "aicorePreference", "Lcom/google/ai/edge/gallery/data/AICoreModelPreference;", "parentModelName", "variantLabel", "capabilityToTaskTypes", "updatableModelFiles", "Lcom/google/ai/edge/gallery/data/ModelFile;", "updateInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/google/ai/edge/gallery/data/DefaultConfig;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/google/ai/edge/gallery/data/RuntimeType;Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;Lcom/google/ai/edge/gallery/data/AICoreModelPreference;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getModelId", "getModelFile", "getCommitHash", "getDescription", "getSizeInBytes", "()J", "getDefaultConfig", "()Lcom/google/ai/edge/gallery/data/DefaultConfig;", "getTaskTypes", "()Ljava/util/List;", "getDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLlmSupportImage", "getLlmSupportAudio", "getLlmSupportTinyGarden", "getLlmSupportMobileActions", "getCapabilities", "getMinDeviceMemoryInGb", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBestForTaskTypes", "getLocalModelFilePathOverride", "getUrl", "getSocToModelFiles", "()Ljava/util/Map;", "getRuntimeType", "()Lcom/google/ai/edge/gallery/data/RuntimeType;", "getAicoreReleaseStage", "()Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;", "getAicorePreference", "()Lcom/google/ai/edge/gallery/data/AICoreModelPreference;", "getParentModelName", "getVariantLabel", "getCapabilityToTaskTypes", "getUpdatableModelFiles", "getUpdateInfo", "toModel", "Lcom/google/ai/edge/gallery/data/Model;", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/google/ai/edge/gallery/data/DefaultConfig;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/google/ai/edge/gallery/data/RuntimeType;Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;Lcom/google/ai/edge/gallery/data/AICoreModelPreference;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Lcom/google/ai/edge/gallery/data/AllowedModel;", "equals", "other", "hashCode", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class AllowedModel {
    public static final int $stable = 8;
    private final AICoreModelPreference aicorePreference;
    private final AICoreModelReleaseStage aicoreReleaseStage;
    private final List<String> bestForTaskTypes;
    private final List<ModelCapability> capabilities;
    private final Map<ModelCapability, List<String>> capabilityToTaskTypes;
    private final String commitHash;
    private final DefaultConfig defaultConfig;
    private final String description;
    private final Boolean disabled;
    private final Boolean llmSupportAudio;
    private final Boolean llmSupportImage;
    private final Boolean llmSupportMobileActions;
    private final Boolean llmSupportTinyGarden;
    private final String localModelFilePathOverride;
    private final Integer minDeviceMemoryInGb;
    private final String modelFile;
    private final String modelId;
    private final String name;
    private final String parentModelName;
    private final RuntimeType runtimeType;
    private final long sizeInBytes;
    private final Map<String, SocModelFile> socToModelFiles;
    private final List<String> taskTypes;
    private final List<ModelFile> updatableModelFiles;
    private final String updateInfo;
    private final String url;
    private final String variantLabel;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getLlmSupportImage() {
        return this.llmSupportImage;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getLlmSupportAudio() {
        return this.llmSupportAudio;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getLlmSupportTinyGarden() {
        return this.llmSupportTinyGarden;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getLlmSupportMobileActions() {
        return this.llmSupportMobileActions;
    }

    public final List<ModelCapability> component14() {
        return this.capabilities;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getMinDeviceMemoryInGb() {
        return this.minDeviceMemoryInGb;
    }

    public final List<String> component16() {
        return this.bestForTaskTypes;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLocalModelFilePathOverride() {
        return this.localModelFilePathOverride;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, SocModelFile> component19() {
        return this.socToModelFiles;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final RuntimeType getRuntimeType() {
        return this.runtimeType;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final AICoreModelReleaseStage getAicoreReleaseStage() {
        return this.aicoreReleaseStage;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final AICoreModelPreference getAicorePreference() {
        return this.aicorePreference;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getParentModelName() {
        return this.parentModelName;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getVariantLabel() {
        return this.variantLabel;
    }

    public final Map<ModelCapability, List<String>> component25() {
        return this.capabilityToTaskTypes;
    }

    public final List<ModelFile> component26() {
        return this.updatableModelFiles;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getUpdateInfo() {
        return this.updateInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModelFile() {
        return this.modelFile;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCommitHash() {
        return this.commitHash;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DefaultConfig getDefaultConfig() {
        return this.defaultConfig;
    }

    public final List<String> component8() {
        return this.taskTypes;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getDisabled() {
        return this.disabled;
    }

    public final AllowedModel copy(String name, String modelId, String modelFile, String commitHash, String description, long sizeInBytes, DefaultConfig defaultConfig, List<String> taskTypes, Boolean disabled, Boolean llmSupportImage, Boolean llmSupportAudio, Boolean llmSupportTinyGarden, Boolean llmSupportMobileActions, List<? extends ModelCapability> capabilities, Integer minDeviceMemoryInGb, List<String> bestForTaskTypes, String localModelFilePathOverride, String url, Map<String, SocModelFile> socToModelFiles, RuntimeType runtimeType, AICoreModelReleaseStage aicoreReleaseStage, AICoreModelPreference aicorePreference, String parentModelName, String variantLabel, Map<ModelCapability, ? extends List<String>> capabilityToTaskTypes, List<ModelFile> updatableModelFiles, String updateInfo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        Intrinsics.checkNotNullParameter(modelFile, "modelFile");
        Intrinsics.checkNotNullParameter(commitHash, "commitHash");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(defaultConfig, "defaultConfig");
        Intrinsics.checkNotNullParameter(taskTypes, "taskTypes");
        return new AllowedModel(name, modelId, modelFile, commitHash, description, sizeInBytes, defaultConfig, taskTypes, disabled, llmSupportImage, llmSupportAudio, llmSupportTinyGarden, llmSupportMobileActions, capabilities, minDeviceMemoryInGb, bestForTaskTypes, localModelFilePathOverride, url, socToModelFiles, runtimeType, aicoreReleaseStage, aicorePreference, parentModelName, variantLabel, capabilityToTaskTypes, updatableModelFiles, updateInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllowedModel)) {
            return false;
        }
        AllowedModel allowedModel = (AllowedModel) other;
        return Intrinsics.areEqual(this.name, allowedModel.name) && Intrinsics.areEqual(this.modelId, allowedModel.modelId) && Intrinsics.areEqual(this.modelFile, allowedModel.modelFile) && Intrinsics.areEqual(this.commitHash, allowedModel.commitHash) && Intrinsics.areEqual(this.description, allowedModel.description) && this.sizeInBytes == allowedModel.sizeInBytes && Intrinsics.areEqual(this.defaultConfig, allowedModel.defaultConfig) && Intrinsics.areEqual(this.taskTypes, allowedModel.taskTypes) && Intrinsics.areEqual(this.disabled, allowedModel.disabled) && Intrinsics.areEqual(this.llmSupportImage, allowedModel.llmSupportImage) && Intrinsics.areEqual(this.llmSupportAudio, allowedModel.llmSupportAudio) && Intrinsics.areEqual(this.llmSupportTinyGarden, allowedModel.llmSupportTinyGarden) && Intrinsics.areEqual(this.llmSupportMobileActions, allowedModel.llmSupportMobileActions) && Intrinsics.areEqual(this.capabilities, allowedModel.capabilities) && Intrinsics.areEqual(this.minDeviceMemoryInGb, allowedModel.minDeviceMemoryInGb) && Intrinsics.areEqual(this.bestForTaskTypes, allowedModel.bestForTaskTypes) && Intrinsics.areEqual(this.localModelFilePathOverride, allowedModel.localModelFilePathOverride) && Intrinsics.areEqual(this.url, allowedModel.url) && Intrinsics.areEqual(this.socToModelFiles, allowedModel.socToModelFiles) && this.runtimeType == allowedModel.runtimeType && this.aicoreReleaseStage == allowedModel.aicoreReleaseStage && this.aicorePreference == allowedModel.aicorePreference && Intrinsics.areEqual(this.parentModelName, allowedModel.parentModelName) && Intrinsics.areEqual(this.variantLabel, allowedModel.variantLabel) && Intrinsics.areEqual(this.capabilityToTaskTypes, allowedModel.capabilityToTaskTypes) && Intrinsics.areEqual(this.updatableModelFiles, allowedModel.updatableModelFiles) && Intrinsics.areEqual(this.updateInfo, allowedModel.updateInfo);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + this.modelId.hashCode()) * 31) + this.modelFile.hashCode()) * 31) + this.commitHash.hashCode()) * 31) + this.description.hashCode()) * 31) + Long.hashCode(this.sizeInBytes)) * 31) + this.defaultConfig.hashCode()) * 31) + this.taskTypes.hashCode()) * 31) + (this.disabled == null ? 0 : this.disabled.hashCode())) * 31) + (this.llmSupportImage == null ? 0 : this.llmSupportImage.hashCode())) * 31) + (this.llmSupportAudio == null ? 0 : this.llmSupportAudio.hashCode())) * 31) + (this.llmSupportTinyGarden == null ? 0 : this.llmSupportTinyGarden.hashCode())) * 31) + (this.llmSupportMobileActions == null ? 0 : this.llmSupportMobileActions.hashCode())) * 31) + (this.capabilities == null ? 0 : this.capabilities.hashCode())) * 31) + (this.minDeviceMemoryInGb == null ? 0 : this.minDeviceMemoryInGb.hashCode())) * 31) + (this.bestForTaskTypes == null ? 0 : this.bestForTaskTypes.hashCode())) * 31) + (this.localModelFilePathOverride == null ? 0 : this.localModelFilePathOverride.hashCode())) * 31) + (this.url == null ? 0 : this.url.hashCode())) * 31) + (this.socToModelFiles == null ? 0 : this.socToModelFiles.hashCode())) * 31) + (this.runtimeType == null ? 0 : this.runtimeType.hashCode())) * 31) + (this.aicoreReleaseStage == null ? 0 : this.aicoreReleaseStage.hashCode())) * 31) + (this.aicorePreference == null ? 0 : this.aicorePreference.hashCode())) * 31) + (this.parentModelName == null ? 0 : this.parentModelName.hashCode())) * 31) + (this.variantLabel == null ? 0 : this.variantLabel.hashCode())) * 31) + (this.capabilityToTaskTypes == null ? 0 : this.capabilityToTaskTypes.hashCode())) * 31) + (this.updatableModelFiles == null ? 0 : this.updatableModelFiles.hashCode())) * 31) + (this.updateInfo != null ? this.updateInfo.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AllowedModel(String name, String modelId, String modelFile, String commitHash, String description, long sizeInBytes, DefaultConfig defaultConfig, List<String> taskTypes, Boolean disabled, Boolean llmSupportImage, Boolean llmSupportAudio, Boolean llmSupportTinyGarden, Boolean llmSupportMobileActions, List<? extends ModelCapability> list, Integer minDeviceMemoryInGb, List<String> list2, String localModelFilePathOverride, String url, Map<String, SocModelFile> map, RuntimeType runtimeType, AICoreModelReleaseStage aicoreReleaseStage, AICoreModelPreference aicorePreference, String parentModelName, String variantLabel, Map<ModelCapability, ? extends List<String>> map2, List<ModelFile> list3, String updateInfo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        Intrinsics.checkNotNullParameter(modelFile, "modelFile");
        Intrinsics.checkNotNullParameter(commitHash, "commitHash");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(defaultConfig, "defaultConfig");
        Intrinsics.checkNotNullParameter(taskTypes, "taskTypes");
        this.name = name;
        this.modelId = modelId;
        this.modelFile = modelFile;
        this.commitHash = commitHash;
        this.description = description;
        this.sizeInBytes = sizeInBytes;
        this.defaultConfig = defaultConfig;
        this.taskTypes = taskTypes;
        this.disabled = disabled;
        this.llmSupportImage = llmSupportImage;
        this.llmSupportAudio = llmSupportAudio;
        this.llmSupportTinyGarden = llmSupportTinyGarden;
        this.llmSupportMobileActions = llmSupportMobileActions;
        this.capabilities = list;
        this.minDeviceMemoryInGb = minDeviceMemoryInGb;
        this.bestForTaskTypes = list2;
        this.localModelFilePathOverride = localModelFilePathOverride;
        this.url = url;
        this.socToModelFiles = map;
        this.runtimeType = runtimeType;
        this.aicoreReleaseStage = aicoreReleaseStage;
        this.aicorePreference = aicorePreference;
        this.parentModelName = parentModelName;
        this.variantLabel = variantLabel;
        this.capabilityToTaskTypes = map2;
        this.updatableModelFiles = list3;
        this.updateInfo = updateInfo;
    }

    public /* synthetic */ AllowedModel(String str, String str2, String str3, String str4, String str5, long j, DefaultConfig defaultConfig, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, List list2, Integer num, List list3, String str6, String str7, Map map, RuntimeType runtimeType, AICoreModelReleaseStage aICoreModelReleaseStage, AICoreModelPreference aICoreModelPreference, String str8, String str9, Map map2, List list4, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, j, defaultConfig, list, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : bool4, (i & 4096) != 0 ? null : bool5, (i & 8192) != 0 ? null : list2, (i & 16384) != 0 ? null : num, (32768 & i) != 0 ? null : list3, (65536 & i) != 0 ? null : str6, (131072 & i) != 0 ? null : str7, (262144 & i) != 0 ? null : map, (524288 & i) != 0 ? null : runtimeType, (1048576 & i) != 0 ? null : aICoreModelReleaseStage, (2097152 & i) != 0 ? null : aICoreModelPreference, (4194304 & i) != 0 ? null : str8, (8388608 & i) != 0 ? null : str9, (16777216 & i) != 0 ? null : map2, (33554432 & i) != 0 ? null : list4, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : str10);
    }

    public final String getName() {
        return this.name;
    }

    public final String getModelId() {
        return this.modelId;
    }

    public final String getModelFile() {
        return this.modelFile;
    }

    public final String getCommitHash() {
        return this.commitHash;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getSizeInBytes() {
        return this.sizeInBytes;
    }

    public final DefaultConfig getDefaultConfig() {
        return this.defaultConfig;
    }

    public final List<String> getTaskTypes() {
        return this.taskTypes;
    }

    public final Boolean getDisabled() {
        return this.disabled;
    }

    public final Boolean getLlmSupportImage() {
        return this.llmSupportImage;
    }

    public final Boolean getLlmSupportAudio() {
        return this.llmSupportAudio;
    }

    public final Boolean getLlmSupportTinyGarden() {
        return this.llmSupportTinyGarden;
    }

    public final Boolean getLlmSupportMobileActions() {
        return this.llmSupportMobileActions;
    }

    public final List<ModelCapability> getCapabilities() {
        return this.capabilities;
    }

    public final Integer getMinDeviceMemoryInGb() {
        return this.minDeviceMemoryInGb;
    }

    public final List<String> getBestForTaskTypes() {
        return this.bestForTaskTypes;
    }

    public final String getLocalModelFilePathOverride() {
        return this.localModelFilePathOverride;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Map<String, SocModelFile> getSocToModelFiles() {
        return this.socToModelFiles;
    }

    public final RuntimeType getRuntimeType() {
        return this.runtimeType;
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

    public final Map<ModelCapability, List<String>> getCapabilityToTaskTypes() {
        return this.capabilityToTaskTypes;
    }

    public final List<ModelFile> getUpdatableModelFiles() {
        return this.updatableModelFiles;
    }

    public final String getUpdateInfo() {
        return this.updateInfo;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e6  */
    /*
        // Code decompiled incorrectly - placeholder implementation
        return null;
    public final com.google.ai.edge.gallery.data.Model toModel() {
        /*
    public final com.google.ai.edge.gallery.data.Model toModel() {
            // Method dump skipped - placeholder implementation
            return null;
        }

    public String toString() {
        return this.modelId + "/" + this.modelFile;
    }
}
}
