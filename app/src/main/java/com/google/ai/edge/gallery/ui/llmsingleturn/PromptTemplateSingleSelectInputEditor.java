package com.google.ai.edge.gallery.ui.llmsingleturn;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PromptTemplateConfigs.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m921d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m922d2 = {"Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateSingleSelectInputEditor;", "Lcom/google/ai/edge/gallery/ui/llmsingleturn/PromptTemplateInputEditor;", Constants.ScionAnalytics.PARAM_LABEL, "", "options", "", "defaultOption", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getDefaultOption", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class PromptTemplateSingleSelectInputEditor extends PromptTemplateInputEditor {
    public static final int $stable = 8;
    private final String defaultOption;
    private final String label;
    private final List<String> options;

    public /* synthetic */ PromptTemplateSingleSelectInputEditor(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2);
    }

    @Override // com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateInputEditor
    public String getLabel() {
        return this.label;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    @Override // com.google.ai.edge.gallery.ui.llmsingleturn.PromptTemplateInputEditor
    public String getDefaultOption() {
        return this.defaultOption;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptTemplateSingleSelectInputEditor(String label, List<String> options, String defaultOption) {
        super(label, PromptTemplateInputEditorType.SINGLE_SELECT, defaultOption);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(defaultOption, "defaultOption");
        this.label = label;
        this.options = options;
        this.defaultOption = defaultOption;
    }
}
