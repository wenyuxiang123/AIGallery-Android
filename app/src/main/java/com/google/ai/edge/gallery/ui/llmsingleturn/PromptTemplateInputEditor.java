package com.google.ai.edge.gallery.ui.llmsingleturn;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;



V", "getLabel", "()Ljava/lang/String;", "getType", "()Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditorType;", "getDefaultOption", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public class PromptTemplateInputEditor {
    public static final int $stable = 0;
    private final String defaultOption;
    private final String label;
    private final PromptTemplateInputEditorType type;

    public PromptTemplateInputEditor(String label, PromptTemplateInputEditorType type, String defaultOption) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(defaultOption, "defaultOption");
        this.label = label;
        this.type = type;
        this.defaultOption = defaultOption;
    }

    public /* synthetic */ PromptTemplateInputEditor(String str, PromptTemplateInputEditorType promptTemplateInputEditorType, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, promptTemplateInputEditorType, (i & 4) != 0 ? "" : str2);
    }

    public String getLabel() {
        return this.label;
    }

    public PromptTemplateInputEditorType getType() {
        return this.type;
    }

    public String getDefaultOption() {
        return this.defaultOption;
    }
}
