package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/SkillTryOutChip;", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", Constants.ScionAnalytics.PARAM_LABEL, "", "prompt", "skillName", "<init>", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getLabel", "()Ljava/lang/String;", "getPrompt", "getSkillName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImageVector getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
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
