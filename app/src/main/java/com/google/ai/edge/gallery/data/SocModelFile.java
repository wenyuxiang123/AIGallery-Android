package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModelAllowlist.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/SocModelFile;", "", "modelFile", "", ImagesContract.URL, "commitHash", "sizeInBytes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getModelFile", "()Ljava/lang/String;", "getUrl", "getCommitHash", "getSizeInBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/ai/edge/gallery/data/SocModelFile;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModelFile() {
        return this.modelFile;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCommitHash() {
        return this.commitHash;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
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
