package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.EmailKt;
import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Actions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m921d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/mobileactions/SendEmailAction;", "Lcom/google/ai/edge/gallery/customtasks/mobileactions/Action;", "to", "", "subject", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTo", "()Ljava/lang/String;", "getSubject", "getBody", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class SendEmailAction extends Action {
    public static final int $stable = 8;
    private final String body;
    private final String subject;
    private final String to;

    public final String getBody() {
        return this.body;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getTo() {
        return this.to;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendEmailAction(String to, String subject, String body) {
        super(ActionType.ACTION_SEND_EMAIL, EmailKt.getEmail(Icons.Outlined.INSTANCE), new FunctionCallDetails("sendEmail", CollectionsKt.listOf((Object[]) new Pair[]{new Pair("to", to), new Pair("subject", subject), new Pair("body", body)}), 0L, 4, null));
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(body, "body");
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
}
