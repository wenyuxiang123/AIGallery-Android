package com.google.ai.edge.gallery.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getSkills", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class SkillsIndex {
    public static final int $stable = 8;
    private final List<SkillInfo> skills;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkillsIndex copy$default(SkillsIndex skillsIndex, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = skillsIndex.skills;
        }
        return skillsIndex.copy(list);
    }

    public final List<SkillInfo> component1() {
        return this.skills;
    }

    public final SkillsIndex copy(List<SkillInfo> skills) {
        Intrinsics.checkNotNullParameter(skills, "skills");
        return new SkillsIndex(skills);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SkillsIndex) && Intrinsics.areEqual(this.skills, ((SkillsIndex) other).skills);
    }

    public int hashCode() {
        return this.skills.hashCode();
    }

    public String toString() {
        return "SkillsIndex(skills=" + this.skills + ")";
    }

    public SkillsIndex(List<SkillInfo> skills) {
        Intrinsics.checkNotNullParameter(skills, "skills");
        this.skills = skills;
    }

    public final List<SkillInfo> getSkills() {
        return this.skills;
    }
}
