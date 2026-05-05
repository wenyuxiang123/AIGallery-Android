package com.google.ai.edge.gallery.customtasks.agentchat;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;



@JsonClass(generateAdapter = true)
V", "getPhone_number", "()Ljava/lang/String;", "getSms_body", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m923k = 1, m924mv = {2, 2, 0}, m926xi = 0x30)
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

    
    public final String getPhone_number() {
        return this.phone_number;
    }

    
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
