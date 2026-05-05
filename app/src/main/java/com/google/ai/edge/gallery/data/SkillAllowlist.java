package com.google.ai.edge.gallery.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getFeaturedSkills", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class SkillAllowlist {
    public static final int $stable = 8;

    @SerializedName("featuredSkills")
    private final List<AllowedSkill> featuredSkills;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkillAllowlist copy$default(SkillAllowlist skillAllowlist, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = skillAllowlist.featuredSkills;
        }
        return skillAllowlist.copy(list);
    }

    public final List<AllowedSkill> component1() {
        return this.featuredSkills;
    }

    public final SkillAllowlist copy(List<AllowedSkill> featuredSkills) {
        Intrinsics.checkNotNullParameter(featuredSkills, "featuredSkills");
        return new SkillAllowlist(featuredSkills);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SkillAllowlist) && Intrinsics.areEqual(this.featuredSkills, ((SkillAllowlist) other).featuredSkills);
    }

    public int hashCode() {
        return this.featuredSkills.hashCode();
    }

    public String toString() {
        return "SkillAllowlist(featuredSkills=" + this.featuredSkills + ")";
    }

    public SkillAllowlist(List<AllowedSkill> featuredSkills) {
        Intrinsics.checkNotNullParameter(featuredSkills, "featuredSkills");
        this.featuredSkills = featuredSkills;
    }

    public final List<AllowedSkill> getFeaturedSkills() {
        return this.featuredSkills;
    }
}
