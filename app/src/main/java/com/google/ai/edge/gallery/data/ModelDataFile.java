package com.google.ai.edge.gallery.data;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getName", "()Ljava/lang/String;", "getUrl", "getDownloadFileName", "getSizeInBytes", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
