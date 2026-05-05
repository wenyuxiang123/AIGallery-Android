package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntentHandler.kt */
/* JADX INFO: loaded from: classes14.dex */
@JsonClass(generateAdapter = true)
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParams;", "", "extra_email", "", "extra_subject", "extra_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExtra_email", "()Ljava/lang/String;", "getExtra_subject", "getExtra_text", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExtra_email() {
        return this.extra_email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExtra_subject() {
        return this.extra_subject;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
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
