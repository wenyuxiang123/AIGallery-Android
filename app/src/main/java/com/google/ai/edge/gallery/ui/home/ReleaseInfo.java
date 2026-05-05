package com.google.ai.edge.gallery.ui.home;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getHtml_url", "()Ljava/lang/String;", "getTag_name", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class ReleaseInfo {
    public static final int $stable = 0;
    private final String html_url;
    private final String tag_name;

    public static /* synthetic */ ReleaseInfo copy$default(ReleaseInfo releaseInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = releaseInfo.html_url;
        }
        if ((i & 2) != 0) {
            str2 = releaseInfo.tag_name;
        }
        return releaseInfo.copy(str, str2);
    }

    
    public final String getHtml_url() {
        return this.html_url;
    }

    
    public final String getTag_name() {
        return this.tag_name;
    }

    public final ReleaseInfo copy(String html_url, String tag_name) {
        Intrinsics.checkNotNullParameter(html_url, "html_url");
        Intrinsics.checkNotNullParameter(tag_name, "tag_name");
        return new ReleaseInfo(html_url, tag_name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReleaseInfo)) {
            return false;
        }
        ReleaseInfo releaseInfo = (ReleaseInfo) other;
        return Intrinsics.areEqual(this.html_url, releaseInfo.html_url) && Intrinsics.areEqual(this.tag_name, releaseInfo.tag_name);
    }

    public int hashCode() {
        return (this.html_url.hashCode() * 31) + this.tag_name.hashCode();
    }

    public String toString() {
        return "ReleaseInfo(html_url=" + this.html_url + ", tag_name=" + this.tag_name + ")";
    }

    public ReleaseInfo(String html_url, String tag_name) {
        Intrinsics.checkNotNullParameter(html_url, "html_url");
        Intrinsics.checkNotNullParameter(tag_name, "tag_name");
        this.html_url = html_url;
        this.tag_name = tag_name;
    }

    public final String getHtml_url() {
        return this.html_url;
    }

    public final String getTag_name() {
        return this.tag_name;
    }
}
