package com.google.ai.edge.gallery.customtasks.agentchat;

import com.google.ai.edge.gallery.proto.Skill;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getSkill", "()Lcom/google/ai/edge/gallery/proto/Skill;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class SkillState {
    public static final int $stable = 0;
    private final Skill skill;

    public static /* synthetic */ SkillState copy$default(SkillState skillState, Skill skill, int i, Object obj) {
        if ((i & 1) != 0) {
            skill = skillState.skill;
        }
        return skillState.copy(skill);
    }

    
    public final Skill getSkill() {
        return this.skill;
    }

    public final SkillState copy(Skill skill) {
        Intrinsics.checkNotNullParameter(skill, "skill");
        return new SkillState(skill);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SkillState) && Intrinsics.areEqual(this.skill, ((SkillState) other).skill);
    }

    public int hashCode() {
        return this.skill.hashCode();
    }

    public String toString() {
        return "SkillState(skill=" + this.skill + ")";
    }

    public SkillState(Skill skill) {
        Intrinsics.checkNotNullParameter(skill, "skill");
        this.skill = skill;
    }

    public final Skill getSkill() {
        return this.skill;
    }
}
