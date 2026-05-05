package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MobileActionsScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/PromptTemplate;", "", "labelResId", "", "prompt", "", "<init>", "(ILjava/lang/String;)V", "getLabelResId", "()I", "getPrompt", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class PromptTemplate {
    public static final int $stable = 0;
    private final int labelResId;
    private final String prompt;

    public static /* synthetic */ PromptTemplate copy$default(PromptTemplate promptTemplate, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = promptTemplate.labelResId;
        }
        if ((i2 & 2) != 0) {
            str = promptTemplate.prompt;
        }
        return promptTemplate.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLabelResId() {
        return this.labelResId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    public final PromptTemplate copy(int labelResId, String prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        return new PromptTemplate(labelResId, prompt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromptTemplate)) {
            return false;
        }
        PromptTemplate promptTemplate = (PromptTemplate) other;
        return this.labelResId == promptTemplate.labelResId && Intrinsics.areEqual(this.prompt, promptTemplate.prompt);
    }

    public int hashCode() {
        return (Integer.hashCode(this.labelResId) * 31) + this.prompt.hashCode();
    }

    public String toString() {
        return "PromptTemplate(labelResId=" + this.labelResId + ", prompt=" + this.prompt + ")";
    }

    public PromptTemplate(int labelResId, String prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.labelResId = labelResId;
        this.prompt = prompt;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    public final String getPrompt() {
        return this.prompt;
    }
}
