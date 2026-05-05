package com.google.ai.edge.gallery.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getSkillMd", "()Ljava/lang/String;", "getSkillUrl", "getTryoutChip", "()Lcom/google/ai/edge/gallery/common/SkillTryOutChip;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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

    
    public final String getSkillMd() {
        return this.skillMd;
    }

    
    public final String getSkillUrl() {
        return this.skillUrl;
    }

    
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
