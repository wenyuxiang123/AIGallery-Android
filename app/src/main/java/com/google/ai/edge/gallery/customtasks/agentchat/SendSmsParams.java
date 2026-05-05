package com.google.ai.edge.gallery.customtasks.agentchat;

import androidx.compose.p000ui.tooling.preview.AndroidUiModes;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntentHandler.kt */
/* JADX INFO: loaded from: classes14.dex */
@JsonClass(generateAdapter = true)
@Metadata(m921d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m922d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/SendSmsParams;", "", "phone_number", "", "sms_body", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhone_number", "()Ljava/lang/String;", "getSms_body", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class SendSmsParams {
    public static final int $stable = 0;
    private final String phone_number;
    private final String sms_body;

    public static /* synthetic */ SendSmsParams copy$default(SendSmsParams sendSmsParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendSmsParams.phone_number;
        }
        if ((i & 2) != 0) {
            str2 = sendSmsParams.sms_body;
        }
        return sendSmsParams.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone_number() {
        return this.phone_number;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSms_body() {
        return this.sms_body;
    }

    public final SendSmsParams copy(String phone_number, String sms_body) {
        Intrinsics.checkNotNullParameter(phone_number, "phone_number");
        Intrinsics.checkNotNullParameter(sms_body, "sms_body");
        return new SendSmsParams(phone_number, sms_body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendSmsParams)) {
            return false;
        }
        SendSmsParams sendSmsParams = (SendSmsParams) other;
        return Intrinsics.areEqual(this.phone_number, sendSmsParams.phone_number) && Intrinsics.areEqual(this.sms_body, sendSmsParams.sms_body);
    }

    public int hashCode() {
        return (this.phone_number.hashCode() * 31) + this.sms_body.hashCode();
    }

    public String toString() {
        return "SendSmsParams(phone_number=" + this.phone_number + ", sms_body=" + this.sms_body + ")";
    }

    public SendSmsParams(String phone_number, String sms_body) {
        Intrinsics.checkNotNullParameter(phone_number, "phone_number");
        Intrinsics.checkNotNullParameter(sms_body, "sms_body");
        this.phone_number = phone_number;
        this.sms_body = sms_body;
    }

    public final String getPhone_number() {
        return this.phone_number;
    }

    public final String getSms_body() {
        return this.sms_body;
    }
}
