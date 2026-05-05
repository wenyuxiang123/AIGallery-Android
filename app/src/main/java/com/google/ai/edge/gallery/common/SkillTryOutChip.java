package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.graphics.vector.ImageVector;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getLabel", "()Ljava/lang/String;", "getPrompt", "getSkillName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class SkillTryOutChip {
    public static final int $stable = 0;
    private final ImageVector icon;
    private final String label;
    private final String prompt;
    private final String skillName;

    public static /* synthetic */ SkillTryOutChip copy$default(SkillTryOutChip skillTryOutChip, ImageVector imageVector, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            imageVector = skillTryOutChip.icon;
        }
        if ((i & 2) != 0) {
            str = skillTryOutChip.label;
        }
        if ((i & 4) != 0) {
            str2 = skillTryOutChip.prompt;
        }
        if ((i & 8) != 0) {
            str3 = skillTryOutChip.skillName;
        }
        return skillTryOutChip.copy(imageVector, str, str2, str3);
    }

    
    public final ImageVector getIcon() {
        return this.icon;
    }

    
    public final String getLabel() {
        return this.label;
    }

    
    public final String getPrompt() {
        return this.prompt;
    }

    
    public final String getSkillName() {
        return this.skillName;
    }

    public final SkillTryOutChip copy(ImageVector icon, String label, String prompt, String skillName) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(skillName, "skillName");
        return new SkillTryOutChip(icon, label, prompt, skillName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkillTryOutChip)) {
            return false;
        }
        SkillTryOutChip skillTryOutChip = (SkillTryOutChip) other;
        return Intrinsics.areEqual(this.icon, skillTryOutChip.icon) && Intrinsics.areEqual(this.label, skillTryOutChip.label) && Intrinsics.areEqual(this.prompt, skillTryOutChip.prompt) && Intrinsics.areEqual(this.skillName, skillTryOutChip.skillName);
    }

    public int hashCode() {
        return (((((this.icon.hashCode() * 31) + this.label.hashCode()) * 31) + this.prompt.hashCode()) * 31) + this.skillName.hashCode();
    }

    public String toString() {
        return "SkillTryOutChip(icon=" + this.icon + ", label=" + this.label + ", prompt=" + this.prompt + ", skillName=" + this.skillName + ")";
    }

    public SkillTryOutChip(ImageVector icon, String label, String prompt, String skillName) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(skillName, "skillName");
        this.icon = icon;
        this.label = label;
        this.prompt = prompt;
        this.skillName = skillName;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getSkillName() {
        return this.skillName;
    }
}
