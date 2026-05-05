package com.google.ai.edge.gallery.customtasks.mobileactions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getLabelResId", "()I", "getPrompt", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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

    
    public final int getLabelResId() {
        return this.labelResId;
    }

    
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
