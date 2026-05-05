package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/SkillsIndex;", "", "skills", "", "Lcom/google/ai/edge/gallery/common/SkillInfo;", "<init>", "(Ljava/util/List;)V", "getSkills", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
