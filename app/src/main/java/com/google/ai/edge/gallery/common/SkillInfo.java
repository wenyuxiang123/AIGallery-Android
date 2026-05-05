package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/SkillInfo;", "", "skillMd", "", "skillUrl", "tryoutChip", "Lcom/google/ai/edge/gallery/common/SkillTryOutChip;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/ai/edge/gallery/common/SkillTryOutChip;)V", "getSkillMd", "()Ljava/lang/String;", "getSkillUrl", "getTryoutChip", "()Lcom/google/ai/edge/gallery/common/SkillTryOutChip;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class SkillInfo {
    public static final int $stable = 0;
    private final String skillMd;
    private final String skillUrl;
    private final SkillTryOutChip tryoutChip;

    public static /* synthetic */ SkillInfo copy$default(SkillInfo skillInfo, String str, String str2, SkillTryOutChip skillTryOutChip, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillInfo.skillMd;
        }
        if ((i & 2) != 0) {
            str2 = skillInfo.skillUrl;
        }
        if ((i & 4) != 0) {
            skillTryOutChip = skillInfo.tryoutChip;
        }
        return skillInfo.copy(str, str2, skillTryOutChip);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSkillMd() {
        return this.skillMd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSkillUrl() {
        return this.skillUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SkillTryOutChip getTryoutChip() {
        return this.tryoutChip;
    }

    public final SkillInfo copy(String skillMd, String skillUrl, SkillTryOutChip tryoutChip) {
        Intrinsics.checkNotNullParameter(skillMd, "skillMd");
        return new SkillInfo(skillMd, skillUrl, tryoutChip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkillInfo)) {
            return false;
        }
        SkillInfo skillInfo = (SkillInfo) other;
        return Intrinsics.areEqual(this.skillMd, skillInfo.skillMd) && Intrinsics.areEqual(this.skillUrl, skillInfo.skillUrl) && Intrinsics.areEqual(this.tryoutChip, skillInfo.tryoutChip);
    }

    public int hashCode() {
        return (((this.skillMd.hashCode() * 31) + (this.skillUrl == null ? 0 : this.skillUrl.hashCode())) * 31) + (this.tryoutChip != null ? this.tryoutChip.hashCode() : 0);
    }

    public String toString() {
        return "SkillInfo(skillMd=" + this.skillMd + ", skillUrl=" + this.skillUrl + ", tryoutChip=" + this.tryoutChip + ")";
    }

    public SkillInfo(String skillMd, String skillUrl, SkillTryOutChip tryoutChip) {
        Intrinsics.checkNotNullParameter(skillMd, "skillMd");
        this.skillMd = skillMd;
        this.skillUrl = skillUrl;
        this.tryoutChip = tryoutChip;
    }

    public /* synthetic */ SkillInfo(String str, String str2, SkillTryOutChip skillTryOutChip, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : skillTryOutChip);
    }

    public final String getSkillMd() {
        return this.skillMd;
    }

    public final String getSkillUrl() {
        return this.skillUrl;
    }

    public final SkillTryOutChip getTryoutChip() {
        return this.tryoutChip;
    }
}
