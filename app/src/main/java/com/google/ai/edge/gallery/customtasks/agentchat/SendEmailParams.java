package com.google.ai.edge.gallery.customtasks.agentchat;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



@JsonClass(generateAdapter = true)
V", "getExtra_email", "()Ljava/lang/String;", "getExtra_subject", "getExtra_text", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
public final /* data */ class SendEmailParams {
    public static final int $stable = 0;
    private final String extra_email;
    private final String extra_subject;
    private final String extra_text;

    public static /* synthetic */ SendEmailParams copy$default(SendEmailParams sendEmailParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendEmailParams.extra_email;
        }
        if ((i & 2) != 0) {
            str2 = sendEmailParams.extra_subject;
        }
        if ((i & 4) != 0) {
            str3 = sendEmailParams.extra_text;
        }
        return sendEmailParams.copy(str, str2, str3);
    }

    
    public final String getExtra_email() {
        return this.extra_email;
    }

    
    public final String getExtra_subject() {
        return this.extra_subject;
    }

    
    public final String getExtra_text() {
        return this.extra_text;
    }

    public final SendEmailParams copy(String extra_email, String extra_subject, String extra_text) {
        Intrinsics.checkNotNullParameter(extra_email, "extra_email");
        Intrinsics.checkNotNullParameter(extra_subject, "extra_subject");
        Intrinsics.checkNotNullParameter(extra_text, "extra_text");
        return new SendEmailParams(extra_email, extra_subject, extra_text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendEmailParams)) {
            return false;
        }
        SendEmailParams sendEmailParams = (SendEmailParams) other;
        return Intrinsics.areEqual(this.extra_email, sendEmailParams.extra_email) && Intrinsics.areEqual(this.extra_subject, sendEmailParams.extra_subject) && Intrinsics.areEqual(this.extra_text, sendEmailParams.extra_text);
    }

    public int hashCode() {
        return (((this.extra_email.hashCode() * 31) + this.extra_subject.hashCode()) * 31) + this.extra_text.hashCode();
    }

    public String toString() {
        return "SendEmailParams(extra_email=" + this.extra_email + ", extra_subject=" + this.extra_subject + ", extra_text=" + this.extra_text + ")";
    }

    public SendEmailParams(String extra_email, String extra_subject, String extra_text) {
        Intrinsics.checkNotNullParameter(extra_email, "extra_email");
        Intrinsics.checkNotNullParameter(extra_subject, "extra_subject");
        Intrinsics.checkNotNullParameter(extra_text, "extra_text");
        this.extra_email = extra_email;
        this.extra_subject = extra_subject;
        this.extra_text = extra_text;
    }

    public final String getExtra_email() {
        return this.extra_email;
    }

    public final String getExtra_subject() {
        return this.extra_subject;
    }

    public final String getExtra_text() {
        return this.extra_text;
    }
}
