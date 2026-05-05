package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getType", "()Lcom/google/ai/edge/gallery/customtasks/agentchat/AddSkillOptionType;", "getTitleResId", "()I", "getDescriptionResId", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
