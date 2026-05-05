package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@JsonClass(generateAdapter = true)
@Metadata(m921d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/CallJsSkillResult;", "", "result", "", "error", "image", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "webview", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;)V", "getResult", "()Ljava/lang/String;", "getError", "getImage", "()Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "getWebview", "()Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class CallJsSkillResult {
    public static final int $stable = 0;
    private final String error;
    private final CallJsSkillResultImage image;
    private final String result;
    private final CallJsSkillResultWebview webview;

    public static /* synthetic */ CallJsSkillResult copy$default(CallJsSkillResult callJsSkillResult, String str, String str2, CallJsSkillResultImage callJsSkillResultImage, CallJsSkillResultWebview callJsSkillResultWebview, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callJsSkillResult.result;
        }
        if ((i & 2) != 0) {
            str2 = callJsSkillResult.error;
        }
        if ((i & 4) != 0) {
            callJsSkillResultImage = callJsSkillResult.image;
        }
        if ((i & 8) != 0) {
            callJsSkillResultWebview = callJsSkillResult.webview;
        }
        return callJsSkillResult.copy(str, str2, callJsSkillResultImage, callJsSkillResultWebview);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CallJsSkillResultImage getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CallJsSkillResultWebview getWebview() {
        return this.webview;
    }

    public final CallJsSkillResult copy(String result, String error, CallJsSkillResultImage image, CallJsSkillResultWebview webview) {
        return new CallJsSkillResult(result, error, image, webview);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallJsSkillResult)) {
            return false;
        }
        CallJsSkillResult callJsSkillResult = (CallJsSkillResult) other;
        return Intrinsics.areEqual(this.result, callJsSkillResult.result) && Intrinsics.areEqual(this.error, callJsSkillResult.error) && Intrinsics.areEqual(this.image, callJsSkillResult.image) && Intrinsics.areEqual(this.webview, callJsSkillResult.webview);
    }

    public int hashCode() {
        return ((((((this.result == null ? 0 : this.result.hashCode()) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + (this.image == null ? 0 : this.image.hashCode())) * 31) + (this.webview != null ? this.webview.hashCode() : 0);
    }

    public String toString() {
        return "CallJsSkillResult(result=" + this.result + ", error=" + this.error + ", image=" + this.image + ", webview=" + this.webview + ")";
    }

    public CallJsSkillResult(String result, String error, CallJsSkillResultImage image, CallJsSkillResultWebview webview) {
        this.result = result;
        this.error = error;
        this.image = image;
        this.webview = webview;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getError() {
        return this.error;
    }

    public final CallJsSkillResultImage getImage() {
        return this.image;
    }

    public final CallJsSkillResultWebview getWebview() {
        return this.webview;
    }
}
