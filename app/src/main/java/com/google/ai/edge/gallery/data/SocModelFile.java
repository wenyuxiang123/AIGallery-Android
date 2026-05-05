package com.google.ai.edge.gallery.data;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getModelFile", "()Ljava/lang/String;", "getUrl", "getCommitHash", "getSizeInBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/ai/edge/gallery/data/SocModelFile;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class SocModelFile {
    public static final int $stable = 0;

    @SerializedName("commitHash")
    private final String commitHash;

    @SerializedName("modelFile")
    private final String modelFile;

    @SerializedName("sizeInBytes")
    private final Long sizeInBytes;

    @SerializedName(ImagesContract.URL)
    private final String url;

    public static /* synthetic */ SocModelFile copy$default(SocModelFile socModelFile, String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socModelFile.modelFile;
        }
        if ((i & 2) != 0) {
            str2 = socModelFile.url;
        }
        if ((i & 4) != 0) {
            str3 = socModelFile.commitHash;
        }
        if ((i & 8) != 0) {
            l = socModelFile.sizeInBytes;
        }
        return socModelFile.copy(str, str2, str3, l);
    }

    
    public final String getModelFile() {
        return this.modelFile;
    }

    
    public final String getUrl() {
        return this.url;
    }

    
    public final String getCommitHash() {
        return this.commitHash;
    }

    
    public final Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    public final SocModelFile copy(String modelFile, String url, String commitHash, Long sizeInBytes) {
        return new SocModelFile(modelFile, url, commitHash, sizeInBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocModelFile)) {
            return false;
        }
        SocModelFile socModelFile = (SocModelFile) other;
        return Intrinsics.areEqual(this.modelFile, socModelFile.modelFile) && Intrinsics.areEqual(this.url, socModelFile.url) && Intrinsics.areEqual(this.commitHash, socModelFile.commitHash) && Intrinsics.areEqual(this.sizeInBytes, socModelFile.sizeInBytes);
    }

    public int hashCode() {
        return ((((((this.modelFile == null ? 0 : this.modelFile.hashCode()) * 31) + (this.url == null ? 0 : this.url.hashCode())) * 31) + (this.commitHash == null ? 0 : this.commitHash.hashCode())) * 31) + (this.sizeInBytes != null ? this.sizeInBytes.hashCode() : 0);
    }

    public String toString() {
        return "SocModelFile(modelFile=" + this.modelFile + ", url=" + this.url + ", commitHash=" + this.commitHash + ", sizeInBytes=" + this.sizeInBytes + ")";
    }

    public SocModelFile(String modelFile, String url, String commitHash, Long sizeInBytes) {
        this.modelFile = modelFile;
        this.url = url;
        this.commitHash = commitHash;
        this.sizeInBytes = sizeInBytes;
    }

    public final String getModelFile() {
        return this.modelFile;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getCommitHash() {
        return this.commitHash;
    }

    public final Long getSizeInBytes() {
        return this.sizeInBytes;
    }
}
