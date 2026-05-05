package com.google.ai.edge.gallery.customtasks.agentchat;

import android.net.Uri;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.ai.edge.gallery.data.AllowedSkill;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SkillManagerViewModel.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003Jk\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u0006,"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillManagerUiState;", "", "loading", "", "skills", "", "Lcom/google/ai/edge/gallery/customtasks/agentchat/SkillState;", "validating", "validationError", "", "importDirectoryUri", "Landroid/net/Uri;", "loadingSkillAllowlist", "featuredSkills", "Lcom/google/ai/edge/gallery/data/AllowedSkill;", "skillAllowlistError", "<init>", "(ZLjava/util/List;ZLjava/lang/String;Landroid/net/Uri;ZLjava/util/List;Ljava/lang/String;)V", "getLoading", "()Z", "getSkills", "()Ljava/util/List;", "getValidating", "getValidationError", "()Ljava/lang/String;", "getImportDirectoryUri", "()Landroid/net/Uri;", "getLoadingSkillAllowlist", "getFeaturedSkills", "getSkillAllowlistError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final List<SkillState> component2() {
        return this.skills;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getValidating() {
        return this.validating;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValidationError() {
        return this.validationError;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Uri getImportDirectoryUri() {
        return this.importDirectoryUri;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getLoadingSkillAllowlist() {
        return this.loadingSkillAllowlist;
    }

    public final List<AllowedSkill> component7() {
        return this.featuredSkills;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
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
