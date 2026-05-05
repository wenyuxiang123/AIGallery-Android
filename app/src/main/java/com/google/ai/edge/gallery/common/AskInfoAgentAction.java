package com.google.ai.edge.gallery.common;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* JADX INFO: compiled from: Types.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m921d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m922d2 = {"Lcom/google/ai/edge/gallery/common/AskInfoAgentAction;", "Lcom/google/ai/edge/gallery/common/AgentAction;", "dialogTitle", "", "fieldLabel", "result", "Lkotlinx/coroutines/CompletableDeferred;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/CompletableDeferred;)V", "getDialogTitle", "()Ljava/lang/String;", "getFieldLabel", "getResult", "()Lkotlinx/coroutines/CompletableDeferred;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class AskInfoAgentAction extends AgentAction {
    public static final int $stable = 8;
    private final String dialogTitle;
    private final String fieldLabel;
    private final CompletableDeferred<String> result;

    public /* synthetic */ AskInfoAgentAction(String str, String str2, CompletableDeferred completableDeferred, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CompletableDeferredKt.CompletableDeferred$default(null, 1, null) : completableDeferred);
    }

    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final String getFieldLabel() {
        return this.fieldLabel;
    }

    public final CompletableDeferred<String> getResult() {
        return this.result;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskInfoAgentAction(String dialogTitle, String fieldLabel, CompletableDeferred<String> result) {
        super(AgentActionName.ASK_INFO);
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(fieldLabel, "fieldLabel");
        Intrinsics.checkNotNullParameter(result, "result");
        this.dialogTitle = dialogTitle;
        this.fieldLabel = fieldLabel;
        this.result = result;
    }
}
