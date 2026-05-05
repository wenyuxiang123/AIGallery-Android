package com.google.ai.edge.gallery.customtasks.mobileactions;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.EmailKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;



V", "getTo", "()Ljava/lang/String;", "getSubject", "getBody", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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
