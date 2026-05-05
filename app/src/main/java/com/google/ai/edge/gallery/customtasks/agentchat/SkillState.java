package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.proto.Skill;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SkillManagerViewModel.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;", "", "skill", "Lcom/google/ai/edge/gallery/proto/Skill;", "<init>", "(Lcom/google/ai/edge/gallery/proto/Skill;)V", "getSkill", "()Lcom/google/ai/edge/gallery/proto/Skill;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class SkillState {
    public static final int $stable = 0;
    private final Skill skill;

    public static /* synthetic */ SkillState copy$default(SkillState skillState, Skill skill, int i, Object obj) {
        if ((i & 1) != 0) {
            skill = skillState.skill;
        }
        return skillState.copy(skill);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
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
