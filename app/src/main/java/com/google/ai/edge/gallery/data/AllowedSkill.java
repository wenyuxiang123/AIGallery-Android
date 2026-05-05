package com.google.ai.edge.gallery.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getName", "()Ljava/lang/String;", "getDescription", "getSkillUrl", "getAttributionLabel", "getAttributionUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class AllowedSkill {
    public static final int $stable = 0;

    @SerializedName("attributionLabel")
    private final String attributionLabel;

    @SerializedName("attributionUrl")
    private final String attributionUrl;
    private final String description;
    private final String name;

    @SerializedName("skillUrl")
    private final String skillUrl;

    public static /* synthetic */ AllowedSkill copy$default(AllowedSkill allowedSkill, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = allowedSkill.name;
        }
        if ((i & 2) != 0) {
            str2 = allowedSkill.description;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = allowedSkill.skillUrl;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = allowedSkill.attributionLabel;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = allowedSkill.attributionUrl;
        }
        return allowedSkill.copy(str, str6, str7, str8, str5);
    }

    
    public final String getName() {
        return this.name;
    }

    
    public final String getDescription() {
        return this.description;
    }

    
    public final String getSkillUrl() {
        return this.skillUrl;
    }

    
    public final String getAttributionLabel() {
        return this.attributionLabel;
    }

    
    public final String getAttributionUrl() {
        return this.attributionUrl;
    }

    public final AllowedSkill copy(String name, String description, String skillUrl, String attributionLabel, String attributionUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(skillUrl, "skillUrl");
        return new AllowedSkill(name, description, skillUrl, attributionLabel, attributionUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllowedSkill)) {
            return false;
        }
        AllowedSkill allowedSkill = (AllowedSkill) other;
        return Intrinsics.areEqual(this.name, allowedSkill.name) && Intrinsics.areEqual(this.description, allowedSkill.description) && Intrinsics.areEqual(this.skillUrl, allowedSkill.skillUrl) && Intrinsics.areEqual(this.attributionLabel, allowedSkill.attributionLabel) && Intrinsics.areEqual(this.attributionUrl, allowedSkill.attributionUrl);
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.description.hashCode()) * 31) + this.skillUrl.hashCode()) * 31) + (this.attributionLabel == null ? 0 : this.attributionLabel.hashCode())) * 31) + (this.attributionUrl != null ? this.attributionUrl.hashCode() : 0);
    }

    public String toString() {
        return "AllowedSkill(name=" + this.name + ", description=" + this.description + ", skillUrl=" + this.skillUrl + ", attributionLabel=" + this.attributionLabel + ", attributionUrl=" + this.attributionUrl + ")";
    }

    public AllowedSkill(String name, String description, String skillUrl, String attributionLabel, String attributionUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(skillUrl, "skillUrl");
        this.name = name;
        this.description = description;
        this.skillUrl = skillUrl;
        this.attributionLabel = attributionLabel;
        this.attributionUrl = attributionUrl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AllowedSkill(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        if ((i & 8) == 0) {
            str6 = str4;
        } else {
            str6 = null;
        }
        if ((i & 16) == 0) {
            str7 = str5;
        } else {
            str7 = null;
        }
        this(str, str2, str3, str6, str7);
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSkillUrl() {
        return this.skillUrl;
    }

    public final String getAttributionLabel() {
        return this.attributionLabel;
    }

    public final String getAttributionUrl() {
        return this.attributionUrl;
    }
}
