package com.google.ai.edge.gallery.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



V", "getTitle", "()Ljava/lang/String;", "getDescription", "getPrompt", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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

    
    public final String getTitle() {
        return this.title;
    }

    
    public final String getDescription() {
        return this.description;
    }

    
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
