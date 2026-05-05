package com.google.ai.edge.gallery.p006ui.llmsingleturn;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PromptTemplateConfigs.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m921d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateConfig;", "", "inputEditors", "", "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditor;", "<init>", "(Ljava/util/List;)V", "getInputEditors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
