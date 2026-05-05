package com.google.ai.edge.gallery.ui.llmsingleturn;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PromptTemplateConfigs.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m921d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditor;", "", Constants.ScionAnalytics.PARAM_LABEL, "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditorType;", "defaultOption", "<init>", "(Ljava/lang/String;Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditorType;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getType", "()Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditorType;", "getDefaultOption", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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
