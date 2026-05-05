package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@JsonClass(generateAdapter = true)
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "", "base64", "", "<init>", "(Ljava/lang/String;)V", "getBase64", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class CallJsSkillResultImage {
    public static final int $stable = 0;
    private final String base64;

    public static /* synthetic */ CallJsSkillResultImage copy$default(CallJsSkillResultImage callJsSkillResultImage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callJsSkillResultImage.base64;
        }
        return callJsSkillResultImage.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBase64() {
        return this.base64;
    }

    public final CallJsSkillResultImage copy(String base64) {
        return new CallJsSkillResultImage(base64);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CallJsSkillResultImage) && Intrinsics.areEqual(this.base64, ((CallJsSkillResultImage) other).base64);
    }

    public int hashCode() {
        if (this.base64 == null) {
            return 0;
        }
        return this.base64.hashCode();
    }

    public String toString() {
        return "CallJsSkillResultImage(base64=" + this.base64 + ")";
    }

    public CallJsSkillResultImage(String base64) {
        this.base64 = base64;
    }

    public final String getBase64() {
        return this.base64;
    }
}
