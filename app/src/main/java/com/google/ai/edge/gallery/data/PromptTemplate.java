package com.google.ai.edge.gallery.data;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m922d2 = {"Lcom/google/ai/edge/gallery/data/PromptTemplate;", "", "title", "", "description", "prompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getPrompt", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class PromptTemplate {
    public static final int $stable = 0;
    private final String description;
    private final String prompt;
    private final String title;

    public static /* synthetic */ PromptTemplate copy$default(PromptTemplate promptTemplate, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promptTemplate.title;
        }
        if ((i & 2) != 0) {
            str2 = promptTemplate.description;
        }
        if ((i & 4) != 0) {
            str3 = promptTemplate.prompt;
        }
        return promptTemplate.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    public final PromptTemplate copy(String title, String description, String prompt) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        return new PromptTemplate(title, description, prompt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromptTemplate)) {
            return false;
        }
        PromptTemplate promptTemplate = (PromptTemplate) other;
        return Intrinsics.areEqual(this.title, promptTemplate.title) && Intrinsics.areEqual(this.description, promptTemplate.description) && Intrinsics.areEqual(this.prompt, promptTemplate.prompt);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.prompt.hashCode();
    }

    public String toString() {
        return "PromptTemplate(title=" + this.title + ", description=" + this.description + ", prompt=" + this.prompt + ")";
    }

    public PromptTemplate(String title, String description, String prompt) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.title = title;
        this.description = description;
        this.prompt = prompt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getTitle() {
        return this.title;
    }
}
