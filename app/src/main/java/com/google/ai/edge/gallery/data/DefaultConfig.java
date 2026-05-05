package com.google.ai.edge.gallery.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getTopK", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTopP", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getTemperature", "getAccelerators", "()Ljava/lang/String;", "getVisionAccelerator", "getMaxContextLength", "getMaxTokens", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/google/ai/edge/gallery/data/DefaultConfig;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
