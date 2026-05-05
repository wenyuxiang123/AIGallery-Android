package com.google.ai.edge.gallery.ui.llmsingleturn;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getInputEditors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class PromptTemplateConfig {
    public static final int $stable = 8;
    private final List<PromptTemplateInputEditor> inputEditors;

    /* JADX WARN: Multi-variable type inference failed */
    public PromptTemplateConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromptTemplateConfig copy$default(PromptTemplateConfig promptTemplateConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = promptTemplateConfig.inputEditors;
        }
        return promptTemplateConfig.copy(list);
    }

    public final List<PromptTemplateInputEditor> component1() {
        return this.inputEditors;
    }

    public final PromptTemplateConfig copy(List<? extends PromptTemplateInputEditor> inputEditors) {
        Intrinsics.checkNotNullParameter(inputEditors, "inputEditors");
        return new PromptTemplateConfig(inputEditors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PromptTemplateConfig) && Intrinsics.areEqual(this.inputEditors, ((PromptTemplateConfig) other).inputEditors);
    }

    public int hashCode() {
        return this.inputEditors.hashCode();
    }

    public String toString() {
        return "PromptTemplateConfig(inputEditors=" + this.inputEditors + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PromptTemplateConfig(List<? extends PromptTemplateInputEditor> inputEditors) {
        Intrinsics.checkNotNullParameter(inputEditors, "inputEditors");
        this.inputEditors = inputEditors;
    }

    public /* synthetic */ PromptTemplateConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<PromptTemplateInputEditor> getInputEditors() {
        return this.inputEditors;
    }
}
