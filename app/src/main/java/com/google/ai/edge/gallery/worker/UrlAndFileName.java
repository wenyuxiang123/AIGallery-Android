package com.google.ai.edge.gallery.worker;


import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getUrl", "()Ljava/lang/String;", "getFileName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class UrlAndFileName {
    public static final int $stable = 0;
    private final String fileName;
    private final String url;

    public static /* synthetic */ UrlAndFileName copy$default(UrlAndFileName urlAndFileName, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlAndFileName.url;
        }
        if ((i & 2) != 0) {
            str2 = urlAndFileName.fileName;
        }
        return urlAndFileName.copy(str, str2);
    }

    
    public final String getUrl() {
        return this.url;
    }

    
    public final String getFileName() {
        return this.fileName;
    }

    public final UrlAndFileName copy(String url, String fileName) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new UrlAndFileName(url, fileName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlAndFileName)) {
            return false;
        }
        UrlAndFileName urlAndFileName = (UrlAndFileName) other;
        return Intrinsics.areEqual(this.url, urlAndFileName.url) && Intrinsics.areEqual(this.fileName, urlAndFileName.fileName);
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.fileName.hashCode();
    }

    public String toString() {
        return "UrlAndFileName(url=" + this.url + ", fileName=" + this.fileName + ")";
    }

    public UrlAndFileName(String url, String fileName) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.url = url;
        this.fileName = fileName;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getUrl() {
        return this.url;
    }
}
