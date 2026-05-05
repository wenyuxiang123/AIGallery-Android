package com.google.ai.edge.gallery.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;



V", "getDialogTitle", "()Ljava/lang/String;", "getFieldLabel", "getResult", "()Lkotlinx/coroutines/CompletableDeferred;", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
