package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@JsonClass(generateAdapter = true)
@Metadata(m921d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "", ImagesContract.URL, "", "iframe", "", "aspectRatio", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;)V", "getUrl", "()Ljava/lang/String;", "getIframe", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAspectRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;)Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class CallJsSkillResultWebview {
    public static final int $stable = 0;
    private final Float aspectRatio;
    private final Boolean iframe;
    private final String url;

    public static /* synthetic */ CallJsSkillResultWebview copy$default(CallJsSkillResultWebview callJsSkillResultWebview, String str, Boolean bool, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callJsSkillResultWebview.url;
        }
        if ((i & 2) != 0) {
            bool = callJsSkillResultWebview.iframe;
        }
        if ((i & 4) != 0) {
            f = callJsSkillResultWebview.aspectRatio;
        }
        return callJsSkillResultWebview.copy(str, bool, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIframe() {
        return this.iframe;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getAspectRatio() {
        return this.aspectRatio;
    }

    public final CallJsSkillResultWebview copy(String url, Boolean iframe, Float aspectRatio) {
        return new CallJsSkillResultWebview(url, iframe, aspectRatio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallJsSkillResultWebview)) {
            return false;
        }
        CallJsSkillResultWebview callJsSkillResultWebview = (CallJsSkillResultWebview) other;
        return Intrinsics.areEqual(this.url, callJsSkillResultWebview.url) && Intrinsics.areEqual(this.iframe, callJsSkillResultWebview.iframe) && Intrinsics.areEqual((Object) this.aspectRatio, (Object) callJsSkillResultWebview.aspectRatio);
    }

    public int hashCode() {
        return ((((this.url == null ? 0 : this.url.hashCode()) * 31) + (this.iframe == null ? 0 : this.iframe.hashCode())) * 31) + (this.aspectRatio != null ? this.aspectRatio.hashCode() : 0);
    }

    public String toString() {
        return "CallJsSkillResultWebview(url=" + this.url + ", iframe=" + this.iframe + ", aspectRatio=" + this.aspectRatio + ")";
    }

    public CallJsSkillResultWebview(String url, Boolean iframe, Float aspectRatio) {
        this.url = url;
        this.iframe = iframe;
        this.aspectRatio = aspectRatio;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Boolean getIframe() {
        return this.iframe;
    }

    public final Float getAspectRatio() {
        return this.aspectRatio;
    }
}
