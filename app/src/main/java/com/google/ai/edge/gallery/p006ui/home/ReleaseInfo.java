package com.google.ai.edge.gallery.p006ui.home;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewReleaseNotification.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/home/ReleaseInfo;", "", "html_url", "", "tag_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHtml_url", "()Ljava/lang/String;", "getTag_name", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHtml_url() {
        return this.html_url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
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
