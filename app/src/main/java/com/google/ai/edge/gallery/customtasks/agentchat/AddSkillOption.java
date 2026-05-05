package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SkillManagerBottomSheet.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOption;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOptionType;", "titleResId", "", "descriptionResId", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "<init>", "(Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOptionType;IILandroidx/compose/ui/graphics/vector/ImageVector;)V", "getType", "()Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOptionType;", "getTitleResId", "()I", "getDescriptionResId", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
final /* data */ class AddSkillOption {
    private final int descriptionResId;
    private final ImageVector icon;
    private final int titleResId;
    private final AddSkillOptionType type;

    public static /* synthetic */ AddSkillOption copy$default(AddSkillOption addSkillOption, AddSkillOptionType addSkillOptionType, int i, int i2, ImageVector imageVector, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            addSkillOptionType = addSkillOption.type;
        }
        if ((i3 & 2) != 0) {
            i = addSkillOption.titleResId;
        }
        if ((i3 & 4) != 0) {
            i2 = addSkillOption.descriptionResId;
        }
        if ((i3 & 8) != 0) {
            imageVector = addSkillOption.icon;
        }
        return addSkillOption.copy(addSkillOptionType, i, i2, imageVector);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AddSkillOptionType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImageVector getIcon() {
        return this.icon;
    }

    public final AddSkillOption copy(AddSkillOptionType type, int titleResId, int descriptionResId, ImageVector icon) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new AddSkillOption(type, titleResId, descriptionResId, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddSkillOption)) {
            return false;
        }
        AddSkillOption addSkillOption = (AddSkillOption) other;
        return this.type == addSkillOption.type && this.titleResId == addSkillOption.titleResId && this.descriptionResId == addSkillOption.descriptionResId && Intrinsics.areEqual(this.icon, addSkillOption.icon);
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + Integer.hashCode(this.titleResId)) * 31) + Integer.hashCode(this.descriptionResId)) * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "AddSkillOption(type=" + this.type + ", titleResId=" + this.titleResId + ", descriptionResId=" + this.descriptionResId + ", icon=" + this.icon + ")";
    }

    public AddSkillOption(AddSkillOptionType type, int titleResId, int descriptionResId, ImageVector icon) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.type = type;
        this.titleResId = titleResId;
        this.descriptionResId = descriptionResId;
        this.icon = icon;
    }

    public final AddSkillOptionType getType() {
        return this.type;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    public final ImageVector getIcon() {
        return this.icon;
    }
}
