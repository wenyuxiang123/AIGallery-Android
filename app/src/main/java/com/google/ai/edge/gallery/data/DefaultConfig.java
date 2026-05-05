package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelAllowlist.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJb\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000f¨\u0006("}, m922d2 = {"Lcom/google/ai/edge/gallery/data/DefaultConfig;", "", "topK", "", "topP", "", "temperature", "accelerators", "", "visionAccelerator", "maxContextLength", "maxTokens", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTopK", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTopP", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTemperature", "getAccelerators", "()Ljava/lang/String;", "getVisionAccelerator", "getMaxContextLength", "getMaxTokens", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/google/ai/edge/gallery/data/DefaultConfig;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class DefaultConfig {
    public static final int $stable = 0;

    @SerializedName("accelerators")
    private final String accelerators;

    @SerializedName("maxContextLength")
    private final Integer maxContextLength;

    @SerializedName("maxTokens")
    private final Integer maxTokens;

    @SerializedName("temperature")
    private final Float temperature;

    @SerializedName("topK")
    private final Integer topK;

    @SerializedName("topP")
    private final Float topP;

    @SerializedName("visionAccelerator")
    private final String visionAccelerator;

    public static /* synthetic */ DefaultConfig copy$default(DefaultConfig defaultConfig, Integer num, Float f, Float f2, String str, String str2, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = defaultConfig.topK;
        }
        if ((i & 2) != 0) {
            f = defaultConfig.topP;
        }
        Float f3 = f;
        if ((i & 4) != 0) {
            f2 = defaultConfig.temperature;
        }
        Float f4 = f2;
        if ((i & 8) != 0) {
            str = defaultConfig.accelerators;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = defaultConfig.visionAccelerator;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            num2 = defaultConfig.maxContextLength;
        }
        Integer num4 = num2;
        if ((i & 64) != 0) {
            num3 = defaultConfig.maxTokens;
        }
        return defaultConfig.copy(num, f3, f4, str3, str4, num4, num3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTopK() {
        return this.topK;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getTopP() {
        return this.topP;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getTemperature() {
        return this.temperature;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccelerators() {
        return this.accelerators;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVisionAccelerator() {
        return this.visionAccelerator;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMaxContextLength() {
        return this.maxContextLength;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMaxTokens() {
        return this.maxTokens;
    }

    public final DefaultConfig copy(Integer topK, Float topP, Float temperature, String accelerators, String visionAccelerator, Integer maxContextLength, Integer maxTokens) {
        return new DefaultConfig(topK, topP, temperature, accelerators, visionAccelerator, maxContextLength, maxTokens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultConfig)) {
            return false;
        }
        DefaultConfig defaultConfig = (DefaultConfig) other;
        return Intrinsics.areEqual(this.topK, defaultConfig.topK) && Intrinsics.areEqual((Object) this.topP, (Object) defaultConfig.topP) && Intrinsics.areEqual((Object) this.temperature, (Object) defaultConfig.temperature) && Intrinsics.areEqual(this.accelerators, defaultConfig.accelerators) && Intrinsics.areEqual(this.visionAccelerator, defaultConfig.visionAccelerator) && Intrinsics.areEqual(this.maxContextLength, defaultConfig.maxContextLength) && Intrinsics.areEqual(this.maxTokens, defaultConfig.maxTokens);
    }

    public int hashCode() {
        return ((((((((((((this.topK == null ? 0 : this.topK.hashCode()) * 31) + (this.topP == null ? 0 : this.topP.hashCode())) * 31) + (this.temperature == null ? 0 : this.temperature.hashCode())) * 31) + (this.accelerators == null ? 0 : this.accelerators.hashCode())) * 31) + (this.visionAccelerator == null ? 0 : this.visionAccelerator.hashCode())) * 31) + (this.maxContextLength == null ? 0 : this.maxContextLength.hashCode())) * 31) + (this.maxTokens != null ? this.maxTokens.hashCode() : 0);
    }

    public String toString() {
        return "DefaultConfig(topK=" + this.topK + ", topP=" + this.topP + ", temperature=" + this.temperature + ", accelerators=" + this.accelerators + ", visionAccelerator=" + this.visionAccelerator + ", maxContextLength=" + this.maxContextLength + ", maxTokens=" + this.maxTokens + ")";
    }

    public DefaultConfig(Integer topK, Float topP, Float temperature, String accelerators, String visionAccelerator, Integer maxContextLength, Integer maxTokens) {
        this.topK = topK;
        this.topP = topP;
        this.temperature = temperature;
        this.accelerators = accelerators;
        this.visionAccelerator = visionAccelerator;
        this.maxContextLength = maxContextLength;
        this.maxTokens = maxTokens;
    }

    public final Integer getTopK() {
        return this.topK;
    }

    public final Float getTopP() {
        return this.topP;
    }

    public final Float getTemperature() {
        return this.temperature;
    }

    public final String getAccelerators() {
        return this.accelerators;
    }

    public final String getVisionAccelerator() {
        return this.visionAccelerator;
    }

    public final Integer getMaxContextLength() {
        return this.maxContextLength;
    }

    public final Integer getMaxTokens() {
        return this.maxTokens;
    }
}
