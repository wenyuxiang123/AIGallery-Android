package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/ModelDataFile;", "", "name", "", ImagesContract.URL, "downloadFileName", "sizeInBytes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getUrl", "getDownloadFileName", "getSizeInBytes", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class ModelDataFile {
    public static final int $stable = 0;
    private final String downloadFileName;
    private final String name;
    private final long sizeInBytes;
    private final String url;

    public static /* synthetic */ ModelDataFile copy$default(ModelDataFile modelDataFile, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelDataFile.name;
        }
        if ((i & 2) != 0) {
            str2 = modelDataFile.url;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = modelDataFile.downloadFileName;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = modelDataFile.sizeInBytes;
        }
        return modelDataFile.copy(str, str4, str5, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDownloadFileName() {
        return this.downloadFileName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSizeInBytes() {
        return this.sizeInBytes;
    }

    public final ModelDataFile copy(String name, String url, String downloadFileName, long sizeInBytes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(downloadFileName, "downloadFileName");
        return new ModelDataFile(name, url, downloadFileName, sizeInBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelDataFile)) {
            return false;
        }
        ModelDataFile modelDataFile = (ModelDataFile) other;
        return Intrinsics.areEqual(this.name, modelDataFile.name) && Intrinsics.areEqual(this.url, modelDataFile.url) && Intrinsics.areEqual(this.downloadFileName, modelDataFile.downloadFileName) && this.sizeInBytes == modelDataFile.sizeInBytes;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.url.hashCode()) * 31) + this.downloadFileName.hashCode()) * 31) + Long.hashCode(this.sizeInBytes);
    }

    public String toString() {
        return "ModelDataFile(name=" + this.name + ", url=" + this.url + ", downloadFileName=" + this.downloadFileName + ", sizeInBytes=" + this.sizeInBytes + ")";
    }

    public ModelDataFile(String name, String url, String downloadFileName, long sizeInBytes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(downloadFileName, "downloadFileName");
        this.name = name;
        this.url = url;
        this.downloadFileName = downloadFileName;
        this.sizeInBytes = sizeInBytes;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getDownloadFileName() {
        return this.downloadFileName;
    }

    public final long getSizeInBytes() {
        return this.sizeInBytes;
    }
}
