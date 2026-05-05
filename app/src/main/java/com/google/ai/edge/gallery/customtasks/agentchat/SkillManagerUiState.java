package com.google.ai.edge.gallery.customtasks.agentchat;

import android.net.Uri;
import com.google.ai.edge.gallery.data.AllowedSkill;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



public final /* data */ class SkillManagerUiState {
    public static final int $stable = 8;
    private final List<AllowedSkill> featuredSkills;
    private final Uri importDirectoryUri;
    private final boolean loading;
    private final boolean loadingSkillAllowlist;
    private final String skillAllowlistError;
    private final List<SkillState> skills;
    private final boolean validating;
    private final String validationError;

    public SkillManagerUiState() {
        this(false, null, false, null, null, false, null, null, 255, null);
    }

    
    public final boolean getLoading() {
        return this.loading;
    }

    public final List<SkillState> component2() {
        return this.skills;
    }

    
    public final boolean getValidating() {
        return this.validating;
    }

    
    public final String getValidationError() {
        return this.validationError;
    }

    
    public final Uri getImportDirectoryUri() {
        return this.importDirectoryUri;
    }

    
    public final boolean getLoadingSkillAllowlist() {
        return this.loadingSkillAllowlist;
    }

    public final List<AllowedSkill> component7() {
        return this.featuredSkills;
    }

    
    public final String getSkillAllowlistError() {
        return this.skillAllowlistError;
    }

    public final SkillManagerUiState copy(boolean loading, List<SkillState> skills, boolean validating, String validationError, Uri importDirectoryUri, boolean loadingSkillAllowlist, List<AllowedSkill> featuredSkills, String skillAllowlistError) {
        Intrinsics.checkNotNullParameter(skills, "skills");
        Intrinsics.checkNotNullParameter(featuredSkills, "featuredSkills");
        return new SkillManagerUiState(loading, skills, validating, validationError, importDirectoryUri, loadingSkillAllowlist, featuredSkills, skillAllowlistError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkillManagerUiState)) {
            return false;
        }
        SkillManagerUiState skillManagerUiState = (SkillManagerUiState) other;
        return this.loading == skillManagerUiState.loading && Intrinsics.areEqual(this.skills, skillManagerUiState.skills) && this.validating == skillManagerUiState.validating && Intrinsics.areEqual(this.validationError, skillManagerUiState.validationError) && Intrinsics.areEqual(this.importDirectoryUri, skillManagerUiState.importDirectoryUri) && this.loadingSkillAllowlist == skillManagerUiState.loadingSkillAllowlist && Intrinsics.areEqual(this.featuredSkills, skillManagerUiState.featuredSkills) && Intrinsics.areEqual(this.skillAllowlistError, skillManagerUiState.skillAllowlistError);
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.loading) * 31) + this.skills.hashCode()) * 31) + Boolean.hashCode(this.validating)) * 31) + (this.validationError == null ? 0 : this.validationError.hashCode())) * 31) + (this.importDirectoryUri == null ? 0 : this.importDirectoryUri.hashCode())) * 31) + Boolean.hashCode(this.loadingSkillAllowlist)) * 31) + this.featuredSkills.hashCode()) * 31) + (this.skillAllowlistError != null ? this.skillAllowlistError.hashCode() : 0);
    }

    public String toString() {
        return "SkillManagerUiState(loading=" + this.loading + ", skills=" + this.skills + ", validating=" + this.validating + ", validationError=" + this.validationError + ", importDirectoryUri=" + this.importDirectoryUri + ", loadingSkillAllowlist=" + this.loadingSkillAllowlist + ", featuredSkills=" + this.featuredSkills + ", skillAllowlistError=" + this.skillAllowlistError + ")";
    }

    public SkillManagerUiState(boolean loading, List<SkillState> skills, boolean validating, String validationError, Uri importDirectoryUri, boolean loadingSkillAllowlist, List<AllowedSkill> featuredSkills, String skillAllowlistError) {
        Intrinsics.checkNotNullParameter(skills, "skills");
        Intrinsics.checkNotNullParameter(featuredSkills, "featuredSkills");
        this.loading = loading;
        this.skills = skills;
        this.validating = validating;
        this.validationError = validationError;
        this.importDirectoryUri = importDirectoryUri;
        this.loadingSkillAllowlist = loadingSkillAllowlist;
        this.featuredSkills = featuredSkills;
        this.skillAllowlistError = skillAllowlistError;
    }

    public /* synthetic */ SkillManagerUiState(boolean z, List list, boolean z2, String str, Uri uri, boolean z3, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : uri, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? null : str2);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final List<SkillState> getSkills() {
        return this.skills;
    }

    public final boolean getValidating() {
        return this.validating;
    }

    public final String getValidationError() {
        return this.validationError;
    }

    public final Uri getImportDirectoryUri() {
        return this.importDirectoryUri;
    }

    public final boolean getLoadingSkillAllowlist() {
        return this.loadingSkillAllowlist;
    }

    public final List<AllowedSkill> getFeaturedSkills() {
        return this.featuredSkills;
    }

    public final String getSkillAllowlistError() {
        return this.skillAllowlistError;
    }
}
